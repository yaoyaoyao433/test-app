package com.facebook.react.uimanager;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.meituan.robust.Constants;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class be {
    private static final Map<Class, Map<String, k>> a = new ConcurrentHashMap();
    private static final Map<String, k> b = new HashMap();

    public static void a() {
        a.clear();
        b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class k {
        protected final String a;
        protected final String b;
        protected final Method c;
        @Nullable
        protected final Integer d;

        @Nullable
        protected abstract Object a(Object obj, Context context);

        private k(ReactProp reactProp, String str, Method method) {
            this.a = reactProp.name();
            this.b = "__default_type__".equals(reactProp.customType()) ? str : reactProp.customType();
            this.c = method;
            this.d = null;
        }

        private k(ReactPropGroup reactPropGroup, String str, Method method, int i) {
            this.a = reactPropGroup.names()[i];
            this.b = "__default_type__".equals(reactPropGroup.customType()) ? str : reactPropGroup.customType();
            this.c = method;
            this.d = Integer.valueOf(i);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final void a(ViewManager viewManager, View view, Object obj) {
            try {
                if (this.d == null) {
                    this.c.invoke(viewManager, view, a(obj, view.getContext()));
                } else {
                    this.c.invoke(viewManager, view, this.d, a(obj, view.getContext()));
                }
            } catch (Throwable th) {
                String simpleName = ViewManager.class.getSimpleName();
                com.facebook.common.logging.a.d(simpleName, "Error while updating prop " + this.a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.a + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        public final void a(af afVar, Object obj) {
            try {
                if (this.d == null) {
                    this.c.invoke(afVar, a(obj, afVar.getThemedContext()));
                } else {
                    this.c.invoke(afVar, this.d, a(obj, afVar.getThemedContext()));
                }
            } catch (Throwable th) {
                String simpleName = ViewManager.class.getSimpleName();
                com.facebook.common.logging.a.d(simpleName, "Error while updating prop " + this.a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.a + "' in shadow node of type: " + afVar.getViewClass(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class g extends k {
        public g(ReactProp reactProp, Method method) {
            super(reactProp, "mixed", method);
        }

        public g(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "mixed", method, i);
        }

        @Override // com.facebook.react.uimanager.be.k
        protected final Object a(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class i extends k {
        private final int e;

        public i(ReactProp reactProp, Method method, int i) {
            super(reactProp, "number", method);
            this.e = i;
        }

        public i(ReactPropGroup reactPropGroup, Method method, int i, int i2) {
            super(reactPropGroup, "number", method, i);
            this.e = i2;
        }

        @Override // com.facebook.react.uimanager.be.k
        protected final Object a(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.e : ((Double) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class f extends k {
        private final double e;

        public f(ReactProp reactProp, Method method, double d) {
            super(reactProp, "number", method);
            this.e = d;
        }

        public f(ReactPropGroup reactPropGroup, Method method, int i, double d) {
            super(reactPropGroup, "number", method, i);
            this.e = d;
        }

        @Override // com.facebook.react.uimanager.be.k
        protected final Object a(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.e : ((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class e extends k {
        private final int e;

        public e(ReactProp reactProp, Method method, int i) {
            super(reactProp, "mixed", method);
            this.e = i;
        }

        @Override // com.facebook.react.uimanager.be.k
        protected final Object a(Object obj, Context context) {
            if (obj == null) {
                return Integer.valueOf(this.e);
            }
            return ColorPropConverter.getColor(obj, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends k {
        private final boolean e;

        public b(ReactProp reactProp, Method method, boolean z) {
            super(reactProp, Constants.BOOLEAN, method);
            this.e = z;
        }

        @Override // com.facebook.react.uimanager.be.k
        protected final Object a(Object obj, Context context) {
            return obj == null ? this.e : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class h extends k {
        private final float e;

        public h(ReactProp reactProp, Method method, float f) {
            super(reactProp, "number", method);
            this.e = f;
        }

        public h(ReactPropGroup reactPropGroup, Method method, int i, float f) {
            super(reactPropGroup, "number", method, i);
            this.e = f;
        }

        @Override // com.facebook.react.uimanager.be.k
        protected final Object a(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.e : ((Double) obj).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends k {
        public a(ReactProp reactProp, Method method) {
            super(reactProp, "Array", method);
        }

        @Override // com.facebook.react.uimanager.be.k
        @Nullable
        protected final Object a(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class j extends k {
        public j(ReactProp reactProp, Method method) {
            super(reactProp, "Map", method);
        }

        @Override // com.facebook.react.uimanager.be.k
        @Nullable
        protected final Object a(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class l extends k {
        public l(ReactProp reactProp, Method method) {
            super(reactProp, "String", method);
        }

        @Override // com.facebook.react.uimanager.be.k
        @Nullable
        protected final Object a(Object obj, Context context) {
            return (String) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c extends k {
        public c(ReactProp reactProp, Method method) {
            super(reactProp, Constants.BOOLEAN, method);
        }

        @Override // com.facebook.react.uimanager.be.k
        @Nullable
        protected final Object a(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d extends k {
        public d(ReactProp reactProp, Method method) {
            super(reactProp, "number", method);
        }

        public d(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "number", method, i);
        }

        @Override // com.facebook.react.uimanager.be.k
        @Nullable
        protected final Object a(Object obj, Context context) {
            if (obj != null) {
                if (obj instanceof Double) {
                    return Integer.valueOf(((Double) obj).intValue());
                }
                return (Integer) obj;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, k> a(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return b;
        }
        Map<String, k> map = a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(a(cls.getSuperclass()));
        a(cls, hashMap);
        a.put(cls, hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, k> b(Class<? extends af> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == af.class) {
                return b;
            }
        }
        Map<String, k> map = a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(b(cls.getSuperclass()));
        b(cls, hashMap);
        a.put(cls, hashMap);
        return hashMap;
    }

    private static k a(ReactProp reactProp, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new g(reactProp, method);
        }
        if (cls == Boolean.TYPE) {
            return new b(reactProp, method, reactProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            if ("Color".equals(reactProp.customType())) {
                return new e(reactProp, method, reactProp.defaultInt());
            }
            return new i(reactProp, method, reactProp.defaultInt());
        } else if (cls == Float.TYPE) {
            return new h(reactProp, method, reactProp.defaultFloat());
        } else {
            if (cls == Double.TYPE) {
                return new f(reactProp, method, reactProp.defaultDouble());
            }
            if (cls == String.class) {
                return new l(reactProp, method);
            }
            if (cls == Boolean.class) {
                return new c(reactProp, method);
            }
            if (cls == Integer.class) {
                if ("Color".equals(reactProp.customType())) {
                    return new e(reactProp, method, reactProp.defaultInt());
                }
                return new d(reactProp, method);
            } else if (cls == ReadableArray.class) {
                return new a(reactProp, method);
            } else {
                if (cls == ReadableMap.class) {
                    return new j(reactProp, method);
                }
                throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
            }
        }
    }

    private static void a(ReactPropGroup reactPropGroup, Method method, Class<?> cls, Map<String, k> map) {
        String[] names = reactPropGroup.names();
        int i2 = 0;
        if (cls == Dynamic.class) {
            while (i2 < names.length) {
                map.put(names[i2], new g(reactPropGroup, method, i2));
                i2++;
            }
        } else if (cls == Integer.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new i(reactPropGroup, method, i2, reactPropGroup.defaultInt()));
                i2++;
            }
        } else if (cls == Float.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new h(reactPropGroup, method, i2, reactPropGroup.defaultFloat()));
                i2++;
            }
        } else if (cls == Double.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new f(reactPropGroup, method, i2, reactPropGroup.defaultDouble()));
                i2++;
            }
        } else if (cls == Integer.class) {
            while (i2 < names.length) {
                map.put(names[i2], new d(reactPropGroup, method, i2));
                i2++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }

    private static void a(Class<? extends ViewManager> cls, Map<String, k> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else {
                    map.put(reactProp.name(), a(reactProp, method, parameterTypes[1]));
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                } else {
                    a(reactPropGroup, method, parameterTypes2[2], map);
                }
            }
        }
    }

    private static void b(Class<? extends af> cls, Map<String, k> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(reactProp.name(), a(reactProp, method, parameterTypes[0]));
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                } else {
                    a(reactPropGroup, method, parameterTypes2[1], map);
                }
            }
        }
    }
}
