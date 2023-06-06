package com.meituan.android.common.weaver.impl.natives;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.Inner;
import com.meituan.android.common.weaver.impl.RemoteConfig;
import com.meituan.android.common.weaver.impl.listener.LEnd;
import com.meituan.android.common.weaver.impl.listener.RenderEndEvent;
import com.meituan.android.common.weaver.impl.natives.CostMsCounter;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher;
import com.meituan.android.common.weaver.impl.natives.matchers.ImageViewMatcher;
import com.meituan.android.common.weaver.impl.natives.matchers.TextViewMatcher;
import com.meituan.android.common.weaver.impl.utils.FFPDebugger;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener;
import com.meituan.android.common.weaver.interfaces.tracer.ITracer;
import com.meituan.android.mrn.component.map.viewmanager.map.MRNMapViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeEndPoint implements INativeEnd {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter sErrorReporter = new ErrorReporter("NEP", 3);
    private final Activity activity;
    @VisibleForTesting
    public boolean ffpFinished;
    private final long ffpTimeOutDuration;
    private final CostMsCounter.WrapperRunnable mActionDrawDetect;
    private final Runnable mCheckInner;
    @VisibleForTesting
    public CostMsCounter mCostMsCounter;
    private ViewTreeObserver.OnDrawListener mGlobalDrawListener;
    @VisibleForTesting
    public GridsChecker mGridsChecker;
    private final FocusInputMonitor mInputMonitor;
    private final Runnable mTimeoutRunnable;
    private final List<AbstractViewMatcher> mViewMatchers;
    private boolean mWaitingDrawDetecting;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final PagePathHelper pagePath;
    @VisibleForTesting
    public View rootView;

    public NativeEndPoint(@NonNull Activity activity, @NonNull PagePathHelper pagePathHelper) {
        Object[] objArr = {activity, pagePathHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff6c2e915cd662218978731bb634df32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff6c2e915cd662218978731bb634df32");
            return;
        }
        this.mCostMsCounter = new CostMsCounter(sErrorReporter);
        this.mActionDrawDetect = new CostMsCounter.WrapperRunnable(new Runnable() { // from class: com.meituan.android.common.weaver.impl.natives.NativeEndPoint.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18b4fd25da70f95b6ea950ec55169b10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18b4fd25da70f95b6ea950ec55169b10");
                } else if (NativeEndPoint.this.ffpFinished || !NativeEndPoint.this.mWaitingDrawDetecting) {
                } else {
                    Logger.getLogger().d("detect from draw");
                    NativeEndPoint.this.gridsCheckerInner(true);
                }
            }
        });
        this.mTimeoutRunnable = new Runnable() { // from class: com.meituan.android.common.weaver.impl.natives.NativeEndPoint.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "09d6792e37ca9a3f201efdb52d019c30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "09d6792e37ca9a3f201efdb52d019c30");
                } else {
                    NativeEndPoint.this.onTimeout();
                }
            }
        };
        this.mCheckInner = new Runnable() { // from class: com.meituan.android.common.weaver.impl.natives.NativeEndPoint.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7c814f2e05a58e72c312a7b615f3233a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7c814f2e05a58e72c312a7b615f3233a");
                } else {
                    NativeEndPoint.this.gridsCheckerInner(false);
                }
            }
        };
        this.activity = activity;
        this.pagePath = pagePathHelper;
        this.ffpTimeOutDuration = RemoteConfig.sConfig.timeoutOfActivity(pagePathHelper);
        this.mGridsChecker = new GridsChecker(RemoteConfig.sConfig.gridsOfActivity(pagePathHelper));
        this.mInputMonitor = new FocusInputMonitor(this);
        this.mViewMatchers = new ArrayList();
        this.mViewMatchers.add(new ImageViewMatcher(activity, this.mGridsChecker));
        this.mViewMatchers.add(new TextViewMatcher());
        this.mViewMatchers.addAll(Inner.shell.additionalViewMatcher(this));
        this.mViewMatchers.addAll(pagePathHelper.getExternalViewMatcher());
    }

    public boolean isNative() {
        return this.pagePath instanceof PagePathHelper.NativePathHelper;
    }

    public void startTraverseView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b8cb2809d6c09c6effb5ca77c0ba6de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b8cb2809d6c09c6effb5ca77c0ba6de");
        } else {
            this.mCostMsCounter.runSafeSync(new Runnable() { // from class: com.meituan.android.common.weaver.impl.natives.NativeEndPoint.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "66827afd404fea75b1ccc2792d8137d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "66827afd404fea75b1ccc2792d8137d2");
                    } else {
                        NativeEndPoint.this.startInner();
                    }
                }
            });
        }
    }

    private void setWindowCallback(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "868c5c3fc5ae3e10aea9c4ee9d078b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "868c5c3fc5ae3e10aea9c4ee9d078b20");
            return;
        }
        Window window = activity.getWindow();
        if (window == null || !this.pagePath.fullPage()) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallback) {
            return;
        }
        if (callback != null) {
            activity = callback;
        }
        window.setCallback(new WindowCallback(activity, new WindowTouchCallBack() { // from class: com.meituan.android.common.weaver.impl.natives.NativeEndPoint.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.weaver.impl.natives.WindowTouchCallBack
            public void onDown() {
            }

            @Override // com.meituan.android.common.weaver.impl.natives.WindowTouchCallBack
            public void onClick() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "09e084419744d49e66387f903a186651", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "09e084419744d49e66387f903a186651");
                } else {
                    NativeEndPoint.this.onUserTouchView();
                }
            }

            @Override // com.meituan.android.common.weaver.impl.natives.WindowTouchCallBack
            public void onScroll() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8abe5d130a0fbd04031b56af58448b1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8abe5d130a0fbd04031b56af58448b1f");
                } else {
                    NativeEndPoint.this.onUserTouchView();
                }
            }
        }));
    }

    private void removeWindowCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1cdecc882b49df9a79ccda24a3e3fa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1cdecc882b49df9a79ccda24a3e3fa3");
            return;
        }
        Window window = this.activity.getWindow();
        if (window == null || !this.pagePath.fullPage()) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallback) {
            window.setCallback(((WindowCallback) callback).getCallback());
        }
    }

    @VisibleForTesting
    @SuppressLint({"ClickableViewAccessibility"})
    public void startInner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61c9e7b71e9326a74e1872f719fec573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61c9e7b71e9326a74e1872f719fec573");
            return;
        }
        this.rootView = this.pagePath.getRootView();
        if (this.rootView == null) {
            return;
        }
        startTimer();
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.common.weaver.impl.natives.NativeEndPoint.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b095faf882a51df2990befa53c5f9c66", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b095faf882a51df2990befa53c5f9c66");
                } else if (NativeEndPoint.this.ffpFinished) {
                } else {
                    Logger.getLogger().d("onGlobalLayout");
                    NativeEndPoint.this.mCostMsCounter.runSafeSync(NativeEndPoint.this.mCheckInner);
                }
            }
        };
        this.rootView.getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        this.mGlobalDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: com.meituan.android.common.weaver.impl.natives.NativeEndPoint.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "de3b46dfff843d5e69943d2fb1476308", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "de3b46dfff843d5e69943d2fb1476308");
                } else if (NativeEndPoint.this.mWaitingDrawDetecting) {
                } else {
                    NativeEndPoint.this.mWaitingDrawDetecting = true;
                    View view = NativeEndPoint.this.rootView;
                    if (view != null) {
                        NativeEndPoint.this.mCostMsCounter.runSafeAsync(view, NativeEndPoint.this.mActionDrawDetect, 100L);
                    }
                }
            }
        };
        this.rootView.getViewTreeObserver().addOnDrawListener(this.mGlobalDrawListener);
        setWindowCallback(this.activity);
    }

    private void startTimer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "141f20dc6b613e7b4f83d3d796a1ca22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "141f20dc6b613e7b4f83d3d796a1ca22");
        } else {
            this.rootView.postDelayed(this.mTimeoutRunnable, this.ffpTimeOutDuration);
        }
    }

    @VisibleForTesting
    public void gridsCheckerInner(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3b280effa4cbc5caefbdffc8ad9cedc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3b280effa4cbc5caefbdffc8ad9cedc");
            return;
        }
        Logger logger = Logger.getLogger();
        logger.d("start traverse view..");
        this.mWaitingDrawDetecting = false;
        Weaver.getTracer().beginSection("ffp.checker");
        this.mGridsChecker.onePiece(this.activity, this.rootView, this.mViewMatchers, z);
        this.mInputMonitor.checkFocus(this.rootView);
        logger.afterOnePiece(this.mGridsChecker);
        Weaver.getTracer().endSection();
        if (this.mGridsChecker.isMatchRule()) {
            onFFPSuccess();
        }
    }

    @Override // com.meituan.android.common.weaver.impl.natives.INativeEnd
    public void onFFPSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b31aed8c7c08bfa5f618f41db578afe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b31aed8c7c08bfa5f618f41db578afe");
        } else if (this.ffpFinished) {
        } else {
            Logger.getLogger().d("🎉 is up to standard~~ stop traverse view");
            stopTraverse();
            sendFFPEvent(true, "success");
        }
    }

    @Override // com.meituan.android.common.weaver.impl.natives.INativeEnd
    public void onTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69946dc56c9f114cdcc2344f6fc8aa14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69946dc56c9f114cdcc2344f6fc8aa14");
        } else if (this.ffpFinished) {
        } else {
            Logger.getLogger().d("onTimeout");
            stopTraverse();
            sendFFPEvent(false, "timeout");
        }
    }

    @Override // com.meituan.android.common.weaver.impl.natives.INativeEnd
    public void onActivityStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6e83d2e64fe7a6e13ae1be6d626a47c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6e83d2e64fe7a6e13ae1be6d626a47c");
            return;
        }
        if (this.pagePath.fullPage()) {
            FFPDebugger.getFFPDebugger().hideDebugView(this.activity);
        }
        if (this.ffpFinished) {
            return;
        }
        stopTraverse();
    }

    @Override // com.meituan.android.common.weaver.impl.natives.INativeEnd
    public void onUserTouchView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1042321b54ca566edf32816def8cb519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1042321b54ca566edf32816def8cb519");
        } else if (this.ffpFinished) {
        } else {
            stopTraverse();
            sendFFPEvent(false, NativeFFPFinishType.SUCCESS_INTERACT);
        }
    }

    @Override // com.meituan.android.common.weaver.impl.natives.INativeEnd
    public void onMapLoaded() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27adab1e48421e5608ac2014f23df32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27adab1e48421e5608ac2014f23df32");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.meituan.android.common.weaver.impl.natives.NativeEndPoint.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b5f2dee9139d1fd799d8cb625f18ea00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b5f2dee9139d1fd799d8cb625f18ea00");
                        return;
                    }
                    Logger.getLogger().d(MRNMapViewManager.EVENT_ON_MAP_STABLE);
                    NativeEndPoint.this.mCostMsCounter.runSafeSync(NativeEndPoint.this.mCheckInner);
                }
            });
        }
    }

    @MainThread
    private void stopTraverse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d646d09ee1b1e28fc13b3f214d2a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d646d09ee1b1e28fc13b3f214d2a03");
            return;
        }
        this.ffpFinished = true;
        try {
            if (this.rootView != null) {
                this.rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
                this.rootView.getViewTreeObserver().removeOnDrawListener(this.mGlobalDrawListener);
                this.rootView.removeCallbacks(this.mTimeoutRunnable);
            }
            this.mInputMonitor.destroy();
            removeWindowCallback();
        } catch (Throwable th) {
            sErrorReporter.report(th);
        }
    }

    private void sendFFPEvent(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fb8639b681ba78b5f6c493aa5af68a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fb8639b681ba78b5f6c493aa5af68a2");
            return;
        }
        NativeFFPEvent withReachBottom = NativeFFPEvent.of(this.activity).withFinishType(str).withCostMs(this.mCostMsCounter.getCostMs()).withRenderRate(this.mGridsChecker.getRenderRate()).withReachBottom(this.mGridsChecker.getReachBottom());
        this.pagePath.fillFFPTags(withReachBottom);
        this.pagePath.fillPagePathInfo(withReachBottom);
        ITracer tracer = Weaver.getTracer();
        tracer.traceInstant("ffp.result." + str);
        if (!z) {
            long lastCheckFinishTime = this.mGridsChecker.getLastCheckFinishTime();
            if (lastCheckFinishTime > 0) {
                withReachBottom.withCreateMs(lastCheckFinishTime);
            } else {
                withReachBottom.withDefaultCreateMs();
            }
        } else {
            withReachBottom.withDefaultCreateMs();
        }
        if (isNative()) {
            Weaver.getWeaver().weave(withReachBottom);
        } else {
            Weaver.getWeaver().weave(withReachBottom.toContainerEvent());
        }
        reportRenderEnd(withReachBottom);
        if (FFPDebugger.isDebug() && this.pagePath.fullPage()) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeout".equals(str) ? "检测失败" : "检测成功");
            sb.append(CommonConstant.Symbol.BRACKET_LEFT);
            sb.append(str);
            sb.append(")\n渲染占比：");
            sb.append(this.mGridsChecker.getRenderRate());
            sb.append(", 时间开销");
            sb.append(this.mCostMsCounter.getCostMs());
            sb.append('\n');
            sb.append("页面名称: ");
            sb.append(this.activity.getClass().getName());
            sb.append('\n');
            sb.append("时间戳: ");
            sb.append(withReachBottom.createMs());
            FFPDebugger.getFFPDebugger().showDebugView(this.activity, sb, Long.valueOf(withReachBottom.createMs()));
            for (AbstractViewMatcher abstractViewMatcher : this.mViewMatchers) {
                FFPDebugger.getFFPDebugger().highLightView(this.activity, abstractViewMatcher.getFilledViews());
            }
        }
    }

    private void reportRenderEnd(@NonNull NativeFFPEvent nativeFFPEvent) {
        Object[] objArr = {nativeFFPEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e87df74fe0bba91120b00402ef729759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e87df74fe0bba91120b00402ef729759");
            return;
        }
        RenderEndEvent renderEndEvent = null;
        if (this.activity instanceof FFPRenderEndListener) {
            renderEndEvent = new RenderEndEvent(this.activity, nativeFFPEvent);
            ((FFPRenderEndListener) this.activity).onFFPRenderEnd(renderEndEvent);
        }
        LEnd lEnd = new LEnd();
        if (lEnd.withDispatch()) {
            if (renderEndEvent == null) {
                renderEndEvent = new RenderEndEvent(this.activity, nativeFFPEvent);
            }
            lEnd.onFFPRenderEnd(renderEndEvent);
        }
    }
}
