package com.meituan.msi.api.setting;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.g;
import com.meituan.msi.api.setting.SettingParam;
import com.meituan.msi.api.setting.SettingResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SettingApi implements IMsiApi, g {
    public static ChangeQuickRedirect a;
    private b b;

    public SettingApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64badd198e6b3e0adcb7efef2e0a6d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64badd198e6b3e0adcb7efef2e0a6d9");
        } else {
            this.b = null;
        }
    }

    public final void a(b bVar) {
        this.b = bVar;
    }

    @MsiApiMethod(name = "openSetting", onUiThread = true, request = SettingParam.class, response = SettingResponse.class, scope = "default")
    public void openSetting(SettingParam settingParam, MsiContext msiContext) {
        Object[] objArr = {settingParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2d6379f04dd0997dc204e61fd37f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2d6379f04dd0997dc204e61fd37f43");
            return;
        }
        if (this.b != null ? this.b.a(settingParam, msiContext) : false) {
            return;
        }
        Object[] objArr2 = {settingParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e2b6c75547045650f38cd24b4630691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e2b6c75547045650f38cd24b4630691");
            return;
        }
        String packageName = msiContext.getActivity() != null ? msiContext.getActivity().getPackageName() : null;
        if (TextUtils.isEmpty(packageName)) {
            msiContext.onError("get packageName fail");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", packageName, null));
        String str = "";
        if (settingParam != null && settingParam._mt != null && settingParam._mt.sceneToken != null) {
            str = settingParam._mt.sceneToken;
        }
        msiContext.request.cache("open_token", str);
        msiContext.startActivityForResult(intent, 113);
    }

    @MsiApiMethod(name = "getSetting", request = SettingParam.class, response = SettingResponse.class, scope = "default")
    public void getSetting(SettingParam settingParam, MsiContext msiContext) {
        Object[] objArr = {settingParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad9f7c9caa229273707847b5ae40241", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad9f7c9caa229273707847b5ae40241");
            return;
        }
        if (this.b != null ? this.b.b(settingParam, msiContext) : false) {
            return;
        }
        a(settingParam, msiContext);
    }

    @Override // com.meituan.msi.api.g
    public final void a(int i, Intent intent, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), intent, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98cf72035ff634ffbd056796f4aaffea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98cf72035ff634ffbd056796f4aaffea");
            return;
        }
        SettingParam settingParam = new SettingParam();
        settingParam._mt = new SettingParam.MtParam();
        settingParam._mt.sceneToken = (String) msiContext.request.getCache("open_token");
        settingParam.withPersonalization = false;
        a(settingParam, msiContext);
    }

    private void a(SettingParam settingParam, MsiContext msiContext) {
        Object[] objArr = {settingParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21de606a9750bde9ecaa0f13582f30d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21de606a9750bde9ecaa0f13582f30d6");
            return;
        }
        String str = "";
        if (settingParam != null && settingParam._mt != null && settingParam._mt.sceneToken != null) {
            str = settingParam._mt.sceneToken;
        }
        Context f = com.meituan.msi.a.f();
        SettingResponse.AuthSetting authSetting = new SettingResponse.AuthSetting();
        authSetting.userInfo = true;
        authSetting.userLocation = com.meituan.msi.privacy.permission.a.a(f, "Locate.once", str, true);
        authSetting.userLocationUpdate = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, str, true);
        authSetting.userLocationBackground = false;
        authSetting.address = true;
        authSetting.record = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_MICROPHONE, str, true);
        authSetting.writePhotosAlbum = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_STORAGE_WRITE, str, true);
        authSetting.camera = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_CAMERA, str, true);
        authSetting.readPhotosAlbum = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_STORAGE_READ, str, true);
        authSetting.phone = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_PHONE_READ, str, true);
        authSetting.motion = Build.VERSION.SDK_INT >= 29 ? com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_MOTION, str, true) : true;
        authSetting.contact = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_CONTACTS_READ, str, true);
        authSetting.calendar = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_CALENDAR, str, true);
        authSetting.bluetooth = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_BLUETOOTH, str, true);
        authSetting.clipboard = com.meituan.msi.privacy.permission.a.a(f, PermissionGuard.PERMISSION_CLIPBOARD, str, true);
        SettingResponse.PersonalizationSetting personalizationSetting = null;
        if (settingParam != null && settingParam.withPersonalization) {
            personalizationSetting = a();
        }
        SettingResponse settingResponse = new SettingResponse();
        settingResponse.authSetting = authSetting;
        settingResponse.personalizationSetting = personalizationSetting;
        msiContext.onSuccess(settingResponse);
    }

    private SettingResponse.PersonalizationSetting a() {
        c a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29fee53db1137201c3cc8ce71d738e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (SettingResponse.PersonalizationSetting) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29fee53db1137201c3cc8ce71d738e7");
        }
        a g = com.meituan.msi.a.g();
        if (g == null || (a2 = g.a()) == null) {
            return null;
        }
        SettingResponse.PersonalizationSetting personalizationSetting = new SettingResponse.PersonalizationSetting();
        personalizationSetting.personalizedContent = a2.a;
        personalizationSetting.personalizedAds = a2.b;
        return personalizationSetting;
    }
}
