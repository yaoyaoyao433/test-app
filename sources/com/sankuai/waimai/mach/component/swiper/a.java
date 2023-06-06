package com.sankuai.waimai.mach.component.swiper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.a<C1008a> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.mach.render.c b;
    private List<com.sankuai.waimai.mach.node.a> c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull C1008a c1008a, int i) {
        C1008a c1008a2 = c1008a;
        Object[] objArr = {c1008a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49132b515bd884d9a9dc77e00610b51c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49132b515bd884d9a9dc77e00610b51c");
            return;
        }
        com.sankuai.waimai.mach.node.a aVar = (com.sankuai.waimai.mach.node.a) e.a(this.c, i);
        if (aVar != null) {
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = C1008a.a;
            if (PatchProxy.isSupport(objArr2, c1008a2, changeQuickRedirect2, false, "3b6a6f778171110608696cf84f8c9be4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1008a2, changeQuickRedirect2, false, "3b6a6f778171110608696cf84f8c9be4");
                return;
            }
            c1008a2.b = aVar;
            View a2 = c1008a2.c.a(aVar, false);
            if (a2 != null) {
                d dVar = aVar.c;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dVar.s(), (int) dVar.t());
                layoutParams.gravity = 17;
                ((ViewGroup) c1008a2.itemView).addView(a2, layoutParams);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ C1008a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65599d86fdfef8d1d9b828b1e2b9419f", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1008a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65599d86fdfef8d1d9b828b1e2b9419f");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        return new C1008a(this.b, frameLayout);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(C1008a c1008a) {
        C1008a c1008a2 = c1008a;
        Object[] objArr = {c1008a2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67df76612fc1cb1bfdc593b00c219baa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67df76612fc1cb1bfdc593b00c219baa");
            return;
        }
        super.onViewRecycled(c1008a2);
        if (c1008a2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = C1008a.a;
            if (PatchProxy.isSupport(objArr2, c1008a2, changeQuickRedirect2, false, "eab141512eab731e688cf7e192d961cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1008a2, changeQuickRedirect2, false, "eab141512eab731e688cf7e192d961cb");
            } else if (c1008a2.b == null || c1008a2.b.h == null) {
            } else {
                c1008a2.b.h.o = null;
            }
        }
    }

    public a(@NonNull List<com.sankuai.waimai.mach.node.a> list, com.sankuai.waimai.mach.render.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060681c335faad03bbe8debe285244e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060681c335faad03bbe8debe285244e6");
            return;
        }
        this.c = list;
        this.b = cVar;
    }

    public final void a(List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a6c8d4626c1649dd4d44b9f2f06475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a6c8d4626c1649dd4d44b9f2f06475");
            return;
        }
        this.c = list;
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab209f64226068e88c0112a30396cc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab209f64226068e88c0112a30396cc9")).intValue();
        }
        if (e.b(this.c)) {
            return this.c.size();
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.component.swiper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1008a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.mach.node.a b;
        com.sankuai.waimai.mach.render.c c;

        public C1008a(com.sankuai.waimai.mach.render.c cVar, View view) {
            super(view);
            Object[] objArr = {cVar, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c3f545aa8b0ce76a940e43119db963", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c3f545aa8b0ce76a940e43119db963");
            } else {
                this.c = cVar;
            }
        }
    }
}
