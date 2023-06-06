package com.meituan.android.common.locate.platform.sniffer.report;

import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.reporter.n;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile c i;
    public long a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeed3fbd64a4798815fdada5b560dac8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeed3fbd64a4798815fdada5b560dac8");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8660c27fc8c26bc9086b542107c9aba", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8660c27fc8c26bc9086b542107c9aba");
        }
        if (i == null) {
            synchronized (c.class) {
                if (i == null) {
                    i = new c();
                }
            }
        }
        return i;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70e7bbc75e3186cdd5c3ebbac77b145e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70e7bbc75e3186cdd5c3ebbac77b145e");
            return;
        }
        try {
            if (!n.a().e.booleanValue()) {
                LogUtils.a("定位 API 告警开关关闭");
                return;
            }
            int max = Math.max(1, (int) ((this.d - this.c) / 1000));
            if (this.f > k.a().h * 1.0d) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "register_gnssStatus_callback_loc", "", String.valueOf(this.f)));
                LogUtils.a("RegisterGnssStatusCallback_loc report alarm");
            }
            if (this.h > max * 40 * k.a().i) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "on_gnssstatus_change_loc", "", String.valueOf(this.h)));
                LogUtils.a("OnGnssStatusChange_loc report alarm");
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ba8f7c68441703caa2e0b98017c3552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ba8f7c68441703caa2e0b98017c3552");
            return;
        }
        this.c = 0L;
        this.d = 0L;
        this.f = 0;
        this.h = 0;
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "248db7cf085ecbcc7c30e3902c8518f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "248db7cf085ecbcc7c30e3902c8518f4");
            return;
        }
        int max = Math.max(1, (int) ((this.b - this.a) / 1000));
        if (this.e > 1) {
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "add_gpsStatus_listener_loc", "", String.valueOf(this.e)));
            LogUtils.a("AddGpsStatusListener_loc report alarm");
        }
        if (this.g > max * 40) {
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "on_gpsStatus_changed_loc", "", String.valueOf(this.g)));
            LogUtils.a("OnGpsStatusChanged_loc report alarm");
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70669310f859bf519df067a7fae2483e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70669310f859bf519df067a7fae2483e");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.e = 0;
        this.g = 0;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e01297aee05ae9a4fb3aba77303cd728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e01297aee05ae9a4fb3aba77303cd728");
            return;
        }
        g();
        this.c = System.currentTimeMillis();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "141fb736fdfde38461d3fc29f34c1031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "141fb736fdfde38461d3fc29f34c1031");
            return;
        }
        i();
        this.a = System.currentTimeMillis();
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1f94641c678717193891e96c3c87622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1f94641c678717193891e96c3c87622");
            return;
        }
        this.d = System.currentTimeMillis();
        f();
        g();
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38be332a5d84e4315c710bced778b90b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38be332a5d84e4315c710bced778b90b");
            return;
        }
        this.b = System.currentTimeMillis();
        h();
        i();
    }
}
