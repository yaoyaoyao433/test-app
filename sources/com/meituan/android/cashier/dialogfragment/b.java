package com.meituan.android.cashier.dialogfragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.meituan.android.cashier.dialogfragment.DCEPDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a;
    private final DCEPDialogFragment.DCEPDialog b;
    private final ListView c;

    private b(DCEPDialogFragment.DCEPDialog dCEPDialog, ListView listView) {
        this.b = dCEPDialog;
        this.c = listView;
    }

    public static AdapterView.OnItemClickListener a(DCEPDialogFragment.DCEPDialog dCEPDialog, ListView listView) {
        Object[] objArr = {dCEPDialog, listView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aebdc0730be4e3689cac0cad5728a0d0", RobustBitConfig.DEFAULT_VALUE) ? (AdapterView.OnItemClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aebdc0730be4e3689cac0cad5728a0d0") : new b(dCEPDialog, listView);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3209df26cdecf36abed339507bb7c652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3209df26cdecf36abed339507bb7c652");
        } else {
            DCEPDialogFragment.DCEPDialog.a(this.b, this.c, adapterView, view, i, j);
        }
    }
}
