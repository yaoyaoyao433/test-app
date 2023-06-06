package com.facebook.react.modules.storage;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap a(@Nullable String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }
}
