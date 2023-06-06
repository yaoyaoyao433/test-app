package com.sankuai.waimai.business.im.common.plugin;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMExtraPlugin extends ExtraPlugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.wm_im_xm_sdk_chat_plugin_btn;
    }

    public IMExtraPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4375e301598616eefd5bae4584f38f96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4375e301598616eefd5bae4584f38f96");
        }
    }

    public IMExtraPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc1bc655a48f94eeddf29ba024088f39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc1bc655a48f94eeddf29ba024088f39");
        }
    }

    public IMExtraPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "168442b882b37bd33520a510fb14d222", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "168442b882b37bd33520a510fb14d222");
        }
    }
}
