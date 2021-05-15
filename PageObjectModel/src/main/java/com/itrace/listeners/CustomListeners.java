package com.itrace.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import com.itrace.base.TestBase;

public class CustomListeners implements ITestListener, IAnnotationTransformer{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {		
		
		TestBase.log.debug("Capturing Pass screenshot");			
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		TestBase.log.debug("Capturing fail screenshot");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	public void transform(ITestAnnotation testannotation, Class testClass,
            Constructor testConstructor, Method testMethod)    {
        IRetryAnalyzer retry = testannotation.getRetryAnalyzer();

        if (retry == null)    {
            testannotation.setRetryAnalyzer(FailRetry.class);
        }

    }

}
