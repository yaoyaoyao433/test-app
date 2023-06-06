package com.meituan.android.common.aidata.ai.mlmodel.operator;

import android.support.annotation.Nullable;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ISingleOperatorListener {
    void onFailed(@Nullable Exception exc);

    void onSuccess(@Nullable JSONArray jSONArray, String str);
}
