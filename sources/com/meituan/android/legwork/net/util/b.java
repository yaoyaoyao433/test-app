package com.meituan.android.legwork.net.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f38f6fd3262f611fd28450e1b9aa99c", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f38f6fd3262f611fd28450e1b9aa99c") : new GsonBuilder().create();
    }
}
