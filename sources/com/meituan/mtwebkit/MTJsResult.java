package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTJsResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ResultReceiver mReceiver;
    private boolean mResult;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ResultReceiver {
        void onJsResultComplete(MTJsResult mTJsResult);
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89dd90a83ef10b9d2372208ae0dfb409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89dd90a83ef10b9d2372208ae0dfb409");
            return;
        }
        this.mResult = false;
        wakeUp();
    }

    public final void confirm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd1f0197ba28bfa423a28e1d537954d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd1f0197ba28bfa423a28e1d537954d");
            return;
        }
        this.mResult = true;
        wakeUp();
    }

    public MTJsResult(ResultReceiver resultReceiver) {
        Object[] objArr = {resultReceiver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c85048b8f006eb43400e87e872429198", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c85048b8f006eb43400e87e872429198");
        } else {
            this.mReceiver = resultReceiver;
        }
    }

    public final boolean getResult() {
        return this.mResult;
    }

    private final void wakeUp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a52c788096669b9b84d11bd8a090c9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a52c788096669b9b84d11bd8a090c9e");
        } else {
            this.mReceiver.onJsResultComplete(this);
        }
    }
}
