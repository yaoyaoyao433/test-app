package com.meituan.msc.modules.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.common.model.Event;
import com.meituan.msc.extern.IApiCallback;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.router.AppBrandRouterCenter;
import com.meituan.msc.modules.page.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public abstract class AbsApi {
    public static final String ERR_CODE = "errCode";
    public static final String ERR_MSG = "errMsg";
    public static final String MMP_DEFAULT_BUZ_ID = "mmp_default_buzId";
    private static final String TAG = "AbsApi";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean beforeFirstInvokeCalled;
    private com.meituan.msc.extern.b mApiContext;

    public void beforeFirstInvoke() {
    }

    public abstract boolean isActivityApi();

    public boolean needBlockPipWhenStartActivity() {
        return false;
    }

    public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
    }

    @Deprecated
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c47d7962b3a0b716264d66dfa486de26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c47d7962b3a0b716264d66dfa486de26");
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe06c0e93b40f4c06dcee2ee0f0e88b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe06c0e93b40f4c06dcee2ee0f0e88b4");
        }
    }

    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b3029d7cb8badab08a9bf5c224361b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b3029d7cb8badab08a9bf5c224361b");
        }
    }

    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcdfb53958089e768de016311572c93d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcdfb53958089e768de016311572c93d");
        }
    }

    public void invoke(Event event, IApiCallback iApiCallback) throws b {
        Object[] objArr = {event, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02ffecfd1c26027ecc456cd8c19f1179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02ffecfd1c26027ecc456cd8c19f1179");
            return;
        }
        if (!this.beforeFirstInvokeCalled) {
            beforeFirstInvoke();
            this.beforeFirstInvokeCalled = true;
        }
        invoke(event.b, event.a(), iApiCallback);
    }

    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws b {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72a49c04c61bf84add89612b62bf1e0b", RobustBitConfig.DEFAULT_VALUE)) {
            throw new b("api not implement");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72a49c04c61bf84add89612b62bf1e0b");
    }

    public final void startActivityForResult(Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3bfd859bfb318c99a1272018926155e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3bfd859bfb318c99a1272018926155e");
        } else if (this.mApiContext != null) {
            needBlockPipWhenStartActivity();
        }
    }

    public final void startActivity(Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7508068af1886879e840fc4d97ebefe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7508068af1886879e840fc4d97ebefe8");
        } else if (this.mApiContext != null) {
            needBlockPipWhenStartActivity();
        }
    }

    public final void setApiContext(com.meituan.msc.extern.b bVar) {
        this.mApiContext = bVar;
    }

    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37205c62299660960e1955f4cb880a93", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37205c62299660960e1955f4cb880a93");
        }
        if (this.mApiContext != null) {
            return MSCEnvHelper.getContext();
        }
        return null;
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aeb605f6cea298f5cab8b3ea7980a83", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aeb605f6cea298f5cab8b3ea7980a83");
        }
        if (this.mApiContext == null || this.mApiContext.c() == null) {
            return null;
        }
        return this.mApiContext.c();
    }

    public com.meituan.msc.modules.container.router.a getAppBrandTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbd22f750b2cd4f0576a39b377d9b6ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.container.router.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbd22f750b2cd4f0576a39b377d9b6ef");
        }
        if (this.mApiContext == null || this.mApiContext.c() == null) {
            return null;
        }
        return AppBrandRouterCenter.a(this.mApiContext.c());
    }

    public final IBinder getWindowToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fe69c2ff324b9ec20947d553f0db10e", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fe69c2ff324b9ec20947d553f0db10e");
        }
        if (this.mApiContext == null || this.mApiContext.c() == null) {
            return null;
        }
        return this.mApiContext.c().getWindow().getDecorView().getWindowToken();
    }

    @Nullable
    public m getPageManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deb15e60808114d47b5aca2f3f01ed6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deb15e60808114d47b5aca2f3f01ed6a");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.b();
        }
        com.meituan.msc.modules.reporter.g.a(TAG, "getPageManager is null");
        return null;
    }

    public com.meituan.msc.modules.update.f getMSCAppModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97f6390bc6f5fa38843b1c0fea8b61f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.update.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97f6390bc6f5fa38843b1c0fea8b61f3");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.a();
        }
        return null;
    }

    public boolean isInnerApp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "531373b477d3dfaafa8c789fc81f2154", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "531373b477d3dfaafa8c789fc81f2154")).booleanValue();
        }
        if (this.mApiContext != null) {
            return this.mApiContext.a().i();
        }
        return false;
    }

    @Nullable
    public final String getAppId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79021d50375ec64a5ee544596d4ba031", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79021d50375ec64a5ee544596d4ba031");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.a().j();
        }
        return null;
    }

    public final String getShareEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd33d600df27541f739f98c548c3e564", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd33d600df27541f739f98c548c3e564");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.a().f;
        }
        return null;
    }

    public final String getAppIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53c60c79123a279640c73927609085da", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53c60c79123a279640c73927609085da");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.a().l();
        }
        return null;
    }

    public SharedPreferences getSharedPreferences(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cd06860659b75f21146f05a6cd64bd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cd06860659b75f21146f05a6cd64bd2");
        }
        if (this.mApiContext != null) {
            return MSCEnvHelper.getSharedPreferences(getContext(), str);
        }
        return null;
    }

    public SharedPreferences getSharedPreferences() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bc69beaca5f4cecb885fd938cd2c63a", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bc69beaca5f4cecb885fd938cd2c63a");
        }
        if (this.mApiContext != null) {
            return MSCEnvHelper.getDefaultSharedPreferences(getContext());
        }
        return null;
    }

    public com.meituan.msc.modules.devtools.b getDevTools() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a85f757c2b57102060c9dcef92038b2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.devtools.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a85f757c2b57102060c9dcef92038b2a");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.d();
        }
        return null;
    }

    @NonNull
    public static JSONObject codeJson(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd8c763fab9a0e5a200dbf0b4f6c3823", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd8c763fab9a0e5a200dbf0b4f6c3823");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errCode", i);
            if (str != null) {
                jSONObject.put("errMsg", str);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static String getToken(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cde2dde3e250cffc41412518aef5c70a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cde2dde3e250cffc41412518aef5c70a") : (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("_mt")) == null) ? "" : optJSONObject.optString("sceneToken", "");
    }
}
