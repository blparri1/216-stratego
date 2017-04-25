package edu.asu.stratego.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NormalUnitTest.class, SpyTest.class, Test.class, TestMinerAndBomb.class })
public class AllTests {

}
