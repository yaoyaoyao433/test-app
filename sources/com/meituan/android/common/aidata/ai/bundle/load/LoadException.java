package com.meituan.android.common.aidata.ai.bundle.load;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.bundle.download.exception.TimeoutException;
import com.meituan.android.common.aidata.ai.bundle.exception.BaseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LoadException extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;
    private BaseException mRawException;

    public BaseException getRawException() {
        return this.mRawException;
    }

    public LoadException() {
    }

    public LoadException(BaseException baseException) {
        Object[] objArr = {baseException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3e985f44952918554fd4124dafb1bcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3e985f44952918554fd4124dafb1bcf");
        } else {
            this.mRawException = baseException;
        }
    }

    public boolean isTimeout() {
        return this.mRawException != null && (this.mRawException instanceof TimeoutException);
    }

    @Nullable
    public String getErrorDesc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07eddb6ba1985da46780b00f83217a99", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07eddb6ba1985da46780b00f83217a99");
        }
        if (this.mRawException != null) {
            return this.mRawException.getErrorDesc();
        }
        return null;
    }

    public int getErrorType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56c09a0629d5323241a1102756cc742", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56c09a0629d5323241a1102756cc742")).intValue();
        }
        if (this.mRawException != null) {
            return this.mRawException.getErrorType();
        }
        return 0;
    }
}
