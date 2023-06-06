package com.sankuai.waimai.business.search.ui.result.mach.component.gallery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.FooterView;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.utils.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a = null;
    private static final String c = "a";
    c b;
    private com.sankuai.waimai.mach.render.c d;
    private List<com.sankuai.waimai.mach.node.a> e;

    public a() {
    }

    public a(@NonNull List<com.sankuai.waimai.mach.node.a> list, com.sankuai.waimai.mach.render.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92893192dc5f93cf1dc2afde809b6a2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92893192dc5f93cf1dc2afde809b6a2f");
            return;
        }
        this.e = list;
        this.d = cVar;
    }

    public final void a(List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b8a65f986ba53aeb152665a3e1b69c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b8a65f986ba53aeb152665a3e1b69c4");
            return;
        }
        this.e = list;
        try {
            notifyDataSetChanged();
        } catch (Exception e) {
            Log.wtf(c, e);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3702aef7c4013f667d50c57010942050", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3702aef7c4013f667d50c57010942050");
        }
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        if (i == 0) {
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            return new C0869a(this.d, frameLayout);
        } else if (i == 1) {
            FooterView footerView = new FooterView(viewGroup.getContext(), this.b);
            footerView.setLayoutParams(new ViewGroup.LayoutParams(g.a(context, this.b.f), -1));
            return new b(footerView);
        } else {
            return null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.s sVar, int i) {
        com.sankuai.waimai.mach.node.a aVar;
        View a2;
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa113a9c9641b410d22d2051fe58868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa113a9c9641b410d22d2051fe58868");
            return;
        }
        try {
            if (this.e == null || (aVar = (com.sankuai.waimai.mach.node.a) e.a(this.e, i)) == null || !(sVar instanceof C0869a)) {
                return;
            }
            C0869a c0869a = (C0869a) sVar;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = C0869a.a;
            if (PatchProxy.isSupport(objArr2, c0869a, changeQuickRedirect2, false, "706150de15bb90d32c440cc85f5be8ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c0869a, changeQuickRedirect2, false, "706150de15bb90d32c440cc85f5be8ea");
                return;
            }
            c0869a.c = aVar;
            if (c0869a.b == null || (a2 = c0869a.b.a(aVar, false)) == null) {
                return;
            }
            d dVar = aVar.c;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dVar.s(), (int) dVar.t());
            layoutParams.gravity = 17;
            ViewGroup viewGroup = (ViewGroup) c0869a.itemView;
            viewGroup.removeAllViews();
            viewGroup.addView(a2, layoutParams);
        } catch (Exception e) {
            Log.wtf(c, "onBindViewHolder: ", e);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewRecycled(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd1e480d474bc2fc677832a952db67d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd1e480d474bc2fc677832a952db67d");
            return;
        }
        super.onViewRecycled(sVar);
        if (sVar == null || !(sVar instanceof C0869a)) {
            return;
        }
        C0869a c0869a = (C0869a) sVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = C0869a.a;
        if (PatchProxy.isSupport(objArr2, c0869a, changeQuickRedirect2, false, "bb855367ff928606869363a8360304fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c0869a, changeQuickRedirect2, false, "bb855367ff928606869363a8360304fb");
        } else if (c0869a.c == null || c0869a.c.h == null) {
        } else {
            c0869a.c.h.o = null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fa583ebfc272bd6ea684bd3d2d13000", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fa583ebfc272bd6ea684bd3d2d13000")).intValue() : (this.b.d && i == getItemCount() - 1) ? 1 : 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0951efba084dc3eb3fe8a919f4a0e116", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0951efba084dc3eb3fe8a919f4a0e116")).intValue();
        }
        int size = this.e != null ? this.e.size() : 0;
        return this.b.d ? size + 1 : size;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends RecyclerView.s {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.mach.component.gallery.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0869a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.mach.render.c b;
        com.sankuai.waimai.mach.node.a c;

        public C0869a(com.sankuai.waimai.mach.render.c cVar, View view) {
            super(view);
            Object[] objArr = {a.this, cVar, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e6a66758658108f2ad65bceda5fc89", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e6a66758658108f2ad65bceda5fc89");
            } else {
                this.b = cVar;
            }
        }
    }
}
