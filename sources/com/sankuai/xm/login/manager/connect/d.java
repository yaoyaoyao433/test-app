package com.sankuai.xm.login.manager.connect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.login.net.g;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static ChangeQuickRedirect a;
    public AtomicInteger b;
    public volatile int c;
    public volatile boolean d;
    public boolean e;
    private long f;
    private long g;
    private volatile long h;

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "9ee1c9aeb1f50403011b04460b3b426a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "9ee1c9aeb1f50403011b04460b3b426a");
            return;
        }
        dVar.b();
        if (dVar.d) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "e4db6aa9c457f644f084e59fb5feaa7a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "e4db6aa9c457f644f084e59fb5feaa7a");
            } else {
                dVar.f = System.currentTimeMillis();
                long j = (dVar.f - dVar.g) / 1000;
                if (j <= 0 || dVar.b.get() == 0) {
                    com.sankuai.xm.login.d.a("SocketStableCheck::calculateFrequency durationTime=" + j + " mCount=" + dVar.b);
                } else {
                    try {
                        dVar.c = (int) (j / dVar.b.get());
                    } catch (Exception e) {
                        e.printStackTrace();
                        dVar.c = -1;
                    }
                    com.sankuai.xm.login.d.a("SocketStableCheck::calculateFrequency:: mFrequency=" + dVar.c + " durationTime=" + j + " count=" + dVar.b.get());
                }
            }
            dVar.b.set(0);
            dVar.g = System.currentTimeMillis();
            dVar.d();
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c18e6dd0564b57891c41c34062712065", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c18e6dd0564b57891c41c34062712065");
            return;
        }
        this.b = new AtomicInteger(0);
        this.c = -1;
        this.d = false;
        this.h = -1L;
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7bba7ae24a1d3976a76640891c744f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7bba7ae24a1d3976a76640891c744f4");
        } else if (this.d) {
        } else {
            com.sankuai.xm.login.d.a("SocketStableCheck::start");
            e();
            this.d = true;
            this.g = System.currentTimeMillis();
            d();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a47b43231a41a1392392c295abec06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a47b43231a41a1392392c295abec06");
            return;
        }
        if (this.h > 0) {
            g.a().a(this.h);
            this.h = -1L;
        }
        this.h = g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.connect.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3aa9d94a8844497fc066760ebad7bc4f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3aa9d94a8844497fc066760ebad7bc4f");
                } else {
                    d.a(d.this);
                }
            }
        }, 120000L, false);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd73be4440e53fcb5c8a54b3eac73c1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd73be4440e53fcb5c8a54b3eac73c1a");
        } else if (this.h > 0) {
            g.a().a(this.h);
            this.h = -1L;
        }
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cc2c9bf517b76fbd7a903bb0ee65a4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cc2c9bf517b76fbd7a903bb0ee65a4d");
        } else if (this.d) {
            com.sankuai.xm.login.d.a("SocketStableCheck::stop");
            this.d = false;
            b();
            e();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796bb679641acf634e2901149efca41f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796bb679641acf634e2901149efca41f");
            return;
        }
        this.g = 0L;
        this.f = 0L;
        this.b.set(0);
        this.c = -1;
        this.e = false;
    }
}
