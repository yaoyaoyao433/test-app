package com.sankuai.meituan.android.knb;

import android.annotation.TargetApi;
import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.client.WebChromeListener;
import com.sankuai.meituan.android.knb.util.ShowFileChooserUtils;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class KNBWebChromeListenerImpl implements WebChromeListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final KNBWebCompatDelegate mKnbWebCompatDelegate;

    @Override // com.sankuai.meituan.android.knb.client.WebChromeListener
    public final boolean handleJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    @Override // com.sankuai.meituan.android.knb.client.WebChromeListener
    public final void onFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
    }

    public KNBWebChromeListenerImpl(@NonNull KNBWebCompatDelegate kNBWebCompatDelegate) {
        Object[] objArr = {kNBWebCompatDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f17ce236d5c993dde9f0698ed827c191", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f17ce236d5c993dde9f0698ed827c191");
        } else {
            this.mKnbWebCompatDelegate = kNBWebCompatDelegate;
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebChromeListener
    @TargetApi(21)
    public final boolean onShowFileChooser(final ValueCallback<Uri[]> valueCallback, final WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d26d1032f2398e235ee2db0d784c4d5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d26d1032f2398e235ee2db0d784c4d5c")).booleanValue();
        }
        if (this.mKnbWebCompatDelegate.mOnWebChromeClientListener == null || !this.mKnbWebCompatDelegate.mOnWebChromeClientListener.onShowFileChooser(valueCallback, fileChooserParams)) {
            Activity activity = this.mKnbWebCompatDelegate.getActivity();
            if (activity == null || activity.isFinishing()) {
                return false;
            }
            this.mKnbWebCompatDelegate.setUploadCallbackAboveL(valueCallback);
            this.mKnbWebCompatDelegate.setFileChooserParams(fileChooserParams);
            final boolean z = !KNBConfig.getBooleanConfig(KNBConfig.CONFIG_SWITCH_REVERT_FILE_CHOOSER_LOGIC, false);
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add(PermissionGuard.PERMISSION_STORAGE);
                arrayList.add(PermissionGuard.PERMISSION_CAMERA);
            } else {
                arrayList.add(PermissionGuard.PERMISSION_STORAGE);
            }
            TitansPermissionUtil.requestPermissions(activity, arrayList, "pt-ff6806d93a784560", new IRequestPermissionCallback() { // from class: com.sankuai.meituan.android.knb.KNBWebChromeListenerImpl.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z2, int i) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19e9bb9c70c6f62e518a1657162a4901", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19e9bb9c70c6f62e518a1657162a4901");
                    } else if (!z2) {
                        valueCallback.onReceiveValue(null);
                    } else if (z) {
                        ShowFileChooserUtils.showFileChooserImplNew(KNBWebChromeListenerImpl.this.mKnbWebCompatDelegate, fileChooserParams);
                    } else {
                        ShowFileChooserUtils.showFileChooserImplOri(KNBWebChromeListenerImpl.this.mKnbWebCompatDelegate, fileChooserParams);
                    }
                }
            });
            return true;
        }
        return true;
    }

    @Override // com.sankuai.meituan.android.knb.client.WebChromeListener
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8821fff2bd1fa1f066e0eb1b4214a836", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8821fff2bd1fa1f066e0eb1b4214a836")).booleanValue() : this.mKnbWebCompatDelegate.onConsoleMessage(consoleMessage);
    }
}
