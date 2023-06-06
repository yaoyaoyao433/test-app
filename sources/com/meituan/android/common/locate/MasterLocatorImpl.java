package com.meituan.android.common.locate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.alipay.sdk.app.PayTask;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.GearsLocationState;
import com.meituan.android.common.locate.LocationInfo;
import com.meituan.android.common.locate.MtLocationInfo;
import com.meituan.android.common.locate.api.BlurLocationManager;
import com.meituan.android.common.locate.controller.d;
import com.meituan.android.common.locate.loader.LoadBusinessEnum;
import com.meituan.android.common.locate.loader.LocationLoader;
import com.meituan.android.common.locate.loader.MtLocationLoader;
import com.meituan.android.common.locate.loader.strategy.Instant;
import com.meituan.android.common.locate.locator.AbstractLocator;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.locator.SystemLocator;
import com.meituan.android.common.locate.platform.logs.h;
import com.meituan.android.common.locate.provider.o;
import com.meituan.android.common.locate.provider.s;
import com.meituan.android.common.locate.provider.t;
import com.meituan.android.common.locate.reporter.e;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.reporter.m;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.utils.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class MasterLocatorImpl implements MasterLocator, f.a {
    public static final long CONFIG_CHECK_INTERVAL = 30000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context g;
    public static int realstatusCode;
    public long a;
    private final ArrayList<Locator> b;
    private final HashSet<MtLocationInfo.MtLocationInfoListener> c;
    private final HashSet<MtLocationInfo.MtLocationInfoListener> d;
    private final b e;
    private volatile com.meituan.android.common.locate.locator.c f;
    private m h;
    private k i;
    public AtomicInteger instantCount;
    private long j;
    private SharedPreferences k;
    private long l;
    private AtomicInteger m;
    private long n;
    private r o;
    private r p;

    public MasterLocatorImpl(final Context context, m mVar) {
        Object[] objArr = {context, mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b966f160103fd4bb19fcf9c3a216ae2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b966f160103fd4bb19fcf9c3a216ae2");
            return;
        }
        this.b = new ArrayList<>();
        this.c = new HashSet<>();
        this.d = new HashSet<>();
        this.f = null;
        this.j = 15000L;
        this.l = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.m = new AtomicInteger(0);
        this.instantCount = new AtomicInteger(0);
        this.n = SystemClock.elapsedRealtime();
        this.o = new r() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.util.r
            public String a() {
                return "mGpsUseCount";
            }

            @Override // com.meituan.android.common.locate.util.r
            public void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ea0bca889f7870410d584e6d0b42813d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ea0bca889f7870410d584e6d0b42813d");
                    return;
                }
                o.d().f();
                MasterLocatorImpl.this.c();
            }

            @Override // com.meituan.android.common.locate.util.r
            public void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "786aab0b5335cab9f0f2b09d52aa7a99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "786aab0b5335cab9f0f2b09d52aa7a99");
                    return;
                }
                MasterLocatorImpl.this.b();
                if (com.meituan.android.common.locate.controller.f.a().g()) {
                    o.d().e();
                }
            }
        };
        this.p = new r() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.util.r
            public String a() {
                return "mGearsUseCount";
            }

            @Override // com.meituan.android.common.locate.util.r
            public void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3e0a18e27c864620a93e685953a20368", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3e0a18e27c864620a93e685953a20368");
                    return;
                }
                o.d().f();
                MasterLocatorImpl.this.d();
                MasterLocatorImpl.this.l();
            }

            @Override // com.meituan.android.common.locate.util.r
            public void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c5ea922419ddf48ee618dd277d9b162b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c5ea922419ddf48ee618dd277d9b162b");
                    return;
                }
                MasterLocatorImpl.this.e();
                MasterLocatorImpl.this.e.b();
                if (com.meituan.android.common.locate.controller.f.a().g()) {
                    o.d().e();
                }
            }
        };
        g = context.getApplicationContext();
        this.h = mVar;
        this.e = new b(context);
        this.e.a(this.c, this.d);
        f.a(this);
        a(LocationUtils.d());
        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d5aa907473aa311b2f99495238d0e19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d5aa907473aa311b2f99495238d0e19");
                    return;
                }
                boolean a = s.a(context).a();
                LogUtils.a("MasterLocatorImpl  currentProcessName: " + s.a(context).c() + " --- isMainProcess: " + a);
                t.a(context);
                com.meituan.android.common.locate.provider.k.a(context);
                BlurLocationManager.a(context);
                if (!a) {
                    try {
                        MasterLocatorImpl.this.f();
                    } catch (Exception e) {
                        LogUtils.a("MasterLocatorImpl sp " + e.getMessage());
                        return;
                    }
                }
                if (MasterLocatorImpl.this.k == null) {
                    MasterLocatorImpl.this.k = f.b();
                }
                MasterLocatorImpl.this.e.a(MasterLocatorImpl.this.k.getLong("past_time", PayTask.j));
                MasterLocatorImpl.this.j = MasterLocatorImpl.this.k.getLong("network_wait_time", 15000L);
                LogUtils.a("MasterLocatorImpl  init networkWaitTime is " + MasterLocatorImpl.this.j);
            }
        });
    }

    private void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04675a20d67e60300998865dc8fcd15a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04675a20d67e60300998865dc8fcd15a");
        } else if ("mars".equals(mtLocation.getProvider())) {
            Bundle bundle = mtLocation.getExtras() == null ? new Bundle() : mtLocation.getExtras();
            bundle.putString("throughMaster", "1");
            mtLocation.setExtras(bundle);
        }
    }

    private void a(LoadBusinessEnum loadBusinessEnum) {
        Object[] objArr = {loadBusinessEnum};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e967c936e7c96a9d02153e710c12c803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e967c936e7c96a9d02153e710c12c803");
        } else if (loadBusinessEnum == null) {
            LogUtils.a("MasterLocatorImpl  business is null");
        } else {
            LogUtils.a("MasterLocatorImpl  business is " + loadBusinessEnum);
            switch (loadBusinessEnum) {
                case MEITUAN:
                    this.l = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
                    return;
                case HOMEBREW:
                    this.l = 30000L;
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9474ad39e2b6933b4cb2ac069d1bde0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9474ad39e2b6933b4cb2ac069d1bde0");
            return;
        }
        if (LogUtils.a()) {
            LogUtils.a("MasterLocatorImpl startByCondition" + obj.getClass().getSimpleName());
        }
        com.meituan.android.common.locate.lifecycle.b.a().b();
        if (Build.VERSION.SDK_INT >= 21) {
            com.meituan.android.common.locate.ble.c.a().b();
        }
        if (!(obj instanceof MtLocationLoader)) {
            this.instantCount.incrementAndGet();
            this.o.h();
            this.p.h();
            return;
        }
        MtLocationLoader mtLocationLoader = (MtLocationLoader) obj;
        if (mtLocationLoader.getAdopter() instanceof Instant) {
            this.instantCount.incrementAndGet();
        }
        if (mtLocationLoader.isUseGps()) {
            this.o.h();
        }
        this.p.h();
        com.meituan.android.common.locate.platform.logs.c.a("startByCondition:MtLocationLoader size:" + this.c.size(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "009a2f4a1b9adcf1a0b6aa778d45772b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "009a2f4a1b9adcf1a0b6aa778d45772b");
        } else {
            h();
        }
    }

    private void b(MtLocation mtLocation) {
        Bundle extras;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bd8658563e3bbea01020a8d8ddb8b8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bd8658563e3bbea01020a8d8ddb8b8b");
        } else if (mtLocation == null || (extras = mtLocation.getExtras()) == null) {
        } else {
            try {
                if (extras.getLong(GearsLocator.TIME_GOT_LOCATION, 0L) == 0) {
                    extras.putLong(GearsLocator.TIME_GOT_LOCATION, mtLocation.getTime());
                }
            } catch (Throwable th) {
                LogUtils.a(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b6b613e956aed62f93753afda56a358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b6b613e956aed62f93753afda56a358");
            return;
        }
        if (LogUtils.a()) {
            LogUtils.a("MasterLocatorImpl stopByCondition" + obj.getClass().getSimpleName());
        }
        d.a().b();
        com.meituan.android.common.locate.lifecycle.b.a().c();
        if (Build.VERSION.SDK_INT >= 21) {
            com.meituan.android.common.locate.ble.c.a().c();
        }
        if (!(obj instanceof MtLocationLoader)) {
            this.o.i();
            this.p.i();
            this.instantCount.getAndDecrement();
            return;
        }
        MtLocationLoader mtLocationLoader = (MtLocationLoader) obj;
        if (mtLocationLoader.getAdopter() instanceof Instant) {
            this.instantCount.getAndDecrement();
        }
        if (mtLocationLoader.isUseGps()) {
            this.o.i();
        }
        com.meituan.android.common.locate.platform.logs.c.a("stopByCondition:MtLocationLoader size:" + this.c.size(), 3);
        this.p.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0a958109576ea128045bec619a94cca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0a958109576ea128045bec619a94cca");
        } else {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e17a7754690c1a973da9272a5dac3b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e17a7754690c1a973da9272a5dac3b8");
        } else {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33dac5a6c04294373269861dbdcd7aa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33dac5a6c04294373269861dbdcd7aa1");
        } else {
            j();
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01acade371cd2bd2d5ca8a0a3430ac93", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01acade371cd2bd2d5ca8a0a3430ac93")).booleanValue();
        }
        if (SystemClock.elapsedRealtime() - this.n > e.a(g).a) {
            return true;
        }
        com.meituan.android.common.locate.platform.logs.c.a("MasterLocatorImpl::isNeedForceRequest false", 3);
        return false;
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d7a74e35418db6f93d4f7d792f8d6bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d7a74e35418db6f93d4f7d792f8d6bb");
            return;
        }
        Iterator<Locator> it = this.b.iterator();
        while (it.hasNext()) {
            Locator next = it.next();
            if (next instanceof SystemLocator) {
                LogUtils.a("start V3 gps locator");
                next.start();
                return;
            }
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ad099f939a3d5fb9c6c99167fb0aafd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ad099f939a3d5fb9c6c99167fb0aafd");
            return;
        }
        Iterator<Locator> it = this.b.iterator();
        while (it.hasNext()) {
            Locator next = it.next();
            if (next instanceof SystemLocator) {
                next.stop();
                return;
            }
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fe970b4aa9478a5d9b2ed1ad39cfebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fe970b4aa9478a5d9b2ed1ad39cfebb");
            return;
        }
        Iterator<Locator> it = this.b.iterator();
        while (it.hasNext()) {
            Locator next = it.next();
            if (next instanceof GearsLocator) {
                LogUtils.a("start V3 network locator");
                next.start();
                GearsLocationState.a(GearsLocationState.State.GERARS_START);
                return;
            }
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dbf1d337140b105b6dd1c658b57e0a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dbf1d337140b105b6dd1c658b57e0a1");
            return;
        }
        Iterator<Locator> it = this.b.iterator();
        while (it.hasNext()) {
            Locator next = it.next();
            if (next instanceof GearsLocator) {
                next.stop();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "406c461dd9a47035c72b716d68dd83ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "406c461dd9a47035c72b716d68dd83ef");
            return;
        }
        if (this.f != null) {
            this.f.a();
        }
        this.e.a();
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public void activeListener(LocationInfo.LocationInfoListener locationInfoListener) {
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    @Deprecated
    public void activeListener(final MtLocationInfo.MtLocationInfoListener mtLocationInfoListener) {
        Object[] objArr = {mtLocationInfoListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ad7f942feb319f3a5f15ff5a38ebcbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ad7f942feb319f3a5f15ff5a38ebcbc");
        } else {
            FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1efd3ab55a3e930254404ee17d875281", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1efd3ab55a3e930254404ee17d875281");
                        return;
                    }
                    MasterLocatorImpl.this.d.remove(mtLocationInfoListener);
                    MasterLocatorImpl.this.c.add(mtLocationInfoListener);
                    MasterLocatorImpl.this.m.incrementAndGet();
                    MasterLocatorImpl.this.a(mtLocationInfoListener);
                    if (LogUtils.a()) {
                        LogUtils.a("activeListener" + mtLocationInfoListener.getClass().getSimpleName());
                        LogUtils.a("activeMtListener. active " + MasterLocatorImpl.this.c.size() + " passive " + MasterLocatorImpl.this.d.size());
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public void addListener(LocationInfo.LocationInfoListener locationInfoListener, boolean z) {
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public void addListener(LocationInfo.LocationInfoListener locationInfoListener, boolean z, boolean z2) {
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public void addListener(MtLocationInfo.MtLocationInfoListener mtLocationInfoListener, boolean z) throws IllegalArgumentException {
        Object[] objArr = {mtLocationInfoListener, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9466cc5fd2f653bd99fa87bd33c9c3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9466cc5fd2f653bd99fa87bd33c9c3c");
        } else {
            addListener(mtLocationInfoListener, z, true);
        }
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public void addListener(final MtLocationInfo.MtLocationInfoListener mtLocationInfoListener, final boolean z, boolean z2) throws IllegalArgumentException {
        boolean z3 = false;
        Object[] objArr = {mtLocationInfoListener, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d775286f4a4b8c682d31501165340633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d775286f4a4b8c682d31501165340633");
            return;
        }
        z3 = ((mtLocationInfoListener instanceof LocationLoader) || (mtLocationInfoListener instanceof MtLocationLoader)) ? true : true;
        if (LocationUtils.a(g) && !z && !z3) {
            throw new IllegalArgumentException("listener should be LocationLoader or MtLocationLoader, passive should true, otherwise affect locate logic");
        }
        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b76d72b81d7f1324a849e5435559802", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b76d72b81d7f1324a849e5435559802");
                } else if (MasterLocatorImpl.this.e.a(mtLocationInfoListener)) {
                } else {
                    if (z) {
                        MasterLocatorImpl.this.d.add(mtLocationInfoListener);
                    } else if (MasterLocatorImpl.this.c.add(mtLocationInfoListener)) {
                        MasterLocatorImpl.this.m.incrementAndGet();
                        MasterLocatorImpl.this.a(mtLocationInfoListener);
                    }
                    if (LogUtils.a()) {
                        LogUtils.a("addListener" + mtLocationInfoListener.getClass().getSimpleName() + z);
                        LogUtils.a("addMtListener. active " + MasterLocatorImpl.this.c.size() + " passive " + MasterLocatorImpl.this.d.size());
                    }
                }
            }
        });
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    @Deprecated
    public void addLocator(Locator locator) {
        Object[] objArr = {locator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10832af5b7968ca1107e5f6ce07177de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10832af5b7968ca1107e5f6ce07177de");
            return;
        }
        if (this.f == null) {
            this.f = new com.meituan.android.common.locate.locator.c(this.h, this);
        }
        if (locator != null) {
            if (locator instanceof AbstractLocator) {
                ((AbstractLocator) locator).setMasterLocator(this);
            }
            locator.setListener(this.f);
            this.b.add(locator);
        }
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public void deactiveListener(LocationInfo.LocationInfoListener locationInfoListener) {
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    @Deprecated
    public void deactiveListener(final MtLocationInfo.MtLocationInfoListener mtLocationInfoListener) {
        Object[] objArr = {mtLocationInfoListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd65c89a6a4d3c72ad0f518219c99f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd65c89a6a4d3c72ad0f518219c99f29");
        } else {
            FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b1208008a575e541961b0841279668ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b1208008a575e541961b0841279668ca");
                        return;
                    }
                    MasterLocatorImpl.this.c.remove(mtLocationInfoListener);
                    MasterLocatorImpl.this.m.getAndDecrement();
                    MasterLocatorImpl.this.d.add(mtLocationInfoListener);
                    MasterLocatorImpl.this.b(mtLocationInfoListener);
                    if (LogUtils.a()) {
                        LogUtils.a("deactiveListener" + mtLocationInfoListener.getClass().getSimpleName());
                        LogUtils.a("deactiveMtListener. active " + MasterLocatorImpl.this.c.size() + " passive " + MasterLocatorImpl.this.d.size());
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public void forceRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be597c30dd97e6c40a5f8d54da27d908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be597c30dd97e6c40a5f8d54da27d908");
        } else if (g()) {
            this.n = SystemClock.elapsedRealtime();
            Iterator<Locator> it = this.b.iterator();
            while (it.hasNext()) {
                Locator next = it.next();
                if (next instanceof GearsLocator) {
                    next.forceRequest();
                    com.meituan.android.common.locate.platform.logs.c.a("MasterLocatorImpl::forceRequest", 3);
                    return;
                }
            }
        }
    }

    public int getInstantCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfef8d96bd88765d6b91e4c763a6c8fe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfef8d96bd88765d6b91e4c763a6c8fe")).intValue() : this.instantCount.get();
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public Location getLastLocation() {
        return null;
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public MtLocation getLastMtLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0af8e76d04ce655906e846799fd76677", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0af8e76d04ce655906e846799fd76677");
        }
        if (g == null) {
            LogUtils.a("Context in masterlocatorimpl is null");
            return null;
        }
        try {
            double parseDouble = Double.parseDouble(f.b().getString("last_lat", "0"));
            double parseDouble2 = Double.parseDouble(f.b().getString("last_lng", "0"));
            long j = f.b().getLong("last_time", -1L);
            long j2 = f.b().getLong("last_dpcity", -1L);
            long j3 = f.b().getLong("last_mtcity", -1L);
            float parseFloat = Float.parseFloat(f.b().getString("last_accu", "0"));
            MtLocation mtLocation = new MtLocation(GearsLocator.GEARS_PROVIDER);
            mtLocation.setAccuracy(parseFloat);
            mtLocation.setLatitude(parseDouble);
            mtLocation.setLongitude(parseDouble2);
            mtLocation.setTime(j);
            Bundle bundle = new Bundle();
            bundle.putLong(GearsLocator.MT_CITY_ID, j3);
            bundle.putLong(GearsLocator.DP_CITY_ID, j2);
            bundle.putString(GearsLocator.DP_NAME, f.b().getString("last_dpname", ""));
            mtLocation.setExtras(bundle);
            if (LocationUtils.isValidLatLon(mtLocation)) {
                return mtLocation;
            }
            return null;
        } catch (Exception e) {
            LogUtils.a(getClass(), e);
            return null;
        }
    }

    public int getRequestCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30434b273460e7b12a85b5ca97d91ae5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30434b273460e7b12a85b5ca97d91ae5")).intValue() : this.m.get();
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onCollectConfigChange() {
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onLocateConfigChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "522c8fdaff58d79a97e32ebb83115832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "522c8fdaff58d79a97e32ebb83115832");
            return;
        }
        SharedPreferences b = f.b();
        if (b != null) {
            long j = b.getLong("past_time", PayTask.j);
            LogUtils.a("MasterLocatorImpl pastTimeFromConfig:" + j);
            this.e.a(j);
            long j2 = b.getLong("network_wait_time", 15000L);
            LogUtils.a("MasterLocatorImpl networkWaitTime:" + this.j + " networkWaitTimeFromConfig:" + j2);
            if (j2 != this.j) {
                this.j = j2;
                LogUtils.a("MasterLocatorImpl networkWaitTime after change" + this.j);
            }
        }
    }

    @Override // com.meituan.android.common.locate.Locator.LocationListener
    public void onLocationGot(Location location) {
    }

    @Override // com.meituan.android.common.locate.Locator.LocationListener
    public void onLocationGot(MtLocation mtLocation) {
        h a;
        String str;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "882a94f2a9d361ceb50e92439f4b914d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "882a94f2a9d361ceb50e92439f4b914d");
            return;
        }
        LogUtils.a("MasterLocatorImpl onLocationGot");
        if (mtLocation != null) {
            if ("mars".equals(mtLocation.getProvider())) {
                a = h.a();
                str = "master_receive_gps";
            } else if (GearsLocator.GEARS_PROVIDER.equals(mtLocation.getProvider())) {
                a = h.a();
                str = "master_receive_gears";
            }
            a.a(str, "", mtLocation, 0L);
        }
        realstatusCode = mtLocation.getStatusCode();
        if (this.c.isEmpty()) {
            LogUtils.a("MasterLocatorImpl activeListeners is empty");
            return;
        }
        b(mtLocation);
        a(mtLocation);
        this.e.a(mtLocation);
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onTrackConfigChange() {
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    @Deprecated
    public void removeListener(LocationInfo.LocationInfoListener locationInfoListener) {
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    @Deprecated
    public void removeListener(final MtLocationInfo.MtLocationInfoListener mtLocationInfoListener) {
        Object[] objArr = {mtLocationInfoListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5939c354e8d94b0374fbb8c4f4b42d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5939c354e8d94b0374fbb8c4f4b42d38");
        } else {
            FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "49ae83513fac419c9a498530f893f42c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "49ae83513fac419c9a498530f893f42c");
                        return;
                    }
                    if (MasterLocatorImpl.this.c.remove(mtLocationInfoListener)) {
                        MasterLocatorImpl.this.m.getAndDecrement();
                        MasterLocatorImpl.this.b(mtLocationInfoListener);
                    }
                    MasterLocatorImpl.this.d.remove(mtLocationInfoListener);
                    if (LogUtils.a()) {
                        LogUtils.a("removeListener" + mtLocationInfoListener.getClass().getSimpleName());
                        LogUtils.a("removeMtListener. active " + MasterLocatorImpl.this.c.size() + " passive " + MasterLocatorImpl.this.d.size());
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    @Deprecated
    public void setEnable(boolean z) {
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    @Deprecated
    public void setGpsInfo(final long j, final float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9bf4bb5cd3c9aeedcd36a0e212bc9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9bf4bb5cd3c9aeedcd36a0e212bc9e1");
        } else {
            FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1b91c5b412ccf7dc5d37cac59537b467", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1b91c5b412ccf7dc5d37cac59537b467");
                        return;
                    }
                    Iterator it = MasterLocatorImpl.this.b.iterator();
                    while (it.hasNext()) {
                        Locator locator = (Locator) it.next();
                        locator.setGpsMinTime(j);
                        locator.setGpsMinDistance(f);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    @Deprecated
    public void setLocation(Location location) {
    }

    @Override // com.meituan.android.common.locate.MasterLocator
    public void setMtLocation(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60a82d7c0bed56caf9a2e92e639f8781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60a82d7c0bed56caf9a2e92e639f8781");
        } else {
            this.e.b(mtLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b76bc74d250851ff22bb9ef4fc7e8214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b76bc74d250851ff22bb9ef4fc7e8214");
            return;
        }
        k a = new k().a(30000L);
        a.b = new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorImpl.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            @SuppressLint({"MissingPermission"})
            public void run() {
                SharedPreferences b;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f99a1dad94f2708faa4ce397761fbfc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f99a1dad94f2708faa4ce397761fbfc3");
                    return;
                }
                if (SystemClock.elapsedRealtime() - MasterLocatorImpl.this.a > 30000 && (b = f.b()) != null) {
                    long j = b.getLong("past_time", PayTask.j);
                    LogUtils.a("MasterLocatorImpl pastTimeFromConfig:" + j);
                    long j2 = b.getLong("last_config_update_time", 0L);
                    long j3 = b.getLong("config_update_time", 1572856372896L);
                    LogUtils.a("MasterLocatorImpl  currentProcessName: " + s.a(MasterLocatorImpl.g).c() + " --- isMainProcess: " + s.a(MasterLocatorImpl.g).a());
                    LogUtils.a("MasterLocatorImpl  initWifiPoll --- mLastConfigUpdateTime: " + j2 + " mConfigUpdateTime: " + j3);
                    if (j3 > j2) {
                        b.edit().putLong("last_config_update_time", b.getLong("config_update_time", 1572856372896L)).apply();
                        long j4 = b.getLong("last_config_update_time", 0L);
                        LogUtils.a("MasterLocatorImpl  initWifiPoll --- afterChangeLastConfigUpdateTime: " + j4);
                        List<f.a> a2 = f.a();
                        if (a2 != null && a2.size() > 0) {
                            for (f.a aVar : a2) {
                                aVar.onLocateConfigChange();
                                aVar.onCollectConfigChange();
                                aVar.onTrackConfigChange();
                            }
                        }
                    }
                }
                MasterLocatorImpl.this.a = SystemClock.elapsedRealtime();
            }
        };
        this.i = a;
        this.i.b();
    }
}
