package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    
    public final int d;

    YogaMeasureMode(int i) {
        this.d = i;
    }

    public static YogaMeasureMode a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return EXACTLY;
            case 2:
                return AT_MOST;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
