package android.support.v7.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.g;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    public static ColorStateList a(@NonNull Context context, @ColorRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c2 = c(context, i);
        if (c2 == null) {
            return ContextCompat.getColorStateList(context, i);
        }
        synchronized (c) {
            SparseArray<a> sparseArray = b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new a(c2, context.getResources().getConfiguration()));
        }
        return c2;
    }

    @Nullable
    public static Drawable b(@NonNull Context context, @DrawableRes int i) {
        return g.a().a(context, i, false);
    }

    @Nullable
    private static ColorStateList d(@NonNull Context context, @ColorRes int i) {
        a aVar;
        synchronized (c) {
            SparseArray<a> sparseArray = b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.b.equals(context.getResources().getConfiguration())) {
                    return aVar.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        final ColorStateList a;
        final Configuration b;

        a(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    @Nullable
    private static ColorStateList c(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        if ((typedValue.type < 28 || typedValue.type > 31) ? false : false) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return android.support.v7.content.res.a.a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }
}
