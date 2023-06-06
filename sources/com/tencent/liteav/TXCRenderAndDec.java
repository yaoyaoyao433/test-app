package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.common.CommonConstant;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.b.w;
import com.tencent.liteav.renderer.a;
import com.tencent.liteav.videodecoder.TXCVideoDecoder;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCRenderAndDec extends com.tencent.liteav.basic.module.a implements com.tencent.liteav.basic.c.b, a.InterfaceC1460a, com.tencent.liteav.renderer.g, com.tencent.liteav.videodecoder.f {
    public static final String TAG = "TXCRenderAndDec";
    private Context mContext;
    private WeakReference<com.tencent.liteav.basic.c.b> mNotifyListener;
    private WeakReference<b> mRenderAndDecDelegate;
    private u mVideoFrameListener;
    private j mConfig = null;
    private boolean mEnableLimitHWDecCache = false;
    private TXCVideoDecoder mVideoDecoder = null;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private com.tencent.liteav.renderer.f mVideoRender = null;
    private com.tencent.liteav.basic.opengl.j mRGBA2YUVFilter = null;
    private int mCustomRenderFrameBufferId = -1;
    private com.tencent.liteav.basic.b.b mVideoFrameFormat = com.tencent.liteav.basic.b.b.UNKNOWN;
    private boolean mRealTime = false;
    private boolean mIsRendering = false;
    private int mStreamType = 0;
    private long mFrameDecErrCnt = 0;
    private long mLastReqKeyFrameTS = 0;
    private boolean mFirstRender = false;
    private int mRenderMode = 0;
    private int mRenderRotation = 0;
    private long mLastRenderCalculateTS = 0;
    private long mRenderFrameCount = 0;
    private long mLastRenderFrameCount = 0;
    private a mDecListener = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(SurfaceTexture surfaceTexture);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void onRequestKeyFrame(String str, int i);
    }

    public void decVideo(TXSNALPacket tXSNALPacket) {
    }

    public TXCRenderAndDec(Context context) {
        this.mContext = null;
        this.mContext = context;
        com.tencent.liteav.basic.d.c.a().a(this.mContext);
    }

    public void setVideoRender(com.tencent.liteav.renderer.f fVar) {
        TXCLog.i(TAG, "set video render " + fVar + " id " + getID() + ", " + this.mStreamType);
        this.mVideoRender = fVar;
        if (this.mVideoRender == null) {
            return;
        }
        this.mVideoRender.setID(getID());
        this.mVideoRender.a(this.mStreamType);
        this.mVideoRender.a((com.tencent.liteav.basic.c.b) this);
        this.mVideoRender.c(this.mRenderMode);
        this.mVideoRender.e(this.mRenderRotation);
        if (this.mVideoFrameListener != null && (this.mVideoRender instanceof com.tencent.liteav.renderer.a)) {
            ((com.tencent.liteav.renderer.a) this.mVideoRender).b((a.InterfaceC1460a) this);
        }
        if (this.mConfig != null) {
            this.mVideoRender.b(this.mConfig.d);
        }
    }

    public void setNotifyListener(com.tencent.liteav.basic.c.b bVar) {
        this.mNotifyListener = new WeakReference<>(bVar);
    }

    public void setRenderAndDecDelegate(b bVar) {
        this.mRenderAndDecDelegate = new WeakReference<>(bVar);
    }

    public void setVideoFrameListener(u uVar, com.tencent.liteav.basic.b.b bVar) {
        this.mVideoFrameListener = uVar;
        this.mVideoFrameFormat = bVar;
        TXCLog.i(TAG, "setVideoFrameListener->enter listener: " + uVar + ", format: " + bVar);
        if (this.mVideoRender == null || !(this.mVideoRender instanceof com.tencent.liteav.renderer.a)) {
            return;
        }
        if (uVar == null) {
            TXCLog.i(TAG, "setCustomRenderListener-> clean listener.");
            ((com.tencent.liteav.renderer.a) this.mVideoRender).b((a.InterfaceC1460a) null);
            return;
        }
        TXCLog.i(TAG, "setCustomRenderListener-> set listener.");
        ((com.tencent.liteav.renderer.a) this.mVideoRender).b((a.InterfaceC1460a) this);
    }

    public void setConfig(j jVar) {
        this.mConfig = jVar;
        if (this.mVideoRender != null) {
            this.mVideoRender.b(this.mConfig.d);
        }
    }

    public j getConfig() {
        return this.mConfig;
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        if (this.mVideoRender != null) {
            this.mVideoRender.setID(getID());
        }
        if (this.mVideoDecoder != null) {
            this.mVideoDecoder.setUserId(str);
        }
    }

    public void setDecListener(a aVar) {
        this.mDecListener = aVar;
    }

    public void enableDecoderChange(boolean z) {
        this.mEnableDecoderChange = z;
    }

    public void enableRestartDecoder(boolean z) {
        this.mEnableRestartDecoder = z;
    }

    public void start(boolean z) {
        TXCLog.i(TAG, "start render dec " + getID() + ", " + this.mStreamType);
        this.mRealTime = z;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        if (this.mVideoRender != null) {
            this.mVideoRender.a((com.tencent.liteav.renderer.g) this);
            this.mVideoRender.e();
            this.mVideoRender.setID(getID());
        }
        this.mVideoDecoder = new TXCVideoDecoder();
        this.mVideoDecoder.setUserId(getID());
        this.mVideoDecoder.setStreamType(this.mStreamType);
        this.mVideoDecoder.setListener(this);
        this.mVideoDecoder.setNotifyListener(this);
        this.mVideoDecoder.enableChange(this.mEnableDecoderChange);
        this.mVideoDecoder.enableLimitDecCache(this.mEnableLimitHWDecCache);
        this.mVideoDecoder.enableRestart(this.mEnableRestartDecoder);
        startDecode();
        this.mIsRendering = true;
    }

    public void startVideo() {
        stopVideo();
        this.mRealTime = true;
        this.mFrameDecErrCnt = 0L;
        this.mLastReqKeyFrameTS = 0L;
        if (this.mVideoRender != null) {
            this.mVideoRender.a((com.tencent.liteav.renderer.g) this);
            this.mVideoRender.e();
            this.mVideoRender.setID(getID());
        }
        TXCLog.i(TAG, "start video dec " + getID() + ", " + this.mStreamType);
        this.mVideoDecoder = new TXCVideoDecoder();
        this.mVideoDecoder.setUserId(getID());
        this.mVideoDecoder.setStreamType(this.mStreamType);
        this.mVideoDecoder.setListener(this);
        this.mVideoDecoder.setNotifyListener(this);
        this.mVideoDecoder.enableChange(this.mEnableDecoderChange);
        this.mVideoDecoder.enableRestart(this.mEnableRestartDecoder);
        this.mVideoDecoder.enableLimitDecCache(this.mEnableLimitHWDecCache);
        startDecode();
        this.mIsRendering = true;
    }

    public void stopVideo() {
        this.mIsRendering = false;
        if (this.mVideoDecoder != null) {
            TXCLog.i(TAG, "stop video dec " + getID() + ", " + this.mStreamType);
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        if (this.mVideoRender != null) {
            this.mVideoRender.m();
            this.mVideoRender.a(false);
            this.mVideoRender.a((com.tencent.liteav.renderer.g) null);
        }
    }

    public void stop() {
        TXCLog.i(TAG, "stop video render dec " + getID() + ", " + this.mStreamType);
        this.mIsRendering = false;
        this.mRealTime = false;
        if (this.mVideoDecoder != null) {
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder.stop();
        }
        if (this.mVideoRender != null) {
            this.mVideoRender.m();
            this.mVideoRender.a(true);
            this.mVideoRender.a((com.tencent.liteav.renderer.g) null);
        }
    }

    public void muteVideo(boolean z) {
        if (z || this.mVideoRender == null) {
            return;
        }
        this.mVideoRender.n();
    }

    public boolean isRendering() {
        return this.mIsRendering;
    }

    public void setRenderMode(int i) {
        this.mRenderMode = i;
        if (this.mVideoRender != null) {
            this.mVideoRender.c(i);
        }
    }

    public void setRenderRotation(int i) {
        TXCLog.i(TAG, "vrotation setRenderRotation " + i);
        this.mRenderRotation = i;
        if (this.mVideoRender != null) {
            this.mVideoRender.e(i);
        }
    }

    public void setRenderMirrorType(int i) {
        TXCLog.i(TAG, "setRenderMirrorType " + i);
        if (this.mVideoRender != null) {
            this.mVideoRender.d(i);
        }
    }

    public void setBlockInterval(int i) {
        if (this.mVideoRender != null) {
            this.mVideoRender.f(i);
        }
    }

    public long getVideoCacheDuration() {
        return getIntValue(6010, 2);
    }

    public long getVideoCacheFrameCount() {
        return getIntValue(6011, 2);
    }

    public int getVideoDecCacheFrameCount() {
        return getIntValue(6012, 2);
    }

    public long getAVPlayInterval() {
        return getLongValue(6013, 2);
    }

    public long getAVNetRecvInterval() {
        return getLongValue(6014, 2);
    }

    public int getVideoGop() {
        return getIntValue(7120);
    }

    public void updateLoadInfo() {
        if (this.mVideoDecoder != null) {
            setStatusValue(5002, this.mStreamType, Long.valueOf(this.mVideoDecoder.isHardwareDecode() ? 1L : 0L));
        }
        if (this.mVideoRender != null) {
            this.mVideoRender.o();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.mLastRenderCalculateTS;
        if (j >= 1000) {
            double d = ((this.mRenderFrameCount - this.mLastRenderFrameCount) * 1000.0d) / j;
            this.mLastRenderFrameCount = this.mRenderFrameCount;
            this.mLastRenderCalculateTS = currentTimeMillis;
            setStatusValue(6002, this.mStreamType, Double.valueOf(d));
        }
    }

    public com.tencent.liteav.renderer.f getVideoRender() {
        return this.mVideoRender;
    }

    public void setStreamType(int i) {
        this.mStreamType = i;
        if (this.mVideoRender != null) {
            this.mVideoRender.a(this.mStreamType);
        }
        if (this.mVideoDecoder != null) {
            this.mVideoDecoder.setStreamType(this.mStreamType);
        }
    }

    public int getStreamType() {
        return this.mStreamType;
    }

    public void enableLimitDecCache(boolean z) {
        this.mEnableLimitHWDecCache = z;
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.enableLimitDecCache(z);
        }
    }

    private void startDecode(SurfaceTexture surfaceTexture) {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.stop();
            tXCVideoDecoder.enableHWDec(this.mConfig.h);
            tXCVideoDecoder.config(this.mConfig.y);
            TXCLog.i(TAG, "trtc_ start decode " + surfaceTexture + ", hw: " + this.mConfig.h + ", id " + getID() + CommonConstant.Symbol.UNDERLINE + this.mStreamType);
            if (surfaceTexture != null) {
                tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            } else if (this.mConfig.h) {
            } else {
                tXCVideoDecoder.setup((Surface) null, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
                tXCVideoDecoder.setUserId(getID());
                tXCVideoDecoder.start();
            }
        }
    }

    private void startDecode() {
        startDecode(this.mVideoRender != null ? this.mVideoRender.a() : null);
    }

    private void notifyEvent(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(TXCAVRoomConstants.EVT_USERID, getID());
        bundle.putInt(TXCAVRoomConstants.EVT_ID, i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str != null) {
            bundle.putCharSequence("EVT_MSG", str);
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        com.tencent.liteav.basic.util.g.a(this.mNotifyListener, i, bundle);
    }

    public void restartDecoder() {
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder == null || !tXCVideoDecoder.isHevc()) {
            return;
        }
        tXCVideoDecoder.restart(true);
    }

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 2106) {
            this.mConfig.h = false;
            TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
            if (tXCVideoDecoder != null) {
                tXCVideoDecoder.restart(this.mConfig.h);
            }
        } else if (i == 2020) {
            TXCLog.e(TAG, "decoding too many frame(>40) without output! request key frame now.");
            requestKeyFrame();
            return;
        }
        bundle.putInt("EVT_STREAM_TYPE", this.mStreamType);
        com.tencent.liteav.basic.util.g.a(this.mNotifyListener, i, bundle);
    }

    @Override // com.tencent.liteav.renderer.g
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        TXCLog.w(TAG, "play decode when surface texture create hw " + this.mConfig.h);
        TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
        if (tXCVideoDecoder != null) {
            tXCVideoDecoder.setup(surfaceTexture, (ByteBuffer) null, (ByteBuffer) null, !this.mRealTime);
        }
        if (this.mConfig.h) {
            startDecode(surfaceTexture);
        }
    }

    @Override // com.tencent.liteav.renderer.g
    public void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture) {
        try {
            TXCLog.w(TAG, "play:stop decode when surface texture release");
            if (this.mConfig.h && this.mVideoDecoder != null) {
                this.mVideoDecoder.stop();
            }
            if (this.mCustomRenderFrameBufferId != -1) {
                TXCOpenGlUtils.b(this.mCustomRenderFrameBufferId);
                this.mCustomRenderFrameBufferId = -1;
            }
            if (this.mRGBA2YUVFilter != null) {
                this.mRGBA2YUVFilter.e();
                this.mRGBA2YUVFilter = null;
            }
            if (this.mDecListener != null) {
                this.mDecListener.a(surfaceTexture);
            }
        } catch (Exception e) {
            TXCLog.e(TAG, "onSurfaceTextureDestroy failed.", e);
        }
    }

    @Override // com.tencent.liteav.videodecoder.f
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3) {
        int i4 = i3;
        if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3) {
            i4 = 360 - (i4 * 90);
        }
        u uVar = this.mVideoFrameListener;
        if (uVar != null && tXSVideoFrame != null && (this.mVideoFrameFormat == com.tencent.liteav.basic.b.b.I420 || this.mVideoFrameFormat == com.tencent.liteav.basic.b.b.NV21)) {
            TXSVideoFrame m37clone = this.mVideoRender != null ? tXSVideoFrame.m37clone() : tXSVideoFrame;
            m37clone.rotation = (this.mRenderRotation + i4) % 360;
            if (this.mVideoFrameFormat == com.tencent.liteav.basic.b.b.NV21) {
                m37clone.loadNV21BufferFromI420Buffer();
            }
            uVar.onRenderVideoFrame(getID(), this.mStreamType, m37clone);
        }
        if (!this.mFirstRender) {
            this.mFirstRender = true;
            TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_CirclePitchScale, -1L, -1L, "", this.mStreamType);
            if (this.mVideoRender == null) {
                TXCKeyPointReportProxy.a(getID(), 40022, 0L, this.mStreamType);
            }
            if (this.mVideoDecoder != null) {
                TXCKeyPointReportProxy.a(getID(), 40029, this.mVideoDecoder.GetDecodeFirstFrameTS(), this.mStreamType);
            }
            if (this.mStreamType == 2) {
                TXCKeyPointReportProxy.a(getID(), 32004);
            }
        }
        if (this.mVideoRender != null) {
            this.mVideoRender.a(tXSVideoFrame, i, i2, i4);
        } else if (this.mLastRenderCalculateTS == 0) {
            this.mLastRenderCalculateTS = System.currentTimeMillis();
            this.mLastRenderFrameCount = 0L;
            this.mRenderFrameCount = 0L;
        } else {
            this.mRenderFrameCount++;
        }
    }

    @Override // com.tencent.liteav.videodecoder.f
    public void onVideoSizeChange(int i, int i2) {
        if (this.mVideoRender != null) {
            this.mVideoRender.c(i, i2);
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence("EVT_MSG", "Resolution changed to" + i + Constants.GestureMoveEvent.KEY_X + i2);
        bundle.putInt("EVT_PARAM1", i);
        bundle.putInt("EVT_PARAM2", i2);
        bundle.putString(TXCAVRoomConstants.EVT_USERID, getID());
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        onNotifyEvent(2009, bundle);
        setStatusValue(5003, this.mStreamType, Integer.valueOf((i << 16) | i2));
        long j = i;
        long j2 = i2;
        TXCEventRecorderProxy.a(getID(), MapConstant.LayerPropertyFlag_MarkerCustomCollision, j, j2, "", this.mStreamType);
        TXCKeyPointReportProxy.a(getID(), RequestIDMap.OP_TYPE_TAG.OP_TYPE_WRITE_TAG, j, this.mStreamType);
        TXCKeyPointReportProxy.a(getID(), RequestIDMap.OP_TYPE_TAG.OP_TYPE_REMOVE_TAG, j2, this.mStreamType);
    }

    @Override // com.tencent.liteav.videodecoder.f
    public void onDecodeFailed(int i) {
        TXCLog.e(TAG, "video decode failed " + i);
        requestKeyFrame();
        int i2 = this.mStreamType;
        long j = this.mFrameDecErrCnt + 1;
        this.mFrameDecErrCnt = j;
        setStatusValue(17014, i2, Long.valueOf(j));
    }

    @Override // com.tencent.liteav.renderer.a.InterfaceC1460a
    public void onTextureProcess(int i, int i2, int i3, int i4) {
        u uVar = this.mVideoFrameListener;
        if (uVar == null) {
            return;
        }
        TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
        tXSVideoFrame.width = i2;
        tXSVideoFrame.height = i3;
        tXSVideoFrame.pts = TXCTimeUtil.getTimeTick();
        tXSVideoFrame.rotation = (i4 + this.mRenderRotation) % 360;
        if (this.mVideoFrameFormat == com.tencent.liteav.basic.b.b.RGBA) {
            tXSVideoFrame.textureId = i;
            tXSVideoFrame.eglContext = TXCOpenGlUtils.e();
            if (this.mCustomRenderFrameBufferId == -1) {
                this.mCustomRenderFrameBufferId = TXCOpenGlUtils.d();
            }
            TXCOpenGlUtils.a(i, this.mCustomRenderFrameBufferId);
            GLES20.glBindFramebuffer(36160, this.mCustomRenderFrameBufferId);
            this.mVideoFrameListener.onRenderVideoFrame(getID(), this.mStreamType, tXSVideoFrame);
            TXCOpenGlUtils.d(this.mCustomRenderFrameBufferId);
        } else if (this.mVideoFrameFormat == com.tencent.liteav.basic.b.b.TEXTURE_2D) {
            tXSVideoFrame.textureId = i;
            if (this.mVideoRender instanceof com.tencent.liteav.renderer.a) {
                tXSVideoFrame.eglContext = ((com.tencent.liteav.renderer.a) this.mVideoRender).b();
            }
            uVar.onRenderVideoFrame(getID(), this.mStreamType, tXSVideoFrame);
        } else {
            TXCVideoDecoder tXCVideoDecoder = this.mVideoDecoder;
            if (tXCVideoDecoder == null || tXCVideoDecoder.isHardwareDecode()) {
                if (this.mRGBA2YUVFilter == null) {
                    if (this.mVideoFrameFormat == com.tencent.liteav.basic.b.b.NV21) {
                        this.mRGBA2YUVFilter = new w(3);
                    } else {
                        this.mRGBA2YUVFilter = new w(1);
                    }
                    this.mRGBA2YUVFilter.a(true);
                    if (this.mRGBA2YUVFilter.c()) {
                        this.mRGBA2YUVFilter.a(i2, i3);
                    } else {
                        TXCLog.i(TAG, "throwVideoFrame->release mVideoFrameFilter");
                        this.mRGBA2YUVFilter = null;
                    }
                }
                if (this.mRGBA2YUVFilter != null) {
                    GLES20.glViewport(0, 0, i2, i3);
                    this.mRGBA2YUVFilter.a(i2, i3);
                    this.mRGBA2YUVFilter.a(i);
                    GLES20.glBindFramebuffer(36160, this.mRGBA2YUVFilter.m());
                    uVar.onRenderVideoFrame(getID(), this.mStreamType, tXSVideoFrame);
                    GLES20.glBindFramebuffer(36160, 0);
                }
            }
        }
    }

    private void requestKeyFrame() {
        b bVar;
        long timeTick = TXCTimeUtil.getTimeTick();
        if (timeTick > this.mLastReqKeyFrameTS + PayTask.j) {
            this.mLastReqKeyFrameTS = timeTick;
            TXCLog.e(TAG, "requestKeyFrame: " + getID());
            if (this.mRenderAndDecDelegate == null || (bVar = this.mRenderAndDecDelegate.get()) == null) {
                return;
            }
            bVar.onRequestKeyFrame(getID(), this.mStreamType);
        }
    }
}
