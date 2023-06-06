package com.sankuai.xm.imui.common.adapter;

import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v7.content.res.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DefaultMsgListAdapter implements IMsgListAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.adapter.IMsgListAdapter
    public CharSequence getLoadingLabel() {
        return null;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IMsgListAdapter
    public CharSequence getPullLabel() {
        return null;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IMsgListAdapter
    public CharSequence getReleaseLabel() {
        return null;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IMsgListAdapter
    public Drawable getLoadingDrawable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a701e1210d3994906f2a967ba7028ea", 6917529027641081856L) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a701e1210d3994906f2a967ba7028ea") : b.b(f.m().g(), R.drawable.xm_sdk_vd_ic_loading);
    }
}
