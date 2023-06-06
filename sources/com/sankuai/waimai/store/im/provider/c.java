package com.sankuai.waimai.store.im.provider;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.im.poi.model.SGOneCoupon;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.im.base.c<SGOneCoupon> {
    public static ChangeQuickRedirect a;
    public e.a b;
    com.sankuai.waimai.store.im.poi.contract.a g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public TextView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;
    }

    @Override // com.sankuai.waimai.store.im.base.c
    public final int a() {
        return R.layout.wm_sc_im_custom_one_coupon_message;
    }

    @Override // com.sankuai.waimai.store.im.base.c
    public final /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable SGOneCoupon sGOneCoupon) {
        final SGOneCoupon sGOneCoupon2 = sGOneCoupon;
        Object[] objArr = {view, bVar, sGOneCoupon2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce50fce40c7f24cbc301cebe4f5b76c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce50fce40c7f24cbc301cebe4f5b76c5");
        } else if (sGOneCoupon2 != null) {
            a aVar = new a();
            aVar.e = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_discount_unit);
            aVar.d = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_money_unit);
            aVar.a = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_value);
            aVar.b = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_sub_description);
            aVar.c = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_coupon_valid_time);
            aVar.f = (TextView) view.findViewById(R.id.wm_sc_im_tv_touse);
            aVar.g = (TextView) view.findViewById(R.id.wm_sc_im_custom_one_title);
            aVar.a.setText(i.a(sGOneCoupon2.price));
            aVar.b.setText(sGOneCoupon2.couponDesc);
            if (!TextUtils.isEmpty(sGOneCoupon2.expireDate)) {
                aVar.c.setText(String.format(view.getContext().getString(R.string.wm_sg_valid_time), sGOneCoupon2.expireDate));
            }
            if (sGOneCoupon2.couponType == 2) {
                aVar.e.setVisibility(0);
                aVar.d.setVisibility(8);
            } else {
                aVar.e.setVisibility(8);
                aVar.d.setVisibility(0);
            }
            if (t.a(sGOneCoupon2.name)) {
                u.a(aVar.g, "商家优惠券");
            } else {
                u.a(aVar.g, sGOneCoupon2.name);
            }
            u.a(aVar.f);
            u.a(aVar.f, view.getContext().getString(R.string.wm_sc_shop_accept_use));
            if (this.b != null) {
                aVar.f.setBackground(this.b.a());
            }
            aVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.provider.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a83f6e5f9997cf498bc4e49a864099e3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a83f6e5f9997cf498bc4e49a864099e3");
                        return;
                    }
                    c cVar = c.this;
                    SGOneCoupon sGOneCoupon3 = sGOneCoupon2;
                    Object[] objArr3 = {view2, sGOneCoupon3};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "6e0aaa08e84eb0d02a17fde1b99aa466", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "6e0aaa08e84eb0d02a17fde1b99aa466");
                        return;
                    }
                    if (cVar.g != null) {
                        cVar.g.bv_();
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_uv1gheg6_mc").a("poi_id", sGOneCoupon3.poiId).a();
                }
            });
        }
    }

    public c(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, com.sankuai.waimai.store.im.poi.contract.a aVar2) {
        super(null, null);
        Object[] objArr = {null, null, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b8492309151c29989b3c4713b0ddea1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b8492309151c29989b3c4713b0ddea1");
            return;
        }
        this.g = aVar2;
        if (aVar2 == null || aVar2.bw_() == null) {
            return;
        }
        this.b = new e.a().a(com.sankuai.waimai.store.util.b.b(aVar2.bw_(), R.color.wm_sg_im_color_FFC300)).b(aVar2.bw_().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_half)).c(com.sankuai.waimai.store.util.b.b(aVar2.bw_(), R.color.white)).a(aVar2.bw_().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_19));
    }
}
