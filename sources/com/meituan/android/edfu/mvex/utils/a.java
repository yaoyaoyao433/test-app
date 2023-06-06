package com.meituan.android.edfu.mvex.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static MessageDigest a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e78d9ecf16c81f24aef66289fac540c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (MessageDigest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e78d9ecf16c81f24aef66289fac540c8");
        }
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
