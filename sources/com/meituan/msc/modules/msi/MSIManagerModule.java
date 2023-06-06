package com.meituan.msc.modules.msi;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.msc.b;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.modules.api.msi.g;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.n;
import com.meituan.msc.modules.page.e;
import com.meituan.msc.modules.page.o;
import com.meituan.msc.modules.page.render.webview.q;
import com.meituan.msc.modules.viewmanager.h;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.api.c;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.msi.bean.EventType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "MSIManager")
/* loaded from: classes3.dex */
public final class MSIManagerModule extends g implements a {
    public static ChangeQuickRedirect e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface JSMSIBridge extends JavaScriptModule {
        void invokeBack(@NonNull String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface MSIViewModule extends JavaScriptModule {
        void invokeBack(@NonNull String str);
    }

    public static /* synthetic */ void a(MSIManagerModule mSIManagerModule, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, mSIManagerModule, changeQuickRedirect, false, "e5d811a4022d6f92a5349349a144bfe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mSIManagerModule, changeQuickRedirect, false, "e5d811a4022d6f92a5349349a144bfe3");
            return;
        }
        try {
            com.meituan.msc.uimanager.interaction.a g = mSIManagerModule.g();
            if (g == null || !g.e) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(Constants.PARAM_SCOPE);
            String optString2 = jSONObject.optString("name");
            JSONObject jSONObject2 = new JSONObject(str2);
            int optInt = jSONObject2.optInt("statusCode");
            String optString3 = jSONObject2.optString("statusMsg");
            Object[] objArr2 = {optString2, optString, Integer.valueOf(optInt), optString3};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.interaction.a.a;
            if (PatchProxy.isSupport(objArr2, g, changeQuickRedirect2, false, "e8a72e7e79714cb9aa2c821326d2a67d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, g, changeQuickRedirect2, false, "e8a72e7e79714cb9aa2c821326d2a67d");
                return;
            }
            if (g.e && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString)) {
                if ((!"default".equals(optString2) || com.meituan.msc.uimanager.interaction.a.i.contains(optString)) && g.b.getRuntimeDelegate().interactionAPIWhiteListContains(optString2, optString)) {
                    g.b(16, "API failed: " + optString + StringUtil.SPACE + optInt + StringUtil.SPACE + optString3);
                }
            }
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a("[MSIManagerModule@handleAPIFailureForInteraction]", th);
        }
    }

    @MSCMethod(isSync = true)
    public final String syncInvoke(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76dc7d86dbe3e7cb448086b8fd9a6727", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76dc7d86dbe3e7cb448086b8fd9a6727") : super.a(str);
    }

    @MSCMethod
    public final String asyncInvoke(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731d9acda6071d867e220356567f4a8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731d9acda6071d867e220356567f4a8e");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4aaee888806a5c28c9561fefb39196e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4aaee888806a5c28c9561fefb39196e2");
        } else {
            try {
                com.meituan.msc.uimanager.interaction.a g = g();
                if (g != null && g.e) {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString(Constants.PARAM_SCOPE);
                    String optString2 = jSONObject.optString("name");
                    Object[] objArr3 = {optString2, optString};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.uimanager.interaction.a.a;
                    if (PatchProxy.isSupport(objArr3, g, changeQuickRedirect3, false, "0a1fd97e4324edfdf913850fbe92eb3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, g, changeQuickRedirect3, false, "0a1fd97e4324edfdf913850fbe92eb3d");
                    } else if (g.e && !TextUtils.isEmpty(optString2) && ((!"default".equals(optString2) || com.meituan.msc.uimanager.interaction.a.i.contains(optString)) && g.b.getRuntimeDelegate().interactionAPIWhiteListContains(optString2, optString))) {
                        g.b(8, "triggerd by API " + optString);
                    }
                }
            } catch (Throwable th) {
                com.meituan.msc.modules.reporter.g.a("[MSIManagerModule@handleAPIRequestForInteraction]", th);
            }
        }
        return super.a(str, (c) new c<String>() { // from class: com.meituan.msc.modules.msi.MSIManagerModule.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.c
            public final /* synthetic */ void a(String str2) {
                String str3 = str2;
                Object[] objArr4 = {str3};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cef9494b189e0e8d49837e4a6093107f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cef9494b189e0e8d49837e4a6093107f");
                    return;
                }
                MSIManagerModule.a(MSIManagerModule.this, str, str3);
                MSIManagerModule.this.b(str3);
            }

            @Override // com.meituan.msi.api.c
            public final /* synthetic */ void b(String str2) {
                String str3 = str2;
                Object[] objArr4 = {str3};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dbe36e1b880a4dc9dff9e7a6b7bdcc60", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dbe36e1b880a4dc9dff9e7a6b7bdcc60");
                } else {
                    MSIManagerModule.this.b(str3);
                }
            }
        });
    }

    private com.meituan.msc.uimanager.interaction.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84bd8f6e08dfe5e641b33ea05dedbd01", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.uimanager.interaction.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84bd8f6e08dfe5e641b33ea05dedbd01");
        }
        e g = U_().b().g();
        if ((g instanceof o) && U_().r.o(g.f()) == b.NATIVE) {
            k f = ((o) g).f(UIManagerModule.NAME);
            if (f instanceof h) {
                return ((h) f).c.c;
            }
            return null;
        }
        return null;
    }

    @MSCMethod
    public final String asyncInvokeWithPromise(String str, final n nVar) {
        Object[] objArr = {str, nVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0204a0c1f1a9f727b21d5bab1a37685a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0204a0c1f1a9f727b21d5bab1a37685a") : super.a(str, (c) new c<String>() { // from class: com.meituan.msc.modules.msi.MSIManagerModule.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.c
            public final /* synthetic */ void a(String str2) {
                String str3 = str2;
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "034d529a542326e11c57d0341feaa2db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "034d529a542326e11c57d0341feaa2db");
                } else if (nVar != null) {
                    nVar.a(str3);
                }
            }

            @Override // com.meituan.msi.api.c
            public final /* synthetic */ void b(String str2) {
                String str3 = str2;
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f50fb4e74795b534077273887622db0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f50fb4e74795b534077273887622db0");
                } else if (nVar != null) {
                    nVar.a(str3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2adc390984e8b4cc05866b30c730e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2adc390984e8b4cc05866b30c730e7");
            return;
        }
        JSMSIBridge jSMSIBridge = (JSMSIBridge) U_().b(JSMSIBridge.class);
        if (jSMSIBridge != null) {
            jSMSIBridge.invokeBack(str);
            return;
        }
        com.meituan.msc.modules.reporter.g.e("MSCMsi", "msiInvokeBack when service is not ready" + str);
    }

    @Override // com.meituan.msc.modules.api.msi.g, com.meituan.msi.dispather.d
    public final void a(EventType eventType, String str, String str2, BroadcastEvent broadcastEvent) {
        Object[] objArr = {eventType, str, str2, broadcastEvent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b9661f6793ff45510e4b5a190e89a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b9661f6793ff45510e4b5a190e89a9");
        } else if ((this.d == null || !this.d.a(str, str2)) && !a(eventType, str2, broadcastEvent)) {
            b(str2);
        }
    }

    private boolean a(EventType eventType, String str, BroadcastEvent broadcastEvent) {
        int i;
        e g;
        q qVar;
        com.meituan.msc.modules.page.render.webview.n nVar;
        Object[] objArr = {eventType, str, broadcastEvent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d71aeb5f0422fbed781e3cfdece1dcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d71aeb5f0422fbed781e3cfdece1dcd")).booleanValue();
        }
        if (eventType == EventType.VIEW_EVENT && broadcastEvent != null) {
            Map<String, String> uiData = broadcastEvent.getUiData();
            if (uiData != null) {
                String str2 = uiData.get("pageId");
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                    }
                    if (i < 0 && (g = g(i)) != null && (qVar = (q) g.b(q.class)) != null && (nVar = qVar.b) != null) {
                        ((MSIViewModule) nVar.a(MSIViewModule.class)).invokeBack(str);
                        return true;
                    }
                    com.meituan.msc.modules.reporter.g.e("MSIManager unhandledViewEvent", Integer.valueOf(i), str);
                }
            }
            i = -1;
            if (i < 0) {
            }
            com.meituan.msc.modules.reporter.g.e("MSIManager unhandledViewEvent", Integer.valueOf(i), str);
        }
        return false;
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd214de80b05f5edeba4f4519002ee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd214de80b05f5edeba4f4519002ee1");
        } else {
            this.b.b(str, obj);
        }
    }

    @Override // com.meituan.msc.modules.api.msi.g, com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3496a803cc1e1775506a8e70d35ea5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3496a803cc1e1775506a8e70d35ea5b");
        } else {
            O_();
        }
    }

    @Override // com.meituan.msc.modules.msi.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158e79400d1c4cfd9da63771dd24beb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158e79400d1c4cfd9da63771dd24beb9");
        } else {
            this.b.a(f());
        }
    }

    @Override // com.meituan.msc.modules.msi.a
    public final ApiPortal c() {
        return this.b;
    }
}
