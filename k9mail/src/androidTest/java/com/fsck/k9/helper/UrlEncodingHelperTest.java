package com.fsck.k9.helper;

 //import com.fsck.k9.UrlEncoding;
 import com.fsck.k9.helper.UrlEncodingHelper;

 import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
/**
 * Created by Tanushri on 2/4/16.
 */
public class UrlEncodingHelperTest
{
    private UrlEncodingHelper UrlEn = new UrlEncodingHelper();

    @Test
    public void testUrlEn()
    {
    }

    private void checkUrl( String ut, String description )
    {
        assertTrue(ut, UrlEn.getClass().equals("UTF-8"));

        //assertTrue(description, UrlEn.getDescription().equals("UTF-8 not found"));
    }
}
