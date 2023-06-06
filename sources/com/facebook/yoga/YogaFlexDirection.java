package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public enum YogaFlexDirection {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);
    
    public final int e;

    YogaFlexDirection(int i) {
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    public static YogaFlexDirection a(int i) {
        switch (i) {
            case 0:
                return COLUMN;
            case 1:
                return COLUMN_REVERSE;
            case 2:
                return ROW;
            case 3:
                return ROW_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
