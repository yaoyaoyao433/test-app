package com.sankuai.waimai.store.im.base.plugin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.xm.imui.common.panel.SendPanel;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ImUserGoodsPlugin extends Plugin {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.wm_sg_im_user_goods;
    }

    public ImUserGoodsPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313f2c14aa080a2629ceaaaff6f47598", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313f2c14aa080a2629ceaaaff6f47598");
        }
    }

    public ImUserGoodsPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9febbbeae7ecbb57812f3ca65c7d8dba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9febbbeae7ecbb57812f3ca65c7d8dba");
        }
    }

    public ImUserGoodsPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab25a1c8602bc5ad069a15030735055", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab25a1c8602bc5ad069a15030735055");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a(SendPanel sendPanel) {
        Object[] objArr = {sendPanel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732fb367fa5e599b3a057085fb773a6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732fb367fa5e599b3a057085fb773a6c");
            return;
        }
        super.a(sendPanel);
        View iconView = getIconView();
        if (iconView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        int a2 = h.a(getContext(), 32.0f);
        layoutParams.width = a2;
        layoutParams.height = a2;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db8fdf04b014b91bd149f963e6299f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db8fdf04b014b91bd149f963e6299f0");
            return;
        }
        b.a(d.a, "b_waimai_9ohcugng_mc").a("poi_id", this.c).a();
        if (t.a(this.b) || p.a(getContext())) {
            return;
        }
        com.sankuai.waimai.store.router.d.a(getContext(), this.b);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    @NonNull
    public CharSequence getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45e9b48e0e68d812e87c49568007034", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45e9b48e0e68d812e87c49568007034") : getResources().getString(R.string.wm_sg_im_user_goods_plugin);
    }
}
