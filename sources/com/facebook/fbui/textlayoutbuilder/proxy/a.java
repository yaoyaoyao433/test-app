package com.facebook.fbui.textlayoutbuilder.proxy;

import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        try {
            return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, a(textDirectionHeuristicCompat), f, f2, z, truncateAt, i4, i5);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, a(textDirectionHeuristicCompat), f, f2, z, truncateAt, i4, i5);
            }
            throw e;
        }
    }

    public static TextDirectionHeuristic a(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.LTR) {
            return TextDirectionHeuristics.LTR;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.RTL) {
            return TextDirectionHeuristics.RTL;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.ANYRTL_LTR) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.LOCALE) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}
