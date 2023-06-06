package com.sankuai.waimai.store.config;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SCRouterService implements com.sankuai.waimai.router.core.i {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum SCRouterMonitor implements IMonitor {
        RouterException;
        
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final boolean a() {
            return false;
        }

        @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
        public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
            return null;
        }

        SCRouterMonitor() {
            Object[] objArr = {r10, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f705cdb5b60433a8edc989cd594fc3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f705cdb5b60433a8edc989cd594fc3");
            }
        }

        public static SCRouterMonitor valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb05e4b5b7225762d4fd119da5ac107a", RobustBitConfig.DEFAULT_VALUE) ? (SCRouterMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb05e4b5b7225762d4fd119da5ac107a") : (SCRouterMonitor) Enum.valueOf(SCRouterMonitor.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SCRouterMonitor[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b4205de70cb9c3a6e7ad18a75e9b699", RobustBitConfig.DEFAULT_VALUE) ? (SCRouterMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b4205de70cb9c3a6e7ad18a75e9b699") : (SCRouterMonitor[]) values().clone();
        }
    }

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8536a97b9944833f9ea0664bd50640e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8536a97b9944833f9ea0664bd50640e9");
            return;
        }
        a(jVar);
        gVar.a();
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56ad0a290b45df6b3fcc5c2b2ecc50d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56ad0a290b45df6b3fcc5c2b2ecc50d1")).booleanValue() : (n.a().toLowerCase().contains(Build.MODEL.toLowerCase()) || com.sankuai.waimai.store.base.abtest.a.a().b()) ? false : true;
    }

    private static String a(String str) {
        String str2;
        String sb;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e60dedeae668d836736e7bd00a2a6d46", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e60dedeae668d836736e7bd00a2a6d46");
        }
        if (t.a(str)) {
            return str;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1431f2aa999605becedeb643d14fa7b8", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1431f2aa999605becedeb643d14fa7b8");
        } else if (k.d()) {
            str2 = com.sankuai.waimai.store.msc.a.a("/pages/detail/index");
            if (t.a(str2)) {
                str2 = "imeituan://www.meituan.com/msc?appId=7122f6e193de47c1&pushStyle=0&targetPath=%2Fpages%2Fdetail%2Findex%3FisSg%3D1";
            }
        } else if (k.c()) {
            str2 = "meituanwaimai://waimai.meituan.com/msc?appId=7122f6e193de47c1&pushStyle=0&targetPath=%2Fpages%2Fdetail%2Findex%3FisSg%3D1";
        } else {
            str2 = k.e() ? "dianping://msc?appId=7122f6e193de47c1&pushStyle=0&targetPath=%2Fpages%2Fdetail%2Findex%3FisSg%3D1" : "";
        }
        if (t.a(str2)) {
            return str2;
        }
        Uri parse = Uri.parse(str);
        String encodedQuery = parse != null ? parse.getEncodedQuery() : "";
        Object[] objArr3 = {encodedQuery};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5820b12fd636d294dae9a3ee39a98e8e", RobustBitConfig.DEFAULT_VALUE)) {
            sb = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5820b12fd636d294dae9a3ee39a98e8e");
        } else {
            StringBuilder sb2 = new StringBuilder(encodedQuery);
            HashMap hashMap = new HashMap();
            Map<String, String> b = com.sankuai.waimai.router.set_id.b.a().b();
            if (b != null) {
                String str3 = b.get("region_id");
                String str4 = b.get("region_version");
                if (str3 != null) {
                    hashMap.put("region_id", str3);
                }
                if (str4 != null) {
                    hashMap.put("region_version", str4);
                }
            }
            WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
            String str5 = "0";
            String str6 = "0";
            if (i != null) {
                double latitude = i.getLatitude();
                double longitude = i.getLongitude();
                str5 = String.valueOf((long) (latitude * 1000000.0d));
                str6 = String.valueOf((long) (longitude * 1000000.0d));
            }
            hashMap.put("wm_actual_latitude", str5);
            hashMap.put("wm_actual_longitude", str6);
            WMLocation a2 = com.sankuai.waimai.store.locate.a.a();
            String str7 = "0";
            String str8 = "0";
            if (a2 != null) {
                str7 = String.valueOf((long) (a2.getLatitude() * 1000000.0d));
                str8 = String.valueOf((long) (a2.getLongitude() * 1000000.0d));
            }
            hashMap.put("wm_latitude", str7);
            hashMap.put("wm_longitude", str8);
            if (hashMap.size() > 0) {
                for (String str9 : hashMap.keySet()) {
                    sb2.append("&");
                    sb2.append(str9);
                    sb2.append("=");
                    sb2.append((String) hashMap.get(str9));
                }
            }
            sb = sb2.toString();
        }
        if (!TextUtils.isEmpty(sb)) {
            Uri parse2 = Uri.parse(str2);
            String path = parse2.getPath();
            try {
                if ("/mmp".equals(path) || "/msc".equals(path) || str2.startsWith("dianping://msc")) {
                    String queryParameter = parse2.getQueryParameter("targetPath");
                    if (queryParameter != null) {
                        if (queryParameter.endsWith(CommonConstant.Symbol.QUESTION_MARK)) {
                            if (sb.startsWith("&")) {
                                sb = sb.substring(1);
                            }
                            return str2 + URLEncoder.encode(sb, "UTF-8");
                        } else if (queryParameter.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                            if (!sb.startsWith("&")) {
                                sb = "&" + sb;
                            }
                            return str2 + URLEncoder.encode(sb, "UTF-8");
                        } else {
                            if (!sb.startsWith(CommonConstant.Symbol.QUESTION_MARK)) {
                                sb = CommonConstant.Symbol.QUESTION_MARK + sb;
                            }
                            return str2 + URLEncoder.encode(sb, "UTF-8");
                        }
                    }
                } else if (str2.indexOf(CommonConstant.Symbol.QUESTION_MARK, str2.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                    return str2 + "&" + URLEncoder.encode(sb, "UTF-8");
                } else {
                    str2 = str2 + CommonConstant.Symbol.QUESTION_MARK + sb;
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return str2;
    }

    private static boolean a(com.sankuai.waimai.router.core.j jVar) {
        HashMap<String, Object> hashMap;
        boolean z;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcd5cb5cb46070be4ea1853fa102555d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcd5cb5cb46070be4ea1853fa102555d")).booleanValue();
        }
        try {
            if (jVar.d != null && jVar.d.getPath() != null) {
                String path = jVar.d.getPath();
                if (path.endsWith("/sc_goods_detail") || path.endsWith("/supermarket/detail")) {
                    jVar.a("com.sankuai.waimai.router.common.try_start_uri", (String) Boolean.TRUE);
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e5d7dcac34315f584950f41a1fd87e84", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e5d7dcac34315f584950f41a1fd87e84")).booleanValue();
                    }
                    if (a() && (hashMap = jVar.e) != null) {
                        if ("9".equals(jVar.d.getQueryParameter("buztype"))) {
                            z = false;
                        } else {
                            Object obj = hashMap.get("com.sankuai.waimai.router.activity.intent_extra");
                            z = obj instanceof Bundle ? ((Bundle) obj).getBoolean("isStore", true) : true;
                        }
                        if (z) {
                            String uri = jVar.d.toString();
                            String a2 = a(uri);
                            if (!t.a(a2) && !TextUtils.equals(uri, a2)) {
                                jVar.a(Uri.parse(a2));
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            com.sankuai.waimai.store.util.monitor.c.a(SCRouterMonitor.RouterException, "uriRequest=" + jVar.toString() + " msg=" + e.getMessage(), "redirectFail");
        }
        return false;
    }
}
