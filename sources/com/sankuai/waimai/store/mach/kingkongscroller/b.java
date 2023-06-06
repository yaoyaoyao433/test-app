package com.sankuai.waimai.store.mach.kingkongscroller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
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
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1be67be3efcb4ace7b0794aec10d49a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1be67be3efcb4ace7b0794aec10d49a5");
            return;
        }
        com.sankuai.waimai.mach.node.a aVar3 = (com.sankuai.waimai.mach.node.a) com.sankuai.waimai.mach.utils.e.a(this.b, i);
        if (aVar3 != null) {
            aVar2.a(aVar3);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccadae41fbf37db9442a885dd13a278c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccadae41fbf37db9442a885dd13a278c");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        return new a(this.c, frameLayout);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(@NonNull a aVar) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9933b3ba2e40c6b32d819185b050f092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9933b3ba2e40c6b32d819185b050f092");
            return;
        }
        super.onViewRecycled(aVar2);
        if (aVar2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "735f98b87c9fecec4ea581257a257730", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "735f98b87c9fecec4ea581257a257730");
            } else if (aVar2.b == null || aVar2.b.h == null) {
            } else {
                aVar2.b.h.o = null;
            }
        }
    }

    public b(List<com.sankuai.waimai.mach.node.a> list, com.sankuai.waimai.mach.render.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4927b8fb951f8614eb6381ed1851631b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4927b8fb951f8614eb6381ed1851631b");
            return;
        }
        this.b = list;
        this.c = cVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d36a48976537c48ba3afdc1d6ef225", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d36a48976537c48ba3afdc1d6ef225")).intValue();
        }
        if (com.sankuai.waimai.mach.utils.e.a(this.b)) {
            return 0;
        }
        return this.b.size();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1478c872532f6a99fa15d74c9ef4a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1478c872532f6a99fa15d74c9ef4a6");
            } else {
                this.c = cVar;
            }
        }

        public final void a(@NonNull final com.sankuai.waimai.mach.node.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "997b7f53e8d03685490e8a4d24ec01d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "997b7f53e8d03685490e8a4d24ec01d2");
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
                            String str = null;
                            if (aVar2.h() != null && aVar2.h().containsKey("expose-key")) {
                                str = String.valueOf(aVar2.h().get("expose-key"));
                            }
                            if (t.a(str)) {
                                str = String.valueOf(System.identityHashCode(aVar2.g()));
                            }
                            com.sankuai.waimai.store.expose.v2.entity.a aVar3 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar2.g(), str);
                            aVar3.a(new c.a() { // from class: com.sankuai.waimai.store.mach.kingkongscroller.b.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                                public final void a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15a75002ae278010f51d7e4f20ad9e52", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15a75002ae278010f51d7e4f20ad9e52");
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
