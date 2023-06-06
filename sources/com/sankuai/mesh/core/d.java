package com.sankuai.mesh.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements IMeshProvider {
    public static ChangeQuickRedirect a;
    IMeshProvider b;

    public d() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3905801b8a5a76f842e71d2c71e77a4", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3905801b8a5a76f842e71d2c71e77a4") : a.a;
    }

    @Override // com.sankuai.mesh.core.IMeshProvider
    public final String getAppName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2f06db39071c2442eead45c3cba9ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2f06db39071c2442eead45c3cba9ff");
        }
        b();
        return this.b.getAppName();
    }

    @Override // com.sankuai.mesh.core.IMeshProvider
    public final String getAppVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d30e75d7d29bc204f36c65c03657e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d30e75d7d29bc204f36c65c03657e8");
        }
        b();
        return this.b.getAppVersion();
    }

    @Override // com.sankuai.mesh.core.IMeshProvider
    public final String getPayVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf82e33470b40b958b9c2f5d739a039", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf82e33470b40b958b9c2f5d739a039") : this.b.getPayVersion();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01f9df5b2072a939928445f1ca4c2ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01f9df5b2072a939928445f1ca4c2ba");
        } else if (this.b == null) {
            throw new RuntimeException("MeshProvider shouldn't be null");
        }
    }
}
