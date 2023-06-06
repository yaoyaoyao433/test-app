package com.meituan.android.common.weaver.impl.blank;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.utils.FFPDebugger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Blanks {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile Blanks sBlanks = null;
    public static boolean sEnable = false;
    @GuardedBy("this")
    @VisibleForTesting
    public final Map<Activity, BlankScope> activity2Detector;
    private BlankConfig mConfig;
    private final ErrorReporter mReporter;

    public Blanks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8c5248c0fc38633c3f2d6ee1e59d41f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8c5248c0fc38633c3f2d6ee1e59d41f");
            return;
        }
        this.mReporter = new ErrorReporter("blank", 2);
        this.activity2Detector = new HashMap();
    }

    public static Blanks getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e67bab4270fbf92ebfbcef651bb9230c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Blanks) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e67bab4270fbf92ebfbcef651bb9230c");
        }
        if (sBlanks == null) {
            synchronized (Blanks.class) {
                if (sBlanks == null) {
                    sBlanks = new Blanks();
                }
            }
        }
        return sBlanks;
    }

    public void init(@NonNull Context context, Map<String, Object> map) {
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e49e927cb47f5a4b67e43717a8f98f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e49e927cb47f5a4b67e43717a8f98f5");
            return;
        }
        Application application = null;
        if (context instanceof Application) {
            application = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
        }
        if (application == null) {
            return;
        }
        Horn.preload("weaver_blank", map);
        String accessCache = Horn.accessCache("weaver_blank");
        if ((TextUtils.isEmpty(accessCache) || StringUtil.NULL.equals(accessCache)) && !FFPDebugger.isDebug()) {
            return;
        }
        try {
            this.mConfig = new BlankConfig(accessCache);
            sEnable = this.mConfig.enable;
        } catch (Throwable th) {
            this.mReporter.report(th);
            sEnable = false;
        }
    }

    public boolean onlyMSCCreate() {
        BlankConfig blankConfig = this.mConfig;
        return blankConfig != null && blankConfig.ignoreResume;
    }

    public void onActivityPostCreated(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28ace18e55ee9bf656f6385c406e3e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28ace18e55ee9bf656f6385c406e3e5e");
            return;
        }
        PagePathHelper.NativePathHelper sampleForNativeActivity = this.mConfig.sampleForNativeActivity(activity);
        if (sampleForNativeActivity == null) {
            return;
        }
        View rootView = sampleForNativeActivity.getRootView();
        if ((rootView instanceof ViewGroup) && ((ViewGroup) rootView).getChildCount() == 0) {
            return;
        }
        BlankPageDetector blankPageDetector = new BlankPageDetector(activity, null, sampleForNativeActivity, this.mConfig);
        scope(activity).setFullDetector(blankPageDetector);
        blankPageDetector.startDetect();
    }

    public synchronized BlankScope scope(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "362df24826eac0cc1789720b47714684", RobustBitConfig.DEFAULT_VALUE)) {
            return (BlankScope) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "362df24826eac0cc1789720b47714684");
        }
        BlankScope blankScope = this.activity2Detector.get(activity);
        if (blankScope == null) {
            blankScope = new BlankScope();
            this.activity2Detector.put(activity, blankScope);
        }
        return blankScope;
    }

    public void scheduleContainerDetector(@NonNull Activity activity, @NonNull String str, @NonNull PagePathHelper pagePathHelper, @Nullable View view) {
        Object[] objArr = {activity, str, pagePathHelper, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd3ad3e04d3469d5c65bfdde982c1e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd3ad3e04d3469d5c65bfdde982c1e57");
        } else if (!activity.isDestroyed() && this.mConfig.sampleForContainer(pagePathHelper)) {
            BlankPageDetector blankPageDetector = new BlankPageDetector(activity, view, pagePathHelper, this.mConfig);
            scope(activity).addWidgetDetector(str, blankPageDetector);
            blankPageDetector.startDetect();
        }
    }

    public synchronized PagePathHelper findSpecialPagePath(@NonNull Activity activity, String str) {
        BlankPageDetector findByName;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0d59510cb53d32189bf6b0b2845e322", RobustBitConfig.DEFAULT_VALUE)) {
            return (PagePathHelper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0d59510cb53d32189bf6b0b2845e322");
        }
        BlankScope blankScope = this.activity2Detector.get(activity);
        if (blankScope == null || (findByName = blankScope.findByName(str)) == null) {
            return null;
        }
        return findByName.getPagePathHelper();
    }

    public void scheduleContainerStop(@NonNull Activity activity, @NonNull String str) {
        BlankScope blankScope;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d67ca251ff64829ed73c6236ddcee14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d67ca251ff64829ed73c6236ddcee14");
            return;
        }
        synchronized (this) {
            blankScope = this.activity2Detector.get(activity);
        }
        if (blankScope != null) {
            blankScope.removeWidgetDetector(str);
        }
    }

    public void onActivityStopped(@NonNull Activity activity) {
        BlankScope blankScope;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54b430d4b45e05506ee3ad58b0c120d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54b430d4b45e05506ee3ad58b0c120d8");
            return;
        }
        synchronized (this) {
            blankScope = this.activity2Detector.get(activity);
            this.activity2Detector.remove(activity);
        }
        if (blankScope != null) {
            blankScope.destroy();
        }
    }

    public void onActivityDestroyed(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65993e8c4f5b8853f1166b7e1ba2662a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65993e8c4f5b8853f1166b7e1ba2662a");
        } else {
            onActivityStopped(activity);
        }
    }
}
