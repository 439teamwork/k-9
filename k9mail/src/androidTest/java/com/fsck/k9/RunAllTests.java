package com.fsck.k9;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.fsck.k9.helper.HtmlConverterTest;
import com.fsck.k9.helper.HTMLSantizerTest;
import com.fsck.k9.helper.EmailTest;

/**
 * Created by Josh on 2/4/2016.
 * runs our entire custom test suite
 * all tests that we write should be referenced/run here
 */
@RunWith(AndroidJUnit4.class)
public class RunAllTests {
    @Test
    public void runAllTests() {
        //Run the Email Validator Test
        EmailTest emailTest = new EmailTest();
        emailTest.testEmailValidation();

        //run the HtmlConverter Test
        HtmlConverterTest htmlConverterTest = new HtmlConverterTest();
        htmlConverterTest.testHtmlToText();

        //run the HTMLSanitizer Test
        HTMLSantizerTest htmlSanitizerTest = new HTMLSantizerTest();
        htmlSanitizerTest.testHtmlSanitizer();
    }
}
