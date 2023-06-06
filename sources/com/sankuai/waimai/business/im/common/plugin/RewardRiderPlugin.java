package com.sankuai.waimai.business.im.common.plugin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RewardRiderPlugin extends Plugin {
    public static ChangeQuickRedirect c;
    private Context a;
    private String b;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.wm_im_ic_plugin_reward;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    @NonNull
    public CharSequence getPluginName() {
        return "打赏";
    }

    public RewardRiderPlugin(Context context, String str) {
        super(context);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422fe43e9784073af17ddd20d37c9339", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422fe43e9784073af17ddd20d37c9339");
            return;
        }
        this.a = context;
        this.b = str;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dccac7fcceec36f9786f1798131a6b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dccac7fcceec36f9786f1798131a6b34");
        } else if (TextUtils.isEmpty(this.b)) {
        } else {
            a.a(this.a, this.b);
        }
    }
}
