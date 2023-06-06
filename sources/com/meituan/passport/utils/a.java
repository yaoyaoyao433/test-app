package com.meituan.passport.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0512a {
        public Drawable a;
        public Drawable b;
        public int c;
        public int d;
        public int e;

        public C0512a(Context context) {
            Resources resources = context.getResources();
            this.a = resources.getDrawable(R.color.passport_meituan_color);
            this.b = resources.getDrawable(R.drawable.passport_actionbar_back);
            this.c = resources.getDimensionPixelSize(R.dimen.passport_action_bar_size);
            this.e = resources.getDimensionPixelSize(R.dimen.passport_text_size_h18);
            this.d = resources.getColor(17170443);
        }
    }

    public static C0512a a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ecf6181171fc9760bff601c8b19818f", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0512a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ecf6181171fc9760bff601c8b19818f");
        }
        try {
            C0512a c0512a = new C0512a(activity);
            Drawable b = b(activity);
            if (b != null) {
                c0512a.a = b;
            }
            Drawable f = f(activity);
            if (f != null) {
                c0512a.b = f;
            }
            c0512a.c = c(activity);
            c0512a.d = d(activity);
            c0512a.e = e(activity);
            return c0512a;
        } catch (Throwable unused) {
            return new C0512a(activity);
        }
    }

    private static Drawable b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        TypedArray typedArray = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16fb3c76a3f71d6aa9aea7b739f1b8f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16fb3c76a3f71d6aa9aea7b739f1b8f9");
        }
        try {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(R.attr.actionBarStyle, typedValue, true);
            TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{R.attr.background});
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                return drawable;
            } catch (Throwable th) {
                th = th;
                typedArray = obtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static int c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        TypedArray typedArray = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "541968a403b18a254af212158b4505ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "541968a403b18a254af212158b4505ba")).intValue();
        }
        try {
            TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                return dimensionPixelSize;
            } catch (Throwable th) {
                th = th;
                typedArray = obtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static int d(Activity activity) {
        TypedArray typedArray;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        TypedArray typedArray2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb3473146d7c49cc818cc5b1acdd3717", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb3473146d7c49cc818cc5b1acdd3717")).intValue();
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.actionBarStyle, typedValue, true);
        try {
            typedArray = activity.getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{R.attr.titleTextStyle});
            try {
                TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(typedArray.getResourceId(0, 2131558773), new int[]{16842904});
                try {
                    int color = obtainStyledAttributes.getColor(0, activity.getResources().getColor(17170443));
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    if (obtainStyledAttributes != null) {
                        obtainStyledAttributes.recycle();
                    }
                    return color;
                } catch (Throwable th) {
                    th = th;
                    typedArray2 = obtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    private static int e(Activity activity) {
        TypedArray typedArray;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        TypedArray typedArray2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e52bdf0ac83e06898b9b13fdce190677", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e52bdf0ac83e06898b9b13fdce190677")).intValue();
        }
        try {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(R.attr.actionBarStyle, typedValue, true);
            TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{R.attr.titleTextStyle});
            try {
                typedArray = activity.getTheme().obtainStyledAttributes(obtainStyledAttributes.getResourceId(0, 2131558773), new int[]{16842901});
                try {
                    int dimensionPixelSize = typedArray.getDimensionPixelSize(0, 0);
                    if (obtainStyledAttributes != null) {
                        obtainStyledAttributes.recycle();
                    }
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    return dimensionPixelSize;
                } catch (Throwable th) {
                    th = th;
                    typedArray2 = obtainStyledAttributes;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray = null;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    private static Drawable f(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        TypedArray typedArray = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a031ad9c23ba2054ba2f02ed937e2176", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a031ad9c23ba2054ba2f02ed937e2176");
        }
        try {
            TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.homeAsUpIndicator});
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                return drawable;
            } catch (Throwable th) {
                th = th;
                typedArray = obtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
