package com.meituan.mtwebkit.internal.system;

import android.webkit.JsResult;
import com.meituan.mtwebkit.MTJsResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends MTJsResult {
    public g(final JsResult jsResult) {
        super(new MTJsResult.ResultReceiver() { // from class: com.meituan.mtwebkit.internal.system.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTJsResult.ResultReceiver
            public final void onJsResultComplete(MTJsResult mTJsResult) {
                Object[] objArr = {mTJsResult};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cada11f412ca38ac9e6586c216437c68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cada11f412ca38ac9e6586c216437c68");
                } else if (mTJsResult.getResult()) {
                    jsResult.confirm();
                } else {
                    jsResult.cancel();
                }
            }
        });
    }
}
