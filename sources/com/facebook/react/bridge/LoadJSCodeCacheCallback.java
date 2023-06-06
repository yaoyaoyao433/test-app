package com.facebook.react.bridge;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface LoadJSCodeCacheCallback {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum LoadStatus {
        loaded,
        nonexistent,
        invalid,
        unmatched,
        unsupported
    }

    void onLoad(String str, String str2, LoadStatus loadStatus);
}
