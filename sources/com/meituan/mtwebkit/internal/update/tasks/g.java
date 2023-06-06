package com.meituan.mtwebkit.internal.update.tasks;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends com.meituan.mtwebkit.internal.task.a<Boolean> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.mtwebkit.internal.task.a
    /* renamed from: a */
    public Boolean b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d814bf750a894104439a24ee712b3f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d814bf750a894104439a24ee712b3f7");
        }
        com.sankuai.meituan.takeoutnew.util.aop.b.a(com.meituan.mtwebkit.internal.a.a(), new Intent("com.meituan.mtwebkit.downloadCompleteReceiver"));
        return Boolean.TRUE;
    }
}
