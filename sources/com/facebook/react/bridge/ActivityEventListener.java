package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i, int i2, Intent intent);

    void onNewIntent(Intent intent);
}
