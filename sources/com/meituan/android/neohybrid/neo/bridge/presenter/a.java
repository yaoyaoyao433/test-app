package com.meituan.android.neohybrid.neo.bridge.presenter;

import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a extends b {
    public static ChangeQuickRedirect a;

    public abstract void a(NeoBridgeBean neoBridgeBean);

    public abstract String b(NeoBridgeBean neoBridgeBean);

    public a(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "612dca4cd4a5c28ef99cd2dea899158a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "612dca4cd4a5c28ef99cd2dea899158a");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public String b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8c6cf90ca3dda0faa334a3d7c0eb9d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8c6cf90ca3dda0faa334a3d7c0eb9d8");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c22a7efb9b9208e7107cd591343510b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c22a7efb9b9208e7107cd591343510b");
        }
        if (this.d == null || e() == null) {
            return a("AsyncBridgePresenter.exec: mJsData or getNeoCompat is null.");
        }
        NeoBridgeBean neoBridgeBean = (NeoBridgeBean) com.meituan.android.neohybrid.util.gson.b.a().fromJson(this.d, (Class<Object>) NeoBridgeBean.class);
        if (neoBridgeBean == null) {
            return a("AsyncBridgePresenter.exec: neoBridgeBean is null.");
        }
        String b = b(neoBridgeBean);
        if (b != null) {
            return b;
        }
        a(neoBridgeBean);
        return i();
    }
}
