package com.meituan.android.legwork.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.legwork.mvp.base.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class MVPFragment<V, P extends com.meituan.android.legwork.mvp.base.a<V>> extends BaseFragment {
    public static ChangeQuickRedirect a;
    public P b;

    public abstract P a();

    @Override // com.meituan.android.legwork.ui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e302e12dafc2fb38e259e221751b9df7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e302e12dafc2fb38e259e221751b9df7");
            return;
        }
        super.onCreate(bundle);
        this.b = a();
        this.b.a(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a06696eecf10b6374f2cc2e2acc2579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a06696eecf10b6374f2cc2e2acc2579");
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e7f3abb7c20b7fe69fae2924d644fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e7f3abb7c20b7fe69fae2924d644fb2");
            return;
        }
        super.onDestroy();
        this.b.a();
    }
}
