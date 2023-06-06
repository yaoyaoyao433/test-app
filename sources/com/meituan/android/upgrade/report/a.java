package com.meituan.android.upgrade.report;

import com.huawei.hms.adapter.internal.CommonCode;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.upgrade.e;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50cf4315d7b09f67c3af1d1ed23ecf00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50cf4315d7b09f67c3af1d1ed23ecf00");
            return;
        }
        try {
            Horn.debug(e.a().b, "babel-config", true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54b2e50ccb25678e04fccf52b815333f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54b2e50ccb25678e04fccf52b815333f");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac786913b8e43c0ff37c33a3b3c1f492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac786913b8e43c0ff37c33a3b3c1f492");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        a().a("DDUpdateInstall", 1L, hashMap);
    }

    public final void a(String str, Long l, Map<String, Object> map) {
        Object[] objArr = {str, l, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b202d9d60c1b0560e2686fcc675046fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b202d9d60c1b0560e2686fcc675046fd");
            return;
        }
        try {
            Log.Builder builder = new Log.Builder("");
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            a(hashMap);
            builder.reportChannel("prism-report-ddd").tag(str).value(l.longValue()).optional(hashMap);
            Babel.logRT(builder.build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private Map a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1111da2d18a27900d6e3eb928dfb6cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1111da2d18a27900d6e3eb928dfb6cc");
        }
        map.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, Long.valueOf(e.a().e));
        map.put("sdk_version", "2.1.18");
        map.put(NetLogConstants.Tags.NETWORK_TYPE, Integer.valueOf(NetWorkUtils.getConnectionType(e.a().b)));
        map.put("env", e.a().f ? "debug" : "release");
        VersionInfo versionInfo = e.a().d;
        if (versionInfo != null) {
            map.put(CommonCode.MapKey.UPDATE_VERSION, Integer.valueOf(versionInfo.currentVersion));
            map.put("publishId", Long.valueOf(versionInfo.publishId));
            map.put("publishType", Integer.valueOf(versionInfo.publishType));
            map.put("net_limit", Integer.valueOf(versionInfo.netLimit));
            map.put("isManual", Integer.valueOf(versionInfo.isManual ? 1 : 0));
        }
        return map;
    }
}
