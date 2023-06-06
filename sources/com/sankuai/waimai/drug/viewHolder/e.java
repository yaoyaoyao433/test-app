package com.sankuai.waimai.drug.viewHolder;

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
import com.sankuai.waimai.drug.adapter.a;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.drug.model.f, a.InterfaceC0932a> {
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
        return R.layout.wm_drug_shopcart_adapter_food_item_invaild;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.drug.model.f fVar, int i) {
        OrderedFood orderedFood;
        String picture;
        com.sankuai.waimai.drug.model.f fVar2 = fVar;
        Object[] objArr = {fVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0637205d321ca2622f03393e069d8421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0637205d321ca2622f03393e069d8421");
        } else if (fVar2 == null || fVar2.h == null || (orderedFood = fVar2.h.food) == null) {
        } else {
            this.c.setText(orderedFood.getName());
            Object[] objArr2 = {orderedFood};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56a4dfebe45d667784b41fbefa9ba504", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56a4dfebe45d667784b41fbefa9ba504");
            } else {
                this.b.setTypeface(Typeface.defaultFromStyle(1));
                this.b.setText(orderedFood.sku == null ? "" : i.a(orderedFood.sku.originPrice));
            }
            Object[] objArr3 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6fd47e74301ecba696141e0b5f3ed9b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6fd47e74301ecba696141e0b5f3ed9b7");
            } else {
                if (fVar2.g) {
                    this.h.setVisibility(0);
                } else {
                    this.h.setVisibility(8);
                }
                if (fVar2.f == 0) {
                    this.g.setVisibility(8);
                } else {
                    this.g.setVisibility(0);
                }
            }
            Object[] objArr4 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "034cf7e85b6080844c1a230fbfee91b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "034cf7e85b6080844c1a230fbfee91b2");
            } else {
                OrderedFood orderedFood2 = fVar2.h.food;
                Object[] objArr5 = {orderedFood2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "4489b6d451f9e9da4ade93c3aa523735", RobustBitConfig.DEFAULT_VALUE)) {
                    picture = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "4489b6d451f9e9da4ade93c3aa523735");
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
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "417609eff5f1528228cd36cd0a68bb4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "417609eff5f1528228cd36cd0a68bb4b");
            } else if (TextUtils.isEmpty(orderedFood.getSpec())) {
                this.d.setVisibility(4);
            } else {
                this.d.setVisibility(0);
                this.d.setText(orderedFood.getSpec());
            }
            Object[] objArr7 = {fVar2};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "bd90930e01630e2dd3d8e84e1bd0a1a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "bd90930e01630e2dd3d8e84e1bd0a1a2");
                return;
            }
            String str = fVar2.h.invalidReasonText;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e445e89880a389476bafd4b1bace76e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e445e89880a389476bafd4b1bace76e9");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b1f44b24307e1159bbd47fa508f73b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b1f44b24307e1159bbd47fa508f73b8");
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
