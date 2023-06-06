package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaDisplay {
    FLEX(0),
    NONE(1);
    
    final int c;

    YogaDisplay(int i) {
        this.c = i;
    }

    public static YogaDisplay a(int i) {
        switch (i) {
            case 0:
                return FLEX;
            case 1:
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
