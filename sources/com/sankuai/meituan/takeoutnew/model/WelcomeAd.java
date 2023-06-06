package com.sankuai.meituan.takeoutnew.model;

import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.model.b;
import com.sankuai.waimai.foundation.utils.log.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WelcomeAd extends b {
    public static final int AD_TYPE_ADX = 21;
    public static final int AD_TYPE_CPT = 19;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int adType;
    public String chargeInfo;
    public String cityId;
    public String clickLogUrl;
    public ArrayList<Timeline> cycleTime;
    public ArrayList<Timeline> dailyTime;
    public long endTime;
    public String exposeLogUrl;
    public int idx;
    public String launchId;
    public int matOriginalSize;
    public ArrayList<Integer> order;
    public int picHeight;
    public String picUrl;
    public int picWidth;
    public int slotId;
    public long startTime;
    public String strategyId;
    public String thirdClickLogUrl;
    public String thirdExposeLogUrl;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Timeline {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long endTime;
        public long startTime;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "192fb91e01f21ff5217e27b84624d41b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "192fb91e01f21ff5217e27b84624d41b");
            } else if (jSONObject != null) {
                this.startTime = jSONObject.optLong("startTime");
                this.endTime = jSONObject.optLong("endTime");
            }
        }

        public JSONObject convertToJson() throws JSONException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6f223c119b19da2953e91b7c7c946c3", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6f223c119b19da2953e91b7c7c946c3");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startTime", this.startTime);
            jSONObject.put("endTime", this.endTime);
            return jSONObject;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c9a3117bb6f18ccdec29f03c88007dd", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c9a3117bb6f18ccdec29f03c88007dd");
            }
            return "Timeline{startTime=" + this.startTime + ", endTime=" + this.endTime + '}';
        }
    }

    public WelcomeAd() {
    }

    public WelcomeAd(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4547685a2ccd2c2fbd1d3b451ab2e34f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4547685a2ccd2c2fbd1d3b451ab2e34f");
            return;
        }
        this.id = jSONObject.optLong("ad_id");
        this.activityId = jSONObject.optInt("activity_id");
        this.slotId = jSONObject.optInt("slot_id");
        this.picUrl = jSONObject.optString("pic_url");
        this.startTime = jSONObject.optLong("stime");
        this.endTime = jSONObject.optLong("etime");
        this.launchId = jSONObject.optString("launch_id");
        this.strategyId = jSONObject.optString("st_id");
        this.cityId = jSONObject.optString(DataConstants.CITY_ID);
        this.landingPageUrl = jSONObject.optString("landing_page_url");
        this.exposeLogUrl = jSONObject.optString("imp_log_url");
        this.clickLogUrl = jSONObject.optString("click_log_url");
        this.thirdExposeLogUrl = jSONObject.optString("monitor_imp_log_url");
        this.thirdClickLogUrl = jSONObject.optString("monitor_click_log_url");
        this.screenType = jSONObject.optInt("screen_type");
        this.picWidth = jSONObject.optInt("pic_width");
        this.picHeight = jSONObject.optInt("pic_height");
        this.idx = jSONObject.optInt("idx");
        this.chargeInfo = jSONObject.optString("charge_info");
        this.adType = jSONObject.optInt("ad_type");
        this.topColor = jSONObject.optString("top_color");
        this.bottomColor = jSONObject.optString("bottom_color");
        this.textColor = jSONObject.optString("text_color");
        this.btnText = jSONObject.optString("btn_text");
        this.clickImageUrl = jSONObject.optString("click_image_url");
        this.opacity = jSONObject.optDouble("opacity");
        this.matType = jSONObject.optInt("mat_type");
        this.matUrl = jSONObject.optString("mat_url");
        this.dspLogo = jSONObject.optString("dsp_logo");
        this.matHeight = jSONObject.optInt("mat_height");
        this.matWidth = jSONObject.optInt("mat_width");
        this.isAd = jSONObject.optInt("is_ad");
        this.showMode = jSONObject.optInt("show_mode");
        JSONArray optJSONArray = jSONObject.optJSONArray("order");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            this.order = new ArrayList<>(length);
            for (int i = 0; i < length; i++) {
                this.order.add(Integer.valueOf(optJSONArray.optInt(i)));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("cycle_time");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            int length2 = optJSONArray2.length();
            this.cycleTime = new ArrayList<>(length2);
            for (int i2 = 0; i2 < length2; i2++) {
                Timeline timeline = new Timeline();
                timeline.parseJson(optJSONArray2.optJSONObject(i2));
                this.cycleTime.add(timeline);
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("daily_time");
        if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
            return;
        }
        int length3 = optJSONArray3.length();
        this.dailyTime = new ArrayList<>(length3);
        for (int i3 = 0; i3 < length3; i3++) {
            Timeline timeline2 = new Timeline();
            timeline2.parseJson(optJSONArray3.optJSONObject(i3));
            this.dailyTime.add(timeline2);
        }
    }

    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "795a490ed4eb8687bc4937729c04e8b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "795a490ed4eb8687bc4937729c04e8b9");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_id", this.id);
            jSONObject.put("activity_id", this.activityId);
            jSONObject.put("slot_id", this.slotId);
            jSONObject.put("pic_url", this.picUrl);
            jSONObject.put("stime", this.startTime);
            jSONObject.put("etime", this.endTime);
            jSONObject.put("launch_id", this.launchId);
            jSONObject.put("st_id", this.strategyId);
            jSONObject.put(DataConstants.CITY_ID, this.cityId);
            jSONObject.put("landing_page_url", this.landingPageUrl);
            jSONObject.put("imp_log_url", this.exposeLogUrl);
            jSONObject.put("click_log_url", this.clickLogUrl);
            jSONObject.put("monitor_imp_log_url", this.thirdExposeLogUrl);
            jSONObject.put("monitor_click_log_url", this.thirdClickLogUrl);
            jSONObject.put("pic_width", this.picWidth);
            jSONObject.put("pic_height", this.picHeight);
            jSONObject.put("screen_type", this.screenType);
            jSONObject.put("top_color", this.topColor);
            jSONObject.put("bottom_color", this.bottomColor);
            jSONObject.put("text_color", this.textColor);
            jSONObject.put("btn_text", this.btnText);
            jSONObject.put("click_image_url", this.clickImageUrl);
            try {
                jSONObject.put("opacity", this.opacity);
            } catch (Exception e) {
                a.a(e);
            }
            jSONObject.put("idx", this.idx);
            jSONObject.put("charge_info", this.chargeInfo);
            jSONObject.put("ad_type", this.adType);
            jSONObject.put("mat_type", this.matType);
            jSONObject.put("mat_url", this.matUrl);
            jSONObject.put("dsp_logo", this.dspLogo);
            jSONObject.put("mat_height", this.matHeight);
            jSONObject.put("mat_width", this.matWidth);
            jSONObject.put("is_ad", this.isAd);
            jSONObject.put("show_mode", this.showMode);
            if (this.order != null && this.order.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.order.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("order", jSONArray);
            }
            if (this.cycleTime != null && this.cycleTime.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<Timeline> it2 = this.cycleTime.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().convertToJson());
                }
                jSONObject.put("cycle_time", jSONArray2);
            }
            if (this.dailyTime != null && this.dailyTime.size() > 0) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<Timeline> it3 = this.dailyTime.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(it3.next().convertToJson());
                }
                jSONObject.put("daily_time", jSONArray3);
            }
        } catch (JSONException e2) {
            a.a(e2);
        }
        return jSONObject;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "220979df9c69442bc00d1511f1a61527", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "220979df9c69442bc00d1511f1a61527");
        }
        return "WelcomeAd{, screenType=" + this.screenType + ", dailyTime=" + this.dailyTime + ", cycleTime=" + this.cycleTime + ", adType=" + this.adType + ", matType=" + this.matType + ", matUrl='" + this.matUrl + "', matHeight=" + this.matHeight + ", matWidth=" + this.matWidth + ", isAd=" + this.isAd + '}';
    }
}
