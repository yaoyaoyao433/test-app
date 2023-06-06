package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

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
public class m extends b implements c.a {
    public static ChangeQuickRedirect a = null;
    public static final String o = "m";

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String k() {
        return "notify";
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.a
    public void onFailProcess(int i, String str) {
    }

    public m(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7c02fb9f08b54725d66236ca79ac09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7c02fb9f08b54725d66236ca79ac09");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    public m(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar2) {
        Object[] objArr = {aVar, str, str2, str3, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a992885a375771494c8f6f41876e39e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a992885a375771494c8f6f41876e39e");
        } else {
            a(aVar, str, str2, str3, aVar2);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16baae4e2ecd98ade5f0eb12ab018538", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16baae4e2ecd98ade5f0eb12ab018538");
        }
        if ("notify_render_finished".equals(this.c)) {
            a(n.a(this));
            return h();
        } else if ("notify_prerender_finished".equals(this.c)) {
            if (e().f().isNeoPrerenderBridge()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd0ad9c38f76d982236024f8d1b490dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd0ad9c38f76d982236024f8d1b490dd");
                } else {
                    com.meituan.android.neohybrid.v2.core.a e = e();
                    if (!e.h()) {
                        c.a[] aVarArr = {this};
                        Object[] objArr3 = {aVarArr};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.v2.core.a.a;
                        if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "4cf21e51988fc621ff3cd086e15656c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "4cf21e51988fc621ff3cd086e15656c6");
                        } else {
                            for (int i = 0; i <= 0; i++) {
                                c.a aVar = aVarArr[0];
                                if (aVar != null) {
                                    e.i.add(aVar);
                                }
                            }
                        }
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.neohybrid.v2.core.a.a;
                        if (PatchProxy.isSupport(objArr4, e, changeQuickRedirect4, false, "d1986af34cedec9b524f7ab98eb4c727", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, e, changeQuickRedirect4, false, "d1986af34cedec9b524f7ab98eb4c727");
                        } else {
                            for (c.b bVar : e.h) {
                                bVar.c(e.j());
                            }
                        }
                    } else {
                        a(this.f, c(this.d));
                    }
                }
                return i();
            }
            return a("neo notify prerender finished bridge is close");
        } else if ("notify_downgrade".equals(this.c)) {
            String str = this.d;
            Object[] objArr5 = {str};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3c7d96365eb7855d9638aeb44cf806f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3c7d96365eb7855d9638aeb44cf806f4");
            } else {
                com.meituan.android.neohybrid.v2.core.a e2 = e();
                if (e2.h()) {
                    e2.a(str);
                } else {
                    com.meituan.android.neohybrid.v2.neo.nsr.a.a(e2);
                }
            }
            return h();
        } else {
            return d();
        }
    }

    public static /* synthetic */ void a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9428a44ab8b0e1bb6f52db0dc35e08af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9428a44ab8b0e1bb6f52db0dc35e08af");
            return;
        }
        if (com.meituan.android.neohybrid.init.a.h()) {
            String str = "javascript:window._neo=" + com.meituan.android.neohybrid.v2.neo.params.a.a(mVar.e());
            com.meituan.android.neohybrid.util.f.a("NotifyBridgePresenter_exec_loadJs_for_debug=" + str);
            mVar.h.b().a(str);
        }
        com.meituan.android.neohybrid.neo.n loadingStatus = NeoHybridJSHandler.getLoadingStatus(mVar.d);
        if (loadingStatus == com.meituan.android.neohybrid.neo.n.FINISHED) {
            com.meituan.android.neohybrid.v2.core.a aVar = mVar.h;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5f83a7dc18c70ff9b7be91647dbaa790", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5f83a7dc18c70ff9b7be91647dbaa790");
                return;
            }
            aVar.d.a(com.meituan.android.neohybrid.neo.n.FINISHED);
            aVar.c.g();
            aVar.a(aVar.b, com.meituan.android.neohybrid.v2.core.f.a());
            aVar.e = new com.meituan.android.neohybrid.v2.neo.breathe.a(aVar);
            aVar.e.a(true);
            return;
        }
        com.meituan.android.neohybrid.v2.core.a aVar2 = mVar.h;
        Object[] objArr3 = {loadingStatus};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.v2.core.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "8b122c7984b69071628628341f4e61ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "8b122c7984b69071628628341f4e61ec");
            return;
        }
        aVar2.d.a(loadingStatus);
        com.meituan.android.neohybrid.v2.core.n nVar = aVar2.c;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.neohybrid.v2.core.n.a;
        if (PatchProxy.isSupport(objArr4, nVar, changeQuickRedirect4, false, "59b4c2fc02cd8c8897f97c4be2487007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, nVar, changeQuickRedirect4, false, "59b4c2fc02cd8c8897f97c4be2487007");
        } else {
            nVar.h();
        }
        aVar2.a(aVar2.b, com.meituan.android.neohybrid.v2.core.e.a());
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return o;
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.a
    public void onBusinessProcess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16c88effae55f82ef9c0354e024e2026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16c88effae55f82ef9c0354e024e2026");
        } else {
            a(this.f, c(this.d));
        }
    }

    private JSONObject c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f93286dc18d16156cc42228f61c5c88e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f93286dc18d16156cc42228f61c5c88e");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("useParamTunnel");
            if (optJSONObject != null && "getAllParams".equals(optJSONObject.optString("action"))) {
                JsonObject c = com.meituan.android.neohybrid.v2.neo.tunnel.a.a().c(e());
                e().a(TunnelParamJSHandler.NAME, new JSONObject());
                if (c != null) {
                    Map<String, JsonObject> b = com.meituan.android.neohybrid.v2.neo.params.a.b(e());
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
