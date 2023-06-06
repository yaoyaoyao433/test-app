package com.meituan.metrics.traffic.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DetailUnit {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int count;
    public long downTotal;
    public long mobileTotal;
    public long total;
    public long upTotal;
    public long wifiTotal;

    public DetailUnit(long j, long j2, boolean z) {
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c9973d31613baa3c77353608a04c5bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c9973d31613baa3c77353608a04c5bb");
        } else {
            updateNewTraffic(j, j2, z);
        }
    }

    public void updateNewTraffic(long j, long j2, boolean z) {
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0176d53bd8e280a0197f52c94e59084d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0176d53bd8e280a0197f52c94e59084d");
        } else if (z) {
            updateNewTraffic(j, j2, j + j2, 0L);
        } else {
            updateNewTraffic(j, j2, 0L, j + j2);
        }
    }

    public void updateNewTraffic(long j, long j2, long j3, long j4) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00a4b599365552a30dfa64c9efc0359d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00a4b599365552a30dfa64c9efc0359d");
            return;
        }
        this.total += j + j2;
        this.upTotal += j2;
        this.downTotal += j;
        this.wifiTotal += j3;
        this.mobileTotal += j4;
        this.count++;
    }
}
