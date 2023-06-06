package com.dianping.richtext;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g {
    public static ChangeQuickRedirect a;
    public static HashMap<String, Typeface> c;
    public static float d;
    public static float e;
    private static Typeface g;
    private static final HashMap<String, Integer> f = new HashMap<>();
    public static HashMap<Integer, Integer> b = new HashMap<>();

    static {
        f.put("Bold", 1);
        f.put("Italic", 2);
        f.put("Bold_Italic", 3);
        b.put(0, 19);
        b.put(1, 17);
        b.put(2, 21);
        c = new HashMap<>();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(1.0f);
        d = -textPaint.getFontMetrics().ascent;
        e = textPaint.getFontMetrics().bottom / 3.0f;
    }

    public static h a(Context context, String str, Object obj, float f2, int i, i iVar, boolean z, boolean z2) {
        Object[] objArr = {context, str, obj, Float.valueOf(f2), Integer.valueOf(i), iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "190a39e35cde318bdf8898cd1f511ca3", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "190a39e35cde318bdf8898cd1f511ca3");
        }
        if (obj instanceof JSONObject) {
            return a(context, str, (JSONObject) obj, f2, 0, i, iVar, z, z2);
        }
        if (obj instanceof JSONArray) {
            return a(context, str, (JSONArray) obj, f2, i, iVar, z, z2);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return new h(TextUtils.isEmpty(str2) ? new SpannableStringBuilder() : new SpannableStringBuilder(str2), 0);
        }
        return new h((TextUtils.isEmpty(str) || !z2) ? new SpannableStringBuilder() : new SpannableStringBuilder(str), 0);
    }

    public static LineHeightSpan a(final float f2, final int i, final int i2) {
        Object[] objArr = {Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51bd15e69b844825b34aab91f446c63c", RobustBitConfig.DEFAULT_VALUE) ? (LineHeightSpan) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51bd15e69b844825b34aab91f446c63c") : new LineHeightSpan() { // from class: com.dianping.richtext.g.1
            public static ChangeQuickRedirect a;
            public int b;
            public int c;
            public int d;

            @Override // android.text.style.LineHeightSpan
            public final void chooseHeight(CharSequence charSequence, int i3, int i4, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontMetricsInt};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8150ae8d15c2f614e1dd7afa82200d01", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8150ae8d15c2f614e1dd7afa82200d01");
                    return;
                }
                this.d++;
                if (fontMetricsInt.descent != this.b || fontMetricsInt.bottom != this.c) {
                    fontMetricsInt.descent = (int) (fontMetricsInt.descent + f2);
                    fontMetricsInt.bottom = (int) (fontMetricsInt.bottom + f2);
                }
                if (this.d >= i2 || i4 >= i) {
                    fontMetricsInt.descent = (int) (fontMetricsInt.descent - f2);
                    fontMetricsInt.bottom = (int) (fontMetricsInt.bottom - f2);
                    this.d = 0;
                }
            }
        };
    }

    private static int a(Context context, JSONArray jSONArray, float f2) {
        Object[] objArr = {context, jSONArray, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb0598d73b70fe7b46431bd9b6b4d419", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb0598d73b70fe7b46431bd9b6b4d419")).intValue();
        }
        double d2 = 0.0d;
        float f3 = 0.0f;
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) opt;
                int d3 = d(jSONObject, d.s);
                if (d3 == 0) {
                    float d4 = d(jSONObject, d.A) != 0 ? d(jSONObject, d.A) : f2;
                    if (d4 > f3) {
                        f3 = d4;
                    }
                } else if (d3 == 1) {
                    double e2 = e(jSONObject, d.D);
                    double e3 = e(jSONObject, d.C);
                    if (!a(c(jSONObject, d.E)) && e2 > 0.0d && e3 > 0.0d && e3 > d2) {
                        d2 = e3;
                    }
                }
            }
        }
        return (int) Math.max(a(context, f3) * d, d2 > 0.0d ? a(context, (float) d2) : 0);
    }

    private static h a(Context context, String str, JSONArray jSONArray, float f2, int i, i iVar, boolean z, boolean z2) {
        int i2 = 0;
        Object[] objArr = {context, str, jSONArray, Float.valueOf(f2), Integer.valueOf(i), iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e944fa85e24249838e881c5966e35d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e944fa85e24249838e881c5966e35d5");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (jSONArray != null && jSONArray.length() > 0) {
            int a2 = a(context, jSONArray, f2);
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                } else if (jSONArray.opt(i2) instanceof JSONObject) {
                    int i3 = i2;
                    h a3 = a(context, str, jSONArray.optJSONObject(i2), f2, a2, i, iVar, z, false);
                    if (a3 != null && a3.a != null) {
                        spannableStringBuilder.append((CharSequence) a3.a);
                    }
                    i2 = i3 + 1;
                } else {
                    spannableStringBuilder = TextUtils.isEmpty(str) ? new SpannableStringBuilder() : new SpannableStringBuilder(str);
                }
            }
            return new h(spannableStringBuilder, a2);
        }
        return new h((TextUtils.isEmpty(str) || !z2) ? new SpannableStringBuilder() : new SpannableStringBuilder(str), 0);
    }

    private static h a(Context context, String str, JSONObject jSONObject, float f2, int i, int i2, i iVar, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        Object[] objArr = {context, str, jSONObject, Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bdda53241b522e422a1255993bed31f", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bdda53241b522e422a1255993bed31f");
        }
        if (jSONObject != null) {
            int d2 = d(jSONObject, d.s);
            if (d2 == 1) {
                spannableStringBuilder = a(context, jSONObject, i, i2, iVar);
            } else if (d2 == 2) {
                spannableStringBuilder = d(jSONObject);
            } else {
                spannableStringBuilder = a(context, jSONObject, str, f2, i, i2, z, z2);
            }
        } else {
            spannableStringBuilder = (TextUtils.isEmpty(str) || !z2) ? new SpannableStringBuilder() : new SpannableStringBuilder(str);
        }
        return new h(spannableStringBuilder, 0);
    }

    public static int a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37c95972420aa73f1d7a84edcf20df7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37c95972420aa73f1d7a84edcf20df7b")).intValue();
        }
        if (c.a().c && z) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
        }
        return i;
    }

    private static SpannableStringBuilder a(int i, String str, SpannableStringBuilder spannableStringBuilder, float f2, float f3) {
        Object[] objArr = {Integer.valueOf(i), str, spannableStringBuilder, Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a351efa036e48029b94bc7a0ae60d9fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a351efa036e48029b94bc7a0ae60d9fb");
        }
        if (i > 0) {
            float f4 = f2 != 0.0f ? f2 : 14.0f;
            if (f3 != 0.0f) {
                f4 = f3;
            }
            float f5 = 4.5f / f4;
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                sb.append(str.charAt(i2));
                if (i2 < str.length()) {
                    sb.append(" ");
                }
            }
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder2 = TextUtils.isEmpty(sb2) ? new SpannableStringBuilder() : new SpannableStringBuilder(sb2);
            if (sb.toString().length() > 1) {
                for (int i3 = 1; i3 < sb.toString().length(); i3 += 2) {
                    spannableStringBuilder2.setSpan(new ScaleXSpan(i * f5), i3, i3 + 1, 33);
                }
            }
            return spannableStringBuilder2;
        }
        return spannableStringBuilder;
    }

    private static SpannableStringBuilder a(Context context, JSONObject jSONObject, String str, float f2, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        Object[] objArr = {context, jSONObject, str, Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d15e4bfe4efa8e8d966206d470130c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d15e4bfe4efa8e8d966206d470130c5");
        }
        String c2 = c(jSONObject, d.t);
        if (a(c2) && !a(jSONObject, d.t)) {
            return !z2 ? new SpannableStringBuilder() : new SpannableStringBuilder(str);
        }
        SpannableStringBuilder spannableStringBuilder = TextUtils.isEmpty(c2) ? new SpannableStringBuilder() : new SpannableStringBuilder(c2);
        float d2 = d(jSONObject, d.A);
        int d3 = d(jSONObject, d.v);
        a(context);
        SpannableStringBuilder a2 = a(d3, c2, spannableStringBuilder, f2, d2);
        String c3 = c(jSONObject, d.G);
        String c4 = c(jSONObject, d.H);
        if (d2 != 0.0f) {
            a2.setSpan(new AbsoluteSizeSpan(a(context, d2)), 0, a2.length(), 33);
        }
        if (i != 0) {
            a2.setSpan(new k(i, i2), 0, a2.length(), 33);
        }
        String c5 = c(jSONObject, d.B);
        if (c.containsKey(c5)) {
            a2.setSpan(new CustomTypefaceSpan("", c.get(c5)), 0, a2.length(), 33);
        }
        String c6 = c(jSONObject, d.x);
        if (a(c6)) {
            z3 = false;
        } else {
            try {
                a2.setSpan(new ForegroundColorSpan(Color.parseColor(c6)), 0, a2.length(), 33);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            z3 = true;
        }
        String c7 = c(jSONObject, d.w);
        if (!a(c7)) {
            try {
                a2.setSpan(new BackgroundColorSpan(Color.parseColor(c7)), 0, a2.length(), 33);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        String c8 = c(jSONObject, d.u);
        if (f.containsKey(c8)) {
            a2.setSpan(new StyleSpan(a(f.get(c8).intValue(), z)), 0, a2.length(), 33);
        }
        if (a(jSONObject, d.y)) {
            if (f(jSONObject, d.y)) {
                a2.setSpan(new StrikethroughSpan(), 0, a2.length(), 33);
            } else {
                a2.setSpan(new CharacterStyle() { // from class: com.dianping.richtext.g.2
                    public static ChangeQuickRedirect a;

                    @Override // android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        Object[] objArr2 = {textPaint};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcaae33e73d268ab65c289a36a148fa9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcaae33e73d268ab65c289a36a148fa9");
                        } else {
                            textPaint.setStrikeThruText(false);
                        }
                    }
                }, 0, a2.length(), 33);
            }
        }
        if (!a(jSONObject, d.z)) {
            z4 = false;
        } else if (f(jSONObject, d.z)) {
            a2.setSpan(new UnderlineSpan(), 0, a2.length(), 33);
        } else {
            a2.setSpan(new CharacterStyle() { // from class: com.dianping.richtext.g.3
                public static ChangeQuickRedirect a;

                @Override // android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    Object[] objArr2 = {textPaint};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bad4505469209bd54d95da62183a9a38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bad4505469209bd54d95da62183a9a38");
                    } else {
                        textPaint.setUnderlineText(false);
                    }
                }
            }, 0, a2.length(), 33);
        }
        if (!a(c3) || !a(c4)) {
            a2.setSpan(new LinkActionSpan(c3, c4, z3, z4), 0, a2.length(), 33);
        }
        return a2;
    }

    private static SpannableStringBuilder a(Context context, JSONObject jSONObject, int i, int i2, i iVar) {
        Object[] objArr = {context, jSONObject, Integer.valueOf(i), Integer.valueOf(i2), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83ea2a45cabdc253b9574f3251e9a384", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83ea2a45cabdc253b9574f3251e9a384");
        }
        return a(context, new com.dianping.richtext.model.d(c(jSONObject, d.F), c(jSONObject, d.E), (float) e(jSONObject, d.D), (float) e(jSONObject, d.C), c(jSONObject, d.G), c(jSONObject, d.H), d(jSONObject, d.v)), i, i2, iVar);
    }

    public static SpannableStringBuilder a(Context context, com.dianping.richtext.model.d dVar, int i, int i2, i iVar) {
        SpannableStringBuilder spannableStringBuilder;
        Object[] objArr = {context, dVar, Integer.valueOf(i), Integer.valueOf(i2), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d13fa11d1233ff7cc3541f810a9ce6a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d13fa11d1233ff7cc3541f810a9ce6a8");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (dVar == null || dVar.a == 2) {
            return spannableStringBuilder2;
        }
        if (dVar.a == 1) {
            spannableStringBuilder = new SpannableStringBuilder(context.getText(R.string.image_name));
            spannableStringBuilder.setSpan(new a(context, dVar.b, a(context, dVar.d), a(context, dVar.e), i, i2, iVar), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(context.getText(R.string.image_name));
            spannableStringBuilder.setSpan(new a(context, dVar.c, a(context, dVar.d), a(context, dVar.e), i, i2), 0, spannableStringBuilder.length(), 33);
        }
        if (!a(dVar.f) || !a(dVar.g)) {
            spannableStringBuilder.setSpan(new LinkActionSpan(dVar.f, dVar.g), 0, spannableStringBuilder.length(), 33);
        }
        if (dVar.h > 0) {
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(new AbsoluteSizeSpan(a(context, 4.5f)), 0, spannableString.length(), 33);
            spannableString.setSpan(new ScaleXSpan(dVar.h), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        return spannableStringBuilder;
    }

    private static SpannableStringBuilder d(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d3850397839fbaf65facb31d43ed643", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d3850397839fbaf65facb31d43ed643");
        }
        Spanned fromHtml = Html.fromHtml(c(jSONObject, d.t));
        return TextUtils.isEmpty(fromHtml) ? new SpannableStringBuilder() : new SpannableStringBuilder(fromHtml);
    }

    public static boolean a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83ce5ab3eed5fc460ff9b2188b2b3e1b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83ce5ab3eed5fc460ff9b2188b2b3e1b")).booleanValue() : TextUtils.isEmpty(charSequence);
    }

    public static boolean a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a947ac46404ae07d224a812cb62c1d42", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a947ac46404ae07d224a812cb62c1d42")).booleanValue() : (a(jSONObject, d.o) || a(jSONObject, d.p) || a(jSONObject, d.q) || a(jSONObject, d.r)) ? false : true;
    }

    public static boolean b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09b753fe35b66089061b1ecdfd169763", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09b753fe35b66089061b1ecdfd169763")).booleanValue() : !a(jSONObject, d.j);
    }

    public static boolean c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "484128d2f8349f6e91b496414e21c508", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "484128d2f8349f6e91b496414e21c508")).booleanValue() : (a(jSONObject, d.f) && a(jSONObject, d.g)) ? false : true;
    }

    public static void a(Context context, GradientDrawable gradientDrawable, float f2, float f3, float f4, float f5) {
        Object[] objArr = {context, gradientDrawable, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c8e5950a7297c70a11a8ed6b7c7f42f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c8e5950a7297c70a11a8ed6b7c7f42f");
        } else if (context == null) {
        } else {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{a(context, f2), a(context, f2), a(context, f3), a(context, f3), a(context, f4), a(context, f4), a(context, f5), a(context, f5)});
        }
    }

    public static boolean a(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ac1516815cac6d9d9174a5f55ce2a3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ac1516815cac6d9d9174a5f55ce2a3d")).booleanValue();
        }
        if (jSONObject.has(str)) {
            return true;
        }
        String str2 = d.I.get(str);
        if (str2 != null) {
            return jSONObject.has(str2);
        }
        return false;
    }

    public static Object b(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3368b95ee075815f8e8103e31d2dfd7", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3368b95ee075815f8e8103e31d2dfd7");
        }
        if (jSONObject.has(str)) {
            return jSONObject.opt(str);
        }
        String str2 = d.I.get(str);
        if (str2 != null) {
            return jSONObject.opt(str2);
        }
        return null;
    }

    public static String c(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8ad6ab073413df766980d75ac14f787", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8ad6ab073413df766980d75ac14f787");
        }
        if (jSONObject == null) {
            return "";
        }
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        String str2 = d.I.get(str);
        return (str2 == null || jSONObject.isNull(str2)) ? "" : jSONObject.optString(str2);
    }

    public static int d(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "255d766c35c94a0391f469e2331d9ec2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "255d766c35c94a0391f469e2331d9ec2")).intValue();
        }
        if (jSONObject == null) {
            return 0;
        }
        if (jSONObject.has(str)) {
            return jSONObject.optInt(str);
        }
        String str2 = d.I.get(str);
        if (str2 != null) {
            return jSONObject.optInt(str2);
        }
        return 0;
    }

    public static double e(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbc297ac07085991cf2cf3e9f51d0604", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbc297ac07085991cf2cf3e9f51d0604")).doubleValue();
        }
        if (jSONObject == null) {
            return Double.NaN;
        }
        if (jSONObject.has(str)) {
            return jSONObject.optDouble(str);
        }
        String str2 = d.I.get(str);
        if (str2 != null) {
            return jSONObject.optDouble(str2);
        }
        return Double.NaN;
    }

    private static boolean f(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4bad8ef18b96e41dfe85435672469fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4bad8ef18b96e41dfe85435672469fe")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has(str)) {
            return jSONObject.optBoolean(str);
        }
        String str2 = d.I.get(str);
        if (str2 != null) {
            return jSONObject.optBoolean(str2);
        }
        return false;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, double d2) {
        Object[] objArr = {spannableStringBuilder, Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63bfa8a2543741fc2ba836b8158c89dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63bfa8a2543741fc2ba836b8158c89dc");
        } else if (a(spannableStringBuilder)) {
        } else {
            spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard((int) d2, 0), 0, spannableStringBuilder.length(), 33);
        }
    }

    public static int a(Context context, float f2) {
        Object[] objArr = {context, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82b892a00fd8dcbe075c21060968aa22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82b892a00fd8dcbe075c21060968aa22")).intValue();
        }
        if (context == null) {
            return (int) f2;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics != null ? (int) ((f2 * displayMetrics.density) + 0.5f) : (int) ((f2 * 3.0f) + 0.5f);
    }

    public static int b(Context context, float f2) {
        Object[] objArr = {context, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30d86dc17702ac3dd95662ecdb1772ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30d86dc17702ac3dd95662ecdb1772ea")).intValue();
        }
        if (context == null) {
            return (int) f2;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics != null ? (int) ((f2 / displayMetrics.density) + 0.5f) : (int) ((f2 / 3.0f) + 0.5f);
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a413d81f326745cf04bf5e18e7e27745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a413d81f326745cf04bf5e18e7e27745");
        } else if (g != null || context == null) {
        } else {
            try {
                g = Typeface.createFromAsset(context.getAssets(), "icon-font.ttf");
                c.put("icon-font", g);
            } catch (Exception e2) {
                com.dianping.codelog.b.b(g.class, "icon font init error " + e2);
            }
        }
    }
}
