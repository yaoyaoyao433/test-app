package com.sankuai.meituan.navigation.common;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes4.dex */
public interface g {
    @Nullable
    Navigator<? extends c> a(@NonNull Navigator<? extends c> navigator);

    @NonNull
    <D extends c, T extends Navigator<? extends D>> T a(@NonNull String str);
}
