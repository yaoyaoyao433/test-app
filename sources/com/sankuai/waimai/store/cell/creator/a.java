package com.sankuai.waimai.store.cell.creator;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;
    private CellUiConfig b;

    @NonNull
    public abstract com.sankuai.waimai.store.cell.core.a b(Context context);

    public a(CellUiConfig cellUiConfig) {
        Object[] objArr = {cellUiConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30583ef10d31c654102389b6ae33c865", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30583ef10d31c654102389b6ae33c865");
            return;
        }
        this.b = cellUiConfig;
        if (this.b == null) {
            this.b = CellUiConfig.a();
        }
    }

    @Override // com.sankuai.waimai.store.cell.creator.c
    public final com.sankuai.waimai.store.cell.core.a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc0103b79dd240a9370bab7726d9329", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.cell.core.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc0103b79dd240a9370bab7726d9329");
        }
        com.sankuai.waimai.store.cell.core.a b = b(context);
        b.setCellConfig(this.b);
        return b;
    }
}
