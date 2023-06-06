package com.meituan.android.mrn.monitor;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.e;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.android.mrn.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2 A[Catch: JSONException -> 0x00ac, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00ac, blocks: (B:23:0x009a, B:25:0x00a2), top: B:42:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r23, com.facebook.react.bridge.ReadableArray r24, org.json.JSONObject r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.monitor.k.a(java.lang.String, com.facebook.react.bridge.ReadableArray, org.json.JSONObject, java.lang.String):java.lang.String");
    }

    public static JSONObject a(com.meituan.android.mrn.engine.k kVar, MRNExceptionsManagerModule.b bVar) throws JSONException {
        String sb;
        ReadableMap map;
        boolean z = false;
        Object[] objArr = {kVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7f97ad9ba54c1d4c73ce591b99a2372", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7f97ad9ba54c1d4c73ce591b99a2372");
        }
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (kVar != null && kVar.i != null) {
            jSONObject.put("pageUrl", kVar.l);
            if (kVar.i.e() != null && kVar.i.c != null && kVar.i.f != null) {
                jSONObject.put("resourceUrl", String.format("%s/%s/%s%s", kVar.i.c, kVar.i.f, String.valueOf(kVar.i.l), "index.js"));
            }
            if (!bVar.b && !TextUtils.isEmpty(bVar.c) && bVar.c.contains("Requiring unknown module")) {
                String b = b(kVar);
                if (!TextUtils.isEmpty(b)) {
                    jSONObject.put("bundleMD5", b);
                }
            }
        }
        jSONObject.put("Props", a(kVar));
        Object[] objArr2 = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "063b81fe7201e14d8af78ee02ff1b7a0", RobustBitConfig.DEFAULT_VALUE)) {
            sb = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "063b81fe7201e14d8af78ee02ff1b7a0");
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (kVar == null) {
                sb2.append("MRNInstance 为空");
            } else if (kVar.b == null) {
                sb2.append("ReactInstanceManager 为空");
            } else if (kVar.b.getCurrentReactContext() == null) {
                sb2.append("ReactContext 为空");
            } else if (!(kVar.b.getCurrentReactContext().getCatalystInstance() instanceof CatalystInstanceImpl)) {
                sb2.append("CatalystInstance 为空");
            } else {
                List<String> loadedJSList = kVar.b.getCurrentReactContext().getCatalystInstance().getLoadedJSList();
                if (loadedJSList != null && loadedJSList.size() > 0) {
                    sb2.append(loadedJSList.toString());
                } else {
                    sb2.append("引擎列表为空");
                }
            }
            sb = sb2.toString();
        }
        jSONObject.put("引擎列表", sb);
        if (bVar.h != null && bVar.h.size() > 0) {
            for (Map.Entry<String, String> entry : bVar.h.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Object[] objArr3 = {kVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "44748d771fa2a5cf86f5202c4b78b928", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "44748d771fa2a5cf86f5202c4b78b928")).booleanValue();
        } else if (kVar != null && kVar.b != null && !kVar.b.hasAttachedRootView()) {
            z = true;
        }
        jSONObject.put("isBaseError", z);
        if (bVar.e != null) {
            try {
                if (bVar.e.hasKey("nativeStackAndroid")) {
                    jSONObject.put("nativeStackAndroid", bVar.e.getArray("nativeStackAndroid"));
                }
                if (bVar.e.hasKey("userInfo") && (map = bVar.e.getMap("userInfo")) != null) {
                    jSONObject.put("userInfo", new JSONObject(com.meituan.android.mrn.utils.g.a(map)));
                }
            } catch (Throwable th) {
                com.meituan.android.mrn.utils.c.a("[MRNJsErrorUtil@getUserInfo]", th);
            }
        }
        if (!bVar.f && kVar != null && kVar.i != null) {
            jSONObject.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, kVar.i.c);
        }
        if (bVar.g) {
            jSONObject.put("isRetryError", true);
        }
        return jSONObject;
    }

    private static String b(com.meituan.android.mrn.engine.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c44a851c5a45fc84f0f8724f4f2a6567", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c44a851c5a45fc84f0f8724f4f2a6567");
        }
        if (kVar == null || kVar.i == null) {
            return null;
        }
        try {
            com.meituan.android.mrn.engine.e eVar = kVar.i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(a(eVar));
            if (eVar.n != null && eVar.n.size() > 0) {
                for (e.a aVar : eVar.n) {
                    if (aVar != null) {
                        arrayList.add(a(MRNBundleManager.sharedInstance().getBundle(aVar.b, aVar.c)));
                    }
                }
            }
            arrayList.add(a(kVar.j));
            return arrayList.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String a(com.meituan.android.mrn.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "822bb17c650d2d08c235ffdbe0a99706", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "822bb17c650d2d08c235ffdbe0a99706");
        }
        if (eVar != null && !TextUtils.isEmpty(eVar.e())) {
            str = eVar.c + CommonConstant.Symbol.UNDERLINE + eVar.f + CommonConstant.Symbol.COLON + com.meituan.android.mrn.utils.j.a(eVar.c());
        }
        return str == null ? "" : str;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "232df2dd05d6ca87ec812499344abd3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "232df2dd05d6ca87ec812499344abd3f");
        }
        if (str != null) {
            String[] split = str.split("\n");
            String str2 = (split == null || split[0] == null) ? str : split[0];
            if (!TextUtils.isEmpty(str2)) {
                str = str2.length() > 200 ? str2.substring(0, 200) : str2;
            }
        }
        return TextUtils.isEmpty(str) ? "default" : str;
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2e9963943460a3fd7ff8a6f30b198e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2e9963943460a3fd7ff8a6f30b198e3");
        }
        if (context == null) {
            return "未知";
        }
        try {
            com.meituan.android.mrn.config.d.a(context).a();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "未知";
    }

    private static Object a(com.meituan.android.mrn.engine.k kVar) {
        Bundle h;
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d8e4335535f23e4cd9d9e9441f0147b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d8e4335535f23e4cd9d9e9441f0147b");
        }
        if (kVar == null || kVar.b == null || kVar.b.getCurrentReactContext() == null) {
            return "";
        }
        try {
            com.meituan.android.mrn.container.b a2 = u.a(kVar.b.getCurrentReactContext());
            return (a2 == null || (h = a2.h()) == null) ? "" : new JSONTokener(Arguments.fromBundle(h).toString()).nextValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
