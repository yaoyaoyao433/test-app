package com.sankuai.waimai.foundation.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ah {
    public static ChangeQuickRedirect a;
    private static final int[] b = new int[2];

    public static boolean a(TextView textView, CharSequence charSequence) {
        Object[] objArr = {textView, charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "429c9ce0d8c89acf2351436a181df8a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "429c9ce0d8c89acf2351436a181df8a2")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58cad89bb71c129265f2f10ea3b5f844", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58cad89bb71c129265f2f10ea3b5f844")).booleanValue();
        }
        if (i == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(i);
        textView.setVisibility(0);
        return true;
    }

    public static boolean a(ViewGroup viewGroup, TextView textView, CharSequence charSequence) {
        Object[] objArr = {viewGroup, textView, charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f2d5ee0669cd922d6207fda7346de74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f2d5ee0669cd922d6207fda7346de74")).booleanValue();
        }
        if (TextUtils.isEmpty(charSequence)) {
            viewGroup.setVisibility(8);
            return false;
        }
        textView.setText(charSequence);
        viewGroup.setVisibility(0);
        return true;
    }

    public static void a(TextView textView, CharSequence charSequence, CharSequence charSequence2) {
        Object[] objArr = {textView, charSequence, charSequence2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1320e9a384c4f1ae664c1449b697232f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1320e9a384c4f1ae664c1449b697232f");
        } else if (textView == null) {
        } else {
            if (!TextUtils.isEmpty(charSequence)) {
                textView.setText(charSequence);
            } else {
                textView.setText(charSequence2);
            }
        }
    }

    public static boolean a(ImageView imageView, int i) {
        Object[] objArr = {imageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9275da3dd5ea623a6edfeab046eddf58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9275da3dd5ea623a6edfeab046eddf58")).booleanValue();
        }
        if (i == 0) {
            imageView.setVisibility(8);
            return false;
        }
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        return true;
    }

    @Deprecated
    public static boolean a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "092046f414f42ef8664c2e8cd93c744f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "092046f414f42ef8664c2e8cd93c744f")).booleanValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return false;
        }
        if (i != 0) {
            layoutParams.width = i;
        }
        if (i2 != 0) {
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
        return true;
    }

    public static boolean b(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6acb4337d987754f374ba16eef703075", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6acb4337d987754f374ba16eef703075")).booleanValue();
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

    public static void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10ffcc70647021ed9918bbfd0a51d4aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10ffcc70647021ed9918bbfd0a51d4aa");
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
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void a(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95460a54de077835d39b0b3a0039e4cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95460a54de077835d39b0b3a0039e4cc");
            return;
        }
        view.setVisibility(f <= 0.0f ? 8 : 0);
        view.setAlpha(f);
    }

    public static int a(Context context) {
        Resources resources;
        int identifier;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58ad150a68d86b2e9c423be4071302e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58ad150a68d86b2e9c423be4071302e2")).intValue();
        }
        if (context == null || (resources = context.getResources()) == null || (identifier = resources.getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static void b(ImageView imageView, @DrawableRes int i) {
        Object[] objArr = {imageView, Integer.valueOf((int) R.drawable.wm_common_progress_rotate)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6528b8467c9b6a90e5aed6c1513097ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6528b8467c9b6a90e5aed6c1513097ec");
            return;
        }
        Drawable drawable = imageView.getResources().getDrawable(R.drawable.wm_common_progress_rotate);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            }
        }
    }

    public static void a(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c321c60ad1395ae52ab944289c4c248a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c321c60ad1395ae52ab944289c4c248a");
            return;
        }
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setCallback(null);
        }
        imageView.setImageDrawable(null);
    }

    public static Rect a(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86d02365b2e179454b86257724f7c426", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86d02365b2e179454b86257724f7c426");
        }
        if (view == null) {
            return null;
        }
        view.getLocationInWindow(b);
        int i = b[0];
        int i2 = b[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static boolean a(@Nullable View view, @Nullable Rect rect) {
        Object[] objArr = {view, rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bbb42be92210b52bd7e094e149dda1c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bbb42be92210b52bd7e094e149dda1c")).booleanValue() : (view == null || rect == null || !Rect.intersects(a(view), rect)) ? false : true;
    }

    public static boolean b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf9e1587ab335969eda8fd3aafef2598", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf9e1587ab335969eda8fd3aafef2598")).booleanValue() : view != null && a(view, view.getContext());
    }

    public static boolean a(View view, Context context) {
        Object[] objArr = {view, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab3605ade7b31034c0727848460db2c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab3605ade7b31034c0727848460db2c4")).booleanValue();
        }
        if (view == null || context == null) {
            return false;
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        int top = view.getTop();
        int bottom = view.getBottom();
        int left = view.getLeft();
        int right = view.getRight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] == 0 && Build.VERSION.SDK_INT >= 24) {
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            if (iArr2[1] == 0) {
                return false;
            }
        }
        return new Rect(0, 0, i, i2).intersect(new Rect(iArr[0], iArr[1], (right - left) + iArr[0], (bottom - top) + iArr[1]));
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da94f57bd356e928d2de97c23abfa83b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da94f57bd356e928d2de97c23abfa83b");
        } else if (view == null) {
        } else {
            if (i < 0) {
                i = view.getPaddingLeft();
            }
            if (i2 < 0) {
                i2 = view.getPaddingTop();
            }
            if (i3 < 0) {
                i3 = view.getPaddingRight();
            }
            if (i4 < 0) {
                i4 = view.getPaddingBottom();
            }
            view.setPadding(i, i2, i3, i4);
        }
    }

    public static void c(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, 0, Integer.valueOf(i2), 0, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88e642cc0c678a76f550806284727021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88e642cc0c678a76f550806284727021");
        } else {
            view.setPadding(g.a(view.getContext(), 0.0f), i2 < 0 ? view.getPaddingTop() : g.a(view.getContext(), i2), g.a(view.getContext(), 0.0f), i4 < 0 ? view.getPaddingBottom() : g.a(view.getContext(), i4));
        }
    }

    public static View a(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "079a5ae04779758a0cf30059bd3a886a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "079a5ae04779758a0cf30059bd3a886a") : a(view, view2, 10);
    }

    public static View a(View view, View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "283af278995a2b8ff9c4caf295bec95b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "283af278995a2b8ff9c4caf295bec95b");
        }
        if (view == null || view2 == null || i <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ViewParent parent = view2.getParent();
            if (parent == view) {
                return view2;
            }
            if (!(parent instanceof View)) {
                return null;
            }
            view2 = (View) parent;
        }
        return null;
    }

    public static void b(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40465084b537e7959e267929dd633a94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40465084b537e7959e267929dd633a94");
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).weight = f;
            }
        }
    }
}
