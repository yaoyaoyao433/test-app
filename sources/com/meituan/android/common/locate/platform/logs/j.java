package com.meituan.android.common.locate.platform.logs;

import android.os.Bundle;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class j extends e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long a;
    private MtLocation d;
    private long e;
    private MtLocation f;
    private long g;
    private MtLocation h;
    private long i;
    private MtLocation j;
    private long k;
    private String l;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1956e1fcbf24cab2cccf8c80e5455456", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1956e1fcbf24cab2cccf8c80e5455456");
            return;
        }
        this.a = 0L;
        this.d = null;
        this.e = 0L;
        this.f = null;
        this.g = 0L;
        this.h = null;
        this.i = 0L;
        this.j = null;
        this.k = 0L;
        this.l = null;
    }

    public void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9fc1b3279aaae8e591477d683a5892d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9fc1b3279aaae8e591477d683a5892d");
        } else if (this.a == 0) {
            this.a = j;
            this.l = str;
        }
    }

    public void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fd621dda6f4375f8dcbec141973f7bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fd621dda6f4375f8dcbec141973f7bb");
        } else if (mtLocation != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.d == null && "mars".equals(mtLocation.getProvider())) {
                this.d = new MtLocation(mtLocation);
                this.e = currentTimeMillis;
            }
            if (this.f == null && GearsLocator.GEARS_PROVIDER.equals(mtLocation.getProvider())) {
                this.f = new MtLocation(mtLocation);
                this.g = currentTimeMillis;
            }
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void a(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec8078307666e9fd13054c7bac66fa45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec8078307666e9fd13054c7bac66fa45");
            return;
        }
        super.a(concurrentHashMap);
        a(concurrentHashMap, "loader_start_time", this.a);
        a(concurrentHashMap, "loader_bussiness_id", this.l);
        if (this.d != null) {
            a(concurrentHashMap, "loader_gps_longitude", this.d.getLongitude());
            a(concurrentHashMap, "loader_gps_latitude", this.d.getLatitude());
            a(concurrentHashMap, "loader_gps_accuracy", String.valueOf(this.d.getAccuracy()));
            a(concurrentHashMap, "loader_gps_report_time", String.valueOf(this.e));
            a(concurrentHashMap, "loader_gps_location_get_time", String.valueOf(this.d.getTime()));
            a(concurrentHashMap, "loader_gps_provider", this.d.getProvider());
            Bundle extras = this.d.getExtras();
            if (extras != null) {
                a(concurrentHashMap, "loader_gps_from", extras.getString("from"));
                a(concurrentHashMap, "loader_gps_is_master_cache", String.valueOf(extras.getBoolean("isMasterCache")));
                a(concurrentHashMap, "loader_gps_ttl", extras.getInt("gpsTtl"));
            }
        }
        if (this.f != null) {
            a(concurrentHashMap, "loader_gears_longitude", this.f.getLongitude());
            a(concurrentHashMap, "loader_gears_latitude", this.f.getLongitude());
            a(concurrentHashMap, "loader_gears_accuracy", String.valueOf(this.f.getAccuracy()));
            a(concurrentHashMap, "loader_gears_report_time", String.valueOf(this.g));
            a(concurrentHashMap, "loader_gears_location_get_time", String.valueOf(this.f.getTime()));
            a(concurrentHashMap, "loader_gears_provider", this.f.getProvider());
            Bundle extras2 = this.f.getExtras();
            if (extras2 != null) {
                a(concurrentHashMap, "loader_gears_from", extras2.getString("from"));
            }
        }
        if (this.h != null) {
            a(concurrentHashMap, "loader_user_receive_gps_longitude", this.h.getLongitude());
            a(concurrentHashMap, "loader_user_receive_gps_latitude", this.h.getLatitude());
            a(concurrentHashMap, "loader_user_receive_gps_accuracy", String.valueOf(this.h.getAccuracy()));
            a(concurrentHashMap, "loader_user_receive_gps_report_time", String.valueOf(this.i));
            a(concurrentHashMap, "loader_user_receive_gps_location_get_time", String.valueOf(this.h.getTime()));
            a(concurrentHashMap, "loader_user_receive_gps_provider", this.h.getProvider());
            Bundle extras3 = this.h.getExtras();
            if (extras3 != null) {
                a(concurrentHashMap, "loader_user_receive_gps_from", extras3.getString("from"));
                a(concurrentHashMap, "loader_user_receive_is_master_cache", String.valueOf(extras3.getBoolean("isMasterCache")));
                a(concurrentHashMap, "loader_user_receive_gps_ttl", extras3.getInt("gpsTtl"));
            }
        }
        if (this.j != null) {
            a(concurrentHashMap, "loader_user_receive_gears_longitude", this.j.getLongitude());
            a(concurrentHashMap, "loader_user_receive_gears_latitude", this.j.getLongitude());
            a(concurrentHashMap, "loader_user_receive_gears_accuracy", String.valueOf(this.j.getAccuracy()));
            a(concurrentHashMap, "loader_user_receive_gears_report_time", String.valueOf(this.k));
            a(concurrentHashMap, "loader_user_receive_gears_location_get_time", String.valueOf(this.j.getTime()));
            a(concurrentHashMap, "loader_user_receive_gears_provider", this.j.getProvider());
            Bundle extras4 = this.j.getExtras();
            if (extras4 != null) {
                a(concurrentHashMap, "loader_user_receive_gears_from", extras4.getString("from"));
            }
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36d16a1943160ed606e6a739e403697a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36d16a1943160ed606e6a739e403697a");
            return;
        }
        this.a = 0L;
        this.d = null;
        this.e = 0L;
        this.f = null;
        this.g = 0L;
        this.h = null;
        this.i = 0L;
        this.j = null;
        this.k = 0L;
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2980192365221b21123ebe36d5aa69cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2980192365221b21123ebe36d5aa69cf");
        } else if (com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).a()) {
            if (com.meituan.android.common.locate.provider.g.a() == null) {
                str = " LogDataWrapper::ContextProvider::context is null";
            } else if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
                b();
                return;
            } else {
                try {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(32);
                    a(concurrentHashMap);
                    if (concurrentHashMap.size() == 0) {
                        return;
                    }
                    com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                    b();
                    return;
                } catch (Exception e) {
                    str = "LogDataWrapper::exception" + e.getMessage();
                }
            }
            c.a(str, 3);
        }
    }
}
