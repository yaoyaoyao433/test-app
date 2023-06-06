package com.sankuai.waimai.mmp.modules.router;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BaseEmptyActivity extends Activity implements com.meituan.mmp.lib.router.d {
    public static ChangeQuickRedirect a;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3720ae64dfc62dc1961e99ba85c8a714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3720ae64dfc62dc1961e99ba85c8a714");
            return;
        }
        super.onCreate(bundle);
        finish();
    }
}
