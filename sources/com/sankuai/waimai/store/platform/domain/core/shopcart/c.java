package com.sankuai.waimai.store.platform.domain.core.shopcart;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("id")
    public int b;
    @SerializedName("activity_desc")
    public String c;
    @SerializedName("activity_name")
    public String d;
    @SerializedName("activity_title")
    public String e;
    @SerializedName("actUuid")
    public String f;
    @SerializedName("activity_type")
    public int g;
    @SerializedName("activity_button")
    public String h;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String i;
    public List<ShopCartItem> j;
    public double k;

    public c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90885207483d42c36ea71ce7db40582", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90885207483d42c36ea71ce7db40582");
            return;
        }
        this.b = i;
        this.j = new ArrayList();
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa70af4ce5d3823bdb947ba4dbc2796e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa70af4ce5d3823bdb947ba4dbc2796e")).intValue();
        }
        int i = 0;
        for (int i2 = 0; this.j != null && i2 < this.j.size(); i2++) {
            ShopCartItem shopCartItem = this.j.get(i2);
            if (shopCartItem.food != null) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int a(long j) {
        int i = 0;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484b018aa6e4b75fb64e61b36a400fb8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484b018aa6e4b75fb64e61b36a400fb8")).intValue();
        }
        if (this.j == null || this.j.size() <= 0) {
            return 0;
        }
        for (ShopCartItem shopCartItem : this.j) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && !TextUtils.equals(shopCartItem.food.getActivityTag(), GoodsSpu.ITEM_COLLECTION_REDEEM)) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int a(long j, String str) {
        int i = 0;
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b65a84eebb68d219fb4e5002ee09b5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b65a84eebb68d219fb4e5002ee09b5a")).intValue();
        }
        if (this.j == null || this.j.size() <= 0) {
            return 0;
        }
        for (ShopCartItem shopCartItem : this.j) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && TextUtils.equals(shopCartItem.food.getActivityTag(), str)) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int a(long j, long j2) {
        int i = 0;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9481db1d1e46fc3ae335187a86f2fa8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9481db1d1e46fc3ae335187a86f2fa8d")).intValue();
        }
        if (this.j == null || this.j.size() <= 0) {
            return 0;
        }
        for (ShopCartItem shopCartItem : this.j) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && shopCartItem.food.getSkuId() == j2) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int a(long j, long j2, String str) {
        Object[] objArr = {new Long(j), new Long(j2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be91c7e198c9efe446bac58b4cb83603", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be91c7e198c9efe446bac58b4cb83603")).intValue();
        }
        if (this.j == null || this.j.size() <= 0) {
            return 0;
        }
        int i = 0;
        for (ShopCartItem shopCartItem : this.j) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && shopCartItem.food.getSkuId() == j2 && TextUtils.equals(shopCartItem.food.getActivityTag(), str)) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int a(long j, long j2, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "706ced9d208c5239fb9157133161723d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "706ced9d208c5239fb9157133161723d")).intValue();
        }
        if (this.j == null || this.j.size() <= 0) {
            return 0;
        }
        int i = 0;
        for (ShopCartItem shopCartItem : this.j) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && shopCartItem.food.getSkuId() == j2 && shopCartItem.food.isSameAttrs(goodsAttrArr)) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final HandPriceInfo b(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b94ab5307f3269da2f5c1224549c6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b94ab5307f3269da2f5c1224549c6f");
        }
        if (com.sankuai.shangou.stone.util.a.b(this.j)) {
            return null;
        }
        for (ShopCartItem shopCartItem : this.j) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && shopCartItem.food.getSkuId() == j2) {
                return shopCartItem.handPriceInfo;
            }
        }
        return null;
    }

    public final String c(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687c596f4484ae705502e9d9082cdd69", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687c596f4484ae705502e9d9082cdd69");
        }
        if (com.sankuai.shangou.stone.util.a.b(this.j)) {
            return null;
        }
        for (ShopCartItem shopCartItem : this.j) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && shopCartItem.food.getSkuId() == j2) {
                return shopCartItem.handPriceInfoList;
            }
        }
        return null;
    }

    public final int b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8832755a879ab43ba0f31de3f971cc5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8832755a879ab43ba0f31de3f971cc5b")).intValue();
        }
        if (this.j != null) {
            for (ShopCartItem shopCartItem : this.j) {
                if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.spu != null && shopCartItem.food.sku != null && shopCartItem.food.spu.isDiscountGood()) {
                    int count = shopCartItem.food.getCount();
                    i = ((shopCartItem.food.sku.getRestrictNum() < 0 || count <= shopCartItem.food.sku.getRestrictNum()) && (shopCartItem.food.sku.getActivityStock() < 0 || count <= shopCartItem.food.sku.getActivityStock())) ? i + count : i + shopCartItem.food.countDiscountNum;
                }
            }
        }
        return i;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "320597b1e56ac85ed42e8f9adb170db3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "320597b1e56ac85ed42e8f9adb170db3") : this.j.toString();
    }
}
