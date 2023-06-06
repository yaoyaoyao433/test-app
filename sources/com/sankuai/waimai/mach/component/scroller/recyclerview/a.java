package com.sankuai.waimai.mach.component.scroller.recyclerview;

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
public final class a extends RecyclerView.a<C1006a> {
    public static ChangeQuickRedirect a;
    public List<com.sankuai.waimai.mach.node.a> b;
    private com.sankuai.waimai.mach.render.c c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C1006a c1006a, int i) {
        C1006a c1006a2 = c1006a;
        Object[] objArr = {c1006a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089ae89aba6764d5e8de35bf72d1bb96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089ae89aba6764d5e8de35bf72d1bb96");
            return;
        }
        com.sankuai.waimai.mach.node.a aVar = (com.sankuai.waimai.mach.node.a) e.a(this.b, i);
        if (aVar != null) {
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = C1006a.a;
            if (PatchProxy.isSupport(objArr2, c1006a2, changeQuickRedirect2, false, "ce0c1c5f2b8f1af232573ca2c4615fc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1006a2, changeQuickRedirect2, false, "ce0c1c5f2b8f1af232573ca2c4615fc6");
                return;
            }
            c1006a2.b = aVar;
            View a2 = c1006a2.c.a(aVar, false);
            if (a2 != null) {
                d dVar = aVar.c;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dVar.s(), (int) dVar.t());
                layoutParams.gravity = 17;
                ((ViewGroup) c1006a2.itemView).addView(a2, layoutParams);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ C1006a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5815abb429942b52c113e6863765a59", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1006a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5815abb429942b52c113e6863765a59");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        return new C1006a(this.c, frameLayout);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(C1006a c1006a) {
        C1006a c1006a2 = c1006a;
        Object[] objArr = {c1006a2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84c879dc7fcc9b6df421ef18f0b14e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84c879dc7fcc9b6df421ef18f0b14e6a");
            return;
        }
        super.onViewRecycled(c1006a2);
        if (c1006a2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = C1006a.a;
            if (PatchProxy.isSupport(objArr2, c1006a2, changeQuickRedirect2, false, "5be5de7ca8e434f37bf96cfb705b04ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1006a2, changeQuickRedirect2, false, "5be5de7ca8e434f37bf96cfb705b04ac");
            } else if (c1006a2.b == null || c1006a2.b.h == null) {
            } else {
                ((ViewGroup) c1006a2.itemView).removeView(c1006a2.b.g());
            }
        }
    }

    public a(List<com.sankuai.waimai.mach.node.a> list, com.sankuai.waimai.mach.render.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5417032f6fd995c64ceef2eda925de37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5417032f6fd995c64ceef2eda925de37");
            return;
        }
        this.b = list;
        this.c = cVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee6bf3f59f1d28ad87621ba08d4f6752", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee6bf3f59f1d28ad87621ba08d4f6752")).intValue();
        }
        if (e.a(this.b)) {
            return 0;
        }
        return this.b.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.component.scroller.recyclerview.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1006a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.mach.node.a b;
        com.sankuai.waimai.mach.render.c c;

        public C1006a(com.sankuai.waimai.mach.render.c cVar, View view) {
            super(view);
            Object[] objArr = {cVar, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263bc8a65c1f86f969d57d5425f233bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263bc8a65c1f86f969d57d5425f233bd");
            } else {
                this.c = cVar;
            }
        }
    }
}
