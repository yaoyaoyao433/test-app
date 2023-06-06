package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3182a50af92d29d033c4301e45255caf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3182a50af92d29d033c4301e45255caf");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            Object[] objArr2 = {digest};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9447f21a2e6ec6b686a4b070f44bfd1e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9447f21a2e6ec6b686a4b070f44bfd1e");
            }
            String str2 = "";
            for (int i = 0; i < digest.length; i++) {
                str2 = str2 + Integer.toString((digest[i] & 255) + 256, 16).substring(1);
            }
            return str2.toLowerCase();
        } catch (Exception unused) {
            return null;
        }
    }
}
