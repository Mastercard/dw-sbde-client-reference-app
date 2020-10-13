package com.mastercard.sbde;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openapitools.client.ApiException;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;

public class MainTest {

    private static ApiService apiService = mock(ApiService.class);

    @Before
    public void before() {
        reset(apiService);
        Main.setApiService(apiService);
    }

    @Test(expected = ApiException.class)
    public void mainTest() throws Exception {

        doThrow(new ApiException("message"))
                .when(apiService)
                .getMerchantLocationByMerchantLocationId(anyLong());

        // act
        Main.main(new String[]{});
    }

}
