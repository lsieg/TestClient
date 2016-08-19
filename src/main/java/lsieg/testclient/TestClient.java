package lsieg.testclient;

import lsieg.core.testcore.*;

public class TestClient {
	public static void main(String[] args)
	{
		TestCore testCore = new TestCore();
		System.out.println(testCore.getTestString());
	}
}