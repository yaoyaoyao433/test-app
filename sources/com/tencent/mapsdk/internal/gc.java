package com.tencent.mapsdk.internal;

import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.meituan.robust.common.StringUtil;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.json.JsonUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gc {
    private static final String h = "stData";
    public int a;
    public List<gs> b;
    String c;
    String d;
    String e;
    File f;
    volatile boolean g;
    private String i;
    private File j;
    private boolean k;
    private d l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a<T> {
        void a(T t);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum b {
        START,
        PROCESSING,
        END,
        CANCEL
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum c {
        CREATE,
        READ,
        UPLOAD,
        UPLOAD_END,
        WRITE,
        TRANSLATE_BYTE
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface d {
        void a();
    }

    public gc(bn bnVar) {
        this(bnVar, (byte) 0);
    }

    private gc(bn bnVar, byte b2) {
        this.k = true;
        this.b = new ArrayList();
        this.c = bnVar.u().a;
        this.d = "";
        this.e = "";
        if (bnVar.a != null) {
            this.d = bnVar.a.getSubKey();
            this.e = bnVar.a.getSubId();
        }
        this.i = bnVar.getContext().getFilesDir().getAbsolutePath() + File.separator + "stData_" + Util.getMD5String(this.c);
        kc.a(this.i);
        this.f = new File(this.i);
        this.j = new File(this.i + ".temp");
    }

    private String a() {
        return this.i;
    }

    private void a(d dVar) {
        this.l = dVar;
    }

    public final void a(Runnable runnable) {
        if (this.g) {
            return;
        }
        if (this.k) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.gc$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements Runnable {
        final /* synthetic */ a a;

        public AnonymousClass1(a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e a = e.a(c.READ);
            a.a = b.START;
            a.e = gc.this.f;
            if (!gc.this.f.exists()) {
                e a2 = e.a(c.READ);
                a2.a = b.END;
                a2.e = gc.this.f;
                a2.c = false;
                if (this.a != null) {
                    this.a.a(null);
                    return;
                }
                return;
            }
            e a3 = e.a(c.READ);
            a3.a = b.PROCESSING;
            a3.e = gc.this.f;
            byte[] c = kc.c(gc.this.f);
            e a4 = e.a(c.READ);
            a4.a = b.END;
            a4.e = gc.this.f;
            a4.c = c != null;
            if (this.a != null) {
                this.a.a(c);
            }
        }
    }

    private void a(a<byte[]> aVar) {
        a(new AnonymousClass1(aVar));
    }

    private static List<gs> a(File file) {
        List list;
        ArrayList arrayList = new ArrayList();
        List<String> d2 = kc.d(file);
        if (d2 != null && !d2.isEmpty()) {
            for (String str : d2) {
                try {
                    list = JsonUtils.parseToList(new JSONArray(str), gs.class, new Object[0]);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    list = null;
                }
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    public static byte[] a(List<gs> list, e eVar) {
        e a2 = e.a(c.TRANSLATE_BYTE);
        a2.a = b.START;
        a2.b = eVar;
        byte[] bArr = null;
        if (list == null || list.isEmpty()) {
            e a3 = e.a(c.TRANSLATE_BYTE);
            a3.a = b.END;
            a3.b = eVar;
            a3.c = false;
            return null;
        }
        e a4 = e.a(c.TRANSLATE_BYTE);
        a4.a = b.PROCESSING;
        a4.e = list;
        a4.b = eVar;
        String collectionToJson = JsonUtils.collectionToJson(new ArrayList(list));
        if (!TextUtils.isEmpty(collectionToJson)) {
            try {
                bArr = collectionToJson.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bArr = collectionToJson.getBytes();
            }
        }
        e a5 = e.a(c.TRANSLATE_BYTE);
        a5.a = b.END;
        a5.d = bArr;
        a5.e = collectionToJson;
        a5.b = eVar;
        a5.c = bArr != null;
        return bArr;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.gc$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass2 implements a<byte[]> {
        public AnonymousClass2() {
        }

        @Override // com.tencent.mapsdk.internal.gc.a
        public final /* synthetic */ void a(byte[] bArr) {
            byte[] bArr2 = bArr;
            if (bArr2 == null || bArr2.length <= 0) {
                return;
            }
            gc.this.a(bArr2, new AnonymousClass1());
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        private void a2(byte[] bArr) {
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            gc.this.a(bArr, new AnonymousClass1());
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.gc$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public final class AnonymousClass1 implements a<Boolean> {
            AnonymousClass1() {
            }

            @Override // com.tencent.mapsdk.internal.gc.a
            public final /* synthetic */ void a(Boolean bool) {
                gc.a(gc.this, bool.booleanValue());
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            private void a2(Boolean bool) {
                gc.a(gc.this, bool.booleanValue());
            }
        }
    }

    private void b() {
        a(new AnonymousClass1(new AnonymousClass2()));
    }

    public final void a(final byte[] bArr, final a<Boolean> aVar) {
        a(new Runnable() { // from class: com.tencent.mapsdk.internal.gc.3
            /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r17 = this;
                    r1 = r17
                    com.tencent.mapsdk.internal.gc$c r0 = com.tencent.mapsdk.internal.gc.c.UPLOAD
                    com.tencent.mapsdk.internal.gc$e r0 = com.tencent.mapsdk.internal.gc.e.a(r0)
                    byte[] r2 = r2
                    r0.d = r2
                    com.tencent.mapsdk.internal.gc$b r2 = com.tencent.mapsdk.internal.gc.b.START
                    r0.a = r2
                    byte[] r0 = r2
                    r2 = 0
                    if (r0 == 0) goto Lc4
                    byte[] r0 = r2
                    int r0 = r0.length
                    if (r0 != 0) goto L1c
                    goto Lc4
                L1c:
                    com.tencent.mapsdk.internal.gc r0 = com.tencent.mapsdk.internal.gc.this
                    r3 = 1
                    r0.g = r3
                    com.tencent.mapsdk.internal.gc$c r0 = com.tencent.mapsdk.internal.gc.c.UPLOAD     // Catch: java.lang.Exception -> L8b
                    com.tencent.mapsdk.internal.gc$e r0 = com.tencent.mapsdk.internal.gc.e.a(r0)     // Catch: java.lang.Exception -> L8b
                    com.tencent.mapsdk.internal.gc$b r4 = com.tencent.mapsdk.internal.gc.b.PROCESSING     // Catch: java.lang.Exception -> L8b
                    r0.a = r4     // Catch: java.lang.Exception -> L8b
                    java.lang.Class<com.tencent.mapsdk.internal.dp> r0 = com.tencent.mapsdk.internal.dp.class
                    com.tencent.mapsdk.internal.ci r0 = com.tencent.mapsdk.internal.ck.a(r0)     // Catch: java.lang.Exception -> L8b
                    com.tencent.mapsdk.internal.dp r0 = (com.tencent.mapsdk.internal.dp) r0     // Catch: java.lang.Exception -> L8b
                    com.tencent.mapsdk.internal.ci$a r0 = r0.h()     // Catch: java.lang.Exception -> L8b
                    r4 = r0
                    com.tencent.mapsdk.internal.db r4 = (com.tencent.mapsdk.internal.db) r4     // Catch: java.lang.Exception -> L8b
                    com.tencent.mapsdk.internal.gc r0 = com.tencent.mapsdk.internal.gc.this     // Catch: java.lang.Exception -> L8b
                    java.lang.String r5 = r0.c     // Catch: java.lang.Exception -> L8b
                    com.tencent.mapsdk.internal.gc r0 = com.tencent.mapsdk.internal.gc.this     // Catch: java.lang.Exception -> L8b
                    java.lang.String r6 = r0.d     // Catch: java.lang.Exception -> L8b
                    java.lang.String r7 = com.tencent.mapsdk.internal.gy.l()     // Catch: java.lang.Exception -> L8b
                    com.tencent.mapsdk.internal.gc r0 = com.tencent.mapsdk.internal.gc.this     // Catch: java.lang.Exception -> L8b
                    java.lang.String r8 = r0.e     // Catch: java.lang.Exception -> L8b
                    java.lang.String r9 = com.tencent.mapsdk.internal.gy.h()     // Catch: java.lang.Exception -> L8b
                    java.lang.String r10 = com.tencent.mapsdk.internal.gy.d()     // Catch: java.lang.Exception -> L8b
                    int r11 = com.tencent.mapsdk.internal.gy.j()     // Catch: java.lang.Exception -> L8b
                    java.lang.String r12 = com.tencent.mapsdk.internal.gy.k()     // Catch: java.lang.Exception -> L8b
                    java.lang.String r13 = com.tencent.mapsdk.internal.gy.m()     // Catch: java.lang.Exception -> L8b
                    java.lang.String r14 = com.tencent.mapsdk.internal.gy.c()     // Catch: java.lang.Exception -> L8b
                    java.lang.String r15 = com.tencent.mapsdk.internal.gy.g()     // Catch: java.lang.Exception -> L8b
                    byte[] r0 = r2     // Catch: java.lang.Exception -> L8b
                    r16 = r0
                    com.tencent.map.tools.net.NetResponse r0 = r4.report(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L8b
                    if (r0 == 0) goto La1
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8b
                    java.lang.String r5 = "Post statistic data with response:"
                    r4.<init>(r5)     // Catch: java.lang.Exception -> L8b
                    java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L8b
                    byte[] r6 = r0.data     // Catch: java.lang.Exception -> L8b
                    java.lang.String r0 = r0.charset     // Catch: java.lang.Exception -> L8b
                    r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L8b
                    r4.append(r5)     // Catch: java.lang.Exception -> L8b
                    java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L8b
                    com.tencent.mapsdk.internal.kj.a(r0)     // Catch: java.lang.Exception -> L8b
                    goto La2
                L8b:
                    r0 = move-exception
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "err:"
                    r3.<init>(r4)
                    java.lang.String r0 = r0.getMessage()
                    r3.append(r0)
                    java.lang.String r0 = r3.toString()
                    com.tencent.mapsdk.internal.kj.c(r0)
                La1:
                    r3 = 0
                La2:
                    com.tencent.mapsdk.internal.gc$c r0 = com.tencent.mapsdk.internal.gc.c.UPLOAD
                    com.tencent.mapsdk.internal.gc$e r0 = com.tencent.mapsdk.internal.gc.e.a(r0)
                    byte[] r4 = r2
                    r0.d = r4
                    com.tencent.mapsdk.internal.gc$b r4 = com.tencent.mapsdk.internal.gc.b.END
                    r0.a = r4
                    r0.c = r3
                    com.tencent.mapsdk.internal.gc$a r0 = r3
                    if (r0 == 0) goto Lbf
                    com.tencent.mapsdk.internal.gc$a r0 = r3
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    r0.a(r3)
                Lbf:
                    com.tencent.mapsdk.internal.gc r0 = com.tencent.mapsdk.internal.gc.this
                    r0.g = r2
                    return
                Lc4:
                    com.tencent.mapsdk.internal.gc$a r0 = r3
                    if (r0 == 0) goto Lcf
                    com.tencent.mapsdk.internal.gc$a r0 = r3
                    java.lang.Boolean r3 = java.lang.Boolean.FALSE
                    r0.a(r3)
                Lcf:
                    com.tencent.mapsdk.internal.gc$c r0 = com.tencent.mapsdk.internal.gc.c.UPLOAD
                    com.tencent.mapsdk.internal.gc$e r0 = com.tencent.mapsdk.internal.gc.e.a(r0)
                    r3 = 0
                    r0.d = r3
                    r0.c = r2
                    com.tencent.mapsdk.internal.gc$b r2 = com.tencent.mapsdk.internal.gc.b.END
                    r0.a = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.gc.AnonymousClass3.run():void");
            }
        });
    }

    private void a(boolean z) {
        e.a(c.UPLOAD_END).a = b.START;
        byte[] c2 = kc.c(this.j);
        e a2 = e.a(c.UPLOAD_END);
        a2.a = b.PROCESSING;
        a2.c = z;
        a2.d = c2;
        a2.e = this.j;
        if (z) {
            kc.b(this.f);
            if (c2 != null && c2.length > 0) {
                kc.a(this.j, this.f);
            }
        } else if (c2 != null && c2.length > 0) {
            ArrayList arrayList = new ArrayList();
            List<gs> a3 = a(this.f);
            List<gs> a4 = a(this.j);
            arrayList.addAll(a3);
            arrayList.addAll(a4);
            kc.b(this.f);
            kc.b(this.j);
            byte[] a5 = a(arrayList, a2);
            e a6 = e.a(c.WRITE);
            a6.a = b.START;
            a6.b = a2;
            a6.d = a5;
            a6.e = this.f;
            boolean a7 = kc.a(this.f, a5);
            e a8 = e.a(c.WRITE);
            a8.a = b.END;
            a8.b = a2;
            a8.c = a7;
        }
        e.a(c.UPLOAD_END).a = b.END;
    }

    @MainThread
    private void c() {
        if (this.a == 0) {
            a(new AnonymousClass1(new AnonymousClass2()));
        }
        this.a++;
    }

    @MainThread
    private void a(gs gsVar) {
        this.a--;
        if (gsVar != null) {
            synchronized (this) {
                this.b.add(gsVar);
            }
        }
        if (this.a == 0 && !this.b.isEmpty()) {
            a(a(this.b, (e) null), new AnonymousClass4());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.gc$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass4 implements a<Boolean> {
        public AnonymousClass4() {
        }

        @Override // com.tencent.mapsdk.internal.gc.a
        public final /* synthetic */ void a(Boolean bool) {
            Boolean bool2 = bool;
            gc.a(gc.this, bool2.booleanValue());
            if (bool2.booleanValue()) {
                gc.this.b.clear();
            }
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        private void a2(Boolean bool) {
            gc.a(gc.this, bool.booleanValue());
            if (bool.booleanValue()) {
                gc.this.b.clear();
            }
        }
    }

    private static gs d() {
        return a(System.currentTimeMillis());
    }

    public static gs a(long j) {
        e.a(c.CREATE).e = Long.valueOf(j);
        return new gs(j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class e {
        b a;
        e b;
        boolean c;
        byte[] d;
        public Object e;
        private c f;

        private e a() {
            return this;
        }

        public static e a(c cVar) {
            e eVar = new e();
            eVar.f = cVar;
            return eVar;
        }

        private e a(e eVar) {
            this.b = eVar;
            return this;
        }

        private e a(b bVar) {
            this.a = bVar;
            return this;
        }

        private e a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        private e a(boolean z) {
            this.c = z;
            return this;
        }

        private e a(Object obj) {
            this.e = obj;
            return this;
        }

        private c b() {
            return this.f;
        }

        private byte[] c() {
            return this.d;
        }

        private boolean d() {
            return this.c;
        }

        private Object e() {
            return this.e;
        }

        private b f() {
            return this.a;
        }

        private boolean b(c cVar) {
            return cVar == this.f;
        }

        private boolean a(c cVar, b bVar) {
            return bVar == this.a && cVar == this.f;
        }

        private boolean c(c cVar) {
            return this.b != null && cVar == this.b.f;
        }

        private boolean b(c cVar, b bVar) {
            if (this.b != null) {
                e eVar = this.b;
                return bVar == eVar.a && cVar == eVar.f;
            }
            return false;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("StatisticState{");
            stringBuffer.append("mState=");
            stringBuffer.append(this.f);
            stringBuffer.append(", mStage=");
            stringBuffer.append(this.a);
            stringBuffer.append(", mParentState=");
            stringBuffer.append(this.b);
            stringBuffer.append(", mResult=");
            stringBuffer.append(this.c);
            stringBuffer.append(", mData=");
            if (this.d == null) {
                stringBuffer.append(StringUtil.NULL);
            } else {
                stringBuffer.append('[');
                int i = 0;
                while (i < this.d.length) {
                    stringBuffer.append(i == 0 ? "" : ", ");
                    stringBuffer.append((int) this.d[i]);
                    i++;
                }
                stringBuffer.append(']');
            }
            stringBuffer.append(", mTag=");
            stringBuffer.append(this.e);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    static /* synthetic */ void a(gc gcVar, boolean z) {
        e.a(c.UPLOAD_END).a = b.START;
        byte[] c2 = kc.c(gcVar.j);
        e a2 = e.a(c.UPLOAD_END);
        a2.a = b.PROCESSING;
        a2.c = z;
        a2.d = c2;
        a2.e = gcVar.j;
        if (z) {
            kc.b(gcVar.f);
            if (c2 != null && c2.length > 0) {
                kc.a(gcVar.j, gcVar.f);
            }
        } else if (c2 != null && c2.length > 0) {
            ArrayList arrayList = new ArrayList();
            List<gs> a3 = a(gcVar.f);
            List<gs> a4 = a(gcVar.j);
            arrayList.addAll(a3);
            arrayList.addAll(a4);
            kc.b(gcVar.f);
            kc.b(gcVar.j);
            byte[] a5 = a(arrayList, a2);
            e a6 = e.a(c.WRITE);
            a6.a = b.START;
            a6.b = a2;
            a6.d = a5;
            a6.e = gcVar.f;
            boolean a7 = kc.a(gcVar.f, a5);
            e a8 = e.a(c.WRITE);
            a8.a = b.END;
            a8.b = a2;
            a8.c = a7;
        }
        e.a(c.UPLOAD_END).a = b.END;
    }
}
