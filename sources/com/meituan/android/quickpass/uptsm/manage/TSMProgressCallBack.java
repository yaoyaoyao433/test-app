package com.meituan.android.quickpass.uptsm.manage;

import android.os.RemoteException;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.web.AddCardToPayJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.ITsmProgressCallback;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TSMProgressCallBack extends ITsmProgressCallback.Stub {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.unionpay.tsmservice.ITsmProgressCallback
    public void onProgress(int i) throws RemoteException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70f07dfb8865efe5c7e29440037ed57e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70f07dfb8865efe5c7e29440037ed57e");
            return;
        }
        h.b("TSMProgressCallBack--" + toString() + "--进度:\t" + i);
        AddCardToPayJsHandler addCardToPayJsHandler = AddCardToPayJsHandler.get();
        if (addCardToPayJsHandler != null) {
            addCardToPayJsHandler.jsCallBack(5, 6, String.valueOf(i), null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static TSMProgressCallBack a = new TSMProgressCallBack();

        public static TSMProgressCallBack a() {
            return a;
        }
    }
}
