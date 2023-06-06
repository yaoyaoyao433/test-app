package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    public final int d;

    YogaDirection(int i) {
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    public static YogaDirection a(int i) {
        switch (i) {
            case 0:
                return INHERIT;
            case 1:
                return LTR;
            case 2:
                return RTL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
