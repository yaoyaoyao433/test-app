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
public class BadCommentGroupChatBannerAdapter implements IBannerAdapter {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca234dfee730de9dd6b4cf2aaaa5ab77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca234dfee730de9dd6b4cf2aaaa5ab77");
        }
    }

    public BadCommentGroupChatBannerAdapter(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15415eb1ef3111cb2cf74476c38deb56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15415eb1ef3111cb2cf74476c38deb56");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a479e426c10872806717ab698a3694b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a479e426c10872806717ab698a3694b3");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_im_bad_comment_group_banner_layout, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.tip_txt)).setText(this.b.b.d);
        return inflate;
    }
}
