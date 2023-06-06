package com.sankuai.titans.result.v4.permission;

import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.PermissionResultCode;
import com.sankuai.titans.result.v4.GetResultFragmentV4;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetPermissionFragmentV4 extends GetResultFragmentV4 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IRequestPermissionCallback mCallback;

    @Override // com.sankuai.titans.result.v4.GetResultFragmentV4
    public void handlePermissionResult(@NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e046d2c135a5179f3497343aac0a92b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e046d2c135a5179f3497343aac0a92b");
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (iArr[i] != 0 && this.mCallback != null) {
                this.mCallback.onResult(false, PermissionResultCode.getResultCode(ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), strArr[i]) ? -7 : -4));
                return;
            }
        }
        if (this.mCallback != null) {
            this.mCallback.onResult(true, PermissionResultCode.getResultCode(2));
        }
    }

    public void requestPermission(String[] strArr, int i, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {strArr, Integer.valueOf(i), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4df84fd755dd6d3ceb7d5fb0eb3e6dc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4df84fd755dd6d3ceb7d5fb0eb3e6dc9");
            return;
        }
        this.mCallback = iRequestPermissionCallback;
        requestPermission(strArr, i);
    }
}
