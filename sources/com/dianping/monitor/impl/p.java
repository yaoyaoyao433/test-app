package com.dianping.monitor.impl;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p extends m {
    public static ChangeQuickRedirect b;

    public p(int i, Context context, String str) {
        super(i, context, str, o.a(context));
        Object[] objArr = {Integer.valueOf(i), context, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8edfd317edac157b2a2e3788d25ecb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8edfd317edac157b2a2e3788d25ecb");
        }
    }

    @Override // com.dianping.monitor.impl.m
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4bef5fcb18d5c23dcf372b7a66b913", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4bef5fcb18d5c23dcf372b7a66b913");
        } else {
            super.b(str);
        }
    }
}
