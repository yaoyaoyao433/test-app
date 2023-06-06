package com.meituan.android.common.statistics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.InnerDataBuilder.CommonDataBuilder;
import com.meituan.android.common.statistics.Interface.IEnvironment;
import com.meituan.android.common.statistics.Interface.LXViewDotter;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.channel.ChannelManager;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.channel.beforeinit.BeforeInitChannelManager;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.config.OceanBlackDownloadManager;
import com.meituan.android.common.statistics.entity.BusinessEntity;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.external.JsToNative;
import com.meituan.android.common.statistics.external.MmpToNative;
import com.meituan.android.common.statistics.flowmanager.client.HighFlowBidManager;
import com.meituan.android.common.statistics.mock.MockApiAgent;
import com.meituan.android.common.statistics.pageinfo.PageInfo;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.quickreport.QuickReportConfigManager;
import com.meituan.android.common.statistics.report.ReportStrategyController;
import com.meituan.android.common.statistics.sensor.SensorCollectManager;
import com.meituan.android.common.statistics.session.SessionBean;
import com.meituan.android.common.statistics.session.SessionBeanManager;
import com.meituan.android.common.statistics.session.SessionManager;
import com.meituan.android.common.statistics.sfrom.SFromManager;
import com.meituan.android.common.statistics.strategy.IReportStrategy;
import com.meituan.android.common.statistics.tag.LocalTagManager;
import com.meituan.android.common.statistics.tag.TagManager;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.DeviceUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.NetWorkConnectionChangedReceiver;
import com.meituan.android.common.statistics.utils.NetworkUtils;
import com.meituan.android.common.statistics.utils.SharedPreferencesHelper;
import com.meituan.android.common.statistics.utils.SntpUtil;
import com.meituan.android.common.statistics.utils.StatisticsUtils;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.cache.IOneIdCallback;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.aa;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.uuid.GetUUID;
import com.meituan.uuid.UUIDListener;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public final class StatisticsDelegate {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mUuid;
    private IEnvironment environment;
    private boolean isColdLaunch;
    private int lx_launch;
    private volatile int mActivityAlive;
    private volatile Runnable mAppQuitRunnable;
    private String mAppStartRequestId;
    private ChannelManager mChannelManager;
    private Context mContext;
    private String mCurrentPushId;
    private String mDefaultChannelName;
    private DefaultEnvironment mDefaultEnvironment;
    private volatile Handler mHandler;
    private volatile boolean mInitialized;
    private boolean mIsTop;
    private Set<String> mPageInfoKeySet;
    private PageInfoManager mPageInfoManager;
    private Long mStartTime;
    private volatile HashMap mValidActivityMap;

    @Deprecated
    public final void handleAppLaunchFromLocal(Context context, String str, SessionBean sessionBean, String str2) {
    }

    @Deprecated
    public final void handleAppLaunchFromRemote(Context context, String str, SessionBean sessionBean, String str2, LaunchParam launchParam) {
    }

    @Deprecated
    public final void handleAppQuitFromRemote(String str, String str2, boolean z, long j) {
    }

    public final void unInit() {
    }

    public StatisticsDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec53fb142497da7778048949939d13bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec53fb142497da7778048949939d13bc");
            return;
        }
        this.mActivityAlive = 0;
        this.mInitialized = false;
        this.isColdLaunch = true;
        this.mValidActivityMap = new HashMap();
        this.mIsTop = true;
        this.mPageInfoKeySet = new HashSet();
        this.mPageInfoManager = null;
        this.mHandler = null;
        this.mAppQuitRunnable = null;
        this.mStartTime = Long.valueOf(System.currentTimeMillis());
        this.mPageInfoManager = PageInfoManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Sub {
        private static final StatisticsDelegate INSTANCE = new StatisticsDelegate();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static StatisticsDelegate getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b14b219f2660ac4c70f80ae2900f2d6e", 6917529027641081856L) ? (StatisticsDelegate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b14b219f2660ac4c70f80ae2900f2d6e") : Sub.INSTANCE;
    }

    public final HashMap getValidActivityMap() {
        return this.mValidActivityMap;
    }

    public final void init(Context context, IEnvironment iEnvironment) {
        Object[] objArr = {context, iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1125e2fdf8025f592f338c0646a840d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1125e2fdf8025f592f338c0646a840d1");
        } else if (this.mInitialized) {
        } else {
            LogUtil.init(context);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            LogUtil.log("init start ps:" + ProcessUtils.getCurrentProcessName(Statistics.getContext()));
            this.mContext = context.getApplicationContext();
            this.environment = iEnvironment;
            this.mDefaultEnvironment = new DefaultEnvironment(this.mContext);
            if (!TextUtils.isEmpty(mUuid)) {
                this.mDefaultEnvironment.getEnvironment().put("uuid", mUuid);
            }
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9c15087c99c86e2550db389997256755", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9c15087c99c86e2550db389997256755");
                        return;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    StatisticsDelegate.this.setupUnionId();
                    ConfigManager.getInstance(StatisticsDelegate.this.mContext).init(StatisticsDelegate.this.mContext, StatisticsDelegate.this.getChannelManager());
                    QuickReportConfigManager.getInstance(StatisticsDelegate.this.mContext).init();
                    StatisticsDelegate.this.registerNetworkChangedReceiver(StatisticsDelegate.this.mContext);
                    StatisticsDelegate.this.registerPrivacy(StatisticsDelegate.this.mContext);
                    CatMonitorManager.getInstance().reportInitTime(SystemClock.elapsedRealtime() - elapsedRealtime2);
                }
            });
            SntpUtil.init(context);
            this.mInitialized = true;
            BeforeInitChannelManager.getInstance().handleBeforeInitData();
            CatMonitorManager.getInstance().reportInitTime(SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerPrivacy(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8afac20712c5a5042b154ae5e856a742", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8afac20712c5a5042b154ae5e856a742");
            return;
        }
        e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard != null) {
            createPermissionGuard.a(context, new aa() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.privacy.interfaces.aa
                public boolean onPrivacyModeChanged(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "daf2450c90259619592c7cba8ad07416", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "daf2450c90259619592c7cba8ad07416")).booleanValue();
                    }
                    LogUtil.log("privacy-permissionGuard", "isPrivacyMode=" + z);
                    if (!z) {
                        StatisticsDelegate.this.getOaid();
                        StatisticsDelegate.this.updateDefaultEnvironment("android_id", AppUtil.getAndroidId(StatisticsDelegate.this.mContext));
                    }
                    return z;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerNetworkChangedReceiver(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3f52a15b5716f6d5b162d4544a828d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3f52a15b5716f6d5b162d4544a828d2");
        } else if (context == null) {
        } else {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new NetWorkConnectionChangedReceiver(), intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    public final void handleOnCreateSession(SessionBean sessionBean) {
        Object[] objArr = {sessionBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "570dfcba406f5c9b006afd6193403624", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "570dfcba406f5c9b006afd6193403624");
        } else {
            handleUpdateSession(SharedPreferencesHelper.getInstance(this.mContext).getActivityActiveCount() <= 0, sessionBean);
        }
    }

    public final void onCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48a2cd3b0c59d8f3b84cbf38e119b34d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48a2cd3b0c59d8f3b84cbf38e119b34d");
        } else if (activity == null) {
        } else {
            handleOnCreateSession(getSessionBean(activity));
            if (bundle == null) {
                return;
            }
            String generatePageInfoKey = AppUtil.generatePageInfoKey(activity);
            String string = bundle.getString("pageName");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            handleAppCreate(generatePageInfoKey, string);
        }
    }

    public final void handleAppCreate(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f0ad623ef4dfd0dd1158b2ec3bae235", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f0ad623ef4dfd0dd1158b2ec3bae235");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            TagManager.getInstance().updatePageName(str, str2);
        }
    }

    public final void onSaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64588537e75dc33bdc38104df530e2b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64588537e75dc33bdc38104df530e2b0");
        } else if (activity == null || bundle == null) {
        } else {
            bundle.putString("pageName", AppUtil.generatePageInfoKey(activity));
        }
    }

    public final void resetPageIdentify(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e47c5bd9fff59779f8b9df008ebfa1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e47c5bd9fff59779f8b9df008ebfa1d");
        } else {
            this.mPageInfoManager.addPageInfo(str, str2);
        }
    }

    public final void resetPageName(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "356534dbeb27ca5705640d6b6fa64751", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "356534dbeb27ca5705640d6b6fa64751");
        } else {
            this.mPageInfoManager.setCid(str, str2);
        }
    }

    public final ChannelManager getChannelManager() {
        ChannelManager channelManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d7077411f828bedb4d08976845e18c", 6917529027641081856L)) {
            return (ChannelManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d7077411f828bedb4d08976845e18c");
        }
        synchronized (this) {
            if (isInitialized() && this.mChannelManager == null) {
                this.mChannelManager = new ChannelManager(this.mContext, this.mDefaultEnvironment, this.environment);
            }
            channelManager = this.mChannelManager;
        }
        return channelManager;
    }

    public final String getDefaultChannelName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b0b777745d6a83a6420ac5dd4794099", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b0b777745d6a83a6420ac5dd4794099");
        }
        PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
        if (currentPageInfo != null) {
            String category = currentPageInfo.getCategory();
            if (!TextUtils.isEmpty(category)) {
                return category;
            }
        }
        if (!TextUtils.isEmpty(this.mDefaultChannelName)) {
            return this.mDefaultChannelName;
        }
        String applicationName = AppUtil.getApplicationName(this.mContext);
        return applicationName == null ? "" : applicationName;
    }

    public final void setDefaultChannelName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21349213de44b5194b6b3b96c3f5aa87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21349213de44b5194b6b3b96c3f5aa87");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mDefaultChannelName = str;
            PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
            if (currentPageInfo != null) {
                currentPageInfo.setCategory(str);
            }
        }
    }

    public final void setDefaultChannelName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a06d143a0de782b5e62b7a5eaf66c55a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a06d143a0de782b5e62b7a5eaf66c55a");
        } else {
            PageInfoManager.getInstance().setDefaultChannelName(str, str2);
        }
    }

    public final void setUUID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ddd34e82cd5a7fc96a348f2becc2ee7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ddd34e82cd5a7fc96a348f2becc2ee7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.mDefaultEnvironment != null && this.mDefaultEnvironment.getEnvironment() != null) {
                this.mDefaultEnvironment.getEnvironment().put("uuid", str);
                this.mStartTime = updateStartTime(this.mStartTime, true);
                return;
            }
            mUuid = str;
        }
    }

    public final void setDPID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed41ddb455dac12f0e769cd2bbef308b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed41ddb455dac12f0e769cd2bbef308b");
        } else if (TextUtils.isEmpty(str)) {
            AppUtil.LogReport(StatisticsDelegate.class, "setDPID: dpid is empty");
        } else if (this.mDefaultEnvironment != null && this.mDefaultEnvironment.getEnvironment() != null) {
            this.mDefaultEnvironment.getEnvironment().put("dpid", str);
            this.mStartTime = updateStartTime(this.mStartTime, true);
        } else {
            AppUtil.LogReport(StatisticsDelegate.class, "setDPID: mDefaultEnvironment is null");
        }
    }

    public final String getUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acdcfe618560888e24f8126f5125b19f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acdcfe618560888e24f8126f5125b19f");
        }
        if (isInitialized()) {
            String str = null;
            if (this.mDefaultEnvironment != null && this.mDefaultEnvironment.getEnvironment() != null) {
                str = this.mDefaultEnvironment.getEnvironment().get(Constants.Environment.KEY_UNION_ID);
            }
            if (TextUtils.isEmpty(str)) {
                OneIdHandler oneIdHandler = OneIdHandler.getInstance(this.mContext);
                oneIdHandler.init();
                oneIdHandler.getOneId(new IOneIdCallback() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.unionid.oneid.cache.IOneIdCallback
                    public void call(String str2) {
                        Object[] objArr2 = {str2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "072a901f3b54c546eace3c41fe5a1568", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "072a901f3b54c546eace3c41fe5a1568");
                        } else if (TextUtils.isEmpty(str2) || StatisticsDelegate.this.mDefaultEnvironment == null || StatisticsDelegate.this.mDefaultEnvironment.getEnvironment() == null || StringUtil.NULL.equals(str2)) {
                        } else {
                            StatisticsDelegate.this.mDefaultEnvironment.getEnvironment().put(Constants.Environment.KEY_UNION_ID, str2);
                        }
                    }
                });
                return "";
            }
            return str;
        }
        return "";
    }

    public final void setReportStrategy(IReportStrategy iReportStrategy) {
        Object[] objArr = {iReportStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f004441eb1448c66dd1d959db479557b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f004441eb1448c66dd1d959db479557b");
        } else if (getChannelManager() != null) {
            getChannelManager().setReportStrategy(iReportStrategy);
        }
    }

    public final String JsToNative(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78bb4b2e1eadb986b7823c9855cf9b8b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78bb4b2e1eadb986b7823c9855cf9b8b") : JsToNative.jsToNative(this.mContext, str);
    }

    public final JSONObject mmpToNative(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a20ccf59c8e1c4a16ed3169b6bf6dfb", 6917529027641081856L) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a20ccf59c8e1c4a16ed3169b6bf6dfb") : MmpToNative.mmpToNative(this.mContext, jSONObject);
    }

    public final void enableMock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0a64bdaed85530b0146e5039535a349", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0a64bdaed85530b0146e5039535a349");
        } else {
            MockApiAgent.get().enable();
        }
    }

    public final void setMockUri(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "205ec3a178cc1b82934ad01266bc04ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "205ec3a178cc1b82934ad01266bc04ba");
        } else if (this.mDefaultEnvironment == null || this.mDefaultEnvironment.getEnvironment() == null) {
        } else {
            String str = this.mDefaultEnvironment.getEnvironment().get("dpid");
            if (!TextUtils.isEmpty(str)) {
                MockApiAgent.get().setDpId(str);
            }
            String str2 = this.mDefaultEnvironment.getEnvironment().get(Constants.Environment.KEY_UNION_ID);
            if (!TextUtils.isEmpty(str2)) {
                MockApiAgent.get().setUnionId(str2);
            }
            String str3 = this.mDefaultEnvironment.getEnvironment().get("uuid");
            if (!TextUtils.isEmpty(str3)) {
                MockApiAgent.get().setUUID(str3);
            }
            MockApiAgent.get().setScanUri(uri);
        }
    }

    public final void disableMock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ac8c22b45b5c6ea644ee0bb1da58bc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ac8c22b45b5c6ea644ee0bb1da58bc2");
        } else {
            MockApiAgent.get().disable();
        }
    }

    private void setupUUID(final OneIdHandler oneIdHandler) {
        Object[] objArr = {oneIdHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94f5df4bca9220b4d257d65bd51adb2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94f5df4bca9220b4d257d65bd51adb2c");
        } else {
            GetUUID.getInstance().getSyncUUID(this.mContext, new UUIDListener() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.uuid.UUIDListener
                public void notify(Context context, String str) {
                    Object[] objArr2 = {context, str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "23a968b542d56841de3a58dca4c55d55", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "23a968b542d56841de3a58dca4c55d55");
                    } else if (TextUtils.isEmpty(str) || StatisticsDelegate.this.mDefaultEnvironment == null || StatisticsDelegate.this.mDefaultEnvironment.getEnvironment() == null) {
                    } else {
                        StatisticsDelegate.this.mDefaultEnvironment.getEnvironment().put("uuid", str);
                        StatisticsDelegate.this.setupDPID(oneIdHandler, str);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupDPID(OneIdHandler oneIdHandler, String str) {
        Object[] objArr = {oneIdHandler, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36828e6136a38db5b27b5949b47a4767", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36828e6136a38db5b27b5949b47a4767");
        } else if (oneIdHandler != null) {
            String oneIdByDpid = oneIdHandler.getOneIdByDpid(str, AppUtil.getAndroidId(this.mContext), com.meituan.android.common.unionid.oneid.util.AppUtil.getSerial(this.mContext), NetworkUtils.mac(this.mContext));
            if (TextUtils.isEmpty(oneIdByDpid)) {
                return;
            }
            this.mDefaultEnvironment.getEnvironment().put("dpid", oneIdByDpid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b4c9154a45f0dfb5da68a8a1c055863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b4c9154a45f0dfb5da68a8a1c055863");
            return;
        }
        OneIdHandler oneIdHandler = OneIdHandler.getInstance(this.mContext);
        oneIdHandler.init();
        setupUUID(oneIdHandler);
        oneIdHandler.getOneId(new IOneIdCallback() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.unionid.oneid.cache.IOneIdCallback
            public void call(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "79cdb4bab2c712d3e5e8b2aefbf09adb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "79cdb4bab2c712d3e5e8b2aefbf09adb");
                    return;
                }
                try {
                    if (TextUtils.isEmpty(str) || StatisticsDelegate.this.mDefaultEnvironment == null || StatisticsDelegate.this.mDefaultEnvironment.getEnvironment() == null || StringUtil.NULL.equals(str)) {
                        return;
                    }
                    StatisticsDelegate.this.mDefaultEnvironment.getEnvironment().put(Constants.Environment.KEY_UNION_ID, str);
                    OceanBlackDownloadManager.getInstance().pullServiceBlackConfig(StatisticsDelegate.this.mContext, str.substring(str.length() - 2));
                } catch (Exception unused) {
                }
            }
        });
        String trim = com.meituan.android.common.unionid.oneid.util.AppUtil.getLocalIdForLX(this.mContext).replaceAll("\r|\n", "").trim();
        if (!TextUtils.isEmpty(trim) && this.mDefaultEnvironment != null && this.mDefaultEnvironment.getEnvironment() != null) {
            this.mDefaultEnvironment.getEnvironment().put(DeviceInfo.LOCAL_ID, trim);
        }
        if (DeviceUtil.isPrivacyMode(this.mContext)) {
            return;
        }
        getOaid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getOaid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3904178d3b2efeb83e0a0f17e3ec13f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3904178d3b2efeb83e0a0f17e3ec13f");
        } else {
            OaidManager.getInstance().getOaid(this.mContext, new OaidCallback() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                public void onSuccuss(boolean z, String str, boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4abfdbed085e149219263df6d1e9b359", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4abfdbed085e149219263df6d1e9b359");
                        return;
                    }
                    if (!TextUtils.isEmpty(str) && StatisticsDelegate.this.mDefaultEnvironment != null && StatisticsDelegate.this.mDefaultEnvironment.getEnvironment() != null && !StringUtil.NULL.equals(str)) {
                        StatisticsDelegate.this.mDefaultEnvironment.getEnvironment().put("oaid", str);
                    }
                    CommonDataBuilder.getInstance().updateData(CommonDataBuilder.OAID_USER_LIMITED, Boolean.valueOf(z2));
                }

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                public void onFail(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf6f09dfc1f9ba5b12476f467104be84", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf6f09dfc1f9ba5b12476f467104be84");
                        return;
                    }
                    LogUtil.log("getoaid onfail:" + str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Long updateStartTime(Long l, boolean z) {
        Object[] objArr = {l, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2aa38a3b5d0bcbd00fc5d75043e3904", 6917529027641081856L) ? (Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2aa38a3b5d0bcbd00fc5d75043e3904") : z ? Long.valueOf(System.currentTimeMillis()) : l;
    }

    @Deprecated
    private void startNewSession(Context context, DefaultEnvironment defaultEnvironment) {
        Object[] objArr = {context, defaultEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38c920ef3c7ab2549dcebedfdd94825f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38c920ef3c7ab2549dcebedfdd94825f");
            return;
        }
        defaultEnvironment.setEnvironment("msid", AppUtil.getDeviceId(context) + System.currentTimeMillis());
        clearSFrom();
    }

    @Deprecated
    private void clearSFrom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32166ac219b174e1e7eb235e84acbc29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32166ac219b174e1e7eb235e84acbc29");
        } else {
            SFromManager.getInstance().clear();
        }
    }

    private static SessionBean getOppoPushSessionBean(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        SessionBean sessionBean = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7fe53c455c667911be7fa1bd3fe6508e", 6917529027641081856L)) {
            return (SessionBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7fe53c455c667911be7fa1bd3fe6508e");
        }
        if (intent == null) {
            return null;
        }
        LogUtil.log("getSessionBean() uri == null");
        if (!TextUtils.isEmpty(f.a(intent, "lch"))) {
            sessionBean = new SessionBean();
            sessionBean.lch = f.a(intent, "lch");
            LogUtil.log("getOppoPushSessionBean() lch==" + sessionBean.lch);
        }
        if (!TextUtils.isEmpty(f.a(intent, Constants.Environment.KEY_PUSHID))) {
            if (sessionBean == null) {
                sessionBean = new SessionBean();
            }
            sessionBean.pushid = f.a(intent, Constants.Environment.KEY_PUSHID);
            LogUtil.log("getOppoPushSessionBean() pushid==" + sessionBean.pushid);
        }
        if (!TextUtils.isEmpty(f.a(intent, Constants.Environment.KEY_PUSH_EXT))) {
            if (sessionBean == null) {
                sessionBean = new SessionBean();
            }
            sessionBean.pushExt = f.a(intent, Constants.Environment.KEY_PUSH_EXT);
            LogUtil.log("getOppoPushSessionBean() pushExt==" + sessionBean.pushExt);
        }
        if (!TextUtils.isEmpty(f.a(intent, "utm_source"))) {
            if (sessionBean == null) {
                sessionBean = new SessionBean();
            }
            sessionBean.utmSource = f.a(intent, "utm_source");
            LogUtil.log("getOppoPushSessionBean() utmSource==" + sessionBean.utmSource);
        }
        if (!TextUtils.isEmpty(f.a(intent, "utm_medium"))) {
            if (sessionBean == null) {
                sessionBean = new SessionBean();
            }
            sessionBean.utmMedium = f.a(intent, "utm_medium");
            LogUtil.log("getOppoPushSessionBean() utmMedium==" + sessionBean.utmMedium);
        }
        if (!TextUtils.isEmpty(f.a(intent, "utm_term"))) {
            if (sessionBean == null) {
                sessionBean = new SessionBean();
            }
            sessionBean.utmTerm = f.a(intent, "utm_term");
            LogUtil.log("getOppoPushSessionBean() utmTerm==" + sessionBean.utmTerm);
        }
        if (!TextUtils.isEmpty(f.a(intent, "utm_content"))) {
            if (sessionBean == null) {
                sessionBean = new SessionBean();
            }
            sessionBean.utmContent = f.a(intent, "utm_content");
            LogUtil.log("getOppoPushSessionBean() utmContent==" + sessionBean.utmContent);
        }
        if (!TextUtils.isEmpty(f.a(intent, "utm_campaign"))) {
            if (sessionBean == null) {
                sessionBean = new SessionBean();
            }
            sessionBean.utmCampaign = f.a(intent, "utm_campaign");
            LogUtil.log("getOppoPushSessionBean() utmCampaign==" + sessionBean.utmCampaign);
        }
        return sessionBean;
    }

    public static SessionBean getSessionBean(Activity activity) {
        Intent intent;
        SessionBean sessionBean;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6aa67d93402edab0fbb7fafdb2d6015", 6917529027641081856L)) {
            return (SessionBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6aa67d93402edab0fbb7fafdb2d6015");
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            return getOppoPushSessionBean(intent);
        }
        try {
            sessionBean = new SessionBean();
        } catch (Exception e) {
            e = e;
            sessionBean = null;
        }
        try {
            sessionBean.lch = data.getQueryParameter("lch");
            sessionBean.pushid = data.getQueryParameter(Constants.Environment.KEY_PUSHID);
            sessionBean.pushExt = data.getQueryParameter(Constants.Environment.KEY_PUSH_EXT);
            sessionBean.utmSource = data.getQueryParameter("utm_source");
            sessionBean.utmMedium = data.getQueryParameter("utm_medium");
            sessionBean.utmTerm = data.getQueryParameter("utm_term");
            sessionBean.utmContent = data.getQueryParameter("utm_content");
            sessionBean.utmCampaign = data.getQueryParameter("utm_campaign");
            sessionBean.tn = data.getQueryParameter(Constants.Environment.KEY_TN);
            sessionBean.tc = data.getQueryParameter(Constants.Environment.KEY_TC);
            sessionBean.slxcuid = data.getQueryParameter(Constants.Environment.KEY_SLXCUID);
            sessionBean.oauid = data.getQueryParameter("oauid");
            sessionBean.sunionId = data.getQueryParameter(Constants.Environment.KEY_SUNION_ID);
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return sessionBean;
        }
        return sessionBean;
    }

    private boolean lchTriggerNewSession(Activity activity, DefaultEnvironment defaultEnvironment) {
        String queryParameter;
        boolean z = false;
        Object[] objArr = {activity, defaultEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af4780b899b20d9cdb8de76ab30ca1d9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af4780b899b20d9cdb8de76ab30ca1d9")).booleanValue();
        }
        try {
            Uri data = activity.getIntent().getData();
            if (data != null && data.getQueryParameter("lch") != null && !TextUtils.isEmpty(data.getQueryParameter("lch").trim())) {
                String queryParameter2 = data.getQueryParameter("lch");
                if (queryParameter2.equals("push") && (queryParameter = data.getQueryParameter(Constants.Environment.KEY_PUSHID)) != null && !queryParameter.equals(this.mCurrentPushId)) {
                    defaultEnvironment.setEnvironment(Constants.Environment.KEY_PUSHID, queryParameter);
                    try {
                        this.mCurrentPushId = queryParameter;
                        z = true;
                    } catch (Exception unused) {
                        z = true;
                    }
                }
                if (defaultEnvironment != null && defaultEnvironment.getEnvironment() != null && !queryParameter2.equals(defaultEnvironment.getEnvironment().get("lch"))) {
                    defaultEnvironment.setEnvironment("lch", queryParameter2);
                }
            } else if (defaultEnvironment != null && defaultEnvironment.getEnvironment() != null && TextUtils.isEmpty(defaultEnvironment.getEnvironment().get("lch"))) {
                defaultEnvironment.setEnvironment("lch", AppUtil.getApplicationName(this.mContext));
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    @Deprecated
    private boolean isMsIdInvalid(Context context, DefaultEnvironment defaultEnvironment) {
        Object[] objArr = {context, defaultEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5b78b442fa2bc9a46bf7270f836b228", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5b78b442fa2bc9a46bf7270f836b228")).booleanValue() : !(defaultEnvironment == null || defaultEnvironment.getEnvironment() == null || defaultEnvironment.getEnvironment().get("msid") != null) || System.currentTimeMillis() - getQuitTime(context).longValue() > 1800000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetQuitTime(Context context, Long l) {
        Object[] objArr = {context, l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44e7870b99709e8ea65bf6b03d6d2b6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44e7870b99709e8ea65bf6b03d6d2b6d");
        } else if (context == null) {
        } else {
            SharedPreferencesHelper.getInstance(context).resetQuitTime(l);
        }
    }

    private Long getQuitTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d28e4a692deb23f33f2bfd940d56734c", 6917529027641081856L) ? (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d28e4a692deb23f33f2bfd940d56734c") : SharedPreferencesHelper.getInstance(context).getQuitTime();
    }

    public final boolean isInitialized() {
        return this.mInitialized;
    }

    public final void updateDefaultEnvironment(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28248dd7cdb561f87871ac8da8effceb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28248dd7cdb561f87871ac8da8effceb");
        } else if (this.mDefaultEnvironment != null) {
            this.mDefaultEnvironment.update(str, str2);
        }
    }

    public final void updateDefaultEnvironment(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24db63a8f0361bcdb19e15ecd3b69545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24db63a8f0361bcdb19e15ecd3b69545");
        } else if (this.mDefaultEnvironment != null) {
            this.mDefaultEnvironment.update(map);
        }
    }

    public final void updateDefaultEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1c9641e8a9cf058b4f10b95ea58169e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1c9641e8a9cf058b4f10b95ea58169e");
        } else if (this.mDefaultEnvironment != null) {
            this.mDefaultEnvironment.update();
        }
    }

    public final void setDefaultCategory(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d36eee5a9cdcf1e0c62301e30cc652e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d36eee5a9cdcf1e0c62301e30cc652e");
        } else if (this.mDefaultEnvironment != null) {
            this.mDefaultEnvironment.update("category", str);
        }
    }

    public final String getAppStartRequestId() {
        return this.mAppStartRequestId;
    }

    public final void setAppStartRequestId(String str) {
        this.lx_launch = 1;
        this.mAppStartRequestId = str;
    }

    public final void newOnStart(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b89981428c11ca6fcece6362d05e9a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b89981428c11ca6fcece6362d05e9a5");
        } else if (activity == null) {
        } else {
            Boolean bool = Boolean.FALSE;
            Boolean valueOf = Boolean.valueOf(this.mIsTop);
            synchronized (this) {
                if (this.lx_launch == 0) {
                    SharedPreferencesHelper.getInstance(this.mContext).retsetActivityActiveCount();
                }
                if (SharedPreferencesHelper.getInstance(this.mContext).getActivityActiveCount() <= 0) {
                    bool = Boolean.TRUE;
                    this.mIsTop = true;
                    this.mStartTime = Long.valueOf(SystemClock.elapsedRealtime());
                }
                if (this.mValidActivityMap == null) {
                    this.mValidActivityMap = new HashMap();
                }
                this.mValidActivityMap.put(AppUtil.generatePageInfoKey(activity), Boolean.TRUE);
                SharedPreferencesHelper.getInstance(this.mContext).incActivityActiveCount();
            }
            handleAppLaunch(activity.getApplicationContext(), AppUtil.generatePageInfoKey(activity), getSessionBean(activity), ProcessUtils.getCurrentProcessName(Statistics.getContext()), new LaunchParam(true, ProcessUtils.getCurrentProcessName(Statistics.getContext()), valueOf.booleanValue(), bool.booleanValue()), AppUtil.isMmpActivity(activity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUpdateSession(boolean z, SessionBean sessionBean) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), sessionBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90e80feb3d26233efbe12140ee5f2355", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90e80feb3d26233efbe12140ee5f2355");
            return;
        }
        int shouldSessionUpdate = SessionBeanManager.shouldSessionUpdate(sessionBean);
        if (shouldSessionUpdate > 0 && ((ConfigManager.getInstance(this.mContext).isLinkTrackInAppDisabled() && (z || SessionBeanManager.filterUtmChanged(sessionBean))) || !ConfigManager.getInstance(this.mContext).isLinkTrackInAppDisabled())) {
            if (shouldSessionUpdate == 1) {
                TagManager.getInstance().clear();
                MmpToNative.MmpNativeDataHandler.setNeedClear(true);
            }
            SessionManager.generateNewSession(this.mContext);
        }
        SessionBeanManager.setCurrentSessionBean(sessionBean);
    }

    public final void handleAppLaunch(final Context context, final String str, final SessionBean sessionBean, final String str2, final LaunchParam launchParam, final boolean z) {
        Object[] objArr = {context, str, sessionBean, str2, launchParam, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a8e87e96d5946fcdb3f36639aaa4168", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a8e87e96d5946fcdb3f36639aaa4168");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "64b74cc308bb6d1ffa3efd67079cca7b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "64b74cc308bb6d1ffa3efd67079cca7b");
                        return;
                    }
                    StatisticsDelegate.this.handleUpdateSession(launchParam != null && launchParam.launchFromBg, sessionBean);
                    if (launchParam != null && launchParam.mTop) {
                        if (!z) {
                            TagManager.getInstance().insertPageName(str);
                        }
                    } else {
                        LocalTagManager.getInstance().setAppForeground(str, true);
                    }
                    if (launchParam != null && launchParam.launchFromBg) {
                        StatisticsUtils.commitExposureStatisticInfo(str);
                        HighFlowBidManager.getInstance().startCheck(context);
                        SensorCollectManager.getInstance().start();
                        EventInfo eventInfo = new EventInfo();
                        eventInfo.nm = EventName.START;
                        eventInfo.val_cid = "0";
                        eventInfo.isAuto = 6;
                        eventInfo.refer_req_id = StatisticsDelegate.this.mAppStartRequestId;
                        StatisticsDelegate.this.mAppStartRequestId = AppUtil.generateRequestId();
                        eventInfo.req_id = StatisticsDelegate.this.mAppStartRequestId;
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(Constants.EventInfoConsts.KEY_LX_LAUNCH, Integer.valueOf(StatisticsDelegate.this.lx_launch));
                        hashMap2.put(Constants.Environment.KEY_PROCESSOR_COUNT, Integer.valueOf(DeviceUtil.getNumOfCores()));
                        hashMap2.put(Constants.Environment.KEY_PHYSICAL_MEMORY, DeviceUtil.queryPhoneMemory(StatisticsDelegate.this.mContext));
                        hashMap.put("custom", hashMap2);
                        eventInfo.val_lab = JsonUtil.convertToHashMapAndPut(hashMap, "process", str2);
                        if (!TextUtils.isEmpty(str2) && !str2.equals(ProcessUtils.getCurrentProcessName(Statistics.getContext()))) {
                            eventInfo.val_lab = JsonUtil.convertToHashMapAndPut(eventInfo.val_lab, CommonDataBuilder.FLOW_FROM_SUB_PROCESS, 1);
                        }
                        if (StatisticsDelegate.this.lx_launch == 0) {
                            StatisticsDelegate.this.lx_launch = 1;
                        }
                        StatisticsDelegate.this.writeEventASAQ(str, eventInfo);
                        StatisticsDelegate.this.mStartTime = StatisticsDelegate.updateStartTime(StatisticsDelegate.this.mStartTime, true);
                    }
                    StatisticsDelegate.this.handleAppSession();
                    StringBuilder sb = new StringBuilder("lifecycle handleAppLaunch launchFromBg:");
                    sb.append(launchParam != null ? launchParam.launchFromBg : false);
                    sb.append(" pageInfoKey:");
                    sb.append(str);
                    LogUtil.log(sb.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAppSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d064d4ce4e47f8071ed8180a11372e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d064d4ce4e47f8071ed8180a11372e");
        } else if (shouldUpdateAppSession()) {
            SessionManager.generateNewAppSession(this.mContext);
        }
    }

    private boolean shouldUpdateAppSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea2cd25ce4fbe45950d07b2985f628ac", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea2cd25ce4fbe45950d07b2985f628ac")).booleanValue();
        }
        DefaultEnvironment defaultEnvironment = getInstance().getDefaultEnvironment();
        if (defaultEnvironment == null || defaultEnvironment.getEnvironment() == null) {
            return false;
        }
        return (SessionManager.hasAppSession() && SessionManager.isAppSessionValid()) ? false : true;
    }

    public final void handleActivityResume(final String str, final String str2, final Map<String, Object> map, final String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14fd85ddc113ce98fb7371f14b872144", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14fd85ddc113ce98fb7371f14b872144");
        } else if (getInstance().isAutoPVEnabled(str)) {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    String str4;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ade59e54aae70bd994fc2866c9b2ba7d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ade59e54aae70bd994fc2866c9b2ba7d");
                        return;
                    }
                    PageInfoManager.getInstance().addPageInfo(str, str2);
                    StatisticsDelegate.this.synchroValLabToPageInfo(str, map);
                    if (Statistics.isInitialized()) {
                        String currentProcessName = !TextUtils.isEmpty(str3) ? str3 : ProcessUtils.getCurrentProcessName(Statistics.getContext());
                        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
                        ConcurrentHashMap<String, Object> concurrentHashMap = null;
                        if (pageInfo != null) {
                            String category = pageInfo.getCategory();
                            ConcurrentHashMap<String, Object> valLab = pageInfo.getValLab();
                            pageInfo.setProName(currentProcessName);
                            str4 = category;
                            concurrentHashMap = valLab;
                        } else {
                            str4 = null;
                        }
                        HashMap<String, Object> convertToHashMapAndPut = JsonUtil.convertToHashMapAndPut(concurrentHashMap, "process", currentProcessName);
                        if (!TextUtils.isEmpty(currentProcessName) && !currentProcessName.equals(ProcessUtils.getCurrentProcessName(Statistics.getContext()))) {
                            convertToHashMapAndPut = JsonUtil.convertToHashMapAndPut(convertToHashMapAndPut, CommonDataBuilder.FLOW_FROM_SUB_PROCESS, 1);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            if (Statistics.getChannel(str4) != null) {
                                Statistics.getChannel(str4).writeAutoPageView(str, convertToHashMapAndPut);
                            }
                        } else if (Statistics.getChannel() != null) {
                            Statistics.getChannel().writeAutoPageView(str, convertToHashMapAndPut);
                        }
                    }
                }
            });
        }
    }

    public final void handleActivityPause(final String str, String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26248412c072c30b26edff0e4eadbb9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26248412c072c30b26edff0e4eadbb9d");
            return;
        }
        if (getInstance().isAutoPDEnabled(str)) {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "04d6a9ca90b569d1506da1d10247bee7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "04d6a9ca90b569d1506da1d10247bee7");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
                    if (pageInfo != null) {
                        hashMap.putAll(pageInfo.getValLab());
                        pageInfo.clearValLab();
                    }
                    PageInfo pageInfo2 = PageInfoManager.getInstance().getPageInfo(str);
                    String category = pageInfo2 != null ? pageInfo2.getCategory() : null;
                    HashMap<String, Object> convertToHashMapAndPut = JsonUtil.convertToHashMapAndPut(hashMap, "process", str3);
                    if (!TextUtils.isEmpty(str3) && !str3.equals(ProcessUtils.getCurrentProcessName(Statistics.getContext()))) {
                        convertToHashMapAndPut = JsonUtil.convertToHashMapAndPut(convertToHashMapAndPut, CommonDataBuilder.FLOW_FROM_SUB_PROCESS, 1);
                    }
                    if (Statistics.isInitialized()) {
                        if (!TextUtils.isEmpty(category)) {
                            if (Statistics.getChannel(category) != null) {
                                Statistics.getChannel(category).writeAutoPageDisappear(str, convertToHashMapAndPut);
                            }
                        } else if (Statistics.getChannel() != null) {
                            Statistics.getChannel().writeAutoPageDisappear(str, convertToHashMapAndPut);
                        }
                        ReportStrategyController.saveCounterToCache(StatisticsDelegate.this.mContext);
                    }
                }
            });
        }
        sendPD();
    }

    private void sendPD() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65ea260f0af81e4b02b9bb6adc0fed7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65ea260f0af81e4b02b9bb6adc0fed7e");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegate.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c3003e210647c6e794825b4892792b05", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c3003e210647c6e794825b4892792b05");
                        return;
                    }
                    WebNativeCommunicationStore.setSendWebPD(WebNativeCommunicationStore.getStorePDData() != null);
                    MmpNativeCommunicationStore.setStorePDData(MmpNativeCommunicationStore.getStorePDData() != null);
                }
            });
        }
    }

    public final void handleActivityDestroyed(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "464f0a785839fbadf43018106e143de7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "464f0a785839fbadf43018106e143de7");
            return;
        }
        Set<String> pageInfoKeySet = getInstance().getPageInfoKeySet();
        if (pageInfoKeySet != null) {
            pageInfoKeySet.remove(str);
        }
    }

    public final void newOnStop(Context context) {
        Object obj;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5387757039bb644ab5402e425016965", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5387757039bb644ab5402e425016965");
        } else if (context == null) {
        } else {
            String generatePageInfoKey = AppUtil.generatePageInfoKey(context);
            Boolean bool = Boolean.FALSE;
            synchronized (this) {
                if (this.mValidActivityMap != null && this.mValidActivityMap.containsKey(generatePageInfoKey) && (obj = this.mValidActivityMap.get(generatePageInfoKey)) != null && ((Boolean) obj).booleanValue()) {
                    this.mValidActivityMap.remove(generatePageInfoKey);
                    SharedPreferencesHelper.getInstance(this.mContext).decActivityActiveCount();
                }
                if (SharedPreferencesHelper.getInstance(this.mContext).getActivityActiveCount() <= 0) {
                    bool = Boolean.TRUE;
                    this.mIsTop = false;
                }
            }
            LogUtil.log("lifecycle handleAppQuit begin: pageInfoKey:" + AppUtil.generatePageInfoKey(context));
            handleAppQuit(AppUtil.generatePageInfoKey(context), ProcessUtils.getCurrentProcessName(this.mContext), bool.booleanValue(), -1L);
        }
    }

    public final void handleAppQuit(String str, String str2, boolean z, long j) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "150944b1b91bca2dc031515209d785a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "150944b1b91bca2dc031515209d785a1");
            return;
        }
        LogUtil.log("lifecycle handleAppQuit begin: pageInfoKey:" + str);
        StatisticsHandler.getInstance().commit(new ReportASAQRunnable(str, str2, z, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class ReportASAQRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Long mDuration;
        private AtomicBoolean mFinished;
        private Boolean mLaunchFromFg;
        private String mProcessName;
        private String srcPageInfoKey;

        public ReportASAQRunnable(String str, String str2, boolean z, long j) {
            Object[] objArr = {StatisticsDelegate.this, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39b717428a1addcf2010567fc253dc96", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39b717428a1addcf2010567fc253dc96");
                return;
            }
            this.mFinished = new AtomicBoolean(false);
            this.srcPageInfoKey = str;
            this.mProcessName = str2;
            this.mLaunchFromFg = Boolean.valueOf(z);
            this.mDuration = Long.valueOf(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a172170d0862e98036423af41ba2cf59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a172170d0862e98036423af41ba2cf59");
            } else {
                writeASAQ();
            }
        }

        public void writeASAQ() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "460b686ce9367e583963fb6cbdba3ebc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "460b686ce9367e583963fb6cbdba3ebc");
            } else if (this.mFinished.compareAndSet(false, true)) {
                String str = this.srcPageInfoKey;
                if (!StatisticsDelegate.this.isGenerateIdentify(str)) {
                    str = StatisticsDelegate.this.mPageInfoManager.getCurrentPageInfoKey();
                }
                PageInfo pageInfo = StatisticsDelegate.this.mPageInfoManager.getPageInfo(str);
                StringBuilder sb = new StringBuilder("lifecycle AppQuitRunnable mProcessName:");
                sb.append(this.mProcessName != null ? this.mProcessName : "");
                sb.append(" pageInfoKey:");
                sb.append(this.srcPageInfoKey);
                sb.append(" curProcName:");
                sb.append(ProcessUtils.getCurrentProcessName(StatisticsDelegate.this.mContext));
                LogUtil.log(sb.toString());
                if (this.mLaunchFromFg.booleanValue()) {
                    LocalTagManager.getInstance().setAppForeground(str, false);
                    StatisticsUtils.commitExposureStatisticInfo(str);
                    HighFlowBidManager.getInstance().stopCheck();
                    SensorCollectManager.getInstance().stop();
                    EventInfo eventInfo = new EventInfo();
                    eventInfo.nm = EventName.QUIT;
                    eventInfo.val_lab = new HashMap();
                    eventInfo.val_lab.put("duration", String.valueOf(System.currentTimeMillis() - StatisticsDelegate.this.mStartTime.longValue()));
                    eventInfo.val_lab = JsonUtil.convertToHashMapAndPut(eventInfo.val_lab, "process", this.mProcessName);
                    if (!TextUtils.isEmpty(this.mProcessName) && !this.mProcessName.equals(ProcessUtils.getCurrentProcessName(Statistics.getContext()))) {
                        eventInfo.val_lab = JsonUtil.convertToHashMapAndPut(eventInfo.val_lab, CommonDataBuilder.FLOW_FROM_SUB_PROCESS, 1);
                    }
                    eventInfo.isAuto = 6;
                    eventInfo.req_id = StatisticsDelegate.this.mAppStartRequestId;
                    if (pageInfo != null) {
                        eventInfo.refer_req_id = pageInfo.getRequestId();
                    }
                    StatisticsDelegate.this.writeEventASAQ(str, eventInfo);
                    StatisticsDelegate.this.resetQuitTime(StatisticsDelegate.this.mContext, Long.valueOf(System.currentTimeMillis()));
                    ReportStrategyController.saveGestureCounterToCache(StatisticsDelegate.this.mContext);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeEventASAQ(String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca9fc4f7267e88d6a69fe87828dd001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca9fc4f7267e88d6a69fe87828dd001");
        } else if (this.mInitialized) {
            String str2 = this.mDefaultChannelName;
            if (TextUtils.isEmpty(str2)) {
                str2 = AppUtil.getApplicationName(this.mContext);
            }
            if (str2 == null) {
                str2 = "";
            }
            Channel channel = Statistics.getChannel(str2);
            if (channel == null || eventInfo == null) {
                return;
            }
            eventInfo.level = EventLevel.IMMEDIATE;
            eventInfo.category = channel.getChannelName();
            channel.write(str, eventInfo);
        }
    }

    public final boolean isGenerateIdentify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cf22b5a68e8ae641197b4b401243071", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cf22b5a68e8ae641197b4b401243071")).booleanValue() : GenerateIdentifyHelper.isGenerateIdentify();
    }

    public final boolean isGenerateIdentify(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "498590df0011e0b1010a35751185ca06", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "498590df0011e0b1010a35751185ca06")).booleanValue() : GenerateIdentifyHelper.isGenerateIdentify(str);
    }

    public final void disablePageIdentify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a953fc1a9ca6618c9ee194e83059d9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a953fc1a9ca6618c9ee194e83059d9e");
        } else {
            GenerateIdentifyHelper.disablePageIdentify();
        }
    }

    public final void disablePageIdentify(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2c54c8ddbb82e1a2d61afff0276379c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2c54c8ddbb82e1a2d61afff0276379c");
        } else {
            GenerateIdentifyHelper.disablePageIdentify(str);
        }
    }

    public final void enablePageIdentify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cafe60b349c714f1a5441c05e6c499e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cafe60b349c714f1a5441c05e6c499e5");
        } else {
            GenerateIdentifyHelper.enablePageIdentify();
        }
    }

    public final void enablePageIdentify(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "509469ffc36328b2718e8270e7908015", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "509469ffc36328b2718e8270e7908015");
        } else {
            GenerateIdentifyHelper.enablePageIdentify(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class GenerateIdentifyHelper {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static AtomicBoolean mGenerateAllIdentify = new AtomicBoolean(true);
        private static CopyOnWriteArraySet<String> mGenerateIdentifyDisableSet = new CopyOnWriteArraySet<>();
        private static CopyOnWriteArraySet<String> mAutoPVDisabledSet = new CopyOnWriteArraySet<>();
        private static CopyOnWriteArraySet<String> mAutoPDDisabledSet = new CopyOnWriteArraySet<>();

        public static boolean isGenerateIdentify() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a47e0bd25b8f727c1abae714a16ef77", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a47e0bd25b8f727c1abae714a16ef77")).booleanValue() : mGenerateAllIdentify.get();
        }

        public static boolean isGenerateIdentify(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a3bbb4f19b8d13aad8e09f920c84929", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a3bbb4f19b8d13aad8e09f920c84929")).booleanValue();
            }
            if (isGenerateIdentify()) {
                return TextUtils.isEmpty(str) || !mGenerateIdentifyDisableSet.contains(str);
            }
            return false;
        }

        public static void disablePageIdentify() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bcb6df2fa99ca473130df2e9b7d672a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bcb6df2fa99ca473130df2e9b7d672a5");
            } else {
                mGenerateAllIdentify.compareAndSet(true, false);
            }
        }

        public static void disablePageIdentify(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0cac0e926f60385fde35e0a89475742a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0cac0e926f60385fde35e0a89475742a");
            } else {
                mGenerateIdentifyDisableSet.add(str);
            }
        }

        public static void enablePageIdentify() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba6d6eecb93ab33d6057429095dbd54f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba6d6eecb93ab33d6057429095dbd54f");
            } else {
                mGenerateAllIdentify.compareAndSet(false, true);
            }
        }

        public static void enablePageIdentify(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b6e9f5897d2561bf663c6a74fc81635f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b6e9f5897d2561bf663c6a74fc81635f");
            } else {
                mGenerateIdentifyDisableSet.remove(str);
            }
        }

        public static boolean isAutoPVEnabled(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea1ef70afe3b1e7b14f52f73726dc31c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea1ef70afe3b1e7b14f52f73726dc31c")).booleanValue() : TextUtils.isEmpty(str) || !mAutoPVDisabledSet.contains(str);
        }

        public static void disableAutoPV(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c47ad601e7753314d03526f6ff9509a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c47ad601e7753314d03526f6ff9509a");
            } else {
                mAutoPVDisabledSet.add(str);
            }
        }

        public static void enableAutoPV(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d396f395e455fb066a99ab3d98d1ccb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d396f395e455fb066a99ab3d98d1ccb");
            } else {
                mAutoPVDisabledSet.remove(str);
            }
        }

        public static boolean isAutoPDEnabled(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "254905233a4da0e73b59f9a9c02f84cd", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "254905233a4da0e73b59f9a9c02f84cd")).booleanValue() : TextUtils.isEmpty(str) || !mAutoPDDisabledSet.contains(str);
        }

        public static void disableAutoPD(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b52d0b8b05fb73387e70f78000c8594", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b52d0b8b05fb73387e70f78000c8594");
            } else {
                mAutoPDDisabledSet.add(str);
            }
        }

        public static void enableAutoPD(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd7f49be3bf8a2f66d778f02da99773f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd7f49be3bf8a2f66d778f02da99773f");
            } else {
                mAutoPDDisabledSet.remove(str);
            }
        }
    }

    public final boolean isAutoPVEnabled(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10af9f0da7ab788105b11c284a161521", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10af9f0da7ab788105b11c284a161521")).booleanValue() : GenerateIdentifyHelper.isAutoPVEnabled(str);
    }

    public final void disableAutoPV(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03f888caf7113c2215670f6a73a534b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03f888caf7113c2215670f6a73a534b2");
        } else {
            GenerateIdentifyHelper.disableAutoPV(str);
        }
    }

    public final void enableAutoPV(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58dc7e7700aefecc5ee35093794c823b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58dc7e7700aefecc5ee35093794c823b");
        } else {
            GenerateIdentifyHelper.enableAutoPV(str);
        }
    }

    public final boolean isAutoPDEnabled(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9956beed7be161b44e1547623b333411", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9956beed7be161b44e1547623b333411")).booleanValue() : GenerateIdentifyHelper.isAutoPDEnabled(str);
    }

    public final void disableAutoPD(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ab26f496a0af24964e8f55a9f5846ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ab26f496a0af24964e8f55a9f5846ad");
        } else {
            GenerateIdentifyHelper.disableAutoPD(str);
        }
    }

    public final void enableAutoPD(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95997f0d2e98df59dd5e537fef915615", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95997f0d2e98df59dd5e537fef915615");
        } else {
            GenerateIdentifyHelper.enableAutoPD(str);
        }
    }

    public final void statisticsViewEvent(@NonNull View view, LXViewDotter.LXEventName lXEventName) {
        Object[] objArr = {view, lXEventName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f45fd8cf05b3184d29a47efd90e21cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f45fd8cf05b3184d29a47efd90e21cb");
        } else if (view == null) {
        } else {
            if (!(view instanceof LXViewDotter)) {
                throw new RuntimeException("view need to implement LXViewDotter");
            }
            LXViewDotter lXViewDotter = (LXViewDotter) view;
            switch (lXEventName) {
                case CLICK:
                    BusinessEntity businessEntity = lXViewDotter.getBusinessEntity(LXViewDotter.LXEventName.CLICK);
                    if (businessEntity == null || TextUtils.isEmpty(businessEntity.getBid())) {
                        return;
                    }
                    Statistics.getChannel(businessEntity.getChannel()).writeModelClick(lXViewDotter.getPageInfoKey(), businessEntity.getBid(), businessEntity.getValLab(), businessEntity.getCid(), businessEntity.getWithPageInfo(), businessEntity.getSf());
                    return;
                case VIEW:
                    BusinessEntity businessEntity2 = lXViewDotter.getBusinessEntity(LXViewDotter.LXEventName.VIEW);
                    if (businessEntity2 == null || TextUtils.isEmpty(businessEntity2.getBid())) {
                        return;
                    }
                    Statistics.getChannel(businessEntity2.getChannel()).writeModelView(lXViewDotter.getPageInfoKey(), businessEntity2.getBid(), businessEntity2.getValLab(), businessEntity2.getCid());
                    return;
                case EDIT:
                    BusinessEntity businessEntity3 = lXViewDotter.getBusinessEntity(LXViewDotter.LXEventName.EDIT);
                    if (businessEntity3 == null || TextUtils.isEmpty(businessEntity3.getBid())) {
                        return;
                    }
                    Statistics.getChannel(businessEntity3.getChannel()).writeModelEdit(lXViewDotter.getPageInfoKey(), businessEntity3.getBid(), businessEntity3.getValLab(), businessEntity3.getCid());
                    return;
                default:
                    return;
            }
        }
    }

    public final DefaultEnvironment getDefaultEnvironment() {
        return this.mDefaultEnvironment;
    }

    public final void setContext(Context context) {
        this.mContext = context;
    }

    public final Map<String, String> getCustomEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e3007ba146cbc701605fcd6a24e523e", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e3007ba146cbc701605fcd6a24e523e");
        }
        if (this.environment != null) {
            HashMap hashMap = new HashMap();
            String lat = this.environment.getLat();
            String lng = this.environment.getLng();
            hashMap.put("lat", lat);
            hashMap.put("lng", lng);
            return hashMap;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void synchroValLabToPageInfo(String str, Map<String, Object> map) {
        ConcurrentHashMap<String, Object> valLab;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd246680eb925bfdea986680eab8406c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd246680eb925bfdea986680eab8406c");
        } else if (map != null) {
            try {
                PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
                if (pageInfo != null && (valLab = pageInfo.getValLab()) != null) {
                    Map<String, Object> customMap = LxActivityLifecycleCallbacks.getCustomMap(map);
                    if (customMap != null) {
                        Map<String, Object> customMap2 = LxActivityLifecycleCallbacks.getCustomMap(valLab);
                        if (customMap2 != null) {
                            customMap.putAll(customMap2);
                        }
                        if (customMap != null && customMap.size() > 0) {
                            map.put("custom", customMap);
                        }
                    }
                    map.putAll(valLab);
                }
                if (map != null) {
                    Map<String, Object> customMap3 = LxActivityLifecycleCallbacks.getCustomMap(map);
                    if (customMap3 != null && customMap3.size() > 0) {
                        customMap3.remove("");
                        customMap3.remove(null);
                        map.put("custom", customMap3);
                    }
                    map.remove("");
                    map.remove(null);
                }
                if (pageInfo != null) {
                    pageInfo.clearValLab();
                    pageInfo.addValLab(map);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LaunchParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isMainProcess;
        public boolean launchFromBg;
        public boolean mTop;
        public String procName;

        public LaunchParam(boolean z, String str, boolean z2, boolean z3) {
            this.isMainProcess = z;
            this.procName = str;
            this.mTop = z2;
            this.launchFromBg = z3;
        }
    }

    public final Set<String> getPageInfoKeySet() {
        return this.mPageInfoKeySet;
    }
}
