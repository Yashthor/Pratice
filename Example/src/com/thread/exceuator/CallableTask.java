package com.thread.exceuator;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "I am inside main thread" + Thread.currentThread().getName();
	}

}
