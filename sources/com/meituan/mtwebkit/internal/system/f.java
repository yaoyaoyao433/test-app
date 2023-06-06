package com.meituan.mtwebkit.internal.system;

import android.webkit.JsPromptResult;
import com.meituan.mtwebkit.MTJsPromptResult;
import com.meituan.mtwebkit.MTJsResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends MTJsPromptResult {
    public static ChangeQuickRedirect a;
    private JsPromptResult b;

    public f(final JsPromptResult jsPromptResult) {
        super(new MTJsResult.ResultReceiver() { // from class: com.meituan.mtwebkit.internal.system.f.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTJsResult.ResultReceiver
            public final void onJsResultComplete(MTJsResult mTJsResult) {
                Object[] objArr = {mTJsResult};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa82633599c75b6e8ef548161f7fceb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa82633599c75b6e8ef548161f7fceb6");
                } else if (mTJsResult.getResult()) {
                    jsPromptResult.confirm();
                } else {
                    jsPromptResult.cancel();
                }
            }
        });
        Object[] objArr = {jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d3b64f51423dadf4c3d390c6d64b46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d3b64f51423dadf4c3d390c6d64b46");
        } else {
            this.b = jsPromptResult;
        }
    }

    @Override // com.meituan.mtwebkit.MTJsPromptResult
    public final void confirm(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8114628bab59407a42cc2de84451ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8114628bab59407a42cc2de84451ec8");
        } else {
            this.b.confirm(str);
        }
    }
}
