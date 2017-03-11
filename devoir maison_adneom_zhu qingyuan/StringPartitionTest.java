package com.adneom;

//import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

public class StringPartitionTest {
	
	private static StringPartition p = new StringPartition();
	
/*
	@Before
	public void setUp() throws Exception {
	}
*/
	
	@Test
	public void test() {
		String[]liste = {"1","2","3","4","WEI","BI","ZHI","empty","yang","guang","ming","mei","da","cao","yuan","2355","316","2546","997","75","05"};
		int taille = 4;
		p.partition(liste,taille);
	}

	@Test
	public void test2() {
		String[]liste = {"1","2","3"};
		int taille = 4;
		p.partition(liste,taille);
	}
	
	@Test
	public void test3() {
		String[]liste = {"1","2","3"};
		int taille = 0;
		p.partition(liste,taille);
	}
}
