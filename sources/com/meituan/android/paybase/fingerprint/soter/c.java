package com.meituan.android.paybase.fingerprint.soter;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.paybase.utils.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class c {
    public static ChangeQuickRedirect c;

    public abstract String a();

    public abstract Context b();

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d953d60236957162d1ebe849074cea0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d953d60236957162d1ebe849074cea0c");
        }
        String a = a();
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return "Soter_AuthKey_" + ag.a(a + str);
    }
}
