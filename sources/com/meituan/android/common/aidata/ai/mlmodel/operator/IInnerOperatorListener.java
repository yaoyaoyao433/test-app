package com.meituan.android.common.aidata.ai.mlmodel.operator;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IInnerOperatorListener {
    void onFailed(@Nullable BlueException blueException);

    void onSuccess(@Nullable JSONArray jSONArray);
}
