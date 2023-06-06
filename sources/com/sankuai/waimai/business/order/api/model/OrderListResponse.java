package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.detail.network.response.ActivityDialogInfo;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.response.ServerExpResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderListResponse extends ServerExpResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bottomTips;
    public String cursor;
    public int hasMore;
    public boolean hasReadUnCommentOrder;
    public boolean hasReadUnRefundOrder;
    public ActivityDialogInfo mDialogInfo;
    public com.sankuai.waimai.business.order.api.detail.network.response.a mPopupsInfo;
    public EnvelopeShareTip mShareTip;
    public String multiCursor;
    @SerializedName("")
    public List<Order> orderList;
    @Deprecated
    public int refundCount;
    public String searchDefaultTips;
    public int shareType;
    public String trackingInfo;
    public String type;
    public List<a> typeList;
    @Deprecated
    public int unCommentCount;
    public String unreadUncommentTips;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class TrackingInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("more_details")
        public int moreDetails;
    }

    public OrderListResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf53f9493b30d27f5a0343bcfc3045e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf53f9493b30d27f5a0343bcfc3045e3");
        } else {
            this.typeList = new ArrayList();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;

        public a() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RecentEat {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("poi_list")
        public ArrayList<RecentEatPoi> RecentPoiList;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String moreScheme;
        @SerializedName("poi_count")
        public int poiCount;
        @SerializedName("poi_count_desc")
        public String poiCountDesc;
        @SerializedName("preview_item_str")
        public String preview_item_str;
        @SerializedName("resource_id")
        public String resourceId;
        @SerializedName("title")
        public String title;
        @SerializedName("tracking_info")
        public String trackingInfo;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6414c4ecb324982588952fb85c8bb954", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6414c4ecb324982588952fb85c8bb954");
                return;
            }
            this.title = jSONObject.optString("title");
            this.poiCount = jSONObject.optInt("poi_count");
            this.poiCountDesc = jSONObject.optString("poi_count_desc");
            this.preview_item_str = jSONObject.optString("preview_item_str");
            JSONArray optJSONArray = jSONObject.optJSONArray("poi_list");
            this.RecentPoiList = new ArrayList<>();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    RecentEatPoi recentEatPoi = new RecentEatPoi();
                    recentEatPoi.parseJson(optJSONArray.optJSONObject(i));
                    this.RecentPoiList.add(recentEatPoi);
                }
            }
        }

        public TrackingInfoStrategy parseTrackingInfoStrategy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "822859c971ee04e8c8936b0d45557ebe", RobustBitConfig.DEFAULT_VALUE)) {
                return (TrackingInfoStrategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "822859c971ee04e8c8936b0d45557ebe");
            }
            try {
                return (TrackingInfoStrategy) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(this.trackingInfo, (Class<Object>) TrackingInfoStrategy.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RecentEatPoi {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("label_info")
        public Poi.LabelInfoListItem mLabelInfoListItem;
        @SerializedName("poi_id")
        public long poiId;
        @SerializedName("poi_pic")
        public String poiLogo;
        @SerializedName(AgainManager.EXTRA_POI_NAME)
        public String poiName;
        @SerializedName("recommend_tip")
        public String recommendTip;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String restaurantScheme;
        @SerializedName("tracking_info")
        public String trackingInfo;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e34374603c6605765306dd74894a64c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e34374603c6605765306dd74894a64c6");
                return;
            }
            this.poiId = jSONObject.optLong("poi_id");
            this.poiLogo = jSONObject.optString("poi_pic");
            this.poiName = jSONObject.optString(AgainManager.EXTRA_POI_NAME);
            this.recommendTip = jSONObject.optString("recommend_tip");
            this.restaurantScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
            JSONObject optJSONObject = jSONObject.optJSONObject("label_info");
            if (optJSONObject != null) {
                this.mLabelInfoListItem = new Poi.LabelInfoListItem();
                this.mLabelInfoListItem.parseJson(optJSONObject);
            }
        }

        public TrackingInfo parseTrackingInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02e620f7c7d605b5ab764314a9e7592f", RobustBitConfig.DEFAULT_VALUE)) {
                return (TrackingInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02e620f7c7d605b5ab764314a9e7592f");
            }
            try {
                return (TrackingInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(this.trackingInfo, (Class<Object>) TrackingInfo.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class TrackingInfoStrategy {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("click_type")
        public int clickType;
        @SerializedName("order_list_repurchase")
        public int orderListRepurchase;

        public boolean isRepurchase() {
            return this.orderListRepurchase == 1;
        }

        public boolean isClickType() {
            return this.clickType == 1;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class TrackingInfoOrderStrategy {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("order_list_repurchase")
        public int orderListRepurchase;

        public boolean isRepurchase() {
            return this.orderListRepurchase == 1;
        }
    }

    public TrackingInfoOrderStrategy parseTrackingInfoStrategy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "523a740fe067451bb4baf448b769686d", RobustBitConfig.DEFAULT_VALUE)) {
            return (TrackingInfoOrderStrategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "523a740fe067451bb4baf448b769686d");
        }
        try {
            return (TrackingInfoOrderStrategy) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(this.trackingInfo, (Class<Object>) TrackingInfoOrderStrategy.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public void parseTypeList(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57bfad430977b5a10277cff29cd2e1cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57bfad430977b5a10277cff29cd2e1cb");
        } else if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                a aVar = new a();
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                Object[] objArr2 = {optJSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "b8d0e17f7bc3ad7f12ca51442c8822cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "b8d0e17f7bc3ad7f12ca51442c8822cd");
                } else {
                    aVar.b = optJSONObject.optString("code");
                    aVar.c = optJSONObject.optString("name");
                    aVar.d = optJSONObject.optString("url");
                    aVar.e = optJSONObject.optString(RemoteMessageConst.Notification.ICON);
                }
                this.typeList.add(aVar);
            }
        }
    }

    public static OrderListResponse fromJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7104d4fc815f2ad1ef7fb8c937b3a8f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderListResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7104d4fc815f2ad1ef7fb8c937b3a8f9");
        }
        if (jSONObject == null) {
            return null;
        }
        OrderListResponse orderListResponse = new OrderListResponse();
        orderListResponse.type = jSONObject.optString("type");
        orderListResponse.cursor = jSONObject.optString("cursor");
        orderListResponse.multiCursor = jSONObject.optString("multi_cursor");
        orderListResponse.hasMore = jSONObject.optInt("hasmore");
        orderListResponse.unCommentCount = jSONObject.optInt("uncomment_count");
        orderListResponse.hasReadUnCommentOrder = jSONObject.optInt("has_unread_comment_order") != 0;
        orderListResponse.unreadUncommentTips = jSONObject.optString("unread_uncomment_tips");
        orderListResponse.orderList = h.a(jSONObject.optJSONArray("digestlist"));
        orderListResponse.setWaitTime(jSONObject.optInt("wait_time", -1));
        orderListResponse.parseTypeList(jSONObject.optJSONArray("list_types"));
        orderListResponse.refundCount = jSONObject.optInt("refund_count");
        orderListResponse.bottomTips = jSONObject.optString("bottom_tips");
        orderListResponse.searchDefaultTips = jSONObject.optString("search_default_tips");
        orderListResponse.hasReadUnRefundOrder = jSONObject.optInt("has_unread_refund_order") != 0;
        orderListResponse.shareType = jSONObject.optInt("share_type");
        orderListResponse.trackingInfo = jSONObject.optString("tracking_info");
        JSONObject optJSONObject = jSONObject.optJSONObject("envelope_share_tip");
        if (optJSONObject != null) {
            orderListResponse.mShareTip = new EnvelopeShareTip();
            orderListResponse.mShareTip.parseJson(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("activity_share_tip");
        if (optJSONObject2 != null) {
            orderListResponse.mDialogInfo = new ActivityDialogInfo();
            orderListResponse.mDialogInfo.parseJson(optJSONObject2);
        }
        String optString = jSONObject.optString("ugc_pop_ups_info");
        if (!TextUtils.isEmpty(optString)) {
            orderListResponse.mPopupsInfo = new com.sankuai.waimai.business.order.api.detail.network.response.a();
            com.sankuai.waimai.business.order.api.detail.network.response.a aVar = orderListResponse.mPopupsInfo;
            Object[] objArr2 = {optString};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.order.api.detail.network.response.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "341dfa815a52bc26d496453e17993e45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "341dfa815a52bc26d496453e17993e45");
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    Object[] objArr3 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.order.api.detail.network.response.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "75fac4d56a24ece8f59d461a9bd70136", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "75fac4d56a24ece8f59d461a9bd70136");
                    } else {
                        aVar.b = jSONObject2.optInt("is_pop_up");
                        aVar.c = jSONObject2.optLong("order_view_id");
                        aVar.d = jSONObject2.optLong("wm_poi_id");
                        aVar.e = jSONObject2.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                        aVar.f = jSONObject2.optString("title");
                        aVar.g = jSONObject2.optString("wm_poi_logo");
                        aVar.h = jSONObject2.optString("wm_poi_name");
                        aVar.i = jSONObject2.optString("order_complete_time");
                        aVar.j = jSONObject2.optString("button_text");
                        aVar.k = jSONObject2.optInt("stimulate_type");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return orderListResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<OrderListResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public OrderListResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2634876726a4a886f0caf67f26904b12", RobustBitConfig.DEFAULT_VALUE)) {
                return (OrderListResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2634876726a4a886f0caf67f26904b12");
            }
            if (jsonElement != null && jsonElement.isJsonObject()) {
                try {
                    return OrderListResponse.fromJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
