package com.dianping.titans.js.jshandler;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ActionSheetJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "097eaee96dc75e035dd603f25801e3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "097eaee96dc75e035dd603f25801e3d0");
        } else if (!jsHost().isActivated()) {
            jsCallbackError(-1, "internal error");
        } else {
            try {
                String optString = jsBean().argsJson.optString("title");
                String optString2 = jsBean().argsJson.optString("cancelButton");
                JSONArray optJSONArray = jsBean().argsJson.optJSONArray("selections");
                AlertDialog.Builder builder = new AlertDialog.Builder(jsHost().getActivity());
                if (!TextUtils.isEmpty(optString)) {
                    builder.setTitle(optString);
                }
                final String[] strArr = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    strArr[i] = optJSONArray.optString(i);
                }
                final JSONObject jSONObject = new JSONObject();
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = jsHost().getContext().getString(R.string.cancel);
                }
                builder.setNegativeButton(optString2, new DialogInterface.OnClickListener() { // from class: com.dianping.titans.js.jshandler.ActionSheetJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1505905f5e0f77a93347b4123465950d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1505905f5e0f77a93347b4123465950d");
                            return;
                        }
                        try {
                            jSONObject.put("selectedIndex", strArr.length + 1);
                            ActionSheetJsHandler.this.jsCallback(jSONObject);
                            dialogInterface.dismiss();
                        } catch (Throwable unused) {
                        }
                    }
                });
                builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.dianping.titans.js.jshandler.ActionSheetJsHandler.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3dc8a2a2285a6c65059cfce12c093c50", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3dc8a2a2285a6c65059cfce12c093c50");
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("selectedIndex", i2);
                            ActionSheetJsHandler.this.jsCallback(jSONObject2);
                            dialogInterface.dismiss();
                        } catch (Throwable unused) {
                        }
                    }
                });
                builder.setCancelable(false);
                builder.show();
            } catch (Exception unused) {
            }
        }
    }
}
