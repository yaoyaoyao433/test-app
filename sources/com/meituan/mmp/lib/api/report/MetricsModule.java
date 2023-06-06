package com.meituan.mmp.lib.api.report;

import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.common.Constants;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.devtools.g;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private static final Random h = new Random();

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final boolean d() {
        return true;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98668c091bffb462691f049f5726e734", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98668c091bffb462691f049f5726e734") : new String[]{"reportMetrics"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Log a2;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df26914afb0a05c0aba2e4a4be2b6b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df26914afb0a05c0aba2e4a4be2b6b7");
            return;
        }
        char c = 65535;
        if (str.hashCode() == 67666159 && str.equals("reportMetrics")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(Constants.METRICS);
            MMPAppProp mMPAppProp = getAppConfig().l;
            String version = mMPAppProp == null ? "" : mMPAppProp.getVersion();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                String c2 = getAppConfig().c();
                Object[] objArr2 = {optJSONArray, c2, version};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c86dbe32ad55891adf0b7037ca2695fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c86dbe32ad55891adf0b7037ca2695fc");
                } else {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null && (a2 = a(c2, version, optJSONObject)) != null) {
                            arrayList.add(a2);
                        }
                    }
                    if (arrayList.size() > 0) {
                        Babel.logRT(arrayList);
                    }
                }
            } else {
                Log a3 = a(getAppId(), version, jSONObject);
                if (a3 != null) {
                    Babel.logRT(a3);
                }
                Object[] objArr3 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2d6320defc19289735d7e5d06406c43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2d6320defc19289735d7e5d06406c43");
                } else {
                    a(jSONObject.optString("type"), Long.valueOf(jSONObject.optLong("value")));
                }
            }
            iApiCallback.onSuccess(null);
        } catch (JSONException e) {
            b.d("InnerApi", "reportMetrics: " + e.toString());
            iApiCallback.onFail();
        }
    }

    private Log a(String str, String str2, JSONObject jSONObject) throws JSONException {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed18e30a5c1c0ed4855225e37b5c7083", RobustBitConfig.DEFAULT_VALUE)) {
            return (Log) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed18e30a5c1c0ed4855225e37b5c7083");
        }
        String optString = jSONObject.optString("type");
        long optLong = jSONObject.optLong("value");
        a(optString, Long.valueOf(optLong));
        JSONObject optJSONObject = jSONObject.optJSONObject("tags");
        String optString2 = jSONObject.optString("category");
        Map<String, Object> a2 = ac.a(optJSONObject);
        if ("prism-report-knb".equals(optString2) && "msi.api.duration".equals(optString)) {
            if (h.nextInt(10000) >= 10) {
                return null;
            }
            a2.put("$sr", Float.valueOf(0.001f));
        }
        a2.put("mmp.id", str);
        a2.put("bundle_name", str);
        a2.put("bundle_version", str2);
        a2.put("sdk_version", "1.24");
        a2.put("bundle_biz", "MMP");
        return a(optString, null, optLong, optString2, a2);
    }

    public static Log a(String str, String str2, long j, Map<String, Object> map) {
        Object[] objArr = {str, str2, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92aac2fd9e8727ce4d392a31692b3088", RobustBitConfig.DEFAULT_VALUE) ? (Log) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92aac2fd9e8727ce4d392a31692b3088") : a(str, str2, j, null, map);
    }

    private static Log a(String str, String str2, long j, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, new Long(j), str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f2f7dfd32d7018f1e342c8101190434", RobustBitConfig.DEFAULT_VALUE)) {
            return (Log) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f2f7dfd32d7018f1e342c8101190434");
        }
        k cityController = MMPEnvHelper.getCityController();
        if (cityController != null && map != null) {
            map.put("cityId", Long.valueOf(cityController.a()));
            map.put("locatedId", Long.valueOf(cityController.c()));
        }
        Log.Builder builder = new Log.Builder(str2);
        builder.tag(str);
        builder.value(j);
        builder.optional(map);
        builder.reportChannel(str3);
        return builder.build();
    }

    public static void a(String str, long j, Map<String, Object> map) {
        Object[] objArr = {str, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65134ac20e384b03dd0ed032a68f58b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65134ac20e384b03dd0ed032a68f58b0");
            return;
        }
        MMPEnvHelper.getLogger().log(str, null, map, j);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\t");
        sb.append(j);
        sb.append("\t");
        sb.append(map != null ? map.toString() : StringUtil.NULL);
        b.b(Metrics.TAG, sb.toString());
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36f932cb447e68d86a9e357e429ae610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36f932cb447e68d86a9e357e429ae610");
            return;
        }
        MMPEnvHelper.getLogger().log(str, null, map);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\t\t");
        sb.append(map != null ? map.toString() : StringUtil.NULL);
        b.b(Metrics.TAG, sb.toString());
    }

    private void a(String str, Long l) {
        g gVar;
        Object[] objArr = {str, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0dbd9b32308bd0eda0626c5761b460a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0dbd9b32308bd0eda0626c5761b460a");
        } else if (!MMPEnvHelper.getEnvInfo().isProdEnv() && (gVar = this.e) != null && gVar.a() && TextUtils.equals(str, "mmp.fe.page.scroll.fps")) {
            l.longValue();
        }
    }
}
