package com.sankuai.waimai.store.drug.home.widget.skeleon;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.home.widget.skeleon.a;
import com.sankuai.waimai.store.drug.widgets.shimmer.DrugShimmerFrameLayout;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends f<Object, com.sankuai.waimai.store.newwidgets.list.b> {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    a.b d;

    public b() {
        super(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7434b1b292186f0124560104b76e4b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7434b1b292186f0124560104b76e4b5");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045fc7a7b9cc80568055c3c48e470b15", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045fc7a7b9cc80568055c3c48e470b15") : new a();
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f, android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        return this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends g<Object, com.sankuai.waimai.store.newwidgets.list.b> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(Object obj, int i) {
        }

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b83caaaf7961eefd0dd3f07ac7224b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b83caaaf7961eefd0dd3f07ac7224b1");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c63006c6bc0d6669e9e5fad736744f6", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c63006c6bc0d6669e9e5fad736744f6");
            }
            DrugShimmerFrameLayout drugShimmerFrameLayout = (DrugShimmerFrameLayout) z.a(viewGroup.getContext(), R.layout.wm_drug_home_shimmer_layout, viewGroup, false);
            View view = null;
            if (b.this.d != null) {
                view = b.this.d.a();
            } else if (b.this.b > 0) {
                view = z.a(viewGroup.getContext(), b.this.b, viewGroup, false);
            }
            if (view != null) {
                drugShimmerFrameLayout.addView(view);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DrugShimmerFrameLayout.a;
            if (PatchProxy.isSupport(objArr2, drugShimmerFrameLayout, changeQuickRedirect2, false, "f51a4faaed99860f98abe23e806d6b37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, drugShimmerFrameLayout, changeQuickRedirect2, false, "f51a4faaed99860f98abe23e806d6b37");
            } else {
                com.sankuai.waimai.store.drug.widgets.shimmer.a aVar = drugShimmerFrameLayout.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.widgets.shimmer.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e081cdf505c922c4e80b91642cc6af93", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e081cdf505c922c4e80b91642cc6af93");
                } else if (aVar.b != null && !aVar.a() && aVar.getCallback() != null) {
                    aVar.b.start();
                }
            }
            return drugShimmerFrameLayout;
        }
    }
}
