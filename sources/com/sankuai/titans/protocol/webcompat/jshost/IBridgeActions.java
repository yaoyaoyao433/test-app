package com.sankuai.titans.protocol.webcompat.jshost;

import android.content.Intent;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IBridgeActions {
    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onPause();

    void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    void onResume();

    void onStop();
}
