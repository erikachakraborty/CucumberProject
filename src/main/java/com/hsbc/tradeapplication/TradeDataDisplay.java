package com.hsbc.tradeapplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class TradeDataDisplay {
	static String line = null;
	static Scanner scanner = null;

	public static List<Trade> tradesList;
	public static List<Instrument> instList;
	
	static Date fromDate = new Date();
	static Date toDate = new Date();

	/********* This function reads the inst.txt file and returns a list of all instrument data ******/
	public List<Instrument> readInstDataFiles() throws IOException{	
		System.out.println("inside ReadInstData");
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Work\\AutomationWorkspace\\TradeInstDetails\\src\\main\\resources\\TestData\\inst.txt"));	
		int index = 0;
			List<Instrument> instrumentList = new ArrayList<Instrument>();
			try {
				reader.readLine();
				while ((line = reader.readLine()) != null) {
					Instrument instrument = new Instrument();
					scanner = new Scanner(line);
					scanner.useDelimiter(",");
					while (scanner.hasNext()) {
						String data = scanner.next();
						if (index == 0)
							instrument.setInstid(data);
						else if (index == 1)
							instrument.setInstname(data);			
						else
							System.out.println("invalid data::" + data);
						index++;
					}
					index = 0;
					instrumentList.add(instrument);
				}  
			} catch (IOException e) {
				e.printStackTrace();
			}
			instList = instrumentList;
			reader.close(); 
			return instList;
	}

	/********* This function reads the trade.txt file and returns a list of all trade data ******/
	public List<Trade> readTradeDataFile() throws FileNotFoundException,IOException {
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Work\\AutomationWorkspace\\TradeInstDetails\\src\\main\\resources\\TestData\\trades.txt"));
			int index1 = 0;
			List<Trade> tradeList = new ArrayList<Trade>();
			reader1.readLine();
			while ((line = reader1.readLine()) != null) {
				Trade trade = new Trade();
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext()) {
					String data1 = scanner.next();
					if (index1 == 0)
						trade.setTradeId(data1);
					else if (index1 == 1)
						try {
							trade.setTradeDtTime(new SimpleDateFormat("dd/MM/yyyy").parse(data1));
						} catch (ParseException e) {
							e.printStackTrace();
						}
					else if (index1 == 2)
						trade.setInID(data1);
					else if (index1 == 3)
						trade.setQty(data1);
					else if (index1 == 4)
						trade.setPrice(data1);
					else if (index1 == 5)
						trade.setAmount(data1);
					else if (index1 == 6)
						trade.setTrader(data1);
					else
						System.out.println("invalid data::" + data1);
					index1++;
				}
				index1 = 0;
				tradeList.add(trade);
			}
			tradesList = tradeList;
			reader1.close();
			return tradesList;
			
}

}

