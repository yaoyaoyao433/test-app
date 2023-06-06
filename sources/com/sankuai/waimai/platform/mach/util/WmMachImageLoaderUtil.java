package com.sankuai.waimai.platform.mach.util;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.i;
import com.sankuai.waimai.mach.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WmMachImageLoaderUtil {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface LoadStatusListener {

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes5.dex */
        public @interface ResultCode {
        }

        void a(com.sankuai.waimai.mach.node.a<?> aVar, int i, boolean z, Exception exc);
    }

    public static void a(c.a aVar, k kVar) {
        Object[] objArr = {aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dfe75550d4b0e749d73a55660468137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dfe75550d4b0e749d73a55660468137");
        } else {
            a(aVar, kVar, null);
        }
    }

    public static void a(c.a aVar, k kVar, LoadStatusListener loadStatusListener) {
        Object[] objArr = {aVar, kVar, loadStatusListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "895dfeca53eb765fa80d22fedb5618b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "895dfeca53eb765fa80d22fedb5618b3");
        } else if (aVar != null) {
            com.sankuai.waimai.mach.imageloader.c.a(new a(loadStatusListener), aVar, kVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements i {
        public static ChangeQuickRedirect a;
        LoadStatusListener b;

        private a(LoadStatusListener loadStatusListener) {
            Object[] objArr = {loadStatusListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6edd97cf32960339b4facf7ba1274f53", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6edd97cf32960339b4facf7ba1274f53");
            } else {
                this.b = loadStatusListener;
            }
        }

        @Override // com.sankuai.waimai.mach.i
        public final void a(com.sankuai.waimai.mach.node.a<?> aVar, c.a.C1000a c1000a, k kVar, boolean z, i.a aVar2) {
            Object[] objArr = {aVar, c1000a, kVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b2bf45d942a765fe6d1a217e60920e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b2bf45d942a765fe6d1a217e60920e");
            } else if (kVar == null) {
            } else {
                kVar.a(z);
                if (z) {
                    kVar.a((Drawable) null);
                }
                b(aVar, c1000a, kVar, false, aVar2);
            }
        }

        void b(final com.sankuai.waimai.mach.node.a<?> aVar, final c.a.C1000a c1000a, @NonNull final k kVar, final boolean z, final i.a aVar2) {
            boolean z2;
            Object[] objArr = {aVar, c1000a, kVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3025e2bb6268252f9d101354a17d5f49", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3025e2bb6268252f9d101354a17d5f49");
                return;
            }
            b.C0608b a2 = a();
            if (a2 == null || !c.a.C1000a.a(c1000a)) {
                z2 = false;
            } else {
                a(kVar, a2, c1000a);
                a2.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil.a.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adf2f95f8a36168b4504554080f06085", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adf2f95f8a36168b4504554080f06085");
                            return;
                        }
                        aVar2.a(drawable);
                        if (a.this.b != null) {
                            a.this.b.a(aVar, 0, z, null);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "726a3b3f338e337ef42cdd85eff92188", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "726a3b3f338e337ef42cdd85eff92188");
                            return;
                        }
                        if (z || !c1000a.f) {
                            aVar2.a(-1, new Exception("mach bitmap load fail"));
                        } else {
                            a.this.b(aVar, c1000a, kVar, true, aVar2);
                        }
                        if (a.this.b != null) {
                            a.this.b.a(aVar, 1, z, new Exception("mach bitmap load fail"));
                        }
                    }
                });
                z2 = true;
            }
            if (z2) {
                return;
            }
            kVar.a("");
            if (aVar2 != null) {
                aVar2.a(0, new Exception("WmSimpleImageLoader load image failed with illegal params"));
            }
        }

        private b.C0608b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae47b172cc94f8e49bb9b7e9867cae0", RobustBitConfig.DEFAULT_VALUE) ? (b.C0608b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae47b172cc94f8e49bb9b7e9867cae0") : com.sankuai.meituan.mtimageloader.loader.a.c();
        }

        private void a(k kVar, b.C0608b c0608b, c.a.C1000a c1000a) {
            Object[] objArr = {kVar, c0608b, c1000a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4d1d817263b6f425b96291d28ccd89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4d1d817263b6f425b96291d28ccd89");
                return;
            }
            c0608b.b = kVar.c();
            String str = c1000a.c;
            switch (c1000a.b) {
                case 1:
                    c0608b.c = str;
                    if (c1000a.e != null) {
                        c0608b = c0608b.a(c1000a.e[0], c1000a.e[1]).b(c1000a.e[0], c1000a.e[1]);
                        break;
                    } else {
                        c0608b.e = 0;
                        c0608b.m = true;
                        break;
                    }
                case 2:
                    c0608b = c0608b.b(str);
                    if (c1000a.e != null) {
                        c0608b = c0608b.b(c1000a.e[0], c1000a.e[1]);
                        break;
                    } else {
                        c0608b.m = false;
                        break;
                    }
            }
            if (c1000a.d != -1) {
                if (c1000a.d != 0) {
                    if (c1000a.d == 1) {
                        c0608b.g = true;
                    }
                } else {
                    c0608b.g = false;
                }
            }
            if (c1000a.g != -1) {
                c0608b.f = c1000a.g;
            }
        }
    }
}
