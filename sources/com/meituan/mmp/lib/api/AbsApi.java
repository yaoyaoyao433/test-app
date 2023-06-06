package com.meituan.mmp.lib.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mmp.lib.AppBrandHeraActivity;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.router.AppBrandRouterCenter;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
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
    private com.meituan.mmp.main.e mApiContext;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6680542eab3ae1cd2b41b18b0e0cc5b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6680542eab3ae1cd2b41b18b0e0cc5b1");
        }
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78e1c5210667f438b9299ed72284c384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78e1c5210667f438b9299ed72284c384");
        }
    }

    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8793e66b77d5d8eec99b7849ac8761ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8793e66b77d5d8eec99b7849ac8761ff");
        }
    }

    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "108fe3229889d06ea12cb1a1706e28b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "108fe3229889d06ea12cb1a1706e28b8");
        }
    }

    public void invoke(Event event, IApiCallback iApiCallback) throws d {
        Object[] objArr = {event, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "824b1fedf799713a0fc26b90cd4825ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "824b1fedf799713a0fc26b90cd4825ec");
            return;
        }
        if (!this.beforeFirstInvokeCalled) {
            beforeFirstInvoke();
            this.beforeFirstInvokeCalled = true;
        }
        invoke(event.b, event.a(), iApiCallback);
    }

    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "641166c281fd57257031089afbf27a86", RobustBitConfig.DEFAULT_VALUE)) {
            throw new d("api not implement");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "641166c281fd57257031089afbf27a86");
    }

    public static int getPageId(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da1049e56ca7a6d42efb3ddf9f885507", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da1049e56ca7a6d42efb3ddf9f885507")).intValue();
        }
        if (jSONObject != null) {
            return jSONObject.optInt("__mmp__viewId", -1);
        }
        return -1;
    }

    public com.meituan.mmp.lib.a getContainerByPageIdOrCurContainer(int i) {
        com.meituan.mmp.lib.config.a c;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae899dfcb25a0094e82802e8af4ff0af", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae899dfcb25a0094e82802e8af4ff0af");
        }
        if (this.mApiContext == null || (c = this.mApiContext.c()) == null) {
            return null;
        }
        return c.j.c(i);
    }

    public final void startActivityForResult(Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "811de276366866503b9a6ee81e2eb556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "811de276366866503b9a6ee81e2eb556");
        } else if (this.mApiContext != null) {
            if (needBlockPipWhenStartActivity()) {
                com.meituan.mmp.lib.pip.e.a();
            }
            this.mApiContext.a(intent, 97, iApiCallback);
        }
    }

    public final void startActivity(Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3f15524c57f6d579e348e6b7741f423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3f15524c57f6d579e348e6b7741f423");
        } else if (this.mApiContext != null) {
            if (needBlockPipWhenStartActivity()) {
                com.meituan.mmp.lib.pip.e.a();
            }
            this.mApiContext.a(intent, -1, iApiCallback);
        }
    }

    public final void setApiContext(com.meituan.mmp.main.e eVar) {
        this.mApiContext = eVar;
    }

    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "078013a4e7db5a2d1f29927c303f5e77", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "078013a4e7db5a2d1f29927c303f5e77");
        }
        if (this.mApiContext != null) {
            return MMPEnvHelper.getContext();
        }
        return null;
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86cb5709033a198160dfbf28f1b0574c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86cb5709033a198160dfbf28f1b0574c");
        }
        if (this.mApiContext == null || this.mApiContext.a() == null) {
            return null;
        }
        return this.mApiContext.a();
    }

    @Deprecated
    public Class<? extends AppBrandHeraActivity> getAppBrand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95e755532bd85d4639ac92903fdf26cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95e755532bd85d4639ac92903fdf26cd");
        }
        if (this.mApiContext == null || this.mApiContext.a() == null) {
            return null;
        }
        Activity a = this.mApiContext.a();
        Object[] objArr2 = {a};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.utils.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "a98fa744146dfdde38e6cc809cbe658b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "a98fa744146dfdde38e6cc809cbe658b");
        }
        Class a2 = com.meituan.mmp.lib.utils.b.a(a);
        if (a2 == null || !AppBrandHeraActivity.class.isAssignableFrom(a2)) {
            return null;
        }
        return a2;
    }

    public com.meituan.mmp.lib.router.a getAppBrandTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc705679f523a03f6ca5349ab2721a5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.router.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc705679f523a03f6ca5349ab2721a5c");
        }
        if (this.mApiContext == null || this.mApiContext.a() == null) {
            return null;
        }
        return AppBrandRouterCenter.a(this.mApiContext.a());
    }

    public final IBinder getWindowToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ead94066ca036de1f4b253e189a0824e", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ead94066ca036de1f4b253e189a0824e");
        }
        if (this.mApiContext == null || this.mApiContext.a() == null) {
            return null;
        }
        return this.mApiContext.a().getWindow().getDecorView().getWindowToken();
    }

    @Nullable
    public ab getPageManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45b7b7e1742bb9b36094132e172a4246", RobustBitConfig.DEFAULT_VALUE)) {
            return (ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45b7b7e1742bb9b36094132e172a4246");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.b();
        }
        com.meituan.mmp.lib.trace.b.d(TAG, "getPageManager is null");
        return null;
    }

    public com.meituan.mmp.lib.page.e getPageByPageId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e07dccb6e90667025139943670b587c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e07dccb6e90667025139943670b587c");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.a(i);
        }
        return null;
    }

    public com.meituan.mmp.lib.config.a getAppConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "354fd09a75815c368a06125e8534aa67", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.config.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "354fd09a75815c368a06125e8534aa67");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.c();
        }
        return null;
    }

    public boolean isInnerApp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62c9b7cf49c479832faf586cac5f080d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62c9b7cf49c479832faf586cac5f080d")).booleanValue();
        }
        if (this.mApiContext != null) {
            return this.mApiContext.c().a();
        }
        return false;
    }

    @Nullable
    public final String getAppId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfb8313ffec3932577d0259122fbd5a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfb8313ffec3932577d0259122fbd5a8");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.c().c();
        }
        return null;
    }

    public final String getShareEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e53b5b313a3006758092fcd3a380436", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e53b5b313a3006758092fcd3a380436");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.c().k;
        }
        return null;
    }

    public final String getAppIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60bf0f81efa8acf89d19cc07cfd65f20", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60bf0f81efa8acf89d19cc07cfd65f20");
        }
        if (this.mApiContext != null) {
            return this.mApiContext.c().f();
        }
        return null;
    }

    public SharedPreferences getSharedPreferences(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c041a4bbe7068c9279af9746a1f2966c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c041a4bbe7068c9279af9746a1f2966c");
        }
        if (this.mApiContext != null) {
            return MMPEnvHelper.getSharedPreferences(getContext(), str);
        }
        return null;
    }

    public SharedPreferences getSharedPreferences() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ea409a01cfc20e7ceb785569aab1450", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ea409a01cfc20e7ceb785569aab1450");
        }
        if (this.mApiContext != null) {
            return MMPEnvHelper.getDefaultSharedPreferences(getContext());
        }
        return null;
    }

    public com.meituan.mmp.lib.devtools.e getDevTools() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5506033772eec4e917e18bf585f8e4a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.devtools.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5506033772eec4e917e18bf585f8e4a5");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2a80be96da48c2bc2a7e0d9ea4f74ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2a80be96da48c2bc2a7e0d9ea4f74ac");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c1a1ac2f0db67a8ed7973abdb01da41", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c1a1ac2f0db67a8ed7973abdb01da41") : (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("_mt")) == null) ? "" : optJSONObject.optString("sceneToken", "");
    }
}
