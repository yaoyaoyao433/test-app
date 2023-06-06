package com.dianping.titans.js.jshandler;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ConfirmJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d759af3997d2bf40929d7eda7fc7a1e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d759af3997d2bf40929d7eda7fc7a1e7");
        } else if (!jsHost().isActivated()) {
            jsCallbackError(-1, "internal error");
        } else {
            try {
                String optString = jsBean().argsJson.optString("message");
                String optString2 = jsBean().argsJson.optString("title");
                String optString3 = jsBean().argsJson.optString("okButton");
                String optString4 = jsBean().argsJson.optString("cancelButton");
                AlertDialog.Builder builder = new AlertDialog.Builder(jsHost().getActivity());
                if (!TextUtils.isEmpty(optString2)) {
                    builder.setTitle(optString2);
                }
                AlertDialog.Builder message = builder.setMessage(optString);
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = jsHost().getContext().getString(R.string.knb_sure);
                }
                AlertDialog.Builder positiveButton = message.setPositiveButton(optString3, new DialogInterface.OnClickListener() { // from class: com.dianping.titans.js.jshandler.ConfirmJsHandler.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ffd92e578a632ef7790d654674175033", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ffd92e578a632ef7790d654674175033");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ret", true);
                        } catch (JSONException unused) {
                        }
                        ConfirmJsHandler.this.jsCallback(jSONObject);
                    }
                });
                if (TextUtils.isEmpty(optString4)) {
                    optString4 = jsHost().getContext().getString(R.string.cancel);
                }
                positiveButton.setNegativeButton(optString4, new DialogInterface.OnClickListener() { // from class: com.dianping.titans.js.jshandler.ConfirmJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb431693e54be33a81e5fee4337ce1b7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb431693e54be33a81e5fee4337ce1b7");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ret", false);
                        } catch (JSONException unused) {
                        }
                        ConfirmJsHandler.this.jsCallback(jSONObject);
                    }
                });
                builder.setCancelable(false);
                builder.show();
            } catch (Exception unused) {
            }
        }
    }
}
