package com.sankuai.eh.framework.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.spi.IComponent;
import com.sankuai.meituan.serviceloader.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static IComponent a(int i) {
        Object[] objArr = {10};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7666e0d82ddf042cd04fb34e7cfbb4dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (IComponent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7666e0d82ddf042cd04fb34e7cfbb4dd");
        }
        for (IComponent iComponent : b.a(IComponent.class, (String) null)) {
            if (iComponent.a() == 10) {
                return iComponent;
            }
        }
        return null;
    }
}
