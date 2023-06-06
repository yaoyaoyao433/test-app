package com.meituan.android.neohybrid.util.gson;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.neohybrid.neo.report.c;
import com.meituan.android.neohybrid.util.gson.annotation.ArrayCheck;
import com.meituan.android.neohybrid.util.gson.annotation.FailedType;
import com.meituan.android.neohybrid.util.gson.annotation.JsonCheck;
import com.meituan.android.neohybrid.util.gson.annotation.Range;
import com.meituan.android.neohybrid.util.gson.annotation.Regex;
import com.meituan.android.neohybrid.util.gson.annotation.Required;
import com.meituan.android.neohybrid.util.gson.checker.d;
import com.meituan.android.neohybrid.util.gson.checker.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GsonCheckFactory implements TypeAdapterFactory {
    public static ChangeQuickRedirect a;
    private static final Map<Class<? extends Annotation>, com.meituan.android.neohybrid.util.gson.checker.a> b = new LinkedHashMap();

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c601356566e5212d97176a561b454c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c601356566e5212d97176a561b454c0");
        } else if (aVar != null) {
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_warn_parse_sc", aVar.b);
            c.a("horn_parse_warn", aVar.b);
            c.a("horn_parse_warn", "error_parse + " + aVar.a());
        }
    }

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "851b466f5ad246d0082ae16f73980f73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "851b466f5ad246d0082ae16f73980f73");
        } else if (aVar != null) {
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_error_parse_sc", aVar.b);
            c.a("horn_parse_error", aVar.b);
            c.a("horn_parse_error", "error_parse + " + aVar.a());
        }
    }

    public GsonCheckFactory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e29300cfec53b9e444bba6d47a46bdc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e29300cfec53b9e444bba6d47a46bdc8");
            return;
        }
        b.put(Required.class, new e());
        b.put(Range.class, new com.meituan.android.neohybrid.util.gson.checker.c());
        b.put(Regex.class, new d());
        b.put(ArrayCheck.class, new com.meituan.android.neohybrid.util.gson.checker.b());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        private static final GsonCheckFactory a = new GsonCheckFactory();
    }

    public static GsonCheckFactory a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a233f665c2aa7c496d6fbf73c2a6b40", RobustBitConfig.DEFAULT_VALUE) ? (GsonCheckFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a233f665c2aa7c496d6fbf73c2a6b40") : b.a;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Object[] objArr = {gson, typeToken};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec5d7a8de2e4e1b641a2dfdc7351ca6", RobustBitConfig.DEFAULT_VALUE)) {
            return (TypeAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec5d7a8de2e4e1b641a2dfdc7351ca6");
        }
        if (a(typeToken.getType())) {
            final TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, typeToken);
            return new TypeAdapter<T>() { // from class: com.meituan.android.neohybrid.util.gson.GsonCheckFactory.1
                public static ChangeQuickRedirect a;

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t) throws IOException {
                    Object[] objArr2 = {jsonWriter, t};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95acc6f94432a36ab218dfc83535707e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95acc6f94432a36ab218dfc83535707e");
                    } else {
                        delegateAdapter.write(jsonWriter, t);
                    }
                }

                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) throws IOException {
                    Object[] objArr2 = {jsonReader};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe91eb0f5f912336abef34f2468e641f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (T) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe91eb0f5f912336abef34f2468e641f");
                    }
                    T t = (T) delegateAdapter.read(jsonReader);
                    if (t == null) {
                        return null;
                    }
                    FailedType a2 = GsonCheckFactory.a(t.getClass());
                    a b2 = GsonCheckFactory.b(t, a2 == FailedType.FIELD_NULL);
                    if (b2 != null) {
                        if (a2 == FailedType.NULL) {
                            GsonCheckFactory.a(b2);
                            return null;
                        } else if (a2 == FailedType.EXCEPTION) {
                            GsonCheckFactory.b(b2);
                            throw b2;
                        }
                    }
                    return t;
                }
            };
        }
        return null;
    }

    public static FailedType a(Class<?> cls) {
        JsonCheck jsonCheck;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c1ff4c951e59d6a2f40c4eed3337319", RobustBitConfig.DEFAULT_VALUE)) {
            return (FailedType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c1ff4c951e59d6a2f40c4eed3337319");
        }
        if (cls == null || (jsonCheck = (JsonCheck) cls.getAnnotation(JsonCheck.class)) == null) {
            return null;
        }
        return jsonCheck.failedType();
    }

    private static boolean a(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02a6b67a00e0dbe838eb8c4620e4481e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02a6b67a00e0dbe838eb8c4620e4481e")).booleanValue() : com.meituan.android.neohybrid.util.gson.a.a(type).b != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a b(Object obj, boolean z) {
        com.meituan.android.neohybrid.util.gson.checker.a value;
        Object obj2;
        String a2;
        String name;
        char c = 0;
        Object[] objArr = {obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6161f721eb5611b8151eef1d74b67d81", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6161f721eb5611b8151eef1d74b67d81");
        }
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (a((Type) cls)) {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                if (field.getAnnotations().length != 0) {
                    field.setAccessible(true);
                    for (Map.Entry<Class<? extends Annotation>, com.meituan.android.neohybrid.util.gson.checker.a> entry : b.entrySet()) {
                        Annotation annotation = field.getAnnotation(entry.getKey());
                        if (annotation != null && (value = entry.getValue()) != null) {
                            try {
                                obj2 = field.get(obj);
                                a2 = value.a(annotation, obj2);
                            } catch (IllegalAccessException unused) {
                            }
                            if (TextUtils.isEmpty(a2)) {
                                continue;
                            } else {
                                Object[] objArr2 = new Object[1];
                                objArr2[c] = field;
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "34e02db5fcc08c0edb045566aa56110c", RobustBitConfig.DEFAULT_VALUE)) {
                                    name = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "34e02db5fcc08c0edb045566aa56110c");
                                } else if (field == null) {
                                    name = "unknown";
                                } else {
                                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                                    name = serializedName == null ? field.getName() : serializedName.value();
                                }
                                HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.c("error_key", name).a("error_value", String.valueOf(obj2)).a("error_info", a2).b;
                                if (z) {
                                    field.set(obj, null);
                                    com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_warn_parse_sc", hashMap);
                                    c.a("horn_parse_warn", hashMap);
                                    c.a("horn_parse_warn", "error_parse + " + hashMap.toString());
                                    c = 0;
                                } else {
                                    return new a(hashMap);
                                }
                            }
                        }
                    }
                    continue;
                }
                i++;
                c = 0;
            }
            return null;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends RuntimeException {
        public static ChangeQuickRedirect a = null;
        private static final long serialVersionUID = -6873711074762355327L;
        final Map<String, Object> b;

        public a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa1a414b3a7d6b927f069afa52c7111", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa1a414b3a7d6b927f069afa52c7111");
            } else {
                this.b = map;
            }
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da76815f46e8fdf5293c40b02da3bb1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da76815f46e8fdf5293c40b02da3bb1") : this.b == null ? "" : this.b.toString();
        }
    }
}
