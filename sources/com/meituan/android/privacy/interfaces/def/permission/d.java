package com.meituan.android.privacy.interfaces.def.permission;

import android.app.Activity;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.UiThread;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface d {
    @UiThread
    void a(@Nullable Activity activity, String str, String str2, @NonNull com.meituan.android.privacy.interfaces.d dVar, int i, int i2);

    void a(Fragment fragment, int i, @NonNull String[] strArr, @NonNull int[] iArr);

    @RequiresApi(api = 23)
    void a(Fragment fragment, String[] strArr, int i);

    void a(android.support.v4.app.Fragment fragment, int i, @NonNull String[] strArr, @NonNull int[] iArr);

    void a(android.support.v4.app.Fragment fragment, String[] strArr, int i);

    void a(@NonNull b bVar, @NonNull Activity activity, @NonNull l lVar);

    void a(String str, String str2, @NonNull com.meituan.android.privacy.interfaces.d dVar, int i, int i2);
}
