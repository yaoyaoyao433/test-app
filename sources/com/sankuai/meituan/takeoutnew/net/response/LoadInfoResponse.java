package com.sankuai.meituan.takeoutnew.net.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.ChannelSearchShowHighlightInfo;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.log.a;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.reflect.Type;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LoadInfoResponse {
    public static ChangeQuickRedirect a;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public String N;
    public int O;
    public String P;
    public int Q;
    public int R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public double aa;
    public boolean ab;
    public String ac;
    public String ad;
    public ChannelSearchShowHighlightInfo ae;
    public int af;
    public String ag;
    public boolean ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public JSONObject b;
    public int c;
    public int d;
    public int e;
    public String f;
    public int g;
    public String h;
    public String i;
    public int j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;
    public double r;
    public int s;
    public int t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public LoadInfoResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4391579b2132045bf967629fbe303f33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4391579b2132045bf967629fbe303f33");
            return;
        }
        this.K = 7;
        this.af = 1;
        this.ak = -1;
        this.al = -1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public LoadInfoResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4048524e4633192b9a659ba6382d31f1", RobustBitConfig.DEFAULT_VALUE)) {
                return (LoadInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4048524e4633192b9a659ba6382d31f1");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    a.a(e);
                    return null;
                }
            }
            return null;
        }

        private LoadInfoResponse a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d0ed5f5321f97c2d23540db0de0ff9", RobustBitConfig.DEFAULT_VALUE)) {
                return (LoadInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d0ed5f5321f97c2d23540db0de0ff9");
            }
            LoadInfoResponse loadInfoResponse = new LoadInfoResponse();
            loadInfoResponse.b = jSONObject;
            loadInfoResponse.i = jSONObject.optString("domain");
            loadInfoResponse.j = jSONObject.optInt("tiprefreshtime");
            loadInfoResponse.I = jSONObject.optInt("lastorderrefreshtime", 60);
            loadInfoResponse.J = jSONObject.optInt("lastorderrefreshtime_using_shark_push", 300);
            loadInfoResponse.ac = jSONObject.optString("address_filter_poitype");
            JSONObject optJSONObject = jSONObject.optJSONObject(GearsLocator.ADDRESS);
            if (optJSONObject != null) {
                String[] split = optJSONObject.optString("search_address_poitype").split(CommonConstant.Symbol.COMMA);
                Object[] objArr2 = {split};
                ChangeQuickRedirect changeQuickRedirect2 = aa.a;
                String str = null;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "13eb0fcfdf21e78a43c3b20c8f0ad17f", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "13eb0fcfdf21e78a43c3b20c8f0ad17f");
                } else if (split.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < split.length; i++) {
                        sb.append(split[i]);
                        if (i < split.length - 1) {
                            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        }
                    }
                    str = sb.toString();
                }
                loadInfoResponse.k = str;
                loadInfoResponse.l = optJSONObject.optInt("search_address_pernum", 10);
                loadInfoResponse.m = optJSONObject.optInt("search_address_radius", 2000);
                loadInfoResponse.n = optJSONObject.optInt("search_address_sort", 1);
                loadInfoResponse.o = optJSONObject.optInt("suggest_type");
            }
            loadInfoResponse.e = jSONObject.optInt("image_quality_default", 0);
            loadInfoResponse.d = jSONObject.optInt("image_quality_basic", 0);
            loadInfoResponse.c = jSONObject.optInt("image_quality_operation", 0);
            loadInfoResponse.g = jSONObject.optInt("thumb_image_quality", 60);
            loadInfoResponse.h = jSONObject.optString("customer_service_time");
            loadInfoResponse.p = jSONObject.optInt("order_addr_distance");
            loadInfoResponse.q = jSONObject.optDouble("food_collect_poi_min_price");
            loadInfoResponse.r = jSONObject.optDouble("food_collect_order_min_price_rate");
            loadInfoResponse.s = jSONObject.optInt("order_max_shipping_time", 120);
            loadInfoResponse.t = jSONObject.optInt("search_address_select_distance_diff", 500);
            loadInfoResponse.u = jSONObject.optString("contact_phone");
            loadInfoResponse.v = jSONObject.optString("feedback_faq_url");
            loadInfoResponse.w = jSONObject.optString("coupon_help_url");
            loadInfoResponse.x = jSONObject.optString("customer_service_url");
            loadInfoResponse.L = jSONObject.optInt("contact_phone_verifycode_switch_for_login") != 0;
            loadInfoResponse.M = jSONObject.optInt("contact_phone_verifycode_switch_for_order") != 0;
            loadInfoResponse.N = jSONObject.optString("contact_phone_verifycode");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("share_info");
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                loadInfoResponse.y = optJSONObject2.optString("content");
                loadInfoResponse.z = optJSONObject2.optString(RemoteMessageConst.Notification.ICON);
                loadInfoResponse.A = optJSONObject2.optString("title");
                loadInfoResponse.B = optJSONObject2.optString("url");
                JSONArray optJSONArray = optJSONObject2.optJSONArray("channels");
                loadInfoResponse.C = optJSONArray == null ? "" : optJSONArray.toString();
            }
            loadInfoResponse.D = jSONObject.optString("prefer_portal");
            loadInfoResponse.G = jSONObject.optInt("prefer_show");
            loadInfoResponse.F = jSONObject.optString("prefer_title");
            loadInfoResponse.E = jSONObject.optString("prefer_url");
            loadInfoResponse.O = jSONObject.optInt("config_checklist_interval");
            loadInfoResponse.P = jSONObject.optString("config_checklist");
            loadInfoResponse.Q = jSONObject.optInt("refresh_homepage_interval", -1);
            loadInfoResponse.R = jSONObject.optInt("refresh_poilist_interval", -1);
            loadInfoResponse.f = jSONObject.optString("cat_switch");
            loadInfoResponse.H = jSONObject.optInt("location_priority", 1);
            loadInfoResponse.S = jSONObject.optString("change_binded_phone_kf_phone");
            loadInfoResponse.T = jSONObject.optString("vip_icon");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("search_easter_egg_picture");
            if (optJSONArray2 != null) {
                loadInfoResponse.U = optJSONArray2.toString();
            } else {
                loadInfoResponse.U = "";
            }
            loadInfoResponse.V = jSONObject.optString("ad_poi_icon");
            loadInfoResponse.W = jSONObject.optString("ad_banner_icon");
            loadInfoResponse.X = jSONObject.optString("hertz_switch", "0").equals("1");
            loadInfoResponse.Y = jSONObject.optString("is_search_entrance_show_keyboard", "1").equals("1");
            loadInfoResponse.Z = jSONObject.optString("httpdns_switch", "0").equals("1");
            loadInfoResponse.aa = jSONObject.optDouble("food_collect_activity_min_price_rate");
            loadInfoResponse.ab = jSONObject.optInt("message_center_switch") == 1;
            loadInfoResponse.ad = jSONObject.optString("version_update_bg_image_url");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("channel_search_show_highlight_info");
            if (optJSONObject3 != null) {
                loadInfoResponse.ae = new ChannelSearchShowHighlightInfo();
                loadInfoResponse.ae.defaultSearchWords = optJSONObject3.optString("default_search_words");
                loadInfoResponse.ae.channels = new HashSet();
                JSONArray optJSONArray3 = optJSONObject3.optJSONArray("channels");
                for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                    loadInfoResponse.ae.channels.add(optJSONArray3.optString(i2));
                }
            }
            loadInfoResponse.af = jSONObject.optInt("sniffer_switch", 1);
            loadInfoResponse.ag = jSONObject.optString("service_feedback_url");
            loadInfoResponse.ah = jSONObject.optBoolean("support_privacy_popup", false);
            loadInfoResponse.ai = jSONObject.optInt("im_link_switch", 1);
            loadInfoResponse.aj = jSONObject.optInt("app_embedded_h5_with_region_info", 0);
            JSONObject optJSONObject4 = jSONObject.optJSONObject("individualization");
            if (optJSONObject4 != null) {
                loadInfoResponse.ak = optJSONObject4.optInt("individualization_switch", TXLiveConstants.RENDER_ROTATION_180);
                loadInfoResponse.al = optJSONObject4.optInt("un_use_individualization", TXLiveConstants.RENDER_ROTATION_180);
            }
            return loadInfoResponse;
        }
    }
}
