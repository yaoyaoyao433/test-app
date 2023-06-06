package com.meituan.mtwebkit;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.meituan.mtwebkit.MTWebView;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MTWebViewProvider {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ScrollDelegate {
        int computeHorizontalScrollOffset();

        int computeHorizontalScrollRange();

        void computeScroll();

        int computeVerticalScrollExtent();

        int computeVerticalScrollOffset();

        int computeVerticalScrollRange();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ViewDelegate {
        void autofill(SparseArray<AutofillValue> sparseArray);

        boolean dispatchKeyEvent(KeyEvent keyEvent);

        View findFocus(View view);

        AccessibilityNodeProvider getAccessibilityNodeProvider();

        Handler getHandler(Handler handler);

        boolean isVisibleToUserForAutofill(int i);

        void onActivityResult(int i, int i2, Intent intent);

        void onAttachedToWindow();

        boolean onCheckIsTextEditor();

        void onConfigurationChanged(Configuration configuration);

        InputConnection onCreateInputConnection(EditorInfo editorInfo);

        void onDetachedFromWindow();

        boolean onDragEvent(DragEvent dragEvent);

        void onDraw(Canvas canvas);

        void onFinishTemporaryDetach();

        void onFocusChanged(boolean z, int i, Rect rect);

        boolean onGenericMotionEvent(MotionEvent motionEvent);

        boolean onHoverEvent(MotionEvent motionEvent);

        boolean onKeyDown(int i, KeyEvent keyEvent);

        boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent);

        boolean onKeyUp(int i, KeyEvent keyEvent);

        void onMeasure(int i, int i2);

        void onMovedToDisplay(int i, Configuration configuration);

        void onOverScrolled(int i, int i2, boolean z, boolean z2);

        void onProvideAutofillVirtualStructure(Object obj, int i);

        void onProvideContentCaptureStructure(Object obj, int i);

        void onProvideVirtualStructure(Object obj);

        void onScrollChanged(int i, int i2, int i3, int i4);

        void onSizeChanged(int i, int i2, int i3, int i4);

        void onStartTemporaryDetach();

        boolean onTouchEvent(MotionEvent motionEvent);

        boolean onTrackballEvent(MotionEvent motionEvent);

        void onVisibilityChanged(View view, int i);

        void onWindowFocusChanged(boolean z);

        void onWindowVisibilityChanged(int i);

        boolean performLongClick();

        void preDispatchDraw(Canvas canvas);

        boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z);

        boolean requestFocus(int i, Rect rect);

        void scrollTo(int i, int i2);

        void setBackgroundColor(int i);

        void setLayerType(int i, Paint paint);

        void setLayoutParams(ViewGroup.LayoutParams layoutParams);

        void setOverScrollMode(int i);

        void setScrollBarStyle(int i);

        boolean shouldDelayChildPressedState();
    }

    void addJavascriptInterface(Object obj, String str);

    boolean canGoBack();

    boolean canGoBackOrForward(int i);

    boolean canGoForward();

    boolean canZoomIn();

    boolean canZoomOut();

    Picture capturePicture();

    void clearCache(boolean z);

    void clearFormData();

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    void clearView();

    MTWebBackForwardList copyBackForwardList();

    PrintDocumentAdapter createPrintDocumentAdapter(String str);

    void destroy();

    void documentHasImages(Message message);

    void dumpViewHierarchyWithProperties(BufferedWriter bufferedWriter, int i);

    void evaluateJavaScript(String str, MTValueCallback<String> mTValueCallback);

    int findAll(String str);

    void findAllAsync(String str);

    View findHierarchyView(String str, int i);

    void findNext(boolean z);

    void flingScroll(int i, int i2);

    void freeMemory();

    SslCertificate getCertificate();

    int getContentHeight();

    int getContentWidth();

    Bitmap getFavicon();

    MTWebView.HitTestResult getHitTestResult();

    String[] getHttpAuthUsernamePassword(String str, String str2);

    String getOriginalUrl();

    int getProgress();

    boolean getRendererPriorityWaivedWhenNotVisible();

    int getRendererRequestedPriority();

    float getScale();

    ScrollDelegate getScrollDelegate();

    MTWebSettings getSettings();

    Object getTextClassifier();

    String getTitle();

    String getTouchIconUrl();

    String getUrl();

    ViewDelegate getViewDelegate();

    int getVisibleTitleHeight();

    MTWebChromeClient getWebChromeClient();

    MTWebViewClient getWebViewClient();

    MTWebViewRenderProcess getWebViewRenderProcess();

    MTWebViewRenderProcessClient getWebViewRenderProcessClient();

    View getZoomControls();

    void goBack();

    void goBackOrForward(int i);

    void goForward();

    void init(Map<String, Object> map, boolean z);

    void insertVisualStateCallback(long j, MTWebView.VisualStateCallback visualStateCallback);

    void invokeZoomPicker();

    boolean isPaused();

    boolean isPrivateBrowsingEnabled();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    void notifyFindDialogDismissed();

    void onPause();

    void onResume();

    boolean overlayHorizontalScrollbar();

    boolean overlayVerticalScrollbar();

    boolean pageDown(boolean z);

    boolean pageUp(boolean z);

    void pauseTimers();

    void postUrl(String str, byte[] bArr);

    void reload();

    void removeJavascriptInterface(String str);

    void requestFocusNodeHref(Message message);

    void requestImageRef(Message message);

    boolean restorePicture(Bundle bundle, File file);

    MTWebBackForwardList restoreState(Bundle bundle);

    void resumeTimers();

    void savePassword(String str, String str2, String str3);

    boolean savePicture(Bundle bundle, File file);

    MTWebBackForwardList saveState(Bundle bundle);

    void saveWebArchive(String str);

    void saveWebArchive(String str, boolean z, MTValueCallback<String> mTValueCallback);

    void setCertificate(SslCertificate sslCertificate);

    void setDownloadListener(MTDownloadListener mTDownloadListener);

    void setFindListener(MTWebView.FindListener findListener);

    void setHorizontalScrollbarOverlay(boolean z);

    void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);

    void setInitialScale(int i);

    void setMapTrackballToArrowKeys(boolean z);

    void setNetworkAvailable(boolean z);

    void setPictureListener(MTWebView.PictureListener pictureListener);

    void setRendererPriorityPolicy(int i, boolean z);

    void setTextClassifier(Object obj);

    void setVerticalScrollbarOverlay(boolean z);

    void setWebChromeClient(MTWebChromeClient mTWebChromeClient);

    void setWebViewClient(MTWebViewClient mTWebViewClient);

    void setWebViewRenderProcessClient(Executor executor, MTWebViewRenderProcessClient mTWebViewRenderProcessClient);

    boolean showFindDialog(String str, boolean z);

    void stopLoading();

    boolean zoomBy(float f);

    boolean zoomIn();

    boolean zoomOut();
}
