package com.sankuai.waimai.store.drug.goods.list.views.cell.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.util.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class MultiCellView extends SpuBaseCellView {
    public static ChangeQuickRedirect e;
    protected TextView f;

    public MultiCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603e7c421fd71cb83e9ec786efba61fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603e7c421fd71cb83e9ec786efba61fe");
        }
    }

    public MultiCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4400780d43622476b266fdc9437c824", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4400780d43622476b266fdc9437c824");
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e267ce0b0555f077d76bff173af962c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e267ce0b0555f077d76bff173af962c");
            return;
        }
        super.c();
        this.f = (TextView) this.n.findViewById(R.id.txt_stickyfood_price_unit);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9011acbfe552e061885c9d05397c6e04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9011acbfe552e061885c9d05397c6e04");
            return;
        }
        super.d();
        k();
    }

    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a20e0fd869f709cac2a4a565ce077e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a20e0fd869f709cac2a4a565ce077e");
            return;
        }
        List<GoodsSku> skuList = this.ae.getSkuList();
        if (skuList == null || skuList.size() <= 1) {
            u.c(this.f);
        } else if (i.e(Double.valueOf(this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
            u.c(this.f);
        } else {
            u.a(this.f);
            if (p.a(this.f)) {
                return;
            }
            this.f.setText(R.string.wm_sc_common_multi_goods_price_format);
            this.f.setTextColor(b.b(this.f.getContext(), R.color.wm_sg_color_BCBCBD));
        }
    }
}
