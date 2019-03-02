
package com.hsbc.stepdefinition;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.hsbc.tradeapplication.Instrument;
import com.hsbc.tradeapplication.Trade;
import com.hsbc.tradeapplication.TradeDataDisplay;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TradeDataStepDefinition {
	TradeDataDisplay tradeData;
	
	public TradeDataStepDefinition() {
		tradeData = new TradeDataDisplay(); //creatin object
	}
	
	Date from = new Date();
	Date to = new Date();
	public static List<Trade> tradesList = new ArrayList<Trade>();
	public static List<Instrument> instList = new ArrayList<Instrument>();
	Set<String> inst = new HashSet<String>();
	
	@Given("^the user reads the trade files$")
	public void the_user_reads_the_trade_files() throws Throwable {
		
		instList = tradeData.readInstDataFiles(); 
		tradesList =  tradeData.readTradeDataFile();
		
	}

	@When("^the user provides the dates FromDate \"([^\"]*)\" and ToDate \"([^\"]*)\" to filter the data$")
	public void the_user_provides_the_dates_FromDate_and_Toate_to_filter_the_data(String fromDate, String toDate) throws Throwable {
		from = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(fromDate);
		to = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(toDate);
	}

	@Then("^he gets the trade results of Instruments according to date$")
	public void he_gets_the_trade_results_of_Instruments_according_to_date() throws Throwable {
		//to get traded instrument results
		System.out.println("Instrument wise traded volume between the date range " + from +" to " + to + " :");
		for (Instrument instrument : instList) {
			for (Trade trade : tradesList) {
				if (trade.getInID().equalsIgnoreCase(instrument.getInstid()) && trade.getTradeDtTime().after(from) && trade.getTradeDtTime().before(to)) {
					inst.add(instrument.getInstid());
					System.out.println(instrument.getInstid()+"[" + instrument.getInstname() + "] ==" + trade.getQty());
				}
			}
		}
		if(inst.isEmpty()) 
			System.out.println("No data found");
	
		//to get missing instrument list	
		System.out.println("List of instrument not traded between the dates : ");
		for (Instrument instrument : instList) {
			if (!inst.contains(instrument.getInstid())) {
				System.out.println(instrument.getInstid()+"["+ instrument.getInstname()+ "]");
			}
		}
		
		
		
	}
}
