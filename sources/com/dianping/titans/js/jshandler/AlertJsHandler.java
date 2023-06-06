package com.dianping.titans.js.jshandler;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AlertJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46dd5c3c5a3e5457844e178f2a531bd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46dd5c3c5a3e5457844e178f2a531bd4");
        } else if (!jsHost().isActivated()) {
            jsCallbackError(-1, "internal error");
        } else {
            try {
                String optString = jsBean().argsJson.optString("message");
                String optString2 = jsBean().argsJson.optString("title");
                String optString3 = jsBean().argsJson.optString("button");
                AlertDialog.Builder builder = new AlertDialog.Builder(jsHost().getActivity());
                if (!TextUtils.isEmpty(optString2)) {
                    builder.setTitle(optString2);
                }
                AlertDialog.Builder message = builder.setMessage(optString);
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = jsHost().getContext().getString(R.string.knb_sure);
                }
                message.setPositiveButton(optString3, new DialogInterface.OnClickListener() { // from class: com.dianping.titans.js.jshandler.AlertJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "102e30b1e2b9be92554e719573843ae3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "102e30b1e2b9be92554e719573843ae3");
                        } else {
                            AlertJsHandler.this.jsCallback();
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
