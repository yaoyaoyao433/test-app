package com.sankuai.titans.result.app.permission;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.app.GetResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansPermission extends GetResult<GetPermissionFragment> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public TitansPermission(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d645a42dc552199be77c6948fca8086", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d645a42dc552199be77c6948fca8086");
        }
    }

    public void requestPermission(String[] strArr, int i, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {strArr, Integer.valueOf(i), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a272dcda85de11858b6a98cbfba30a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a272dcda85de11858b6a98cbfba30a12");
        } else if (strArr == null || strArr.length == 0) {
            iRequestPermissionCallback.onResult(false, 0);
        } else {
            getFragment().requestPermission(strArr, i, iRequestPermissionCallback);
        }
    }

    @Override // com.sankuai.titans.result.app.GetResult
    public GetPermissionFragment newFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f71c6ec1d4000d33fbade7086188920b", RobustBitConfig.DEFAULT_VALUE) ? (GetPermissionFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f71c6ec1d4000d33fbade7086188920b") : new GetPermissionFragment();
    }
}
