package com.meituan.msc.modules.api.msi.api;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.meituan.msc.common.utils.x;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class KeyboardApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class OnKeyboardHeightChangeParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        @MsiParamChecker(required = true)
        public int height;
    }

    @MsiApiMethod(isCallback = true, name = "onKeyboardHeightChange", response = OnKeyboardHeightChangeParams.class)
    public void onKeyboardHeightChange() {
    }

    @MsiApiMethod(name = "hideKeyboard", onUiThread = false)
    public void hideKeyboard(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42c07246db527f34e9b9a4600025f58c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42c07246db527f34e9b9a4600025f58c");
        } else if (this.c == null) {
            msiContext.onError("runtime is null");
        } else {
            p b = b(msiContext);
            if (b == null) {
                g.d("KeyboardApi", "containerDelegate null, appId = ", a());
                msiContext.onError("containerDelegate is null");
                return;
            }
            Activity C = b.C();
            if (C == null) {
                g.d("KeyboardApi", "activity null, appId = ", a());
                msiContext.onError("activity is null");
                return;
            }
            Object[] objArr2 = {C};
            ChangeQuickRedirect changeQuickRedirect2 = x.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0b83936613700f0efc49c4a6ec5bee5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0b83936613700f0efc49c4a6ec5bee5e");
            } else if (C != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) C.getApplication().getSystemService("input_method");
                View currentFocus = C.getCurrentFocus();
                if (currentFocus instanceof EditText) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                } else {
                    inputMethodManager.toggleSoftInput(1, 0);
                }
            }
            msiContext.onSuccess(null);
        }
    }
}
