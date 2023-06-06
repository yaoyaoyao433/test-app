package com.sankuai.waimai.store.shopping.cart.block;

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
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.b {
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

    public static /* synthetic */ void a(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "ae15bdc5b68c19570c8dcbafa73f54ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "ae15bdc5b68c19570c8dcbafa73f54ed");
        } else if (eVar.b.B() && ab.b().b(eVar.mContext, "key_new_shop_cart_im_guide", true)) {
            ab.b().a(eVar.mContext, "key_new_shop_cart_im_guide", false);
            eVar.c.setVisibility(0);
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.shopping.cart.block.e.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f587a24a519349f6433168c941544007", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f587a24a519349f6433168c941544007");
                    } else {
                        e.this.c.setVisibility(8);
                    }
                }
            }, 3000, eVar.e);
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "8e43b4703945b0e76f3c14ed8c09cd86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "8e43b4703945b0e76f3c14ed8c09cd86");
                return;
            }
            u.c(eVar.d);
            if (!eVar.b.c() || eVar.b.b.bottomPoiImInfo == null || eVar.b.b.bottomPoiImInfo.g == null) {
                return;
            }
            String str = eVar.b.b.bottomPoiImInfo.g.shopCartIMPopTip;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            u.a(eVar.d);
            eVar.d.setPadding((!eVar.b.b() || eVar.b.E()) ? 0 : com.sankuai.shangou.stone.util.h.a(eVar.mContext, 43.0f), 0, 0, 0);
            eVar.h.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(eVar.mContext, R.color.wm_sc_black_transparent_50)).a(com.sankuai.shangou.stone.util.h.a(eVar.mContext, 50.0f)).a());
            eVar.i.setImageDrawable(com.sankuai.waimai.store.util.e.a(eVar.mContext, (int) R.drawable.wm_sc_poi_tab_text_bubble_arrow, com.sankuai.waimai.store.util.b.b(eVar.mContext, R.color.wm_sc_black_transparent_50)));
            u.a(eVar.h, str);
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.shopping.cart.block.e.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ed8d257604180f4815b7aae67805193", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ed8d257604180f4815b7aae67805193");
                    } else {
                        u.c(e.this.d);
                    }
                }
            }, 3000, eVar.e);
            eVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.e.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a75738057ae4a9a2e50ce964ad8ebf89", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a75738057ae4a9a2e50ce964ad8ebf89");
                        return;
                    }
                    com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(e.this.f.d, "b_waimai_b1h3jsh5_mc").a("poi_id", e.this.b.d()).a("status", Integer.valueOf(e.this.b.G())).a("poi_status", Integer.valueOf(e.this.b.r()));
                    e eVar2 = e.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                    com.sankuai.waimai.store.callback.a a3 = a2.a("tip", PatchProxy.isSupport(objArr4, eVar2, changeQuickRedirect4, false, "6f7539cd61e406a7bb6d3a23b7001624", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, eVar2, changeQuickRedirect4, false, "6f7539cd61e406a7bb6d3a23b7001624") : (eVar2.b == null || eVar2.b.b == null || eVar2.b.b.bottomPoiImInfo == null || eVar2.b.b.bottomPoiImInfo.g == null || TextUtils.isEmpty(eVar2.b.b.bottomPoiImInfo.g.shopCartIMPopTip)) ? "-999" : eVar2.b.b.bottomPoiImInfo.g.shopCartIMPopTip);
                    e eVar3 = e.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = e.a;
                    a3.a("stid", PatchProxy.isSupport(objArr5, eVar3, changeQuickRedirect5, false, "fb172e3243a9e6e184e163fe201a1fb1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, eVar3, changeQuickRedirect5, false, "fb172e3243a9e6e184e163fe201a1fb1") : (eVar3.b == null || eVar3.b.b == null || eVar3.b.b.abExpInfo == null) ? "" : eVar3.b.b.abExpInfo).a();
                    com.sankuai.waimai.store.shopping.cart.util.d.a((Activity) e.this.mContext, e.this.b, e.this.f, e.this.e);
                }
            });
        }
    }

    public e(@NonNull Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, String str) {
        super(context);
        Object[] objArr = {context, aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0027696d8c95ceab2eb820cdb1b1ae96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0027696d8c95ceab2eb820cdb1b1ae96");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5cc6a2559f3a8c1d810f05ef228790c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5cc6a2559f3a8c1d810f05ef228790c");
            return;
        }
        super.onViewCreated();
        this.c = findView(R.id.shop_cart_guide_layout);
        this.d = findView(R.id.shop_cart_drug_online_guide_layout);
        this.h = (TextView) findView(R.id.shop_cart_online_guide_txt);
        this.i = (ImageView) findView(R.id.iv_shop_cart_im_online_arrow);
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.shopping.cart.block.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7ada8bc50631371eddd621003f87d11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7ada8bc50631371eddd621003f87d11");
                } else if (e.this.g && e.this.getView().getVisibility() == 0) {
                    e.this.g = false;
                    try {
                        e.this.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } catch (Throwable th) {
                        com.sankuai.waimai.store.base.log.a.a("shop_cart_im:" + th.toString());
                    }
                    e.a(e.this);
                }
            }
        };
        getView().getViewTreeObserver().addOnGlobalLayoutListener(this.j);
    }
}
