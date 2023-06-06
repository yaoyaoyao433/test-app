package com.sankuai.waimai.store.shopping.patchwork.adapter.shop;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopPatchworkListSpuCell extends MultiCellView {
    public static ChangeQuickRedirect a;
    private TextView d;

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public int getLayoutId() {
        return R.layout.wm_st_shopcart_patchwork_list_item;
    }

    public ShopPatchworkListSpuCell(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9742996f4fbb13d64cd570daff70e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9742996f4fbb13d64cd570daff70e1");
        }
    }

    public ShopPatchworkListSpuCell(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569aeeb3d72403504668a8d50fc0118b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569aeeb3d72403504668a8d50fc0118b");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfecb9de223597ec26d3d654df076be1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfecb9de223597ec26d3d654df076be1");
            return;
        }
        super.c();
        this.d = (TextView) findViewById(R.id.tv_sold_count);
        findViewById(R.id.root_food_count_view).setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.shopping.patchwork.adapter.shop.ShopPatchworkListSpuCell.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a8cca414a8ed39f2cbd47dafc0a32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a8cca414a8ed39f2cbd47dafc0a32d");
            return;
        }
        super.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5322361f5a11051e47c7d76908ee0cfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5322361f5a11051e47c7d76908ee0cfd");
        } else if (this.ae == null) {
        } else {
            if (TextUtils.isEmpty(this.ae.getMonthSaledContent())) {
                this.d.setVisibility(4);
                return;
            }
            this.d.setVisibility(0);
            this.d.setText(this.ae.getMonthSaledContent());
        }
    }
}
