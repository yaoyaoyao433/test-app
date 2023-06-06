package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public class ah implements aj {
    protected a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    private static ViewGroup a(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ah c(View view) {
        ViewGroup a2 = a(view);
        if (a2 != null) {
            int childCount = a2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = a2.getChildAt(i);
                if (childAt instanceof a) {
                    return ((a) childAt).e;
                }
            }
            return new aa(a2.getContext(), a2, view);
        }
        return null;
    }

    @Override // android.support.transition.aj
    public final void a(@NonNull Drawable drawable) {
        a aVar = this.a;
        if (aVar.d == null) {
            aVar.d = new ArrayList<>();
        }
        if (aVar.d.contains(drawable)) {
            return;
        }
        aVar.d.add(drawable);
        aVar.invalidate(drawable.getBounds());
        drawable.setCallback(aVar);
    }

    @Override // android.support.transition.aj
    public final void b(@NonNull Drawable drawable) {
        a aVar = this.a;
        if (aVar.d != null) {
            aVar.d.remove(drawable);
            aVar.invalidate(drawable.getBounds());
            drawable.setCallback(null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends ViewGroup {
        static Method a;
        ViewGroup b;
        View c;
        ArrayList<Drawable> d;
        ah e;

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            try {
                a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, ah ahVar) {
            super(context);
            this.d = null;
            this.b = viewGroup;
            this.c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.e = ahVar;
        }

        @Override // android.view.View
        protected final boolean verifyDrawable(@NonNull Drawable drawable) {
            if (super.verifyDrawable(drawable)) {
                return true;
            }
            return this.d != null && this.d.contains(drawable);
        }

        public final void a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.b && viewGroup.getParent() != null && ViewCompat.isAttachedToWindow(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.b.getLocationOnScreen(iArr2);
                    ViewCompat.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    ViewCompat.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        public final void b(View view) {
            super.removeView(view);
            if (getChildCount() == 0 && (this.d == null || this.d.size() == 0)) {
                this.b.removeView(this);
            }
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@NonNull Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.b.getLocationOnScreen(iArr);
            this.c.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.c.getWidth(), this.c.getHeight()));
            super.dispatchDraw(canvas);
            int size = this.d == null ? 0 : this.d.size();
            for (int i = 0; i < size; i++) {
                this.d.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    int[] iArr3 = new int[2];
                    this.b.getLocationOnScreen(iArr2);
                    this.c.getLocationOnScreen(iArr3);
                    int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                    rect.offset(iArr4[0], iArr4[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }
    }
}
