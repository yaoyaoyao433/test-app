package com.sankuai.xm.login.plugins;

import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protosingal.r;
import com.sankuai.xm.base.proto.protosingal.s;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.login.d;
import com.sankuai.xm.login.manager.c;
import com.sankuai.xm.login.net.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends c {
    public static ChangeQuickRedirect a;
    public long b;
    private int c;
    private long d;
    private long e;
    private volatile long f;
    private volatile long g;
    private volatile long h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f407d3e80b4ce2f9a29a117caf80f88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f407d3e80b4ce2f9a29a117caf80f88");
            return;
        }
        this.c = 0;
        this.d = 0L;
        this.b = 0L;
        this.e = 0L;
        this.f = -1L;
        this.g = -1L;
        this.h = -1L;
    }

    public final long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc9f0de6c6a3c6d66d5740655aa03e4", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc9f0de6c6a3c6d66d5740655aa03e4")).longValue();
        }
        if (this.d == 0) {
            this.d = m.b().getLong("LAST_DELTA_TIME", 0L);
        }
        return j + this.d;
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void a_(com.sankuai.xm.login.beans.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f5ddb923c2b9ac5efd111d65ad6326", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f5ddb923c2b9ac5efd111d65ad6326");
        } else if (cVar.a() == 0) {
            a(-1L, 0L, false);
            this.f = a(this.f, LocationStrategy.LOCATION_TIMEOUT, false);
            this.g = a(this.g, 180000L, false);
            this.h = a(this.h, DDLoadConstants.TIME_HOURS_MILLIS, true);
            this.e = System.currentTimeMillis();
        }
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void b(int i, byte[] bArr) {
        int i2;
        char c;
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70aa6c87e44a0ce4244e54a415e90492", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70aa6c87e44a0ce4244e54a415e90492");
        } else if (i == 196726) {
            s sVar = new s();
            sVar.a(bArr);
            long j = sVar.b;
            long j2 = sVar.c;
            Object[] objArr2 = {new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d45cdcb26349c114eb990e72898886f1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d45cdcb26349c114eb990e72898886f1");
                return;
            }
            long currentTimeMillis = (System.currentTimeMillis() - j) / 2;
            if (currentTimeMillis <= 0 || currentTimeMillis >= MetricsAnrManager.ANR_THRESHOLD) {
                this.c++;
                g a2 = g.a();
                com.sankuai.xm.login.net.taskqueue.base.b bVar = new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.plugins.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.login.net.taskqueue.base.b
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7592548e2f1f7582c14fb251389a964a", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7592548e2f1f7582c14fb251389a964a");
                        } else {
                            a.this.a();
                        }
                    }
                };
                int i3 = this.c;
                Object[] objArr3 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bada0ff46b1ec39d19a3726c92782f6c", 6917529027641081856L)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bada0ff46b1ec39d19a3726c92782f6c")).intValue();
                } else {
                    i2 = 500;
                    if (i3 > 2 && i3 < 5) {
                        i2 = 5000;
                    } else if (i3 >= 5 && i3 < 10) {
                        i2 = 10000;
                    } else if (i3 >= 10) {
                        i2 = 60000;
                    }
                }
                a2.a(bVar, i2, false);
                d.d("StampPlugin::onQrySrvTimestampRes => delay is invalid, dalay=" + currentTimeMillis, new Object[0]);
                return;
            }
            this.c = 0;
            d.a("StampPlugin::onQrySrvTimestampRes => delay=" + currentTimeMillis + ", lastDeltaT=" + this.d + ", last=" + this.b + ", lstamp=" + j + ", sstamp=" + j2);
            if (this.b != 0 && currentTimeMillis + 100 >= this.b) {
                if (currentTimeMillis >= this.b - 100 && currentTimeMillis <= this.b + 100) {
                    long j3 = (currentTimeMillis + this.b) / 2;
                    this.d = (j2 - j) - j3;
                    this.b = j3;
                }
            } else {
                this.d = (j2 - j) - currentTimeMillis;
                this.b = currentTimeMillis;
            }
            long j4 = this.d;
            Object[] objArr4 = {new Long(j4)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bd9d7aaae439b98d5c1c33dfbf77fad0", 6917529027641081856L)) {
                c = 0;
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bd9d7aaae439b98d5c1c33dfbf77fad0");
            } else {
                c = 0;
                m.b().a("LAST_DELTA_TIME", j4);
            }
            final long j5 = this.d;
            Object[] objArr5 = new Object[1];
            objArr5[c] = new Long(j5);
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f3f0b6f310d837610e0de956538c41ba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f3f0b6f310d837610e0de956538c41ba");
            } else {
                ((l) m.a(l.class)).b(com.sankuai.xm.base.event.a.class).a(new b.a<com.sankuai.xm.base.event.a>() { // from class: com.sankuai.xm.login.plugins.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(com.sankuai.xm.base.event.a aVar) {
                        com.sankuai.xm.base.event.a aVar2 = aVar;
                        Object[] objArr6 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7a9c76016ee107deedb9b8a9a9c6a7df", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7a9c76016ee107deedb9b8a9a9c6a7df")).booleanValue();
                        }
                        if (aVar2 != null) {
                            aVar2.a(j5);
                        }
                        return false;
                    }
                });
            }
        }
    }

    private long a(long j, final long j2, boolean z) {
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a1ed02c97e7ee8f4b844e329d607f0", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a1ed02c97e7ee8f4b844e329d607f0")).longValue();
        }
        if (j != -1) {
            g.a().a(j);
        }
        return g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.plugins.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df8dd5b82dc0fbab7d9b56c80bf688d3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df8dd5b82dc0fbab7d9b56c80bf688d3");
                } else if (!com.sankuai.xm.c.a().h() || System.currentTimeMillis() - a.this.e < j2) {
                } else {
                    a.this.a();
                }
            }
        }, j2, z);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb67d98d551c097e43ae188773ed4f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb67d98d551c097e43ae188773ed4f7");
            return;
        }
        r rVar = new r();
        rVar.b = System.currentTimeMillis();
        com.sankuai.xm.c.a().a(rVar.bS_());
    }
}
