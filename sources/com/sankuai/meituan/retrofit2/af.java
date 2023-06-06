package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.entity.mime.MIME;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class af<T> {
    public static ChangeQuickRedirect a;

    public abstract void a(am amVar, T t) throws IOException;

    public final af<Iterable<T>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17fbe4c9f78787513fe9e4eb2858a77d", 6917529027641081856L) ? (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17fbe4c9f78787513fe9e4eb2858a77d") : new af<Iterable<T>>() { // from class: com.sankuai.meituan.retrofit2.af.1
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.meituan.retrofit2.af
            public final /* synthetic */ void a(am amVar, Object obj) throws IOException {
                Iterable<T> iterable = (Iterable) obj;
                Object[] objArr2 = {amVar, iterable};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab80a292fa8239e5319e98dceaf0587a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab80a292fa8239e5319e98dceaf0587a");
                } else if (iterable != null) {
                    for (T t : iterable) {
                        af.this.a(amVar, t);
                    }
                }
            }
        };
    }

    public final af<Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9484e00dbc939ca9f2b4c41910ce337e", 6917529027641081856L) ? (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9484e00dbc939ca9f2b4c41910ce337e") : new af<Object>() { // from class: com.sankuai.meituan.retrofit2.af.2
            public static ChangeQuickRedirect b;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.sankuai.meituan.retrofit2.af
            public final void a(am amVar, Object obj) throws IOException {
                Object[] objArr2 = {amVar, obj};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ddc31fca0cb94c5e520368dee44a627", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ddc31fca0cb94c5e520368dee44a627");
                } else if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        af.this.a(amVar, Array.get(obj, i2));
                    }
                }
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class m extends af<Object> {
        public static ChangeQuickRedirect b;

        @Override // com.sankuai.meituan.retrofit2.af
        public final void a(am amVar, Object obj) {
            Object[] objArr = {amVar, obj};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc579d7f399a438d974dd7df0b1eb124", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc579d7f399a438d974dd7df0b1eb124");
                return;
            }
            Object[] objArr2 = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = am.a;
            if (PatchProxy.isSupport(objArr2, amVar, changeQuickRedirect2, false, "b103aab0fa49a73323c9e4edb0e6990a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, amVar, changeQuickRedirect2, false, "b103aab0fa49a73323c9e4edb0e6990a");
            } else if (obj == null) {
                throw new NullPointerException("@Url parameter is null.");
            } else {
                amVar.d = obj.toString();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class d<T> extends af<T> {
        public static ChangeQuickRedirect b;
        private final String c;
        private final com.sankuai.meituan.retrofit2.i<T, String> d;

        public d(String str, com.sankuai.meituan.retrofit2.i<T, String> iVar) {
            Object[] objArr = {str, iVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fcb332b98f9c94c0f46a7b9e1a63eda", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fcb332b98f9c94c0f46a7b9e1a63eda");
                return;
            }
            this.c = (String) av.a(str, "name == null");
            this.d = iVar;
        }

        @Override // com.sankuai.meituan.retrofit2.af
        public final void a(am amVar, T t) throws IOException {
            Object[] objArr = {amVar, t};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0e652195d050d49b1ba3f823f08490", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0e652195d050d49b1ba3f823f08490");
            } else if (t == null) {
            } else {
                amVar.a(this.c, this.d.a(t));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class i<T> extends af<T> {
        public static ChangeQuickRedirect b;
        private final String c;
        private final com.sankuai.meituan.retrofit2.i<T, String> d;
        private final boolean e;

        public i(String str, com.sankuai.meituan.retrofit2.i<T, String> iVar, boolean z) {
            Object[] objArr = {str, iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8546adf10e16f6c79e039ff0569db6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8546adf10e16f6c79e039ff0569db6");
                return;
            }
            this.c = (String) av.a(str, "name == null");
            this.d = iVar;
            this.e = z;
        }

        @Override // com.sankuai.meituan.retrofit2.af
        public final void a(am amVar, T t) throws IOException {
            Object[] objArr = {amVar, t};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fded4ba285be3cb6a2af9acc609f320", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fded4ba285be3cb6a2af9acc609f320");
            } else if (t == null) {
                throw new IllegalArgumentException("Path parameter \"" + this.c + "\" value must not be null.");
            } else {
                String str = this.c;
                String a = this.d.a(t);
                boolean z = this.e;
                Object[] objArr2 = {str, a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = am.a;
                if (PatchProxy.isSupport(objArr2, amVar, changeQuickRedirect2, false, "2e6b6281816e28c8d02d914993184174", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, amVar, changeQuickRedirect2, false, "2e6b6281816e28c8d02d914993184174");
                } else if (amVar.d == null) {
                    throw new AssertionError();
                } else {
                    String str2 = amVar.d;
                    amVar.d = str2.replace(CommonConstant.Symbol.BIG_BRACKET_LEFT + str + CommonConstant.Symbol.BIG_BRACKET_RIGHT, am.a(a, z));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class j<T> extends af<T> {
        public static ChangeQuickRedirect b;
        private final String c;
        private final com.sankuai.meituan.retrofit2.i<T, String> d;
        private final boolean e;

        public j(String str, com.sankuai.meituan.retrofit2.i<T, String> iVar, boolean z) {
            Object[] objArr = {str, iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17dee647c68b934fdf409f0a63a49d0c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17dee647c68b934fdf409f0a63a49d0c");
                return;
            }
            this.c = (String) av.a(str, "name == null");
            this.d = iVar;
            this.e = z;
        }

        @Override // com.sankuai.meituan.retrofit2.af
        public final void a(am amVar, T t) throws IOException {
            Object[] objArr = {amVar, t};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97000d6a6a972bf04e66489fd0154e5d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97000d6a6a972bf04e66489fd0154e5d");
            } else if (t == null) {
            } else {
                amVar.a(this.c, this.d.a(t), this.e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class k<T> extends af<Map<String, T>> {
        public static ChangeQuickRedirect b;
        private final com.sankuai.meituan.retrofit2.i<T, String> c;
        private final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sankuai.meituan.retrofit2.af
        public final /* synthetic */ void a(am amVar, Object obj) throws IOException {
            Object value;
            Map map = (Map) obj;
            Object[] objArr = {amVar, map};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e18661555e36be0e97eccf767c5a4877", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e18661555e36be0e97eccf767c5a4877");
            } else if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null && (value = entry.getValue()) != null) {
                        amVar.a(str, (String) this.c.a(value), this.d);
                    }
                }
            }
        }

        public k(com.sankuai.meituan.retrofit2.i<T, String> iVar, boolean z) {
            Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf886a3d646b69169ec72c8cc9190f99", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf886a3d646b69169ec72c8cc9190f99");
                return;
            }
            this.c = iVar;
            this.d = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class e<T> extends af<Map<String, T>> {
        public static ChangeQuickRedirect b;
        private final com.sankuai.meituan.retrofit2.i<T, String> c;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sankuai.meituan.retrofit2.af
        public final /* synthetic */ void a(am amVar, Object obj) throws IOException {
            Object value;
            Map map = (Map) obj;
            Object[] objArr = {amVar, map};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8603152fbb49b498feb6b54d00025b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8603152fbb49b498feb6b54d00025b");
            } else if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null && (value = entry.getValue()) != null) {
                        amVar.a(str, (String) this.c.a(value));
                    }
                }
            }
        }

        public e(com.sankuai.meituan.retrofit2.i<T, String> iVar) {
            Object[] objArr = {iVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b656e314e05bff580d46581259810dae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b656e314e05bff580d46581259810dae");
            } else {
                this.c = iVar;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class b<T> extends af<T> {
        public static ChangeQuickRedirect b;
        private final String c;
        private final com.sankuai.meituan.retrofit2.i<T, String> d;
        private final boolean e;

        public b(String str, com.sankuai.meituan.retrofit2.i<T, String> iVar, boolean z) {
            Object[] objArr = {str, iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72adce3ce3a39a84bcc064fd8ed1ed04", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72adce3ce3a39a84bcc064fd8ed1ed04");
                return;
            }
            this.c = (String) av.a(str, "name == null");
            this.d = iVar;
            this.e = z;
        }

        @Override // com.sankuai.meituan.retrofit2.af
        public final void a(am amVar, T t) throws IOException {
            Object[] objArr = {amVar, t};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faca9a07917f2cc740e0c19f30dfcf11", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faca9a07917f2cc740e0c19f30dfcf11");
            } else if (t == null) {
            } else {
                amVar.b(this.c, this.d.a(t), this.e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class c<T> extends af<Map<String, T>> {
        public static ChangeQuickRedirect b;
        private final com.sankuai.meituan.retrofit2.i<T, String> c;
        private final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sankuai.meituan.retrofit2.af
        public final /* synthetic */ void a(am amVar, Object obj) throws IOException {
            Object value;
            Map map = (Map) obj;
            Object[] objArr = {amVar, map};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "765e6735e2d16d2fb02abb6798f6f2ce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "765e6735e2d16d2fb02abb6798f6f2ce");
            } else if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null && (value = entry.getValue()) != null) {
                        amVar.b(str, (String) this.c.a(value), this.d);
                    }
                }
            }
        }

        public c(com.sankuai.meituan.retrofit2.i<T, String> iVar, boolean z) {
            Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10772abaf2ffd27c823bc2b8795e9df2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10772abaf2ffd27c823bc2b8795e9df2");
                return;
            }
            this.c = iVar;
            this.d = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class g<T> extends af<T> {
        public static ChangeQuickRedirect b;
        private final r c;
        private final com.sankuai.meituan.retrofit2.i<T, ak> d;

        public g(r rVar, com.sankuai.meituan.retrofit2.i<T, ak> iVar) {
            Object[] objArr = {rVar, iVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037e3cd6f1fbc933d9d2b6b2eb7ff64c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037e3cd6f1fbc933d9d2b6b2eb7ff64c");
                return;
            }
            this.c = rVar;
            this.d = iVar;
        }

        @Override // com.sankuai.meituan.retrofit2.af
        public final void a(am amVar, T t) {
            Object[] objArr = {amVar, t};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbdd539bec956dc182fbc8d9b05fbe2e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbdd539bec956dc182fbc8d9b05fbe2e");
            } else if (t == null) {
            } else {
                try {
                    amVar.a(this.c, this.d.a(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class l extends af<ae.b> {
        public static ChangeQuickRedirect b;
        public static final l c = new l();

        @Override // com.sankuai.meituan.retrofit2.af
        public final /* synthetic */ void a(am amVar, ae.b bVar) throws IOException {
            ae.b bVar2 = bVar;
            Object[] objArr = {amVar, bVar2};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0acdbfa9ab24881e6b3eced54b30c52", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0acdbfa9ab24881e6b3eced54b30c52");
            } else if (bVar2 != null) {
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = am.a;
                if (PatchProxy.isSupport(objArr2, amVar, changeQuickRedirect2, false, "9167e4472aaf012bff1d2dd3bfd5a856", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, amVar, changeQuickRedirect2, false, "9167e4472aaf012bff1d2dd3bfd5a856");
                } else {
                    amVar.l.a(bVar2);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class h<T> extends af<Map<String, T>> {
        public static ChangeQuickRedirect b;
        private final com.sankuai.meituan.retrofit2.i<T, ak> c;
        private final String d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sankuai.meituan.retrofit2.af
        public final /* synthetic */ void a(am amVar, Object obj) throws IOException {
            Object value;
            Map map = (Map) obj;
            Object[] objArr = {amVar, map};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a6f53325455c175ad4dfd37a117912", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a6f53325455c175ad4dfd37a117912");
            } else if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null && (value = entry.getValue()) != null) {
                        HashMap hashMap = new HashMap(2);
                        hashMap.put(MIME.CONTENT_DISPOSITION, "form-data; name=\"" + str + CommonConstant.Symbol.DOUBLE_QUOTES);
                        hashMap.put(MIME.CONTENT_TRANSFER_ENC, this.d);
                        amVar.a(r.a(hashMap), (ak) this.c.a(value));
                    }
                }
            }
        }

        public h(com.sankuai.meituan.retrofit2.i<T, ak> iVar, String str) {
            Object[] objArr = {iVar, str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb90816f9ab48cb38294b43021b1cac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb90816f9ab48cb38294b43021b1cac");
                return;
            }
            this.c = iVar;
            this.d = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a<T> extends af<T> {
        public static ChangeQuickRedirect b;
        private final com.sankuai.meituan.retrofit2.i<T, ak> c;

        public a(com.sankuai.meituan.retrofit2.i<T, ak> iVar) {
            Object[] objArr = {iVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f4b53f831dae96b9220c43dd207867", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f4b53f831dae96b9220c43dd207867");
            } else {
                this.c = iVar;
            }
        }

        @Override // com.sankuai.meituan.retrofit2.af
        public final void a(am amVar, T t) {
            Object[] objArr = {amVar, t};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6195361c913bbec9bb02545754e8674", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6195361c913bbec9bb02545754e8674");
            } else if (t == null) {
            } else {
                try {
                    amVar.n = this.c.a(t);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class f<T> extends af<T> {
        public static ChangeQuickRedirect b;

        @Override // com.sankuai.meituan.retrofit2.af
        public final void a(am amVar, T t) throws IOException {
            Object[] objArr = {amVar, t};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d858632f927dde64a316afdeac21bbb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d858632f927dde64a316afdeac21bbb");
            } else if (t instanceof com.sankuai.meituan.retrofit2.d) {
                amVar.k = new d.a((com.sankuai.meituan.retrofit2.d) t);
            }
        }
    }
}
