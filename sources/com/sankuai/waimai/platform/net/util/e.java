package com.sankuai.waimai.platform.net.util;

import android.app.Activity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.network.errorhanding.g;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a = null;

    /* renamed from: b */
    public static final int wm_loading_net_error_info = 2131364364;

    /* renamed from: c */
    public static final int wm_net_error_sub_info = 2131364407;
    private static final com.sankuai.waimai.platform.capacity.network.errorhanding.d d = new com.sankuai.waimai.platform.capacity.network.errorhanding.d();

    public static boolean a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb5a3bbca799d2d342456edc71000afa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb5a3bbca799d2d342456edc71000afa")).booleanValue();
        }
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return false;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        JsonElement jsonElement2 = asJsonObject.get("cmd");
        if (jsonElement2 instanceof JsonObject) {
            try {
                com.sankuai.waimai.platform.capacity.network.errorhanding.c.a().a(new JSONObject(jsonElement2.toString()));
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        final int i = -1;
        JsonElement jsonElement3 = asJsonObject.get("code");
        if (jsonElement3 != null && jsonElement3.isJsonPrimitive()) {
            i = jsonElement3.getAsInt();
        }
        final String str = "";
        JsonElement jsonElement4 = asJsonObject.get("msg");
        if (jsonElement4 != null && jsonElement4.isJsonPrimitive()) {
            str = jsonElement4.getAsString();
        }
        if (com.sankuai.waimai.platform.domain.core.response.a.a(i)) {
            com.sankuai.waimai.platform.capacity.network.errorhanding.c.a().a(i, str);
            return true;
        }
        com.sankuai.waimai.platform.capacity.network.errorhanding.d dVar = d;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.capacity.network.errorhanding.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "1acbd875e9c9ce62b42f13f231265930", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "1acbd875e9c9ce62b42f13f231265930")).booleanValue() : dVar.a(i)) {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.net.util.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2545ae40a67d9b0c6a25404af86d702c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2545ae40a67d9b0c6a25404af86d702c");
                    } else if (com.sankuai.waimai.platform.net.main.a.a()) {
                        Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
                        int i2 = i;
                        String str2 = str;
                        if ((b instanceof g) && ((g) b).a()) {
                            z = true;
                        }
                        com.sankuai.waimai.platform.capacity.network.errorhanding.f.a(i2, str2, b, z);
                    }
                }
            });
            return true;
        }
        return false;
    }
}
