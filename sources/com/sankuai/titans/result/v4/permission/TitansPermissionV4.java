package com.sankuai.titans.result.v4.permission;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.v4.GetResultV4;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansPermissionV4 extends GetResultV4<GetPermissionFragmentV4> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public TitansPermissionV4(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24a2adbaba613ffa703b1c6dc0e82dcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24a2adbaba613ffa703b1c6dc0e82dcc");
        }
    }

    @Override // com.sankuai.titans.result.v4.GetResultV4
    public GetPermissionFragmentV4 newFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7588e5d87f005213be6a2a6f048a7156", RobustBitConfig.DEFAULT_VALUE) ? (GetPermissionFragmentV4) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7588e5d87f005213be6a2a6f048a7156") : new GetPermissionFragmentV4();
    }

    public void requestPermission(String[] strArr, int i, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {strArr, Integer.valueOf(i), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11973d46eb33176f1ecd5b67943b452d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11973d46eb33176f1ecd5b67943b452d");
        } else if (strArr == null || strArr.length == 0) {
            iRequestPermissionCallback.onResult(false, 0);
        } else {
            getFragment().requestPermission(strArr, i, iRequestPermissionCallback);
        }
    }
}
