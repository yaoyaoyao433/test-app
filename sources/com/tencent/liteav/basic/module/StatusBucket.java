package com.tencent.liteav.basic.module;

import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class StatusBucket {
    private static final String TAG = "com.tencent.liteav.basic.module.StatusBucket";
    private long mBucketObj;

    private static native long nativeCreateStatusBucket();

    private static native void nativeDestroyStatusBucket(long j);

    private static native boolean nativeGetBooleanStatus(long j, String str, int i);

    private static native int nativeGetIntStatus(long j, String str, int i);

    private static native long nativeGetLongStatus(long j, String str, int i);

    private static native void nativeMerge(long j, long j2);

    private static native void nativeSetBooleanStatus(long j, String str, int i, boolean z);

    private static native void nativeSetIntStatus(long j, String str, int i, int i2);

    private static native void nativeSetLongStatus(long j, String str, int i, long j2);

    public StatusBucket() {
        this.mBucketObj = 0L;
        this.mBucketObj = nativeCreateStatusBucket();
    }

    public StatusBucket(long j) {
        this.mBucketObj = 0L;
        this.mBucketObj = j;
    }

    public void setBooleanStatus(String str, int i, boolean z) {
        nativeSetBooleanStatus(this.mBucketObj, str, i, z);
    }

    public void setIntStatus(String str, int i, int i2) {
        nativeSetIntStatus(this.mBucketObj, str, i, i2);
    }

    public void setLongStatus(String str, int i, long j) {
        nativeSetLongStatus(this.mBucketObj, str, i, j);
    }

    public boolean getBooleanStatus(String str, int i) {
        return nativeGetBooleanStatus(this.mBucketObj, str, i);
    }

    public int getIntStatus(String str, int i) {
        return nativeGetIntStatus(this.mBucketObj, str, i);
    }

    public long getLongStatus(String str, int i) {
        return nativeGetLongStatus(this.mBucketObj, str, i);
    }

    public void merge(StatusBucket statusBucket) {
        nativeMerge(this.mBucketObj, statusBucket.mBucketObj);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j = this.mBucketObj;
        this.mBucketObj = 0L;
        nativeDestroyStatusBucket(j);
    }

    public static void testStatusBucket() {
        StatusBucket statusBucket = new StatusBucket();
        StatusBucket statusBucket2 = new StatusBucket();
        statusBucket.setBooleanStatus("1", 1, true);
        statusBucket.setIntStatus("2", 2, 2);
        statusBucket.setLongStatus("3", 3, 3L);
        statusBucket2.setIntStatus("1", 4, 4);
        statusBucket2.setBooleanStatus("5", 5, true);
        statusBucket2.setLongStatus("6", 6, 6L);
        statusBucket.merge(statusBucket2);
        String str = TAG;
        TXCLog.e(str, "test_status_bucket: id:1, key:1, value:" + statusBucket.getBooleanStatus("1", 1));
        String str2 = TAG;
        TXCLog.e(str2, "test_status_bucket: id:1, key:4, value:" + statusBucket.getIntStatus("1", 4));
        String str3 = TAG;
        TXCLog.e(str3, "test_status_bucket: id:2, key:2, value:" + statusBucket.getIntStatus("2", 2));
        String str4 = TAG;
        TXCLog.e(str4, "test_status_bucket: id:3, key:3, value:" + statusBucket.getLongStatus("3", 3));
        String str5 = TAG;
        TXCLog.e(str5, "test_status_bucket: id:5, key:5, value:" + statusBucket.getBooleanStatus("5", 5));
        String str6 = TAG;
        TXCLog.e(str6, "test_status_bucket: id:6, key:6, value:" + statusBucket.getLongStatus("6", 6));
    }
}
