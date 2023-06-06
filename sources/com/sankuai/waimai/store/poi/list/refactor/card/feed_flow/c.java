package com.sankuai.waimai.store.poi.list.refactor.card.feed_flow;

import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.assembler.component.j;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.k;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b implements b.f {
    public static ChangeQuickRedirect a;
    int b;
    boolean c;
    public View d;
    PageEventHandler e;
    public j f;
    private com.sankuai.waimai.store.param.a g;
    private com.sankuai.waimai.store.poi.list.adapter.a h;
    private RecyclerView i;
    private List<CategoryInfo> j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private ViewGroup p;
    private com.sankuai.waimai.store.poi.list.adapter.subcategory.a q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private GridLayoutManager v;
    private com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.a w;
    private boolean x;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public List<CategoryInfo> a;
        public int b;
        public int c;
        public boolean d;
    }

    public static /* synthetic */ void a(c cVar, boolean z, boolean z2, Context context, CategoryInfo categoryInfo, Map map) {
        int i = 1;
        Object[] objArr = {(byte) 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), context, categoryInfo, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "39bd13443dda0c1f51939e3d64c3683d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "39bd13443dda0c1f51939e3d64c3683d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bid", "b_LQk7g");
        hashMap.put("cat_id", Long.valueOf(cVar.g.c));
        hashMap.put("sec_cate_id", categoryInfo.code);
        com.sankuai.waimai.store.manager.judas.b.a(cVar.g.G, hashMap);
        com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(cVar.mContext, "b_LQk7g").a("media_type", Integer.valueOf(cVar.s == 6 ? 3 : cVar.s == 1 ? 2 : 1));
        com.sankuai.waimai.store.callback.a a3 = a2.a(context).a("notice_type", Integer.valueOf(categoryInfo.tagIconType)).a("cat_id", Long.valueOf(cVar.g.c)).a("sec_cate_id", categoryInfo.code).a("status", Integer.valueOf(z2 ? 2 : 1)).a("click_status", Integer.valueOf(z2 ? 1 : 0));
        if (cVar.s == 6) {
            i = 2;
        } else if (t.a(categoryInfo.icon_title)) {
            i = 0;
        }
        a3.a("label_type", Integer.valueOf(i)).a("entry_type", Integer.valueOf(cVar.g.aS ? 1 : 0));
        if (map != null) {
            a2.b(map);
        }
        a2.a();
    }

    public c(FragmentActivity fragmentActivity, j jVar) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11bb12a950ab98c0542ef4ef023f13ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11bb12a950ab98c0542ef4ef023f13ed");
            return;
        }
        this.k = 0;
        this.l = 0;
        this.o = 0;
        this.t = 0;
        this.u = false;
        this.f = jVar;
        this.e = (PageEventHandler) q.a(fragmentActivity).a(PageEventHandler.class);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb0e3dd8144993c5473a5c4f24d5240", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb0e3dd8144993c5473a5c4f24d5240") : LayoutInflater.from(this.mContext).inflate(R.layout.wm_sc_home_channel_refactor_category, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdaeb9d4e8c7686c0d8028f3d3ff1ad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdaeb9d4e8c7686c0d8028f3d3ff1ad8");
            return;
        }
        super.onViewCreated();
        this.g = ((PoiPageViewModel) q.a((FragmentActivity) this.mContext).a(PoiPageViewModel.class)).d.a();
        this.o = this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_50);
        this.p = (ViewGroup) this.mView.findViewById(R.id.ll_tablayout_category_header);
        this.i = (RecyclerView) this.mView.findViewById(R.id.rlv_poi_verticality_category_header);
        ((ViewGroup.MarginLayoutParams) this.i.getLayoutParams()).topMargin = h.a(this.mContext, -4.0f);
        this.d = this.mView.findViewById(R.id.sort_line);
        this.i.setNestedScrollingEnabled(false);
        this.w = new com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.a(h.a(this.mContext, 4.0f));
    }

    public final void a(@NonNull a aVar, PoiChannelBackgroundConfig poiChannelBackgroundConfig, PoiVerticalityDataResponse.Promotion promotion) {
        boolean z;
        Object[] objArr = {aVar, poiChannelBackgroundConfig, promotion};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a26608930da08271b3035c919f95bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a26608930da08271b3035c919f95bae");
            return;
        }
        this.n = aVar.c == 5;
        this.x = aVar.d;
        this.s = aVar.c;
        if (f()) {
            c(false);
        } else {
            this.i.setPadding(0, h.a(this.mContext, 4.0f), 0, this.n ? 0 : h.a(this.mContext, 2.0f));
        }
        if (o.f()) {
            d();
        } else {
            this.p.setBackgroundColor(com.sankuai.shangou.stone.util.d.a(this.g.E, -657930));
        }
        this.m = aVar.c == 2;
        this.u = aVar.c == 4;
        this.b = aVar.b;
        if (aVar.a != null) {
            this.j = aVar.a;
            d(c());
            if (f()) {
                if (this.j.size() > 12) {
                    this.j = this.j.subList(0, 12);
                }
            } else if (this.j.size() > 10) {
                this.j = this.j.subList(0, 10);
            }
        } else {
            this.j = new ArrayList();
        }
        if (this.h == null) {
            int i = this.b;
            Object[] objArr2 = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8949914e4ea70aa944ceef22ac13e318", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8949914e4ea70aa944ceef22ac13e318");
            } else {
                this.b = i;
                this.k = this.b;
                this.s = aVar.c;
                this.h = new com.sankuai.waimai.store.poi.list.adapter.a(this.g, aVar, this.mContext, this.b);
                this.h.a(this.q);
                this.i.setAdapter(new l(this.h.b));
                this.d.setVisibility((!aVar.d || this.g.h() || this.g.y || this.g.z || aVar.c == 5 || f()) ? 4 : 0);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a437e2d30122a2103bfd5ea608167009", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a437e2d30122a2103bfd5ea608167009");
                } else {
                    this.q = new com.sankuai.waimai.store.poi.list.adapter.subcategory.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.a
                        public final void a(View view, int i2, Map<String, Object> map) {
                            Object[] objArr4 = {view, Integer.valueOf(i2), map};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8e8c31cb9bfc126a894d92cda8dceb70", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8e8c31cb9bfc126a894d92cda8dceb70");
                                return;
                            }
                            CategoryInfo a2 = c.this.a(i2);
                            if (a2 == null) {
                                return;
                            }
                            c.this.e.a((PageEventHandler) new k(i2, false));
                            c.a(c.this, true, c.this.c, c.this.mContext, a2, map);
                        }
                    };
                    this.h.a(this.q);
                }
                this.i.scrollToPosition(this.b);
            }
        } else {
            this.d.setVisibility((!aVar.d || this.g.h() || this.g.y || this.g.z || aVar.c == 5 || aVar.c == 6) ? 4 : 0);
        }
        this.r = this.g.F || this.g.h() || this.g.g();
        boolean z2 = this.g.h() || this.g.g();
        com.sankuai.waimai.store.poi.list.adapter.a aVar2 = this.h;
        com.sankuai.waimai.store.param.a aVar3 = this.g;
        Context context = this.mContext;
        int i2 = this.b;
        Object[] objArr4 = {aVar, aVar3, context, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.poi.list.adapter.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "7c66c41ff2b656b28b4b79264a3ba456", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "7c66c41ff2b656b28b4b79264a3ba456")).booleanValue();
        } else {
            if (aVar.c == 1 || aVar.c == 2 || aVar.c == 4 || aVar.c == 5 || aVar.c == 6) {
                aVar2.b = new com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b(aVar3, aVar, context, i2);
            } else {
                aVar2.b = new com.sankuai.waimai.store.poi.list.adapter.subcategory.core.c(aVar3, aVar, context, i2);
            }
            z = true;
        }
        if (z) {
            this.h.a(this.q);
            this.i.setAdapter(new l(this.h.b));
        }
        com.sankuai.waimai.store.poi.list.adapter.a aVar4 = this.h;
        com.sankuai.waimai.store.poi.list.model.b bVar = new com.sankuai.waimai.store.poi.list.model.b(poiChannelBackgroundConfig, this.r, z2, promotion);
        Object[] objArr5 = {bVar};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.poi.list.adapter.a.a;
        if (PatchProxy.isSupport(objArr5, aVar4, changeQuickRedirect5, false, "0972ee89a3fb149afc3566e9d2b414b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar4, changeQuickRedirect5, false, "0972ee89a3fb149afc3566e9d2b414b8");
        } else {
            aVar4.b.a(bVar);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3cd04e62b3fb37b3e3585086efda4bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3cd04e62b3fb37b3e3585086efda4bce");
        } else if (b.a(this.j)) {
            u.a(this.mView);
            this.h.a(this.j, this.b);
        } else {
            u.c(this.mView);
        }
        if (this.h.b instanceof com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b) {
            ((com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b) this.h.b).r = this;
        }
        this.t = f() ? this.p.getHeight() : this.i.getHeight();
    }

    private void c(boolean z) {
        Context context;
        float f;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a1a83ee311b9a60b004ab0e7c497e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a1a83ee311b9a60b004ab0e7c497e7");
        } else if (this.i != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            if (this.g.bl) {
                marginLayoutParams.setMargins(z ? 0 : h.a(this.mContext, 12.0f), 0, z ? 0 : h.a(this.mContext, 12.0f), z ? h.a(this.mContext, 5.0f) : 0);
                this.i.setPadding(z ? 0 : h.a(this.mContext, 8.0f), 0, 0, z ? 0 : h.a(this.mContext, 8.0f));
            } else if (this.g.bm) {
                int a2 = z ? 0 : h.a(this.mContext, 12.0f);
                int a3 = z ? h.a(this.mContext, 4.0f) : 0;
                int a4 = z ? 0 : h.a(this.mContext, 12.0f);
                if (z) {
                    context = this.mContext;
                    f = 0.0f;
                } else {
                    context = this.mContext;
                    f = 2.0f;
                }
                marginLayoutParams.setMargins(a2, a3, a4, h.a(context, f));
                this.i.setPadding(0, 0, 0, z ? 0 : h.a(this.mContext, 6.0f));
            } else {
                marginLayoutParams.setMargins(z ? 0 : h.a(this.mContext, 12.0f), z ? e() + h.a(this.mContext, 19.5f) : 0, z ? 0 : h.a(this.mContext, 12.0f), z ? h.a(this.mContext, 5.0f) : 0);
                this.i.setPadding(z ? 0 : h.a(this.mContext, 12.0f), h.a(this.mContext, 4.0f), 0, z ? 0 : h.a(this.mContext, 12.0f));
            }
            float a5 = h.a(this.mContext, 12.0f);
            e.a c = new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFFFFF));
            c.a(a5, a5, a5, a5);
            this.i.setBackground(c.a());
            u.b(this.d);
            if (z) {
                ExtendedLinearLayoutManager extendedLinearLayoutManager = new ExtendedLinearLayoutManager(this.mContext);
                extendedLinearLayoutManager.setOrientation(0);
                this.i.addItemDecoration(this.w);
                this.i.setLayoutManager(extendedLinearLayoutManager);
                this.i.scrollToPosition(this.b == 1 ? this.b - 1 : this.b >= 2 ? this.b - 2 : this.b);
                return;
            }
            this.v = new GridLayoutManager(this.mContext, 4);
            this.i.removeItemDecoration(this.w);
            this.i.setLayoutManager(this.v);
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1336084c98bfee2b4a79b6768e543d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1336084c98bfee2b4a79b6768e543d6");
        } else if (f()) {
        } else {
            if (z) {
                ExtendedLinearLayoutManager extendedLinearLayoutManager = new ExtendedLinearLayoutManager(this.mContext);
                extendedLinearLayoutManager.setOrientation(0);
                this.i.setLayoutManager(extendedLinearLayoutManager);
                this.i.scrollToPosition(this.b);
                return;
            }
            this.i.setLayoutManager(new GridLayoutManager(this.mContext, 5));
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44341ca05970d218f8594284b8ca49ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44341ca05970d218f8594284b8ca49ef")).booleanValue() : !this.u || this.j.size() < 10;
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea676d48165d675b01af37941189e9f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea676d48165d675b01af37941189e9f8");
            return;
        }
        d(z2 || c());
        if (f()) {
            c(z2);
        }
        this.t = this.p.getHeight();
        if (z2 || (z && this.g.f())) {
            this.p.setBackgroundResource(R.color.wm_sg_color_FFFFFF);
        } else if (o.f()) {
            d();
        } else {
            this.p.setBackgroundColor(com.sankuai.shangou.stone.util.d.a(this.g.E, -657930));
        }
        if (this.h != null) {
            com.sankuai.waimai.store.poi.list.adapter.a aVar = this.h;
            Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.adapter.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2e9fb61a09f19be1b165c456d8f605e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2e9fb61a09f19be1b165c456d8f605e9");
            } else {
                aVar.b.a(z2);
            }
        }
    }

    public final void b(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73292472f7bf5527cb09b6eee7807a53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73292472f7bf5527cb09b6eee7807a53");
            return;
        }
        if (!z && !c()) {
            z2 = false;
        }
        d(z2);
        if (f()) {
            c(z);
        }
        this.t = this.p.getHeight();
        if (this.g.f() && z) {
            this.p.setBackgroundResource(R.color.wm_sg_color_FFFFFF);
        } else if (o.f()) {
            d();
        } else {
            this.p.setBackgroundColor(com.sankuai.shangou.stone.util.d.a(this.g.E, -657930));
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66bba0b6e244dbdce40b1383f9f70fa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66bba0b6e244dbdce40b1383f9f70fa6");
        } else if (this.mView != null) {
            u.c(this.mView);
        }
    }

    public final CategoryInfo a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe84a60ef82312206b0ed910a5e1a543", RobustBitConfig.DEFAULT_VALUE)) {
            return (CategoryInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe84a60ef82312206b0ed910a5e1a543");
        }
        if (i == this.b) {
            return null;
        }
        this.k = i;
        CategoryInfo categoryInfo = (CategoryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.j, this.k);
        if (categoryInfo == null) {
            return null;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e529d6b64b7c11974523a3760e6aacd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e529d6b64b7c11974523a3760e6aacd6");
        } else {
            this.b = this.k;
            this.h.a(this.j, this.b);
            if (this.i.getLayoutManager() instanceof ExtendedLinearLayoutManager) {
                ((ExtendedLinearLayoutManager) this.i.getLayoutManager()).b(this.b);
            }
        }
        this.g.f = categoryInfo.code;
        this.g.K = categoryInfo.template_code;
        this.g.b = this.g.p();
        this.g.k = this.g.r();
        return categoryInfo;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287868883e6a7d1a1e8bd55cd34c005e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287868883e6a7d1a1e8bd55cd34c005e")).intValue();
        }
        if (b.a(this.j) || this.g.bl) {
            if (this.h != null && this.h.c) {
                com.sankuai.waimai.store.poi.list.adapter.a aVar = this.h;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.adapter.a.a;
                return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "37bda2bbc5fd82c77749f4409abab108", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "37bda2bbc5fd82c77749f4409abab108")).intValue() : aVar.b.b();
            } else if (this.h != null && this.h.b != null && (this.h.b instanceof com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b)) {
                if (f()) {
                    return this.g.bl ? e() : this.h.b.b() + e();
                }
                return this.h.b.b() + h.a(this.mContext, !c() ? 84.0f : 0.0f);
            } else if (this.g.f() && this.h != null && (this.h.b instanceof com.sankuai.waimai.store.poi.list.adapter.subcategory.core.c)) {
                int height = this.i.getHeight() - h.a(this.mContext, 13.0f);
                if (this.f != null && height > 0) {
                    this.f.a(height);
                }
                return Math.max(height, 0);
            } else {
                return 0;
            }
        }
        return 0;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1517e3870f4d097131c974699b4c0823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1517e3870f4d097131c974699b4c0823");
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.d.a(this.g.E, -657930);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(a2);
        float[] fArr = new float[8];
        fArr[0] = h.a(this.mContext, this.g.aX ? 9.0f : 20.0f);
        fArr[1] = h.a(this.mContext, this.g.aX ? 9.0f : 20.0f);
        fArr[2] = h.a(this.mContext, this.g.aX ? 9.0f : 20.0f);
        fArr[3] = h.a(this.mContext, this.g.aX ? 9.0f : 20.0f);
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        gradientDrawable.setCornerRadii(fArr);
        this.p.setBackground(gradientDrawable);
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b.f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d421d5915c336e63077b6246a0b52583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d421d5915c336e63077b6246a0b52583");
        } else if (this.t == 0) {
        } else {
            ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
            layoutParams.height = this.t;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            if (!f()) {
                marginLayoutParams.setMargins(0, h.a(this.mContext, (c() || !z) ? 0.0f : 84.0f), 0, 0);
            } else if (this.g.bl) {
                marginLayoutParams.setMargins(z ? 0 : h.a(this.mContext, 12.0f), 0, z ? 0 : h.a(this.mContext, 12.0f), z ? h.a(this.mContext, 5.0f) : 0);
            } else {
                marginLayoutParams.setMargins(z ? 0 : h.a(this.mContext, 12.0f), z ? e() + h.a(this.mContext, 19.5f) : 0, z ? 0 : h.a(this.mContext, 12.0f), z ? h.a(this.mContext, 5.0f) : 0);
            }
            this.p.setLayoutParams(layoutParams);
        }
    }

    private int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63c89ccd9d1013a537838c5ca732fa0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63c89ccd9d1013a537838c5ca732fa0")).intValue();
        }
        if (this.g.bl) {
            return h.a(this.mContext, this.g.a(p.a(this.j) ? 0 : this.j.size()));
        } else if (p.a(this.j) || this.j.size() == 0) {
            return 0;
        } else {
            int size = this.j.size();
            if (size <= 4) {
                return h.a(this.mContext, -14.0f);
            }
            if (size > 4 && size <= 8) {
                return h.a(this.mContext, 20.0f);
            }
            return h.a(this.mContext, 58.0f);
        }
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37dad615a5a442de3f1c3668d455d1f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37dad615a5a442de3f1c3668d455d1f9")).booleanValue() : this.g.v();
    }
}
