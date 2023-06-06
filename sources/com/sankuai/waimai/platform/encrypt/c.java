package com.sankuai.waimai.platform.encrypt;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.tte.x;
import com.sankuai.meituan.tte.y;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.k;
import com.squareup.okhttp.x;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static String b = "dj_risk_token";
    private static String c = "dj-token";
    private final x d;

    public c() {
        x.d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f61289b6cab8552b93cdefcfe6f941e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f61289b6cab8552b93cdefcfe6f941e");
            return;
        }
        x.d dVar2 = x.d.PROD;
        if ("meituaninternaltest".equals(com.meituan.android.base.a.f) || com.sankuai.waimai.foundation.core.a.b()) {
            try {
                if (com.sankuai.waimai.platform.capacity.persistent.sp.a.c(com.meituan.android.singleton.b.a, "wm-tte-encrypt-env", true)) {
                    System.out.println("TTE ENV:线上");
                    dVar = x.d.PROD;
                } else {
                    System.out.println("TTE ENV:线下");
                    dVar = x.d.TEST;
                }
            } catch (Throwable unused) {
            }
            Context applicationContext = com.meituan.android.singleton.b.a.getApplicationContext();
            x.b.a b2 = x.b.b();
            b2.b = dVar;
            b2.c = x.a.FIPS;
            b2.d = "waimai";
            this.d = x.a(applicationContext, b2.a());
        }
        dVar = dVar2;
        Context applicationContext2 = com.meituan.android.singleton.b.a.getApplicationContext();
        x.b.a b22 = x.b.b();
        b22.b = dVar;
        b22.c = x.a.FIPS;
        b22.d = "waimai";
        this.d = x.a(applicationContext2, b22.a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f733d5b957f5d9f1e13cdf6726ffdab", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f733d5b957f5d9f1e13cdf6726ffdab") : a.a;
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a928e4543285042b33ed2a0684a6342", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a928e4543285042b33ed2a0684a6342");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes();
        try {
            x xVar = this.d;
            Object[] objArr2 = {bytes};
            ChangeQuickRedirect changeQuickRedirect2 = x.a;
            String a2 = PatchProxy.isSupport(objArr2, xVar, changeQuickRedirect2, false, "c4a8d3b826c8cd2ef071f55cfbe75362", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, xVar, changeQuickRedirect2, false, "c4a8d3b826c8cd2ef071f55cfbe75362") : y.a(xVar.d.a(bytes));
            RaptorReport.a(11001, elapsedRealtime);
            return a2;
        } catch (com.sankuai.meituan.tte.c e) {
            RaptorReport.a(XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME, elapsedRealtime);
            com.dianping.networklog.c.a("TTE originValue:" + str + " encrypt failed " + e.getMessage() + StringUtil.SPACE + e.b, 3);
            return "";
        }
    }

    private String a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d44a6c91bbfd9f926c158fb795212b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d44a6c91bbfd9f926c158fb795212b");
        }
        Map<String, Object> map = null;
        String str = "";
        if (com.sankuai.waimai.platform.encrypt.a.a().a(uri)) {
            map = b();
            str = k.a().toJson(map);
        }
        String queryParameter = uri.getQueryParameter(b);
        if (!TextUtils.isEmpty(queryParameter)) {
            str = queryParameter;
        }
        if (!TextUtils.isEmpty(queryParameter) && map != null && map.size() > 0) {
            map.putAll((Map) k.a().fromJson(queryParameter, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.platform.encrypt.c.1
            }.getType()));
            str = k.a().toJson(map);
        }
        return a(str);
    }

    public final void a(Request.Builder builder, Uri uri, Uri.Builder builder2) {
        Object[] objArr = {builder, uri, builder2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae4ca115bf1d90a3c28d985d7b4033dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae4ca115bf1d90a3c28d985d7b4033dd");
        } else if (builder == null || uri == null) {
        } else {
            try {
                String a2 = a(uri);
                if (!TextUtils.isEmpty(a2)) {
                    builder.addHeaders(c, a2);
                } else {
                    a(uri, builder2);
                }
                a(builder2);
                builder.url(builder2.build().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void a(x.a aVar, Uri uri, Uri.Builder builder) {
        Object[] objArr = {aVar, uri, builder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d939aefb84d47eef9cfed46d1dc36b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d939aefb84d47eef9cfed46d1dc36b");
        } else if (aVar == null || uri == null) {
        } else {
            try {
                String a2 = a(uri);
                if (!TextUtils.isEmpty(a2)) {
                    aVar.b(c, a2);
                } else {
                    a(uri, builder);
                }
                a(builder);
                aVar.a(builder.build().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void a(aj.a aVar, Uri uri, Uri.Builder builder) {
        Object[] objArr = {aVar, uri, builder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dfda1c0e35e7348e71d9dd7426e30fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dfda1c0e35e7348e71d9dd7426e30fe");
        } else if (aVar != null && uri != null) {
            try {
                String queryParameter = uri.getQueryParameter(b);
                String a2 = a(queryParameter);
                if (!TextUtils.isEmpty(a2)) {
                    aVar.b(c, a2);
                } else if (!TextUtils.isEmpty(queryParameter)) {
                    Map map = (Map) k.a().fromJson(queryParameter, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.platform.encrypt.c.2
                    }.getType());
                    for (String str : map.keySet()) {
                        builder.appendQueryParameter(str, String.valueOf(map.get(str)));
                    }
                }
                a(builder);
                aVar.b(builder.build().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final Map<String, Object> b() {
        long j;
        long j2;
        long j3;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d78f6ecce6cee64260c1c79c9727da", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d78f6ecce6cee64260c1c79c9727da");
        }
        WMLocation p = g.a().p();
        long j4 = 0;
        if (p != null) {
            j = (long) (p.getLatitude() * 1000000.0d);
            j2 = (long) (p.getLongitude() * 1000000.0d);
        } else {
            j = 0;
            j2 = 0;
        }
        WMLocation i = g.a().i();
        if (i != null) {
            j4 = (long) (i.getLatitude() * 1000000.0d);
            j3 = (long) (i.getLongitude() * 1000000.0d);
        } else {
            j3 = 0;
        }
        return b.a().a("wm_latitude", j).a("wm_longitude", j2).a("wm_actual_latitude", j4).a("wm_actual_longitude", j3).b;
    }

    private void a(Uri uri, Uri.Builder builder) {
        Object[] objArr = {uri, builder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3055fcace3f1438d55f9b7b8bc009338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3055fcace3f1438d55f9b7b8bc009338");
        } else if (builder != null && com.sankuai.waimai.platform.encrypt.a.a().a(uri)) {
            Map<String, Object> b2 = b();
            for (String str : b2.keySet()) {
                builder.appendQueryParameter(str, String.valueOf(b2.get(str)));
            }
        }
    }

    private void a(Uri.Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff010f0417f32636c0cb3b0562e5c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff010f0417f32636c0cb3b0562e5c68");
        } else if (builder != null) {
            Uri build = builder.build();
            Set<String> queryParameterNames = build.getQueryParameterNames();
            builder.clearQuery();
            if (queryParameterNames == null || queryParameterNames.size() <= 0) {
                return;
            }
            for (String str : queryParameterNames) {
                if (!b.equals(str)) {
                    builder.appendQueryParameter(str, build.getQueryParameter(str));
                }
            }
        }
    }
}
