package com.sankuai.waimai.drug.block;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final Activity b;
    protected SCPageConfig c;
    protected final String d;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    com.sankuai.waimai.drug.contract.a f;
    com.sankuai.waimai.store.shopping.cart.a g;
    private TextView h;
    private RelativeLayout i;
    private TextView j;

    public m(@NonNull Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, String str, com.sankuai.waimai.drug.contract.a aVar2, com.sankuai.waimai.store.shopping.cart.a aVar3) {
        super(activity);
        Object[] objArr = {activity, aVar, sCPageConfig, str, aVar2, aVar3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feebcbe0f86acded09b3b80381e0100a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feebcbe0f86acded09b3b80381e0100a");
            return;
        }
        this.c = sCPageConfig;
        this.d = str;
        this.e = aVar;
        this.b = activity;
        this.f = aVar2;
        this.g = aVar3;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c7767f033a1b4afc42cc2825dade56", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c7767f033a1b4afc42cc2825dade56") : layoutInflater.inflate(R.layout.wm_drug_shop_cart_rest_layout, viewGroup, false);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3fd432a8b4064f3666eb0bde66bac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3fd432a8b4064f3666eb0bde66bac2");
        } else if (this.e != null && this.e.A()) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.m.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55d03509d410c2431d6c891c3e948c46", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55d03509d410c2431d6c891c3e948c46");
                    } else if (m.this.f.m()) {
                        com.sankuai.waimai.drug.util.a.a(m.this.b, m.this.e, m.this.g == null ? null : m.this.g.b, m.this.c, m.this.d);
                    } else {
                        com.sankuai.waimai.store.shopping.cart.util.d.a(m.this.b, m.this.e, m.this.c, m.this.d);
                    }
                }
            });
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "545b9ec29f0f5727327f6c7c430c115e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "545b9ec29f0f5727327f6c7c430c115e");
            } else if (com.sankuai.waimai.store.order.a.e().k(this.e.d()).e.b("cart_type") == 4) {
                if (this.c.e == 2) {
                    this.i.setVisibility(8);
                    return;
                }
                u.d(this.mView, 0, 0, 0, 0);
                this.mView.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_white));
                this.j.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687));
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7e3bfc20a931f655f83fb7adc2765fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7e3bfc20a931f655f83fb7adc2765fd");
            return;
        }
        this.h = (TextView) findView(R.id.txt_shopcart_poi_im);
        this.j = (TextView) findView(R.id.wm_st_poi_rest_text);
        this.i = (RelativeLayout) findView(R.id.rl_shop_cart_rest);
    }
}
