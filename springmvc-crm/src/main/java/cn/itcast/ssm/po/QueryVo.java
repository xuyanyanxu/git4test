package cn.itcast.ssm.po;

public class QueryVo {
//	客户名称
	private String custName;
//	客户来源
	private String custSource;
//	客户行业
	private String custIndustry;
//	客户级别
	private String custLevel;
	
	// 分页的属性：当前页、每一页显示的大小，开始记录索引
	private Integer page = 1;// 默认查询第一页
	private Integer rows = 10;// 每一页显示的大小，默认显示10
	private Integer start;//根据当前页和页大小计算
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public QueryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryVo(String custName, String custSource, String custIndustry, String custLevel, Integer page,
			Integer rows, Integer start) {
		super();
		this.custName = custName;
		this.custSource = custSource;
		this.custIndustry = custIndustry;
		this.custLevel = custLevel;
		this.page = page;
		this.rows = rows;
		this.start = start;
	}
	
	
}
