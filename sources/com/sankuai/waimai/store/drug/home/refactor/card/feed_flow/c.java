package com.sankuai.waimai.store.drug.home.refactor.card.feed_flow;

import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.drug.home.newp.block.rxevent.d;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.drug.home.adapter.a b;
    int c;
    List<CategoryInfo> d;
    public boolean e;
    public ViewGroup f;
    PageEventHandler g;
    private com.sankuai.waimai.store.param.a h;
    private RecyclerView i;
    private int j;
    private View k;
    private com.sankuai.waimai.store.drug.home.adapter.subcategory.a l;
    private e.a m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public List<CategoryInfo> a;
        public int b;
        public String c;
        public boolean d;
        public int e;
    }

    public static /* synthetic */ void a(c cVar, boolean z, Context context, CategoryInfo categoryInfo, Map map, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), context, categoryInfo, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f89880c850cfa5b808a8362aade37a32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f89880c850cfa5b808a8362aade37a32");
            return;
        }
        com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(cVar.mContext, "b_waimai_fkdcg6e7_mc").a("media_type", 1);
        a2.a(context).a("cat_id", Long.valueOf(cVar.h.c)).a("sec_cat_id", categoryInfo.code).a("sec_cat_name", t.a(categoryInfo.icon) ? categoryInfo.name : categoryInfo.icon).a("stid", cVar.h.T).a("status", Integer.valueOf(z ? 2 : 1)).a("channel_id", categoryInfo.type).a("index", Integer.valueOf(i)).a("trace_id", TextUtils.isEmpty(cVar.h.aF) ? "" : cVar.h.aF);
        if (map != null) {
            a2.b(map);
        }
        a2.a();
    }

    public c(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506526ea4384ffedba3221e33b86d004", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506526ea4384ffedba3221e33b86d004");
            return;
        }
        this.j = 0;
        this.g = (PageEventHandler) q.a(fragmentActivity).a(PageEventHandler.class);
        this.m = new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFFFFF), com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_F5F5F6)});
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc79fd74e9ebb19bb7dc6edebaa4ed0", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc79fd74e9ebb19bb7dc6edebaa4ed0") : LayoutInflater.from(this.mContext).inflate(R.layout.wm_drug_home_channel_refactor_category, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c05363a306a764ffde16732458502bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c05363a306a764ffde16732458502bc3");
            return;
        }
        super.onViewCreated();
        this.h = ((PoiPageViewModel) q.a((FragmentActivity) this.mContext).a(PoiPageViewModel.class)).d.a();
        this.f = (ViewGroup) this.mView.findViewById(R.id.ll_tablayout_category_header);
        this.i = (RecyclerView) this.mView.findViewById(R.id.rlv_poi_verticality_category_header);
        this.k = this.mView.findViewById(R.id.sort_line);
        this.i.setNestedScrollingEnabled(false);
        ExtendedLinearLayoutManager extendedLinearLayoutManager = new ExtendedLinearLayoutManager(this.mContext);
        extendedLinearLayoutManager.setOrientation(0);
        this.i.setLayoutManager(extendedLinearLayoutManager);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ecf2b9538e60792f46a7adeb8e6179f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ecf2b9538e60792f46a7adeb8e6179f");
        } else {
            this.f.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.transparent)).a());
        }
    }

    public final void a(@NonNull a aVar, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {aVar, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa3d3bf0d264be527e95b981e5f54f53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa3d3bf0d264be527e95b981e5f54f53");
        } else if (poiVerticalityDataResponse == null) {
        } else {
            a();
            this.c = aVar.e;
            if (aVar.a != null) {
                this.d = aVar.a;
            } else {
                this.d = new ArrayList();
            }
            if (this.b == null) {
                a(aVar, this.c);
            }
            this.b.a(new com.sankuai.waimai.store.drug.home.model.c(aVar.d, poiVerticalityDataResponse.backgroundConfig, aVar.b));
            b();
        }
    }

    private void a(@NonNull a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02289efbb6fc66855557c33a099f4c1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02289efbb6fc66855557c33a099f4c1a");
            return;
        }
        this.c = i;
        this.j = this.c;
        this.b = new com.sankuai.waimai.store.drug.home.adapter.a(this.h, aVar, this.mContext, this.c);
        this.b.a(this.l);
        this.i.setAdapter(new l(this.b.b));
        this.k.setVisibility(4);
        c();
        this.i.scrollToPosition(this.c);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea98a3ee55227cf0d08baab7077e64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea98a3ee55227cf0d08baab7077e64d");
            return;
        }
        u.a(this.mView);
        this.b.a(this.d, this.c);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb8ac7abc06a556886181f16f3d7550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb8ac7abc06a556886181f16f3d7550");
            return;
        }
        this.l = new com.sankuai.waimai.store.drug.home.adapter.subcategory.a() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.home.adapter.subcategory.a
            public final void a(View view, int i, Map<String, Object> map) {
                CategoryInfo categoryInfo;
                Object[] objArr2 = {view, Integer.valueOf(i), map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1735e9dc0d4323f45f27af5c5e75bd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1735e9dc0d4323f45f27af5c5e75bd4");
                } else if (i == c.this.c) {
                } else {
                    boolean b = com.sankuai.waimai.store.manager.user.a.a().b();
                    if (b) {
                        categoryInfo = c.this.a(i);
                    } else {
                        categoryInfo = (CategoryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) c.this.d, i);
                        com.sankuai.waimai.store.manager.user.a.a(c.this.mContext);
                    }
                    CategoryInfo categoryInfo2 = categoryInfo;
                    if (categoryInfo2 == null) {
                        return;
                    }
                    if (b) {
                        c.this.g.a((PageEventHandler) new d(categoryInfo2, i));
                    }
                    c.a(c.this, c.this.e, c.this.mContext, categoryInfo2, map, i);
                }
            }
        };
        this.b.a(this.l);
    }

    @Nullable
    public final CategoryInfo a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d48b4c739eef25ae43d9e23eecc430", RobustBitConfig.DEFAULT_VALUE)) {
            return (CategoryInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d48b4c739eef25ae43d9e23eecc430");
        }
        if (i == this.c) {
            return null;
        }
        this.j = i;
        CategoryInfo categoryInfo = (CategoryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, this.j);
        if (categoryInfo == null) {
            return null;
        }
        d();
        this.h.f = categoryInfo.code;
        return categoryInfo;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c025110bcb929b0165d5100d5ca0322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c025110bcb929b0165d5100d5ca0322");
            return;
        }
        this.c = this.j;
        this.b.a(this.d, this.c);
        ((ExtendedLinearLayoutManager) this.i.getLayoutManager()).b(this.c);
    }
}
