package com.sankuai.waimai.ugc.creator.ability.preview;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.ugc.creator.base.a {
    public static ChangeQuickRedirect a;
    private FlowLineActionBarBlock b;

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "157fce4d471664e6b436d997a9e46c1f", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "157fce4d471664e6b436d997a9e46c1f") : layoutInflater.inflate(R.layout.wm_ugc_media_ability_preview_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public void b(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "475d52e7a2c8d993c5a78944546c93d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "475d52e7a2c8d993c5a78944546c93d2");
            return;
        }
        this.b = new FlowLineActionBarBlock(0);
        a(R.id.fl_preview_actionbar_container, (int) this.b);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final String[] c() {
        return this.k;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3955e75d7d2e90aa8a1364864962e69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3955e75d7d2e90aa8a1364864962e69");
        } else {
            r();
        }
    }
}
