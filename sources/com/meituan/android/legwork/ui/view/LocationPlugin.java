package com.meituan.android.legwork.ui.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.legwork.bean.im.OrderAddressView;
import com.meituan.android.legwork.common.im.g;
import com.meituan.android.legwork.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LocationPlugin extends Plugin {
    public static ChangeQuickRedirect a;
    private Context b;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.legwork_im_plugin_location_compressed;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    @NonNull
    public CharSequence getPluginName() {
        return "发送位置";
    }

    public LocationPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201f63a5ad65368930c03da64efa6d93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201f63a5ad65368930c03da64efa6d93");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e893a8c85b7b3684525b2cf3d9c36e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e893a8c85b7b3684525b2cf3d9c36e75");
            return;
        }
        com.meituan.android.legwork.statistics.a.a(getActivity(), "b_banma_s01dzpzy_mc", "c_q4u2ijua", g.a().a(g.f));
        if (g.a().b()) {
            OrderAddressView orderAddressView = g.a().d;
            String str = g.a().b;
            if (this.b == null || !(this.b instanceof Activity) || orderAddressView == null || TextUtils.isEmpty(str)) {
                return;
            }
            n.a((Activity) this.b, str, orderAddressView.lng / 1000000.0d, orderAddressView.lat / 1000000.0d, 100);
        }
    }
}
