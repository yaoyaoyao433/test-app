package com.sankuai.waimai.drug.block;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    View c;
    View d;
    String e;
    SCPageConfig f;
    boolean g;
    private TextView h;
    private ImageView i;
    private ViewTreeObserver.OnGlobalLayoutListener j;

    public static /* synthetic */ void a(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "1b88fa9b5ca05412daa9ac37f81de85c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "1b88fa9b5ca05412daa9ac37f81de85c");
        } else if (gVar.b.B() && ab.b().b(gVar.mContext, "key_new_shop_cart_im_guide", true)) {
            ab.b().a(gVar.mContext, "key_new_shop_cart_im_guide", false);
            gVar.c.setVisibility(0);
            al.a(new Runnable() { // from class: com.sankuai.waimai.drug.block.g.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7f07d5acecc628bc1d43f7b82299c35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7f07d5acecc628bc1d43f7b82299c35");
                    } else {
                        g.this.c.setVisibility(8);
                    }
                }
            }, 3000, gVar.e);
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "f8207589d93198c3211aec6d35be400e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "f8207589d93198c3211aec6d35be400e");
                return;
            }
            u.c(gVar.d);
            if (!gVar.b.c() || gVar.b.b.bottomPoiImInfo == null || gVar.b.b.bottomPoiImInfo.g == null) {
                return;
            }
            String str = gVar.b.b.bottomPoiImInfo.g.shopCartIMPopTip;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            u.a(gVar.d);
            gVar.d.setPadding((!gVar.b.b() || gVar.b.E()) ? 0 : com.sankuai.shangou.stone.util.h.a(gVar.mContext, 43.0f), 0, 0, 0);
            gVar.h.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(gVar.mContext, R.color.wm_sc_black_transparent_50)).a(com.sankuai.shangou.stone.util.h.a(gVar.mContext, 50.0f)).a());
            gVar.i.setImageDrawable(com.sankuai.waimai.store.util.e.a(gVar.mContext, (int) R.drawable.wm_drug_poi_tab_text_bubble_arrow, com.sankuai.waimai.store.util.b.b(gVar.mContext, R.color.wm_sc_black_transparent_50)));
            u.a(gVar.h, str);
            al.a(new Runnable() { // from class: com.sankuai.waimai.drug.block.g.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f42af45ad708e70c547aa4378dd52571", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f42af45ad708e70c547aa4378dd52571");
                    } else {
                        u.c(g.this.d);
                    }
                }
            }, 3000, gVar.e);
            gVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.block.g.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8ecc9d140f303c8ebffc79395df32f0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8ecc9d140f303c8ebffc79395df32f0");
                        return;
                    }
                    com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(g.this.f.d, "b_waimai_b1h3jsh5_mc").a("poi_id", g.this.b.d()).a("status", Integer.valueOf(g.this.b.G())).a("poi_status", Integer.valueOf(g.this.b.r()));
                    g gVar2 = g.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                    com.sankuai.waimai.store.callback.a a3 = a2.a("tip", PatchProxy.isSupport(objArr4, gVar2, changeQuickRedirect4, false, "9c4204ae5ad7dcdd187c39b929fc8770", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, gVar2, changeQuickRedirect4, false, "9c4204ae5ad7dcdd187c39b929fc8770") : (gVar2.b == null || gVar2.b.b == null || gVar2.b.b.bottomPoiImInfo == null || gVar2.b.b.bottomPoiImInfo.g == null || TextUtils.isEmpty(gVar2.b.b.bottomPoiImInfo.g.shopCartIMPopTip)) ? "-999" : gVar2.b.b.bottomPoiImInfo.g.shopCartIMPopTip);
                    g gVar3 = g.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = g.a;
                    a3.a("stid", PatchProxy.isSupport(objArr5, gVar3, changeQuickRedirect5, false, "9348df1a6448e16a7e8adf31bf70b9cc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, gVar3, changeQuickRedirect5, false, "9348df1a6448e16a7e8adf31bf70b9cc") : (gVar3.b == null || gVar3.b.b == null || gVar3.b.b.abExpInfo == null) ? "" : gVar3.b.b.abExpInfo).a();
                    com.sankuai.waimai.store.shopping.cart.util.d.a((Activity) g.this.mContext, g.this.b, g.this.f, g.this.e);
                }
            });
        }
    }

    public g(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, String str) {
        super(context);
        Object[] objArr = {context, aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db71f9ea6213afc8fd01419307091d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db71f9ea6213afc8fd01419307091d4");
            return;
        }
        this.g = true;
        this.b = aVar;
        this.f = sCPageConfig;
        this.e = str;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57b1e1bfc3be8ca619691912ec39b388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57b1e1bfc3be8ca619691912ec39b388");
            return;
        }
        super.onViewCreated();
        this.c = findView(R.id.shop_cart_guide_layout);
        this.d = findView(R.id.shop_cart_drug_online_guide_layout);
        this.h = (TextView) findView(R.id.shop_cart_online_guide_txt);
        this.i = (ImageView) findView(R.id.iv_shop_cart_im_online_arrow);
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.drug.block.g.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c1a0dce8d507bbc7d16cf22de36e427", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c1a0dce8d507bbc7d16cf22de36e427");
                } else if (g.this.g && g.this.getView().getVisibility() == 0) {
                    g.this.g = false;
                    try {
                        g.this.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } catch (Throwable th) {
                        com.sankuai.waimai.store.base.log.a.a("shop_cart_im:" + th.toString());
                    }
                    g.a(g.this);
                }
            }
        };
        getView().getViewTreeObserver().addOnGlobalLayoutListener(this.j);
    }
}
