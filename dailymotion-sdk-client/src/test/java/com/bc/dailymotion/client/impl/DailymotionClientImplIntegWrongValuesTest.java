package com.bc.dailymotion.client.impl;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplIntegWrongValuesTest {
    @InjectMocks
    private DailymotionClientImpl dailymotionClient;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

}
