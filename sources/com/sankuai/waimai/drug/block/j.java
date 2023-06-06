package com.sankuai.waimai.drug.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.view.a;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    private View c;
    private ImageView d;
    private TextView e;
    private LinearLayout f;
    private TextView g;
    private ImageView h;

    public j(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf79f04c05d2af6480866577ce580646", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf79f04c05d2af6480866577ce580646");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00598c11bfbe03f63673f4b9197e47c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00598c11bfbe03f63673f4b9197e47c1");
            return;
        }
        super.onViewCreated();
        this.c = this.mView.findViewById(R.id.layout_plus_discount_bar);
        this.d = (ImageView) this.mView.findViewById(R.id.img_shop_cart_plus_icon);
        this.f = (LinearLayout) this.mView.findViewById(R.id.ll_plus_area);
        this.e = (TextView) this.mView.findViewById(R.id.text_plus_tag);
        this.g = (TextView) this.mView.findViewById(R.id.text_plus_tips);
        this.h = (ImageView) this.mView.findViewById(R.id.img_shop_cart_arrow);
    }

    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c cVar, com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb667c0a4a37d1c45cad973dd8bdeb21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb667c0a4a37d1c45cad973dd8bdeb21");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.a b = cVar.b();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) bVar.c)) {
            this.c.setVisibility(8);
        } else if (b != null && !t.a(b.b)) {
            this.c.setVisibility(0);
            String str = b.a;
            if (!TextUtils.isEmpty(str)) {
                com.sankuai.waimai.store.util.m.a(str).a(this.d);
            } else {
                this.d.setImageResource(R.drawable.wm_drug_shopcart_plus);
            }
            this.g.setText(com.sankuai.waimai.store.util.l.a(b.b, this.mContext.getString(R.string.wm_st_shop_cart_high_light_color)));
            this.e.setText(com.sankuai.waimai.store.util.l.a(t.a(b.c) ? "" : b.c, this.mContext.getString(R.string.wm_st_shop_cart_high_light_color)));
            this.h.setImageDrawable(com.sankuai.waimai.store.view.a.a(getContext(), R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.wm_sg_color_FF6D27, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT));
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.j.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1deac1079271f4d6251ba2ee8f87d4ff", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1deac1079271f4d6251ba2ee8f87d4ff");
                        return;
                    }
                    String plusScheme = j.this.b.b.getPlusScheme();
                    if (t.a(plusScheme)) {
                        return;
                    }
                    com.sankuai.waimai.store.router.d.a(j.this.mContext, plusScheme);
                }
            });
        } else {
            this.c.setVisibility(8);
        }
    }
}
