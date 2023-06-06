package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaJustify {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);
    
    public final int g;

    YogaJustify(int i) {
        this.g = i;
    }

    public final int a() {
        return this.g;
    }

    public static YogaJustify a(int i) {
        switch (i) {
            case 0:
                return FLEX_START;
            case 1:
                return CENTER;
            case 2:
                return FLEX_END;
            case 3:
                return SPACE_BETWEEN;
            case 4:
                return SPACE_AROUND;
            case 5:
                return SPACE_EVENLY;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
