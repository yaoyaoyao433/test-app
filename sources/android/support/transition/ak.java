package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ak {
    static final Property<View, Float> a;
    static final Property<View, Rect> b;
    private static final aq c;
    private static Field d;
    private static boolean e;

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            c = new ap();
        } else if (Build.VERSION.SDK_INT >= 21) {
            c = new ao();
        } else if (Build.VERSION.SDK_INT >= 19) {
            c = new an();
        } else if (Build.VERSION.SDK_INT >= 18) {
            c = new am();
        } else {
            c = new al();
        }
        a = new Property<View, Float>(Float.class, "translationAlpha") { // from class: android.support.transition.ak.1
            @Override // android.util.Property
            public final /* synthetic */ Float get(View view) {
                return Float.valueOf(ak.c(view));
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, Float f) {
                ak.a(view, f.floatValue());
            }
        };
        b = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: android.support.transition.ak.2
            @Override // android.util.Property
            public final /* synthetic */ Rect get(View view) {
                return ViewCompat.getClipBounds(view);
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, Rect rect) {
                ViewCompat.setClipBounds(view, rect);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aj a(@NonNull View view) {
        return c.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static at b(@NonNull View view) {
        return c.b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull View view, float f) {
        c.a(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(@NonNull View view) {
        return c.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@NonNull View view) {
        c.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(@NonNull View view) {
        c.e(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull View view, @NonNull Matrix matrix) {
        c.a(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@NonNull View view, @NonNull Matrix matrix) {
        c.b(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull View view, int i, int i2, int i3, int i4) {
        c.a(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@NonNull View view, int i) {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        if (d != null) {
            try {
                d.setInt(view, i | (d.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
