package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ButtonItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action")
    public int action;
    @SerializedName("button_icon")
    public String buttonIcon;
    @SerializedName("click_url")
    public String clickUrl;
    @SerializedName("code")
    public int code;
    @SerializedName("highlight")
    public int highLight;
    @SerializedName("icon_url")
    public String iconUrl;
    public boolean isShowTip;
    @SerializedName("pop_up_info")
    public Map<String, Object> mPopUpInfo;
    @SerializedName("sub_label_list")
    public List<a> mSubLabelList;
    @SerializedName("sub_title")
    public String subTitle;
    @SerializedName("tip")
    public String tip;
    @SerializedName("title")
    public String title;
    @SerializedName("toast")
    public String toast;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("code")
        public int a;
        @SerializedName("title")
        public String b;
        @SerializedName("desc")
        public String c;
        @SerializedName("highlight")
        public int d;
        @SerializedName("click_url")
        public String e;
        @SerializedName("icon_url")
        public String f;
        @SerializedName("rider_dx_id")
        public String g;
        @SerializedName("rider_phone")
        public String h;
        @SerializedName("button_icon")
        public String i;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32deee8bb66e5d93242e5c8fd3b8dc89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32deee8bb66e5d93242e5c8fd3b8dc89");
            return;
        }
        this.code = jSONObject.optInt("code");
        this.title = jSONObject.optString("title");
        this.clickUrl = jSONObject.optString("click_url");
        this.highLight = jSONObject.optInt("highlight");
        this.tip = jSONObject.optString("tip");
        this.buttonIcon = jSONObject.optString("button_icon");
        this.subTitle = jSONObject.optString("sub_title");
        this.action = jSONObject.optInt("action");
        JSONObject optJSONObject = jSONObject.optJSONObject("pop_up_info");
        if (optJSONObject != null) {
            this.mPopUpInfo = new HashMap();
            try {
                this.mPopUpInfo.put("title", optJSONObject.optString("title"));
                this.mPopUpInfo.put("sub_title", optJSONObject.optString("sub_title"));
                JSONArray optJSONArray = optJSONObject.optJSONArray("sub_label_list");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    a aVar = new a();
                    JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i);
                    aVar.a = jSONObject2.optInt("code");
                    aVar.b = jSONObject2.optString("title");
                    aVar.c = jSONObject2.optString("desc");
                    aVar.d = jSONObject2.optInt("highlight");
                    aVar.e = jSONObject2.optString("click_url");
                    aVar.f = jSONObject2.optString("icon_url");
                    aVar.h = jSONObject2.optString("rider_phone");
                    aVar.g = jSONObject2.optString("rider_dx_id");
                    aVar.i = jSONObject2.optString("button_icon");
                    arrayList.add(aVar);
                }
                this.mPopUpInfo.put("sub_label_list", arrayList);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sub_label_list");
        if (optJSONArray2 != null) {
            this.mSubLabelList = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    a aVar2 = new a();
                    JSONObject jSONObject3 = (JSONObject) optJSONArray2.get(i2);
                    aVar2.a = jSONObject3.optInt("code");
                    aVar2.b = jSONObject3.optString("title");
                    aVar2.c = jSONObject3.optString("desc");
                    aVar2.d = jSONObject3.optInt("highlight");
                    aVar2.e = jSONObject3.optString("click_url");
                    aVar2.f = jSONObject3.optString("icon_url");
                    this.mSubLabelList.add(aVar2);
                } catch (JSONException e2) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e2);
                }
            }
        }
    }

    public boolean isHighLight() {
        return this.highLight == 1;
    }

    public ButtonItem() {
    }

    public ButtonItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e61014717d4b7b965f281baee25946f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e61014717d4b7b965f281baee25946f3");
        } else {
            this.code = i;
        }
    }
}
