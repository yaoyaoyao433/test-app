package com.meituan.android.quickpass.uptsm.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static PrivateKey a(String str) {
        byte[] byteArray;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0ce09a7b8facda5a4e9b3a00da96518", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrivateKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0ce09a7b8facda5a4e9b3a00da96518");
        }
        try {
            com.meituan.android.quickpass.uptsm.common.base64.a aVar = new com.meituan.android.quickpass.uptsm.common.base64.a();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.quickpass.uptsm.common.base64.e.c;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2b2b59e8ca2c1fcf9277555b412dbaff", RobustBitConfig.DEFAULT_VALUE)) {
                byteArray = (byte[]) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2b2b59e8ca2c1fcf9277555b412dbaff");
            } else {
                byte[] bArr = new byte[str.length()];
                str.getBytes(0, str.length(), bArr, 0);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                aVar.a(byteArrayInputStream, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
            return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(byteArray));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(PrivateKey privateKey, String str) {
        Object[] objArr = {privateKey, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c4fb2ca15e89265e5d13ee46810e639", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c4fb2ca15e89265e5d13ee46810e639");
        }
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);
            signature.update(str.getBytes());
            return new com.meituan.android.quickpass.uptsm.common.base64.b().a(signature.sign());
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            e.printStackTrace();
            return null;
        }
    }
}
