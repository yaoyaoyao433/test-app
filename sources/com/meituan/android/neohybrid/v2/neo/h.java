package com.meituan.android.neohybrid.v2.neo;

import android.view.View;
import com.meituan.android.neohybrid.v2.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements b.a {
    public static ChangeQuickRedirect a;
    private final View b;

    public h(View view) {
        this.b = view;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "725080c00bd91a52fc1862b1fa4b9be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "725080c00bd91a52fc1862b1fa4b9be5");
            return;
        }
        View view = this.b;
        Object[] objArr2 = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b93689d28102042462cde6fd203320a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b93689d28102042462cde6fd203320a4");
        } else {
            aVar.a(view);
        }
    }
}
