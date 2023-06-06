package com.sankuai.waimai.business.im.group.adapter;

import android.app.Activity;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.view.OrderStatusBannerView;
import com.sankuai.waimai.business.im.group.model.WmGroupShareData;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmBaseGroupBannerAdapter implements IBannerAdapter {
    public static ChangeQuickRedirect a;
    public OrderStatusBannerView b;
    private final Activity c;

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public boolean isOverlay() {
        return false;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84bc6f0d18695ded4f7288433b7aacf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84bc6f0d18695ded4f7288433b7aacf6");
        }
    }

    public WmBaseGroupBannerAdapter(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b6aee80d57e103c4ad9b93dff0280a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b6aee80d57e103c4ad9b93dff0280a");
        } else {
            this.c = activity;
        }
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df6e44442815abd7ea1c385e4d5d321f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df6e44442815abd7ea1c385e4d5d321f");
        }
        this.b = (OrderStatusBannerView) layoutInflater.inflate(R.layout.wm_im_layout_order_status, (ViewGroup) null);
        this.b.a(this.c, 3L, WmGroupShareData.a(this.c).d);
        return this.b;
    }
}
