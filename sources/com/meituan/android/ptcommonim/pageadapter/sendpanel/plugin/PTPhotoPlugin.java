package com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTPhotoPlugin extends PhotoPlugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final int getPluginIcon() {
        return R.drawable.ptim_expand_panel_photo;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final String getPluginName() {
        return "相册";
    }

    public PTPhotoPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2b07ce55412f37f6bfb5ce54b3c1d0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2b07ce55412f37f6bfb5ce54b3c1d0e");
        }
    }

    public PTPhotoPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21530a9bdaa3b4e8278cb58a5f008a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21530a9bdaa3b4e8278cb58a5f008a6");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0da123dd7af6efe58be913c6fea97e94", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0da123dd7af6efe58be913c6fea97e94") : super.b(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void ae_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f207bfddda158ba4815d34fdd11c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f207bfddda158ba4815d34fdd11c54");
            return;
        }
        super.ae_();
        f.a(getContext(), (CharSequence) getPluginName());
    }
}
