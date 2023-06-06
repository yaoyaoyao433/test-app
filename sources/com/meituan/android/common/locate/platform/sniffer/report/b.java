package com.meituan.android.common.locate.platform.sniffer.report;

import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.reporter.n;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile b f;
    public long a;
    public long b;
    public int c;
    public int d;
    public long e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b68cffbd086867bd3d4e0d3b645e122", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b68cffbd086867bd3d4e0d3b645e122");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 1L;
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0de532195d191df402f2c8d0c0af30aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0de532195d191df402f2c8d0c0af30aa");
        }
        if (f == null) {
            synchronized (b.class) {
                if (f == null) {
                    f = new b();
                }
            }
        }
        return f;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35d4d335f471077659d5f93a3fc0a87a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35d4d335f471077659d5f93a3fc0a87a");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 1L;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "470a2b9a1b7102d6d287e1936a48e690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "470a2b9a1b7102d6d287e1936a48e690");
            return;
        }
        try {
            if (!n.a().e.booleanValue()) {
                LogUtils.a("定位 API 告警开关关闭");
                return;
            }
            LogUtils.a("定位 API 告警开关打开");
            int max = Math.max(1, (int) ((this.b - this.a) / 1000));
            if (this.c > k.a().j * 1.0d) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "request_location_update_loc", "", String.valueOf(this.c)));
                LogUtils.a("RequestLocationUpdate_loc report alarm");
            }
            if (this.d > ((max / this.e) + 2) * k.a().k) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "on_location_Changed_loc", "", String.valueOf(this.d)));
                LogUtils.a("OnLocationChanged_loc report alarm");
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cae3d78a39ee5e49a560727ccd66d4c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cae3d78a39ee5e49a560727ccd66d4c5");
        } else {
            this.e = j;
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83813558b8a9ec45d8f6bfe1cdc9aa80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83813558b8a9ec45d8f6bfe1cdc9aa80");
            return;
        }
        d();
        this.a = System.currentTimeMillis();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2e21a77d220b1a3aa4ae639645b43aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2e21a77d220b1a3aa4ae639645b43aa");
            return;
        }
        this.b = System.currentTimeMillis();
        e();
        d();
    }
}
