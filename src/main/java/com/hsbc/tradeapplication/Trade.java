/*
 * This file will read the attributes of Trade.txt
 */

package com.hsbc.tradeapplication;

import java.util.Date;

public class Trade {
	
	private String tradeId;
	private Date tradeDtTime;
	private String inID;
	private String qty;
	private String price;
	private String amount;
	private String trader;
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public Date getTradeDtTime() {
		return tradeDtTime;
	}
	public void setTradeDtTime(Date tradeDtTime) {
		this.tradeDtTime = tradeDtTime;
	}
	public String getInID() {
		return inID;
	}
	public void setInID(String inID) {
		this.inID = inID;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}
	
	@Override
	public String toString() {
		return "[ tradeId="+ this.tradeId+", tradeDtTime="+this.tradeDtTime+", inD="+this.inID+", qty="+this.qty+", price="+this.price+", amount="+this.amount+", trader="+this.trader+"]";
	}
		

}
