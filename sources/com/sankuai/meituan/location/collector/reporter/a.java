package com.sankuai.meituan.location.collector.reporter;

import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a l;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f461b495300affc1db81d6914a4868b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f461b495300affc1db81d6914a4868b");
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
        this.k = 1L;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93738f44b4df2f2fdb8a56e5498b9441", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93738f44b4df2f2fdb8a56e5498b9441");
        }
        if (l == null) {
            synchronized (a.class) {
                if (l == null) {
                    l = new a();
                }
            }
        }
        return l;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5a5655c45706115d022250711dc93f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5a5655c45706115d022250711dc93f");
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
        this.k = 1L;
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f520e362490804f34c95ef0f29c49833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f520e362490804f34c95ef0f29c49833");
            return;
        }
        try {
            if (!f.b().getBoolean("collect_alarm_api", true)) {
                LogUtils.a("采集api 报警开关关闭");
                return;
            }
            int max = Math.max(1, (int) ((this.c - this.b) / 1000));
            if (this.d > k.a().j * 1.0d) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "request_location_update_coll", "", String.valueOf(this.d)));
                LogUtils.a("RequestLocationUpdate_coll report alarm");
            }
            if (this.e > k.a().h * 1.0d) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "add_gpsStatus_listener_coll", "", String.valueOf(this.e)));
                LogUtils.a("AddGpsStatusListener_coll report alarm");
            }
            if (this.f > k.a().j * 1.0d) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "register_gnssStatus_callback_coll", "", String.valueOf(this.f)));
                LogUtils.a("RegisterGnssStatusCallback_coll report alarm");
            }
            if (this.g > k.a().h * 1.0d) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "add_nmea_listener_coll", "", String.valueOf(this.g)));
                LogUtils.a("AddNmeaListener_coll report alarm");
            }
            if (this.h > (max / this.k) * k.a().k) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "on_location_Changed_coll", "", String.valueOf(this.h)));
                LogUtils.a("OnLocationChanged_coll report alarm");
            }
            double d = max;
            if (this.i > k.a().i * d) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "on_nmea_Received_coll", "", String.valueOf(this.i)));
                LogUtils.a("OnNmeaReceived_coll report alarm");
            }
            if (this.j > d * k.a().i) {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "on_gpsStatus_changed_coll", "", String.valueOf(this.j)));
                LogUtils.a("OnGpsStatusChanged_coll report alarm");
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }
}
