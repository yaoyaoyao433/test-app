package com.sankuai.meituan.android.knb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.jsbridges.base.uiextensions.BaseTitleButtonJsHandler;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class JsHostResourceProvider implements DynamicTitleParser.ResourceProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static DynamicTitleParser.ResourceProvider delegation;
    private final JsHost jsHost;

    public JsHostResourceProvider(JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1498742cda16d999feb85e7588091ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1498742cda16d999feb85e7588091ba");
        } else {
            this.jsHost = jsHost;
        }
    }

    public static void setDelegationResourceProvider(DynamicTitleParser.ResourceProvider resourceProvider) {
        delegation = resourceProvider;
    }

    @Override // com.dianping.titans.widget.DynamicTitleParser.ResourceProvider
    public final Drawable getDrawable(String str) {
        Drawable drawable;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78d74727b931cdf7552a88a6883087f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78d74727b931cdf7552a88a6883087f8");
        }
        if (delegation == null || (drawable = delegation.getDrawable(str)) == null) {
            if (this.jsHost == null) {
                return null;
            }
            Context context = this.jsHost.getContext();
            if (this.jsHost instanceof KNBJsHost) {
                TitansUIManager uIManager = ((KNBJsHost) this.jsHost).getUIManager();
                if (context == null || uIManager == null) {
                    return null;
                }
                if (BaseTitleButtonJsHandler.ACTION_TYPE_SHARE.equals(str)) {
                    return context.getResources().getDrawable(uIManager.getShareIconId());
                }
                if (BaseTitleButtonJsHandler.ACTION_TYPE_BACK.equals(str)) {
                    return context.getResources().getDrawable(uIManager.getBackIconId());
                }
                if (BaseTitleButtonJsHandler.ACTION_TYPE_SEARCH.equals(str)) {
                    return context.getResources().getDrawable(uIManager.getSearchIconId());
                }
                if (BaseTitleButtonJsHandler.ACTION_TYPE_CUSTOM_BACK.equals(str)) {
                    return context.getResources().getDrawable(uIManager.getCustomBackIconId());
                }
            }
            return null;
        }
        return drawable;
    }
}
