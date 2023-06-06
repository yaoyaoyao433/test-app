package com.sankuai.waimai.platform.machpro.component.lottie;

import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.lottie.DownloadService;
import com.sankuai.waimai.platform.machpro.component.lottie.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.security.MessageDigest;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rx.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b e;
    ThreadPoolExecutor b;
    private DownloadService c;
    private com.sankuai.waimai.platform.machpro.component.lottie.a d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.machpro.component.lottie.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1062b {
        void a(String str, String str2);
    }

    public static /* synthetic */ void a(b bVar, final String str, final InterfaceC1062b interfaceC1062b) {
        Object[] objArr = {str, interfaceC1062b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "151666da23d27e360595cb695d402e64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "151666da23d27e360595cb695d402e64");
            return;
        }
        if (bVar.c == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            bVar.c = (DownloadService) (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f2ca5909d7245fe5fd5a561b14998764", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f2ca5909d7245fe5fd5a561b14998764") : new ar.a().a("http://msstestdn.sankuai.com/").a(i.a("defaultokhttp")).a(f.a()).a()).a(DownloadService.class);
        }
        bVar.c.downloadFile(str).b(rx.schedulers.a.a(bVar.b)).a(new e<ap>() { // from class: com.sankuai.waimai.platform.machpro.component.lottie.b.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(ap apVar) {
                ap apVar2 = apVar;
                Object[] objArr3 = {apVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9b19093ebf40fb2163bcdec189fa955", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9b19093ebf40fb2163bcdec189fa955");
                    return;
                }
                String string = apVar2.string();
                if (interfaceC1062b != null) {
                    interfaceC1062b.a(str, string);
                }
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                synchronized (b.class) {
                    try {
                        com.sankuai.waimai.platform.machpro.component.lottie.a aVar = b.this.d;
                        String a2 = b.this.a(str);
                        Object[] objArr4 = {a2};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.machpro.component.lottie.a.a;
                        a.C1061a a3 = PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "23a83d83e7fe3598d635386f2092bd0a", RobustBitConfig.DEFAULT_VALUE) ? (a.C1061a) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "23a83d83e7fe3598d635386f2092bd0a") : aVar.a(a2, -1L);
                        if (a3 != null) {
                            try {
                                Object[] objArr5 = {0, string};
                                ChangeQuickRedirect changeQuickRedirect5 = a.C1061a.a;
                                if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "388c42e65c355ff8b67ee9bd333ff78a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "388c42e65c355ff8b67ee9bd333ff78a");
                                } else {
                                    OutputStreamWriter outputStreamWriter = null;
                                    try {
                                        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(a3.a(0)), com.sankuai.waimai.platform.machpro.component.lottie.a.c);
                                        try {
                                            outputStreamWriter2.write(string);
                                            com.sankuai.waimai.mach.manager_new.common.b.a(outputStreamWriter2);
                                        } catch (Throwable th) {
                                            th = th;
                                            outputStreamWriter = outputStreamWriter2;
                                            com.sankuai.waimai.mach.manager_new.common.b.a(outputStreamWriter);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a.C1061a.a;
                                if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "af0cf425a50d60495312e41cbe125d74", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "af0cf425a50d60495312e41cbe125d74");
                                } else {
                                    com.sankuai.waimai.platform.machpro.component.lottie.a.this.a(a3, true);
                                    a3.d = true;
                                }
                            } finally {
                                a3.b();
                            }
                        }
                    } catch (Exception e2) {
                        com.sankuai.waimai.machpro.util.a.a(e2.getMessage());
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b159f8d6955d29cea0c1b6d0c019c241", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b159f8d6955d29cea0c1b6d0c019c241");
                } else if (interfaceC1062b != null) {
                    interfaceC1062b.a(str, "");
                }
            }
        });
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0e273a82f54b191ddae9c38c3f87572", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0e273a82f54b191ddae9c38c3f87572");
            return;
        }
        this.b = com.sankuai.android.jarvis.c.a("machLottie", 0, 4, 60L, TimeUnit.SECONDS, new SynchronousQueue());
        try {
            File file = new File(q.a(com.meituan.android.singleton.b.a, "mp_lottie", "machpro", u.e).getAbsolutePath());
            if (file.exists() || file.mkdirs()) {
                this.d = com.sankuai.waimai.platform.machpro.component.lottie.a.a(file, 1, 1, 1048576L);
            }
        } catch (Exception e2) {
            com.sankuai.waimai.machpro.util.a.a(e2.getMessage());
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e7b95ee062f5a3b9c1b42bfda921ab1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e7b95ee062f5a3b9c1b42bfda921ab1");
        }
        if (e == null) {
            synchronized (b.class) {
                if (e == null) {
                    e = new b();
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b078e2ebb56b976952e348c9d233db9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b078e2ebb56b976952e348c9d233db9");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            Object[] objArr2 = {digest};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1de43e965d96663cdd1ea70a4e0c2409", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1de43e965d96663cdd1ea70a4e0c2409");
            }
            if (digest == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return String.valueOf(str.hashCode());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private String c;
        private InterfaceC1062b d;
        private String e;

        public a(String str, String str2, InterfaceC1062b interfaceC1062b) {
            Object[] objArr = {b.this, str, str2, interfaceC1062b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11d378054c7a2140f155e9b9c188432", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11d378054c7a2140f155e9b9c188432");
                return;
            }
            this.c = str;
            this.d = interfaceC1062b;
            this.e = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r8 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.platform.machpro.component.lottie.b.a.a
                java.lang.String r10 = "43fba7a5adab35ee1015eab5a9382c14"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L18
                com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                return
            L18:
                r1 = 0
                com.sankuai.waimai.platform.machpro.component.lottie.b r2 = com.sankuai.waimai.platform.machpro.component.lottie.b.this     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                com.sankuai.waimai.platform.machpro.component.lottie.a r2 = com.sankuai.waimai.platform.machpro.component.lottie.b.a(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                java.lang.String r3 = r11.c     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                com.sankuai.waimai.platform.machpro.component.lottie.a$c r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                if (r2 == 0) goto L3a
                java.io.File[] r2 = r2.b     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                r0 = r2[r0]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                if (r0 == 0) goto L3a
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
                java.lang.String r0 = com.sankuai.waimai.mach.manager_new.common.a.a(r2)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L66
                r1 = r2
                goto L3b
            L38:
                r0 = move-exception
                goto L4f
            L3a:
                r0 = r1
            L3b:
                com.sankuai.waimai.mach.manager_new.common.b.a(r1)
                com.sankuai.waimai.platform.machpro.component.lottie.b$b r1 = r11.d
                if (r1 == 0) goto L65
                com.sankuai.waimai.platform.machpro.component.lottie.b$b r1 = r11.d
                java.lang.String r2 = r11.e
                r1.a(r2, r0)
                return
            L4a:
                r0 = move-exception
                r2 = r1
                goto L67
            L4d:
                r0 = move-exception
                r2 = r1
            L4f:
                java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L66
                com.sankuai.waimai.machpro.util.a.a(r0)     // Catch: java.lang.Throwable -> L66
                com.sankuai.waimai.mach.manager_new.common.b.a(r2)
                com.sankuai.waimai.platform.machpro.component.lottie.b$b r0 = r11.d
                if (r0 == 0) goto L65
                com.sankuai.waimai.platform.machpro.component.lottie.b$b r0 = r11.d
                java.lang.String r2 = r11.e
                r0.a(r2, r1)
                return
            L65:
                return
            L66:
                r0 = move-exception
            L67:
                com.sankuai.waimai.mach.manager_new.common.b.a(r2)
                com.sankuai.waimai.platform.machpro.component.lottie.b$b r2 = r11.d
                if (r2 == 0) goto L75
                com.sankuai.waimai.platform.machpro.component.lottie.b$b r2 = r11.d
                java.lang.String r3 = r11.e
                r2.a(r3, r1)
            L75:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.component.lottie.b.a.run():void");
        }
    }
}
