package com.meituan.android.privacy.interfaces.def.permission;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FakeActivity extends Activity {
    public static ChangeQuickRedirect a;
    @NonNull
    private final Context b;

    public FakeActivity(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8bbd40bd14f2d40b7a865329f19cd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8bbd40bd14f2d40b7a865329f19cd9");
        } else {
            this.b = context;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public PackageManager getPackageManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0cfe974cdfd9872dd5941814d8021b0", RobustBitConfig.DEFAULT_VALUE) ? (PackageManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0cfe974cdfd9872dd5941814d8021b0") : this.b.getPackageManager();
    }
}
