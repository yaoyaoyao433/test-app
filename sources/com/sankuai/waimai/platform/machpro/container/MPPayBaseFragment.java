package com.sankuai.waimai.platform.machpro.container;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPPayBaseFragment extends MPBaseFragment {
    public static ChangeQuickRedirect a;
    public MPJSCallBack b;

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a0f6b1783205d1ed8f2432ad7b14a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a0f6b1783205d1ed8f2432ad7b14a1c");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && this.b != null) {
            if (i2 == -1) {
                if (intent != null && f.a(intent, "result", -1) == 1) {
                    a("success");
                } else {
                    a("fail");
                }
            } else {
                a("cancel");
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8175db7fb768be2d2fdf06b7fa9eb9a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8175db7fb768be2d2fdf06b7fa9eb9a9");
        } else if (this.b == null) {
        } else {
            MachMap machMap = new MachMap();
            machMap.put("status", str);
            this.b.invoke(machMap);
        }
    }
}
