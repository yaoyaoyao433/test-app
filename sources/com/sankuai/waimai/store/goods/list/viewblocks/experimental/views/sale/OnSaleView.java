package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.sale;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OnSaleView extends BaseCustomFrameLayout {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public final View a(View view) {
        return this;
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return -1;
    }

    public OnSaleView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d99b733b0e068ced1dc8808df043d09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d99b733b0e068ced1dc8808df043d09");
        }
    }

    public OnSaleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fd85f791ef0834e3ac360279fcf2400", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fd85f791ef0834e3ac360279fcf2400");
        }
    }
}
