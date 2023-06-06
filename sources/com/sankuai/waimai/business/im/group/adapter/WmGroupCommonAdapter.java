package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.model.WmGroupShareData;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupCommonAdapter extends WmBaseGroupCommonAdapter {
    public static ChangeQuickRedirect d;
    private WmGroupShareData g;

    public WmGroupCommonAdapter(ICommonAdapter iCommonAdapter) {
        super(iCommonAdapter);
        Object[] objArr = {iCommonAdapter};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa644890b787c205b2a9f2beec71a5ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa644890b787c205b2a9f2beec71a5ca");
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c7c2548509c81fe6d2c2c7b6e777baf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c7c2548509c81fe6d2c2c7b6e777baf");
            return;
        }
        super.init(context);
        try {
            this.g = WmGroupShareData.a(this.e);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMCommonAdapterWrapper, com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonUserInfoAdapter
    public int getDefaultAvatarDrawableResource(b bVar) {
        boolean z = true;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b9bf32090f940624f72bf9b92fcbf5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b9bf32090f940624f72bf9b92fcbf5")).intValue();
        }
        if (bVar.g != 1) {
            return bVar.g == 2 ? R.drawable.wm_im_group_user_default_avatar : super.getDefaultAvatarDrawableResource(bVar);
        } else if (bVar.b == 0 || this.g == null || this.g.f == null || this.g.f.b == null || this.g.f.b.a == null) {
            return R.drawable.wm_comment_avatar_default_in_poi;
        } else {
            long[] jArr = this.g.f.b.a;
            int length = jArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (jArr[i] == bVar.b.getFromUid()) {
                    break;
                } else {
                    i++;
                }
            }
            return z ? R.drawable.wm_im_poi_default_avatar : R.drawable.wm_im_rider_default_avatar;
        }
    }
}
