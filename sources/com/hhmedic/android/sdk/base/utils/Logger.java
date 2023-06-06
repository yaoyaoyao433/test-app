package com.hhmedic.android.sdk.base.utils;

import android.text.TextUtils;
import android.util.Log;
import com.hhmedic.android.sdk.base.BaseConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Logger {
    public static void e(String str) {
        if (BaseConfig.isDebug && !TextUtils.isEmpty(str)) {
            Log.e("HH", str);
        }
    }
}
