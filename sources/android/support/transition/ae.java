package android.support.transition;

import android.animation.LayoutTransition;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public class ae implements ag {
    private static LayoutTransition a;
    private static Field b;
    private static boolean c;
    private static Method d;
    private static boolean e;

    @Override // android.support.transition.ag
    public void a(@NonNull ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (a == null) {
            LayoutTransition layoutTransition = new LayoutTransition() { // from class: android.support.transition.ae.1
                @Override // android.animation.LayoutTransition
                public final boolean isChangingLayout() {
                    return true;
                }
            };
            a = layoutTransition;
            layoutTransition.setAnimator(2, null);
            a.setAnimator(0, null);
            a.setAnimator(1, null);
            a.setAnimator(3, null);
            a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
            if (layoutTransition2 != null) {
                if (layoutTransition2.isRunning()) {
                    if (!e) {
                        try {
                            Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                            d = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        e = true;
                    }
                    if (d != null) {
                        try {
                            d.invoke(layoutTransition2, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (layoutTransition2 != a) {
                    viewGroup.setTag(R.id.transition_layout_save, layoutTransition2);
                }
            }
            viewGroup.setLayoutTransition(a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            c = true;
        }
        if (b != null) {
            try {
                boolean z3 = b.getBoolean(viewGroup);
                if (z3) {
                    try {
                        b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused4) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused5) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition3 = (LayoutTransition) viewGroup.getTag(R.id.transition_layout_save);
        if (layoutTransition3 != null) {
            viewGroup.setTag(R.id.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition3);
        }
    }

    @Override // android.support.transition.ag
    public ac a(@NonNull ViewGroup viewGroup) {
        return (aa) ah.c(viewGroup);
    }
}
