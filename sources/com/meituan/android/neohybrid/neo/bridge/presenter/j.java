package com.meituan.android.neohybrid.neo.bridge.presenter;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.neo.notification.NeoHybridJSHandler;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.android.neohybrid.neo.tunnel.TunnelParamJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class j extends b implements c.a {
    public static ChangeQuickRedirect a = null;
    public static final String n = "j";

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String k() {
        return "notify";
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.a
    public void onFailProcess(int i, String str) {
    }

    public j(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8028f605d34c96392886610759ea0210", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8028f605d34c96392886610759ea0210");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eb0309a61f4a31e7fc3730f45bdfd9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eb0309a61f4a31e7fc3730f45bdfd9e");
        }
        if ("notify_render_finished".equals(this.c)) {
            a(k.a(this));
            return h();
        } else if ("notify_prerender_finished".equals(this.c)) {
            if (e().f().isNeoPrerenderBridge()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6b51f92f3c438fa7259ed637d8bde58", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6b51f92f3c438fa7259ed637d8bde58");
                } else {
                    com.meituan.android.neohybrid.core.a e = e();
                    if (!e.j()) {
                        e.a(this);
                        e.l();
                    } else {
                        a(this.f, c(this.d));
                    }
                }
                return i();
            }
            return a("neo notify prerender finished bridge is close");
        } else {
            return d();
        }
    }

    public static /* synthetic */ void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c5dc9a5dfa63cde06e34c43205daadb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c5dc9a5dfa63cde06e34c43205daadb");
            return;
        }
        if (com.meituan.android.neohybrid.init.a.h()) {
            String str = "javascript:window._neo=" + com.meituan.android.neohybrid.neo.params.a.a(jVar.e());
            com.meituan.android.neohybrid.util.f.a("NotifyBridgePresenter_exec_loadJs_for_debug=" + str);
            jVar.g.e().loadUrl(str);
        }
        com.meituan.android.neohybrid.neo.n loadingStatus = NeoHybridJSHandler.getLoadingStatus(jVar.d);
        if (loadingStatus == com.meituan.android.neohybrid.neo.n.FINISHED) {
            jVar.g.b();
        } else {
            jVar.g.a(loadingStatus);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String j() {
        return n;
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.a
    public void onBusinessProcess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "450b5d9f58400130470ee899822d4d77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "450b5d9f58400130470ee899822d4d77");
        } else {
            a(this.f, c(this.d));
        }
    }

    private JSONObject c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d90ccaf804b7dd64824cddbc0dbba67", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d90ccaf804b7dd64824cddbc0dbba67");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("useParamTunnel");
            if (optJSONObject != null && "getAllParams".equals(optJSONObject.optString("action"))) {
                JsonObject c = com.meituan.android.neohybrid.neo.tunnel.a.a().c(e());
                e().a(TunnelParamJSHandler.NAME, new JSONObject());
                if (c != null) {
                    Map<String, JsonObject> b = com.meituan.android.neohybrid.neo.params.a.b(e());
                    for (String str2 : b.keySet()) {
                        c.add(str2, b.get(str2));
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 0);
                    jSONObject2.put("data", new JSONObject(com.meituan.android.neohybrid.util.gson.b.a().toJson((JsonElement) c)));
                    jSONObject.put("useParamTunnel", jSONObject2);
                    return jSONObject;
                }
            }
        } catch (Exception e) {
            com.meituan.android.neohybrid.neo.report.b.a(e, "NotifyBridgePresenter_nsrCallbackWithTunnelParams", (Map<String, Object>) null);
        }
        return null;
    }
}
