package com.sankuai.waimai.rocks.page.block;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.rocks.view.c;
import com.sankuai.waimai.rocks.view.mach.c;
import com.sankuai.waimai.rocks.view.recyclerview.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public b b;
    private C1129a c;

    public a(C1129a c1129a) {
        Object[] objArr = {c1129a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0baaac43974b41aeaab6fb4ccecc17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0baaac43974b41aeaab6fb4ccecc17");
            return;
        }
        this.c = c1129a;
        this.b = new b(c1129a.l, this);
    }

    public final com.sankuai.waimai.rocks.view.a a(RecyclerView recyclerView, Map<String, Object> map, b.a aVar, com.sankuai.waimai.rocks.view.recyclerview.footer.a aVar2, com.sankuai.waimai.rocks.view.mach.d dVar) {
        Object[] objArr = {recyclerView, map, aVar, aVar2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9a3a0f8c177bd5444956e9ccad6c19", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9a3a0f8c177bd5444956e9ccad6c19");
        }
        a.C1132a c1132a = new a.C1132a(this.c.f);
        c1132a.k = this.c.g;
        c1132a.c = this.c.l.a();
        c1132a.q = this.c.l;
        c1132a.f = recyclerView;
        c1132a.m = this.c.i;
        c1132a.o = this.c.j;
        c1132a.y = this.c.r;
        c1132a.h = aVar;
        c1132a.r = map == null ? this.c.m : map;
        c1132a.n = this.c.k;
        c1132a.p = this.c.l.r;
        c1132a.t = aVar2;
        c1132a.l = this.c.h;
        c1132a.g = this.c.e;
        c1132a.u = this.c.p;
        c1132a.d = dVar != null ? dVar : this.c.c;
        c1132a.e = this.c.d;
        c1132a.w = this.c.o;
        c1132a.x = this.c.q;
        c1132a.z = this.c.s;
        c1132a.b = this.c.b;
        return c1132a.a();
    }

    public final com.sankuai.waimai.rocks.page.tablist.rocklist.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f396a22c560881b86330a5ba54d922a3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.page.tablist.rocklist.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f396a22c560881b86330a5ba54d922a3") : this.c.n;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9efd8f2598ba5a08c9a9c1705021b0ba", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9efd8f2598ba5a08c9a9c1705021b0ba") : !TextUtils.isEmpty(this.c.g) ? this.c.g : this.c.f;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.rocks.page.block.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1129a {
        public static ChangeQuickRedirect a;
        public int b;
        public com.sankuai.waimai.rocks.view.mach.d c;
        public c.b d;
        public com.sankuai.waimai.rocks.expose.a e;
        public String f;
        public String g;
        public Rect h;
        public boolean i;
        public boolean j;
        public boolean k;
        public com.sankuai.waimai.rocks.page.a l;
        public Map<String, Object> m;
        public com.sankuai.waimai.rocks.page.tablist.rocklist.a n;
        Mach.d o;
        public c.a p;
        c.a q;
        boolean r;
        public rx.functions.c<com.sankuai.waimai.rocks.view.recyclerview.a, Integer> s;

        public C1129a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683f34e57b3af69a838d09223909bab6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683f34e57b3af69a838d09223909bab6");
                return;
            }
            this.b = 5000;
            this.r = l.a(com.meituan.android.singleton.b.a, "waimai_platform", "MACH_THREAD_OPT", false);
            this.f = str;
        }
    }
}
