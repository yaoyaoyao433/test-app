package com.meituan.android.mrn.component.Touchable;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.f;
import com.meituan.android.mrn.component.list.event.h;
import com.meituan.android.mrn.component.list.event.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends f implements h {
    public static ChangeQuickRedirect a;
    public boolean b;
    private final float c;
    private float d;
    private float e;
    private k f;
    private int g;
    private int h;
    private ViewGroup i;
    private boolean j;

    public final String getEventName() {
        return "onPress";
    }

    public final int getTouchableType() {
        return 0;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c4c77bb16dafd5ec3e5a12c1831b5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c4c77bb16dafd5ec3e5a12c1831b5e");
            return;
        }
        this.c = 0.2f;
        this.d = 0.2f;
        this.j = false;
    }

    public final void setTouchableOpacity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07122acbc097d2a65cfbc76a2cafa151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07122acbc097d2a65cfbc76a2cafa151");
        } else {
            this.d = (f < 0.0f || f > 1.0f) ? 0.2f : 0.2f;
        }
    }

    public final void setEventId(int i) {
        this.h = i;
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a8b41414b74a888d11e3521f33c5a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a8b41414b74a888d11e3521f33c5a5")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64b269380c1568b1e2c20cae8a1450cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64b269380c1568b1e2c20cae8a1450cd")).booleanValue() : a((View) this, motionEvent)) {
            if (!a(this)) {
                this.i = this;
                return true;
            }
            a((ViewGroup) this, motionEvent);
            if (this.i == null || this.i == this) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.f
    public final void setHitSlopRect(@Nullable Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9fd911fa04b46cd4ad1237e1b6f0f74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9fd911fa04b46cd4ad1237e1b6f0f74");
        } else {
            super.setHitSlopRect(rect);
        }
    }

    private boolean a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32014635fe6324e9e65268d94a2fd660", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32014635fe6324e9e65268d94a2fd660")).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i;
        int measuredHeight = view.getMeasuredHeight() + i2;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        return rawY >= i2 && rawY <= measuredHeight && rawX >= i && rawX <= measuredWidth;
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a643af9fa270736ae069e547354f95f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a643af9fa270736ae069e547354f95f9")).booleanValue();
        }
        setOpacityByEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    private void setOpacityByEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c03de24ebd44a93b3b26dfffe1185fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c03de24ebd44a93b3b26dfffe1185fc3");
            return;
        }
        if (this.e == 0.0f) {
            this.e = getAlpha();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.j = true;
            setAlpha(this.d);
        }
        if (action == 3 || action == 1) {
            setAlpha(this.e);
        }
    }

    private ViewGroup a(ViewGroup viewGroup, MotionEvent motionEvent) {
        ViewGroup a2;
        Object[] objArr = {viewGroup, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae19bcbe1d742e3a3cc8aa244c8190e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae19bcbe1d742e3a3cc8aa244c8190e");
        }
        if (a((View) viewGroup, motionEvent) && (viewGroup instanceof b)) {
            this.i = viewGroup;
        }
        if (viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt, motionEvent)) != null) {
                this.i = a2;
                return a2;
            }
        }
        return null;
    }

    private boolean a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3710bbc4a99473b65a202ca61ceb64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3710bbc4a99473b65a202ca61ceb64")).booleanValue();
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof b) {
                return true;
            }
            if ((viewGroup.getChildAt(i) instanceof ViewGroup) && a((ViewGroup) viewGroup.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meituan.android.mrn.component.list.event.h
    public final void a(MotionEvent motionEvent, Object... objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        Object[] objArr2 = {motionEvent, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "8ffc33a69ab5a19d90d3236427c88db8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "8ffc33a69ab5a19d90d3236427c88db8");
        } else if (getTouchableType() == 0) {
            WritableMap writableMap = (WritableMap) objArr[0];
            k kVar = (k) objArr[1];
            if (k.a().equals(kVar) || writableMap == null) {
                return;
            }
            this.f = kVar;
            this.g = kVar.e;
            boolean z2 = writableMap.hasKey("mChildIsHandlingNativeGesture") && writableMap.getBoolean("mChildIsHandlingNativeGesture");
            if (motionEvent.getAction() == 1 && !z2) {
                Object[] objArr3 = {this, writableMap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "64a7129a840e4a968a65b9c3a2dfb4eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "64a7129a840e4a968a65b9c3a2dfb4eb");
                } else {
                    ReactContext reactContext = (ReactContext) getContext();
                    ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new a(this.g, writableMap, reactContext, this.b));
                }
            }
            Object[] objArr4 = {this, motionEvent};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "4c443bc9419b02c0d3eb880236efe3c5", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "4c443bc9419b02c0d3eb880236efe3c5")).booleanValue();
            } else {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i5 = iArr[0];
                int i6 = iArr[1];
                int measuredWidth = getMeasuredWidth() + i5;
                int measuredHeight = getMeasuredHeight() + i6;
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                Rect hitSlopRect = getHitSlopRect();
                if (hitSlopRect != null) {
                    i2 = hitSlopRect.left;
                    i3 = hitSlopRect.right;
                    i4 = hitSlopRect.top;
                    i = hitSlopRect.bottom;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                }
                if (rawY < i6 - i4 || rawY > measuredHeight + i || rawX < i5 - i2 || rawX > measuredWidth + i3) {
                    z = false;
                }
            }
            if (z && this.h == this.g) {
                setOpacityByEvent(motionEvent);
            } else if (this.j) {
                setAlpha(this.e);
                this.j = false;
            }
        }
    }

    public final k getViewToken() {
        return this.f;
    }

    public final int getEventId() {
        return this.g;
    }
}
