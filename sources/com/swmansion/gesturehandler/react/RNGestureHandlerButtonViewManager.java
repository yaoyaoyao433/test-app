package com.swmansion.gesturehandler.react;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.meituan.android.recce.props.gens.BorderRadius;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerButton";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends ViewGroup {
        static a b;
        int d;
        Integer e;
        Integer f;
        boolean g;
        boolean h;
        float i;
        boolean j;
        long k;
        static TypedValue a = new TypedValue();
        static View.OnClickListener c = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };

        @Override // android.view.ViewGroup, android.view.View
        public final void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        public a(Context context) {
            super(context);
            this.d = 0;
            this.g = false;
            this.h = false;
            this.i = 0.0f;
            this.j = false;
            this.k = 0L;
            setOnClickListener(c);
            setClickable(true);
            setFocusable(true);
            this.j = true;
        }

        @Override // android.view.View
        public final void setBackgroundColor(int i) {
            this.d = i;
            this.j = true;
        }

        private Drawable a(Drawable drawable) {
            if (this.e != null && Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{this.e.intValue()}));
            }
            if (Build.VERSION.SDK_INT >= 23 && this.f != null && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) w.a(this.f.intValue()));
            }
            return drawable;
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            long eventTime = motionEvent.getEventTime();
            if (this.k != eventTime || this.k == 0) {
                this.k = eventTime;
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }

        private Drawable a() {
            int i = Build.VERSION.SDK_INT;
            getContext().getTheme().resolveAttribute(a(getContext(), (!this.h || i < 21) ? "selectableItemBackground" : "selectableItemBackgroundBorderless"), a, true);
            if (i >= 21) {
                return getResources().getDrawable(a.resourceId, getContext().getTheme());
            }
            return getResources().getDrawable(a.resourceId);
        }

        @TargetApi(21)
        private static int a(Context context, String str) {
            SoftAssertions.assertNotNull(str);
            if ("selectableItemBackground".equals(str)) {
                return 16843534;
            }
            if ("selectableItemBackgroundBorderless".equals(str)) {
                return 16843868;
            }
            return context.getResources().getIdentifier(str, "attr", "android");
        }

        @Override // android.view.View
        public final void drawableHotspotChanged(float f, float f2) {
            if (b == null || b == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        @Override // android.view.View
        public final void setPressed(boolean z) {
            if (z && b == null) {
                b = this;
            }
            if (!z || b == this) {
                super.setPressed(z);
            }
            if (z || b != this) {
                return;
            }
            b = null;
        }

        static /* synthetic */ void a(a aVar) {
            if (aVar.j) {
                aVar.j = false;
                if (aVar.d == 0) {
                    aVar.setBackground(null);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    aVar.setForeground(null);
                }
                if (aVar.g && Build.VERSION.SDK_INT >= 23) {
                    aVar.setForeground(aVar.a(aVar.a()));
                    if (aVar.d != 0) {
                        aVar.setBackgroundColor(aVar.d);
                    }
                } else if (aVar.d == 0 && aVar.e == null) {
                    aVar.setBackground(aVar.a());
                } else {
                    PaintDrawable paintDrawable = new PaintDrawable(aVar.d);
                    Drawable a2 = aVar.a();
                    if (aVar.i != 0.0f) {
                        paintDrawable.setCornerRadius(aVar.i);
                        if (Build.VERSION.SDK_INT >= 21 && (a2 instanceof RippleDrawable)) {
                            PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                            paintDrawable2.setCornerRadius(aVar.i);
                            ((RippleDrawable) a2).setDrawableByLayerId(16908334, paintDrawable2);
                        }
                    }
                    aVar.a(a2);
                    aVar.setBackground(new LayerDrawable(new Drawable[]{paintDrawable, a2}));
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        return new a(aoVar);
    }

    @ReactProp(name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        a.a(aVar);
    }

    @ReactProp(name = "foreground")
    @TargetApi(23)
    public void setForeground(a aVar, boolean z) {
        aVar.g = z;
        aVar.j = true;
    }

    @ReactProp(name = "borderless")
    public void setBorderless(a aVar, boolean z) {
        aVar.h = z;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ReactProp(name = BorderRadius.LOWER_CASE_NAME)
    public void setBorderRadius(a aVar, float f) {
        aVar.i = f * aVar.getResources().getDisplayMetrics().density;
        aVar.j = true;
    }

    @ReactProp(name = "rippleColor")
    public void setRippleColor(a aVar, Integer num) {
        aVar.e = num;
        aVar.j = true;
    }

    @ReactProp(name = "rippleRadius")
    public void setRippleRadius(a aVar, Integer num) {
        aVar.f = num;
        aVar.j = true;
    }
}
