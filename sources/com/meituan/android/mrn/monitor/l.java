package com.meituan.android.mrn.monitor;

import android.os.Build;
import com.facebook.react.bridge.ReactContext;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public void a(String str, long j, Map<String, String> map) {
        Object[] objArr = {str, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a032368b4d2d3c4368ebfeeb50709347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a032368b4d2d3c4368ebfeeb50709347");
        } else {
            a(map).a(str, Collections.singletonList(Float.valueOf((float) j))).a();
        }
    }

    private com.dianping.monitor.impl.m a(Map<String, String> map) {
        int f;
        String str;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26cc0e663436161188a3a2519b65008f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.monitor.impl.m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26cc0e663436161188a3a2519b65008f");
        }
        String n = com.meituan.android.mrn.config.c.a() != null ? com.meituan.android.mrn.config.c.a().n() : "";
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.utils.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "23f76a678427e9ebd7c0dfe1bdd0b9a9", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "23f76a678427e9ebd7c0dfe1bdd0b9a9")).intValue();
        } else {
            f = com.meituan.android.mrn.config.c.a() != null ? com.meituan.android.mrn.config.c.a().f() : -1;
        }
        com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(f, com.meituan.android.mrn.common.a.a(), n);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                mVar.a(entry.getKey(), entry.getValue());
            }
        }
        Object[] objArr3 = {mVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ac7140a2e87fe4321dedf433aea8cf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ac7140a2e87fe4321dedf433aea8cf7");
        } else {
            mVar.a("biz_name", com.meituan.android.mrn.utils.d.d());
            mVar.a("bundle_name", com.meituan.android.mrn.utils.d.c());
            mVar.a("component_name", com.meituan.android.mrn.utils.d.b());
            mVar.a("bundle_version", com.meituan.android.mrn.utils.d.a());
            mVar.a("platform", "android");
            mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.meituan.android.mrn.utils.d.f());
            mVar.a("system_version", Build.VERSION.RELEASE);
            mVar.a("model", Build.MODEL);
            mVar.a("cityName", com.meituan.android.mrn.utils.d.g());
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.utils.d.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "61c55aa12900100eb3245df15e98fc45", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "61c55aa12900100eb3245df15e98fc45");
            } else {
                ReactContext e = com.meituan.android.mrn.utils.d.e();
                if (e == null) {
                    str = "";
                } else {
                    str = (e.getApplicationInfo().flags & 2) != 0 ? "debug" : "release";
                }
            }
            mVar.a("buildType", str);
            mVar.a("mrn_version", "3.1201.206");
            mVar.a("env", com.meituan.android.mrn.debug.a.d());
            mVar.a(NetLogConstants.Tags.NETWORK_TYPE, com.meituan.android.mrn.config.c.a().b());
        }
        return mVar;
    }
}
