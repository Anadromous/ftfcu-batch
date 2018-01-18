package com.chapman.ftcu.batch;

import org.springframework.batch.item.ItemProcessor;

import com.chapman.ftcu.batch.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	public Report process(Report item) throws Exception {
		
		System.out.println("Processing..." + item);
		String fname = item.getFirstName();
		String lname = item.getLastName();
		
		item.setFirstName(fname.toUpperCase());
		item.setLastName(lname.toUpperCase());
		return item;
	}

}