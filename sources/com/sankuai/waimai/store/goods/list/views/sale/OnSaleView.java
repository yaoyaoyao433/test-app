package com.sankuai.waimai.store.goods.list.views.sale;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.goods.list.views.sale.sub.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OnSaleView extends BaseCustomFrameLayout {
    public static ChangeQuickRedirect e;
    public a f;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097f0028ca0da050956b1bc8f0986f11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097f0028ca0da050956b1bc8f0986f11");
        }
    }

    public OnSaleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86bb93a8ad0a35d4707255e129c501e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86bb93a8ad0a35d4707255e129c501e7");
        }
    }

    public OnSaleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3111925632b7a1749bbc778a88f8c75b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3111925632b7a1749bbc778a88f8c75b");
        }
    }

    @TargetApi(21)
    public OnSaleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106d01449c338d5881e6804777d38fdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106d01449c338d5881e6804777d38fdc");
        }
    }
}
