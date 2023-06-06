package com.sankuai.waimai.store.drug.search.mach.component.nestscroller;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    List<com.sankuai.waimai.mach.node.a> b;
    private com.sankuai.waimai.mach.render.c c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f23d6e4e840148f3d600424af095aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f23d6e4e840148f3d600424af095aea");
            return;
        }
        com.sankuai.waimai.mach.node.a aVar3 = (com.sankuai.waimai.mach.node.a) com.sankuai.waimai.mach.utils.e.a(this.b, i);
        if (aVar3 != null) {
            aVar2.a(aVar3);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d22f17215d27d87e83944a9e0283b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d22f17215d27d87e83944a9e0283b2");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        return new a(this.c, frameLayout);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(a aVar) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "609572be5d90d4fdafbbcb11d770eb24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "609572be5d90d4fdafbbcb11d770eb24");
            return;
        }
        super.onViewRecycled(aVar2);
        if (aVar2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "f1f3ffadfda09cd08fa2598dfccce9b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "f1f3ffadfda09cd08fa2598dfccce9b3");
            } else if (aVar2.b == null || aVar2.b.h == null) {
            } else {
                aVar2.b.h.o = null;
            }
        }
    }

    public b(List<com.sankuai.waimai.mach.node.a> list, com.sankuai.waimai.mach.render.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7a90b7ea19c0c618f1fca3b944b7ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7a90b7ea19c0c618f1fca3b944b7ff");
            return;
        }
        this.b = list;
        this.c = cVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605ed2326609f517e2f93bf74407c3bf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605ed2326609f517e2f93bf74407c3bf")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.mach.node.a b;
        private com.sankuai.waimai.mach.render.c c;

        public a(com.sankuai.waimai.mach.render.c cVar, View view) {
            super(view);
            Object[] objArr = {cVar, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961aabfb53037768519d25ce5063e95d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961aabfb53037768519d25ce5063e95d");
            } else {
                this.c = cVar;
            }
        }

        public final void a(final com.sankuai.waimai.mach.node.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6dd3a89b5a2adbd0e0b5e46919d527a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6dd3a89b5a2adbd0e0b5e46919d527a");
                return;
            }
            this.b = aVar;
            View a2 = this.c.a(aVar, false);
            if (a2 != null) {
                if (aVar.f != null && (aVar.f.getActivity() instanceof SCBaseActivity)) {
                    ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                    com.sankuai.waimai.store.mach.a.a(aVar, arrayList);
                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                        for (final com.sankuai.waimai.mach.node.a aVar2 : arrayList) {
                            com.sankuai.waimai.store.expose.v2.entity.a aVar3 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar2.g(), String.valueOf(System.identityHashCode(aVar2)));
                            aVar3.a(new c.a() { // from class: com.sankuai.waimai.store.drug.search.mach.component.nestscroller.b.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                                public final void a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57ae9433e013558b2c73bb2eaf445812", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57ae9433e013558b2c73bb2eaf445812");
                                    } else {
                                        aVar.f.triggerViewReport(aVar2);
                                    }
                                }
                            });
                            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) aVar.f.getActivity(), aVar3);
                        }
                    }
                }
                com.facebook.yoga.d dVar = aVar.c;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dVar.s(), (int) dVar.t());
                layoutParams.gravity = 17;
                ((ViewGroup) this.itemView).addView(a2, layoutParams);
            }
        }
    }
}
