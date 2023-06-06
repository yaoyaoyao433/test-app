package com.meituan.msc.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l extends Animation {
    public static ChangeQuickRedirect a;
    private final View b;
    private final float c;
    private final float d;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a implements Animation.AnimationListener {
        public static ChangeQuickRedirect a;
        private final View b;
        private boolean c;

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        public a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87252a89a93d23e5097247b129b5935a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87252a89a93d23e5097247b129b5935a");
                return;
            }
            this.c = false;
            this.b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            Object[] objArr = {animation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f96473e1941c5157f07e632bedecb47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f96473e1941c5157f07e632bedecb47");
            } else if (this.b.hasOverlappingRendering() && this.b.getLayerType() == 0) {
                this.c = true;
                this.b.setLayerType(2, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            Object[] objArr = {animation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27be81650053887779281baa18d97a3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27be81650053887779281baa18d97a3f");
            } else if (this.c) {
                this.b.setLayerType(0, null);
            }
        }
    }

    public l(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3d387781c0f4a84251d11cf5be0f71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3d387781c0f4a84251d11cf5be0f71");
            return;
        }
        this.b = view;
        this.c = f;
        this.d = f2 - f;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        Object[] objArr = {Float.valueOf(f), transformation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7652b2f5d8e05fcc0d078b7015849db8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7652b2f5d8e05fcc0d078b7015849db8");
        } else {
            this.b.setAlpha(this.c + (this.d * f));
        }
    }
}
