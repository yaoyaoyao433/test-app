package com.dianping.titans.js.jshandler;

import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PickContactJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final HashSet<Integer> sRequestCodes = new HashSet<>();
    private final int mRequestCode;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    public PickContactJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "144bae84484f69052cc8ebef8733503e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "144bae84484f69052cc8ebef8733503e");
        } else {
            this.mRequestCode = getRequestCode();
        }
    }

    private int getRequestCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bc0b3133963c218e6d7d0586b41a2fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bc0b3133963c218e6d7d0586b41a2fc")).intValue();
        }
        int nextInt = new Random().nextInt(1000);
        while (true) {
            int i = nextInt + ConnectionResult.NETWORK_ERROR;
            if (sRequestCodes.contains(Integer.valueOf(i))) {
                nextInt = new Random().nextInt(1000);
            } else {
                sRequestCodes.add(Integer.valueOf(i));
                return i;
            }
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da1da8170a039f5b11819b97ccc1cea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da1da8170a039f5b11819b97ccc1cea");
            return;
        }
        final String sceneToken = getSceneToken();
        TitansPermissionUtil.requestPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_CONTACTS_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.PickContactJsHandler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "99836fe267c239bbd4665bc50c23f318", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "99836fe267c239bbd4665bc50c23f318");
                } else if (z) {
                    try {
                        PickContactJsHandler.this.jsHost().startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), PickContactJsHandler.this.mRequestCode);
                    } catch (Exception e) {
                        PickContactJsHandler pickContactJsHandler = PickContactJsHandler.this;
                        pickContactJsHandler.jsCallbackResult("fail", "-1", "start pick fail:" + Log.getStackTraceString(e), "inner error");
                    }
                } else {
                    PickContactJsHandler pickContactJsHandler2 = PickContactJsHandler.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    String sb2 = sb.toString();
                    pickContactJsHandler2.jsCallbackResult("fail", sb2, "requestPermission error sceneToken is " + sceneToken, "no permission");
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159  */
    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r21, int r22, android.content.Intent r23) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.js.jshandler.PickContactJsHandler.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallbackResult(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47c90f5658e70dbb3336fab23fca2374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47c90f5658e70dbb3336fab23fca2374");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("errorMsg", str3);
            jSONObject.put("errorCode", str2);
            jSONObject.put("msg", str4);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }
}
