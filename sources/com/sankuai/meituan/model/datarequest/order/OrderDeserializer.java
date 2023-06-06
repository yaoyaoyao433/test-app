package com.sankuai.meituan.model.datarequest.order;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.DealDao;
import com.sankuai.meituan.model.dao.Order;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderDeserializer implements JsonDeserializer<Order> {
    public static ChangeQuickRedirect a;
    public static final Gson b = new Gson();

    @Override // com.google.gson.JsonDeserializer
    public /* synthetic */ Order deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8214929a0c15b309c2aa20e9d1effeed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Order) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8214929a0c15b309c2aa20e9d1effeed");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String a2 = a(asJsonObject, DealDao.TABLENAME);
        String a3 = a(asJsonObject, "pricecalendar");
        String a4 = a(asJsonObject, "moreinfo");
        String a5 = a(asJsonObject, "ordergoods");
        String a6 = a(asJsonObject, DMKeys.KEY_MIDAS_FEEDBACK);
        String a7 = a(asJsonObject, "coupons");
        String a8 = a(asJsonObject, "promocodes");
        String a9 = a(asJsonObject, "mms");
        String a10 = a(asJsonObject, "delivery");
        String a11 = a(asJsonObject, "couponsXiechengRefundDetail");
        String a12 = a(asJsonObject, "portionBook");
        String a13 = a(asJsonObject, "tour");
        String a14 = a(asJsonObject, "movie");
        String a15 = a(asJsonObject, PayLabel.ITEM_TYPE_REWARD);
        Order order = (Order) b.fromJson(jsonElement, type);
        order.deal = a2;
        order.hotelSKU = a3;
        order.orderGoods = a5;
        order.feedback = a6;
        order.coupons = a7;
        order.promocodes = a8;
        order.mms = a9;
        order.delivery = a10;
        order.refundDetail = a11;
        order.portionBook = a12;
        order.tour = a13;
        order.moreinfo = a4;
        order.movie = a14;
        order.reward = a15;
        return order;
    }

    private String a(JsonObject jsonObject, String str) {
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82a0e77e80e3828895de0ed6bb5e8521", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82a0e77e80e3828895de0ed6bb5e8521");
        }
        if (jsonObject.has(str)) {
            String jsonElement = jsonObject.get(str).toString();
            jsonObject.remove(str);
            return jsonElement;
        }
        return null;
    }
}
