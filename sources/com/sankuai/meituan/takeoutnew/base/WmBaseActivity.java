package com.sankuai.meituan.takeoutnew.base;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.capacity.immersed.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class WmBaseActivity extends BaseActivity {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9ae1a8d99a41886673264b77877a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9ae1a8d99a41886673264b77877a0e");
        } else {
            super.onDestroy();
        }
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {(byte) 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972d005bc60b036437580099a9d9e982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972d005bc60b036437580099a9d9e982");
            return;
        }
        a.b(this, z2);
        a.a((Activity) this, true);
    }
}
