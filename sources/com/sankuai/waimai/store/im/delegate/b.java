package com.sankuai.waimai.store.im.delegate;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84440a4d1dd7ff5b932117a0333ff648", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84440a4d1dd7ff5b932117a0333ff648");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.store.im.delegate.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "720c2df9e9c2b158eb10130ec7586fe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "720c2df9e9c2b158eb10130ec7586fe4");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.im.delegate.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26b0f48b8628f1780036fcdde18d384a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26b0f48b8628f1780036fcdde18d384a");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.im.delegate.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a76d7ecba87beb7d1640a0a1477698c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a76d7ecba87beb7d1640a0a1477698c3");
        } else if (this.b != null) {
            for (a aVar : this.b) {
                if (aVar != null) {
                    aVar.c();
                }
            }
        }
    }
}
