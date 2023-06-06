package com.sankuai.titans.result.app.permission;

import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.PermissionResultCode;
import com.sankuai.titans.result.app.GetResultFragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetPermissionFragment extends GetResultFragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IRequestPermissionCallback mCallback;

    @Override // com.sankuai.titans.result.app.GetResultFragment
    public void handlePermissionResult(@NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92bdbb43c0b70a5cf85f11452c894d21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92bdbb43c0b70a5cf85f11452c894d21");
            return;
        }
        super.handlePermissionResult(strArr, iArr);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14bb1d23b22221dfef75f3d9a2508336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14bb1d23b22221dfef75f3d9a2508336");
            return;
        }
        this.mCallback = iRequestPermissionCallback;
        requestPermission(strArr, i);
    }
}
