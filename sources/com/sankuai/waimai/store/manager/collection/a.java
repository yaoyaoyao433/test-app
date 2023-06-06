package com.sankuai.waimai.store.manager.collection;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8e19d35e72c088d947fe131a9791e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8e19d35e72c088d947fe131a9791e4");
        } else {
            this.b = new SoftReference<>(aVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519a3c75a18cdce7c34012a7563f138c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519a3c75a18cdce7c34012a7563f138c");
        } else if (this.b.get() != null) {
            this.b.get().a(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c24d67bc9980224e368888348bd4236e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c24d67bc9980224e368888348bd4236e");
        } else if (this.b.get() != null) {
            this.b.get().c(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3110825c4f8feee048f3823168f3dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3110825c4f8feee048f3823168f3dff");
        } else if (this.b.get() != null) {
            this.b.get().b(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d95d0ed159647b0a5ebe8511b7e1c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d95d0ed159647b0a5ebe8511b7e1c9");
        } else if (this.b.get() != null) {
            this.b.get().a(str, z);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.collect.a
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c8563e284f91ec456f2bcaae608ddd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c8563e284f91ec456f2bcaae608ddd0");
        } else if (this.b.get() != null) {
            this.b.get().c(str);
        }
    }
}
