package com.fsck.k9.helper;

import com.fsck.k9.EmailAddressValidator;
import com.fsck.k9.K9;

import android.test.AndroidTestRunner.*;
import android.test.ApplicationTestCase;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by slonej3 on 2/3/16.
 */
public class EmailTest {


    private EmailAddressValidator mEmailValidator = new EmailAddressValidator();

    @Test
    public void testEmailValidation() {
        checkEmailValidation("kaeloaz@gmail.com", "kaeloaz@gmail.com");
    }
    private void checkEmailValidation(String expected, String actual) {
        assertTrue(expected, mEmailValidator.isValidAddressOnly(actual));
    }
}
