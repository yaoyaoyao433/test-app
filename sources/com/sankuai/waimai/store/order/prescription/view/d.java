package com.sankuai.waimai.store.order.prescription.view;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.model.OrderFoodInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(@NonNull OrderFoodInfo orderFoodInfo) {
        Object[] objArr = {orderFoodInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72cc55a65cdfaa2284e868851cc9601b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72cc55a65cdfaa2284e868851cc9601b");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sku_id", orderFoodInfo.id);
            jSONObject.put("count", orderFoodInfo.count);
        } catch (JSONException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(int i, @NonNull OrderFoodInfo.ComboProduct comboProduct) {
        Object[] objArr = {Integer.valueOf(i), comboProduct};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d5e63f49a52e0192daf21d9d1eecb22", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d5e63f49a52e0192daf21d9d1eecb22");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int i2 = i * comboProduct.count;
            jSONObject.put("sku_id", comboProduct.skuId);
            jSONObject.put("count", i2);
        } catch (JSONException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return jSONObject;
    }
}
