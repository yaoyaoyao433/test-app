package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@RequiresApi(19)
/* loaded from: classes.dex */
public class an extends am {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    @Override // android.support.transition.al, android.support.transition.aq
    public final void d(@NonNull View view) {
    }

    @Override // android.support.transition.al, android.support.transition.aq
    public final void e(@NonNull View view) {
    }

    @Override // android.support.transition.al, android.support.transition.aq
    public final void a(@NonNull View view, float f) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(view, Float.valueOf(f));
                return;
            } catch (IllegalAccessException unused) {
                return;
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        view.setAlpha(f);
    }

    @Override // android.support.transition.al, android.support.transition.aq
    public final float c(@NonNull View view) {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            d = true;
        }
        if (c != null) {
            try {
                return ((Float) c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.c(view);
    }
}
