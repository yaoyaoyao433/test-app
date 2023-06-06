package android.support.v7.app;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    private static Field a;
    private static boolean b;
    private static Class c;
    private static boolean d;
    private static Field e;
    private static boolean f;
    private static Field g;
    private static boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    public static boolean a(@NonNull Resources resources) {
        Map map;
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            b = true;
        }
        if (a != null) {
            try {
                map = (Map) a.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(23)
    public static boolean b(@NonNull Resources resources) {
        Object obj;
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            b = true;
        }
        if (a != null) {
            try {
                obj = a.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            return obj == null && obj != null && a(obj);
        }
        obj = null;
        if (obj == null) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(24)
    public static boolean c(@NonNull Resources resources) {
        Object obj;
        Object obj2;
        if (!h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            h = true;
        }
        if (g == null) {
            return false;
        }
        try {
            obj = g.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            b = true;
        }
        if (a != null) {
            try {
                obj2 = a.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
            return obj2 == null && a(obj2);
        }
        obj2 = null;
        if (obj2 == null) {
        }
    }

    @RequiresApi(16)
    private static boolean a(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        if (c == null) {
            return false;
        }
        if (!f) {
            try {
                Field declaredField = c.getDeclaredField("mUnthemedEntries");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f = true;
        }
        if (e == null) {
            return false;
        }
        try {
            longSparseArray = (LongSparseArray) e.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
            return true;
        }
        return false;
    }
}
