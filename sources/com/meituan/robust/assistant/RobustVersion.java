package com.meituan.robust.assistant;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustVersion {
    public static final String ROBUST_VERSION_NAME = "0.8.28";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeVersionCode() {
        String[] split;
        int parseInt;
        if (TextUtils.isEmpty("0.8.28") || (split = "0.8.28".split("\\.")) == null) {
            return 0;
        }
        int[] iArr = {1000000, 10000, 100, 1};
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (i2 < split.length) {
                try {
                    parseInt = Integer.parseInt(split[i2]);
                } catch (Throwable unused) {
                }
                i += iArr[i2] * parseInt;
            }
            parseInt = 0;
            i += iArr[i2] * parseInt;
        }
        return i;
    }
}
