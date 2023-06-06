package com.dianping.imagemanager.image.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends f<com.dianping.imagemanager.utils.downloadphoto.f, h> {
    public static ChangeQuickRedirect a;
    public static final int b;
    public static final int c;
    private static final int g;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        public static final g a = new g();
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* synthetic */ com.dianping.imagemanager.utils.downloadphoto.d a(com.dianping.imagemanager.utils.downloadphoto.f fVar) {
        com.dianping.imagemanager.utils.downloadphoto.f fVar2 = fVar;
        Object[] objArr = {fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67993ffd3ec0e6faf28531de9e5aa6fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.imagemanager.utils.downloadphoto.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67993ffd3ec0e6faf28531de9e5aa6fb");
        }
        com.dianping.imagemanager.utils.downloadphoto.d a2 = a(fVar2.c(), fVar2.b.a(), fVar2.r, fVar2.b(), fVar2.a(), fVar2.p(), fVar2.q(), fVar2.m);
        return (a2 == null || !a2.h) ? a2 : a((g) fVar2, a2);
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* synthetic */ void a(h hVar) {
        h hVar2 = hVar;
        Object[] objArr = {hVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "544a35737ce9bcb22f4a6bcf6a79e88e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "544a35737ce9bcb22f4a6bcf6a79e88e");
        } else {
            hVar2.a(n.FINISHED);
        }
    }

    @Override // com.dianping.imagemanager.image.loader.m
    public final /* synthetic */ com.dianping.imagemanager.image.loader.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c9d16f80697b9cb0bbe4eb5c7281ec", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c9d16f80697b9cb0bbe4eb5c7281ec") : new h();
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* synthetic */ void b(h hVar) {
        h hVar2 = hVar;
        Object[] objArr = {hVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2020d7728eeb68f35deecd6d32ac46f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2020d7728eeb68f35deecd6d32ac46f7");
            return;
        }
        hVar2.a(n.PENDING);
        a(new b(hVar2));
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        g = availableProcessors;
        b = availableProcessors + 1;
        c = (g * 2) + 1;
    }

    public static g a() {
        return a.a;
    }

    public g() {
        super(b, c);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b71459d004852753842cca2b3ff08a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b71459d004852753842cca2b3ff08a0");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b extends com.dianping.imagemanager.image.loader.b<com.dianping.imagemanager.utils.downloadphoto.f, h> {
        public static ChangeQuickRedirect c;

        public b(h hVar) {
            super(hVar);
            Object[] objArr = {g.this, hVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffbe0eb05eed479f05194aaff645df20", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffbe0eb05eed479f05194aaff645df20");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb36c56eae3e47596c186423acdfbaa9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb36c56eae3e47596c186423acdfbaa9");
            } else if (this.a == 0 || ((h) this.a).f() || ((h) this.a).d() == n.FINISHED) {
            } else {
                com.dianping.imagemanager.utils.downloadphoto.d a = g.this.a(((h) this.a).a(), ((h) this.a).m().a(), ((com.dianping.imagemanager.utils.downloadphoto.f) ((h) this.a).b).r, ((h) this.a).h(), ((h) this.a).i(), ((h) this.a).j(), ((h) this.a).p(), ((h) this.a).q());
                synchronized (((h) this.a)) {
                    if (a != null) {
                        try {
                            if (a.h) {
                                a.o = 1;
                                Iterator<l<com.dianping.imagemanager.utils.downloadphoto.f>> g = ((h) this.a).g();
                                while (g.hasNext()) {
                                    l<com.dianping.imagemanager.utils.downloadphoto.f> next = g.next();
                                    next.c = g.this.a((g) next.a, a);
                                    if (next.c != null && next.c.h) {
                                        g.this.a(3, next);
                                    } else {
                                        g.this.a(4, next);
                                    }
                                    ((h) this.a).a(g);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator<l<com.dianping.imagemanager.utils.downloadphoto.f>> g2 = ((h) this.a).g();
                    while (g2.hasNext()) {
                        l<com.dianping.imagemanager.utils.downloadphoto.f> next2 = g2.next();
                        next2.c = a != null ? a : new com.dianping.imagemanager.utils.downloadphoto.d(10001);
                        next2.c.a(((h) this.a).l());
                        g.this.a(4, next2);
                        ((h) this.a).a(g2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b A[Catch: Exception -> 0x01ca, TryCatch #1 {Exception -> 0x01ca, blocks: (B:67:0x0160, B:69:0x0166, B:71:0x016b, B:76:0x0178, B:79:0x018b, B:81:0x01c3, B:82:0x01c6, B:77:0x0181, B:70:0x0169), top: B:93:0x0160 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.imagemanager.utils.downloadphoto.d a(int r23, java.lang.String r24, int r25, long r26, long r28, boolean r30, boolean r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.image.loader.g.a(int, java.lang.String, int, long, long, boolean, boolean, java.lang.String):com.dianping.imagemanager.utils.downloadphoto.d");
    }
}
