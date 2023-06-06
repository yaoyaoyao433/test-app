package com.sankuai.meituan.mapfoundation.mapuuid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4984dc88f75c6f3d52317c801ae8566f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4984dc88f75c6f3d52317c801ae8566f");
        }
        if (com.sankuai.meituan.mapfoundation.base.a.b == null) {
            com.sankuai.meituan.mapfoundation.logcenter.a.b("MapFoundation.mapContext() == null ！无法获取UUID");
            return "";
        }
        return GetUUID.getInstance().getUUID(com.sankuai.meituan.mapfoundation.base.a.b);
    }
}
