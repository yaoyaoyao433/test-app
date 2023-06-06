package com.meituan.android.paybase.encrypt;

import android.content.Context;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends i.a {
    public static ChangeQuickRedirect a;
    private final Context b;
    private boolean c;

    public a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6655eafb5cc4027a3064b21e42be3541", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6655eafb5cc4027a3064b21e42be3541");
        } else if (z && context == null) {
            throw new NullPointerException("context == null");
        } else {
            this.b = context;
            this.c = z;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<?, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ar arVar) {
        Object[] objArr = {type, annotationArr, annotationArr2, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a45e8539b28bfbe950f6d8a3a68b7d", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a45e8539b28bfbe950f6d8a3a68b7d") : new C0331a(n.a().getAdapter(TypeToken.get(type)));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.encrypt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0331a<T> implements i<T, ak> {
        public static ChangeQuickRedirect a;
        private static final Charset b = Charset.forName("UTF-8");
        private final TypeAdapter<T> c;

        @Override // com.sankuai.meituan.retrofit2.i
        public final /* synthetic */ ak a(Object obj) throws IOException {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def61a5a80d41faa1d33c9e0202c7b70", RobustBitConfig.DEFAULT_VALUE)) {
                return (ak) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def61a5a80d41faa1d33c9e0202c7b70");
            }
            okio.c cVar = new okio.c();
            JsonWriter newJsonWriter = n.a().newJsonWriter(new OutputStreamWriter(cVar.b(), b));
            this.c.write(newJsonWriter, obj);
            newJsonWriter.close();
            return al.a(cVar.o().i(), "application/json; charset=UTF-8");
        }

        public C0331a(TypeAdapter<T> typeAdapter) {
            Object[] objArr = {typeAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a761bf416160236e42e29de2b0b8aaf3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a761bf416160236e42e29de2b0b8aaf3");
            } else {
                this.c = typeAdapter;
            }
        }
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<ap, ?> a(Type type, Annotation[] annotationArr, ar arVar) {
        String value;
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08fd6832ed17d876df88cc80cd34f6b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08fd6832ed17d876df88cc80cd34f6b3");
        }
        if (annotationArr != null) {
            try {
                if (annotationArr.length > 0) {
                    for (Annotation annotation : annotationArr) {
                        if (annotation instanceof POST) {
                            value = ((POST) annotation).value();
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "EncryptConverterFactory_responseBodyConverter", (Map<String, Object>) null);
            }
        }
        value = "";
        return new c(TypeToken.get(type), value);
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<?, String> b(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee47ba18f0266441606b31e5dbb642b", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee47ba18f0266441606b31e5dbb642b");
        }
        if (this.c && type == String.class) {
            return new d(annotationArr, this.b);
        }
        return null;
    }
}
