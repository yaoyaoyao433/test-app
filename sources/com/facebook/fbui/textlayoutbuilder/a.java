package com.facebook.fbui.textlayoutbuilder;

import android.os.Build;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        try {
            return com.facebook.fbui.textlayoutbuilder.proxy.a.a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
        } catch (LinkageError unused) {
            return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        }
    }

    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat, int i6, int i7, int i8, int[] iArr, int[] iArr2) {
        int lineStart;
        if (Build.VERSION.SDK_INT >= 23) {
            StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i5).setTextDirection(com.facebook.fbui.textlayoutbuilder.proxy.a.a(textDirectionHeuristicCompat)).setBreakStrategy(i6).setHyphenationFrequency(i7).setIndents(iArr, iArr2);
            if (Build.VERSION.SDK_INT >= 26) {
                indents.setJustificationMode(i8);
            }
            return indents.build();
        }
        StaticLayout a = a(charSequence, 0, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
        if (i5 > 0) {
            int i9 = i2;
            while (a.getLineCount() > i5 && (lineStart = a.getLineStart(i5)) < i9) {
                int i10 = lineStart;
                while (i10 > 0 && Character.isSpace(charSequence.charAt(i10 - 1))) {
                    i10--;
                }
                int i11 = i10;
                a = a(charSequence, 0, i10, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
                if (a.getLineCount() >= i5 && a.getEllipsisCount(i5 - 1) == 0) {
                    String str = ((Object) charSequence.subSequence(0, i11)) + " …";
                    a = a(str, 0, str.length(), textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
                }
                i9 = i11;
            }
        }
        do {
        } while (!a(a));
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        r2 = android.text.StaticLayout.class.getDeclaredField("mLines");
        r2.setAccessible(true);
        r3 = android.text.StaticLayout.class.getDeclaredField("mColumns");
        r3.setAccessible(true);
        r2 = (int[]) r2.get(r9);
        r9 = r3.getInt(r9);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r3 >= r9) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        r5 = (r9 * r1) + r3;
        r6 = r5 + r9;
        r7 = r2[r5];
        r2[r5] = r2[r6];
        r2[r6] = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.text.StaticLayout r9) {
        /*
            r0 = 0
            int r1 = r9.getLineStart(r0)
            int r2 = r9.getLineCount()
            r3 = r1
            r1 = 0
        Lb:
            r4 = 1
            if (r1 >= r2) goto L4e
            int r5 = r9.getLineEnd(r1)
            if (r5 >= r3) goto L4a
            java.lang.Class<android.text.StaticLayout> r2 = android.text.StaticLayout.class
            java.lang.String r3 = "mLines"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Exception -> L4e
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L4e
            java.lang.Class<android.text.StaticLayout> r3 = android.text.StaticLayout.class
            java.lang.String r5 = "mColumns"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch: java.lang.Exception -> L4e
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L4e
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Exception -> L4e
            int[] r2 = (int[]) r2     // Catch: java.lang.Exception -> L4e
            int[] r2 = (int[]) r2     // Catch: java.lang.Exception -> L4e
            int r9 = r3.getInt(r9)     // Catch: java.lang.Exception -> L4e
            r3 = 0
        L37:
            if (r3 >= r9) goto L49
            int r5 = r9 * r1
            int r5 = r5 + r3
            int r6 = r5 + r9
            r7 = r2[r5]     // Catch: java.lang.Exception -> L4e
            r8 = r2[r6]     // Catch: java.lang.Exception -> L4e
            r2[r5] = r8     // Catch: java.lang.Exception -> L4e
            r2[r6] = r7     // Catch: java.lang.Exception -> L4e
            int r3 = r3 + 1
            goto L37
        L49:
            return r0
        L4a:
            int r1 = r1 + 1
            r3 = r5
            goto Lb
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.textlayoutbuilder.a.a(android.text.StaticLayout):boolean");
    }
}
