package com.meituan.android.legwork.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r {
    public static ChangeQuickRedirect a;
    public ConcurrentHashMap<String, String> b;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static final r a = new r();
    }

    public r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3acdbf630a6e6eeef94eb279427e7ce4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3acdbf630a6e6eeef94eb279427e7ce4");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801672444c53187091ff7a93cdf1c0cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801672444c53187091ff7a93cdf1c0cd");
        } else {
            this.b.clear();
        }
    }
}
