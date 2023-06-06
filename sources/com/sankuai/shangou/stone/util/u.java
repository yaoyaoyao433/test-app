package com.sankuai.shangou.stone.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class u {
    public static ChangeQuickRedirect a;
    private static final int[] b = new int[2];

    public static boolean a(TextView textView, CharSequence charSequence) {
        Object[] objArr = {textView, charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce29ad544a695db2421b1f43d5b6ce9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce29ad544a695db2421b1f43d5b6ce9c")).booleanValue();
        }
        if (textView == null) {
            return false;
        }
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
        return true;
    }

    public static boolean a(TextView textView, int i) {
        Object[] objArr = {textView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c04eef7eed43cb6b01fbdba5cc5bd89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c04eef7eed43cb6b01fbdba5cc5bd89")).booleanValue();
        }
        if (i == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(i);
        textView.setVisibility(0);
        return true;
    }

    public static boolean a(ImageView imageView, int i) {
        Object[] objArr = {imageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ba92ab8f193cd3a30116f5192c83954", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ba92ab8f193cd3a30116f5192c83954")).booleanValue();
        }
        if (i == 0) {
            imageView.setVisibility(8);
            return false;
        }
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        return true;
    }

    public static boolean a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5342cc7981b3755ae34962de27c5e2f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5342cc7981b3755ae34962de27c5e2f9")).booleanValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            layoutParams.width = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
        return true;
    }

    public static void a(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e4dec736a384507b948529851a79131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e4dec736a384507b948529851a79131");
        } else if (view != null) {
            view.setVisibility(f <= 0.0f ? 4 : 0);
            view.setAlpha(f);
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d2c2377d36180da00ad48a0efbfd23f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d2c2377d36180da00ad48a0efbfd23f")).intValue();
        }
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int a(Context context) {
        Resources resources;
        int identifier;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8954fca95c249459397370b335708737", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8954fca95c249459397370b335708737")).intValue();
        }
        if (context == null || (resources = context.getResources()) == null || (identifier = resources.getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static boolean a(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90fc4ba57cba28c7dff23a851c11b231", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90fc4ba57cba28c7dff23a851c11b231")).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight()).contains(f, f2);
    }

    public static int a(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21c2e97b2068b6b9ea8f2f3923d96bc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21c2e97b2068b6b9ea8f2f3923d96bc3")).intValue();
        }
        if (view == null || view2 == null) {
            return 0;
        }
        view.getLocationInWindow(b);
        int i = b[1];
        view2.getLocationInWindow(b);
        return i - b[1];
    }

    public static boolean a(View view) {
        boolean z;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d3616e79e5cdfe7c9207727f63c2828", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d3616e79e5cdfe7c9207727f63c2828")).booleanValue();
        }
        if (view != null) {
            Context context = view.getContext();
            Object[] objArr2 = {view, context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a181f445ca753e5e5705a40c736d4df9", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a181f445ca753e5e5705a40c736d4df9")).booleanValue();
            } else if (view == null || view.getVisibility() != 0 || context == null) {
                z = false;
            } else {
                int i = context.getResources().getDisplayMetrics().widthPixels;
                int i2 = context.getResources().getDisplayMetrics().heightPixels;
                int top = view.getTop();
                int bottom = view.getBottom();
                int left = view.getLeft();
                int right = view.getRight();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                z = new Rect(0, 0, i, i2).intersect(new Rect(iArr[0], iArr[1], (right - left) + iArr[0], (bottom - top) + iArr[1]));
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f8094282912147bb1c72e6552db7b66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f8094282912147bb1c72e6552db7b66")).booleanValue();
        }
        if (view == null || view.getVisibility() != 0 || view2 == null || view2.getVisibility() != 0) {
            return false;
        }
        return b(view2).intersect(b(view));
    }

    private static Rect b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e3eb037857cb1fa372db9252f1a4b3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e3eb037857cb1fa372db9252f1a4b3a");
        }
        int top = view.getTop();
        int bottom = view.getBottom();
        int left = view.getLeft();
        int right = view.getRight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], (right - left) + iArr[0], (bottom - top) + iArr[1]);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, 0, Integer.valueOf(i2), 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60d4c393c6ffd439d76f570dcf769c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60d4c393c6ffd439d76f570dcf769c3f");
        } else if (view == null) {
        } else {
            if (i2 < 0) {
                i2 = view.getPaddingTop();
            }
            view.setPadding(0, i2, 0, 0);
        }
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, 0, Integer.valueOf(i2), 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50249afc23e17b934a6f554d3cc01b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50249afc23e17b934a6f554d3cc01b03");
        } else {
            view.setPadding(h.a(view.getContext(), 0.0f), i2 < 0 ? view.getPaddingTop() : h.a(view.getContext(), i2), h.a(view.getContext(), 0.0f), h.a(view.getContext(), 0.0f));
        }
    }

    public static void a(TextView textView, boolean z) {
        Object[] objArr = {textView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f62b8bfc5c5c89101967070670838ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f62b8bfc5c5c89101967070670838ef");
        } else if (textView != null) {
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    public static void c(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e3e53683576bd9edf645198cf7b41d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e3e53683576bd9edf645198cf7b41d2");
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (i >= 0) {
                    marginLayoutParams.leftMargin = i;
                }
                if (i2 >= 0) {
                    marginLayoutParams.topMargin = i2;
                }
                if (i3 >= 0) {
                    marginLayoutParams.rightMargin = i3;
                }
                if (i4 >= 0) {
                    marginLayoutParams.bottomMargin = i4;
                }
            }
        }
    }

    public static void d(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67540fd91616a78e8ba7b2312eb064df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67540fd91616a78e8ba7b2312eb064df");
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (i != Integer.MIN_VALUE) {
                    marginLayoutParams.leftMargin = i;
                }
                if (i2 != Integer.MIN_VALUE) {
                    marginLayoutParams.topMargin = i2;
                }
                if (i3 != Integer.MIN_VALUE) {
                    marginLayoutParams.rightMargin = i3;
                }
                if (i4 != Integer.MIN_VALUE) {
                    marginLayoutParams.bottomMargin = i4;
                }
            }
        }
    }

    public static void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb3f02702b302affb0137dfcb6d42e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb3f02702b302affb0137dfcb6d42e51");
        } else if (view == null || view.getVisibility() == i) {
        } else {
            view.setVisibility(i);
        }
    }

    public static void a(View... viewArr) {
        Object[] objArr = {viewArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "686eb474b41075ffe0ca13b91288a5ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "686eb474b41075ffe0ca13b91288a5ac");
        } else if (viewArr.length > 0) {
            for (View view : viewArr) {
                a(view, 0);
            }
        }
    }

    public static void b(View... viewArr) {
        Object[] objArr = {viewArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bb411e3bad908d1752e0fbf9321b289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bb411e3bad908d1752e0fbf9321b289");
        } else if (viewArr.length > 0) {
            for (View view : viewArr) {
                a(view, 4);
            }
        }
    }

    public static void c(View... viewArr) {
        Object[] objArr = {viewArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3719907338ef3bc52e4f6c7016feed3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3719907338ef3bc52e4f6c7016feed3a");
        } else if (viewArr != null && viewArr.length > 0) {
            for (View view : viewArr) {
                a(view, 8);
            }
        }
    }

    public static void a(boolean z, View... viewArr) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), viewArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9704cf5332495c22a85c7eac0b22a901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9704cf5332495c22a85c7eac0b22a901");
            return;
        }
        for (int i = 0; i <= 0; i++) {
            View view = viewArr[0];
            if (view != null) {
                view.setEnabled(z);
            }
        }
    }

    public static void a(View.OnClickListener onClickListener, View... viewArr) {
        Object[] objArr = {onClickListener, viewArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "345f9d8c88ae99ba1f2740947258c951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "345f9d8c88ae99ba1f2740947258c951");
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(onClickListener);
            }
        }
    }
}
