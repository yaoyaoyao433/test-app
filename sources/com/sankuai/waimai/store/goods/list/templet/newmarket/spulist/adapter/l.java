package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.activities.StoreActivityInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.DescriptionBarInfo;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class l extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect b;
    private View a;
    private TextView c;

    public l(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7c41de5cb978ca7accd2765d3e44eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7c41de5cb978ca7accd2765d3e44eb");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d4e3e600a73ab47b408426d1bcbce8b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d4e3e600a73ab47b408426d1bcbce8b") : layoutInflater.inflate(R.layout.wm_st_poi_market_adapter_slogen_header, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b7dc5452214f3251e008a6255ff779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b7dc5452214f3251e008a6255ff779");
            return;
        }
        super.onViewCreated();
        this.a = this.mView.findViewById(R.id.root_view);
        this.c = (TextView) this.mView.findViewById(R.id.txt_slogen_header_content);
    }

    public final void a(k kVar, int i, int i2) {
        GoodsPoiCategory goodsPoiCategory;
        DescriptionBarInfo descriptionBarInfo;
        Object[] objArr = {kVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d59fe8c4812345ead99d0166e4779a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d59fe8c4812345ead99d0166e4779a");
        } else if (kVar == null || (goodsPoiCategory = kVar.b) == null) {
        } else {
            if (i2 == 0) {
                if (goodsPoiCategory.activityInfo == null) {
                    this.a.setVisibility(8);
                    return;
                }
                if (goodsPoiCategory.activityInfo.viewType == 0) {
                    a(goodsPoiCategory.activityInfo);
                } else {
                    b(goodsPoiCategory.activityInfo);
                }
                this.c.setText(com.sankuai.waimai.store.util.l.a(goodsPoiCategory.activityInfo.activityText, "#FFA200"));
            } else if (i2 != 1 || (descriptionBarInfo = goodsPoiCategory.mDescriptionBar) == null || com.sankuai.shangou.stone.util.t.a(descriptionBarInfo.content)) {
            } else {
                a(descriptionBarInfo.backgroundColor, descriptionBarInfo.contentColor);
                this.c.setText(descriptionBarInfo.content);
            }
        }
    }

    private void a(StoreActivityInfo storeActivityInfo) {
        int a;
        int a2;
        Object[] objArr = {storeActivityInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d794c14e6c41d12eb52bd022467c6ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d794c14e6c41d12eb52bd022467c6ba7");
            return;
        }
        if (com.sankuai.shangou.stone.util.t.a(storeActivityInfo.textBgColor)) {
            a = com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_FFEDED);
        } else {
            a = com.sankuai.shangou.stone.util.d.a(storeActivityInfo.textBgColor, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_FFEDED));
        }
        if (com.sankuai.shangou.stone.util.t.a(storeActivityInfo.textColor)) {
            a2 = com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_F4A26);
        } else {
            a2 = com.sankuai.shangou.stone.util.d.a(storeActivityInfo.textColor, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_F4A26));
        }
        this.a.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.mContext, 4.0f)).c(a).a());
        this.c.setTextColor(a2);
    }

    private void b(StoreActivityInfo storeActivityInfo) {
        Object[] objArr = {storeActivityInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a75add0ae7197cd64653e0eb67d4aca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a75add0ae7197cd64653e0eb67d4aca");
            return;
        }
        String str = "";
        String str2 = "";
        if (storeActivityInfo != null) {
            str = storeActivityInfo.textColor;
            str2 = storeActivityInfo.textBgColor;
        }
        this.a.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.mContext, 4.0f)).c(com.sankuai.shangou.stone.util.d.a(str2, ContextCompat.getColor(this.c.getContext(), R.color.wm_sg_color_0fffa200))).a());
        this.c.setTextColor(com.sankuai.shangou.stone.util.d.a(str, ContextCompat.getColor(this.c.getContext(), R.color.wm_sg_color_666460)));
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516300db9d5b9eed8832177bd174576d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516300db9d5b9eed8832177bd174576d");
            return;
        }
        this.a.setBackground(new e.a().a(getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4)).c(com.sankuai.shangou.stone.util.d.a(str, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_white))).a());
        this.c.setTextColor(com.sankuai.shangou.stone.util.d.a(str2, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sc_color_222426)));
    }
}
