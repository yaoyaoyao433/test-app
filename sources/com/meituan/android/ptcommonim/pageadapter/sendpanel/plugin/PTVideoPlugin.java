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
import com.sankuai.xm.imui.common.panel.plugin.VideoPlugin;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTVideoPlugin extends VideoPlugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.VideoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final int getPluginIcon() {
        return R.drawable.ptim_expand_panel_video;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.VideoPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final String getPluginName() {
        return "视频";
    }

    public PTVideoPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7277e72fdde1b8749cc37de722b3843", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7277e72fdde1b8749cc37de722b3843");
        }
    }

    public PTVideoPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc45086929755914ae233618ee092ce2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc45086929755914ae233618ee092ce2");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ac4205c3bf6448fb81aa3d3145fad3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ac4205c3bf6448fb81aa3d3145fad3") : super.b(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void ae_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dcc1dfc54f2c8c88f0251250fe95e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dcc1dfc54f2c8c88f0251250fe95e67");
            return;
        }
        super.ae_();
        f.a(getContext(), (CharSequence) getPluginName());
    }
}
