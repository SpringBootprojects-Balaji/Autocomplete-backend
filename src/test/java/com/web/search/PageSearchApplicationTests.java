package com.web.search;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.web.search.model.PageData;
import com.web.search.service.SearchService;

@SpringBootTest
class PageSearchApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void getPageData() {
		SearchService ss = new SearchService();
		List<PageData> pagedatalist = ss.searchresource("for");
		
		assertThat(pagedatalist.size()).isEqualTo(1);
		
	}

}
