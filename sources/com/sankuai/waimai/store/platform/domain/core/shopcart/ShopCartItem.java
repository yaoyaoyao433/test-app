package com.sankuai.waimai.store.platform.domain.core.shopcart;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ShopCartItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String activityDescription;
    public String activityLabel;
    public String activityText;
    public String activityTip;
    public String descText;
    public OrderedFood food;
    public HandPriceInfo handPriceInfo;
    public String handPriceInfoList;
    public String importDutiesDesc;
    public String invalidReasonText;
    public String itemStockText;
    public String memberIcon;
    public String overLimit;
    public int pocketId;
    public Map<String, String> priceAB;
    @SerializedName("product_price")
    public b.c productPrice;
    public ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo;
    public String subBoxPrice;
    public String subBoxPriceDesc;

    public ShopCartItem() {
    }

    public boolean isOverLimit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f8f21d83dfaa1b7e9a1470a3d916a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f8f21d83dfaa1b7e9a1470a3d916a1")).booleanValue() : "1".equals(this.overLimit);
    }

    public ShopCartItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83d3d4bb9c0b1a0027d8784658d4e59b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83d3d4bb9c0b1a0027d8784658d4e59b");
        } else {
            this.pocketId = i;
        }
    }

    public ShopCartItem(@NonNull ShopCartItem shopCartItem) {
        Object[] objArr = {shopCartItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41771f5af3231d792adc3b28bd2df33c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41771f5af3231d792adc3b28bd2df33c");
            return;
        }
        this.food = shopCartItem.food.m22clone();
        this.pocketId = shopCartItem.pocketId;
    }

    public GoodsSku getFoodSku() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81a385fbf41ecdcf9e2aa75f25c1d1b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81a385fbf41ecdcf9e2aa75f25c1d1b4");
        }
        if (this.food == null || this.food.sku == null) {
            return new GoodsSku();
        }
        return this.food.sku;
    }

    public boolean showBoxFee() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d95affbea4d1c92e068c936b09375ffe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d95affbea4d1c92e068c936b09375ffe")).booleanValue() : (t.a(this.subBoxPrice) || t.a(this.subBoxPriceDesc)) ? false : true;
    }

    public GoodsSpu getFoodSpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd051e213689965fbbd7e2f324e82f27", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd051e213689965fbbd7e2f324e82f27");
        }
        if (this.food == null || this.food.spu == null) {
            return new GoodsSpu();
        }
        return this.food.spu;
    }

    public GoodsAttr[] getFoodAttrArr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e136664b39714cd503dbd2f53ba1e8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e136664b39714cd503dbd2f53ba1e8c");
        }
        if (this.food == null) {
            this.food = new OrderedFood();
        }
        return this.food.getAttrIds() == null ? new GoodsAttr[0] : this.food.getAttrIds();
    }

    public int getFoodCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0409982fda32d18c258a493e0bb3bcbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0409982fda32d18c258a493e0bb3bcbe")).intValue();
        }
        if (this.food == null) {
            return 0;
        }
        return this.food.getCount();
    }

    public int getMinCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d30b7d231e3c400729281e06fdacc2aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d30b7d231e3c400729281e06fdacc2aa")).intValue();
        }
        if (this.food == null) {
            return 0;
        }
        return this.food.getMinCount();
    }

    public void setFoodCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74146bb2d0c71f3419ed09330ba269cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74146bb2d0c71f3419ed09330ba269cd");
            return;
        }
        if (this.food == null) {
            this.food = new OrderedFood();
        }
        this.food.setCount(i);
    }

    public String getDescText() {
        return this.descText;
    }

    public String getActivityText() {
        return this.activityText;
    }

    public boolean isFoodAvailable() {
        return this.food != null;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07f7fcd44636352c013d936707627887", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07f7fcd44636352c013d936707627887") : this.food != null ? this.food.toString() : StringUtil.NULL;
    }
}
