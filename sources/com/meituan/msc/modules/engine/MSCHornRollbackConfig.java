package com.meituan.msc.modules.engine;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCHornRollbackConfig extends com.meituan.msc.common.config.a<Config> {
    public static ChangeQuickRedirect c;
    private static MSCHornRollbackConfig d;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("disableBizMinVersionLogic")
        public boolean disableBizMinVersionLogic = false;
        public boolean enableExecuteAllPendingOperations = true;
        public boolean isCloseMinVersionLogic = false;
        public boolean isRollbackWhiteScreenCheckChange = false;
        public boolean needCatchTaskNonexistentException = false;
        public boolean needRollbackSkipMultiStartPageSameTime = false;
        public boolean isRollbackWhiteScreenCheckCancelReport = false;
        public boolean isRollbackPageNotFoundStrategy1 = true;
        public boolean isRollbackPageNotFoundCallBackStrategy = false;
        public boolean disablePreInitRender = false;
        public boolean disableNotifyRenderProcessGone = false;
        public boolean isRollbackTargetExecuteTasksReCalculateCheck = false;
        public boolean isRollbackTaskManagerChangeOfFixPreloadBizReuseRuntime = false;
        public boolean isRollbackContainerPauseUpdateTopContainer = false;
        public boolean isRollbackContainerBlockAppRouteAfterExit = false;
        public boolean isRollbackPreCallCsslibInMSCInit = false;
        public boolean isRollbackPreloadTemplateForMSCList = false;
        public boolean isRollbackReportTextMeasureError = false;
        public boolean isRollbackFixOnPreDrawException = false;
        public boolean isRollbackActivityReuse = true;
        public boolean isRollbackPageMemoryReport = false;
        public boolean isRollbackBatchCheckUpdateAtColdStart = false;
        public boolean isRollbackCreateRenderChange = false;
        public boolean isRollbackTaskManagerExecutePendingTaskChange = false;
        public boolean isRollbackRequestPrefetchGetQuery = false;
        public boolean isRollbackDeleteDDDCacheChange = false;
        public boolean isRollbackWidgetUserPerspectiveCrashReport = false;
        public String[] rollbackAppendBizTagsAppIds = new String[0];
        public boolean isRollbackPendingPreloadBiz = false;
        public boolean isRollbackInstrumentPrefetch = false;
        public boolean isRollbackShanGouRouterPrefetch = false;
        public boolean isRollbackMMPSharedStorage = false;
        public boolean isRollbackEnableBackgroundTimer = false;
        public boolean isRollbackNotSendNavigateBackAtHWMultiWindowMode = false;
        public boolean isRollbackKeepAliveMd5CheckOptimizeChange = false;
        public boolean isRollbackInitConfigChange = false;
        public boolean isRollbackFixPageManagerNPE = false;
    }

    public static MSCHornRollbackConfig d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c35c3618a5417771f521e088bffe7b41", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCHornRollbackConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c35c3618a5417771f521e088bffe7b41");
        }
        if (d == null) {
            synchronized (MSCHornRollbackConfig.class) {
                if (d == null) {
                    d = new MSCHornRollbackConfig();
                }
            }
        }
        return d;
    }

    public MSCHornRollbackConfig() {
        super("msc_feature_rollback", Config.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366d37b7bec5254961f17634aae11e6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366d37b7bec5254961f17634aae11e6b");
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [Config, java.lang.Object] */
    @Override // com.meituan.msc.common.config.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb34b2a3db45c3f6544427889d4b3866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb34b2a3db45c3f6544427889d4b3866");
            return;
        }
        super.b(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = a(str);
        if (this.b != 0) {
            com.meituan.msc.modules.container.fusion.d.d = ((Config) this.b).isRollbackActivityReuse;
        }
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "829b735f0cac866c1340887f7a683526", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "829b735f0cac866c1340887f7a683526")).booleanValue() : !((Config) d().b).disableBizMinVersionLogic;
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cbdb5ab8c1e9483ba768cfb38026897", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cbdb5ab8c1e9483ba768cfb38026897")).booleanValue() : ((Config) d().b).isCloseMinVersionLogic;
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0a7d7c6588305567d07d426b7e9ce04", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0a7d7c6588305567d07d426b7e9ce04")).booleanValue() : ((Config) d().b).isRollbackPageNotFoundCallBackStrategy;
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5af501db1015a68eef39e02a35a23605", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5af501db1015a68eef39e02a35a23605")).booleanValue() : ((Config) d().b).isRollbackPreCallCsslibInMSCInit;
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9731950f4bab923f156a7850876dfcbe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9731950f4bab923f156a7850876dfcbe")).booleanValue() : ((Config) d().b).isRollbackPreloadTemplateForMSCList;
    }

    public static boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc7663264e6b9af47caadf0a659e4dea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc7663264e6b9af47caadf0a659e4dea")).booleanValue() : ((Config) d().b).isRollbackReportTextMeasureError;
    }

    public static boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a730f741605a11da2f5a55712037d12", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a730f741605a11da2f5a55712037d12")).booleanValue() : ((Config) d().b).isRollbackFixOnPreDrawException;
    }

    public static boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2383a57b756b23ebbf19ca79ab959c06", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2383a57b756b23ebbf19ca79ab959c06")).booleanValue() : ((Config) d().b).isRollbackPageMemoryReport;
    }

    public static boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d1d3a4b1bc2c7bc912626ebc43a17ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d1d3a4b1bc2c7bc912626ebc43a17ea")).booleanValue() : ((Config) d().b).isRollbackRequestPrefetchGetQuery;
    }

    public static boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea9ed3dce040d83e3c6f10e5441479ca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea9ed3dce040d83e3c6f10e5441479ca")).booleanValue() : ((Config) d().b).isRollbackMMPSharedStorage;
    }

    public static boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4b3bc8a93063ee379fa591f09c5a100", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4b3bc8a93063ee379fa591f09c5a100")).booleanValue() : ((Config) d().b).isRollbackEnableBackgroundTimer;
    }
}
