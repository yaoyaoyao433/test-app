package com.meituan.msc.jse.bridge;

import android.app.Activity;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.mmpviews.image.MPRoundImageView;
import com.meituan.msc.mmpviews.list.msclist.view.TemplateInfo;
import com.meituan.msc.mmpviews.perflist.PerfListInfoWrapper;
import com.meituan.msc.mmpviews.swiper.SwiperShellView;
import com.meituan.msc.mmpviews.text.MPInlineBlockTextView;
import com.meituan.msc.mmpviews.text.MPLeafTextView;
import com.meituan.msc.mmpviews.text.MPTextView;
import com.meituan.msc.mmpviews.view.MPViewGroup;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.msc.views.scroll.VelocityHelper;
import com.meituan.msi.ApiPortal;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IRuntimeDelegate {
    void addScrollVelocityHelper(VelocityHelper velocityHelper);

    boolean cascadeUseByteArrayCharset();

    boolean enableJSErrorFix();

    boolean enableOptimizeApplyViewUpdate();

    boolean enablePropsDiff();

    boolean enableTextMeasureOpt();

    boolean enableVNodeErrorFix();

    ApiPortal getApiPortal();

    String getAppId();

    int getCmdIndex();

    String getCssFileContent();

    String getCssParserKey();

    Activity getCurrentActivity();

    String getFileContent(DioFile dioFile);

    IFileModule getFileModule();

    int getInteractionMonitorSamplingRate();

    int getInteractionMonitorTimeWindow();

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    JSInstance getMainThreadJSInstance();

    int getPageId();

    PerfEventRecorder getPerfEventRecorder();

    PerfListInfoWrapper getPerfListInfoWrapper();

    RenderPerf getRenderPerf();

    void handleException(Exception exc);

    boolean hasActiveCatalystInstance();

    boolean hasNewCommand();

    boolean interactionAPIWhiteListContains(String str, String str2);

    boolean interactionCallbackBlackListContains(String str);

    boolean isMainThreadJSEngineReady();

    boolean isNativeRenderType();

    boolean isPageInStrategyB();

    boolean isPreCreateShadows();

    boolean isProdEnv();

    boolean isRollback(String str);

    void notifyRListCreated(int i);

    void printPendingTasks();

    void recordInPage(String str, Map<String, Object> map, boolean z);

    void registerMainThreadJSEngineReadyCallback(Runnable runnable);

    void removeScrollVelocityHelper(VelocityHelper velocityHelper);

    void reportMSCPageInteractionMetrics(int[] iArr, int i, int i2, String str, double d);

    void resetHasNewCommand();

    void setContextForPreCreateView(ThemedReactContext themedReactContext);

    boolean shouldManageViewByCommand();

    boolean shrinkGif();

    void toast(String str);

    MPRoundImageView tryGetMPImageView(ThemedReactContext themedReactContext);

    MPInlineBlockTextView tryGetMPInlineBlockTextView(ThemedReactContext themedReactContext);

    MPLeafTextView tryGetMPLeafTextView(ThemedReactContext themedReactContext);

    SwiperShellView tryGetMPSwiperView(ThemedReactContext themedReactContext);

    MPTextView tryGetMPTextView(ThemedReactContext themedReactContext);

    MPViewGroup tryGetMPView(ThemedReactContext themedReactContext);

    TemplateInfo tryGetTemplateInfo(String str);

    void unregisterMainThreadJSEngineReadyCallback(Runnable runnable);
}
