package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.g.h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXVideoInfoReader {
    private static final int RETRY_MAX_COUNT = 3;
    private static TXVideoInfoReader sInstance;
    private Context mContext;
    private int mCount;
    private a mGenerateImageThread;
    private long mImageVideoDuration;
    private volatile WeakReference<OnSampleProgrocess> mListener;
    private String mVideoPath;
    private String TAG = "TXVideoInfoReader";
    private AtomicInteger mRetryGeneThreadTimes = new AtomicInteger(0);
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnSampleProgrocess {
        void sampleProcess(int i, Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getDuration(String str) {
        try {
            h hVar = new h();
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                hVar.a(str);
                long a2 = hVar.a();
                hVar.i();
                return a2;
            }
            return 0L;
        } catch (RuntimeException e) {
            TXCLog.e(this.TAG, "get duration failed.", e);
            return 0L;
        }
    }

    private TXVideoInfoReader(Context context) {
        this.mContext = context;
    }

    private TXVideoInfoReader() {
    }

    @Deprecated
    public static TXVideoInfoReader getInstance() {
        if (sInstance == null) {
            sInstance = new TXVideoInfoReader();
        }
        return sInstance;
    }

    public static TXVideoInfoReader getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new TXVideoInfoReader(context);
        }
        return sInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.ugc.TXVideoEditConstants.TXVideoInfo getVideoFileInfo(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.ugc.TXVideoInfoReader.getVideoFileInfo(java.lang.String):com.tencent.ugc.TXVideoEditConstants$TXVideoInfo");
    }

    public Bitmap getSampleImage(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.w(this.TAG, "videoPath is null");
            return null;
        } else if (!new File(str).exists()) {
            TXCLog.w(this.TAG, "videoPath is not exist");
            return null;
        } else {
            h hVar = new h();
            hVar.a(str);
            this.mImageVideoDuration = hVar.a() * 1000;
            long j2 = j * 1000;
            if (j2 > this.mImageVideoDuration) {
                j2 = this.mImageVideoDuration;
            }
            if (this.mImageVideoDuration <= 0) {
                TXCLog.w(this.TAG, "video duration is 0");
                hVar.i();
                return null;
            }
            Bitmap a2 = hVar.a(j2);
            if (a2 == null) {
                TXCLog.e(this.TAG, "getSampleImages failed!!!");
                hVar.i();
                return a2;
            }
            String str2 = this.TAG;
            TXCLog.d(str2, "getSampleImages bmp  = " + a2 + ",time=" + j2 + ",duration=" + this.mImageVideoDuration);
            hVar.i();
            return a2;
        }
    }

    public void getSampleImages(int i, String str, OnSampleProgrocess onSampleProgrocess) {
        this.mCount = i;
        this.mListener = new WeakReference<>(onSampleProgrocess);
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            cancelThread();
            this.mGenerateImageThread = new a(str);
            this.mGenerateImageThread.start();
            TXCLog.i(this.TAG, "getSampleImages: thread start");
        }
    }

    public void cancel() {
        cancelThread();
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.mListener != null) {
            this.mListener.clear();
            this.mListener = null;
        }
    }

    private void cancelThread() {
        if (this.mGenerateImageThread == null || !this.mGenerateImageThread.isAlive() || this.mGenerateImageThread.isInterrupted()) {
            return;
        }
        TXCLog.i(this.TAG, "cancelThread: thread cancel");
        this.mGenerateImageThread.interrupt();
        this.mGenerateImageThread = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends Thread {
        private h b;
        private String c;
        private long d;
        private volatile Bitmap e;
        private int f;

        public a(String str) {
            this.f = TXVideoInfoReader.this.mListener.hashCode();
            this.c = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.b = new h();
            this.b.a(this.c);
            this.d = this.b.a() * 1000;
            long j = this.d / TXVideoInfoReader.this.mCount;
            TXCLog.i(TXVideoInfoReader.this.TAG, String.format("run duration = %s ", Long.valueOf(this.d)));
            TXCLog.i(TXVideoInfoReader.this.TAG, String.format("run count = %s ", Integer.valueOf(TXVideoInfoReader.this.mCount)));
            final int i = 0;
            while (true) {
                if (i >= TXVideoInfoReader.this.mCount || Thread.currentThread().isInterrupted()) {
                    break;
                }
                long j2 = i * j;
                if (j2 > this.d) {
                    j2 = this.d;
                }
                TXCLog.i(TXVideoInfoReader.this.TAG, String.format("current frame time = %s", Long.valueOf(j2)));
                final Bitmap a = this.b.a(j2);
                String str = TXVideoInfoReader.this.TAG;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Boolean.valueOf(a == null);
                TXCLog.i(str, String.format("the %s of bitmap is null ? %s", objArr));
                if (a == null) {
                    TXCLog.w(TXVideoInfoReader.this.TAG, "getSampleImages failed!!!");
                    if (i == 0) {
                        if (TXVideoInfoReader.this.mRetryGeneThreadTimes.get() < 3) {
                            TXCLog.d(TXVideoInfoReader.this.TAG, "retry to get sample images");
                            TXVideoInfoReader.this.mHandler.post(new Runnable() { // from class: com.tencent.ugc.TXVideoInfoReader.a.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TXVideoInfoReader.this.getSampleImages(TXVideoInfoReader.this.mCount, a.this.c, (OnSampleProgrocess) TXVideoInfoReader.this.mListener.get());
                                    TXVideoInfoReader.this.mRetryGeneThreadTimes.getAndIncrement();
                                }
                            });
                        }
                    } else if (this.e != null && !this.e.isRecycled()) {
                        TXCLog.i(TXVideoInfoReader.this.TAG, "copy last image");
                        a = this.e.copy(this.e.getConfig(), true);
                    }
                }
                this.e = a;
                if (TXVideoInfoReader.this.mRetryGeneThreadTimes.get() != 0) {
                    TXVideoInfoReader.this.mRetryGeneThreadTimes.getAndSet(0);
                }
                if (TXVideoInfoReader.this.mListener != null && TXVideoInfoReader.this.mListener.get() != null && TXVideoInfoReader.this.mCount > 0 && TXVideoInfoReader.this.mListener.hashCode() == this.f) {
                    TXVideoInfoReader.this.mHandler.post(new Runnable() { // from class: com.tencent.ugc.TXVideoInfoReader.a.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (TXVideoInfoReader.this.mListener == null || TXVideoInfoReader.this.mListener.get() == null || TXVideoInfoReader.this.mListener.hashCode() != a.this.f) {
                                return;
                            }
                            TXCLog.i(TXVideoInfoReader.this.TAG, "return image success");
                            ((OnSampleProgrocess) TXVideoInfoReader.this.mListener.get()).sampleProcess(i, a);
                        }
                    });
                }
                i++;
            }
            this.e = null;
            this.b.i();
        }
    }
}
