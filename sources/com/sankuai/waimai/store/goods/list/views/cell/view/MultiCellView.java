package com.sankuai.waimai.store.goods.list.views.cell.view;

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
    public static ChangeQuickRedirect b;
    protected TextView c;

    public MultiCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640f44c6b7ec9c397d4cfe3a1b9557dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640f44c6b7ec9c397d4cfe3a1b9557dd");
        }
    }

    public MultiCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e96b1e0d262bf9c1b0bced3a916aab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e96b1e0d262bf9c1b0bced3a916aab");
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1899d84646d5af431e8a47b28893d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1899d84646d5af431e8a47b28893d96");
            return;
        }
        super.c();
        this.c = (TextView) this.n.findViewById(R.id.txt_stickyfood_price_unit);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f04096339eb5e110fc42402da1592dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f04096339eb5e110fc42402da1592dc");
            return;
        }
        super.d();
        k();
    }

    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096d38d6eac8f5b1d11c76c8f1306136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096d38d6eac8f5b1d11c76c8f1306136");
            return;
        }
        List<GoodsSku> skuList = this.ae.getSkuList();
        if (skuList == null || skuList.size() <= 1) {
            u.c(this.c);
        } else if (i.e(Double.valueOf(this.ae.getOriginPrice()), Double.valueOf(0.0d))) {
            u.c(this.c);
        } else {
            u.a(this.c);
            if (p.a(this.c)) {
                return;
            }
            this.c.setText(R.string.wm_sc_common_multi_goods_price_format);
            this.c.setTextColor(b.b(this.c.getContext(), R.color.wm_sg_color_BCBCBD));
        }
    }
}
