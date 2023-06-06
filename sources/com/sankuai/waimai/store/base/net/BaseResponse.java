package com.sankuai.waimai.store.base.net;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
@SuppressLint({"SerializableCheck"})
/* loaded from: classes5.dex */
public class BaseResponse<D> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public D data;
    public String msg;
    public String subCodeString;

    public BaseResponse() {
    }

    public BaseResponse(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44b91e55f3dc9cd31a6946f5d6c2ab10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44b91e55f3dc9cd31a6946f5d6c2ab10");
            return;
        }
        this.code = i;
        this.msg = str;
    }

    public boolean isSuccess() {
        return this.data != null && this.code == 0;
    }
}
