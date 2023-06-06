package com.sankuai.waimai.touchmatrix.mach;

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
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements i {
        public static ChangeQuickRedirect a;
        LoadStatusListener b;

        private a(LoadStatusListener loadStatusListener) {
            Object[] objArr = {loadStatusListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cc60cae8bc07724ccbd6d3e5827676", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cc60cae8bc07724ccbd6d3e5827676");
            } else {
                this.b = loadStatusListener;
            }
        }

        @Override // com.sankuai.waimai.mach.i
        public final void a(com.sankuai.waimai.mach.node.a<?> aVar, c.a.C1000a c1000a, k kVar, boolean z, i.a aVar2) {
            Object[] objArr = {aVar, c1000a, kVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568d43c4231f7c9318b66d41b08f5bb7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568d43c4231f7c9318b66d41b08f5bb7");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd23abfe34035f3f19d475fa253dd39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd23abfe34035f3f19d475fa253dd39");
                return;
            }
            b.C0608b a2 = a();
            if (a2 == null || !c.a.C1000a.a(c1000a)) {
                z2 = false;
            } else {
                a(kVar, a2, c1000a);
                a2.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.touchmatrix.mach.WmMachImageLoaderUtil.a.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86a54f6fa5ea55d2f5513e19663887fc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86a54f6fa5ea55d2f5513e19663887fc");
                        } else {
                            aVar2.a(drawable);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "532c12d0d51eb82994f7cc9ab91f13f3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "532c12d0d51eb82994f7cc9ab91f13f3");
                            return;
                        }
                        if (z || !c1000a.f) {
                            aVar2.a(-1, new Exception("mach bitmap load fail"));
                        } else {
                            a.this.b(aVar, c1000a, kVar, true, aVar2);
                        }
                        if (a.this.b != null) {
                            new Exception("mach bitmap load fail");
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
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b1da1e19791d8caef5ca478c40cf48", RobustBitConfig.DEFAULT_VALUE) ? (b.C0608b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b1da1e19791d8caef5ca478c40cf48") : com.sankuai.meituan.mtimageloader.loader.a.c();
        }

        private void a(k kVar, b.C0608b c0608b, c.a.C1000a c1000a) {
            Object[] objArr = {kVar, c0608b, c1000a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51877a8e17151b8d9a59e7e969d647b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51877a8e17151b8d9a59e7e969d647b2");
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
