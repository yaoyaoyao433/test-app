package com.meituan.msc.modules.api.msi.components.coverview;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class CoverViewAnimateUtil {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MSCAnimatedParams {
        public static final String EASING_EASE = "ease";
        public static final String EASING_EASE_IN = "ease_in";
        public static final String EASING_EASE_OUT = "ease_out";
        public static final String EASING_LINEAR = "linear";
        public static ChangeQuickRedirect changeQuickRedirect;
        public int duration = 300;
        @MsiParamChecker(in = {EASING_LINEAR, EASING_EASE, EASING_EASE_IN, EASING_EASE_OUT})
        public String easing = EASING_LINEAR;
        @MsiParamChecker(required = true)
        public TransitionStyle finalStyle;

        /* compiled from: ProGuard */
        @MsiSupport
        /* loaded from: classes3.dex */
        public static class TransitionStyle {
            public static ChangeQuickRedirect changeQuickRedirect;
            public Double left;
            public Double opacity;
            public Double rotate;
            public Double scaleX;
            public Double scaleY;
            public Double top;
        }
    }
}
