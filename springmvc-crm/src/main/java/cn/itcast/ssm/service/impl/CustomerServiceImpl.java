package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.CustomerMapper;
import cn.itcast.ssm.po.Customer;
import cn.itcast.ssm.po.QueryVo;
import cn.itcast.ssm.service.CustomerService;
import cn.itcast.ssm.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<Customer> queryCustomerList(QueryVo queryVo) {
		return customerMapper.queryCustomerList(queryVo);
	}

	@Override
	public Integer countCustomers(QueryVo queryVo) {
		return customerMapper.countCustomers(queryVo);
	}

	@Override
	public Page queryPage(QueryVo queryVo) {
		
		queryVo.setStart((queryVo.getPage()-1)*queryVo.getRows());
		
		Integer total = customerMapper.countCustomers(queryVo);
		List<Customer> rows = customerMapper.queryCustomerList(queryVo);
		
		Page<Customer> page = new Page<Customer>(total, queryVo.getPage(), queryVo.getRows(), rows);
		
		return page;
	}

	@Override
	public Customer queryCustomerById(Long id) {
		return customerMapper.queryCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerMapper.updateCustomer(customer);
	}

	@Override
	public void deleteCustomerById(Long id) {
		customerMapper.deleteCustomerById(id);
	}

}










