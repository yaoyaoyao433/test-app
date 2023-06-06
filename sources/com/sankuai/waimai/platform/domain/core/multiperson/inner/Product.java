package com.sankuai.waimai.platform.domain.core.multiperson.inner;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.tencent.connect.common.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Product implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("attrs")
    private ArrayList<GoodsAttr> attrs;
    @SerializedName("count")
    private int count;
    @SerializedName("name")
    private String name;
    @SerializedName("original_price")
    private double originPrice;
    @SerializedName(Constants.PACKAGE_ID)
    private int packageId;
    @SerializedName("price")
    private double price;
    @SerializedName("id")
    private long skuId;
    @SerializedName("spec")
    private String spec;
    @SerializedName("spu_id")
    private long spuId;
    @SerializedName("sub_total_price")
    private double totalPrice;

    public static Product fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fecb04b3d35f9cf916fb6f7f781da562", RobustBitConfig.DEFAULT_VALUE)) {
            return (Product) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fecb04b3d35f9cf916fb6f7f781da562");
        }
        if (jSONObject == null) {
            return null;
        }
        Product product = new Product();
        product.setSkuId(jSONObject.optLong("id"));
        product.setName(jSONObject.optString("name"));
        product.setPrice(jSONObject.optDouble("price"));
        product.setOriginPrice(jSONObject.optDouble("original_price"));
        product.setCount(jSONObject.optInt("count"));
        product.setTotalPrice(jSONObject.optDouble("sub_total_price"));
        ArrayList<GoodsAttr> arrayList = new ArrayList<>();
        ArrayList<GoodsAttr> fromJsonArray = GoodsAttr.fromJsonArray(jSONObject.optJSONArray("attrs"));
        ArrayList<GoodsAttr> fromPremiumJsonArray = GoodsAttr.fromPremiumJsonArray(jSONObject.optJSONArray("premium_attr_list"));
        if (fromJsonArray != null) {
            arrayList.addAll(fromJsonArray);
        }
        if (fromPremiumJsonArray != null) {
            arrayList.addAll(fromPremiumJsonArray);
        }
        product.setAttrs(arrayList);
        product.setPackageId(jSONObject.optInt(Constants.PACKAGE_ID));
        product.setSpuId(jSONObject.optLong("spu_id"));
        product.setSpec(jSONObject.optString("spec"));
        return product;
    }

    public static ArrayList<Product> formJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1d29f45f78497cdfbb221799311cb68", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1d29f45f78497cdfbb221799311cb68");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<Product> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            Product fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    private String getAttrsStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cf6a77aca78a5b5cd9748a2dad07dda", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cf6a77aca78a5b5cd9748a2dad07dda");
        }
        if (this.attrs == null || this.attrs.size() == 0) {
            return "";
        }
        if (this.attrs.size() == 1) {
            return this.attrs.get(0).getValue();
        }
        String value = this.attrs.get(0).getValue();
        for (int i = 1; i < this.attrs.size(); i++) {
            value = value + "+" + this.attrs.get(i).getValue();
        }
        return value;
    }

    public String getSpecAndAttrStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "648b875abba26d3a753a37a9bd478c71", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "648b875abba26d3a753a37a9bd478c71");
        }
        if (TextUtils.isEmpty(this.spec)) {
            return getAttrsStr();
        }
        if (TextUtils.isEmpty(getAttrsStr())) {
            return this.spec;
        }
        return this.spec + "+" + getAttrsStr();
    }

    public long getSkuId() {
        return this.skuId;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getOriginPrice() {
        return this.originPrice;
    }

    public int getCount() {
        return this.count;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public ArrayList<GoodsAttr> getAttrs() {
        return this.attrs;
    }

    public int getPackageId() {
        return this.packageId;
    }

    public long getSpuId() {
        return this.spuId;
    }

    public String getSpec() {
        return this.spec;
    }

    public void setSkuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f08b9fc45d23322e332c45d702ce8930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f08b9fc45d23322e332c45d702ce8930");
        } else {
            this.skuId = j;
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d848cfcf773ca2d9f39ba585537cde0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d848cfcf773ca2d9f39ba585537cde0");
        } else {
            this.price = d;
        }
    }

    public void setOriginPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c088e37be759f75fdc8068edd419bf7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c088e37be759f75fdc8068edd419bf7e");
        } else {
            this.originPrice = d;
        }
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setTotalPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ada7971d287dfd9703a30adcd983755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ada7971d287dfd9703a30adcd983755");
        } else {
            this.totalPrice = d;
        }
    }

    public void setAttrs(ArrayList<GoodsAttr> arrayList) {
        this.attrs = arrayList;
    }

    public void setPackageId(int i) {
        this.packageId = i;
    }

    public void setSpuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8df9e81d69fabfe82d849dd005b1d495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8df9e81d69fabfe82d849dd005b1d495");
        } else {
            this.spuId = j;
        }
    }

    public void setSpec(String str) {
        this.spec = str;
    }
}
