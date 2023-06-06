package com.dianping.richtext;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final SpannableStringBuilder b = new SpannableStringBuilder("…");
    private static String c;
    private static Object d;
    private static Constructor e;
    private static BaseRichTextView f;

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sb.append("          ");
        }
        c = sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dianping.richtext.e a(android.content.Context r34, com.dianping.richtext.j r35) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.richtext.f.a(android.content.Context, com.dianping.richtext.j):com.dianping.richtext.e");
    }

    private static GradientDrawable a(Context context, JSONObject jSONObject, GradientDrawable gradientDrawable) {
        Object[] objArr = {context, jSONObject, gradientDrawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7713e43d74d0aa06662d19cae52971e", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7713e43d74d0aa06662d19cae52971e");
        }
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
        }
        String c2 = g.c(jSONObject, d.e);
        if (!TextUtils.isEmpty(c2)) {
            try {
                gradientDrawable.setColor(Color.parseColor(c2));
            } catch (Exception unused) {
                gradientDrawable.setColor(0);
            }
        }
        if (g.a(jSONObject, d.i)) {
            float e2 = (float) g.e(jSONObject, d.i);
            if (e2 > 0.0f) {
                gradientDrawable.setCornerRadius(g.a(context, e2));
            }
        }
        if (g.a(jSONObject, d.l)) {
            String c3 = g.c(jSONObject, d.k);
            float e3 = (float) g.e(jSONObject, d.l);
            if (e3 > 0.0f) {
                try {
                    gradientDrawable.setStroke(g.a(context, e3), TextUtils.isEmpty(c3) ? -16777216 : Color.parseColor(c3));
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
        return gradientDrawable;
    }

    @TargetApi(18)
    private static SpannableStringBuilder a(Context context, SpannableStringBuilder spannableStringBuilder, float f2, Typeface typeface, float f3, float f4, int i, float f5, TextUtils.TruncateAt truncateAt) {
        Object[] objArr = {context, spannableStringBuilder, Float.valueOf(f2), typeface, Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i), Float.valueOf(f5), truncateAt};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3ae6e601371184e2cad0c0b4177b795", RobustBitConfig.DEFAULT_VALUE) ? (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3ae6e601371184e2cad0c0b4177b795") : a(a(context, f2, typeface), spannableStringBuilder, f3, f4, i, f5, truncateAt);
    }

    @TargetApi(18)
    private static SpannableStringBuilder a(TextPaint textPaint, SpannableStringBuilder spannableStringBuilder, float f2, float f3, int i, float f4, TextUtils.TruncateAt truncateAt) {
        Class cls;
        StaticLayout staticLayout;
        int i2;
        CharSequence ellipsize;
        Object[] objArr = {textPaint, spannableStringBuilder, Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Float.valueOf(f4), truncateAt};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e92bab5be68d22c77d825c66831a0f40", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e92bab5be68d22c77d825c66831a0f40");
        }
        float f5 = f2 > 0.0f ? f2 : 2.14748365E9f;
        int i3 = i > 0 ? i : Integer.MAX_VALUE;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                double d2 = f5;
                staticLayout = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) Math.ceil(d2)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(f4, 1.0f).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setIncludePad(false).setBreakStrategy(1).setHyphenationFrequency(1).setMaxLines(i3).setEllipsize(truncateAt).setEllipsizedWidth((int) Math.ceil(d2)).build();
            } else {
                if (e == null || d == null) {
                    if (Build.VERSION.SDK_INT >= 18) {
                        cls = TextDirectionHeuristic.class;
                        d = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    } else {
                        cls = Class.forName("android.text.TextDirectionHeuristic");
                        Class<?> cls2 = Class.forName("android.text.TextDirectionHeuristics");
                        d = cls2.getField("FIRSTSTRONG_LTR").get(cls2);
                    }
                    Constructor constructor = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                    e = constructor;
                    constructor.setAccessible(true);
                }
                staticLayout = (StaticLayout) e.newInstance(spannableStringBuilder, 0, Integer.valueOf(spannableStringBuilder.length()), textPaint, Float.valueOf(f5), Layout.Alignment.ALIGN_NORMAL, d, Float.valueOf(1.0f), 0, Boolean.FALSE, truncateAt, Float.valueOf(f5), Integer.valueOf(i3));
            }
            StaticLayout staticLayout2 = staticLayout;
            int min = Math.min(staticLayout2.getLineCount(), i3) - 1;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            int lineStart = staticLayout2.getLineStart(min);
            int lineEnd = staticLayout2.getLineEnd(min);
            CharSequence subSequence = spannableStringBuilder.subSequence(0, lineStart);
            spannableStringBuilder2.append(subSequence);
            CharSequence subSequence2 = spannableStringBuilder.subSequence(lineStart, lineEnd);
            if (subSequence2.toString().endsWith("\n")) {
                subSequence2 = subSequence2.subSequence(0, subSequence2.length() - 1);
                if (subSequence2 instanceof SpannableStringBuilder) {
                    ((SpannableStringBuilder) subSequence2).append((CharSequence) c);
                }
            }
            CharSequence charSequence = subSequence2;
            if (truncateAt == null && f3 > 0.0f) {
                i2 = 0;
                ellipsize = TextUtils.ellipsize(charSequence, textPaint, (f5 - staticLayout2.getParagraphLeft(min)) - f3, TextUtils.TruncateAt.END, false, null);
            } else {
                i2 = 0;
                ellipsize = TextUtils.ellipsize(charSequence, textPaint, (f5 - staticLayout2.getParagraphLeft(min)) - f3, truncateAt, false, null);
            }
            if (ellipsize.length() == 0 && (ellipsize instanceof String) && truncateAt != null) {
                ellipsize = b;
            }
            if (truncateAt == null) {
                String spannableStringBuilder3 = b.toString();
                if (ellipsize.length() > spannableStringBuilder3.length() && spannableStringBuilder3.equals(ellipsize.subSequence(ellipsize.length() - spannableStringBuilder3.length(), ellipsize.length()).toString())) {
                    ellipsize = ellipsize.subSequence(i2, ellipsize.length() - spannableStringBuilder3.length());
                }
                if (f3 > 0.0f && charSequence.length() > ellipsize.length() && textPaint.measureText(charSequence.subSequence(i2, ellipsize.length() + 1).toString()) < (f5 - staticLayout2.getParagraphLeft(min)) - f3) {
                    ellipsize = charSequence.subSequence(i2, ellipsize.length() + 1);
                }
            }
            spannableStringBuilder2.append(ellipsize);
            if ((subSequence instanceof SpannableStringBuilder) && (ellipsize instanceof SpannableStringBuilder)) {
                a(spannableStringBuilder2, (SpannableStringBuilder) subSequence, (SpannableStringBuilder) ellipsize);
            }
            return spannableStringBuilder2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return spannableStringBuilder;
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3) {
        Object[] spans;
        Object[] objArr = {spannableStringBuilder, spannableStringBuilder2, spannableStringBuilder3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a34adb3cbf1582f400ec45e3eb7966d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a34adb3cbf1582f400ec45e3eb7966d");
            return;
        }
        Object[] spans2 = spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), Object.class);
        for (Object obj : spannableStringBuilder3.getSpans(0, spannableStringBuilder3.length(), Object.class)) {
            for (Object obj2 : spans2) {
                if (obj == obj2) {
                    spannableStringBuilder.setSpan(obj2, spannableStringBuilder2.getSpanStart(obj2), spannableStringBuilder3.getSpanEnd(obj) + spannableStringBuilder2.length(), 33);
                }
            }
        }
    }

    private static TextPaint a(Context context, float f2, Typeface typeface) {
        Object[] objArr = {context, Float.valueOf(f2), typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1e3fe22fc257aa04c149b686af2c63b", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextPaint) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1e3fe22fc257aa04c149b686af2c63b");
        }
        if (f == null) {
            f = new BaseRichTextView(context);
        }
        f.setTypeface(typeface);
        f.setTextSize(1, f2);
        f.getPaint().setStrikeThruText(false);
        f.getPaint().setUnderlineText(false);
        return f.getPaint();
    }
}
