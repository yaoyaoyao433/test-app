package com.meituan.android.legwork.ui.base;

import android.os.Bundle;
import com.meituan.android.legwork.mvp.base.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class MVPActivity<V, P extends com.meituan.android.legwork.mvp.base.a<V>> extends BaseActivity {
    public static ChangeQuickRedirect a;
    protected P i;
    private boolean j;

    public abstract P c();

    public MVPActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "187d7439815a12d6f695980a1fbf4ba3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "187d7439815a12d6f695980a1fbf4ba3");
        } else {
            this.j = true;
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ba03bbc88c7a4ce30172c8acfa9c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ba03bbc88c7a4ce30172c8acfa9c9c");
            return;
        }
        this.i = c();
        super.onCreate(bundle);
        this.i.a(this);
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5095490d46647c69b96a2196c25f25fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5095490d46647c69b96a2196c25f25fe");
            return;
        }
        super.onResume();
        if (this.j) {
            this.j = false;
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2ad94d4624a13c660b1bc27cd34fd39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2ad94d4624a13c660b1bc27cd34fd39");
            return;
        }
        super.onDestroy();
        if (this.i != null) {
            this.i.a();
        }
        this.j = true;
    }
}
