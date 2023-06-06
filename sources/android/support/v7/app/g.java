package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    private static final Class<?>[] a = {Context.class, AttributeSet.class};
    private static final int[] b = {16843375};
    private static final String[] c = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> d = new ArrayMap();
    private final Object[] e = new Object[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(Constants.EventType.VIEW)) {
            str = attributeSet.getAttributeValue(null, CommonConstant.File.CLASS);
        }
        try {
            this.e[0] = context;
            this.e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (int i = 0; i < c.length; i++) {
                    View a2 = a(context, str, c[i]);
                    if (a2 != null) {
                        return a2;
                    }
                }
                return null;
            }
            return a(context, str, (String) null);
        } catch (Exception unused) {
            return null;
        } finally {
            this.e[0] = null;
            this.e[1] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || ViewCompat.hasOnClickListeners(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor<? extends View> constructor = d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(a);
                d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842752, 16842970, R.attr.paddingStart, R.attr.paddingEnd, R.attr.theme}, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(4, 0);
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof android.support.v7.view.d) && ((android.support.v7.view.d) context).a == resourceId) ? context : new android.support.v7.view.d(context, resourceId) : context;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {
        private final View a;
        private final String b;
        private Method c;
        private Context d;

        public a(@NonNull View view, @NonNull String str) {
            this.a = view;
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            int id;
            String str;
            Method method;
            if (this.c == null) {
                Context context = this.a.getContext();
                String str2 = this.b;
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.b, View.class)) != null) {
                            this.c = method;
                            this.d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                if (this.a.getId() == -1) {
                    str = "";
                } else {
                    str = " with id '" + this.a.getContext().getResources().getResourceEntryName(id) + CommonConstant.Symbol.SINGLE_QUOTES;
                }
                throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.a.getClass() + str);
            }
            try {
                this.c.invoke(this.d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }
}
