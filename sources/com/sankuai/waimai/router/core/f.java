package com.sankuai.waimai.router.core;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f extends com.sankuai.waimai.router.core.b {
    public static ChangeQuickRedirect e;
    private final a a;
    public final Context f;
    public e g;

    public static /* synthetic */ void a(f fVar, j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "44aa8e520029ea9f7356773d04b67921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "44aa8e520029ea9f7356773d04b67921");
            return;
        }
        e eVar = fVar.g;
        if (eVar != null) {
            eVar.a(jVar);
        }
        fVar.a.a(jVar);
        e a2 = jVar.a();
        if (a2 != null) {
            a2.a(jVar);
        }
    }

    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c724947eca69a5c256eb3cb5f80541bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c724947eca69a5c256eb3cb5f80541bc");
            return;
        }
        this.f = context.getApplicationContext();
        this.a = new a();
    }

    public final void a(String str, e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0e59a385525fb581d9302f90c56765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0e59a385525fb581d9302f90c56765");
        } else {
            this.a.b.put(str, eVar);
        }
    }

    @Override // com.sankuai.waimai.router.core.b
    /* renamed from: b */
    public final f a(@NonNull h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279294f8bab32b922ee49de6750192ca", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279294f8bab32b922ee49de6750192ca") : (f) super.a(hVar, i);
    }

    public final void b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99fb3bc2f48e01a20498d2690e07ade8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99fb3bc2f48e01a20498d2690e07ade8");
        } else if (jVar == null) {
            d.d("UriRequest为空", new Object[0]);
            a(new j(this.f, Uri.EMPTY).a("UriRequest为空"), 400);
        } else if (jVar.c == null) {
            d.d("UriRequest.Context为空", new Object[0]);
            a(new j(this.f, jVar.d, jVar.e).a("UriRequest.Context为空"), 400);
        } else if (jVar.d()) {
            d.c("跳转链接为空", new Object[0]);
            jVar.a("跳转链接为空");
            a(jVar, 400);
        } else {
            if (d.b()) {
                d.a("", new Object[0]);
                d.a("---> receive request: %s", jVar.h());
            }
            b(jVar, new b(jVar));
        }
    }

    void a(@NonNull j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b7a6a4649fbc769884f7ac012786d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b7a6a4649fbc769884f7ac012786d0");
            return;
        }
        e eVar = this.g;
        if (eVar != null) {
            eVar.a(jVar, i);
        }
        this.a.a(jVar, i);
        e a2 = jVar.a();
        if (a2 != null) {
            a2.a(jVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements e {
        public static ChangeQuickRedirect a;
        private ConcurrentHashMap<String, e> b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670b96f196bd4829e65aeb6ffda721ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670b96f196bd4829e65aeb6ffda721ee");
            } else {
                this.b = new ConcurrentHashMap<>();
            }
        }

        @Override // com.sankuai.waimai.router.core.e
        public final void a(@NonNull j jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e86d57a81b3f817831ed34bf28a52c3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e86d57a81b3f817831ed34bf28a52c3e");
                return;
            }
            for (e eVar : this.b.values()) {
                eVar.a(jVar);
            }
        }

        @Override // com.sankuai.waimai.router.core.e
        public final void a(@NonNull j jVar, int i) {
            Object[] objArr = {jVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc04dfbdf68ce48c7936b46b3d54086e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc04dfbdf68ce48c7936b46b3d54086e");
                return;
            }
            for (e eVar : this.b.values()) {
                eVar.a(jVar, i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b implements g {
        public static ChangeQuickRedirect a;
        private final j c;

        public b(j jVar) {
            Object[] objArr = {f.this, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8233d31b1a4a7ce038ccb448a7de9d29", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8233d31b1a4a7ce038ccb448a7de9d29");
            } else {
                this.c = jVar;
            }
        }

        @Override // com.sankuai.waimai.router.core.g
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e062f7f99e63c9bc8703cc7ea5dd2d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e062f7f99e63c9bc8703cc7ea5dd2d");
            } else {
                a(404);
            }
        }

        @Override // com.sankuai.waimai.router.core.g
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2de398f0256eab0d22f7b28971f743ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2de398f0256eab0d22f7b28971f743ce");
            } else if (i == 200) {
                this.c.a("com.sankuai.waimai.router.core.result", (String) Integer.valueOf(i));
                f.a(f.this, this.c);
                d.a("<--- success, result code = %s", Integer.valueOf(i));
            } else if (i == 301) {
                d.a("<--- redirect, result code = %s", Integer.valueOf(i));
                f.this.b(this.c);
            } else {
                this.c.a("com.sankuai.waimai.router.core.result", (String) Integer.valueOf(i));
                f.this.a(this.c, i);
                d.a("<--- error, result code = %s", Integer.valueOf(i));
            }
        }
    }
}
