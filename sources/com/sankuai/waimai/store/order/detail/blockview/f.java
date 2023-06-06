package com.sankuai.waimai.store.order.detail.blockview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.util.z;
import com.sankuai.waimai.store.widgets.layoutmanager.FixedStaggeredGridLayoutManager;
import com.sankuai.waimai.store.widgets.recycler.j;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f extends com.meituan.android.cube.pga.view.a implements com.sankuai.waimai.store.expose.v2.a {
    public static ChangeQuickRedirect d;
    public TextView e;
    public ImageView f;
    protected RecyclerView g;
    public com.sankuai.waimai.store.poilist.mach.d h;
    public LoadingFooterView i;
    public com.sankuai.waimai.store.param.a j;
    com.sankuai.waimai.store.order.detail.adapter.c k;
    int l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    @Override // com.meituan.android.cube.pga.view.a
    public int d() {
        return R.layout.wm_sc_order_detail_spu_recommend;
    }

    public static /* synthetic */ void a(f fVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "bd004072cfdc40fc29217b1e579a772f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "bd004072cfdc40fc29217b1e579a772f");
            return;
        }
        ViewGroup.LayoutParams layoutParams = fVar.b.getLayoutParams();
        if (layoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.height = -1;
        fVar.b.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void a(f fVar, a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "ede7894502c6713bc0310a94e343e656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "ede7894502c6713bc0310a94e343e656");
        } else if (aVar != null) {
            aVar.a();
        }
    }

    public static /* synthetic */ void a(f fVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "1a9c8724503a85b26edc7d6356258ef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "1a9c8724503a85b26edc7d6356258ef6");
            return;
        }
        int min = Math.min(50, com.sankuai.shangou.stone.util.a.a(list));
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                com.sankuai.waimai.store.repository.model.f fVar2 = (com.sankuai.waimai.store.repository.model.f) list.get(i);
                if (fVar2 != null && fVar2.i != null && fVar2.i.cardType == 2 && fVar2.i.moduleDesc != null && "mach".equals(fVar2.i.moduleDesc.nativeId) && !t.a(fVar2.i.moduleDesc.templateId)) {
                    fVar2.j = fVar.h.a(fVar2.i, fVar.k.a() + i);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final View f() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final Activity bB_() {
        return (Activity) this.c;
    }

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f87487150d711356337a3ae9e7a3f384", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f87487150d711356337a3ae9e7a3f384");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc88860ebeff4d38dbe699fcaf272294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc88860ebeff4d38dbe699fcaf272294");
            return;
        }
        super.b();
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "797e76c8f5725c492fd19e009820c5b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "797e76c8f5725c492fd19e009820c5b2");
        } else {
            this.j = new com.sankuai.waimai.store.param.a();
            this.j.G = "c_hgowsqb";
            this.j.c = -999L;
            this.j.f = "-999";
            this.j.T = "-999";
            this.j.V = "-999";
            this.j.g = -999L;
            this.j.l.put("-999", "-999");
        }
        this.l = com.sankuai.shangou.stone.util.h.a(this.c, 4.0f);
        this.h = new com.sankuai.waimai.store.poilist.mach.d((BaseActivity) this.c, this.j, ((com.sankuai.shangou.stone.util.h.a(this.c) - (com.sankuai.shangou.stone.util.h.a(this.c, 12.0f) * 2)) - (this.l * 2)) / 2);
        this.h.d = "sm_mach_order_detail_poi_recycle_mach_%s";
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e76c4911fe4ac9c5900ba532833e5015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e76c4911fe4ac9c5900ba532833e5015");
        } else {
            this.g = (RecyclerView) this.b.findViewById(R.id.sc_recycle_spu_rec);
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = com.sankuai.shangou.stone.util.h.a(this.c) - (com.sankuai.shangou.stone.util.h.a(this.c, 12.0f) * 2);
            }
            this.g.setFocusable(false);
            this.k = new com.sankuai.waimai.store.order.detail.adapter.c((BaseActivity) this.c, this.j, this.h, this);
            RecyclerView recyclerView = this.g;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = d;
            recyclerView.setAdapter(PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "30f9992770995db94b0a93c52854ca19", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "30f9992770995db94b0a93c52854ca19") : new j<com.sankuai.waimai.store.widgets.recycler.e>(this.k) { // from class: com.sankuai.waimai.store.order.detail.blockview.f.2
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.a
                public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.s sVar) {
                    com.sankuai.waimai.store.widgets.recycler.e eVar = (com.sankuai.waimai.store.widgets.recycler.e) sVar;
                    Object[] objArr5 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "adda791cd847a18475178cb7547a184e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "adda791cd847a18475178cb7547a184e");
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = eVar.itemView.getLayoutParams();
                    if (layoutParams2 instanceof StaggeredGridLayoutManager.b) {
                        StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams2;
                        int itemViewType = eVar.getItemViewType();
                        if (itemViewType == -2147483647 || itemViewType == -2147483646) {
                            bVar.b = true;
                        } else {
                            bVar.b = false;
                        }
                    }
                }
            });
            RecyclerView recyclerView2 = this.g;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = d;
            recyclerView2.addItemDecoration(PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2cd4e8616c3d259f943ab7c9ac0b3332", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.f) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2cd4e8616c3d259f943ab7c9ac0b3332") : new RecyclerView.f() { // from class: com.sankuai.waimai.store.order.detail.blockview.f.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.f
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView3, RecyclerView.State state) {
                    Object[] objArr6 = {rect, view, recyclerView3, state};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ae3e659a8105e4f586e9e23c400b94d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ae3e659a8105e4f586e9e23c400b94d7");
                    } else if (recyclerView3.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) view.getLayoutParams();
                        if (bVar.b) {
                            rect.left = 0;
                            rect.right = 0;
                            rect.top = 0;
                            rect.bottom = 0;
                            return;
                        }
                        if (bVar.b() % 2 == 0) {
                            rect.left = 0;
                            rect.right = f.this.l;
                        } else {
                            rect.left = f.this.l;
                            rect.right = 0;
                        }
                        rect.top = f.this.l * 2;
                        rect.bottom = 0;
                    }
                }
            });
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = d;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3fab8a069a649e2e85b35e91c16d9e8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3fab8a069a649e2e85b35e91c16d9e8c");
            return;
        }
        View a2 = z.a(this.c, R.layout.wm_sc_order_detail_spu_recommend_header, null);
        this.e = (TextView) a2.findViewById(R.id.sg_order_detail_recommend_title);
        this.f = (ImageView) a2.findViewById(R.id.sg_order_detail_recommend_title_iv);
        this.k.c(a2);
        this.i = new LoadingFooterView(this.c);
        this.i.setNoMoreViewHeight(R.dimen.wm_sc_common_dimen_60);
        this.i.a();
        this.k.d(this.i);
    }

    public void a(@NonNull List<PoiCardInfo> list, @NonNull List<com.sankuai.waimai.store.repository.model.f> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47e1837ac884858511f4db71e085927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47e1837ac884858511f4db71e085927");
            return;
        }
        for (PoiCardInfo poiCardInfo : list) {
            if (poiCardInfo != null) {
                com.sankuai.waimai.store.repository.model.f fVar = new com.sankuai.waimai.store.repository.model.f();
                fVar.b = null;
                fVar.c = null;
                fVar.i = poiCardInfo;
                list2.add(fVar);
            }
        }
        if (this.g.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return;
        }
        this.g.setLayoutManager(new FixedStaggeredGridLayoutManager(2, 1));
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c33b9b91dbb9d0b43126cee5c8447b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c33b9b91dbb9d0b43126cee5c8447b5");
        } else if (this.i != null) {
            this.i.b();
        }
    }

    public void a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a8c199620346b54fb22300bf8f5185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a8c199620346b54fb22300bf8f5185");
        } else if (this.g != null) {
            this.g.addOnScrollListener(new com.sankuai.waimai.store.widgets.recycler.d(nVar, 0));
        }
    }

    public final RecyclerView g() {
        return this.g;
    }

    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d908d10917d49b9d7fa30e5397de433", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d908d10917d49b9d7fa30e5397de433")).intValue();
        }
        if (this.k == null) {
            return 0;
        }
        return this.k.a();
    }
}
