package com.sankuai.waimai.drug.viewHolder;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.drug.adapter.a;
import com.sankuai.waimai.drug.controller.ShopCartBoxPriceDialog;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartHandPriceInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.drug.model.f, a.InterfaceC0932a> {
    public static ChangeQuickRedirect a;
    private Context b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private View g;
    private int h;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_shopcart_adapter_hand_price;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.drug.model.f fVar, int i) {
        Drawable drawable;
        View.OnClickListener onClickListener;
        com.sankuai.waimai.drug.model.f fVar2 = fVar;
        Object[] objArr = {fVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea3f78d7279e764a3e6a1fc8c9d63fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea3f78d7279e764a3e6a1fc8c9d63fd");
        } else if (fVar2 != null) {
            CartHandPriceInfo cartHandPriceInfo = fVar2.s;
            final ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo = fVar2.r;
            Object[] objArr2 = {cartHandPriceInfo, shopCartTotalBoxPriceInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e1be4d1cbd8bb50b9f401657a4b4e32", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e1be4d1cbd8bb50b9f401657a4b4e32");
            } else if (cartHandPriceInfo != null) {
                int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10);
                int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_15);
                int dimensionPixelSize3 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_26);
                int dimensionPixelSize4 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_12);
                int dimensionPixelSize5 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_16);
                Typeface typeface = Typeface.DEFAULT;
                int color = this.b.getResources().getColor(R.color.wm_sg_color_000000);
                int i2 = 8;
                int i3 = cartHandPriceInfo.type;
                if (i3 != 100) {
                    switch (i3) {
                        case 1:
                            typeface = Typeface.DEFAULT_BOLD;
                            dimensionPixelSize4 = dimensionPixelSize5;
                            drawable = null;
                            onClickListener = null;
                            break;
                        case 2:
                            Drawable drawable2 = this.b.getDrawable(R.drawable.wm_drug_order_confirm_ic_question);
                            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.sankuai.waimai.drug.viewHolder.c.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr3 = {view};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4cce336beb3fe0c3b24c041391213de", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4cce336beb3fe0c3b24c041391213de");
                                        return;
                                    }
                                    ShopCartBoxPriceDialog shopCartBoxPriceDialog = new ShopCartBoxPriceDialog(view.getContext());
                                    shopCartBoxPriceDialog.a(shopCartTotalBoxPriceInfo);
                                    shopCartBoxPriceDialog.show();
                                }
                            };
                            drawable = drawable2;
                            onClickListener = onClickListener2;
                            dimensionPixelSize = 0;
                            break;
                        case 3:
                        case 4:
                            color = this.b.getResources().getColor(R.color.wm_st_common_FF4A26);
                            drawable = null;
                            onClickListener = null;
                            dimensionPixelSize = 0;
                            break;
                        default:
                            if (!TextUtils.isEmpty(cartHandPriceInfo.price) && cartHandPriceInfo.price.contains(CommonConstant.Symbol.MINUS)) {
                                color = this.b.getResources().getColor(R.color.wm_st_common_FF4A26);
                            }
                            drawable = null;
                            onClickListener = null;
                            dimensionPixelSize = 0;
                            break;
                    }
                    dimensionPixelSize3 = 0;
                } else {
                    typeface = Typeface.DEFAULT_BOLD;
                    dimensionPixelSize4 = dimensionPixelSize5;
                    drawable = null;
                    onClickListener = null;
                    dimensionPixelSize = 0;
                    i2 = 0;
                }
                this.p.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
                float f = dimensionPixelSize4;
                this.c.setTextSize(0, f);
                this.c.setTypeface(typeface);
                if (drawable != null) {
                    drawable.setBounds(0, this.h / 12, this.h, this.h);
                }
                this.c.setCompoundDrawables(null, null, drawable, null);
                this.e.setTextColor(color);
                this.e.setTextSize(0, f);
                this.g.setVisibility(i2);
                u.a(this.c, cartHandPriceInfo.title);
                u.a(this.d, cartHandPriceInfo.subTitle);
                u.a(this.e, cartHandPriceInfo.price);
                u.a(this.f, cartHandPriceInfo.underlinePrice);
                this.c.setOnClickListener(onClickListener);
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b03522a48ef59c1c0e5e542795b54bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b03522a48ef59c1c0e5e542795b54bcd");
            return;
        }
        this.b = view.getContext();
        this.c = (TextView) view.findViewById(R.id.shop_cart_han_price_item_title);
        this.d = (TextView) view.findViewById(R.id.shop_cart_han_price_item_sub_title);
        this.e = (TextView) view.findViewById(R.id.shop_cart_han_price_item_price);
        this.f = (TextView) view.findViewById(R.id.shop_cart_han_price_item_underline_price);
        this.g = view.findViewById(R.id.shop_cart_han_price_item_divider);
        this.h = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
    }
}
