package com.lsieg.testclient;

import com.lsieg.core.testcore.*;

public class TestClient {
	public static void main(String[] args)
	{
		TestCore testCore = new TestCore();
		System.out.println(testCore.getTestString());
	}
}