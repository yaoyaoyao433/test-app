package com.alipay.sdk.packet;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.net.a;
import com.alipay.sdk.util.k;
import com.alipay.sdk.util.l;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class e {
    public boolean a = true;
    public boolean b = true;

    public Map<String, String> a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("msp-gzip", String.valueOf(z));
        hashMap.put("Operation-Type", "alipay.msp.cashier.dispatch.bytes");
        hashMap.put("content-type", "application/octet-stream");
        hashMap.put("Version", "2.0");
        hashMap.put("AppId", "TAOBAO");
        hashMap.put("Msp-Param", a.a(str));
        hashMap.put("des-mode", "CBC");
        return hashMap;
    }

    public abstract JSONObject a() throws JSONException;

    public String b() {
        return "4.9.0";
    }

    public String c() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put("device", Build.MODEL);
        hashMap.put("namespace", "com.alipay.mobilecashier");
        hashMap.put("api_name", "com.alipay.mcpay");
        hashMap.put(KnbConstants.PARAMS_API_VERSION, b());
        return a(hashMap, new HashMap());
    }

    public static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public String a(com.alipay.sdk.sys.a aVar, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str2;
        String str3;
        com.alipay.sdk.sys.a aVar2 = aVar;
        com.alipay.sdk.sys.b a = com.alipay.sdk.sys.b.a();
        com.alipay.sdk.tid.a a2 = com.alipay.sdk.tid.a.a(a.b);
        JSONObject a3 = com.alipay.sdk.util.c.a(new JSONObject(), jSONObject);
        try {
            a3.put("external_info", str);
            a3.put("tid", a2.c);
            com.alipay.sdk.data.b a4 = com.alipay.sdk.data.b.a();
            Context context = com.alipay.sdk.sys.b.a().b;
            com.alipay.sdk.util.b a5 = com.alipay.sdk.util.b.a(context);
            if (TextUtils.isEmpty(a4.b)) {
                String b = l.b();
                String c = l.c();
                String d = l.d(context);
                String f = l.f(context);
                String e = l.e(context);
                String f2 = Float.toString(new TextView(context).getTextSize());
                a4.b = "Msp/15.8.02 (" + b + ";" + c + ";" + d + ";" + f + ";" + e + ";" + f2;
            }
            String str4 = com.alipay.sdk.util.b.b(context).s;
            String g = l.g(context);
            Context context2 = com.alipay.sdk.sys.b.a().b;
            SharedPreferences sharedPreferences = context2.getSharedPreferences("virtualImeiAndImsi", 0);
            String string = sharedPreferences.getString("virtual_imsi", null);
            if (TextUtils.isEmpty(string)) {
                if (TextUtils.isEmpty(com.alipay.sdk.tid.a.a(context2).c)) {
                    String c2 = com.alipay.sdk.sys.b.a().c();
                    if (!TextUtils.isEmpty(c2) && c2.length() >= 18) {
                        str3 = c2.substring(3, 18);
                    } else {
                        str3 = com.alipay.sdk.data.b.b();
                    }
                } else {
                    com.alipay.sdk.util.b.a(context2);
                    str3 = AppUtil.DEFAULT_IMEI;
                }
                string = str3;
                sharedPreferences.edit().putString("virtual_imsi", string).apply();
            }
            Context context3 = com.alipay.sdk.sys.b.a().b;
            SharedPreferences sharedPreferences2 = context3.getSharedPreferences("virtualImeiAndImsi", 0);
            try {
                String string2 = sharedPreferences2.getString("virtual_imei", null);
                if (TextUtils.isEmpty(string2)) {
                    if (TextUtils.isEmpty(com.alipay.sdk.tid.a.a(context3).c)) {
                        str2 = com.alipay.sdk.data.b.b();
                    } else {
                        com.alipay.sdk.util.b.a(context3);
                        str2 = AppUtil.DEFAULT_IMEI;
                    }
                    string2 = str2;
                    sharedPreferences2.edit().putString("virtual_imei", string2).apply();
                }
                if (a2 != null) {
                    a4.d = a2.d;
                }
                String replace = Build.MANUFACTURER.replace(";", StringUtil.SPACE);
                String replace2 = Build.MODEL.replace(";", StringUtil.SPACE);
                boolean b2 = com.alipay.sdk.sys.b.b();
                String str5 = a5.b;
                try {
                    WifiInfo c3 = com.meituan.android.privacy.aop.e.c((WifiManager) context.getApplicationContext().getSystemService("wifi"));
                    String ssid = c3 != null ? c3.getSSID() : "-1";
                    WifiInfo c4 = com.meituan.android.privacy.aop.e.c((WifiManager) context.getApplicationContext().getSystemService("wifi"));
                    String bssid = c4 != null ? c4.getBSSID() : "00";
                    StringBuilder sb = new StringBuilder();
                    sb.append(a4.b);
                    sb.append(";");
                    sb.append(str4);
                    sb.append(";");
                    sb.append(g);
                    sb.append(";");
                    sb.append("1");
                    sb.append(";");
                    sb.append(AppUtil.DEFAULT_IMEI);
                    sb.append(";");
                    sb.append(AppUtil.DEFAULT_IMEI);
                    sb.append(";");
                    sb.append(a4.d);
                    sb.append(";");
                    sb.append(replace);
                    sb.append(";");
                    sb.append(replace2);
                    sb.append(";");
                    sb.append(b2);
                    sb.append(";");
                    sb.append(str5);
                    sb.append(";-1;-1");
                    sb.append(";");
                    sb.append(a4.c);
                    sb.append(";");
                    sb.append(string);
                    sb.append(";");
                    sb.append(string2);
                    sb.append(";");
                    sb.append(ssid);
                    sb.append(";");
                    sb.append(bssid);
                    if (a2 != null) {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put("tid", com.alipay.sdk.tid.a.a(context).c);
                            hashMap.put("utdid", com.alipay.sdk.sys.b.a().c());
                            aVar2 = aVar;
                            String b3 = com.alipay.sdk.data.b.b(aVar2, context, hashMap);
                            if (!TextUtils.isEmpty(b3)) {
                                sb.append(";;;");
                                sb.append(b3);
                            }
                        } catch (Throwable th) {
                            th = th;
                            aVar2 = aVar;
                            jSONObject2 = a3;
                            com.alipay.sdk.app.statistic.a.a(aVar2, "biz", "BodyErr", th);
                            com.alipay.sdk.util.d.a(th);
                            return jSONObject2.toString();
                        }
                    } else {
                        aVar2 = aVar;
                    }
                    sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
                    jSONObject2 = a3;
                    try {
                        jSONObject2.put("user_agent", sb.toString());
                        jSONObject2.put("has_alipay", l.b(aVar2, a.b, com.alipay.sdk.app.c.d));
                        jSONObject2.put("has_msp_app", l.a(a.b));
                        jSONObject2.put(KnbConstants.PARAMS_APP_KEY, "2014052600006128");
                        jSONObject2.put("utdid", a.c());
                        jSONObject2.put("new_client_key", a2.d);
                        jSONObject2.put("pa", com.alipay.sdk.data.b.a(a.b));
                    } catch (Throwable th2) {
                        th = th2;
                        com.alipay.sdk.app.statistic.a.a(aVar2, "biz", "BodyErr", th);
                        com.alipay.sdk.util.d.a(th);
                        return jSONObject2.toString();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jSONObject2 = a3;
                    aVar2 = aVar;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            jSONObject2 = a3;
        }
        return jSONObject2.toString();
    }

    public static String a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
            jSONObject3.put(entry2.getKey(), entry2.getValue());
        }
        jSONObject2.put("params", jSONObject3);
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (jSONObject.has("params")) {
                String optString = jSONObject.getJSONObject("params").optString("public_key", null);
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                com.alipay.sdk.data.b.a(optString);
                return true;
            }
            return false;
        } catch (JSONException e) {
            com.alipay.sdk.util.d.a(e);
            return false;
        }
    }

    public b a(com.alipay.sdk.sys.a aVar, Context context, String str) throws Throwable {
        return a(aVar, context, str, k.a(context), true);
    }

    public final b a(com.alipay.sdk.sys.a aVar, Context context, String str, String str2, boolean z) throws Throwable {
        com.alipay.sdk.util.d.a("mspl", "Packet: " + str2);
        c cVar = new c(this.b);
        b bVar = new b(c(), a(aVar, str, a()));
        Map<String, String> a = a(false, str);
        d a2 = cVar.a(bVar, this.a, a.get("iSr"));
        a.b a3 = com.alipay.sdk.net.a.a(context, new a.C0028a(str2, a(a2.a, str), a2.b));
        if (a3 != null) {
            b a4 = cVar.a(new d(a(a3), a3.c), a.get("iSr"));
            return (a4 != null && a(a4.a) && z) ? a(aVar, context, str, str2, false) : a4;
        }
        throw new RuntimeException("Response is null.");
    }

    public static boolean a(a.b bVar) {
        Map<String, List<String>> map;
        List<String> list;
        return Boolean.valueOf((bVar == null || (map = bVar.a) == null || (list = map.get("msp-gzip")) == null) ? null : TextUtils.join(CommonConstant.Symbol.COMMA, list)).booleanValue();
    }
}
