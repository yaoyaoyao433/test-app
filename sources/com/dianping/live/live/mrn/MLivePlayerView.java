package com.dianping.live.live.mrn;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.util.AttributeSet;
import android.view.View;
import com.alipay.sdk.app.PayTask;
import com.dianping.live.live.mrn.list.e;
import com.dianping.live.live.utils.NetWorkStateReceiver;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.utils.LocalIdUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ao;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLivePlayerView extends com.sankuai.meituan.mtlive.player.library.view.a {
    public static ChangeQuickRedirect a;
    ao b;
    d c;
    com.sankuai.meituan.mtlive.player.library.d d;
    com.sankuai.meituan.mtlive.player.library.b e;
    String f;
    boolean g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private Map<String, Object> m;
    private String n;
    private int o;
    private int p;
    private int q;
    private int r;
    private String s;
    private e.a t;
    private boolean u;

    public static /* synthetic */ void a(MLivePlayerView mLivePlayerView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mLivePlayerView, changeQuickRedirect, false, "837d274aa522208d80dc2c28a5c9b174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mLivePlayerView, changeQuickRedirect, false, "837d274aa522208d80dc2c28a5c9b174");
            return;
        }
        if (i <= 0) {
            mLivePlayerView.l = true;
        }
    }

    public static /* synthetic */ boolean a(MLivePlayerView mLivePlayerView, boolean z) {
        mLivePlayerView.u = true;
        return true;
    }

    public static /* synthetic */ boolean b(MLivePlayerView mLivePlayerView, boolean z) {
        mLivePlayerView.k = false;
        return false;
    }

    public static /* synthetic */ int k(MLivePlayerView mLivePlayerView) {
        int i = mLivePlayerView.o;
        mLivePlayerView.o = i + 1;
        return i;
    }

    public MLivePlayerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6732e7fa2405375b2008a9042569ec14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6732e7fa2405375b2008a9042569ec14");
            return;
        }
        this.h = 0;
        this.i = false;
        this.j = true;
        this.k = false;
        this.l = false;
        this.m = new HashMap();
        this.n = "MLive_Player";
        this.o = 0;
        this.p = 16;
        this.q = 0;
        this.r = 0;
        this.g = false;
        this.s = "";
        this.u = false;
    }

    public MLivePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b698a8b06c8b32341656369864dfb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b698a8b06c8b32341656369864dfb0");
            return;
        }
        this.h = 0;
        this.i = false;
        this.j = true;
        this.k = false;
        this.l = false;
        this.m = new HashMap();
        this.n = "MLive_Player";
        this.o = 0;
        this.p = 16;
        this.q = 0;
        this.r = 0;
        this.g = false;
        this.s = "";
        this.u = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5f767024e4b58dbc235ac3ae482074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5f767024e4b58dbc235ac3ae482074");
            return;
        }
        super.requestLayout();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8f2d0815905ed119eda3b7af915eace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8f2d0815905ed119eda3b7af915eace");
        } else if (getWidth() <= 0 || getHeight() <= 0) {
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getPaddingLeft() + getLeft(), getPaddingTop() + getTop(), getWidth() + getPaddingLeft() + getLeft(), getHeight() + getPaddingTop() + getTop());
        }
    }

    public final void a(g gVar, WritableMap writableMap) {
        Object[] objArr = {gVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf3035861c0c1bf7556bdac192b8203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf3035861c0c1bf7556bdac192b8203");
        } else if (this.b == null) {
        } else {
            try {
                ((UIManagerModule) this.b.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(f.a(getId(), gVar, writableMap));
            } catch (Exception e) {
                com.dianping.live.live.utils.j.a("MLive_Logan: Player CALLBACK 通知mrn侧player状态改变失败");
                com.dianping.codelog.b.b(MLivePlayerView.class, "notifyPlayerStateChanged ERROR", e.getMessage() + " Address:" + this.f);
            }
        }
    }

    public final void a(ReadableMap readableMap) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2603bb521fead63b84cdb7d4ea3170ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2603bb521fead63b84cdb7d4ea3170ce");
            return;
        }
        if (getCurrentActivity() != null) {
            long startTime = getCurrentActivity().getStartTime();
            String str = com.dianping.live.live.utils.i.c;
            com.dianping.live.live.utils.i.a(str, "init:" + (System.currentTimeMillis() - startTime));
            this.s = getCurrentActivity().getLiveId();
            this.t = getCurrentActivity().getChannelType();
        }
        this.f = readableMap.getString(RaptorUploaderImpl.SRC);
        this.h = readableMap.getInt("playType");
        String str2 = "";
        String str3 = "";
        if (readableMap.hasKey("streamId") && readableMap.hasKey(LocalIdUtils.QUERY_QUALITY)) {
            str3 = readableMap.getString("streamId");
            str2 = readableMap.getString(LocalIdUtils.QUERY_QUALITY);
        }
        com.dianping.live.report.d.b.a(this.s, str2, str3, readableMap.hasKey("buId") ? readableMap.getString("buId") : "", "", this.h == 3 ? 3 : 2, this.t);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7094474c8749664a0ef07e5565280d52", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7094474c8749664a0ef07e5565280d52")).booleanValue();
        } else {
            if (this.c == null || this.c.d) {
                if (getCurrentActivity() != null) {
                    this.c = com.dianping.live.playerManager.a.a(getContext()).a(getContext(), this.f);
                } else {
                    this.c = new d(getContext());
                }
            }
            if (this.d == null) {
                this.d = new com.sankuai.meituan.mtlive.player.library.d();
            }
            if (getCurrentActivity() != null) {
                long startTime2 = getCurrentActivity().getStartTime();
                String str4 = com.dianping.live.live.utils.i.c;
                com.dianping.live.live.utils.i.a(str4, "setPlayerView:" + (System.currentTimeMillis() - startTime2));
                z = getCurrentActivity().c();
                getCurrentActivity().setmLivePlayer(this.c);
            } else {
                z = false;
            }
            if (z) {
                this.g = true;
            } else {
                this.g = false;
                this.c.a(this);
            }
            if (this.e == null) {
                this.e = new com.sankuai.meituan.mtlive.player.library.b() { // from class: com.dianping.live.live.mrn.MLivePlayerView.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtlive.player.library.b
                    public final void a(int i, Bundle bundle) {
                        Object[] objArr3 = {Integer.valueOf(i), bundle};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b6832ecaf954480cd94ab6530ee67fb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b6832ecaf954480cd94ab6530ee67fb");
                            return;
                        }
                        if (i != 2005) {
                            WritableMap createMap = Arguments.createMap();
                            WritableMap createMap2 = Arguments.createMap();
                            createMap2.putInt("code", i);
                            createMap.putMap(GearsLocator.DETAIL, createMap2);
                            MLivePlayerView.this.a(g.STATE_BIND_STATE_CHANGE, createMap);
                        }
                        MLivePlayerView.this.a(i, bundle);
                        com.dianping.live.live.utils.j.a("MLive_Logan: Player Code " + i + " liveId " + MLivePlayerView.this.s);
                        MLivePlayerView.a(MLivePlayerView.this, i);
                        String unused = MLivePlayerView.this.n;
                        StringBuilder sb = new StringBuilder("Code ");
                        sb.append(i);
                        sb.append("param ");
                        sb.append(bundle);
                        long startTime3 = MLivePlayerView.this.getCurrentActivity() != null ? MLivePlayerView.this.getCurrentActivity().getStartTime() : 0L;
                        if (i == 2007) {
                            long currentTimeMillis = System.currentTimeMillis();
                            String str5 = com.dianping.live.live.utils.i.c;
                            com.dianping.live.live.utils.i.a(str5, "loading:" + (currentTimeMillis - startTime3));
                        } else if (i == 2001) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            String str6 = com.dianping.live.live.utils.i.c;
                            com.dianping.live.live.utils.i.a(str6, "已连接服务器:" + (currentTimeMillis2 - startTime3));
                        } else if (i == 2002) {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            String str7 = com.dianping.live.live.utils.i.c;
                            com.dianping.live.live.utils.i.a(str7, "开始拉流:" + (currentTimeMillis3 - startTime3));
                        } else if (i == 2004) {
                            long currentTimeMillis4 = System.currentTimeMillis();
                            String str8 = com.dianping.live.live.utils.i.c;
                            com.dianping.live.live.utils.i.a(str8, "视频播放开始:" + (currentTimeMillis4 - startTime3));
                        } else if (i == 2008) {
                            long currentTimeMillis5 = System.currentTimeMillis();
                            String str9 = com.dianping.live.live.utils.i.c;
                            com.dianping.live.live.utils.i.a(str9, "启动硬/软解:" + (currentTimeMillis5 - startTime3));
                        } else if (i == 2003) {
                            long currentTimeMillis6 = System.currentTimeMillis();
                            String str10 = com.dianping.live.live.utils.i.c;
                            com.dianping.live.live.utils.i.a(str10, "FFT:" + (currentTimeMillis6 - startTime3));
                        } else if (i == 2106) {
                            com.dianping.live.live.utils.i.a(com.dianping.live.live.utils.i.c, "硬解启动失败，采用软解");
                            MLivePlayerView.this.c.b(false);
                        } else if (i == 2009) {
                            Object obj = bundle.get("EVT_PARAM1");
                            int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                            Object obj2 = bundle.get("EVT_PARAM2");
                            int intValue2 = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                            StringBuilder sb2 = new StringBuilder("width:");
                            sb2.append(intValue);
                            sb2.append(",height:");
                            sb2.append(intValue2);
                            if (intValue != 0 && intValue2 != 0 && (intValue * 9) / 16 >= intValue2) {
                                MLivePlayerView.this.c.a(1);
                                MLivePlayerView.a(MLivePlayerView.this, true);
                            }
                        }
                        if (i == 2003 && MLivePlayerView.this.getCurrentActivity() != null && !MLivePlayerView.this.getCurrentActivity().a() && startTime3 > 0) {
                            final long currentTimeMillis7 = System.currentTimeMillis();
                            final boolean b = MLivePlayerView.this.getCurrentActivity().b();
                            final boolean z3 = MLivePlayerView.this.getCurrentActivity().getIndexInChannel() == 0;
                            MLivePlayerView.this.m.put("liveId", MLivePlayerView.this.s);
                            MLivePlayerView.this.m.put("fft", Long.valueOf(currentTimeMillis7 - startTime3));
                            MLivePlayerView.this.m.put("isFloat", Boolean.FALSE);
                            MLivePlayerView.this.m.put("pullUrl", MLivePlayerView.this.f);
                            MLivePlayerView.this.m.put("isCold", Boolean.valueOf(b));
                            MLivePlayerView.this.m.put("isPreOpt", Boolean.FALSE);
                            MLivePlayerView.this.m.put("code", "2003");
                            Statistics.getChannel("gc").writeSystemCheck(AppUtil.generatePageInfoKey(MLivePlayerView.this.getReactContext().getCurrentActivity()), "b_gc_mlive_sc", MLivePlayerView.this.m, "c_gc_6uvcyn40");
                            final long j = startTime3;
                            com.dianping.live.live.utils.c.a(new com.dianping.live.live.utils.d() { // from class: com.dianping.live.live.mrn.MLivePlayerView.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.dianping.live.live.utils.d
                                public final void a(Map<String, Object> map) {
                                    Object[] objArr4 = {map};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9af9465b37a870fd182d9b20b23a6e57", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9af9465b37a870fd182d9b20b23a6e57");
                                    } else if (map.containsKey("isOpen") && map.containsKey("fft")) {
                                        boolean booleanValue = ((Boolean) map.get("isOpen")).booleanValue();
                                        boolean booleanValue2 = ((Boolean) map.get("fft")).booleanValue();
                                        if (booleanValue && booleanValue2) {
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("MLIVE_IS_COLD", Integer.valueOf(b ? 1 : 0));
                                            hashMap.put("MLIVE_IS_FLOAT", 0);
                                            hashMap.put("MLIVE_IS_PRE_OPT", 0);
                                            hashMap.put("MLIVE_IS_CHANNEL_FIRST", Boolean.valueOf(z3));
                                            com.dianping.live.report.d.b.a(MLivePlayerView.this.s, "MLIVE_FFT", currentTimeMillis7 - j, hashMap);
                                        }
                                    }
                                }
                            });
                            MLivePlayerView.this.getCurrentActivity().setFftReported(true);
                            if (MLivePlayerView.this.getCurrentActivity().getMLivePlayerStatusMonitor() != null) {
                                MLivePlayerView.this.getCurrentActivity().getMLivePlayerStatusMonitor().a(MLivePlayerView.this.s);
                            }
                        }
                        if (MLivePlayerView.this.getCurrentActivity() == null || MLivePlayerView.this.getCurrentActivity().getMLivePlayerStatusMonitor() == null || MLivePlayerView.this.getCurrentActivity().getMLivePlayerStatusMonitor().b >= 1.0d || i >= 0) {
                            return;
                        }
                        MLivePlayerView.this.getCurrentActivity().getMLivePlayerStatusMonitor().a(MLivePlayerView.this.s, -4.0d);
                    }

                    @Override // com.sankuai.meituan.mtlive.player.library.b
                    public final void a(Bundle bundle) {
                        String format;
                        Object[] objArr3 = {bundle};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "465da50b07798ed1a64ca7f5fb943ee9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "465da50b07798ed1a64ca7f5fb943ee9");
                        } else if (MLivePlayerView.this.i) {
                            WritableMap createMap = Arguments.createMap();
                            MLivePlayerView mLivePlayerView = MLivePlayerView.this;
                            Object[] objArr4 = {bundle};
                            ChangeQuickRedirect changeQuickRedirect4 = MLivePlayerView.a;
                            if (PatchProxy.isSupport(objArr4, mLivePlayerView, changeQuickRedirect4, false, "0b91e532a566b6d01bbfa9ac95c415b3", RobustBitConfig.DEFAULT_VALUE)) {
                                format = (String) PatchProxy.accessDispatch(objArr4, mLivePlayerView, changeQuickRedirect4, false, "0b91e532a566b6d01bbfa9ac95c415b3");
                            } else {
                                format = String.format("%-14s %-14s %-12s\n%-8s %-8s %-8s %-8s\n%-14s %-14s\n%-14s %-14s", "CPU:" + bundle.getString("CPU_USAGE"), "RES:" + bundle.getInt("VIDEO_WIDTH") + "*" + bundle.getInt("VIDEO_HEIGHT"), "SPD:" + bundle.getInt("NET_SPEED") + "Kbps", "JIT:" + bundle.getInt("NET_JITTER"), "FPS:" + bundle.getInt("VIDEO_FPS"), "GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + "s", "ARA:" + bundle.getInt("AUDIO_BITRATE") + "Kbps", "QUE:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) + CommonConstant.Symbol.COMMA + bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) + CommonConstant.Symbol.COMMA + String.format("%.1f", Float.valueOf(bundle.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD))).toString(), "VRA:" + bundle.getInt("VIDEO_BITRATE") + "Kbps", "SVR:" + bundle.getString("SERVER_IP"), "AUDIO:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO));
                            }
                            createMap.putString("info", format);
                            createMap.putString("memo", "");
                            MLivePlayerView.this.a(g.STATE_BIND_NET_STATUS, createMap);
                        }
                    }
                };
            }
        }
        if (!z && !this.u) {
            setObjectFit(readableMap);
        }
        setMode(readableMap);
        setMuted(readableMap);
        setOrientation(readableMap);
        setMinCache(readableMap);
        setMaxCache(readableMap);
        setNetworkStatusSwitch(readableMap);
        setEnableAEC(readableMap);
        this.c.b(true);
        if (getCurrentActivity() != null && getCurrentActivity().c()) {
            long startTime3 = getCurrentActivity().getStartTime();
            String str5 = com.dianping.live.live.utils.i.c;
            com.dianping.live.live.utils.i.a(str5, "reset listener&config:" + (System.currentTimeMillis() - startTime3));
            this.c.a(this.e);
            getCurrentActivity().setmLivePlayerListener(null);
            this.c.a(this.d);
            getCurrentActivity().setmLivePlayConfig(null);
            int retCode = getCurrentActivity().getRetCode();
            switch (retCode) {
                case -3:
                    a(g.STATE_ON_PLAY_TYPE_ILLEGAL, (WritableMap) null);
                    break;
                case -2:
                    a(g.STATE_ON_PLAY_URL_ILLEGAL, (WritableMap) null);
                    break;
                case -1:
                    a(g.STATE_ON_PLAY_URL_NULL, (WritableMap) null);
                    break;
                case 0:
                    a(g.STATE_ON_PLAYER_START_SUCCESS, (WritableMap) null);
                    break;
            }
            if (retCode != 0 && getCurrentActivity().getMLivePlayerStatusMonitor() != null) {
                getCurrentActivity().getMLivePlayerStatusMonitor().a(this.s, -4.0d);
            }
            List<Integer> codes = getCurrentActivity().getCodes();
            if (codes != null && codes.size() > 0) {
                for (int i = 0; i < codes.size(); i++) {
                    final Integer num = codes.get(i);
                    postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePlayerView.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "11a06e8b516d16415d52197b39276afc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "11a06e8b516d16415d52197b39276afc");
                                return;
                            }
                            WritableMap createMap = Arguments.createMap();
                            WritableMap createMap2 = Arguments.createMap();
                            createMap2.putInt("code", num.intValue());
                            createMap.putMap(GearsLocator.DETAIL, createMap2);
                            MLivePlayerView.this.a(g.STATE_BIND_STATE_CHANGE, createMap);
                            MLivePlayerView mLivePlayerView = MLivePlayerView.this;
                            int intValue = num.intValue();
                            Object[] objArr4 = {Integer.valueOf(intValue)};
                            ChangeQuickRedirect changeQuickRedirect4 = MLivePlayerView.a;
                            if (PatchProxy.isSupport(objArr4, mLivePlayerView, changeQuickRedirect4, false, "7e268acc7a20d65d51c98065029aa5f2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, mLivePlayerView, changeQuickRedirect4, false, "7e268acc7a20d65d51c98065029aa5f2");
                            } else {
                                mLivePlayerView.a(intValue, (Bundle) null);
                            }
                            com.dianping.live.live.utils.j.a("MLive_Logan: Player Code " + num + " liveId " + MLivePlayerView.this.s);
                            String unused = MLivePlayerView.this.n;
                            new StringBuilder("Code ").append(num);
                        }
                    }, i * 100);
                }
            }
        }
        if (this.c == null || this.c.d || !this.c.b()) {
            if ((readableMap.hasKey("autoplay") && readableMap.getBoolean("autoplay")) ? false : false) {
                a();
            }
        }
    }

    public final void a(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6da7efee3ddbf2c5336ffb6674430f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6da7efee3ddbf2c5336ffb6674430f34");
        } else if (i == 2002) {
            a(g.STATE_ON_PLAY_STREAM_SUCCESS, (WritableMap) null);
            this.o = 0;
        } else if (i == 2103) {
            a(g.STATE_ON_NETWORK_RESTART, (WritableMap) null);
        } else if (i == -2301) {
            a(g.STATE_ON_NETWORK_FAIL, (WritableMap) null);
            this.k = true;
            if (this.j) {
                new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePlayerView.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b03925c9d7746a825d6e63fb7bc6dc6f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b03925c9d7746a825d6e63fb7bc6dc6f");
                        } else if (MLivePlayerView.this.j && MLivePlayerView.this.k && MLivePlayerView.this.o < MLivePlayerView.this.p) {
                            MLivePlayerView.this.a(g.STATE_ON_NETWORK_AUTO_RESTART, (WritableMap) null);
                            com.dianping.live.live.utils.j.a("MLive_Logan: Player RECONNECT 准备自动重启拉流 连续第" + MLivePlayerView.this.o + "次 liveId " + MLivePlayerView.this.s);
                            String unused = MLivePlayerView.this.n;
                            MLivePlayerView.this.b();
                            MLivePlayerView.this.a();
                            MLivePlayerView.b(MLivePlayerView.this, false);
                            MLivePlayerView.k(MLivePlayerView.this);
                        }
                    }
                }, PayTask.j);
            }
        } else if (i == 2004) {
            a(g.STATE_ON_PLAY_BEGIN, (WritableMap) null);
        } else if (i == 2006) {
            a(g.STATE_ON_PLAY_END, (WritableMap) null);
        } else if (i != 2005 || bundle == null) {
        } else {
            int i2 = bundle.getInt(TXLiveConstants.EVT_PLAY_DURATION);
            int i3 = bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("duration", i2);
            createMap.putInt(NotificationCompat.CATEGORY_PROGRESS, i3);
            a(g.STATE_ON_PROGRESS_UPDATE, createMap);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f3426282b1e963d7a6daebd81a3a4b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f3426282b1e963d7a6daebd81a3a4b0");
        } else if (this.c == null || this.c.d) {
        } else {
            this.c.a(this.e);
            this.c.a(this.d);
            com.dianping.live.live.utils.j.a("MLive_Logan: Player  Address:" + this.f + " liveId " + this.s);
            if (getCurrentActivity() != null) {
                long startTime = getCurrentActivity().getStartTime();
                String str = com.dianping.live.live.utils.i.c;
                com.dianping.live.live.utils.i.a(str, "startPlay:" + (System.currentTimeMillis() - startTime));
            }
            int a2 = this.c.a(this.f, this.h);
            if (a2 == 0) {
                a(g.STATE_ON_PLAYER_START_SUCCESS, (WritableMap) null);
                com.dianping.live.live.utils.j.a("MLive_Logan: Player START 启动成功 liveId " + this.s);
                com.dianping.live.live.utils.i.a(com.dianping.live.live.utils.i.c, "START 启动成功");
                if (getCurrentActivity() != null) {
                    long startTime2 = getCurrentActivity().getStartTime();
                    String str2 = com.dianping.live.live.utils.i.c;
                    com.dianping.live.live.utils.i.a(str2, "startPlay success:" + (System.currentTimeMillis() - startTime2));
                    return;
                }
                return;
            }
            if (getCurrentActivity() != null && getCurrentActivity().getMLivePlayerStatusMonitor() != null) {
                getCurrentActivity().getMLivePlayerStatusMonitor().a(this.s, -4.0d);
            }
            if (a2 == -1) {
                a(g.STATE_ON_PLAY_URL_NULL, (WritableMap) null);
                com.dianping.live.live.utils.j.a("MLive_Logan: Player START 启动失败，playUrl 为空 liveId " + this.s);
            } else if (a2 == -2) {
                a(g.STATE_ON_PLAY_URL_ILLEGAL, (WritableMap) null);
                com.dianping.live.live.utils.j.a("MLive_Logan: Player START 启动失败，playUrl 非法 liveId " + this.s);
            } else if (a2 == -3) {
                a(g.STATE_ON_PLAY_TYPE_ILLEGAL, (WritableMap) null);
                com.dianping.live.live.utils.j.a("MLive_Logan: Player START 启动失败，playType 非法 liveId " + this.s);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3402e9f2d0762336bf5e9a631bd979df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3402e9f2d0762336bf5e9a631bd979df");
        } else if (this.c == null || this.c.d) {
        } else {
            this.c.a((com.sankuai.meituan.mtlive.player.library.b) null);
            this.c.a(true);
            this.u = false;
            com.dianping.live.live.utils.j.a("MLive_Logan: Player stopPlay has called liveId " + this.s);
            if (this.l) {
                com.dianping.live.live.utils.j.a(getContext());
            }
        }
    }

    private void setMode(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85957091dea3a7c62258510d10a2f00a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85957091dea3a7c62258510d10a2f00a");
        } else if (readableMap.hasKey(JsBridgeResult.ARG_KEY_LOCATION_MODE)) {
            a(this.d, readableMap.getString(JsBridgeResult.ARG_KEY_LOCATION_MODE));
        }
    }

    private void setMuted(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bad4c446bb0963cb9eeb891f99612fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bad4c446bb0963cb9eeb891f99612fa");
        } else if (readableMap.hasKey("muted")) {
            a(this.c, readableMap.getBoolean("muted"));
        }
    }

    private void setOrientation(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815b34e91853580ada0b0ace53377965", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815b34e91853580ada0b0ace53377965");
        } else if (readableMap.hasKey(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION)) {
            a(this.c, readableMap.getString(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION));
        }
    }

    private void setObjectFit(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "192324b1bb27e1df368cecda4dbd0c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "192324b1bb27e1df368cecda4dbd0c7b");
        } else if (readableMap.hasKey("objectFit")) {
            b(this.c, readableMap.getString("objectFit"));
        }
    }

    private void setMinCache(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8a3687eb180e5d0a20a56943d6d572d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8a3687eb180e5d0a20a56943d6d572d");
        } else if (readableMap.hasKey("minCache")) {
            a(this.d, readableMap.getInt("minCache"));
        }
    }

    private void setMaxCache(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510569e7a4098113d79a5bc143935314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510569e7a4098113d79a5bc143935314");
        } else if (readableMap.hasKey("maxCache")) {
            b(this.d, readableMap.getInt("maxCache"));
        }
    }

    private void setNetworkStatusSwitch(ReadableMap readableMap) {
        boolean z = true;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b0535133e89eda214ae84213c00d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b0535133e89eda214ae84213c00d6d");
        } else {
            this.i = (readableMap.hasKey("networkStatusSwitch") && readableMap.getBoolean("networkStatusSwitch")) ? false : false;
        }
    }

    private void setEnableAEC(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf6a31444594ad9eedaac0ae6960051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf6a31444594ad9eedaac0ae6960051");
        } else if (readableMap.hasKey("enableAEC")) {
            a(this.d, readableMap.getBoolean("enableAEC"));
        }
    }

    public final void a(com.sankuai.meituan.mtlive.player.library.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fcf947d045e32860e1e50dfda7f2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fcf947d045e32860e1e50dfda7f2cb");
        } else if (!FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
            if (!"fluent".equals(str)) {
                if ("fast".equals(str)) {
                    dVar.b = true;
                    dVar.f = 1.0f;
                    dVar.d = 1.0f;
                    return;
                }
                return;
            }
            dVar.b = false;
            dVar.f = 5.0f;
            dVar.d = 5.0f;
        } else {
            dVar.b = true;
            dVar.f = 1.0f;
            dVar.d = 5.0f;
        }
    }

    public final void a(d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822aa1995a65b1f620ac811b6e1d764c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822aa1995a65b1f620ac811b6e1d764c");
        } else if ("vertical".equals(str)) {
            dVar.b(0);
        } else if ("horizontal".equals(str)) {
            dVar.b(270);
        }
    }

    public final void b(d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a87d5f937124241be0ca49446c2c29ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a87d5f937124241be0ca49446c2c29ba");
        } else if ("contain".equals(str)) {
            dVar.a(1);
        } else if ("fillCrop".equals(str)) {
            dVar.a(0);
        }
    }

    public void setReactContext(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff39cfee4e9c78070002da3dcc0a606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff39cfee4e9c78070002da3dcc0a606");
            return;
        }
        this.b = aoVar;
        if (getCurrentActivity() != null) {
            NetWorkStateReceiver playerNetWorkStateReceiver = getCurrentActivity().getPlayerNetWorkStateReceiver();
            if (playerNetWorkStateReceiver == null) {
                playerNetWorkStateReceiver = new NetWorkStateReceiver(new NetWorkStateReceiver.a() { // from class: com.dianping.live.live.mrn.MLivePlayerView.4
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.live.live.utils.NetWorkStateReceiver.a
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55bc7b70f7abdcbb46c2b4ad0e811e3e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55bc7b70f7abdcbb46c2b4ad0e811e3e");
                            return;
                        }
                        MLivePlayerView.this.j = i != 0;
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("available", MLivePlayerView.this.j ? "1" : "0");
                        MLivePlayerView.this.a(g.STATE_ON_NETWORK_AVAILABLE, createMap);
                        StringBuilder sb = new StringBuilder("MLive_Logan: Player NETWORK ");
                        sb.append(MLivePlayerView.this.j ? "网络已连接" : "网络已断开");
                        sb.append(" liveId ");
                        sb.append(MLivePlayerView.this.s);
                        com.dianping.live.live.utils.j.a(sb.toString());
                        String unused = MLivePlayerView.this.n;
                        new StringBuilder("NETWORK ").append(MLivePlayerView.this.j ? "网络已连接" : "网络已断开");
                        if (MLivePlayerView.this.k && MLivePlayerView.this.j && MLivePlayerView.this.o < MLivePlayerView.this.p) {
                            MLivePlayerView.this.a(g.STATE_ON_NETWORK_AVAILABLE_RESTART, (WritableMap) null);
                            com.dianping.live.live.utils.j.a("MLive_Logan: Player RECONNECT 监听到网络重连准备开始重启 liveId " + MLivePlayerView.this.s);
                            String unused2 = MLivePlayerView.this.n;
                            MLivePlayerView.this.b();
                            MLivePlayerView.this.a();
                            MLivePlayerView.b(MLivePlayerView.this, false);
                            MLivePlayerView.k(MLivePlayerView.this);
                        }
                    }
                });
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(playerNetWorkStateReceiver, intentFilter);
            getCurrentActivity().setPlayerNetWorkStateReceiver(playerNetWorkStateReceiver);
        }
    }

    public ao getReactContext() {
        return this.b;
    }

    public void setmLivePlayer(d dVar) {
        this.c = dVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cefd9e5c76676954e696ede321ec2de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cefd9e5c76676954e696ede321ec2de");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (this.g && ((width < this.q || height < this.r) && this.c != null && !this.c.d)) {
            this.g = false;
            this.c.a(this);
        }
        this.q = width;
        this.r = height;
        new StringBuilder().append(height);
    }

    public a getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4abb416d5fdd7ded28505b9698593c77", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4abb416d5fdd7ded28505b9698593c77");
        }
        if (getReactContext() == null || getReactContext().getCurrentActivity() == null || !(getReactContext().getCurrentActivity() instanceof a)) {
            return null;
        }
        return (a) getReactContext().getCurrentActivity();
    }

    public final void a(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94e4f67f96a4550203389ae8efd620cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94e4f67f96a4550203389ae8efd620cb");
        } else if (dVar == null || dVar.d) {
        } else {
            dVar.c(z);
        }
    }

    public final void a(com.sankuai.meituan.mtlive.player.library.d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d719a3796d3307c531960a21d8a7ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d719a3796d3307c531960a21d8a7ec");
        } else {
            dVar.f = i;
        }
    }

    public final void b(com.sankuai.meituan.mtlive.player.library.d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e47910e905836ef459015a1a0801f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e47910e905836ef459015a1a0801f1");
        } else {
            dVar.d = i;
        }
    }

    public final void a(com.sankuai.meituan.mtlive.player.library.d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965aecf4907a47364dbb95444c1f455c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965aecf4907a47364dbb95444c1f455c");
        } else {
            dVar.i = z;
        }
    }
}
