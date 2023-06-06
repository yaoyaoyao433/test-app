package com.dianping.logreportswitcher.utils;

import android.text.TextUtils;
import com.dianping.logreportswitcher.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static d d;
    public c.a b;
    public int c;
    private ConcurrentHashMap<String, Object> e;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcda3360e7a74ba563475875db650135", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcda3360e7a74ba563475875db650135");
            return;
        }
        this.e = new ConcurrentHashMap<>();
        this.c = -1;
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b391835018eb098722651148fe451f36", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b391835018eb098722651148fe451f36");
        }
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d();
                }
            }
        }
        return d;
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2635ce2ef8bbc2ce101999f69ca616", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2635ce2ef8bbc2ce101999f69ca616");
        } else if (TextUtils.isEmpty(str) || obj == null) {
        } else {
            this.e.put(str, obj);
        }
    }

    private Object d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae311a79275fc3c109d1b3cba7ae37ac", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae311a79275fc3c109d1b3cba7ae37ac") : this.e.get(str);
    }

    public final synchronized int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df1e01b4ea844d9e3b4263ebb03df6c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df1e01b4ea844d9e3b4263ebb03df6c")).intValue();
        } else if (TextUtils.isEmpty(str)) {
            return -1;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                long optLong = jSONObject.optLong("configVersion");
                String c = c("config_version_key");
                if (optLong > (TextUtils.isEmpty(c) ? 0L : Long.valueOf(c).longValue())) {
                    String optString = jSONObject.optString("configVersion");
                    b.a("config_version_key", optString);
                    a().a("config_version_key", optString);
                    return 1;
                }
                return -1;
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public final void b(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9aa1141e5ef0b2556602a3e639ed80c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9aa1141e5ef0b2556602a3e639ed80c");
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("configVersion");
            JSONArray optJSONArray = jSONObject.optJSONArray("types");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    for (String str2 : com.dianping.logreportswitcher.a.a) {
                        if (optJSONObject != null && optJSONObject.optString("id").equalsIgnoreCase(str2)) {
                            Boolean valueOf = Boolean.valueOf(optJSONObject.optBoolean("enable"));
                            b.a(str2, valueOf.booleanValue());
                            a().a(str2, valueOf);
                        }
                    }
                }
            }
            if (this.c > 0) {
                b.a("config_app_verison", this.c);
            }
            b.a("config_version_key", optString);
            a().a("config_version_key", optString);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("sampleConfig");
            if (optJSONArray2 != null) {
                String jSONArray = optJSONArray2.toString();
                b.a("sample_config_key", jSONArray);
                a().a("sample_config_key", jSONArray);
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("metricSampleConfig");
            if (optJSONArray3 != null) {
                String jSONArray2 = optJSONArray3.toString();
                b.a("metric_sample_config_key", jSONArray2);
                a().a("metric_sample_config_key", jSONArray2);
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("hertz");
            if (optJSONArray4 != null) {
                String jSONArray3 = optJSONArray4.toString();
                b.a("hertz_config_key", jSONArray3);
                a().a("hertz_config_key", jSONArray3);
            }
            long j = 300000;
            try {
                JSONArray optJSONArray5 = jSONObject.optJSONArray("appProperties");
                if (optJSONArray5 != null) {
                    long j2 = 300000;
                    for (int i2 = 0; i2 < optJSONArray5.length(); i2++) {
                        try {
                            JSONObject optJSONObject2 = optJSONArray5.optJSONObject(i2);
                            if ("req_interval".equalsIgnoreCase(optJSONObject2.optString("configId"))) {
                                long optLong = optJSONObject2.optLong("content", -1L) * 1000;
                                if (f.a(optLong, 86400000L) > 0) {
                                    j2 = 86400000;
                                } else {
                                    j2 = f.a(optLong, 0L) < 0 ? 300000L : optLong;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            j = j2;
                            e.printStackTrace();
                            b.a("cfg_req_interval_key", j);
                            a().a("cfg_req_interval_key", Long.valueOf(j));
                        }
                    }
                    String jSONArray4 = optJSONArray5.toString();
                    b.a("appproperties_key", jSONArray4);
                    a().a("appproperties_key", jSONArray4);
                    j = j2;
                }
            } catch (Exception e2) {
                e = e2;
            }
            b.a("cfg_req_interval_key", j);
            a().a("cfg_req_interval_key", Long.valueOf(j));
        }
    }

    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bab2265bc22533194d4e95c51497d67", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bab2265bc22533194d4e95c51497d67");
        }
        Object d2 = a().d(str);
        if (d2 == null || !(d2 instanceof String)) {
            return null;
        }
        return (String) d2;
    }

    public final long a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6240d1f9439902d7bd3e004a699b232", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6240d1f9439902d7bd3e004a699b232")).longValue();
        }
        Object d2 = a().d(str);
        return (d2 == null || !(d2 instanceof Long)) ? j : ((Long) d2).longValue();
    }

    public final boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bf11df91e0a5e75786a7494220d625b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bf11df91e0a5e75786a7494220d625b")).booleanValue();
        }
        Object d2 = a().d(str);
        return (d2 == null || !(d2 instanceof Boolean)) ? z : ((Boolean) d2).booleanValue();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76cb9030e73736fa5a8fd9bf5b47712", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76cb9030e73736fa5a8fd9bf5b47712");
            return;
        }
        d a2 = a();
        long currentTimeMillis = System.currentTimeMillis();
        b.a("config_modified_time_key", currentTimeMillis);
        a2.a("config_modified_time_key", Long.valueOf(currentTimeMillis));
    }
}
