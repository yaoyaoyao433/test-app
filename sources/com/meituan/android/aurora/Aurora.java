package com.meituan.android.aurora;

import android.app.Application;
import com.meituan.android.aurora.AuroraProject;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.PrintStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Aurora {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int STARTUP_T1 = 1;
    public static final int STARTUP_T2 = 2;
    public static final int STARTUP_T3 = 3;
    private static final Map<AuroraOpportunity, Map<String, AuroraTask>> auroraOpportunitySetMap = new HashMap();
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static Set<String> disableTaskSet = null;
    private static volatile Aurora instance = null;
    private static int startupSection = 1;
    private final Application application;
    private final AuroraAppController mAppController;
    private final AuroraHomeController mHomepageController;

    private boolean matchProcess(int i) {
        return i == -2 || i == -1;
    }

    public static int getStartupSection() {
        return startupSection;
    }

    public static void setStartupSection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bdde1156e5388b0d09e8f9cd955fb537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bdde1156e5388b0d09e8f9cd955fb537");
            return;
        }
        startupSection = i;
        if (AuroraAnchorsRuntime.debuggable()) {
            if (i == 3) {
                System.out.println("AuroraLogger>>>T2:Complete");
            }
            PrintStream printStream = System.out;
            printStream.println("AuroraLogger>>>Startup section set to " + i);
        }
    }

    public Aurora(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1616822341df8e10a5f8fa0e00e624a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1616822341df8e10a5f8fa0e00e624a");
            return;
        }
        this.application = application;
        this.mAppController = new AuroraAppController(application);
        this.mHomepageController = new AuroraHomeController();
    }

    public static Aurora getInstance() {
        return instance;
    }

    public static boolean init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62cc64ecce4cf162bad0742746a4e1e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62cc64ecce4cf162bad0742746a4e1e8")).booleanValue();
        }
        if (instance != null) {
            return false;
        }
        synchronized (Aurora.class) {
            if (instance != null) {
                return false;
            }
            instance = new Aurora(application);
            return true;
        }
    }

    public final synchronized void start(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d071c57966dd6ec45015ab46b6d50bed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d071c57966dd6ec45015ab46b6d50bed");
            return;
        }
        if (AuroraAnchorsRuntime.debuggable() && i == 5) {
            throw new RuntimeException("次级页面不能使用该函数启动，请调用Aurora#startSecondary启动次级页面初始化任务");
        }
        if (i == -2) {
            this.mAppController.startAppAttachTask();
        } else if (i == -1) {
            this.mAppController.startAppCreateTask();
        } else {
            this.mHomepageController.start(i);
        }
    }

    public final synchronized void startSecondaryByPageInfo(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7868b37306575c3677d60bab8e9e9ba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7868b37306575c3677d60bab8e9e9ba3");
        } else {
            AuroraSecondaryController.startSecondaryTaskByPageInfo(str, str2, z);
        }
    }

    @Deprecated
    public final synchronized void startSecondary(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84c0c40611e403bae898645ca8f51672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84c0c40611e403bae898645ca8f51672");
        } else {
            startSecondaryByPageInfo(str, str2, z);
        }
    }

    public final synchronized void startSecondaryByTaskIdSet(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06e3eddececb3d3cd630d10f65eb29bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06e3eddececb3d3cd630d10f65eb29bc");
        } else {
            AuroraSecondaryController.startSecondaryTaskByTaskId(set);
        }
    }

    public final boolean isHomeCacheLoaded() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e32a841867719c1b3bb05dfbd3cb0761", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e32a841867719c1b3bb05dfbd3cb0761")).booleanValue();
        }
        if (this.mHomepageController != null) {
            return this.mHomepageController.isHomeCacheLoaded();
        }
        return false;
    }

    public final Aurora registerOnMainProcess(AuroraTask auroraTask, int i) {
        Object[] objArr = {auroraTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7449ed689c2561bf3a47d3c074178aef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Aurora) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7449ed689c2561bf3a47d3c074178aef");
        }
        if (ProcessUtils.isMainProcess(this.application)) {
            register(auroraTask, i);
        }
        return this;
    }

    public final Aurora registerOnPushProcess(AuroraTask auroraTask, int i) {
        Object[] objArr = {auroraTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a8467b9eea0387f3b52a511d3c4f072", RobustBitConfig.DEFAULT_VALUE)) {
            return (Aurora) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a8467b9eea0387f3b52a511d3c4f072");
        }
        if (AuroraAnchorsRuntime.debuggable() && !matchProcess(i)) {
            throw new RuntimeException("该时机不支持Push进程注册，【" + auroraTask.getId() + "】只能注册在Application#attachBaseContext() or Application#onCreate()阶段.");
        }
        if (AuroraUtils.isPushProcess(this.application)) {
            register(auroraTask, i);
        }
        return this;
    }

    public final Aurora registerOnAllProcess(AuroraTask auroraTask, int i) {
        Object[] objArr = {auroraTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eff0a7c4a70df9d1ef33217b45881be3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Aurora) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eff0a7c4a70df9d1ef33217b45881be3");
        }
        if (AuroraAnchorsRuntime.debuggable() && !matchProcess(i)) {
            throw new RuntimeException("该时机不支持All进程注册，【" + auroraTask.getId() + "】只能注册在Application#attachBaseContext() or Application#onCreate()阶段.");
        }
        register(auroraTask, i);
        return this;
    }

    public final Aurora registerOnProcess(AuroraTask auroraTask, String str, int i) {
        Object[] objArr = {auroraTask, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7382638998f75a5a5c435fa01ede5871", RobustBitConfig.DEFAULT_VALUE)) {
            return (Aurora) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7382638998f75a5a5c435fa01ede5871");
        }
        if (AuroraAnchorsRuntime.debuggable() && this.application != null && !str.equals(this.application.getPackageName()) && !matchProcess(i)) {
            throw new RuntimeException("该时机不支持" + str + "进程注册，【" + auroraTask.getId() + "】只能注册在Application#attachBaseContext() or Application#onCreate()阶段.");
        }
        if (ProcessUtils.isProcess(this.application, str)) {
            register(auroraTask, i);
        }
        return this;
    }

    private void register(AuroraTask auroraTask, int i) {
        Object[] objArr = {auroraTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cda98bc6d3a38090ea2a09c85e18cee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cda98bc6d3a38090ea2a09c85e18cee8");
        } else if (auroraTask == null) {
        } else {
            auroraTask.setOpportunity(i);
            if (i == -2 || i == -1) {
                this.mAppController.register(auroraTask, i);
            } else if (i == 5) {
                AuroraSecondaryController.register(auroraTask, i);
            } else {
                this.mHomepageController.register(auroraTask, i);
            }
        }
    }

    public final Aurora enableLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41c6f4bcfa38ef96f4e39db716b6c727", RobustBitConfig.DEFAULT_VALUE)) {
            return (Aurora) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41c6f4bcfa38ef96f4e39db716b6c727");
        }
        AuroraMainLooper.start(getApplication());
        return this;
    }

    public final Aurora setDebug(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ab3416f107a5a40468fdf2f63f694ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (Aurora) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ab3416f107a5a40468fdf2f63f694ad");
        }
        AuroraAnchorsRuntime.setDebug(z);
        return this;
    }

    public final Aurora abandon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d2fdbc12ee4009c08212ece73d1407c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Aurora) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d2fdbc12ee4009c08212ece73d1407c");
        }
        AuroraReporter.abandon();
        return this;
    }

    public final boolean isAbandon() {
        return AuroraReporter.sAbandon;
    }

    public final Aurora setBabelToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c578e9a55eabc9f5b2b118555b9e7fa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Aurora) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c578e9a55eabc9f5b2b118555b9e7fa6");
        }
        AuroraReporter.setBabelToken(str);
        return this;
    }

    public final void setHornConfig(AuroraConfig auroraConfig) {
        Object[] objArr = {auroraConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e6f0dd1c878bc941a06d2b1431a0cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e6f0dd1c878bc941a06d2b1431a0cd6");
        } else if (auroraConfig == null) {
        } else {
            b.a(AuroraAnchorsRuntime.getSingleThreadPool(), Aurora$$Lambda$1.lambdaFactory$(this, auroraConfig));
        }
    }

    public static /* synthetic */ void lambda$setHornConfig$1(Aurora aurora, AuroraConfig auroraConfig) {
        Object[] objArr = {aurora, auroraConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6ab7914ab99cebc86e51916a4772f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6ab7914ab99cebc86e51916a4772f17");
        } else {
            q.a(aurora.application, AuroraConfig.CHANNEL, 0).a(AuroraConfig.MAIN_LOOPER_KEY, auroraConfig.isEnableMainLooper());
        }
    }

    public static Set<String> getDisableTaskSet() {
        return disableTaskSet;
    }

    public static void setDisableTaskSet(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a544e93a7da9becbc7f375075e08bff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a544e93a7da9becbc7f375075e08bff3");
        } else if (set != null) {
            disableTaskSet = Collections.synchronizedSet(set);
        }
    }

    public static Application getApplication() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "23c98c471479e9ebd93cb75c7ef966e7", RobustBitConfig.DEFAULT_VALUE) ? (Application) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "23c98c471479e9ebd93cb75c7ef966e7") : getInstance().application;
    }

    public static <T extends Enum<T> & AuroraOpportunity> void registerOpportunity(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e0d1153d508dbe9f3fc914d75f3a1948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e0d1153d508dbe9f3fc914d75f3a1948");
            return;
        }
        for (Enum r1 : (Enum[]) cls.getEnumConstants()) {
            auroraOpportunitySetMap.put(r1, new HashMap());
        }
    }

    public static void register(AuroraTask auroraTask, AuroraOpportunity auroraOpportunity) {
        Object[] objArr = {auroraTask, auroraOpportunity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c22e7653c4bcc3b15ce4bb6b2f62530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c22e7653c4bcc3b15ce4bb6b2f62530");
            return;
        }
        auroraTask.setOpportunity(-10);
        auroraTask.setOpportunityName(auroraOpportunity.getName());
        auroraOpportunitySetMap.get(auroraOpportunity).put(auroraTask.getId(), auroraTask);
        if (auroraTask.isAnchors()) {
            AuroraCustomAnchorsRuntime.addAnchorTask(auroraOpportunity, auroraTask.getId());
        }
    }

    public static void start(AuroraOpportunity auroraOpportunity) {
        Object[] objArr = {auroraOpportunity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e7589d10d78bbfb48a12eadb7bde2db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e7589d10d78bbfb48a12eadb7bde2db");
        } else {
            AuroraCustomAnchorsRuntime.start(auroraOpportunity, new AuroraProject.Builder(auroraOpportunity.getName(), auroraOpportunitySetMap.get(auroraOpportunity)).build());
        }
    }
}
