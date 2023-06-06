package com.sankuai.waimai.business.im.common.plugin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.android.bus.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.rxbus.c;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ChooseLocationPlugin extends Plugin {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.wm_im_ic_plugin_location;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    @NonNull
    public CharSequence getPluginName() {
        return "发送位置";
    }

    public ChooseLocationPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "486732fe0273c2d8cc083474e85f597a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "486732fe0273c2d8cc083474e85f597a");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6cc742e6fd976fe8a4e4f8b8f44cef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6cc742e6fd976fe8a4e4f8b8f44cef8");
        } else {
            a.a().c(new c(c.a, null));
        }
    }
}
