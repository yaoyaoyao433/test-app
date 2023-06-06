package com.sankuai.waimai.store.shopping.cart.viewHolder;

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
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartHandPriceInfo;
import com.sankuai.waimai.store.shopping.cart.adapter.a;
import com.sankuai.waimai.store.shopping.cart.ui.ShopCartBoxPriceDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g<com.sankuai.waimai.store.platform.domain.core.order.a, a.InterfaceC1328a> {
    public static ChangeQuickRedirect a;
    private Context b;
    private TextView c;
    private TextView d;
    private TextView e;
    private View f;
    private int g;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_shopcart_adapter_hand_price;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.platform.domain.core.order.a aVar, int i) {
        Drawable drawable;
        View.OnClickListener onClickListener;
        com.sankuai.waimai.store.platform.domain.core.order.a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b00ea26eebc95ae14bfdd909ab863f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b00ea26eebc95ae14bfdd909ab863f");
        } else if (aVar2 != null) {
            CartHandPriceInfo cartHandPriceInfo = aVar2.s;
            final ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo = aVar2.r;
            Object[] objArr2 = {cartHandPriceInfo, shopCartTotalBoxPriceInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70b9c0c4778e59b9fcf5302d2f712ee4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70b9c0c4778e59b9fcf5302d2f712ee4");
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
                            Drawable drawable2 = this.b.getDrawable(R.drawable.wm_sc_order_confirm_ic_question);
                            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.viewHolder.c.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr3 = {view};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31446dd6dda1a98bb6b7ea57a369208c", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31446dd6dda1a98bb6b7ea57a369208c");
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
                this.c.setTextSize(0, dimensionPixelSize4);
                this.c.setTypeface(typeface);
                if (drawable != null) {
                    drawable.setBounds(0, this.g / 12, this.g, this.g);
                }
                this.c.setCompoundDrawables(null, null, drawable, null);
                this.e.setTextColor(color);
                this.f.setVisibility(i2);
                u.a(this.c, cartHandPriceInfo.title);
                u.a(this.d, cartHandPriceInfo.subTitle);
                u.a(this.e, cartHandPriceInfo.price);
                this.c.setOnClickListener(onClickListener);
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a3745de99e35ba32ba108ec63d233d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a3745de99e35ba32ba108ec63d233d");
            return;
        }
        this.b = view.getContext();
        this.c = (TextView) view.findViewById(R.id.shop_cart_han_price_item_title);
        this.d = (TextView) view.findViewById(R.id.shop_cart_han_price_item_sub_title);
        this.e = (TextView) view.findViewById(R.id.shop_cart_han_price_item_price);
        this.f = view.findViewById(R.id.shop_cart_han_price_item_divider);
        this.g = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
    }
}
