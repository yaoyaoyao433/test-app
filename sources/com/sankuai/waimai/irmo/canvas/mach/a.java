package com.sankuai.waimai.irmo.canvas.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.container.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    c b;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e039b9e9bd76599f7da7cb0becd11599", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e039b9e9bd76599f7da7cb0becd11599");
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a419c8714821f0f0ed17922eefa6ef6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a419c8714821f0f0ed17922eefa6ef6c");
        } else if (this.b != null) {
            this.b.b();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac552b231403acddc0bbbe248c1c12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac552b231403acddc0bbbe248c1c12d");
        } else if (this.b != null) {
            this.b.c();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe8e618fbd6b68f5a4bb88eec5df44f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe8e618fbd6b68f5a4bb88eec5df44f");
        } else if (this.b != null) {
            this.b.d();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c85fa337676cfe23b9274da9e7ea53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c85fa337676cfe23b9274da9e7ea53");
        } else if (this.b != null) {
            this.b.e();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2b91216c6e18b97b8b8443a1f498a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2b91216c6e18b97b8b8443a1f498a14");
        } else if (this.b != null) {
            this.b.f();
        }
    }
}
