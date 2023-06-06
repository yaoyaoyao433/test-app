package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.w;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q {
    private static final TextPaint a = new TextPaint(1);
    private static final Object b = new Object();
    private static LruCache<String, Spannable> c = new LruCache<>(100);

    private static void a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int i;
        int i2 = 0;
        for (int size = readableArray.size(); i2 < size; size = i) {
            ReadableMap map = readableArray.getMap(i2);
            int length = spannableStringBuilder.length();
            m mVar = new m(new ag(map.getMap("textAttributes")));
            spannableStringBuilder.append((CharSequence) r.a(map.getString("string"), mVar.m));
            int length2 = spannableStringBuilder.length();
            int i3 = map.getInt("reactTag");
            if (map.hasKey("isAttachment") && map.getBoolean("isAttachment")) {
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new p(i3, (int) w.b(map.getDouble("width")), (int) w.b(map.getDouble("height")))));
            } else if (length2 >= length) {
                if (mVar.b) {
                    list.add(new a(length, length2, new ReactForegroundColorSpan(mVar.d)));
                }
                if (mVar.e) {
                    list.add(new a(length, length2, new ReactBackgroundColorSpan(mVar.f)));
                }
                if (Build.VERSION.SDK_INT >= 21 && !Float.isNaN(mVar.b())) {
                    list.add(new a(length, length2, new com.facebook.react.views.text.a(mVar.b())));
                }
                list.add(new a(length, length2, new ReactAbsoluteSizeSpan(mVar.h)));
                if (mVar.u == -1 && mVar.v == -1 && mVar.w == null) {
                    i = size;
                } else {
                    i = size;
                    list.add(new a(length, length2, new c(mVar.u, mVar.v, mVar.x, mVar.w, context.getAssets())));
                }
                if (mVar.r) {
                    list.add(new a(length, length2, new ReactUnderlineSpan()));
                }
                if (mVar.s) {
                    list.add(new a(length, length2, new ReactStrikethroughSpan()));
                }
                if (mVar.n != 0.0f || mVar.o != 0.0f) {
                    list.add(new a(length, length2, new l(mVar.n, mVar.o, mVar.p, mVar.q)));
                }
                if (!Float.isNaN(mVar.a())) {
                    list.add(new a(length, length2, new b(mVar.a())));
                }
                list.add(new a(length, length2, new h(i3)));
                i2++;
            }
            i = size;
            i2++;
        }
    }

    public static Spannable a(Context context, ReadableMap readableMap, @Nullable j jVar) {
        String obj = readableMap.toString();
        synchronized (b) {
            Spannable spannable = c.get(obj);
            if (spannable != null) {
                return spannable;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList<a> arrayList = new ArrayList();
            a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
            int i = 0;
            for (a aVar : arrayList) {
                aVar.a(spannableStringBuilder, i);
                i++;
            }
            synchronized (b) {
                c.put(obj, spannableStringBuilder);
            }
            return spannableStringBuilder;
        }
    }

    public static long a(Context context, ReadableMap readableMap, ReadableMap readableMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, j jVar, @Nullable int[] iArr) {
        Layout build;
        int height;
        p[] pVarArr;
        int i;
        int secondaryHorizontal;
        TextPaint textPaint = a;
        Spannable a2 = a(context, readableMap, jVar);
        int a3 = m.a(readableMap2.getString("textBreakStrategy"));
        if (a2 == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(a2, textPaint);
        float desiredWidth = isBoring == null ? Layout.getDesiredWidth(a2, textPaint) : Float.NaN;
        boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
        int length = a2.length();
        if (isBoring == null && (z || (!com.facebook.yoga.b.a(desiredWidth) && desiredWidth <= f))) {
            int ceil = (int) Math.ceil(desiredWidth);
            if (Build.VERSION.SDK_INT < 23) {
                build = new StaticLayout(a2, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            } else {
                build = StaticLayout.Builder.obtain(a2, 0, length, textPaint, ceil).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(a3).setHyphenationFrequency(1).build();
            }
        } else if (isBoring != null && (z || isBoring.width <= f)) {
            build = BoringLayout.make(a2, textPaint, isBoring.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, isBoring, true);
        } else if (Build.VERSION.SDK_INT < 23) {
            build = new StaticLayout(a2, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        } else {
            build = StaticLayout.Builder.obtain(a2, 0, length, textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(a3).setHyphenationFrequency(1).build();
        }
        int i2 = -1;
        int i3 = readableMap2.hasKey("maximumNumberOfLines") ? readableMap2.getInt("maximumNumberOfLines") : -1;
        int width = build.getWidth();
        if (i3 != -1 && i3 != 0 && i3 < build.getLineCount()) {
            height = build.getLineBottom(i3 - 1);
        } else {
            height = build.getHeight();
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int nextSpanTransition = a2.nextSpanTransition(i4, length, p.class);
            p[] pVarArr2 = (p[]) a2.getSpans(i4, nextSpanTransition, p.class);
            int length2 = pVarArr2.length;
            int i6 = i5;
            int i7 = 0;
            while (i7 < length2) {
                p pVar = pVarArr2[i7];
                int spanStart = a2.getSpanStart(pVar);
                int lineForOffset = build.getLineForOffset(spanStart);
                if (!(build.getEllipsisCount(lineForOffset) > 0) || spanStart < build.getLineStart(lineForOffset) + build.getEllipsisStart(lineForOffset) || spanStart >= build.getLineEnd(lineForOffset)) {
                    int i8 = pVar.b;
                    int i9 = pVar.c;
                    pVarArr = pVarArr2;
                    boolean isRtlCharAt = build.isRtlCharAt(spanStart);
                    i = nextSpanTransition;
                    boolean z2 = build.getParagraphDirection(lineForOffset) == i2;
                    if (spanStart != length - 1) {
                        if (z2 == isRtlCharAt) {
                            secondaryHorizontal = (int) build.getPrimaryHorizontal(spanStart);
                        } else {
                            secondaryHorizontal = (int) build.getSecondaryHorizontal(spanStart);
                        }
                        if (z2) {
                            secondaryHorizontal = width - (((int) build.getLineRight(lineForOffset)) - secondaryHorizontal);
                        }
                        if (isRtlCharAt) {
                            secondaryHorizontal -= i8;
                        }
                    } else if (z2) {
                        secondaryHorizontal = width - ((int) build.getLineWidth(lineForOffset));
                    } else {
                        secondaryHorizontal = ((int) build.getLineRight(lineForOffset)) - i8;
                    }
                    int i10 = i6 * 2;
                    iArr[i10] = (int) w.b(build.getLineBaseline(lineForOffset) - i9);
                    iArr[i10 + 1] = (int) w.b(secondaryHorizontal);
                    i6++;
                } else {
                    pVarArr = pVarArr2;
                    i = nextSpanTransition;
                }
                i7++;
                pVarArr2 = pVarArr;
                nextSpanTransition = i;
                i2 = -1;
            }
            i5 = i6;
            i4 = nextSpanTransition;
        }
        return com.facebook.yoga.c.a(w.b(width), w.b(height));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        protected int a;
        protected int b;
        protected g c;

        a(int i, int i2, g gVar) {
            this.a = i;
            this.b = i2;
            this.c = gVar;
        }

        public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.c, this.a, this.b, ((i << 16) & 16711680) | ((this.a == 0 ? 18 : 34) & (-16711681)));
        }
    }
}
