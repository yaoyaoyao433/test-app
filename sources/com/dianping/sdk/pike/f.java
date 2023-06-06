package com.dianping.sdk.pike;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.dianping.nvnetwork.Request;
import com.dianping.nvtunnelkit.conn.a;
import com.dianping.nvtunnelkit.kit.v;
import com.dianping.sdk.pike.f;
import com.dianping.sdk.pike.h;
import com.dianping.sdk.pike.i;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.cipstorage.q;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.IHorn;
import dianping.com.nvlinker.stub.IHornCallback;
import dianping.com.nvlinker.stub.IResponse;
import dianping.com.nvlinker.stub.ISharkService;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    public static String E;
    private static v I;
    private static volatile com.dianping.monitor.e K;
    private static int L;
    private static String M;
    private static h.a N;
    @SuppressLint({"StaticFieldLeak"})
    private static Context O;
    public static ChangeQuickRedirect a;
    public static boolean g;
    public static int i;
    public static String m;
    public static boolean n;
    private static final AtomicBoolean G = new AtomicBoolean(false);
    private static final AtomicBoolean H = new AtomicBoolean(false);
    private static boolean J = false;
    private static int P = KNBWebManager.ISetting.DEFAULT_TIMEOUT;
    public static boolean b = true;
    public static int c = KNBWebManager.ISetting.DEFAULT_TIMEOUT;
    private static long Q = 700;
    private static long R = 700;
    private static int S = 30;
    public static int d = 30;
    public static int e = 5;
    public static int f = 0;
    public static String h = "pikem-native.meituan.com";
    public static a j = a.Prod;
    public static String k = "10.73.250.151";
    public static String l = "10.20.104.91";
    public static boolean o = true;
    public static int p = 100;
    public static boolean q = true;
    public static boolean r = false;
    public static boolean s = true;
    private static boolean T = false;
    private static boolean U = false;
    private static boolean V = false;
    private static boolean W = false;
    private static boolean X = false;
    private static int Y = 102400;
    public static int t = 15000;
    public static int u = 15000;
    public static int v = 3;
    public static int w = 3;
    public static boolean x = true;
    public static boolean y = true;
    public static int z = 35;
    public static int A = 30000;
    public static int B = 3;
    private static boolean Z = false;
    public static boolean C = false;
    public static boolean D = true;
    private static Map<String, Boolean> aa = new ConcurrentHashMap();
    private static Map<String, c> ab = new ConcurrentHashMap();
    public static boolean F = false;

    public static /* synthetic */ void a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f84562c8bf04e3eba14d1fb1aa4893ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f84562c8bf04e3eba14d1fb1aa4893ea");
        } else if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        String optString = jSONObject.optString("bizId");
                        if (com.dianping.nvtunnelkit.utils.f.b(optString)) {
                            int optInt = jSONObject.optInt("tunnelType", 0);
                            String optString2 = jSONObject.optString("tunnelName", null);
                            if (optInt > 0 && com.dianping.nvtunnelkit.utils.f.b(optString2)) {
                                c cVar = new c();
                                cVar.b = d.a(optInt);
                                cVar.c = optString2;
                                ab.put(optString, cVar);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                i.a("PikeCoreConfig", "tunnel configs json parse error", e2);
            }
        }
    }

    public static /* synthetic */ void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6248eb799ad207c41d1a13538249ad5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6248eb799ad207c41d1a13538249ad5e");
        } else if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.startsWith("sharkpush_") && next.length() > 10) {
                    String substring = next.substring(10);
                    Object opt = jSONObject.opt(next);
                    if (opt instanceof Boolean) {
                        aa.put(substring, (Boolean) opt);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fb079ec09f855806443f2fbdeed1191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fb079ec09f855806443f2fbdeed1191");
        } else {
            I = n();
        }
    }

    public static boolean a(Context context, int i2, String str, h.a aVar) {
        String str2;
        Object[] objArr = {context, Integer.valueOf(i2), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47bc2e1ecb0b4b9cc2b9d48263445383", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47bc2e1ecb0b4b9cc2b9d48263445383")).booleanValue();
        }
        if (G.compareAndSet(false, true)) {
            N = aVar;
            Object[] objArr2 = {context, Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f248544f0954dc4cbb1882f52a1e82d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f248544f0954dc4cbb1882f52a1e82d7");
            } else {
                i.a("PikeCoreConfig", "pike init!");
                L = i2;
                Context applicationContext = context.getApplicationContext();
                O = applicationContext;
                com.dianping.nvtunnelkit.utils.c.a(applicationContext);
                if (str == null) {
                    try {
                        str2 = O.getPackageManager().getPackageInfo(O.getPackageName(), 0).versionName;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        str2 = "1.0";
                    }
                } else {
                    str2 = str;
                }
                M = str2;
                if (!NVLinker.isLinkerInit()) {
                    NVLinker.init(O, i2, "unknown", str2, new NVLinker.ILikner() { // from class: com.dianping.sdk.pike.f.1
                        public static ChangeQuickRedirect a;

                        @Override // dianping.com.nvlinker.NVLinker.ILikner
                        public final String getCityID() {
                            return "1";
                        }

                        @Override // dianping.com.nvlinker.NVLinker.ILikner
                        public final String getUnionID() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed752efff84be2560d9d8ef2c8a1f7af", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed752efff84be2560d9d8ef2c8a1f7af") : f.j();
                        }
                    });
                }
                b.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.sdk.pike.util.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d7a0dd8f6d48eb4f2aea467a4fa13cf0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d7a0dd8f6d48eb4f2aea467a4fa13cf0");
                } else if (D && com.dianping.networklog.j.a(O)) {
                    com.dianping.nvtunnelkit.core.c.a().a(new Runnable() { // from class: com.dianping.sdk.pike.util.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7bc88553658b63d67a7f5ae081e1ec25", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7bc88553658b63d67a7f5ae081e1ec25");
                                return;
                            }
                            ISharkService shark = NVLinker.getShark();
                            if (shark == null) {
                                i.a("AbTestUtils", "ab fetch -> shark is null.");
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("appId", String.valueOf(com.dianping.sdk.pike.f.h()));
                            hashMap.put("sdkVersion", "1.0.0");
                            hashMap.put("appVersion", com.dianping.sdk.pike.f.i());
                            hashMap.put("platform", "android");
                            hashMap.put("unionId", com.dianping.sdk.pike.f.j());
                            Request post = new Request.Builder().url("https://mapi.dianping.com/pike/abConfig").input(new com.dianping.nvnetwork.util.f(hashMap, "UTF-8")).addHeaders("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM).post();
                            post.l = true;
                            IResponse execSync = shark.execSync(post);
                            final String str3 = (execSync == null || !execSync.isSuccess() || execSync.result() == null) ? "" : new String(execSync.result());
                            d.a().a(new Runnable() { // from class: com.dianping.sdk.pike.util.a.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d538c42f5363fa14374fc7760e067173", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d538c42f5363fa14374fc7760e067173");
                                        return;
                                    }
                                    String str4 = str3;
                                    Object[] objArr6 = {str4};
                                    ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                    if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "20ec6508cb8a54c3cbb55383dacf1a0d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "20ec6508cb8a54c3cbb55383dacf1a0d");
                                        return;
                                    }
                                    String str5 = "";
                                    if (com.dianping.sdk.pike.f.j == f.a.Beta) {
                                        str5 = "beta/";
                                    } else if (com.dianping.sdk.pike.f.j == f.a.Stage) {
                                        str5 = "stage/";
                                    }
                                    String str6 = str5 + "ab_config";
                                    if (str4 != null) {
                                        q.a(com.dianping.sdk.pike.f.b(), "bfe_pike_ab", 1).a(str6, str4);
                                    }
                                }
                            });
                        }
                    });
                }
                if (I == null) {
                    I = n();
                }
                H.set(true);
                i.a("PikeCoreConfig", "pike init finish!");
            }
            return true;
        }
        return false;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "003950534f80c733bbc78be54b17326f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "003950534f80c733bbc78be54b17326f")).booleanValue() : G.get() && H.get();
    }

    public static Context b() {
        return O;
    }

    private static v n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf42f49fb22273db1ab93ff31d866cb9", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf42f49fb22273db1ab93ff31d866cb9");
        }
        long j2 = S * 1000;
        long j3 = (S > 1 ? S - 1 : S) * 1000;
        if (j3 < P) {
            j3 = P;
        }
        a.C0105a b2 = new a.C0105a().c(P).d(P).a(j3).b(j3);
        b2.p = X;
        b2.q = Y;
        b2.r = V;
        b2.s = W;
        com.dianping.nvtunnelkit.conn.a a2 = b2.a();
        v vVar = new v();
        vVar.b = "pike_tunnel";
        vVar.w = a2;
        v c2 = vVar.b(R).a(Q).c(j2);
        c2.h = s;
        c2.q = T;
        c2.l = 100;
        c2.r = U;
        c2.e = 1;
        c2.s = p;
        return c2;
    }

    public static v c() {
        return I;
    }

    public static void a(boolean z2) {
        J = z2;
    }

    public static boolean d() {
        return J;
    }

    public static com.dianping.monitor.e e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94b38149c5746b5b5ef79d389991ffd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.monitor.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94b38149c5746b5b5ef79d389991ffd0");
        }
        if (K == null) {
            synchronized (f.class) {
                if (K == null) {
                    K = new com.dianping.monitor.impl.a(O, L) { // from class: com.dianping.sdk.pike.f.2
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.monitor.impl.a
                        public final String getUnionid() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "888df4ba03950fa623068a5c46895466", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "888df4ba03950fa623068a5c46895466") : f.j();
                        }

                        @Override // com.dianping.monitor.impl.a, com.dianping.monitor.e
                        public final String getCommand(String str) {
                            Object[] objArr2 = {str};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e184fe123a2d3c67cac8eca8befb0dd", RobustBitConfig.DEFAULT_VALUE)) {
                                return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e184fe123a2d3c67cac8eca8befb0dd");
                            }
                            try {
                                URL url = new URL(str);
                                return url.getHost() + url.getPath();
                            } catch (Exception unused) {
                                return "";
                            }
                        }
                    };
                }
            }
        }
        return K;
    }

    public static m f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91d35d7bee22e4bc90543be449e74d88", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91d35d7bee22e4bc90543be449e74d88");
        }
        m mVar = new m(324, O);
        mVar.a("pike_appId", String.valueOf(L));
        return mVar;
    }

    public static int h() {
        return L;
    }

    public static String i() {
        return M;
    }

    public static String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "268ef4b7e4d9154075cbb5e1577b9576", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "268ef4b7e4d9154075cbb5e1577b9576") : N != null ? N.a() : "";
    }

    public static Map<String, c> k() {
        return ab;
    }

    public static String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1306245b0f0572baf0035ab4648d63e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1306245b0f0572baf0035ab4648d63e");
        }
        if (TextUtils.isEmpty(m)) {
            switch (j) {
                case Beta:
                    return k + ":8000";
                case Stage:
                    return l + ":8000";
                default:
                    return "";
            }
        }
        return m;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private static final AtomicBoolean b = new AtomicBoolean(false);
        private static IHornCallback c = new IHornCallback() { // from class: com.dianping.sdk.pike.f.b.1
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.stub.IHornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0928fe90a11491836061cacd3e4c993", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0928fe90a11491836061cacd3e4c993");
                } else if (!z || TextUtils.isEmpty(str)) {
                } else {
                    i.a("Horn", "Pike horn onChange...");
                    try {
                        b.b(str);
                    } catch (Throwable th) {
                        i.a("Horn", "horn change", th);
                    }
                }
            }
        };

        public static void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bd7f0970dd908f0185737688647b301", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bd7f0970dd908f0185737688647b301");
            } else if (!NVLinker.isLinkerInit()) {
                i.a("Horn", "initHornReadConfig -> NVLinker is not init.");
            } else if (!b.get() && b.compareAndSet(false, true)) {
                IHorn horn = NVLinker.getHorn();
                if (horn == null) {
                    i.a("Horn", "initHornReadConfig -> horn is null.");
                    return;
                }
                horn.register("pikeConfig", c);
                String accessCache = horn.accessCache("pikeConfig");
                if (!TextUtils.isEmpty(accessCache)) {
                    try {
                        b(accessCache);
                        return;
                    } catch (Throwable th) {
                        i.a("Horn", "horn ex", th);
                        return;
                    }
                }
                i.a("Horn", "initHornReadConfig -> json is null.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String str) throws Exception {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6d40569167b89f973de9424f2e2e863", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6d40569167b89f973de9424f2e2e863");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (f.g()) {
                i.a("Horn", "config: " + jSONObject);
            }
            if (jSONObject.length() == 0) {
                return;
            }
            f.D = jSONObject.optBoolean("ab_enable", true);
            JSONObject a2 = com.dianping.sdk.pike.util.a.a(jSONObject);
            int unused = f.P = a2.optInt("timeout_cip", KNBWebManager.ISetting.DEFAULT_TIMEOUT);
            f.b = a2.optBoolean("background_enable", true);
            f.c = a2.optInt("close_tunnel_wait_time", KNBWebManager.ISetting.DEFAULT_TIMEOUT);
            long unused2 = f.Q = a2.optLong("nv.waitTunnelTime", 700L);
            int unused3 = f.S = a2.optInt("heartbeat_time_interval", 30);
            long unused4 = f.R = a2.optLong("nv.waitEncryptTime", 700L);
            f.q = a2.optBoolean("global_enable", true);
            f.r = a2.optBoolean("close_tunnel", false);
            f.s = a2.optBoolean("heartbeat_empty_connection", true);
            f.z = a2.optInt("failed_message_count", 35);
            f.A = a2.optInt("failed_biz_login_interval", 30000);
            f.B = a2.optInt("heartbeat_tunnel_not_ready_count", 3);
            f.x = a2.optBoolean("logan_detail_info_enable", true);
            f.y = a2.optBoolean("logan_client_enable", true);
            f.o = a2.optBoolean("monitor_enable", true);
            f.p = a2.optInt("monitor_sampling_rate", 100);
            boolean unused5 = f.T = a2.optBoolean("use_single_thread_pool", false);
            boolean unused6 = f.U = a2.optBoolean("ping_use_send_thread", false);
            boolean unused7 = f.V = a2.optBoolean("fixed_rate_send_ping_enable", false);
            boolean unused8 = f.W = a2.optBoolean("jarvis_thread_enable", false);
            boolean unused9 = f.X = a2.optBoolean("support_loop_send", false);
            int unused10 = f.Y = a2.optInt("max_single_send_size", 102400);
            f.t = a2.optInt("client_timeout", 15000);
            f.u = a2.optInt("login_timeout", 15000);
            f.v = a2.optInt("login_retry_times", 3);
            f.d = a2.optInt("max_send_queue_size", 30);
            f.e = a2.optInt("message_window_size", 5);
            f.f = a2.optInt("max_retry_count", 0);
            f.w = a2.optInt("agg_pull_retry_times", 3);
            f.F = a2.optBoolean("binary_protocol_enable", false);
            boolean unused11 = f.Z = a2.optBoolean("cmd_all", false);
            f.a(a2);
            f.a(a2.optJSONArray("tunnel_select_control"));
            f.C = a2.optBoolean("ipv6_enable", false);
            f.k = a2.optString("debug_ip", "10.73.250.151");
            f.l = a2.optString("stage_ip", "10.20.104.91");
            f.g = a2.optBoolean("custom_dns_enable", false);
            f.h = a2.optString("custom_dns_host", "pikem-native.meituan.com");
            f.i = a2.optInt("custom_dns_refresh_interval", RemoteMessageConst.DEFAULT_TTL);
            f.m();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public d b;
        public String c;

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88bfd0e6fc4e5191393793be80c75b8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88bfd0e6fc4e5191393793be80c75b8");
            }
            return this.b.d + CommonConstant.Symbol.UNDERLINE + this.c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum d {
        DEFAULT(0),
        INDEPENDENT_TCP(1);
        
        public static ChangeQuickRedirect a;
        int d;

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cddc20a2d0616cacfbfbfcecd69f111", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cddc20a2d0616cacfbfbfcecd69f111") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0601c2cb57cc562e92374dfd47eb5bc1", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0601c2cb57cc562e92374dfd47eb5bc1") : (d[]) values().clone();
        }

        d(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561c325e6e24bc3115d52c9bda15a5c1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561c325e6e24bc3115d52c9bda15a5c1");
            } else {
                this.d = i;
            }
        }

        public static d a(int i) {
            d[] valuesCustom;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b58a1fb86d3042855df7222d1621bfc4", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b58a1fb86d3042855df7222d1621bfc4");
            }
            for (d dVar : valuesCustom()) {
                if (i == dVar.d) {
                    return dVar;
                }
            }
            return DEFAULT;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        Prod,
        Beta,
        Stage;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90047c34797ce795d47da52cb5c37cd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90047c34797ce795d47da52cb5c37cd");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82b2e3a98295df9b03d5c45f2c49a99f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82b2e3a98295df9b03d5c45f2c49a99f") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f699359719f2174b74f33a3d69aebff6", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f699359719f2174b74f33a3d69aebff6") : (a[]) values().clone();
        }
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ca6b2ccce0cb82b7017070b7f1734f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ca6b2ccce0cb82b7017070b7f1734f8")).booleanValue() : J || x;
    }
}
