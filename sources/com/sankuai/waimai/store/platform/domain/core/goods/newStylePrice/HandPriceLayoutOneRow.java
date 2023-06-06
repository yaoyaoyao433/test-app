package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HandPriceLayoutOneRow extends BaseHandPriceView {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.BaseHandPriceView
    public int getLayoutId() {
        return R.layout.wm_drug_new_style_price_one_row;
    }

    public HandPriceLayoutOneRow(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "865ed253a2223a876b00890f9c83a7fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "865ed253a2223a876b00890f9c83a7fc");
        }
    }

    public HandPriceLayoutOneRow(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e45698220d6b2ccad40e7ab6aef418", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e45698220d6b2ccad40e7ab6aef418");
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.BaseHandPriceView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc99d3320a4c0d2dd028a66541ef9c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc99d3320a4c0d2dd028a66541ef9c47");
            return;
        }
        super.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.g);
        arrayList.add(this.f);
        arrayList.add(this.e);
        ((HandPriceOneLineLayout) findViewById(R.id.new_hand_pirce_layout)).setPriorityViews(arrayList);
    }
}
