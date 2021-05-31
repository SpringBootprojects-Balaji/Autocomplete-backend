package com.web.search.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.search.model.PageData;

@Service
public class SearchService {
	
	Logger logger = LoggerFactory.getLogger(SearchService.class);
	
	public List<PageData> searchresource(String searchterm) {
		
		
		List<PageData> pagedata =  readmockdata();
		Iterator<PageData> itr = pagedata.iterator();
		while(itr.hasNext()) {
			
			PageData line = (PageData) itr.next();
			if(!line.getPagename().toLowerCase().startsWith(searchterm.toLowerCase())) {
				itr.remove();
			}
		}
		
		logger.info("Result for search term" + searchterm, pagedata);
		return pagedata;
		
		
	}
	
	private List<PageData> readmockdata(){
		
		List<PageData> pagedata = new ArrayList<PageData>();
	
		pagedata.add(new PageData(1,"For Wikipedia-related communication in languages other than English.","Local embassy"));
		pagedata.add(new PageData(2,"focus of the state's economy from fur trading to lead and iron mining","state's economy from fur trading"));
		pagedata.add(new PageData(3,"his historical depiction of the coat of arms of Wisconsin","historical depiction"));
		pagedata.add(new PageData(4,"The mysteries of Isis were religious initiation rites performed","mysteries of Isis"));
		return pagedata;
	}

}
