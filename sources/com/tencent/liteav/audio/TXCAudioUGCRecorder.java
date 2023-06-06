package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecord;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCAudioUGCRecorder implements com.tencent.liteav.audio.impl.Record.c {
    private static final TXCAudioUGCRecorder INSTANCE;
    private static final String TAG = "AudioCenter:TXCAudioUGCRecorder";
    protected Context mContext;
    private WeakReference<g> mWeakRecordListener;
    private final int AAC_SAMPLE_NUM = 1024;
    protected AtomicInteger mSampleRate = new AtomicInteger(48000);
    protected int mChannels = 1;
    protected int mBits = 16;
    protected int mAACFrameLength = ((this.mChannels * 1024) * this.mBits) / 8;
    protected int mReverbType = 0;
    protected int mVoiceChangerType = 0;
    protected int mAECType = 0;
    protected boolean mIsEarphoneOn = false;
    private long mLastPTS = 0;
    private float mVolume = 1.0f;
    private com.tencent.liteav.audio.impl.Record.a mBGMRecorder = null;
    private boolean mEnableBGMRecord = false;
    private int mShouldClearAACDataCnt = 0;
    private boolean mCurBGMRecordFlag = false;
    private AtomicReference<Float> mSpeedRate = new AtomicReference<>(Float.valueOf(1.0f));
    private boolean mIsRunning = false;
    private boolean mIsPause = false;
    private boolean mIsMute = false;
    private final List<byte[]> mEncodedAudioList = new ArrayList();

    private native void nativeClassInit();

    private native void nativeEnableMixMode(boolean z);

    private native void nativeSetChangerType(int i);

    private native void nativeSetReverbType(int i);

    private native void nativeSetSpeedRate(float f);

    private native void nativeSetVolume(float f);

    private native void nativeStartAudioRecord(int i, int i2, int i3);

    private native void nativeStopAudioRecord();

    static {
        com.tencent.liteav.basic.util.g.f();
        INSTANCE = new TXCAudioUGCRecorder();
    }

    public static TXCAudioUGCRecorder getInstance() {
        return INSTANCE;
    }

    private TXCAudioUGCRecorder() {
        TXCAudioSysRecord.getInstance();
        nativeClassInit();
    }

    public int startRecord(Context context) {
        TXCLog.i(TAG, "startRecord");
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        updateAudioEffector();
        TXCAudioSysRecord.getInstance().setAudioRecordListener(this);
        nativeStartAudioRecord(this.mSampleRate.get(), this.mChannels, this.mBits);
        this.mIsRunning = true;
        this.mLastPTS = 0L;
        return 0;
    }

    public int stopRecord() {
        TXCLog.i(TAG, "stopRecord");
        TXCAudioSysRecord.getInstance().setAudioRecordListener(null);
        if (this.mBGMRecorder != null) {
            this.mBGMRecorder.a();
            this.mBGMRecorder = null;
        }
        nativeStopAudioRecord();
        nativeEnableMixMode(false);
        nativeSetVolume(1.0f);
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.clear();
        }
        this.mIsRunning = false;
        this.mLastPTS = 0L;
        this.mIsPause = false;
        this.mIsMute = false;
        this.mShouldClearAACDataCnt = 0;
        return 0;
    }

    public void pause() {
        TXCLog.i(TAG, "pause");
        TXCAudioEngine.getInstance().pauseLocalAudio();
        synchronized (this.mEncodedAudioList) {
            this.mIsPause = true;
        }
    }

    public void resume() {
        TXCLog.i(TAG, "resume");
        TXCAudioEngine.getInstance().resumeLocalAudio();
        synchronized (this.mEncodedAudioList) {
            this.mIsPause = false;
        }
        nativeEnableMixMode(this.mEnableBGMRecord);
        if (this.mIsMute || this.mEnableBGMRecord) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(this.mVolume);
        }
    }

    public synchronized void setListener(g gVar) {
        if (gVar == null) {
            this.mWeakRecordListener = null;
        } else {
            this.mWeakRecordListener = new WeakReference<>(gVar);
        }
    }

    public g getListener() {
        if (this.mWeakRecordListener != null) {
            return this.mWeakRecordListener.get();
        }
        return null;
    }

    public void setChannels(int i) {
        TXCLog.i(TAG, "setChannels: " + i);
        this.mChannels = i;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public void setSampleRate(int i) {
        TXCLog.i(TAG, "setSampleRate: " + i);
        this.mSampleRate.set(i);
    }

    public int getSampleRate() {
        return this.mSampleRate.get();
    }

    public synchronized void setReverbType(int i) {
        TXCLog.i(TAG, "setReverbType: " + i);
        this.mReverbType = i;
        nativeSetReverbType(i);
    }

    public void setAECType(int i, Context context) {
        TXCLog.i(TAG, "setAECType: " + i);
        this.mAECType = i;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }

    public void setMute(boolean z) {
        TXCLog.i(TAG, "setMute: " + z);
        this.mIsMute = z;
        if (z) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(this.mVolume);
        }
    }

    public void enableBGMRecord(boolean z) {
        TXCLog.i(TAG, "enableBGMRecord: " + z);
        if (this.mEnableBGMRecord != z && !z) {
            this.mShouldClearAACDataCnt = 2;
        }
        this.mEnableBGMRecord = z;
        updateAudioEffector();
    }

    public boolean isRecording() {
        return this.mIsRunning;
    }

    public boolean isPaused() {
        return this.mIsPause;
    }

    public void onEncodedData(byte[] bArr) {
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.add(bArr);
        }
    }

    public synchronized void setVolume(float f) {
        TXCLog.i(TAG, "setVolume: " + f);
        this.mVolume = f;
        if (this.mIsMute) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(f);
        }
    }

    public synchronized void setSpeedRate(float f) {
        TXCLog.i(TAG, "setSpeedRate: " + f);
        this.mSpeedRate.set(Float.valueOf(f));
        nativeSetSpeedRate(this.mSpeedRate.get().floatValue());
    }

    public synchronized void clearCache() {
        TXCLog.i(TAG, "clearCache");
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.clear();
        }
    }

    @Override // com.tencent.liteav.audio.impl.Record.c
    public void onAudioRecordStart() {
        TXCLog.i(TAG, "sys audio record start");
    }

    @Override // com.tencent.liteav.audio.impl.Record.c
    public void onAudioRecordStop() {
        TXCLog.i(TAG, "sys audio record stop");
    }

    @Override // com.tencent.liteav.audio.impl.Record.c
    public void onAudioRecordError(int i, String str) {
        TXCLog.e(TAG, "sys audio record error: " + i + ", " + str);
        g listener = getListener();
        if (listener != null) {
            listener.onRecordError(i, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0075, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0017, B:11:0x001b, B:13:0x002d, B:16:0x0036, B:18:0x003e, B:20:0x0055, B:22:0x005d, B:19:0x004e, B:23:0x0071), top: B:29:0x000e }] */
    @Override // com.tencent.liteav.audio.impl.Record.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAudioRecordPCM(byte[] r8, int r9, long r10) {
        /*
            r7 = this;
            long r8 = r7.mLastPTS
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto Lb
            long r8 = r7.mLastPTS
            r10 = 2
            long r10 = r10 + r8
        Lb:
            java.util.List<byte[]> r8 = r7.mEncodedAudioList
            monitor-enter(r8)
            java.util.List<byte[]> r9 = r7.mEncodedAudioList     // Catch: java.lang.Throwable -> L75
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L75
            r0 = 0
            if (r9 != 0) goto L33
            boolean r9 = r7.mIsPause     // Catch: java.lang.Throwable -> L75
            if (r9 != 0) goto L33
            java.util.List<byte[]> r9 = r7.mEncodedAudioList     // Catch: java.lang.Throwable -> L75
            r1 = 0
            java.lang.Object r9 = r9.get(r1)     // Catch: java.lang.Throwable -> L75
            byte[] r9 = (byte[]) r9     // Catch: java.lang.Throwable -> L75
            java.util.List<byte[]> r2 = r7.mEncodedAudioList     // Catch: java.lang.Throwable -> L75
            r2.remove(r1)     // Catch: java.lang.Throwable -> L75
            int r1 = r7.mShouldClearAACDataCnt     // Catch: java.lang.Throwable -> L75
            if (r1 <= 0) goto L34
            int r9 = r7.mShouldClearAACDataCnt     // Catch: java.lang.Throwable -> L75
            int r9 = r9 + (-1)
            r7.mShouldClearAACDataCnt = r9     // Catch: java.lang.Throwable -> L75
        L33:
            r9 = r0
        L34:
            if (r9 == 0) goto L71
            r7.mLastPTS = r10     // Catch: java.lang.Throwable -> L75
            com.tencent.liteav.audio.g r0 = r7.getListener()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L4e
            java.util.concurrent.atomic.AtomicInteger r1 = r7.mSampleRate     // Catch: java.lang.Throwable -> L75
            int r4 = r1.get()     // Catch: java.lang.Throwable -> L75
            int r5 = r7.mChannels     // Catch: java.lang.Throwable -> L75
            int r6 = r7.mBits     // Catch: java.lang.Throwable -> L75
            r1 = r9
            r2 = r10
            r0.onRecordEncData(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L75
            goto L55
        L4e:
            java.lang.String r0 = "AudioCenter:TXCAudioUGCRecorder"
            java.lang.String r1 = "onAudioRecordPCM listener is null"
            com.tencent.liteav.basic.log.TXCLog.e(r0, r1)     // Catch: java.lang.Throwable -> L75
        L55:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.mSampleRate     // Catch: java.lang.Throwable -> L75
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L75
            if (r0 <= 0) goto L71
            r1 = 1232732160(0x497a0000, float:1024000.0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Float> r2 = r7.mSpeedRate     // Catch: java.lang.Throwable -> L75
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L75
            java.lang.Float r2 = (java.lang.Float) r2     // Catch: java.lang.Throwable -> L75
            float r2 = r2.floatValue()     // Catch: java.lang.Throwable -> L75
            float r2 = r2 * r1
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L75
            float r2 = r2 / r0
            long r0 = (long) r2     // Catch: java.lang.Throwable -> L75
            long r10 = r10 + r0
        L71:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L75
            if (r9 != 0) goto Lb
            return
        L75:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L75
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.TXCAudioUGCRecorder.onAudioRecordPCM(byte[], int, long):void");
    }

    private synchronized void updateAudioEffector() {
        boolean z = false;
        z = (this.mEnableBGMRecord || this.mAECType == 1) ? true : true;
        if (!z) {
            nativeSetReverbType(this.mReverbType);
            nativeSetChangerType(this.mVoiceChangerType);
            if (this.mIsMute) {
                nativeSetVolume(0.0f);
            } else {
                nativeSetVolume(this.mVolume);
            }
        }
        if (z) {
            nativeSetVolume(0.0f);
        }
        nativeEnableMixMode(z);
        nativeSetSpeedRate(this.mSpeedRate.get().floatValue());
    }

    public synchronized void setChangerType(int i) {
        TXCLog.i(TAG, "setChangerType: " + i);
        this.mVoiceChangerType = i;
        nativeSetChangerType(i);
    }
}
