package com.sankuai.waimai.business.im.group.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.model.a;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FoodSafetyGroupChatBannerAdapter implements IBannerAdapter {
    public static ChangeQuickRedirect a;
    private final a b;

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public boolean isOverlay() {
        return false;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00aeeb0a5aee0ab0048355445973f520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00aeeb0a5aee0ab0048355445973f520");
        }
    }

    public FoodSafetyGroupChatBannerAdapter(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d6d0074c89462935c9a09d7e110da5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d6d0074c89462935c9a09d7e110da5");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16eb94c0df412737c39c18fa6ae59b68", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16eb94c0df412737c39c18fa6ae59b68");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_im_bad_comment_group_banner_layout, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.tip_txt)).setText(this.b.b.d);
        return inflate;
    }
}
