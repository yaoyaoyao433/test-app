package com.meituan.mmp.lib.api.auth;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.n;
import com.meituan.mmp.lib.utils.aq;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msi.privacy.permission.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SettingModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    public f i;
    private n j;

    public SettingModule(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63010e384248893d29a844a0f0efc35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63010e384248893d29a844a0f0efc35");
            return;
        }
        this.i = d.a();
        this.j = nVar;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b20f5f8ec7a88c7eba20f9f1eebfee", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b20f5f8ec7a88c7eba20f9f1eebfee") : new String[]{"openSetting", "getSetting", "authorize"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) throws com.meituan.mmp.lib.api.d {
        char c;
        Intent intent;
        String str2;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f780e568d963897c464f1d7f71530d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f780e568d963897c464f1d7f71530d47");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1272165862) {
            if (str.equals("getSetting")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 1475610601) {
            if (hashCode == 1789114534 && str.equals("openSetting")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("authorize")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6e4cb372da61b31fe507bd05829efb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6e4cb372da61b31fe507bd05829efb9");
                    return;
                } else if (isInnerApp()) {
                    String packageName = getActivity().getPackageName();
                    Object[] objArr3 = {packageName};
                    ChangeQuickRedirect changeQuickRedirect3 = aq.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2fc12d52436644a144e03f0d0084f5b6", RobustBitConfig.DEFAULT_VALUE)) {
                        intent = (Intent) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2fc12d52436644a144e03f0d0084f5b6");
                    } else {
                        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent2.setData(Uri.fromParts("package", packageName, null));
                        intent = intent2;
                    }
                    startActivityForResult(intent, iApiCallback);
                    return;
                } else {
                    String optString = jSONObject.optString("from");
                    if (this.i == null) {
                        iApiCallback.onFail(codeJson(-1, "This Native App version won't support external miniApp"));
                        return;
                    } else if (!"button".equals(optString) && !"event".equals(optString)) {
                        iApiCallback.onFail(null);
                        return;
                    } else {
                        Dialog a = this.i.a(getContext(), getAppConfig());
                        a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.meituan.mmp.lib.api.auth.SettingModule.3
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                Object[] objArr4 = {dialogInterface};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "741ce5d797f74935e7f4825ae8a1a6cd", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "741ce5d797f74935e7f4825ae8a1a6cd");
                                    return;
                                }
                                SettingModule.this.a("onAppEnterForeground", null, 0);
                                SettingModule.this.a(new JSONObject(), iApiCallback);
                            }
                        });
                        a.show();
                        a("onAppEnterBackground", "{\"mode\":\"hang\"}", 0);
                        return;
                    }
                }
            case 1:
                a(jSONObject, iApiCallback);
                return;
            case 2:
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b9ad0b6174a6d1e355427992cb5b0bed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b9ad0b6174a6d1e355427992cb5b0bed");
                    return;
                }
                String optString2 = jSONObject.optString(Constants.PARAM_SCOPE);
                if (getAppConfig().a()) {
                    Object[] objArr5 = {optString2};
                    ChangeQuickRedirect changeQuickRedirect5 = h;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "db1b89a04606cf95241f2ebb802765e8", RobustBitConfig.DEFAULT_VALUE)) {
                        str2 = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "db1b89a04606cf95241f2ebb802765e8");
                    } else {
                        if (!TextUtils.isEmpty(optString2)) {
                            if ("scope.userLocation".equals(optString2)) {
                                str2 = "Locate.once";
                            } else if ("scope.userLocationUpdate".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
                            } else if ("scope.writePhotosAlbum".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_STORAGE_WRITE;
                            } else if ("scope.contact".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_CONTACTS;
                            } else if ("scope.camera".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_CAMERA;
                            } else if ("scope.record".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_MICROPHONE;
                            } else if ("scope.calendar".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_CALENDAR;
                            } else if ("scope.bluetooth".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_BLUETOOTH;
                            } else if ("scope.clipboard".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_CLIPBOARD;
                            } else if ("scope.motion".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_MOTION;
                            } else if ("scope.readPhotosAlbum".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_STORAGE_READ;
                            } else if ("scope.phone".equals(optString2)) {
                                str2 = PermissionGuard.PERMISSION_PHONE_READ;
                            }
                        }
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2) || this.j == null) {
                        iApiCallback.onFail(null);
                        return;
                    } else {
                        this.j.a(new String[]{str2}, AbsApi.getToken(jSONObject), new a.InterfaceC0498a() { // from class: com.meituan.mmp.lib.api.auth.SettingModule.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                            public final void onResult(String str3, String[] strArr, int[] iArr, String str4) {
                                Object[] objArr6 = {str3, strArr, iArr, str4};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d6cc492b4d16fa0f40281339a1191342", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d6cc492b4d16fa0f40281339a1191342");
                                } else if (iArr == null || iArr.length != 1) {
                                    iApiCallback.onFail(AbsApi.codeJson(-1, str4));
                                } else if (iArr[0] > 0) {
                                    iApiCallback.onSuccess(null);
                                } else {
                                    iApiCallback.onFail(AbsApi.codeJson(-1, str4));
                                }
                            }
                        });
                        return;
                    }
                } else if (this.i != null) {
                    this.i.a(getActivity(), getAppConfig(), optString2, new i() { // from class: com.meituan.mmp.lib.api.auth.SettingModule.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.api.auth.i
                        public final void a(int i) {
                            Object[] objArr6 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "743a1398f484864be478429351d0dc5b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "743a1398f484864be478429351d0dc5b");
                                return;
                            }
                            switch (i) {
                                case -1:
                                    iApiCallback.onFail(null);
                                    return;
                                case 0:
                                    iApiCallback.onCancel();
                                    return;
                                case 1:
                                    iApiCallback.onSuccess(null);
                                    return;
                                default:
                                    return;
                            }
                        }
                    });
                    return;
                } else {
                    iApiCallback.onFail(codeJson(-1, "This Native App version won't support external miniApp"));
                    return;
                }
            default:
                return;
        }
    }

    public final void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        JSONObject jSONObject2;
        g iPersonalizationInfo;
        j a;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea627e304a17dd276f11c4ad05857b95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea627e304a17dd276f11c4ad05857b95");
            return;
        }
        jSONObject.optBoolean("withPersonalization", false);
        try {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            if (!isInnerApp() && this.i != null) {
                for (Map.Entry<String, Boolean> entry : this.i.a(getContext(), getAppId()).entrySet()) {
                    jSONObject4.put(entry.getKey(), entry.getValue());
                }
            } else {
                jSONObject4.put("scope.userInfo", true);
                String token = AbsApi.getToken(jSONObject);
                jSONObject4.put("scope.userLocation", com.meituan.msi.privacy.permission.a.a(getContext(), "Locate.once", token));
                jSONObject4.put("scope.userLocationUpdate", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, token));
                jSONObject4.put("scope.userLocationBackground", false);
                jSONObject4.put("scope.address", true);
                jSONObject4.put("scope.record", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_MICROPHONE, token));
                jSONObject4.put("scope.writePhotosAlbum", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_STORAGE_WRITE, token));
                jSONObject4.put("scope.camera", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_CAMERA, token));
                jSONObject4.put("scope.readPhotosAlbum", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_STORAGE_READ, token));
                jSONObject4.put("scope.phone", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_PHONE_READ, token));
                jSONObject4.put("scope.motion", Build.VERSION.SDK_INT >= 29 ? com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_MOTION, token) : true);
                jSONObject4.put("scope.contact", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_CONTACTS_READ, token));
                boolean optBoolean = jSONObject.optBoolean("withPersonalization", false);
                Object[] objArr2 = {Byte.valueOf(optBoolean ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59c649711ebdbeaa01a93c40fa84e076", RobustBitConfig.DEFAULT_VALUE)) {
                    jSONObject2 = (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59c649711ebdbeaa01a93c40fa84e076");
                } else {
                    JSONObject jSONObject5 = new JSONObject();
                    if (optBoolean && (iPersonalizationInfo = MMPEnvHelper.getIPersonalizationInfo()) != null && (a = iPersonalizationInfo.a()) != null && a.b != null && a.a != null) {
                        jSONObject5.put("personalizedContent", a.a);
                        jSONObject5.put("personalizedAds", a.b);
                    }
                    jSONObject2 = jSONObject5;
                }
                jSONObject3.put("personalizationSetting", jSONObject2);
                jSONObject4.put("scope.calendar", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_CALENDAR, token));
                jSONObject4.put("scope.bluetooth", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_BLUETOOTH, token));
                jSONObject4.put("scope.clipboard", com.meituan.msi.privacy.permission.a.a(getContext(), PermissionGuard.PERMISSION_CLIPBOARD, token));
            }
            jSONObject3.put("authSetting", jSONObject4);
            iApiCallback.onSuccess(jSONObject3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490f33ab34ca843a0e528cf0a209d104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490f33ab34ca843a0e528cf0a209d104");
            return;
        }
        super.onActivityResult(i, intent, iApiCallback);
        a(new JSONObject(), iApiCallback);
    }
}
