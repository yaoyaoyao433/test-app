package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaWrap {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);
    
    public final int d;

    YogaWrap(int i) {
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public static YogaWrap a(int i) {
        switch (i) {
            case 0:
                return NO_WRAP;
            case 1:
                return WRAP;
            case 2:
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
