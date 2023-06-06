package com.tencent.rtmp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.service.FileUtil;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.common.CommonConstant;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.audio.TXCLiveBGMPlayer;
import com.tencent.liteav.audio.g;
import com.tencent.liteav.audio.h;
import com.tencent.liteav.audio.impl.TXCAudioEngineJNI;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.license.f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.opengl.p;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.d;
import com.tencent.liteav.e;
import com.tencent.liteav.i;
import com.tencent.liteav.muxer.c;
import com.tencent.liteav.network.TXCStreamUploader;
import com.tencent.liteav.network.l;
import com.tencent.liteav.qos.TXCQoS;
import com.tencent.liteav.s;
import com.tencent.liteav.screencapture.a;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b implements g, com.tencent.liteav.basic.c.b, d.a, com.tencent.liteav.qos.a {
    private static final String d = "b";
    private TXRecordCommon.ITXVideoRecordListener N;
    TXLivePusher.OnBGMNotify a;
    private TXCloudVideoView e;
    private TXLivePushConfig f;
    private TXLivePusher.VideoCustomProcessListener i;
    private TXLivePusher.AudioCustomProcessListener j;
    private i k;
    private d l;
    private Context n;
    private Handler o;
    private ITXLivePushListener g = null;
    private int h = -1;
    private TXCStreamUploader m = null;
    private TXCQoS p = null;
    private e q = null;
    private String r = "";
    private String s = "";
    private boolean t = false;
    private int u = -1;
    private int v = -1;
    private boolean w = false;
    private boolean x = false;
    private HashSet<String> y = new HashSet<>();
    private HashMap<Integer, Long> z = new HashMap<>();
    final TXAudioEffectManager.TXVoiceReverbType[] b = {TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7};
    final TXAudioEffectManager.TXVoiceChangerType[] c = {TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11};
    private ArrayList<C1495b> A = new ArrayList<>();
    private TXLivePusher.ITXAudioVolumeEvaluationListener B = null;
    private int C = 0;
    private com.tencent.liteav.basic.c.a D = new com.tencent.liteav.basic.c.a() { // from class: com.tencent.rtmp.b.1
        @Override // com.tencent.liteav.basic.c.a
        public void onEvent(String str, int i, String str2, String str3) {
            String str4 = b.d;
            TXCLog.i(str4, "onEvent => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
            if (b.this.g != null) {
                Bundle bundle = new Bundle();
                bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    bundle.putCharSequence("EVT_MSG", sb.toString());
                }
                b.this.onNotifyEvent(i, bundle);
            }
        }

        @Override // com.tencent.liteav.basic.c.a
        public void onWarning(String str, int i, String str2, String str3) {
            String str4 = b.d;
            TXCLog.i(str4, "onWarning => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
            if (b.this.g != null) {
                Bundle bundle = new Bundle();
                bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    bundle.putCharSequence("EVT_MSG", sb.toString());
                }
                b.this.onNotifyEvent(i, bundle);
            }
        }

        @Override // com.tencent.liteav.basic.c.a
        public void onError(String str, int i, String str2, String str3) {
            String str4 = b.d;
            TXCLog.e(str4, "onError => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
            if (b.this.g != null) {
                Bundle bundle = new Bundle();
                bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    bundle.putCharSequence("EVT_MSG", sb.toString());
                }
                b.this.onNotifyEvent(i, bundle);
            }
        }
    };
    private final s E = new s() { // from class: com.tencent.rtmp.b.7
        @Override // com.tencent.liteav.s
        public void onGLContextCreated() {
        }

        @Override // com.tencent.liteav.s
        public int onProcessVideoFrame(int i, int i2, int i3, int i4) {
            return b.this.i != null ? b.this.i.onTextureCustomProcess(i, i2, i3) : i;
        }

        @Override // com.tencent.liteav.s
        public void onGLContextReadyToDestory() {
            if (b.this.i != null) {
                b.this.i.onTextureDestoryed();
            }
        }
    };
    private h F = new h() { // from class: com.tencent.rtmp.b.8
        @Override // com.tencent.liteav.audio.h
        public void onPlayStart() {
            if (b.this.a != null) {
                b.this.a.onBGMStart();
            }
        }

        @Override // com.tencent.liteav.audio.h
        public void onPlayEnd(int i) {
            if (b.this.a != null) {
                b.this.a.onBGMComplete(i);
            }
        }

        @Override // com.tencent.liteav.audio.h
        public void onPlayProgress(long j, long j2) {
            if (b.this.a != null) {
                b.this.a.onBGMProgress(j, j2);
            }
        }
    };
    private a G = null;
    private Runnable H = new Runnable() { // from class: com.tencent.rtmp.b.9
        @Override // java.lang.Runnable
        public void run() {
            b.this.t = false;
        }
    };
    private c I = null;
    private boolean J = false;
    private String K = "";
    private long L = 0;
    private boolean M = false;
    private boolean O = false;

    private int b(boolean z, boolean z2) {
        if (z) {
            return z2 ? 1 : 0;
        }
        return -1;
    }

    private String g(int i) {
        switch (i) {
            case 0:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 1:
                return "WIFI";
            case 2:
                return "4G";
            case 3:
                return "3G";
            case 4:
                return "2G";
            case 5:
                return "WIRED";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    @Override // com.tencent.liteav.qos.a
    public int onGetVideoQueueMaxCount() {
        return 5;
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordError(int i, String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.tencent.rtmp.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1495b {
        long a;
        byte[] b;

        private C1495b() {
        }
    }

    public b(Context context) {
        this.f = null;
        this.k = null;
        this.l = null;
        this.n = null;
        this.o = null;
        boolean z = false;
        this.f = new TXLivePushConfig();
        this.k = new i();
        this.n = context.getApplicationContext();
        TXCCommonUtil.setAppContext(this.n);
        TXCLog.init();
        this.o = new Handler(Looper.getMainLooper());
        com.tencent.liteav.basic.d.c.a().a(this.n);
        TXCAudioEngine.CreateInstance(this.n, J());
        TXCAudioEngine.getInstance().clean();
        TXCAudioEngine.getInstance().addEventCallback(new WeakReference<>(this.D));
        long a2 = com.tencent.liteav.basic.d.c.a().a("Audio", "EnableAutoRestartDevice");
        TXCAudioEngine.getInstance().enableAutoRestartDevice((a2 == 1 || a2 == -1) ? true : true);
        this.l = new d(this.n);
        this.l.e(true);
        this.l.a((com.tencent.liteav.basic.c.b) this);
        LicenceCheck.a().b((f) null, this.n);
        TXCTimeUtil.initAppStartTime();
        this.z.put(-1303, 0L);
        this.z.put(1101, 0L);
        this.z.put(1006, 0L);
    }

    public void a(TXLivePushConfig tXLivePushConfig) {
        String str = d;
        TXCLog.i(str, "liteav_api setConfig " + tXLivePushConfig + ", " + this);
        if (tXLivePushConfig == null) {
            tXLivePushConfig = new TXLivePushConfig();
        }
        this.f = tXLivePushConfig;
        b(tXLivePushConfig);
        I();
        Monitor.a(1, String.format("setConfig:[fps:%d][resolution:%d*%d][bitrate:%dkbps][minBitrate:%dkbps][maxBitrate:%dkbps][gop:%d][audioSampleRate:%d][customMode:%d]", Integer.valueOf(this.k.h), Integer.valueOf(this.k.a), Integer.valueOf(this.k.b), Integer.valueOf(this.k.c), Integer.valueOf(this.k.e), Integer.valueOf(this.k.d), Integer.valueOf(this.k.i), Integer.valueOf(this.k.s), Integer.valueOf(this.k.R)), "", 0);
    }

    public TXLivePushConfig a() {
        return this.f;
    }

    public void a(ITXLivePushListener iTXLivePushListener) {
        String str = d;
        TXCLog.i(str, "liteav_api setPushListener " + iTXLivePushListener);
        this.g = iTXLivePushListener;
    }

    public void a(TXCloudVideoView tXCloudVideoView) {
        String str = d;
        TXCLog.i(str, "liteav_api startCameraPreview " + tXCloudVideoView + ", " + this);
        StringBuilder sb = new StringBuilder("startCameraPreview [view:");
        sb.append(tXCloudVideoView != null ? tXCloudVideoView.hashCode() : 0);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        Monitor.a(1, sb.toString(), "", 0);
        a(this.f);
        if (this.k.M) {
            TXCLog.e(d, "enable pure audio push , so can not start preview!");
            return;
        }
        if (this.e != tXCloudVideoView && this.e != null) {
            this.e.removeVideoView();
        }
        this.e = tXCloudVideoView;
        if (this.l == null) {
            this.l = new d(this.n);
        }
        this.l.a((com.tencent.liteav.basic.c.b) this);
        this.l.a((d.a) this);
        this.l.a(tXCloudVideoView);
        this.l.b(this.f.mBeautyLevel, this.f.mWhiteningLevel, this.f.mRuddyLevel);
        LicenceCheck.a().b((f) null, this.n);
    }

    public void a(boolean z) {
        String str = d;
        TXCLog.i(str, "liteav_api stopCameraPreview " + z + ", " + this);
        Monitor.a(1, "stopCameraPreview", "", 0);
        if (this.l == null) {
            return;
        }
        this.l.d(z);
    }

    public int a(String str) {
        String str2 = d;
        TXCLog.i(str2, "liteav_api startPusher " + this);
        if (!this.w) {
            this.w = LicenceCheck.a().b((f) null, this.n) == 0;
        }
        if (!this.w) {
            String str3 = d;
            TXCLog.i(str3, "liteav_api startPusher error licence expired" + this);
            return -5;
        } else if (TextUtils.isEmpty(str)) {
            String str4 = d;
            TXCLog.e(str4, "start push error when url is empty " + this);
            return -1;
        } else {
            if (!TextUtils.isEmpty(this.r) && e()) {
                if (this.r.equalsIgnoreCase(str)) {
                    String str5 = d;
                    TXCLog.w(str5, "ignore start push when new url is the same with old url  " + this);
                    return -1;
                }
                String str6 = d;
                TXCLog.w(str6, " stop old push when new url is not the same with old url  " + this);
                b();
            }
            TXCLog.i(d, "================================================================================================================================================");
            TXCLog.i(d, "================================================================================================================================================");
            String str7 = d;
            TXCLog.i(str7, "============= startPush pushUrl = " + str + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "=============");
            TXCLog.i(d, "================================================================================================================================================");
            TXCLog.i(d, "================================================================================================================================================");
            this.r = str;
            g(this.r);
            y();
            E();
            G();
            A();
            C();
            Monitor.a(this.r, 0, "");
            Monitor.a(1, "startPush", "", 0);
            u();
            if (this.e != null) {
                this.e.clearLog();
            }
            if (f(this.r)) {
                this.l.c(true);
            }
            q();
            return 0;
        }
    }

    public void b() {
        String str = d;
        TXCLog.i(str, "liteav_api stopPusher " + this);
        Monitor.a(1, "stopPush", "", 0);
        o();
        v();
        D();
        B();
        F();
        l();
        H();
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioEarMonitoring(false);
        this.x = false;
        this.k.P = false;
        z();
        this.r = "";
        this.y.clear();
        Monitor.a();
        this.l.c(false);
        r();
        TXCAudioEngine.getInstance().clean();
    }

    private boolean f(String str) {
        String[] split;
        try {
            for (String str2 : str.split("[?&]")) {
                if (str2.indexOf("=") != -1) {
                    String[] split2 = str2.split("[=]");
                    if (split2.length == 2) {
                        String str3 = split2[0];
                        String str4 = split2[1];
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && str3.equalsIgnoreCase("enableblackstream")) {
                            return Integer.parseInt(str4) == 1;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            TXCLog.w(d, "parse black stream flag error " + e.toString());
        }
        return false;
    }

    public void c() {
        String str = d;
        TXCLog.i(str, "liteav_api pausePusher " + this);
        Monitor.a(1, "pausePush", "", 0);
        if (this.l != null) {
            this.l.h();
        }
        String str2 = d;
        TXCLog.i(str2, "mPauseFlag:" + this.f.mPauseFlag);
        if ((this.f.mPauseFlag & 2) == 2) {
            TXCAudioEngine.getInstance().pauseAudioCapture(true);
        }
    }

    public void d() {
        String str = d;
        TXCLog.i(str, "liteav_api resumePusher " + this);
        Monitor.a(1, "resumePush", "", 0);
        if (this.l != null) {
            this.l.i();
        }
        TXCAudioEngine.getInstance().resumeAudioCapture();
    }

    public boolean e() {
        if (this.l != null) {
            return this.l.k();
        }
        return false;
    }

    public void a(Surface surface) {
        String str = d;
        TXCLog.i(str, "liteav_api setSurface " + surface);
        if (this.l == null) {
            return;
        }
        this.l.a(surface);
    }

    public void a(int i, int i2) {
        String str = d;
        TXCLog.i(str, "liteav_api setSurfaceSize " + i + CommonConstant.Symbol.COMMA + i2);
        if (this.l == null) {
            return;
        }
        this.l.a(i, i2);
    }

    public void a(float f, float f2) {
        if (this.l != null) {
            this.l.a(f, f2);
        }
    }

    public void f() {
        TXCLog.i(d, "liteav_api startScreenCapture ");
        Monitor.a(1, "startScreenCapture", "", 0);
        if (this.l == null) {
            return;
        }
        this.l.a((a.InterfaceC1461a) null);
    }

    public void g() {
        TXCLog.i(d, "liteav_api stopScreenCapture ");
        Monitor.a(1, "stopScreenCapture", "", 0);
        if (this.l == null) {
            return;
        }
        this.l.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.b.a(int, boolean, boolean):void");
    }

    public void h() {
        TXCLog.i(d, "liteav_api switchCamera ");
        Monitor.a(1, "switchCamera", "", 0);
        if (this.l == null) {
            return;
        }
        this.l.l();
    }

    public boolean b(boolean z) {
        String str = d;
        TXCLog.i(str, "liteav_api setMirror " + z);
        if (this.f != null) {
            this.f.setVideoEncoderXMirror(z);
        }
        if (this.l == null) {
            return false;
        }
        this.l.g(z);
        return true;
    }

    public void a(int i) {
        TXCLog.i(d, "liteav_api setRenderRotation ");
        if (this.l == null) {
            return;
        }
        this.l.g(i);
    }

    public boolean c(boolean z) {
        String str = d;
        TXCLog.i(str, "liteav_api turnOnFlashLight " + z);
        if (this.l == null) {
            return false;
        }
        return this.l.f(z);
    }

    public int i() {
        if (this.l == null) {
            return 0;
        }
        return this.l.r();
    }

    public boolean b(int i) {
        String str = d;
        TXCLog.i(str, "liteav_api setZoom " + i);
        if (this.l == null) {
            return false;
        }
        return this.l.i(i);
    }

    public void a(float f) {
        String str = d;
        TXCLog.i(str, "liteav_api setExposureCompensation " + f);
        if (this.l == null) {
            return;
        }
        this.l.a(f);
    }

    public boolean a(int i, int i2, int i3, int i4) {
        if (this.l != null) {
            this.l.h(i);
            this.l.b(i2, i3, i4);
        }
        if (this.f != null) {
            this.f.mBeautyLevel = i2;
            this.f.mWhiteningLevel = i3;
            this.f.mRuddyLevel = i4;
            return true;
        }
        return true;
    }

    public TXBeautyManager j() {
        if (this.l == null) {
            this.l = new d(this.n);
        }
        return this.l.b();
    }

    public void d(boolean z) {
        String str = d;
        TXCLog.i(str, "liteav_api setMute " + z);
        StringBuilder sb = new StringBuilder("setMute:");
        sb.append(z ? "true" : "false");
        Monitor.a(1, sb.toString(), "", 0);
        this.x = z;
        TXCAudioEngine.getInstance().muteLocalAudio(z);
        if (!this.f.mEnablePureAudioPush || this.m == null) {
            return;
        }
        this.m.setAudioMute(z);
    }

    public void a(TXLivePusher.OnBGMNotify onBGMNotify) {
        String str = d;
        TXCLog.i(str, "liteav_api setBGMNofify " + onBGMNotify);
        this.a = onBGMNotify;
        if (this.a != null) {
            TXCLiveBGMPlayer.getInstance().setOnPlayListener(this.F);
        } else {
            TXCLiveBGMPlayer.getInstance().setOnPlayListener(null);
        }
    }

    public boolean b(String str) {
        String str2 = d;
        TXCLog.i(str2, "liteav_api playBGM " + str);
        return TXCLiveBGMPlayer.getInstance().startPlay(str);
    }

    public boolean k() {
        TXCLog.i(d, "liteav_api stopBGM ");
        return TXCLiveBGMPlayer.getInstance().stopPlay();
    }

    public void l() {
        TXCLog.i(d, "liteav_api stopAllBGM ");
        TXCLiveBGMPlayer.getInstance().stopAll();
    }

    public boolean m() {
        TXCLog.i(d, "liteav_api pauseBGM ");
        return TXCLiveBGMPlayer.getInstance().pause();
    }

    public boolean n() {
        TXCLog.i(d, "liteav_api resumeBGM ");
        return TXCLiveBGMPlayer.getInstance().resume();
    }

    public int c(String str) {
        return TXCLiveBGMPlayer.getInstance().getBGMDuration(str);
    }

    public boolean b(float f) {
        String str = d;
        TXCLog.i(str, "liteav_api setBGMVolume " + f);
        return TXCLiveBGMPlayer.getInstance().setVolume(f);
    }

    public boolean c(float f) {
        String str = d;
        TXCLog.i(str, "liteav_api setMicVolume " + f);
        return TXCAudioEngine.getInstance().setSoftwareCaptureVolume(f);
    }

    public void d(float f) {
        String str = d;
        TXCLog.i(str, "liteav_api setBGMPitch " + f);
        TXCLiveBGMPlayer.getInstance().setPitch(f);
    }

    public boolean c(int i) {
        TXCLiveBGMPlayer.getInstance().setBGMPosition(i);
        return true;
    }

    public void d(int i) {
        String str = d;
        TXCLog.i(str, "liteav_api setReverb " + i);
        if (i < 0 || i > 7) {
            String str2 = d;
            TXCLog.e(str2, "reverbType not support :" + i);
            return;
        }
        TXCAudioEngine.getInstance().setReverbType(this.b[i]);
    }

    public void e(int i) {
        String str = d;
        TXCLog.i(str, "liteav_api setVoiceChangerType " + i);
        if (i < 0 || i > 11) {
            String str2 = d;
            TXCLog.e(str2, "voiceChangerType not support :" + i);
            return;
        }
        TXCAudioEngine.getInstance().setVoiceChangerType(this.c[i]);
    }

    public void a(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.B = iTXAudioVolumeEvaluationListener;
    }

    public void f(int i) {
        String str = d;
        TXCLog.i(str, "liteav_api enableAudioVolumeEvaluation intervalMs = " + i);
        Monitor.a(1, "liteav_api enableAudioVolumeEvaluation intervalMs = " + i, "", 0);
        if (i > 0) {
            if (i < 100) {
                i = 100;
            }
            this.C = i;
            q();
            return;
        }
        this.C = 0;
        r();
    }

    private void q() {
        if (this.C <= 0 || !e()) {
            return;
        }
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(true, 300);
        if (this.G == null) {
            this.G = new a();
        }
        this.G.a(this.C);
        if (this.o != null) {
            this.o.removeCallbacks(this.G);
            this.o.postDelayed(this.G, this.C);
        }
    }

    private void r() {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(false, 300);
        if (this.G != null) {
            this.G.a(0);
        }
        if (this.o != null) {
            this.o.removeCallbacks(this.G);
        }
        this.G = null;
        this.C = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        private int b;

        private a() {
            this.b = 300;
        }

        public void a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.e()) {
                int softwareCaptureVolumeLevel = TXCAudioEngine.getInstance().getSoftwareCaptureVolumeLevel();
                if (b.this.B != null) {
                    b.this.B.onAudioVolumeEvaluationNotify(softwareCaptureVolumeLevel);
                }
            }
            if (b.this.o == null || this.b <= 0) {
                return;
            }
            b.this.o.postDelayed(b.this.G, this.b);
        }
    }

    public void a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        String str = d;
        TXCLog.i(str, "liteav_api setVideoRecordListener " + iTXVideoRecordListener);
        this.N = iTXVideoRecordListener;
    }

    public int d(String str) {
        String str2 = d;
        TXCLog.i(str2, "liteav_api startRecord " + str);
        if (Build.VERSION.SDK_INT < 18) {
            String str3 = d;
            TXCLog.e(str3, "API levl is too low (record need 18, current is" + Build.VERSION.SDK_INT + CommonConstant.Symbol.BRACKET_RIGHT);
            return -3;
        } else if (this.M) {
            TXCLog.w(d, "ignore start record when recording");
            return -1;
        } else if (this.l == null || !this.l.k()) {
            TXCLog.w(d, "ignore start record when not pushing");
            return -2;
        } else {
            TXCLog.w(d, "start record ");
            this.M = true;
            this.K = str;
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            this.I = new c(this.n, 0);
            this.J = false;
            this.I.a(this.K);
            t();
            TXCDRApi.txReportDAU(this.n.getApplicationContext(), com.tencent.liteav.basic.datareport.a.aI);
            if (this.l != null) {
                this.l.u();
            }
            return 0;
        }
    }

    public void o() {
        TXCLog.i(d, "liteav_api stopRecord ");
        if (!this.M || this.I == null) {
            return;
        }
        int b = this.I.b();
        TXCLog.w(d, "start record ");
        this.M = false;
        if (b == 0) {
            final String str = this.K;
            AsyncTask.execute(new Runnable() { // from class: com.tencent.rtmp.b.10
                @Override // java.lang.Runnable
                public void run() {
                    File parentFile = new File(str).getParentFile();
                    String format = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date(System.currentTimeMillis()));
                    String str2 = parentFile + File.separator + String.format("TXUGCCover_%s.jpg", format);
                    com.tencent.liteav.basic.util.g.a(str, str2);
                    b.this.a(str, str2);
                }
            });
            return;
        }
        s();
    }

    public void a(final TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        String str = d;
        TXCLog.i(str, "liteav_api snapshot " + iTXSnapshotListener);
        if (this.t || iTXSnapshotListener == null || this.l == null) {
            return;
        }
        if (this.l != null) {
            this.t = true;
            this.l.a(new p() { // from class: com.tencent.rtmp.b.11
                @Override // com.tencent.liteav.basic.opengl.p
                public void onTakePhotoComplete(Bitmap bitmap) {
                    b.this.a(iTXSnapshotListener, bitmap);
                    b.this.t = false;
                    b.this.o.removeCallbacks(b.this.H);
                }
            });
            this.o.postDelayed(this.H, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            return;
        }
        this.t = false;
    }

    public int a(int i, int i2, int i3) {
        if (this.l != null) {
            return this.l.a(i, i2, i3, ((EGL10) EGLContext.getEGL()).eglGetCurrentContext(), 0L);
        }
        return -1000;
    }

    public int a(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (this.l != null) {
            if (i == 3) {
                i4 = 1;
            } else if (i != 5) {
                return -1000;
            } else {
                i4 = 2;
            }
            return this.l.a(bArr, i4, i2, i3, 0L);
        }
        return -1000;
    }

    public void a(byte[] bArr) {
        TXCAudioEngine.getInstance().sendCustomPCMData(bArr, this.f.mAudioSample, this.f.mAudioChannels);
    }

    public void a(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        String str = d;
        TXCLog.i(str, "liteav_api setVideoProcessListener " + videoCustomProcessListener);
        this.i = videoCustomProcessListener;
        if (this.i == null) {
            if (this.l != null) {
                this.l.a((s) null);
            }
        } else if (this.l != null) {
            this.l.a(this.E);
        }
    }

    public void a(TXLivePusher.AudioCustomProcessListener audioCustomProcessListener) {
        String str = d;
        TXCLog.i(str, "liteav_api setAudioProcessListener " + audioCustomProcessListener);
        this.j = audioCustomProcessListener;
    }

    public boolean b(byte[] bArr) {
        if (bArr.length <= 0 || bArr.length > 2048) {
            return false;
        }
        synchronized (this) {
            if (this.A != null) {
                C1495b c1495b = new C1495b();
                c1495b.a = TXCTimeUtil.generatePtsMS();
                c1495b.b = a(bArr.length, e(bArr));
                this.A.add(c1495b);
            }
        }
        return true;
    }

    @Deprecated
    public void c(byte[] bArr) {
        synchronized (this) {
            if (this.A != null) {
                C1495b c1495b = new C1495b();
                c1495b.a = TXCTimeUtil.generatePtsMS();
                c1495b.b = e(bArr);
                this.A.add(c1495b);
            }
        }
    }

    public void e(String str) {
        TXCLog.i("User", str);
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(final int i, final Bundle bundle) {
        if (this.o != null) {
            this.o.post(new Runnable() { // from class: com.tencent.rtmp.b.12
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.e != null) {
                        b.this.e.setLogText(null, bundle, i);
                    }
                }
            });
        }
        if (i < 0) {
            Monitor.a(3, String.format("%s [errcode:%d]", bundle != null ? bundle.getString("EVT_MSG") : "", Integer.valueOf(i)), "", 0);
        }
        a(i, bundle);
    }

    @Override // com.tencent.liteav.qos.a
    public int onGetEncoderRealBitrate() {
        return TXCStatus.c(this.s, MapConstant.LayerPropertyFlag_MarkerAvoidScreen);
    }

    @Override // com.tencent.liteav.qos.a
    public int onGetQueueInputSize() {
        int c = TXCStatus.c(this.s, 7002);
        if (this.k.P) {
            return c + TXCStatus.c(this.s, 7001);
        }
        return c + TXCStatus.c(this.s, MapConstant.LayerPropertyFlag_MarkerAvoidScreen);
    }

    @Override // com.tencent.liteav.qos.a
    public int onGetQueueOutputSize() {
        if (this.m == null) {
            return 0;
        }
        return TXCStatus.c(this.s, 7004) + TXCStatus.c(this.s, 7003);
    }

    @Override // com.tencent.liteav.qos.a
    public int onGetVideoQueueCurrentCount() {
        return TXCStatus.c(this.s, 7005);
    }

    @Override // com.tencent.liteav.qos.a
    public int onGetVideoDropCount() {
        return TXCStatus.c(this.s, 7007);
    }

    @Override // com.tencent.liteav.qos.a
    public int onGetBandwidthEst() {
        return TXCStatus.c(this.s, 7021);
    }

    @Override // com.tencent.liteav.qos.a
    public void onEncoderParamsChanged(int i, int i2, int i3) {
        if (this.l != null) {
            this.l.a(i, i2, i3);
        }
        if (i2 != 0 && i3 != 0) {
            this.k.a = i2;
            this.k.b = i3;
        }
        if (i != 0) {
            this.k.c = i;
            Monitor.a(2, String.format("Qos: Change [mode:%d][bitrate:%d][videosize:%d*%d]", Integer.valueOf(this.k.f), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)), "", 0);
        }
    }

    @Override // com.tencent.liteav.qos.a
    public void onEnableDropStatusChanged(boolean z) {
        if (this.m != null) {
            this.m.setDropEanble(z);
        }
    }

    @Override // com.tencent.liteav.d.a
    public void onEncVideo(TXSNALPacket tXSNALPacket) {
        if (this.p != null) {
            this.p.setHasVideo(true);
        }
        if (this.m != null && tXSNALPacket != null && tXSNALPacket.nalData != null) {
            synchronized (this) {
                if (this.A != null && !this.A.isEmpty()) {
                    Iterator<C1495b> it = this.A.iterator();
                    int i = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        int i2 = FileUtil.DEFAULT_STREAM_BUFFER_SIZE;
                        if (!hasNext) {
                            break;
                        }
                        C1495b next = it.next();
                        if (next.a > tXSNALPacket.pts) {
                            break;
                        }
                        if (next.b.length <= 10240) {
                            i2 = next.b.length;
                        }
                        i += i2 + 5;
                    }
                    if (i != 0) {
                        byte[] bArr = new byte[i + tXSNALPacket.nalData.length];
                        byte[] bArr2 = new byte[5];
                        Iterator<C1495b> it2 = this.A.iterator();
                        int i3 = 0;
                        int i4 = 0;
                        while (it2.hasNext()) {
                            C1495b next2 = it2.next();
                            if (next2.a > tXSNALPacket.pts) {
                                break;
                            }
                            i4++;
                            int length = next2.b.length <= 10240 ? next2.b.length : FileUtil.DEFAULT_STREAM_BUFFER_SIZE;
                            int i5 = length + 1;
                            bArr2[0] = (byte) ((i5 >> 24) & 255);
                            bArr2[1] = (byte) ((i5 >> 16) & 255);
                            bArr2[2] = (byte) ((i5 >> 8) & 255);
                            bArr2[3] = (byte) (i5 & 255);
                            bArr2[4] = 6;
                            System.arraycopy(bArr2, 0, bArr, i3, 5);
                            int i6 = i3 + 5;
                            System.arraycopy(next2.b, 0, bArr, i6, length);
                            i3 = i6 + length;
                        }
                        for (int i7 = 0; i7 < i4; i7++) {
                            this.A.remove(0);
                        }
                        System.arraycopy(tXSNALPacket.nalData, 0, bArr, i3, tXSNALPacket.nalData.length);
                        tXSNALPacket.nalData = bArr;
                    }
                }
            }
            this.m.pushNAL(tXSNALPacket);
        }
        if (!this.M || this.I == null || tXSNALPacket == null || tXSNALPacket.nalData == null) {
            return;
        }
        byte[] d2 = d(tXSNALPacket.nalData);
        if (!this.J) {
            if (tXSNALPacket.nalType != 0) {
                return;
            }
            MediaFormat a2 = com.tencent.liteav.basic.util.g.a(d2, this.l.d(), this.l.e());
            if (a2 != null) {
                this.I.a(a2);
                this.I.a();
                this.J = true;
                this.L = 0L;
            }
        }
        a(tXSNALPacket, d2);
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
        TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.j;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordRawPcmData(bArr, j, i, i2, i3, z);
        }
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.j;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordPcmData(bArr, j, i, i2, i3);
        }
    }

    @Override // com.tencent.liteav.audio.g
    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
        if (!this.M || this.I == null || !this.J || bArr == null) {
            return;
        }
        this.I.a(bArr, 0, bArr.length, j * 1000, 0);
    }

    @Override // com.tencent.liteav.d.a
    public void onEncVideoFormat(MediaFormat mediaFormat) {
        if (!this.M || this.I == null) {
            return;
        }
        this.I.a(mediaFormat);
        if (this.J) {
            return;
        }
        this.I.a();
        this.J = true;
        this.L = 0L;
    }

    @Override // com.tencent.liteav.d.a
    public void onBackgroudPushStop() {
        TXCAudioEngine.getInstance().resumeAudioCapture();
        TXCAudioEngine.getInstance().muteLocalAudio(false);
    }

    private void s() {
        this.o.post(new Runnable() { // from class: com.tencent.rtmp.b.13
            @Override // java.lang.Runnable
            public void run() {
                TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                tXRecordResult.retCode = -1;
                tXRecordResult.descMsg = "record video failed";
                if (b.this.N != null) {
                    b.this.N.onRecordComplete(tXRecordResult);
                }
                TXCLog.w(b.d, "record complete fail");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final String str2) {
        this.o.post(new Runnable() { // from class: com.tencent.rtmp.b.14
            @Override // java.lang.Runnable
            public void run() {
                TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                tXRecordResult.retCode = 0;
                tXRecordResult.descMsg = "record success";
                tXRecordResult.videoPath = str;
                tXRecordResult.coverPath = str2;
                if (b.this.N != null) {
                    b.this.N.onRecordComplete(tXRecordResult);
                }
                TXCLog.w(b.d, "record complete success");
            }
        });
    }

    @TargetApi(16)
    private void t() {
        MediaFormat a2 = com.tencent.liteav.basic.util.g.a(this.f.mAudioSample, this.f.mAudioChannels, 2);
        if (this.I != null) {
            this.I.b(a2);
        }
    }

    private void a(TXSNALPacket tXSNALPacket, byte[] bArr) {
        int i;
        if (this.L == 0) {
            this.L = tXSNALPacket.pts;
        }
        final long j = tXSNALPacket.pts - this.L;
        if (tXSNALPacket.info == null) {
            i = tXSNALPacket.nalType == 0 ? 1 : 0;
        } else {
            i = tXSNALPacket.info.flags;
        }
        this.I.b(bArr, 0, bArr.length, tXSNALPacket.pts * 1000, i);
        this.o.post(new Runnable() { // from class: com.tencent.rtmp.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.N != null) {
                    b.this.N.onRecordProgress(j);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final TXLivePusher.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
        if (iTXSnapshotListener == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (iTXSnapshotListener != null) {
                    iTXSnapshotListener.onSnapshot(bitmap);
                }
            }
        });
    }

    private void a(boolean z, boolean z2) {
        int b = b(z, z2);
        if (b == -1) {
            this.f.setAutoAdjustBitrate(false);
            this.f.setAutoAdjustStrategy(-1);
            return;
        }
        this.f.setAutoAdjustBitrate(true);
        this.f.setAutoAdjustStrategy(b);
    }

    private void g(String str) {
        if (this.m != null) {
            this.m.setID(str);
        }
        if (this.l != null) {
            this.l.setID(str);
        }
        if (this.q != null) {
            this.q.d(str);
        }
        this.s = str;
    }

    private void u() {
        this.O = true;
        if (this.o != null) {
            this.o.postDelayed(new Runnable() { // from class: com.tencent.rtmp.b.4
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.O) {
                        b.this.x();
                    }
                }
            }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }

    private void v() {
        this.O = false;
    }

    private void w() {
        com.tencent.liteav.a.a(this.s, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        int i;
        w();
        int[] a2 = com.tencent.liteav.basic.util.g.a();
        String str = (a2[0] / 10) + "/" + (a2[1] / 10) + "%";
        int c = TXCStatus.c(this.s, 7004);
        int c2 = TXCStatus.c(this.s, 7003);
        int c3 = TXCStatus.c(this.s, 7002);
        int c4 = TXCStatus.c(this.s, 7001);
        int c5 = TXCStatus.c(this.s, 7007);
        int c6 = TXCStatus.c(this.s, 7005);
        int c7 = TXCStatus.c(this.s, 7006);
        String b = TXCStatus.b(this.s, 7012);
        double d2 = TXCStatus.d(this.s, MapConstant.LayerPropertyFlag_MarkerSpacing);
        int c8 = TXCStatus.c(this.s, MapConstant.LayerPropertyFlag_MarkerHeight);
        Bundle bundle = new Bundle();
        bundle.putInt("NET_SPEED", c2 + c);
        bundle.putInt("VIDEO_FPS", (int) d2);
        if (d2 < 1.0d) {
            d2 = 15.0d;
        }
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_GOP, (int) ((((c8 * 10) / ((int) d2)) / 10.0f) + 0.5d));
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_DROP, c5);
        bundle.putInt("VIDEO_BITRATE", c4);
        bundle.putInt("AUDIO_BITRATE", c3);
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, c7);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE, c6);
        bundle.putCharSequence("SERVER_IP", b);
        bundle.putCharSequence("CPU_USAGE", str);
        if (this.l != null) {
            bundle.putString(TXLiveConstants.NET_STATUS_AUDIO_INFO, TXCAudioEngine.getInstance().getAECType() + " | " + this.f.mAudioSample + " , " + this.f.mAudioChannels);
            bundle.putInt("VIDEO_WIDTH", this.l.d());
            bundle.putInt("VIDEO_HEIGHT", this.l.e());
        }
        if (this.e != null) {
            this.e.setLogText(bundle, null, 0);
        }
        if (this.g != null) {
            this.g.onNetStatus(bundle);
        }
        if (this.q != null) {
            this.q.e();
        }
        int e = com.tencent.liteav.basic.util.g.e(this.n);
        boolean a3 = com.tencent.liteav.basic.util.g.a(this.n);
        if (this.u != e) {
            i = 1;
            Monitor.a(2, String.format("Network: net type change from %s to %s", g(this.u), g(e)), "", 0);
            this.u = e;
        } else {
            i = 1;
        }
        if (this.v != a3) {
            Object[] objArr = new Object[i];
            objArr[0] = a3 == i ? "background" : "foreground";
            Monitor.a(2, String.format("app: switch to %s", objArr), "", 0);
            this.v = a3 ? 1 : 0;
        }
        if (this.o == null || !this.O) {
            return;
        }
        this.o.postDelayed(new Runnable() { // from class: com.tencent.rtmp.b.5
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.O) {
                    b.this.x();
                }
            }
        }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    private void y() {
        l lVar = new l();
        lVar.d = this.f.mAudioChannels;
        lVar.e = this.f.mAudioSample;
        lVar.a = 0;
        lVar.c = 20;
        lVar.b = 0;
        lVar.f = 3;
        lVar.j = true;
        lVar.l = true;
        lVar.k = false;
        lVar.h = 40;
        lVar.i = 5000;
        lVar.m = this.k.P;
        lVar.n = this.k.Q;
        lVar.o = i(this.h);
        this.m = new TXCStreamUploader(this.n, lVar);
        this.m.setID(this.s);
        this.m.setMetaData(this.f.mMetaData);
        if (this.m != null) {
            this.m.setAudioInfo(this.k.s, this.k.t);
        }
        this.m.setNotifyListener(this);
        if (this.k.M) {
            this.m.setAudioMute(this.x);
        }
        this.r = this.m.start(this.r, this.k.N, this.k.O);
        if (this.k.M) {
            this.m.setMode(1);
        }
        if (this.k.P) {
            int i = this.k.q;
            int i2 = this.k.r;
            if (i < 5) {
                i = 5;
            }
            this.m.setRetryInterval(i2 <= 1 ? i2 : 1);
            this.m.setRetryTimes(i);
            this.m.setVideoDropParams(false, this.k.h, 1000);
        } else {
            this.m.setRetryInterval(this.k.r);
            this.m.setRetryTimes(this.k.q);
            this.m.setVideoDropParams(true, 40, 3000);
        }
        this.m.setSendStrategy(this.k.P, this.k.Q);
    }

    private void z() {
        if (this.m != null) {
            this.m.stop();
            this.m.setNotifyListener(null);
            this.m = null;
        }
    }

    private void A() {
        this.p = new TXCQoS(true);
        this.p.setListener(this);
        this.p.setNotifyListener(this);
        this.p.setAutoAdjustBitrate(this.k.g);
        this.p.setAutoAdjustStrategy(this.k.f);
        this.p.setDefaultVideoResolution(this.k.k);
        this.p.setVideoEncBitrate(this.k.e, this.k.d, this.k.c);
        if (this.k.g) {
            this.p.start(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }

    private void B() {
        if (this.p != null) {
            this.p.stop();
            this.p.setListener(null);
            this.p.setNotifyListener(null);
            this.p = null;
        }
    }

    private void C() {
        this.q = new e(this.n);
        this.q.d(this.s);
        this.q.a(this.k.c);
        this.q.b(this.k.s);
        this.q.a(this.k.a, this.k.b);
        this.q.a(this.r);
        this.q.a();
    }

    private void D() {
        if (this.q != null) {
            this.q.b();
            this.q = null;
        }
    }

    private void E() {
        if (this.l != null) {
            this.l.setID(this.s);
            this.l.a((d.a) this);
            this.l.f();
        }
    }

    private void F() {
        if (this.l != null) {
            this.l.a((d.a) null);
            this.l.g();
            this.l.a((d.a) null);
        }
    }

    private void G() {
        TXCAudioEngine.getInstance().setEncoderSampleRate(this.f.mAudioSample);
        TXCAudioEngine.getInstance().setEncoderChannels(this.f.mAudioChannels);
        TXCAudioEngine.getInstance().muteLocalAudio(this.x);
        boolean z = (this.f.mCustomModeType & 1) != 0;
        TXCAudioEngine.getInstance().setAudioCaptureDataListener(this);
        TXCAudioEngineJNI.nativeUseSysAudioDevice(!TXCAudioEngine.hasTrae());
        TXCAudioEngine.getInstance().startLocalAudio(10, z);
        TXCAudioEngine.getInstance().enableEncodedDataCallback(true);
    }

    private void H() {
        TXCAudioEngine.getInstance().stopLocalAudio();
    }

    private void b(TXLivePushConfig tXLivePushConfig) {
        i iVar = this.k;
        iVar.c = tXLivePushConfig.mVideoBitrate;
        iVar.e = tXLivePushConfig.mMinVideoBitrate;
        iVar.d = tXLivePushConfig.mMaxVideoBitrate;
        iVar.f = tXLivePushConfig.mAutoAdjustStrategy;
        iVar.g = tXLivePushConfig.mAutoAdjustBitrate;
        iVar.h = tXLivePushConfig.mVideoFPS;
        iVar.i = tXLivePushConfig.mVideoEncodeGop;
        iVar.j = tXLivePushConfig.mHardwareAccel;
        iVar.k = tXLivePushConfig.mVideoResolution;
        iVar.n = tXLivePushConfig.mEnableVideoHardEncoderMainProfile ? 3 : 1;
        iVar.o = tXLivePushConfig.mLocalVideoMirrorType;
        iVar.s = tXLivePushConfig.mAudioSample;
        iVar.t = tXLivePushConfig.mAudioChannels;
        iVar.u = tXLivePushConfig.mEnableAec;
        iVar.v = tXLivePushConfig.mEnableAgc;
        iVar.w = tXLivePushConfig.mEnableAns;
        iVar.x = tXLivePushConfig.mVolumeType;
        iVar.D = tXLivePushConfig.mPauseFlag;
        iVar.C = tXLivePushConfig.mPauseFps;
        iVar.A = tXLivePushConfig.mPauseImg;
        iVar.B = tXLivePushConfig.mPauseTime;
        iVar.M = tXLivePushConfig.mEnablePureAudioPush;
        iVar.K = tXLivePushConfig.mTouchFocus;
        iVar.L = tXLivePushConfig.mEnableZoom;
        iVar.E = tXLivePushConfig.mWatermark;
        iVar.F = tXLivePushConfig.mWatermarkX;
        iVar.G = tXLivePushConfig.mWatermarkY;
        iVar.H = tXLivePushConfig.mWatermarkXF;
        iVar.I = tXLivePushConfig.mWatermarkYF;
        iVar.J = tXLivePushConfig.mWatermarkWidth;
        iVar.l = tXLivePushConfig.mHomeOrientation;
        iVar.N = tXLivePushConfig.mEnableNearestIP;
        iVar.O = tXLivePushConfig.mRtmpChannelType;
        iVar.q = tXLivePushConfig.mConnectRetryCount;
        iVar.r = tXLivePushConfig.mConnectRetryInterval;
        iVar.m = tXLivePushConfig.mFrontCamera;
        iVar.R = tXLivePushConfig.mCustomModeType;
        iVar.S = tXLivePushConfig.mVideoEncoderXMirror;
        iVar.T = tXLivePushConfig.mEnableHighResolutionCapture;
        iVar.V = tXLivePushConfig.mEnableScreenCaptureAutoRotate;
        iVar.z = tXLivePushConfig.mEnableAudioPreview;
        iVar.a();
    }

    private void I() {
        if (this.l == null) {
            return;
        }
        TXCAudioEngine.getInstance().enableSoftAGC(this.k.v, 100);
        TXCAudioEngine.getInstance().enableSoftANS(this.k.w, 100);
        TXCAudioEngine.getInstance();
        TXCAudioEngine.setSystemVolumeType(this.k.x);
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioEarMonitoring(this.k.z);
        this.l.a(this.k);
        this.l.b(this.k.o);
        if (this.l.k()) {
            if (this.m != null) {
                if (this.k.P) {
                    int i = this.k.q;
                    int i2 = this.k.r;
                    if (i < 5) {
                        i = 5;
                    }
                    this.m.setRetryInterval(i2 <= 1 ? i2 : 1);
                    this.m.setRetryTimes(i);
                    this.m.setVideoDropParams(false, this.k.h, 1000);
                } else {
                    this.m.setRetryInterval(this.k.r);
                    this.m.setRetryTimes(this.k.q);
                    this.m.setVideoDropParams(true, 40, 3000);
                }
                this.m.setSendStrategy(this.k.P, this.k.Q);
            }
            if (this.p != null) {
                this.p.stop();
                this.p.setAutoAdjustBitrate(this.k.g);
                this.p.setAutoAdjustStrategy(this.k.f);
                this.p.setDefaultVideoResolution(this.k.k);
                this.p.setVideoEncBitrate(this.k.e, this.k.d, this.k.c);
                if (this.k.g) {
                    this.p.start(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                }
            }
        } else if (this.m != null) {
            this.m.setAudioInfo(this.k.s, this.k.t);
        }
    }

    private void a(final int i, final Bundle bundle) {
        switch (i) {
            case TXLiteAVCode.ERR_RTMP_PUSH_SERVER_REFUSE /* -1326 */:
                i = 3004;
                break;
            case TXLiteAVCode.ERR_RTMP_PUSH_NO_NETWORK /* -1325 */:
            case TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL /* -1324 */:
            case -1307:
            case 3008:
                i = -1307;
                break;
            case TXLiteAVCode.ERR_MIC_NOT_AUTHORIZED /* -1317 */:
            case -1302:
                i = -1302;
                break;
            case TXLiteAVCode.ERR_CAMERA_SET_PARAM_FAIL /* -1315 */:
            case TXLiteAVCode.ERR_CAMERA_NOT_AUTHORIZED /* -1314 */:
            case -1301:
                i = -1301;
                break;
            case -1313:
                i = -1313;
                break;
            case -1309:
            case -1308:
            case 1003:
            case 1004:
            case 1005:
            case 1006:
            case 1007:
            case 3001:
                break;
            case -1303:
                i = -1303;
                break;
            case 0:
                return;
            case 1001:
                i = 1001;
                break;
            case 1002:
                i = 1002;
                break;
            case 1008:
            case TXLiteAVCode.EVT_HW_ENCODER_START_SUCC /* 1027 */:
            case TXLiteAVCode.EVT_SW_ENCODER_START_SUCC /* 1028 */:
                i = 1008;
                break;
            case 1018:
                i = 1018;
                break;
            case 1019:
                i = 1019;
                break;
            case 1020:
                i = 1020;
                break;
            case 1021:
                i = 1021;
                break;
            case 1101:
                i = 1101;
                break;
            case 1102:
                i = 1102;
                break;
            case 1103:
                i = 1103;
                break;
            case 1109:
                return;
            case 2003:
                return;
            case 2009:
                return;
            case 2110:
                i = 2110;
                break;
            case 3002:
                i = 3002;
                break;
            case 3003:
                i = 3003;
                break;
            case 3006:
            case 3007:
                i = 3005;
                break;
            default:
                return;
        }
        if (this.o != null) {
            this.o.post(new Runnable() { // from class: com.tencent.rtmp.b.6
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.g != null) {
                        b.this.g.onPushEvent(i, bundle);
                    }
                }
            });
        }
    }

    private byte[] d(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 >= length) {
                return bArr2;
            }
            int i3 = ByteBuffer.wrap(bArr, i, 4).getInt();
            if (i2 + i3 <= length) {
                bArr2[i] = 0;
                bArr2[i + 1] = 0;
                bArr2[i + 2] = 0;
                bArr2[i + 3] = 1;
            }
            i = i + i3 + 4;
        }
    }

    private byte[] e(byte[] bArr) {
        int length = ((bArr.length * 4) / 3) + 2;
        byte[] bArr2 = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length && i2 < length) {
            if (i + 3 < bArr.length && bArr[i] == 0) {
                int i3 = i + 1;
                if (bArr[i3] == 0) {
                    int i4 = i + 2;
                    if (bArr[i4] >= 0 && bArr[i4] <= 3) {
                        int i5 = i2 + 1;
                        bArr2[i2] = bArr[i];
                        int i6 = i5 + 1;
                        int i7 = i3 + 1;
                        bArr2[i5] = bArr[i3];
                        int i8 = i6 + 1;
                        bArr2[i6] = 3;
                        i = i7;
                        i2 = i8;
                    }
                }
            }
            bArr2[i2] = bArr[i];
            i++;
            i2++;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr2, 0, bArr3, 0, i2);
        return bArr3;
    }

    private byte[] a(int i, byte[] bArr) {
        byte[] h = h(i);
        byte[] bArr2 = new byte[h.length + 1 + bArr.length + 1];
        bArr2[0] = -14;
        System.arraycopy(h, 0, bArr2, 1, h.length);
        int length = h.length + 1;
        System.arraycopy(bArr, 0, bArr2, length, bArr.length);
        bArr2[length + bArr.length] = Byte.MIN_VALUE;
        return bArr2;
    }

    private byte[] h(int i) {
        int i2 = (i / 255) + 1;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i3 < i4) {
                bArr[i3] = -1;
                i3++;
            } else {
                bArr[i4] = (byte) ((i % 255) & 255);
                return bArr;
            }
        }
    }

    private int i(int i) {
        switch (i) {
            case 1:
                return (int) com.tencent.liteav.basic.d.c.a().a("QUICMode", "Live");
            case 2:
                return (int) com.tencent.liteav.basic.d.c.a().a("QUICMode", "Live");
            case 3:
                return (int) com.tencent.liteav.basic.d.c.a().a("QUICMode", "Live");
            case 4:
                return (int) com.tencent.liteav.basic.d.c.a().a("QUICMode", "LinkMain");
            case 5:
                return (int) com.tencent.liteav.basic.d.c.a().a("QUICMode", "LinkSub");
            case 6:
                return (int) com.tencent.liteav.basic.d.c.a().a("QUICMode", "RTC");
            case 7:
                return (int) com.tencent.liteav.basic.d.c.a().a("QUICMode", "Live");
            default:
                return 0;
        }
    }

    private String J() {
        com.tencent.liteav.basic.d.c a2 = com.tencent.liteav.basic.d.c.a();
        String c = a2.c();
        return !TextUtils.isEmpty(c) ? c : TXCAudioEngine.buildTRAEConfig(this.n, null, a2.j(), a2.k());
    }
}
