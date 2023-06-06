package com.sankuai.xm.monitor.cat;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.util.net.e;
import com.sankuai.xm.base.util.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    static a b;
    AtomicBoolean c;
    private final Object d;
    private Context e;
    private String f;

    private int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16f05a56167e28f6d117da41c497eb7c", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16f05a56167e28f6d117da41c497eb7c")).intValue() : ((i2 <= 200 || i2 > 600) && i2 >= 0) ? i + 1000 : i2;
    }

    public d(Context context, int i, String str) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b7d8a141880dd199e36d80071740e0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b7d8a141880dd199e36d80071740e0c");
            return;
        }
        this.d = new Object();
        this.c = new AtomicBoolean(false);
        this.f = "";
        this.e = context;
        this.f = str;
        b = new a();
        setDuration(60000);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d126d055faf564bfb81c5534b29361af", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d126d055faf564bfb81c5534b29361af")).booleanValue() : this.c.get();
    }

    public final void a(b bVar) {
        int i;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d85b0b29b16bb9c26622e0009853ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d85b0b29b16bb9c26622e0009853ef");
        } else if (bVar == null || TextUtils.isEmpty(bVar.b) || !com.sankuai.xm.base.util.net.d.d(this.e)) {
            com.sankuai.xm.log.c.c("CatMonitorService", "CatMonitorService::report:: no net catInfo = " + bVar, new Object[0]);
        } else {
            if (bVar.i < 0) {
                if (bVar.b.startsWith(AbsApiFactory.HTTPS)) {
                    bVar.b = bVar.b.substring(8);
                    i = 8;
                } else {
                    if (bVar.b.startsWith(AbsApiFactory.HTTP)) {
                        bVar.b = bVar.b.substring(7);
                    }
                    i = 0;
                }
            } else {
                i = bVar.i;
            }
            com.sankuai.xm.log.c.a(this, "CatMonitorService::report:: catInfo = " + bVar.toString(), new Object[0]);
            String str = "sdkVersion:" + this.f + " uid:" + f.m().b();
            if (!TextUtils.isEmpty(bVar.h)) {
                str = str + "  " + bVar.h;
            }
            pv4(0L, bVar.b, 0, i, a(bVar.c, bVar.d), bVar.e, bVar.f, (int) bVar.g, null, str, 100);
        }
    }

    @Override // com.dianping.monitor.impl.a
    public final String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9235d04ceb228d5fe1317273316433a6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9235d04ceb228d5fe1317273316433a6") : f.m().l();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private HashSet<String> c;

        public a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da431f48428b809c4133e927115948f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da431f48428b809c4133e927115948f9");
                return;
            }
            this.c = new HashSet<>();
            synchronized (d.this.d) {
                this.c.add("api.neixin.cn");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23ca82b65caea1e2b5c99f895ec9a9d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23ca82b65caea1e2b5c99f895ec9a9d");
            } else if (d.this.c.get()) {
                Iterator<String> it = this.c.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!com.sankuai.xm.base.util.net.d.d(d.this.e) || w.d(d.this.e)) {
                        break;
                    }
                    List<String> a2 = e.a(next);
                    if (!a2.isEmpty()) {
                        d dVar = d.this;
                        com.sankuai.xm.log.c.b(dVar, "CatMonitorService::DNSMonitorTask::run::  host=" + next + " ips = " + a2.toString(), new Object[0]);
                        d.this.uploadDNS(next, a2);
                    }
                }
                com.sankuai.xm.threadpool.scheduler.a.b().a(22, this, 300000L);
            }
        }
    }
}
