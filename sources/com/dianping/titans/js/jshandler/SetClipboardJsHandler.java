package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.android.clipboard.a;
import com.meituan.android.clipboard.b;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.util.UIUtil;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetClipboardJsHandler extends BaseJsHandler {
    public static final String LABEL_AND_SCENE = "knb";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "720f102661ce95a99889b24824d66eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "720f102661ce95a99889b24824d66eec");
        } else if (jsBean() == null || jsBean().argsJson == null) {
            c.a("js bean or args json is null", 35);
            jsCallbackErrorMsg("js bean or args json is null");
        } else {
            final String sceneToken = getSceneToken();
            TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_CLIPBOARD, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.SetClipboardJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a3c96858aa88ffd26b7b41abb2f3d89", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a3c96858aa88ffd26b7b41abb2f3d89");
                    } else if (!z) {
                        SetClipboardJsHandler setClipboardJsHandler = SetClipboardJsHandler.this;
                        setClipboardJsHandler.jsCallbackError(i, "no permission for clipboard，sceneToken:" + sceneToken);
                    } else {
                        String optString = SetClipboardJsHandler.this.jsBean().argsJson.optString("content", null);
                        if (TextUtils.isEmpty(optString)) {
                            SetClipboardJsHandler.this.jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), "no content");
                            return;
                        }
                        try {
                            a.a(sceneToken, SetClipboardJsHandler.this.jsBean().argsJson.optString("label", "knb"), optString, "knb", new b() { // from class: com.dianping.titans.js.jshandler.SetClipboardJsHandler.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.meituan.android.clipboard.b
                                public void onSuccess() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5d994594a81bed71a2e77ff736cc1400", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5d994594a81bed71a2e77ff736cc1400");
                                        return;
                                    }
                                    if (SetClipboardJsHandler.this.jsHost().getActivity() != null) {
                                        UIUtil.showLongToast(SetClipboardJsHandler.this.jsHost().getActivity(), "复制成功");
                                    }
                                    SetClipboardJsHandler.this.jsCallback();
                                }

                                @Override // com.meituan.android.clipboard.b
                                public void onFail(int i2, Exception exc) {
                                    Object[] objArr3 = {Integer.valueOf(i2), exc};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d632f8cfa4c49bffdaccab604674a2f7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d632f8cfa4c49bffdaccab604674a2f7");
                                        return;
                                    }
                                    c.a(Log.getStackTraceString(exc), 35);
                                    SetClipboardJsHandler.this.jsCallbackError(i2, Log.getStackTraceString(exc));
                                }
                            });
                        } catch (Throwable th) {
                            c.a(Log.getStackTraceString(th), 35, new String[]{"knb"});
                            SetClipboardJsHandler.this.jsCallbackError(KNBJsErrorInfo.Error_8_System_Api.getErrorCode(), Log.getStackTraceString(th));
                        }
                    }
                }
            });
        }
    }
}
