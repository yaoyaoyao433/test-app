package com.dianping.imagemanager.image.loader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.imagemanager.utils.downloadphoto.httpservice.p;
import com.dianping.imagemanager.utils.i;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class i extends com.dianping.imagemanager.image.loader.f<com.dianping.imagemanager.utils.downloadphoto.h, j> {
    public static ChangeQuickRedirect a;
    public static final ThreadPoolExecutor g;
    private static final BlockingQueue<Runnable> h = new LinkedBlockingQueue(128);
    public com.dianping.imagemanager.utils.downloadphoto.httpservice.g b;
    public com.dianping.gryphon.a c;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class c {
        public static final i a = new i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.dianping.imagemanager.utils.downloadphoto.httpservice.o, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // com.dianping.imagemanager.image.loader.f
    public final /* synthetic */ com.dianping.imagemanager.utils.downloadphoto.d a(com.dianping.imagemanager.utils.downloadphoto.h hVar) {
        com.dianping.imagemanager.utils.downloadphoto.d dVar;
        String str;
        String a2;
        com.dianping.imagemanager.utils.downloadphoto.h hVar2 = hVar;
        Object[] objArr = {hVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e170594bf5ccccf864caab37dc7ec51", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.imagemanager.utils.downloadphoto.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e170594bf5ccccf864caab37dc7ec51");
        }
        ?? r1 = 0;
        if (hVar2.o()) {
            File a3 = com.dianping.imagemanager.image.cache.c.a(hVar2.f(), hVar2.i());
            if (a3 != null) {
                a2 = a3.getPath();
            } else {
                a2 = hVar2.r() ? this.c.a(hVar2.g()) : null;
            }
            dVar = !TextUtils.isEmpty(a2) ? com.dianping.imagemanager.image.loader.decode.a.a(new com.dianping.imagemanager.image.loader.decode.task.a(a2, hVar2.m), hVar2.c(), hVar2.g(), hVar2.b(), hVar2.a(), hVar2.p()) : null;
            if (dVar != null && dVar.h) {
                dVar.o = 1;
                return a((i) hVar2, dVar);
            }
        } else {
            dVar = null;
        }
        if (!hVar2.s()) {
            return new com.dianping.imagemanager.utils.downloadphoto.d(10003);
        }
        String a4 = com.dianping.imagemanager.utils.downloadphoto.urlcompleter.b.a(hVar2.b, hVar2.b(), hVar2.a());
        com.dianping.imagemanager.utils.downloadphoto.d dVar2 = dVar;
        boolean z = false;
        while (!z) {
            com.dianping.imagemanager.utils.downloadphoto.httpservice.g gVar = this.b;
            com.dianping.imagemanager.utils.downloadphoto.httpservice.a aVar = new com.dianping.imagemanager.utils.downloadphoto.httpservice.a(a4, "GET", r1);
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.imagemanager.utils.downloadphoto.httpservice.g.a;
            com.dianping.imagemanager.utils.downloadphoto.httpservice.j doInBackground = PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "313cfcde5145817ad24a41343f00e3e3", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.imagemanager.utils.downloadphoto.httpservice.j) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "313cfcde5145817ad24a41343f00e3e3") : gVar.a(aVar, r1).doInBackground(new Void[0]);
            if (doInBackground.a() / 100 == 2) {
                str = a4;
                dVar2 = com.dianping.imagemanager.image.loader.decode.a.a(new com.dianping.imagemanager.image.loader.decode.task.a(com.dianping.imagemanager.image.cache.c.a((byte[]) doInBackground.c(), hVar2.f(), hVar2.o() ? hVar2.i() : "temp"), hVar2.m), hVar2.c(), hVar2.g(), hVar2.b(), hVar2.a(), hVar2.p());
                dVar2.o = 2;
            } else {
                str = a4;
                if (doInBackground.a() / 100 == 3) {
                    a((int) RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT, hVar2.g());
                    dVar2 = new com.dianping.imagemanager.utils.downloadphoto.d(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
                } else {
                    int a5 = doInBackground.a() >= 0 ? doInBackground.a() + UserCenter.TYPE_LOGOUT_NEGATIVE : doInBackground.a() - 20000;
                    a(a5, hVar2.g());
                    dVar2 = new com.dianping.imagemanager.utils.downloadphoto.d(a5);
                }
            }
            a4 = str;
            z = true;
            r1 = 0;
        }
        return (dVar2 == null || !dVar2.h) ? dVar2 : a((i) hVar2, dVar2);
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* synthetic */ void a(j jVar) {
        j jVar2 = jVar;
        Object[] objArr = {jVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea96bffc1d7c61aed6b0b1c9ccfa5a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea96bffc1d7c61aed6b0b1c9ccfa5a1");
        } else {
            this.b.a(jVar2.r(), jVar2.f, true);
        }
    }

    @Override // com.dianping.imagemanager.image.loader.m
    public final /* synthetic */ com.dianping.imagemanager.image.loader.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca658c53f4b1048b1de8365689b45614", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca658c53f4b1048b1de8365689b45614") : new j();
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* synthetic */ void b(j jVar) {
        j jVar2 = jVar;
        Object[] objArr = {jVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09d2aa4a6d9154dfe5dcb04b9470583c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09d2aa4a6d9154dfe5dcb04b9470583c");
            return;
        }
        jVar2.a(n.PENDING);
        a(new g(jVar2));
    }

    static {
        ThreadPoolExecutor a2 = com.sankuai.android.jarvis.c.a("dpimage-network-result", 1, 1, 30L, TimeUnit.SECONDS, h, new com.dianping.imagemanager.utils.f("dpimage-network-result"), new ThreadPoolExecutor.DiscardOldestPolicy());
        g = a2;
        a2.allowCoreThreadTimeOut(true);
    }

    public static i a() {
        return c.a;
    }

    public i() {
        super(4, 4);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b9c3dc01816a3b76230b27224d1aab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b9c3dc01816a3b76230b27224d1aab");
            return;
        }
        this.b = new com.dianping.imagemanager.utils.downloadphoto.httpservice.g(com.dianping.imagemanager.base.a.a().c, com.sankuai.android.jarvis.c.a("dpimage-http", 6, 6, 2147483647L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
        this.c = com.dianping.gryphon.d.a(com.dianping.gryphon.b.JS_RESOURCE);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class g extends com.dianping.imagemanager.image.loader.b<com.dianping.imagemanager.utils.downloadphoto.h, j> {
        public static ChangeQuickRedirect c;

        public g(j jVar) {
            super(jVar);
            Object[] objArr = {i.this, jVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "085679c8701383cb8bc4df2d9fe8e2ba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "085679c8701383cb8bc4df2d9fe8e2ba");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            String a;
            String str;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a175af4cd55ea997faf5a393f60e26ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a175af4cd55ea997faf5a393f60e26ce");
            } else if (this.a == 0 || ((j) this.a).f()) {
            } else {
                ((j) this.a).a(n.CACHE_CHECKING);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (((j) this.a).n()) {
                    com.dianping.imagemanager.utils.n.a("imagemonitor.predownload.pending", 200, 0, 0, (int) (elapsedRealtime - this.b));
                }
                synchronized (((j) this.a)) {
                    com.dianping.imagemanager.utils.downloadphoto.d dVar = null;
                    if (((j) this.a).k()) {
                        File a2 = com.dianping.imagemanager.image.cache.c.a(((j) this.a).o(), ((j) this.a).b());
                        if (a2 != null) {
                            a = a2.getPath();
                        } else {
                            a = ((j) this.a).i ? i.this.c.a(((j) this.a).l()) : null;
                        }
                        if (!TextUtils.isEmpty(a)) {
                            com.dianping.imagemanager.image.loader.decode.a aVar = com.dianping.imagemanager.image.loader.f.f;
                            dVar = com.dianping.imagemanager.image.loader.decode.a.a(new com.dianping.imagemanager.image.loader.decode.task.a(a, ((j) this.a).q()), ((j) this.a).a(), ((j) this.a).s(), ((j) this.a).h(), ((j) this.a).i(), ((j) this.a).j());
                        }
                        if (((j) this.a).i && (dVar == null || !dVar.h)) {
                            byte[] a3 = com.dianping.imagemanager.image.loader.f.f.a("SourcePic/" + ((j) this.a).b());
                            if (a3 != null) {
                                com.dianping.imagemanager.image.loader.decode.a aVar2 = com.dianping.imagemanager.image.loader.f.f;
                                dVar = com.dianping.imagemanager.image.loader.decode.a.a(new a(a3), ((j) this.a).a(), ((j) this.a).s(), ((j) this.a).h(), ((j) this.a).i(), ((j) this.a).j());
                                if (dVar != null && dVar.h) {
                                    com.dianping.imagemanager.image.cache.c.a(a3, ((j) this.a).o(), ((j) this.a).b());
                                }
                            }
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        if (((j) this.a).o() != null) {
                            str = "diskCacheHit." + ((j) this.a).o().toString().toLowerCase();
                        } else {
                            str = "diskCacheHit.default";
                        }
                        String str2 = str;
                        if (dVar == null || !dVar.h) {
                            com.dianping.imagemanager.utils.n.a(str2, -1, 0, 0, (int) (elapsedRealtime2 - elapsedRealtime), 5, 10000);
                        } else {
                            dVar.o = 1;
                            com.dianping.imagemanager.utils.n.a(str2, 200, 0, (int) dVar.j, (int) (elapsedRealtime2 - elapsedRealtime), 5, 10000);
                        }
                    }
                    if (((j) this.a).d() != n.CACHE_CHECKING) {
                        return;
                    }
                    if (dVar != null && dVar.h) {
                        Iterator<l<com.dianping.imagemanager.utils.downloadphoto.h>> g = ((j) this.a).g();
                        while (g.hasNext()) {
                            l<com.dianping.imagemanager.utils.downloadphoto.h> next = g.next();
                            next.c = i.this.a((i) next.a, dVar);
                            if (next.c != null && next.c.h) {
                                i.this.a(3, next);
                            }
                            ((j) this.a).a(g);
                        }
                    } else {
                        Iterator<l<com.dianping.imagemanager.utils.downloadphoto.h>> g2 = ((j) this.a).g();
                        while (g2.hasNext()) {
                            l<com.dianping.imagemanager.utils.downloadphoto.h> next2 = g2.next();
                            if (!next2.a.s()) {
                                com.dianping.imagemanager.image.loader.f.a(10003, ((j) this.a).l());
                                next2.c = new com.dianping.imagemanager.utils.downloadphoto.d(10003);
                                i.this.a(4, next2);
                                ((j) this.a).a(g2);
                            }
                        }
                    }
                    if (((j) this.a).d() != n.CACHE_CHECKING) {
                        return;
                    }
                    if (((j) this.a).f()) {
                        return;
                    }
                    if (((j) this.a).n()) {
                        com.dianping.imagemanager.utils.n.a("imagemonitor.predownload.execute", 200, 0, 0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                    ((j) this.a).a(n.HTTP_REQUIRING);
                    b bVar = new b((j) this.a);
                    ((j) this.a).f = bVar;
                    i.this.b.b(((j) this.a).r(), bVar);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements com.dianping.imagemanager.utils.downloadphoto.httpservice.h<com.dianping.imagemanager.utils.downloadphoto.httpservice.i, com.dianping.imagemanager.utils.downloadphoto.httpservice.j> {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        private j e;

        @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.h
        public final /* synthetic */ void a(com.dianping.imagemanager.utils.downloadphoto.httpservice.i iVar) {
            Object[] objArr = {iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e522115fd72730e38f01e8fd8d972572", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e522115fd72730e38f01e8fd8d972572");
            } else if (this.e == null || this.e.d() != n.HTTP_REQUIRING) {
            } else {
                this.e.h = -SystemClock.elapsedRealtime();
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.h
        public final /* synthetic */ void a(com.dianping.imagemanager.utils.downloadphoto.httpservice.i iVar, int i, int i2) {
            Object[] objArr = {iVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6a9e24fe30f7ab16b191680481f29f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6a9e24fe30f7ab16b191680481f29f");
            } else if (this.e == null || this.e.d() != n.HTTP_REQUIRING) {
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("count", i);
                bundle.putInt("total", i2);
                Iterator<l<com.dianping.imagemanager.utils.downloadphoto.h>> g = this.e.g();
                while (g.hasNext()) {
                    i.this.a(2, bundle, g.next());
                }
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.o
        public final /* synthetic */ void a(com.dianping.imagemanager.utils.downloadphoto.httpservice.n nVar, p pVar) {
            com.dianping.imagemanager.utils.downloadphoto.httpservice.i iVar = (com.dianping.imagemanager.utils.downloadphoto.httpservice.i) nVar;
            com.dianping.imagemanager.utils.downloadphoto.httpservice.j jVar = (com.dianping.imagemanager.utils.downloadphoto.httpservice.j) pVar;
            Object[] objArr = {iVar, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0e99d7a43bd020c1303c8d9ddc306b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0e99d7a43bd020c1303c8d9ddc306b");
            } else {
                i.g.execute(new e(this.e, iVar, jVar, this));
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.o
        public final /* synthetic */ void b(com.dianping.imagemanager.utils.downloadphoto.httpservice.n nVar, p pVar) {
            com.dianping.imagemanager.utils.downloadphoto.httpservice.i iVar = (com.dianping.imagemanager.utils.downloadphoto.httpservice.i) nVar;
            com.dianping.imagemanager.utils.downloadphoto.httpservice.j jVar = (com.dianping.imagemanager.utils.downloadphoto.httpservice.j) pVar;
            Object[] objArr = {iVar, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97ec30d8b2840bb9d039f2c81af96a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97ec30d8b2840bb9d039f2c81af96a1");
            } else {
                i.g.execute(new f(this.e, iVar, jVar, this));
            }
        }

        public b(j jVar) {
            Object[] objArr = {i.this, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c5054e160128ecef87a432ff2d52d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c5054e160128ecef87a432ff2d52d5");
                return;
            }
            this.b = 0;
            this.c = 0;
            this.e = jVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class f implements Runnable {
        public static ChangeQuickRedirect a;
        private j c;
        private com.dianping.imagemanager.utils.downloadphoto.httpservice.i d;
        private com.dianping.imagemanager.utils.downloadphoto.httpservice.j e;
        private b f;

        public f(j jVar, com.dianping.imagemanager.utils.downloadphoto.httpservice.i iVar, com.dianping.imagemanager.utils.downloadphoto.httpservice.j jVar2, b bVar) {
            Object[] objArr = {i.this, jVar, iVar, jVar2, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c8f05db350a197e5f1804d09daa754", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c8f05db350a197e5f1804d09daa754");
                return;
            }
            this.c = jVar;
            this.d = iVar;
            this.e = jVar2;
            this.f = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 616
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.image.loader.i.f.run():void");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public static ChangeQuickRedirect a;
        private j c;
        private com.dianping.imagemanager.utils.downloadphoto.httpservice.i d;
        private com.dianping.imagemanager.utils.downloadphoto.httpservice.j e;
        private b f;

        public e(j jVar, com.dianping.imagemanager.utils.downloadphoto.httpservice.i iVar, com.dianping.imagemanager.utils.downloadphoto.httpservice.j jVar2, b bVar) {
            Object[] objArr = {i.this, jVar, iVar, jVar2, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cdd4fa351b27cf606dd8f4d599c56d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cdd4fa351b27cf606dd8f4d599c56d0");
                return;
            }
            this.c = jVar;
            this.d = iVar;
            this.e = jVar2;
            this.f = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8215c45aa855260ccf6f58e25bfc04da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8215c45aa855260ccf6f58e25bfc04da");
            } else if (this.c == null || this.c.d() != n.HTTP_REQUIRING) {
            } else {
                if (this.c.d && this.f.b < 3) {
                    this.f.b++;
                    i.this.b.b(this.d, this.f);
                    return;
                }
                String t = this.c.t();
                if (!TextUtils.isEmpty(t)) {
                    com.dianping.imagemanager.utils.a.a(i.class, "require failed, url = " + this.d.f() + ", try to require next url = " + t);
                    this.f.b = 0;
                    this.c.a(t);
                    this.c.e = true;
                    i.this.b.b(this.c.r(), this.f);
                    return;
                }
                if (this.c.h < 0) {
                    this.c.h += SystemClock.elapsedRealtime();
                }
                int a2 = this.e.a();
                if (a2 == 0) {
                    a2 = -100;
                }
                if (this.c.a() != 3) {
                    com.dianping.imagemanager.image.loader.f.a("pic.down.httpservice", a2, 0, 0, (int) this.c.h);
                } else {
                    com.dianping.imagemanager.image.loader.f.a("video.down", a2, 0, 0, (int) this.c.h);
                }
                com.dianping.imagemanager.image.loader.f.a(a2 >= 0 ? a2 + UserCenter.TYPE_LOGOUT_NEGATIVE : a2 - 20000, this.d.f());
                com.dianping.imagemanager.utils.downloadphoto.d dVar = new com.dianping.imagemanager.utils.downloadphoto.d(a2);
                dVar.a(this.c.h);
                synchronized (this.c) {
                    Iterator<l<com.dianping.imagemanager.utils.downloadphoto.h>> g = this.c.g();
                    while (g.hasNext()) {
                        l<com.dianping.imagemanager.utils.downloadphoto.h> next = g.next();
                        if (!TextUtils.isEmpty(next.a.r)) {
                            com.dianping.imagemanager.image.loader.f.a("pic.down." + next.a.r, a2, 0, 0, (int) this.c.h);
                        }
                        next.c = dVar;
                        i.this.a(4, next);
                        this.c.a(g);
                    }
                }
            }
        }
    }

    public static int a(List<com.dianping.imagemanager.utils.downloadphoto.httpservice.l> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebcf5dd58d8a7501b8729945af10d020", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebcf5dd58d8a7501b8729945af10d020")).intValue();
        }
        if (list == null || list.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (com.dianping.imagemanager.utils.downloadphoto.httpservice.l lVar : list) {
            sb.append(lVar.a());
            sb.append(lVar.b());
        }
        return sb.toString().getBytes().length;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class d extends com.dianping.imagemanager.image.loader.b<com.dianping.imagemanager.utils.downloadphoto.h, j> {
        public static ChangeQuickRedirect c;

        public d(j jVar) {
            super(jVar);
            Object[] objArr = {i.this, jVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a9a7ceeebe40632b7f13580a3115ceb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a9a7ceeebe40632b7f13580a3115ceb");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc97bae06cead3b9f234a9990cbbe591", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc97bae06cead3b9f234a9990cbbe591");
            } else if (this.a == 0 || ((j) this.a).f()) {
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (((j) this.a).n()) {
                    com.dianping.imagemanager.utils.n.a("imagemonitor.decode.pending", 200, 0, 0, (int) (elapsedRealtime - this.b));
                }
                String a = com.dianping.imagemanager.image.cache.c.a((byte[]) ((j) this.a).g, ((j) this.a).o(), ((j) this.a).k() ? ((j) this.a).b() : "temp");
                synchronized (((j) this.a)) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    com.dianping.imagemanager.image.loader.decode.a aVar = com.dianping.imagemanager.image.loader.f.f;
                    com.dianping.imagemanager.utils.downloadphoto.d a2 = com.dianping.imagemanager.image.loader.decode.a.a(new com.dianping.imagemanager.image.loader.decode.task.a(a, ((j) this.a).q()), ((j) this.a).a(), ((j) this.a).s(), ((j) this.a).h(), ((j) this.a).i(), ((j) this.a).j());
                    if (((j) this.a).n()) {
                        com.dianping.imagemanager.utils.n.a("imagemonitor.decode.execute", 200, (int) a2.j, 0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime2));
                    }
                    if (((j) this.a).d() != n.DECODING) {
                        return;
                    }
                    if (a2 != null && ((j) this.a).h > 0) {
                        a2.a(((j) this.a).h);
                    }
                    if (a2 == null || !a2.h) {
                        com.dianping.imagemanager.image.loader.f.a(a2 != null ? a2.i : 10001, ((j) this.a).s());
                        Iterator<l<com.dianping.imagemanager.utils.downloadphoto.h>> g = ((j) this.a).g();
                        while (g.hasNext()) {
                            l<com.dianping.imagemanager.utils.downloadphoto.h> next = g.next();
                            next.c = a2;
                            i.this.a(4, next);
                            ((j) this.a).a(g);
                        }
                    } else {
                        a2.o = 2;
                        a2.a(a);
                        Iterator<l<com.dianping.imagemanager.utils.downloadphoto.h>> g2 = ((j) this.a).g();
                        while (g2.hasNext()) {
                            l<com.dianping.imagemanager.utils.downloadphoto.h> next2 = g2.next();
                            next2.c = i.this.a((i) next2.a, a2);
                            if (next2.c != null && next2.c.h) {
                                i.this.a(3, next2);
                            } else {
                                com.dianping.imagemanager.image.loader.f.a(a2 != null ? next2.c.i : 10001, ((j) this.a).s());
                                i.this.a(4, next2);
                            }
                            ((j) this.a).a(g2);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends com.dianping.imagemanager.imagedecode.a {
        public static ChangeQuickRedirect a;
        public byte[] b;

        public a(byte[] bArr) {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a90b73b13546054fb2082f732216b053", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a90b73b13546054fb2082f732216b053");
                return;
            }
            this.b = bArr;
            this.d = 1;
        }

        @Override // com.dianping.imagemanager.imagedecode.a
        public final boolean a() {
            if (this.b == null) {
                this.e = ConnectionResult.NETWORK_ERROR;
                return false;
            }
            return true;
        }

        @Override // com.dianping.imagemanager.imagedecode.a
        public final i.a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3fff5b1df1212256c334e58aca0ab99", RobustBitConfig.DEFAULT_VALUE) ? (i.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3fff5b1df1212256c334e58aca0ab99") : com.dianping.imagemanager.utils.i.a(this.b);
        }

        @Override // com.dianping.imagemanager.imagedecode.a
        public final byte[] a(boolean z) {
            return this.b;
        }

        @Override // com.dianping.imagemanager.imagedecode.a
        public final BitmapFactory.Options c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bafeb10296b350d7aaa69a10e221b6a", RobustBitConfig.DEFAULT_VALUE)) {
                return (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bafeb10296b350d7aaa69a10e221b6a");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.sankuai.waimai.launcher.util.image.a.a(this.b, 0, this.b.length, options);
            return options;
        }

        @Override // com.dianping.imagemanager.imagedecode.a
        public final Bitmap a(BitmapFactory.Options options) {
            Object[] objArr = {options};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2814debda469bddc1c90deb0bea5c79", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2814debda469bddc1c90deb0bea5c79") : com.sankuai.waimai.launcher.util.image.a.a(this.b, 0, this.b.length, options);
        }

        @Override // com.dianping.imagemanager.imagedecode.a
        public final int d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a08ba946691fd9443eb4bb02b74a7e1c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a08ba946691fd9443eb4bb02b74a7e1c")).intValue() : a(this.b);
        }
    }
}
