package com.sankuai.waimai.store.poi.list.newp.skeleton;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.shimmer.SGShimmerFrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    boolean d;
    boolean e;

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.s sVar, int i) {
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup.LayoutParams layoutParams;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1298777d7f926d96c4eddc102ef1074c", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1298777d7f926d96c4eddc102ef1074c");
        }
        a aVar = new a(LayoutInflater.from(viewGroup.getContext()), viewGroup, this.b);
        SGShimmerFrameLayout sGShimmerFrameLayout = (SGShimmerFrameLayout) aVar.itemView;
        if (this.d && (layoutParams = aVar.a.getLayoutParams()) != null) {
            if (this.e) {
                layoutParams.width = ((h.a(viewGroup.getContext()) - h.a(viewGroup.getContext(), 32.0f)) / 2) - h.a(viewGroup.getContext(), 4.0f);
            } else {
                layoutParams.width = (h.a(viewGroup.getContext()) - h.a(viewGroup.getContext(), 24.0f)) / 2;
            }
            layoutParams.height = layoutParams.width;
            aVar.a.setLayoutParams(layoutParams);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = SGShimmerFrameLayout.a;
        if (PatchProxy.isSupport(objArr2, sGShimmerFrameLayout, changeQuickRedirect2, false, "5970109892f7b063de3f42388a187e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGShimmerFrameLayout, changeQuickRedirect2, false, "5970109892f7b063de3f42388a187e33");
        } else {
            com.sankuai.waimai.store.shimmer.a aVar2 = sGShimmerFrameLayout.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.shimmer.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "0d28f8735f54b528a4ba2ba2d437c048", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "0d28f8735f54b528a4ba2ba2d437c048");
            } else if (aVar2.b != null && !aVar2.a() && aVar2.getCallback() != null) {
                aVar2.b.start();
            }
        }
        return aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        return this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends RecyclerView.s {
        public View a;

        public a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
            super(layoutInflater.inflate(R.layout.wm_sc_home_shimmer_layout, viewGroup, false));
            ViewGroup viewGroup2 = (ViewGroup) this.itemView;
            View inflate = layoutInflater.inflate(i, viewGroup2, false);
            if (c.this.d) {
                this.a = inflate.findViewById(R.id.top_view);
            }
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            if (layoutParams != null) {
                viewGroup2.setLayoutParams(layoutParams);
            }
            viewGroup2.addView(inflate);
        }
    }
}
