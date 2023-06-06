package com.sankuai.waimai.business.page.home.preload.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class NetBean {
    public static final int NET_DEFAULT = 0;
    public static final int NET_LOAD_FAILED = 2;
    public static final int NET_LOAD_SUCCESS = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private BaseResponse<?> mResponse;
    private int mStatus;
    private Throwable mThrowable;

    public NetBean(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0431b610d04095b1225312303bfd9e4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0431b610d04095b1225312303bfd9e4a");
            return;
        }
        this.mStatus = 0;
        this.mThrowable = th;
        this.mStatus = 2;
    }

    public NetBean(BaseResponse<?> baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c86a1d80407509b7c81fe4b96232988", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c86a1d80407509b7c81fe4b96232988");
            return;
        }
        this.mStatus = 0;
        this.mResponse = baseResponse;
        this.mStatus = 1;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public void setResponse(BaseResponse<?> baseResponse) {
        this.mResponse = baseResponse;
    }

    public BaseResponse<?> getResponse() {
        return this.mResponse;
    }

    public Throwable getThrowable() {
        return this.mThrowable;
    }

    public void setThrowable(Throwable th) {
        this.mThrowable = th;
    }
}
