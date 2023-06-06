package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.UnAvailableFood;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiOrderParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("additional_bargain_list")
    public ArrayList<AdditionalBargainInput> additionalBargainList;
    @SerializedName("booking_phone")
    public String bookingPhone;
    @SerializedName("callback_info")
    public CallbackInfo callbackInfoReq;
    @SerializedName("caution")
    public String caution;
    @SerializedName("confirm_submit")
    public int confirmSubmit;
    @SerializedName("coupon")
    public PoiOrderCouponParam coupon;
    @SerializedName("diners_count")
    public int dinersCount;
    @SerializedName("expected_arrival_time")
    public int expectedArrivalTime;
    @SerializedName(alternate = {"food_list"}, value = "foodlist")
    public ArrayList<OrderFoodInput> foodList;
    @SerializedName("gift_insurance")
    public int giftInsurance;
    @SerializedName("has_food_safety_insurance")
    public int hasFoodSafetyInsurance;
    @SerializedName("insurance_selected")
    public int insuranceSelected;
    @SerializedName("invoice")
    public PoiOrderInvoiceParam invoice;
    @SerializedName("no_product_reminds_selected")
    public int noProductRemindsSelected;
    @SerializedName("order_token")
    public String orderToken;
    @SerializedName(alternate = {"poi_id"}, value = "wm_poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("privacy_selected")
    public int privacySelected;
    @SerializedName("stage_shipping_callback_info")
    public String stageShippingCallbackInfo;
    @SerializedName("tableware_setting_selected")
    public int tablewareSettingSelected;
    @SerializedName("tableware_settings_id")
    public long tablewareSettingsId;
    @SerializedName("unAvailableFoodList")
    public List<UnAvailableFood> unAvailableFoodList;
    @SerializedName("unpl")
    public String unpl;

    public PoiOrderParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec0c6342742d1ab72c67efdc2f98f803", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec0c6342742d1ab72c67efdc2f98f803");
        } else {
            this.poiIdStr = "";
        }
    }

    public static List<PoiOrderParam> fromGlobalCart(List<GlobalCart> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a3f0d859aebae4e1fa4b7f0b5799d39", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a3f0d859aebae4e1fa4b7f0b5799d39");
        }
        ArrayList arrayList = new ArrayList();
        for (GlobalCart globalCart : list) {
            PoiOrderParam poiOrderParam = new PoiOrderParam();
            if (globalCart != null) {
                poiOrderParam.poiId = globalCart.poiId;
                poiOrderParam.poiIdStr = globalCart.poiIdStr;
                poiOrderParam.orderToken = SubmitOrderManager.getInstance().getToken();
                ArrayList<OrderFoodInput> arrayList2 = new ArrayList<>();
                for (GlobalCart.g gVar : globalCart.productList) {
                    if (gVar.a() == 1) {
                        OrderFoodInput orderFoodInput = new OrderFoodInput();
                        if (gVar != null) {
                            orderFoodInput.spuId = gVar.c;
                            orderFoodInput.id = gVar.d;
                            orderFoodInput.count = gVar.g;
                            orderFoodInput.attrs = new ArrayList();
                            orderFoodInput.comboProducts = gVar.I;
                            for (int i = 0; i < gVar.l.size(); i++) {
                                if (gVar.l.get(i) != null) {
                                    orderFoodInput.attrs.add(Long.valueOf(gVar.l.get(i).id));
                                }
                            }
                            for (int i2 = 0; i2 < gVar.H.size(); i2++) {
                                if (gVar.H.get(i2) != null) {
                                    orderFoodInput.addPriceAttrs.add(gVar.H.get(i2));
                                }
                            }
                            orderFoodInput.activityTag = gVar.u;
                            orderFoodInput.activityExtra = gVar.E;
                            if (!TextUtils.isEmpty(gVar.E)) {
                                try {
                                    JSONObject jSONObject = new JSONObject(gVar.E);
                                    orderFoodInput.groupChatShare = jSONObject.optString("groupChatShare");
                                    orderFoodInput.seckill = jSONObject.optInt("seckill");
                                } catch (Exception unused) {
                                }
                            }
                        }
                        arrayList2.add(orderFoodInput);
                    }
                }
                poiOrderParam.foodList = arrayList2;
            }
            arrayList.add(poiOrderParam);
        }
        return arrayList;
    }
}
