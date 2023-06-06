package com.sankuai.meituan.android.knb;

import android.app.Activity;
import android.content.Intent;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IKnbActivityHandler {
    void handleFinish();

    Activity handleGetActivity();

    Intent handleGetIntent();

    boolean handleIsFinishing();

    void handleOverridePendingTransition(int i, int i2);

    void handleStartActivity(Intent intent);

    void handleStartActivityForResult(Intent intent, int i);
}
