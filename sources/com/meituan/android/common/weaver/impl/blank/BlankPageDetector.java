package com.meituan.android.common.weaver.impl.blank;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebView;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.blank.Screenshot;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.utils.FFPDebugger;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BlankPageDetector implements Screenshot.ScreenshotDoneListener, Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter sErrorReporter = new ErrorReporter("blank", 3);
    private WeakReference<Activity> activityRef;
    private double bottomTrip;
    private long costInMain;
    private volatile boolean isDestroyed;
    private final BlankConfig mConfig;
    private final Runnable mDelay;
    private Handler mainHandler;
    private final PagePathHelper pagePathHelper;
    private final Runnable reportStartDelay;
    private WeakReference<View> rootViewRef;
    private final ScheduledExecutorService scheduledExecutorService;
    private Screenshot screenshot;
    private double topTrip;

    public BlankPageDetector(@NonNull Activity activity, @Nullable View view, @NonNull PagePathHelper pagePathHelper, @NonNull BlankConfig blankConfig) {
        Object[] objArr = {activity, view, pagePathHelper, blankConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66c130976e473803c4e19501f5e28948", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66c130976e473803c4e19501f5e28948");
            return;
        }
        this.isDestroyed = false;
        this.topTrip = -1.0d;
        this.bottomTrip = -1.0d;
        this.scheduledExecutorService = c.c("weaver-blank-start");
        this.reportStartDelay = new Runnable() { // from class: com.meituan.android.common.weaver.impl.blank.BlankPageDetector.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7321e2a3c5fb72df85a527d2215024c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7321e2a3c5fb72df85a527d2215024c");
                } else {
                    BlankPageDetector.this.reportStart();
                }
            }
        };
        this.mDelay = new Runnable() { // from class: com.meituan.android.common.weaver.impl.blank.BlankPageDetector.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Activity activity2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "571f3bd4c8de765668cf7a7c403be40d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "571f3bd4c8de765668cf7a7c403be40d");
                    return;
                }
                try {
                    BlankPageDetector.this.whenOnMain();
                } catch (Throwable th) {
                    HashMap hashMap = null;
                    if (BlankPageDetector.this.activityRef != null && (activity2 = (Activity) BlankPageDetector.this.activityRef.get()) != null) {
                        String name = activity2.getClass().getName();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("actName", name);
                        hashMap = hashMap2;
                    }
                    BlankPageDetector.sErrorReporter.report(th, hashMap);
                }
            }
        };
        this.activityRef = new WeakReference<>(activity);
        this.rootViewRef = new WeakReference<>(view);
        this.mainHandler = FFPUtil.newMainHandler();
        this.pagePathHelper = pagePathHelper;
        this.mConfig = blankConfig;
    }

    public void startDetect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d6295dff6ee4e79264eed223dbffcf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d6295dff6ee4e79264eed223dbffcf4");
        } else {
            b.a(c.a(), this);
        }
    }

    @NonNull
    public PagePathHelper getPagePathHelper() {
        return this.pagePathHelper;
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5aecaca37999204fb800cccc89b11d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5aecaca37999204fb800cccc89b11d1");
        } else if (this.isDestroyed) {
        } else {
            this.isDestroyed = true;
            if (this.screenshot != null) {
                this.screenshot.destroy();
            }
            this.mainHandler.removeCallbacks(this.mDelay);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e57cfd3ec1dc2d97a6829bef0c5686af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e57cfd3ec1dc2d97a6829bef0c5686af");
            return;
        }
        Logger.getLogger().d("start blank detector: ", this.pagePathHelper.getPagePath());
        this.screenshot = Screenshots.current();
        this.mainHandler.postDelayed(this.mDelay, MetricsAnrManager.ANR_THRESHOLD);
        this.scheduledExecutorService.schedule(this.reportStartDelay, 2L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void whenOnMain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb4dd4d6009d51a4757f9ebeb9bbd01c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb4dd4d6009d51a4757f9ebeb9bbd01c");
        } else if (this.isDestroyed) {
        } else {
            Activity activity = this.activityRef.get();
            View view = this.rootViewRef.get();
            if (view == null) {
                view = this.pagePathHelper.getRootView();
            }
            if (this.pagePathHelper.fullPage()) {
                this.topTrip = this.mConfig.topTrip;
                this.bottomTrip = this.mConfig.bottomTrip;
            } else if (view instanceof WebView) {
                this.topTrip = 0.05d;
            }
            if (activity == null || view == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.screenshot.screenShot(activity.getWindow(), view, this);
            this.costInMain = SystemClock.elapsedRealtime() - elapsedRealtime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5636e843511310c3834a75218d579bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5636e843511310c3834a75218d579bc");
        } else if (this.isDestroyed) {
        } else {
            double sampleForStart = this.mConfig.sampleForStart(this.pagePathHelper);
            if (sampleForStart < 0.0d) {
                return;
            }
            HashMap hashMap = new HashMap();
            this.pagePathHelper.fillBlankPagePathInfo(hashMap);
            hashMap.put("$sr", Double.valueOf(sampleForStart));
            Log.Builder lv4LocalStatus = new Log.Builder("").reportChannel("prism-report-fsp").lv4LocalStatus(true);
            Babel.logRT(lv4LocalStatus.tag("wsn_" + hashMap.get("tType") + "_start").optional(hashMap).build());
            Logger.getLogger().d("白屏start, extra=", hashMap.toString());
        }
    }

    @Override // com.meituan.android.common.weaver.impl.blank.Screenshot.ScreenshotDoneListener
    public void onScreenshotDone(int i, @Nullable Bitmap bitmap) {
        Object[] objArr = {Integer.valueOf(i), bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fb69acef6785de4d07a3d1c77592e38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fb69acef6785de4d07a3d1c77592e38");
        } else if (i == 0 && bitmap != null) {
            if (isBlankPage(bitmap)) {
                HashMap hashMap = new HashMap();
                this.pagePathHelper.fillBlankPagePathInfo(hashMap);
                hashMap.put("costInMain", Long.valueOf(this.costInMain));
                Log.Builder lv4LocalStatus = new Log.Builder("").reportChannel("prism-report-fsp").lv4LocalStatus(true);
                Babel.logRT(lv4LocalStatus.tag("wsn_" + hashMap.get("tType")).optional(hashMap).build());
                FFPDebugger.getFFPDebugger().detectBlank(this.pagePathHelper, true, bitmap);
                Logger.getLogger().d("白屏结果 true, extra=", hashMap.toString());
                return;
            }
            FFPDebugger.getFFPDebugger().detectBlank(this.pagePathHelper, false, bitmap);
            Logger.getLogger().d("白屏结果 false: pagePath=", this.pagePathHelper.getPagePath());
        } else {
            FFPDebugger.getFFPDebugger().detectBlank(this.pagePathHelper, false, bitmap);
            Logger.getLogger().d("白屏结果 screenshot failed: ", Integer.valueOf(i));
            HashMap hashMap2 = new HashMap();
            this.pagePathHelper.fillBlankPagePathInfo(hashMap2);
            Babel.logRT(new Log.Builder("").generalChannelStatus(true).optional(hashMap2).tag("weaver-blank-failed").build());
        }
    }

    public boolean isBlankPage(@NonNull Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b2a228f2f8fec0d5f1a99135bc0b393", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b2a228f2f8fec0d5f1a99135bc0b393")).booleanValue();
        }
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int length = iArr.length;
        int height = this.topTrip > 0.0d ? (int) (this.topTrip * bitmap.getHeight() * bitmap.getWidth()) : 0;
        if (this.bottomTrip > 0.0d) {
            length = (int) (length - ((this.bottomTrip * bitmap.getHeight()) * bitmap.getWidth()));
        }
        if (height >= length) {
            return false;
        }
        int i = iArr[height];
        while (height < length) {
            if (iArr[height] != i) {
                return false;
            }
            height++;
        }
        return true;
    }
}
