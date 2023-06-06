package com.sankuai.xm.log;

import android.util.Log;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.base.service.g;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d implements g {
    public static ChangeQuickRedirect a;
    static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss:SSS");
    static volatile boolean c = false;
    static volatile com.sankuai.xm.log.b d = null;
    static volatile int e = 3;
    private static boolean f = true;
    private static List<a> g = new LinkedList();

    public static /* synthetic */ String a(d dVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "d4805108fc06e99f52d4d0be766ae961", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "d4805108fc06e99f52d4d0be766ae961");
        }
        switch (i) {
            case 1:
                return "LEVEL_V";
            case 2:
                return "LEVEL_D";
            case 3:
                return "LEVEL_I";
            case 4:
                return "LEVEL_W";
            case 5:
                return "LEVEL_E";
            default:
                return "";
        }
    }

    public static /* synthetic */ void a(d dVar, String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "5ade519426fbb1329f2f574769f1646e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "5ade519426fbb1329f2f574769f1646e");
            return;
        }
        synchronized (d.class) {
            if (g.size() >= 200) {
                System.out.println("MLog cache is full");
                g.remove(0);
            }
            a aVar = new a();
            if (str != null) {
                aVar.b = str;
            }
            if (str2 != null) {
                aVar.c = str2;
            }
            if (str3 != null) {
                aVar.d = str3;
            }
            g.add(aVar);
        }
    }

    public d() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        private static d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3fa22b21fa359d21686f04ad22ac001", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3fa22b21fa359d21686f04ad22ac001") : b.a;
    }

    public static boolean b() {
        return f;
    }

    @Override // com.sankuai.xm.base.service.g
    public final void a(Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "865c5ae2dbdc5f0b4683b93bd2619368", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "865c5ae2dbdc5f0b4683b93bd2619368");
        } else {
            a(2, obj, str, objArr);
        }
    }

    @Override // com.sankuai.xm.base.service.g
    public final void b(Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "12d0baf1934568184ff9df1ad9be1a33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "12d0baf1934568184ff9df1ad9be1a33");
        } else {
            a(3, obj, str, objArr);
        }
    }

    @Override // com.sankuai.xm.base.service.g
    public final void c(Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "c730ce89d9cd724a9d41f3a0d9f1205a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "c730ce89d9cd724a9d41f3a0d9f1205a");
        } else {
            a(4, obj, str, objArr);
        }
    }

    @Override // com.sankuai.xm.base.service.g
    public final void d(Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "1211a2cf9c7b4d7e8e355d7f8d180a6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "1211a2cf9c7b4d7e8e355d7f8d180a6a");
        } else {
            a(5, obj, str, objArr);
        }
    }

    @Override // com.sankuai.xm.base.service.g
    public final void a(Object obj, Throwable th) {
        Object[] objArr = {obj, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3410640c7711314733b5197081759e0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3410640c7711314733b5197081759e0e");
        } else {
            a(obj, th, (String) null, new Object[0]);
        }
    }

    @Override // com.sankuai.xm.base.service.g
    public final void a(Object obj, Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {obj, th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "81acc8ea2181090f6c5489fb6e28afc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "81acc8ea2181090f6c5489fb6e28afc4");
        } else {
            b(obj, th, str, objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: Throwable -> 0x003f, TryCatch #0 {Throwable -> 0x003f, blocks: (B:7:0x0036, B:9:0x0039, B:13:0x0043, B:17:0x004e, B:19:0x0052, B:20:0x0055), top: B:24:0x0036 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r19, java.lang.Object r20, java.lang.String r21, java.lang.Object... r22) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            r9 = r20
            r10 = r22
            r1 = 4
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r12 = 0
            r11[r12] = r1
            r13 = 1
            r11[r13] = r9
            r1 = 2
            r11[r1] = r21
            r1 = 3
            r11[r1] = r10
            com.meituan.robust.ChangeQuickRedirect r15 = com.sankuai.xm.log.d.a
            java.lang.String r6 = "7af0a42c759ba9caf74f8067c7fe0af6"
            r4 = 0
            r16 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r11
            r2 = r18
            r3 = r15
            r5 = r6
            r13 = r6
            r6 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L34
            com.meituan.robust.PatchProxy.accessDispatch(r11, r8, r15, r12, r13)
            return
        L34:
            if (r10 == 0) goto L41
            int r1 = r10.length     // Catch: java.lang.Throwable -> L3f
            if (r1 <= 0) goto L41
            java.lang.String r1 = java.lang.String.format(r21, r22)     // Catch: java.lang.Throwable -> L3f
            r14 = r1
            goto L43
        L3f:
            r0 = move-exception
            goto L59
        L41:
            r14 = r21
        L43:
            java.lang.String r1 = r8.a(r9)     // Catch: java.lang.Throwable -> L3f
            boolean r2 = com.sankuai.xm.log.d.f     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L55
            r2 = 1
            if (r0 == r2) goto L55
            switch(r0) {
                case 3: goto L55;
                case 4: goto L55;
                case 5: goto L52;
                default: goto L51;
            }     // Catch: java.lang.Throwable -> L3f
        L51:
            goto L55
        L52:
            android.util.Log.e(r1, r14)     // Catch: java.lang.Throwable -> L3f
        L55:
            r8.a(r0, r1, r14)     // Catch: java.lang.Throwable -> L3f
            return
        L59:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r0 = com.sankuai.xm.base.util.p.a(r0)
            r1.println(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.log.d.a(int, java.lang.Object, java.lang.String, java.lang.Object[]):void");
    }

    private void b(Object obj, Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {obj, th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "34e41eddd7636448b6208d741803b17c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "34e41eddd7636448b6208d741803b17c");
            return;
        }
        try {
            String a2 = a(obj);
            StringBuilder sb = new StringBuilder();
            if (!ac.a(str)) {
                if (objArr != null && objArr.length > 0) {
                    sb.append(String.format(str, objArr));
                } else {
                    sb.append(str);
                }
            }
            if (th != null) {
                sb.append("\nStackTrace:\n");
                sb.append(p.a(th));
            }
            String sb2 = sb.toString();
            if (f) {
                Log.e(a2, sb2);
            }
            a(5, a2, sb2);
        } catch (Throwable th2) {
            System.out.println(p.a(th2));
        }
    }

    private String a(Object obj) {
        String simpleName;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91841fb1f4e2bd325fde32719269ba6e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91841fb1f4e2bd325fde32719269ba6e");
        }
        if (obj instanceof String) {
            simpleName = (String) obj;
        } else {
            simpleName = (obj instanceof Class ? (Class) obj : obj.getClass()).getSimpleName();
        }
        return String.valueOf(Thread.currentThread().getId()) + Constants.SPACE + simpleName;
    }

    public final void a(String str, Date date) {
        Object[] objArr = {str, date};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9faed1958f8bd920bed3a35ef6680324", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9faed1958f8bd920bed3a35ef6680324");
        } else if (d != null) {
            d.a(str, date);
        }
    }

    private void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f32b61d1e0a50979c04065a2ced9a08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f32b61d1e0a50979c04065a2ced9a08");
        } else if (e > i) {
        } else {
            b(i, str2, Thread.currentThread().getName() + '/' + Thread.currentThread().getPriority() + StringUtil.SPACE + str);
        }
    }

    private void b(final int i, final String str, final String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671f8b318764396734e7971892df3c83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671f8b318764396734e7971892df3c83");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        com.sankuai.xm.threadpool.scheduler.a.b().a(21, new Runnable() { // from class: com.sankuai.xm.log.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05ae7c56351785901fd3dec199cb8c30", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05ae7c56351785901fd3dec199cb8c30");
                    return;
                }
                try {
                    if (d.e > i) {
                        return;
                    }
                    String str3 = d.b.format(Long.valueOf(currentTimeMillis)) + StringUtil.SPACE + str2;
                    String a2 = d.a(d.this, i);
                    if (d.d != null) {
                        d.d.a(a2, str3, str);
                    } else {
                        d.a(d.this, a2, str3, str);
                    }
                } catch (Exception e2) {
                    System.out.println(p.a(e2));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ac87202c737281228af9b2939092a4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ac87202c737281228af9b2939092a4");
                return;
            }
            this.b = "";
            this.c = "";
            this.d = "";
        }
    }
}
