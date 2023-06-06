package com.sankuai.waimai.store.shopping.cart.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    SCPageConfig b;
    com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private RelativeLayout d;
    private TextView e;
    private LinearLayout f;
    private TextView g;

    public g(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig) {
        super(context);
        Object[] objArr = {context, aVar, sCPageConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f039ff6130656c01b035ab180faab1b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f039ff6130656c01b035ab180faab1b2");
            return;
        }
        this.c = aVar;
        this.b = sCPageConfig;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c7952cc4858931e7e1f22a8a2a13d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c7952cc4858931e7e1f22a8a2a13d0");
            return;
        }
        super.onViewCreated();
        this.d = (RelativeLayout) this.mView.findViewById(R.id.layout_member_bar);
        this.f = (LinearLayout) this.mView.findViewById(R.id.ll_member_area);
        this.e = (TextView) this.mView.findViewById(R.id.text_member_tag);
        this.g = (TextView) this.mView.findViewById(R.id.text_member_tips);
        ImageView imageView = (ImageView) this.mView.findViewById(R.id.iv_arrow);
        imageView.setImageDrawable(com.sankuai.waimai.store.view.a.a(imageView.getContext(), (int) R.dimen.wm_sc_common_dimen_4, (int) R.dimen.wm_sc_common_dimen_8, (int) R.color.wm_sg_color_5f3f25, a.EnumC1338a.RIGHT));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d750bf3e0636ba1f91e0082172778c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d750bf3e0636ba1f91e0082172778c35");
        } else if (this.d.getVisibility() == 0) {
            com.sankuai.waimai.store.manager.judas.b.b(this.b.d, "b_odtv35iz").a("poi_id", this.c.d()).a();
        }
    }

    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946f3bfafca1e993278876bae728190f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946f3bfafca1e993278876bae728190f");
            return;
        }
        final com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.g gVar = bVar.k;
        if (gVar != null && !t.a(gVar.a)) {
            this.d.setVisibility(0);
            this.g.setText(com.sankuai.waimai.store.util.l.a(gVar.a, this.mContext.getString(R.string.wm_st_shop_cart_high_light_color)));
            if (gVar.d == 0) {
                this.f.setVisibility(8);
                this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.g.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97045a8886758a6b21ae45ff4ce4e01f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97045a8886758a6b21ae45ff4ce4e01f");
                        }
                    }
                });
                return;
            }
            this.f.setVisibility(0);
            this.e.setText(com.sankuai.waimai.store.util.l.a(t.a(gVar.b) ? "" : gVar.b, this.mContext.getString(R.string.wm_st_shop_cart_high_light_color)));
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.g.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "663f9d80b92529cc164b57f3447977f4", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "663f9d80b92529cc164b57f3447977f4");
                    } else if (TextUtils.isEmpty(gVar.c)) {
                    } else {
                        com.sankuai.waimai.store.router.d.a(g.this.mContext, gVar.c);
                        com.sankuai.waimai.store.manager.judas.b.a(g.this.b.d, "b_ngxavf84").a("poi_id", g.this.c.d()).a();
                    }
                }
            });
            return;
        }
        this.d.setVisibility(8);
    }
}
