package com.meituan.mmp.lib.api.fehorn;

import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.config.b;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FeHornConfig extends ApiFunction<JSONObject, JSONObject> {
    public static ChangeQuickRedirect b;
    public static boolean c;

    @Override // com.meituan.mmp.lib.api.ApiFunction
    public final /* synthetic */ void a(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        JSONObject jSONObject2 = jSONObject;
        Object[] objArr = {str, jSONObject2, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a84fd9e51479d3bce9be88286cf8431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a84fd9e51479d3bce9be88286cf8431");
            return;
        }
        try {
            Object[] objArr2 = {jSONObject2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "162c121d2a9a91a7b68e83db85333a0b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "162c121d2a9a91a7b68e83db85333a0b");
                return;
            }
            String optString = jSONObject2.optString("file");
            if (c) {
                String optString2 = jSONObject2.optString("key");
                String accessCache = Horn.accessCache(optString);
                if (TextUtils.isEmpty(accessCache)) {
                    iApiCallback.onFail(codeJson(-1, "fail : config is empty"));
                    return;
                }
                JSONObject jSONObject3 = new JSONObject(accessCache);
                if (TextUtils.isEmpty(optString2)) {
                    iApiCallback.onSuccess(new JSONObject().put("data", accessCache));
                    return;
                } else {
                    iApiCallback.onSuccess(new JSONObject().put("data", jSONObject3.get(optString2)));
                    return;
                }
            }
            iApiCallback.onFail(codeJson(-1, "fail : not registered"));
        } catch (Exception e) {
            iApiCallback.onFail(codeJson(-1, "invoke api failed:" + e.toString()));
        }
    }

    @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
    public boolean isActivityApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d55867b960af207d18bfb82909fcf58f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d55867b960af207d18bfb82909fcf58f")).booleanValue();
        }
        if (b.a()) {
            return false;
        }
        return super.isActivityApi();
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90489d335d8774a90b60e5bb797d13ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90489d335d8774a90b60e5bb797d13ff");
            return;
        }
        Horn.register("mmp_fe_framework", new HornCallback() { // from class: com.meituan.mmp.lib.api.fehorn.FeHornConfig.1
            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
            }
        });
        c = true;
    }
}
