package com.sankuai.meituan.android.ui.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect d;
    public Snackbar e;

    public static a a(View view, CharSequence charSequence, int i) {
        Object[] objArr = {view, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74f5b251602c6103b08929b30b6b780c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74f5b251602c6103b08929b30b6b780c") : new a(view, charSequence, i);
    }

    public static a a(@NonNull Activity activity, CharSequence charSequence, int i) {
        Object[] objArr = {activity, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00f7c3aa3c4c331165bd54f219a790fb", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00f7c3aa3c4c331165bd54f219a790fb") : new a(activity, charSequence, i);
    }

    public a(@NonNull View view, CharSequence charSequence, int i) {
        Object[] objArr = {view, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c073184c245f6099e69545536b2ee9f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c073184c245f6099e69545536b2ee9f6");
        } else {
            b(view, charSequence, i);
        }
    }

    public a(@NonNull Activity activity, CharSequence charSequence, int i) {
        Object[] objArr = {activity, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "739b31911a23f419aed0697e4dcac91f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "739b31911a23f419aed0697e4dcac91f");
        } else {
            b(activity.findViewById(16908290), charSequence, i);
        }
    }

    public a(@NonNull Dialog dialog, CharSequence charSequence, int i) {
        Object[] objArr = {dialog, charSequence, 0};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9822362b0b5796bfbe82c5544bb8fc98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9822362b0b5796bfbe82c5544bb8fc98");
            return;
        }
        Window window = dialog.getWindow();
        if (window == null || window.getDecorView() == null || charSequence == null) {
            return;
        }
        b(window.getDecorView(), charSequence, 0);
    }

    private void b(View view, CharSequence charSequence, int i) {
        Object[] objArr = {view, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4f40e53266e0e506076bfafaf97da8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4f40e53266e0e506076bfafaf97da8");
        } else if (view == null || TextUtils.isEmpty(charSequence)) {
        } else {
            this.e = Snackbar.a(view, charSequence, i, 17);
            a(a(view.getContext(), 6.0f));
        }
    }

    public static int a(@NonNull Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "592d96cffcf6f5b3893ad2853f10bcd2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "592d96cffcf6f5b3893ad2853f10bcd2")).intValue() : (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public final a a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68b191b468b8b88d497e1faa4da14153", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68b191b468b8b88d497e1faa4da14153");
        }
        if (this.e != null) {
            this.e.a(true);
        }
        return this;
    }

    public final a a(float f) {
        GradientDrawable a;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bddd6d658986afd9095dd4752ee2c5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bddd6d658986afd9095dd4752ee2c5e");
        }
        if (this.e != null && (a = a(this.e.d.getBackground())) != null) {
            if (f <= 0.0f) {
                f = 0.0f;
            }
            a.setCornerRadius(f);
            if (Build.VERSION.SDK_INT >= 16) {
                this.e.d.setBackground(a);
            } else {
                this.e.d.setBackgroundDrawable(a);
            }
        }
        return this;
    }

    private GradientDrawable a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87c3f27de3f5385ee7c3f1ac9143024c", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87c3f27de3f5385ee7c3f1ac9143024c");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (drawable instanceof GradientDrawable) {
            return (GradientDrawable) drawable;
        }
        if (drawable instanceof ColorDrawable) {
            gradientDrawable.setColor(((ColorDrawable) drawable).getColor());
            return gradientDrawable;
        }
        return gradientDrawable;
    }

    public final a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c947388c59488d2315146ba8d7eace8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c947388c59488d2315146ba8d7eace8a");
        }
        if (this.e != null) {
            this.e.b = i;
        }
        return this;
    }

    public final a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0fa2ec4322a35b0b6132c406ea41e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0fa2ec4322a35b0b6132c406ea41e7");
        }
        if (this.e != null) {
            this.e.d.setBackgroundColor(i);
            a(a(this.e.d.getContext(), 6.0f));
        }
        return this;
    }

    public final a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf011c291e883939edfefbe74c2b0aff", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf011c291e883939edfefbe74c2b0aff");
        }
        if (this.e != null) {
            this.e.d.setBackgroundColor(Color.parseColor(str));
            a(a(this.e.d.getContext(), 6.0f));
        }
        return this;
    }

    public final a a(int i, int i2) {
        Object[] objArr = {40, 40};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ae6ee256b768cab6587c051dc8bc34", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ae6ee256b768cab6587c051dc8bc34");
        }
        if (this.e != null) {
            TextView textView = (TextView) this.e.d.findViewById(R.id.snackbar_text);
            textView.setPadding(textView.getCompoundPaddingLeft(), 40, textView.getCompoundPaddingRight(), 40);
        }
        return this;
    }

    public final a c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a7411c8771d36884bfa3a06bfb94d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a7411c8771d36884bfa3a06bfb94d5");
        }
        if (this.e != null) {
            ((TextView) this.e.d.findViewById(R.id.snackbar_text)).setTextColor(i);
        }
        return this;
    }

    public final a d(int i) {
        Object[] objArr = {14};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d83348f6db49170bf6f0b6e27580d181", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d83348f6db49170bf6f0b6e27580d181");
        }
        if (this.e != null) {
            ((TextView) this.e.d.findViewById(R.id.snackbar_text)).setTextSize(14.0f);
        }
        return this;
    }

    public final a a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "543fc340c39184ccd438a71cb0f20372", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "543fc340c39184ccd438a71cb0f20372");
        }
        if (this.e != null) {
            ((TextView) this.e.d.findViewById(R.id.snackbar_text)).setLineSpacing(f, 1.0f);
        }
        return this;
    }

    private a a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639ebd03aebf46051055ee2175cc54d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639ebd03aebf46051055ee2175cc54d9");
        }
        if (this.e != null) {
            this.e.d.addView(view, i);
        }
        return this;
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688cd5d98f5d8de163e8f8b8907a11f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688cd5d98f5d8de163e8f8b8907a11f2");
        } else if (this.e == null) {
        } else {
            View findViewById = this.e.d.findViewById(R.id.snackbar_text);
            switch (i2) {
                case 1:
                    findViewById.setPadding(findViewById.getPaddingLeft(), i, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
                    return;
                case 2:
                    findViewById.setPadding(i, findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
                    return;
                case 3:
                    findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i);
                    return;
                case 4:
                    findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), i, findViewById.getPaddingBottom());
                    return;
                default:
                    return;
            }
        }
    }

    public final a a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bdd6a885d8d7e6c96f96a8969009104", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bdd6a885d8d7e6c96f96a8969009104");
        }
        if (this.e == null) {
            return this;
        }
        f(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = view.getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_design_icon_padding_vertical_mt);
        layoutParams.gravity = 1;
        b(view.getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_design_message_icon_padding_mt), 1);
        b(view.getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_design_icon_padding_vertical_mt), 3);
        view.setLayoutParams(layoutParams);
        this.e.d.setMinimumWidth(view.getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_design_icon_minwidth_mt));
        a(view, 0);
        return this;
    }

    public final a b(View view) {
        int i = 0;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39baccaf475240275511fcd697c418c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39baccaf475240275511fcd697c418c5");
        }
        if (this.e == null) {
            return this;
        }
        f(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = view.getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_design_icon_padding_vertical_mt);
        layoutParams.gravity = 1;
        b(view.getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_design_message_icon_padding_mt), 3);
        b(view.getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_design_icon_padding_vertical_mt), 1);
        view.setLayoutParams(layoutParams);
        this.e.d.setMinimumWidth(view.getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_design_icon_minwidth_mt));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd6f054c29778f2bda1c6d6d58a2792a", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd6f054c29778f2bda1c6d6d58a2792a")).intValue();
        } else if (this.e != null) {
            i = this.e.d.getChildCount();
        }
        a(view, i);
        return this;
    }

    private a f(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc53b6e3afec00a40b3e63517a06224", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc53b6e3afec00a40b3e63517a06224");
        }
        if (this.e != null && (this.e.d instanceof SnackbarLayout)) {
            SnackbarLayout snackbarLayout = this.e.d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) snackbarLayout.findViewById(R.id.snackbar_text).getLayoutParams();
            layoutParams.gravity = 1;
            snackbarLayout.setLayoutParams(layoutParams);
            snackbarLayout.setGravity(1);
            e(17);
            snackbarLayout.setOrientation(1);
        }
        return this;
    }

    public final a a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d543af1357b0b0dcbfd658fb3f81a80", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d543af1357b0b0dcbfd658fb3f81a80");
        }
        if (this.e != null && (this.e.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.e.a(i, i2, i3, i4);
        }
        return this;
    }

    public final a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a60c9b52b3db1bb6055b6c3d43dbe1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a60c9b52b3db1bb6055b6c3d43dbe1");
        }
        if (this.e != null) {
            this.e.b();
        }
        return this;
    }

    public a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd8ae908f58bb1870515bd8a058329a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd8ae908f58bb1870515bd8a058329a");
        }
        if (this.e != null) {
            ((TextView) this.e.d.findViewById(R.id.snackbar_text)).setText(str);
        }
        return this;
    }

    public final a e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b3174cc111be8c43cc4532212ab397", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b3174cc111be8c43cc4532212ab397");
        }
        if (this.e != null) {
            this.e.a(i);
        }
        return this;
    }

    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cec3dba709438e0c6ac109564c6c049", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cec3dba709438e0c6ac109564c6c049");
        }
        if (this.e != null) {
            return this.e.d;
        }
        return null;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad74b2c2e8eefcb9034c87d0ead9de3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad74b2c2e8eefcb9034c87d0ead9de3b");
        } else if (this.e != null) {
            this.e.a();
        }
    }
}
