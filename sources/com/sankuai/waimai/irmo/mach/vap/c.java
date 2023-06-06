package com.sankuai.waimai.irmo.mach.vap;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.b;
import com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends MachViewGroup implements b.a, VapAnimLoadManager.a {
    public static ChangeQuickRedirect a;
    public b b;
    com.sankuai.waimai.irmo.mach.b c;
    e d;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d339b4d76845e12f8983945117fbfdb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d339b4d76845e12f8983945117fbfdb7");
            return;
        }
        this.b = new b(context);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.b);
        this.c = new com.sankuai.waimai.irmo.mach.b(this, this);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2253786f6817d16a23cbc73e1ef1a998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2253786f6817d16a23cbc73e1ef1a998");
        } else {
            this.b.c();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "056444ec2907ba44678b18fea0873bbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "056444ec2907ba44678b18fea0873bbc");
        } else {
            this.b.a();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager.a
    public final void a(@NonNull File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53a94fb323a046e2266acbbd5fa58bcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53a94fb323a046e2266acbbd5fa58bcc");
            return;
        }
        this.b.a(file);
        this.c.a(this.d, file);
    }

    @Override // com.sankuai.waimai.irmo.mach.vap.VapAnimLoadManager.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b511cc24393545281ed3cd0a0537ed02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b511cc24393545281ed3cd0a0537ed02");
        } else {
            this.b.f();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.b.a
    public final void setVolume(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b253a22a8cbe693c9334ae20f137b61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b253a22a8cbe693c9334ae20f137b61d");
        } else if (this.b != null) {
            this.b.a(f, f);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0752decb9a02b77b3abec280e244c575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0752decb9a02b77b3abec280e244c575");
        } else if (this.b != null) {
            this.b.e();
        }
    }
}
