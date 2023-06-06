package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Recommend implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("spu_list")
    public List<GoodsSpu> goodsSpuList;
    @SerializedName("log_field")
    public LogField logField;
    @SerializedName("title")
    public String title;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e72636fec27590572ef9052f3d8cfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e72636fec27590572ef9052f3d8cfb");
            return;
        }
        this.title = jSONObject.optString("title");
        JSONArray optJSONArray = jSONObject.optJSONArray("spu_list");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.goodsSpuList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("tag", "");
                GoodsSpu goodsSpu = new GoodsSpu();
                goodsSpu.parseJson(optJSONObject);
                goodsSpu.setTag(optString);
                this.goodsSpuList.add(goodsSpu);
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("log_field");
        this.logField = new LogField();
        this.logField.parseJson(optJSONObject2);
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LogField implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("recommend_food_type")
        public int recommendFoodType;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd53403e8515fb4f9f4ea202f3b000e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd53403e8515fb4f9f4ea202f3b000e4");
            } else {
                this.recommendFoodType = jSONObject.optInt("recommend_food_type");
            }
        }
    }
}
