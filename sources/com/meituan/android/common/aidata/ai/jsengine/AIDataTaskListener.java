package com.meituan.android.common.aidata.ai.jsengine;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface AIDataTaskListener {
    void onFailed(@Nullable BlueException blueException);

    void onSuccess(@Nullable String str, @Nullable JSValueWrapper jSValueWrapper);
}
