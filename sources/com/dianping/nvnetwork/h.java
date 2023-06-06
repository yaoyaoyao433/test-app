package com.dianping.nvnetwork;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.google.gson.JsonObject;
import com.meituan.android.legwork.bean.monitor.FuncConfigResult;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.meituan.android.knb.KNBWebManager;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.ILubanChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static volatile h br;
    boolean A;
    public boolean B;
    boolean C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public int[] L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    volatile int aA;
    public volatile boolean aB;
    volatile boolean aC;
    public volatile boolean aD;
    public volatile boolean aE;
    public volatile boolean aF;
    public volatile int aG;
    public volatile boolean aH;
    volatile Set<String> aI;
    public volatile boolean aJ;
    public volatile Set<String> aK;
    public volatile Set<String> aL;
    String aM;
    private int aN;
    private String aO;
    private List<String> aP;
    private List<String> aQ;
    private List<String> aR;
    private List<String> aS;
    private int aT;
    private int aU;
    private volatile long aV;
    private volatile boolean aW;
    private boolean aX;
    private boolean aY;
    private boolean aZ;
    public int aa;
    public int ab;
    public boolean ac;
    public int ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public int ai;
    public double aj;
    public boolean ak;
    String al;
    boolean am;
    boolean an;
    public boolean ao;
    public boolean ap;
    public volatile boolean aq;
    public volatile boolean ar;
    public volatile boolean as;
    public volatile boolean at;
    public volatile boolean au;
    public volatile boolean av;
    public volatile int aw;
    public volatile int ax;
    public int ay;
    volatile int az;
    public volatile List<String> b;
    private boolean ba;
    private volatile boolean bb;
    private boolean bc;
    private final List<a> bd;
    private a be;
    private boolean bf;
    private q bg;
    private int bh;
    private String bi;
    private boolean bj;
    private volatile int bk;
    private volatile int bl;
    private volatile boolean bm;
    private volatile int bn;
    private List<String> bo;
    private ILubanChangeListener bp;
    private String bq;
    public List<String> c;
    public Set<String> d;
    public Set<String> e;
    public Set<String> f;
    public Set<String> g;
    public Set<String> h;
    public Set<String> i;
    public Set<String> j;
    public Set<String> k;
    public Set<String> l;
    public List<String> m;
    public Set<String> n;
    public Set<String> o;
    public Set<String> p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public long v;
    public int w;
    public boolean x;
    public int y;
    public Set<String> z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void b(boolean z);
    }

    public static /* synthetic */ int a(h hVar, HashMap hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "e4899a7ff87a083ea4ed8c2ad997ef32", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "e4899a7ff87a083ea4ed8c2ad997ef32")).intValue();
        }
        if (hashMap == null || hashMap.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append((String) hashMap.get(str));
        }
        return sb.toString().getBytes().length;
    }

    public static /* synthetic */ q a(h hVar, Request request, int i) {
        Object[] objArr = {request, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "70d42ecc2aeaee66b3cc8e2b16cc49d2", 6917529027641081856L) ? (q) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "70d42ecc2aeaee66b3cc8e2b16cc49d2") : (q) rx.observables.a.a((rx.d) com.dianping.nvnetwork.fork.b.a(g.b()).a(request, i).f(new rx.functions.g<Throwable, q>() { // from class: com.dianping.nvnetwork.h.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ q call(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39654c2eac7a555748fa9e2402d43156", 6917529027641081856L) ? (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39654c2eac7a555748fa9e2402d43156") : h.this.bg;
            }
        })).a((rx.observables.a) hVar.bg);
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        hVar.aW = false;
        return false;
    }

    public static /* synthetic */ Request b(h hVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "4d98cc8593196a731d20ec7485fdfe37", 6917529027641081856L)) {
            return (Request) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "4d98cc8593196a731d20ec7485fdfe37");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", String.valueOf(g.a()));
        hashMap.put("sdkVersion", g.b);
        hashMap.put("appVersion", g.c);
        hashMap.put("platform", "android");
        hashMap.put("unionId", g.j());
        hashMap.put("device", g.d);
        hashMap.put("appSource", g.f);
        hashMap.put("platVersion", g.e);
        hashMap.put("configVersion", hVar.bi);
        if (g.h && g.g) {
            hashMap.put("ismonkeytest", "true");
        }
        String str = g.h ? "http://mapi.51ping.com/mapi/networktunnel.bin" : "https://mapi.dianping.com/mapi/networktunnel.bin";
        if (hVar.bq == null) {
            hVar.bq = "SharkSDK " + g.b + " (" + g.b().getPackageName() + StringUtil.SPACE + g.c + StringUtil.SPACE + g.d + StringUtil.SPACE + g.e + CommonConstant.Symbol.BRACKET_RIGHT;
        }
        return new Request.Builder().url(str).input(new com.dianping.nvnetwork.util.f(hashMap, "UTF-8")).addHeaders("User-Agent", hVar.bq).isFailOver(true).isPostFailOver(true).addHeaders("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM).post();
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859816e0ac7c06404634e3575f4ca45c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859816e0ac7c06404634e3575f4ca45c");
            return;
        }
        this.b = Arrays.asList("*");
        this.aN = 300;
        this.aO = "cip";
        this.q = 51200;
        this.aT = KNBWebManager.ISetting.DEFAULT_TIMEOUT;
        this.r = KNBWebManager.ISetting.DEFAULT_TIMEOUT;
        this.aU = 3000;
        this.aW = false;
        this.s = false;
        this.t = true;
        this.u = false;
        this.v = 700L;
        this.w = 700;
        this.x = false;
        this.y = 5120;
        this.z = new HashSet();
        this.aX = false;
        this.aY = false;
        this.aZ = false;
        this.ba = false;
        this.A = false;
        this.B = true;
        this.C = true;
        this.D = 6;
        this.E = 1200000;
        this.F = false;
        this.G = true;
        this.H = 3;
        this.I = 1;
        this.J = 40;
        this.K = false;
        this.L = new int[]{1, 1, 2, 5};
        this.M = 60000;
        this.bc = false;
        this.bd = new ArrayList();
        this.be = null;
        this.N = false;
        this.bf = false;
        this.O = false;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = 5;
        this.T = 5120;
        this.bj = false;
        this.ac = false;
        this.ae = true;
        this.af = false;
        this.bk = -1;
        this.ag = false;
        this.ah = false;
        this.ai = 0;
        this.al = "";
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = true;
        this.as = false;
        this.at = false;
        this.au = true;
        this.av = true;
        this.aw = 512;
        this.ax = 3;
        this.ay = 1024;
        this.az = 10;
        this.bl = 0;
        this.bm = false;
        this.aA = 0;
        this.aB = false;
        this.aC = false;
        this.aD = true;
        this.aE = false;
        this.aF = false;
        this.aG = 10000;
        this.bn = 10000;
        this.aH = false;
        this.aI = new HashSet();
        this.aJ = g.k();
        this.aK = new HashSet();
        this.aL = new HashSet();
        this.aM = "10.84.247.78";
        this.bp = new ILubanChangeListener() { // from class: com.dianping.nvnetwork.h.1
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.stub.ILubanChangeListener
            public final void onChange(String str, JsonObject jsonObject) {
                Object[] objArr2 = {str, jsonObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84553a732366dd6dbe6f4f121c32e319", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84553a732366dd6dbe6f4f121c32e319");
                } else if (!str.equals("sharkConfig") || jsonObject == null || jsonObject.isJsonNull()) {
                } else {
                    try {
                        String jsonObject2 = jsonObject.toString();
                        h.this.a(jsonObject2);
                        h.this.a(jsonObject2, "ILubanChangeListener");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        this.c = new ArrayList();
        this.c.add(".jpg");
        this.c.add(".png");
        this.c.add(MRNBundleManager.MRN_BUNDLE_SUFFIX);
        this.aQ = new ArrayList();
        this.aQ.add("mapi.dianping.com");
        this.aQ.add("mapi.meituan.com");
        SharedPreferences c = g.c();
        if (c != null) {
            String string = c.getString("networkconfig", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    a(string);
                    a(string, "NVGlobalConfig");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        q.a aVar = new q.a();
        aVar.c = -170;
        aVar.j = "inner error 01";
        this.bg = aVar.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34adefd5a5c4732ed7dc44a8eb401f2e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34adefd5a5c4732ed7dc44a8eb401f2e")).booleanValue();
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.length() == 0) {
            return false;
        }
        this.bl = jSONObject.optInt("delayInitTime", 0);
        this.ae = jSONObject.optBoolean("useNvTunnelKit", true);
        d(jSONObject.optString("enableTcpTunnelInSubProcess", null));
        this.aN = jSONObject.optInt("nt.interval", 300);
        this.aO = jSONObject.optString("nt.defaulttunnel", "cip");
        this.aP = a(jSONObject.optJSONArray("nt.preblacklist.urlscheme"));
        List<String> a2 = a(jSONObject.optJSONArray("nt.preblacklist.contenttype"));
        if (!a2.isEmpty()) {
            this.c = a2;
        }
        List<String> a3 = a(jSONObject.optJSONArray("whitehosts"));
        if (!a3.isEmpty()) {
            this.aQ = a3;
        }
        this.e = b(jSONObject.optJSONArray("specialList.cip"));
        this.d = b(jSONObject.optJSONArray("specialList.http"));
        this.b = a(jSONObject.optJSONArray("specialList.https"));
        this.f = b(jSONObject.optJSONArray("tcpOnlyList"));
        this.aR = a(jSONObject.optJSONArray("quicOnlyUrlList"));
        this.g = b(jSONObject.optJSONArray("forceFailoverList"));
        this.h = b(jSONObject.optJSONArray("forceNotFailoverList"));
        this.aS = a(jSONObject.optJSONArray("defaultHttpsList"));
        this.i = b(jSONObject.optJSONArray("refuseUrlList"));
        this.j = b(jSONObject.optJSONArray("ipv6whitelist"));
        this.k = b(jSONObject.optJSONArray("newFailoverList"));
        this.l = b(jSONObject.optJSONArray("ignoreBodySizeWhiteList"));
        this.q = jSONObject.optInt("ignoreBodySizeWhiteListMaxSize", 51200);
        this.m = a(jSONObject.optJSONArray("compress.blacklist"));
        this.n = b(jSONObject.optJSONArray("monitorForceHttpList"));
        this.o = b(jSONObject.optJSONArray("monitorTcpErrorList"));
        this.p = b(jSONObject.optJSONArray("monitorBackGroundSendList"));
        this.aT = jSONObject.optInt("timeout.cip.other", KNBWebManager.ISetting.DEFAULT_TIMEOUT);
        this.aU = jSONObject.optInt("timeout.cip.httphold.other", 2000);
        this.r = jSONObject.optInt("timeout.http.other", KNBWebManager.ISetting.DEFAULT_TIMEOUT);
        this.s = jSONObject.optBoolean("nt.isFailoverDataUpload", false);
        this.t = jSONObject.optBoolean("nt.useNewVersion", true);
        this.u = jSONObject.optBoolean("nt.isCloseEncrypt", false);
        this.v = jSONObject.optLong("nt.waitTunnelConnTime", 700L);
        this.w = jSONObject.optInt("nt.waitEncryptTunnelConnect", 700);
        this.y = jSONObject.optInt("maxbodylength", 5120);
        this.x = jSONObject.optBoolean("nt.useReceiptFailover", false);
        this.A = jSONObject.optBoolean("isColdBootGetConfig", false);
        this.B = jSONObject.optBoolean("isCloseTCPInBackground", true);
        this.C = jSONObject.optBoolean("isCloseSharkPushTunnelInBackground", true);
        this.z = b(jSONObject.optJSONArray("uploadFailoverUrls"));
        this.aZ = jSONObject.optBoolean("closeTcpTunnel", false);
        b(this.aZ);
        this.ba = jSONObject.optBoolean("closeSharkPushTunnel", false);
        c(this.ba);
        this.D = jSONObject.optInt("ackTimeoutTimes", 6);
        this.E = jSONObject.optInt("ipIsolateTime", 1200) * 1000;
        this.F = jSONObject.optBoolean("useSmartRoutingLogic", false);
        this.N = jSONObject.optBoolean("isSignB2key", false);
        this.G = jSONObject.optBoolean("useNioTunnel", true);
        this.H = jSONObject.optInt("connectionCount", 3);
        this.I = jSONObject.optInt("quicConnectionCount", 1);
        this.J = jSONObject.optInt("sendQueueSize", 40);
        this.ay = jSONObject.optInt("NetMonitor.ThroughPutRate", 1024);
        this.K = jSONObject.optBoolean("connectionWithSameIp", false);
        try {
            String[] split = jSONObject.optString("connectionWeight", "1|1|2|5").split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
            if (split.length == 4) {
                for (int i = 0; i < 4; i++) {
                    this.L[i] = Integer.parseInt(split[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.M = jSONObject.optInt("pingInterval.other", 60000);
        this.bc = jSONObject.optBoolean("isHttpsOpenHttpDns", false);
        this.bf = jSONObject.optBoolean("degrade.sharkpush", false);
        this.O = jSONObject.optBoolean("useCompression", false);
        this.R = jSONObject.optBoolean("isPFSOpen", false);
        this.U = jSONObject.optBoolean("smartRouting.ping", false);
        this.V = jSONObject.optInt("racingPingTimes", 3);
        this.W = jSONObject.optInt("racetrackHigh", 3);
        this.X = jSONObject.optInt("racingIntervalWifi", 600);
        this.Y = jSONObject.optInt("racingIntervalCelluar", 600);
        this.Z = jSONObject.optInt("racingDelayHigh", 3);
        this.aa = jSONObject.optInt("wifiRttResultNum", 20);
        this.ab = jSONObject.optInt("rttThresholdHigh", 50);
        this.bh = jSONObject.optInt("rttSPThresholdHigh", 200);
        this.bi = jSONObject.optString("march.configVersion", "");
        this.S = jSONObject.optInt("max_response_body_length", 5);
        this.T = jSONObject.optInt("nt.maxpostdata", 5120);
        this.P = jSONObject.optInt("compressType", 0);
        this.Q = jSONObject.optBoolean("compress.catupload", false);
        this.bj = jSONObject.optBoolean("enableIdleShark", false);
        this.ac = jSONObject.optBoolean("useNewFailover", false);
        this.af = jSONObject.optBoolean("uploadTunnelKitErrorSendCodeToCat", false);
        this.ai = jSONObject.optInt("closeTunnelWaitTime", 0);
        this.ad = jSONObject.optInt("ipv6pingoffset", 0);
        this.aj = jSONObject.optDouble("rpcTaskRatio", 0.0d);
        this.ak = jSONObject.optBoolean("tunnelFrameworkUploadEnable", false);
        this.bk = jSONObject.optInt("quicCongestionControlType", -1);
        this.ag = jSONObject.optBoolean("quicMonitorIndependentEnable", false);
        this.ah = jSONObject.optBoolean("failoverHttpUploadEnable", false);
        this.bb = jSONObject.optBoolean("quicGlobalEnable", false);
        this.al = jSONObject.optString("sharkABTest", "");
        this.am = jSONObject.optBoolean("netStatus.catupload", false);
        this.an = jSONObject.optBoolean("useNewThreadModel", false);
        this.ao = jSONObject.optBoolean("useDefaultNetworkType", false);
        this.ap = jSONObject.optBoolean("monitorForceHttp", false);
        this.aq = jSONObject.optBoolean("enableSharkMac", false);
        this.ar = jSONObject.optBoolean("oneThreadAllConn", true);
        this.as = jSONObject.optBoolean("fixPingRate", false);
        this.at = jSONObject.optBoolean("enablePingUseSendThread", false);
        this.au = jSONObject.optBoolean(FuncConfigResult.ENABLE_JARVIS, true);
        this.av = jSONObject.optBoolean("enableNioOpt", true);
        this.aw = jSONObject.optInt("rebuildSelectorThreshold", 512);
        this.ax = jSONObject.optInt("rebuildSelectorMaxCount", 3);
        this.bm = jSONObject.optBoolean("isPrintSharkConfig", false);
        this.aA = jSONObject.optInt("delayCloseTunnelTime", 0);
        this.aB = jSONObject.optBoolean("isMonitorBackGroundSend", false);
        this.aC = jSONObject.optBoolean("isJarvisForSetBackGroundMode", false);
        this.aD = jSONObject.optBoolean("isSupportCookies", true);
        this.az = jSONObject.optInt("nv.sharkMetricsUploadRate", 10);
        this.aG = jSONObject.optInt("tn.tcpConnectTimeout", 10000);
        this.bn = jSONObject.optInt("tn.quicConnectTimeout", 10000);
        this.aH = jSONObject.optBoolean("tn.ConnectReportEnable", false);
        this.aE = jSONObject.optBoolean("tn.disableSoftClose", false);
        this.aK = b(jSONObject.optJSONArray("hostWhiteListInSubProcess"));
        this.aL = b(jSONObject.optJSONArray("urlWhiteListInSubProcess"));
        this.aI = b(jSONObject.optJSONArray("uploadABOnlyInSubProcess"));
        this.aF = jSONObject.optBoolean("tn.heartBeatAtFixedRate", false);
        this.bo = a(jSONObject.optJSONArray("failoverForceHttpsList"));
        com.dianping.nvnetwork.shark.monitor.d a4 = com.dianping.nvnetwork.shark.monitor.d.a();
        Object[] objArr2 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvnetwork.shark.monitor.d.a;
        if (PatchProxy.isSupport(objArr2, a4, changeQuickRedirect2, false, "faae898634d876ccc272ffdd297a10c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a4, changeQuickRedirect2, false, "faae898634d876ccc272ffdd297a10c9");
        } else {
            a4.c = jSONObject;
            a4.d = a4.c.optBoolean("NetMonitor.Enable", false);
            a4.e = a4.c.optInt("NetMonitor.ReportSimpleRate", 0);
            a4.f = a4.c.optString("NetMonitor.DefaultPingHost", "shark.dianping.com");
            a4.g = a4.c.optInt("NetMonitor.minCalTPWinReqSize", 2);
            a4.h = a4.c.optInt("NetMonitor.minCalTPWinRevSize", 8000);
        }
        this.aM = jSONObject.optString("tn.debugIp", "10.84.247.78");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Request request, q qVar) {
        byte[] doFinal;
        Object[] objArr = {request, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46c4d08cd2870b1ae1edac02f7bc8274", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46c4d08cd2870b1ae1edac02f7bc8274")).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("url:");
        sb.append(request.d);
        sb.append("\nbody:");
        sb.append(request.i != null ? request.i.toString() : "");
        sb.append("\nfrom:");
        sb.append(qVar.b());
        sb.append("\nresponse code:");
        sb.append(qVar.statusCode());
        sb.append("\n");
        if (qVar.headers() != null) {
            JSONObject jSONObject = new JSONObject(qVar.headers());
            sb.append("response headers:");
            sb.append(jSONObject.toString());
            sb.append("\n");
        }
        if (qVar.isSuccess() && qVar.statusCode() == 200) {
            try {
                byte[] result = qVar.result();
                Object[] objArr2 = {result};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ff9e53a192179659d207d6b2b91ced6", 6917529027641081856L)) {
                    doFinal = (byte[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ff9e53a192179659d207d6b2b91ced6");
                } else {
                    SecretKeySpec secretKeySpec = new SecretKeySpec("D6C4F71A12753AE5".getBytes("ASCII"), "AES");
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, secretKeySpec, new IvParameterSpec("55C930D827BDABFD".getBytes()));
                    doFinal = cipher.doFinal(result);
                }
                String str = new String(a(doFinal));
                sb.append("response body:");
                sb.append(str);
                if (a(str)) {
                    a(str, "isGetConfigSuccess");
                    g.c().edit().putString("networkconfig", str).apply();
                    com.dianping.nvnetwork.util.g.a("refersh config success.");
                    this.aV = System.currentTimeMillis();
                    com.dianping.nvnetwork.util.i.a(sb.toString());
                    return true;
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                sb.append("error");
                sb.append(Log.getStackTraceString(e));
                return true;
            }
        }
        com.dianping.nvnetwork.util.i.a(sb.toString());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InputStream a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8fbec9e6038cc7d2ae0dec00938366a", 6917529027641081856L)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8fbec9e6038cc7d2ae0dec00938366a");
        }
        try {
            return context.getResources().getAssets().open("shark_config");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59070c46e35e571e5e74a7f5d18554ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59070c46e35e571e5e74a7f5d18554ef");
        } else if (this.bm) {
            com.dianping.nvnetwork.util.i.a("shark config from " + str2 + ", content is : " + str);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8edf5ebca600ebfc7fdbf913d33ada2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8edf5ebca600ebfc7fdbf913d33ada2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("s", g.b);
        hashMap.put("d", g.d);
        hashMap.put("a", g.f);
        JsonObject jsonObject = NVLinker.getLuban().get("sharkConfig", hashMap);
        if (jsonObject != null && !jsonObject.isJsonNull()) {
            try {
                String jsonObject2 = jsonObject.toString();
                a(jsonObject2);
                a(jsonObject2, "readConfigFromLuban");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        NVLinker.registerLubanCallback("sharkConfig", this.bp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99552d098bef7e1d008d7320f89fb9b2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99552d098bef7e1d008d7320f89fb9b2")).booleanValue();
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr2);
            byte[] digest = messageDigest.digest();
            if (digest == null || digest.length != 16) {
                return false;
            }
            for (int i = 0; i < 16; i++) {
                if (bArr[i] != digest[i]) {
                    return false;
                }
            }
            return true;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final synchronized void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d6554072f100c85e82febaff0321af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d6554072f100c85e82febaff0321af");
        } else if (!com.dianping.networklog.j.a(g.b())) {
            com.dianping.nvnetwork.util.g.a("just refresh config in main process.");
        } else if (this.aW) {
        } else {
            if (System.currentTimeMillis() - this.aV < this.aN * 1000) {
                com.dianping.nvnetwork.util.g.a("refresh config interval at least :" + this.aN + "s");
                return;
            }
            this.aW = true;
            rx.d.a(new l(), rx.d.a((d.a) new d.a<q>() { // from class: com.dianping.nvnetwork.h.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00d4 A[LOOP:0: B:11:0x0038->B:33:0x00d4, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00c7 A[SYNTHETIC] */
                @Override // rx.functions.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void call(java.lang.Object r24) {
                    /*
                        Method dump skipped, instructions count: 240
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.h.AnonymousClass3.call(java.lang.Object):void");
                }
            }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c862d70fb657f32643dbd9124704f9", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c862d70fb657f32643dbd9124704f9")).intValue() : (!"cip".equals(this.aO) && "http".equals(this.aO)) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:6:0x001e, B:9:0x0027, B:11:0x0047, B:13:0x004f, B:14:0x0055, B:16:0x005b, B:18:0x0069, B:20:0x006f), top: B:25:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.nvnetwork.h.a
            java.lang.String r10 = "54c4845d69618efe950cff5714dbb5a7"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            java.lang.String r0 = "https"
            boolean r0 = r12.startsWith(r0)     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L27
            return r12
        L27:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L79
            r0.<init>(r12)     // Catch: java.lang.Exception -> L79
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79
            r1.<init>()     // Catch: java.lang.Exception -> L79
            java.lang.String r2 = r0.getHost()     // Catch: java.lang.Exception -> L79
            r1.append(r2)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L79
            r1.append(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L79
            java.util.List<java.lang.String> r1 = r11.aS     // Catch: java.lang.Exception -> L79
            if (r1 == 0) goto L7d
            java.util.List<java.lang.String> r1 = r11.aS     // Catch: java.lang.Exception -> L79
            int r1 = r1.size()     // Catch: java.lang.Exception -> L79
            if (r1 <= 0) goto L7d
            java.util.List<java.lang.String> r1 = r11.aS     // Catch: java.lang.Exception -> L79
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L79
        L55:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L79
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L79
            java.lang.String r3 = "*"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Exception -> L79
            if (r3 != 0) goto L6f
            boolean r2 = com.dianping.nvnetwork.util.n.a(r0, r2)     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L55
        L6f:
            java.lang.String r0 = "http"
            java.lang.String r1 = "https"
            java.lang.String r0 = r12.replaceFirst(r0, r1)     // Catch: java.lang.Exception -> L79
            r12 = r0
            goto L7d
        L79:
            r0 = move-exception
            r0.printStackTrace()
        L7d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.h.b(java.lang.String):java.lang.String");
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5d74e6b0e81c30142493e8024f9e3a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5d74e6b0e81c30142493e8024f9e3a")).intValue() : e();
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018d69919372a449e1b1f474fd448a79", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018d69919372a449e1b1f474fd448a79")).intValue() : f();
    }

    public final int e() {
        return this.aT < 1500 ? KNBWebManager.ISetting.DEFAULT_TIMEOUT : this.aT;
    }

    public final int f() {
        if (this.aU < 1500) {
            return 2000;
        }
        return this.aU;
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c479e9548aa7548d32ad440f242a7050", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c479e9548aa7548d32ad440f242a7050");
        } else if ((!this.aZ || z) && z != this.aX) {
            com.dianping.nvnetwork.util.i.a("closeTcpTunnel:" + z);
            com.dianping.nvnetwork.util.g.a("closeTcpTunnel:" + z);
            this.aX = z;
            synchronized (this.bd) {
                e.a(this.bd, z);
            }
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c87a098b357837daf6e6ff2e2c9313cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c87a098b357837daf6e6ff2e2c9313cc");
        } else if (!this.ba || z) {
            if (z && this.aY) {
                return;
            }
            com.dianping.nvnetwork.util.i.a("closeSharkPushTunnel:" + z);
            com.dianping.nvnetwork.util.g.a("closeSharkPushTunnel:" + z);
            this.aY = z;
            if (this.be != null) {
                this.be.b(z);
            }
        }
    }

    private List<String> a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0d0d58a4be7f00906f92d7e8fc3b1c", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0d0d58a4be7f00906f92d7e8fc3b1c");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        return arrayList;
    }

    private Set<String> b(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d046ae1fcc7c4c9f837a88ee97142e", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d046ae1fcc7c4c9f837a88ee97142e");
        }
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    hashSet.add(optString);
                }
            }
        }
        return hashSet;
    }

    public static h h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1abf50989dc939e8e1dbb1c271fcf915", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1abf50989dc939e8e1dbb1c271fcf915");
        }
        if (br == null) {
            synchronized (h.class) {
                if (br == null) {
                    br = new h();
                }
            }
        }
        return br;
    }

    public final byte[] a(byte[] bArr, String str, String str2) throws Exception {
        byte[] doFinal;
        Object[] objArr = {bArr, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8207669479095b68be2ebba867879b5a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8207669479095b68be2ebba867879b5a");
        }
        Object[] objArr2 = {bArr, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0dcc7950028e13b2fec098046933be7", 6917529027641081856L)) {
            doFinal = (byte[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0dcc7950028e13b2fec098046933be7");
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("ASCII"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            doFinal = cipher.doFinal(bArr);
        }
        int i = 0;
        for (int length = doFinal.length - 1; length >= 0 && doFinal[length] == 0; length--) {
            i++;
        }
        if (i > 0) {
            byte[] bArr2 = new byte[doFinal.length - i];
            System.arraycopy(doFinal, 0, bArr2, 0, bArr2.length);
            return bArr2;
        }
        return doFinal;
    }

    private byte[] a(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af36b5677ae169f826a651c518eb1b95", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af36b5677ae169f826a651c518eb1b95");
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr2 = new byte[4096];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1120b7c72611f8032c823072aa0248cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1120b7c72611f8032c823072aa0248cc");
            return;
        }
        synchronized (this.bd) {
            this.bd.add(aVar);
        }
    }

    private void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e33895779030d61b4fed21e5bb901262", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e33895779030d61b4fed21e5bb901262");
        } else if (TextUtils.isEmpty(str)) {
            this.aJ = g.k();
        } else if ("*".equals(str)) {
            this.aJ = true;
        } else {
            try {
                String[] split = str.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                if (split != null && split.length > 0) {
                    String a2 = com.dianping.nvtunnelkit.utils.d.a(g.b());
                    for (String str2 : split) {
                        if (!TextUtils.isEmpty(str2) && str2.equals(a2)) {
                            this.aJ = true;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            this.aJ = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[Catch: Throwable -> 0x0072, TryCatch #0 {Throwable -> 0x0072, blocks: (B:10:0x0029, B:12:0x0049, B:13:0x004f, B:15:0x0055, B:17:0x0063, B:19:0x0069), top: B:24:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.nvnetwork.h.a
            java.lang.String r10 = "5900ba7860c310fbb0ef913e620b0aaf"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            if (r12 == 0) goto L73
            java.lang.String r0 = "https"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L29
            goto L73
        L29:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L72
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r1.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = r0.getHost()     // Catch: java.lang.Throwable -> L72
            r1.append(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L72
            r1.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L72
            java.util.List<java.lang.String> r1 = r11.bo     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L72
            java.util.List<java.lang.String> r1 = r11.bo     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L72
        L4f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L72
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "*"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L69
            boolean r2 = com.dianping.nvnetwork.util.n.a(r0, r2)     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L4f
        L69:
            java.lang.String r0 = "http"
            java.lang.String r1 = "https"
            java.lang.String r0 = r12.replaceFirst(r0, r1)     // Catch: java.lang.Throwable -> L72
            r12 = r0
        L72:
            return r12
        L73:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.h.c(java.lang.String):java.lang.String");
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7401864cf523a9f53d8c3d7f264cf0e1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7401864cf523a9f53d8c3d7f264cf0e1")).booleanValue() : e.b;
    }
}
