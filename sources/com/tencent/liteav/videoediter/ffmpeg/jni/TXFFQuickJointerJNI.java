package com.tencent.liteav.videoediter.ffmpeg.jni;

import com.tencent.liteav.basic.log.TXCLog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXFFQuickJointerJNI {
    private static final String TAG = "TXFFQuickJointerJNI";
    private long handle;
    private boolean isInitSuccess;
    private a mCallback;
    private int mTotalVideoNums;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(float f);
    }

    private native void destroy(long j);

    private native int getVideoHeight(long j);

    private native int getVideoWidth(long j);

    private native long init();

    private native void setDstPath(long j, String str);

    private native void setSrcPaths(long j, String[] strArr);

    private native int start(long j);

    private native int stop(long j);

    private native int verify(long j);

    public TXFFQuickJointerJNI() {
        this.handle = -1L;
        this.handle = init();
        if (this.handle != -1) {
            this.isInitSuccess = true;
        }
    }

    public synchronized void destroy() {
        if (this.isInitSuccess) {
            destroy(this.handle);
            this.isInitSuccess = false;
            this.handle = -1L;
        }
    }

    public synchronized int getVideoWidth() {
        if (this.isInitSuccess) {
            return getVideoWidth(this.handle);
        }
        return 0;
    }

    public synchronized int getVideoHeight() {
        if (this.isInitSuccess) {
            return getVideoHeight(this.handle);
        }
        return 0;
    }

    public synchronized void setSrcPaths(List<String> list) {
        if (this.isInitSuccess) {
            if (list != null && list.size() != 0) {
                this.mTotalVideoNums = list.size();
                String[] strArr = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    strArr[i] = list.get(i);
                }
                setSrcPaths(this.handle, strArr);
            }
            TXCLog.e(TAG, "quick joiner path empty!!!");
        }
    }

    public synchronized void setDstPath(String str) {
        if (this.isInitSuccess) {
            setDstPath(this.handle, str);
        }
    }

    public synchronized int start() {
        if (this.isInitSuccess) {
            if (this.mTotalVideoNums == 0) {
                TXCLog.e(TAG, "quick joiner path empty!!!");
                return -1;
            }
            return start(this.handle);
        }
        return -1;
    }

    public synchronized int verify() {
        if (this.isInitSuccess) {
            return verify(this.handle);
        }
        return -1;
    }

    public synchronized void stop() {
        if (this.isInitSuccess) {
            stop(this.handle);
        }
    }

    public void setOnJoinerCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void callbackFromNative(int i) {
        TXCLog.i(TAG, "callbackFromNative: index = " + i);
        if (this.mCallback != null) {
            this.mCallback.a(this.mTotalVideoNums > 0 ? (i + 1) / this.mTotalVideoNums : 0.0f);
        }
    }
}
