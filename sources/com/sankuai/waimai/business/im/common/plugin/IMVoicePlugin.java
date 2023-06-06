package com.sankuai.waimai.business.im.common.plugin;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.panel.plugin.VoicePlugin;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMVoicePlugin extends VoicePlugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.VoicePlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.wm_im_xm_sdk_chat_set_mode_btn;
    }

    public IMVoicePlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59dac9acb4fec5e2184b04a0cd6bfe5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59dac9acb4fec5e2184b04a0cd6bfe5");
        }
    }

    public IMVoicePlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a98995afdf302ca489b153bc8a09ba37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a98995afdf302ca489b153bc8a09ba37");
        }
    }

    public IMVoicePlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247f5bc501233d2f08eddb6aab6732d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247f5bc501233d2f08eddb6aab6732d7");
        }
    }
}
