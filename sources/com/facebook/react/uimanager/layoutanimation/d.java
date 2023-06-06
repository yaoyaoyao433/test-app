package com.facebook.react.uimanager.layoutanimation;

import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum d {
    LINEAR,
    EASE_IN,
    EASE_OUT,
    EASE_IN_EASE_OUT,
    SPRING;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d a(String str) {
        char c;
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1965056864:
                if (lowerCase.equals("easeout")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1310315117:
                if (lowerCase.equals("easein")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1102672091:
                if (lowerCase.equals(CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -895679987:
                if (lowerCase.equals("spring")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1164546989:
                if (lowerCase.equals("easeineaseout")) {
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
                return LINEAR;
            case 1:
                return EASE_IN;
            case 2:
                return EASE_OUT;
            case 3:
                return EASE_IN_EASE_OUT;
            case 4:
                return SPRING;
            default:
                throw new IllegalArgumentException("Unsupported interpolation type : " + str);
        }
    }
}
