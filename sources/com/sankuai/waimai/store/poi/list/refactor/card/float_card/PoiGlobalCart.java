package com.sankuai.waimai.store.poi.list.refactor.card.float_card;

import android.app.Activity;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.ab;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiGlobalCart extends com.sankuai.waimai.store.base.b implements android.arch.lifecycle.e, View.OnClickListener, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    ImageView b;
    private final com.sankuai.waimai.store.param.a c;
    private final com.sankuai.waimai.store.base.statistic.a d;
    private ConstraintLayout e;
    private com.sankuai.waimai.store.expose.v2.entity.b f;
    private PageEventHandler g;
    private String h;

    public PoiGlobalCart(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, @Nullable com.sankuai.waimai.store.base.statistic.a aVar2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6a9181012f7e7920e2950abf8e7607", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6a9181012f7e7920e2950abf8e7607");
            return;
        }
        this.d = aVar2;
        this.c = aVar;
        this.g = (PageEventHandler) q.a(fragmentActivity).a(PageEventHandler.class);
        ((SCBaseActivity) this.mContext).getLifecycle().a(this);
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cab0d3cd061a236b5d60afc08dd55f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cab0d3cd061a236b5d60afc08dd55f5");
        }
        com.sankuai.waimai.store.order.a.e().a(this);
        return layoutInflater.inflate(R.layout.wm_st_page_global_cart_icon_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a5c7e0c20a50deeec13c1328bc2411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a5c7e0c20a50deeec13c1328bc2411");
            return;
        }
        super.onViewCreated();
        this.e = (ConstraintLayout) this.mView.findViewById(R.id.layout_global_cart);
        this.b = (ImageView) this.mView.findViewById(R.id.btn_global_cart);
        f a2 = f.a();
        ImageView imageView = this.b;
        Object[] objArr2 = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "41b3deba8976a8dfe099fee44af2640f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "41b3deba8976a8dfe099fee44af2640f");
        } else {
            a2.a(imageView, false);
            a2.d = null;
        }
        this.e.setOnClickListener(this);
        if (this.d != null) {
            this.f = this.d.a(this.e);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa08c6bf935f8fdf170d913fd06d9815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa08c6bf935f8fdf170d913fd06d9815");
            return;
        }
        if (this.d != null) {
            this.d.a(this.f, 0, a());
        }
        this.h = str;
        LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.ll_tip);
        if (com.sankuai.waimai.store.poi.list.newp.home.a.a()) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9970d5ff80bbeed3677ccb9022a3295a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9970d5ff80bbeed3677ccb9022a3295a");
            return;
        }
        if (this.d != null) {
            this.d.a(a());
        }
        this.g.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.c((Activity) this.mContext));
        com.sankuai.waimai.store.manager.user.a.a(this.mContext, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiGlobalCart.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad80f7f33516c624d8012dd2187d26a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad80f7f33516c624d8012dd2187d26a9");
                } else if (!TextUtils.isEmpty(PoiGlobalCart.this.c.aJ)) {
                    g.a(PoiGlobalCart.this.getContext(), PoiGlobalCart.this.c.aJ);
                } else {
                    g.a(PoiGlobalCart.this.getContext());
                }
            }
        });
    }

    @NonNull
    private Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1d642015a990ad88941c1afd2ca873", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1d642015a990ad88941c1afd2ca873");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tip_icon", 0);
        hashMap.put("category_code", Long.valueOf(this.c.c));
        hashMap.put("sub_category_code", this.c.f);
        hashMap.put("stid", this.c.T);
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c24d51da5f3404d241d04ba58e61e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c24d51da5f3404d241d04ba58e61e0c");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.ll_tip);
        linearLayout.setPadding(0, 0, 0, 0);
        TextView textView = (TextView) this.mView.findViewById(R.id.tv_tip);
        if (!TextUtils.isEmpty(this.h) && !com.sankuai.waimai.store.poi.list.newp.home.a.a()) {
            linearLayout.setVisibility(0);
            textView.setText(this.h);
            Object[] objArr2 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.home.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1a896a22c992bdd60601457cafb9e869", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1a896a22c992bdd60601457cafb9e869");
                return;
            } else {
                ab.b().a(com.sankuai.waimai.store.util.b.a(), "sc_float_card_cache", true);
                return;
            }
        }
        linearLayout.setVisibility(8);
    }

    @Override // com.sankuai.waimai.store.base.b
    @OnLifecycleEvent(d.a.ON_DESTROY)
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2706af1bdbedbaf55d293b0dc949c8af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2706af1bdbedbaf55d293b0dc949c8af");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.order.a.e().b(this);
    }

    public final void a(int i) {
        Object[] objArr = {8};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92b34c70431d73f1c9a3a6909ef119c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92b34c70431d73f1c9a3a6909ef119c");
        } else {
            ((LinearLayout) this.mView.findViewById(R.id.ll_tip)).setVisibility(8);
        }
    }
}
