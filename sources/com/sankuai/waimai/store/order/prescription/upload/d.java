package com.sankuai.waimai.store.order.prescription.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static c b;
    private static com.sankuai.waimai.ugc.image.a c;

    public static synchronized com.sankuai.waimai.ugc.image.a a() {
        synchronized (d.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6590b10ef5b69a50fef2b88b75d06625", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.ugc.image.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6590b10ef5b69a50fef2b88b75d06625");
            }
            if (c == null && b != null) {
                c = b.a();
            }
            return c;
        }
    }
}
