package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    private static final RectF h = new RectF();
    private static Hashtable<String, Method> i = new Hashtable<>();
    final Context g;
    private TextPaint k;
    private final TextView l;
    int a = 0;
    private boolean j = false;
    float b = -1.0f;
    float c = -1.0f;
    float d = -1.0f;
    int[] e = new int[0];
    boolean f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(TextView textView) {
        this.l = textView;
        this.g = this.l.getContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(int i2) {
        if (e()) {
            switch (i2) {
                case 0:
                    f();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
                    a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (b()) {
                        c();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (e()) {
            DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (b()) {
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(@NonNull int[] iArr, int i2) throws IllegalArgumentException {
        if (e()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                this.e = a(iArr2);
                if (!a()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f = false;
            }
            if (b()) {
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        int length = this.e.length;
        this.f = length > 0;
        if (this.f) {
            this.a = 1;
            this.c = this.e[0];
            this.d = this.e[length - 1];
            this.b = -1.0f;
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.a = 1;
            this.c = f;
            this.d = f2;
            this.b = f3;
            this.f = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (e() && this.a == 1) {
            if (!this.f || this.e.length == 0) {
                float round = Math.round(this.c);
                int i2 = 1;
                while (Math.round(this.b + round) <= Math.round(this.d)) {
                    i2++;
                    round += this.b;
                }
                int[] iArr = new int[i2];
                float f = this.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Math.round(f);
                    f += this.b;
                }
                this.e = a(iArr);
            }
            this.j = true;
        } else {
            this.j = false;
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void c() {
        if (d()) {
            if (this.j) {
                if (this.l.getMeasuredHeight() <= 0 || this.l.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = ((Boolean) a((Object) this.l, "getHorizontallyScrolling", (String) Boolean.FALSE)).booleanValue() ? 1048576 : (this.l.getMeasuredWidth() - this.l.getTotalPaddingLeft()) - this.l.getTotalPaddingRight();
                int height = (this.l.getHeight() - this.l.getCompoundPaddingBottom()) - this.l.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (h) {
                    h.setEmpty();
                    h.right = measuredWidth;
                    h.bottom = height;
                    float a = a(h);
                    if (a != this.l.getTextSize()) {
                        a(0, a);
                    }
                }
            }
            this.j = true;
        }
    }

    private void f() {
        this.a = 0;
        this.c = -1.0f;
        this.d = -1.0f;
        this.b = -1.0f;
        this.e = new int[0];
        this.j = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(int i2, float f) {
        Resources resources;
        if (this.g == null) {
            resources = Resources.getSystem();
        } else {
            resources = this.g.getResources();
        }
        a(TypedValue.applyDimension(i2, f, resources.getDisplayMetrics()));
    }

    private void a(float f) {
        if (f != this.l.getPaint().getTextSize()) {
            this.l.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.l.isInLayout() : false;
            if (this.l.getLayout() != null) {
                this.j = false;
                try {
                    Method a = a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.l.requestLayout();
                } else {
                    this.l.forceLayout();
                }
                this.l.invalidate();
            }
        }
    }

    private int a(RectF rectF) {
        int length = this.e.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            if (a(this.e[i5], rectF)) {
                int i6 = i5 + 1;
                i4 = i3;
                i3 = i6;
            } else {
                i4 = i5 - 1;
                i2 = i4;
            }
        }
        return this.e[i4];
    }

    private boolean a(int i2, RectF rectF) {
        StaticLayout a;
        CharSequence text = this.l.getText();
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.l.getMaxLines() : -1;
        if (this.k == null) {
            this.k = new TextPaint();
        } else {
            this.k.reset();
        }
        this.k.set(this.l.getPaint());
        this.k.setTextSize(i2);
        Layout.Alignment alignment = (Layout.Alignment) a((Object) this.l, "getLayoutAlignment", (String) Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            a = a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            a = a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    @TargetApi(23)
    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) a((Object) this.l, "getTextDirectionHeuristic", (String) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.k, i2).setAlignment(alignment).setLineSpacing(this.l.getLineSpacingExtra(), this.l.getLineSpacingMultiplier()).setIncludePad(this.l.getIncludeFontPadding()).setBreakStrategy(this.l.getBreakStrategy()).setHyphenationFrequency(this.l.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i3).setTextDirection(textDirectionHeuristic).build();
    }

    @TargetApi(14)
    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            floatValue = this.l.getLineSpacingMultiplier();
            floatValue2 = this.l.getLineSpacingExtra();
            booleanValue = this.l.getIncludeFontPadding();
        } else {
            floatValue = ((Float) a((Object) this.l, "getLineSpacingMultiplier", (String) Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) a((Object) this.l, "getLineSpacingExtra", (String) Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) a((Object) this.l, "getIncludeFontPadding", (String) Boolean.TRUE)).booleanValue();
        }
        return new StaticLayout(charSequence, this.k, i2, alignment, floatValue, floatValue2, booleanValue);
    }

    private <T> T a(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    @Nullable
    private static Method a(@NonNull String str) {
        try {
            Method method = i.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                i.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean d() {
        return e() && this.a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return !(this.l instanceof AppCompatEditText);
    }
}
