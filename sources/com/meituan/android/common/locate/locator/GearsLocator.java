package com.meituan.android.common.locate.locator;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.controller.f;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.android.common.locate.model.b;
import com.meituan.android.common.locate.platform.logs.h;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.q;
import com.meituan.android.common.locate.provider.t;
import com.meituan.android.common.locate.remote.IGearsLocatorApi;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.reporter.m;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.g;
import com.meituan.android.common.locate.util.o;
import com.meituan.android.common.locate.util.s;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class GearsLocator extends AbstractLocator {
    public static final String ADDRESS = "address";
    public static final String AD_CODE = "adcode";
    public static final String CITY = "city";
    public static final String COUNTRY = "country";
    public static final String DETAIL = "detail";
    public static final String DISTRICT = "district";
    public static final String DP_CITY_ID = "cityid_dp";
    public static final String DP_NAME = "dpName";
    public static final String FROM_WHERE = "fromWhere";
    public static final String GEARS_PROVIDER = "gears";
    public static final String INDOOR = "indoors";
    public static final String INDOOR_SCORE = "indoorscore";
    public static final String INDOOR_TYPE = "indoortype";
    public static final String IS_MOCK = "ismock";
    public static final String LOC_TYPE = "loctype";
    public static final String MALL = "mall";
    public static final String MALL_FLOOR = "floor";
    public static final String MALL_ID = "id";
    public static final String MALL_ID_TYPE = "idtype";
    public static final String MALL_NAME = "name";
    public static final String MALL_TYPE = "type";
    public static final String MALL_WEIGHT = "weight";
    public static final String MT_CITY_ID = "cityid_mt";
    public static final String ORIGIN_CITY_ID = "originCityId";
    public static final String PROVINCE = "province";
    public static final String REQ_TYPE = "reqtype";
    public static final String TIME_GOT_LOCATION = "time_got_location";
    public static final String TOWN_CODE = "towncode";
    public static final String TOWN_SHIP = "township";
    private static GearsLocator a = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static long gearsStartTime = 0;
    public static boolean is2FirstRequest = false;
    public static volatile boolean isHasSendStarted = false;
    private final Handler A;
    private m b;
    private final Context c;
    private SharedPreferences d;
    private final OkHttpClient e;
    private ar f;
    private IGearsLocatorApi g;
    private final com.meituan.android.common.locate.provider.e h;
    private final t i;
    private com.meituan.android.common.locate.provider.a j;
    private com.meituan.android.common.locate.repo.response.a k;
    private com.meituan.android.common.locate.locator.trigger.c l;
    private com.meituan.android.common.locate.controller.e m;
    public q mPressureSensorProvider;
    private com.meituan.android.common.locate.cache.a n;
    private volatile boolean o;
    private volatile boolean p;
    private int q;
    private boolean r;
    private int s;
    private AtomicInteger t;
    private MtLocation u;
    private int v;
    private Handler w;
    private int x;
    private boolean y;
    private final Handler.Callback z;

    /* renamed from: com.meituan.android.common.locate.locator.GearsLocator$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends o<MtLocation> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        private int g;
        public b a = null;
        private Runnable h = null;
        public com.meituan.android.common.locate.locator.a b = null;

        public AnonymousClass1(boolean z, boolean z2, boolean z3) {
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.g = GearsLocator.this.t.addAndGet(1);
        }

        private void b(final MtLocation mtLocation) {
            Object[] objArr = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18b4f9b5587ce5ece75432b9f2b6fc15", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18b4f9b5587ce5ece75432b9f2b6fc15");
            } else if (mtLocation == null) {
            } else {
                if (this.h != null) {
                    GearsLocator.this.w.removeCallbacks(this.h);
                }
                this.h = new Runnable() { // from class: com.meituan.android.common.locate.locator.GearsLocator.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d13097f03cd56e65392a7a938c5d9dbe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d13097f03cd56e65392a7a938c5d9dbe");
                            return;
                        }
                        LogUtils.a("GearsLocator notify Valid Cached");
                        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("gears_location_hit_cache", "success"));
                        com.meituan.android.common.locate.platform.logs.c.a(mtLocation, "GearsLocatorV3 Cache", null, 2);
                        AnonymousClass1.this.a(new MtLocation(mtLocation, 0));
                        AnonymousClass1.this.h = null;
                    }
                };
                GearsLocator.this.w.postDelayed(this.h, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
        @Override // com.meituan.android.common.locate.util.o
        @android.annotation.SuppressLint({"NewApi"})
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.meituan.android.common.locate.MtLocation b(java.lang.Void... r12) {
            /*
                Method dump skipped, instructions count: 719
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.locator.GearsLocator.AnonymousClass1.b(java.lang.Void[]):com.meituan.android.common.locate.MtLocation");
        }

        @Override // com.meituan.android.common.locate.util.o
        public void a(MtLocation mtLocation) {
            Object[] objArr = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c1c50d965313e089ba689d2a053cc8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c1c50d965313e089ba689d2a053cc8c");
            } else if (GearsLocator.this.o || mtLocation != null) {
                if (LocationUtils.a(mtLocation)) {
                    try {
                        Bundle extras = mtLocation.getExtras();
                        if (extras == null) {
                            extras = new Bundle();
                            mtLocation.setExtras(extras);
                        }
                        extras.putInt(Constants.SPEED_METER_STEP, 1);
                        extras.putInt("type", 1);
                        if (TextUtils.isEmpty(extras.getString("from"))) {
                            extras.putString("from", "post");
                            extras.putLong(GearsLocator.TIME_GOT_LOCATION, System.currentTimeMillis());
                            extras.putParcelable("connectWifi", this.a.d());
                        }
                        if (this.a != null) {
                            extras.putLong("extra_wifi_age", this.a.h());
                        }
                        extras.putInt("extra_check_wifi_times", GearsLocator.this.x);
                        extras.putParcelableArrayList("wifiInfo", (ArrayList) this.a.c());
                        extras.putParcelableArrayList("cellInfo", (ArrayList) this.a.a());
                    } catch (Throwable th) {
                        LogUtils.a(getClass(), th);
                    }
                } else {
                    com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3::onPostExcete::location uncorrect ", 3);
                }
                com.meituan.android.common.locate.platform.logs.c.a(mtLocation, "gearslocatorv3", null, 2);
                h.a().a("locate_gears", "", mtLocation, 0L);
                boolean f = f.a().f();
                if (f) {
                    GearsLocator.this.a(mtLocation, this.a, this.g, f);
                }
                if (mtLocation != null) {
                    try {
                        Bundle extras2 = mtLocation.getExtras();
                        if (extras2 == null) {
                            extras2 = new Bundle();
                        }
                        if (GearsLocator.this.y) {
                            GearsLocator.this.y = false;
                            extras2.putInt("isFirstGears", 1);
                        } else {
                            extras2.putInt("isFirstGears", 0);
                        }
                        if (this.a != null) {
                            this.a.f();
                            extras2.putInt("wifinum", this.a.c().size());
                            extras2.putLong("cellage", this.a.g().longValue());
                        }
                        mtLocation.setExtras(extras2);
                    } catch (Throwable unused) {
                        LogUtils.a("GearsLocator for gears report error");
                    }
                }
                GearsLocator.this.notifyLocatorMsg(mtLocation);
                if (f) {
                    return;
                }
                GearsLocator.this.a(mtLocation, this.a, this.g, f);
            }
        }

        @Override // com.meituan.android.common.locate.util.o
        public void a(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98d2ccaa0bbf130484a38b0d7f085384", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98d2ccaa0bbf130484a38b0d7f085384");
            } else {
                com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3::onPostException:: ", 3);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int a;
        private MtLocation b;
        private List<C0214a> c;
        private List<MTCellInfo> d;

        /* renamed from: com.meituan.android.common.locate.locator.GearsLocator$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0214a {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String a;
            public String b;
            public int c;
            public int d;

            public C0214a(String str, String str2, int i, int i2) {
                this.a = str;
                this.b = str2;
                this.c = i;
                this.d = i2;
            }
        }

        public <T> a(int i, List<T> list, List<MTCellInfo> list2, Class cls) {
            Object[] objArr = {Integer.valueOf(i), list, list2, cls};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68a589de7e2287cc1e0f631118311e92", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68a589de7e2287cc1e0f631118311e92");
                return;
            }
            this.a = i;
            this.c = new ArrayList();
            if (ScanResult.class == cls && list != null) {
                for (T t : list) {
                    this.c.add(new C0214a(s.a(t), t.BSSID, t.level, t.frequency));
                }
            }
            if (C0214a.class == cls && list != null) {
                for (T t2 : list) {
                    this.c.add(new C0214a(t2.a, t2.b, t2.c, t2.d));
                }
            }
            this.d = list2;
        }

        public MtLocation a() {
            return this.b;
        }

        public void a(MtLocation mtLocation) {
            this.b = mtLocation;
        }

        public int b() {
            return this.a;
        }

        public List<C0214a> c() {
            return this.c;
        }

        public List<MTCellInfo> d() {
            return this.d;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<ScanResult> a;
        private List<MTCellInfo> b;
        private WifiInfo c;
        private String[] d;
        private boolean e;
        private long f;
        private long g;
        private long h;
        private long i;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f45be09984dea383dad595e688389c8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f45be09984dea383dad595e688389c8");
            } else {
                this.i = -1L;
            }
        }

        public List<MTCellInfo> a() {
            return this.b;
        }

        public String[] b() {
            return this.d;
        }

        public List<ScanResult> c() {
            return this.a;
        }

        public WifiInfo d() {
            return this.c;
        }

        public void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecaf9a63e0afe02cac8fd5d7825aa21c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecaf9a63e0afe02cac8fd5d7825aa21c");
                return;
            }
            long j = -1;
            for (ScanResult scanResult : this.a) {
                if (scanResult.BSSID != null && Build.VERSION.SDK_INT >= 17) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - (scanResult.timestamp / 1000);
                    if (j == -1 || elapsedRealtime < j) {
                        j = elapsedRealtime;
                    }
                }
            }
            this.h = j;
        }

        public void f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4125789736d92f40b8b3d2189f27e2f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4125789736d92f40b8b3d2189f27e2f9");
                return;
            }
            long j = -1;
            if (this.b != null && !this.b.isEmpty()) {
                long j2 = -1;
                for (MTCellInfo mTCellInfo : this.b) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - (mTCellInfo.nanoTimeStamp / 1000000);
                    if (j2 == -1 || elapsedRealtime < j2) {
                        j2 = elapsedRealtime;
                    }
                }
                j = j2;
            }
            this.i = j;
        }

        public Long g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e89bd237c858912a495be3a59f2a771", RobustBitConfig.DEFAULT_VALUE) ? (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e89bd237c858912a495be3a59f2a771") : Long.valueOf(this.i);
        }

        public long h() {
            return this.h;
        }
    }

    public GearsLocator(Context context, OkHttpClient okHttpClient, int i, int i2) {
        Object[] objArr = {context, okHttpClient, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b125d6f82bfa5ab3fbcb43d2d98ce683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b125d6f82bfa5ab3fbcb43d2d98ce683");
            return;
        }
        this.p = false;
        this.q = 0;
        this.r = false;
        this.s = 0;
        this.t = new AtomicInteger(0);
        this.u = a();
        this.v = 0;
        this.w = new Handler(FakeMainThread.getInstance().getLooper());
        this.x = 0;
        this.y = true;
        this.z = new Handler.Callback() { // from class: com.meituan.android.common.locate.locator.GearsLocator.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3c7ca8fe9aeed946364441dad270010", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3c7ca8fe9aeed946364441dad270010")).booleanValue();
                }
                if (message.what == 1) {
                    if (!GearsLocator.this.o) {
                        LogUtils.a("GearsLocator gears has stoped");
                        return true;
                    }
                    LogUtils.a("GearsLocator gears is running,received msg and start gears location");
                    GearsLocator.r(GearsLocator.this);
                    GearsLocator.this.c();
                    long[] l = com.meituan.android.common.locate.reporter.e.a(GearsLocator.this.c).l();
                    if (l != null) {
                        if (GearsLocator.this.v >= l.length) {
                            GearsLocator.this.v = 0;
                        }
                        if (l.length > GearsLocator.this.v) {
                            GearsLocator.this.A.sendEmptyMessageDelayed(1, l[GearsLocator.this.v]);
                        }
                    }
                    return true;
                }
                return false;
            }
        };
        this.A = new Handler(this.z);
        this.c = context;
        this.f = com.meituan.android.common.locate.remote.b.c();
        this.e = okHttpClient;
        this.s = i;
        this.d = com.meituan.android.common.locate.reporter.f.b();
        this.j = com.meituan.android.common.locate.provider.a.a(context);
        this.h = com.meituan.android.common.locate.provider.e.a(context);
        this.i = t.a(context);
        this.m = com.meituan.android.common.locate.controller.e.a();
        this.l = new com.meituan.android.common.locate.locator.trigger.c(context, this);
        this.n = new com.meituan.android.common.locate.cache.a(context);
        this.k = new com.meituan.android.common.locate.repo.response.a();
        com.meituan.android.common.locate.repo.request.a.a(context);
        this.mPressureSensorProvider = q.a(context);
        if (this.f != null) {
            this.g = (IGearsLocatorApi) this.f.a(IGearsLocatorApi.class);
        }
        this.n.a();
        a(this.d);
    }

    private MtLocation a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e7b5b453a6a39f229a6a58ec00d71fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e7b5b453a6a39f229a6a58ec00d71fa");
        }
        MtLocation mtLocation = new MtLocation("");
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.SPEED_METER_STEP, 1);
            bundle.putInt("type", 1);
            mtLocation.setExtras(bundle);
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
        com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3::getDefaultLocation ", 3);
        return mtLocation;
    }

    private String a(b bVar, com.meituan.android.common.locate.model.b bVar2, Bundle bundle) {
        Object[] objArr = {bVar, bVar2, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d86635ed8263a55851f469557189f336", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d86635ed8263a55851f469557189f336") : t.a(bVar.d(), bVar.c(), bVar2, bundle, 0.0d);
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "434e58b6e08ae8df533257b46e316421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "434e58b6e08ae8df533257b46e316421");
        } else if (!TextUtils.isEmpty(sharedPreferences.getString("uuid", ""))) {
            com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3:: initUUid uuid is empty ", 3);
        } else {
            try {
                String uuid = UUID.randomUUID().toString();
                LogUtils.a("uuid has been generated: " + uuid);
                sharedPreferences.edit().putString("uuid", uuid).apply();
            } catch (Exception e) {
                LogUtils.a(getClass(), e);
                notifyLocatorMsg(new MtLocation(this.u, 8));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "107e8346814c7e3c7b11f10ca121a327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "107e8346814c7e3c7b11f10ca121a327");
        } else {
            com.meituan.android.common.locate.controller.a.a(this.c, mtLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MtLocation mtLocation, b bVar) {
        Object[] objArr = {mtLocation, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cac31a7026c2f9760a0316449f039bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cac31a7026c2f9760a0316449f039bc3");
            return;
        }
        Bundle extras = mtLocation.getExtras();
        if (extras != null) {
            b.a aVar = new b.a(mtLocation.getTime(), extras.getDouble("gpslat"), extras.getDouble("gpslng"), mtLocation.getAccuracy(), extras.getString(FROM_WHERE));
            if (com.meituan.android.common.locate.reporter.t.a(this.c).d()) {
                aVar.g = a(bVar, aVar, extras);
            }
            this.m.a(aVar);
            com.meituan.android.common.locate.fusionlocation.a.a().a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MtLocation mtLocation, final b bVar, final int i, final boolean z) {
        Object[] objArr = {mtLocation, bVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdf4b6b870ab3874ef1afd0215dd6cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdf4b6b870ab3874ef1afd0215dd6cae");
        } else if (!LocationUtils.isValidLatLon(mtLocation)) {
            com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3::onMtPostExecute:: location invalide ", 3);
        } else {
            if (z) {
                a(mtLocation, bVar);
            }
            g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.locator.GearsLocator.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e1c39f5374ff7986aae91bb631f29cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e1c39f5374ff7986aae91bb631f29cb");
                        return;
                    }
                    Bundle extras = mtLocation.getExtras();
                    String string = extras != null ? extras.getString("from") : "";
                    if (!z) {
                        GearsLocator.this.a(mtLocation, bVar);
                    }
                    if ("post".equals(string)) {
                        LogUtils.a("GearsLocator is post,do add to cache:" + string);
                        List<ScanResult> c = bVar.c();
                        LogUtils.a("GearsLocator add to cache[sort]", c);
                        a aVar = new a(i, c, bVar.a(), ScanResult.class);
                        aVar.a(mtLocation);
                        GearsLocator.this.a(aVar, bVar);
                    } else {
                        LogUtils.a("GearsLocator is from db,do not add to cache:" + string);
                    }
                    GearsLocator.this.a(mtLocation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar, b bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2a32333548dd77aa41102746aec9676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2a32333548dd77aa41102746aec9676");
            return;
        }
        LogUtils.a("GearsLocator addToCache");
        this.n.a(bVar, aVar);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a64b2e3536580860f4f8444b29801772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a64b2e3536580860f4f8444b29801772");
        } else if (this.masterLocator.getInstantCount() > 0 || this.q < 5) {
            this.q++;
            a(false, z, false);
        } else {
            com.meituan.android.common.locate.platform.logs.c.a(" notifyChange strategy tryCount:" + this.q + ",instantCount:" + this.masterLocator.getInstantCount(), 3);
        }
    }

    private synchronized void a(boolean z, boolean z2, boolean z3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4062f69320716af9ee660aa5095cb92b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4062f69320716af9ee660aa5095cb92b");
            return;
        }
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_post_cnt", "trigger_post_cnt"));
        com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3::on post start isAutoLocate=" + z, 3);
        if (z) {
            com.meituan.android.common.locate.repo.request.a.a = 1;
        } else {
            com.meituan.android.common.locate.repo.request.a.a = 0;
        }
        new AnonymousClass1(z, z3, z2).c();
        LogUtils.a("GearsLocator networkType:" + LocationUtils.i(this.c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7bfc12f31c6c5df9cca314bf7621c1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7bfc12f31c6c5df9cca314bf7621c1c")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has("wifi_towers") || jSONObject.has("cell_towers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b3e8d12478f3bcfed8f741a3d9f5949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b3e8d12478f3bcfed8f741a3d9f5949");
            return;
        }
        int j = u.a(this.c).j();
        int i = 0;
        while (i < j) {
            try {
                if (t.a(this.c).h()) {
                    break;
                }
                i++;
                Thread.sleep(150L);
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a("GearsLocator:waitingForWifis: exception:" + e.getMessage(), 3);
            }
        }
        this.x = i;
        this.p = i == j;
        com.meituan.android.common.locate.platform.logs.g.a().a(i);
        com.meituan.android.common.locate.platform.logs.c.a("GearsLocator:waitingForWifis:waitingCount=" + i, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c25a713af392e0b631713f1eab8c894f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c25a713af392e0b631713f1eab8c894f");
            return;
        }
        LogUtils.a("start gears location");
        boolean j = com.meituan.android.common.locate.reporter.e.a(this.c).j();
        long elapsedRealtime = SystemClock.elapsedRealtime() - com.meituan.android.common.locate.provider.d.a().b;
        long k = com.meituan.android.common.locate.reporter.e.a(this.c).k();
        if (!j || elapsedRealtime >= k) {
            a(true);
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a("do not start gears location,isstop:" + j + ",time:" + elapsedRealtime + ",interval:" + k, 3);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3726aedbd99d9980b48d7c965e8b70d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3726aedbd99d9980b48d7c965e8b70d");
            return;
        }
        LogUtils.a("GearsLocator init gears location");
        this.v = 0;
        c();
        LogUtils.a("GearsLocator first start gears location");
        long[] l = com.meituan.android.common.locate.reporter.e.a(this.c).l();
        com.meituan.android.common.locate.platform.sniffer.report.e.a().a(l);
        com.meituan.android.common.locate.platform.sniffer.report.d.a().a(l);
        if (l == null || l.length <= 0) {
            return;
        }
        this.A.removeMessages(1);
        this.A.sendEmptyMessageDelayed(1, l[this.v]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d5a25bcf2a02c2201c164705cc92ef2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d5a25bcf2a02c2201c164705cc92ef2");
        }
        b bVar = new b();
        try {
            if (com.meituan.android.common.locate.reporter.e.a(this.c).n()) {
                bVar.b = this.h.f();
            } else {
                bVar.b = this.h.e();
                com.meituan.android.common.locate.platform.logs.c.a("prepare to post,use cell cache:false", 3);
            }
            com.meituan.android.common.locate.platform.logs.g.a().a(bVar.b);
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        try {
            if (com.meituan.android.common.locate.reporter.e.a(this.c).m()) {
                bVar.a = this.i.k();
            } else {
                bVar.a = this.i.c();
                com.meituan.android.common.locate.platform.logs.c.a("prepare to post,use wifi cache:false", 3);
            }
            com.meituan.android.common.locate.platform.logs.g.a().b(bVar.a);
            if (bVar.a.size() == 0) {
                LogUtils.a("GearsLocator requestRecord.sortedWifiScanResult.size() == 0");
            }
        } catch (Throwable th2) {
            com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3:: Throwable t = " + th2.getMessage(), 3);
            LogUtils.a(th2);
        }
        try {
            bVar.d = this.h.c();
        } catch (Throwable th3) {
            LogUtils.a(th3);
        }
        try {
            bVar.c = this.i.f();
        } catch (Throwable th4) {
            LogUtils.a(th4);
        }
        try {
            bVar.e = s.a(this.c);
        } catch (Throwable th5) {
            LogUtils.a(th5);
        }
        try {
            bVar.f = this.h.b();
        } catch (Throwable th6) {
            LogUtils.a(th6);
        }
        try {
            bVar.g = this.i.i();
        } catch (Throwable th7) {
            LogUtils.a(th7);
        }
        return bVar;
    }

    public static GearsLocator getInstance(Context context, OkHttpClient okHttpClient, int i, int i2) {
        Object[] objArr = {context, okHttpClient, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94f8e99a4d70df888dfebf7439e74c2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (GearsLocator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94f8e99a4d70df888dfebf7439e74c2c");
        }
        if (a == null) {
            synchronized (GearsLocator.class) {
                if (a == null) {
                    a = new GearsLocator(context, okHttpClient, i, i2);
                }
            }
        }
        return a;
    }

    public static /* synthetic */ int r(GearsLocator gearsLocator) {
        int i = gearsLocator.v;
        gearsLocator.v = i + 1;
        return i;
    }

    @Override // com.meituan.android.common.locate.Locator
    public void forceRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fae36989992f98f7e1423861eb9f17e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fae36989992f98f7e1423861eb9f17e4");
            return;
        }
        this.r = true;
        com.meituan.android.common.locate.platform.logs.c.a("GearsLocator::forceRequest", 3);
        try {
            this.q = 0;
            a(false, true, false);
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("gearsLocator::forceRequest Exception:" + e.getMessage(), 3);
        } finally {
            this.r = false;
        }
    }

    public void onAutoLoc() {
    }

    public synchronized void onForceRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "114c8873e7e11df9c9877fff5ba312d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "114c8873e7e11df9c9877fff5ba312d0");
            return;
        }
        if (this.p) {
            LogUtils.a(" onForceRequest ");
            a(true, true, false);
        }
    }

    public void onRequestGeo(MtLocation mtLocation) throws Exception {
        ResponseBody body;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e94e5cdac4df250f6e5a4186677310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e94e5cdac4df250f6e5a4186677310");
            return;
        }
        if (this.m == null) {
            this.m = com.meituan.android.common.locate.controller.e.a();
        }
        JSONObject jSONObject = new JSONObject();
        com.meituan.android.common.locate.repo.request.a.a(jSONObject, mtLocation);
        com.meituan.android.common.locate.repo.request.a.a(jSONObject, this.s);
        if (!jSONObject.has("location")) {
            com.meituan.android.common.locate.platform.sniffer.a.b("no location key");
            return;
        }
        String str = "";
        Object b2 = com.meituan.android.common.locate.locator.a.b(true, this.g, this.e, jSONObject);
        if (b2 != null) {
            if (b2 instanceof Response) {
                Response response = (Response) b2;
                if (response.f()) {
                    str = ((ap) response.e()).string();
                }
            } else if ((b2 instanceof okhttp3.Response) && (body = ((okhttp3.Response) b2).body()) != null) {
                str = body.string();
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        int optInt = jSONObject2.optInt("code", -1);
        JSONObject jSONObject3 = null;
        if (optInt == 200 && jSONObject2.has("data")) {
            jSONObject3 = jSONObject2.getJSONObject("data");
            com.meituan.android.common.locate.platform.sniffer.a.f();
        } else {
            com.meituan.android.common.locate.platform.sniffer.a.b("regeo code error : " + optInt);
        }
        if (this.k != null && jSONObject3 != null) {
            this.k.b(mtLocation, jSONObject3);
        }
        a(mtLocation);
    }

    public void onSignalChange() {
    }

    @Override // com.meituan.android.common.locate.locator.AbstractLocator
    public int onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fc44ec3ae71dbc6c2fc5650e17be271", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fc44ec3ae71dbc6c2fc5650e17be271")).intValue();
        }
        if (this.h == null || this.i == null || this.d == null || this.j == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.h == null ? " radioInfo" : "");
            sb.append(this.i == null ? " wifiInfo" : "");
            sb.append(this.d == null ? " sp" : "");
            sb.append(this.j == null ? " applicationInfo" : "");
            notifyLocatorMsg(new MtLocation(this.u, 8));
        }
        LogUtils.a("GearsLocator  Starting");
        if (this.o) {
            com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3 onStart is running else", 3);
        } else {
            gearsStartTime = System.currentTimeMillis();
            this.o = true;
            this.y = true;
            isHasSendStarted = false;
            is2FirstRequest = false;
            if (this.l != null) {
                this.l.a();
            }
            this.i.a();
            com.meituan.android.common.locate.platform.sniffer.report.d.a().b();
            this.mPressureSensorProvider.a();
            try {
                d();
            } catch (Throwable th) {
                com.meituan.android.common.locate.platform.logs.c.a(" onStart exception = " + th.getMessage(), 3);
                notifyLocatorMsg(new MtLocation(this.u, 8));
            }
        }
        if (this.b != null && this.c != null) {
            this.b.b(this.c);
        }
        return 1;
    }

    @Override // com.meituan.android.common.locate.locator.AbstractLocator
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5623c7118d13cd329000b31717f28ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5623c7118d13cd329000b31717f28ed8");
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3::onStop::running = " + this.o, 3);
        if (this.o) {
            this.i.b();
            is2FirstRequest = false;
            this.o = false;
            this.q = 0;
            LogUtils.a("GearsLocator tryCount is 0");
            if (this.n != null) {
                this.n.b();
            }
            com.meituan.android.common.locate.platform.sniffer.report.d.a().c();
            this.mPressureSensorProvider.b();
            this.l.b();
        } else {
            com.meituan.android.common.locate.platform.logs.c.a(" GearsLocatorV3::onStop::running else ", 3);
        }
        if (this.A != null) {
            this.A.removeMessages(1);
        }
        if (!k.a().s || this.b == null) {
            return;
        }
        this.b.c(this.c);
    }

    public void setLocationInfoReporter(m mVar) {
        String str;
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3d7fbbfaea62816bb82ea6daad49db7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3d7fbbfaea62816bb82ea6daad49db7");
            return;
        }
        boolean a2 = com.meituan.android.common.locate.provider.s.a(this.c).a();
        if (a2 && !k.a().b) {
            str = "isMainProcess && Collection switch is close";
        } else if (a2 || k.a().c) {
            this.b = mVar;
            return;
        } else {
            str = "is not MainProcess && Collection switch is close";
        }
        com.meituan.android.common.locate.platform.logs.c.a(str, 3);
    }
}
