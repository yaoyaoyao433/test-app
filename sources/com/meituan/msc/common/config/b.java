package com.meituan.msc.common.config;

import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.msc.common.utils.h;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static a b = new a();

    public static /* synthetic */ void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c269e794f880b0a22ec4e30a7c3c144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c269e794f880b0a22ec4e30a7c3c144");
            return;
        }
        try {
            a aVar = (a) h.b.fromJson(str, (Class<Object>) a.class);
            if (aVar != null) {
                b = aVar;
            }
            M().edit().putString("msc_horn_common_config", str).apply();
        } catch (Exception e) {
            g.a("exception when parsing mmpConfig: " + str, e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("white_screen_detection_timeout")
        private int A;
        @SerializedName("enableRenderCache")
        private boolean B;
        @SerializedName("enableShark")
        private boolean C;
        @SerializedName("enableMemoryReport")
        private boolean D;
        @SerializedName("enableNativeHeapReport")
        private boolean E;
        @SerializedName("enableMultiProcess")
        private boolean F;
        @SerializedName("multiProcessBlackList")
        @Nullable
        private List<String> G;
        @SerializedName("multiProcessWhiteList")
        @Nullable
        private List<String> H;
        @SerializedName("enableMtWebView")
        private boolean I;
        @SerializedName("mtWebViewBlackList")
        @Nullable
        private List<String> J;
        @SerializedName("mtWebViewWhiteList")
        @Nullable
        private List<String> K;
        @SerializedName("enableMtWebViewOnlyPrepared")
        private boolean L;
        @SerializedName("nonsupportSchemaList")
        @Nullable
        private List<String> M;
        @SerializedName("supportSchemaList")
        @Nullable
        private List<String> N;
        @SerializedName("need_reset_activity_theme_brands")
        @Nullable
        private List<String> O;
        @SerializedName("enable_request_location_permission_limit")
        private int P;
        @SerializedName("downloaderType")
        private int Q;
        @SerializedName("engineMemoryExceedThreshold")
        private int R;
        @SerializedName("enable_engine_release_on_memory_exceed")
        private boolean S;
        @SerializedName("should_reload_engine_after_memory_exceed")
        private boolean T;
        @SerializedName("startLoadPageOnActivityCreate")
        private boolean U;
        @SerializedName("enable_get_v8_js_mem_usage")
        private boolean V;
        @SerializedName("enable_http_dns")
        private boolean W;
        @SerializedName("webViewPoolSize")
        private int X;
        @SerializedName("webViewResourceLimit")
        private int Y;
        @SerializedName("enableWebViewRecycle")
        private boolean Z;
        @SerializedName("enableSameLayerAndroid")
        private boolean aa;
        @SerializedName("shouldQuitKeepAliveAppWhenLogout")
        private boolean ab;
        @SerializedName("enablePrefetch")
        private boolean ac;
        @SerializedName("shouldDestoryEngineOnTrimMemory")
        private boolean ad;
        @SerializedName("enableRenderCacheTemplate")
        public boolean b;
        @SerializedName("enableCompileTimeRenderTemplate")
        public boolean c;
        @SerializedName("keep_alive_time")
        public long d;
        @SerializedName("enableRequestPermissionLimit")
        public boolean e;
        @SerializedName("requestPermissionLimitWhiteList")
        public List<String> f;
        @SerializedName("maxRequestPermissionLimitTimes")
        public int g;
        @SerializedName("requestPermissionLimitTimeIntervalMillis")
        public long h;
        @SerializedName("checkupdateBeforeRuntimeInit")
        public boolean i;
        @SerializedName("disablePreSetupRuntime")
        public boolean j;
        @SerializedName("enableFfpWhiteScreen")
        public boolean k;
        @SerializedName("disableRemoveAndroidViewHierarchyState")
        public boolean l;
        @SerializedName("needWaitForPageFinished")
        public boolean m;
        @SerializedName("enableSendMsgBeforeFirstRender")
        public boolean n;
        @SerializedName("bizTagsForAppIdMaxCount")
        public int o;
        @SerializedName("bizTagsForPageMaxCount")
        public int p;
        @SerializedName("bizTagContentMaxLength")
        public int q;
        @SerializedName("enable_batch_check_update")
        private boolean r;
        @SerializedName("batchCheckUpdateTimeInterval")
        private long s;
        @SerializedName("basePackageCheckUpdateTimeInterval")
        private long t;
        @SerializedName("batchUpdateRecentAppMaxSize")
        private int u;
        @SerializedName("aliveLaunchBackgroundCheckUpdateTimeInterval")
        private long v;
        @SerializedName("enable_cat_report")
        private boolean w;
        @SerializedName("enable_babel_report")
        private boolean x;
        @SerializedName("enable_white_screen")
        private boolean y;
        @SerializedName("checkWhiteScreenBlackList")
        private List<String> z;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b019590542f8b6378cd78fca0b2b18e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b019590542f8b6378cd78fca0b2b18e");
                return;
            }
            this.r = true;
            this.s = 600L;
            this.t = 600L;
            this.u = 10;
            this.v = 300L;
            this.w = false;
            this.x = true;
            this.y = false;
            this.A = 5;
            this.B = true;
            this.b = true;
            this.c = false;
            this.d = 300L;
            this.C = true;
            this.D = false;
            this.E = false;
            this.F = false;
            this.I = false;
            this.L = true;
            this.P = 0;
            this.Q = 0;
            this.R = 300;
            this.S = true;
            this.T = true;
            this.U = true;
            this.V = false;
            this.W = false;
            this.X = 5;
            this.Y = 5;
            this.Z = false;
            this.aa = true;
            this.ab = true;
            this.ac = false;
            this.ad = true;
            this.e = true;
            this.g = -1;
            this.h = 1000L;
            this.i = true;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = true;
            this.n = true;
            this.o = 5;
            this.p = 5;
            this.q = 100;
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcaa5b411e9a4dea45bd1dd7786f9010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcaa5b411e9a4dea45bd1dd7786f9010");
            return;
        }
        String string = M().getString("msc_horn_common_config", null);
        if (string != null) {
            try {
                b = (a) h.a(string, a.class);
            } catch (Exception e) {
                g.a("exception when parsing MMPConfig: " + string, e);
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7ace11a7c9e1a45c84817d0ac23d799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7ace11a7c9e1a45c84817d0ac23d799");
            return;
        }
        HashMap a2 = t.a("deviceLevel", Integer.valueOf(DeviceUtil.getDeviceLevel(MSCEnvHelper.getContext()).getValue()), "cityId", Long.valueOf(com.meituan.android.singleton.a.a().b()), "deviceScore", Double.valueOf(DeviceUtil.getDeviceScore(MSCEnvHelper.getContext())));
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                a2.put("manufacturer", str);
            }
        } catch (Throwable unused) {
        }
        Horn.register("msc_config", new HornCallback() { // from class: com.meituan.msc.common.config.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d8dc79aa490c4c303a779b4784b66d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d8dc79aa490c4c303a779b4784b66d6");
                } else if (!z || TextUtils.isEmpty(str2)) {
                } else {
                    b.e(str2);
                }
            }
        }, a2);
    }

    private static SharedPreferences M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bedc47be4cc7302c0e0b57e05346f872", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bedc47be4cc7302c0e0b57e05346f872") : MSCEnvHelper.getSharedPreferences("msc_horn_common_config");
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cdaace57a704c5f92b60814d973f18a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cdaace57a704c5f92b60814d973f18a")).intValue() : b.A;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8eeecc996f77c1fd513f94a700e3fae8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8eeecc996f77c1fd513f94a700e3fae8")).booleanValue() : b.y && (b.z == null || !b.z.contains(str));
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6fca5ba090e0b14425f3391b7eeb1b5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6fca5ba090e0b14425f3391b7eeb1b5")).booleanValue() : b.C;
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad1180aef0a8684ec51d514eb0aec88c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad1180aef0a8684ec51d514eb0aec88c")).booleanValue() : b.B;
    }

    public static boolean e() {
        return b.b;
    }

    public static boolean f() {
        return b.c;
    }

    public static int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89030a151f539c1086d90caabb331034", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89030a151f539c1086d90caabb331034")).intValue() : b.Q;
    }

    public static long h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "384f062764df4d37a0f559eef527d767", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "384f062764df4d37a0f559eef527d767")).longValue();
        }
        if (DebugHelper.m != null) {
            g.b("MMPConfig", "use debug keep alive time: ", DebugHelper.m);
            return DebugHelper.m.longValue();
        }
        return b.d * 1000;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c7114960eb9d40dbf9a5de756028210", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c7114960eb9d40dbf9a5de756028210")).booleanValue();
        }
        if (DebugHelper.o != null) {
            return DebugHelper.o.booleanValue();
        }
        return b.I ? b.J == null || !b.J.contains(str) : b.K != null && b.K.contains(str);
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75d3598eedec289f098070009d4eb4cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75d3598eedec289f098070009d4eb4cb")).booleanValue();
        }
        if (DebugHelper.o == null) {
            return b.I;
        }
        return DebugHelper.o.booleanValue();
    }

    public static boolean c(String str) {
        List<String> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d529b8d2ed867a91cba010218f0f3e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d529b8d2ed867a91cba010218f0f3e0")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (list = b.M) != null && list.size() > 0) {
            for (String str2 : list) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        List<String> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86bc3dd0bf4a97bc84a397308b2dfa00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86bc3dd0bf4a97bc84a397308b2dfa00")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (list = b.N) != null && list.size() > 0) {
            for (String str2 : list) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "107f83a35a7b6487319b2acb645620a9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "107f83a35a7b6487319b2acb645620a9")).intValue() : b.P;
    }

    public static int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "100baf9902b2ae90fc6a9d0ebf68e71d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "100baf9902b2ae90fc6a9d0ebf68e71d")).intValue() : b.X;
    }

    public static int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8148547d70a585b72b44a741b3daa869", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8148547d70a585b72b44a741b3daa869")).intValue() : b.Y;
    }

    public static boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce52dfb0e4943fc29a72ed84c8bb3f00", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce52dfb0e4943fc29a72ed84c8bb3f00")).booleanValue() : b.Z;
    }

    public static boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2b5b32a43feb7a434a72c00f3e3f16a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2b5b32a43feb7a434a72c00f3e3f16a")).booleanValue() : b.T;
    }

    public static boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87e67f05a738e562778d58179f716268", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87e67f05a738e562778d58179f716268")).booleanValue() : b.W;
    }

    public static boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ff7dee6fbc718d0d28665f8deb7821d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ff7dee6fbc718d0d28665f8deb7821d")).booleanValue() : b.L;
    }

    public static boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8f763dd64eb1036dffecc8fab6c7397", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8f763dd64eb1036dffecc8fab6c7397")).booleanValue() : b.aa;
    }

    @Nullable
    public static List<String> r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5afc2887f6149608961d9bd25fdcc6d8", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5afc2887f6149608961d9bd25fdcc6d8") : b.O;
    }

    public static boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "784feee1d1645fa41055adfdbcd92ebe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "784feee1d1645fa41055adfdbcd92ebe")).booleanValue() : b.ad;
    }

    public static boolean t() {
        return b.e;
    }

    @Nullable
    public static List<String> u() {
        return b.f;
    }

    public static long v() {
        return b.h;
    }

    public static boolean w() {
        return b.i;
    }

    public static int x() {
        return b.g;
    }

    public static boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "228c6fdc035892091d773df04aa14ef1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "228c6fdc035892091d773df04aa14ef1")).booleanValue() : b.r;
    }

    public static long z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cfd68c7363d4f5027a9e399aa08ee0b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cfd68c7363d4f5027a9e399aa08ee0b")).longValue();
        }
        if (b.s > 0) {
            return b.s * 1000;
        }
        return 600000L;
    }

    public static long A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba8efaee96a8b05383a8b680dd116683", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba8efaee96a8b05383a8b680dd116683")).longValue();
        }
        if (b.t > 0) {
            return b.t * 1000;
        }
        return 600000L;
    }

    public static long B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3597dd342d81f6445f755d72d141c53f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3597dd342d81f6445f755d72d141c53f")).longValue();
        }
        if (b.v > 0) {
            return b.v * 1000;
        }
        return 300000L;
    }

    public static int C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af0d1d1af867de283460401bbaa74550", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af0d1d1af867de283460401bbaa74550")).intValue();
        }
        if (b.u > 0) {
            return b.u;
        }
        return 10;
    }

    public static boolean D() {
        return !b.j;
    }

    public static boolean E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1e6148b093231084b11a36e73427a4b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1e6148b093231084b11a36e73427a4b")).booleanValue() : b.ac;
    }

    public static boolean F() {
        return b.k;
    }

    public static boolean G() {
        return b.l;
    }

    public static boolean H() {
        return b.m;
    }

    public static boolean I() {
        return b.n;
    }

    public static int J() {
        return b.o;
    }

    public static int K() {
        return b.p;
    }

    public static int L() {
        return b.q;
    }
}
