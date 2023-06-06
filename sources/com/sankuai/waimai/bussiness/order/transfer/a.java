package com.sankuai.waimai.bussiness.order.transfer;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.transfer.single.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a9ef5bcd06e3a332ae24e19142cc05f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a9ef5bcd06e3a332ae24e19142cc05f")).booleanValue() : 14 == dVar.e && dVar.h == 2;
    }
}
