package com.meituan.android.common.locate.platform.sniffer.report;

import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.reporter.n;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile d f;
    public long a;
    public long b;
    public int c;
    public int d;
    public int e;
    private int g;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc86d848e605ec11bef142857e85c5aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc86d848e605ec11bef142857e85c5aa");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g = 4;
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0fef436d842f7b0b79a283537a7b5ac8", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0fef436d842f7b0b79a283537a7b5ac8");
        }
        if (f == null) {
            synchronized (d.class) {
                if (f == null) {
                    f = new d();
                }
            }
        }
        return f;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f224a30719d9a49a5ee50d1c3af7720d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f224a30719d9a49a5ee50d1c3af7720d");
            return;
        }
        try {
            if (!n.a().e.booleanValue()) {
                LogUtils.a("定位 API 告警开关关闭");
                return;
            }
            int max = Math.max(1, (int) ((this.b - this.a) / LocationStrategy.LOCATION_TIMEOUT));
            if (this.c > this.g * max * k.a().l) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "get_cell_location_loc", "", String.valueOf(this.c)));
                LogUtils.a("GetCellLocation_loc report alarm");
            }
            if (this.d > this.g * max * k.a().m) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "get_all_cellinfo_loc", "", String.valueOf(this.d)));
                LogUtils.a("GetAllCellInfo_loc report alarm");
            }
            if (this.e > max * this.g * k.a().n) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "request_cellinfo_update_loc", "", String.valueOf(this.e)));
                LogUtils.a("RequestCellInfoUpdate_loc report alarm");
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3875e7f9218b7c7d77a26963d6a0e76c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3875e7f9218b7c7d77a26963d6a0e76c");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g = 4;
    }

    public void a(long[] jArr) {
        Object[] objArr = {jArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5a5f360313c8fe69ffb8a6c9a5e74a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5a5f360313c8fe69ffb8a6c9a5e74a0");
        } else {
            this.g = (int) jArr[0];
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e512ad1fe2e926c913cc307856480839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e512ad1fe2e926c913cc307856480839");
            return;
        }
        e();
        this.a = System.currentTimeMillis();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c70a7f8eebe0bd7c2932f3a51ed829d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c70a7f8eebe0bd7c2932f3a51ed829d4");
            return;
        }
        this.b = System.currentTimeMillis();
        d();
        e();
    }
}
