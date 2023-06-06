package com.meituan.mtwebkit.internal.update.tasks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a extends com.meituan.mtwebkit.internal.task.a<com.meituan.mtwebkit.internal.update.model.a> {
    public static ChangeQuickRedirect k;

    @Override // com.meituan.mtwebkit.internal.task.a
    /* renamed from: a */
    public com.meituan.mtwebkit.internal.update.model.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d8abe059be72f3f3550e2d41888b40", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mtwebkit.internal.update.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d8abe059be72f3f3550e2d41888b40") : new com.meituan.mtwebkit.internal.update.model.a(-1);
    }
}
