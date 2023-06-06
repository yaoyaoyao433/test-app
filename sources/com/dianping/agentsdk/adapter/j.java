package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dianping.agentsdk.framework.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends n<x> {
    public static ChangeQuickRedirect a;

    public j(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, x xVar) {
        super(context, cVar, xVar);
        Object[] objArr = {context, cVar, xVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b3e9234deb945473a1c0099099ba84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b3e9234deb945473a1c0099099ba84");
        }
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    public final long getItemId(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2aad1940cef9ffd7bda966ce954657", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2aad1940cef9ffd7bda966ce954657")).longValue();
        }
        if (this.extraInterface != 0) {
            return ((x) this.extraInterface).getItemId(i, i2);
        }
        return super.getItemId(i, i2);
    }
}
