package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock;

import android.app.Activity;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.CallbackInfo;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.r;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Activity activity, String str) {
        CallbackInfo callbackInfo;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35378a555d29d2a1349c2ffb9cf80cef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35378a555d29d2a1349c2ffb9cf80cef");
        }
        if (activity == null || aa.a(str) || !(activity instanceof OrderConfirmActivity) || (callbackInfo = ((OrderConfirmActivity) activity).g.y.a().b) == null || callbackInfo.previewOrderCallbackInfo == null) {
            return str;
        }
        JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
        asJsonObject.addProperty("preview_order_callback_info", callbackInfo.previewOrderCallbackInfo);
        return asJsonObject.toString();
    }

    public static void a(Activity activity, Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5787d491f246795d8c94763e19f5d896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5787d491f246795d8c94763e19f5d896");
        } else if (map == null) {
        } else {
            int a2 = r.a(String.valueOf(map.get("not_update")), 1);
            if (activity instanceof OrderConfirmActivity) {
                OrderConfirmActivity orderConfirmActivity = (OrderConfirmActivity) activity;
                orderConfirmActivity.d = true;
                if (a2 == 1) {
                    orderConfirmActivity.e = true;
                }
            }
            if (map.containsKey("apiExtra")) {
                map.put("apiExtra", a(activity, (String) map.get("apiExtra")));
            }
            com.sankuai.waimai.bussiness.order.base.a.a(activity, map);
        }
    }
}
