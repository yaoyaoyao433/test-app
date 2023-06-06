package com.meituan.android.common.locate.platform.logs;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v4.content.Loader;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Loader<?> a;
    private final String b;
    private final Handler c;

    /* renamed from: com.meituan.android.common.locate.platform.logs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0217a extends e implements f.a {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean a;
        private final Map<Loader<?>, b> d;

        /* renamed from: com.meituan.android.common.locate.platform.logs.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0218a {
            private static final C0217a a = new C0217a();
            public static ChangeQuickRedirect changeQuickRedirect;
        }

        public C0217a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7536bcec7354a9fca6722978a4ef50b7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7536bcec7354a9fca6722978a4ef50b7");
                return;
            }
            this.d = new HashMap();
            com.meituan.android.common.locate.reporter.f.a(this);
            onLocateConfigChange();
        }

        public static C0217a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "458a077f5a26cdcb90a8422cb7de656d", RobustBitConfig.DEFAULT_VALUE) ? (C0217a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "458a077f5a26cdcb90a8422cb7de656d") : C0218a.a;
        }

        public final synchronized void a(Loader<?> loader) {
            b bVar;
            Object[] objArr = {loader};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b85708d3d3ebbb0966311381716245c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b85708d3d3ebbb0966311381716245c9");
                return;
            }
            if (this.d.containsKey(loader)) {
                bVar = this.d.get(loader);
                bVar.a = SystemClock.elapsedRealtime();
                bVar.c = false;
            } else {
                b bVar2 = new b(SystemClock.elapsedRealtime(), 0L, false);
                this.d.put(loader, bVar2);
                bVar = bVar2;
            }
            bVar.a("start");
        }

        public final synchronized void a(Loader<?> loader, MtLocation mtLocation, String str) {
            boolean z = false;
            Object[] objArr = {loader, mtLocation, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67451942d59b6b4b8b4f367492f4cc35", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67451942d59b6b4b8b4f367492f4cc35");
                return;
            }
            if (this.d.containsKey(loader)) {
                b bVar = this.d.get(loader);
                if (bVar.c) {
                    return;
                }
                if ((bVar.a > bVar.b && bVar.b != 0) || (bVar.b == 0 && this.d.size() > 1)) {
                    z = true;
                }
                if (z) {
                    try {
                        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                        super.a(concurrentHashMap);
                        concurrentHashMap.put("bussiness_id", "biz_bike");
                        concurrentHashMap.put("type", "bike_stop");
                        concurrentHashMap.put("sdk_provider", str);
                        concurrentHashMap.put("provider", mtLocation.getProvider());
                        if (!d()) {
                            concurrentHashMap.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(mtLocation.getLongitude()));
                            concurrentHashMap.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(mtLocation.getLatitude()));
                        }
                        concurrentHashMap.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, String.valueOf(mtLocation.getAccuracy()));
                        concurrentHashMap.put("current_time", String.valueOf(System.currentTimeMillis()));
                        concurrentHashMap.put("location_get_time", String.valueOf(mtLocation.getTime()));
                        concurrentHashMap.put("cost_ms", String.valueOf(SystemClock.elapsedRealtime() - bVar.a));
                        com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                        LogUtils.a("BizBikeStopTest report # 屏蔽后第一次吐点上报");
                    } catch (Exception e) {
                        c.a("BizBikeStopTest::exception" + e.getMessage(), 3);
                    }
                    bVar.c = true;
                }
            }
        }

        public final synchronized void b(Loader<?> loader) {
            Object[] objArr = {loader};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66fb584b3399fc3fd10c4f9a0392a868", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66fb584b3399fc3fd10c4f9a0392a868");
                return;
            }
            if (this.d.containsKey(loader)) {
                b bVar = this.d.get(loader);
                bVar.b = SystemClock.elapsedRealtime();
                bVar.a("stopDelayBefore");
            }
        }

        public final synchronized void c(Loader<?> loader) {
            Object[] objArr = {loader};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e739f71f38e3f00b3378d67e0ca1b43", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e739f71f38e3f00b3378d67e0ca1b43");
            } else {
                this.d.remove(loader);
            }
        }

        @Override // com.meituan.android.common.locate.reporter.f.a
        public final void onCollectConfigChange() {
        }

        @Override // com.meituan.android.common.locate.reporter.f.a
        public final void onLocateConfigChange() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fa1aefb379b43f785cb94377128b058", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fa1aefb379b43f785cb94377128b058");
                return;
            }
            SharedPreferences b = com.meituan.android.common.locate.reporter.f.b();
            if (b != null) {
                this.a = b.getBoolean("bike_stop_delay_switch", false);
                LogUtils.a("BizBikeStopTest 骑行延迟stop开关状态 : " + this.a);
                c.a("BizBikeStopTest 骑行延迟stop开关状态 : " + this.a, 3);
                com.meituan.android.common.locate.platform.sniffer.c.a("bike_stop_delay_switch", this.a);
            }
        }

        @Override // com.meituan.android.common.locate.reporter.f.a
        public final void onTrackConfigChange() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long a;
        public long b;
        public boolean c;

        public b(long j, long j2, boolean z) {
            Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15885601de4e674573e0933db431d0ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15885601de4e674573e0933db431d0ff");
                return;
            }
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3703f64e797dc096b1e89887be9cb6ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3703f64e797dc096b1e89887be9cb6ac");
                return;
            }
            LogUtils.a("BizBikeStopTest " + str + " -> " + toString());
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9f174f4bbf7d68af684fb140ebca2a2", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9f174f4bbf7d68af684fb140ebca2a2");
            }
            return " LoaderInstanceRecord{hashCode = " + hashCode() + ", startTimeMS=" + this.a + ", delayBeforeTimeMs=" + this.b + ", isFirstReported=" + this.c + '}';
        }
    }

    public a(Loader<?> loader, String str) {
        Object[] objArr = {loader, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f77299324a1728e2dde3ca572a24ea40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f77299324a1728e2dde3ca572a24ea40");
            return;
        }
        this.c = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.meituan.android.common.locate.platform.logs.a.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler.Callback
            public boolean handleMessage(@NonNull Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8f386a7d516e5d3e0a92569be3f8f286", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8f386a7d516e5d3e0a92569be3f8f286")).booleanValue();
                }
                if (message.what == 10001 && (message.obj instanceof Runnable)) {
                    ((Runnable) message.obj).run();
                    C0217a.a().c(a.this.a);
                    LogUtils.a("BizBikeStopTest 延迟后执行stop");
                }
                return true;
            }
        });
        this.a = loader;
        this.b = str;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "025c82ffe5bb879e46ec316ad0561c20", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "025c82ffe5bb879e46ec316ad0561c20")).booleanValue() : C0217a.a().a && "biz_bike".equals(str);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a0384434f92ce9f4ea36439f13a9dd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a0384434f92ce9f4ea36439f13a9dd9");
        } else if (b(str)) {
            LogUtils.a("BizBikeStopTest onStart");
            if (this.c.hasMessages(10001)) {
                this.c.removeMessages(10001);
                LogUtils.a("BizBikeStopTest onStart # 延迟stop后再次start");
            }
            C0217a.a().a(this.a);
        }
    }

    public final synchronized void a(String str, Loader<?> loader, MtLocation mtLocation) {
        Object[] objArr = {str, loader, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e68f55468ffb00c26c0492c82f5b6c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e68f55468ffb00c26c0492c82f5b6c2");
        } else if (b(str)) {
            C0217a.a().a(loader, mtLocation, this.b);
        }
    }

    public final void a(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b18480d070ab01925b72091f829ed2c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b18480d070ab01925b72091f829ed2c6");
        } else if (!b(str)) {
            runnable.run();
            LogUtils.a("BizBikeStopTest onStop # 正常stop");
        } else if (this.c.hasMessages(10001)) {
        } else {
            Message obtainMessage = this.c.obtainMessage();
            obtainMessage.what = 10001;
            obtainMessage.obj = runnable;
            this.c.sendMessageDelayed(obtainMessage, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            C0217a.a().b(this.a);
        }
    }
}
