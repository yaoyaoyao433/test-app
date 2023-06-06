package com.sankuai.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MD5 {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final String getMessageDigest(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "943286d8801c4e502a7dc2706dcb40df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "943286d8801c4e502a7dc2706dcb40df");
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final byte[] getRawDigest(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "055bf52f5066a9f5fab42b84dffb057a", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "055bf52f5066a9f5fab42b84dffb057a");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }
}
