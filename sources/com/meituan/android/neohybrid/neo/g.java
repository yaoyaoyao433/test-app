package com.meituan.android.neohybrid.neo;

import android.view.View;
import com.meituan.android.neohybrid.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements b.a {
    public static ChangeQuickRedirect a;
    private final View b;

    public g(View view) {
        this.b = view;
    }

    @Override // com.meituan.android.neohybrid.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c8d7c114f963d96637ced790ee1f9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c8d7c114f963d96637ced790ee1f9b");
            return;
        }
        View view = this.b;
        Object[] objArr2 = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "62175078c39a7f52fbce232dad08f46d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "62175078c39a7f52fbce232dad08f46d");
        } else {
            aVar.a(view);
        }
    }
}
