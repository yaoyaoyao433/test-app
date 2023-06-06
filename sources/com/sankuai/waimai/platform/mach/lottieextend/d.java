package com.sankuai.waimai.platform.mach.lottieextend;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.mach.lottieextend.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d b;
    private final com.sankuai.waimai.platform.mach.lottieextend.a c;
    private a d;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcc7e0b3488fac4868830d8cfe5d0944", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcc7e0b3488fac4868830d8cfe5d0944");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "873fbd3df40c6e306c50725576d316ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "873fbd3df40c6e306c50725576d316ee");
        } else {
            this.c = com.sankuai.waimai.platform.mach.lottieextend.a.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610166abd12e837f084fc02cf633d560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610166abd12e837f084fc02cf633d560");
        } else {
            c.a().b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements com.sankuai.waimai.lottie.c {
        public static ChangeQuickRedirect a;
        MachSafeLottieAnimView b;
        private String d;

        @Override // com.sankuai.waimai.lottie.c
        public final void a() {
        }

        public a(MachSafeLottieAnimView machSafeLottieAnimView, String str) {
            Object[] objArr = {d.this, machSafeLottieAnimView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "021ce967c4ab2240805f0432ebe7a4b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "021ce967c4ab2240805f0432ebe7a4b8");
                return;
            }
            this.b = machSafeLottieAnimView;
            this.d = str;
        }

        @Override // com.sankuai.waimai.lottie.c
        public final void a(com.airbnb.lottie.e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81424e0e5a98cf40fc6ad1c833325639", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81424e0e5a98cf40fc6ad1c833325639");
            } else {
                this.b.post(new Runnable() { // from class: com.sankuai.waimai.platform.mach.lottieextend.d.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5e0e86adb9d33ddfbd51eecec9d6443", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5e0e86adb9d33ddfbd51eecec9d6443");
                        } else if (a.this.b.getAnimStatus().equals("start") || a.this.b.getAnimStatus().equals("resume")) {
                            a.this.b.a();
                        }
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.lottie.c
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da929442ccc4a138d3457ee3442e36a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da929442ccc4a138d3457ee3442e36a1");
            } else {
                i.d(new e().a("mach-lottie/load").b("mach-lottie/load").c("mach_lottie_file_load_failed").d(this.d).b());
            }
        }
    }

    public final void a(final MachSafeLottieAnimView machSafeLottieAnimView, final String str) {
        Object[] objArr = {machSafeLottieAnimView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3bff7c7f0b56486568854e7b8ed3c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3bff7c7f0b56486568854e7b8ed3c72");
        } else if (TextUtils.isEmpty(str) || machSafeLottieAnimView == null) {
        } else {
            final a.C1055a a2 = this.c.a(str);
            this.d = new a(machSafeLottieAnimView, str);
            a2.e = c.a().b;
            a2.f = this.d;
            if (!c.a().a(a2.d) || !a2.a()) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final String templateId = machSafeLottieAnimView.getTemplateId();
                c.a().a(str, new g() { // from class: com.sankuai.waimai.platform.mach.lottieextend.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.mach.lottieextend.g
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22b50ad0d2980258cf7ed36db1a0f626", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22b50ad0d2980258cf7ed36db1a0f626");
                            return;
                        }
                        machSafeLottieAnimView.a(a2, d.this.d);
                        String str2 = str;
                        String str3 = templateId;
                        Object[] objArr3 = {str2, str3};
                        ChangeQuickRedirect changeQuickRedirect3 = h.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ff57528197c470c2f8d93f3487b64fa5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ff57528197c470c2f8d93f3487b64fa5");
                        } else {
                            h.a(1, str2, str3);
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        String str4 = str;
                        String str5 = templateId;
                        Object[] objArr4 = {new Long(elapsedRealtime2), str4, str5};
                        ChangeQuickRedirect changeQuickRedirect4 = h.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a975564b65c1a8a3cf06ba0db5de18a2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a975564b65c1a8a3cf06ba0db5de18a2");
                        } else {
                            h.a("MachLottieDownloadFileTime", Long.valueOf(elapsedRealtime2), str4, str5);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.mach.lottieextend.g
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "366379625b660edf1298971c8fa30f27", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "366379625b660edf1298971c8fa30f27");
                            return;
                        }
                        String str2 = str;
                        String str3 = templateId;
                        Object[] objArr3 = {str2, str3};
                        ChangeQuickRedirect changeQuickRedirect3 = h.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7b5c2dc25d0cba1894f352ca7610fc15", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7b5c2dc25d0cba1894f352ca7610fc15");
                        } else {
                            h.a(0, str2, str3);
                        }
                        i.d(new e().a("mach-lottie/download").b("mach-lottie/download").c("zip_download_failed").d(str).b());
                    }
                });
                return;
            }
            machSafeLottieAnimView.a(a2, this.d);
        }
    }
}
