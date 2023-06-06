package com.meituan.android.common.locate.locator.trigger;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.controller.e;
import com.meituan.android.common.locate.locator.SystemLocator;
import com.meituan.android.common.locate.locator.trigger.b;
import com.meituan.android.common.locate.locator.trigger.c;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.GpsInfo;
import com.meituan.android.common.locate.provider.t;
import com.meituan.android.common.locate.reporter.s;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a implements com.meituan.android.common.locate.locator.b, b, b.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public com.meituan.android.common.locate.geo.a a;
    private c.a b;
    private Location c;
    private long d;
    private t e;
    private e f;
    private HandlerC0215a g;
    private long h;
    private long i;
    private long j;
    private long k;

    /* renamed from: com.meituan.android.common.locate.locator.trigger.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class HandlerC0215a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        public HandlerC0215a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af1da005009a19efff84ee1c35ad3ab7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af1da005009a19efff84ee1c35ad3ab7");
            } else {
                super.handleMessage(message);
            }
        }
    }

    public a(@NonNull c.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70f5754139b086bde1155be53cceb957", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70f5754139b086bde1155be53cceb957");
            return;
        }
        this.c = null;
        this.d = 0L;
        this.g = new HandlerC0215a();
        this.a = new com.meituan.android.common.locate.geo.a() { // from class: com.meituan.android.common.locate.locator.trigger.a.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.geo.a
            public void a(MtLocation mtLocation) throws Exception {
                Object[] objArr2 = {mtLocation};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a367912e5b842122ab095c38b4412977", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a367912e5b842122ab095c38b4412977");
                    return;
                }
                a.this.b.a(mtLocation);
                LogUtils.a("GpsChangeTrigger geohash search geoinfo failed, request geo from service");
            }
        };
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.b = aVar;
        this.e = t.a(context);
        this.f = e.a();
        this.f.a(this);
        SystemLocator.setGeoListener(this.a);
    }

    @Override // com.meituan.android.common.locate.locator.b
    public void a() {
    }

    @Override // com.meituan.android.common.locate.locator.b
    public void a(final Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fb7b0c83eae0a68dab794edc8e8e330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fb7b0c83eae0a68dab794edc8e8e330");
        } else if (SystemClock.elapsedRealtime() - this.i < s.a().g) {
        } else {
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "GpsChangeTrigger_onGpsResultGot"));
            this.i = SystemClock.elapsedRealtime();
            this.g.post(new Runnable() { // from class: com.meituan.android.common.locate.locator.trigger.a.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "73dc94b3551f4e4a4b345a91a0fa3eec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "73dc94b3551f4e4a4b345a91a0fa3eec");
                        return;
                    }
                    try {
                        float[] fArr = new float[1];
                        if (a.this.c != null && SystemClock.elapsedRealtime() - a.this.d > 10000 && SystemClock.elapsedRealtime() - a.this.e.p() > 30000) {
                            Location.distanceBetween(a.this.c.getLatitude(), a.this.c.getLongitude(), location.getLatitude(), location.getLongitude(), fArr);
                            if (fArr[0] > 15.0f) {
                                LogUtils.a("GpsChangeTrigger onGpsResultGot notifyChange");
                                a.this.b.b();
                                a.this.d = SystemClock.elapsedRealtime();
                            }
                        }
                    } catch (Exception e) {
                        LogUtils.a("GpsChangeTrigger onGpsResultGot exception: " + e.getMessage());
                    }
                    a.this.c = location;
                }
            });
        }
    }

    @Override // com.meituan.android.common.locate.locator.b
    public void a(final GpsInfo gpsInfo) {
        Object[] objArr = {gpsInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75bd9649451e1b4b0ed2ab63b9056f24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75bd9649451e1b4b0ed2ab63b9056f24");
        } else if (SystemClock.elapsedRealtime() - this.j < s.a().f) {
        } else {
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "GpsChangeTrigger_onGpsInfoRefresh"));
            this.j = SystemClock.elapsedRealtime();
            this.g.post(new Runnable() { // from class: com.meituan.android.common.locate.locator.trigger.a.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fab98d849e84d57b22e75c64d9b48582", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fab98d849e84d57b22e75c64d9b48582");
                    } else if (gpsInfo.available > 3 || a.this.c == null || SystemClock.elapsedRealtime() - a.this.d < PayTask.j) {
                    } else {
                        LogUtils.a("GpsChangeTrigger GearsLocator onGpsInfoRefresh post immediately");
                        a.this.d = SystemClock.elapsedRealtime();
                        a.this.c = null;
                        a.this.b.b();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.locate.locator.b
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e15069456bf47ef8fbc5e14b45ad8b06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e15069456bf47ef8fbc5e14b45ad8b06");
        } else if (SystemClock.elapsedRealtime() - this.h < s.a().e) {
        } else {
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "GpsChangeTrigger_onGpsDisable"));
            this.h = SystemClock.elapsedRealtime();
            this.g.post(new Runnable() { // from class: com.meituan.android.common.locate.locator.trigger.a.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c7e67248d636868264b92ffa8e93113a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c7e67248d636868264b92ffa8e93113a");
                    } else if (a.this.c == null) {
                    } else {
                        LogUtils.a("GpsChangeTrigger GearsLocator onGpsDisable notifyChange");
                        a.this.b.b();
                        a.this.d = SystemClock.elapsedRealtime();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.locate.locator.trigger.b
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbd77bdce7b11280a77f055792cbfb1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbd77bdce7b11280a77f055792cbfb1e");
        } else {
            SystemLocator.registerGpsStateListener(this);
        }
    }

    @Override // com.meituan.android.common.locate.locator.trigger.b
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "203394a6377ce7ac9f9fc1bb4d7fc26a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "203394a6377ce7ac9f9fc1bb4d7fc26a");
            return;
        }
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "GpsChangeTrigger_onStop"));
        this.b.c();
        SystemLocator.removeGpsStateListener(this);
    }

    @Override // com.meituan.android.common.locate.locator.trigger.b.a
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d00b978d442c1964b592ebe3cab25e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d00b978d442c1964b592ebe3cab25e1");
        } else if (SystemClock.elapsedRealtime() - this.k < s.a().d) {
        } else {
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "GpsChangeTrigger_uploadTracks"));
            this.k = SystemClock.elapsedRealtime();
            this.b.c();
        }
    }
}
