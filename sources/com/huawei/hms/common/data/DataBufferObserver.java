package com.huawei.hms.common.data;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface DataBufferObserver {
    void onDataChanged();

    void onDataRangeChanged(int i, int i2);

    void onDataRangeInserted(int i, int i2);

    void onDataRangeMoved(int i, int i2, int i3);

    void onDataRangeRemoved(int i, int i2);
}
