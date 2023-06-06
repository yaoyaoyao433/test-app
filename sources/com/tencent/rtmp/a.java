package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.p;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.j;
import com.tencent.liteav.m;
import com.tencent.liteav.t;
import com.tencent.liteav.u;
import com.tencent.liteav.v;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements com.tencent.liteav.basic.c.b {
    private long A;
    private String B;
    private TXLivePlayer.ITXAudioRawDataListener I;
    private TXCloudVideoView a;
    private Surface b;
    private int c;
    private int d;
    private TXLivePlayConfig f;
    private int i;
    private int j;
    private Context r;
    private Handler s;
    private t t;
    private m y;
    private boolean z;
    private boolean g = false;
    private boolean h = true;
    private String k = "";
    private boolean l = false;
    private int m = 100;
    private TXLivePlayer.ITXVideoRawDataListener n = null;
    private byte[] o = null;
    private Object p = null;
    private TXLivePlayer.ITXLivePlayVideoRenderListener q = null;
    private boolean u = true;
    private float v = 1.0f;
    private boolean w = false;
    private int x = 0;
    private int C = -1;
    private Vector<String> D = new Vector<>();
    private long E = 0;
    private TXLivePlayer.ITXAudioVolumeEvaluationListener F = null;
    private int G = 0;
    private RunnableC1493a H = null;
    private ITXLivePlayListener e = null;

    public a(Context context) {
        this.r = context.getApplicationContext();
        TXCCommonUtil.setAppContext(this.r);
        TXCLog.init();
        this.s = new Handler(Looper.getMainLooper());
        TXCCommonUtil.setAppContext(this.r);
        TXCLog.init();
    }

    public void a(TXLivePlayConfig tXLivePlayConfig) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setConfig " + this);
        this.f = tXLivePlayConfig;
        if (this.f == null) {
            this.f = new TXLivePlayConfig();
        }
        if (this.t != null) {
            j q = this.t.q();
            if (q == null) {
                q = new j();
            }
            q.a = this.f.mCacheTime;
            q.g = this.f.mAutoAdjustCacheTime;
            q.c = this.f.mMinAutoAdjustCacheTime;
            q.b = this.f.mMaxAutoAdjustCacheTime;
            q.d = this.f.mVideoBlockThreshold;
            q.e = this.f.mConnectRetryCount;
            q.f = this.f.mConnectRetryInterval;
            q.i = this.f.mEnableNearestIP;
            q.m = this.f.mRtmpChannelType;
            q.h = this.g;
            q.n = this.f.mCacheFolderPath;
            q.o = this.f.mMaxCacheItems;
            q.j = this.f.mEnableMessage;
            q.k = this.f.mEnableMetaData;
            q.l = this.f.mFlvSessionKey;
            q.q = this.f.mHeaders;
            TXCLog.i(TXLivePlayer.TAG, "liteav_api setConfig [cacheTime:" + this.f.mCacheTime + "][autoAdjustCacheTime:" + this.f.mAutoAdjustCacheTime + "][minAutoAdjustCacheTime:" + this.f.mMinAutoAdjustCacheTime + "][maxAutoAdjustCacheTime:" + this.f.mMaxAutoAdjustCacheTime + "][videoBlockThreshold:" + this.f.mVideoBlockThreshold + "][connectRetryCount:" + this.f.mConnectRetryCount + "][connectRetryInterval:" + this.f.mConnectRetryInterval + "][enableHWDec:" + this.g + "][enableMessage:" + this.f.mEnableMessage + "][enableMetaData:" + this.f.mEnableMetaData + "][flvSessionKey:" + this.f.mFlvSessionKey);
            this.t.a(q);
        }
    }

    public void a(ITXLivePlayListener iTXLivePlayListener) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setPlayListener " + this);
        this.e = iTXLivePlayListener;
    }

    public void a(TXCloudVideoView tXCloudVideoView) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setPlayerView old view : " + this.a + ", new view : " + tXCloudVideoView + ", " + this);
        this.a = tXCloudVideoView;
        if (this.t != null) {
            this.t.a(tXCloudVideoView);
        }
    }

    public int a(String str, int i) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api startPlay " + this);
        if (TextUtils.isEmpty(str)) {
            TXCLog.e(TXLivePlayer.TAG, "start play error when url is empty " + this);
            return -1;
        }
        if (!TextUtils.isEmpty(this.k)) {
            if (this.k.equalsIgnoreCase(str) && a()) {
                TXCLog.e(TXLivePlayer.TAG, "start play error when new url is the same with old url  " + this);
                if (this.z) {
                    onNotifyEvent(2004, new Bundle());
                }
                return this.z ? 0 : -1;
            }
            TXCLog.w(TXLivePlayer.TAG, " stop old play when new url is not the same with old url  " + this);
            if (this.t != null) {
                this.t.a(false);
            }
            this.k = "";
        }
        TXCDRApi.initCrashReport(this.r);
        TXCLog.i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.i(TXLivePlayer.TAG, "=====  StartPlay url = " + str + " playType = " + i + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        if (this.C == -1 || this.C != i) {
            this.t = v.a(this.r, i);
        }
        this.C = i;
        if (this.t == null) {
            TXCLog.i(TXLivePlayer.TAG, "liteav_api startPlay create palyer failed" + this);
            return -2;
        }
        this.k = c(str, i);
        a(this.f);
        if (this.a != null) {
            this.a.clearLog();
            this.a.setVisibility(0);
        }
        this.t.a(this.a);
        this.t.a(this);
        this.t.e(this.u);
        if (this.b != null) {
            this.t.a(this.b);
            this.t.a(this.c, this.d);
        }
        this.t.a(this.k, i);
        this.t.b(this.l);
        this.t.c(this.m);
        this.t.b(this.v);
        this.t.b(this.j);
        this.t.a(this.i);
        d(this.x);
        this.t.a(this.I);
        if (this.n != null) {
            a(this.n);
        }
        if (this.q != null) {
            a(this.q, this.p);
        }
        if (this.t.f()) {
            this.B = this.k;
            this.A = this.y != null ? this.y.a() : 0L;
            if (this.A > 0) {
                this.t.g();
            }
        }
        f();
        return 0;
    }

    public int a(boolean z) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api stopPlay " + z + ", " + this);
        if (z && this.a != null) {
            this.a.setVisibility(8);
        }
        g();
        if (this.t != null) {
            this.t.a(z);
        }
        this.k = "";
        this.A = 0L;
        this.y = null;
        this.z = false;
        return 0;
    }

    public boolean a() {
        if (this.t != null) {
            return this.t.c();
        }
        return false;
    }

    public void b() {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api pause " + this);
        if (this.t != null) {
            TXCLog.w(TXLivePlayer.TAG, "pause play");
            this.t.a();
        }
    }

    public void c() {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api resume " + this);
        if (this.t != null) {
            TXCLog.w(TXLivePlayer.TAG, "resume play");
            this.t.b();
            if (this.t.f()) {
                this.A = this.y != null ? this.y.a() : 0L;
                if (this.A > 0) {
                    this.t.g();
                }
            }
            d(this.x);
        }
    }

    public void a(Surface surface) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setSurface old : " + this.b + ", new : " + surface + ", " + this);
        this.b = surface;
        if (this.t != null) {
            this.t.a(this.b);
        }
    }

    public void a(int i, int i2) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setSurfaceSize " + i + Constants.GestureMoveEvent.KEY_X + i2 + ", " + this);
        this.c = i;
        this.d = i2;
        if (this.t != null) {
            this.t.a(i, i2);
        }
    }

    public void a(int i) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setRenderMode " + i);
        this.i = i;
        if (this.t != null) {
            this.t.a(i);
        }
    }

    public void b(int i) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setRenderRotation " + i);
        this.j = i;
        if (this.t != null) {
            this.t.b(i);
        }
    }

    public boolean b(boolean z) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api enableHardwareDecode " + z);
        if (z) {
            if (Build.VERSION.SDK_INT < 18) {
                TXCLog.e("HardwareDecode", "enableHardwareDecode failed, android system build.version = " + Build.VERSION.SDK_INT + ", the minimum build.version should be 18(android 4.3 or later)");
                return false;
            } else if (h()) {
                TXCLog.e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + Build.MANUFACTURER + ", MODEL" + Build.MODEL);
                return false;
            }
        }
        this.g = z;
        if (this.t != null) {
            j q = this.t.q();
            if (q == null) {
                q = new j();
            }
            q.h = this.g;
            this.t.a(q);
            return true;
        }
        return true;
    }

    public void c(boolean z) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setMute " + z);
        this.l = z;
        if (this.t != null) {
            this.t.b(z);
        }
    }

    public void c(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setVolume volume = " + i);
        this.m = i;
        if (this.t != null) {
            this.t.c(i);
        }
    }

    public void d(int i) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setAudioRoute " + i);
        this.x = i;
        if (this.t != null) {
            this.t.a(this.r, this.x);
        }
    }

    public int a(String str) {
        if (this.t != null) {
            return this.t.a(str);
        }
        return -1;
    }

    public void a(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.F = iTXAudioVolumeEvaluationListener;
    }

    public void e(int i) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api enableAudioVolumeEvaluation intervalMs = " + i);
        if (i > 0) {
            if (i < 100) {
                i = 100;
            }
            this.G = i;
            f();
            return;
        }
        this.G = 0;
        g();
    }

    public void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("api")) {
                TXCLog.e(TXLivePlayer.TAG, "callExperimentalAPI[lack api or illegal type]: " + str);
                return;
            }
            String string = jSONObject.getString("api");
            JSONObject jSONObject2 = jSONObject.has("params") ? jSONObject.getJSONObject("params") : null;
            if (!string.equals("muteRemoteAudioInSpeaker")) {
                TXCLog.e(TXLivePlayer.TAG, "callExperimentalAPI[illegal api]: " + string);
            } else if (jSONObject2 == null) {
                TXCLog.e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]");
            } else if (!jSONObject2.has("enable")) {
                TXCLog.e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]: enable");
            } else {
                int i = jSONObject2.getInt("enable");
                if (this.t != null) {
                    t tVar = this.t;
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    tVar.c(z);
                }
            }
        } catch (Exception unused) {
            TXCLog.e(TXLivePlayer.TAG, "callExperimentalAPI[failed]: " + str);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.rtmp.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class RunnableC1493a implements Runnable {
        private int b;

        private RunnableC1493a() {
            this.b = 300;
        }

        public void a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.t != null && a.this.t.c()) {
                int i = a.this.t.i();
                if (a.this.F != null) {
                    a.this.F.onAudioVolumeEvaluationNotify(i);
                }
            }
            if (a.this.s == null || this.b <= 0) {
                return;
            }
            a.this.s.postDelayed(a.this.H, this.b);
        }
    }

    private void f() {
        if (this.t != null) {
            this.t.a(this.G > 0, this.G);
            if (this.G > 0) {
                if (this.H == null) {
                    this.H = new RunnableC1493a();
                }
                this.H.a(this.G);
                if (this.s != null) {
                    this.s.removeCallbacks(this.H);
                    this.s.postDelayed(this.H, this.G);
                }
            }
        }
    }

    private void g() {
        if (this.t != null) {
            this.t.a(false, 0);
        }
        if (this.s != null) {
            this.s.removeCallbacks(this.H);
        }
        this.H = null;
        this.G = 0;
    }

    public void a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setVideoRecordListener");
        if (this.t != null) {
            this.t.a(iTXVideoRecordListener);
        }
    }

    public int f(int i) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api startRecord " + this);
        if (Build.VERSION.SDK_INT < 18) {
            TXCLog.e(TXLivePlayer.TAG, "API levl is too low (record need 18, current is" + Build.VERSION.SDK_INT + CommonConstant.Symbol.BRACKET_RIGHT);
            return -3;
        } else if (!a()) {
            TXCLog.e(TXLivePlayer.TAG, "startRecord: there is no playing stream");
            return -1;
        } else if (this.t != null) {
            return this.t.d(i);
        } else {
            return -1;
        }
    }

    public int d() {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api stopRecord " + this);
        if (this.t != null) {
            return this.t.e();
        }
        return -1;
    }

    public void a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api snapshot " + iTXSnapshotListener);
        if (this.w || iTXSnapshotListener == null) {
            return;
        }
        this.w = true;
        if (this.t != null) {
            this.t.a(new p() { // from class: com.tencent.rtmp.a.1
                @Override // com.tencent.liteav.basic.opengl.p
                public void onTakePhotoComplete(Bitmap bitmap) {
                    a.this.a(iTXSnapshotListener, bitmap);
                }
            });
        } else {
            this.w = false;
        }
    }

    public boolean a(byte[] bArr) {
        if (this.k == null || this.k.isEmpty()) {
            return false;
        }
        if (this.g) {
            TXLog.e(TXLivePlayer.TAG, "can not addVideoRawData because of hw decode has set!");
            return false;
        } else if (this.t == null) {
            TXCLog.e(TXLivePlayer.TAG, "player hasn't created or not instanceof live player");
            return false;
        } else {
            this.o = bArr;
            return true;
        }
    }

    public int a(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        if (obj != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                if (!(obj instanceof EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
                    TXCLog.w(TXLivePlayer.TAG, "liteav_api setVideoRenderListener error when glContext error " + obj);
                    return -1;
                }
            } else if (!(obj instanceof EGLContext)) {
                TXCLog.w(TXLivePlayer.TAG, "liteav_api setVideoRenderListener error when glContext error " + obj);
                return -1;
            }
        }
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setVideoRenderListener " + iTXLivePlayVideoRenderListener + ", context " + obj);
        this.p = obj;
        this.q = iTXLivePlayVideoRenderListener;
        if (this.t != null) {
            if (iTXLivePlayVideoRenderListener != null) {
                this.t.a(new u() { // from class: com.tencent.rtmp.a.2
                    @Override // com.tencent.liteav.u
                    public void onRenderVideoFrame(String str, int i, TXSVideoFrame tXSVideoFrame) {
                        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener2;
                        if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0 || (iTXLivePlayVideoRenderListener2 = a.this.q) == null) {
                            return;
                        }
                        TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
                        tXLiteAVTexture.textureId = tXSVideoFrame.textureId;
                        tXLiteAVTexture.width = tXSVideoFrame.width;
                        tXLiteAVTexture.height = tXSVideoFrame.height;
                        tXLiteAVTexture.eglContext = tXSVideoFrame.eglContext;
                        iTXLivePlayVideoRenderListener2.onRenderVideoFrame(tXLiteAVTexture);
                    }
                }, com.tencent.liteav.basic.b.b.TEXTURE_2D, obj);
                return 0;
            }
            this.t.a(null, com.tencent.liteav.basic.b.b.UNKNOWN, null);
            return 0;
        }
        return 0;
    }

    public void a(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setVideoRawDataListener " + iTXVideoRawDataListener);
        this.n = iTXVideoRawDataListener;
        if (this.t == null) {
            return;
        }
        if (iTXVideoRawDataListener != null) {
            this.t.a(new u() { // from class: com.tencent.rtmp.a.3
                @Override // com.tencent.liteav.u
                public void onRenderVideoFrame(String str, int i, TXSVideoFrame tXSVideoFrame) {
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0) {
                        return;
                    }
                    byte[] bArr = a.this.o;
                    a.this.o = null;
                    TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener2 = a.this.n;
                    if (iTXVideoRawDataListener2 == null || bArr == null) {
                        return;
                    }
                    if (bArr.length >= ((tXSVideoFrame.width * tXSVideoFrame.height) * 3) / 2) {
                        tXSVideoFrame.loadYUVArray(bArr);
                        iTXVideoRawDataListener2.onVideoRawDataAvailable(bArr, tXSVideoFrame.width, tXSVideoFrame.height, (int) tXSVideoFrame.pts);
                        tXSVideoFrame.release();
                        return;
                    }
                    TXCLog.e(TXLivePlayer.TAG, "raw data buffer length is too large");
                }
            }, com.tencent.liteav.basic.b.b.I420, null);
        } else {
            this.t.a(null, com.tencent.liteav.basic.b.b.UNKNOWN, null);
        }
    }

    public void a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setAudioRawDataListener " + iTXAudioRawDataListener);
        this.I = iTXAudioRawDataListener;
        if (this.t != null) {
            this.t.a(iTXAudioRawDataListener);
        }
    }

    public int b(String str, int i) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api prepareLiveSeek " + this);
        if (this.y == null) {
            this.y = new m();
        }
        if (this.y != null) {
            return this.y.a(this.k, str, i, new m.a() { // from class: com.tencent.rtmp.a.4
                @Override // com.tencent.liteav.m.a
                public void a(long j) {
                    a.this.A = j;
                    if (a.this.t != null) {
                        a.this.t.g();
                    }
                }
            });
        }
        return -1;
    }

    public void g(int i) {
        TXCLog.d(TXLivePlayer.TAG, "liteav_api seek " + i);
        if (this.t != null) {
            if (this.t.f() || this.z) {
                String a = this.y != null ? this.y.a(i) : "";
                if (!TextUtils.isEmpty(a)) {
                    this.z = a(a, 3) == 0;
                    if (this.z) {
                        this.A = i * 1000;
                        return;
                    }
                    return;
                } else if (this.e != null) {
                    this.e.onPlayEvent(-2301, new Bundle());
                    return;
                } else {
                    return;
                }
            }
            this.t.e(i);
        }
    }

    public int e() {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api resumeLive " + this);
        if (this.z) {
            this.z = false;
            return a(this.B, 1);
        }
        return -1;
    }

    @Deprecated
    public void d(boolean z) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setAutoPlay " + z);
        this.u = z;
    }

    @Deprecated
    public void a(float f) {
        TXCLog.i(TXLivePlayer.TAG, "liteav_api setRate " + f);
        this.v = f;
        if (this.t != null) {
            this.t.b(f);
        }
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 15001) {
            if (this.a != null) {
                this.a.setLogText(bundle, null, 0);
            }
            if (this.e != null) {
                this.e.onNetStatus(bundle);
            }
        } else if (i == 2005) {
            long j = bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS) + this.A;
            if (j > 0) {
                bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (j / 1000));
                bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) j);
                if (this.e != null) {
                    this.e.onPlayEvent(i, bundle);
                }
            }
        } else if (i != 2026) {
            switch (i) {
                case TXLiteAVCode.ERR_RTMP_ACC_FETCH_STREAM_FAIL /* -2309 */:
                case -2301:
                    i = -2301;
                    break;
                case -2307:
                    i = -2307;
                    break;
                case -2304:
                    i = -2304;
                    break;
                case -2302:
                    i = -2302;
                    break;
                case 2001:
                    i = 2001;
                    break;
                case 2002:
                    i = 2002;
                    break;
                case 2003:
                case 2105:
                    break;
                case 2004:
                    i = 2004;
                    break;
                case 2005:
                    i = 2005;
                    break;
                case 2007:
                    i = 2007;
                    break;
                case 2008:
                case 2021:
                case 2022:
                    i = 2008;
                    break;
                case 2009:
                    i = 2009;
                    break;
                case 2012:
                    i = 2012;
                    break;
                case 2013:
                    i = 2013;
                    break;
                case 2015:
                    i = 2015;
                    break;
                case 2028:
                    i = 2028;
                    break;
                case 2031:
                    i = 2031;
                    break;
                case 2101:
                    i = 2101;
                    break;
                case 2103:
                    i = 2103;
                    break;
                case 2106:
                    i = 2106;
                    break;
                case TXLiteAVCode.WARNING_SW_DECODER_START_FAIL /* 2109 */:
                    return;
                case 3003:
                    i = 3003;
                    break;
                case 3006:
                case 3007:
                    i = 3005;
                    break;
                case 3009:
                case 3010:
                    i = 3002;
                    break;
                default:
                    return;
            }
            if (this.a != null) {
                this.a.setLogText(null, bundle, i);
            }
            if (this.e != null) {
                this.e.onPlayEvent(i, bundle);
            }
        }
    }

    private boolean h() {
        return Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Build.MODEL.equalsIgnoreCase("Che2-TL00");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String c(String str, int i) {
        if (i != 6) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                StringBuilder sb = new StringBuilder(bytes.length);
                for (int i2 = 0; i2 < bytes.length; i2++) {
                    int i3 = bytes[i2] < 0 ? bytes[i2] + 256 : bytes[i2];
                    if (i3 > 32 && i3 < 127 && i3 != 34 && i3 != 37 && i3 != 60 && i3 != 62 && i3 != 91 && i3 != 125 && i3 != 92 && i3 != 93 && i3 != 94 && i3 != 96 && i3 != 123 && i3 != 124) {
                        sb.append((char) i3);
                    }
                    sb.append(String.format("%%%02X", Integer.valueOf(i3)));
                }
                str = sb.toString();
            } catch (Exception e) {
                TXCLog.e(TXLivePlayer.TAG, "check play url failed.", e);
            }
        }
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
        if (iTXSnapshotListener == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.a.5
            @Override // java.lang.Runnable
            public void run() {
                if (iTXSnapshotListener != null) {
                    iTXSnapshotListener.onSnapshot(bitmap);
                }
                a.this.w = false;
            }
        });
    }
}
