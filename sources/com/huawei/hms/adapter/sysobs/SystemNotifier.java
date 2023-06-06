package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface SystemNotifier {
    void notifyObservers(int i);

    void notifyObservers(Intent intent, String str);

    void registerObserver(SystemObserver systemObserver);

    void unRegisterObserver(SystemObserver systemObserver);
}
