package com.sankuai.waimai.business.knb.handlers;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.util.a;
import com.sankuai.waimai.kit.share.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShareCommonHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private b mShareContext;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f53c9c0cc30bcf0b4ba8686cb52f8e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f53c9c0cc30bcf0b4ba8686cb52f8e1");
        } else if (validateArgs()) {
            a.a(com.sankuai.waimai.business.knb.webview.b.a(jsBean().args), jsHost().getUrl());
            showShare();
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1da32d74db38624e0706da44b23f34a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1da32d74db38624e0706da44b23f34a");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.mShareContext == null || this.mShareContext.c == null) {
            return;
        }
        this.mShareContext.c.a(i, i2, intent);
    }

    private void showShare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54d728191adf5b1b5ee1f37e328719d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54d728191adf5b1b5ee1f37e328719d4");
        } else {
            jsHost().getTitleBarHost().setRRButton("", R.drawable.wm_knb_share_app, false, new View.OnClickListener() { // from class: com.sankuai.waimai.business.knb.handlers.ShareCommonHandler.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e64d9e68e3f7fcebcf98c5243dd5f3d4", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e64d9e68e3f7fcebcf98c5243dd5f3d4");
                        return;
                    }
                    Activity activity = ShareCommonHandler.this.jsHost().getActivity();
                    if (activity instanceof FragmentActivity) {
                        ShareCommonHandler.this.mShareContext = a.a(activity, null, null);
                    }
                }
            });
        }
    }
}
