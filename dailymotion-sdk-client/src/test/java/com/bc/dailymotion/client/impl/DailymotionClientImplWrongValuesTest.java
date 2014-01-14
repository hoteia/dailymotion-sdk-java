package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.type.ConnectionType;
import com.bc.dailymotion.api.type.EndpointType;
import com.bc.dailymotion.client.DailymotionClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplWrongValuesTest {

    /**
     * Static logger used for traces
     */
    private static Logger LOGGER = LoggerFactory.getLogger(DailymotionClientImpl.class);

    private DailymotionClient dailymotionClient = new DailymotionClientImpl();

    @DataProvider(name = "testDoMethodProvider")
    private Object[][] testDoMethodProvider() {
        int pCount = 0;
        for (Method method : DailymotionClient.class.getDeclaredMethods()) {
            pCount += method.getParameterCount();
        }

        Object[][] parameters = new Object[pCount][];

        int pCurrent = 0;
        for (Method method : DailymotionClient.class.getDeclaredMethods()) {
            for (Parameter parameter : method.getParameters()) {
                LOGGER.debug("method {} for parameter {}", method, parameter);
                parameters[pCurrent] = new Object[2];
                parameters[pCurrent][0] = method;

                Object[] tParams = new Object[method.getParameterCount()];
                int pArray = 0;
                for (Parameter sParameter : method.getParameters()) {
                    if (parameter.equals(sParameter)) {
                        tParams[pArray++] = null;
                    } else {
                        switch (sParameter.getType().getSimpleName()) {
                            case "Class":
                                tParams[pArray++] = Endpoint.class;
                                break;
                            case "EndpointType":
                                tParams[pArray++] = EndpointType.ALL;
                                break;
                            case "ConnectionType":
                                tParams[pArray++] = ConnectionType.ALL;
                                break;
                            case "String":
                                tParams[pArray++] = "toto";
                                break;
                            case "Map":
                                tParams[pArray++] = new HashMap<>();
                        }
                    }
                }
                parameters[pCurrent][1] = tParams;
                pCurrent++;
            }
        }

        LOGGER.debug("{}", parameters);
        return parameters;
    }

    @Test(dataProvider = "testDoMethodProvider", expectedExceptions = IllegalArgumentException.class)
    public void testDoMethod(Method method, Object[] params) throws Exception {
        LOGGER.debug("method {} invoked with parameter {}", method, params);
        //method.invoke(this.dailymotionClient, params);
    }
}
