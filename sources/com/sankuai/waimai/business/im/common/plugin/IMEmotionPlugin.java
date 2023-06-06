package com.sankuai.waimai.business.im.common.plugin;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IMEmotionPlugin extends EmotionPlugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin, com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.wm_im_emotion_icon_layer;
    }

    public IMEmotionPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bddcc6cb34e704a0519e6c949e94ea8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bddcc6cb34e704a0519e6c949e94ea8");
        }
    }

    public IMEmotionPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a26cf4ace19e898e568e6b21001411", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a26cf4ace19e898e568e6b21001411");
        }
    }

    public IMEmotionPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4704182aee047cc17fcf92ebc8c2151", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4704182aee047cc17fcf92ebc8c2151");
        }
    }
}
