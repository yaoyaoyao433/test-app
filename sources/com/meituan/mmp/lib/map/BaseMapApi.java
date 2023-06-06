package com.meituan.mmp.lib.map;

import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.widget.FrameLayout;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.embeddedwidget.k;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseMapApi extends NativeViewApi<FrameLayout> {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "mapId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ FrameLayout b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45030f1021211b63797a4b91561112fb", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45030f1021211b63797a4b91561112fb") : new e(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.meituan.mmp.lib.embeddedwidget.d dVar, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, dVar, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0837979ca15b9f2db533c231cd8b380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0837979ca15b9f2db533c231cd8b380");
            return;
        }
        com.meituan.mmp.lib.trace.b.e("embed widget render error " + str);
        dVar.a(false);
        com.meituan.mmp.lib.embeddedwidget.h.a(jSONObject);
        a(jSONObject, d(jSONObject));
        com.meituan.mmp.lib.embeddedwidget.h.a(iApiCallback, str);
        com.meituan.mmp.lib.trace.b.b("MapApi insertMapView isEmbed degrade:", jSONObject.toString());
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5781013f4cc0e15e309991fce6bf56b", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5781013f4cc0e15e309991fce6bf56b") : new String[]{"insertMap", "removeMap", "updateMap"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, final JSONObject jSONObject, final IApiCallback iApiCallback) throws com.meituan.mmp.lib.api.d {
        boolean z = false;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b23fa75a64a164c4d1496fcbd406e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b23fa75a64a164c4d1496fcbd406e46");
            return;
        }
        char c = 65535;
        if (g.a() == -1) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errMsg", "map sdk not found!");
            } catch (JSONException unused) {
            }
            iApiCallback.onFail(jSONObject2);
        } else if (!g.b()) {
            b.a.c("mtMap not ready");
            iApiCallback.onFail(codeJson(-100, "mtMap not ready"));
        } else {
            int hashCode = str.hashCode();
            if (hashCode != -1949215789) {
                if (hashCode != -384482333) {
                    if (hashCode == 1282356792 && str.equals("removeMap")) {
                        c = 1;
                    }
                } else if (str.equals("insertMap")) {
                    c = 0;
                }
            } else if (str.equals("updateMap")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    Object[] objArr2 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ed0dc21ef2f620650a72f6feb18d222", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ed0dc21ef2f620650a72f6feb18d222");
                        return;
                    }
                    float optDouble = (float) jSONObject.optDouble("centerLongitude", 0.0d);
                    if (Math.abs((float) jSONObject.optDouble("centerLatitude", 0.0d)) > 90.0f || Math.abs(optDouble) > 180.0f) {
                        iApiCallback.onFail(a("centerLatitude or centerLongitude value is error!", new Object[0]));
                        return;
                    }
                    final e eVar = (e) d(jSONObject, iApiCallback);
                    if (eVar == null) {
                        iApiCallback.onFail();
                        return;
                    }
                    eVar.setToken(AbsApi.getToken(jSONObject));
                    boolean optBoolean = jSONObject.optBoolean("mpView_embed_render");
                    com.meituan.mmp.lib.trace.b.b("MapApi insertMapView isEmbed:" + optBoolean, jSONObject.toString());
                    eVar.setMapType(jSONObject.optString("vendor"));
                    eVar.a(optBoolean);
                    eVar.setOnEventListener(this.d);
                    eVar.c = getAppConfig();
                    eVar.a(jSONObject, false, d(jSONObject), a(jSONObject), eVar, a(getPageManager()));
                    eVar.setImportantForAccessibility(4);
                    if (optBoolean) {
                        if (com.meituan.mmp.lib.config.b.D() && !g.c()) {
                            a("can't use embed feature without tencent map", eVar, jSONObject, iApiCallback);
                            if (getAppConfig() != null) {
                                getAppConfig().h.b("mmp.embed.render.error", (Map<String, Object>) v.a(NotificationCompat.CATEGORY_ERROR, "can't use embed feature without tencent map"));
                                return;
                            }
                            return;
                        }
                        final com.meituan.mmp.main.a<Void> aVar = new com.meituan.mmp.main.a<Void>() { // from class: com.meituan.mmp.lib.map.BaseMapApi.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.main.a
                            public final /* synthetic */ void a(Void r12) {
                                Object[] objArr3 = {null};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce3f5ab274b92f006d8bc5792d315202", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce3f5ab274b92f006d8bc5792d315202");
                                } else {
                                    iApiCallback.onSuccess(null);
                                }
                            }

                            @Override // com.meituan.mmp.main.a
                            public final void a(String str2, Exception exc) {
                                Object[] objArr3 = {str2, exc};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1118150c8100e30d4f336291888e71e0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1118150c8100e30d4f336291888e71e0");
                                } else {
                                    BaseMapApi.this.a(str2, eVar, jSONObject, iApiCallback);
                                }
                            }
                        };
                        Object[] objArr3 = {eVar, jSONObject, aVar};
                        ChangeQuickRedirect changeQuickRedirect3 = h;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a72db8d10d7bee50c6410b91c3db4bb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a72db8d10d7bee50c6410b91c3db4bb");
                            return;
                        }
                        final com.meituan.mmp.lib.embeddedwidget.i iVar = new com.meituan.mmp.lib.embeddedwidget.i();
                        final int a = a(jSONObject);
                        iVar.b = new com.meituan.mmp.lib.embeddedwidget.e() { // from class: com.meituan.mmp.lib.map.BaseMapApi.2
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.embeddedwidget.e
                            public final String a() {
                                return "map";
                            }

                            @Override // com.meituan.mmp.lib.embeddedwidget.e
                            public final String b() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f9fb160189903297ef8cf73a41130804", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f9fb160189903297ef8cf73a41130804") : BaseMapApi.this.getAppId();
                            }

                            @Override // com.meituan.mmp.lib.embeddedwidget.e
                            public final int c() {
                                return a;
                            }

                            @Override // com.meituan.mmp.lib.embeddedwidget.e
                            public final String d() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "41ab909f147a362b8e7c55524dd85da7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "41ab909f147a362b8e7c55524dd85da7") : jSONObject.optString("mpView_viewId");
                            }
                        };
                        k.a(iVar, new com.meituan.mmp.main.a<Void>() { // from class: com.meituan.mmp.lib.map.BaseMapApi.3
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.main.a
                            public final /* synthetic */ void a(Void r12) {
                                Object[] objArr4 = {null};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e2394ddc835a7c5c987a220b231670cc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e2394ddc835a7c5c987a220b231670cc");
                                    return;
                                }
                                iVar.a(eVar);
                                if (aVar != null) {
                                    aVar.a(null);
                                }
                            }

                            @Override // com.meituan.mmp.main.a
                            public final void a(String str2, Exception exc) {
                                Object[] objArr4 = {str2, exc};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "74f61635db25161b5f3420851250b24f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "74f61635db25161b5f3420851250b24f");
                                } else if (aVar != null) {
                                    aVar.a(str2, exc);
                                }
                            }
                        }, a(a));
                        return;
                    }
                    iApiCallback.onSuccess(null);
                    return;
                case 1:
                    Object[] objArr4 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect4 = h;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "904ac435abe892a33f058eed6965ef0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "904ac435abe892a33f058eed6965ef0a");
                        return;
                    }
                    CoverViewWrapper c2 = c(jSONObject, iApiCallback);
                    if (c2 == null) {
                        iApiCallback.onFail(a("coverViewContainer is null", new Object[0]));
                        return;
                    }
                    e eVar2 = (e) c2.b(e.class);
                    if (eVar2 == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                        return;
                    }
                    eVar2.setToken(AbsApi.getToken(jSONObject));
                    MTMap map = eVar2.getMap();
                    if (map == null) {
                        iApiCallback.onFail();
                        return;
                    }
                    map.clear();
                    eVar2.d();
                    c2.a();
                    iApiCallback.onSuccess(null);
                    return;
                case 2:
                    Object[] objArr5 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect5 = h;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f61c6e216e92248dbd14127529096bda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f61c6e216e92248dbd14127529096bda");
                        return;
                    }
                    final String d = d(jSONObject);
                    final int a2 = a(jSONObject);
                    CoverViewWrapper c3 = c(jSONObject, iApiCallback);
                    if (c3 == null || c3.b(e.class) == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                        return;
                    }
                    a(jSONObject, d);
                    final e eVar3 = (e) c3.b(e.class);
                    if (eVar3 == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                        return;
                    }
                    eVar3.setToken(AbsApi.getToken(jSONObject));
                    if (!eVar3.b) {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = e.a;
                        if (PatchProxy.isSupport(objArr6, eVar3, changeQuickRedirect6, false, "3f7699ed571fe224a3afecc77a80ee67", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr6, eVar3, changeQuickRedirect6, false, "3f7699ed571fe224a3afecc77a80ee67")).booleanValue();
                        } else if (eVar3.h != null && eVar3.h.g()) {
                            z = true;
                        }
                        if (!z) {
                            com.meituan.mmp.lib.trace.b.c("updateCoverView rebind client");
                            k.a(eVar3.getMPWidget(), new com.meituan.mmp.main.a<Void>() { // from class: com.meituan.mmp.lib.map.BaseMapApi.4
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.mmp.main.a
                                public final /* synthetic */ void a(Void r11) {
                                    Object[] objArr7 = {null};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "bb8aa2e501606c8e6497523b02c37625", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "bb8aa2e501606c8e6497523b02c37625");
                                        return;
                                    }
                                    com.meituan.mmp.lib.trace.b.c("updateCoverView rebind client success");
                                    BaseMapApi.this.a(jSONObject, iApiCallback, d, a2, eVar3);
                                }

                                @Override // com.meituan.mmp.main.a
                                public final void a(String str2, Exception exc) {
                                    Object[] objArr7 = {str2, exc};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0b40d379bf1b148a9ed1da6946f759e0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0b40d379bf1b148a9ed1da6946f759e0");
                                        return;
                                    }
                                    com.meituan.mmp.lib.trace.b.c("updateCoverView rebind client failed");
                                    iApiCallback.onFail(AbsApi.codeJson(-101, str2));
                                }
                            }, a(a2));
                        }
                    }
                    a(jSONObject, iApiCallback, d, a2, eVar3);
                    return;
                default:
                    super.invoke(str, jSONObject, iApiCallback);
                    return;
            }
        }
    }

    public final e b(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "889ad5b5baefddca68eb82063c58dc22", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "889ad5b5baefddca68eb82063c58dc22");
        }
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c == null) {
            iApiCallback.onFail(a("coverViewContainer is null", new Object[0]));
            return null;
        }
        e eVar = (e) c.b(e.class);
        if (eVar == null) {
            iApiCallback.onFail(a("view not found!", new Object[0]));
            return null;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, IApiCallback iApiCallback, String str, int i, e eVar) {
        Object[] objArr = {jSONObject, iApiCallback, str, Integer.valueOf(i), eVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9744fc266215c19e79d401eff1043820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9744fc266215c19e79d401eff1043820");
        } else if (eVar.getMap() == null) {
            iApiCallback.onFail();
            com.meituan.mmp.lib.trace.b.d("maybe map has destroy!");
        } else {
            eVar.a(jSONObject, true, str, i, eVar, a(getPageManager()));
            iApiCallback.onSuccess(null);
        }
    }

    private com.meituan.mmp.lib.widget.f a(ab abVar) {
        com.meituan.mmp.lib.page.e e;
        Object[] objArr = {abVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8347aafbf9e55318d5b4980c3cbf334f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.widget.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8347aafbf9e55318d5b4980c3cbf334f");
        }
        if (abVar == null || (e = abVar.e()) == null) {
            return null;
        }
        return e.getSwipeRefreshLayout();
    }
}
