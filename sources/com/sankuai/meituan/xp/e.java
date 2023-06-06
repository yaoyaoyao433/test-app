package com.sankuai.meituan.xp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;

    public e() {
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bddea763265a0cf21e0399af5372392", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bddea763265a0cf21e0399af5372392") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        private static final e a = new e();
    }
}
