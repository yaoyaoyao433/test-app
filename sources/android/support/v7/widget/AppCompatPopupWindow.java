package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.widget.PopupWindowCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AppCompatPopupWindow extends PopupWindow {
    private static final boolean a;
    private boolean b;

    static {
        a = Build.VERSION.SDK_INT < 21;
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        aw a2 = aw.a(context, attributeSet, new int[]{16843126, 16843465, R.attr.overlapAnchor}, i, i2);
        if (a2.f(2)) {
            a(a2.a(2, false));
        }
        setBackgroundDrawable(a2.a(0));
        int i3 = Build.VERSION.SDK_INT;
        if (i2 != 0 && i3 < 11 && a2.f(1)) {
            setAnimationStyle(a2.g(1, -1));
        }
        a2.a.recycle();
        if (Build.VERSION.SDK_INT < 14) {
            a(this);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    private static void a(final PopupWindow popupWindow) {
        try {
            final Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField2.setAccessible(true);
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) declaredField2.get(popupWindow);
            declaredField2.set(popupWindow, new ViewTreeObserver.OnScrollChangedListener() { // from class: android.support.v7.widget.AppCompatPopupWindow.1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    try {
                        WeakReference weakReference = (WeakReference) declaredField.get(popupWindow);
                        if (weakReference != null && weakReference.get() != null) {
                            onScrollChangedListener.onScrollChanged();
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            });
        } catch (Exception e) {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", e);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private void a(boolean z) {
        if (a) {
            this.b = z;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z);
        }
    }
}
