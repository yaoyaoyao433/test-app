package com.meituan.msi.view;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.page.IPage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MsiNativeViewApi<T extends View, S> implements IMsiApi {
    public static ChangeQuickRedirect d;
    private Handler a;
    public g e;
    public a f;

    public abstract T a(MsiContext msiContext, JsonObject jsonObject, S s);

    public abstract boolean a(MsiContext msiContext, T t, int i, int i2, JsonObject jsonObject, S s);

    public MsiNativeViewApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e319244678740d2f6e256b90feb63153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e319244678740d2f6e256b90feb63153");
            return;
        }
        this.a = new Handler(Looper.getMainLooper());
        this.f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(MsiNativeViewApi msiNativeViewApi, MsiContext msiContext, Object obj) {
        boolean z;
        View a;
        Object[] objArr = {msiContext, obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, msiNativeViewApi, changeQuickRedirect, false, "e8e20c016ec2c9fed59ae6445babbcf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, msiNativeViewApi, changeQuickRedirect, false, "e8e20c016ec2c9fed59ae6445babbcf9");
            return;
        }
        JsonObject uIArgs = msiContext.getUIArgs();
        if (uIArgs == null) {
            msiContext.onError("uiArgs is error");
            return;
        }
        Object[] objArr2 = {uIArgs};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        String a2 = PatchProxy.isSupport(objArr2, msiNativeViewApi, changeQuickRedirect2, false, "9f5181f59146ca8343a1185fc5eb4889", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, msiNativeViewApi, changeQuickRedirect2, false, "9f5181f59146ca8343a1185fc5eb4889") : msiNativeViewApi.a(uIArgs, "operation");
        int f = msiNativeViewApi.f(uIArgs);
        int g = msiNativeViewApi.g(uIArgs);
        char c = 65535;
        if (!(-1 != g)) {
            msiContext.onError("id not ready");
            return;
        }
        int hashCode = a2.hashCode();
        if (hashCode != -1183792455) {
            if (hashCode != -934610812) {
                if (hashCode == -838846263 && a2.equals("update")) {
                    c = 1;
                }
            } else if (a2.equals("remove")) {
                c = 2;
            }
        } else if (a2.equals("insert")) {
            c = 0;
        }
        switch (c) {
            case 0:
                Object[] objArr3 = {msiContext, Integer.valueOf(f), Integer.valueOf(g), uIArgs, obj};
                ChangeQuickRedirect changeQuickRedirect3 = d;
                if (PatchProxy.isSupport(objArr3, msiNativeViewApi, changeQuickRedirect3, false, "e077415db4a0a8da941be4ec95a323d0", RobustBitConfig.DEFAULT_VALUE)) {
                    View view = (View) PatchProxy.accessDispatch(objArr3, msiNativeViewApi, changeQuickRedirect3, false, "e077415db4a0a8da941be4ec95a323d0");
                    return;
                }
                Object[] objArr4 = {msiContext, Integer.valueOf(f), Integer.valueOf(g)};
                ChangeQuickRedirect changeQuickRedirect4 = d;
                if (PatchProxy.isSupport(objArr4, msiNativeViewApi, changeQuickRedirect4, false, "661585eee026b3995a17cdd2dd1e54e6", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, msiNativeViewApi, changeQuickRedirect4, false, "661585eee026b3995a17cdd2dd1e54e6")).booleanValue();
                } else {
                    z = b(msiContext, f, g) == null;
                }
                if (!z) {
                    msiContext.onError(String.format("id %s conflict!", Integer.valueOf(g)));
                    return;
                }
                Object[] objArr5 = {msiContext, Integer.valueOf(f), Integer.valueOf(g), uIArgs, obj};
                ChangeQuickRedirect changeQuickRedirect5 = d;
                if (PatchProxy.isSupport(objArr5, msiNativeViewApi, changeQuickRedirect5, false, "892f5d375a67ac85882c1ed94e435026", RobustBitConfig.DEFAULT_VALUE)) {
                    a = (View) PatchProxy.accessDispatch(objArr5, msiNativeViewApi, changeQuickRedirect5, false, "892f5d375a67ac85882c1ed94e435026");
                } else {
                    a = msiNativeViewApi.a(msiContext, uIArgs, (JsonObject) obj);
                    IPage pageById = msiContext.getPageById(f);
                    if (a != null && pageById != null) {
                        a.setId(g);
                        pageById.getViewGroup().a(a, uIArgs);
                    }
                }
                if (a == null) {
                    msiContext.onError("attach failed");
                    return;
                }
                if ((a instanceof e) && msiNativeViewApi.e != null) {
                    g gVar = msiNativeViewApi.e;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    String sb2 = sb.toString();
                    e eVar = (e) a;
                    Object[] objArr6 = {sb2, eVar};
                    ChangeQuickRedirect changeQuickRedirect6 = g.a;
                    if (PatchProxy.isSupport(objArr6, gVar, changeQuickRedirect6, false, "2b1567da45a583e87a81e3160d2227cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, gVar, changeQuickRedirect6, false, "2b1567da45a583e87a81e3160d2227cb");
                    } else {
                        h hVar = gVar.b.get(sb2);
                        if (hVar == null) {
                            hVar = new h();
                            gVar.b.put(sb2, hVar);
                        }
                        hVar.a(eVar);
                    }
                }
                msiNativeViewApi.a(msiContext, f, g, uIArgs);
                msiContext.onSuccess("insert success");
                return;
            case 1:
                Object[] objArr7 = {msiContext, Integer.valueOf(f), Integer.valueOf(g), uIArgs, obj};
                ChangeQuickRedirect changeQuickRedirect7 = d;
                if (PatchProxy.isSupport(objArr7, msiNativeViewApi, changeQuickRedirect7, false, "c85159f4830789db1bd245132e3b5ce0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, msiNativeViewApi, changeQuickRedirect7, false, "c85159f4830789db1bd245132e3b5ce0");
                    return;
                }
                View a3 = msiNativeViewApi.a(msiContext, f, g);
                if (a3 == null) {
                    msiContext.onError("updateView fail, can not found the view");
                    return;
                } else if (msiNativeViewApi.a(msiContext, a3, f, g, uIArgs, obj) && msiContext.getUIArgs() != null) {
                    msiNativeViewApi.a(msiContext, f, g, msiContext.getUIArgs());
                    msiContext.onSuccess(null);
                    return;
                } else {
                    msiContext.onError("updateView fail");
                    return;
                }
            case 2:
                Object[] objArr8 = {msiContext, Integer.valueOf(f), Integer.valueOf(g), uIArgs, obj};
                ChangeQuickRedirect changeQuickRedirect8 = d;
                if (PatchProxy.isSupport(objArr8, msiNativeViewApi, changeQuickRedirect8, false, "a4b3fc03620202da58005a6278962b70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, msiNativeViewApi, changeQuickRedirect8, false, "a4b3fc03620202da58005a6278962b70");
                    return;
                }
                View b = b(msiContext, f, g);
                if (b == null) {
                    msiContext.onError("failed to remove view : coverView is null");
                    return;
                }
                msiNativeViewApi.a(msiContext, b, f, uIArgs, obj);
                if ((b instanceof e) && msiNativeViewApi.e != null) {
                    g gVar2 = msiNativeViewApi.e;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(f);
                    String sb4 = sb3.toString();
                    e eVar2 = (e) b;
                    Object[] objArr9 = {sb4, eVar2};
                    ChangeQuickRedirect changeQuickRedirect9 = g.a;
                    if (PatchProxy.isSupport(objArr9, gVar2, changeQuickRedirect9, false, "b5af94f1d46c26355e39429370b0ecd2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, gVar2, changeQuickRedirect9, false, "b5af94f1d46c26355e39429370b0ecd2");
                    } else {
                        h hVar2 = gVar2.b.get(sb4);
                        if (hVar2 == null) {
                            com.meituan.msi.log.a.a(sb4 + " removeNativeLifecycleInterceptor fail");
                        } else {
                            hVar2.b(eVar2);
                        }
                    }
                }
                msiContext.onSuccess(null);
                return;
            default:
                msiContext.onError("operation is error. only support insert, update and remove");
                return;
        }
    }

    private String a(JsonObject jsonObject, String str) {
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5423f6dfe41792c61acc9bb0db7fd01f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5423f6dfe41792c61acc9bb0db7fd01f") : jsonObject.has(str) ? jsonObject.get(str).getAsString() : "";
    }

    private String a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6694a4ca52c2479c035e06a512b90a01", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6694a4ca52c2479c035e06a512b90a01") : a(jsonObject, "viewId");
    }

    public final int f(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1b957caf87b2864285a40caa8308f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1b957caf87b2864285a40caa8308f4")).intValue();
        }
        String a = a(jsonObject, "pageId");
        if (TextUtils.isEmpty(a)) {
            return -1;
        }
        try {
            Integer valueOf = Integer.valueOf(a);
            if (valueOf != null) {
                return valueOf.intValue();
            }
        } catch (NumberFormatException unused) {
        }
        return -1;
    }

    public final int g(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199dd3f9399e7349a64d312fb4b9c6ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199dd3f9399e7349a64d312fb4b9c6ce")).intValue();
        }
        String a = a(jsonObject);
        if (TextUtils.isEmpty(a)) {
            return -1;
        }
        int parseInt = NumberUtils.parseInt(a, -1);
        return parseInt == -1 ? a.hashCode() : parseInt;
    }

    public final void a(final MsiContext msiContext, final S s) {
        Object[] objArr = {msiContext, s};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69096158cfaf99929b17b1be8c7da915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69096158cfaf99929b17b1be8c7da915");
        } else {
            this.a.post(new Runnable() { // from class: com.meituan.msi.view.MsiNativeViewApi.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb2ef207d410481b694eda6e480cc14a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb2ef207d410481b694eda6e480cc14a");
                    } else {
                        MsiNativeViewApi.a(MsiNativeViewApi.this, msiContext, s);
                    }
                }
            });
        }
    }

    @Nullable
    public final View a(MsiContext msiContext, int i, int i2) {
        Object[] objArr = {msiContext, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5050cc35145a985200764182d6f7caa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5050cc35145a985200764182d6f7caa6");
        }
        View b = b(msiContext, i, i2);
        if (b == null) {
            msiContext.onError("view not found!");
        }
        return b;
    }

    public final boolean a(MsiContext msiContext, int i, int i2, JsonObject jsonObject) {
        Object[] objArr = {msiContext, Integer.valueOf(i), Integer.valueOf(i2), jsonObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54f9288ad8b23312b8625b2212ea958", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54f9288ad8b23312b8625b2212ea958")).booleanValue();
        }
        IPage pageById = msiContext.getPageById(i);
        if (pageById == null || b(msiContext, i, i2) == null) {
            return false;
        }
        pageById.getViewGroup().a(i2, jsonObject);
        return true;
    }

    public void a(MsiContext msiContext, View view, int i, JsonObject jsonObject, S s) {
        com.meituan.msi.page.e viewGroup;
        Object[] objArr = {msiContext, view, Integer.valueOf(i), jsonObject, s};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c2899022992658dd3c9dbdaa6d6be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c2899022992658dd3c9dbdaa6d6be4");
            return;
        }
        IPage pageById = msiContext.getPageById(i);
        if (pageById == null || (viewGroup = pageById.getViewGroup()) == null) {
            return;
        }
        viewGroup.a(view);
    }

    public static View b(MsiContext msiContext, int i, int i2) {
        Object[] objArr = {msiContext, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06c7e7594fc888095898632d039fc437", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06c7e7594fc888095898632d039fc437");
        }
        IPage pageById = msiContext.getPageById(i);
        if (pageById != null) {
            return pageById.getViewGroup().a(i2, b(msiContext.getUIArgs()));
        }
        return null;
    }

    private static int b(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4058a62485bb1e303265f326e9efad7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4058a62485bb1e303265f326e9efad7f")).intValue();
        }
        if (jsonObject == null || !jsonObject.has("parentId")) {
            return -1;
        }
        try {
            return jsonObject.get("parentId").getAsInt();
        } catch (Exception unused) {
            com.meituan.msi.log.a.a("parentId is : " + jsonObject.get("parentId").getAsString());
            return -1;
        }
    }
}
