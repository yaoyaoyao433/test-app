package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.contextual.computing.storage.sp.ContextualComputingSP;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "LocationHornConfigInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93f656fa2cea6971fbfa0536b7109b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93f656fa2cea6971fbfa0536b7109b17");
            return;
        }
        Horn.register("location_failed_strategy", new HornCallback() { // from class: com.sankuai.waimai.launcher.init.secondary.n.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d38eba3d8ef32c2c1f7fac20d1fb776e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d38eba3d8ef32c2c1f7fac20d1fb776e");
                } else if (!z || TextUtils.isEmpty(str)) {
                    PageSP.a(false);
                } else {
                    try {
                        JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
                        if (asJsonObject != null && "A".equals(asJsonObject.get("strategy").getAsString())) {
                            PageSP.a(true);
                        } else {
                            PageSP.a(false);
                        }
                    } catch (Exception unused) {
                        PageSP.a(false);
                    }
                }
            }
        });
        Horn.debug(application, "wm_address_recommend", com.sankuai.meituan.takeoutnew.a.f);
        Horn.register("wm_address_recommend", new HornCallback() { // from class: com.sankuai.waimai.launcher.init.secondary.n.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e18ce1fa7b664eda7a7ecfa5d16f43ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e18ce1fa7b664eda7a7ecfa5d16f43ad");
                    return;
                }
                com.sankuai.waimai.contextual.computing.config.a aVar = new com.sankuai.waimai.contextual.computing.config.a();
                if (!z || TextUtils.isEmpty(str)) {
                    aVar.b = false;
                    aVar.c = -1;
                    aVar.d = 1;
                    aVar.e = 3;
                    aVar.f = 5;
                    aVar.g = 1;
                    aVar.h = 100;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject("wm_address_recommend");
                        aVar.b = jSONObject.optBoolean("wm_address_recommend_switch", false);
                        aVar.c = jSONObject.optInt("wm_match_failed", -1);
                        aVar.d = jSONObject.optInt("wm_match_success", 1);
                        aVar.e = jSONObject.optInt("wm_order_match_failed", 3);
                        aVar.f = jSONObject.optInt("wm_order_match_success", 5);
                        aVar.g = jSONObject.optInt("wm_valid_day", 1);
                        aVar.h = jSONObject.optInt("wm_record_count", 100);
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
                ContextualComputingSP.a(aVar);
            }
        });
    }
}
