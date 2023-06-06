package com.meituan.android.neohybrid.neo;

import android.content.Intent;
import com.meituan.android.neohybrid.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements b.a {
    public static ChangeQuickRedirect a;
    private final int b;
    private final int c;
    private final Intent d;

    public d(int i, int i2, Intent intent) {
        this.b = i;
        this.c = i2;
        this.d = intent;
    }

    @Override // com.meituan.android.neohybrid.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838445e34ec3ead61ed52aa522a19885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838445e34ec3ead61ed52aa522a19885");
            return;
        }
        int i = this.b;
        int i2 = this.c;
        Intent intent = this.d;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "17da63d6e87afdeeb20454ba329882f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "17da63d6e87afdeeb20454ba329882f2");
        } else {
            aVar.a(i, i2, intent);
        }
    }
}
