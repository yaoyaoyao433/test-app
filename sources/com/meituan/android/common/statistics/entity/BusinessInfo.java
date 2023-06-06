package com.meituan.android.common.statistics.entity;

import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class BusinessInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, Object> ab_test;
    public String activity_id;
    public String cat_id;
    public String channel;
    public String cinema_id;
    public String coupon_id;
    public String ct_poi;
    public Map<String, Object> custom;
    public String deal_id;
    public String goods_id;
    public String keyword;
    public String maiton_id;
    public String movie_id;
    public String order_id;
    public String poi_id;
    public String query_id;
    public String region_id;
    public String search_id;
    public String select_id;
    public String sku_id;
    public String sort_id;
    public String stid;
    public String trace_id;

    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56754ed6f27c332a8c5db8bd15d95e57", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56754ed6f27c332a8c5db8bd15d95e57");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.ab_test != null && this.ab_test.size() > 0) {
                jSONObject.put("abtest", JsonUtil.mapToJSONObject(this.ab_test));
            }
            if (!TextUtils.isEmpty(this.sku_id)) {
                jSONObject.put("sku_id", this.sku_id);
            }
            if (!TextUtils.isEmpty(this.order_id)) {
                jSONObject.put("order_id", this.order_id);
            }
            if (!TextUtils.isEmpty(this.cat_id)) {
                jSONObject.put("cat_id", this.cat_id);
            }
            if (!TextUtils.isEmpty(this.poi_id)) {
                jSONObject.put("poi_id", this.poi_id);
            }
            if (!TextUtils.isEmpty(this.deal_id)) {
                jSONObject.put("deal_id", this.deal_id);
            }
            if (!TextUtils.isEmpty(this.movie_id)) {
                jSONObject.put("movie_id", this.movie_id);
            }
            if (!TextUtils.isEmpty(this.goods_id)) {
                jSONObject.put("goods_id", this.goods_id);
            }
            if (!TextUtils.isEmpty(this.maiton_id)) {
                jSONObject.put("maiton_id", this.maiton_id);
            }
            if (!TextUtils.isEmpty(this.coupon_id)) {
                jSONObject.put("coupon_id", this.coupon_id);
            }
            if (!TextUtils.isEmpty(this.region_id)) {
                jSONObject.put("region_id", this.region_id);
            }
            if (!TextUtils.isEmpty(this.stid)) {
                jSONObject.put("stid", this.stid);
            }
            if (!TextUtils.isEmpty(this.ct_poi)) {
                jSONObject.put("ctpoi", this.ct_poi);
            }
            if (!TextUtils.isEmpty(this.search_id)) {
                jSONObject.put("search_id", this.search_id);
            }
            if (!TextUtils.isEmpty(this.trace_id)) {
                jSONObject.put("traceid", this.trace_id);
            }
            if (!TextUtils.isEmpty(this.keyword)) {
                jSONObject.put("keyword", this.keyword);
            }
            if (!TextUtils.isEmpty(this.query_id)) {
                jSONObject.put("query_id", this.query_id);
            }
            if (!TextUtils.isEmpty(this.activity_id)) {
                jSONObject.put(DataConstants.ACTIVITYID, this.activity_id);
            }
            if (!TextUtils.isEmpty(this.cinema_id)) {
                jSONObject.put("cinemaid", this.cinema_id);
            }
            if (!TextUtils.isEmpty(this.sort_id)) {
                jSONObject.put("sortid", this.sort_id);
            }
            if (!TextUtils.isEmpty(this.select_id)) {
                jSONObject.put("selectid", this.select_id);
            }
            if (this.custom != null && this.custom.size() > 0) {
                jSONObject.put("custom", JsonUtil.mapToJSONObject(this.custom));
            }
        } catch (JSONException e) {
            LogUtil.log("statistics", "BusinessInfo - toJson:" + e.getMessage());
        }
        return jSONObject;
    }

    public Map<String, Object> toMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "719378277d6cfd235f96d883a5122c42", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "719378277d6cfd235f96d883a5122c42");
        }
        HashMap hashMap = new HashMap();
        try {
            if (this.ab_test != null && this.ab_test.size() > 0) {
                hashMap.put("ab_test", JsonUtil.mapToJSONObject(this.ab_test));
            }
            if (!TextUtils.isEmpty(this.sku_id)) {
                hashMap.put("sku_id", this.sku_id);
            }
            if (!TextUtils.isEmpty(this.order_id)) {
                hashMap.put("order_id", this.order_id);
            }
            if (!TextUtils.isEmpty(this.cat_id)) {
                hashMap.put("cat_id", this.cat_id);
            }
            if (!TextUtils.isEmpty(this.poi_id)) {
                hashMap.put("poi_id", this.poi_id);
            }
            if (!TextUtils.isEmpty(this.deal_id)) {
                hashMap.put("deal_id", this.deal_id);
            }
            if (!TextUtils.isEmpty(this.movie_id)) {
                hashMap.put("movie_id", this.movie_id);
            }
            if (!TextUtils.isEmpty(this.goods_id)) {
                hashMap.put("goods_id", this.goods_id);
            }
            if (!TextUtils.isEmpty(this.maiton_id)) {
                hashMap.put("maiton_id", this.maiton_id);
            }
            if (!TextUtils.isEmpty(this.coupon_id)) {
                hashMap.put("coupon_id", this.coupon_id);
            }
            if (!TextUtils.isEmpty(this.region_id)) {
                hashMap.put("region_id", this.region_id);
            }
            if (!TextUtils.isEmpty(this.stid)) {
                hashMap.put("stid", this.stid);
            }
            if (!TextUtils.isEmpty(this.ct_poi)) {
                hashMap.put("ct_poi", this.ct_poi);
            }
            if (!TextUtils.isEmpty(this.search_id)) {
                hashMap.put("search_id", this.search_id);
            }
            if (!TextUtils.isEmpty(this.trace_id)) {
                hashMap.put("trace_id", this.trace_id);
            }
            if (!TextUtils.isEmpty(this.keyword)) {
                hashMap.put("keyword", this.keyword);
            }
            if (!TextUtils.isEmpty(this.query_id)) {
                hashMap.put("query_id", this.query_id);
            }
            if (!TextUtils.isEmpty(this.activity_id)) {
                hashMap.put("activity_id", this.activity_id);
            }
            if (!TextUtils.isEmpty(this.cinema_id)) {
                hashMap.put("cinema_id", this.cinema_id);
            }
            if (!TextUtils.isEmpty(this.sort_id)) {
                hashMap.put("sort_id", this.sort_id);
            }
            if (!TextUtils.isEmpty(this.select_id)) {
                hashMap.put("select_id", this.select_id);
            }
            if (!TextUtils.isEmpty(this.channel)) {
                hashMap.put("channel", this.channel);
            }
            if (this.custom != null && this.custom.size() > 0) {
                hashMap.put("custom", JsonUtil.mapToJSONObject(this.custom));
            }
        } catch (Exception e) {
            LogUtil.log("statistics", "BusinessInfo - toJson:" + e.getMessage());
        }
        return hashMap;
    }

    public static BusinessInfo fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c7fdae50b0f8e2fe033454309ea7b65c", 6917529027641081856L)) {
            return (BusinessInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c7fdae50b0f8e2fe033454309ea7b65c");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BusinessInfo businessInfo = new BusinessInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                String optString = jSONObject.optString("abtest");
                if (!TextUtils.isEmpty(optString)) {
                    businessInfo.ab_test = JsonUtil.toMap(new JSONObject(optString));
                }
            } catch (Throwable unused) {
            }
            businessInfo.sku_id = jSONObject.optString("sku_id");
            businessInfo.order_id = jSONObject.optString("order_id");
            businessInfo.cat_id = jSONObject.optString("cat_id");
            businessInfo.poi_id = jSONObject.optString("poi_id");
            businessInfo.deal_id = jSONObject.optString("deal_id");
            businessInfo.movie_id = jSONObject.optString("movie_id");
            businessInfo.goods_id = jSONObject.optString("goods_id");
            businessInfo.maiton_id = jSONObject.optString("maiton_id");
            businessInfo.coupon_id = jSONObject.optString("coupon_id");
            businessInfo.region_id = jSONObject.optString("region_id");
            businessInfo.stid = jSONObject.optString("stid");
            businessInfo.ct_poi = jSONObject.optString("ctpoi");
            businessInfo.search_id = jSONObject.optString("search_id");
            businessInfo.trace_id = jSONObject.optString("trace_id");
            businessInfo.keyword = jSONObject.optString("keyword");
            businessInfo.query_id = jSONObject.optString("query_id");
            businessInfo.activity_id = jSONObject.optString(DataConstants.ACTIVITYID);
            businessInfo.cinema_id = jSONObject.optString("cinema_id");
            businessInfo.sort_id = jSONObject.optString("sort_id");
            businessInfo.select_id = jSONObject.optString("select_id");
            try {
                String optString2 = jSONObject.optString("custom");
                if (!TextUtils.isEmpty(optString2)) {
                    businessInfo.custom = JsonUtil.toMap(new JSONObject(optString2));
                }
            } catch (Throwable unused2) {
            }
        } catch (JSONException e) {
            LogUtil.log("statistics", "BusinessInfo - toJson:" + e.getMessage());
        }
        return businessInfo;
    }
}
