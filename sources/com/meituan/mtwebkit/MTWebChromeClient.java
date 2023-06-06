package com.meituan.mtwebkit;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import com.meituan.mtwebkit.MTGeolocationPermissions;
import com.meituan.mtwebkit.MTWebStorage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebChromeClient {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface CustomViewCallback {
        void onCustomViewHidden();
    }

    public Bitmap getDefaultVideoPoster() {
        return null;
    }

    public View getVideoLoadingProgressView() {
        return null;
    }

    public void getVisitedHistory(MTValueCallback<String[]> mTValueCallback) {
    }

    public void onCloseWindow(MTWebView mTWebView) {
    }

    @Deprecated
    public void onConsoleMessage(String str, int i, String str2) {
    }

    public boolean onCreateWindow(MTWebView mTWebView, boolean z, boolean z2, Message message) {
        return false;
    }

    public void onGeolocationPermissionsHidePrompt() {
    }

    public void onGeolocationPermissionsShowPrompt(String str, MTGeolocationPermissions.Callback callback) {
    }

    public void onHideCustomView() {
    }

    public boolean onJsAlert(MTWebView mTWebView, String str, String str2, MTJsResult mTJsResult) {
        return false;
    }

    public boolean onJsBeforeUnload(MTWebView mTWebView, String str, String str2, MTJsResult mTJsResult) {
        return false;
    }

    public boolean onJsConfirm(MTWebView mTWebView, String str, String str2, MTJsResult mTJsResult) {
        return false;
    }

    public boolean onJsPrompt(MTWebView mTWebView, String str, String str2, String str3, MTJsPromptResult mTJsPromptResult) {
        return false;
    }

    @Deprecated
    public boolean onJsTimeout() {
        return true;
    }

    public void onProgressChanged(MTWebView mTWebView, int i) {
    }

    public void onReceivedIcon(MTWebView mTWebView, Bitmap bitmap) {
    }

    public void onReceivedTitle(MTWebView mTWebView, String str) {
    }

    public void onReceivedTouchIconUrl(MTWebView mTWebView, String str, boolean z) {
    }

    public void onRequestFocus(MTWebView mTWebView) {
    }

    @Deprecated
    public void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
    }

    public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
    }

    public boolean onShowFileChooser(MTWebView mTWebView, MTValueCallback<Uri[]> mTValueCallback, FileChooserParams fileChooserParams) {
        return false;
    }

    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, MTWebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), new Long(j3), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d38f9327a7a9f5d8cd9d09be8714f8b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d38f9327a7a9f5d8cd9d09be8714f8b3");
        } else {
            quotaUpdater.updateQuota(j);
        }
    }

    @Deprecated
    public void onReachedMaxAppCacheSize(long j, long j2, MTWebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {new Long(j), new Long(j2), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7615b50ac290f942f14d581e5105b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7615b50ac290f942f14d581e5105b57");
        } else {
            quotaUpdater.updateQuota(j2);
        }
    }

    public boolean onConsoleMessage(MTConsoleMessage mTConsoleMessage) {
        Object[] objArr = {mTConsoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2de1a8a403b9f0bf6f04605580159bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2de1a8a403b9f0bf6f04605580159bc")).booleanValue();
        }
        onConsoleMessage(mTConsoleMessage.message(), mTConsoleMessage.lineNumber(), mTConsoleMessage.sourceId());
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class FileChooserParams {
        public static final int MODE_OPEN = 0;
        public static final int MODE_OPEN_FOLDER = 2;
        public static final int MODE_OPEN_MULTIPLE = 1;
        public static final int MODE_SAVE = 3;
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract Intent createIntent();

        public abstract String[] getAcceptTypes();

        public abstract String getFilenameHint();

        public abstract int getMode();

        public abstract CharSequence getTitle();

        public abstract boolean isCaptureEnabled();

        public static Uri[] parseResult(int i, Intent intent) {
            Object[] objArr = {Integer.valueOf(i), intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef86613ca2c455e9c684f3aa5d00ca06", RobustBitConfig.DEFAULT_VALUE) ? (Uri[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef86613ca2c455e9c684f3aa5d00ca06") : MTWebViewFactory.getProvider().getStatics().parseFileChooserResult(i, intent);
        }
    }

    @Deprecated
    public void openFileChooser(MTValueCallback<Uri> mTValueCallback, String str, String str2) {
        Object[] objArr = {mTValueCallback, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2018d9342ac533aee85555569a235cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2018d9342ac533aee85555569a235cd0");
        } else {
            mTValueCallback.onReceiveValue(null);
        }
    }
}
