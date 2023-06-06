package com.sankuai.waimai.business.restaurant.poicontainer.utils;

import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    protected final MetricsSpeedMeterTask b;
    protected final MetricsSpeedMeterTask c;
    protected final MetricsSpeedMeterTask d;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e663fb1088c40a8f7c43d6739912690f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e663fb1088c40a8f7c43d6739912690f");
            return;
        }
        this.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask("WM_RESTAURANT_NATIVE_PAGE_TASK");
        this.c = MetricsSpeedMeterTask.createCustomSpeedMeterTask("WM_RESTAURANT_MACH_PRO_MENU_PAGE_TASK");
        this.d = MetricsSpeedMeterTask.createCustomSpeedMeterTask("WM_RESTAURANT_MACH_PRO_ALL_PAGE_TASK");
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64d366f4417e291f781ab7250a6e9e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64d366f4417e291f781ab7250a6e9e54");
            return;
        }
        b(str);
        c(str);
        d(str);
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ecab31a507292e2f8e43d4c2ba6294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ecab31a507292e2f8e43d4c2ba6294");
        } else {
            this.b.recordStep(str);
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d242e54fe2aa4028d39c548308973e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d242e54fe2aa4028d39c548308973e");
        } else {
            this.c.recordStep(str);
        }
    }

    private void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db4033ba3e43000cfb4e35c5d64983a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db4033ba3e43000cfb4e35c5d64983a0");
        } else {
            this.d.recordStep(str);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a46dfcd451a03e41d749e9a8e33e25c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a46dfcd451a03e41d749e9a8e33e25c");
        } else {
            this.b.disable();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd863f9460dad2157cc1cdef094514bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd863f9460dad2157cc1cdef094514bf");
        } else {
            this.c.disable();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f05d94c3a6fec0a2b428d82e1e0737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f05d94c3a6fec0a2b428d82e1e0737");
        } else {
            this.d.disable();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf81df4506d314b57a86d4c2db5d82d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf81df4506d314b57a86d4c2db5d82d8");
        } else {
            h.a(this.b);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "354d26dac133972c81e9128c13d032ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "354d26dac133972c81e9128c13d032ba");
        } else {
            h.a(this.c);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ebf32c283e679243cfceb24d08aafb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ebf32c283e679243cfceb24d08aafb2");
        } else {
            h.a(this.d);
        }
    }
}
