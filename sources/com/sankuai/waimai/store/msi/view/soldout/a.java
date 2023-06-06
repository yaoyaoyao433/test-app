package com.sankuai.waimai.store.msi.view.soldout;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends f<GoodsSpu, MscSoldOutDialog> {
    public static ChangeQuickRedirect a;
    private final View b;

    public a(MscSoldOutDialog mscSoldOutDialog, View view) {
        super(mscSoldOutDialog);
        Object[] objArr = {mscSoldOutDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8687e44a589629c34dbe54b493a89259", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8687e44a589629c34dbe54b493a89259");
        } else {
            this.b = view;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b87ee89c10cbc19294cdd388783f7bb3", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b87ee89c10cbc19294cdd388783f7bb3") : new b(this.b);
    }
}
