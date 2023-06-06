package com.meituan.msc.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ae {
    public static ChangeQuickRedirect a;

    public static SharedPreferences a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d0efec651f00d02195c60b42b43dcc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d0efec651f00d02195c60b42b43dcc0");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        Context applicationContext = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "00470506c81965b9c18538afe5ab4337", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "00470506c81965b9c18538afe5ab4337") : MSCEnvHelper.getEnvInfo().getApplicationContext();
        Object[] objArr3 = {applicationContext, ContainerInfo.ENV_MSC};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        return PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f197a923281180ad9d0c9fb1d37fb453", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f197a923281180ad9d0c9fb1d37fb453") : new af(applicationContext, ContainerInfo.ENV_MSC);
    }
}
