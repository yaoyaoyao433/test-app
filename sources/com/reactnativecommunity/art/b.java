package com.reactnativecommunity.art;

import com.facebook.react.bridge.ReadableArray;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static float[] a(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = new float[readableArray.size()];
            a(readableArray, fArr);
            return fArr;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(ReadableArray readableArray, float[] fArr) {
        int length = readableArray.size() > fArr.length ? fArr.length : readableArray.size();
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        return readableArray.size();
    }
}
