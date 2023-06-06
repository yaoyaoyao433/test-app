package com.meituan.msc.modules.router;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static volatile Map<String, String> b = Collections.singletonMap("86464ace2bce4d6c", "73a62054aadc4526");

    public static boolean a() {
        return b != null;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "865ac0f46066ad4d740636a59ebc8527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "865ac0f46066ad4d740636a59ebc8527");
            return;
        }
        Map<String, String> b2 = b(str);
        if (b2 == null) {
            return;
        }
        b = b2;
    }

    private static Map<String, String> b(String str) {
        HashMap hashMap;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4778cc628e408bba8e5dbc7cfdeb06fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4778cc628e408bba8e5dbc7cfdeb06fa");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() > 0) {
                hashMap = new HashMap();
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("appId");
                            if (!TextUtils.isEmpty(optString)) {
                                hashMap.put(next, optString);
                            }
                        }
                    }
                    return hashMap;
                } catch (JSONException e) {
                    e = e;
                    com.meituan.msc.modules.reporter.g.a("MSCMPRouterManager processConfig error", e);
                    return hashMap;
                }
            }
            return null;
        } catch (JSONException e2) {
            e = e2;
            hashMap = null;
        }
    }

    public static boolean a(Context context, Uri uri, Intent intent, boolean z) {
        Object[] objArr = {context, uri, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90f009c100dc2a3fd9ad851cb810a7cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90f009c100dc2a3fd9ad851cb810a7cc")).booleanValue();
        }
        String str = b.get(uri.getQueryParameter("appId"));
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        intent.setPackage(context.getPackageName());
        if (d.a() != null) {
            intent.setData(d.a().buildUpon().encodedQuery(uri.getEncodedQuery()).appendQueryParameter("appId", str).appendQueryParameter("routeFromMMP", "true").build());
        } else {
            intent.setData(uri.buildUpon().path(ContainerInfo.ENV_MSC).appendQueryParameter("appId", str).appendQueryParameter("routeFromMMP", "true").build());
        }
        intent.putExtra("appId", str);
        if (!g.a(context, intent, z)) {
            intent.setComponent(new ComponentName(context, MSCActivity.class));
        }
        return true;
    }
}
