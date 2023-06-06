package com.meituan.msi.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ab {
    public static ChangeQuickRedirect a;
    long b;
    final String c;
    final String d;

    public ab(String str, String str2, Context context) {
        Object[] objArr = {str, str2, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4f520bbeac805576edc487cac678877", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4f520bbeac805576edc487cac678877");
            return;
        }
        this.c = str;
        this.d = str2;
    }
}
