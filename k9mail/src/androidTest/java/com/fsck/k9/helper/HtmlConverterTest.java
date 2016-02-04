package com.fsck.k9.helper;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Josh on 2/4/2016.
 */
@RunWith(AndroidJUnit4.class)
public class HtmlConverterTest {
    @Test
    public void testHtmlToText() {
        HtmlConverter htmlConv = new HtmlConverter();
        String plaintext = htmlConv.htmlToText("<b>BOLD<b>");
        assertEquals(plaintext, "BOLD");
    }
}
