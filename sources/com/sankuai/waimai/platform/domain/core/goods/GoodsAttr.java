package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsAttr implements Serializable {
    public static final int MODE_ADD_PRICE_SALE_ATTR = 999;
    public static final int MODE_SALE_ATTR = 2;
    public static final int MODE_UN_SALE_ATTR = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("count")
    public int count;
    @SerializedName("id")
    @Expose
    public long id;
    @SerializedName("hidden")
    public boolean isHidden;
    @SerializedName("repeatable_choice")
    public boolean isRepeatableChoice;
    @SerializedName(JsBridgeResult.ARG_KEY_LOCATION_MODE)
    public int mode;
    @SerializedName("mutex_attrs")
    public List<Long> mutexAttrs;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    public double price;
    @SerializedName("sequence")
    public int sequence;
    @SerializedName("sku_ids")
    public List<Long> skuIds;
    @SerializedName("status")
    public int status;
    @SerializedName("unit")
    public String unit;
    @SerializedName("value")
    @Expose
    public String value;

    public GoodsAttr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4724591aae67f80b526690c9bc3d51a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4724591aae67f80b526690c9bc3d51a");
        } else {
            this.count = 1;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public int getMode() {
        return this.mode;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public boolean isHidden() {
        return this.isHidden;
    }

    public void setHidden(boolean z) {
        this.isHidden = z;
    }

    public boolean isRepeatableChoice() {
        return this.isRepeatableChoice;
    }

    public void setRepeatableChoice(boolean z) {
        this.isRepeatableChoice = z;
    }

    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59695023ecc0d74ba3bce08a6edc948b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59695023ecc0d74ba3bce08a6edc948b");
            return;
        }
        try {
            this.id = jSONObject.optLong("id");
            this.value = jSONObject.optString("value", "");
            this.status = jSONObject.optInt("status", 0);
            this.price = jSONObject.optDouble("price", 0.0d);
            this.count = jSONObject.optInt("count", 1);
            this.mode = jSONObject.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("sku_ids");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.skuIds = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.skuIds.add(Long.valueOf(optJSONArray.optLong(i)));
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("mutex_attrs");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                return;
            }
            this.mutexAttrs = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.mutexAttrs.add(Long.valueOf(optJSONArray2.optLong(i2)));
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    /* renamed from: clone */
    public GoodsAttr m15clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56f886d1510aee3a1c0b3c012f30bd26", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56f886d1510aee3a1c0b3c012f30bd26");
        }
        Gson gson = new Gson();
        GoodsAttr goodsAttr = (GoodsAttr) gson.fromJson(gson.toJson(this), (Class<Object>) GoodsAttr.class);
        if (goodsAttr != this) {
            com.sankuai.waimai.foundation.utils.log.a.b("gson", "gson ace FoodAttrs !!", new Object[0]);
        }
        return goodsAttr;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "562d93e94bd7e8051238d5e5dbf28841", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "562d93e94bd7e8051238d5e5dbf28841")).booleanValue();
        }
        if (obj instanceof GoodsAttr) {
            GoodsAttr goodsAttr = (GoodsAttr) obj;
            return (goodsAttr.mode == 999 || goodsAttr.mode == 999) ? this.id == goodsAttr.id && this.count == goodsAttr.count : this.id == goodsAttr.id;
        }
        return false;
    }

    public static GoodsAttr fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b013ec49062e701d2e05766c936de18a", RobustBitConfig.DEFAULT_VALUE) ? (GoodsAttr) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b013ec49062e701d2e05766c936de18a") : fromJson(jSONObject, false, -1);
    }

    public static GoodsAttr fromJson(JSONObject jSONObject, boolean z, int i) {
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17980e27d1d2bf0241d83dbfa3980835", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17980e27d1d2bf0241d83dbfa3980835");
        }
        if (jSONObject == null) {
            return null;
        }
        GoodsAttr goodsAttr = new GoodsAttr();
        String optString = jSONObject.optString("id", "0");
        if (optString.contains(CommonConstant.Symbol.DOT) || optString.contains("e") || optString.contains("E") || optString.equals("NaN")) {
            try {
                goodsAttr.id = Double.valueOf(optString).longValue();
            } catch (NumberFormatException unused) {
                goodsAttr.id = 0L;
            }
        } else {
            goodsAttr.id = r.a(optString, 0L);
        }
        goodsAttr.value = jSONObject.optString("value");
        goodsAttr.status = jSONObject.optInt("status", 0);
        goodsAttr.price = jSONObject.optDouble("price", 0.0d);
        goodsAttr.count = jSONObject.optInt("count", 1);
        if (z) {
            goodsAttr.mode = i;
        } else {
            goodsAttr.mode = jSONObject.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, 1);
        }
        goodsAttr.isHidden = jSONObject.optBoolean("hidden");
        goodsAttr.sequence = jSONObject.optInt("sequence");
        goodsAttr.isRepeatableChoice = jSONObject.optBoolean("repeatable_choice");
        JSONArray optJSONArray = jSONObject.optJSONArray("sku_ids");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            goodsAttr.skuIds = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                goodsAttr.skuIds.add(Long.valueOf(optJSONArray.optLong(i2)));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("mutex_attrs");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            goodsAttr.mutexAttrs = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                goodsAttr.mutexAttrs.add(Long.valueOf(optJSONArray2.optLong(i3)));
            }
        }
        return goodsAttr;
    }

    public static ArrayList<GoodsAttr> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07c7bfaa12db9713c9cfc371393fe3ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07c7bfaa12db9713c9cfc371393fe3ac");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<GoodsAttr> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            GoodsAttr fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static ArrayList<GoodsAttr> fromPremiumJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ffe92e3aef52352fed583486a71ad4f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ffe92e3aef52352fed583486a71ad4f2");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<GoodsAttr> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            GoodsAttr fromJson = fromJson(jSONArray.optJSONObject(i), true, 999);
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static GoodsAttr convert(GoodsAttr goodsAttr) {
        Object[] objArr = {goodsAttr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06a7af934fda6316b158d9dcaeb2decc", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06a7af934fda6316b158d9dcaeb2decc");
        }
        GoodsAttr goodsAttr2 = new GoodsAttr();
        goodsAttr2.id = goodsAttr.id;
        goodsAttr2.value = goodsAttr.getValue();
        return goodsAttr2;
    }

    public static List<GoodsAttr> convert(List<GoodsAttr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f01a3430388312c5886e5b3950d58dee", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f01a3430388312c5886e5b3950d58dee");
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            for (GoodsAttr goodsAttr : list) {
                arrayList.add(convert(goodsAttr));
            }
        }
        return arrayList;
    }

    public JSONObject toAddPriceJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27e6e0a377a1a954908180af3f9b4538", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27e6e0a377a1a954908180af3f9b4538");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isHidden", this.isHidden);
            jSONObject.put("isRepeatableChoice", this.isRepeatableChoice);
            jSONObject.put("count", this.count);
            jSONObject.put("sequence", this.sequence);
            jSONObject.put("id", this.id);
            jSONObject.put("value", this.value);
            jSONObject.put("unit", this.unit);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
