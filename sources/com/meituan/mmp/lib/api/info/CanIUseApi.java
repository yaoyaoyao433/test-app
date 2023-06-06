package com.meituan.mmp.lib.api.info;

import android.text.TextUtils;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.InternalApi;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.extension.a;
import com.meituan.mmp.lib.api.n;
import com.meituan.mmp.lib.utils.h;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CanIUseApi extends ServiceApi {
    public static ChangeQuickRedirect a;
    private static String[] j = {"onGlobalKeyboardHeightChange", "onAppEnterForeground", "onAppEnterBackground"};
    private static final Set<String> l = h.b("pageScrollTo", "sinkModeHotZone");
    private n h;
    private Set<String> i;

    public CanIUseApi(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53eca88d41b970a82f63456cb8fd76f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53eca88d41b970a82f63456cb8fd76f5");
        } else {
            this.h = nVar;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8122625526c776362bc03cda1e1c6338", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8122625526c776362bc03cda1e1c6338") : new String[]{"canIUse", "canIUseSync"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        JSONObject jSONObject2;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "929b88734d7dcfe6a81a9e55e7a132f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "929b88734d7dcfe6a81a9e55e7a132f4");
            return;
        }
        try {
            String optString = jSONObject.optString("feature", null);
            Object[] objArr2 = {optString};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72848bccc4bb03e60226d344ca2612d2", RobustBitConfig.DEFAULT_VALUE)) {
                jSONObject2 = (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72848bccc4bb03e60226d344ca2612d2");
            } else {
                JSONObject jSONObject3 = new JSONObject();
                for (String str2 : l) {
                    if (TextUtils.isEmpty(optString) || TextUtils.equals(str2, optString)) {
                        jSONObject3.put(str2, true);
                    }
                }
                jSONObject2 = jSONObject3;
            }
            iApiCallback.onSuccess(b(jSONObject2));
        } catch (JSONException e) {
            iApiCallback.onFail(codeJson(-1, e.toString()));
        }
    }

    private JSONObject b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "996f86b4b03528a03248270b3bc296e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "996f86b4b03528a03248270b3bc296e5");
        }
        if (this.i == null) {
            this.i = new HashSet();
            for (String str : j) {
                this.i.add(str);
            }
            j();
            if (n.k != null) {
                a(n.k);
            }
            if (n.l != null) {
                a(n.l);
            }
        }
        Set<String> mmpFeatureHitList = MMPEnvHelper.getMmpFeatureHitList();
        if (!mmpFeatureHitList.isEmpty()) {
            for (String str2 : mmpFeatureHitList) {
                this.i.remove(str2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        for (String str3 : this.i) {
            if (!TextUtils.isEmpty(str3)) {
                if (str3.contains(CommonConstant.Symbol.DOT)) {
                    try {
                        jSONObject2.put(str3, true);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                int indexOf = str3.indexOf(CommonConstant.Symbol.DOT);
                if (indexOf <= 0) {
                    indexOf = str3.length();
                }
                try {
                    jSONObject3.put(str3.substring(0, indexOf), true);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        try {
            jSONObject.put("api", jSONObject3);
            jSONObject.put("contextApi", jSONObject2);
            jSONObject.put("version", "1.24");
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    private void a(Map<String, String> map) {
        Field[] fields;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f1b4799e285013a1ca04a45defa7e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f1b4799e285013a1ca04a45defa7e8");
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                for (Field field : Class.forName(entry.getValue().toString()).getFields()) {
                    if (field.getAnnotation(SupportApiNames.class) != null) {
                        if (field.getType().isArray()) {
                            String[] strArr = (String[]) field.get(null);
                            if (strArr != null) {
                                this.i.addAll(Arrays.asList(strArr));
                            }
                        } else {
                            this.i.add((String) field.get(null));
                        }
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53068425c0e5b424baf39b1fee288e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53068425c0e5b424baf39b1fee288e5d");
            return;
        }
        Set<ServiceApi> set = this.h.b;
        Set<ActivityApi> set2 = this.h.c;
        for (ServiceApi serviceApi : set) {
            a((AbsApi) serviceApi);
        }
        for (ActivityApi activityApi : set2) {
            a((AbsApi) activityApi);
        }
        this.i.addAll(this.h.j.keySet());
    }

    private void a(AbsApi absApi) {
        Object[] objArr = {absApi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3afd2f69b054cf1849de615a619d514e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3afd2f69b054cf1849de615a619d514e");
        } else if (absApi instanceof InternalApi) {
            this.i.addAll(Arrays.asList(a((InternalApi) absApi)));
        } else {
            this.i.add(a((a) absApi));
        }
    }

    private String[] a(InternalApi internalApi) {
        Object[] objArr = {internalApi};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2551cbe48395d4cc6e8f29451d78258", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2551cbe48395d4cc6e8f29451d78258") : internalApi.c();
    }

    private String a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b589061842afd04dff8a8c3346c631ca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b589061842afd04dff8a8c3346c631ca") : aVar.b();
    }
}
