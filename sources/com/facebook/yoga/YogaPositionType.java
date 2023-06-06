package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaPositionType {
    RELATIVE(0),
    ABSOLUTE(1);
    
    public final int c;

    YogaPositionType(int i) {
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public static YogaPositionType a(int i) {
        switch (i) {
            case 0:
                return RELATIVE;
            case 1:
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
