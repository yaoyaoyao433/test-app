package com.meituan.android.common.statistics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.statistics.Interface.AbsExtraParameter;
import com.meituan.android.common.statistics.Interface.IEnvironment;
import com.meituan.android.common.statistics.Interface.LXViewDotter;
import com.meituan.android.common.statistics.ad.AdManager;
import com.meituan.android.common.statistics.ad.IAdvertisement;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.channel.ChannelManager;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.channel.beforeinit.BeforeInitChannelManager;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.gesture.GestureManager;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.independent.ProcessController;
import com.meituan.android.common.statistics.pageinfo.PageInfo;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.session.SessionManager;
import com.meituan.android.common.statistics.strategy.IReportStrategy;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Statistics {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static WeakReference<Activity> mActivityWr = null;
    private static Context mContext = null;
    private static AbsExtraParameter mExtraParameter = null;
    private static volatile boolean mIsSubprocessIndependence = false;

    public static void addPageInfo(@NonNull String str, @NonNull String str2) {
    }

    @Deprecated
    public static void initLogan(int i) {
    }

    @Deprecated
    public static void onResume(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "549d8e48a9ebaf2cad93ec74d2bea839", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "549d8e48a9ebaf2cad93ec74d2bea839");
        }
    }

    private static void init(Context context, IEnvironment iEnvironment, String str) {
        Object[] objArr = {context, iEnvironment, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "881be5f97a8b3e077ba1589b4fa76dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "881be5f97a8b3e077ba1589b4fa76dff");
            return;
        }
        mContext = context.getApplicationContext();
        if (!TextUtils.isEmpty(str)) {
            setDefaultChannelName(str);
        }
        StatisticsDelegate.getInstance().init(context, iEnvironment);
        if (ConfigManager.getInstance(context).supportMultiProcess() && !ProcessUtils.isMainProcess(context)) {
            StatisticsDelegateRemote.getInstance().init(context);
        }
        if (mContext instanceof Application) {
            ((Application) mContext).registerActivityLifecycleCallbacks(new LxActivityLifecycleCallbacks());
        }
    }

    @Deprecated
    public static void initStatistics(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5315c43ff54c03976c07cf3d017c3f0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5315c43ff54c03976c07cf3d017c3f0a");
        } else {
            init(context, null, null);
        }
    }

    public static void initStatistics(Context context, IEnvironment iEnvironment) {
        Object[] objArr = {context, iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f18d3c9b9c0024cf852d7500f9ebd4e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f18d3c9b9c0024cf852d7500f9ebd4e8");
        } else {
            init(context, iEnvironment, null);
        }
    }

    public static void initStatistics(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6334c9437b46ff76f51e6ff3b46aac76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6334c9437b46ff76f51e6ff3b46aac76");
        } else {
            init(context, null, str);
        }
    }

    public static void initStatistics(Context context, IEnvironment iEnvironment, String str) {
        Object[] objArr = {context, iEnvironment, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb40a28258e8fa1dc5d2213eeaa0c724", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb40a28258e8fa1dc5d2213eeaa0c724");
        } else {
            init(context, iEnvironment, str);
        }
    }

    public static void initStatistics(Context context, IEnvironment iEnvironment, String str, AbsExtraParameter absExtraParameter) {
        Object[] objArr = {context, iEnvironment, str, absExtraParameter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9d424e4f9c919f7360fa899cae5a15b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9d424e4f9c919f7360fa899cae5a15b");
            return;
        }
        if (absExtraParameter != null) {
            mExtraParameter = absExtraParameter;
        }
        init(context, iEnvironment, str);
    }

    @Deprecated
    public static void initStatistics(Context context, IEnvironment iEnvironment, AbsExtraParameter absExtraParameter) {
        Object[] objArr = {context, iEnvironment, absExtraParameter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e5f78cb0685bea31605f5946f604b05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e5f78cb0685bea31605f5946f604b05");
            return;
        }
        if (absExtraParameter != null) {
            mExtraParameter = absExtraParameter;
        }
        initStatistics(context, iEnvironment);
    }

    public static void setDebugMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54b05de9b58d68ae6a0268e74220f545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54b05de9b58d68ae6a0268e74220f545");
        } else if (!ConfigManager.getInstance(mContext).isDebugModeDisabled()) {
            StatisticsDelegate.getInstance().updateDefaultEnvironment("sdk_env", z ? "offline" : AiDownloadEnv.ENV_ONLINE);
        } else if (StatisticsDelegate.getInstance().getDefaultEnvironment() == null || StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() == null) {
        } else {
            StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().remove("sdk_env");
        }
    }

    public static void updateDefaultEnvironment(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "116c781b90c99335ed3f158906861afd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "116c781b90c99335ed3f158906861afd");
            return;
        }
        StatisticsDelegate.getInstance().updateDefaultEnvironment(str, str2);
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("map", hashMap);
        ProcessController.getInstance().selectMethod(getContext(), 30000, hashMap2);
    }

    public static void updateDefaultEnvironment(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc7e70629978f82629ca230187ad6a8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc7e70629978f82629ca230187ad6a8f");
            return;
        }
        StatisticsDelegate.getInstance().updateDefaultEnvironment(map);
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        StatisticsDelegateRemote.getInstance().updateDefaultEnvironment(map);
    }

    public static void updateDefaultEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43f0914e12faa3228dff75dceeddf6f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43f0914e12faa3228dff75dceeddf6f2");
            return;
        }
        StatisticsDelegate.getInstance().updateDefaultEnvironment();
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        StatisticsDelegateRemote.getInstance().updateDefaultEnvironment();
    }

    public static void setDefaultCategory(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "162d353ad3dcfb7c22b9105a12d9aef4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "162d353ad3dcfb7c22b9105a12d9aef4");
            return;
        }
        StatisticsDelegate.getInstance().setDefaultCategory(str);
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("category", str);
        ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CATEGORY, hashMap);
    }

    public static void unInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f7180d1d04e8da6896aade039a0663d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f7180d1d04e8da6896aade039a0663d");
        } else {
            StatisticsDelegate.getInstance().unInit();
        }
    }

    public static Channel getChannel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "184a801d3d719a101a85b300d27b257e", 6917529027641081856L)) {
            return (Channel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "184a801d3d719a101a85b300d27b257e");
        }
        ChannelManager channelManager = StatisticsDelegate.getInstance().getChannelManager();
        if (channelManager == null) {
            return BeforeInitChannelManager.getInstance().getChannel(str);
        }
        return channelManager.getChannel(str);
    }

    public static Channel getChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc222f79702f89c0d73ac8f7bd0135f6", 6917529027641081856L)) {
            return (Channel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc222f79702f89c0d73ac8f7bd0135f6");
        }
        ChannelManager channelManager = StatisticsDelegate.getInstance().getChannelManager();
        if (channelManager == null) {
            return BeforeInitChannelManager.getInstance().getChannel(getDefaultChannelName());
        }
        return channelManager.getChannel(getDefaultChannelName());
    }

    public static String getDefaultChannelName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9b395641e224ccede26c40b686ac220", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9b395641e224ccede26c40b686ac220");
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            return (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_CHANNEL_NAME, null);
        }
        return StatisticsDelegate.getInstance().getDefaultChannelName();
    }

    public static void setDefaultChannelName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45b3e2329f25cdfb9c0130e876e4bafa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45b3e2329f25cdfb9c0130e876e4bafa");
            return;
        }
        StatisticsDelegate.getInstance().setDefaultChannelName(str);
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("defaultChannelName", str);
        ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME, hashMap);
    }

    public static void setDefaultChannelName(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5bf5d8c90193ced7a2f1386f14a3d153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5bf5d8c90193ced7a2f1386f14a3d153");
            return;
        }
        StatisticsDelegate.getInstance().setDefaultChannelName(str, str2);
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageInfoKey", str);
        hashMap.put("defaultChannelName", str2);
        ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME, hashMap);
    }

    @Deprecated
    public static void onCreate(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1244d6add1e85124ec22b2c18c74948d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1244d6add1e85124ec22b2c18c74948d");
        } else if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            ProcessController.getInstance().selectMethod(activity, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_CREATE, null);
        } else {
            StatisticsDelegate.getInstance().onCreate(activity, null);
        }
    }

    public static void onCreate(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8be290948ba28804681190d8ed646173", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8be290948ba28804681190d8ed646173");
        } else if (ConfigManager.getInstance(getContext(activity)).supportMultiProcess() && !ProcessUtils.isMainProcess(getContext(activity))) {
            HashMap hashMap = new HashMap();
            hashMap.put("bundle", bundle);
            ProcessController.getInstance().selectMethod(activity, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_CREATE, hashMap);
        } else {
            StatisticsDelegate.getInstance().onCreate(activity, bundle);
        }
    }

    public static void startEvent(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6218b3f3419244922b62b0565ec8ddb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6218b3f3419244922b62b0565ec8ddb4");
        } else if (ConfigManager.getInstance(getContext(activity)).supportMultiProcess() && !ProcessUtils.isMainProcess(getContext(activity))) {
            ProcessController.getInstance().selectMethod(activity, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_START, null);
        } else {
            StatisticsDelegate.getInstance().newOnStart(activity);
        }
    }

    public static void onSaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "774b909dc4d409281c54dcd817a7d565", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "774b909dc4d409281c54dcd817a7d565");
        } else if (!ConfigManager.getInstance(getContext(activity)).supportMultiProcess() || ProcessUtils.isMainProcess(getContext(activity))) {
            StatisticsDelegate.getInstance().onSaveInstanceState(activity, bundle);
        }
    }

    public static void quitEvent(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42d9a2359bf8683022e92e3581a7df2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42d9a2359bf8683022e92e3581a7df2a");
        } else if (ConfigManager.getInstance(getContext(activity)).supportMultiProcess() && !ProcessUtils.isMainProcess(getContext(activity))) {
            ProcessController.getInstance().selectMethod(activity, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_STOP, null);
        } else {
            StatisticsDelegate.getInstance().newOnStop(activity);
        }
    }

    public static synchronized void setUUID(String str) {
        synchronized (Statistics.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76405ca315311e5d711f4a15e2712d0e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76405ca315311e5d711f4a15e2712d0e");
            } else {
                StatisticsDelegate.getInstance().setUUID(str);
            }
        }
    }

    public static synchronized void setDPID(String str) {
        synchronized (Statistics.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dfb01921a08d11b5d5da1efbc75fbb5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dfb01921a08d11b5d5da1efbc75fbb5");
            } else {
                StatisticsDelegate.getInstance().setDPID(str);
            }
        }
    }

    @Deprecated
    public static String getUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "159c73d5bc8954952223435113628cd7", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "159c73d5bc8954952223435113628cd7") : StatisticsDelegate.getInstance().getUnionId();
    }

    public static boolean isInitialized() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c7c85b4de706ca952bb2929a94e8c4e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c7c85b4de706ca952bb2929a94e8c4e")).booleanValue() : StatisticsDelegate.getInstance().isInitialized();
    }

    public static void setReportStrategy(IReportStrategy iReportStrategy) {
        Object[] objArr = {iReportStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c996b24a2551e3ae2418453b11939bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c996b24a2551e3ae2418453b11939bd");
        } else if (iReportStrategy == null) {
        } else {
            StatisticsDelegate.getInstance().setReportStrategy(iReportStrategy);
        }
    }

    @Deprecated
    public static String getRequestId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0798df00ae468d502a7d3570b1d3640", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0798df00ae468d502a7d3570b1d3640");
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            return (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, null);
        }
        PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
        return currentPageInfo == null ? "" : currentPageInfo.getRequestId();
    }

    public static String getRequestId(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c4ce31ec15e81b010e1b56c8125b2ff", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c4ce31ec15e81b010e1b56c8125b2ff");
        }
        if (TextUtils.isEmpty(str)) {
            return getRequestId();
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pageInfoKey", str);
            return (String) ProcessController.getInstance().selectMethod(getContext(), RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, hashMap);
        }
        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
        return pageInfo == null ? getRequestId() : pageInfo.getRequestId();
    }

    public static String getCid(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "423b5286a3c8545cd24be427da69868b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "423b5286a3c8545cd24be427da69868b");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pageInfoKey", str);
            return (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CID, hashMap);
        }
        return PageInfoManager.getInstance().getCid(str);
    }

    public static String getRequestIdForPage(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7922757cc216055617b19b154d7af03", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7922757cc216055617b19b154d7af03");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pageInfoKey", str);
            return (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID_FOR_PAGE, hashMap);
        }
        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
        return pageInfo == null ? "" : pageInfo.getRequestId();
    }

    @Deprecated
    public static String getRefRequestId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74d133cc5ad715df517e00a32431f2a5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74d133cc5ad715df517e00a32431f2a5");
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            return (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_REQUEST_ID, null);
        }
        PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
        return currentPageInfo == null ? "" : currentPageInfo.getRequestRefId();
    }

    public static String getRefRequestId(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf6fe0b4738bc877b514daf7496e4b76", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf6fe0b4738bc877b514daf7496e4b76");
        }
        if (TextUtils.isEmpty(str)) {
            return getRefRequestId();
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pageInfoKey", str);
            return (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_REQUEST_ID, hashMap);
        }
        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
        return pageInfo == null ? getRefRequestId() : pageInfo.getRequestRefId();
    }

    @Deprecated
    public static String getPageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74b5167f970483168cfe171805182128", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74b5167f970483168cfe171805182128");
        }
        PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
        if (currentPageInfo == null && ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pageInfoKey", "");
            String str = (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_PAGE_NAME, hashMap);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return currentPageInfo == null ? "" : currentPageInfo.getCid();
    }

    public static String getPageName(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0535655e8e32a9e859aff5d0e359afa5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0535655e8e32a9e859aff5d0e359afa5");
        }
        if (TextUtils.isEmpty(str)) {
            return getPageName();
        }
        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
        if (pageInfo == null && ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pageInfoKey", str);
            String str2 = (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_PAGE_NAME, hashMap);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return pageInfo == null ? "" : pageInfo.getCid();
    }

    @Deprecated
    public static String getRefPageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac98bb95ed8e2a478f098ce20d297507", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac98bb95ed8e2a478f098ce20d297507");
        }
        PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
        if (currentPageInfo == null && ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            String str = (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_PAGE_NAME, null);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return currentPageInfo == null ? "" : currentPageInfo.getRef();
    }

    public static String getRefPageName(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "caa701661d9f8c3bf4dd216d708f1831", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "caa701661d9f8c3bf4dd216d708f1831");
        }
        if (TextUtils.isEmpty(str)) {
            return getRefPageName();
        }
        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
        if (pageInfo == null && ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("pageInfoKey", str);
            String str2 = (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_PAGE_NAME, hashMap);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return pageInfo == null ? getRefPageName() : pageInfo.getRef();
    }

    @Deprecated
    public static void resetPageIdentify(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e50c39d5668a3a09ce76b762dcc695c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e50c39d5668a3a09ce76b762dcc695c7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            PageInfoManager.getInstance().addPageInfo(PageInfoManager.UNKNOWN_KEY, str);
            if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
                return;
            }
            StatisticsDelegateRemote.getInstance().resetPageIdentify(str);
        }
    }

    @Deprecated
    public static void resetPageIdentify(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c5690472ef94e70f9c77c4ea28e6f2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c5690472ef94e70f9c77c4ea28e6f2f");
            return;
        }
        PageInfoManager.getInstance().addPageInfo(str, str2);
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        StatisticsDelegateRemote.getInstance().resetPageIdentify(str, str2);
    }

    public static void resetPageName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73b0f3544f0b845b1a8f695408992a16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73b0f3544f0b845b1a8f695408992a16");
            return;
        }
        StatisticsDelegate.getInstance().resetPageName(str, str2);
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageInfoKey", str);
        hashMap.put("pageName", str2);
        ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_RESET_PAGE_NAME, hashMap);
    }

    public static void disablePageIdentify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bcb0a3d5d21a7c8729a8b9564d490526", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bcb0a3d5d21a7c8729a8b9564d490526");
        } else {
            StatisticsDelegate.getInstance().disablePageIdentify();
        }
    }

    public static void disablePageIdentify(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58b746c3b6b1d07072065aa491a2fe3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58b746c3b6b1d07072065aa491a2fe3f");
        } else {
            StatisticsDelegate.getInstance().disablePageIdentify(str);
        }
    }

    public static void enablePageIdentify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40c2a3b9ce6ec6d64043dc3e0a5ec50d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40c2a3b9ce6ec6d64043dc3e0a5ec50d");
        } else {
            StatisticsDelegate.getInstance().enablePageIdentify();
        }
    }

    public static void enablePageIdentify(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e656aebaaae4924952c9a69f5007065", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e656aebaaae4924952c9a69f5007065");
        } else {
            StatisticsDelegate.getInstance().enablePageIdentify(str);
        }
    }

    public static boolean isPageIdentifyEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4721b6b47aacaa6c94710711bad12aaf", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4721b6b47aacaa6c94710711bad12aaf")).booleanValue() : StatisticsDelegate.getInstance().isGenerateIdentify();
    }

    public static boolean isPageIdentifyEnable(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c943d57759ec2a2df41a6cc12742273c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c943d57759ec2a2df41a6cc12742273c")).booleanValue() : StatisticsDelegate.getInstance().isGenerateIdentify(str);
    }

    public static String JsToNative(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "619c86addd81bc777280f010ee7ec81a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "619c86addd81bc777280f010ee7ec81a");
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            return (String) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_JS_TO_NATIVE, hashMap);
        }
        return StatisticsDelegate.getInstance().JsToNative(str);
    }

    public static JSONObject mmpToNative(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ffad39a1a4f990cbecd5fd7a3a2d04a", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ffad39a1a4f990cbecd5fd7a3a2d04a");
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            HashMap hashMap = new HashMap();
            hashMap.put("parameters", jSONObject);
            return (JSONObject) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_MMP_TO_NATIVE, hashMap);
        }
        return StatisticsDelegate.getInstance().mmpToNative(jSONObject);
    }

    public static void enableMock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4b835118f2970f7de54c12fb2cbddba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4b835118f2970f7de54c12fb2cbddba");
        } else {
            StatisticsDelegate.getInstance().enableMock();
        }
    }

    public static void setMockUri(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e629dc1abe3348c886cc8e4d8f65a781", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e629dc1abe3348c886cc8e4d8f65a781");
        } else {
            StatisticsDelegate.getInstance().setMockUri(uri);
        }
    }

    public static void disableMock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "568b7792ee0f9b053d1dad19d3dc2059", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "568b7792ee0f9b053d1dad19d3dc2059");
        } else {
            StatisticsDelegate.getInstance().disableMock();
        }
    }

    public static void enableDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ddf8c3d1b0dc1c1a36c5789558604d3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ddf8c3d1b0dc1c1a36c5789558604d3b");
        } else {
            LogUtil.enable(true);
        }
    }

    public static void disableDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d8fd4aef24b80f1b6eeace49cc43436", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d8fd4aef24b80f1b6eeace49cc43436");
        } else {
            LogUtil.enable(false);
        }
    }

    public static void enableAutoPV(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "44fb26c59d0679b04f1bfc6065939b60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "44fb26c59d0679b04f1bfc6065939b60");
        } else {
            StatisticsDelegate.getInstance().enableAutoPV(str);
        }
    }

    public static void enableAutoPD(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d4d3e6a55c19a0be783ce2279b5ff33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d4d3e6a55c19a0be783ce2279b5ff33");
        } else {
            StatisticsDelegate.getInstance().enableAutoPD(str);
        }
    }

    public static void disableAutoPV(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f57d473eed85f8a0152909355ae6977", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f57d473eed85f8a0152909355ae6977");
        } else {
            StatisticsDelegate.getInstance().disableAutoPV(str);
        }
    }

    public static void disableAutoPD(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7168c13ebbc39f3725de72420f4c0cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7168c13ebbc39f3725de72420f4c0cc");
        } else {
            StatisticsDelegate.getInstance().disableAutoPD(str);
        }
    }

    public static boolean isAutoPVEnabled(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f02550a4a3d1a50212592e6e553c291", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f02550a4a3d1a50212592e6e553c291")).booleanValue() : StatisticsDelegate.getInstance().isAutoPVEnabled(str);
    }

    public static boolean isAutoPDEnabled(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a30e0c9c0c05d0f4e031a23aca013ec8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a30e0c9c0c05d0f4e031a23aca013ec8")).booleanValue() : StatisticsDelegate.getInstance().isAutoPDEnabled(str);
    }

    public static void enableAutoPVPD(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c3fcd298f4c85ac7bdd7fd3c90fbb1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c3fcd298f4c85ac7bdd7fd3c90fbb1f");
            return;
        }
        enableAutoPV(str);
        enableAutoPD(str);
    }

    public static void disableAutoPVPD(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a957863fb045eb5b93670efa1d06325", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a957863fb045eb5b93670efa1d06325");
            return;
        }
        disableAutoPV(str);
        disableAutoPD(str);
    }

    public static void setValLab(@NonNull String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a66b36a12458a1b05bdb8b6f6c8b1a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a66b36a12458a1b05bdb8b6f6c8b1a5");
            return;
        }
        PageInfoManager.getInstance().setValLab(str, str2, str3);
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, str3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("pageInfoKey", str);
        hashMap2.put("data", hashMap);
        ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_VALLAB, hashMap2);
    }

    @Deprecated
    public static void setVallab(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3b204c621a74c93dfd04d302469a725", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3b204c621a74c93dfd04d302469a725");
        } else {
            setValLab(str, map);
        }
    }

    public static void setValLab(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb00c1276fe0c9963af0b84434bc34e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb00c1276fe0c9963af0b84434bc34e1");
            return;
        }
        PageInfoManager.getInstance().setValLab(str, map != null ? new HashMap(map) : new HashMap());
        if (!ConfigManager.getInstance(mContext).supportMultiProcess() || ProcessUtils.isMainProcess(mContext)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageInfoKey", str);
        hashMap.put("data", map);
        ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_VALLAB, hashMap);
    }

    public static void changePageInfoCapability(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3fcf611d0ad4ccccc8fba2721a2a948", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3fcf611d0ad4ccccc8fba2721a2a948");
        } else {
            PageInfoManager.getInstance().changeCapability(i);
        }
    }

    public static String getSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01f8bb0010f8ae09149f9f1f4ab1223d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01f8bb0010f8ae09149f9f1f4ab1223d") : SessionManager.getSession();
    }

    public static Map<String, String> getCustomEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8bef0ce290d8dca7ff07ac510e059bba", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8bef0ce290d8dca7ff07ac510e059bba");
        }
        if (ConfigManager.getInstance(mContext).supportMultiProcess() && !ProcessUtils.isMainProcess(mContext)) {
            return (Map) ProcessController.getInstance().selectMethod(mContext, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CUSTOM_ENV, null);
        }
        return StatisticsDelegate.getInstance().getCustomEnvironment();
    }

    @Deprecated
    public static void initCatMonitor(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06fdf6efc36137129996b559401317bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06fdf6efc36137129996b559401317bc");
        } else if (mContext == null) {
        } else {
            final Context context = mContext;
            StatisticsHandler.getInstance().innerStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.Statistics.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e4f951bfcea257cb7752f41e53580178", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e4f951bfcea257cb7752f41e53580178");
                    } else {
                        CatMonitorManager.getInstance().initCat(context, i);
                    }
                }
            });
        }
    }

    public static void statisticsViewEvent(@NonNull View view, LXViewDotter.LXEventName lXEventName) {
        Object[] objArr = {view, lXEventName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e34b659c73e9bbf8c96eb9cf5e80d586", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e34b659c73e9bbf8c96eb9cf5e80d586");
        } else {
            StatisticsDelegate.getInstance().statisticsViewEvent(view, lXEventName);
        }
    }

    public static void cleanBeforeInitData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54cae502845416b6a2a0c5f61f933ec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54cae502845416b6a2a0c5f61f933ec7");
        } else {
            BeforeInitChannelManager.getInstance().cleanBeforeInitLxEventData();
        }
    }

    public static Context getContext() {
        return mContext;
    }

    public static AbsExtraParameter getExtraParameter() {
        return mExtraParameter;
    }

    public static void setAdvertisement(IAdvertisement iAdvertisement) {
        Object[] objArr = {iAdvertisement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f623207638c2c3a2aea3b219236b09c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f623207638c2c3a2aea3b219236b09c");
        } else {
            AdManager.getInstance().setAdvertisement(iAdvertisement);
        }
    }

    public static IAdvertisement getAdvertisement() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28817f2303af97626378f64be52e2b89", 6917529027641081856L) ? (IAdvertisement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28817f2303af97626378f64be52e2b89") : AdManager.getInstance().getAdvertisement();
    }

    private static Context getContext(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6bf54ef4d13a37b147a861d225088d3c", 6917529027641081856L)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6bf54ef4d13a37b147a861d225088d3c");
        }
        if (mContext != null) {
            return mContext;
        }
        if (activity != null) {
            mContext = activity.getApplicationContext();
        }
        return mContext;
    }

    public static DefaultEnvironment getDefaultEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dbbb1cb68648139f2c10ccde997f4acf", 6917529027641081856L) ? (DefaultEnvironment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dbbb1cb68648139f2c10ccde997f4acf") : StatisticsDelegate.getInstance().getDefaultEnvironment();
    }

    public static void setCurrentActivity(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9f176db9bf881f81d627ce791288d99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9f176db9bf881f81d627ce791288d99");
            return;
        }
        mActivityWr = new WeakReference<>(activity);
        Context applicationContext = activity.getApplicationContext();
        if (ConfigManager.getInstance(applicationContext).supportMultiProcess() && !ProcessUtils.isMainProcess(applicationContext)) {
            StatisticsDelegateRemote.getInstance().setContext(applicationContext);
        } else {
            StatisticsDelegate.getInstance().setContext(applicationContext);
        }
    }

    public static void startCollect(final Activity activity, final String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bfc8b2ed40b71786114f3f0609cff130", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bfc8b2ed40b71786114f3f0609cff130");
        } else {
            StatisticsHandler.getInstance().gestureStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.Statistics.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "30bfacdad8a1baa99972b2f5cf21081d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "30bfacdad8a1baa99972b2f5cf21081d");
                    } else if (activity == null || activity.isFinishing() || !ConfigManager.getInstance(activity).isCollectKeyValid(str)) {
                    } else {
                        GestureManager.getInstance().incrementCollect();
                        if (GestureManager.getInstance().isCustomCollectGestureOn()) {
                            GestureManager.getInstance().setCurrentCustomCollectKey(str);
                            GestureManager.getInstance().registerWindowCall(activity);
                        }
                    }
                }
            });
        }
    }

    public static void stopCollect(final Activity activity, final String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6db5e693c2a5df8e079c9c8845f29f2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6db5e693c2a5df8e079c9c8845f29f2b");
        } else {
            StatisticsHandler.getInstance().gestureStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.Statistics.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1c8bca2b5d18fd5f4f0e78cdd45b61d4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1c8bca2b5d18fd5f4f0e78cdd45b61d4");
                    } else if (activity == null || activity.isFinishing() || !ConfigManager.getInstance(activity).isCollectKeyValid(str)) {
                    } else {
                        GestureManager.getInstance().decrementCollect();
                        if (GestureManager.getInstance().isCustomCollectGestureOn()) {
                            return;
                        }
                        GestureManager.getInstance().setCurrentCustomCollectKey("");
                    }
                }
            });
        }
    }

    public static void startReport(final Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84419992eabac6326de4c3cd86c7a08f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84419992eabac6326de4c3cd86c7a08f");
        } else {
            StatisticsHandler.getInstance().gestureStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.Statistics.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a6bc88172ba34d630904cc4b3fa2912a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a6bc88172ba34d630904cc4b3fa2912a");
                    } else if (ConfigManager.getInstance(context).isReportKeyValid(str)) {
                        GestureManager.getInstance().incrementReport();
                        if (GestureManager.getInstance().isCustomCollectGestureOn()) {
                            GestureManager.getInstance().setCurrentCustomReportKey(str);
                        }
                    }
                }
            });
        }
    }

    public static void stopReport(final Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19caa34a3fba91ed66d63ac5537fba7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19caa34a3fba91ed66d63ac5537fba7b");
        } else {
            StatisticsHandler.getInstance().gestureStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.Statistics.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "848db8b7fbd3fdbba7d2bda5864c34fd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "848db8b7fbd3fdbba7d2bda5864c34fd");
                    } else if (ConfigManager.getInstance(context).isReportKeyValid(str)) {
                        GestureManager.getInstance().decrementReport();
                        if (GestureManager.getInstance().isCustomCollectGestureOn()) {
                            return;
                        }
                        GestureManager.getInstance().setCurrentCustomReportKey("");
                    }
                }
            });
        }
    }

    public static Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b50c4ad070c717a23a94083d7b16c189", 6917529027641081856L)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b50c4ad070c717a23a94083d7b16c189");
        }
        if (mActivityWr != null) {
            return mActivityWr.get();
        }
        return null;
    }

    public static void setDelayInit(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "042b61165c4929980eb7e1da454b9e67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "042b61165c4929980eb7e1da454b9e67");
        } else {
            BeforeInitChannelManager.getInstance().isInitDelay = z;
        }
    }

    public static void setSubprocessIndependence(boolean z) {
        mIsSubprocessIndependence = z;
    }

    public static boolean isSubprocessIndependence() {
        return mIsSubprocessIndependence;
    }

    public static void connectMainProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e09c34738a0ec5041542ac010a22031a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e09c34738a0ec5041542ac010a22031a");
        } else {
            ProcessController.getInstance().connectMainProcess(context);
        }
    }
}
