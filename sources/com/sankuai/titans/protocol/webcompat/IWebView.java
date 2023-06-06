package com.sankuai.titans.protocol.webcompat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.sankuai.titans.protocol.utils.HitTestResult;
import com.sankuai.titans.protocol.utils.OnWebEventListener;
import com.sankuai.titans.protocol.utils.PictureListener;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IWebView<T extends ViewGroup> {
    void addJavascriptInterface(Object obj, String str);

    void autofill(SparseArray sparseArray);

    boolean canGoBack();

    boolean canGoBackOrForward(int i);

    boolean canGoForward();

    @Deprecated
    boolean canZoomIn();

    @Deprecated
    boolean canZoomOut();

    @Deprecated
    Picture capturePicture();

    void clearCache(boolean z);

    @RequiresApi(api = 21)
    void clearClientCertPreferences(Runnable runnable);

    void clearFormData();

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    @Deprecated
    void clearView();

    void computeScroll();

    WebBackForwardList copyBackForwardList();

    @Deprecated
    Object createPrintDocumentAdapter();

    Object createPrintDocumentAdapter(String str);

    WebMessagePort[] createWebMessageChannel();

    void destroy();

    void disableWebView();

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    void documentHasImages(Message message);

    @RequiresApi(api = 21)
    void enableSlowWholeDocumentDraw();

    void evaluateJavascript(String str, ValueCallback valueCallback);

    @Deprecated
    String findAddress(String str);

    @Deprecated
    int findAll(String str);

    void findAllAsync(String str);

    View findFocus();

    void findNext(boolean z);

    void flingScroll(int i, int i2);

    @Deprecated
    void freeMemory();

    T get();

    CharSequence getAccessibilityClassName();

    AccessibilityNodeProvider getAccessibilityNodeProvider();

    SslCertificate getCertificate();

    int getContentHeight();

    @RequiresApi(api = 26)
    PackageInfo getCurrentWebViewPackage();

    Bitmap getFavicon();

    Handler getHandler();

    HitTestResult getHitTestResult();

    @Deprecated
    String[] getHttpAuthUsernamePassword(String str, String str2);

    String getKernel();

    List<OnWebEventListener> getOnWebEventListeners();

    String getOriginalUrl();

    int getProgress();

    boolean getRendererPriorityWaivedWhenNotVisible();

    int getRendererRequestedPriority();

    Uri getSafeBrowsingPrivacyPolicyUrl();

    float getScale();

    WebSettings getSettings();

    TextClassifier getTextClassifier();

    String getTitle();

    String getUrl();

    IWebChromeClient getWebChromeClient();

    ClassLoader getWebViewClassLoader();

    IWebViewClient getWebViewClient();

    Looper getWebViewLooper();

    void goBack();

    void goBackOrForward(int i);

    void goForward();

    void invokeZoomPicker();

    boolean isPrivateBrowsingEnabled();

    boolean isVisibleToUserForAutofill(int i);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map map);

    boolean onCheckIsTextEditor();

    @Deprecated
    void onChildViewAdded(View view, View view2);

    @Deprecated
    void onChildViewRemoved(View view, View view2);

    InputConnection onCreateInputConnection(EditorInfo editorInfo);

    boolean onDragEvent(DragEvent dragEvent);

    void onFinishTemporaryDetach();

    boolean onGenericMotionEvent(MotionEvent motionEvent);

    @Deprecated
    void onGlobalFocusChanged(View view, View view2);

    boolean onHoverEvent(MotionEvent motionEvent);

    boolean onKeyDown(int i, KeyEvent keyEvent);

    boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent);

    boolean onKeyUp(int i, KeyEvent keyEvent);

    void onPause();

    void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i);

    void onProvideVirtualStructure(ViewStructure viewStructure);

    void onResume();

    void onStartTemporaryDetach();

    boolean onTouchEvent(MotionEvent motionEvent);

    boolean onTrackballEvent(MotionEvent motionEvent);

    void onWindowFocusChanged(boolean z);

    @Deprecated
    boolean overlayHorizontalScrollbar();

    @Deprecated
    boolean overlayVerticalScrollbar();

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void pauseTimers();

    boolean performLongClick();

    void postUrl(String str, byte[] bArr);

    void postVisualStateCallback(long j, WebView.VisualStateCallback visualStateCallback);

    void postWebMessage(WebMessage webMessage, Uri uri);

    void registerWebEventListener(OnWebEventListener onWebEventListener);

    void reload();

    void removeAllViews();

    void removeJavascriptInterface(String str);

    boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z);

    boolean requestFocus(int i, Rect rect);

    void requestFocusNodeHref(Message message);

    void requestImageRef(Message message);

    WebBackForwardList restoreState(Bundle bundle);

    void resumeTimers();

    @Deprecated
    void savePassword(String str, String str2, String str3);

    WebBackForwardList saveState(Bundle bundle);

    void saveWebArchive(String str);

    void saveWebArchive(String str, boolean z, ValueCallback valueCallback);

    void setAcceptThirdPartyCookies(boolean z);

    void setActionModeCallback(ActionMode.Callback callback);

    void setBackgroundColor(int i);

    @Deprecated
    void setCertificate(SslCertificate sslCertificate);

    void setDataDirectorySuffix(String str);

    void setDownloadListener(DownloadListener downloadListener);

    void setFindListener(WebView.FindListener findListener);

    @Deprecated
    void setHorizontalScrollbarOverlay(boolean z);

    @Deprecated
    void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);

    void setInitialScale(int i);

    void setLayerType(int i, Paint paint);

    @Deprecated
    void setMapTrackballToArrowKeys(boolean z);

    void setNetworkAvailable(boolean z);

    void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener);

    void setOverScrollMode(int i);

    @Deprecated
    void setPictureListener(PictureListener pictureListener);

    void setRendererPriorityPolicy(int i, boolean z);

    void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback);

    void setScrollBarStyle(int i);

    void setTextClassifier(TextClassifier textClassifier);

    @Deprecated
    void setVerticalScrollbarOverlay(boolean z);

    void setWebChromeClient(IWebChromeClient iWebChromeClient);

    void setWebContentsDebuggingEnabled(boolean z);

    void setWebViewClient(IWebViewClient iWebViewClient);

    @Deprecated
    boolean shouldDelayChildPressedState();

    @Deprecated
    boolean showFindDialog(String str, boolean z);

    ActionMode startActionMode(ActionMode.Callback callback);

    @RequiresApi(api = 23)
    ActionMode startActionMode(ActionMode.Callback callback, int i);

    void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback);

    void stopLoading();

    void unregisterWebEventListener(OnWebEventListener onWebEventListener);

    void zoomBy(float f);

    boolean zoomIn();

    boolean zoomOut();
}
