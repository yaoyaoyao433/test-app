package com.sankuai.waimai.machpro.module;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public Map<String, MPModule> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce91d91787bc4ddedbd4e30023dc52ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce91d91787bc4ddedbd4e30023dc52ef");
        } else {
            this.b = new HashMap();
        }
    }

    public final MPModule a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc5d6f3b0e91d72ac938a698007581b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc5d6f3b0e91d72ac938a698007581b1");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.b.get(str);
    }
}
