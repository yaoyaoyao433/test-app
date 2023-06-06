package com.meituan.msi.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    long b;
    final String c;
    final String d;

    public g(String str, String str2, Context context) {
        Object[] objArr = {str, str2, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8168305d4c2fb83bb5a6676eb541db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8168305d4c2fb83bb5a6676eb541db");
            return;
        }
        this.c = str;
        this.d = str2;
    }
}
