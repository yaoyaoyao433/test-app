package com.hhmedic.android.sdk.base.net.open;

import android.content.Context;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHNetFetch {
    public static <T> void request(Context context, HHRequestConfig hHRequestConfig, HHGsonRequest.OnNetListener<T> onNetListener) {
        if (hHRequestConfig == null) {
            return;
        }
        new HHGsonRequest(hHRequestConfig, onNetListener).start();
    }
}
