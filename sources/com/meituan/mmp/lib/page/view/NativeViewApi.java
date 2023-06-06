package com.meituan.mmp.lib.page.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class NativeViewApi<T extends View> extends ActivityApi {
    public static ChangeQuickRedirect p;

    public abstract T b(JSONObject jSONObject);

    @NonNull
    public abstract String f();

    public final String d(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88cb8cec487a7ef3ba8b2d0344e87e0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88cb8cec487a7ef3ba8b2d0344e87e0") : jSONObject.optString(f(), "");
    }

    private int c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829507952786c6d0f416aced3a8277c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829507952786c6d0f416aced3a8277c4")).intValue();
        }
        String d = d(jSONObject);
        if (TextUtils.isEmpty(d)) {
            return -1;
        }
        return d.hashCode();
    }

    @Nullable
    public final CoverViewWrapper c(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ee4ecd8deb623226868b3ffb4ec341", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ee4ecd8deb623226868b3ffb4ec341");
        }
        String d = d(jSONObject);
        if (!d(d)) {
            iApiCallback.onFail(a("id not ready", new Object[0]));
            return null;
        }
        CoverViewWrapper a = a(a(jSONObject), d, e(jSONObject));
        if (a == null) {
            iApiCallback.onFail(a("view not found!", new Object[0]));
        }
        return a;
    }

    public final T d(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2282fde8309d5934b4f48b0bacc97d6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2282fde8309d5934b4f48b0bacc97d6c");
        }
        String d = d(jSONObject);
        if (!d(d)) {
            iApiCallback.onFail(a("id not ready", new Object[0]));
            return null;
        } else if (!b(a(jSONObject), d, e(jSONObject))) {
            iApiCallback.onFail(a("id %s conflict!", d));
            return null;
        } else {
            T a = a(a(jSONObject), jSONObject);
            if (a == null) {
                iApiCallback.onFail(a("attach failed", new Object[0]));
                return null;
            }
            a(jSONObject, d);
            return a;
        }
    }

    @Nullable
    public final T a(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa8e128e5222d3b21c1efd9bf5a888fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa8e128e5222d3b21c1efd9bf5a888fc");
        }
        com.meituan.mmp.lib.page.e pageByPageId = getPageByPageId(a(jSONObject));
        if (pageByPageId == null) {
            return null;
        }
        pageByPageId.a(str.hashCode(), jSONObject);
        return null;
    }

    public void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc85b7f4c68cbdd539e8bb12ac00747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc85b7f4c68cbdd539e8bb12ac00747");
            return;
        }
        CoverViewWrapper a = a(a(jSONObject), d(jSONObject), e(jSONObject));
        if (a != null) {
            ((ViewGroup) a.getParent()).removeView(a);
        }
        if (iApiCallback != null) {
            iApiCallback.onSuccess(null);
        }
    }

    public static JSONObject a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "9582d01873f5b7f13843c6040af95d3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "9582d01873f5b7f13843c6040af95d3c");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", String.format(str, objArr));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d27b9a3b96b3e953197be040ae75b65c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d27b9a3b96b3e953197be040ae75b65c")).booleanValue() : !TextUtils.isEmpty(str);
    }

    private CoverViewWrapper a(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4615fecc64eb63982cc26ee4f7355aed", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4615fecc64eb63982cc26ee4f7355aed");
        }
        int hashCode = TextUtils.isEmpty(str) ? -1 : str.hashCode();
        com.meituan.mmp.lib.page.e pageByPageId = getPageByPageId(i);
        if (pageByPageId != null) {
            return pageByPageId.c(hashCode, i2);
        }
        com.meituan.mmp.lib.trace.b.e("Page not found");
        return null;
    }

    private boolean b(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbce062ca08fd0266f80133cc6031f08", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbce062ca08fd0266f80133cc6031f08")).booleanValue() : a(i, str, i2) == null;
    }

    @Nullable
    private T a(int i, JSONObject jSONObject) {
        T b;
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41067a115ca9cc1fd82c272f3cdcb45d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41067a115ca9cc1fd82c272f3cdcb45d");
        }
        com.meituan.mmp.lib.page.e pageByPageId = getPageByPageId(i);
        if (pageByPageId == null || (b = b(jSONObject)) == null || !pageByPageId.a(b, jSONObject)) {
            return null;
        }
        ((View) b.getParent()).setId(c(jSONObject));
        return b;
    }

    private int e(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957325a4267ca904a62b9bb5a262311f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957325a4267ca904a62b9bb5a262311f")).intValue() : jSONObject.optInt("parentId", -1);
    }
}
