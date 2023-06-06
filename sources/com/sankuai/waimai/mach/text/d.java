package com.sankuai.waimai.mach.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder;
import com.facebook.yoga.YogaDirection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final int[][] d = {new int[]{0}};
    private static final int[] e = {-16777216};
    public static final Typeface b = Typeface.DEFAULT;
    public static final ColorStateList c = new ColorStateList(d, e);

    public static Layout a(Context context, int i, int i2, a aVar, CharSequence charSequence, TextUtils.TruncateAt truncateAt, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, float f, float f2, float f3, int i9, boolean z2, int i10, ColorStateList colorStateList, int i11, int i12, float f4, float f5, float f6, float f7, int i13, @Nullable Typeface typeface, b bVar, int i14, int i15, int i16, YogaDirection yogaDirection, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z3, int i17, int i18) {
        int i19;
        Layout layout;
        Layout layout2;
        Layout layout3;
        int i20;
        Layout.Alignment alignment;
        Layout a2;
        int i21;
        int height;
        int i22;
        int i23;
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), aVar, charSequence, truncateAt, (byte) 1, 1, Integer.valueOf(i4), -1, -1, 0, Integer.MAX_VALUE, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), -7829368, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i10), colorStateList, 0, Integer.valueOf(i12), Float.valueOf(f4), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(f7), Integer.valueOf(i13), typeface, bVar, 0, 0, 0, yogaDirection, null, (byte) 0, 0, Integer.valueOf(i18)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f3911e94a23d390eec479c0ed12f13d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Layout) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f3911e94a23d390eec479c0ed12f13d");
        }
        if (TextUtils.isEmpty(charSequence)) {
            aVar.a = 0;
            aVar.b = 0;
            return null;
        }
        float f8 = context.getResources().getDisplayMetrics().density;
        Object[] objArr2 = {Integer.valueOf(i), truncateAt, (byte) 1, Integer.valueOf(i4), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), -7829368, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), charSequence, Integer.valueOf(i10), colorStateList, 0, Integer.valueOf(i12), Float.valueOf(f4), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(f7), Integer.valueOf(i13), typeface, bVar, yogaDirection, -1, -1, 0, Integer.MAX_VALUE, Float.valueOf(f8), 0, 0, 0, null, Integer.valueOf(i18)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "89e1136ca2daecb33b706cae1c74be98", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (Layout) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "89e1136ca2daecb33b706cae1c74be98");
        } else {
            TextLayoutBuilder textLayoutBuilder = new TextLayoutBuilder();
            textLayoutBuilder.h = false;
            int a3 = SizeSpec.a(i);
            if (a3 == Integer.MIN_VALUE) {
                i19 = 2;
            } else if (a3 == 0) {
                i19 = 0;
            } else if (a3 != 1073741824) {
                throw new IllegalStateException("Unexpected size mode: " + SizeSpec.a(i));
            } else {
                i19 = 1;
            }
            if (textLayoutBuilder.f.a.density != f8) {
                textLayoutBuilder.f.a();
                textLayoutBuilder.f.a.density = f8;
                layout = null;
                textLayoutBuilder.g = null;
            } else {
                layout = null;
            }
            if (textLayoutBuilder.f.n != truncateAt) {
                textLayoutBuilder.f.n = truncateAt;
                textLayoutBuilder.g = layout;
            }
            if (textLayoutBuilder.f.p != i4) {
                textLayoutBuilder.f.p = i4;
                textLayoutBuilder.g = layout;
            }
            textLayoutBuilder.f.a();
            textLayoutBuilder.f.d = 0.0f;
            textLayoutBuilder.f.b = 0.0f;
            textLayoutBuilder.f.c = 0.0f;
            textLayoutBuilder.f.e = -7829368;
            textLayoutBuilder.f.a.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
            textLayoutBuilder.g = null;
            if (textLayoutBuilder.f.o != z2) {
                textLayoutBuilder.f.o = z2;
                textLayoutBuilder.g = null;
            }
            if (charSequence != textLayoutBuilder.f.h && (charSequence == null || textLayoutBuilder.f.h == null || !charSequence.equals(textLayoutBuilder.f.h))) {
                textLayoutBuilder.f.h = charSequence;
                textLayoutBuilder.g = null;
            }
            float f9 = i12;
            if (textLayoutBuilder.f.a.getTextSize() != f9) {
                textLayoutBuilder.f.a();
                textLayoutBuilder.f.a.setTextSize(f9);
                textLayoutBuilder.g = null;
            }
            int b2 = SizeSpec.b(i);
            if (textLayoutBuilder.f.f == b2 && textLayoutBuilder.f.g == i19) {
                layout2 = null;
            } else {
                textLayoutBuilder.f.f = b2;
                textLayoutBuilder.f.g = i19;
                layout2 = null;
                textLayoutBuilder.g = null;
            }
            if (!textLayoutBuilder.f.m) {
                textLayoutBuilder.f.m = true;
                textLayoutBuilder.g = layout2;
            }
            if (textLayoutBuilder.f.l == Float.MAX_VALUE && textLayoutBuilder.f.k != 0.0f) {
                textLayoutBuilder.f.k = 0.0f;
                textLayoutBuilder.g = null;
            }
            if (textLayoutBuilder.f.l == Float.MAX_VALUE && textLayoutBuilder.f.j != 1.0f) {
                textLayoutBuilder.f.j = 1.0f;
                textLayoutBuilder.g = null;
            }
            if (textLayoutBuilder.f.a.linkColor != 0) {
                textLayoutBuilder.f.a();
                i20 = 0;
                textLayoutBuilder.f.a.linkColor = 0;
                layout3 = null;
                textLayoutBuilder.g = null;
            } else {
                layout3 = null;
                i20 = 0;
            }
            if (textLayoutBuilder.f.s != 0) {
                textLayoutBuilder.f.s = i20;
                textLayoutBuilder.g = layout3;
            }
            if (textLayoutBuilder.f.t != 0) {
                textLayoutBuilder.f.t = i20;
                if (Build.VERSION.SDK_INT >= 23) {
                    textLayoutBuilder.g = layout3;
                }
            }
            int[] iArr = new int[2];
            iArr[i20] = i18;
            iArr[1] = i20;
            int[] iArr2 = new int[1];
            iArr2[i20] = i20;
            textLayoutBuilder.f.v = iArr;
            textLayoutBuilder.f.w = iArr2;
            textLayoutBuilder.g = null;
            if (f4 > 0.0f && textLayoutBuilder.f.l != f4) {
                textLayoutBuilder.f.l = f4;
                textLayoutBuilder.f.k = f4 - textLayoutBuilder.f.a.getFontMetrics(null);
                textLayoutBuilder.f.j = 1.0f;
                textLayoutBuilder.g = null;
            }
            if (Build.VERSION.SDK_INT == 26 && textLayoutBuilder.f.u != 0) {
                textLayoutBuilder.f.u = 0;
                if (Build.VERSION.SDK_INT >= 26) {
                    textLayoutBuilder.g = null;
                }
            }
            if (Build.VERSION.SDK_INT >= 21 && textLayoutBuilder.f.a.getLetterSpacing() != f7) {
                textLayoutBuilder.f.a();
                textLayoutBuilder.f.a.setLetterSpacing(f7);
                textLayoutBuilder.g = null;
            }
            textLayoutBuilder.a = 0;
            textLayoutBuilder.b = 2;
            textLayoutBuilder.c = Integer.MAX_VALUE;
            textLayoutBuilder.d = 2;
            if (i10 != 0) {
                textLayoutBuilder.f.a();
                textLayoutBuilder.f.i = null;
                textLayoutBuilder.f.a.setColor(i10);
                textLayoutBuilder.g = null;
            } else {
                textLayoutBuilder.f.a();
                textLayoutBuilder.f.i = colorStateList;
                textLayoutBuilder.f.a.setColor(textLayoutBuilder.f.i != null ? textLayoutBuilder.f.i.getDefaultColor() : -16777216);
                textLayoutBuilder.g = null;
            }
            if (!b.equals(typeface)) {
                textLayoutBuilder.a(typeface);
            } else {
                textLayoutBuilder.a(Typeface.defaultFromStyle(i13));
            }
            TextDirectionHeuristicCompat textDirectionHeuristicCompat2 = yogaDirection == YogaDirection.RTL ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
            if (textLayoutBuilder.f.r != textDirectionHeuristicCompat2) {
                textLayoutBuilder.f.r = textDirectionHeuristicCompat2;
                textLayoutBuilder.g = null;
            }
            switch (bVar == null ? b.TEXT_START : bVar) {
                case TEXT_END:
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                case LAYOUT_START:
                    if ((yogaDirection == YogaDirection.RTL) != textDirectionHeuristicCompat2.isRtl(charSequence, 0, charSequence.length())) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    }
                case LAYOUT_END:
                    if ((yogaDirection == YogaDirection.RTL) != textDirectionHeuristicCompat2.isRtl(charSequence, 0, charSequence.length())) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    }
                case LEFT:
                    if (!textDirectionHeuristicCompat2.isRtl(charSequence, 0, charSequence.length())) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    }
                case RIGHT:
                    if (!textDirectionHeuristicCompat2.isRtl(charSequence, 0, charSequence.length())) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break;
                    }
                case CENTER:
                    alignment = Layout.Alignment.ALIGN_CENTER;
                    break;
                default:
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
            }
            if (textLayoutBuilder.f.q != alignment) {
                textLayoutBuilder.f.q = alignment;
                textLayoutBuilder.g = null;
            }
            a2 = textLayoutBuilder.a();
        }
        Object[] objArr3 = {Integer.valueOf(i), a2, (byte) 0, 0};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        aVar.a = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a31bf63853a16a1e51ea1e792a3de940", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a31bf63853a16a1e51ea1e792a3de940")).intValue() : SizeSpec.a(i, a2.getWidth());
        int lineCount = a2.getLineCount();
        if (f4 > 0.0f) {
            i23 = Math.round((f4 * 1.0f) + 0.0f) * lineCount;
        } else {
            if (a2 == null) {
                height = 0;
            } else {
                if (Build.VERSION.SDK_INT >= 20 || !(a2 instanceof StaticLayout)) {
                    i21 = 0;
                } else {
                    float lineDescent = a2.getLineDescent(a2.getLineCount() - 1) - a2.getLineAscent(a2.getLineCount() - 1);
                    float spacingAdd = lineDescent - ((lineDescent - a2.getSpacingAdd()) / a2.getSpacingMultiplier());
                    i21 = spacingAdd >= 0.0f ? (int) (spacingAdd + 0.5d) : -((int) ((-spacingAdd) + 0.5d));
                }
                height = a2.getHeight() - i21;
            }
            if (lineCount <= 0) {
                i23 = (Math.round((a2.getPaint().getFontMetricsInt(null) * 1.0f) + 0.0f) * (1 - lineCount)) + height;
            } else if (i4 <= 0 || lineCount <= i4 || (i23 = a2.getLineBottom(i4 - 1)) <= 0) {
                i22 = i2;
                i23 = height;
                aVar.b = SizeSpec.a(i22, i23);
                if (aVar.a >= 0 || aVar.b < 0) {
                    aVar.a = Math.max(aVar.a, 0);
                    aVar.b = Math.max(aVar.b, 0);
                }
                return a2;
            }
        }
        i22 = i2;
        aVar.b = SizeSpec.a(i22, i23);
        if (aVar.a >= 0) {
        }
        aVar.a = Math.max(aVar.a, 0);
        aVar.b = Math.max(aVar.b, 0);
        return a2;
    }
}
