package com.sankuai.waimai.rocks.view.mach;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.rocks.view.mach.a<com.sankuai.waimai.mach.recycler.c> {
    public static ChangeQuickRedirect a;
    protected Activity b;
    protected String c;
    protected d d;
    protected Map<String, Object> e;
    protected com.sankuai.waimai.mach.recycler.b f;
    protected com.sankuai.waimai.rocks.log.b g;
    protected a h;
    protected int i;
    private final boolean j;
    private String k;
    private Mach.d l;
    private b m;
    private rx.functions.c<com.sankuai.waimai.rocks.view.recyclerview.a, Integer> n;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        com.sankuai.waimai.mach.recycler.c a(String str, com.sankuai.waimai.mach.recycler.h hVar, Mach.a aVar, String str2, String str3);

        com.sankuai.waimai.mach.recycler.c a(String str, String str2, Mach.a aVar, String str3, String str4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(com.sankuai.waimai.mach.recycler.c cVar);
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final /* synthetic */ com.sankuai.waimai.mach.recycler.c a(com.sankuai.waimai.rocks.view.viewmodel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672a313a4e80a400f7f2284e46b8edf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672a313a4e80a400f7f2284e46b8edf4");
        }
        if (aVar.s == null || TextUtils.isEmpty(aVar.s.c)) {
            this.g.a(this.k);
            return null;
        } else if (!aVar.s.c()) {
            this.g.a(this.k, aVar.s.c);
            return null;
        } else if (this.j && (aVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) && aVar.p != 0) {
            return a(aVar, null);
        } else {
            com.sankuai.waimai.mach.recycler.h a2 = this.f.a(aVar.s.c, aVar.s.d, aVar.s.n, this.i);
            if (a2 != null) {
                this.g.b(this.k, aVar.s.c);
                return a(aVar, a2);
            }
            this.g.c(this.k, aVar.s.c);
            return null;
        }
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final /* synthetic */ com.sankuai.waimai.mach.recycler.c a(com.sankuai.waimai.rocks.view.viewmodel.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7dcfcc9d9d0d5feb75c5a6fbdb4f66c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7dcfcc9d9d0d5feb75c5a6fbdb4f66c");
        }
        if (eVar.s == null || TextUtils.isEmpty(eVar.s.c)) {
            this.g.a(this.k);
            return null;
        } else if (!eVar.s.c()) {
            this.g.a(this.k, eVar.s.c);
            return null;
        } else if (this.j && (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) && ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).p != 0) {
            return a(eVar, null);
        } else {
            com.sankuai.waimai.mach.recycler.h a2 = this.f.a(eVar.s.c, eVar.s.d, eVar.s.n);
            if (a2 != null) {
                this.g.b(this.k, eVar.s.c);
                return a(eVar, a2);
            }
            this.g.c(this.k, eVar.s.c);
            return null;
        }
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final /* synthetic */ void a(com.sankuai.waimai.mach.recycler.c cVar, com.sankuai.waimai.mach.recycler.c cVar2, ViewGroup viewGroup) {
        com.sankuai.waimai.mach.recycler.c cVar3 = cVar;
        Object[] objArr = {cVar3, cVar2, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd70a55ba0c63513fd8da509bf56f20a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd70a55ba0c63513fd8da509bf56f20a");
            return;
        }
        this.f.a(cVar3);
        this.f.a(viewGroup, cVar3, this.f.a(cVar3.a()));
    }

    public final c a(int i) {
        if (i <= 0) {
            i = 5000;
        }
        this.i = i;
        return this;
    }

    public c(Activity activity, String str, String str2, com.sankuai.waimai.rocks.log.b bVar, d dVar, Map<String, Object> map, Mach.d dVar2, b bVar2, a aVar, boolean z, rx.functions.c<com.sankuai.waimai.rocks.view.recyclerview.a, Integer> cVar) {
        Object[] objArr = {activity, str, str2, bVar, dVar, map, dVar2, bVar2, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3482e0329639b6795d7d7259ed171312", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3482e0329639b6795d7d7259ed171312");
            return;
        }
        this.i = 5000;
        this.b = activity;
        this.c = str;
        this.k = str2;
        this.d = dVar;
        this.e = map;
        this.f = new com.sankuai.waimai.mach.recycler.b(str);
        this.g = bVar;
        this.l = dVar2;
        this.m = bVar2;
        this.h = aVar;
        this.j = z;
        this.n = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.waimai.mach.recycler.c a(com.sankuai.waimai.rocks.view.viewmodel.e r14, com.sankuai.waimai.mach.recycler.h r15) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.rocks.view.mach.c.a(com.sankuai.waimai.rocks.view.viewmodel.e, com.sankuai.waimai.mach.recycler.h):com.sankuai.waimai.mach.recycler.c");
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final void a(com.sankuai.waimai.mach.recycler.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2af910e98bb8297c454423548e71fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2af910e98bb8297c454423548e71fa");
        } else if (this.f == null || !(aVar instanceof com.sankuai.waimai.mach.recycler.c)) {
        } else {
            this.f.b((com.sankuai.waimai.mach.recycler.c) aVar);
        }
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final boolean b() {
        return this.j;
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final com.sankuai.waimai.mach.recycler.b c() {
        return this.f;
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final void a(com.sankuai.waimai.mach.recycler.b bVar) {
        this.f = bVar;
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final Activity a() {
        return this.b;
    }

    @Override // com.sankuai.waimai.rocks.view.mach.a
    public final rx.functions.c<com.sankuai.waimai.rocks.view.recyclerview.a, Integer> d() {
        return this.n;
    }
}
