package com.efkon.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Oractise {
	
	@Test
	public void methidOne()
	{
		
		
		Assert.assertTrue(!false);
		
		System.out.println("will i get executed?");
		
		String firstletter="m";
		String text="Hi m, share this link with friends so they can join the conversation.";
		int m=text.indexOf(firstletter, 0);
		System.out.println(m);
		System.out.println(text.substring(text.indexOf(firstletter, 0), text.indexOf(firstletter, 0)+1));
	}

}
