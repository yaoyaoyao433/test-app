package com.sankuai.titans.protocol.webcompat.jshost;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Window;
import android.webkit.ValueCallback;
import android.widget.TextView;
import com.sankuai.titans.protocol.utils.OnWebEventListener;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBar;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings;
import com.sankuai.titans.protocol.webcompat.elements.ITitleContent;
import com.sankuai.titans.protocol.webcompat.elements.OnTitleBarEventListener;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IUIManager {
    void addDynamicTitleBarElement(String str, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, ITitleBarActionCallback iTitleBarActionCallback);

    void dismissLoadingView();

    int getBackGroundColor();

    Drawable getBackGroundDrawable();

    Bitmap getCaptureWebView();

    TextView getDebugBar();

    String getTitle();

    ITitleBar getTitleBar();

    ITitleBarUISettings getTitleBarUISettings();

    IWebView getWebView();

    String getWebViewKernel();

    void loadJs(String str, ValueCallback<?> valueCallback);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    void onActivityFinish();

    void onWindowHidden();

    void registerWebEventListener(OnWebEventListener onWebEventListener);

    void removeDynamicTitleBarElement(String str, ITitleBarActionCallback iTitleBarActionCallback);

    void replaceDynamicTitleBarElement(String str, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, ITitleBarActionCallback iTitleBarActionCallback);

    void setActionModeCallback(ActionMode.Callback callback);

    void setBackGroundColor(String str, ITitleBarActionCallback iTitleBarActionCallback);

    void setBackGroundDrawable(Drawable drawable);

    void setBackPressedListener(Runnable runnable);

    void setDynamicTitleBar(DynamicTitleBarEntity dynamicTitleBarEntity, ITitleBarActionCallback iTitleBarActionCallback);

    void setDynamicTitleBarElementAction(String str, String str2, ITitleBarActionCallback iTitleBarActionCallback);

    void setImgTitle(String str, ITitleBarActionCallback iTitleBarActionCallback);

    void setNavigationBar(String str, String str2, boolean z, ITitleBarActionCallback iTitleBarActionCallback);

    void setNavigationBarHidden(boolean z, ITitleBarActionCallback iTitleBarActionCallback);

    void setOnTitleBarEventListener(OnTitleBarEventListener onTitleBarEventListener);

    void setStatusBarStyle(Window window, int i, String str, ITitleBarActionCallback iTitleBarActionCallback);

    void setTitle(String str);

    void setTitleContent(ITitleContent iTitleContent, ITitleBarActionCallback iTitleBarActionCallback);

    void setTitleContentParams(JSONObject jSONObject);

    @Deprecated
    void showErrorView(int i, String str, String str2);

    void unregisterWebEventListener(OnWebEventListener onWebEventListener);
}
