package com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory;

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
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.recycler.ExtendedGridLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b implements e {
    public static ChangeQuickRedirect a;
    @NonNull
    final com.sankuai.waimai.store.goods.list.templet.newmarket.e b;
    private a c;
    private SCRecyclerView d;

    public b(@NonNull Context context, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e12d462d8a7b3d807fa0ba4546669c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e12d462d8a7b3d807fa0ba4546669c2");
        } else {
            this.b = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7d847dc63ea87cfb1ee79449e9b762a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7d847dc63ea87cfb1ee79449e9b762a");
            return;
        }
        super.onViewCreated();
        this.d = (SCRecyclerView) findView(R.id.gv_secondary_category);
        ImageView imageView = (ImageView) findView(R.id.expand_arrow);
        Object[] objArr2 = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d87dab469abc594f3a815b83dcd6a7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d87dab469abc594f3a815b83dcd6a7e");
        } else {
            imageView.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.mContext, R.dimen.wm_sc_common_dimen_11, R.dimen.wm_sc_common_dimen_6, R.color.wm_sg_color_999794, R.dimen.wm_sc_common_dimen_1_half, a.EnumC1338a.UP));
        }
        this.d.setDispatchNestedPreFling(false);
        this.d.setLayoutManager(new ExtendedGridLayoutManager(this.mContext, 3));
        this.c = new a(this);
        this.d.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) this.c);
        this.mView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr3 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "136e1c854c1e7806be53ea4a21439296", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "136e1c854c1e7806be53ea4a21439296")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    b.this.b.D().a(false);
                    b.this.hide();
                }
                return true;
            }
        });
        hide();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.e
    public final boolean a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af91447c6e469060c2a98062ed81b97e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af91447c6e469060c2a98062ed81b97e")).booleanValue() : this.b.a(fVar.a) > 0;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.e
    public final void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9bcab96e76a8e3f409596198cc6fca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9bcab96e76a8e3f409596198cc6fca5");
            return;
        }
        f h = this.c.h(i);
        if (h == null) {
            return;
        }
        this.b.y();
        this.b.b(h.a);
        this.b.e(false);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.e
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a428cde3cf4f720d3a4d178506e2d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a428cde3cf4f720d3a4d178506e2d5");
        } else {
            this.b.D().a(goodsPoiCategory, i, view, 1);
        }
    }

    public final void a(List<GoodsPoiCategory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122f5d88a251d9b82210cfd633f5588a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122f5d88a251d9b82210cfd633f5588a");
            return;
        }
        this.c.a(list);
        hide();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.newwidgets.list.f<f, e> {
        public static ChangeQuickRedirect a;

        private a(@NonNull e eVar) {
            super(eVar);
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafaa12296c967f50153cc706d5313a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafaa12296c967f50153cc706d5313a5");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32771beaa094b9ceb737bd9bc66a31f7", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32771beaa094b9ceb737bd9bc66a31f7") : new c();
        }

        public final void a(List<GoodsPoiCategory> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700cd60f906f215b5a30bd06635f3473", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700cd60f906f215b5a30bd06635f3473");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                for (GoodsPoiCategory goodsPoiCategory : list) {
                    arrayList.add(new f(goodsPoiCategory, 0));
                }
            }
            super.b_(arrayList);
        }
    }
}
