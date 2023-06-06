package com.meituan.android.common.locate.platform.sniffer.report;

import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.reporter.n;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    private static volatile a c;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int a;
    public int b;
    private long d;
    private long e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91280dd2a9b0ef6d160dd0e64b1901cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91280dd2a9b0ef6d160dd0e64b1901cc");
            return;
        }
        this.d = 0L;
        this.e = 0L;
        this.a = 0;
        this.b = 0;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6ddc96fead7499fa0ffcff5a32031c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6ddc96fead7499fa0ffcff5a32031c6");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b533b6942c5210400812b48de71fb02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b533b6942c5210400812b48de71fb02");
            return;
        }
        this.d = 0L;
        this.e = 0L;
        this.a = 0;
        this.b = 0;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f42b566f57ef4f85c2a1e2663adcc9a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f42b566f57ef4f85c2a1e2663adcc9a3");
            return;
        }
        try {
            if (!n.a().e.booleanValue()) {
                LogUtils.a("定位 API 告警开关关闭");
                return;
            }
            int max = Math.max(1, (int) ((this.e - this.d) / 1000));
            if (this.a > k.a().h * 1.0d) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "add_nmea_listener_loc", "", String.valueOf(this.a)));
                LogUtils.a("AddNmeaListener_loc report alarm");
            }
            if (this.b > max * k.a().i) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "on_nmea_Received_loc", "", String.valueOf(this.b)));
                LogUtils.a("OnNmeaReceived_loc report alarm");
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64e626bfbd6200a847851e10bf2e5efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64e626bfbd6200a847851e10bf2e5efb");
            return;
        }
        d();
        this.d = System.currentTimeMillis();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db1f90fb2201f828228a4db1a2faad84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db1f90fb2201f828228a4db1a2faad84");
            return;
        }
        this.e = System.currentTimeMillis();
        e();
        d();
    }
}
