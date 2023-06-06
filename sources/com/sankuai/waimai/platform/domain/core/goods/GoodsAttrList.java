package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsAttrList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(JsBridgeResult.ARG_KEY_LOCATION_MODE)
    public int mode;
    @SerializedName("name")
    public String name;
    @SerializedName("values")
    public List<GoodsAttr> values;

    public String getName() {
        return this.name;
    }

    public List<GoodsAttr> getValues() {
        return this.values;
    }

    public int getMode() {
        return this.mode;
    }

    /* renamed from: clone */
    public GoodsAttrList m16clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4559c74c0dda11d5035d83405b6b2ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttrList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4559c74c0dda11d5035d83405b6b2ab");
        }
        Gson gson = new Gson();
        GoodsAttrList goodsAttrList = (GoodsAttrList) gson.fromJson(gson.toJson(this), (Class<Object>) GoodsAttrList.class);
        if (goodsAttrList != this) {
            com.sankuai.waimai.foundation.utils.log.a.b("gson", "gson ace FoodAttrsList !!", new Object[0]);
        }
        return goodsAttrList;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "952ae8b90f3c4310c2ef97e717228d60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "952ae8b90f3c4310c2ef97e717228d60");
            return;
        }
        try {
            this.name = jSONObject.optString("name", "");
            this.mode = jSONObject.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            this.values = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                GoodsAttr goodsAttr = new GoodsAttr();
                goodsAttr.parseJson(optJSONObject);
                goodsAttr.setName(this.name);
                goodsAttr.setMode(this.mode);
                this.values.add(goodsAttr);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
