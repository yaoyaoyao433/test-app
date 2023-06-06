package com.sankuai.waimai.store.drug.home.widget.skeleon;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final SCRecyclerView b;
    public int c;
    public final com.sankuai.waimai.store.drug.home.widget.skeleon.b d;
    public b e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        View a();

        View b();
    }

    private a(C1160a c1160a) {
        Object[] objArr = {c1160a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b1244812b08d70b3bbeb91139c3b33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b1244812b08d70b3bbeb91139c3b33");
            return;
        }
        this.c = -1;
        this.b = c1160a.b;
        this.c = c1160a.e;
        this.e = c1160a.f;
        this.d = new com.sankuai.waimai.store.drug.home.widget.skeleon.b();
        this.d.b = c1160a.c;
        this.d.d = c1160a.f;
        this.d.c = c1160a.d;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.widget.skeleon.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1160a {
        public static ChangeQuickRedirect a;
        final SCRecyclerView b;
        int c;
        public int d;
        int e;
        public b f;

        public C1160a(SCRecyclerView sCRecyclerView) {
            Object[] objArr = {sCRecyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1422004efd2224c155fdc7ad92a4249f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1422004efd2224c155fdc7ad92a4249f");
                return;
            }
            this.c = -1;
            this.d = 2;
            this.e = -1;
            this.b = sCRecyclerView;
        }
    }
}
