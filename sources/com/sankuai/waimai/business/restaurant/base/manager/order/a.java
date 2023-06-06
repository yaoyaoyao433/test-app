package com.sankuai.waimai.business.restaurant.base.manager.order;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.view.ContextThemeWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartPrice;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.restaurant.base.shopcart.b b;
    private ShopCartPrice c;

    public a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, ShopCartPrice shopCartPrice) {
        Object[] objArr = {bVar, shopCartPrice};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b169636443be9b90533c2f3a02e460e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b169636443be9b90533c2f3a02e460e");
            return;
        }
        this.c = shopCartPrice;
        this.b = bVar;
    }

    public final void a(Activity activity, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, int i2, g gVar) {
        Object[] objArr = {activity, goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0deb824b87e4b4880414f30a3f01b768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0deb824b87e4b4880414f30a3f01b768");
            return;
        }
        int a2 = this.b.a(goodsSpu.getId(), goodsSku.getSkuId());
        Object[] objArr2 = {activity, goodsSpu, goodsSku, Integer.valueOf(a2), Integer.valueOf(i2), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57faa0bb2ac35424d2a2c2f09da5a2f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57faa0bb2ac35424d2a2c2f09da5a2f2");
        } else if (gVar == null || gVar.g == null || com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h.a().b()) {
        } else {
            int restrictNum = goodsSku.getRestrictNum();
            if (goodsSpu.isDiscountGood()) {
                int numDiscountRestrict = gVar.g.getNumDiscountRestrict();
                if (b(numDiscountRestrict, this.b.i, i2)) {
                    ae.a(com.meituan.android.singleton.b.a, com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_cart_toast_top_per_order, Integer.valueOf(numDiscountRestrict), Integer.valueOf(numDiscountRestrict)));
                } else if (a(restrictNum, a2, i2)) {
                    ae.a(com.meituan.android.singleton.b.a, com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_cart_toast_top_per_good, Integer.valueOf(restrictNum), Integer.valueOf(restrictNum)));
                } else if (c(goodsSku.getActivityStock(), a2, i2)) {
                    new CustomDialog.a(activity).a((CharSequence) null).b(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_cart_toast_activity_stock, goodsSpu.getName())).a(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_i_know), (DialogInterface.OnClickListener) null).b();
                }
            } else if (goodsSpu.isNXActivity()) {
                if (goodsSpu.activityPolicy == null || goodsSpu.activityPolicy.getDiscountByCount() == null) {
                    return;
                }
                int count = goodsSpu.activityPolicy.getDiscountByCount().getCount();
                int i3 = a2 / count;
                int i4 = ((a2 + i2) / count) - i3;
                if (a(restrictNum, i3, i4)) {
                    ae.a(com.meituan.android.singleton.b.a, com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_cart_toast_top_per_good, Integer.valueOf(goodsSku.getRestrictNum()), Integer.valueOf(goodsSku.getRestrictNum())));
                } else if (c(goodsSku.getActivityStock(), i3, i4)) {
                    new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558962)).a((CharSequence) null).b(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_cart_toast_activity_stock, goodsSpu.getName())).a(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_i_know), (DialogInterface.OnClickListener) null).b();
                }
            } else if (goodsSpu.isNewCustomerDiscount()) {
                int newUserDiscountRestrict = gVar.g.getNewUserDiscountRestrict();
                if (b(newUserDiscountRestrict, this.b.k, i2)) {
                    ae.a(com.meituan.android.singleton.b.a, com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_cart_toast_top_per_order, Integer.valueOf(newUserDiscountRestrict), Integer.valueOf(newUserDiscountRestrict)));
                } else if (a(restrictNum, a2, i2)) {
                    ae.a(com.meituan.android.singleton.b.a, com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_cart_toast_top_per_good, Integer.valueOf(goodsSku.getRestrictNum()), Integer.valueOf(goodsSku.getRestrictNum())));
                } else if (c(goodsSku.getActivityStock(), a2, i2)) {
                    new CustomDialog.a(activity).a((CharSequence) null).b(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_cart_toast_activity_stock, goodsSpu.getName())).a(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_i_know), (DialogInterface.OnClickListener) null).b();
                }
            } else if (goodsSku.activityType == 9 && com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(goodsSpu.getId(), goodsSku.getSkuId()).equals(this.b.m) && a(1, a2, i2)) {
                Context context = com.meituan.android.singleton.b.a;
                ae.a(context, context.getResources().getString(R.string.wm_restaurant_cart_toast_goods_coupon_top_per_order));
            }
        }
    }

    private boolean a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbcd94697ef635f7f4effd00d3c44b1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbcd94697ef635f7f4effd00d3c44b1e")).booleanValue();
        }
        if (i <= 0) {
            return false;
        }
        return com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(i, i2, i3);
    }

    private boolean b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2bdb32a8d82c710d1f72c965ad5b1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2bdb32a8d82c710d1f72c965ad5b1d")).booleanValue();
        }
        if (i == 0 || i == Integer.MAX_VALUE) {
            return false;
        }
        return com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(i, i2, i3);
    }

    private boolean c(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75aa8381508d3c61bbf7cbabc5cedc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75aa8381508d3c61bbf7cbabc5cedc9")).booleanValue();
        }
        if (i == -1) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        return com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(i, i2, i3);
    }
}
