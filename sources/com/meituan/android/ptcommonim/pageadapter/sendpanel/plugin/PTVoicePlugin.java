package com.meituan.android.ptcommonim.pageadapter.sendpanel.plugin;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.panel.plugin.VoicePlugin;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTVoicePlugin extends VoicePlugin {
    public static ChangeQuickRedirect a;

    public PTVoicePlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4bc79481fff86765087e70a2dd75b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4bc79481fff86765087e70a2dd75b7");
        }
    }

    public PTVoicePlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a7c07c54d2e605547b88306dc7dee4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a7c07c54d2e605547b88306dc7dee4");
        }
    }

    public PTVoicePlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "787c46e1313586333a7b87bbdf6998e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "787c46e1313586333a7b87bbdf6998e4");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void ae_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d3365caa2e15ee4fd3c6a39691e78c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d3365caa2e15ee4fd3c6a39691e78c1");
            return;
        }
        super.ae_();
        f.a(getContext(), getPluginName());
    }
}
