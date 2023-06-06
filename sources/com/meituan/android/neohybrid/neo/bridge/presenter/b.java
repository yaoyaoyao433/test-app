package com.meituan.android.neohybrid.neo.bridge.presenter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.gson.JsonObject;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.neohybrid.neo.bridge.b;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.paybase.utils.ae;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b implements b.a {
    private static final String a = "b";
    public static ChangeQuickRedirect b;
    private static final Handler n = new Handler(Looper.getMainLooper());
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected com.meituan.android.neohybrid.core.a g;
    public long h;
    public String i;
    protected int j;
    protected int k;
    protected int l;
    protected String m;
    private com.meituan.android.neohybrid.neo.bridge.b o;

    public abstract String b() throws Exception;

    public abstract String j();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6259de0f6b2ba84ce757541f3095201", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6259de0f6b2ba84ce757541f3095201");
            return;
        }
        this.j = 0;
        this.k = 1;
        this.l = -1;
        this.m = "";
    }

    public final void a(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0613d55bc43778a97e844d07bd05375b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0613d55bc43778a97e844d07bd05375b");
            return;
        }
        this.g = aVar;
        this.c = str;
        this.e = str2;
        this.d = str3;
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f = new JSONObject(str2).optString("callbackId");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[Catch: Exception -> 0x0102, TryCatch #1 {Exception -> 0x0102, blocks: (B:30:0x00bf, B:42:0x00e6, B:43:0x00e9, B:46:0x00f3, B:35:0x00d1, B:38:0x00db), top: B:53:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.neo.bridge.presenter.b.c():java.lang.String");
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "336767d235c2156fbf4e0751f4daaf62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "336767d235c2156fbf4e0751f4daaf62");
        } else {
            a(this.f, jSONObject);
        }
    }

    public final void a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598456cd832a2f9222bcaad4c23f3a9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598456cd832a2f9222bcaad4c23f3a9d");
        } else {
            a(this.f, new NeoBridgeBean(0, "", jsonObject));
        }
    }

    public final void a(int i, String str, JsonObject jsonObject) {
        Object[] objArr = {Integer.valueOf(i), str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b8913fb1120ccf5a8c4677f1770eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b8913fb1120ccf5a8c4677f1770eaf");
        } else {
            a(this.f, new NeoBridgeBean(i, str, jsonObject));
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9048aedab4cd3d0cdcab99d118d68f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9048aedab4cd3d0cdcab99d118d68f4");
        } else {
            a(str, new NeoBridgeBean(0, "", jSONObject));
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void a(String str, JsonObject jsonObject) {
        Object[] objArr = {str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd4da2a79d22aa917146efc971dd41e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd4da2a79d22aa917146efc971dd41e8");
        } else {
            a(str, new NeoBridgeBean(0, "", jsonObject));
        }
    }

    private void a(String str, NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {str, neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd869dc7d109b2c2bb3d539a2409d361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd869dc7d109b2c2bb3d539a2409d361");
        } else if (this.g == null || neoBridgeBean == null) {
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                n.post(c.a(this, str, neoBridgeBean));
            } else if (this.g.c() == null || this.g.e() == null) {
            } else {
                WebView e = this.g.e();
                String str2 = "javascript:NeoScope.bridgeCallback('" + str + "'," + neoBridgeBean.toString() + CommonConstant.Symbol.BRACKET_RIGHT;
                if (Build.VERSION.SDK_INT < 19) {
                    e.loadUrl(str2);
                    return;
                }
                HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.a().b;
                hashMap.put("action", this.c);
                hashMap.put("callbackId", this.f);
                a("b_pay_neo_bridge_start_sc", hashMap);
                try {
                    e.evaluateJavascript(str2, d.a(this, System.currentTimeMillis()));
                } catch (Exception unused) {
                    e.loadUrl(str2);
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str, NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {bVar, str, neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6e4475820cbb4cfde4f557ec05b1d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6e4475820cbb4cfde4f557ec05b1d43");
        } else {
            bVar.a(str, neoBridgeBean);
        }
    }

    public static /* synthetic */ void a(b bVar, long j, String str) {
        Object[] objArr = {bVar, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfacc6d617bff877ab4084ae4b39df67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfacc6d617bff877ab4084ae4b39df67");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.a().b;
            hashMap.put("action", bVar.c);
            hashMap.put("callbackId", bVar.f);
            hashMap.put("code", Integer.valueOf(jSONObject.optInt("code", -1)));
            hashMap.put("message", jSONObject.optString("message", ""));
            hashMap.put("timeConsumed", Long.valueOf(System.currentTimeMillis() - j));
            bVar.a("b_pay_neo_bridge_active_async_sc", hashMap);
            com.meituan.android.neohybrid.util.f.a(hashMap.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final com.meituan.android.neohybrid.core.a e() {
        return this.g;
    }

    public final void f() {
        com.meituan.android.neohybrid.neo.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ececef47a20be247d87328bd875adcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ececef47a20be247d87328bd875adcd");
            return;
        }
        com.meituan.android.neohybrid.core.a aVar = this.g;
        Object[] objArr2 = {"neobridge_plugin"};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0b94901d8752677e89117ddd74004458", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.meituan.android.neohybrid.neo.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0b94901d8752677e89117ddd74004458");
        } else {
            a2 = aVar.d == null ? null : aVar.d.a("neobridge_plugin");
        }
        if (a2 instanceof com.meituan.android.neohybrid.neo.bridge.b) {
            this.o = (com.meituan.android.neohybrid.neo.bridge.b) a2;
        }
        if (this.o != null) {
            com.meituan.android.neohybrid.neo.bridge.b bVar = this.o;
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.neo.bridge.b.d;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "91d098a63ab6c218c6770b91a72c554c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "91d098a63ab6c218c6770b91a72c554c");
            } else if (bVar.e != null) {
                bVar.e.add(this);
            }
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c04261abaab05417ac87f29d84407c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c04261abaab05417ac87f29d84407c8");
        } else if (this.o != null) {
            this.o.a(this);
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b69bc274c74be767e48ffc9d0febdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b69bc274c74be767e48ffc9d0febdf");
        } else {
            com.meituan.android.neohybrid.neo.report.d.a(this.g, str, (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("keys", map).b(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis())));
        }
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec299a50de267005f4250a79104b01f9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec299a50de267005f4250a79104b01f9") : new NeoBridgeBean(0, "succ", new JsonObject(), a(false)).toString();
    }

    public final String a(JsonObject... jsonObjectArr) {
        Object[] objArr = {jsonObjectArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79ec00c185f196611175ac0629233fe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79ec00c185f196611175ac0629233fe") : new NeoBridgeBean(0, "succ", jsonObjectArr[0], a(false)).toString();
    }

    public final String a(JSONObject... jSONObjectArr) {
        Object[] objArr = {jSONObjectArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18db0187ef5b37824b9932d086837f81", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18db0187ef5b37824b9932d086837f81") : new NeoBridgeBean(0, "succ", jSONObjectArr[0], a(false)).toString();
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00651ab43784365f9c031dfdb0989c16", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00651ab43784365f9c031dfdb0989c16") : new NeoBridgeBean(1, "pending", new JsonObject(), a(true)).toString();
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614d99b12c57853ad55d5c393a57bd77", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614d99b12c57853ad55d5c393a57bd77");
        }
        return new NeoBridgeBean(-1, j() + str, new JsonObject(), a(false)).toString();
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9497a820854f85706879d8e490dcb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9497a820854f85706879d8e490dcb9");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            n.post(runnable);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6122bfce87e3a739e80497f50994769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6122bfce87e3a739e80497f50994769");
            return;
        }
        HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.a().b;
        hashMap.put("bridge", j());
        hashMap.put("action", this.c);
        hashMap.put("jsData", this.d);
        hashMap.put(NetLogConstants.Details.ERROR_MSG, str);
        a("b_pay_neo_bridge_failed_sc", hashMap);
    }

    public String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea2e45605b2669881a1362a9d6d85bc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea2e45605b2669881a1362a9d6d85bc") : getClass().getName();
    }

    private String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af616d7a118bcd56080390eb5dd36c4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af616d7a118bcd56080390eb5dd36c4e");
        }
        if (TextUtils.isEmpty(this.c)) {
            return k();
        }
        return k() + "/" + this.c;
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.b.a
    public void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d2679be6e2c4fd653e347f4dd02afd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d2679be6e2c4fd653e347f4dd02afd");
            return;
        }
        com.meituan.android.neohybrid.util.f.a(a + "_onActivityResult: requestCode=" + i + ";resultCode=" + i2 + ";bridgeName=" + l() + ";hashCode=" + hashCode());
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.b.a
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7a5f741cae13e4758549af657aa324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7a5f741cae13e4758549af657aa324");
            return;
        }
        com.meituan.android.neohybrid.util.f.a(a + "_onNeoDestroy");
    }

    public final JsonObject a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "064cb322e5871e3b2cc7c2a2d4ce0a3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "064cb322e5871e3b2cc7c2a2d4ce0a3e");
        }
        JsonObject jsonObject = new JsonObject();
        if (TextUtils.equals(l(), getClass().getName()) || this.g == null || this.h == 0 || TextUtils.isEmpty(this.i)) {
            return jsonObject;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> a2 = com.meituan.android.paybase.webview.jshandler.a.a(l(), com.meituan.android.paybase.webview.jshandler.a.a(this.g.k()), currentTimeMillis - this.h, this.i);
        a2.put("is_async", Boolean.valueOf(z));
        com.meituan.android.neohybrid.neo.report.d.a(this.g, "b_pay_common_bridge_native_end_sc", ae.b, a2);
        com.meituan.android.neohybrid.neo.report.d.c(this.g, "paybiz_common_bridge_native_end", a2);
        jsonObject.addProperty("pay_bridge_unique_id", this.i);
        jsonObject.addProperty("native_end_time_stamp", Long.valueOf(currentTimeMillis));
        return jsonObject;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b50957d9537d8fb7f81ff897f6f7aa71", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b50957d9537d8fb7f81ff897f6f7aa71");
        }
        if (this.g.d() == null) {
            return a("Activity is null");
        }
        if (this.g.f() == null || this.g.f().getScene() == null) {
            return a("NeoConfig is null");
        }
        return a("Unkonw scene or action");
    }
}
