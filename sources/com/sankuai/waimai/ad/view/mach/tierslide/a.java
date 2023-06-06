package com.sankuai.waimai.ad.view.mach.tierslide;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.a<C0681a> {
    public static ChangeQuickRedirect a;
    SparseArray<List<com.sankuai.waimai.mach.node.a>> b;
    private com.sankuai.waimai.mach.render.c c;
    private List<com.sankuai.waimai.mach.node.a> d;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull C0681a c0681a, int i) {
        com.sankuai.waimai.mach.node.a aVar;
        View a2;
        C0681a c0681a2 = c0681a;
        Object[] objArr = {c0681a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4adcc99ae55bdaabce0cf320c6b7975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4adcc99ae55bdaabce0cf320c6b7975");
            return;
        }
        try {
            if (this.d == null || (aVar = (com.sankuai.waimai.mach.node.a) e.a(this.d, i % this.d.size())) == null) {
                return;
            }
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = C0681a.a;
            if (PatchProxy.isSupport(objArr2, c0681a2, changeQuickRedirect2, false, "acf6f315ee994c70a97fc8a451325850", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c0681a2, changeQuickRedirect2, false, "acf6f315ee994c70a97fc8a451325850");
            } else if (c0681a2.b == null || (a2 = c0681a2.b.a(aVar, false)) == null) {
            } else {
                com.facebook.yoga.d dVar = aVar.c;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dVar.s(), (int) dVar.t());
                layoutParams.gravity = 17;
                ViewGroup viewGroup = (ViewGroup) c0681a2.itemView;
                viewGroup.removeAllViews();
                viewGroup.addView(a2, layoutParams);
            }
        } catch (Exception e) {
            Log.wtf("TierSlideAdapter", "onBindViewHolder: ", e);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ C0681a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "620a04f925f9cc3d5aa0994e2ea075b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0681a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "620a04f925f9cc3d5aa0994e2ea075b9");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        return new C0681a(this.c, frameLayout);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewDetachedFromWindow(@NonNull C0681a c0681a) {
        C0681a c0681a2 = c0681a;
        Object[] objArr = {c0681a2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b65a2805867eb7afaf6d537cfa6945f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b65a2805867eb7afaf6d537cfa6945f0");
            return;
        }
        try {
            super.onViewDetachedFromWindow(c0681a2);
            if (this.d == null) {
                return;
            }
            int adapterPosition = c0681a2.getAdapterPosition() % this.d.size();
            Object[] objArr2 = {Integer.valueOf(adapterPosition)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4be541c91688876d7a13fb23112a3898", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4be541c91688876d7a13fb23112a3898");
                return;
            }
            try {
                if (this.d != null && this.b != null && adapterPosition >= 0 && adapterPosition < this.d.size()) {
                    com.sankuai.waimai.mach.node.a aVar = this.d.get(adapterPosition);
                    if (aVar != null && aVar.h != null) {
                        aVar.h.o = null;
                    }
                    List<com.sankuai.waimai.mach.node.a> list = this.b.get(adapterPosition);
                    if (list == null) {
                        return;
                    }
                    for (com.sankuai.waimai.mach.node.a aVar2 : list) {
                        if (aVar2.h instanceof b) {
                            ((b) aVar2.h).a(0);
                        }
                    }
                }
            } catch (Exception e) {
                Log.wtf("TierSlideAdapter", "onViewDetached: ", e);
            }
        } catch (Exception e2) {
            Log.wtf("TierSlideAdapter", "onBindViewHolder: ", e2);
        }
    }

    public a(@NonNull List<com.sankuai.waimai.mach.node.a> list, com.sankuai.waimai.mach.render.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2458ca8b2c83f11538e8feb04890911d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2458ca8b2c83f11538e8feb04890911d");
            return;
        }
        this.d = list;
        this.c = cVar;
    }

    public final void a(List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420568cfb3501984859b36a34d42e066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420568cfb3501984859b36a34d42e066");
            return;
        }
        this.d = list;
        try {
            notifyDataSetChanged();
        } catch (Exception e) {
            Log.wtf("TierSlideAdapter", e);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ee02014a8ef3c27703255dee1473ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ee02014a8ef3c27703255dee1473ec")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        if (this.d.size() > 1) {
            return Integer.MAX_VALUE;
        }
        return this.d.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ad.view.mach.tierslide.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0681a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.mach.render.c b;

        public C0681a(com.sankuai.waimai.mach.render.c cVar, View view) {
            super(view);
            Object[] objArr = {cVar, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7e50d170854f41935453f43238c891", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7e50d170854f41935453f43238c891");
            } else {
                this.b = cVar;
            }
        }
    }
}
