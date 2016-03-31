package com.fsck.k9.helper;

import com.fsck.k9.Identity;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by meffordj2 on 2/4/16.
 */
public class IdentityTest
{
    private Identity mIdentity = new Identity();

    @Test
    public void testCheckIdentity()
    {
        //checkIdentity("Brandon", "kaeloaz@gmail.com", true, "testSig", "This is Description", "Reply");
    }

    private void checkIdentity(String name, String email, boolean signatureUse, String signature, String description, String replyTo)
    {
        assertTrue(name, mIdentity.getName().equals("Brandon"));
        assertTrue(email, mIdentity.getEmail().equals("kaeloaz@gmail.com"));
        assertEquals(signatureUse, mIdentity.getSignatureUse());
        assertTrue(signature, mIdentity.getSignature().equals("testSig"));
        assertTrue(description, mIdentity.getDescription().equals("This is Description"));
        assertTrue(replyTo, mIdentity.getReplyTo().equals("Reply"));
    }
}
