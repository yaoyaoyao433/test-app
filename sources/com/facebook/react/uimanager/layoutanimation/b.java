package com.facebook.react.uimanager.layoutanimation;

import com.meituan.android.recce.views.anim.RecceAnimUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals(RecceAnimUtils.SCALE_X)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals(RecceAnimUtils.SCALE_Y)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1910893003:
                if (str.equals("scaleXY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return OPACITY;
            case 1:
                return SCALE_X;
            case 2:
                return SCALE_Y;
            case 3:
                return SCALE_XY;
            default:
                throw new IllegalArgumentException("Unsupported animated property: " + str);
        }
    }
}
