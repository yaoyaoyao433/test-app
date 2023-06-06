package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.h;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a a(Context context, String str, JSONObject jSONObject) {
        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a bVar;
        Object[] objArr = {context, str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c25319d5e8192292b77355dae524faa9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c25319d5e8192292b77355dae524faa9");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1945721964:
                if (str.equals("food_img_style")) {
                    c = 0;
                    break;
                }
                break;
            case -1486899127:
                if (str.equals("RichText")) {
                    c = 6;
                    break;
                }
                break;
            case -121782794:
                if (str.equals("PriceText")) {
                    c = 7;
                    break;
                }
                break;
            case 2603341:
                if (str.equals("Text")) {
                    c = 4;
                    break;
                }
                break;
            case 2666181:
                if (str.equals("View")) {
                    c = 1;
                    break;
                }
                break;
            case 70760763:
                if (str.equals("Image")) {
                    c = 5;
                    break;
                }
                break;
            case 1708025595:
                if (str.equals("DynamicTag")) {
                    c = 3;
                    break;
                }
                break;
            case 1768990704:
                if (str.equals("add_btn_style")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.b(context);
                break;
            case 1:
                bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.d(context);
                break;
            case 2:
                bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.c(context);
                break;
            case 3:
                bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.f(context);
                break;
            case 4:
                bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.g(context);
                break;
            case 5:
                bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c(context);
                break;
            case 6:
                bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.richtext.c(context);
                break;
            case 7:
                bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.e(context);
                break;
            default:
                bVar = new h(context);
                break;
        }
        bVar.a(jSONObject);
        return bVar;
    }

    public static com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.c b(Context context, String str, JSONObject jSONObject) {
        Object[] objArr = {context, str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "559c0e17c13b6187b98103e12b49452f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "559c0e17c13b6187b98103e12b49452f");
        }
        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.c cVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.c(context);
        cVar.a(jSONObject);
        return cVar;
    }
}
