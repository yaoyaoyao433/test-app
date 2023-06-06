package com.sankuai.waimai.store.poi.list.newp.skeleton;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final RecyclerView b;
    private final c c;

    public static a a(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed08c9ac1b8b35bc74f15e44d078ad4c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed08c9ac1b8b35bc74f15e44d078ad4c") : new a(recyclerView);
    }

    private b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a2f78e3384684181dbba86266c733e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a2f78e3384684181dbba86266c733e");
            return;
        }
        this.b = aVar.b;
        this.c = new c();
        this.c.b = aVar.c;
        this.c.c = aVar.d;
        this.c.d = aVar.e;
        this.c.e = aVar.f;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8828ac9e58fadfb6f9faee4f438b0892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8828ac9e58fadfb6f9faee4f438b0892");
            return;
        }
        u.a(this.b);
        if (this.b != null) {
            this.b.setAdapter(this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final RecyclerView b;
        public int c;
        public int d;
        public boolean e;
        public boolean f;

        public a(RecyclerView recyclerView) {
            Object[] objArr = {recyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ef39c70bdcf9b786873f69c722eac51", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ef39c70bdcf9b786873f69c722eac51");
                return;
            }
            this.c = R.layout.wm_sc_home_item_skeleton_default_layout;
            this.d = 2;
            this.b = recyclerView;
        }

        public final b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1cd277d1121f16beced52ed63aaece", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1cd277d1121f16beced52ed63aaece");
            }
            b bVar = new b(this);
            bVar.a();
            return bVar;
        }
    }
}
