package com.meituan.mtwebkit.internal.update.tasks;

import android.content.pm.PackageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends com.meituan.mtwebkit.internal.task.a<PackageInfo> {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends Exception {
    }

    @Override // com.meituan.mtwebkit.internal.task.a
    public final /* synthetic */ PackageInfo b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef6f3102140a8cce8b46d9c5edb202b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef6f3102140a8cce8b46d9c5edb202b");
        }
        if (com.meituan.mtwebkit.internal.l.c() != -1) {
            throw new a();
        }
        return com.meituan.mtwebkit.internal.h.a();
    }
}
