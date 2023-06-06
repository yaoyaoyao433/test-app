package com.sankuai.waimai.platform.widget.common;

import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c<T> extends f<T> {
    public static ChangeQuickRedirect a;
    public SparseArrayCompat<View> b;
    private SparseArrayCompat<View> h;
    private f<T> i;

    public c(f<T> fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d76715c4d53fb5d1837c8d67d721fcf1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d76715c4d53fb5d1837c8d67d721fcf1");
            return;
        }
        this.h = new SparseArrayCompat<>();
        this.b = new SparseArrayCompat<>();
        this.i = fVar;
    }

    @Override // com.sankuai.waimai.platform.widget.common.f, android.support.v7.widget.RecyclerView.a
    public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188c9d2a8814058dcecd21ef8a352624", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188c9d2a8814058dcecd21ef8a352624");
        }
        if (this.h.get(i) != null) {
            return b.a(this.h.get(i));
        }
        if (this.b.get(i) != null) {
            return b.a(this.b.get(i));
        }
        return this.i.onCreateViewHolder(viewGroup, i);
    }

    @Override // com.sankuai.waimai.platform.widget.common.f, android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "021726becb795306e16af42a9e22e8c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "021726becb795306e16af42a9e22e8c0");
        } else if (a(i) || b(i)) {
            sVar.itemView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        } else {
            this.i.onBindViewHolder(sVar, i - c());
        }
    }

    @Override // com.sankuai.waimai.platform.widget.common.f, android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114b1e1c042d32463c50833d5fc55014", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114b1e1c042d32463c50833d5fc55014")).intValue();
        }
        if (a(i)) {
            return this.h.keyAt(i);
        }
        if (b(i)) {
            return this.b.keyAt((i - c()) - d());
        }
        return this.i.getItemViewType(i - c());
    }

    private int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041b1e89f59789bc34b736b86597f458", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041b1e89f59789bc34b736b86597f458")).intValue() : this.i.getItemCount();
    }

    @Override // com.sankuai.waimai.platform.widget.common.f, android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b34dd4083f56511d58b25d770458678", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b34dd4083f56511d58b25d770458678")).intValue();
        }
        int c = c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return c + (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3e9974ba2a0a609231bdf47f4409be3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3e9974ba2a0a609231bdf47f4409be3")).intValue() : this.b.size()) + d();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4212cffd70f1e4cfc02a45612a4732ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4212cffd70f1e4cfc02a45612a4732ee");
            return;
        }
        this.i.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.c cVar = gridLayoutManager.g;
            gridLayoutManager.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.platform.widget.common.c.1
                public static ChangeQuickRedirect b;

                @Override // android.support.v7.widget.GridLayoutManager.c
                public final int a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ea0ceeb91aa1d2152b66145863eef01", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ea0ceeb91aa1d2152b66145863eef01")).intValue();
                    }
                    int itemViewType = c.this.getItemViewType(i);
                    if (c.this.h.get(itemViewType) == null) {
                        if (c.this.b.get(itemViewType) == null) {
                            if (cVar != null) {
                                return cVar.a(i);
                            }
                            return 1;
                        }
                        return gridLayoutManager.b;
                    }
                    return gridLayoutManager.b;
                }
            };
            gridLayoutManager.a(gridLayoutManager.b);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.s sVar) {
        ViewGroup.LayoutParams layoutParams;
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7235cd6383a004e57351cc009fb0d602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7235cd6383a004e57351cc009fb0d602");
            return;
        }
        this.i.onViewAttachedToWindow(sVar);
        int layoutPosition = sVar.getLayoutPosition();
        if ((a(layoutPosition) || b(layoutPosition)) && (layoutParams = sVar.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.b)) {
            ((StaggeredGridLayoutManager.b) layoutParams).b = true;
        }
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae4af2241bbdf6f13cb1a581c4937e73", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae4af2241bbdf6f13cb1a581c4937e73")).booleanValue() : i < c();
    }

    private boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "902a689cf3d5c9777667c643d2884d03", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "902a689cf3d5c9777667c643d2884d03")).booleanValue() : i >= c() + d();
    }

    @Override // com.sankuai.waimai.platform.widget.common.f
    public final List<T> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50961b1f5f2f62f5d6646be366321b0e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50961b1f5f2f62f5d6646be366321b0e") : this.i.a();
    }

    @Override // com.sankuai.waimai.platform.widget.common.f
    public final int a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6725a0bc62127b2c00214d53e701caa4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6725a0bc62127b2c00214d53e701caa4")).intValue();
        }
        notifyDataSetChanged();
        return this.i.a(list);
    }

    @Override // com.sankuai.waimai.platform.widget.common.f
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c819cc30d2a6e9c5c5d0fd5e91085149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c819cc30d2a6e9c5c5d0fd5e91085149");
        } else {
            this.i.b();
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2d1f392a820340587b395c4568c689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2d1f392a820340587b395c4568c689");
        } else if (this.h.size() == 0) {
            com.sankuai.waimai.foundation.utils.log.a.b("BaseRecycler", "addHeaderView-->mHeaderViews.size() == 0,put " + view + " success!!", new Object[0]);
            this.h.put(this.h.size() + BlankConfig.MAX_SAMPLE, view);
        } else {
            boolean z = false;
            for (int i = 0; i < this.h.size(); i++) {
                if (this.h.valueAt(i) == view) {
                    z = true;
                }
            }
            if (!z) {
                com.sankuai.waimai.foundation.utils.log.a.b("BaseRecycler", "addHeaderView-->mHeaderViews.size() == " + this.h.size() + "put " + view + " success!!", new Object[0]);
                this.h.put(this.h.size() + BlankConfig.MAX_SAMPLE, view);
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("BaseRecycler", "addHeaderView-->mHeaderViews.size() == " + this.h.size() + "put " + view + " fail, it's exist already", new Object[0]);
        }
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b46e69e8daa37ce176271ea1f4a46bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b46e69e8daa37ce176271ea1f4a46bf");
        } else {
            a(this.h, view);
        }
    }

    private void a(SparseArrayCompat<View> sparseArrayCompat, View view) {
        Object[] objArr = {sparseArrayCompat, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78e4cf2eae09e21750dd71dccdc9fdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78e4cf2eae09e21750dd71dccdc9fdb");
        } else if (sparseArrayCompat.size() > 0) {
            for (int i = 0; i < sparseArrayCompat.size(); i++) {
                if (sparseArrayCompat.valueAt(i) == view) {
                    sparseArrayCompat.removeAt(i);
                    com.sankuai.waimai.foundation.utils.log.a.b("BaseRecycler", "remove element success!!", new Object[0]);
                }
            }
        }
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "663aeb5c4db9e506840e19f8dd6eaaf7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "663aeb5c4db9e506840e19f8dd6eaaf7")).intValue() : this.h.size();
    }
}
