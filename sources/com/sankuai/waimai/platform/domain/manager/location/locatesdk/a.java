package com.sankuai.waimai.platform.domain.manager.location.locatesdk;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.LocationCatReporter;
import com.sankuai.waimai.foundation.location.LocationSnifferReporter;
import com.sankuai.waimai.foundation.location.v2.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements com.sankuai.waimai.foundation.location.locatesdk.b {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.foundation.location.c b;
    protected Context c;
    protected com.sankuai.waimai.foundation.location.locatesdk.b d;
    protected String e;
    protected com.sankuai.waimai.foundation.location.d f;
    protected LocationCatReporter g;
    protected LocationSnifferReporter h;

    public a(Context context, com.sankuai.waimai.foundation.location.c cVar, com.sankuai.waimai.foundation.location.d dVar) {
        Object[] objArr = {context, cVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f5305fce92cf152a00361455ab3d6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f5305fce92cf152a00361455ab3d6f");
            return;
        }
        this.c = context;
        this.b = cVar;
        this.f = dVar;
        if (dVar != null) {
            this.g = dVar.b;
            this.h = dVar.c;
        }
    }

    @Override // com.sankuai.waimai.foundation.location.locatesdk.b
    public void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd46a6d43db0f477085cb3abb948a85a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd46a6d43db0f477085cb3abb948a85a");
        } else if (this.d != null) {
            this.d.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a(com.sankuai.waimai.foundation.location.locatesdk.b bVar) {
        this.d = bVar;
    }

    @Override // com.sankuai.waimai.foundation.location.locatesdk.b
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5d69656776851ed0ec2bfd2ad2f9fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5d69656776851ed0ec2bfd2ad2f9fd");
        } else if (this.d != null) {
            this.d.a();
        }
    }

    @Override // com.sankuai.waimai.foundation.location.locatesdk.b
    public final LocationCatReporter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a096f246ea63ce3a728f375fb706365e", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationCatReporter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a096f246ea63ce3a728f375fb706365e");
        }
        if (this.g != null) {
            return this.g;
        }
        if (this.d != null) {
            return this.d.b();
        }
        return null;
    }

    @Override // com.sankuai.waimai.foundation.location.locatesdk.b
    @NonNull
    public final LocationSnifferReporter c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b829d19bcfc5d50967d97e24b07ab57", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationSnifferReporter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b829d19bcfc5d50967d97e24b07ab57");
        }
        if (this.h != null) {
            return this.h;
        }
        if (this.d != null) {
            return this.d.c();
        }
        return new LocationSnifferReporter();
    }

    @Override // com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a(String str) {
        this.e = str;
    }
}
