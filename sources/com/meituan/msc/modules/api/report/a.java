package com.meituan.msc.modules.api.report;

import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ModuleName(name = "LogModule")
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;

    @MSCMethod
    public void reportLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b46c4e734dcd474aa10cb1e874302ca0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b46c4e734dcd474aa10cb1e874302ca0");
        } else {
            g.d("LogModule", str);
        }
    }
}
