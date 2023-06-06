package com.meituan.android.mrn.module;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.module.utils.b;
import com.meituan.android.mrn.monitor.c;
import com.meituan.android.mrn.network.d;
import com.meituan.android.mrn.network.h;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = MRNRequestModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNRequestModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNNetwork";
    public static ChangeQuickRedirect changeQuickRedirect;
    private d mapiRequestImpl;
    private h requestImpl;

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNRequestModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f37c583eefc004159144ecb38bdc71e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f37c583eefc004159144ecb38bdc71e5");
            return;
        }
        this.mapiRequestImpl = new d(reactApplicationContext);
        this.requestImpl = new h(reactApplicationContext);
    }

    @ReactMethod
    public void request(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "527658dbd1e76ac7f3fc04d4d16c709e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "527658dbd1e76ac7f3fc04d4d16c709e");
        } else if (this.requestImpl == null) {
        } else {
            JSONObject jSONObject = new JSONObject(g.a(readableMap));
            try {
                jSONObject.put("originalParams", g.c(jSONObject));
                k a = r.a(getReactApplicationContext());
                if (a != null && a.i != null) {
                    String str = a.i.c;
                    String str2 = a.i.f;
                    jSONObject.put("rn_bundle_name", str);
                    jSONObject.put("rn_bundle_version", str2);
                    jSONObject.put("rn_bundle_component_name", a.l);
                    JSONObject optJSONObject = jSONObject.optJSONObject("params");
                    if (optJSONObject != null) {
                        optJSONObject.put("rn_bundle_version", b.a(a));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.meituan.hotel.android.hplus.diagnoseTool.b.b();
            final String a2 = com.meituan.hotel.android.hplus.diagnoseTool.b.a(jSONObject, SocialConstants.TYPE_REQUEST);
            k a3 = r.a(getReactApplicationContext());
            if (a3 != null && a3.i != null && a3.r != null && a3.r.c != null) {
                c cVar = a3.r.c;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "085196110c578c68fd600c220db17560", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "085196110c578c68fd600c220db17560");
                } else if (cVar.b.firstNetworkTime <= 0) {
                    cVar.b.firstNetworkTime = System.currentTimeMillis();
                }
            }
            this.requestImpl.a(jSONObject, new com.meituan.android.mrn.module.utils.c() { // from class: com.meituan.android.mrn.module.MRNRequestModule.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(JSONObject jSONObject2) {
                    Object[] objArr3 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "495c1984951ac73b7977f45a2f1e7659", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "495c1984951ac73b7977f45a2f1e7659");
                        return;
                    }
                    try {
                        promise.resolve(g.a(jSONObject2.optJSONObject("data")));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    com.meituan.hotel.android.hplus.diagnoseTool.b.b();
                }

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(String str3, Throwable th, JSONObject jSONObject2) {
                    Object[] objArr3 = {str3, th, jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5d0d6321542ced4360f238a7e5e81497", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5d0d6321542ced4360f238a7e5e81497");
                        return;
                    }
                    promise.reject(str3, th, MRNRequestModule.this.getUserInfo(jSONObject2, readableMap));
                    com.meituan.hotel.android.hplus.diagnoseTool.b.b();
                }
            });
        }
    }

    @ReactMethod
    public void mapi(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e16311ee2bac167e9432ed6628f5a9ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e16311ee2bac167e9432ed6628f5a9ee");
        } else if (this.mapiRequestImpl == null) {
        } else {
            JSONObject jSONObject = new JSONObject(g.a(readableMap));
            com.meituan.hotel.android.hplus.diagnoseTool.b.b();
            final String a = com.meituan.hotel.android.hplus.diagnoseTool.b.a(jSONObject, "mapi");
            this.mapiRequestImpl.a(jSONObject, new com.meituan.android.mrn.module.utils.c() { // from class: com.meituan.android.mrn.module.MRNRequestModule.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(JSONObject jSONObject2) {
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e6ebd554540d9d8f43c751edabbe3a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e6ebd554540d9d8f43c751edabbe3a9");
                        return;
                    }
                    try {
                        Object opt = jSONObject2.opt("data");
                        if (opt instanceof String) {
                            promise.resolve(opt);
                        } else if (opt instanceof JSONObject) {
                            promise.resolve(g.a(jSONObject2.optJSONObject("data")));
                        } else if (opt instanceof JSONArray) {
                            promise.resolve(g.a(jSONObject2.optJSONArray("data")));
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    com.meituan.hotel.android.hplus.diagnoseTool.b.b();
                }

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(String str, Throwable th, JSONObject jSONObject2) {
                    Object[] objArr2 = {str, th, jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b6e8da18411056ee5a813be10441cb14", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b6e8da18411056ee5a813be10441cb14");
                        return;
                    }
                    promise.reject(str, th, MRNRequestModule.this.getUserInfo(jSONObject2, readableMap));
                    com.meituan.hotel.android.hplus.diagnoseTool.b.b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getUserInfo(JSONObject jSONObject, ReadableMap readableMap) {
        Object[] objArr = {jSONObject, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db799e5017d59c8f1b16c6f25d205d6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db799e5017d59c8f1b16c6f25d205d6d");
        }
        WritableMap writableMap = null;
        if (jSONObject != null) {
            try {
                writableMap = g.a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (writableMap == null) {
            writableMap = Arguments.createMap();
        }
        if (readableMap instanceof ReadableNativeMap) {
            WritableMap createMap = Arguments.createMap();
            createMap.merge(readableMap);
            writableMap.putMap("param", createMap);
        } else if (readableMap != null) {
            com.meituan.android.mrn.utils.c.a("[MRNRequestModule@getUserInfo]", readableMap.getClass().getName());
        }
        return writableMap;
    }
}
