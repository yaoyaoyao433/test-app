package com.meituan.android.mrn.knb;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CallbackImpl;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromArray;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.NativeArgumentsParseException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final AbstractC0290a<Boolean> d = new AbstractC0290a<Boolean>() { // from class: com.meituan.android.mrn.knb.a.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ Boolean a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b72cf0bc589213b366a926d7b4b5029", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b72cf0bc589213b366a926d7b4b5029");
            }
            if (readableArray == null) {
                return null;
            }
            return Boolean.valueOf(readableArray.getBoolean(i2));
        }
    };
    private static final AbstractC0290a<Double> e = new AbstractC0290a<Double>() { // from class: com.meituan.android.mrn.knb.a.3
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ Double a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f84ea0ad725bf42827781e7d49022d43", RobustBitConfig.DEFAULT_VALUE)) {
                return (Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f84ea0ad725bf42827781e7d49022d43");
            }
            if (readableArray == null) {
                return null;
            }
            return Double.valueOf(readableArray.getDouble(i2));
        }
    };
    private static final AbstractC0290a<Float> f = new AbstractC0290a<Float>() { // from class: com.meituan.android.mrn.knb.a.4
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ Float a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3092d510419f93e40d80dbdbc8cbf1a9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3092d510419f93e40d80dbdbc8cbf1a9");
            }
            if (readableArray == null) {
                return null;
            }
            return Float.valueOf((float) readableArray.getDouble(i2));
        }
    };
    private static final AbstractC0290a<Integer> g = new AbstractC0290a<Integer>() { // from class: com.meituan.android.mrn.knb.a.5
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ Integer a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b8924ce5d71486c77a6f118b8935693", RobustBitConfig.DEFAULT_VALUE)) {
                return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b8924ce5d71486c77a6f118b8935693");
            }
            if (readableArray == null) {
                return null;
            }
            return Integer.valueOf((int) readableArray.getDouble(i2));
        }
    };
    private static final AbstractC0290a<String> h = new AbstractC0290a<String>() { // from class: com.meituan.android.mrn.knb.a.6
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ String a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa215a9b2259bb1032eeaee82f86fa85", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa215a9b2259bb1032eeaee82f86fa85");
            }
            if (readableArray == null) {
                return null;
            }
            return readableArray.getString(i2);
        }
    };
    private static final AbstractC0290a<ReadableArray> i = new AbstractC0290a<ReadableArray>() { // from class: com.meituan.android.mrn.knb.a.7
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ ReadableArray a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f477a41b5b1e4c4dc6e86ae2ec5d7c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (ReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f477a41b5b1e4c4dc6e86ae2ec5d7c1");
            }
            if (readableArray == null) {
                return null;
            }
            return readableArray.getArray(i2);
        }
    };
    private static final AbstractC0290a<Dynamic> j = new AbstractC0290a<Dynamic>() { // from class: com.meituan.android.mrn.knb.a.8
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ Dynamic a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907d03037d7250a0e370e32f321f0095", RobustBitConfig.DEFAULT_VALUE)) {
                return (Dynamic) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907d03037d7250a0e370e32f321f0095");
            }
            if (readableArray == null) {
                return null;
            }
            return DynamicFromArray.create(readableArray, i2);
        }
    };
    private static final AbstractC0290a<ReadableMap> k = new AbstractC0290a<ReadableMap>() { // from class: com.meituan.android.mrn.knb.a.9
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ ReadableMap a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70898102329dd9c13f35078963ca42cc", RobustBitConfig.DEFAULT_VALUE)) {
                return (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70898102329dd9c13f35078963ca42cc");
            }
            if (readableArray == null) {
                return null;
            }
            return readableArray.getMap(i2);
        }
    };
    private static final AbstractC0290a<Callback> l = new AbstractC0290a<Callback>() { // from class: com.meituan.android.mrn.knb.a.10
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        @Nullable
        public final /* synthetic */ Callback a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1254a9060ee3bb6939a1fe1784c9799e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Callback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1254a9060ee3bb6939a1fe1784c9799e");
            }
            if (readableArray == null || readableArray.isNull(i2)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i2));
        }
    };
    private static final AbstractC0290a<Promise> m = new AbstractC0290a<Promise>() { // from class: com.meituan.android.mrn.knb.a.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final int a() {
            return 2;
        }

        @Override // com.meituan.android.mrn.knb.a.AbstractC0290a
        public final /* synthetic */ Promise a(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            Object[] objArr = {jSInstance, readableArray, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e22617ee249b4e829a1032f6b2628a88", RobustBitConfig.DEFAULT_VALUE) ? (Promise) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e22617ee249b4e829a1032f6b2628a88") : new PromiseImpl((Callback) a.l.a(jSInstance, readableArray, i2), (Callback) a.l.a(jSInstance, readableArray, i2 + 1));
        }
    };
    private static final boolean n;
    final Method b;
    String c;
    private final Class[] o;
    private final int p;
    private final JavaModuleWrapper q;
    private boolean r;
    @Nullable
    private AbstractC0290a[] s;
    @Nullable
    private String t;
    @Nullable
    private Object[] u;
    @Nullable
    private int v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.knb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0290a<T> {
        public int a() {
            return 1;
        }

        @Nullable
        public abstract T a(JSInstance jSInstance, ReadableArray readableArray, int i);

        public AbstractC0290a() {
        }
    }

    static {
        com.facebook.debug.holder.c.a();
        com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.d;
        n = false;
    }

    private static char a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d86e646f5a6bb89eba8769a16720f71f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Character) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d86e646f5a6bb89eba8769a16720f71f")).charValue();
        }
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : (char) 0;
    }

    public a(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        Object[] objArr = {javaModuleWrapper, method, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44158ce2fef1888b2d9015a9b5d8d077", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44158ce2fef1888b2d9015a9b5d8d077");
            return;
        }
        this.c = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.r = false;
        this.q = javaModuleWrapper;
        this.b = method;
        this.b.setAccessible(true);
        this.o = this.b.getParameterTypes();
        this.p = this.o.length;
        if (z) {
            this.c = BaseJavaModule.METHOD_TYPE_SYNC;
        } else if (this.p <= 0 || this.o[this.p - 1] != Promise.class) {
        } else {
            this.c = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b722567a1c3bf5ebee393e21e155f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b722567a1c3bf5ebee393e21e155f8");
        } else if (this.r) {
        } else {
            com.facebook.systrace.b.a(0L, "processArguments");
            StringBuilder sb = new StringBuilder();
            sb.append(this.q.getName());
            sb.append(CommonConstant.Symbol.DOT);
            sb.append(this.b.getName());
            try {
                this.r = true;
                this.s = a(this.o);
                this.t = a(this.b, this.o, this.c.equals(BaseJavaModule.METHOD_TYPE_SYNC));
                this.u = new Object[this.o.length];
                this.v = d();
            } finally {
                com.facebook.systrace.b.a(0L);
            }
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb54026cd0868ad67b9c98319bfa8e28", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb54026cd0868ad67b9c98319bfa8e28");
        }
        if (!this.r) {
            c();
        }
        return (String) com.facebook.infer.annotation.a.a(this.t);
    }

    private String a(Method method, Class[] clsArr, boolean z) {
        char c;
        char c2;
        Object[] objArr = {method, clsArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf94b48bd4568048d37573e2724cd01", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf94b48bd4568048d37573e2724cd01");
        }
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            Class<?> returnType = method.getReturnType();
            Object[] objArr2 = {returnType};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "38c3e38f2d1db5289579173f3434fb75", RobustBitConfig.DEFAULT_VALUE)) {
                c2 = ((Character) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "38c3e38f2d1db5289579173f3434fb75")).charValue();
            } else {
                char a2 = a(returnType);
                if (a2 != 0) {
                    c2 = a2;
                } else if (returnType == Void.TYPE) {
                    c2 = 'v';
                } else if (returnType == WritableMap.class) {
                    c2 = 'M';
                } else if (returnType != WritableArray.class) {
                    throw new RuntimeException("Got unknown return class: " + returnType.getSimpleName());
                } else {
                    c2 = 'A';
                }
            }
            sb.append(c2);
            sb.append(CommonConstant.Symbol.DOT_CHAR);
        } else {
            sb.append("v.");
        }
        int i2 = 0;
        while (i2 < clsArr.length) {
            Class cls = clsArr[i2];
            if (cls == Promise.class) {
                com.facebook.infer.annotation.a.a(i2 == clsArr.length - 1, "Promise must be used as last parameter only");
            }
            Object[] objArr3 = {cls};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1fe6eaabcac2befb6e6147d93d10686c", RobustBitConfig.DEFAULT_VALUE)) {
                c = ((Character) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1fe6eaabcac2befb6e6147d93d10686c")).charValue();
            } else {
                char a3 = a(cls);
                if (a3 != 0) {
                    c = a3;
                } else if (cls == Callback.class) {
                    c = 'X';
                } else if (cls == Promise.class) {
                    c = 'P';
                } else if (cls == ReadableMap.class) {
                    c = 'M';
                } else if (cls == ReadableArray.class) {
                    c = 'A';
                } else if (cls != Dynamic.class) {
                    throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
                } else {
                    c = 'Y';
                }
            }
            sb.append(c);
            i2++;
        }
        return sb.toString();
    }

    private AbstractC0290a[] a(Class[] clsArr) {
        Object[] objArr = {clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d18d5d56e42be240877614fa23c8532", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractC0290a[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d18d5d56e42be240877614fa23c8532");
        }
        AbstractC0290a[] abstractC0290aArr = new AbstractC0290a[clsArr.length];
        int i2 = 0;
        while (i2 < clsArr.length) {
            Class cls = clsArr[i2];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                abstractC0290aArr[i2] = d;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                abstractC0290aArr[i2] = g;
            } else if (cls == Double.class || cls == Double.TYPE) {
                abstractC0290aArr[i2] = e;
            } else if (cls == Float.class || cls == Float.TYPE) {
                abstractC0290aArr[i2] = f;
            } else if (cls == String.class) {
                abstractC0290aArr[i2] = h;
            } else if (cls == Callback.class) {
                abstractC0290aArr[i2] = l;
            } else if (cls == Promise.class) {
                abstractC0290aArr[i2] = m;
                com.facebook.infer.annotation.a.a(i2 == clsArr.length - 1, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                abstractC0290aArr[i2] = k;
            } else if (cls == ReadableArray.class) {
                abstractC0290aArr[i2] = i;
            } else if (cls == Dynamic.class) {
                abstractC0290aArr[i2] = j;
            } else {
                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
            }
            i2 += abstractC0290aArr[i2].a();
        }
        return abstractC0290aArr;
    }

    private int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86294e16db496e84243b096d654db0f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86294e16db496e84243b096d654db0f5")).intValue();
        }
        int i2 = 0;
        for (AbstractC0290a abstractC0290a : (AbstractC0290a[]) com.facebook.infer.annotation.a.a(this.s)) {
            i2 += abstractC0290a.a();
        }
        return i2;
    }

    public final Object a(JSInstance jSInstance, ReadableArray readableArray) {
        long j2;
        String str;
        StringBuilder sb;
        Object[] objArr = {jSInstance, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a08a2537d9aff351560f06d336f16db", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a08a2537d9aff351560f06d336f16db");
        }
        String str2 = this.q.getName() + CommonConstant.Symbol.DOT + this.b.getName();
        com.facebook.systrace.b.a(0L, "callJavaModuleMethod");
        if (n) {
            com.facebook.debug.holder.c.a();
            com.facebook.debug.debugoverlay.model.a aVar = com.facebook.debug.tags.a.d;
            Object[] objArr2 = {this.q.getName(), this.b.getName()};
        }
        try {
            if (!this.r) {
                c();
            }
            try {
                if (this.u == null || this.s == null) {
                    throw new Error("processArguments failed");
                }
                if (this.v != readableArray.size()) {
                    throw new NativeArgumentsParseException(str2 + " got " + readableArray.size() + " arguments, expected " + this.v);
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.s.length; i3++) {
                    try {
                        this.u[i3] = this.s[i3].a(jSInstance, readableArray, i2);
                        i2 += this.s[i3].a();
                    } catch (UnexpectedNativeTypeException e2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e2.getMessage());
                        sb2.append(" (constructing arguments for ");
                        sb2.append(str2);
                        sb2.append(" at argument index ");
                        int a2 = this.s[i3].a();
                        Object[] objArr3 = {Integer.valueOf(i2), Integer.valueOf(a2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "fdd89343c2df0aae4dd405de7e772255", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "fdd89343c2df0aae4dd405de7e772255");
                        } else {
                            if (a2 > 1) {
                                sb = new StringBuilder();
                                sb.append(i2);
                                sb.append(CommonConstant.Symbol.MINUS);
                                sb.append((i2 + a2) - 1);
                            } else {
                                sb = new StringBuilder();
                                sb.append(i2);
                            }
                            str = sb.toString();
                        }
                        sb2.append(str);
                        sb2.append(CommonConstant.Symbol.BRACKET_RIGHT);
                        throw new NativeArgumentsParseException(sb2.toString(), e2);
                    }
                }
                try {
                    Object invoke = this.b.invoke(this.q.getModule(), this.u);
                    com.facebook.systrace.b.a(0L);
                    return invoke;
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException("Could not invoke " + str2, e3);
                } catch (IllegalArgumentException e4) {
                    throw new RuntimeException("Could not invoke " + str2, e4);
                } catch (InvocationTargetException e5) {
                    if (e5.getCause() instanceof RuntimeException) {
                        throw ((RuntimeException) e5.getCause());
                    }
                    throw new RuntimeException("Could not invoke " + str2, e5);
                }
            } catch (Throwable th) {
                th = th;
                j2 = 0;
                com.facebook.systrace.b.a(j2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = 0;
        }
    }
}
