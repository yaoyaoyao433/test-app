package com.sankuai.meituan.location.collector.reporter;

import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c l;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b3a4d68873f6063015c9db2072fef62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b3a4d68873f6063015c9db2072fef62");
            return;
        }
        this.b = 0L;
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00d35adcd85a982fd938cbc0fc653087", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00d35adcd85a982fd938cbc0fc653087");
        }
        if (l == null) {
            synchronized (c.class) {
                if (l == null) {
                    l = new c();
                }
            }
        }
        return l;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80960d9446b3b0750bde36dd4d6907ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80960d9446b3b0750bde36dd4d6907ab");
            return;
        }
        try {
            if (!f.b().getBoolean("collect_alarm_api", true)) {
                LogUtils.a("采集api 报警开关关闭");
                return;
            }
            LogUtils.a("采集api 报警开关打开");
            if (this.e > ((this.h * 2) + this.i + this.j + 1) * k.a().m) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "get_all_cellinfo_coll", "", String.valueOf(this.e)));
                LogUtils.a("GetAllCellInfo_coll report alarm");
            }
            if (this.d > ((this.h * 2) + this.i + this.j + 1) * k.a().l) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "get_cell_location_coll", "", String.valueOf(this.d)));
                LogUtils.a("GetCellLocation_coll report alarm");
            }
            if (this.f > ((this.h * 2) + this.i + this.j + 1) * k.a().r) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "get_cell_location_ext_coll", "", String.valueOf(this.f)));
                LogUtils.a("GetCellLocationExt_coll report alarm");
            }
            if (this.g > ((this.h * 2) + this.k + 1) * k.a().q) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "get_connection_info_coll", "", String.valueOf(this.g)));
                LogUtils.a("GetConnectionInfo_coll report alarm");
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d96446af574d82000213cdf943ed42c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d96446af574d82000213cdf943ed42c");
            return;
        }
        this.b = 0L;
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }
}
