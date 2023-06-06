package com.sankuai.titans.live.video;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.BuildConfig;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
/* compiled from: ProGuard */
@TitansPlugin(events = {}, name = "VideoLivePlugin", version = BuildConfig.VERSION_NAME)
/* loaded from: classes4.dex */
public class VideoLivePlugin implements ITitansPlugin {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IContainerLifeCycle getContainerLifeCycle() {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public View getDebugItem(Activity activity) {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public void onTitansReady(ITitansContext iTitansContext) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public IWebPageLifeCycle getWebPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "297436fadcd62634396e8754d0510b27", RobustBitConfig.DEFAULT_VALUE) ? (IWebPageLifeCycle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "297436fadcd62634396e8754d0510b27") : new WebPageLifeCycleAdapter() { // from class: com.sankuai.titans.live.video.VideoLivePlugin.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.protocol.lifecycle.WebPageLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
            public void onWebPageStarted(ITitansWebPageContext iTitansWebPageContext, String str, Bitmap bitmap) {
                Object[] objArr2 = {iTitansWebPageContext, str, bitmap};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f065d17f95e0bdab058d43b6bfeefd9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f065d17f95e0bdab058d43b6bfeefd9");
                    return;
                }
                Activity activity = iTitansWebPageContext.getContainerContext().getActivity();
                if (activity instanceof VideoLiveActivity) {
                    ((VideoLiveActivity) activity).onReload();
                }
            }
        };
    }
}
