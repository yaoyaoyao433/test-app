package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.google.gson.JsonObject;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.neohybrid.v2.neo.bridge.a;
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
public abstract class b implements a.InterfaceC0312a {
    private static final String a = "b";
    public static ChangeQuickRedirect b;
    private static final Handler o = new Handler(Looper.getMainLooper());
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected com.meituan.android.neohybrid.protocol.kernel.a g;
    protected com.meituan.android.neohybrid.v2.core.a h;
    public long i;
    public String j;
    protected int k;
    protected int l;
    protected int m;
    protected String n;
    private com.meituan.android.neohybrid.v2.neo.bridge.a p;

    public abstract String b() throws Exception;

    public abstract String j();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8eb2084b620fa3c73f8a3daea6cb8f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8eb2084b620fa3c73f8a3daea6cb8f4");
            return;
        }
        this.k = 0;
        this.l = 1;
        this.m = -1;
        this.n = "";
    }

    public final void a(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44462a5852493b63ad15ee4e8c40ed8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44462a5852493b63ad15ee4e8c40ed8b");
            return;
        }
        this.h = aVar;
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

    public final void a(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar2) {
        Object[] objArr = {aVar, str, str2, str3, aVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa02db2514b5be85701fd0e4e65a1adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa02db2514b5be85701fd0e4e65a1adf");
            return;
        }
        this.h = aVar;
        this.c = str;
        this.e = str2;
        this.d = str3;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f = new JSONObject(str2).optString("callbackId");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5 A[Catch: Exception -> 0x00fe, TryCatch #1 {Exception -> 0x00fe, blocks: (B:30:0x00bb, B:42:0x00e2, B:43:0x00e5, B:46:0x00ef, B:35:0x00cd, B:38:0x00d7), top: B:53:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.v2.neo.bridge.presenter.b.c():java.lang.String");
    }

    public final void a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26a7e9e5a2ebdde7e2491a29acb112d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26a7e9e5a2ebdde7e2491a29acb112d");
        } else {
            a(this.f, new NeoBridgeBean(0, "", jsonObject));
        }
    }

    public final void a(int i, String str, JsonObject jsonObject) {
        Object[] objArr = {Integer.valueOf(i), str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca3b6ce95a026c020c34f3c09c382c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca3b6ce95a026c020c34f3c09c382c2e");
        } else {
            a(this.f, new NeoBridgeBean(i, str, jsonObject));
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe477e6b0243f7c561d7ddef0bbccc48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe477e6b0243f7c561d7ddef0bbccc48");
        } else {
            a(str, new NeoBridgeBean(0, "", jSONObject));
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void a(String str, JsonObject jsonObject) {
        Object[] objArr = {str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9338f7cd6d34fe31ccae9c4d4d515b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9338f7cd6d34fe31ccae9c4d4d515b08");
        } else {
            a(str, new NeoBridgeBean(0, "", jsonObject));
        }
    }

    private void a(String str, NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {str, neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f933afa94affaa02be5281d1af2255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f933afa94affaa02be5281d1af2255");
        } else if (this.h == null || neoBridgeBean == null) {
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                o.post(c.a(this, str, neoBridgeBean));
            } else if (this.h.a() == null || this.h.b() == null) {
            } else {
                if (this.g != null) {
                    this.g.a(neoBridgeBean.toString());
                    return;
                }
                com.meituan.android.neohybrid.protocol.kernel.c b2 = this.h.b();
                String str2 = "javascript:NeoScope.bridgeCallback('" + str + "'," + neoBridgeBean.toString() + CommonConstant.Symbol.BRACKET_RIGHT;
                if (Build.VERSION.SDK_INT < 19) {
                    b2.a(str2);
                    return;
                }
                HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.a().b;
                hashMap.put("action", this.c);
                hashMap.put("callbackId", this.f);
                a("b_pay_neo_bridge_start_sc", hashMap);
                try {
                    final long currentTimeMillis = System.currentTimeMillis();
                    b2.a(str2, new ValueCallback<String>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.b.1
                        public static ChangeQuickRedirect a;

                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str3) {
                            String str4 = str3;
                            Object[] objArr2 = {str4};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "059d39218e0b80904925b999284919c9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "059d39218e0b80904925b999284919c9");
                                return;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(str4);
                                HashMap<String, Object> hashMap2 = com.meituan.android.neohybrid.neo.report.a.a().b;
                                hashMap2.put("action", b.this.c);
                                hashMap2.put("callbackId", b.this.f);
                                hashMap2.put("code", Integer.valueOf(jSONObject.optInt("code", -1)));
                                hashMap2.put("message", jSONObject.optString("message", ""));
                                hashMap2.put("timeConsumed", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                b.this.a("b_pay_neo_bridge_active_async_sc", hashMap2);
                                com.meituan.android.neohybrid.util.f.a(hashMap2.toString());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } catch (Exception unused) {
                    b2.a(str2);
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str, NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {bVar, str, neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c22d748c837250494f9f912d8e12285a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c22d748c837250494f9f912d8e12285a");
        } else {
            bVar.a(str, neoBridgeBean);
        }
    }

    public final com.meituan.android.neohybrid.v2.core.a e() {
        return this.h;
    }

    public final void f() {
        com.meituan.android.neohybrid.v2.neo.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e13314c604d76723f67589d882ba84e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e13314c604d76723f67589d882ba84e");
            return;
        }
        com.meituan.android.neohybrid.v2.core.a aVar = this.h;
        Object[] objArr2 = {"neobridge_plugin"};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8a1080b4b3817fa8897829caa172b093", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.meituan.android.neohybrid.v2.neo.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8a1080b4b3817fa8897829caa172b093");
        } else {
            a2 = aVar.d == null ? null : aVar.d.a("neobridge_plugin");
        }
        if (a2 instanceof com.meituan.android.neohybrid.v2.neo.bridge.a) {
            this.p = (com.meituan.android.neohybrid.v2.neo.bridge.a) a2;
        }
        if (this.p != null) {
            com.meituan.android.neohybrid.v2.neo.bridge.a aVar2 = this.p;
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.v2.neo.bridge.a.d;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "464ad90645bf29450d84af9e5641c8c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "464ad90645bf29450d84af9e5641c8c4");
            } else {
                aVar2.e.add(this);
            }
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9532a0f998fd4cb879260d0bfe489b92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9532a0f998fd4cb879260d0bfe489b92");
        } else if (this.p != null) {
            com.meituan.android.neohybrid.v2.neo.bridge.a aVar = this.p;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.neo.bridge.a.d;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b399f9401441e75c84ddfff8929efc56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b399f9401441e75c84ddfff8929efc56");
            } else {
                aVar.e.remove(this);
            }
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f4e5b98ee95d5d82b47a4fa5f53ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f4e5b98ee95d5d82b47a4fa5f53ec8");
        } else {
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.h, str, (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("keys", map).b(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis())));
        }
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "773a1acded982a8ae1ea4742a1edaed1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "773a1acded982a8ae1ea4742a1edaed1") : new NeoBridgeBean(0, "succ", new JsonObject(), a(false)).toString();
    }

    public final String a(JsonObject... jsonObjectArr) {
        Object[] objArr = {jsonObjectArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbac9a946ed468834b21f92990efed6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbac9a946ed468834b21f92990efed6") : new NeoBridgeBean(0, "succ", jsonObjectArr[0], a(false)).toString();
    }

    public final String a(JSONObject... jSONObjectArr) {
        Object[] objArr = {jSONObjectArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7163b82f7a9320aaf19c5e1d079b7829", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7163b82f7a9320aaf19c5e1d079b7829") : new NeoBridgeBean(0, "succ", jSONObjectArr[0], a(false)).toString();
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eacdd870adf210458c42d0c8fa5b5dd3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eacdd870adf210458c42d0c8fa5b5dd3") : new NeoBridgeBean(1, "pending", new JsonObject(), a(true)).toString();
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28689af789d214919ea398d0dfd2c67", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28689af789d214919ea398d0dfd2c67");
        }
        return new NeoBridgeBean(-1, j() + str, new JsonObject(), a(false)).toString();
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d23a00dc2416dc66c5b1110cbac94d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d23a00dc2416dc66c5b1110cbac94d87");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            o.post(runnable);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e15a599fc6ac7a9bc9cebd2f82d198e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e15a599fc6ac7a9bc9cebd2f82d198e");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8844d6e8f6f01a5fa671ff1e3ea1d76a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8844d6e8f6f01a5fa671ff1e3ea1d76a") : getClass().getName();
    }

    private String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be736aaab5bf4e95ea1f2dedef9e0f0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be736aaab5bf4e95ea1f2dedef9e0f0c");
        }
        if (TextUtils.isEmpty(this.c)) {
            return k();
        }
        return k() + "/" + this.c;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.a.InterfaceC0312a
    public void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94795d845ad964c771c7a0afa9fe401f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94795d845ad964c771c7a0afa9fe401f");
            return;
        }
        com.meituan.android.neohybrid.util.f.a(a + "_onActivityResult: requestCode=" + i + ";resultCode=" + i2 + ";bridgeName=" + l() + ";hashCode=" + hashCode());
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.a.InterfaceC0312a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38eee22528515b4155b6fafb9d57f69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38eee22528515b4155b6fafb9d57f69");
            return;
        }
        com.meituan.android.neohybrid.util.f.a(a + "_onNeoDestroy");
    }

    public final JsonObject a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6e03b80acd13737315d4241c0a871a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6e03b80acd13737315d4241c0a871a");
        }
        JsonObject jsonObject = new JsonObject();
        if (TextUtils.equals(l(), getClass().getName()) || this.h == null || this.i == 0 || TextUtils.isEmpty(this.j)) {
            return jsonObject;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> a2 = com.meituan.android.paybase.webview.jshandler.a.a(l(), com.meituan.android.paybase.webview.jshandler.a.a(this.h.j()), currentTimeMillis - this.i, this.j);
        a2.put("is_async", Boolean.valueOf(z));
        com.meituan.android.neohybrid.neo.report.b.a("b_pay_common_bridge_native_end_sc", ae.b, a2);
        com.meituan.android.neohybrid.neo.report.c.a("paybiz_common_bridge_native_end", a2);
        jsonObject.addProperty("pay_bridge_unique_id", this.j);
        jsonObject.addProperty("native_end_time_stamp", Long.valueOf(currentTimeMillis));
        return jsonObject;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cba2f1913549981f7bd5c6df4b89f69", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cba2f1913549981f7bd5c6df4b89f69");
        }
        if (this.h.d() == null) {
            return a("Activity is null");
        }
        if (this.h.f() == null || this.h.f().getScene() == null) {
            return a("NeoConfig is null");
        }
        return a("Unkonw scene or action");
    }
}
