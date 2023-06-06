package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.transition.Transition;
import android.support.transition.x;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
/* compiled from: ProGuard */
@RequiresApi(14)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class c extends Transition {
    @Override // android.support.transition.Transition
    public final void a(x xVar) {
        d(xVar);
    }

    @Override // android.support.transition.Transition
    public final void b(x xVar) {
        d(xVar);
    }

    private static void d(x xVar) {
        if (xVar.b instanceof TextView) {
            xVar.a.put("android:textscale:scale", Float.valueOf(((TextView) xVar.b).getScaleX()));
        }
    }

    @Override // android.support.transition.Transition
    public final Animator a(ViewGroup viewGroup, x xVar, x xVar2) {
        if (xVar == null || xVar2 == null || !(xVar.b instanceof TextView) || !(xVar2.b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) xVar2.b;
        Map<String, Object> map = xVar.a;
        Map<String, Object> map2 = xVar2.a;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.internal.c.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
            }
        });
        return ofFloat;
    }
}
