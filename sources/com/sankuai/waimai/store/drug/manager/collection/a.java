package com.sankuai.waimai.store.drug.manager.collection;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.SoftReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.foundation.core.service.collect.a {
    public static ChangeQuickRedirect a;
    private SoftReference<com.sankuai.waimai.store.i.collection.a> b;

    public a(com.sankuai.waimai.store.i.collection.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0cbd2c1bc71290947707c2ee0c12d69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0cbd2c1bc71290947707c2ee0c12d69");
        } else {
            this.b = new SoftReference<>(aVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5483ce3f796b21a2392140906a2e92c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5483ce3f796b21a2392140906a2e92c9");
        } else if (this.b.get() != null) {
            this.b.get().a(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0427ab1d63765c5fdcd08ac5b4283f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0427ab1d63765c5fdcd08ac5b4283f30");
        } else if (this.b.get() != null) {
            this.b.get().c(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fbc2beef155f4e636becd08a3b87ee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fbc2beef155f4e636becd08a3b87ee3");
        } else if (this.b.get() != null) {
            this.b.get().b(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9921643dcc0c08efe73e30eb80087f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9921643dcc0c08efe73e30eb80087f");
        } else if (this.b.get() != null) {
            this.b.get().a(str, z);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f68df2f180704ae3ae7115c085cc85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f68df2f180704ae3ae7115c085cc85");
        } else if (this.b.get() != null) {
            this.b.get().c(str);
        }
    }
}
