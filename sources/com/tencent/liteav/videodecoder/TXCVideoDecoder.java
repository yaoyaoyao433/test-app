package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.g;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCVideoDecoder implements com.tencent.liteav.basic.c.b, f {
    private static final boolean NEW_DECODER = true;
    private static final String TAG = "TXCVideoDecoder";
    private static long mDecodeFirstFrameTS;
    private int mDecoderCacheNum;
    private a mDecoderHandler;
    f mDecoderListener;
    private long mNativeContext;
    private WeakReference<com.tencent.liteav.basic.c.b> mNotifyListener;
    private ByteBuffer mPps;
    private ByteBuffer mSps;
    Surface mSurface;
    private String mUserId;
    b mVideoDecoder;
    private boolean mRestarting = false;
    private int mStreamType = 0;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private boolean mEnableLimitDecCache = false;
    private JSONArray mDecFormat = null;
    private ArrayList<TXSNALPacket> mNALList = new ArrayList<>();
    boolean mHWDec = true;
    boolean mHevc = false;
    boolean mNeedSortFrame = true;
    boolean mRecvFirstFrame = false;

    private native long nativeCreateContext(boolean z);

    private native void nativeDecCache(long j);

    private native void nativeDecodeFrame(long j, byte[] bArr, int i, long j2, long j3, int i2, int i3);

    private native void nativeDestroyContext(long j);

    private native void nativeEnableDecodeChange(long j, boolean z);

    private native void nativeEnableRestartDecoder(long j, boolean z);

    private native void nativeNotifyHWDecoderError(long j);

    private native void nativeNotifyPts(long j, long j2, int i, int i2);

    private native void nativeReStart(long j, boolean z);

    private native void nativeSetID(long j, String str);

    private native void nativeSetStreamType(long j, int i);

    @Override // com.tencent.liteav.basic.c.b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 2106) {
            nativeNotifyHWDecoderError(this.mNativeContext);
        }
        g.a(this.mNotifyListener, this.mUserId, i, bundle);
    }

    public void setUserId(String str) {
        this.mUserId = str;
        synchronized (this) {
            nativeSetID(this.mNativeContext, this.mUserId);
        }
    }

    public void setStreamType(int i) {
        this.mStreamType = i;
        synchronized (this) {
            nativeSetStreamType(this.mNativeContext, this.mStreamType);
        }
    }

    public void enableChange(boolean z) {
        this.mEnableDecoderChange = z;
        synchronized (this) {
            nativeEnableDecodeChange(this.mNativeContext, this.mEnableDecoderChange);
        }
    }

    public void enableLimitDecCache(boolean z) {
        this.mEnableLimitDecCache = z;
        b bVar = this.mVideoDecoder;
        if (bVar != null) {
            bVar.enableLimitDecCache(this.mEnableLimitDecCache);
        }
    }

    public void config(JSONArray jSONArray) {
        this.mDecFormat = jSONArray;
    }

    public void enableRestart(boolean z) {
        this.mEnableRestartDecoder = z;
    }

    public TXCVideoDecoder() {
        mDecodeFirstFrameTS = 0L;
    }

    public void setListener(f fVar) {
        this.mDecoderListener = fVar;
    }

    public boolean isHardwareDecode() {
        return this.mVideoDecoder != null;
    }

    public void setNotifyListener(com.tencent.liteav.basic.c.b bVar) {
        this.mNotifyListener = new WeakReference<>(bVar);
    }

    public int setup(SurfaceTexture surfaceTexture, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z) {
        synchronized (this) {
            if (this.mSurface != null) {
                this.mSurface.release();
                this.mSurface = null;
            }
        }
        return setup(new Surface(surfaceTexture), byteBuffer, byteBuffer2, z);
    }

    public int setup(Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z) {
        synchronized (this) {
            this.mSurface = surface;
        }
        this.mSps = byteBuffer;
        this.mPps = byteBuffer2;
        this.mNeedSortFrame = z;
        return 0;
    }

    public void enableHWDec(boolean z) {
        this.mHWDec = z;
    }

    private void addOneNalToDecoder(TXSNALPacket tXSNALPacket) {
        boolean z = tXSNALPacket.nalType == 0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("iframe", z);
        bundle.putByteArray("nal", tXSNALPacket.nalData);
        bundle.putLong("pts", tXSNALPacket.pts);
        bundle.putLong("dts", tXSNALPacket.dts);
        bundle.putInt("codecId", tXSNALPacket.codecId);
        Message message = new Message();
        message.what = 101;
        message.setData(bundle);
        a aVar = this.mDecoderHandler;
        if (aVar != null) {
            aVar.sendMessage(message);
        }
        this.mDecoderCacheNum++;
    }

    private void decNALByNewWay(TXSNALPacket tXSNALPacket) {
        if (this.mHWDec) {
            decodeFrame(tXSNALPacket.nalData, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation, tXSNALPacket.codecId, 0, 0, tXSNALPacket.nalType);
            return;
        }
        synchronized (this) {
            nativeDecodeFrame(this.mNativeContext, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation, tXSNALPacket.codecId);
        }
    }

    private void decNALByOldWay(TXSNALPacket tXSNALPacket) {
        try {
            boolean z = tXSNALPacket.nalType == 0;
            if (!this.mRecvFirstFrame && !z) {
                TXCLog.i(TAG, "play:decode: push nal ignore p frame when not got i frame");
                return;
            }
            if (!this.mRecvFirstFrame && z) {
                TXCLog.w(TAG, "play:decode: push first i frame");
                this.mRecvFirstFrame = true;
            }
            if (!this.mRestarting && tXSNALPacket.codecId == 1 && !this.mHWDec) {
                TXCLog.w(TAG, "play:decode: hevc decode error  ");
                g.a(this.mNotifyListener, -2304, "h265 Decoding failed");
                this.mRestarting = true;
            }
            if (this.mDecoderHandler != null) {
                if (!this.mNALList.isEmpty()) {
                    Iterator<TXSNALPacket> it = this.mNALList.iterator();
                    while (it.hasNext()) {
                        addOneNalToDecoder(it.next());
                    }
                }
                this.mNALList.clear();
                addOneNalToDecoder(tXSNALPacket);
                return;
            }
            if (z && !this.mNALList.isEmpty()) {
                this.mNALList.clear();
            }
            this.mNALList.add(tXSNALPacket);
            if (this.mRestarting) {
                return;
            }
            start();
        } catch (Exception e) {
            TXCLog.e(TAG, "decode NAL By Old way failed.", e);
        }
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) {
        decNALByNewWay(tXSNALPacket);
    }

    public synchronized int start() {
        if (this.mHWDec && this.mSurface == null) {
            TXCLog.i(TAG, "play:decode: start decoder error when not setup surface, id " + this.mUserId + CommonConstant.Symbol.UNDERLINE + this.mStreamType);
            return -1;
        } else if (this.mNativeContext != 0) {
            TXCLog.w(TAG, "play:decode: start decoder error when decoder is started, id " + this.mUserId + CommonConstant.Symbol.UNDERLINE + this.mStreamType);
            return -1;
        } else {
            TXCLog.w(TAG, "play:decode: start decoder java id " + this.mUserId + CommonConstant.Symbol.UNDERLINE + this.mStreamType + StringUtil.SPACE + hashCode());
            this.mNativeContext = nativeCreateContext(this.mHWDec);
            nativeSetID(this.mNativeContext, this.mUserId);
            nativeSetStreamType(this.mNativeContext, this.mStreamType);
            nativeEnableDecodeChange(this.mNativeContext, this.mEnableDecoderChange);
            nativeEnableRestartDecoder(this.mNativeContext, this.mEnableRestartDecoder);
            return 0;
        }
    }

    public synchronized void stop() {
        if (this.mNativeContext == 0) {
            TXCLog.w(TAG, "play:decode: stop decoder ignore when decoder is stopped, id " + this.mUserId + CommonConstant.Symbol.UNDERLINE + this.mStreamType);
            return;
        }
        TXCLog.w(TAG, "play:decode: stop decoder java id " + this.mUserId + CommonConstant.Symbol.UNDERLINE + this.mStreamType + StringUtil.SPACE + hashCode());
        nativeDestroyContext(this.mNativeContext);
        this.mNativeContext = 0L;
        this.mNALList.clear();
        this.mRecvFirstFrame = false;
        this.mDecoderCacheNum = 0;
        mDecodeFirstFrameTS = 0L;
        synchronized (this) {
            if (this.mVideoDecoder != null) {
                this.mVideoDecoder.stop();
                this.mVideoDecoder.setListener(null);
                this.mVideoDecoder.setNotifyListener(null);
                this.mVideoDecoder = null;
            }
            if (this.mSurface != null) {
                this.mSurface.release();
                this.mSurface = null;
            }
        }
    }

    public void restart(boolean z) {
        synchronized (this) {
            this.mHWDec = z;
            nativeReStart(this.mNativeContext, this.mHWDec);
        }
    }

    public int getDecoderCacheNum() {
        return this.mDecoderCacheNum + this.mNALList.size();
    }

    @Override // com.tencent.liteav.videodecoder.f
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3) {
        if (mDecodeFirstFrameTS == 0) {
            mDecodeFirstFrameTS = TXCTimeUtil.getTimeTick();
            StringBuilder sb = new StringBuilder("MediaCodec onDecodeFrame: decode first frame success:");
            sb.append(this.mUserId);
            sb.append(CommonConstant.Symbol.UNDERLINE);
            sb.append(this.mStreamType);
            TXCStatus.a(this.mUserId, 5005, this.mStreamType, Long.valueOf(mDecodeFirstFrameTS));
            TXCStatus.a(this.mUserId, 5004, this.mStreamType, Integer.valueOf(this.mHevc ? 3 : 1));
        }
        if (this.mDecoderListener != null) {
            this.mDecoderListener.onDecodeFrame(tXSVideoFrame, i, i2, j, j2, i3);
        }
        if (this.mDecoderCacheNum > 0) {
            this.mDecoderCacheNum--;
        }
        if (tXSVideoFrame == null) {
            synchronized (this) {
                nativeNotifyPts(this.mNativeContext, j, i, i2);
            }
        }
        int GetDecodeCost = this.mVideoDecoder.GetDecodeCost();
        if (this.mHWDec) {
            TXCStatus.a(this.mUserId, 8004, this.mStreamType, Integer.valueOf(GetDecodeCost));
        } else {
            TXCStatus.a(this.mUserId, TXLiteAVCode.EVT_ROOM_REQUEST_AVSEAT_SUCC, this.mStreamType, Integer.valueOf(GetDecodeCost));
        }
    }

    @Override // com.tencent.liteav.videodecoder.f
    public void onVideoSizeChange(int i, int i2) {
        f fVar = this.mDecoderListener;
        if (fVar != null) {
            if (this.mVideoWidth == i && this.mVideoHeight == i2) {
                return;
            }
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            fVar.onVideoSizeChange(this.mVideoWidth, this.mVideoHeight);
        }
    }

    @Override // com.tencent.liteav.videodecoder.f
    public void onDecodeFailed(int i) {
        if (this.mDecoderListener != null) {
            this.mDecoderListener.onDecodeFailed(i);
        }
        synchronized (this) {
            nativeDecCache(this.mNativeContext);
        }
    }

    public boolean isHevc() {
        a aVar = this.mDecoderHandler;
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    public long GetDecodeFirstFrameTS() {
        return mDecodeFirstFrameTS;
    }

    private int startDecodeThread() {
        synchronized (this) {
            if (this.mDecoderHandler != null) {
                TXCLog.e(TAG, "play:decode: start decoder error when decoder is started");
                return -1;
            }
            this.mDecoderCacheNum = 0;
            this.mRestarting = false;
            HandlerThread handlerThread = new HandlerThread("VDecoder");
            handlerThread.start();
            if (this.mHWDec) {
                handlerThread.setName("VideoWDec" + handlerThread.getId());
            } else {
                handlerThread.setName("VideoSWDec" + handlerThread.getId());
            }
            a aVar = new a(handlerThread.getLooper());
            aVar.a(this.mHevc, this.mHWDec, this.mSurface, this.mSps, this.mPps, this, this);
            TXCLog.w(TAG, "play:decode: start decode thread");
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.obj = Boolean.valueOf(this.mNeedSortFrame);
            aVar.sendMessage(obtain);
            this.mDecoderHandler = aVar;
            return 0;
        }
    }

    private void stopDecodeThread() {
        synchronized (this) {
            if (this.mDecoderHandler != null) {
                this.mDecoderHandler.sendEmptyMessage(102);
            }
            this.mDecoderHandler = null;
        }
    }

    private void notifyDecoderStartEvent(boolean z) {
        TXCEventRecorderProxy.a(this.mUserId, MapConstant.LayerPropertyFlag_MarkSortKey, z ? 1L : 0L, -1L, "", this.mStreamType);
        Bundle bundle = new Bundle();
        bundle.putInt(TXCAVRoomConstants.EVT_ID, 2008);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putCharSequence("EVT_MSG", z ? "Enables hardware decoding" : "Enables software decoding");
        bundle.putInt("EVT_PARAM1", z ? 1 : 2);
        g.a(this.mNotifyListener, this.mUserId, 2008, bundle);
        TXCKeyPointReportProxy.a(this.mUserId, 40026, z ? 1L : 2L, this.mStreamType);
    }

    private boolean hasSurface() {
        return this.mSurface != null;
    }

    static {
        g.f();
    }

    private void onDecodeDone(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3, int i4) {
        if (mDecodeFirstFrameTS == 0) {
            mDecodeFirstFrameTS = TXCTimeUtil.getTimeTick();
            StringBuilder sb = new StringBuilder("SoftDecode onDecodeFrame: decode first frame success:");
            sb.append(this.mUserId);
            sb.append(CommonConstant.Symbol.UNDERLINE);
            sb.append(this.mStreamType);
            TXCStatus.a(this.mUserId, 5005, this.mStreamType, Long.valueOf(mDecodeFirstFrameTS));
            TXCStatus.a(this.mUserId, 5004, this.mStreamType, Integer.valueOf(this.mHevc ? 2 : 0));
        }
        f fVar = this.mDecoderListener;
        if (fVar != null) {
            tXSVideoFrame.width = i;
            tXSVideoFrame.height = i2;
            tXSVideoFrame.rotation = i3;
            tXSVideoFrame.pts = j;
            tXSVideoFrame.frameType = i4;
            fVar.onDecodeFrame(tXSVideoFrame, i, i2, j, j2, i3);
            if (this.mVideoWidth == i && this.mVideoHeight == i2) {
                return;
            }
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            fVar.onVideoSizeChange(this.mVideoWidth, this.mVideoHeight);
        }
    }

    private void decodeFrame(byte[] bArr, long j, long j2, int i, int i2, int i3, int i4, int i5) {
        TXSNALPacket tXSNALPacket = new TXSNALPacket();
        tXSNALPacket.nalData = bArr;
        tXSNALPacket.pts = j;
        tXSNALPacket.dts = j2;
        tXSNALPacket.rotation = i;
        tXSNALPacket.codecId = i2;
        tXSNALPacket.nalType = i5;
        synchronized (this) {
            if (this.mNativeContext != 0 && this.mVideoDecoder == null) {
                e eVar = new e();
                eVar.a(i3, i4);
                eVar.setListener(this);
                eVar.setNotifyListener(new WeakReference<>(this));
                eVar.a(this.mDecFormat);
                eVar.config(this.mSurface);
                eVar.enableLimitDecCache(this.mEnableLimitDecCache);
                eVar.start(this.mSps, this.mPps, this.mNeedSortFrame, this.mHevc);
                notifyDecoderStartEvent(true);
                this.mVideoDecoder = eVar;
            }
            if (this.mVideoDecoder != null) {
                this.mVideoDecoder.decode(tXSNALPacket);
            }
        }
    }

    private synchronized void stopHWDecoder() {
        if (this.mVideoDecoder != null) {
            this.mVideoDecoder.stop();
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder = null;
        }
    }

    private void onStartDecoder(boolean z) {
        notifyDecoderStartEvent(z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends Handler {
        b a;
        f b;
        WeakReference<com.tencent.liteav.basic.c.b> c;
        boolean d;
        boolean e;
        Surface f;
        private ByteBuffer g;
        private ByteBuffer h;

        public a(Looper looper) {
            super(looper);
        }

        public void a(boolean z, boolean z2, Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, f fVar, com.tencent.liteav.basic.c.b bVar) {
            this.e = z;
            this.d = z2;
            this.f = surface;
            this.g = byteBuffer;
            this.h = byteBuffer2;
            this.b = fVar;
            this.c = new WeakReference<>(bVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 100:
                    a(((Boolean) message.obj).booleanValue());
                    return;
                case 101:
                    try {
                        Bundle data = message.getData();
                        a(data.getByteArray("nal"), data.getLong("pts"), data.getLong("dts"), data.getInt("codecId"));
                        return;
                    } catch (Exception e) {
                        TXCLog.e(TXCVideoDecoder.TAG, "decode frame failed." + e.getMessage());
                        return;
                    }
                case 102:
                    b();
                    return;
                case 103:
                    a(message.arg1 == 1, message.arg2 == 1);
                    return;
                default:
                    return;
            }
        }

        public boolean a() {
            if (this.a != null) {
                return this.a.isHevc();
            }
            return false;
        }

        private void a(byte[] bArr, long j, long j2, int i) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.pts = j;
            tXSNALPacket.dts = j2;
            tXSNALPacket.codecId = i;
            if (this.a != null) {
                this.a.decode(tXSNALPacket);
            }
        }

        private void b() {
            if (this.a != null) {
                this.a.stop();
                this.a.setListener(null);
                this.a.setNotifyListener(null);
                this.a = null;
            }
            Looper.myLooper().quit();
            TXCLog.w(TXCVideoDecoder.TAG, "play:decode: stop decode hwdec: " + this.d);
        }

        private void a(boolean z, boolean z2) {
            this.d = z;
            TXCLog.w(TXCVideoDecoder.TAG, "play:decode: restart decode hwdec: " + this.d);
            if (this.a != null) {
                this.a.stop();
                this.a.setListener(null);
                this.a.setNotifyListener(null);
                this.a = null;
            }
            a(z2);
        }

        private void a(boolean z) {
            if (this.a != null) {
                TXCLog.i(TXCVideoDecoder.TAG, "play:decode: start decode ignore hwdec: " + this.d);
                return;
            }
            if (this.d) {
                this.a = new e();
            } else {
                this.a = new TXCVideoFfmpegDecoder();
            }
            this.a.setListener(this.b);
            this.a.setNotifyListener(this.c);
            this.a.config(this.f);
            this.a.start(this.g, this.h, z, this.e);
            TXCLog.w(TXCVideoDecoder.TAG, "play:decode: start decode hwdec: " + this.d + ", hevc: " + this.e);
        }
    }
}
