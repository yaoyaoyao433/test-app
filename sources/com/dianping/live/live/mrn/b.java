package com.dianping.live.live.mrn;

import android.content.Context;
import com.dianping.live.live.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.dianping.live.live.utils.h {
    public static ChangeQuickRedirect a;
    public static b b;
    private h.a d;

    public static synchronized b a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e66f5a62dda0c07b8b75e0662a8e6a8", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e66f5a62dda0c07b8b75e0662a8e6a8");
            }
            if (b == null) {
                b = new b();
            }
            return b;
        }
    }

    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f012af6cb2dbf82ce63839f1a578f352", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f012af6cb2dbf82ce63839f1a578f352")).booleanValue() : com.sankuai.meituan.mtlive.player.library.f.a(141374);
    }

    public final void a(Context context, h.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08bce0048ea55f27eeffc5151a6ff356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08bce0048ea55f27eeffc5151a6ff356");
            return;
        }
        this.d = aVar;
        com.sankuai.meituan.mtlive.player.library.f.a(141374, new k.a() { // from class: com.dianping.live.live.mrn.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.core.k.a
            public final void onInitialSucceed() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4232eb5afe9855b0022a4db7fb2a3b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4232eb5afe9855b0022a4db7fb2a3b4");
                } else if (b.this.d != null) {
                    b.this.d.a(200);
                }
            }

            @Override // com.sankuai.meituan.mtlive.core.k.a
            public final void onInitialFailed() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fd94f6687a8b0875ac5d140bccd3fce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fd94f6687a8b0875ac5d140bccd3fce");
                } else if (b.this.d != null) {
                    b.this.d.b(202);
                }
            }
        });
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68fc35ba9805aebec5dce560fb429c53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68fc35ba9805aebec5dce560fb429c53");
            return;
        }
        this.d = null;
        com.sankuai.meituan.mtlive.player.library.f.a(141374, (k.a) null);
    }
}
