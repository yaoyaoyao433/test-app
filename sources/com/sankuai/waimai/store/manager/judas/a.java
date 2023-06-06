package com.sankuai.waimai.store.manager.judas;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.util.SGLocationUtils;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Map<String, Object> map) {
        String str;
        boolean z = true;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ac2edf1dbecc1f7da1ff2761aedb656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ac2edf1dbecc1f7da1ff2761aedb656");
        } else if (map == null) {
        } else {
            WMLocation p = g.a().p();
            String str2 = "0";
            if (p == null) {
                str2 = "#";
                p = g.a().a((WMLocation) null);
            } else {
                z = false;
            }
            if (p != null) {
                double latitude = p.getLatitude();
                double longitude = p.getLongitude();
                SGLocationUtils.TransformData a2 = SGLocationUtils.a(longitude, latitude);
                if (a2 != null) {
                    map.put("wi", a2.wi);
                    map.put("wf", a2.wf);
                    map.put("ji", a2.ji);
                    map.put("jf", a2.jf);
                    if (a(a2.wi) || a(a2.wf) || a(a2.ji) || a(a2.jf)) {
                        str = z ? "D" : "4";
                    }
                    str = str2;
                } else if (latitude <= 0.0d || longitude <= 0.0d) {
                    str = z ? "C" : "3";
                } else {
                    str2 = z ? ErrorCode.ERROR_TYPE_B : "2";
                    str = str2;
                }
            } else {
                str = z ? "A" : "1";
            }
            map.put("lx_location_info_monitor_status", str);
            HashMap hashMap = new HashMap();
            hashMap.put("lx_location_status", str);
            if ("0".endsWith(str) || "#".equals(str)) {
                com.sankuai.waimai.store.util.monitor.c.b(a(), null, null, hashMap);
            } else {
                com.sankuai.waimai.store.util.monitor.c.a(a(), null, null, hashMap);
            }
        }
    }

    private static IMonitor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb99b8c9931907fddb85adfe936b0560", RobustBitConfig.DEFAULT_VALUE) ? (IMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb99b8c9931907fddb85adfe936b0560") : new IMonitor() { // from class: com.sankuai.waimai.store.manager.judas.JudasUtil$1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public final boolean a() {
                return false;
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public final String name() {
                return "";
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55b30ad343801718b95269557adf84b5", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.util.monitor.monitor.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55b30ad343801718b95269557adf84b5") : new com.sankuai.waimai.store.util.monitor.monitor.c() { // from class: com.sankuai.waimai.store.manager.judas.JudasUtil$1.1
                    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
                    public final String a() {
                        return "DrugAndSGLXLocationInfoReport";
                    }
                };
            }
        };
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92191be4512ec3667940b5f58b06d3ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92191be4512ec3667940b5f58b06d3ee")).booleanValue() : TextUtils.isEmpty(str) || TextUtils.equals("0", str);
    }

    public static void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b7c8409be95eae197508768f3b13297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b7c8409be95eae197508768f3b13297");
        } else if (map == null) {
        } else {
            if (map.containsKey(Constants.PRIVACY.KEY_LATITUDE)) {
                map.remove(Constants.PRIVACY.KEY_LATITUDE);
            }
            if (map.containsKey(Constants.PRIVACY.KEY_LONGITUDE)) {
                map.remove(Constants.PRIVACY.KEY_LONGITUDE);
            }
        }
    }
}
