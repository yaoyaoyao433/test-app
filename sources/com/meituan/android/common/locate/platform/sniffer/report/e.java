package com.meituan.android.common.locate.platform.sniffer.report;

import android.os.Build;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.reporter.n;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile e m;
    public long a;
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    private int j;
    private int k;
    private int l;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d7b2f9ca24fe68aea459d4ea6203cbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d7b2f9ca24fe68aea459d4ea6203cbb");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 1;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.j = 4;
        this.k = 4;
        this.i = 0;
        this.l = 0;
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d455bf80e8e3e21037eb859cc438a59", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d455bf80e8e3e21037eb859cc438a59");
        }
        if (m == null) {
            synchronized (e.class) {
                if (m == null) {
                    m = new e();
                }
            }
        }
        return m;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8913f57000acc663bab87d355494aa29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8913f57000acc663bab87d355494aa29");
        } else {
            this.l = (((((Math.max(1, (int) ((this.b - this.a) / LocationStrategy.LOCATION_TIMEOUT)) * this.k) * 3) + this.i) + this.g) * 2) - 1;
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19658ad962df72453b967a0a6be06660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19658ad962df72453b967a0a6be06660");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 1;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.j = 4;
        this.k = 4;
        this.i = 0;
        this.l = 0;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05c9a76549db73aa99486d40c4094cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05c9a76549db73aa99486d40c4094cde");
            return;
        }
        try {
            if (!n.a().e.booleanValue()) {
                LogUtils.a("定位 API 告警开关关闭");
                return;
            }
            int max = Math.max(1, (int) ((this.b - this.a) / LocationStrategy.LOCATION_TIMEOUT));
            int i = Build.VERSION.SDK_INT >= 28 ? this.j : this.e;
            if (this.c > max * i * k.a().o) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "start_scan_loc", "", String.valueOf(this.c)));
                LogUtils.a("StartScan_loc report alarm");
            }
            if (this.f > max * (this.k + i) * k.a().p) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "get_scan_results_loc", "", String.valueOf(this.f)));
                LogUtils.a("GetScanResults_loc report alarm");
            }
            d();
            if (this.h > this.l * k.a().q) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "get_connection_info_loc", "", String.valueOf(this.h)));
                LogUtils.a("GetConnectionInfo_loc report alarm");
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f68a0dc259544fa1f2eab6d87af2a9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f68a0dc259544fa1f2eab6d87af2a9c");
        } else {
            this.e = ((int) j) / 1000;
        }
    }

    public void a(long[] jArr) {
        Object[] objArr = {jArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "674dd35af57cfbb816a3dd2bb9d474ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "674dd35af57cfbb816a3dd2bb9d474ed");
        } else {
            this.k = (int) jArr[0];
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "437d124605ae30368170faedd6c7fce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "437d124605ae30368170faedd6c7fce0");
            return;
        }
        e();
        this.a = System.currentTimeMillis();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6b3c22ebbd97ad11631bd7a7924ca39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6b3c22ebbd97ad11631bd7a7924ca39");
            return;
        }
        this.b = System.currentTimeMillis();
        f();
        e();
    }
}
