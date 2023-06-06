package com.sankuai.waimai.launcher.util.image;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements t {
    public static ChangeQuickRedirect a;
    @Nullable
    private final ThreadLocal<Map<String, String>> b;

    public d(@Nullable ThreadLocal<Map<String, String>> threadLocal) {
        Object[] objArr = {threadLocal};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a64efb5807894804831085513f619b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a64efb5807894804831085513f619b");
        } else {
            this.b = threadLocal;
        }
    }

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        z a2;
        String a3;
        int currentTimeMillis;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff5816c0a767ab303baa8b44cc35d97a", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff5816c0a767ab303baa8b44cc35d97a");
        }
        com.sankuai.waimai.platform.net.a aVar2 = com.sankuai.waimai.platform.net.d.a().e;
        x a4 = aVar.a();
        String url = a4.a().toString();
        com.sankuai.waimai.foundation.utils.log.a.c("ImageMonitor", "loading image url = %s", url);
        if (!c.a(a4.b().getHost())) {
            return aVar.a(a4);
        }
        JSONObject jSONObject = new JSONObject();
        long currentTimeMillis2 = System.currentTimeMillis();
        int contentLength = (int) ((a4.d == null ? 0L : a4.d.contentLength()) + com.sankuai.waimai.platform.net.util.c.a(a4.c) + url.getBytes().length);
        try {
            a2 = aVar.a(a4);
            a3 = com.sankuai.waimai.platform.net.interceptor.okhttp.f.a().a(a4.a().getHost());
            a(jSONObject);
            currentTimeMillis = (int) (System.currentTimeMillis() - currentTimeMillis2);
        } catch (IOException e) {
            e = e;
        }
        try {
            if (a2 == null) {
                com.sankuai.waimai.platform.net.interceptor.okhttp.b.a();
                a(url, -598, contentLength, 0, currentTimeMillis, a3, jSONObject);
                g.a(false, url, 0, aVar2);
                return null;
            }
            int i = a2.c;
            aa aaVar = a2.g;
            a(url, ((aaVar == null || aaVar.b() == 0) && 2 == i / 100) ? -999 : i, contentLength, (aaVar != null ? (int) aaVar.b() : 0) + com.sankuai.waimai.platform.net.util.c.a(a2.f), currentTimeMillis, a3, jSONObject);
            g.a(a2.c == 200, url, currentTimeMillis, aVar2);
            return a2;
        } catch (IOException e2) {
            e = e2;
            int a5 = com.sankuai.waimai.platform.net.interceptor.okhttp.b.a(e);
            int i2 = !p.f(com.meituan.android.singleton.b.a) ? -199 : (a5 == -513 || a5 == -597 || a5 == -596) ? 10000 : 10000;
            String a6 = com.sankuai.waimai.platform.net.interceptor.okhttp.f.a().a(a4.a().getHost());
            b(jSONObject);
            a(jSONObject);
            a(url, i2, contentLength, 0, (int) (System.currentTimeMillis() - currentTimeMillis2), a6, jSONObject);
            g.a(false, url, 0, aVar2);
            throw e;
        }
    }

    private void a(JSONObject jSONObject) {
        Map<String, String> map;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74a76ec3714b442383fd4aa617f348d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74a76ec3714b442383fd4aa617f348d");
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            try {
                map = this.b.get();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (map == null) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (map.containsKey("source")) {
                jSONObject2.put("source", map.get("source"));
            }
            if (map.containsKey("httpDnsTime")) {
                jSONObject2.put("httpDnsTime", map.get("httpDnsTime"));
            }
            if (map.containsKey(NetLogConstants.Details.IP_LIST)) {
                jSONObject2.put(NetLogConstants.Details.IP_LIST, map.get(NetLogConstants.Details.IP_LIST));
            }
            if (jSONObject2.length() != 0) {
                jSONObject.put("httpDns", jSONObject2);
            }
        } finally {
            this.b.remove();
        }
    }

    private void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9549c429a0a2d05d18eee5cf303719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9549c429a0a2d05d18eee5cf303719");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
            if (b != null) {
                sb.append(b.getClass().getName());
                Intent intent = b.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data != null) {
                        String uri = data.toString();
                        if (!TextUtils.isEmpty(uri)) {
                            sb.append("{data=");
                            sb.append(uri);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        for (String str : extras.keySet()) {
                            sb2.append(str);
                            sb2.append(CommonConstant.Symbol.COLON);
                            sb2.append(extras.get(str));
                            sb2.append(CommonConstant.Symbol.COMMA);
                        }
                    }
                    String sb3 = sb2.toString();
                    if (!TextUtils.isEmpty(sb3)) {
                        sb.append("(extras=");
                        sb.append(sb3);
                        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                }
                jSONObject.put("pageInfo", sb.toString());
            }
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.b(th);
        }
    }

    private void a(String str, int i, int i2, int i3, int i4, String str2, @NonNull JSONObject jSONObject) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c3def6ed225801af2ccfbeadf68117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c3def6ed225801af2ccfbeadf68117");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(str, i, i2, i3, i4, str2, jSONObject.length() == 0 ? null : jSONObject.toString());
        }
    }
}
