package com.huawei.updatesdk.service.otaupdate;

import android.content.Intent;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface CheckUpdateCallBack {
    void onMarketInstallInfo(Intent intent);

    void onMarketStoreError(int i);

    void onUpdateInfo(Intent intent);

    void onUpdateStoreError(int i);
}
