package com.meituan.android.legwork.ui.abbase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.legwork.mvp.base.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class ABMVPFragment<V, P extends a<V>> extends ABBaseFragment {
    public static ChangeQuickRedirect c;
    public P d;

    public abstract P f();

    @Override // com.meituan.android.legwork.ui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac1f5d395a39f6e8cb083975fa17a01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac1f5d395a39f6e8cb083975fa17a01");
            return;
        }
        super.onCreate(bundle);
        this.d = f();
        this.d.a(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afd9239a6f50455b431471541f11e5d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afd9239a6f50455b431471541f11e5d7");
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff512ad1f083ee07e9a65b8d6b6c1068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff512ad1f083ee07e9a65b8d6b6c1068");
            return;
        }
        super.onDestroy();
        this.d.a();
    }
}
