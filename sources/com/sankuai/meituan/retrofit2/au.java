package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.af;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.Origin;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.PartMap;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.meituan.retrofit2.r;
import com.sankuai.meituan.retrofit2.raw.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.entity.mime.MIME;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class au<T> {
    public static ChangeQuickRedirect a;
    public static final Pattern b = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern c = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final a.InterfaceC0637a d;
    public final e<?> e;
    public final i<ap, T> f;
    final t g;
    final String h;
    final String i;
    final r j;
    final ad k;
    final boolean l;
    final boolean m;
    final boolean n;
    final boolean o;
    final boolean p;
    final af<?>[] q;

    public au(a<T> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166ab8d53b7b0f769e854eebfcbd9159", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166ab8d53b7b0f769e854eebfcbd9159");
            return;
        }
        this.d = aVar.b.b;
        this.e = aVar.z;
        this.g = aVar.b.c;
        this.f = aVar.y;
        this.h = aVar.n;
        this.i = aVar.t;
        this.j = aVar.u;
        this.k = aVar.v;
        this.l = aVar.o;
        this.m = aVar.p;
        this.n = aVar.q;
        this.q = aVar.x;
        this.o = aVar.r;
        this.p = aVar.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a<T> {
        public static ChangeQuickRedirect a;
        public final ar b;
        public final Method c;
        public final Annotation[] d;
        public final Annotation[][] e;
        public final Type[] f;
        public Type g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public String n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public String t;
        public r u;
        public ad v;
        public Set<String> w;
        public af<?>[] x;
        public i<ap, T> y;
        public e<?> z;

        public a(ar arVar, Method method) {
            Object[] objArr = {arVar, method};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04217046ebd129c3dd785be1c8a6d99", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04217046ebd129c3dd785be1c8a6d99");
                return;
            }
            this.b = arVar;
            this.c = method;
            this.d = method.getAnnotations();
            this.f = method.getGenericParameterTypes();
            this.e = method.getParameterAnnotations();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e<?> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1660dad2283a19196ac0dad84274285", 6917529027641081856L)) {
                return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1660dad2283a19196ac0dad84274285");
            }
            Type genericReturnType = this.c.getGenericReturnType();
            if (av.d(genericReturnType)) {
                throw a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            }
            if (genericReturnType == Void.TYPE) {
                throw a("Service methods cannot return void.", new Object[0]);
            }
            Annotation[] annotations = this.c.getAnnotations();
            try {
                ar arVar = this.b;
                Object[] objArr2 = {genericReturnType, annotations};
                ChangeQuickRedirect changeQuickRedirect2 = ar.a;
                if (PatchProxy.isSupport(objArr2, arVar, changeQuickRedirect2, false, "df1064c6f101af9a9edc2cb784ff7513", 6917529027641081856L)) {
                    return (e) PatchProxy.accessDispatch(objArr2, arVar, changeQuickRedirect2, false, "df1064c6f101af9a9edc2cb784ff7513");
                }
                Object[] objArr3 = {null, genericReturnType, annotations};
                ChangeQuickRedirect changeQuickRedirect3 = ar.a;
                if (PatchProxy.isSupport(objArr3, arVar, changeQuickRedirect3, false, "aa9ab4370683278dd634e6c15df27f5c", 6917529027641081856L)) {
                    return (e) PatchProxy.accessDispatch(objArr3, arVar, changeQuickRedirect3, false, "aa9ab4370683278dd634e6c15df27f5c");
                }
                av.a(genericReturnType, "returnType == null");
                av.a(annotations, "annotations == null");
                int indexOf = arVar.e.indexOf(null) + 1;
                int size = arVar.e.size();
                for (int i = indexOf; i < size; i++) {
                    e<?> a2 = arVar.e.get(i).a(genericReturnType, annotations, arVar);
                    if (a2 != null) {
                        return a2;
                    }
                }
                StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
                sb.append(genericReturnType);
                sb.append(".\n");
                sb.append("  Tried:");
                int size2 = arVar.e.size();
                while (indexOf < size2) {
                    sb.append("\n   * ");
                    sb.append(arVar.e.get(indexOf).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(sb.toString());
            } catch (RuntimeException e) {
                throw a(e, "Unable to create call adapter for %s", genericReturnType);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(String str, String str2, boolean z) {
            Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae0994860954ecd400e8f31378a7a1fd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae0994860954ecd400e8f31378a7a1fd");
            } else if (this.n != null) {
                throw a("Only one HTTP method is allowed. Found: %s and %s.", this.n, str);
            } else {
                this.n = str;
                this.o = z;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (au.b.matcher(substring).find()) {
                        throw a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.t = str2;
                this.w = au.a(str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public r a(String[] strArr) {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af3a406bf23a4a5f3220120c8e80a14b", 6917529027641081856L)) {
                return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af3a406bf23a4a5f3220120c8e80a14b");
            }
            r.a aVar = new r.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    ad a2 = ad.a(trim);
                    if (a2 == null) {
                        throw a("Malformed content type: %s", trim);
                    }
                    this.v = a2;
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public af<?> a(int i, Type type, Annotation[] annotationArr) {
            Object[] objArr = {Integer.valueOf(i), type, annotationArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a20a3fc85c724506f5bfe6496ac49866", 6917529027641081856L)) {
                return (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a20a3fc85c724506f5bfe6496ac49866");
            }
            af<?> afVar = null;
            for (Annotation annotation : annotationArr) {
                af<?> a2 = a(i, type, annotationArr, annotation);
                if (a2 != null) {
                    if (afVar != null) {
                        throw a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    afVar = a2;
                }
            }
            if (afVar != null) {
                return afVar;
            }
            throw a(i, "No Retrofit annotation found.", new Object[0]);
        }

        private af<?> a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Object[] objArr = {Integer.valueOf(i), type, annotationArr, annotation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9745e33526f885c8747f38f9806ebbae", 6917529027641081856L)) {
                return (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9745e33526f885c8747f38f9806ebbae");
            }
            if (annotation instanceof Url) {
                if (this.m) {
                    throw a(i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.k) {
                    throw a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.l) {
                    throw a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                }
                if (this.t == null) {
                    this.m = true;
                    if (type == t.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new af.m();
                    }
                    throw a(i, "@Url must be HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                }
                throw a(i, "@Url cannot be used with @%s URL", this.n);
            } else if (annotation instanceof Path) {
                if (this.l) {
                    throw a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.m) {
                    throw a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.t != null) {
                    this.k = true;
                    Path path = (Path) annotation;
                    String value = path.value();
                    Object[] objArr2 = {Integer.valueOf(i), value};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f3c6c16e3c8d942a57ce1763f40c075", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f3c6c16e3c8d942a57ce1763f40c075");
                    } else if (!au.c.matcher(value).matches()) {
                        throw a(i, "@Path parameter name must match %s. Found: %s", au.b.pattern(), value);
                    } else {
                        if (!this.w.contains(value)) {
                            throw a(i, "URL \"%s\" does not contain \"{%s}\".", this.t, value);
                        }
                    }
                    return new af.i(value, this.b.a(type, annotationArr), path.encoded());
                }
                throw a(i, "@Path can only be used with relative url on @%s", this.n);
            } else if (annotation instanceof Query) {
                Query query = (Query) annotation;
                String value2 = query.value();
                boolean encoded = query.encoded();
                Class<?> a2 = av.a(type);
                this.l = true;
                if (Iterable.class.isAssignableFrom(a2)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a2.getSimpleName() + " must include generic type (e.g., " + a2.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new af.j(value2, this.b.a(av.a(0, (ParameterizedType) type), annotationArr), encoded).a();
                } else if (a2.isArray()) {
                    return new af.j(value2, this.b.a(au.a(a2.getComponentType()), annotationArr), encoded).b();
                } else {
                    return new af.j(value2, this.b.a(type, annotationArr), encoded);
                }
            } else if (annotation instanceof QueryMap) {
                Class<?> a3 = av.a(type);
                if (!Map.class.isAssignableFrom(a3)) {
                    throw a(i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type a4 = av.a(type, a3, (Class<?>) Map.class);
                if (!(a4 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) a4;
                Type a5 = av.a(0, parameterizedType);
                if (String.class != a5) {
                    throw a(i, "@QueryMap keys must be of type String: " + a5, new Object[0]);
                }
                return new af.k(this.b.a(av.a(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
            } else if (annotation instanceof Header) {
                String value3 = ((Header) annotation).value();
                Class<?> a6 = av.a(type);
                if (Iterable.class.isAssignableFrom(a6)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a6.getSimpleName() + " must include generic type (e.g., " + a6.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new af.d(value3, this.b.a(av.a(0, (ParameterizedType) type), annotationArr)).a();
                } else if (a6.isArray()) {
                    return new af.d(value3, this.b.a(au.a(a6.getComponentType()), annotationArr)).b();
                } else {
                    return new af.d(value3, this.b.a(type, annotationArr));
                }
            } else if (annotation instanceof HeaderMap) {
                Class<?> a7 = av.a(type);
                if (!Map.class.isAssignableFrom(a7)) {
                    throw a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type a8 = av.a(type, a7, (Class<?>) Map.class);
                if (!(a8 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) a8;
                Type a9 = av.a(0, parameterizedType2);
                if (String.class != a9) {
                    throw a(i, "@HeaderMap keys must be of type String: " + a9, new Object[0]);
                }
                return new af.e(this.b.a(av.a(1, parameterizedType2), annotationArr));
            } else if (annotation instanceof Field) {
                if (!this.p) {
                    throw a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Field field = (Field) annotation;
                String value4 = field.value();
                boolean encoded2 = field.encoded();
                this.h = true;
                Class<?> a10 = av.a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a10.getSimpleName() + " must include generic type (e.g., " + a10.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new af.b(value4, this.b.a(av.a(0, (ParameterizedType) type), annotationArr), encoded2).a();
                } else if (a10.isArray()) {
                    return new af.b(value4, this.b.a(au.a(a10.getComponentType()), annotationArr), encoded2).b();
                } else {
                    return new af.b(value4, this.b.a(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof FieldMap) {
                if (!this.p) {
                    throw a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> a11 = av.a(type);
                if (!Map.class.isAssignableFrom(a11)) {
                    throw a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type a12 = av.a(type, a11, (Class<?>) Map.class);
                if (!(a12 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) a12;
                Type a13 = av.a(0, parameterizedType3);
                if (String.class != a13) {
                    throw a(i, "@FieldMap keys must be of type String: " + a13, new Object[0]);
                }
                i<T, String> a14 = this.b.a(av.a(1, parameterizedType3), annotationArr);
                this.h = true;
                return new af.c(a14, ((FieldMap) annotation).encoded());
            } else if (annotation instanceof Part) {
                if (!this.q) {
                    throw a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                Part part = (Part) annotation;
                this.i = true;
                String value5 = part.value();
                Class<?> a15 = av.a(type);
                if (value5.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(a15)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw a(i, a15.getSimpleName() + " must include generic type (e.g., " + a15.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!ae.b.class.isAssignableFrom(av.a(av.a(0, (ParameterizedType) type)))) {
                            throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else {
                            return af.l.c.a();
                        }
                    } else if (a15.isArray()) {
                        if (!ae.b.class.isAssignableFrom(a15.getComponentType())) {
                            throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return af.l.c.b();
                    } else if (ae.b.class.isAssignableFrom(a15)) {
                        return af.l.c;
                    } else {
                        throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                }
                HashMap hashMap = new HashMap(2);
                hashMap.put(MIME.CONTENT_DISPOSITION, "form-data; name=\"" + value5 + CommonConstant.Symbol.DOUBLE_QUOTES);
                hashMap.put(MIME.CONTENT_TRANSFER_ENC, part.encoding());
                r a16 = r.a(hashMap);
                if (Iterable.class.isAssignableFrom(a15)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a15.getSimpleName() + " must include generic type (e.g., " + a15.getSimpleName() + "<String>)", new Object[0]);
                    }
                    Type a17 = av.a(0, (ParameterizedType) type);
                    if (ae.b.class.isAssignableFrom(av.a(a17))) {
                        throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new af.g(a16, this.b.a(a17, annotationArr, this.d)).a();
                } else if (a15.isArray()) {
                    Class<?> a18 = au.a(a15.getComponentType());
                    if (ae.b.class.isAssignableFrom(a18)) {
                        throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new af.g(a16, this.b.a(a18, annotationArr, this.d)).b();
                } else if (ae.b.class.isAssignableFrom(a15)) {
                    throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                } else {
                    return new af.g(a16, this.b.a(type, annotationArr, this.d));
                }
            } else if (annotation instanceof PartMap) {
                if (!this.q) {
                    throw a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.i = true;
                Class<?> a19 = av.a(type);
                if (!Map.class.isAssignableFrom(a19)) {
                    throw a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type a20 = av.a(type, a19, (Class<?>) Map.class);
                if (!(a20 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) a20;
                Type a21 = av.a(0, parameterizedType4);
                if (String.class != a21) {
                    throw a(i, "@PartMap keys must be of type String: " + a21, new Object[0]);
                }
                Type a22 = av.a(1, parameterizedType4);
                if (ae.b.class.isAssignableFrom(av.a(a22))) {
                    throw a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                }
                return new af.h(this.b.a(a22, annotationArr, this.d), ((PartMap) annotation).encoding());
            } else if (annotation instanceof Body) {
                if (this.p || this.q) {
                    throw a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.j) {
                    throw a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    i<T, ak> a23 = this.b.a(type, annotationArr, this.d);
                    this.j = true;
                    return new af.a(a23);
                } catch (RuntimeException e) {
                    Object[] objArr3 = {type};
                    Object[] objArr4 = {e, Integer.valueOf(i), "Unable to create @Body converter for %s", objArr3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "cc638baeabc2536361f7a4ec30b4845b", 6917529027641081856L)) {
                        throw ((RuntimeException) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "cc638baeabc2536361f7a4ec30b4845b"));
                    }
                    throw a(e, "Unable to create @Body converter for %s (parameter #" + (1 + i) + CommonConstant.Symbol.BRACKET_RIGHT, objArr3);
                }
            } else if (annotation instanceof Origin) {
                return new af.f();
            } else {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public i<ap, T> b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "031b0f8348d4dfe46b7088d495a1cbb0", 6917529027641081856L)) {
                return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "031b0f8348d4dfe46b7088d495a1cbb0");
            }
            Annotation[] annotations = this.c.getAnnotations();
            try {
                ar arVar = this.b;
                Type type = this.g;
                Object[] objArr2 = {type, annotations};
                ChangeQuickRedirect changeQuickRedirect2 = ar.a;
                if (PatchProxy.isSupport(objArr2, arVar, changeQuickRedirect2, false, "a37762093f4391ef4bd2176b00430987", 6917529027641081856L)) {
                    return (i) PatchProxy.accessDispatch(objArr2, arVar, changeQuickRedirect2, false, "a37762093f4391ef4bd2176b00430987");
                }
                Object[] objArr3 = {null, type, annotations};
                ChangeQuickRedirect changeQuickRedirect3 = ar.a;
                if (PatchProxy.isSupport(objArr3, arVar, changeQuickRedirect3, false, "9b1b1b61a21433535390c72b6fe0b7b4", 6917529027641081856L)) {
                    return (i) PatchProxy.accessDispatch(objArr3, arVar, changeQuickRedirect3, false, "9b1b1b61a21433535390c72b6fe0b7b4");
                }
                av.a(type, "type == null");
                av.a(annotations, "annotations == null");
                int indexOf = arVar.d.indexOf(null) + 1;
                int size = arVar.d.size();
                for (int i = indexOf; i < size; i++) {
                    i<ap, T> iVar = (i<ap, T>) arVar.d.get(i).a(type, annotations, arVar);
                    if (iVar != null) {
                        return iVar;
                    }
                }
                StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
                sb.append(type);
                sb.append(".\n");
                sb.append("  Tried:");
                int size2 = arVar.d.size();
                while (indexOf < size2) {
                    sb.append("\n   * ");
                    sb.append(arVar.d.get(indexOf).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(sb.toString());
            } catch (RuntimeException e) {
                throw a(e, "Unable to create converter for %s", this.g);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RuntimeException a(String str, Object... objArr) {
            Object[] objArr2 = {str, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "44dc04429aa2e12f67f8b56652ebd83e", 6917529027641081856L) ? (RuntimeException) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "44dc04429aa2e12f67f8b56652ebd83e") : a((Throwable) null, str, objArr);
        }

        private RuntimeException a(Throwable th, String str, Object... objArr) {
            Object[] objArr2 = {th, str, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "8171dfff01361274a4ce470c05a54645", 6917529027641081856L)) {
                return (RuntimeException) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "8171dfff01361274a4ce470c05a54645");
            }
            String format = String.format(str, objArr);
            return new IllegalArgumentException(format + "\n    for method " + this.c.getDeclaringClass().getSimpleName() + CommonConstant.Symbol.DOT + this.c.getName(), th);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RuntimeException a(int i, String str, Object... objArr) {
            Object[] objArr2 = {Integer.valueOf(i), str, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "ad5b68c56c1154d083f00f9fdd18a2ca", 6917529027641081856L)) {
                return (RuntimeException) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "ad5b68c56c1154d083f00f9fdd18a2ca");
            }
            return a(str + " (parameter #" + (i + 1) + CommonConstant.Symbol.BRACKET_RIGHT, objArr);
        }
    }

    public static Set<String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24b807579a36ea4d931b0730a5364b3b", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24b807579a36ea4d931b0730a5364b3b");
        }
        Matcher matcher = b.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    public static Class<?> a(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d676a864d56b988e445995d6a5d1f11", 6917529027641081856L) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d676a864d56b988e445995d6a5d1f11") : Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }
}
