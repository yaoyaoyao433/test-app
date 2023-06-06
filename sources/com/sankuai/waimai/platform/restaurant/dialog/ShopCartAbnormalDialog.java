package com.sankuai.waimai.platform.restaurant.dialog;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopCartAbnormalDialog extends BaseDialogWithCloseIcon {
    public static ChangeQuickRedirect a;
    public List<d> d;
    private MaxHeightStatisticRecyclerView e;
    private a f;

    public ShopCartAbnormalDialog(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0630777def6eea89d24688eeb904ad5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0630777def6eea89d24688eeb904ad5a");
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon, android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5300df8ed786ff84b00d0372d918db6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5300df8ed786ff84b00d0372d918db6e");
            return;
        }
        super.onCreate(bundle);
        this.e = (MaxHeightStatisticRecyclerView) LayoutInflater.from(getContext()).inflate(R.layout.wm_restaurant_abnormal_list, (ViewGroup) null).findViewById(R.id.rv_sold_out_list);
        a(this.e, new FrameLayout.LayoutParams(-1, -2));
        this.e.setMaxHeight(com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(com.meituan.android.singleton.b.a, 380));
        this.e.addItemDecoration(new b(8, com.meituan.android.singleton.b.a));
        this.e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f = new a();
        this.e.setAdapter(this.f);
        a aVar = this.f;
        List<d> list = this.d;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8d65da6c8e68d994913c1eeb2a6615cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8d65da6c8e68d994913c1eeb2a6615cf");
            return;
        }
        aVar.b = list;
        aVar.notifyDataSetChanged();
    }
}
