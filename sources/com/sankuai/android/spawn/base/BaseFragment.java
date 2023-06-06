package com.sankuai.android.spawn.base;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.spawn.a;
import com.sankuai.android.spawn.roboguice.RoboFragment;
import com.sankuai.android.spawn.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseFragment extends RoboFragment {
    public static ChangeQuickRedirect f;
    private b a;
    protected boolean g;

    public BaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "665b1a8fba00e2d106cea104c5109630", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "665b1a8fba00e2d106cea104c5109630");
        } else {
            this.g = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c57ca1ab79ebfd46b65e5cae0f2bec4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c57ca1ab79ebfd46b65e5cae0f2bec4c");
        } else {
            super.onResume();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16d8a256a5b71c9e7087178eab5a074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16d8a256a5b71c9e7087178eab5a074");
            return;
        }
        super.onCreate(bundle);
        this.a = a.a();
    }
}
