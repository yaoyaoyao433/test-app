package com.facebook.react.bridge;

import android.support.annotation.NonNull;
import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public interface NativeModule {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    @NonNull
    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}
