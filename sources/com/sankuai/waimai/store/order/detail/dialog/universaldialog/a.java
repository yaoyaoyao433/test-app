package com.sankuai.waimai.store.order.detail.dialog.universaldialog;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.b;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.order.prescription.b
    public final String a() {
        return "show_dialog";
    }

    @Override // com.sankuai.waimai.store.order.prescription.b
    public final void a(com.sankuai.waimai.store.order.prescription.view.b bVar, Map<String, Object> map) {
        Object[] objArr = {bVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7921a5750e6305629afe1a33a6d1b0ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7921a5750e6305629afe1a33a6d1b0ae");
        } else if (bVar.r() == null) {
        } else {
            Context context = bVar.r().getContext();
            if (com.sankuai.waimai.store.util.b.a(context)) {
                return;
            }
            OrderUniversalDialog orderUniversalDialog = new OrderUniversalDialog(context);
            String a2 = i.a(map);
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            orderUniversalDialog.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fc615ef4f76b5eed0f9c791af110bb7c", RobustBitConfig.DEFAULT_VALUE) ? (DialogModel) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fc615ef4f76b5eed0f9c791af110bb7c") : (DialogModel) i.a(a2, DialogModel.class));
        }
    }
}
