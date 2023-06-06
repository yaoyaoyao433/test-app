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
public class WmGroupChatMemberPoiView extends WmGroupChatMemberView {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.im.group.View.WmGroupChatMemberView
    public int getDefaultDrawable() {
        return R.drawable.wm_im_poi_default_avatar;
    }

    public WmGroupChatMemberPoiView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a436b915e5d7d7b7cbe12cc27f983f3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a436b915e5d7d7b7cbe12cc27f983f3e");
        }
    }

    public WmGroupChatMemberPoiView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a84fb813da01ebcff804339d31cd27b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a84fb813da01ebcff804339d31cd27b");
        }
    }

    public WmGroupChatMemberPoiView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075f946447011b526772b39ef68f7492", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075f946447011b526772b39ef68f7492");
        }
    }

    @Override // com.sankuai.waimai.business.im.group.View.WmGroupChatMemberView
    public final void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67090c44dc9a4048f95fce4f41b2d62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67090c44dc9a4048f95fce4f41b2d62");
            return;
        }
        super.a(context, attributeSet);
        setMemberName("商家");
        setShadowForeground(getContext().getResources().getDrawable(R.drawable.wm_im_group_titlebar_avatar_half_shadow));
    }
}
