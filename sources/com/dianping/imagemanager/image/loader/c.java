package com.dianping.imagemanager.image.loader;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends f<com.dianping.imagemanager.utils.downloadphoto.b, d> {
    public static ChangeQuickRedirect a;
    public static final int b;
    public static final int c;
    private static final int g;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static final c a = new c(c.b, c.c);
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* bridge */ /* synthetic */ com.dianping.imagemanager.utils.downloadphoto.d a(com.dianping.imagemanager.utils.downloadphoto.b bVar) {
        return null;
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* bridge */ /* synthetic */ void a(int i, Bundle bundle, l<com.dianping.imagemanager.utils.downloadphoto.b> lVar) {
        super.a(i, bundle, lVar);
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* bridge */ /* synthetic */ void a(int i, l<com.dianping.imagemanager.utils.downloadphoto.b> lVar) {
        super.a(i, lVar);
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* synthetic */ void a(d dVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8e4729f287e4c554eb44fcdd62ff10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8e4729f287e4c554eb44fcdd62ff10");
        } else {
            dVar2.a(n.FINISHED);
        }
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* bridge */ /* synthetic */ void a(com.dianping.imagemanager.image.loader.b<com.dianping.imagemanager.utils.downloadphoto.b, d> bVar) {
        super.a(bVar);
    }

    @Override // com.dianping.imagemanager.image.loader.f, com.dianping.imagemanager.image.loader.k
    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    @Override // com.dianping.imagemanager.image.loader.m
    public final /* synthetic */ com.dianping.imagemanager.image.loader.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e75af6c0ad406fafe3a96a49567f054", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e75af6c0ad406fafe3a96a49567f054") : new d();
    }

    @Override // com.dianping.imagemanager.image.loader.f
    public final /* synthetic */ void b(d dVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a27076569eee884bfa0aeed53532452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a27076569eee884bfa0aeed53532452");
            return;
        }
        dVar2.a(n.PENDING);
        super.a(new b(dVar2));
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        g = availableProcessors;
        b = availableProcessors + 1;
        c = (g * 2) + 1;
    }

    public static c a() {
        return a.a;
    }

    private c(int i, int i2) {
        super(i, i2);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0c5167d2af534030fd33609f61b844", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0c5167d2af534030fd33609f61b844");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends com.dianping.imagemanager.image.loader.b<com.dianping.imagemanager.utils.downloadphoto.b, d> {
        public static ChangeQuickRedirect c;

        public b(d dVar) {
            super(dVar);
            Object[] objArr = {c.this, dVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779a03584cc39b5a5ca7b7159d6918b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779a03584cc39b5a5ca7b7159d6918b6");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e04f366743125d683061b0301ab0ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e04f366743125d683061b0301ab0ca");
            } else if (this.a == 0 || ((d) this.a).f() || ((d) this.a).d() == n.FINISHED) {
            } else {
                com.dianping.imagemanager.utils.downloadphoto.d a = c.this.a(((d) this.a).a(), ((d) this.a).m().b, ((com.dianping.imagemanager.utils.downloadphoto.b) ((d) this.a).b).r, ((d) this.a).h(), ((d) this.a).i(), ((d) this.a).j(), ((d) this.a).p(), ((d) this.a).q());
                synchronized (((d) this.a)) {
                    if (a != null) {
                        try {
                            if (a.h) {
                                a.o = 1;
                                Iterator<l<com.dianping.imagemanager.utils.downloadphoto.b>> g = ((d) this.a).g();
                                while (g.hasNext()) {
                                    l<com.dianping.imagemanager.utils.downloadphoto.b> next = g.next();
                                    next.c = c.this.a((c) next.a, a);
                                    if (next.c != null && next.c.h) {
                                        c.this.a(3, next);
                                    } else {
                                        c.this.a(4, next);
                                    }
                                    ((d) this.a).a(g);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator<l<com.dianping.imagemanager.utils.downloadphoto.b>> g2 = ((d) this.a).g();
                    while (g2.hasNext()) {
                        l<com.dianping.imagemanager.utils.downloadphoto.b> next2 = g2.next();
                        next2.c = a != null ? a : new com.dianping.imagemanager.utils.downloadphoto.d(10001);
                        c.this.a(4, next2);
                        ((d) this.a).a(g2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169 A[Catch: Exception -> 0x01a8, TryCatch #2 {Exception -> 0x01a8, blocks: (B:61:0x013e, B:63:0x0144, B:65:0x0149, B:70:0x0156, B:73:0x0169, B:75:0x01a1, B:76:0x01a4, B:71:0x015f, B:64:0x0147), top: B:86:0x013e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.imagemanager.utils.downloadphoto.d a(int r23, java.lang.String r24, int r25, long r26, long r28, boolean r30, boolean r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.image.loader.c.a(int, java.lang.String, int, long, long, boolean, boolean, java.lang.String):com.dianping.imagemanager.utils.downloadphoto.d");
    }
}
