package com.meituan.mmp.lib.api.step;

import android.os.Build;
import com.meituan.android.base.util.a;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.metrics.common.Constants;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.submodule.step.core.AbsStepCountTask;
import com.sankuai.titans.submodule.step.core.IStepCountCallback;
import com.sankuai.titans.submodule.step.core.IStepPermissionCallback;
import com.sankuai.titans.submodule.step.core.StepManager;
import com.sankuai.titans.submodule.step.core.params.GetStepCountParam;
import com.sankuai.titans.submodule.step.core.params.RequestPermissionParam;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@NeedDependency({StepManager.class})
/* loaded from: classes3.dex */
public class StepModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    public AbsStepCountTask<RequestPermissionParam, IStepPermissionCallback> i;
    public AbsStepCountTask<GetStepCountParam, IStepCountCallback> j;

    public StepModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361eaf85ae00fa5d65b897e5e47143d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361eaf85ae00fa5d65b897e5e47143d3");
            return;
        }
        this.i = null;
        this.j = null;
    }

    public static /* synthetic */ void a(StepModule stepModule, final IApiCallback iApiCallback, String str) {
        Object[] objArr = {iApiCallback, str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, stepModule, changeQuickRedirect, false, "4d1ca2128e00ce45bf5487db401d8659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, stepModule, changeQuickRedirect, false, "4d1ca2128e00ce45bf5487db401d8659");
            return;
        }
        if (stepModule.j == null) {
            stepModule.j = StepManager.getInstance().getStepCountTask();
        }
        try {
            stepModule.j.exec(stepModule.getActivity(), new GetStepCountParam(str), new IStepCountCallback() { // from class: com.meituan.mmp.lib.api.step.StepModule.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.titans.submodule.step.core.IStepCountCallback
                public final void onSuccess(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6661d06e94d37ed3010231d83ebd5d15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6661d06e94d37ed3010231d83ebd5d15");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(DeviceInfo.TM, a.c(System.currentTimeMillis()));
                        jSONObject2.put(Constants.SPEED_METER_STEP, i);
                        jSONArray.put(jSONObject2);
                        jSONObject.put("stepInfoList", jSONArray);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    iApiCallback.onSuccess(jSONObject);
                }

                @Override // com.sankuai.titans.submodule.step.core.IStepCountCallback
                public final void onFail(int i, String str2) {
                    Object[] objArr2 = {Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55fb4243166def0b22c85355e41bb2b4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55fb4243166def0b22c85355e41bb2b4");
                        return;
                    }
                    IApiCallback iApiCallback2 = iApiCallback;
                    if (i == 544) {
                        i = -401001;
                    }
                    iApiCallback2.onFail(AbsApi.codeJson(i, str2));
                }
            });
        } catch (Exception e) {
            iApiCallback.onFail(codeJson(-1, e.getMessage()));
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc98a62dc0dc9061faac2dc484f3b2ef", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc98a62dc0dc9061faac2dc484f3b2ef") : new String[]{"getUserStepCount"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) throws d {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49e5ee690f71fe0f0d7b0d091a2b5d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49e5ee690f71fe0f0d7b0d091a2b5d64");
            return;
        }
        if (((str.hashCode() == -2129740190 && str.equals("getUserStepCount")) ? (char) 0 : (char) 65535) == 0) {
            if (!isInnerApp()) {
                iApiCallback.onFail(codeJson(-1, "current app not support"));
                return;
            }
            Object[] objArr2 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83a698873c7e7bf0df1a844e3471a869", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83a698873c7e7bf0df1a844e3471a869");
                return;
            }
            if (this.i == null) {
                this.i = StepManager.getInstance().getStepCountPermissionTask();
            }
            final String token = AbsApi.getToken(jSONObject);
            this.i.exec(getActivity(), new RequestPermissionParam(false, token), new IStepPermissionCallback() { // from class: com.meituan.mmp.lib.api.step.StepModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.titans.submodule.step.core.IStepPermissionCallback
                public final void onSuccess() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bddf5564d6d1b424f7bf1af8196a5872", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bddf5564d6d1b424f7bf1af8196a5872");
                    } else {
                        StepModule.a(StepModule.this, iApiCallback, token);
                    }
                }

                @Override // com.sankuai.titans.submodule.step.core.IStepPermissionCallback
                public final void onFail(int i, String str2) {
                    Object[] objArr3 = {Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae0a0e19d832ef8e5b6eddb4cdb11fdd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae0a0e19d832ef8e5b6eddb4cdb11fdd");
                        return;
                    }
                    IApiCallback iApiCallback2 = iApiCallback;
                    if (i == 544) {
                        i = -401001;
                    }
                    iApiCallback2.onFail(AbsApi.codeJson(i, str2));
                }
            });
            return;
        }
        super.invoke(str, jSONObject, iApiCallback);
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda3db7c0ac9d2a407753931710b2723", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda3db7c0ac9d2a407753931710b2723");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return new String[]{PermissionGuard.PERMISSION_MOTION};
        }
        return null;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2c531d77ab7eb9da5f92e28dcd9667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2c531d77ab7eb9da5f92e28dcd9667");
            return;
        }
        super.onDestroy();
        if (this.j != null) {
            this.j.onDestroy();
        }
    }
}
