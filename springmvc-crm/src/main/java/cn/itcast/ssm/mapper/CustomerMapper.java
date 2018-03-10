package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.Customer;
import cn.itcast.ssm.po.QueryVo;

public interface CustomerMapper {

	/**
	 * 根据条件查询用户信息
	 * @param queryVo  封装条件的参数
	 * @return
	 */
	List<Customer> queryCustomerList(QueryVo queryVo);
	
	/**
	 * 根据条件查询用户数量
	 * @param queryVo 封装条件的参数
	 * @return
	 */
	Integer countCustomers(QueryVo queryVo);

	Customer queryCustomerById(Long id);

	void updateCustomer(Customer customer);

	void deleteCustomerById(Long id);
	
}
