package com.sankuai.waimai.store.mrn.preload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.module.MRNRequestModule;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.mrn.preload.i;
import com.sankuai.waimai.store.mrn.preload.l;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = MRNRequestModule.MODULE_NAME)
/* loaded from: classes5.dex */
public class SGMRNNetworkModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "SMMRNRequest";
    public static ChangeQuickRedirect changeQuickRedirect;
    private g requestImpl;

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public SGMRNNetworkModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39695bee91cd0c2d0f5bcd025aab5095", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39695bee91cd0c2d0f5bcd025aab5095");
        } else {
            this.requestImpl = new g(reactApplicationContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getUserInfo(JSONObject jSONObject, ReadableMap readableMap) {
        Object[] objArr = {jSONObject, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0755bf7b257573d3c2dab056dc7cff46", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0755bf7b257573d3c2dab056dc7cff46");
        }
        WritableMap writableMap = null;
        if (jSONObject != null) {
            try {
                writableMap = com.meituan.android.mrn.utils.g.a(jSONObject);
            } catch (JSONException e) {
                com.sankuai.waimai.imbase.log.a.a(e);
            }
        }
        if (writableMap == null) {
            writableMap = Arguments.createMap();
        }
        if (readableMap != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.merge(readableMap);
            writableMap.putMap("param", createMap);
        }
        return writableMap;
    }

    @ReactMethod
    public void request(final ReadableMap readableMap, final Promise promise) {
        Throwable th;
        JSONObject jSONObject;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeb38cfe85a13319a3d62c61047db7c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeb38cfe85a13319a3d62c61047db7c5");
        } else if (this.requestImpl == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject(com.meituan.android.mrn.utils.g.a(readableMap));
            try {
                com.meituan.android.mrn.engine.k a = r.a(getReactApplicationContext());
                if (a != null && a.i != null) {
                    String str = a.i.c;
                    String str2 = a.i.f;
                    jSONObject2.put("rn_bundle_name", str);
                    jSONObject2.put("rn_bundle_version", str2);
                    jSONObject2.put("rn_bundle_component_name", a.l);
                    JSONObject optJSONObject = jSONObject2.optJSONObject("params");
                    if (optJSONObject != null) {
                        optJSONObject.put("rn_bundle_version", getBundleSimpleInfo(a));
                    }
                }
            } catch (JSONException e) {
                com.sankuai.waimai.imbase.log.a.a(e);
            }
            try {
                assemble(jSONObject2);
            } catch (Throwable th2) {
                com.sankuai.waimai.imbase.log.a.a(th2);
            }
            final com.meituan.android.mrn.module.utils.c cVar = new com.meituan.android.mrn.module.utils.c() { // from class: com.sankuai.waimai.store.mrn.preload.SGMRNNetworkModule.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(JSONObject jSONObject3) {
                    Object[] objArr2 = {jSONObject3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d8a75f66e267d865963d8047fd4a97f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d8a75f66e267d865963d8047fd4a97f1");
                        return;
                    }
                    try {
                        promise.resolve(com.meituan.android.mrn.utils.g.a(jSONObject3.optJSONObject("data")));
                    } catch (JSONException e2) {
                        com.sankuai.waimai.imbase.log.a.a(e2);
                    }
                }

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(String str3, Throwable th3, JSONObject jSONObject3) {
                    Object[] objArr2 = {str3, th3, jSONObject3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c2a1f96c2a63f58ffdf27f2504bea098", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c2a1f96c2a63f58ffdf27f2504bea098");
                    } else {
                        promise.reject(str3, th3, SGMRNNetworkModule.this.getUserInfo(jSONObject3, readableMap));
                    }
                }
            };
            if (com.sankuai.waimai.store.config.i.h().a(SCConfigPath.PRELOAD_MRN, false)) {
                final g gVar = this.requestImpl;
                Object[] objArr2 = {jSONObject2, cVar};
                ChangeQuickRedirect changeQuickRedirect3 = g.a;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "86b17a8a590ce0c4d52e8af6b54cddbd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "86b17a8a590ce0c4d52e8af6b54cddbd");
                    return;
                }
                o a2 = l.a().a(p.a(e.a(jSONObject2)), new l.a() { // from class: com.sankuai.waimai.store.mrn.preload.g.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.mrn.preload.l.a
                    public final void a(@NonNull m mVar) {
                        Object[] objArr3 = {mVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ef69c3af78c801916e9bbb1bd8d91777", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ef69c3af78c801916e9bbb1bd8d91777");
                            return;
                        }
                        cVar.a(mVar.c);
                        com.sankuai.waimai.store.util.monitor.report.g.a().a(41000, "sg_preload_mrn");
                    }

                    @Override // com.sankuai.waimai.store.mrn.preload.l.a
                    public final void b(@NonNull m mVar) {
                        Object[] objArr3 = {mVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "480de1e1ea8b61847ff8aa3c3afac45e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "480de1e1ea8b61847ff8aa3c3afac45e");
                            return;
                        }
                        cVar.a(mVar.e, mVar.g, mVar.h);
                        com.sankuai.waimai.store.util.monitor.report.g.a().a(41004, "sg_preload_mrn");
                    }
                });
                if (a2.b == null) {
                    gVar.b.a(jSONObject2, cVar);
                    com.sankuai.waimai.store.util.monitor.report.g.a().a(41001, "sg_preload_mrn");
                    return;
                }
                String str3 = null;
                if (a2.b == n.SUCCESS) {
                    cVar.a(a2.c != null ? a2.c.c : null);
                    com.sankuai.waimai.store.util.monitor.report.g.a().a(41000, "sg_preload_mrn");
                    return;
                } else if (a2.b == n.FAILED) {
                    if (a2.c != null) {
                        str3 = a2.c.e;
                        th = a2.c.g;
                        jSONObject = a2.c.h;
                    } else {
                        th = null;
                        jSONObject = null;
                    }
                    cVar.a(str3, th, jSONObject);
                    com.sankuai.waimai.store.util.monitor.report.g.a().a(41004, "sg_preload_mrn");
                    return;
                } else {
                    return;
                }
            }
            this.requestImpl.a(jSONObject2, cVar);
        }
    }

    private void assemble(JSONObject jSONObject) throws Throwable {
        Activity currentActivity;
        Intent intent;
        Uri data;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6844c73d227a008e52686a13a742721b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6844c73d227a008e52686a13a742721b");
        } else if (jSONObject == null || (currentActivity = getCurrentActivity()) == null || (intent = currentActivity.getIntent()) == null || (data = intent.getData()) == null) {
        } else {
            f.a(jSONObject, data);
        }
    }

    @ReactMethod
    public void preRequestWithScheme(String str) {
        j aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62a2bf80c015d40a0ce09ec68767dc36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62a2bf80c015d40a0ce09ec68767dc36");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "50b23752acda33d706d54327fce1bcf9", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (j) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "50b23752acda33d706d54327fce1bcf9");
        } else if (str == null || "".equals(str)) {
            aVar = new i.a();
        } else {
            aVar = i.a(str, null);
        }
        aVar.a();
    }

    public static String getBundleSimpleInfo(com.meituan.android.mrn.engine.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83a0a6e1657aa89fa7e85a1ff56a56bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83a0a6e1657aa89fa7e85a1ff56a56bc");
        }
        if (kVar == null || kVar.i == null) {
            return "";
        }
        com.meituan.android.mrn.engine.e eVar = kVar.i;
        return eVar.c + CommonConstant.Symbol.UNDERLINE + eVar.f;
    }
}
