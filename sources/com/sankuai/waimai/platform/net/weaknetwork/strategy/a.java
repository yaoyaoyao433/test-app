package com.sankuai.waimai.platform.net.weaknetwork.strategy;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Handler b;
    InterfaceC1072a c;
    long d;
    int e;
    long f;
    private Looper g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.net.weaknetwork.strategy.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1072a {
        com.sankuai.waimai.platform.net.a a();

        void a(com.sankuai.waimai.platform.net.a aVar);
    }

    public a(com.sankuai.waimai.platform.net.weaknetwork.a aVar, Looper looper, InterfaceC1072a interfaceC1072a) {
        Object[] objArr = {aVar, looper, interfaceC1072a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae4af07614840c8032a8063c0c5af9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae4af07614840c8032a8063c0c5af9f");
            return;
        }
        this.h = false;
        this.i = 10000;
        this.j = 10000;
        this.k = 60000;
        this.d = 0L;
        this.e = 0;
        this.f = 0L;
        this.g = looper;
        this.c = interfaceC1072a;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fe8ae643cab0c5df49e8a170cf2257d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fe8ae643cab0c5df49e8a170cf2257d");
        } else if (aVar != null) {
            this.h = aVar.r;
            this.i = aVar.s;
            this.j = aVar.t;
            this.k = aVar.u;
            if (this.h) {
                this.b = new Handler(this.g, new Handler.Callback() { // from class: com.sankuai.waimai.platform.net.weaknetwork.strategy.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.os.Handler.Callback
                    public final boolean handleMessage(Message message) {
                        Object[] objArr3 = {message};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "81993551463c6e92ae181413cb7c1907", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "81993551463c6e92ae181413cb7c1907")).booleanValue();
                        }
                        if (message.what != 0 || a.this.c == null) {
                            return true;
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.d;
                        long a2 = a.this.a();
                        if (elapsedRealtime < a2) {
                            long j = a2 - elapsedRealtime;
                            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ActiveDetectionStrategy handleMessage newDelayTime : " + j, new Object[0]);
                            a.this.b.sendEmptyMessageDelayed(0, j);
                            if (a.this.f <= 0) {
                                a.this.f = SystemClock.elapsedRealtime();
                            }
                            return true;
                        }
                        com.sankuai.waimai.platform.net.a a3 = a.this.c.a();
                        if (com.sankuai.waimai.platform.net.weaknetwork.d.a(a3)) {
                            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ActiveDetectionStrategy handleMessage quitWeakNet success ", new Object[0]);
                            a.this.cancel(true);
                            a.this.c.a(a3);
                        } else {
                            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ActiveDetectionStrategy handleMessage quitWeakNet failed ", new Object[0]);
                            a.this.e++;
                            a.this.b.removeCallbacksAndMessages(null);
                            a.this.b.sendEmptyMessageDelayed(0, a.this.a());
                            if (a.this.f <= 0) {
                                a.this.f = SystemClock.elapsedRealtime();
                            }
                        }
                        return true;
                    }
                });
            }
        }
    }

    long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8294cd27f659973903856281fe060888", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8294cd27f659973903856281fe060888")).longValue();
        }
        long j = this.j + (this.i * this.e);
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ActiveDetectionStrategy getDelayTime count : %d, delay : %d", Integer.valueOf(this.e), Long.valueOf(j));
        return j > ((long) this.k) ? this.k : j;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1cd3a81674a7bceb09754691b622462", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1cd3a81674a7bceb09754691b622462")).booleanValue();
        }
        if (!this.h || this.b == null) {
            return false;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ActiveDetectionStrategy doStrategy done!!!", new Object[0]);
        this.b.removeCallbacksAndMessages(null);
        this.b.sendEmptyMessageDelayed(0, a());
        this.f = SystemClock.elapsedRealtime();
        com.sankuai.waimai.platform.capacity.log.c.a().a(1000, 1000, "waimai_network_active_detection_triggered");
        return true;
    }

    public final void cancel(boolean z) {
        String str;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f547c5b2ce4a3fe15ece3acfd3b247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f547c5b2ce4a3fe15ece3acfd3b247");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ActiveDetectionStrategy cancel done!!!", new Object[0]);
        if (this.b != null) {
            this.b.removeCallbacksAndMessages(null);
        }
        this.e = 0;
        this.d = 0L;
        if (this.f > 0) {
            int elapsedRealtime = (int) ((SystemClock.elapsedRealtime() - this.f) / 1000);
            if (!z) {
                str = "waimai_network_active_detection_quit_weaknet_by_passive";
            } else if (this.i != 0 || this.j <= 0) {
                str = "waimai_network_active_detection_quit_weaknet_by_active";
            } else {
                str = "waimai_network_active_detection_quit_weaknet_by_active_" + this.j;
            }
            com.sankuai.waimai.platform.capacity.log.c.a().a(1000, elapsedRealtime, str);
            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ActiveDetectionStrategy cancel cancelByActive cmd : %s", str);
            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "ActiveDetectionStrategy cancel cancelByActive : %b, duration : %d", Boolean.valueOf(z), Integer.valueOf(elapsedRealtime));
        }
        this.f = 0L;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541c5768110749907c80d28d60828c4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541c5768110749907c80d28d60828c4c");
        } else {
            this.d = SystemClock.elapsedRealtime();
        }
    }
}
