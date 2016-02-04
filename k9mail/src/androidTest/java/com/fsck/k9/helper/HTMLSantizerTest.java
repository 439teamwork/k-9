package com.fsck.k9.helper;

import com.fsck.k9.K9;

import android.test.AndroidTestRunner.*;
import android.test.ApplicationTestCase;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Thomas Eilerman on 2/4/2016.
 */
public class HTMLSantizerTest {

    @Test
    public void testHtmlSanitizer() {
        checkHtmlSanitizer("<html><head></head><body><script>alert('Boo!');</script></body></html>", "<script>alert('Boo!');</script>");
    }
    private void checkHtmlSanitizer(String expected, String actual) {
        assertEquals(expected, HtmlSanitizer.sanitize(actual));
        System.out.println(HtmlSanitizer.sanitize(actual));
    }
}
//<script>alert('Boo!');</script>