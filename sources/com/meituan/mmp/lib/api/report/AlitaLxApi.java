package com.meituan.mmp.lib.api.report;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.extension.ExtensionPrivateApiFactory;
import com.meituan.mmp.lib.api.report.AlitaLxModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AlitaLxApi implements ExtensionPrivateApiFactory {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.extension.a
    public final String b() {
        return "Alita_LX";
    }

    @Override // com.meituan.mmp.lib.api.extension.a
    public final String[] c() {
        return new String[0];
    }

    @Override // com.meituan.mmp.lib.api.e
    public final ApiFunction<?, ?> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1efd33cb7cdd50ea0ff45a21e6b9025", RobustBitConfig.DEFAULT_VALUE) ? (ApiFunction) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1efd33cb7cdd50ea0ff45a21e6b9025") : new AlitaLxModule.AlitaLxLog();
    }
}
