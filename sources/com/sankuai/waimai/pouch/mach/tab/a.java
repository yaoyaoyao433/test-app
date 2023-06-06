package com.sankuai.waimai.pouch.mach.tab;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.a<C1113a> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.mach.render.c b;
    private List<com.sankuai.waimai.mach.node.a> c;
    private int d;
    private Map<com.sankuai.waimai.mach.node.a, View> e;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C1113a c1113a, int i) {
        List<com.sankuai.waimai.mach.node.a> b;
        C1113a c1113a2 = c1113a;
        Object[] objArr = {c1113a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee4c5dab62c0df00ffd422dca52d9ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee4c5dab62c0df00ffd422dca52d9ef");
            return;
        }
        com.sankuai.waimai.mach.node.a aVar = (com.sankuai.waimai.mach.node.a) e.a(this.c, i);
        if (aVar == null || (b = aVar.b()) == null || b.size() <= 1) {
            return;
        }
        if (i == this.d) {
            com.sankuai.waimai.mach.node.a aVar2 = b.get(1);
            if (aVar2 != null) {
                c1113a2.a(aVar2);
                return;
            }
            return;
        }
        com.sankuai.waimai.mach.node.a aVar3 = b.get(0);
        if (aVar3 != null) {
            c1113a2.a(aVar3);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ C1113a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cdceb43f52cc1d1e214124e0e66d43c", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1113a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cdceb43f52cc1d1e214124e0e66d43c");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        return new C1113a(this.b, frameLayout, this.e);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(C1113a c1113a) {
        C1113a c1113a2 = c1113a;
        Object[] objArr = {c1113a2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "987b732df2110b6513012632dac04049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "987b732df2110b6513012632dac04049");
            return;
        }
        super.onViewRecycled(c1113a2);
        if (c1113a2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = C1113a.a;
            if (PatchProxy.isSupport(objArr2, c1113a2, changeQuickRedirect2, false, "494e74121bd567df86469a2609fd0ee7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1113a2, changeQuickRedirect2, false, "494e74121bd567df86469a2609fd0ee7");
            } else if (c1113a2.b == null || c1113a2.b.h == null) {
            } else {
                c1113a2.b.h.o = null;
            }
        }
    }

    public a(@NonNull List<com.sankuai.waimai.mach.node.a> list, com.sankuai.waimai.mach.render.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "660506a42ae27fd49344af05656fabea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "660506a42ae27fd49344af05656fabea");
            return;
        }
        this.c = list;
        this.b = cVar;
        this.e = new HashMap();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e716ebab68228e7b7270466b5f7dbe91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e716ebab68228e7b7270466b5f7dbe91");
            return;
        }
        this.d = i;
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c001952c13fa5aa623086b8087f3c01", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c001952c13fa5aa623086b8087f3c01")).intValue();
        }
        if (e.b(this.c)) {
            return this.c.size();
        }
        return 0;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d48cb3a960fa35873e1472da9832db1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d48cb3a960fa35873e1472da9832db1");
        } else if (this.e != null) {
            this.e.clear();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.pouch.mach.tab.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1113a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.mach.node.a b;
        private com.sankuai.waimai.mach.render.c d;
        private Map<com.sankuai.waimai.mach.node.a, View> e;

        public C1113a(com.sankuai.waimai.mach.render.c cVar, View view, Map<com.sankuai.waimai.mach.node.a, View> map) {
            super(view);
            Object[] objArr = {a.this, cVar, view, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470c0f3d5c125c26cf22a2b9a59d66e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470c0f3d5c125c26cf22a2b9a59d66e5");
                return;
            }
            this.d = cVar;
            this.e = map;
        }

        public final void a(com.sankuai.waimai.mach.node.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5436c10753c684ac5dde3c07042c79c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5436c10753c684ac5dde3c07042c79c");
                return;
            }
            this.b = aVar;
            View view = this.e.get(aVar);
            if (view == null) {
                view = this.d.a(aVar, false);
                this.e.put(aVar, view);
            }
            if (view != null) {
                d dVar = aVar.c;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dVar.s(), (int) dVar.t());
                layoutParams.gravity = 17;
                if (((ViewGroup) this.itemView).getChildCount() > 0) {
                    ((ViewGroup) this.itemView).removeAllViews();
                }
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                ((ViewGroup) this.itemView).addView(view, layoutParams);
            }
        }
    }
}
