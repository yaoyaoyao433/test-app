package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.meituan.robust.common.CommonConstant;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.j;
import com.tencent.liteav.network.f;
import com.tencent.liteav.network.g;
import com.tencent.liteav.network.i;
import com.tencent.liteav.p;
import com.tencent.liteav.txcvodplayer.TextureRenderView;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXVodPlayer implements com.tencent.liteav.basic.c.b, g {
    public static final int PLAYER_TYPE_EXO = 1;
    public static final int PLAYER_TYPE_FFPLAY = 0;
    public static final String TAG = "TXVodPlayer";
    private int mBitrateIndex;
    private TXVodPlayConfig mConfig;
    private Context mContext;
    private boolean mIsGetPlayInfo;
    private boolean mLoop;
    private boolean mMirror;
    private f mNetApi;
    private p mPlayer;
    private int mRenderMode;
    private int mRenderRotation;
    protected float mStartTime;
    private Surface mSurface;
    private TXCloudVideoView mTXCloudVideoView;
    private TextureRenderView mTextureView;
    private String mToken;
    private boolean mEnableHWDec = false;
    private String mPlayUrl = "";
    private boolean mMute = false;
    private int mAudioPlayoutVolume = 100;
    private boolean mIsGainAudioFocus = true;
    private boolean mAutoPlay = true;
    private float mRate = 1.0f;
    private boolean mSnapshotRunning = false;
    private ITXLivePlayListener mListener = null;
    private ITXVodPlayListener mNewListener = null;

    public TXVodPlayer(Context context) {
        this.mContext = context.getApplicationContext();
        TXCCommonUtil.setAppContext(this.mContext);
        TXCLog.init();
    }

    public void setConfig(TXVodPlayConfig tXVodPlayConfig) {
        this.mConfig = tXVodPlayConfig;
        if (this.mConfig == null) {
            this.mConfig = new TXVodPlayConfig();
        }
        if (this.mPlayer != null) {
            j q = this.mPlayer.q();
            if (q == null) {
                q = new j();
            }
            q.e = this.mConfig.mConnectRetryCount;
            q.f = this.mConfig.mConnectRetryInterval;
            q.r = this.mConfig.mTimeout;
            q.h = this.mEnableHWDec;
            q.n = this.mConfig.mCacheFolderPath;
            q.o = this.mConfig.mMaxCacheItems;
            q.p = this.mConfig.mPlayerType;
            q.q = this.mConfig.mHeaders;
            q.s = this.mConfig.enableAccurateSeek;
            q.t = this.mConfig.autoRotate;
            q.u = this.mConfig.smoothSwitchBitrate;
            q.v = this.mConfig.cacheMp4ExtName;
            q.w = this.mConfig.progressInterval;
            q.x = this.mConfig.maxBufferSize;
            TXCLog.i(TAG, "setConfig [connectRetryCount:" + this.mConfig.mConnectRetryCount + "(default 3 times)][connectRetryInterval:" + this.mConfig.mConnectRetryInterval + "(default 3s,min:3s max:30s)][vodTimeout:" + this.mConfig.mTimeout + "(default 10s)][enableHardwareDecoder:" + this.mEnableHWDec + "(default false)][cacheFolderPath for mp4/HLS:" + this.mConfig.mCacheFolderPath + "][maxCacheItems:" + this.mConfig.mMaxCacheItems + "][enableAccurateSeek:" + this.mConfig.enableAccurateSeek + "(default true)][autoRotate:" + this.mConfig.autoRotate + "(default true)][HLS smoothSwitchBitrate:" + this.mConfig.smoothSwitchBitrate + "(default false)][progressInterval:" + this.mConfig.progressInterval + "(default 0.5s)][preload maxBufferSize:" + this.mConfig.maxBufferSize + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            this.mPlayer.a(q);
        }
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        TXCLog.i(TAG, "setPlayerView TXCloudVideoView:" + tXCloudVideoView);
        this.mTXCloudVideoView = tXCloudVideoView;
        if (this.mPlayer != null) {
            this.mPlayer.a(tXCloudVideoView);
        }
    }

    public void setPlayerView(TextureRenderView textureRenderView) {
        TXCLog.i(TAG, "setPlayerView TextureRenderView:" + textureRenderView);
        this.mTextureView = textureRenderView;
        if (this.mPlayer != null) {
            this.mPlayer.a(textureRenderView);
        }
    }

    public void setSurface(Surface surface) {
        TXCLog.i(TAG, "setSurface Surface:" + surface);
        this.mSurface = surface;
        if (this.mPlayer != null) {
            this.mPlayer.a(this.mSurface);
        }
    }

    public int startPlay(String str) {
        String path;
        if (str == null || TextUtils.isEmpty(str)) {
            TXCLog.i(TAG, "startPlay playUrl is empty");
            return -1;
        }
        TXCDRApi.initCrashReport(this.mContext);
        int i = this.mBitrateIndex;
        stopPlay(false);
        this.mBitrateIndex = i;
        if (this.mToken != null && (path = Uri.parse(str).getPath()) != null) {
            String[] split = path.split("/");
            if (split.length > 0) {
                int lastIndexOf = str.lastIndexOf(split[split.length - 1]);
                str = str.substring(0, lastIndexOf) + "voddrm.token." + this.mToken + CommonConstant.Symbol.DOT + str.substring(lastIndexOf);
            }
        }
        this.mPlayUrl = checkPlayUrl(str);
        TXCLog.i(TAG, "===========================================================================================================================================================");
        TXCLog.i(TAG, "===========================================================================================================================================================");
        TXCLog.i(TAG, "=====  StartPlay url = " + this.mPlayUrl + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.i(TAG, "===========================================================================================================================================================");
        TXCLog.i(TAG, "===========================================================================================================================================================");
        if (this.mPlayer == null) {
            this.mPlayer = new p(this.mContext);
        }
        updateConfig();
        if (this.mTXCloudVideoView != null) {
            this.mTXCloudVideoView.clearLog();
            this.mTXCloudVideoView.setVisibility(0);
            this.mPlayer.a(this.mTXCloudVideoView);
        } else if (this.mSurface != null) {
            this.mPlayer.a(this.mSurface);
        } else if (this.mTextureView != null) {
            this.mPlayer.a(this.mTextureView);
        }
        this.mPlayer.g(this.mBitrateIndex);
        this.mPlayer.a(this);
        this.mPlayer.d(this.mIsGainAudioFocus);
        this.mPlayer.e(this.mAutoPlay);
        this.mPlayer.c(this.mStartTime);
        this.mPlayer.a(this.mPlayUrl, 0);
        this.mPlayer.b(this.mMute);
        this.mPlayer.f(this.mAudioPlayoutVolume);
        this.mPlayer.b(this.mRate);
        this.mPlayer.b(this.mRenderRotation);
        this.mPlayer.a(this.mRenderMode);
        this.mPlayer.f(this.mLoop);
        setMirror(this.mMirror);
        return 0;
    }

    public int startPlay(TXPlayerAuthBuilder tXPlayerAuthBuilder) {
        this.mNetApi = new f();
        this.mNetApi.a(tXPlayerAuthBuilder.isHttps);
        this.mNetApi.a(this);
        TXCLog.i(TAG, "startPlay [FileId:" + tXPlayerAuthBuilder.fileId + "][Timeout:" + tXPlayerAuthBuilder.timeout + "][Unique identification request:" + tXPlayerAuthBuilder.us + "][Trial duration:" + tXPlayerAuthBuilder.exper + "][Sign:" + tXPlayerAuthBuilder.sign + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return this.mNetApi.a(tXPlayerAuthBuilder.appId, tXPlayerAuthBuilder.fileId, tXPlayerAuthBuilder.timeout, tXPlayerAuthBuilder.us, tXPlayerAuthBuilder.exper, tXPlayerAuthBuilder.sign);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0064, code lost:
        com.tencent.liteav.basic.log.TXCLog.w(com.tencent.rtmp.TXVodPlayer.TAG, "URL has been transcoded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String checkPlayUrl(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "http"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L8f
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r8.getBytes(r0)     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            int r2 = r0.length     // Catch: java.lang.Exception -> L87
            r1.<init>(r2)     // Catch: java.lang.Exception -> L87
            r2 = 0
            r3 = 0
        L16:
            int r4 = r0.length     // Catch: java.lang.Exception -> L87
            if (r3 >= r4) goto L81
            r4 = r0[r3]     // Catch: java.lang.Exception -> L87
            if (r4 >= 0) goto L22
            r4 = r0[r3]     // Catch: java.lang.Exception -> L87
            int r4 = r4 + 256
            goto L24
        L22:
            r4 = r0[r3]     // Catch: java.lang.Exception -> L87
        L24:
            r5 = 32
            r6 = 37
            if (r4 <= r5) goto L62
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L62
            r5 = 34
            if (r4 == r5) goto L62
            if (r4 == r6) goto L62
            r5 = 60
            if (r4 == r5) goto L62
            r5 = 62
            if (r4 == r5) goto L62
            r5 = 91
            if (r4 == r5) goto L62
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L62
            r5 = 92
            if (r4 == r5) goto L62
            r5 = 93
            if (r4 == r5) goto L62
            r5 = 94
            if (r4 == r5) goto L62
            r5 = 96
            if (r4 == r5) goto L62
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L62
            r5 = 124(0x7c, float:1.74E-43)
            if (r4 != r5) goto L5d
            goto L62
        L5d:
            char r4 = (char) r4     // Catch: java.lang.Exception -> L87
            r1.append(r4)     // Catch: java.lang.Exception -> L87
            goto L7e
        L62:
            if (r4 != r6) goto L6c
            java.lang.String r0 = "TXVodPlayer"
            java.lang.String r1 = "URL has been transcoded"
            com.tencent.liteav.basic.log.TXCLog.w(r0, r1)     // Catch: java.lang.Exception -> L87
            return r8
        L6c:
            java.lang.String r5 = "%%%02X"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L87
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L87
            r6[r2] = r4     // Catch: java.lang.Exception -> L87
            java.lang.String r4 = java.lang.String.format(r5, r6)     // Catch: java.lang.Exception -> L87
            r1.append(r4)     // Catch: java.lang.Exception -> L87
        L7e:
            int r3 = r3 + 1
            goto L16
        L81:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L87
            r8 = r0
            goto L8f
        L87:
            r0 = move-exception
            java.lang.String r1 = "TXVodPlayer"
            java.lang.String r2 = "get utf-8 string failed."
            com.tencent.liteav.basic.log.TXCLog.e(r1, r2, r0)
        L8f:
            java.lang.String r8 = r8.trim()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.TXVodPlayer.checkPlayUrl(java.lang.String):java.lang.String");
    }

    public int stopPlay(boolean z) {
        TXCLog.i(TAG, "stopPlay needClearLastImg:" + z);
        if (z && this.mTXCloudVideoView != null) {
            this.mTXCloudVideoView.setVisibility(8);
        }
        if (this.mPlayer != null) {
            this.mPlayer.a(z);
        }
        this.mPlayUrl = "";
        if (this.mNetApi != null) {
            this.mNetApi.a((g) null);
            this.mNetApi = null;
        }
        this.mBitrateIndex = 0;
        this.mIsGetPlayInfo = false;
        return 0;
    }

    public boolean isPlaying() {
        if (this.mPlayer != null) {
            return this.mPlayer.c();
        }
        return false;
    }

    public void pause() {
        TXCLog.i(TAG, "pause");
        if (this.mPlayer != null) {
            this.mPlayer.a();
        }
    }

    public void resume() {
        TXCLog.i(TAG, "resume");
        if (this.mPlayer != null) {
            this.mPlayer.b();
        }
    }

    public void seek(int i) {
        if (this.mPlayer != null) {
            this.mPlayer.e(i);
        }
    }

    public void seek(float f) {
        if (this.mPlayer != null) {
            this.mPlayer.a(f);
        }
    }

    public float getCurrentPlaybackTime() {
        if (this.mPlayer != null) {
            return this.mPlayer.h();
        }
        return 0.0f;
    }

    public float getBufferDuration() {
        if (this.mPlayer != null) {
            return this.mPlayer.j();
        }
        return 0.0f;
    }

    public float getDuration() {
        if (this.mPlayer != null) {
            return this.mPlayer.k();
        }
        return 0.0f;
    }

    public float getPlayableDuration() {
        if (this.mPlayer != null) {
            return this.mPlayer.l();
        }
        return 0.0f;
    }

    public int getWidth() {
        if (this.mPlayer != null) {
            return this.mPlayer.m();
        }
        return 0;
    }

    public int getHeight() {
        if (this.mPlayer != null) {
            return this.mPlayer.n();
        }
        return 0;
    }

    @Deprecated
    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mListener = iTXLivePlayListener;
    }

    public void setVodListener(ITXVodPlayListener iTXVodPlayListener) {
        this.mNewListener = iTXVodPlayListener;
    }

    public void setRenderMode(int i) {
        this.mRenderMode = i;
        if (this.mPlayer != null) {
            this.mPlayer.a(i);
        }
    }

    public void setRenderRotation(int i) {
        this.mRenderRotation = i;
        if (this.mPlayer != null) {
            this.mPlayer.b(i);
        }
    }

    public boolean enableHardwareDecode(boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < 18) {
                TXCLog.e("HardwareDecode", "enableHardwareDecode failed, android system build.version = " + Build.VERSION.SDK_INT + ", the minimum build.version should be 18(android 4.3 or later)");
                return false;
            } else if (isAVCDecBlacklistDevices()) {
                TXCLog.e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + Build.MANUFACTURER + ", MODEL" + Build.MODEL);
                return false;
            }
        }
        this.mEnableHWDec = z;
        updateConfig();
        return true;
    }

    public void setMute(boolean z) {
        TXCLog.i(TAG, "setMute:" + z);
        this.mMute = z;
        if (this.mPlayer != null) {
            this.mPlayer.b(z);
        }
    }

    public void setAudioPlayoutVolume(int i) {
        TXCLog.i(TAG, "setAudioPlayoutVolume:" + i);
        this.mAudioPlayoutVolume = i;
        if (this.mPlayer != null) {
            this.mPlayer.f(i);
        }
    }

    public boolean setRequestAudioFocus(boolean z) {
        this.mIsGainAudioFocus = z;
        if (this.mPlayer != null) {
            return this.mPlayer.d(z);
        }
        return true;
    }

    public void setAutoPlay(boolean z) {
        TXCLog.i(TAG, "setAutoPlay:" + z);
        this.mAutoPlay = z;
        if (this.mPlayer != null) {
            this.mPlayer.e(z);
        }
    }

    public void setRate(float f) {
        this.mRate = f;
        if (this.mPlayer != null) {
            this.mPlayer.b(f);
        }
    }

    public int getBitrateIndex() {
        if (this.mPlayer != null) {
            return this.mPlayer.o();
        }
        return 0;
    }

    public void setBitrateIndex(int i) {
        if (this.mPlayer != null) {
            this.mPlayer.g(i);
        }
        this.mBitrateIndex = i;
    }

    public ArrayList<TXBitrateItem> getSupportedBitrates() {
        if (this.mPlayer != null) {
            return this.mPlayer.p();
        }
        return new ArrayList<>();
    }

    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        Bitmap bitmap;
        if (this.mSnapshotRunning || iTXSnapshotListener == null) {
            return;
        }
        this.mSnapshotRunning = true;
        TextureView d = this.mPlayer != null ? this.mPlayer.d() : null;
        if (d != null) {
            Bitmap bitmap2 = d.getBitmap();
            if (bitmap2 != null) {
                Matrix transform = d.getTransform(null);
                if (this.mMirror) {
                    transform.postScale(-1.0f, 1.0f);
                }
                bitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), transform, true);
                bitmap2.recycle();
            } else {
                bitmap = bitmap2;
            }
            postBitmapToMainThread(iTXSnapshotListener, bitmap);
            return;
        }
        this.mSnapshotRunning = false;
    }

    public void setMirror(boolean z) {
        TXCLog.i(TAG, "setMirror:" + z);
        if (this.mPlayer != null) {
            this.mPlayer.g(z);
        }
        this.mMirror = z;
    }

    public void setStartTime(float f) {
        this.mStartTime = f;
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 15001) {
            if (this.mTXCloudVideoView != null) {
                this.mTXCloudVideoView.setLogText(bundle, null, 0);
            }
            if (this.mListener != null) {
                this.mListener.onNetStatus(bundle);
            }
            if (this.mNewListener != null) {
                this.mNewListener.onNetStatus(this, bundle);
                return;
            }
            return;
        }
        if (this.mTXCloudVideoView != null) {
            this.mTXCloudVideoView.setLogText(null, bundle, i);
        }
        if (this.mListener != null) {
            this.mListener.onPlayEvent(i, bundle);
        }
        if (this.mNewListener != null) {
            this.mNewListener.onPlayEvent(this, i, bundle);
        }
    }

    private boolean isAVCDecBlacklistDevices() {
        return Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Build.MODEL.equalsIgnoreCase("Che2-TL00");
    }

    private void postBitmapToMainThread(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
        if (iTXSnapshotListener == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.TXVodPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                if (iTXSnapshotListener != null) {
                    iTXSnapshotListener.onSnapshot(bitmap);
                }
                TXVodPlayer.this.mSnapshotRunning = false;
            }
        });
    }

    void updateConfig() {
        setConfig(this.mConfig);
    }

    @Override // com.tencent.liteav.network.g
    public void onNetSuccess(f fVar) {
        if (fVar != this.mNetApi) {
            return;
        }
        i a = fVar.a();
        if (!this.mIsGetPlayInfo) {
            startPlay(a.a());
        }
        this.mIsGetPlayInfo = false;
        Bundle bundle = new Bundle();
        bundle.putInt(TXCAVRoomConstants.EVT_ID, 2010);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putString("EVT_MSG", "Requested file information successfully");
        bundle.putString(TXLiveConstants.EVT_PLAY_URL, a.a());
        bundle.putString(TXLiveConstants.EVT_PLAY_COVER_URL, a.b());
        bundle.putString(TXLiveConstants.EVT_PLAY_NAME, a.f());
        bundle.putString(TXLiveConstants.EVT_PLAY_DESCRIPTION, a.g());
        if (a.d() != null) {
            bundle.putInt(TXLiveConstants.EVT_PLAY_DURATION, a.d().c());
        }
        onNotifyEvent(2010, bundle);
        TXCLog.i(TAG, "onNetSuccess: Requested file information successfully");
    }

    @Override // com.tencent.liteav.network.g
    public void onNetFailed(f fVar, String str, int i) {
        if (fVar != this.mNetApi) {
            return;
        }
        this.mIsGetPlayInfo = false;
        Bundle bundle = new Bundle();
        bundle.putInt(TXCAVRoomConstants.EVT_ID, 2010);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putString("EVT_MSG", str);
        bundle.putInt("EVT_PARAM1", i);
        onNotifyEvent(-2306, bundle);
        TXCLog.i(TAG, "onNetFailed: eventId: -2306 description:" + str);
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void setLoop(boolean z) {
        TXCLog.i(TAG, "setLoop:" + z);
        this.mLoop = z;
        if (this.mPlayer != null) {
            this.mPlayer.f(this.mLoop);
        }
    }

    public boolean isLoop() {
        return this.mLoop;
    }
}
