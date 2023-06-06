package com.meituan.mmp.lib.download;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.mmp.lib.download.a;
import com.meituan.mmp.lib.download.i;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    e b;
    public b c;
    private String d;
    private Context e;

    public d(String str, Context context, e eVar) {
        Object[] objArr = {str, context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df271e6679b436c4775f8b154a1fdaef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df271e6679b436c4775f8b154a1fdaef");
            return;
        }
        this.d = str;
        this.e = context;
        if (eVar == null) {
            this.b = new e();
        } else {
            this.b = eVar;
        }
        this.c = new b(this.b.b);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.download.d$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends c {
        public static ChangeQuickRedirect d;
        public final /* synthetic */ a.InterfaceC0405a e;
        public final /* synthetic */ a.b f;
        private boolean h;
        private boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, a.InterfaceC0405a interfaceC0405a, a.b bVar) {
            super(gVar);
            this.e = interfaceC0405a;
            this.f = bVar;
            this.h = false;
            this.i = false;
        }

        void a(final String str, final boolean z, String str2) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511cac765eb4180c2777892773a6d945", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511cac765eb4180c2777892773a6d945");
            } else if (this.c.h == 1) {
                if (this.f != null) {
                    this.f.a(str, "", z);
                }
                b();
            } else {
                if (this.e != null) {
                    this.e.c();
                }
                final String str3 = this.c.i;
                com.meituan.mmp.lib.trace.b.b("DownloadService", "startUnpack: " + str2 + " from " + str + " to " + str3);
                StringBuilder sb = new StringBuilder("unpack ");
                sb.append(str2);
                ab.a(sb.toString());
                i.b.a(str, str3, str2, new i.b.a() { // from class: com.meituan.mmp.lib.download.d.1.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.download.i.b.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be4933e07febeadabac9381d4398b5af", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be4933e07febeadabac9381d4398b5af");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("DownloadService", "unpack onSuccess");
                        if (AnonymousClass1.this.e != null) {
                            AnonymousClass1.this.e.a(str3);
                        }
                        if (AnonymousClass1.this.f != null) {
                            AnonymousClass1.this.f.a(str, str3, z);
                        }
                        AnonymousClass1.this.b();
                    }

                    @Override // com.meituan.mmp.lib.download.i.b.a
                    public final void a(String str4) {
                        Object[] objArr2 = {str4};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e6b6f46af6b7cc93f9e8ca0d1d315bf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e6b6f46af6b7cc93f9e8ca0d1d315bf");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("DownloadService", "unpack onFail: " + str4);
                        if (AnonymousClass1.this.e != null) {
                            AnonymousClass1.this.e.b(4, str4);
                        }
                        if (AnonymousClass1.this.f != null) {
                            AnonymousClass1.this.f.a(4, str4);
                        }
                        AnonymousClass1.this.b();
                    }
                });
                ab.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c626d425a2172e8d36c081f4d7f916d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c626d425a2172e8d36c081f4d7f916d");
                return;
            }
            this.h = true;
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a18c08ab4a63e702f3e8b1063ede878", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a18c08ab4a63e702f3e8b1063ede878");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d42ccc0ec8beeca7a2a909bcfa6289e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d42ccc0ec8beeca7a2a909bcfa6289e");
            } else {
                if (this.e != null) {
                    this.e.b();
                }
                final String absolutePath = new File(this.c.c, this.c.d).getAbsolutePath();
                if (!TextUtils.isEmpty(this.c.g)) {
                    String b = s.b(new File(absolutePath));
                    if (!TextUtils.isEmpty(b) && TextUtils.equals(this.c.g, b)) {
                        if (this.e != null) {
                            this.e.a(absolutePath, false, -1L);
                        }
                        a(absolutePath, false, this.c.a());
                    }
                }
                final g gVar = this.c;
                com.meituan.mmp.lib.trace.b.b("DownloadService", "DownloadService transaction url::" + this.c.b);
                com.meituan.mmp.lib.trace.b.b("DownloadService", "DownloadService transaction file::" + this.c.c + "::" + this.c.d);
                StringBuilder sb = new StringBuilder("DownloadService transaction md5::");
                sb.append(gVar.g);
                com.meituan.mmp.lib.trace.b.b("DownloadService", sb.toString());
                i.a.a(this.c.b, gVar.c, gVar.d, gVar.g, new i.a.InterfaceC0410a() { // from class: com.meituan.mmp.lib.download.d.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.download.i.a.InterfaceC0410a
                    public final void a(final String str, final long j) {
                        Object[] objArr3 = {str, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50d797214bb4fe743847dfc7936e0c82", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50d797214bb4fe743847dfc7936e0c82");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("DownloadService", "DownloadService onSuccess: " + str);
                        h.a().a(new Runnable() { // from class: com.meituan.mmp.lib.download.d.1.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "413b0a0ba708bc86bf77ea9e30d6ba20", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "413b0a0ba708bc86bf77ea9e30d6ba20");
                                    return;
                                }
                                if (AnonymousClass1.this.e != null) {
                                    AnonymousClass1.this.e.a(str, true, j);
                                }
                                AnonymousClass1.this.a(absolutePath, true, gVar.a());
                            }
                        });
                    }

                    @Override // com.meituan.mmp.lib.download.i.a.InterfaceC0410a
                    public final void a(final String str) {
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "99278629810c18bae182392f40227b9c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "99278629810c18bae182392f40227b9c");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("DownloadService", "DownloadService onFail: " + str);
                        h.a().a(new Runnable() { // from class: com.meituan.mmp.lib.download.d.1.1.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3e4e125fef97de9fdd47b5d77669aada", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3e4e125fef97de9fdd47b5d77669aada");
                                    return;
                                }
                                String str2 = "download failed:" + str;
                                if (AnonymousClass1.this.e != null) {
                                    AnonymousClass1.this.e.a(1, str2);
                                }
                                if (AnonymousClass1.this.f != null) {
                                    AnonymousClass1.this.f.a(1, str2);
                                }
                                AnonymousClass1.this.b();
                            }
                        });
                    }

                    @Override // com.meituan.mmp.lib.download.i.a.InterfaceC0410a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d7b4c24ecf5260cab8c28445a07675b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d7b4c24ecf5260cab8c28445a07675b");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("DownloadService", "DownloadService onTimeout");
                        h.a().a(new Runnable() { // from class: com.meituan.mmp.lib.download.d.1.1.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c32c33911d7ad0febc71a2cef6fa7c78", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c32c33911d7ad0febc71a2cef6fa7c78");
                                    return;
                                }
                                if (AnonymousClass1.this.e != null) {
                                    AnonymousClass1.this.e.a(3, "download timeout");
                                }
                                if (AnonymousClass1.this.f != null) {
                                    AnonymousClass1.this.f.a(3, "download timeout");
                                }
                                AnonymousClass1.this.b();
                            }
                        });
                    }
                });
            }
            long j = d.this.b.c;
            Object[] objArr3 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72db83d32dd820897d4232f36f8701a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72db83d32dd820897d4232f36f8701a3");
            } else {
                try {
                    this.b.await(j, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
            }
            if (this.h) {
                return;
            }
            this.f.a(6, "Timeout");
            this.i = true;
        }
    }
}
