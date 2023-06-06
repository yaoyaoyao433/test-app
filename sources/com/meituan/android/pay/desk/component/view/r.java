package com.meituan.android.pay.desk.component.view;

import android.view.View;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final q b;
    private final com.meituan.android.pay.common.selectdialog.b c;

    private r(q qVar, com.meituan.android.pay.common.selectdialog.b bVar) {
        this.b = qVar;
        this.c = bVar;
    }

    public static View.OnClickListener a(q qVar, com.meituan.android.pay.common.selectdialog.b bVar) {
        Object[] objArr = {qVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fff39ba7617c4885ab2c7d8c61acfeb", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fff39ba7617c4885ab2c7d8c61acfeb") : new r(qVar, bVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab978de70632e7917b7171754e2aa28", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab978de70632e7917b7171754e2aa28");
            return;
        }
        q qVar = this.b;
        com.meituan.android.pay.common.selectdialog.b bVar = this.c;
        Object[] objArr2 = {qVar, bVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8b6fab39214bd9231430ca18cae30688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8b6fab39214bd9231430ca18cae30688");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pypcknl9", (Map<String, Object>) null);
        if (qVar.d != null) {
            qVar.d.a(view);
        }
        qVar.c.postDelayed(s.a(qVar, SelectBankDialogFragment.a(bVar, com.meituan.android.pay.common.payment.utils.d.b(bVar), SelectBankDialog.c.BACK, false, 0)), 100L);
    }
}
