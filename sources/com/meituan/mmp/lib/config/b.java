package com.meituan.mmp.lib.config;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.engine.o;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.j;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static a b = new a();

    public static /* synthetic */ void j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b08bf8715e1c51fd5d0486205cdb75e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b08bf8715e1c51fd5d0486205cdb75e");
            return;
        }
        try {
            a aVar = (a) j.b.fromJson(str, (Class<Object>) a.class);
            if (aVar != null) {
                b = aVar;
            }
            W().edit().putString("mmp_horn_common_config", str).apply();
            e.a();
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a("exception when parsing mmpConfig: " + str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("enableShark")
        private boolean A;
        @SerializedName("enableFusion")
        private boolean B;
        @SerializedName("standardModeKeepAlive")
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
        @SerializedName("enable_dio")
        private boolean O;
        @SerializedName("disable_dio")
        @Nullable
        private List<String> P;
        @SerializedName("need_reset_activity_theme_brands")
        @Nullable
        private List<String> Q;
        @SerializedName("framework_package_limit")
        private int R;
        @SerializedName("app_package_limit")
        private int S;
        @SerializedName("enable_request_location_permission_limit")
        private int T;
        @SerializedName("downloaderType")
        private int U;
        @SerializedName("engineMemoryExceedThreshold")
        private int V;
        @SerializedName("enable_engine_release_on_memory_exceed")
        private boolean W;
        @SerializedName("should_reload_engine_after_memory_exceed")
        private boolean X;
        @SerializedName("enable_v8_gc")
        private boolean Y;
        @SerializedName("startLoadPageOnActivityCreate")
        private boolean Z;
        @SerializedName("enable_get_v8_js_mem_usage")
        private boolean aa;
        @SerializedName("enable_http_dns")
        private boolean ab;
        @SerializedName("webViewPoolSize")
        private int ac;
        @SerializedName("webViewResourceLimit")
        private int ad;
        @SerializedName("enableWebViewRecycle")
        private boolean ae;
        @SerializedName("enable_mrn_choose_location_page")
        private boolean af;
        @SerializedName("force_same_layer_tencent_map")
        private boolean ag;
        @SerializedName("enableSameLayerAndroid")
        private boolean ah;
        @SerializedName("saveRenderCacheAsObject")
        private boolean ai;
        @SerializedName("shouldQuitKeepAliveAppWhenLogout")
        private boolean aj;
        @SerializedName("enablePrefetch")
        private boolean ak;
        @SerializedName("privateApiBlacklist")
        private List<String> al;
        @SerializedName("shouldDestoryEngineOnTrimMemory")
        private boolean am;
        @SerializedName("enableHotStartCheckUpdate")
        private boolean an;
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
        @SerializedName("hotStartCheckUpdateIntervalList")
        public Map<String, Integer> i;
        @SerializedName("disableGetJsMemSizeInterval")
        public boolean j;
        @SerializedName("getJsMemSizeInterval")
        public long k;
        @SerializedName("getJsMemSizeWhiteList")
        public List<String> l;
        @SerializedName("getJsMemSizeBlackList")
        public List<String> m;
        @SerializedName("enableReportMMPRes")
        public boolean n;
        @SerializedName("mapMiniProgramNeedFgDownload")
        public boolean o;
        @SerializedName("enableFfpWhiteScreen")
        public boolean p;
        @SerializedName("disablePreSendOnPageRecycleEvent")
        public boolean q;
        @SerializedName("enableFeHornConfigFix")
        public boolean r;
        @SerializedName("disableRequestPrefetchLocationFix")
        public boolean s;
        @SerializedName("disableNotifyRenderProcessGone")
        public boolean t;
        @SerializedName("enable_cat_report")
        private boolean u;
        @SerializedName("enable_babel_report")
        private boolean v;
        @SerializedName("enable_white_screen")
        private boolean w;
        @SerializedName("checkWhiteScreenBlackList")
        private List<String> x;
        @SerializedName("white_screen_detection_timeout")
        private int y;
        @SerializedName("enableRenderCache")
        private boolean z;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b76dc9e708eb0ae4e8ad9404c3804e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b76dc9e708eb0ae4e8ad9404c3804e");
                return;
            }
            this.u = true;
            this.v = true;
            this.w = false;
            this.y = 5;
            this.z = true;
            this.b = true;
            this.c = false;
            this.d = 300L;
            this.A = true;
            this.B = true;
            this.C = true;
            this.D = false;
            this.E = false;
            this.F = false;
            this.I = false;
            this.L = true;
            this.O = false;
            this.R = 50;
            this.S = MapConstant.ANIMATION_DURATION_SHORT;
            this.T = 0;
            this.U = 0;
            this.V = 300;
            this.W = true;
            this.X = true;
            this.Y = true;
            this.Z = true;
            this.aa = false;
            this.ab = false;
            this.ac = 5;
            this.ad = 5;
            this.ae = true;
            this.af = false;
            this.ag = false;
            this.ah = true;
            this.ai = true;
            this.aj = true;
            this.ak = true;
            this.am = true;
            this.e = true;
            this.g = -1;
            this.h = 1000L;
            this.an = true;
            this.j = false;
            this.k = MetricsAnrManager.ANR_THRESHOLD;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = true;
            this.s = false;
        }
    }

    public static boolean a() {
        return b.r;
    }

    public static boolean b() {
        return !b.s;
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93e02d421b0da012e2a68e45791211ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93e02d421b0da012e2a68e45791211ae");
            return;
        }
        String string = W().getString("mmp_horn_common_config", null);
        if (string != null) {
            try {
                b = (a) j.a(string, (Class<Object>) a.class);
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a("exception when parsing MMPConfig: " + string, e);
            }
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd3237ad7e69338d73183d8b374779d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd3237ad7e69338d73183d8b374779d8");
        } else {
            Horn.register("mmp_config", new HornCallback() { // from class: com.meituan.mmp.lib.config.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1c870fd5e75653a1ce5689fd8241924", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1c870fd5e75653a1ce5689fd8241924");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    } else {
                        b.j(str);
                    }
                }
            }, v.a("deviceLevel", Integer.valueOf(DeviceUtil.getDeviceLevel(MMPEnvHelper.getContext()).getValue()), "cityId", Long.valueOf(com.meituan.android.singleton.a.a().b())));
        }
    }

    private static SharedPreferences W() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e860ab774ec43dff74e7eae2c56517ba", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e860ab774ec43dff74e7eae2c56517ba") : MMPEnvHelper.getSharedPreferences("mmp_horn_common_config");
    }

    public static int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e6f1e476a67d79f3dff54a404ad1721", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e6f1e476a67d79f3dff54a404ad1721")).intValue() : b.y;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f809087ca1d754390761b29483d48771", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f809087ca1d754390761b29483d48771")).booleanValue() : b.w && (b.x == null || !b.x.contains(str));
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9e099bb2907efe025c9fe81d8dc7708", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9e099bb2907efe025c9fe81d8dc7708")).booleanValue() : b.u;
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ddfe6b34aaae773dff56e48e5193c4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ddfe6b34aaae773dff56e48e5193c4f")).booleanValue() : b.v;
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "316b51177b6eca0eca22f8e4f242b7eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "316b51177b6eca0eca22f8e4f242b7eb")).booleanValue() : b.A;
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b84e5535bcc7fe9265266d6e955f19e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b84e5535bcc7fe9265266d6e955f19e")).booleanValue() : b.B;
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18ccb0b23b2eccb8863636d25b61d47f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18ccb0b23b2eccb8863636d25b61d47f")).booleanValue() : b.C;
    }

    public static boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74854b38ab1c0b1a65edd12e1c304f59", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74854b38ab1c0b1a65edd12e1c304f59")).booleanValue() : b.z;
    }

    public static boolean k() {
        return b.b;
    }

    public static boolean l() {
        return b.c;
    }

    public static boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5887b48a5b99c77dcbf8cc52baecb300", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5887b48a5b99c77dcbf8cc52baecb300")).booleanValue() : b.D;
    }

    public static boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecf578a7633e6dd141653aafbe3e9845", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecf578a7633e6dd141653aafbe3e9845")).booleanValue() : b.E || !MMPEnvHelper.getEnvInfo().isProdEnv();
    }

    public static int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "505b159f07900420951e4cb8f6da1e9d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "505b159f07900420951e4cb8f6da1e9d")).intValue() : b.U;
    }

    public static boolean b(String str) {
        boolean contains;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "426c70d4432d038cb6c3dffc214189f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "426c70d4432d038cb6c3dffc214189f1")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "970b1b71d94d91b05719a32d0cc049f5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "970b1b71d94d91b05719a32d0cc049f5")).booleanValue() : b.O) {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "48653d11994feeffe125cd872655b1ae", RobustBitConfig.DEFAULT_VALUE)) {
                contains = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "48653d11994feeffe125cd872655b1ae")).booleanValue();
            } else {
                List list = b.P;
                contains = list == null ? false : list.contains(str);
            }
            if (!contains) {
                return true;
            }
        }
        return false;
    }

    public static long p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b16093b043956878892d2a967884f11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b16093b043956878892d2a967884f11")).longValue();
        }
        if (DebugHelper.u != null) {
            com.meituan.mmp.lib.trace.b.b("MMPConfig", "use debug keep alive time: " + DebugHelper.u);
            return DebugHelper.u.longValue();
        }
        return b.d * 1000;
    }

    public static boolean c(String str) {
        boolean z;
        boolean contains;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb7dfa33165945dfd3003860cdd3f946", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb7dfa33165945dfd3003860cdd3f946")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bbea5670127ab676e8562db7b5aafcb7", RobustBitConfig.DEFAULT_VALUE)) {
            switch (DebugHelper.f()) {
                case 1:
                    z = true;
                    break;
                case 2:
                    z = false;
                    break;
                default:
                    z = b.F;
                    break;
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bbea5670127ab676e8562db7b5aafcb7")).booleanValue();
        }
        if (z) {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "96008c56473a994d71acf1f8a195b34a", RobustBitConfig.DEFAULT_VALUE)) {
                contains = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "96008c56473a994d71acf1f8a195b34a")).booleanValue();
            } else {
                List list = b.G;
                contains = list == null ? false : list.contains(str);
            }
            return !contains;
        }
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e98bc0a64018c5557b447549089d4d01", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e98bc0a64018c5557b447549089d4d01")).booleanValue();
        }
        if (o.b(str)) {
            com.meituan.mmp.lib.trace.b.a("MMPConfig", "isAppEnableMultiProcess not run at main thread", str);
            return false;
        }
        List list2 = b.H;
        if (list2 == null) {
            return false;
        }
        return list2.contains(str);
    }

    public static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f94d34760636cb613dc79d9b4c385cc2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f94d34760636cb613dc79d9b4c385cc2")).booleanValue();
        }
        if (DebugHelper.y != null) {
            return DebugHelper.y.booleanValue();
        }
        return b.I ? b.J == null || !b.J.contains(str) : b.K != null && b.K.contains(str);
    }

    public static boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11b2daf7cda014056c2a72ce65440576", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11b2daf7cda014056c2a72ce65440576")).booleanValue();
        }
        if (DebugHelper.y == null) {
            return b.I;
        }
        return DebugHelper.y.booleanValue();
    }

    public static boolean e(String str) {
        List<String> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d62e4f69e9489a8ea226da49f7a502ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d62e4f69e9489a8ea226da49f7a502ff")).booleanValue();
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

    public static boolean f(String str) {
        List<String> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edf899b0c2ff1274ff41a6b6a6e3e40e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edf899b0c2ff1274ff41a6b6a6e3e40e")).booleanValue();
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

    public static int r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5291638415abcafddc2e8285220c774", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5291638415abcafddc2e8285220c774")).intValue() : b.R * 1048576;
    }

    public static int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fc6c91e44e1e8acc01f54b46126f48a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fc6c91e44e1e8acc01f54b46126f48a")).intValue() : b.S * 1048576;
    }

    public static boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6e7563dc1a66140f4de3f28bc05f900", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6e7563dc1a66140f4de3f28bc05f900")).booleanValue() : b.Y;
    }

    public static boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3b82dbcebfefd02d09cc9725ba1c6c5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3b82dbcebfefd02d09cc9725ba1c6c5")).booleanValue() : b.aa;
    }

    public static int v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "044849486660046188bea0854fcbdfae", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "044849486660046188bea0854fcbdfae")).intValue() : b.ac;
    }

    public static int w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ab8c5081284f33912e3964992c04d4b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ab8c5081284f33912e3964992c04d4b")).intValue() : b.ad;
    }

    public static boolean x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48ea4c60de1e93c98ba6f345e97ce728", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48ea4c60de1e93c98ba6f345e97ce728")).booleanValue() : b.ae;
    }

    public static boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e4104555bb79ebc791cb6be68fca80a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e4104555bb79ebc791cb6be68fca80a")).booleanValue() : b.W;
    }

    public static boolean z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35c34768c27fea866e584b921c6c38f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35c34768c27fea866e584b921c6c38f9")).booleanValue() : b.X;
    }

    public static int A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b329f1cd0f772e8da3786e8f58f3a67d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b329f1cd0f772e8da3786e8f58f3a67d")).intValue() : b.V;
    }

    public static boolean B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5229892f7930d9d4a186cbeab1de2c31", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5229892f7930d9d4a186cbeab1de2c31")).booleanValue() : b.ab;
    }

    public static boolean C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3f3cd3c0c52cdcde3790191e442a760", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3f3cd3c0c52cdcde3790191e442a760")).booleanValue() : b.L;
    }

    public static boolean D() {
        return !DebugHelper.o;
    }

    public static boolean E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d434eb181ca55ec2203b3219d8555bb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d434eb181ca55ec2203b3219d8555bb")).booleanValue() : b.ah;
    }

    @Nullable
    public static List<String> F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa4b25dde0215299e516392b63fc6005", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa4b25dde0215299e516392b63fc6005") : b.Q;
    }

    public static boolean G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0fc571c994fcd13277f1eb14a4361b7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0fc571c994fcd13277f1eb14a4361b7")).booleanValue() : b.ai;
    }

    public static boolean H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcae5a4aeb562543b52bf03093b702c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcae5a4aeb562543b52bf03093b702c3")).booleanValue() : b.ak;
    }

    public static List<String> I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42d7d98355c4a3fb018489281e6fc187", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42d7d98355c4a3fb018489281e6fc187") : b.al;
    }

    public static boolean J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d170bb9272b8ecf9649a1f7f508b78b5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d170bb9272b8ecf9649a1f7f508b78b5")).booleanValue() : b.am;
    }

    public static boolean K() {
        return b.e;
    }

    @Nullable
    public static List<String> L() {
        return b.f;
    }

    public static long M() {
        return b.h;
    }

    public static int N() {
        return b.g;
    }

    public static boolean O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb6bfc6f3dd2e6e138c97dcca9ef93c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb6bfc6f3dd2e6e138c97dcca9ef93c0")).booleanValue() : b.an;
    }

    public static Integer g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db650bf1a7b77635f5613d8156956f38", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db650bf1a7b77635f5613d8156956f38");
        }
        if (b.i == null) {
            return null;
        }
        return b.i.get(str);
    }

    public static boolean P() {
        return b.j;
    }

    public static long Q() {
        return b.k;
    }

    public static boolean h(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ef36a9ec16581f4e0f71fc50132714d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ef36a9ec16581f4e0f71fc50132714d")).booleanValue();
        }
        List<String> list = b.l;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (str == null) {
            return false;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba378edc46104df0e1fb157abf474baf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba378edc46104df0e1fb157abf474baf")).booleanValue();
        }
        List<String> list = b.m;
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean R() {
        return b.n;
    }

    public static boolean S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5113a30c83cd0c67300eccc68e6f5b3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5113a30c83cd0c67300eccc68e6f5b3e")).booleanValue();
        }
        b.a.a("mmp_config", String.format("isMapMiniProgramNeedFgDownload: %b", Boolean.valueOf(b.o)));
        return b.o;
    }

    public static boolean T() {
        return b.p;
    }

    public static boolean U() {
        return b.q;
    }

    public static boolean V() {
        return b.t;
    }
}
