package com.fsck.k9;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

/**
 * Created by Josh on 2/3/2016.
 * Use this class to test any general/basic features (that aren't in their own folder)
 */
@RunWith(AndroidJUnit4.class)
public class BasicFeaturesTest {

    /**
     * Created by Josh on 2/3/2016.
     * Tests the Email Address Validator
     */
    @Test
    public void testEmailAddressValidator() {
        EmailAddressValidator testValidator = new EmailAddressValidator();

        //test 1: check a valid email address
        assertTrue(testValidator.isValidAddressOnly("aaa@bbb.com"));
        //test 2: check 1st almost valid email address
        assertFalse(testValidator.isValidAddressOnly("aaabbb.com"));
        //test 3: check 2nd almost valid email address
        assertFalse(testValidator.isValidAddressOnly("aaa@bbbcom"));
        //test 4: check completely invalid email address
        assertFalse(testValidator.isValidAddressOnly("aaabbbcom"));
        //test 5: check tricky email address
        assertFalse(testValidator.isValidAddressOnly("@."));

        //code that does nothing
        for (int i = 0; i < 2; i++) {
            //;
        }
    }
}
