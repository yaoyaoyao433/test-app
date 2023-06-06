package com.meituan.android.common.aidata.jsengine.utils;

import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface JSCallback {
    void onFailed(String str, BlueException blueException, int i, long j);

    void onSuccess(String str, JSValueWrapper jSValueWrapper, int i, long j);
}
