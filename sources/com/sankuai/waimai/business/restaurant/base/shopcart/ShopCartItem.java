package com.sankuai.waimai.business.restaurant.base.shopcart;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ShopCartItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<com.sankuai.waimai.platform.widget.tag.api.d> actTags;
    public String activityIconUrl;
    public OrderedFood food;
    @SerializedName("nxItemCount")
    @Expose
    public int nxItemCount;
    public int pocketId;

    public void setNXItemCount(int i) {
        this.nxItemCount = i;
    }

    public int getNXItemCount() {
        return this.nxItemCount;
    }

    public ShopCartItem() {
    }

    public ShopCartItem(int i) {
        this();
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca8efe9bb8282fac7788738d1e2000da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca8efe9bb8282fac7788738d1e2000da");
        } else {
            this.pocketId = i;
        }
    }

    public ShopCartItem(@NonNull ShopCartItem shopCartItem) {
        Object[] objArr = {shopCartItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcb3876072636dfb60c039d4d30ea01e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcb3876072636dfb60c039d4d30ea01e");
            return;
        }
        this.food = shopCartItem.food.m19clone();
        this.pocketId = shopCartItem.pocketId;
        this.nxItemCount = shopCartItem.nxItemCount;
    }

    public GoodsSku getFoodSku() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "319ade1bb08c2862710248d9525e4608", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "319ade1bb08c2862710248d9525e4608");
        }
        if (this.food == null || this.food.sku == null) {
            return new GoodsSku();
        }
        return this.food.sku;
    }

    public GoodsSpu getFoodSpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "199cacc406fbb603c099f8d4b0411a3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "199cacc406fbb603c099f8d4b0411a3d");
        }
        if (this.food == null || this.food.spu == null) {
            return new GoodsSpu();
        }
        return this.food.spu;
    }

    public GoodsAttr[] getFoodAttrArr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07ff9373ace3243f7896f4dde8b95df0", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07ff9373ace3243f7896f4dde8b95df0");
        }
        if (this.food == null) {
            this.food = new OrderedFood();
        }
        return this.food.getAttrIds() == null ? new GoodsAttr[0] : this.food.getAttrIds();
    }

    public int getFoodCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0497bfd3acfce860b0d3e3c38ba89e9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0497bfd3acfce860b0d3e3c38ba89e9a")).intValue();
        }
        if (this.food == null) {
            return 0;
        }
        return this.food.getCount();
    }

    public void setFoodCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4d095c801f094ae596d9e035b4b1cc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4d095c801f094ae596d9e035b4b1cc0");
            return;
        }
        if (this.food == null) {
            this.food = new OrderedFood();
        }
        this.food.setCount(i);
    }

    public boolean isPocket() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10dc1d159e8e102ea2257e1bcc8ae795", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10dc1d159e8e102ea2257e1bcc8ae795")).booleanValue();
        }
        if (this.food != null) {
            return this.food.spu == null && this.food.sku == null && this.food.getAttrIds() == null;
        }
        return true;
    }

    public boolean isFoodAvailable() {
        return this.food != null;
    }

    public OrderedFood getFood() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0714b495c581ea24bca22b5355596550", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0714b495c581ea24bca22b5355596550");
        }
        if (this.food == null) {
            this.food = new OrderedFood();
        }
        return this.food;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "143cd96813839f88529c41558530b186", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "143cd96813839f88529c41558530b186") : this.food != null ? this.food.toString() : StringUtil.NULL;
    }
}
