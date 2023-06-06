package com.sankuai.waimai.kit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public boolean b;
    public String c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bbf2e8f6a0f1b4fd93a3ff29d03d5b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bbf2e8f6a0f1b4fd93a3ff29d03d5b3");
        } else {
            this.b = true;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.kit.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0981a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80053eb917c8eecaa3760ce791fee75e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80053eb917c8eecaa3760ce791fee75e") : C0981a.a;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067bd4bfed7c28885326c4e39c6c77ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067bd4bfed7c28885326c4e39c6c77ec")).booleanValue() : C0981a.a.b;
    }

    public final String c() {
        return this.c;
    }
}
