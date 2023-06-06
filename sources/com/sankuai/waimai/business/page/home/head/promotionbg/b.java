package com.sankuai.waimai.business.page.home.head.promotionbg;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @NonNull
    public static PromotionBgResponse a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        PromotionBgResponse promotionBgResponse = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5672e266993a842c5d4fb4e88eb419cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (PromotionBgResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5672e266993a842c5d4fb4e88eb419cd");
        }
        try {
            String optString = new JSONObject(str).optJSONObject("home_rcmd_style").optString("home_atmosphere");
            if (!TextUtils.isEmpty(optString)) {
                promotionBgResponse = (PromotionBgResponse) new Gson().fromJson(optString, new TypeToken<PromotionBgResponse>() { // from class: com.sankuai.waimai.business.page.home.head.promotionbg.b.1
                }.getType());
            }
        } catch (Exception e) {
            i.d(new com.sankuai.waimai.business.page.common.log.a().a("promotion_bg_execption").b("promotion_res_fault").c(e.getMessage()).b());
        }
        return promotionBgResponse != null ? promotionBgResponse : new PromotionBgResponse();
    }
}
