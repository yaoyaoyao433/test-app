package com.meituan.android.paybase.utils;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final Gson a = new Gson();
    }

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3f0c6afdc096a7f1436ee9dcd900394", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3f0c6afdc096a7f1436ee9dcd900394") : a.a;
    }
}
