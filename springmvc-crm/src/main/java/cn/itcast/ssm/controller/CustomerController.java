package cn.itcast.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.ssm.po.BaseDict;
import cn.itcast.ssm.po.Customer;
import cn.itcast.ssm.po.QueryVo;
import cn.itcast.ssm.service.BaseDictService;
import cn.itcast.ssm.service.CustomerService;
import cn.itcast.ssm.utils.Page;

@Controller
@RequestMapping("cust")
public class CustomerController {
	
	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("list")
	public String list(Model model,QueryVo queryVo){
		
		//根据客户行业查找客户信息
		List<BaseDict> custIndustry = baseDictService.queryBaseDictByTypeCode("001");
		
		//根据客户信息来源查找客户信息
		List<BaseDict> customerFrom = baseDictService.queryBaseDictByTypeCode("002");
		
		//根据客户级别查找客户信息
		List<BaseDict> custLevel = baseDictService.queryBaseDictByTypeCode("006");
		
		//将以上信息设置到request中
		model.addAttribute("fromType", customerFrom);
		model.addAttribute("industryType", custIndustry);
		model.addAttribute("levelType", custLevel);
		
		//将客户信息封装到page中
		Page page = customerService.queryPage(queryVo);

		model.addAttribute("page", page);
		model.addAttribute("custName", queryVo.getCustName());
		model.addAttribute("custIndustry", queryVo.getCustIndustry());
		model.addAttribute("custLevel", queryVo.getCustLevel());
		model.addAttribute("custSource", queryVo.getCustSource());
		
		return "customer";
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Long id){
		Customer customer = customerService.queryCustomerById(id);
		return customer;
	}
	
	@RequestMapping("update")
	@ResponseBody
	public Map<String,String> update(Customer customer){
		
		Map<String,String> map = new HashMap<String,String>();
		
		try{
			customerService.updateCustomer(customer);
			map.put("flag", "success");
			}catch(Exception e){
				e.printStackTrace();
				map.put("flag", "error");
		}
		return map;
	}
	
	@RequestMapping("delcust")
	@ResponseBody
	public void delcust(Long id){
		customerService.deleteCustomerById(id);
	}
	
}



















