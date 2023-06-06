package com.meituan.android.common.aidata.jsengine.utils;

import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IJSCallback {
    void onFailed(String str, BlueException blueException);

    void onSuccess(String str, String str2, JSValueWrapper jSValueWrapper);
}
