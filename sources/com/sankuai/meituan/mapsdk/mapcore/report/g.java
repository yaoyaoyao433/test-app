package com.sankuai.meituan.mapsdk.mapcore.report;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static volatile g d;
    private final String b;
    private final Map<String, a> c;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476df9cfb2f707c3a9580e812f3404ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476df9cfb2f707c3a9580e812f3404ea");
            return;
        }
        this.b = (String) DateFormat.format("yyyy-MM-dd", new Date());
        this.c = new ConcurrentHashMap();
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79f1cb4d4dcde026217bf6decd443f3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79f1cb4d4dcde026217bf6decd443f3d");
        }
        if (d == null) {
            synchronized (g.class) {
                if (d == null) {
                    d = new g();
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e58a3202dcfb6de87c90dab61715209", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e58a3202dcfb6de87c90dab61715209");
            }
            return "NetworkStats{uploadFlows=" + this.b + ", downloadFlows=" + this.c + ", times=" + this.d + '}';
        }
    }

    public final synchronized void a(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b469ba2558967b2a1d1f49bae6e36e52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b469ba2558967b2a1d1f49bae6e36e52");
            return;
        }
        try {
            a aVar = this.c.get(str);
            if (aVar == null) {
                aVar = new a();
                this.c.put(str, aVar);
            }
            aVar.b = (int) (aVar.b + j);
            aVar.c = (int) (aVar.c + j2);
            aVar.d++;
            a aVar2 = this.c.get("totalFlows");
            if (aVar2 == null) {
                aVar2 = new a();
                this.c.put("totalFlows", aVar2);
            }
            aVar2.b = (int) (aVar2.b + j);
            aVar2.c = (int) (aVar2.c + j2);
            aVar2.d++;
            if (aVar2.d > 0 && aVar2.d % 50 == 0) {
                b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final synchronized void b() {
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84f041e524987b7a9c56e835d284fe15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84f041e524987b7a9c56e835d284fe15");
            return;
        }
        try {
            com.sankuai.meituan.mapsdk.mapcore.preference.a a2 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
            String b = a2.b();
            if (TextUtils.isEmpty(b)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(b);
            }
            if (TextUtils.isEmpty(jSONObject.optString("date"))) {
                jSONObject.put("date", this.b);
            }
            for (String str : this.c.keySet()) {
                a aVar = this.c.get(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                }
                optJSONObject.put("uf", optJSONObject.optLong("uf") + aVar.b).put("df", optJSONObject.optLong("df") + aVar.c).put("times", optJSONObject.optInt("times") + aVar.d);
            }
            this.c.clear();
            a2.a(jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final synchronized void a(Context context, int i, String str, Class<?> cls, String str2) {
        Object[] objArr = {context, Integer.valueOf(i), str, cls, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad7f38ef2b64b1764be1730feb6fc04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad7f38ef2b64b1764be1730feb6fc04");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.preference.a a2 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
        String b = a2.b();
        if (!TextUtils.isEmpty(b)) {
            try {
                JSONObject jSONObject = new JSONObject(b);
                if (!TextUtils.equals(this.b, jSONObject.optString("date"))) {
                    f.a(context, i, str, cls, str2, 1000L, jSONObject.toString(), "MTMapAndroidNetworkExceptionStatus", 1.0f);
                    a2.a("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
