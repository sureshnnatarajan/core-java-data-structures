package com.suresh.learnings.twentyseventeen.april;

public class Security {

	private Long id;
	
	private String symbol;
	
	private String securityName;
	
	private String exchange;
	
	private Boolean isActive;

	public Security() {
		
	}

	public Security(Long id, String symbol, String securityName, String exchange, Boolean isActive) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.securityName = securityName;
		this.exchange = exchange;
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Security [id=" + id + ", symbol=" + symbol + ", securityName=" + securityName + ", exchange=" + exchange
				+ ", isActive=" + isActive + "]";
	}
	
}
