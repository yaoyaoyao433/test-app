package com.meituan.mtwebkit.internal.update.tasks;

import android.content.pm.PackageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j extends com.meituan.mtwebkit.internal.task.a<PackageInfo> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mtwebkit.internal.task.a
    public final /* synthetic */ PackageInfo b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "620674517937b056346a3bd021523a46", RobustBitConfig.DEFAULT_VALUE) ? (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "620674517937b056346a3bd021523a46") : com.meituan.mtwebkit.internal.h.a();
    }
}
