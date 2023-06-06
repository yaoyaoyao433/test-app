package com.meituan.android.paybase.fingerprint.soter.soterexternal;

import android.content.Context;
import com.meituan.android.paybase.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.paybase.asynctask.a<Object, Integer, c> {
    public static ChangeQuickRedirect a;
    public a b;
    public String c;
    private Context d;

    @Override // com.meituan.android.paybase.asynctask.b
    public final /* synthetic */ Object a(Object[] objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "d1e44b54cbe2f052323f95a552821949", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "d1e44b54cbe2f052323f95a552821949");
        }
        if (this.d != null) {
            return this.b.a(this.d);
        }
        return new c(1, this.c);
    }

    @Override // com.meituan.android.paybase.asynctask.b
    public final /* synthetic */ void a(Object obj) {
        c cVar = (c) obj;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f2ead062b66ff72942c8fb0de0967a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f2ead062b66ff72942c8fb0de0967a");
            return;
        }
        super.a((b) cVar);
        t.a("SoterGenerateKeyAsyncTask", "onPostExecute", String.valueOf(cVar));
        com.meituan.android.paybase.fingerprint.soter.a.a(cVar);
    }

    public b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a38ddfed9ebff20ab1146e2daf4a899f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a38ddfed9ebff20ab1146e2daf4a899f");
            return;
        }
        this.d = context.getApplicationContext();
        this.c = str;
    }
}
