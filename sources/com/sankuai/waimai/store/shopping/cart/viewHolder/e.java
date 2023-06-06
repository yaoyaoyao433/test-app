package com.sankuai.waimai.store.shopping.cart.viewHolder;

import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.shopping.cart.adapter.a;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends g<com.sankuai.waimai.store.platform.domain.core.order.a, a.InterfaceC1328a> {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private UniversalImageView f;
    private View g;
    private View h;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_shopcart_adapter_food_item_invaild;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.platform.domain.core.order.a aVar, int i) {
        OrderedFood orderedFood;
        String picture;
        com.sankuai.waimai.store.platform.domain.core.order.a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddbaa898d2fe6bfce27fd8182cf4a222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddbaa898d2fe6bfce27fd8182cf4a222");
        } else if (aVar2 == null || aVar2.h == null || (orderedFood = aVar2.h.food) == null) {
        } else {
            this.c.setText(orderedFood.getName());
            Object[] objArr2 = {orderedFood};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2bc098b607aae42339d741e63187ae0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2bc098b607aae42339d741e63187ae0");
            } else {
                this.b.setTypeface(Typeface.defaultFromStyle(1));
                this.b.setText(orderedFood.sku == null ? "" : i.a(orderedFood.sku.originPrice));
            }
            Object[] objArr3 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d7b0a44cd928c63457b3373164973916", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d7b0a44cd928c63457b3373164973916");
            } else {
                if (aVar2.g) {
                    this.h.setVisibility(0);
                } else {
                    this.h.setVisibility(8);
                }
                if (aVar2.f == 0) {
                    this.g.setVisibility(8);
                } else {
                    this.g.setVisibility(0);
                }
            }
            Object[] objArr4 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6335a20f4bae3aa500bd87801098be25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6335a20f4bae3aa500bd87801098be25");
            } else {
                OrderedFood orderedFood2 = aVar2.h.food;
                Object[] objArr5 = {orderedFood2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "eb0309b753afa9cfa84a80271d7bc207", RobustBitConfig.DEFAULT_VALUE)) {
                    picture = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "eb0309b753afa9cfa84a80271d7bc207");
                } else if (orderedFood2 == null) {
                    picture = "";
                } else {
                    picture = t.a(orderedFood2.spu.getPicture()) ? orderedFood2.sku.getPicture() : orderedFood2.spu.getPicture();
                }
                b.C0608b a2 = m.a(picture, h.a(this.p.getContext(), 57.0f), ImageQualityUtil.b());
                a2.j = R.drawable.wm_sc_common_poi_error;
                a2.i = R.drawable.wm_sc_common_loading_large;
                a2.a((ImageView) this.f);
            }
            Object[] objArr6 = {orderedFood};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "287b5c81ef4d584dabc518fd7cb7f534", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "287b5c81ef4d584dabc518fd7cb7f534");
            } else if (TextUtils.isEmpty(orderedFood.getSpec())) {
                this.d.setVisibility(4);
            } else {
                this.d.setVisibility(0);
                this.d.setText(orderedFood.getSpec());
            }
            Object[] objArr7 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b6592e088f8ce2214dca15d00758cdc0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b6592e088f8ce2214dca15d00758cdc0");
                return;
            }
            String str = aVar2.h.invalidReasonText;
            TextView textView = this.e;
            if (TextUtils.isEmpty(str)) {
                str = this.p.getContext().getResources().getString(R.string.wm_sc_shop_cart_invaild_good_tag);
            }
            u.a(textView, str);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a74239c2b1c79e51c35111aa509607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a74239c2b1c79e51c35111aa509607");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad16de676b50232e37670d02dd965f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad16de676b50232e37670d02dd965f64");
            return;
        }
        this.g = view.findViewById(R.id.view_food_divider);
        this.h = view.findViewById(R.id.view_food_divider_bottom);
        this.f = (UniversalImageView) view.findViewById(R.id.img_food_pic);
        this.b = (TextView) view.findViewById(R.id.txt_food_price);
        this.c = (TextView) view.findViewById(R.id.txt_food_name);
        this.d = (TextView) view.findViewById(R.id.txt_food_spec);
        this.e = (TextView) view.findViewById(R.id.txt_stickyfood_status_out);
    }
}
