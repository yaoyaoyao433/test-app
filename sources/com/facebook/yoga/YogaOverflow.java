package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaOverflow {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);
    
    final int d;

    YogaOverflow(int i) {
        this.d = i;
    }

    public static YogaOverflow a(int i) {
        switch (i) {
            case 0:
                return VISIBLE;
            case 1:
                return HIDDEN;
            case 2:
                return SCROLL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
