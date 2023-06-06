package com.sankuai.meituan.mtlive.player.mlvb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.network.a;
import com.sankuai.meituan.mtlive.player.library.a;
import com.sankuai.meituan.mtlive.player.library.b;
import com.sankuai.meituan.mtlive.player.mlvb.a;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.mtliveqos.d;
import com.sankuai.meituan.mtliveqos.e;
import com.sankuai.meituan.mtliveqos.utils.a;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxPlayer implements com.sankuai.meituan.mtlive.player.library.a {
    public static ChangeQuickRedirect a;
    private long A;
    private c.EnumC0620c B;
    private String C;
    private boolean D;
    private com.sankuai.meituan.mtliveqos.utils.a E;
    private float F;
    private CopyOnWriteArrayList<String> G;
    private ExecutorService H;
    private AtomicBoolean I;
    private long J;
    private long K;
    private long L;
    private a.InterfaceC0621a M;
    private boolean N;
    private Bundle O;
    private Handler P;
    private a.InterfaceC0615a Q;
    public AppBus.OnBackgroundListener b;
    public AppBus.OnForegroundListener c;
    private int d;
    private TXLivePlayConfig e;
    private b f;
    private a.d g;
    private a.InterfaceC0612a h;
    private a.c i;
    private a.b j;
    private a.e k;
    private TXLivePlayer l;
    private TXCloudVideoView m;
    private Context n;
    private String o;
    private long p;
    private String q;
    private String r;
    private String s;
    private boolean t;
    private float u;
    private boolean v;
    private int w;
    private int x;
    private long y;
    private long z;

    public static /* synthetic */ float a(MTTxPlayer mTTxPlayer, float f) {
        mTTxPlayer.u = 1.0f;
        return 1.0f;
    }

    public static /* synthetic */ String a(MTTxPlayer mTTxPlayer, long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "dd392fbb8a68117a672de24295fd4e3c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "dd392fbb8a68117a672de24295fd4e3c") : new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static /* synthetic */ void a(MTTxPlayer mTTxPlayer, int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "896aa258a80abbf8ac5cffaa4aa08b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "896aa258a80abbf8ac5cffaa4aa08b6e");
        } else if (mTTxPlayer.N && i == 2105 && bundle != null) {
            int i2 = a.a().f;
            long b = com.meituan.android.time.c.b() - mTTxPlayer.J;
            mTTxPlayer.b("reportVideoFrozen", "mIsBackground: " + mTTxPlayer.I.get() + ",cleanTime: " + i2 + ", durationAfterBackground: " + b);
            mTTxPlayer.a("reportVideoFrozen", "mIsBackground: " + mTTxPlayer.I.get() + ",cleanTime: " + i2 + ", durationAfterBackground: " + b);
            if (mTTxPlayer.I.get() || b < i2) {
                return;
            }
            try {
                Matcher matcher = Pattern.compile("[0-9]+").matcher(bundle.getString("EVT_MSG"));
                if (matcher.find()) {
                    Float valueOf = Float.valueOf(matcher.group());
                    HashMap hashMap = new HashMap();
                    hashMap.put("MTLIVE_VIDEO_FROZEN", valueOf);
                    mTTxPlayer.F += valueOf.floatValue();
                    d.a(mTTxPlayer.n, mTTxPlayer.e(true), hashMap, (Map<String, String>) null);
                    if (valueOf.floatValue() <= a.a().d || mTTxPlayer.H == null) {
                        return;
                    }
                    mTTxPlayer.H.submit(new Runnable() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.9
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d50e491843b6b30041d4e4071ebc6a0d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d50e491843b6b30041d4e4071ebc6a0d");
                            } else {
                                MTTxPlayer.n(MTTxPlayer.this);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void a(MTTxPlayer mTTxPlayer, Context context, Bundle bundle, com.sankuai.meituan.mtliveqos.statistic.b bVar) {
        Object[] objArr = {context, bundle, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "f63accf7eef137af48ace47bdd13aac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "f63accf7eef137af48ace47bdd13aac0");
        } else if (bundle != null) {
            String string = bundle.getString("CPU_USAGE");
            int i = bundle.getInt("VIDEO_WIDTH");
            int i2 = bundle.getInt("VIDEO_HEIGHT");
            int i3 = bundle.getInt("NET_SPEED");
            int i4 = bundle.getInt("VIDEO_BITRATE");
            int i5 = bundle.getInt("AUDIO_BITRATE");
            int i6 = bundle.getInt("VIDEO_FPS");
            int i7 = bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE);
            int i8 = bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE);
            int i9 = bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP);
            int i10 = bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP);
            int i11 = bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP);
            String string2 = bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO);
            String string3 = bundle.getString("SERVER_IP");
            int i12 = bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE);
            float f = bundle.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD);
            int i13 = bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL);
            int i14 = bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE);
            int i15 = bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL);
            int i16 = bundle.getInt("NET_JITTER");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (string3 == null) {
                string3 = "";
            }
            hashMap2.put("MTLIVE_SERVER_IP", string3);
            hashMap2.put("MTLIVE_RESOLUTION", i + Constants.GestureMoveEvent.KEY_X + i2);
            StringBuilder sb = new StringBuilder("minFps:");
            sb.append(mTTxPlayer.E.f());
            sb.append(" , avgFps: ");
            sb.append(mTTxPlayer.E.e());
            sb.append(",videoBitrate: ");
            sb.append(i4);
            if (mTTxPlayer.E.f() >= 0.0d) {
                hashMap.put("MTLIVE_NATIVE_MIN_FPS", Float.valueOf((float) mTTxPlayer.E.f()));
            }
            if (mTTxPlayer.E.f() >= 0.0d) {
                hashMap.put("MTLIVE_NATIVE_AVG_FPS", Float.valueOf((float) mTTxPlayer.E.e()));
            }
            if (string != null) {
                try {
                    String[] split = string.replaceAll("%", "").split("/");
                    if (split.length > 1) {
                        hashMap.put("MTLIVE_CPU_APP", Float.valueOf(Float.parseFloat(split[0])));
                        hashMap.put("MTLIVE_CPU_SYS", Float.valueOf(Float.parseFloat(split[1])));
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (string2 != null) {
                try {
                    String[] split2 = string2.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                    if (split2.length > 2) {
                        hashMap.put("MTLIVE_AEC_TYPE", Float.valueOf(split2[0]));
                        String[] split3 = split2[1].split(CommonConstant.Symbol.COMMA);
                        if (split3.length > 1) {
                            hashMap.put("MTLIVE_AUDIO_SAMPLE_RATE", Float.valueOf(split3[0].trim()));
                            hashMap.put("MTLIVE_NUM_OF_CHANNELS", Float.valueOf(split3[1].trim()));
                        }
                        String[] split4 = split2[2].split(CommonConstant.Symbol.COMMA);
                        if (split4.length > 1) {
                            hashMap.put("MTLIVE_AUDIO_SAMPLE_RATE_PLAY", Float.valueOf(split4[0].trim()));
                            hashMap.put("MTLIVE_NUM_OF_CHANNELS_PLAY", Float.valueOf(split4[1].trim()));
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            hashMap.put("MTLIVE_AV_SPEED", Float.valueOf(i3));
            hashMap.put("MTLIVE_VIDEO_BITRATE", Float.valueOf(i4));
            hashMap.put("MTLIVE_AUDIO_BITRATE", Float.valueOf(i5));
            hashMap.put("MTLIVE_FPS", Float.valueOf(i6));
            hashMap.put("MTLIVE_VIDEO_CACHE_DURATION", Float.valueOf(i7));
            hashMap.put("MTLIVE_AUDIO_CACHE_DURATION", Float.valueOf(i8));
            hashMap.put("MTLIVE_VIDEO_CACHE", Float.valueOf(i14));
            hashMap.put("MTLIVE_VIDEO_DROP", Float.valueOf(i9));
            hashMap.put("MTLIVE_AUDIO_DROP", Float.valueOf(i10));
            hashMap.put("MTLIVE_GOP", Float.valueOf(i11));
            hashMap.put("MTLIVE_V_DEC_CACHE_SIZE", Float.valueOf(i12));
            hashMap.put("MTLIVE_AV_PLAY_INTERVAL", Float.valueOf(i15));
            hashMap.put("MTLIVE_AV_RECV_INTERVAL", Float.valueOf(i13));
            hashMap.put("MTLIVE_AUDIO_CACHE_THRESHOLD", Float.valueOf(f));
            hashMap.put("MTLIVE_JIT", Float.valueOf(i16));
            hashMap.put("MTLIVE_IS_FROZEN", Float.valueOf(mTTxPlayer.u));
            d.a(context, bVar, hashMap, hashMap2);
            if (mTTxPlayer.v) {
                mTTxPlayer.u = 0.0f;
            }
        }
    }

    public static /* synthetic */ void a(MTTxPlayer mTTxPlayer, Bundle bundle) {
        byte[] byteArray;
        long j;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "c22f9bdb1e190b75e348d36710a730a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "c22f9bdb1e190b75e348d36710a730a1");
        } else if (!mTTxPlayer.N || mTTxPlayer.I.get() || bundle == null || (byteArray = bundle.getByteArray(TXLiveConstants.EVT_GET_MSG)) == null || byteArray.length <= 0) {
        } else {
            try {
                String str = new String(byteArray, "UTF-8");
                if (str.contains("SEI_PushTS_")) {
                    String substring = str.substring("SEI_PushTS_".length(), str.length());
                    long b = com.meituan.android.time.c.b();
                    try {
                        j = (long) Double.parseDouble(substring);
                    } catch (Exception e) {
                        e.printStackTrace();
                        j = 0;
                    }
                    if (j == 0) {
                        try {
                            j = Long.parseLong(substring);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    long j2 = b - j;
                    HashMap hashMap = new HashMap();
                    hashMap.put("MTLIVE_LATENCY_P2P", Float.valueOf((float) j2));
                    e.a(mTTxPlayer.n, mTTxPlayer.e(false), c.b.MTLIVE_EVENT_SYNC_CLOCK.C, b + CommonConstant.Symbol.UNDERLINE + com.meituan.android.time.c.a(), null);
                    if (j2 >= 0 && j2 <= LocationStrategy.LOCATION_TIMEOUT) {
                        d.a(mTTxPlayer.n, mTTxPlayer.e(true), hashMap, (Map<String, String>) null);
                        return;
                    }
                    mTTxPlayer.a(hashMap);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public static /* synthetic */ String b(MTTxPlayer mTTxPlayer, Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "ee3aaf7e5249028dd7846f562b526c90", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "ee3aaf7e5249028dd7846f562b526c90");
        }
        return String.format("%-14s %-14s %-12s\n%-8s %-8s %-8s %-8s\n%-14s %-14s\n%-14s %-14s", "CPU:" + bundle.getString("CPU_USAGE"), "RES:" + bundle.getInt("VIDEO_WIDTH") + "*" + bundle.getInt("VIDEO_HEIGHT"), "SPD:" + bundle.getInt("NET_SPEED") + "Kbps", "JIT:" + bundle.getInt("NET_JITTER"), "FPS:" + bundle.getInt("VIDEO_FPS"), "GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + "s", "ARA:" + bundle.getInt("AUDIO_BITRATE") + "Kbps", "QUE:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) + CommonConstant.Symbol.COMMA + String.format("%.1f", Float.valueOf(bundle.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD))).toString(), "VRA:" + bundle.getInt("VIDEO_BITRATE") + "Kbps", "SVR:" + bundle.getString("SERVER_IP"), "AUDIO:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO));
    }

    public static /* synthetic */ void b(MTTxPlayer mTTxPlayer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "56cd0d965da8209635e1f9d8fad30726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "56cd0d965da8209635e1f9d8fad30726");
            return;
        }
        mTTxPlayer.b("onEnterBackground", "onEnterBackground");
        mTTxPlayer.a("onEnterBackground", "onEnterBackground");
        if (mTTxPlayer.I != null) {
            mTTxPlayer.I.set(true);
        }
        if (mTTxPlayer.K == 0) {
            mTTxPlayer.K = com.meituan.android.time.c.b();
        }
    }

    public static /* synthetic */ void b(MTTxPlayer mTTxPlayer, int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "046d8b9141fa6252c31444ef95a3ec59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "046d8b9141fa6252c31444ef95a3ec59");
        } else if (mTTxPlayer.f != null) {
            mTTxPlayer.f.a(i, bundle);
        }
    }

    public static /* synthetic */ void c(MTTxPlayer mTTxPlayer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "e96ba8fcad1fec7d5c1f360ec4d91fb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "e96ba8fcad1fec7d5c1f360ec4d91fb4");
            return;
        }
        mTTxPlayer.b("onEnterForeground", "onEnterForeground");
        mTTxPlayer.a("onEnterForeground", "onEnterForeground");
        mTTxPlayer.J = com.meituan.android.time.c.b();
        if (mTTxPlayer.I != null) {
            mTTxPlayer.I.set(false);
        }
        if (mTTxPlayer.K > 0) {
            mTTxPlayer.L += com.meituan.android.time.c.b() - mTTxPlayer.K;
            mTTxPlayer.K = 0L;
        }
    }

    public static /* synthetic */ void c(MTTxPlayer mTTxPlayer, Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "26422c7167fda80b8f3cfda49167159b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "26422c7167fda80b8f3cfda49167159b");
        } else if (!mTTxPlayer.N || mTTxPlayer.I.get()) {
        } else {
            mTTxPlayer.O = bundle;
            mTTxPlayer.w++;
            if (mTTxPlayer.w >= 5) {
                if (mTTxPlayer.M == null) {
                    mTTxPlayer.M = new a.InterfaceC0621a() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtliveqos.utils.a.InterfaceC0621a
                        public final void a(double d, double d2) {
                            Object[] objArr2 = {Double.valueOf(d), Double.valueOf(d2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5191ec2cffef8123b365ff6788e0dd7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5191ec2cffef8123b365ff6788e0dd7");
                            } else {
                                MTTxPlayer.a(MTTxPlayer.this, MTTxPlayer.this.n, MTTxPlayer.this.O, MTTxPlayer.this.e(false));
                            }
                        }
                    };
                    mTTxPlayer.E.a(mTTxPlayer.M);
                }
                mTTxPlayer.E.d();
                mTTxPlayer.E.c();
                mTTxPlayer.w = 0;
            }
        }
    }

    public static /* synthetic */ void g(MTTxPlayer mTTxPlayer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "fe8e3eb5ca079d10be283cedbb85c345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "fe8e3eb5ca079d10be283cedbb85c345");
        } else if (mTTxPlayer.N) {
            mTTxPlayer.D = true;
            if (mTTxPlayer.p <= 0) {
                mTTxPlayer.a(c.a.MTLIVE_ERROR_CATEGORY_FIRST_VIDEO_FRAME, -1, "首帧时间未初始化");
            } else if (mTTxPlayer.t) {
            } else {
                mTTxPlayer.t = true;
                HashMap hashMap = new HashMap();
                long currentTimeMillis = System.currentTimeMillis();
                float f = (float) (currentTimeMillis - mTTxPlayer.p);
                hashMap.put("MTLIVE_FIRST_VIDEO_FRAME", Float.valueOf(f));
                hashMap.put("MTLIVE_OPEN_INPUT", Float.valueOf((float) mTTxPlayer.z));
                hashMap.put("MTLIVE_FIRST_FRAME_READ", Float.valueOf((float) mTTxPlayer.A));
                hashMap.put("MTLIVE_FIRST_FRAME_DECODE", Float.valueOf((float) (currentTimeMillis - mTTxPlayer.y)));
                if (mTTxPlayer.x > 0) {
                    hashMap.put("MTLIVE_RETRY_COUNT", Float.valueOf(mTTxPlayer.x));
                    mTTxPlayer.x = 0;
                }
                if (f > 15000.0f) {
                    mTTxPlayer.a(hashMap);
                } else {
                    d.a(mTTxPlayer.n, mTTxPlayer.e(true), hashMap, (Map<String, String>) null);
                }
                if (f > 10000.0f) {
                    mTTxPlayer.a(c.a.MLVB_START_PLAY, -1704, "首帧时间异常");
                }
            }
        }
    }

    public static /* synthetic */ void n(MTTxPlayer mTTxPlayer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTTxPlayer, changeQuickRedirect, false, "7a5b96dd340ffb1f673221ba3aeed857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTTxPlayer, changeQuickRedirect, false, "7a5b96dd340ffb1f673221ba3aeed857");
            return;
        }
        int i = a.a().c;
        StringBuilder sb = new StringBuilder();
        int size = mTTxPlayer.G.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (i2 < i - 1) {
                sb.append(mTTxPlayer.G.get(i3));
                i2++;
            } else {
                new StringBuilder("Upload TxLog: ").append(sb.toString());
                mTTxPlayer.a("TxLog", "Upload TxLog: " + sb.toString());
                com.sankuai.meituan.mtliveqos.a.a(mTTxPlayer.n, "TxLog", sb.toString(), mTTxPlayer.e(false), null, null);
                sb.setLength(0);
                i2 = 0;
            }
        }
        if (sb.toString().length() > 0) {
            new StringBuilder("Upload TxLog: ").append(sb.toString());
            mTTxPlayer.a("TxLog", "Upload TxLog: " + sb.toString());
            com.sankuai.meituan.mtliveqos.a.a(mTTxPlayer.n, "TxLog", sb.toString(), mTTxPlayer.e(false), null, null);
        }
        mTTxPlayer.G.clear();
    }

    public MTTxPlayer(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccefc91d9f315c440392ab62a6ca1bec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccefc91d9f315c440392ab62a6ca1bec");
            return;
        }
        this.d = 0;
        this.v = true;
        this.w = 0;
        this.B = c.EnumC0620c.SOFTWARE;
        this.D = true;
        this.F = 0.0f;
        this.G = new CopyOnWriteArrayList<>();
        this.I = new AtomicBoolean(false);
        this.b = new AppBus.OnBackgroundListener() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
            public final void onBackground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f12e4b049b68f5aff354ac9849d3692", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f12e4b049b68f5aff354ac9849d3692");
                    return;
                }
                Handler handler = MTTxPlayer.this.P;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea633a1884c5225900b67ce8b927878a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea633a1884c5225900b67ce8b927878a");
                            } else {
                                MTTxPlayer.b(MTTxPlayer.this);
                            }
                        }
                    });
                }
            }
        };
        this.c = new AppBus.OnForegroundListener() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
            public final void onForeground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5877720f2afba52f55add65638a8adec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5877720f2afba52f55add65638a8adec");
                    return;
                }
                Handler handler = MTTxPlayer.this.P;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.4.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "87138f25bf6b00b552dd717c9e65aca1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "87138f25bf6b00b552dd717c9e65aca1");
                            } else {
                                MTTxPlayer.c(MTTxPlayer.this);
                            }
                        }
                    });
                }
            }
        };
        this.Q = new a.InterfaceC0615a() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.player.mlvb.a.InterfaceC0615a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a8d38983e0690afeb6d6a777f865bb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a8d38983e0690afeb6d6a777f865bb1");
                } else if (z) {
                    MTTxPlayer.this.f();
                }
            }
        };
        this.n = context.getApplicationContext();
        this.o = String.valueOf(i);
        this.P = new Handler(Looper.getMainLooper());
        this.l = new TXLivePlayer(context);
        this.e = new TXLivePlayConfig();
        this.l.setConfig(this.e);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "917b001787674ba2101aade64e71b182", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "917b001787674ba2101aade64e71b182");
        } else {
            this.l.setPlayListener(new ITXLivePlayListener() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.7
                public static ChangeQuickRedirect a;

                @Override // com.tencent.rtmp.ITXLivePlayListener
                public final void onPlayEvent(int i2, Bundle bundle) {
                    Object[] objArr3 = {Integer.valueOf(i2), bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7fbbd56aee90ba8823ac2975078dcbcb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7fbbd56aee90ba8823ac2975078dcbcb");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("onPlayEvent event: ");
                    sb.append(i2);
                    sb.append(", bundle :");
                    sb.append(bundle != null ? bundle.toString() : null);
                    MTTxPlayer.a(MTTxPlayer.this, i2, bundle);
                    if (i2 == 2103) {
                        MTTxPlayer.this.x++;
                        MTTxPlayer.this.p = System.currentTimeMillis();
                    } else if (i2 == 2012) {
                        MTTxPlayer.a(MTTxPlayer.this, bundle);
                    } else if (i2 == 2007) {
                        MTTxPlayer.a(MTTxPlayer.this, 1.0f);
                        MTTxPlayer.this.v = false;
                    } else if (i2 == 2004) {
                        MTTxPlayer.this.v = true;
                    }
                    if (i2 < 0) {
                        MTTxPlayer.this.a(i2);
                        MTTxPlayer.this.a();
                    }
                    if (i2 == 2003) {
                        MTTxPlayer.g(MTTxPlayer.this);
                    } else if (i2 == 2001) {
                        MTTxPlayer.this.z = System.currentTimeMillis() - MTTxPlayer.this.p;
                        MTTxPlayer.this.y = System.currentTimeMillis();
                    } else if (i2 == 2004) {
                        MTTxPlayer.this.A = System.currentTimeMillis() - MTTxPlayer.this.y;
                        MTTxPlayer.this.y = System.currentTimeMillis();
                    }
                    if (i2 == 2106) {
                        MTTxPlayer.this.B = c.EnumC0620c.SOFTWARE;
                    }
                    if (i2 == 2031) {
                        MTTxPlayer.this.C = bundle != null ? bundle.getString("EVT_MSG") : "";
                        new StringBuilder("onPlayEvent: mSid = ").append(MTTxPlayer.this.C);
                    }
                    MTTxPlayer mTTxPlayer = MTTxPlayer.this;
                    StringBuilder sb2 = new StringBuilder("eventCode ");
                    sb2.append(i2);
                    sb2.append(" param = ");
                    sb2.append(bundle == null ? "没有任何信息" : bundle.getString("EVT_MSG", "没有任何信息"));
                    mTTxPlayer.b("onPlayerEvent", sb2.toString());
                    MTTxPlayer.b(MTTxPlayer.this, i2, bundle);
                }

                @Override // com.tencent.rtmp.ITXLivePlayListener
                public final void onNetStatus(Bundle bundle) {
                    Object[] objArr3 = {bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ac957d041eb56511837f027b014b970", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ac957d041eb56511837f027b014b970");
                        return;
                    }
                    if (MTTxPlayer.this.f != null) {
                        MTTxPlayer.this.f.a(bundle);
                    }
                    if (bundle != null) {
                        new StringBuilder("onNetStatus: ").append(MTTxPlayer.b(MTTxPlayer.this, bundle));
                        int i2 = bundle.getInt("VIDEO_WIDTH");
                        int i3 = bundle.getInt("VIDEO_HEIGHT");
                        MTTxPlayer mTTxPlayer = MTTxPlayer.this;
                        mTTxPlayer.r = i2 + Constants.GestureMoveEvent.KEY_X + i3;
                        int i4 = bundle.getInt("NET_SPEED");
                        a.e eVar = new a.e();
                        eVar.d = i4 * 2;
                        eVar.b = a.c.TXPLAYER;
                        eVar.c = a.d.DownLink;
                        com.sankuai.meituan.mtlive.core.network.a.a().a(eVar);
                        try {
                            String string = bundle.getString("SERVER_IP");
                            MTTxPlayer.this.s = TextUtils.isEmpty(string) ? "" : string.split(CommonConstant.Symbol.COLON)[0];
                        } catch (Exception unused) {
                        }
                    }
                    MTTxPlayer.c(MTTxPlayer.this, bundle);
                }
            });
        }
        this.E = new com.sankuai.meituan.mtliveqos.utils.a();
        this.E.a();
        if (a.a().b) {
            f();
        } else {
            a a2 = a.a();
            a.InterfaceC0615a interfaceC0615a = this.Q;
            Object[] objArr3 = {interfaceC0615a};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "69cdd166580970c125cabad5240cec38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "69cdd166580970c125cabad5240cec38");
            } else if (interfaceC0615a != null) {
                a2.e.add(interfaceC0615a);
            }
        }
        AppBus.getInstance().register(this.b);
        AppBus.getInstance().register(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc3e92dd67a7bfe77d01f01569b4d121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc3e92dd67a7bfe77d01f01569b4d121");
        } else {
            TXCLog.setListener(new TXCLog.a() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.6
                public static ChangeQuickRedirect a;
                private int c = 0;

                @Override // com.tencent.liteav.basic.log.TXCLog.a
                public final void a(int i, String str, String str2) {
                    Object[] objArr2 = {Integer.valueOf(i), str, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49e7b75735c3ed15be3221278a19868c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49e7b75735c3ed15be3221278a19868c");
                        return;
                    }
                    new StringBuilder("onTxLog: ").append(str2);
                    CopyOnWriteArrayList copyOnWriteArrayList = MTTxPlayer.this.G;
                    copyOnWriteArrayList.add(MTTxPlayer.a(MTTxPlayer.this, com.meituan.android.time.c.b(), "yyyy-MM-dd HH:mm:ss:SSS") + ": " + str2 + " \n ");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.meituan.mtliveqos.statistic.b e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7e8932a21f200347ccb64c937d343fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtliveqos.statistic.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7e8932a21f200347ccb64c937d343fa");
        }
        com.sankuai.meituan.mtliveqos.statistic.b bVar = new com.sankuai.meituan.mtliveqos.statistic.b();
        bVar.b = this.r;
        bVar.d = c.f.PLAY;
        bVar.e = c.g.MLVB;
        bVar.c = this.o;
        bVar.i = this.q;
        long currentTimeMillis = System.currentTimeMillis();
        bVar.k = this.s;
        bVar.m = this.B;
        if (this.p > 0) {
            long i = (currentTimeMillis - this.p) - i();
            if (i > 0) {
                bVar.o = i / 1000;
            }
        }
        bVar.p = currentTimeMillis;
        bVar.s = this.C;
        return bVar;
    }

    private void a(Map<String, Float> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676bf80501fabe939e22a720b83e0297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676bf80501fabe939e22a720b83e0297");
        } else {
            d.a(this.n, e(false), c.b.MTLIVE_EVENT_LIVE_ABNORMAL_INDEX.C, c.b.MTLIVE_EVENT_LIVE_ABNORMAL_INDEX.D, map, null);
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00105b5acd39929969f80ceb144193bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00105b5acd39929969f80ceb144193bf");
        } else if (this.o == null) {
        } else {
            com.sankuai.meituan.mtliveqos.statistic.c cVar = new com.sankuai.meituan.mtliveqos.statistic.c();
            cVar.d = str2;
            cVar.c = str;
            cVar.b = MTTxPlayer.class.getSimpleName();
            d.a(this.n, e(false), cVar, (Map<String, String>) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633f680f3c5b5e370accbc57284d79b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633f680f3c5b5e370accbc57284d79b5");
        } else if (this.o == null) {
        } else {
            com.sankuai.meituan.mtliveqos.statistic.c cVar = new com.sankuai.meituan.mtliveqos.statistic.c();
            cVar.d = str2;
            cVar.c = str;
            cVar.b = MTTxPlayer.class.getSimpleName();
            d.a(this.n, e(false), cVar, (Map<String, String>) null);
            a(str2);
        }
    }

    private void a(c.a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42222d784ca540f309562341b2149bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42222d784ca540f309562341b2149bf");
        } else if (this.o == null) {
        } else {
            new HashMap().put("MTLIVE_STREAM_URL", this.q);
            com.sankuai.meituan.mtliveqos.statistic.a aVar2 = new com.sankuai.meituan.mtliveqos.statistic.a();
            aVar2.b = i;
            aVar2.d = aVar == null ? StringUtil.NULL : aVar.ao;
            aVar2.c = str;
            e(false);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(com.sankuai.meituan.mtlive.player.library.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c391a219093ee1ec7571d9c24c246fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c391a219093ee1ec7571d9c24c246fd");
            return;
        }
        b("setConfig", "setConfig: " + dVar.hashCode());
        this.e.setAutoAdjustCacheTime(dVar.b);
        this.e.setCacheTime(dVar.c);
        this.e.setMaxAutoAdjustCacheTime(dVar.d);
        this.e.setMinAutoAdjustCacheTime(dVar.f);
        this.e.setVideoBlockThreshold(dVar.g);
        this.e.setConnectRetryCount(dVar.e);
        this.e.setConnectRetryInterval(dVar.h);
        this.e.setEnableMessage(true);
        this.e.enableAEC(dVar.i);
        this.e.setVideoBlockThreshold(600);
        this.e.setFlvSessionKey("X-Tlive-SpanId");
        this.l.setConfig(this.e);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ed47d082864b8a0c4cad3336ee4a021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ed47d082864b8a0c4cad3336ee4a021");
            return;
        }
        b("setPlayListener", "setPlayListener: " + bVar);
        this.f = bVar;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(com.sankuai.meituan.mtlive.player.library.view.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06eca4697fc6bbb8cb11a411e28f045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06eca4697fc6bbb8cb11a411e28f045");
            return;
        }
        b("setPlayerView", "setPlayerView: " + aVar);
        if (aVar == null) {
            this.l.setPlayerView(null);
            return;
        }
        TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(this.n);
        aVar.addView(tXCloudVideoView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.m = tXCloudVideoView;
        this.l.setPlayerView(tXCloudVideoView);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d1e0841b13d8d5742e7493f6a0b6f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d1e0841b13d8d5742e7493f6a0b6f2");
        } else {
            this.m.showLog(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db06b6c111c842c65da4164fcecb028", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db06b6c111c842c65da4164fcecb028")).intValue();
        }
        this.q = str;
        this.N = i == 1 || i == 0;
        this.p = System.currentTimeMillis();
        this.x = 0;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("MTLIVE_PLAY_TOTAL_COUNT", Float.valueOf(1.0f));
        d.a(this.n, e(true), hashMap, hashMap2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c11edd74a7e7913f25f3a5cbc311673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c11edd74a7e7913f25f3a5cbc311673");
        } else if (this.H == null) {
            this.H = com.sankuai.android.jarvis.c.a("TxPlayer-xlog-service", 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), null, new RejectedExecutionHandler() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.10
                public static ChangeQuickRedirect a;

                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    Object[] objArr3 = {runnable, threadPoolExecutor};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09d688e3c1cf91e83ab53846072afac9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09d688e3c1cf91e83ab53846072afac9");
                    } else if (MTTxPlayer.this.H.isShutdown()) {
                        Log.e("MTTxPlayer", "rejectedExecution after shutdown");
                    } else {
                        Log.e("MTTxPlayer", "rejectedExecution with unknown reason");
                    }
                }
            });
        }
        int startPlay = this.l.startPlay(str, i);
        if (startPlay != 0) {
            a(startPlay);
            a(c.a.MLVB_START_PLAY, startPlay, "");
        }
        this.E.c();
        b("startPlay", "startPlay: ret = " + startPlay + " url = " + str);
        return startPlay;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b604794879b5f92b53689bcb2d03c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b604794879b5f92b53689bcb2d03c8")).intValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05a784abd6063d06d892d5d50d4e5909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05a784abd6063d06d892d5d50d4e5909");
        } else if (this.N && this.p > 0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.p) - i();
            if (currentTimeMillis > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("MTLIVE_LIVE_DURATION", Float.valueOf(((float) currentTimeMillis) / 1000.0f));
                d.a(this.n, e(true), hashMap, (Map<String, String>) null);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2714fe61c1bb918c9ee567e7e7bf7761", RobustBitConfig.DEFAULT_VALUE)) {
            ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2714fe61c1bb918c9ee567e7e7bf7761")).intValue();
        } else {
            int stopRecord = this.l.stopRecord();
            b("stopRecord", "stopRecord: r = " + stopRecord);
            if (stopRecord != 0) {
                a(c.a.MLVB_STOP_RECORD, stopRecord, "");
            }
        }
        g();
        this.G.clear();
        int stopPlay = this.l.stopPlay(z);
        h();
        this.L = 0L;
        this.K = 0L;
        b("stopPlay", "stopPlay: " + stopPlay);
        if (stopPlay != 0) {
            a(c.a.MLVB_STOP_PLAY, stopPlay, "");
        }
        return stopPlay;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc2ad343d68c7b22c3e47d762341db3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc2ad343d68c7b22c3e47d762341db3")).intValue();
        }
        int b = b(true);
        b("stopPlay", "stopPlay:" + b);
        this.G.clear();
        this.E.d();
        this.E.b(this.M);
        this.M = null;
        g();
        h();
        this.L = 0L;
        this.K = 0L;
        return b;
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade0d1fd25a767fd548c1d48e6486418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade0d1fd25a767fd548c1d48e6486418");
            return;
        }
        if (this.H != null && !this.H.isShutdown()) {
            this.H.shutdownNow();
        }
        this.H = null;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9edbaf79696e0f7e077f222d40569ff2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9edbaf79696e0f7e077f222d40569ff2")).booleanValue();
        }
        boolean isPlaying = this.l.isPlaying();
        b("isPlaying", "isPlaying:" + isPlaying);
        return isPlaying;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c9d82ef901cf467ad2f03c6d058b3ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c9d82ef901cf467ad2f03c6d058b3ef");
            return;
        }
        b("pause", "pause");
        this.l.pause();
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39d8a275f3da64e239e1287fd922040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39d8a275f3da64e239e1287fd922040");
            return;
        }
        b("resume", "resume");
        this.l.resume();
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1fdc0f41cfd3f399799a66dac1f42f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1fdc0f41cfd3f399799a66dac1f42f");
            return;
        }
        b("setRenderMode", "setRenderMode m = " + i);
        this.l.setRenderMode(i);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3349699593fa01cf8b7acd5c96f4f98a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3349699593fa01cf8b7acd5c96f4f98a");
            return;
        }
        b("setRenderRotation", "setRenderRotation r = " + i);
        this.l.setRenderRotation(i);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final boolean c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a82aa7668d0f9b983bd61e49da6a815b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a82aa7668d0f9b983bd61e49da6a815b")).booleanValue();
        }
        this.B = z ? c.EnumC0620c.HARDWARE : c.EnumC0620c.SOFTWARE;
        boolean enableHardwareDecode = this.l.enableHardwareDecode(z);
        b("enableHardwareDecode", "enableHardwareDecode: ret=" + enableHardwareDecode + " enable=" + z);
        return enableHardwareDecode;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd31c4b80f7a0ff6264e07fc39f2eed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd31c4b80f7a0ff6264e07fc39f2eed");
            return;
        }
        b("setMute", "setMute:" + z);
        this.l.setMute(z);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdeb48ab46838ff33eb437c22488ffdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdeb48ab46838ff33eb437c22488ffdb");
            return;
        }
        b("setAudioRoute", "setAudioRoute:" + i);
        this.l.setAudioRoute(i);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94042f48c496cd153b82c71045060b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94042f48c496cd153b82c71045060b6");
            return;
        }
        b("seek", "t = " + i);
        this.l.seek(i);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6f5877dbc9a985444d8fb88c796713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6f5877dbc9a985444d8fb88c796713");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        b("enableAudioVolumeEvaluation", sb.toString());
        this.l.enableAudioVolumeEvaluation(i);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2fa34fb8d80238acede162b411fdba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2fa34fb8d80238acede162b411fdba8");
            return;
        }
        b("release", "");
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l.setVideoRecordListener(null);
        this.l.setAudioRawDataListener(null);
        this.l.setAudioVolumeEvaluationListener(null);
        this.l.setAudioRawDataListener(null);
        this.F = 0.0f;
        this.G.clear();
        this.E.b();
        TXCLog.setListener(null);
        a a2 = a.a();
        a.InterfaceC0615a interfaceC0615a = this.Q;
        Object[] objArr2 = {interfaceC0615a};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2f7abc4a3ab8782835186227bab26054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2f7abc4a3ab8782835186227bab26054");
        } else if (interfaceC0615a != null) {
            a2.e.remove(interfaceC0615a);
        }
        h();
        AppBus.getInstance().unregister(this.c);
        AppBus.getInstance().unregister(this.b);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(a.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5316c53c439e55150571285207de3daf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5316c53c439e55150571285207de3daf");
            return;
        }
        b("snapshot", "snapshot:" + cVar);
        this.i = cVar;
        if (cVar == null) {
            this.l.snapshot(null);
        } else {
            this.l.snapshot(new TXLivePlayer.ITXSnapshotListener() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.2
                public static ChangeQuickRedirect a;

                @Override // com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener
                public final void onSnapshot(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f992dad2e24db56e8b98f4f348fe1b3f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f992dad2e24db56e8b98f4f348fe1b3f");
                    } else if (MTTxPlayer.this.i != null) {
                        MTTxPlayer.this.i.a(bitmap);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f7bd4a51b5a39797e790079ca12456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f7bd4a51b5a39797e790079ca12456");
            return;
        }
        b("setAudioVolumeEvaluationListener", "setAudioVolumeEvaluationListener:" + bVar);
        this.j = bVar;
        if (bVar == null) {
            this.l.setAudioVolumeEvaluationListener(null);
        } else {
            this.l.setAudioVolumeEvaluationListener(new TXLivePlayer.ITXAudioVolumeEvaluationListener() { // from class: com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer.3
                public static ChangeQuickRedirect a;

                @Override // com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener
                public final void onAudioVolumeEvaluationNotify(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c199c8d7268d89d1b1d7054db1204d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c199c8d7268d89d1b1d7054db1204d0");
                    } else {
                        MTTxPlayer.this.j.a(i);
                    }
                }
            });
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65307bcff35b6f6d3a82722bd82d4068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65307bcff35b6f6d3a82722bd82d4068");
            return;
        }
        new StringBuilder("reportEvent2Es: ").append(str);
        com.sankuai.meituan.mtliveqos.statistic.b e = e(false);
        if (e == null) {
            e = new com.sankuai.meituan.mtliveqos.statistic.b();
            e.d = c.f.PLAY;
            e.e = c.g.MLVB;
            e.f = true;
        }
        Context context = this.n;
        com.sankuai.meituan.mtliveqos.c.a(context, e, "MTTxPlayer_Event", "player hashCode:" + hashCode() + ", " + str);
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730707987750b7d53e79e5df3bb6f6c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730707987750b7d53e79e5df3bb6f6c5");
            return;
        }
        new StringBuilder("reportError2Es: ").append(str);
        com.sankuai.meituan.mtliveqos.statistic.b e = e(false);
        if (e == null) {
            e = new com.sankuai.meituan.mtliveqos.statistic.b();
            e.d = c.f.PLAY;
            e.e = c.g.MLVB;
            e.f = true;
        }
        Context context = this.n;
        com.sankuai.meituan.mtliveqos.c.b(context, e, "MTTxPlayer_Error_Event", "player hashCode:" + hashCode() + ", " + str);
    }

    private long i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42030cdeea9d20b790c196b7523e8230", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42030cdeea9d20b790c196b7523e8230")).longValue();
        }
        if (!this.I.get()) {
            return this.L;
        }
        if (this.K > 0) {
            return this.L + (com.meituan.android.time.c.b() - this.K);
        }
        return 0L;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76920ca162db78370e60212a032949eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76920ca162db78370e60212a032949eb");
        } else if (this.N) {
            HashMap hashMap = new HashMap();
            hashMap.put("MTLIVE_TOTAL_VIDEO_FROZEN", Float.valueOf(this.F));
            d.a(this.n, e(true), hashMap, (Map<String, String>) null);
            this.F = 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48772193996434e5afb3879fa8bcb42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48772193996434e5afb3879fa8bcb42");
        } else if (this.N) {
            this.L = 0L;
            this.K = 0L;
            this.E.d();
            if (this.D) {
                this.D = false;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put("MTLIVE_PLAY_FAILED_COUNT", Float.valueOf(1.0f));
                hashMap2.put("MTLIVE_ERROR_CODE", String.valueOf(f));
                if (this.x > 0 && !this.t) {
                    hashMap.put("MTLIVE_RETRY_COUNT", Float.valueOf(this.x));
                    this.x = 0;
                }
                d.a(this.n, e(true), hashMap, hashMap2);
                b("errorCode:" + f);
            }
        }
    }
}
