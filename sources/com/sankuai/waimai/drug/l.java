package com.sankuai.waimai.drug;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.TipsView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.ar;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public Activity b;
    public PopupWindow c;
    public View d;
    public TipsView e;
    public View f;
    public LinearLayout g;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a h;
    private SCPageConfig i;
    private GoodsSpu j;
    private com.sankuai.waimai.store.shopping.cart.contract.a k;

    public l(@NonNull Activity activity, View view, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodsSpu goodsSpu) {
        Object[] objArr = {activity, view, aVar, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d346b5ce53aed8487b444a57aa544d59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d346b5ce53aed8487b444a57aa544d59");
            return;
        }
        this.b = activity;
        this.f = view;
        this.k = aVar;
        this.i = aVar.h();
        this.j = goodsSpu;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f885128b3bf1b9b60620e222d56e3dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f885128b3bf1b9b60620e222d56e3dea");
            return;
        }
        this.d = LayoutInflater.from(this.b).inflate(R.layout.wm_sc_shopcart_im_pop_layout, (ViewGroup) null);
        this.c = new PopupWindow(this.d, -2, -2, true);
        this.c.setOutsideTouchable(true);
        this.c.setFocusable(true);
        this.c.setTouchable(true);
        this.c.setBackgroundDrawable(new BitmapDrawable(this.b.getResources()));
        this.e = (TipsView) this.d.findViewById(R.id.v_tip_im_container);
        this.g = (LinearLayout) this.d.findViewById(R.id.ll_tip_im_list);
    }

    public void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a553a0eb936b541f5decd1df54fbebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a553a0eb936b541f5decd1df54fbebe");
            return;
        }
        k kVar = new k(this.b, this.k, this.j);
        this.g.addView(kVar.createView(this.g));
        kVar.f = new View.OnClickListener() { // from class: com.sankuai.waimai.drug.l.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36741cb86ed738f952ab9111cb746a91", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36741cb86ed738f952ab9111cb746a91");
                } else {
                    ar.a(l.this.c);
                }
            }
        };
        kVar.a(aVar, z);
    }

    public void b(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, boolean z) {
        long g;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0d29e450505e9dd51d28ea059b4194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0d29e450505e9dd51d28ea059b4194");
            return;
        }
        com.sankuai.waimai.store.callback.a b = com.sankuai.waimai.store.manager.judas.b.b(this.i.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.b), z ? "b_waimai_i236qq9g_mv" : "b_waimai_7gy6i8w4_mv");
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3242fd6b92f57ae882d29146c3db56e9", RobustBitConfig.DEFAULT_VALUE)) {
            g = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3242fd6b92f57ae882d29146c3db56e9")).longValue();
        } else {
            g = aVar != null ? aVar.g() : -1L;
        }
        b.a("poi_id", String.valueOf(g)).a("spu_id", Long.valueOf(this.j != null ? this.j.id : -999L)).a();
    }
}
