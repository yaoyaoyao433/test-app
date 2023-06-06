package com.sankuai.waimai.business.im.group.View;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupChatMemberRiderView extends WmGroupChatMemberView {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.im.group.View.WmGroupChatMemberView
    public int getDefaultDrawable() {
        return R.drawable.wm_im_rider_default_avatar;
    }

    public WmGroupChatMemberRiderView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f93f33cfd582065c59e1fe0581aacea0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f93f33cfd582065c59e1fe0581aacea0");
        }
    }

    public WmGroupChatMemberRiderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32ace6e93021c86625995e2b3caacfb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32ace6e93021c86625995e2b3caacfb");
        }
    }

    public WmGroupChatMemberRiderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f6600a2aef873753def2c2d7dd32da8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f6600a2aef873753def2c2d7dd32da8");
        }
    }

    @Override // com.sankuai.waimai.business.im.group.View.WmGroupChatMemberView
    public final void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6f4f6891c43d678c0e6daedc584bd7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6f4f6891c43d678c0e6daedc584bd7e");
            return;
        }
        super.a(context, attributeSet);
        setMemberName("骑手");
        setShadowForeground(getContext().getResources().getDrawable(R.drawable.wm_im_group_titlebar_avatar_half_shadow));
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c380084eb225be880b04fa07aecf9caf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c380084eb225be880b04fa07aecf9caf");
        } else if (z) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }
}
