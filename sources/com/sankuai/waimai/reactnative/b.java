package com.sankuai.waimai.reactnative;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static String b = "CIP_KEY_WAIMI_MRN_FMP";
    private static boolean c = false;
    private static List<String> d;
    private static boolean e;
    private static boolean f;
    private static ArrayList<String> g;

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9278231a310756321ff7e85aab19d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9278231a310756321ff7e85aab19d1a");
            return;
        }
        try {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d1388e4c57546ea1a01c3cbe2e0406e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d1388e4c57546ea1a01c3cbe2e0406e3");
            } else {
                b(true, com.meituan.android.mrn.common.b.b(context, b, ""), context, true);
            }
            Horn.register("waimai_android_fmp", new HornCallback() { // from class: com.sankuai.waimai.reactnative.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02995b83ce36dc90d0d9cb8e08928239", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02995b83ce36dc90d0d9cb8e08928239");
                    } else {
                        b.b(z, str, context, false);
                    }
                }
            });
        } catch (Exception e2) {
            com.facebook.common.logging.a.d("mrn.horn.waimai_android_fmp OUT", "init exception", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z, String str, Context context, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, context, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b900f6bde030a5c2f41612b97ba5c599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b900f6bde030a5c2f41612b97ba5c599");
            return;
        }
        if (z) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!z2) {
                        com.meituan.android.mrn.common.b.a(context, b, str);
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    c = jSONObject.optBoolean("sdkEnable");
                    JSONArray optJSONArray = jSONObject.optJSONArray("pageBlacklist");
                    d = new ArrayList();
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            d.add((String) optJSONArray.get(i));
                        }
                    }
                    e = jSONObject.optBoolean("defaultSamplingRate");
                    f = jSONObject.optBoolean("specifySamplingRate");
                    g = new ArrayList<>();
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("specifySamplingList");
                    if (optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            g.add((String) optJSONArray2.get(i2));
                        }
                        return;
                    }
                    return;
                }
            } catch (Exception e2) {
                com.facebook.common.logging.a.d("mrn.horn.waimai_android_fmp", "updateByFmpHorn exception", e2);
                return;
            }
        }
        c = false;
        e = false;
        f = false;
    }
}
