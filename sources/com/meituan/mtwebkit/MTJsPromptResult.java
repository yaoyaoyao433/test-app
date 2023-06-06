package com.meituan.mtwebkit;

import com.meituan.mtwebkit.MTJsResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTJsPromptResult extends MTJsResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mStringResult;

    public void confirm(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e928c759cee92fc33fb842696fbc7cbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e928c759cee92fc33fb842696fbc7cbd");
            return;
        }
        this.mStringResult = str;
        confirm();
    }

    public MTJsPromptResult(MTJsResult.ResultReceiver resultReceiver) {
        super(resultReceiver);
        Object[] objArr = {resultReceiver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fac924b595608d358909720a9e7a525", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fac924b595608d358909720a9e7a525");
        }
    }

    public String getStringResult() {
        return this.mStringResult;
    }
}
