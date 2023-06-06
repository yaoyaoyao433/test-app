package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@RequiresApi(18)
/* loaded from: classes.dex */
public final class af extends ae {
    private static Method a;
    private static boolean b;

    @Override // android.support.transition.ae, android.support.transition.ag
    public final ac a(@NonNull ViewGroup viewGroup) {
        return new ab(viewGroup);
    }

    @Override // android.support.transition.ae, android.support.transition.ag
    public final void a(@NonNull ViewGroup viewGroup, boolean z) {
        if (!b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e2);
            } catch (InvocationTargetException e3) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e3);
            }
        }
    }
}
