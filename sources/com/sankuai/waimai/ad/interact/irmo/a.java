package com.sankuai.waimai.ad.interact.irmo;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.WMIrmoView;
import com.sankuai.waimai.irmo.render.c;
import com.sankuai.waimai.irmo.render.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public c b;
    public WMIrmoView c;
    public boolean d;
    public int e;
    public float f;
    public long g;
    public int h;
    Handler i;
    Runnable j;

    public a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2cbedd963c785468bf4628dc03e0565", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2cbedd963c785468bf4628dc03e0565");
            return;
        }
        this.d = false;
        this.e = 1;
        this.f = 1.0f;
        this.g = 0L;
        this.h = 0;
        this.i = new Handler();
        this.j = new Runnable() { // from class: com.sankuai.waimai.ad.interact.irmo.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77a72612a08794d70b1eb5841aff9950", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77a72612a08794d70b1eb5841aff9950");
                } else if (a.this.c != null) {
                    a.this.c.a();
                }
            }
        };
        this.b = cVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9000bea1e2dee9b5bdc2da694e040761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9000bea1e2dee9b5bdc2da694e040761");
        } else if (this.b == null || this.c != null) {
        } else {
            this.c = (WMIrmoView) this.b.o;
            this.c.setBaseAnimPlayCompletionBlock(new g() { // from class: com.sankuai.waimai.ad.interact.irmo.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.render.g
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cc679a76106ed3e453cb58277d16917", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cc679a76106ed3e453cb58277d16917");
                        return;
                    }
                    a.this.h++;
                }
            });
        }
    }
}
