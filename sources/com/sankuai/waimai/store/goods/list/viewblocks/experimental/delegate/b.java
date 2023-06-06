package com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;
    public List<a> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b3b05b7ef362ab97fc7d6bca7fb03ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b3b05b7ef362ab97fc7d6bca7fb03ad");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1e7d07d43d0b97a1e904d502818787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1e7d07d43d0b97a1e904d502818787");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca3e68255f49f0be8fced2a48c59686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca3e68255f49f0be8fced2a48c59686");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.c();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e47c5bee5d367e839df0a3cf311862b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e47c5bee5d367e839df0a3cf311862b");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.d();
                }
            }
        }
    }
}
