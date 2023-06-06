package com.meituan.passport.plugins;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        byte[] bArr;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c60ed5fd77774a30b2a104f4b166a94", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c60ed5fd77774a30b2a104f4b166a94");
        }
        if (str == null) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str2.getBytes("utf-8"), "AES"), new IvParameterSpec(str2.getBytes("utf-8")));
            bArr = cipher.doFinal(str.getBytes("utf-8"));
        } catch (Exception unused) {
            bArr = null;
        }
        return Base64.encodeBytes(bArr);
    }

    public static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f7c716ba5189d9e35849d6e1762baaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f7c716ba5189d9e35849d6e1762baaa");
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes("utf-8"), "AES"), new IvParameterSpec(str2.getBytes("utf-8")));
            return new String(cipher.doFinal(Base64.decode(str)), "utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
