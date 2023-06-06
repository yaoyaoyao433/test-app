package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.dianping.networklog.c;
import com.dianping.titans.utils.NetworkUtil;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetNetworkTypeJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc771a1f53468f97a1579ccc2aa0799c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc771a1f53468f97a1579ccc2aa0799c");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (!AppUtils.isActivityAlive(activity)) {
            jsCallbackError(-1, "activity is not alive");
            return;
        }
        ApplicationInfo applicationInfo = activity.getApplicationInfo();
        final String sceneToken = getSceneToken();
        if (applicationInfo == null || applicationInfo.targetSdkVersion > 28) {
            TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_PHONE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.GetNetworkTypeJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "59b715528261bb53aa3eaa578873aa08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "59b715528261bb53aa3eaa578873aa08");
                    } else if (z) {
                        GetNetworkTypeJsHandler.this.toGetNetWorkType(sceneToken);
                    } else {
                        GetNetworkTypeJsHandler getNetworkTypeJsHandler = GetNetworkTypeJsHandler.this;
                        getNetworkTypeJsHandler.jsCallbackError(i, "no permission for Phone.read，sceneToken:" + sceneToken);
                    }
                }
            });
        } else {
            toGetNetWorkType(sceneToken);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toGetNetWorkType(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d745742bf1ae7f52e007fea8921ee681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d745742bf1ae7f52e007fea8921ee681");
        } else {
            KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.js.jshandler.GetNetworkTypeJsHandler.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    NetworkInfo activeNetworkInfo;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "da87eebc2bef04374d6e63bb00454b9e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "da87eebc2bef04374d6e63bb00454b9e");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        ConnectivityManager connectivityManager = (ConnectivityManager) GetNetworkTypeJsHandler.this.jsHost().getContext().getSystemService("connectivity");
                        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                            jSONObject.put("type", activeNetworkInfo.getType());
                            jSONObject.put("subType", activeNetworkInfo.getSubtype());
                            String networkTypeString = NetworkUtil.getNetworkTypeString(GetNetworkTypeJsHandler.this.jsHost().getContext(), str);
                            if (NetworkUtil.NAME_NETWORK_5G.equals(networkTypeString)) {
                                jSONObject.put("networkType", networkTypeString);
                            }
                        }
                        GetNetworkTypeJsHandler.this.jsCallback(jSONObject);
                    } catch (Exception e) {
                        c.a(Log.getStackTraceString(e), 35, new String[]{GetNetworkTypeJsHandler.this.jsBean().method});
                        GetNetworkTypeJsHandler.this.jsCallbackErrorMsg(Log.getStackTraceString(e));
                    }
                }
            });
        }
    }
}
