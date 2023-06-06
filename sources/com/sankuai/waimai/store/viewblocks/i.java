package com.sankuai.waimai.store.viewblocks;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.helper.e;
import com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.j;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.w;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class i extends com.sankuai.waimai.store.goods.list.base.d implements e.a {
    public static ChangeQuickRedirect d;
    private final com.sankuai.waimai.store.controller.f c;
    final com.sankuai.waimai.store.controller.h e;
    public TextView f;
    private final com.sankuai.waimai.store.controller.d g;
    @Nullable
    private j h;
    private GradientDrawable i;
    private View j;
    private View k;
    private com.sankuai.waimai.imbase.d l;
    private com.sankuai.waimai.store.controller.e m;
    private ArgbEvaluator n;
    private Drawable o;
    private boolean p;
    private View.OnClickListener q;

    public int a() {
        return R.layout.wm_sc_goods_list_shop_action_bar;
    }

    public i(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        boolean z = true;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f396e0cfd0210399590abe81bc9218a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f396e0cfd0210399590abe81bc9218a6");
            return;
        }
        this.l = new com.sankuai.waimai.imbase.d() { // from class: com.sankuai.waimai.store.viewblocks.i.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.d
            public final void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
                Object[] objArr2 = {longSparseArray};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e1c59e8c2e086fbf4f42b32b72ed615", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e1c59e8c2e086fbf4f42b32b72ed615");
                } else {
                    i.this.e.e();
                }
            }
        };
        this.q = new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.i.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07ddff36e4a80dcf2b87b476303bc507", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07ddff36e4a80dcf2b87b476303bc507");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", i.this.b.d());
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(i.this.b.v()));
                com.sankuai.waimai.store.manager.judas.b.a(i.this.a.b(), "b_610oD").b(hashMap).a();
                com.sankuai.waimai.store.router.g.a(i.this.mContext, i.this.b.f(), i.this.b.h(), i.this.b.b);
            }
        };
        this.e = new com.sankuai.waimai.store.controller.h(dVar);
        this.c = new com.sankuai.waimai.store.controller.f(dVar);
        this.g = new com.sankuai.waimai.store.controller.d(dVar);
        com.sankuai.waimai.imbase.manager.e.a().a(this.l);
        Poi poi = this.b == null ? null : this.b.b;
        this.i = new GradientDrawable();
        this.i.setCornerRadius(com.sankuai.shangou.stone.util.h.a(this.mContext, 16.0f));
        this.n = new ArgbEvaluator();
        this.o = com.sankuai.waimai.store.util.b.d(this.mContext, R.drawable.wm_sc_goods_list_search_icon);
        if (!w.c(poi) && !w.e(poi)) {
            z = false;
        }
        this.p = z;
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ad15849819df822c16e8c2ee3667292", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ad15849819df822c16e8c2ee3667292");
        }
        View inflate = layoutInflater.inflate(a(), viewGroup, false);
        this.f = (TextView) inflate.findViewById(R.id.search_view);
        this.j = inflate.findViewById(R.id.view_background);
        this.k = inflate.findViewById(R.id.v_space_search);
        this.m = new com.sankuai.waimai.store.controller.e(this.a);
        this.c.a(inflate);
        this.e.a(inflate);
        this.g.a(inflate);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.store_contract_poi_container);
        if (viewGroup2 != null) {
            this.h = new j(this.a.k());
            this.h.bindView(viewGroup2);
        }
        this.m.a(inflate);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee0c0d74de18582b4bd6059d21a99f59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee0c0d74de18582b4bd6059d21a99f59");
        } else {
            this.f.setOnClickListener(this.q);
            com.sankuai.waimai.store.controller.h hVar = this.e;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.controller.c.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "63dd752b07d18f0985e4c873016c6fde", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "63dd752b07d18f0985e4c873016c6fde");
            } else {
                hVar.a();
                hVar.f.a(new int[]{2, 6, 8});
            }
        }
        return inflate;
    }

    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170a0078f96fffd0ccee5f3910783587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170a0078f96fffd0ccee5f3910783587");
            return;
        }
        this.e.a(restMenuResponse.getPoiShareTip(), restMenuResponse.getPoi() != null ? restMenuResponse.getPoi().getShareLabelInfo() : null);
        if (this.p) {
            a(SCPageConfig.a(1, 22, this.a.b(), 0L));
        } else {
            this.g.c(true);
            this.g.a(this.b.b.isFavorite());
        }
        String str = restMenuResponse.getPoi().poiSpuSaleText;
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(R.string.wm_sc_common_search_tip_in_shop);
        }
        this.f.setHint(str);
    }

    private void a(SCPageConfig sCPageConfig) {
        Object[] objArr = {sCPageConfig};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce30e25e5e9c67b3c82390e3495f3ded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce30e25e5e9c67b3c82390e3495f3ded");
            return;
        }
        if (this.h != null) {
            this.h.a(this.b, sCPageConfig, this.a.l());
        }
        this.g.a(this.b.b.isFavorite());
        this.g.c(true ^ this.b.b.storeImNewStyle());
    }

    public final void b(float f) {
        float f2;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "004970859807a498da730f8ca64d1f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "004970859807a498da730f8ca64d1f0a");
            return;
        }
        double d2 = f;
        if (com.sankuai.shangou.stone.util.i.c(Double.valueOf(d2), Double.valueOf(0.0d))) {
            f2 = 0.0f;
        } else {
            f2 = com.sankuai.shangou.stone.util.i.e(Double.valueOf(d2), Double.valueOf(1.0d)) ? 1.0f : f;
        }
        this.j.setAlpha(f2);
        this.c.a(f2);
        this.e.a(f2);
        this.g.a(f2);
        if (this.h != null) {
            this.h.a(f2);
        }
        if (f < 0.5f) {
            this.f.setBackgroundResource(R.drawable.wm_sc_poi_market_action_bar_bg_search);
        } else {
            this.f.setBackgroundResource(R.drawable.wm_sc_poi_market_action_bar_bg_search_select_gray);
        }
    }

    public final void c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15815e89fa0a5151b142fa666f28ee17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15815e89fa0a5151b142fa666f28ee17");
            return;
        }
        float f2 = 1.0f - f;
        int intValue = ((Integer) this.n.evaluate(f2, Integer.valueOf(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687)), Integer.valueOf(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFFFFF)))).intValue();
        this.f.setTextColor(intValue);
        this.f.setHintTextColor(intValue);
        this.f.setCompoundDrawables(com.sankuai.waimai.store.util.e.a(this.o, intValue), null, null, null);
        this.i.setColor(((Integer) this.n.evaluate(f2, Integer.valueOf(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFFFFF)), Integer.valueOf(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_66000000)))).intValue());
        this.f.setBackground(this.i);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e106a870cb546e4de866ada4daf70d05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e106a870cb546e4de866ada4daf70d05");
            return;
        }
        this.f.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687));
        this.f.setHintTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687));
        this.f.setCompoundDrawables(com.sankuai.waimai.store.util.e.a(this.o, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_858687)), null, null, null);
        this.f.setBackground(com.sankuai.waimai.store.util.e.b(this.mContext, (int) R.color.wm_sg_color_FFFFFF, (int) R.dimen.wm_sc_common_dimen_16));
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1321df1a7109447adbbfd4419208e575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1321df1a7109447adbbfd4419208e575");
            return;
        }
        this.f.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFFFFF));
        this.f.setHintTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFFFFF));
        this.f.setCompoundDrawables(com.sankuai.waimai.store.util.e.a(this.o, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFFFFF)), null, null, null);
        this.f.setBackground(com.sankuai.waimai.store.util.e.b(this.mContext, (int) R.color.wm_sg_color_66000000, (int) R.dimen.wm_sc_common_dimen_16));
    }

    @Override // com.sankuai.waimai.store.goods.list.helper.e.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6284453c3bf075f7b48db74137e4e8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6284453c3bf075f7b48db74137e4e8b1");
        } else if (this.k != null) {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            layoutParams.width = i;
            this.k.setLayoutParams(layoutParams);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344f4e7c9b7f89741793112c75d5ab4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344f4e7c9b7f89741793112c75d5ab4e");
            return;
        }
        com.sankuai.waimai.imbase.manager.e.a().b(this.l);
        com.sankuai.waimai.store.controller.d dVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.controller.a.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "7c02a1b780bff776b621e5a5a063ef0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "7c02a1b780bff776b621e5a5a063ef0f");
        } else {
            com.sankuai.waimai.store.manager.collection.b a = com.sankuai.waimai.store.manager.collection.b.a();
            Object[] objArr3 = {dVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.manager.collection.b.a;
            if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "5e9fef0a1ff26e3899f51bb1a0091336", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "5e9fef0a1ff26e3899f51bb1a0091336");
            } else if (a.b != null && a.b.contains(dVar)) {
                a.b.remove(dVar);
            }
        }
        com.sankuai.waimai.store.controller.h hVar = this.e;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.controller.c.a;
        if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "2237be47f00baada9df80e6822667ab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "2237be47f00baada9df80e6822667ab3");
            return;
        }
        hVar.o.m().a("restaurant_menu_service");
        com.sankuai.waimai.store.im.number.d.a().b(hVar.i);
        ab.b().a((Context) hVar.n, "key_unused_flag", hVar.h);
    }

    @Override // com.sankuai.waimai.store.goods.list.helper.e.a
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3cf1c5d7802486a6b1e1e3dac9fc2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3cf1c5d7802486a6b1e1e3dac9fc2ad");
            return;
        }
        com.sankuai.waimai.store.controller.e eVar = this.m;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.controller.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "36efb715d202154dad2849b1756c3c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "36efb715d202154dad2849b1756c3c5f");
        } else {
            u.a(eVar.b, f);
        }
    }
}
