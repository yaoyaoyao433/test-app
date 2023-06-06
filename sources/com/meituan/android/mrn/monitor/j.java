package com.meituan.android.mrn.monitor;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.mrn.config.ad;
import com.meituan.android.mrn.config.y;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.i;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class j {
    public static ChangeQuickRedirect a = null;
    public static final String b = "j";
    private static final String d = "http://catfront.51ping.com/";
    private static final String e = "http://catfront.dianping.com/";
    private static j g;
    public Executor c;
    private IMRNApiLog f;

    public static synchronized j a(Context context) {
        synchronized (j.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ce65b6a0cdad5a3d82809b4d9302ca", RobustBitConfig.DEFAULT_VALUE)) {
                return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ce65b6a0cdad5a3d82809b4d9302ca");
            }
            if (g == null) {
                g = new j(context);
            }
            return g;
        }
    }

    private j(Context context) {
        i.a aVar;
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "577310b0707d914ecf2eba4e2992ea76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "577310b0707d914ecf2eba4e2992ea76");
            return;
        }
        this.c = com.sankuai.android.jarvis.c.a("mrn_log", 1);
        ar.a aVar2 = new ar.a();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc173c1d8f8b8d2b18af60b0a465804c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc173c1d8f8b8d2b18af60b0a465804c")).booleanValue();
        } else if (!com.meituan.android.mrn.debug.a.c() || !com.meituan.android.mrn.engine.f.c(context) || com.meituan.android.mrn.debug.a.c(context)) {
            z = false;
        }
        ar.a a2 = aVar2.a(z ? e : d).a(ad.a(context)).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a());
        y a3 = y.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = y.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "a447b481ad60b868b78798f3480b1820", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (i.a) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "a447b481ad60b868b78798f3480b1820");
        } else {
            if (a3.f == null) {
                a3.f = com.meituan.android.mrn.utils.h.a();
            }
            aVar = a3.f;
        }
        this.f = (IMRNApiLog) a2.a(aVar).a().a(IMRNApiLog.class);
    }

    public final JSONObject a(Context context, com.meituan.android.mrn.engine.k kVar, MRNExceptionsManagerModule.b bVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject a2;
        Object[] objArr = {context, kVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b790074bc3d2d887e176750728c749df", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b790074bc3d2d887e176750728c749df");
        }
        if (bVar == null) {
            return null;
        }
        try {
            com.meituan.android.mrn.config.e a3 = com.meituan.android.mrn.config.c.a();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("category", "jsError");
            jSONObject3.put("level", bVar.b ? "warn" : "error");
            jSONObject3.put("isNativeError", bVar.i != null);
            jSONObject3.put("sec_category", k.a(bVar.c));
            jSONObject3.put("region", k.a(context));
            jSONObject3.put("network", a3.b());
            jSONObject3.put("container", DiagnoseLog.MRN);
            jSONObject3.put("os", "Android");
            jSONObject3.put("unionId", a3.n());
            jSONObject3.put(DeviceInfo.TM, String.valueOf(System.currentTimeMillis()));
            if (kVar != null) {
                if (!TextUtils.isEmpty(kVar.k)) {
                    jSONObject3.put("project", !bVar.f ? "rn_mrn_unhandled" : kVar.k);
                }
                if (!TextUtils.isEmpty(kVar.l)) {
                    jSONObject3.put("pageUrl", kVar.l);
                }
                if (kVar.i != null && kVar.i.c != null && kVar.i.f != null) {
                    jSONObject3.put("resourceUrl", String.format("%s/%s/%s%s", kVar.i.c, kVar.i.f, String.valueOf(kVar.i.l), "index.js"));
                }
            }
            Object[] objArr2 = {kVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c1ff97531dd25f6d47b62808874835c", RobustBitConfig.DEFAULT_VALUE)) {
                jSONObject = (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c1ff97531dd25f6d47b62808874835c");
            } else {
                jSONObject = new JSONObject();
                com.meituan.android.mrn.config.e a4 = com.meituan.android.mrn.config.c.a();
                if (a4 != null) {
                    jSONObject.put("appId", a4.f());
                    jSONObject.put("MRNVersion", "3.1201.206");
                    jSONObject.put("appVersion", a4.l());
                    jSONObject.put("appKey", a4.e());
                }
                if (kVar != null && kVar.i != null) {
                    jSONObject.put("bundleVersion", kVar.i.f);
                }
            }
            String stackTraceString = bVar.i != null ? Log.getStackTraceString(bVar.i) : k.a(bVar.c, bVar.d, jSONObject, kVar != null ? kVar.k : null);
            jSONObject3.put("dynamicMetric", jSONObject);
            Object[] objArr3 = {kVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4699ec969a0e40f090da86efa12234a0", RobustBitConfig.DEFAULT_VALUE)) {
                jSONObject2 = (JSONObject) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4699ec969a0e40f090da86efa12234a0");
            } else {
                jSONObject2 = new JSONObject();
                com.meituan.android.mrn.config.e a5 = com.meituan.android.mrn.config.c.a();
                if (a5 != null) {
                    jSONObject2.put("AppId", a5.f());
                    jSONObject2.put("AppVersion", a5.l());
                }
                if (kVar != null) {
                    String str = "未加载业务";
                    String str2 = "未加载业务";
                    if (kVar.i != null) {
                        str = kVar.i.c;
                        str2 = kVar.i.f;
                    }
                    jSONObject2.put("ErrorBundleName", str);
                    jSONObject2.put("ErrorBundleVersion", str2);
                }
            }
            if (jSONObject2 != null) {
                stackTraceString = stackTraceString + "\n基本环境信息：" + a(jSONObject2.toString());
            }
            if (k.a(kVar, bVar) != null) {
                stackTraceString = stackTraceString + "\n自定义信息：" + a(a2.toString());
            }
            jSONObject3.put("content", stackTraceString);
            return jSONObject3;
        } catch (JSONException e2) {
            com.meituan.android.mrn.utils.c.a("MRNJsCatErrorReporter.getReportJSON", e2);
            e2.printStackTrace();
            return null;
        }
    }

    private static String a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4cd8026c9dd8194e253cac68427758c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4cd8026c9dd8194e253cac68427758c");
        }
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            int i2 = 0;
            char c = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '{') {
                    i2++;
                    sb.append(charAt);
                    sb.append("\n");
                    sb.append(a(i2));
                } else if (charAt == '}') {
                    i2--;
                    sb.append("\n");
                    sb.append(a(i2));
                    sb.append(charAt);
                } else if (charAt == ',') {
                    sb.append(charAt);
                    sb.append("\n");
                    sb.append(a(i2));
                } else if (charAt == ':') {
                    sb.append(charAt);
                    sb.append(StringUtil.SPACE);
                } else if (charAt == '[') {
                    i2++;
                    if (str.charAt(i + 1) == ']') {
                        sb.append(charAt);
                    } else {
                        sb.append(charAt);
                        sb.append("\n");
                        sb.append(a(i2));
                    }
                } else if (charAt == ']') {
                    i2--;
                    if (c == '[') {
                        sb.append(charAt);
                    } else {
                        sb.append("\n");
                        sb.append(a(i2));
                        sb.append(charAt);
                    }
                } else {
                    sb.append(charAt);
                }
                i++;
                c = charAt;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2d8082d28b0be0afc4b208a2eed9b59", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2d8082d28b0be0afc4b208a2eed9b59");
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('\t');
        }
        return sb.toString();
    }
}
