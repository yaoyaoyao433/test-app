package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.http.Streaming;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends i.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<ap, ?> a(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d0826b9abe988f028ff19d0cee2739", 6917529027641081856L)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d0826b9abe988f028ff19d0cee2739");
        }
        if (type == ap.class) {
            if (av.a(annotationArr, Streaming.class)) {
                return C0627c.a;
            }
            return a.b;
        } else if (type == Void.class) {
            return e.b;
        } else {
            return null;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.i.a
    public final i<?, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ar arVar) {
        Object[] objArr = {type, annotationArr, annotationArr2, arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54fd3b942ba2ba6400cb847e88bcb0ae", 6917529027641081856L)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54fd3b942ba2ba6400cb847e88bcb0ae");
        }
        if (ak.class.isAssignableFrom(av.a(type))) {
            return b.a;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class e implements i<ap, Void> {
        public static ChangeQuickRedirect a;
        public static final e b = new e();

        @Override // com.sankuai.meituan.retrofit2.i
        public final /* synthetic */ Void a(ap apVar) throws IOException {
            ap apVar2 = apVar;
            Object[] objArr = {apVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95089bfc049840fb5306ebdb908f7115", 6917529027641081856L)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95089bfc049840fb5306ebdb908f7115");
            }
            apVar2.close();
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class b implements i<ak, ak> {
        public static final b a = new b();

        @Override // com.sankuai.meituan.retrofit2.i
        public final /* bridge */ /* synthetic */ ak a(ak akVar) throws IOException {
            return akVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0627c implements i<ap, ap> {
        public static final C0627c a = new C0627c();

        @Override // com.sankuai.meituan.retrofit2.i
        public final /* bridge */ /* synthetic */ ap a(ap apVar) throws IOException {
            return apVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a implements i<ap, ap> {
        public static ChangeQuickRedirect a;
        public static final a b = new a();

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.sankuai.meituan.retrofit2.i
        public ap a(ap apVar) throws IOException {
            Object[] objArr = {apVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9515c56cde83b436e16d4f8b9473be2a", 6917529027641081856L)) {
                return (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9515c56cde83b436e16d4f8b9473be2a");
            }
            try {
                return av.a(apVar);
            } finally {
                apVar.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class d implements i<Object, String> {
        public static ChangeQuickRedirect a;
        public static final d b = new d();

        @Override // com.sankuai.meituan.retrofit2.i
        public final /* synthetic */ String a(Object obj) throws IOException {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f5fa4169e08591f1f49e48461c3c32e", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f5fa4169e08591f1f49e48461c3c32e") : obj.toString();
        }
    }
}
