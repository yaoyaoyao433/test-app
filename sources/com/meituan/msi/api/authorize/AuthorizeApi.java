package com.meituan.msi.api.authorize;

import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.privacy.permission.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AuthorizeApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private a b;

    public AuthorizeApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6920de08ebcce3d1f0f3235666320884", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6920de08ebcce3d1f0f3235666320884");
        } else {
            this.b = null;
        }
    }

    public final void a(a aVar) {
        this.b = aVar;
    }

    @MsiApiMethod(name = "authorize", request = AuthorizeParam.class, scope = "default")
    public void authorize(AuthorizeParam authorizeParam, final MsiContext msiContext) {
        Object[] objArr = {authorizeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b070fd2e4174ac495da671711caaac3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b070fd2e4174ac495da671711caaac3e");
            return;
        }
        if (this.b != null ? this.b.a(authorizeParam, msiContext) : false) {
            return;
        }
        String a2 = a(authorizeParam.scope);
        if (TextUtils.isEmpty(a2)) {
            msiContext.onError("scope:" + authorizeParam.scope + " is invalid");
            return;
        }
        msiContext.requestPermissions(new String[]{a2}, authorizeParam._mt == null ? "" : authorizeParam._mt.sceneToken, new a.InterfaceC0498a() { // from class: com.meituan.msi.api.authorize.AuthorizeApi.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
            public final void onResult(String str, String[] strArr, int[] iArr, String str2) {
                Object[] objArr2 = {str, strArr, iArr, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ace82a0f258ba05f3ce42f79a0329f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ace82a0f258ba05f3ce42f79a0329f1");
                } else if (iArr == null || iArr.length != 1) {
                    msiContext.onError(str2);
                } else if (iArr[0] > 0) {
                    msiContext.onSuccess(null);
                } else {
                    msiContext.onError(str2);
                }
            }
        });
    }

    @MsiApiMethod(name = "checkPermission", request = AuthorizeParam.class, response = CheckPermissionResponse.class, scope = "default")
    public void checkPermission(AuthorizeParam authorizeParam, MsiContext msiContext) {
        Object[] objArr = {authorizeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9964ad5e31357b91d00737e4f7122331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9964ad5e31357b91d00737e4f7122331");
            return;
        }
        String a2 = a(authorizeParam.scope);
        if (TextUtils.isEmpty(a2)) {
            msiContext.onError("scope:" + authorizeParam.scope + " is invalid");
            return;
        }
        boolean a3 = com.meituan.msi.privacy.permission.a.a(com.meituan.msi.a.f(), a2, authorizeParam._mt == null ? "" : authorizeParam._mt.sceneToken);
        CheckPermissionResponse checkPermissionResponse = new CheckPermissionResponse();
        checkPermissionResponse.authorized = a3;
        msiContext.onSuccess(checkPermissionResponse);
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0be5a74fcc16e8cba518663440eba916", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0be5a74fcc16e8cba518663440eba916");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("scope.userLocation".equals(str)) {
            return "Locate.once";
        }
        if ("scope.userLocationUpdate".equals(str)) {
            return PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
        }
        if ("scope.writePhotosAlbum".equals(str)) {
            return PermissionGuard.PERMISSION_STORAGE_WRITE;
        }
        if ("scope.contact".equals(str)) {
            return PermissionGuard.PERMISSION_CONTACTS;
        }
        if ("scope.camera".equals(str)) {
            return PermissionGuard.PERMISSION_CAMERA;
        }
        if ("scope.record".equals(str)) {
            return PermissionGuard.PERMISSION_MICROPHONE;
        }
        if ("scope.calendar".equals(str)) {
            return PermissionGuard.PERMISSION_CALENDAR;
        }
        if ("scope.bluetooth".equals(str)) {
            return PermissionGuard.PERMISSION_BLUETOOTH;
        }
        if ("scope.clipboard".equals(str)) {
            return PermissionGuard.PERMISSION_CLIPBOARD;
        }
        if ("scope.motion".equals(str)) {
            return PermissionGuard.PERMISSION_MOTION;
        }
        if ("scope.readPhotosAlbum".equals(str)) {
            return PermissionGuard.PERMISSION_STORAGE_READ;
        }
        if ("scope.phone".equals(str)) {
            return PermissionGuard.PERMISSION_PHONE_READ;
        }
        if ("scope.storage".equals(str)) {
            return PermissionGuard.PERMISSION_STORAGE;
        }
        return null;
    }
}
