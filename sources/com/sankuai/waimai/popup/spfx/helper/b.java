package com.sankuai.waimai.popup.spfx.helper;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Vibrator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.popup.spfx.listener.b;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a implements com.sankuai.waimai.popup.spfx.listener.a, b.a {
    public static ChangeQuickRedirect b;
    private static final float i = Resources.getSystem().getDisplayMetrics().density;
    private View d;
    private boolean e;
    private PropertyValuesHolder f;
    private ObjectAnimator g;
    private com.sankuai.waimai.popup.spfx.a h;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfacca6954738a553f240e3cd5eba9b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfacca6954738a553f240e3cd5eba9b2");
            return;
        }
        this.e = false;
        this.h = new com.sankuai.waimai.popup.spfx.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d63551cd70652f0e37b6f9825a865215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d63551cd70652f0e37b6f9825a865215");
        } else {
            this.f = PropertyValuesHolder.ofKeyframe(View.ROTATION, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, -2.0f), Keyframe.ofFloat(0.2f, 2.0f), Keyframe.ofFloat(0.3f, -2.0f), Keyframe.ofFloat(0.4f, 2.0f), Keyframe.ofFloat(0.5f, -2.0f), Keyframe.ofFloat(0.6f, 2.0f), Keyframe.ofFloat(0.7f, -2.0f), Keyframe.ofFloat(0.8f, 2.0f), Keyframe.ofFloat(0.9f, -2.0f), Keyframe.ofFloat(1.0f, 0.0f));
        }
    }

    public final void a(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319917b1f8e094be2d7522065af9c1fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319917b1f8e094be2d7522065af9c1fb");
            return;
        }
        this.d = view;
        if (view == null) {
            return;
        }
        b(view);
        this.h.a(view.getContext());
        this.h.a(this);
    }

    @Override // com.sankuai.waimai.popup.spfx.listener.b.a
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e8e958865d79ae4e471f06943a9512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e8e958865d79ae4e471f06943a9512");
        } else if (this.d == null) {
        } else {
            b();
            this.e = false;
            View view = this.d;
            Object[] objArr2 = {view, Float.valueOf(f), this};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cf3f418bb0b0d9d2a145b40419ec160", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cf3f418bb0b0d9d2a145b40419ec160");
            } else if (view != null) {
                float f2 = -f;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.ROTATION, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f2), Keyframe.ofFloat(0.2f, f), Keyframe.ofFloat(0.3f, f2), Keyframe.ofFloat(0.4f, f), Keyframe.ofFloat(0.5f, f2), Keyframe.ofFloat(0.6f, f), Keyframe.ofFloat(0.7f, f2), Keyframe.ofFloat(0.8f, f), Keyframe.ofFloat(0.9f, f2), Keyframe.ofFloat(1.0f, 0.0f)), PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, -Math.round(i * 10.0f)), Keyframe.ofFloat(1.0f, 0.0f)));
                ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.popup.spfx.helper.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr3 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "089d2b9156856e431e8ba02f3bc44b9e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "089d2b9156856e431e8ba02f3bc44b9e");
                        } else if (this != null) {
                            this.b(valueAnimator.getAnimatedFraction());
                        }
                    }
                });
                ofPropertyValuesHolder.setDuration(1000L);
                ofPropertyValuesHolder.start();
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b9bc5ce68ac41ca9a96e5c17cd9fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b9bc5ce68ac41ca9a96e5c17cd9fc4");
        } else if (this.g == null || !this.g.isRunning()) {
        } else {
            this.g.cancel();
        }
    }

    private void b(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62418e9c9eb235272d8ed1640dadc37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62418e9c9eb235272d8ed1640dadc37");
            return;
        }
        this.g = ObjectAnimator.ofPropertyValuesHolder(view, this.f);
        this.g.setDuration(1000L);
        this.g.setRepeatCount(-1);
        this.g.start();
    }

    @Override // com.sankuai.waimai.popup.spfx.helper.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b061bb9cec1e7d40908ddf63bd184a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b061bb9cec1e7d40908ddf63bd184a");
        } else {
            this.h.a(this);
        }
    }

    @Override // com.sankuai.waimai.popup.spfx.helper.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e871283c4c8ff5c67592b0d70d0e1d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e871283c4c8ff5c67592b0d70d0e1d3");
            return;
        }
        com.sankuai.waimai.popup.spfx.a aVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.popup.spfx.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "356be005576cfd264dfd0a80637ee168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "356be005576cfd264dfd0a80637ee168");
            return;
        }
        aVar.e = false;
        if (aVar.b == null || aVar.c == null) {
            return;
        }
        aVar.b.unregisterListener(aVar.d, aVar.c);
        aVar.d = null;
        com.sankuai.waimai.foundation.utils.log.a.b("GyroSensorManager", "unregisterListener", new Object[0]);
    }

    @Override // com.sankuai.waimai.popup.spfx.listener.a
    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "983cfa87f03ae70fa24d3638212f10fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "983cfa87f03ae70fa24d3638212f10fc");
        } else if (this.e || f <= 0.3f) {
        } else {
            this.e = true;
            Context context = this.d.getContext();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5625003b6980978e656d094a8b8fee06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5625003b6980978e656d094a8b8fee06");
                return;
            }
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(300L);
            }
        }
    }

    @Override // com.sankuai.waimai.popup.spfx.helper.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ce70a083d963cc31fbe14518055fe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ce70a083d963cc31fbe14518055fe2");
            return;
        }
        super.a();
        com.sankuai.waimai.popup.spfx.a aVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.popup.spfx.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "71ad29ec6127340e6b2a32ed29461c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "71ad29ec6127340e6b2a32ed29461c1d");
        } else {
            if (aVar.b != null && aVar.c != null) {
                aVar.b.unregisterListener(aVar.d, aVar.c);
                com.sankuai.waimai.foundation.utils.log.a.b("ShakeSensorManager", "unregisterListener", new Object[0]);
            }
            aVar.c = null;
            aVar.d = null;
            aVar.b = null;
        }
        b();
    }
}
