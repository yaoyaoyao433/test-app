package com.meituan.android.mrn.module;

import android.content.Context;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.android.mrn.common.b;
import com.meituan.android.mrn.debug.a;
import com.meituan.android.mrn.engine.g;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.x;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.collection.c;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = "MRNDebugModule")
/* loaded from: classes2.dex */
public class MRNDebugModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNDebugModule";
    private static final String TAG = "MRNDebugModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNDebugModule";
    }

    public MRNDebugModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf58df2737ecf86b2979f89136e23dfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf58df2737ecf86b2979f89136e23dfa");
        } else {
            this.mContext = reactApplicationContext;
        }
    }

    @ReactMethod
    public void reload() {
        final ReactInstanceManager reactInstanceManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41b5f00a7d9c8ce97246ca10f52b0cfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41b5f00a7d9c8ce97246ca10f52b0cfb");
            return;
        }
        k a = r.a(getReactApplicationContext());
        if (a == null || (reactInstanceManager = a.b) == null || !a.a()) {
            return;
        }
        ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.MRNDebugModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "31d4c3d928b3290b9c77c0679c29683f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "31d4c3d928b3290b9c77c0679c29683f");
                } else {
                    reactInstanceManager.getDevSupportManager();
                }
            }
        });
    }

    @ReactMethod
    public void getStorageInfo(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce7d6ba21a6cea927d8dbcbca4a4be22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce7d6ba21a6cea927d8dbcbca4a4be22");
            return;
        }
        x.a().k();
        c cVar = new c(this.mContext, b.a(this.mContext), "mrn_bundle_manage_bundle_info", com.meituan.android.mrn.utils.collection.b.c, new com.meituan.android.mrn.utils.collection.b<g>() { // from class: com.meituan.android.mrn.module.MRNDebugModule.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.utils.collection.b
            public final /* synthetic */ g a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "98502608e16c693660ea34ab730b20cd", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "98502608e16c693660ea34ab730b20cd") : (g) com.meituan.android.mrn.utils.g.a(str, g.class);
            }

            @Override // com.meituan.android.mrn.utils.collection.b
            public final /* synthetic */ String a(g gVar) {
                g gVar2 = gVar;
                Object[] objArr2 = {gVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1fe65668e527b582c6d9d0c95ca3a964", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1fe65668e527b582c6d9d0c95ca3a964") : com.meituan.android.mrn.utils.g.a(gVar2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (String str : cVar.keySet()) {
            g gVar = (g) cVar.get(str);
            if (gVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", gVar.b + CommonConstant.Symbol.UNDERLINE + gVar.d);
                    jSONObject.put("activeTime", gVar.e > 0 ? simpleDateFormat.format(Long.valueOf(gVar.e)) : "0");
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        WritableMap createMap = Arguments.createMap();
        Iterator<JsonElement> it = new JsonParser().parse(jSONArray.toString()).getAsJsonArray().iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            createMap.putString(next.getAsJsonObject().get("name").getAsString(), next.getAsJsonObject().get("activeTime").getAsString());
        }
        promise.resolve(createMap);
    }
}
