package com.meituan.android.cashier.model.bean;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.meituan.android.paybase.common.analyse.cat.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CashierPopWindowBeanDeserializer implements JsonDeserializer<CashierPopWindowBean>, JsonSerializer<CashierPopWindowBean> {
    private static final String KEY_POP_DETAIL_INFO = "pop_detail_info";
    private static final String KEY_SCENE = "pop_scene";
    private static final String KEY_TYPE = "type";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public CashierPopWindowBean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3581bdb42f117a5a32b5922c00d89f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierPopWindowBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3581bdb42f117a5a32b5922c00d89f6");
        }
        if (jsonElement != null) {
            try {
                CashierPopWindowBean cashierPopWindowBean = new CashierPopWindowBean();
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                int asInt = asJsonObject.get("type").getAsInt();
                if (asInt == 2) {
                    cashierPopWindowBean.setPayLaterPopDetailInfoBean((PayLaterPopDetailInfoBean) jsonDeserializationContext.deserialize(asJsonObject.get(KEY_POP_DETAIL_INFO), PayLaterPopDetailInfoBean.class));
                } else if (asInt == 1 || asInt == 3 || asInt == 4 || asInt == 5 || asInt == 6) {
                    cashierPopWindowBean.setPopDetailInfo((PopDetailInfo) jsonDeserializationContext.deserialize(asJsonObject.get(KEY_POP_DETAIL_INFO), PopDetailInfo.class));
                }
                JsonElement jsonElement2 = asJsonObject.get(KEY_SCENE);
                if (jsonElement2 != null) {
                    cashierPopWindowBean.setPopScene(jsonElement2.getAsString());
                }
                cashierPopWindowBean.setType(asInt);
                return cashierPopWindowBean;
            } catch (Exception e) {
                a.a(getSubTag("deserialize"), "deserialize error");
                com.meituan.android.paybase.common.analyse.a.a(e, getSubTag("deserialize"), (Map<String, Object>) null);
            }
        }
        return null;
    }

    private String getSubTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "604cb071b145e78ba6816246cd3c9d90", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "604cb071b145e78ba6816246cd3c9d90");
        }
        return "CashierPopWindowBeanDeserializer_" + str;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(CashierPopWindowBean cashierPopWindowBean, Type type, JsonSerializationContext jsonSerializationContext) {
        Object[] objArr = {cashierPopWindowBean, type, jsonSerializationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c0aaa078885cb961dca8566e26a5345", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c0aaa078885cb961dca8566e26a5345");
        }
        if (cashierPopWindowBean != null) {
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("type", Integer.valueOf(cashierPopWindowBean.getType()));
                if (cashierPopWindowBean.getType() == 2) {
                    jsonObject.add(KEY_POP_DETAIL_INFO, jsonSerializationContext.serialize(cashierPopWindowBean.getPayLaterPopDetailInfoBean()));
                } else if (cashierPopWindowBean.getType() == 1 || cashierPopWindowBean.getType() == 3 || cashierPopWindowBean.getType() == 4 || cashierPopWindowBean.getType() == 5 || cashierPopWindowBean.getType() == 6) {
                    jsonObject.add(KEY_POP_DETAIL_INFO, jsonSerializationContext.serialize(cashierPopWindowBean.getPopDetailInfo()));
                }
                return jsonObject;
            } catch (Exception e) {
                a.a(getSubTag("serialize"), "serialize error");
                com.meituan.android.paybase.common.analyse.a.a(e, getSubTag("serialize"), (Map<String, Object>) null);
            }
        }
        return null;
    }
}
