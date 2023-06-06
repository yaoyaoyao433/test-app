package com.meituan.mmp.lib.utils;

import com.meituan.mmp.lib.utils.aa;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.mock.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements a.InterfaceC0636a {
    public static ChangeQuickRedirect a;
    private static final ab b = new ab();

    public static a.InterfaceC0636a b() {
        return b;
    }

    @Override // com.sankuai.meituan.retrofit2.mock.a.InterfaceC0636a
    public final String a() {
        Object accessDispatch;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "102714314cb4a59a5e002e95775c7bf0", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "102714314cb4a59a5e002e95775c7bf0");
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = aa.c.a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6afdc21a80ef3654d5c49925b2108011", RobustBitConfig.DEFAULT_VALUE)) {
                return MMPEnvHelper.getEnvInfo().getUUID();
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6afdc21a80ef3654d5c49925b2108011");
        }
        return (String) accessDispatch;
    }
}
