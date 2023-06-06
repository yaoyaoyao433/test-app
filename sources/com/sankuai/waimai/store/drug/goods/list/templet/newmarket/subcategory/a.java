package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.recycler.ExtendedGridLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b implements d {
    public static ChangeQuickRedirect a;
    @NonNull
    final h b;
    public C1148a c;
    private SCRecyclerView d;

    public a(@NonNull Context context, @NonNull h hVar) {
        super(context);
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ad7ec55eee1ba223bdd424fa556921", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ad7ec55eee1ba223bdd424fa556921");
        } else {
            this.b = hVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233c117904631c640886bd6515f41a47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233c117904631c640886bd6515f41a47");
            return;
        }
        super.onViewCreated();
        this.d = (SCRecyclerView) findView(R.id.gv_secondary_category);
        ImageView imageView = (ImageView) findView(R.id.expand_arrow);
        Object[] objArr2 = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "677118aea85445aaea96d62cb127bfed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "677118aea85445aaea96d62cb127bfed");
        } else {
            imageView.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.mContext, R.dimen.wm_sc_common_dimen_11, R.dimen.wm_sc_common_dimen_6, R.color.wm_sg_color_999794, R.dimen.wm_sc_common_dimen_1_half, a.EnumC1338a.UP));
        }
        this.d.setDispatchNestedPreFling(false);
        this.d.setLayoutManager(new ExtendedGridLayoutManager(this.mContext, 3));
        this.c = new C1148a(this);
        this.d.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) this.c);
        this.mView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr3 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d0e32eb722f48f353ec54da382500a78", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d0e32eb722f48f353ec54da382500a78")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    a.this.b.w().a(false);
                    a.this.hide();
                }
                return true;
            }
        });
        hide();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.d
    public final boolean a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddc02e85703d4556eb1fa5ad2c3bac1a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddc02e85703d4556eb1fa5ad2c3bac1a")).booleanValue() : this.b.a(eVar.a) > 0;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.d
    public final void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506bc66e29fcd97040b8f97a832c70e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506bc66e29fcd97040b8f97a832c70e6");
            return;
        }
        e h = this.c.h(i);
        if (h == null) {
            return;
        }
        this.b.r();
        this.b.b(h.a);
        this.b.f(false);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.d
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e952f23790fd83bc4de40b73d500dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e952f23790fd83bc4de40b73d500dc");
        } else {
            this.b.w().a(goodsPoiCategory, i, view, 1);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1148a extends com.sankuai.waimai.store.newwidgets.list.f<e, d> {
        public static ChangeQuickRedirect a;

        private C1148a(@NonNull d dVar) {
            super(dVar);
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c47c1dd6a3672cfd61e904046ca272f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c47c1dd6a3672cfd61e904046ca272f");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe47b51af96644e060f0e9fadd5f408b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe47b51af96644e060f0e9fadd5f408b") : new b();
        }

        public final void a_(List<GoodsPoiCategory> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6e933778e3b169f2460edf627468e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6e933778e3b169f2460edf627468e4");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                for (GoodsPoiCategory goodsPoiCategory : list) {
                    arrayList.add(new e(goodsPoiCategory, 0));
                }
            }
            super.b_(arrayList);
        }
    }
}
