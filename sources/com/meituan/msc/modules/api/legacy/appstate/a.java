package com.meituan.msc.modules.api.legacy.appstate;

import com.facebook.react.modules.appstate.AppStateModule;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.b;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = AppStateModule.NAME)
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a = null;
    public static final String b = "a";
    private volatile String c;
    private final AppBus.OnForegroundListener d;
    private final AppBus.OnBackgroundListener e;

    @MSCMethod
    public void addListener(String str) {
    }

    @MSCMethod
    public void removeListeners(double d) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454b49c374ff181d081fd80fdda4e817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454b49c374ff181d081fd80fdda4e817");
            return;
        }
        this.d = new AppBus.OnForegroundListener() { // from class: com.meituan.msc.modules.api.legacy.appstate.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
            public final void onForeground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aab05fb18a85a05da956279e9bc2d165", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aab05fb18a85a05da956279e9bc2d165");
                    return;
                }
                a.this.c = AppStateModule.APP_STATE_ACTIVE;
                a.this.c().onNativeAppEnterForeground();
            }
        };
        this.e = new AppBus.OnBackgroundListener() { // from class: com.meituan.msc.modules.api.legacy.appstate.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
            public final void onBackground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "076f3b48923d1a246e1e8a3e97b142fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "076f3b48923d1a246e1e8a3e97b142fc");
                    return;
                }
                a.this.c = "background";
                a.this.c().onNativeAppEnterBackground();
            }
        };
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa93522abbe4c9a3043f8c6bafc15d8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa93522abbe4c9a3043f8c6bafc15d8e");
            return;
        }
        super.a(hVar);
        AppBus.getInstance().register(this.d, true);
        AppBus.getInstance().register(this.e, true);
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f289c5a8f9ba39377472f8a41a405b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f289c5a8f9ba39377472f8a41a405b44");
            return;
        }
        AppBus.getInstance().unregister(this.e);
        AppBus.getInstance().unregister(this.d);
        super.L_();
    }

    private JSONObject d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4820ed06e474f4a34874b4ba3c12639f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4820ed06e474f4a34874b4ba3c12639f");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("initialAppState", this.c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @MSCMethod
    public void getCurrentAppState(b<JSONObject> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859c3c99853e3c7cc775133099594bd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859c3c99853e3c7cc775133099594bd9");
        } else {
            bVar.a(e());
        }
    }

    @MSCMethod(isSync = true)
    public JSONObject getCurrentAppStateSync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "015743499f951d6322657a5b5bc1639b", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "015743499f951d6322657a5b5bc1639b") : e();
    }

    private JSONObject e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f404f864eec54990f66ce36bb429bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f404f864eec54990f66ce36bb429bb");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_state", this.c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            jSONObject.put("msc_state", U_().b().f() ? "foreground" : "background");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.meituan.msc.modules.manager.k
    @Nullable
    public final JSONObject N_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a748351231bb87f21b8fd47479624e6e", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a748351231bb87f21b8fd47479624e6e") : d();
    }

    public final void a(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4efd64b569bf9e845a8c24da78937596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4efd64b569bf9e845a8c24da78937596");
        } else if (z) {
            c().onAppEnterForeground(str, i);
        } else {
            ((WidgetListener) U_().a(WidgetListener.class)).onWidgetEnterForeground(str, i);
        }
    }

    public final void b(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d85404c3b161b60936094631c8a629e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d85404c3b161b60936094631c8a629e4");
        } else if (z) {
            c().onAppEnterBackground(str, i);
        } else {
            ((WidgetListener) U_().a(WidgetListener.class)).onWidgetEnterBackground(str, i);
        }
    }

    public final AppListener c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4d400a840907d2975e32cabdbb3831", RobustBitConfig.DEFAULT_VALUE) ? (AppListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4d400a840907d2975e32cabdbb3831") : (AppListener) U_().a(AppListener.class, (NativeModuleCallExceptionHandler) null);
    }
}
