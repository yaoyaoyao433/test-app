package com.sankuai.common.utils.permissionner;

import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.permissionner.requester.IPermissionRequester;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PermissionnerInfoRecorder {
    private static final String PERMISSION_NEVER_ASK_SUFFIX = "_never_ask";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final q storage;

    public PermissionnerInfoRecorder(@NonNull q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ff321c34fd7756277af0943e5755ca9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ff321c34fd7756277af0943e5755ca9");
        } else {
            this.storage = qVar;
        }
    }

    public boolean shouldShowRationale(String str, @NonNull IPermissionRequester iPermissionRequester) {
        String makePermissionKey;
        Object[] objArr = {str, iPermissionRequester};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce7c45179fe331031d5ddb4fd8c2ade", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce7c45179fe331031d5ddb4fd8c2ade")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && (makePermissionKey = makePermissionKey(str, PERMISSION_NEVER_ASK_SUFFIX)) != null) {
            boolean b = this.storage.b(makePermissionKey, false);
            boolean z = iPermissionRequester.checkSelfPermission(str) == -1;
            return b ? z && iPermissionRequester.shouldShowRequestPermissionRationale(str) : z;
        }
        return false;
    }

    public void recordPermissionNeverAsk(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "032a192b0a2e53b4d4029da1723324f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "032a192b0a2e53b4d4029da1723324f0");
            return;
        }
        String makePermissionKey = makePermissionKey(str, PERMISSION_NEVER_ASK_SUFFIX);
        if (makePermissionKey != null) {
            this.storage.a(makePermissionKey, z);
        }
    }

    private static String makePermissionKey(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c692283c744fb65a598fd39950b1ec3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c692283c744fb65a598fd39950b1ec3a");
        }
        return str + str2;
    }
}
