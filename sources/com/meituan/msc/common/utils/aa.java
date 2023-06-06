package com.meituan.msc.common.utils;

import com.meituan.msc.common.utils.z;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.mock.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements a.InterfaceC0636a {
    public static ChangeQuickRedirect a;
    private static final aa b = new aa();

    public static a.InterfaceC0636a b() {
        return b;
    }

    @Override // com.sankuai.meituan.retrofit2.mock.a.InterfaceC0636a
    public final String a() {
        Object accessDispatch;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d338a6cda359d07c7cc8d825bef0ee3", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d338a6cda359d07c7cc8d825bef0ee3");
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = z.c.a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "70c32c607502f6a7fa30a8f94392dc3e", RobustBitConfig.DEFAULT_VALUE)) {
                return MSCEnvHelper.getEnvInfo().getUUID();
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "70c32c607502f6a7fa30a8f94392dc3e");
        }
        return (String) accessDispatch;
    }
}
