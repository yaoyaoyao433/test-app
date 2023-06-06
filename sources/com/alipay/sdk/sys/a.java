package com.alipay.sdk.sys;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.util.d;
import com.alipay.sdk.util.l;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public String a;
    public String b;
    public Context c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;
    public final ActivityInfo h;
    public final com.alipay.sdk.app.statistic.b i;

    public a(Context context, String str, String str2) {
        String str3;
        this.a = "";
        this.b = "";
        this.c = null;
        boolean isEmpty = TextUtils.isEmpty(str2);
        this.i = new com.alipay.sdk.app.statistic.b(context, isEmpty);
        this.d = c(str, this.b);
        this.e = SystemClock.elapsedRealtime();
        this.f = l.d();
        this.h = l.h(context);
        this.g = str2;
        if (!isEmpty) {
            com.alipay.sdk.app.statistic.a.b(this, "biz", "eptyp", str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.d);
            if (this.h != null) {
                str3 = this.h.name + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.h.launchMode;
            } else {
                str3 = StringUtil.NULL;
            }
            com.alipay.sdk.app.statistic.a.b(this, "biz", "actInfo", str3);
            com.alipay.sdk.app.statistic.a.b(this, "biz", "sys", l.a(this));
        }
        try {
            this.c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.a = packageInfo.versionName;
            this.b = packageInfo.packageName;
        } catch (Exception e) {
            d.a(e);
        }
        if (!isEmpty) {
            com.alipay.sdk.app.statistic.a.a(this, "biz", "u" + l.d());
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            com.alipay.sdk.app.statistic.a.b(this, "biz", "PgApiInvoke", sb.toString());
            com.alipay.sdk.app.statistic.a.a(context, this, str, this.d);
        }
        if (isEmpty || !com.alipay.sdk.data.a.a().r) {
            return;
        }
        com.alipay.sdk.data.a.a().a(this, this.c, true);
    }

    private static boolean b(String str) {
        return !str.contains("\"&");
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ap_link_token", this.d);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private String c(String str) {
        String str2;
        try {
            String a = a(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(a)) {
                str2 = str + "&" + b("bizcontext=", "");
            } else {
                int indexOf = str.indexOf(a);
                str2 = str.substring(0, indexOf) + a(a, "bizcontext=", "", true) + str.substring(indexOf + a.length());
            }
            return str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    private String d(String str) {
        String str2;
        try {
            String a = a(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(a)) {
                str2 = str + "&" + b("bizcontext=\"", CommonConstant.Symbol.DOUBLE_QUOTES);
            } else {
                if (!a.endsWith(CommonConstant.Symbol.DOUBLE_QUOTES)) {
                    a = a + CommonConstant.Symbol.DOUBLE_QUOTES;
                }
                int indexOf = str.indexOf(a);
                str2 = str.substring(0, indexOf) + a(a, "bizcontext=\"", CommonConstant.Symbol.DOUBLE_QUOTES, false) + str.substring(indexOf + a.length());
            }
            return str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        if (b(str)) {
            return c(str);
        }
        return d(str);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.alipay.sdk.sys.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0029a {
        public static final HashMap<UUID, a> a = new HashMap<>();
        public static final HashMap<String, a> b = new HashMap<>();

        public static void a(a aVar, Intent intent) {
            if (aVar != null) {
                UUID randomUUID = UUID.randomUUID();
                a.put(randomUUID, aVar);
                intent.putExtra("i_uuid_b_c", randomUUID);
            }
        }

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable c = f.c(intent, "i_uuid_b_c");
            if (c instanceof UUID) {
                return a.remove((UUID) c);
            }
            return null;
        }

        public static void a(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            b.put(str, aVar);
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return b.remove(str);
        }
    }

    private String b(String str, String str2) throws JSONException, UnsupportedEncodingException {
        String a = a("", "");
        return str + a + str2;
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                return split[i];
            }
        }
        return null;
    }

    private static String c(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Long.valueOf(System.currentTimeMillis());
            objArr[3] = UUID.randomUUID().toString();
            return String.format("EP%s%s_%s", "1", l.f(String.format(locale, "%s%s%d%s", objArr)), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return CommonConstant.Symbol.MINUS;
        }
    }

    public final String a(String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put("sv", "h.a.3.8.02");
            if (!this.b.contains("setting") || !l.b(this.c)) {
                jSONObject.put("an", this.b);
            }
            jSONObject.put("av", this.a);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            jSONObject.put("extInfo", a());
            if (this.h != null) {
                str3 = this.h.name + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.h.launchMode;
            } else {
                str3 = StringUtil.NULL;
            }
            jSONObject.put("act_info", str3);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    private String a(String str, String str2, String str3, boolean z) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject;
        String substring = str.substring(str2.length());
        boolean z2 = false;
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() >= 2 && substring2.startsWith(CommonConstant.Symbol.DOUBLE_QUOTES) && substring2.endsWith(CommonConstant.Symbol.DOUBLE_QUOTES)) {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z2 = true;
        } else {
            jSONObject = new JSONObject(substring2);
        }
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", "2014052600006128");
        }
        if (!jSONObject.has("ty")) {
            jSONObject.put("ty", "and_lite");
        }
        if (!jSONObject.has("sv")) {
            jSONObject.put("sv", "h.a.3.8.02");
        }
        if (!jSONObject.has("an") && (!this.b.contains("setting") || !l.b(this.c))) {
            jSONObject.put("an", this.b);
        }
        if (!jSONObject.has("av")) {
            jSONObject.put("av", this.a);
        }
        if (!jSONObject.has("sdk_start_time")) {
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
        }
        if (!jSONObject.has("extInfo")) {
            jSONObject.put("extInfo", a());
        }
        String jSONObject2 = jSONObject.toString();
        if (z2) {
            jSONObject2 = CommonConstant.Symbol.DOUBLE_QUOTES + jSONObject2 + CommonConstant.Symbol.DOUBLE_QUOTES;
        }
        return str2 + jSONObject2 + str3;
    }

    public static HashMap<String, String> a(a aVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aVar != null) {
            hashMap.put("sdk_ver", "15.8.02");
            hashMap.put("app_name", aVar.b);
            hashMap.put("token", aVar.d);
            hashMap.put("call_type", aVar.g);
            hashMap.put("ts_api_invoke", String.valueOf(aVar.e));
        }
        return hashMap;
    }
}
