package com.meituan.msi.api.network;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.l;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NetworkTypeApi implements IMsiApi, l {
    public static ChangeQuickRedirect a;
    private boolean b;
    private String c;
    private final Context d;

    @MsiApiMethod(isCallback = true, name = "offNetworkStatusChange")
    public void offNetworkStatusChange(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onNetworkStatusChange", response = NetworkStatusChangeEvent.class)
    public void onNetworkStatusChange(MsiContext msiContext) {
    }

    public NetworkTypeApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e7b7c25ce15636f1110fec895c07641", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e7b7c25ce15636f1110fec895c07641");
            return;
        }
        this.b = false;
        this.c = "none";
        this.d = com.meituan.msi.a.f();
    }

    @MsiApiMethod(name = "getNetworkType", request = NetworkTypeParam.class, response = NetworkTypeApiResponse.class)
    public synchronized void getNetworkType(NetworkTypeParam networkTypeParam, MsiContext msiContext) {
        String str;
        Object[] objArr = {networkTypeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67798e9179fcdadd7ef15204d53820b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67798e9179fcdadd7ef15204d53820b6");
            return;
        }
        String str2 = "";
        if (networkTypeParam != null && networkTypeParam._mt != null) {
            str2 = networkTypeParam._mt.sceneToken;
        }
        if (!this.b || "none".equals(this.c)) {
            this.c = s.a(this.d, str2);
            this.b = s.b(this.d);
        }
        NetworkTypeApiResponse networkTypeApiResponse = new NetworkTypeApiResponse();
        if (!com.meituan.msi.a.h()) {
            Object[] objArr2 = {this.d};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "835f2a772b8a61ee42e574dc8fcf45a5", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "835f2a772b8a61ee42e574dc8fcf45a5");
            } else {
                String lowerCase = "".toLowerCase();
                if (lowerCase.contains("beta")) {
                    str = "Beta";
                } else if (lowerCase.contains("stage")) {
                    str = "Stage";
                } else if (lowerCase.contains("test")) {
                    str = "Test";
                } else {
                    str = lowerCase.contains(GetAppInfoJsHandler.PACKAGE_TYPE_DEV) ? "Dev" : "Prod";
                }
            }
            networkTypeApiResponse.networkEnv = str;
        }
        networkTypeApiResponse.networkType = this.c;
        com.meituan.msi.log.a.b(networkTypeApiResponse.networkType, msiContext.request);
        msiContext.onSuccess(networkTypeApiResponse);
    }

    public final synchronized void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf559b646517c0cb8bf0b5d13238b59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf559b646517c0cb8bf0b5d13238b59");
            return;
        }
        if (this.b != z) {
            this.b = z;
        }
        if (!str.equalsIgnoreCase(this.c)) {
            this.c = str;
        }
    }

    @Override // com.meituan.msi.api.l
    public final String[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61ec8b630c9dd729c2bf4377f4e4ca4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61ec8b630c9dd729c2bf4377f4e4ca4");
        }
        if (TextUtils.equals(str, "getNetworkType") && com.meituan.msi.a.f().getApplicationInfo().targetSdkVersion > 28) {
            return new String[]{PermissionGuard.PERMISSION_PHONE_READ};
        }
        return new String[0];
    }
}
