package com.meituan.android.common.weaver.interfaces;

import android.support.annotation.NonNull;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface WeaverEvent {
    long createMs();

    void fromJson(@NonNull String str, @NonNull JSONObject jSONObject, long j);

    @NonNull
    String getType();

    @NonNull
    JSONObject toJson();
}
