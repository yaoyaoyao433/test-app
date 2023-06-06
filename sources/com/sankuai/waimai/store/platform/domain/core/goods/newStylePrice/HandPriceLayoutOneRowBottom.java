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
public class HandPriceLayoutOneRowBottom extends BaseHandPriceView {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.BaseHandPriceView
    public int getLayoutId() {
        return R.layout.wm_drug_new_style_price_one_row_bottom;
    }

    public HandPriceLayoutOneRowBottom(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ba3be607e7344992c555ba42074ccd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ba3be607e7344992c555ba42074ccd8");
        }
    }

    private HandPriceLayoutOneRowBottom(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a97f54de348720e7b27231020dae997e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a97f54de348720e7b27231020dae997e");
        }
    }

    public HandPriceLayoutOneRowBottom(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0e6c808fc7e7d39f247ac2868dd7252", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0e6c808fc7e7d39f247ac2868dd7252");
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.BaseHandPriceView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c00427dea714eb54ec36717cdfce992a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c00427dea714eb54ec36717cdfce992a");
            return;
        }
        super.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.g);
        arrayList.add(this.f);
        arrayList.add(this.d);
        arrayList.add(this.e);
        ((HandPriceOneLineLayout) findViewById(R.id.new_hand_price_layout)).setPriorityViews(arrayList);
    }
}
