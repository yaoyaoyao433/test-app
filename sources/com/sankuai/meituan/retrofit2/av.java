package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class av {
    public static ChangeQuickRedirect a;
    public static final Type[] b = new Type[0];

    public static boolean a(int i) {
        return i >= 200 && i < 300;
    }

    public static <T> List<T> a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9da5c50b1154aaa4588ad397b62f68c", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9da5c50b1154aaa4588ad397b62f68c") : Collections.unmodifiableList(new ArrayList(list));
    }

    public static void a(long j, long j2, long j3) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "790128366edfd9d195b25e297fb0f1a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "790128366edfd9d195b25e297fb0f1a9");
        } else if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static Class<?> a(Type type) {
        while (true) {
            Object[] objArr = {type};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d71c2b99722b93df3126623ebe09d5e6", 6917529027641081856L)) {
                return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d71c2b99722b93df3126623ebe09d5e6");
            }
            if (type == null) {
                throw new NullPointerException("type == null");
            }
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (!(rawType instanceof Class)) {
                    throw new IllegalArgumentException();
                }
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
                }
            }
        }
    }

    public static boolean a(Type type, Type type2) {
        boolean z;
        Type type3 = type;
        Type type4 = type2;
        while (true) {
            Object[] objArr = {type3, type4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e43a78413c82ea373b5c77811ea4e330", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e43a78413c82ea373b5c77811ea4e330")).booleanValue();
            }
            if (type3 == type4) {
                return true;
            }
            if (type3 instanceof Class) {
                return type3.equals(type4);
            }
            if (type3 instanceof ParameterizedType) {
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    ParameterizedType parameterizedType2 = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type ownerType2 = parameterizedType2.getOwnerType();
                    Object[] objArr2 = {ownerType, ownerType2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ba10ffe084fc4c69250ea0d9864ed73b", 6917529027641081856L)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ba10ffe084fc4c69250ea0d9864ed73b")).booleanValue();
                    } else {
                        z = ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2));
                    }
                    return z && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
                }
                return false;
            } else if (type3 instanceof GenericArrayType) {
                if (!(type4 instanceof GenericArrayType)) {
                    return false;
                }
                type3 = ((GenericArrayType) type3).getGenericComponentType();
                type4 = ((GenericArrayType) type4).getGenericComponentType();
            } else if (type3 instanceof WildcardType) {
                if (type4 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type3;
                    WildcardType wildcardType2 = (WildcardType) type4;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                return false;
            } else if ((type3 instanceof TypeVariable) && (type4 instanceof TypeVariable)) {
                TypeVariable typeVariable = (TypeVariable) type3;
                TypeVariable typeVariable2 = (TypeVariable) type4;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            } else {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type b(java.lang.reflect.Type r13, java.lang.Class<?> r14, java.lang.Class<?> r15) {
        /*
        L0:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.retrofit2.av.a
            java.lang.String r11 = "4fa6375b2fcd2be75c04db76907bb80d"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            r13 = 0
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r13, r10, r9, r11)
            java.lang.reflect.Type r13 = (java.lang.reflect.Type) r13
            return r13
        L25:
            if (r15 != r14) goto L28
            return r13
        L28:
            boolean r13 = r15.isInterface()
            if (r13 == 0) goto L57
            java.lang.Class[] r13 = r14.getInterfaces()
            int r0 = r13.length
        L33:
            if (r8 >= r0) goto L57
            r1 = r13[r8]
            if (r1 != r15) goto L40
            java.lang.reflect.Type[] r13 = r14.getGenericInterfaces()
            r13 = r13[r8]
            return r13
        L40:
            r1 = r13[r8]
            boolean r1 = r15.isAssignableFrom(r1)
            if (r1 == 0) goto L54
            java.lang.reflect.Type[] r14 = r14.getGenericInterfaces()
            r14 = r14[r8]
            r13 = r13[r8]
        L50:
            r12 = r14
            r14 = r13
            r13 = r12
            goto L0
        L54:
            int r8 = r8 + 1
            goto L33
        L57:
            boolean r13 = r14.isInterface()
            if (r13 != 0) goto L79
        L5d:
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            if (r14 == r13) goto L79
            java.lang.Class r13 = r14.getSuperclass()
            if (r13 != r15) goto L6c
            java.lang.reflect.Type r13 = r14.getGenericSuperclass()
            return r13
        L6c:
            boolean r0 = r15.isAssignableFrom(r13)
            if (r0 == 0) goto L77
            java.lang.reflect.Type r14 = r14.getGenericSuperclass()
            goto L50
        L77:
            r14 = r13
            goto L5d
        L79:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.retrofit2.av.b(java.lang.reflect.Type, java.lang.Class, java.lang.Class):java.lang.reflect.Type");
    }

    public static int a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fdf88a690d14c498be28e2abc472c3d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fdf88a690d14c498be28e2abc472c3d")).intValue();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static String b(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a764e2a4fc4bcb14d48b1e2dfae2a30b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a764e2a4fc4bcb14d48b1e2dfae2a30b") : type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type a(Type type, Class<?> cls, Class<?> cls2) {
        Object[] objArr = {type, cls, cls2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5716bc26d968ebf970435a7b0bad8035", 6917529027641081856L)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5716bc26d968ebf970435a7b0bad8035");
        }
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return a(type, cls, b(type, cls, cls2));
    }

    private static Type a(Type type, Class<?> cls, Type type2) {
        Class cls2;
        Type type3;
        int i;
        Object[] objArr = {type, cls, type2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc5fdc0edc0a579814f4fd4b78fe02c1", 6917529027641081856L)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc5fdc0edc0a579814f4fd4b78fe02c1");
        }
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Object[] objArr2 = {type, cls, typeVariable};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4dc24b462db60a0dff41a16dacca77f3", 6917529027641081856L)) {
                type3 = (Type) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4dc24b462db60a0dff41a16dacca77f3");
            } else {
                Object[] objArr3 = {typeVariable};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d972f0620b6f99e80fa1e9cab9eea89e", 6917529027641081856L)) {
                    cls2 = (Class) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d972f0620b6f99e80fa1e9cab9eea89e");
                } else {
                    GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                    cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                }
                if (cls2 != null) {
                    Type b2 = b(type, cls, cls2);
                    if (b2 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        Object[] objArr4 = {typeParameters, typeVariable};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0b10a0245be3d450e8773c3d32799911", 6917529027641081856L)) {
                            for (int i2 = 0; i2 < typeParameters.length; i2++) {
                                if (typeVariable.equals(typeParameters[i2])) {
                                    i = i2;
                                }
                            }
                            throw new NoSuchElementException();
                        }
                        i = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0b10a0245be3d450e8773c3d32799911")).intValue();
                        type3 = ((ParameterizedType) b2).getActualTypeArguments()[i];
                    }
                }
                type3 = typeVariable;
            }
            if (type3 == typeVariable) {
                return type3;
            }
            type4 = type3;
        }
        if (type4 instanceof Class) {
            Class cls3 = (Class) type4;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type a2 = a(type, cls, (Type) componentType);
                return componentType == a2 ? cls3 : new a(a2);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type a3 = a(type, cls, genericComponentType);
            return genericComponentType == a3 ? genericArrayType : new a(a3);
        } else if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type a4 = a(type, cls, ownerType);
            boolean z = a4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i3 = 0; i3 < length; i3++) {
                Type a5 = a(type, cls, actualTypeArguments[i3]);
                if (a5 != actualTypeArguments[i3]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i3] = a5;
                }
            }
            return z ? new b(a4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        } else if (type4 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type a6 = a(type, cls, lowerBounds[0]);
                if (a6 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{a6});
                }
            } else if (upperBounds.length == 1) {
                Type a7 = a(type, cls, upperBounds[0]);
                if (a7 != upperBounds[0]) {
                    return new c(new Type[]{a7}, b);
                }
            }
            return wildcardType;
        } else {
            return type4;
        }
    }

    public static void c(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddee61f25cd1144e27ffba983c3b635b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddee61f25cd1144e27ffba983c3b635b");
        } else if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T a(T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0764e23725f7ae5bff6a66fb7c0036e", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0764e23725f7ae5bff6a66fb7c0036e");
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        Object[] objArr = {annotationArr, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e07c40bc328cf3b3ab79b1316ef1357c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e07c40bc328cf3b3ab79b1316ef1357c")).booleanValue();
        }
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static ap a(ap apVar) throws IOException {
        Object[] objArr = {apVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6ce0226b0e24c0d3870c2a169b77ed4", 6917529027641081856L)) {
            return (ap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6ce0226b0e24c0d3870c2a169b77ed4");
        }
        InputStream source = apVar.source();
        try {
            return ap.create(apVar.contentType(), apVar.contentLength(), source);
        } finally {
            try {
                source.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static <T> void a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58c5723d59d539112bf231d32e979d53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58c5723d59d539112bf231d32e979d53");
        } else if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else {
            if (cls.getInterfaces().length > 0) {
                throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
            }
        }
    }

    public static Type a(int i, ParameterizedType parameterizedType) {
        Object[] objArr = {Integer.valueOf(i), parameterizedType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "863375d1b19e9ef1a636555470c1c2e3", 6917529027641081856L)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "863375d1b19e9ef1a636555470c1c2e3");
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    public static boolean d(Type type) {
        while (true) {
            Object[] objArr = {type};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cca806725a08ad845e40539d2cd108b", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cca806725a08ad845e40539d2cd108b")).booleanValue();
            }
            if (type instanceof Class) {
                return false;
            }
            if (type instanceof ParameterizedType) {
                for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (d(type2)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            } else {
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? StringUtil.NULL : type.getClass().getName()));
            }
        }
    }

    public static Type e(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b11a76feef7d0641a16d4988fa972b6", 6917529027641081856L)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b11a76feef7d0641a16d4988fa972b6");
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        return a(0, (ParameterizedType) type);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b implements ParameterizedType {
        public static ChangeQuickRedirect a;
        private final Type b;
        private final Type c;
        private final Type[] d;

        public b(Type type, Type type2, Type... typeArr) {
            Type[] typeArr2;
            Object[] objArr = {type, type2, typeArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637e4a0741182be2cfc4fedf8283bcfb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637e4a0741182be2cfc4fedf8283bcfb");
                return;
            }
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            this.b = type;
            this.c = type2;
            this.d = (Type[]) typeArr.clone();
            for (Type type3 : this.d) {
                if (type3 == null) {
                    throw new NullPointerException();
                }
                av.c(type3);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d54fc495caf56bf215e268c81a9b3f", 6917529027641081856L) ? (Type[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d54fc495caf56bf215e268c81a9b3f") : (Type[]) this.d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b0b15f82ce4c007052b5aecfafb1fd", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b0b15f82ce4c007052b5aecfafb1fd")).booleanValue() : (obj instanceof ParameterizedType) && av.a(this, (ParameterizedType) obj);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef4877ee519daad99c731be1758f41cf", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef4877ee519daad99c731be1758f41cf")).intValue() : (Arrays.hashCode(this.d) ^ this.c.hashCode()) ^ av.a((Object) this.b);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "144ad781397d454319ae7d53a537709e", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "144ad781397d454319ae7d53a537709e");
            }
            StringBuilder sb = new StringBuilder((this.d.length + 1) * 30);
            sb.append(av.b(this.c));
            if (this.d.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(av.b(this.d[0]));
            for (int i = 1; i < this.d.length; i++) {
                sb.append(", ");
                sb.append(av.b(this.d[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a implements GenericArrayType {
        public static ChangeQuickRedirect a;
        private final Type b;

        public a(Type type) {
            Object[] objArr = {type};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcb5774e1687738e07474c4d07123be", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcb5774e1687738e07474c4d07123be");
            } else {
                this.b = type;
            }
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e4b414cbc1af052574ac572e8a8132", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e4b414cbc1af052574ac572e8a8132")).booleanValue() : (obj instanceof GenericArrayType) && av.a(this, (GenericArrayType) obj);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ec90e137e1ec129d029ecc6feecc62", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ec90e137e1ec129d029ecc6feecc62")).intValue() : this.b.hashCode();
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586f49f392c2df942c893acf670d9a0f", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586f49f392c2df942c893acf670d9a0f");
            }
            return av.b(this.b) + "[]";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class c implements WildcardType {
        public static ChangeQuickRedirect a;
        private final Type b;
        private final Type c;

        public c(Type[] typeArr, Type[] typeArr2) {
            Object[] objArr = {typeArr, typeArr2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "790fff49684eaada8db7540226478c7b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "790fff49684eaada8db7540226478c7b");
            } else if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else {
                if (typeArr2.length == 1) {
                    if (typeArr2[0] == null) {
                        throw new NullPointerException();
                    }
                    av.c(typeArr2[0]);
                    if (typeArr[0] != Object.class) {
                        throw new IllegalArgumentException();
                    }
                    this.c = typeArr2[0];
                    this.b = Object.class;
                } else if (typeArr[0] == null) {
                    throw new NullPointerException();
                } else {
                    av.c(typeArr[0]);
                    this.c = null;
                    this.b = typeArr[0];
                }
            }
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.b};
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            return this.c != null ? new Type[]{this.c} : av.b;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b756a509fe1cd0155909b28d153b6fef", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b756a509fe1cd0155909b28d153b6fef")).booleanValue() : (obj instanceof WildcardType) && av.a(this, (WildcardType) obj);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff56ae0e499d274638a42f3cc2e470b", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff56ae0e499d274638a42f3cc2e470b")).intValue();
            }
            return (this.c != null ? this.c.hashCode() + 31 : 1) ^ (this.b.hashCode() + 31);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e83a4c179f8d4853f146226e0d02379", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e83a4c179f8d4853f146226e0d02379");
            }
            if (this.c != null) {
                return "? super " + av.b(this.c);
            } else if (this.b == Object.class) {
                return CommonConstant.Symbol.QUESTION_MARK;
            } else {
                return "? extends " + av.b(this.b);
            }
        }
    }
}
