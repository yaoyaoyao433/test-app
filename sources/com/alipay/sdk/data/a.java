package com.alipay.sdk.data;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.util.d;
import com.alipay.sdk.util.h;
import com.alipay.sdk.util.l;
import com.meituan.robust.Constants;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static a a;
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};
    public int c = 10000;
    public boolean d = false;
    public String e = "https://h5.m.taobao.com/mlapp/olist.html";
    public int f = 10;
    public boolean g = true;
    public boolean h = true;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public boolean l = true;
    public String m = "";
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = true;
    public String s = "";
    public String t = "";
    public boolean u = false;
    public List<b> v = null;
    public int w = -1;

    /* compiled from: ProGuard */
    /* renamed from: com.alipay.sdk.data.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0025a implements Runnable {
        public final /* synthetic */ com.alipay.sdk.sys.a a;
        public final /* synthetic */ Context b;

        public RunnableC0025a(com.alipay.sdk.sys.a aVar, Context context) {
            this.a = aVar;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.alipay.sdk.packet.b a = new com.alipay.sdk.packet.impl.b().a(this.a, this.b, "");
                if (a != null) {
                    a.a(a.this, a.b);
                    a.a(a.this, (com.alipay.sdk.sys.a) null);
                }
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    public static a a() {
        if (a == null) {
            a aVar = new a();
            a = aVar;
            Context context = com.alipay.sdk.sys.b.a().b;
            String b2 = h.b(null, context, "alipay_cashier_dynamic_config", null);
            try {
                aVar.w = Integer.parseInt(h.b(null, context, "utdid_factor", "-1"));
            } catch (Exception unused) {
            }
            aVar.a(b2);
        }
        return a;
    }

    public final int b() {
        int i = this.c;
        if (i >= 1000 && i <= 20000) {
            d.a("DynCon", "time = " + this.c);
            return this.c;
        }
        d.a("DynCon", "time(def) = 10000");
        return 10000;
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            a(new JSONObject(str));
        } catch (Throwable th) {
            d.a(th);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final int b;
        public final String c;

        public b(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        private static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString(PushConstants.URI_PACKAGE_NAME));
        }

        public final String toString() {
            return String.valueOf(a(this));
        }

        public static List<b> a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                b a = a(jSONArray.optJSONObject(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }

        private static JSONObject a(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.a).put("v", bVar.b).put(PushConstants.URI_PACKAGE_NAME, bVar.c);
            } catch (JSONException e) {
                d.a(e);
                return null;
            }
        }

        public static JSONArray a(List<b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (b bVar : list) {
                jSONArray.put(a(bVar));
            }
            return jSONArray;
        }
    }

    private void a(JSONObject jSONObject) {
        this.c = jSONObject.optInt("timeout", 10000);
        this.d = jSONObject.optBoolean("h5_port_degrade", false);
        this.e = jSONObject.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html").trim();
        this.f = jSONObject.optInt("configQueryInterval", 10);
        this.v = b.a(jSONObject.optJSONArray("launchAppSwitch"));
        this.g = jSONObject.optBoolean("scheme_pay_2", true);
        this.h = jSONObject.optBoolean("intercept_batch", true);
        this.j = jSONObject.optBoolean("deg_log_mcgw", false);
        this.k = jSONObject.optBoolean("deg_start_srv_first", true);
        this.l = jSONObject.optBoolean("prev_jump_dual", true);
        this.m = jSONObject.optString("use_sc_only", "");
        this.n = jSONObject.optBoolean("bind_use_imp", false);
        this.o = jSONObject.optBoolean("retry_bnd_once", false);
        this.p = jSONObject.optBoolean("skip_trans", false);
        this.q = jSONObject.optBoolean("start_trans", false);
        this.r = jSONObject.optBoolean("up_before_pay", true);
        this.s = jSONObject.optString("lck_k", "");
        this.u = jSONObject.optBoolean("use_sc_lck_a", false);
        this.t = jSONObject.optString("bind_with_startActivity", "");
    }

    public final void a(com.alipay.sdk.sys.a aVar, Context context, boolean z) {
        RunnableC0025a runnableC0025a = new RunnableC0025a(aVar, context);
        if (z) {
            if (l.a(600L, runnableC0025a, "AlipayDCPBlok")) {
                return;
            }
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "LogAppFetchConfigTimeout", "");
            return;
        }
        Thread thread = new Thread(runnableC0025a);
        thread.setName("AlipayDCP");
        thread.start();
    }

    public final boolean a(Context context, int i) {
        int i2;
        int i3 = -1;
        if (this.w == -1) {
            String c = com.alipay.sdk.sys.b.a().c();
            if (!TextUtils.isEmpty(c)) {
                String replaceAll = c.replaceAll("=", "");
                if (replaceAll.length() >= 5) {
                    replaceAll = replaceAll.substring(0, 5);
                }
                int pow = (int) Math.pow(2.0d, 6.0d);
                int length = replaceAll.length();
                long j = 0;
                int i4 = length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = i5 + 1;
                    String substring = replaceAll.substring(i5, i6);
                    while (true) {
                        if (i2 >= 64) {
                            i2 = 0;
                            break;
                        }
                        i2 = substring.equals(String.valueOf(b[i2])) ? 0 : i2 + 1;
                    }
                    j += Integer.parseInt(String.valueOf(i2)) * ((long) Math.pow(pow, i4 - 1));
                    i4--;
                    i5 = i6;
                    pow = pow;
                }
                i3 = (int) (j % 10000);
                if (i3 < 0) {
                    i3 *= -1;
                }
            }
            this.w = i3;
            h.a(null, context, "utdid_factor", String.valueOf(this.w));
        }
        return this.w < i;
    }

    public static /* synthetic */ void a(a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("st_sdk_config");
            if (optJSONObject != null) {
                aVar.a(optJSONObject);
            } else {
                d.a(d.c("DynCon", "empty config"));
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static /* synthetic */ void a(a aVar, com.alipay.sdk.sys.a aVar2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timeout", aVar.b());
            jSONObject.put("h5_port_degrade", aVar.d);
            jSONObject.put("tbreturl", aVar.e);
            jSONObject.put("configQueryInterval", aVar.f);
            jSONObject.put("launchAppSwitch", b.a(aVar.v));
            jSONObject.put("scheme_pay_2", aVar.g);
            jSONObject.put("intercept_batch", aVar.h);
            jSONObject.put("deg_log_mcgw", aVar.j);
            jSONObject.put("deg_start_srv_first", aVar.k);
            jSONObject.put("prev_jump_dual", aVar.l);
            jSONObject.put("use_sc_only", aVar.m);
            jSONObject.put("bind_use_imp", aVar.n);
            jSONObject.put("retry_bnd_once", aVar.o);
            jSONObject.put("skip_trans", aVar.p);
            jSONObject.put("start_trans", aVar.q);
            jSONObject.put("up_before_pay", aVar.r);
            jSONObject.put("use_sc_lck_a", aVar.u);
            jSONObject.put("lck_k", aVar.s);
            jSONObject.put("bind_with_startActivity", aVar.t);
            h.a(aVar2, com.alipay.sdk.sys.b.a().b, "alipay_cashier_dynamic_config", jSONObject.toString());
        } catch (Exception e) {
            d.a(e);
        }
    }
}
