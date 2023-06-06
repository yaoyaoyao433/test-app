package com.sankuai.waimai.irmo;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Application b;
    public b c;

    public a() {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0969a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e00feef136e219488e85bb3267725acc", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e00feef136e219488e85bb3267725acc") : C0969a.a;
    }
}
