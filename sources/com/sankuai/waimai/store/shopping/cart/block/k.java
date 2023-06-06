package com.sankuai.waimai.store.shopping.cart.block;

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
/* loaded from: classes5.dex */
public final class k extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final Activity b;
    protected SCPageConfig c;
    protected final String d;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    private TextView f;
    private RelativeLayout g;
    private TextView h;

    public k(@NonNull Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, String str) {
        super(activity);
        Object[] objArr = {activity, aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90686b46975227c7ae8322c562020822", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90686b46975227c7ae8322c562020822");
            return;
        }
        this.c = sCPageConfig;
        this.d = str;
        this.e = aVar;
        this.b = activity;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb39cf3a4060442d6243d9e51ff020b8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb39cf3a4060442d6243d9e51ff020b8") : layoutInflater.inflate(R.layout.wm_sc_shop_cart_rest_layout, viewGroup, false);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7faf6d78b8d45bc6f7cdef91a393516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7faf6d78b8d45bc6f7cdef91a393516");
        } else if (this.e != null && this.e.A()) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.k.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "028762852520bb45704cde975bcdda33", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "028762852520bb45704cde975bcdda33");
                    } else {
                        com.sankuai.waimai.store.shopping.cart.util.d.a(k.this.b, k.this.e, k.this.c, k.this.d);
                    }
                }
            });
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcff1d72816309d476a33fdac26afffa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcff1d72816309d476a33fdac26afffa");
            } else if (com.sankuai.waimai.store.order.a.e().k(this.e.d()).e.b("cart_type") == 4) {
                if (this.c.e == 2) {
                    this.g.setVisibility(8);
                    return;
                }
                u.d(this.mView, 0, 0, 0, 0);
                this.mView.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_white));
                this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687));
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb73f1768dfde7c3a5bcbb4bbe9a90d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb73f1768dfde7c3a5bcbb4bbe9a90d");
            return;
        }
        this.f = (TextView) findView(R.id.txt_shopcart_poi_im);
        this.h = (TextView) findView(R.id.wm_st_poi_rest_text);
        this.g = (RelativeLayout) findView(R.id.rl_shop_cart_rest);
    }
}
