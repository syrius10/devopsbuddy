package com.devopsbuddy.test.unit;

import com.devopsbuddy.utils.UserUtils;
import com.devopsbuddy.web.controllers.ForgotMyPasswordController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import java.util.UUID;

/**
 * Created by Syrius on 7/5/2017.
 */
public class UserUtilsUnitTest {

    private MockHttpServletRequest mockHttpServletRequest;

    @Before
    public void init() { mockHttpServletRequest = new MockHttpServletRequest(); }

    @Test
    public void testPasswordResetEmailUrlConstruction() throws Exception {

        mockHttpServletRequest.setServerPort(8080); //Default is 80

        String token = UUID.randomUUID().toString();
        long userId = 123456;

        String expectedUrl = "http://localhost:8080" +
                ForgotMyPasswordController.CHANGE_PASSWORD_PATH + "?id=" + userId + "&token=" + token;

        String actualUrl = UserUtils.createPasswordResetUrl(mockHttpServletRequest, userId, token);

        Assert.assertEquals(expectedUrl, actualUrl);

    }

}
