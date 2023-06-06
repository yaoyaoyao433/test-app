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
import com.sankuai.xm.imui.common.panel.plugin.CameraPlugin;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTCameraPlugin extends CameraPlugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.CameraPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final int getPluginIcon() {
        return R.drawable.ptim_expand_panel_camera;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.CameraPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final String getPluginName() {
        return "拍摄";
    }

    public PTCameraPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86fca7641225bfd8f1b92a2ebc33135e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86fca7641225bfd8f1b92a2ebc33135e");
        }
    }

    public PTCameraPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdff260ca4f934184c835f651cc81aad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdff260ca4f934184c835f651cc81aad");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23488e46406ba93af2494cd9e1e4fdf9", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23488e46406ba93af2494cd9e1e4fdf9") : super.b(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void ae_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c6a7e88dd8332456ab417254e2525c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c6a7e88dd8332456ab417254e2525c");
            return;
        }
        super.ae_();
        f.a(getContext(), (CharSequence) getPluginName());
    }
}
