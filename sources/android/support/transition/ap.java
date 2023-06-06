package android.support.transition;

import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@RequiresApi(22)
/* loaded from: classes.dex */
public final class ap extends ao {
    private static Method a;
    private static boolean b;

    @Override // android.support.transition.al, android.support.transition.aq
    public final void a(View view, int i, int i2, int i3, int i4) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
