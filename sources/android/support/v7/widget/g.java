package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.LruCache;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class g {
    private static g d;
    public final Object a = new Object();
    public final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> b = new WeakHashMap<>(0);
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> l;
    private ArrayMap<String, c> m;
    private SparseArrayCompat<String> n;
    private TypedValue o;
    private boolean p;
    private static final PorterDuff.Mode c = PorterDuff.Mode.SRC_IN;
    private static final b e = new b(6);
    private static final int[] f = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    private static final int[] g = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] h = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] i = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] j = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    private static final int[] k = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    public static g a() {
        if (d == null) {
            g gVar = new g();
            d = gVar;
            if (Build.VERSION.SDK_INT < 24) {
                gVar.a("vector", new d());
                if (Build.VERSION.SDK_INT >= 11) {
                    gVar.a("animated-vector", new a());
                }
            }
        }
        return d;
    }

    public final Drawable a(@NonNull Context context, @DrawableRes int i2, boolean z) {
        d(context);
        Drawable a2 = a(context, i2);
        if (a2 == null) {
            a2 = c(context, i2);
        }
        if (a2 == null) {
            a2 = ContextCompat.getDrawable(context, i2);
        }
        if (a2 != null) {
            a2 = a(context, i2, z, a2);
        }
        if (a2 != null) {
            x.b(a2);
        }
        return a2;
    }

    private static long a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable c(@NonNull Context context, @DrawableRes int i2) {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        context.getResources().getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        if (i2 == R.drawable.abc_cab_background_top_material) {
            a3 = new LayerDrawable(new Drawable[]{a(context, R.drawable.abc_cab_background_internal_bg, false), a(context, R.drawable.abc_cab_background_top_mtrl_alpha, false)});
        }
        if (a3 != null) {
            a3.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, a2, a3);
        }
        return a3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable a(@NonNull Context context, @DrawableRes int i2, boolean z, @NonNull Drawable drawable) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (x.c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable wrap = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(wrap, b2);
            PorterDuff.Mode a2 = a(i2);
            if (a2 != null) {
                DrawableCompat.setTintMode(wrap, a2);
                return wrap;
            }
            return wrap;
        } else if (i2 == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(16908288), as.a(context, R.attr.colorControlNormal), c);
            a(layerDrawable.findDrawableByLayerId(16908303), as.a(context, R.attr.colorControlNormal), c);
            a(layerDrawable.findDrawableByLayerId(16908301), as.a(context, R.attr.colorControlActivated), c);
            return drawable;
        } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            a(layerDrawable2.findDrawableByLayerId(16908288), as.c(context, R.attr.colorControlNormal), c);
            a(layerDrawable2.findDrawableByLayerId(16908303), as.a(context, R.attr.colorControlActivated), c);
            a(layerDrawable2.findDrawableByLayerId(16908301), as.a(context, R.attr.colorControlActivated), c);
            return drawable;
        } else if (a(context, i2, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable a(@NonNull Context context, @DrawableRes int i2) {
        int next;
        if (this.m == null || this.m.isEmpty()) {
            return null;
        }
        if (this.n != null) {
            String str = this.n.get(i2);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.m.get(str) == null)) {
                return null;
            }
        } else {
            this.n = new SparseArrayCompat<>();
        }
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.n.append(i2, name);
                c cVar = this.m.get(name);
                if (cVar != null) {
                    a3 = cVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a3 != null) {
                    a3.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, a2, a3);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManager", "Exception while inflating drawable", e2);
            }
        }
        if (a3 == null) {
            this.n.append(i2, "appcompat_skip_skip");
        }
        return a3;
    }

    private Drawable a(@NonNull Context context, long j2) {
        synchronized (this.a) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.b.get(context);
            if (longSparseArray == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> weakReference = longSparseArray.get(j2);
            if (weakReference != null) {
                Drawable.ConstantState constantState = weakReference.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                longSparseArray.delete(j2);
            }
            return null;
        }
    }

    private boolean a(@NonNull Context context, long j2, @NonNull Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            synchronized (this.a) {
                LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.b.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray<>();
                    this.b.put(context, longSparseArray);
                }
                longSparseArray.put(j2, new WeakReference<>(constantState));
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(@android.support.annotation.NonNull android.content.Context r6, @android.support.annotation.DrawableRes int r7, @android.support.annotation.NonNull android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = android.support.v7.widget.g.c
            int[] r1 = android.support.v7.widget.g.f
            boolean r1 = a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L16
            r2 = 2130772381(0x7f01019d, float:1.7147879E38)
        L13:
            r7 = 1
            r1 = -1
            goto L48
        L16:
            int[] r1 = android.support.v7.widget.g.h
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L22
            r2 = 2130772382(0x7f01019e, float:1.714788E38)
            goto L13
        L22:
            int[] r1 = android.support.v7.widget.g.i
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L2d
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L13
        L2d:
            r1 = 2130837557(0x7f020035, float:1.7280071E38)
            if (r7 != r1) goto L3f
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L48
        L3f:
            r1 = 2130837534(0x7f02001e, float:1.7280025E38)
            if (r7 != r1) goto L45
            goto L13
        L45:
            r7 = 0
            r1 = -1
            r2 = 0
        L48:
            if (r7 == 0) goto L65
            boolean r7 = android.support.v7.widget.x.c(r8)
            if (r7 == 0) goto L54
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L54:
            int r6 = android.support.v7.widget.as.a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L64
            r8.setAlpha(r1)
        L64:
            return r5
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.g.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void a(@NonNull String str, @NonNull c cVar) {
        if (this.m == null) {
            this.m = new ArrayMap<>();
        }
        this.m.put(str, cVar);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private static PorterDuff.Mode a(int i2) {
        if (i2 == R.drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ColorStateList b(@NonNull Context context, @DrawableRes int i2) {
        ColorStateList d2 = d(context, i2);
        if (d2 == null) {
            if (i2 == R.drawable.abc_edit_text_material) {
                d2 = android.support.v7.content.res.b.a(context, R.color.abc_tint_edittext);
            } else if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                d2 = android.support.v7.content.res.b.a(context, R.color.abc_tint_switch_track);
            } else if (i2 == R.drawable.abc_switch_thumb_material) {
                d2 = c(context);
            } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                d2 = a(context);
            } else if (i2 == R.drawable.abc_btn_borderless_material) {
                d2 = e(context, 0);
            } else if (i2 == R.drawable.abc_btn_colored_material) {
                d2 = b(context);
            } else if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                d2 = android.support.v7.content.res.b.a(context, R.color.abc_tint_spinner);
            } else if (a(g, i2)) {
                d2 = as.b(context, R.attr.colorControlNormal);
            } else if (a(j, i2)) {
                d2 = android.support.v7.content.res.b.a(context, R.color.abc_tint_default);
            } else if (a(k, i2)) {
                d2 = android.support.v7.content.res.b.a(context, R.color.abc_tint_btn_checkable);
            } else if (i2 == R.drawable.abc_seekbar_thumb_material) {
                d2 = android.support.v7.content.res.b.a(context, R.color.abc_tint_seek_thumb);
            }
            if (d2 != null) {
                a(context, i2, d2);
            }
        }
        return d2;
    }

    private ColorStateList d(@NonNull Context context, @DrawableRes int i2) {
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        if (this.l == null || (sparseArrayCompat = this.l.get(context)) == null) {
            return null;
        }
        return sparseArrayCompat.get(i2);
    }

    private void a(@NonNull Context context, @DrawableRes int i2, @NonNull ColorStateList colorStateList) {
        if (this.l == null) {
            this.l = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> sparseArrayCompat = this.l.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat<>();
            this.l.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i2, colorStateList);
    }

    private ColorStateList a(@NonNull Context context) {
        return e(context, as.a(context, R.attr.colorButtonNormal));
    }

    private ColorStateList b(@NonNull Context context) {
        return e(context, as.a(context, R.attr.colorAccent));
    }

    private static ColorStateList e(@NonNull Context context, @ColorInt int i2) {
        int a2 = as.a(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{as.a, as.d, as.b, as.h}, new int[]{as.c(context, R.attr.colorButtonNormal), ColorUtils.compositeColors(a2, i2), ColorUtils.compositeColors(a2, i2), i2});
    }

    private static ColorStateList c(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList b2 = as.b(context, R.attr.colorSwitchThumbNormal);
        if (b2 != null && b2.isStateful()) {
            iArr[0] = as.a;
            iArr2[0] = b2.getColorForState(iArr[0], 0);
            iArr[1] = as.e;
            iArr2[1] = as.a(context, R.attr.colorControlActivated);
            iArr[2] = as.h;
            iArr2[2] = b2.getDefaultColor();
        } else {
            iArr[0] = as.a;
            iArr2[0] = as.c(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = as.e;
            iArr2[1] = as.a(context, R.attr.colorControlActivated);
            iArr[2] = as.h;
            iArr2[2] = as.a(context, R.attr.colorSwitchThumbNormal);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends LruCache<Integer, PorterDuffColorFilter> {
        public b(int i) {
            super(6);
        }

        final PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(b(i, mode)));
        }

        final PorterDuffColorFilter a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(b(i, mode)), porterDuffColorFilter);
        }

        private static int b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Drawable drawable, au auVar, int[] iArr) {
        if (!x.c(drawable) || drawable.mutate() == drawable) {
            if (auVar.d || auVar.c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = auVar.d ? auVar.a : null;
                PorterDuff.Mode mode = auVar.c ? auVar.b : c;
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public static PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2 = e.a(i2, mode);
        if (a2 == null) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            e.a(i2, mode, porterDuffColorFilter);
            return porterDuffColorFilter;
        }
        return a2;
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (x.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = c;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    private void d(@NonNull Context context) {
        if (this.p) {
            return;
        }
        this.p = true;
        Drawable a2 = a(context, R.drawable.abc_vector_test, false);
        if (a2 == null || !a(a2)) {
            this.p = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static boolean a(@NonNull Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d implements c {
        d() {
        }

        @Override // android.support.v7.widget.g.c
        public final Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return VectorDrawableCompat.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @RequiresApi(11)
    /* loaded from: classes.dex */
    public static class a implements c {
        a() {
        }

        @Override // android.support.v7.widget.g.c
        public final Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }
}
