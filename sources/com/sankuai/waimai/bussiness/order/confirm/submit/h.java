package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.bussiness.order.confirm.request.update.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PreviewSubmitModel.ButtonItem b;
    private final a.b c;

    private h(PreviewSubmitModel.ButtonItem buttonItem, a.b bVar) {
        this.b = buttonItem;
        this.c = bVar;
    }

    public static DialogInterface.OnClickListener a(PreviewSubmitModel.ButtonItem buttonItem, a.b bVar) {
        Object[] objArr = {buttonItem, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7897867d52dee2472a2489b7e659e730", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7897867d52dee2472a2489b7e659e730") : new h(buttonItem, bVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e0d4b0ddf2068c0bf205ae4262db64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e0d4b0ddf2068c0bf205ae4262db64");
            return;
        }
        PreviewSubmitModel.ButtonItem buttonItem = this.b;
        a.b bVar = this.c;
        Object[] objArr2 = {buttonItem, bVar, dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c680722715d9ca1399cc482a1614a2a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c680722715d9ca1399cc482a1614a2a7");
            return;
        }
        if (buttonItem.action == 7 && bVar != null) {
            bVar.d();
        }
        dialogInterface.dismiss();
    }
}
