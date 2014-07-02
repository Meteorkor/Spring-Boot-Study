package demo;

import static org.junit.Assert.assertTrue;

import javax.validation.constraints.AssertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ApplicationTests {

	private String temp_tex;
	
	@Before
	public void before2(){
		this.temp_tex = "test";
		
	}
	
	@Test
	public void contextLoads1() {
		
		//System.out.println("테스트 출력 확인");
		String message ="테스트 출력";
		
		assertTrue( message+"에러시 이게 나오나 본데..", message.equals("테스트 출력") );
		
		
		System.out.println("temp_tex : " + temp_tex );
		temp_tex = "1";
		
	}

	@Test
	public void contextLoads2() {
		
		//System.out.println("테스트 출력 확인");
		String message ="테스트 출력";
		
		assertTrue( message+"에러시 이게 나오나 본데..", message.equals("테스트 출력") );
		
		System.out.println("temp_tex : " + temp_tex );
		temp_tex = "2";
		
	}
	
}
