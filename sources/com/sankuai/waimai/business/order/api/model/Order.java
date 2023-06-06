package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.ShippingTimeInfo;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class Order implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int adType;
    private String appDeliveryTip;
    public long arrivalTime;
    private boolean autoPopupFeedback;
    @SerializedName("biz_type")
    public int bizType;
    public int businessType;
    public List<ButtonItem> buttonTypeList;
    private int canFeedback;
    private String caution;
    private String chargeInfo;
    private int commentStatus;
    private List<OrderDeliverPackInfo> deliverPackInfo;
    private int deliveryStatus;
    private int displayProductPic;
    private int displayStyle;
    private com.sankuai.waimai.business.order.api.model.c feedbackPreviewResult;
    private List<OrderedFood> foodList;
    private String foodListArray;
    private String foodNames;
    public String formatOrderTime;
    private boolean hasStatusBubble;
    private String hashId;
    private String invoiceTaxpayerId;
    private String invoiceTitle;
    private int invoiceType;
    private int isComment;
    private int isDeletable;
    private int isPoiOpen;
    private boolean isShowOrderAgain;
    private int latitude;
    private LiveInfo liveInfo;
    private int longitude;
    private DinersOption mDinersOption;
    public a mPoiExtensionInfo;
    private long orderId;
    private String orderTime;
    private String orderUnDeleteReason;
    private int payStatus;
    private long poiId;
    private String poiIdStr;
    private String poiName;
    private String poiPhone;
    private String poiPic;
    public int poiStatus;
    public List<ProductAddress> productAddressDescList;
    public int productCount;
    public String productCountExtraDesc;
    public String productDescription;
    public int productKinds;
    public ArrayList<b> productList;
    public List<String> productMultilineDescription;
    private String recepientAddress;
    private String recepientPhone;
    private long remainPayTime;
    public String restaurantScheme;
    private int shippingServiceType;
    private int status;
    private String statusDescription;
    private String stimulateCommentSimpleDesc;
    public int subBizType;
    private List<SubDeliveryInfo> subDeliveryInfoList;
    private double total;
    public String trackingInfo;
    private String unavailableFoodList;
    @SerializedName("unavailable_food_title")
    private String unavailableFoodTitle;
    public static final Integer LEG_ORDER_BY_ADDRESS = 10;
    public static final Integer LEG_ORDER_BY_PRODUCT_LIST = 20;
    public static final Integer LEG_ORDER_BY_DESC = 21;
    public static final Integer LEG_ORDER_BY_DESC2 = 22;
    public static final Integer LEG_ORDER_BY_PRODUCT = 23;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class TrackingInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("discount_amount")
        public int discount_amount;
        @SerializedName("is_more_details")
        public int is_more_details;
    }

    public Order() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14f76799d22d2dbb80a36b358d050702", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14f76799d22d2dbb80a36b358d050702");
            return;
        }
        this.poiIdStr = "";
        this.buttonTypeList = new ArrayList();
    }

    public boolean isLegOrderByDesc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e230a92a374b5b7d2e0f86097880bf20", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e230a92a374b5b7d2e0f86097880bf20")).booleanValue() : this.subBizType == LEG_ORDER_BY_DESC.intValue() || this.subBizType == LEG_ORDER_BY_DESC2.intValue();
    }

    public boolean isLegOrderByProduct() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdaaa2a5e3ce1eec30907f5316fe18b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdaaa2a5e3ce1eec30907f5316fe18b3")).booleanValue() : this.subBizType == LEG_ORDER_BY_PRODUCT.intValue();
    }

    public boolean isLegOrderByAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a46f8a5ee3541af38dcefd0241f465f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a46f8a5ee3541af38dcefd0241f465f")).booleanValue() : this.subBizType == LEG_ORDER_BY_ADDRESS.intValue();
    }

    public boolean isLegOrder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc05ec419ebfa62d206a3ec851ac5d78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc05ec419ebfa62d206a3ec851ac5d78")).booleanValue() : this.bizType == 6 && this.subBizType != LEG_ORDER_BY_PRODUCT_LIST.intValue();
    }

    public boolean isLegOrderType() {
        return this.bizType == 6;
    }

    public boolean isRollGoodStuffOrderType() {
        return this.bizType == 8;
    }

    public void setDeletable(int i) {
        this.isDeletable = i;
    }

    public boolean isDeletable() {
        return this.isDeletable == 1;
    }

    public int getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public void setDeliveryStatus(int i) {
        this.deliveryStatus = i;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public void setLatitude(int i) {
        this.latitude = i;
    }

    public int getLongitude() {
        return this.longitude;
    }

    public void setLongitude(int i) {
        this.longitude = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnavailableFoodList(String str) {
        this.unavailableFoodList = str;
    }

    public String getUnavailableFoodList() {
        return this.unavailableFoodList;
    }

    public String getUnavailableFoodTitle() {
        return this.unavailableFoodTitle;
    }

    public void setUnavailableFoodTitle(String str) {
        this.unavailableFoodTitle = str;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc7688c450363ddd6c4c9abe2b5ad91f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc7688c450363ddd6c4c9abe2b5ad91f");
        } else {
            this.total = d;
        }
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String getOrderTime() {
        return this.orderTime;
    }

    public void setOrderTime(String str) {
        this.orderTime = str;
    }

    public int isComment() {
        return this.isComment;
    }

    public void setComment(int i) {
        this.isComment = i;
    }

    public void setCommentStatus(int i) {
        this.commentStatus = i;
    }

    public int getCommentStatus() {
        return this.commentStatus;
    }

    public String getStatusDescription() {
        return this.statusDescription;
    }

    public void setStatusDescription(String str) {
        this.statusDescription = str;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public String getPoiPhone() {
        return this.poiPhone;
    }

    public void setPoiPhone(String str) {
        this.poiPhone = str;
    }

    public long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48e7b120abc5a0a1aa8ff397c9ce7029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48e7b120abc5a0a1aa8ff397c9ce7029");
        } else {
            this.orderId = j;
        }
    }

    public String getPoiPic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfad54e6ddd238a446c9d6519e117887", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfad54e6ddd238a446c9d6519e117887") : TextUtils.isEmpty(this.poiPic) ? "" : this.poiPic;
    }

    public void setPoiPic(String str) {
        this.poiPic = str;
    }

    public String getHashId() {
        return this.hashId;
    }

    public void setHashId(String str) {
        this.hashId = str;
    }

    public int getIsComment() {
        return this.isComment;
    }

    public void setIsComment(int i) {
        this.isComment = i;
    }

    public String getAppDeliveryTip() {
        return this.appDeliveryTip;
    }

    public void setAppDeliveryTip(String str) {
        this.appDeliveryTip = str;
    }

    public boolean isHasStatusBubble() {
        return this.hasStatusBubble;
    }

    public void setHasStatusBubble(boolean z) {
        this.hasStatusBubble = z;
    }

    public long getPoiId() {
        return this.poiId;
    }

    public void setPoiId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a967b4c8df2ff401636c974cf405877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a967b4c8df2ff401636c974cf405877");
        } else {
            this.poiId = j;
        }
    }

    public String getPoiIdStr() {
        return this.poiIdStr;
    }

    public void setPoiIdStr(String str) {
        this.poiIdStr = str;
    }

    public int getPayStatus() {
        return this.payStatus;
    }

    public void setPayStatus(int i) {
        this.payStatus = i;
    }

    public long getRemainPayTime() {
        return this.remainPayTime;
    }

    public void setRemainPayTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abfb0603e17134ce12f403b072584ac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abfb0603e17134ce12f403b072584ac2");
        } else {
            this.remainPayTime = j;
        }
    }

    public int getIsPoiOpen() {
        return this.isPoiOpen;
    }

    public void setIsPoiOpen(int i) {
        this.isPoiOpen = i;
    }

    public boolean isShowOrderAgain() {
        return this.isShowOrderAgain;
    }

    public void setShowOrderAgain(boolean z) {
        this.isShowOrderAgain = z;
    }

    public List<OrderedFood> getFoodList() {
        return this.foodList;
    }

    public void setFoodList(List<OrderedFood> list) {
        this.foodList = list;
    }

    public String getFoodNames() {
        return this.foodNames;
    }

    public void setFoodNames(String str) {
        this.foodNames = str;
    }

    public String getRecepientAddress() {
        return this.recepientAddress;
    }

    public void setRecepientAddress(String str) {
        this.recepientAddress = str;
    }

    public String getRecepientPhone() {
        return this.recepientPhone;
    }

    public void setRecepientPhone(String str) {
        this.recepientPhone = str;
    }

    public String getCaution() {
        return this.caution;
    }

    public void setCaution(String str) {
        this.caution = str;
    }

    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    public void setInvoiceTitle(String str) {
        this.invoiceTitle = str;
    }

    public int getInvoiceType() {
        return this.invoiceType;
    }

    public void setInvoiceType(int i) {
        this.invoiceType = i;
    }

    public String getInvoiceTaxpayerId() {
        return this.invoiceTaxpayerId;
    }

    public void setTaxpayerId(String str) {
        this.invoiceTaxpayerId = str;
    }

    public void setFoodListArray(String str) {
        this.foodListArray = str;
    }

    public String getFoodListArray() {
        return this.foodListArray;
    }

    public void setDinersOption(DinersOption dinersOption) {
        this.mDinersOption = dinersOption;
    }

    public DinersOption getDinersOption() {
        return this.mDinersOption;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public int getAdType() {
        return this.adType;
    }

    public void setChargeInfo(String str) {
        this.chargeInfo = str;
    }

    public String getChargeInfo() {
        return this.chargeInfo;
    }

    public void setDisplayProductPic(int i) {
        this.displayProductPic = i;
    }

    public void setDisplayStyle(int i) {
        this.displayStyle = i;
    }

    public boolean displayNewStyle() {
        return this.displayStyle == 1;
    }

    public void setOrderUnDeleteReason(String str) {
        this.orderUnDeleteReason = str;
    }

    public String getOrderUnDeleteReason() {
        return this.orderUnDeleteReason;
    }

    public boolean displayProductPic() {
        return this.displayProductPic == 1;
    }

    public int getShippingServiceType() {
        return this.shippingServiceType;
    }

    public void setShippingServiceType(int i) {
        this.shippingServiceType = i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b implements Serializable {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public int d;
        public String e;
        public String f;

        public b() {
        }

        public final void a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b881e77961a3949175a2550d742a4ce8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b881e77961a3949175a2550d742a4ce8");
                return;
            }
            this.b = jSONObject.optString("product_name");
            this.c = jSONObject.optString("product_pic");
            this.d = jSONObject.optInt("product_count");
            this.e = jSONObject.optString("delivery_desc");
            this.f = jSONObject.optString("presale_icon_url");
        }
    }

    public void parseBtnTypeList(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d16e6079a29eb4a6045c6518b646d41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d16e6079a29eb4a6045c6518b646d41");
        } else if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                ButtonItem buttonItem = new ButtonItem();
                buttonItem.parseJson(jSONArray.optJSONObject(i));
                this.buttonTypeList.add(buttonItem);
            }
        }
    }

    public int getCanFeedback() {
        return this.canFeedback;
    }

    public void setCanFeedback(int i) {
        this.canFeedback = i;
    }

    public boolean isAutoPopupFeedback() {
        return this.autoPopupFeedback;
    }

    public void setAutoPopupFeedback(boolean z) {
        this.autoPopupFeedback = z;
    }

    public com.sankuai.waimai.business.order.api.model.c getFeedbackPreviewResult() {
        return this.feedbackPreviewResult;
    }

    public void setFeedbackPreviewResult(com.sankuai.waimai.business.order.api.model.c cVar) {
        this.feedbackPreviewResult = cVar;
    }

    public boolean isStimulateCommentOrder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "def3c2ca66f4c382941e1aef2f483e00", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "def3c2ca66f4c382941e1aef2f483e00")).booleanValue() : !TextUtils.isEmpty(this.stimulateCommentSimpleDesc);
    }

    public void setStimulateCommentSimpleDesc(String str) {
        this.stimulateCommentSimpleDesc = str;
    }

    public LiveInfo getLiveInfo() {
        return this.liveInfo;
    }

    public void setLiveInfo(LiveInfo liveInfo) {
        this.liveInfo = liveInfo;
    }

    public List<SubDeliveryInfo> getSubDeliveryInfoList() {
        return this.subDeliveryInfoList;
    }

    public void setSubDeliveryInfoList(List<SubDeliveryInfo> list) {
        this.subDeliveryInfoList = list;
    }

    public List<OrderDeliverPackInfo> getDeliverPackInfo() {
        return this.deliverPackInfo;
    }

    public void setDeliverPackInfo(List<OrderDeliverPackInfo> list) {
        this.deliverPackInfo = list;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        public List<Poi.LabelInfoListItem> b;
        public int c;
        public String d;
        public ShippingTimeInfo e;
        public boolean f;
        public List<com.sankuai.waimai.platform.widget.tag.api.d> g;

        public final void a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567ee576b69150348f0bc5acc4919903", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567ee576b69150348f0bc5acc4919903");
            } else if (jSONObject != null) {
                this.c = jSONObject.optInt("status");
                this.d = jSONObject.optString("status_desc");
                JSONArray optJSONArray = jSONObject.optJSONArray("poi_label_info");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    this.b = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        Poi.LabelInfoListItem labelInfoListItem = new Poi.LabelInfoListItem();
                        labelInfoListItem.parseJson(optJSONObject);
                        this.b.add(labelInfoListItem);
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("shipping_time_info");
                if (optJSONObject2 != null) {
                    this.e = new ShippingTimeInfo();
                    this.e.parseJson(optJSONObject2);
                }
                this.f = jSONObject.optBoolean("use_poi_tags_field");
                String optString = jSONObject.optString("poi_tags");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                this.g = (List) k.a().fromJson(optString, new TypeToken<List<com.sankuai.waimai.platform.widget.tag.api.d>>() { // from class: com.sankuai.waimai.business.order.api.model.Order.a.1
                }.getType());
            }
        }
    }

    public TrackingInfo parseTrackingInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa1d76f2be6896f85abbf2c0ede0fc3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (TrackingInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa1d76f2be6896f85abbf2c0ede0fc3e");
        }
        try {
            return (TrackingInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(this.trackingInfo, (Class<Object>) TrackingInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements com.sankuai.waimai.platform.domain.core.goods.d, Serializable {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public int e;
        public String f;
        public String g;
        public List<GoodsAttr> h;
        public List<GoodsAttr> i;
        public List<GoodsAttr> j;
        public List<com.sankuai.waimai.platform.domain.core.goods.d> k;
        public int l;

        public static ArrayList<com.sankuai.waimai.platform.domain.core.goods.d> a(JSONArray jSONArray) {
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            ArrayList<com.sankuai.waimai.platform.domain.core.goods.d> arrayList = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "488b6c19bfb630002c15b93edab63e0b", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "488b6c19bfb630002c15b93edab63e0b");
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    c cVar = new c();
                    Object[] objArr2 = {optJSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "c53eecbdbdd5efeacb6b7e1ee525ae26", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "c53eecbdbdd5efeacb6b7e1ee525ae26");
                    } else if (optJSONObject != null) {
                        cVar.b = optJSONObject.optString("name");
                        cVar.c = optJSONObject.optString("picture");
                        cVar.d = optJSONObject.optString("originalName");
                        cVar.e = optJSONObject.optInt("count");
                        cVar.f = optJSONObject.optString("spec");
                        cVar.g = optJSONObject.optString("msg");
                        cVar.h = GoodsAttr.fromJsonArray(optJSONObject.optJSONArray("attrs"));
                        cVar.i = GoodsAttr.fromPremiumJsonArray(optJSONObject.optJSONArray("premium_attrs"));
                        cVar.k = a(optJSONObject.optJSONArray("combo_products"));
                        cVar.l = optJSONObject.optInt("combo_type");
                        cVar.j = new ArrayList();
                        cVar.j.addAll(cVar.h);
                        cVar.j.addAll(cVar.i);
                    }
                    arrayList.add(cVar);
                }
            }
            return arrayList;
        }

        @Override // com.sankuai.waimai.platform.domain.core.goods.d
        public final String a() {
            return this.c;
        }

        @Override // com.sankuai.waimai.platform.domain.core.goods.d
        public final String b() {
            return this.d;
        }

        @Override // com.sankuai.waimai.platform.domain.core.goods.d
        public final int c() {
            return this.e;
        }

        @Override // com.sankuai.waimai.platform.domain.core.goods.d
        public final String d() {
            return this.g;
        }

        @Override // com.sankuai.waimai.platform.domain.core.goods.d
        public final List<GoodsAttr> e() {
            return this.j;
        }

        @Override // com.sankuai.waimai.platform.domain.core.goods.d
        public final String f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d0168af03d99c8b15e465b2ab7531c", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d0168af03d99c8b15e465b2ab7531c");
            }
            StringBuilder sb = new StringBuilder();
            if (this.l == 1 && !com.sankuai.waimai.foundation.utils.b.b(this.k)) {
                for (int i = 0; i < this.k.size(); i++) {
                    com.sankuai.waimai.platform.domain.core.goods.d dVar = this.k.get(i);
                    sb.append(dVar.b());
                    sb.append("*");
                    sb.append(dVar.c());
                    if (i != this.k.size() - 1) {
                        sb.append("、");
                    }
                }
            }
            return sb.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<Order> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public Order deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7964e082292959b160c19d01a059842d", RobustBitConfig.DEFAULT_VALUE)) {
                return (Order) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7964e082292959b160c19d01a059842d");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    JSONObject jSONObject = new JSONObject(jsonElement.toString());
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "577fb3e4a0a9883ca9a7f313f33aeeab", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Order) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "577fb3e4a0a9883ca9a7f313f33aeeab");
                    }
                    Order order = new Order();
                    order.setLatitude(jSONObject.optInt(Constants.PRIVACY.KEY_LATITUDE));
                    order.setShippingServiceType(jSONObject.optInt("shipping_service_type"));
                    order.setLongitude(jSONObject.optInt(Constants.PRIVACY.KEY_LONGITUDE));
                    order.setRecepientAddress(jSONObject.optString("recipient_address"));
                    order.setRecepientPhone(jSONObject.optString("recipient_phone"));
                    order.setCaution(jSONObject.optString("caution"));
                    order.setInvoiceTitle(jSONObject.optString("invoice_title"));
                    order.setTaxpayerId(jSONObject.optString("taxpayer_id_number"));
                    order.setInvoiceType(jSONObject.optInt("invoice_type"));
                    order.setPoiId(jSONObject.optLong("poi_id"));
                    order.setPoiIdStr(jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR, ""));
                    order.poiStatus = jSONObject.optInt("poi_status", 1);
                    order.restaurantScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
                    order.bizType = jSONObject.optInt("biz_type");
                    JSONArray optJSONArray = jSONObject.optJSONArray("unavailable_food_list");
                    order.setUnavailableFoodList(optJSONArray == null ? "" : optJSONArray.toString());
                    order.setUnavailableFoodTitle(jSONObject.optString("unavailable_food_title"));
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("foodlist");
                    order.setFoodListArray(optJSONArray2.toString());
                    order.setFoodList(OrderedFood.fromOrderAgain(optJSONArray2));
                    return order;
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
