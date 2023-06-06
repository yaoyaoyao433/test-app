package com.meituan.android.neohybrid.neo.bridge;

import android.content.Intent;
import com.meituan.android.neohybrid.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.neohybrid.neo.a {
    public static ChangeQuickRedirect d;
    public List<a> e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i, int i2, Intent intent);
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final String h() {
        return "neobridge_plugin";
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3578434e39e5f3b8987c2217f22c46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3578434e39e5f3b8987c2217f22c46");
        } else {
            this.e = new ArrayList();
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09f80a36a191727a8fa7873a237179f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09f80a36a191727a8fa7873a237179f");
            return;
        }
        super.a(i, i2, intent);
        for (a aVar : this.e) {
            if (aVar != null) {
                try {
                    aVar.a(i, i2, intent);
                } catch (Exception e) {
                    f.a("NeoBridgePlugin_onNeoActivityResult_e:" + e.toString());
                }
            }
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8499cc5389c7e86f768d0735a1ea82d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8499cc5389c7e86f768d0735a1ea82d3");
            return;
        }
        super.g();
        for (a aVar : this.e) {
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Exception e) {
                    f.a("NeoBridgePlugin_onNeoDestroy_e:" + e.toString());
                }
            }
        }
        if (this.e != null) {
            this.e.clear();
            this.e = null;
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d885e1c1ca904b7bb5690a32de8133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d885e1c1ca904b7bb5690a32de8133");
        } else if (this.e != null) {
            this.e.remove(aVar);
        }
    }
}
