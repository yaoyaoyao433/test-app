package com.meituan.android.mrn.module.utils;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.utils.r;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";

    public static JSONObject a(ReactApplicationContext reactApplicationContext) {
        String a2;
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "850faf9732c836ac2f069df770f3ec95", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "850faf9732c836ac2f069df770f3ec95");
        }
        com.facebook.common.logging.a.b(b, "KNBBridgeCompatInfo getMRNInfo:");
        JSONObject jSONObject = new JSONObject();
        try {
            k a3 = r.a(reactApplicationContext);
            JSONObject jSONObject2 = new JSONObject();
            com.meituan.android.mrn.engine.e eVar = a3 == null ? null : a3.j;
            jSONObject2.put("MRNVersion", "3.1201.206");
            jSONObject2.put("MRNBaseVersion", eVar == null ? "" : eVar.f);
            com.meituan.android.mrn.engine.e eVar2 = a3 == null ? null : a3.i;
            Object[] objArr2 = {eVar2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0be7297dd7b351ac854c99a9249877be", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0be7297dd7b351ac854c99a9249877be");
            } else {
                a2 = eVar2 == null ? "" : com.meituan.android.mrn.utils.k.a(new DioFile(eVar2.m, "meta.json"));
            }
            if (!TextUtils.isEmpty(a2)) {
                jSONObject2.put("meta", new JSONObject(a2));
            }
            jSONObject.put("status", "success");
            jSONObject.put("data", jSONObject2);
        } catch (Exception e) {
            try {
                jSONObject.put("status", "fail");
                jSONObject.put("errorMsg", e.getMessage());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static String a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e73430a577b45be77ec3d022b035949", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e73430a577b45be77ec3d022b035949");
        }
        if (kVar == null || kVar.i == null) {
            return "";
        }
        com.meituan.android.mrn.engine.e eVar = kVar.i;
        return eVar.c + CommonConstant.Symbol.UNDERLINE + eVar.f;
    }
}
