package com.sankuai.eh.component.service.tools;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public boolean b;
    private boolean c;
    private int d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.service.tools.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0548a {
        public static a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2394076258a25c4e8683066a4618a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2394076258a25c4e8683066a4618a5");
            return;
        }
        this.c = false;
        this.d = -1;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3fb5c3aaac2a532fa7afcded43f18ff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3fb5c3aaac2a532fa7afcded43f18ff")).booleanValue() : f.b();
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1149e0361d5a1b67020e268b3425f79", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1149e0361d5a1b67020e268b3425f79")).intValue();
        }
        if (this.d != -1) {
            return this.d;
        }
        if (TextUtils.isEmpty(com.sankuai.eh.component.service.a.c().f())) {
            return -1;
        }
        return (com.sankuai.eh.component.service.a.c().f().hashCode() & Integer.MAX_VALUE) % 100;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f3cc755699beedc1d5da2afaf09d41d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f3cc755699beedc1d5da2afaf09d41d")).intValue();
        }
        if (this.d != -1) {
            return this.d;
        }
        if (TextUtils.isEmpty(com.sankuai.eh.component.service.a.c().f())) {
            return -1;
        }
        return (com.sankuai.eh.component.service.a.c().f().hashCode() & Integer.MAX_VALUE) % 1000;
    }
}
