package com.meituan.metrics.traffic;

import android.app.usage.NetworkStats;
import android.support.annotation.Keep;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
@RequiresApi(api = 28)
/* loaded from: classes3.dex */
public class TrafficBucket {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long mDefaultNetworkStatus;
    public long mEndTimeStamp;
    public int mMetered;
    public int mRoaming;
    public long mRxBytes;
    public long mRxPackets;
    public long mStartTimeStamp;
    public int mState;
    public long mTxBytes;
    public long mTxPackets;

    public void copyValueFrom(NetworkStats.Bucket bucket) {
        Object[] objArr = {bucket};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97e333f2b720d51029974da478f961dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97e333f2b720d51029974da478f961dd");
            return;
        }
        this.mStartTimeStamp = bucket.getStartTimeStamp();
        this.mEndTimeStamp = bucket.getEndTimeStamp();
        this.mDefaultNetworkStatus = bucket.getDefaultNetworkStatus();
        this.mMetered = bucket.getMetered();
        this.mRoaming = bucket.getRoaming();
        this.mState = bucket.getState();
        this.mRxBytes = bucket.getRxBytes();
        this.mRxPackets = bucket.getRxPackets();
        this.mTxBytes = bucket.getTxBytes();
        this.mTxPackets = bucket.getTxPackets();
    }
}
