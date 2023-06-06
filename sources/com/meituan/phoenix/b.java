package com.meituan.phoenix;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static String b;
    @SuppressLint({"StaticFieldLeak"})
    public static Context c;

    public static com.meituan.phoenix.core.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64a757c0d4c48f86b77497bb503c20af", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.phoenix.core.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64a757c0d4c48f86b77497bb503c20af");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("phoenix not init");
        }
        return new com.meituan.phoenix.core.a(str);
    }
}
