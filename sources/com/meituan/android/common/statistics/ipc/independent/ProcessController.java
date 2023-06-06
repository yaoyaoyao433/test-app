package com.meituan.android.common.statistics.ipc.independent;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.StatisticsDelegateRemote;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.channel.ChannelManager;
import com.meituan.android.common.statistics.channel.IChannelInterface;
import com.meituan.android.common.statistics.channel.LocalChannel;
import com.meituan.android.common.statistics.channel.RemoteChannelProxy;
import com.meituan.android.common.statistics.gesture.data.GestureDataHandler;
import com.meituan.android.common.statistics.gesture.data.GestureDataHandlerRemote;
import com.meituan.android.common.statistics.gesture.data.GestureEntity;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.RequestManager;
import com.meituan.android.common.statistics.pageinfo.PageInfo;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.tag.ITagManager;
import com.meituan.android.common.statistics.tag.LocalTagManager;
import com.meituan.android.common.statistics.tag.RemoteTagProxy;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProcessController {
    public static final String KEY_LAST_PAGE_INFO_KEY = "lastPageInfoKey";
    public static final String KEY_LAST_PRE_PAGE_INFO_KEY = "lastPrePageInfoKey";
    public static final String KEY_PAGE_INFO_KEY = "pageInfoKey";
    public static final String KEY_PAGE_INFO_MAP = "pageInfoMap";
    public static final String KEY_PRE_PAGE_INFO_KEY = "prePageInfoKey";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ProcessControllerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static ProcessController instance = new ProcessController();
    }

    private String getTypeMethodName(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f352d8ee4e52f50f2805766aac94689b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f352d8ee4e52f50f2805766aac94689b");
        }
        if (i != 30013) {
            if (i != 50000) {
                switch (i) {
                    case 30000:
                        return "updateDefaultEnvironment";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CATEGORY /* 30001 */:
                        return "setDefaultCategory";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_CHANNEL_NAME /* 30002 */:
                        return "getDefaultChannelName";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME /* 30003 */:
                        return "setDefaultChannelName";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_CREATE /* 30004 */:
                        return "onCreate";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_START /* 30005 */:
                        return "newOnStart";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_STOP /* 30006 */:
                        return "newOnStop";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_RESUME /* 30007 */:
                        return "handleActivityResume";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_PAUSE /* 30008 */:
                        return "handleActivityPause";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY /* 30009 */:
                        return "handleActivityDestroy";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID /* 30010 */:
                        return "getRequestId";
                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID_FOR_PAGE /* 30011 */:
                        return "getRequestIdForPage";
                    default:
                        switch (i) {
                            case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_RESET_PAGE_NAME /* 30016 */:
                                return "resetPageName";
                            case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_JS_TO_NATIVE /* 30017 */:
                                return "JsToNative";
                            case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_MMP_TO_NATIVE /* 30018 */:
                                return "mmpToNative";
                            case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_VALLAB /* 30019 */:
                                return "setValLab";
                            default:
                                switch (i) {
                                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_ENV /* 30022 */:
                                        return "getDefaultEnvironment";
                                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CID /* 30023 */:
                                        return "getCid";
                                    case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CUSTOM_ENV /* 30024 */:
                                        return "getCustomEnvironment";
                                    default:
                                        return "unKnow";
                                }
                        }
                }
            }
            return "saveGesture";
        }
        return "getPageName";
    }

    public ProcessController() {
    }

    public boolean isMainProcessAlive(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a55b56157b4d0de53602ad3c4e7a0bd1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a55b56157b4d0de53602ad3c4e7a0bd1")).booleanValue() : ProcessUtils.isMainProcessAlive(context);
    }

    private void changeChannelToRemote() {
        Map<String, Channel> allChannel;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fc5e63ff0ae8da42dc0879358abf3b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fc5e63ff0ae8da42dc0879358abf3b7");
            return;
        }
        ChannelManager channelManager = StatisticsDelegate.getInstance().getChannelManager();
        if (channelManager == null || (allChannel = channelManager.getAllChannel()) == null || allChannel.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Channel> entry : allChannel.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    channelManager.addChannel(key, new Channel(key, channelManager, Statistics.getContext(), true));
                }
            }
        }
    }

    public void checkConnection(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf4bce73a3f8d1dab8782eca48ab76ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf4bce73a3f8d1dab8782eca48ab76ee");
        } else if (Statistics.isSubprocessIndependence()) {
        } else {
            RequestManager.getInstance().checkConnection(context);
        }
    }

    public synchronized void connectMainProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e17dd67287733f903c209ccd1f91675", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e17dd67287733f903c209ccd1f91675");
            return;
        }
        try {
            if (!isMainProcessAlive(context) && Statistics.isSubprocessIndependence()) {
                changeChannelToRemote();
                changeValidActivityMapToRemote();
                RequestManager.getInstance().checkConnection(context);
                StatisticsDelegateRemote.getInstance().sendSyncInfo(SyncInfoHandler.getInstance().getSyncInfo());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void changeValidActivityMapToRemote() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2647d19c16dfaa4b10165974582f18fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2647d19c16dfaa4b10165974582f18fe");
            return;
        }
        HashMap validActivityMap = StatisticsDelegate.getInstance().getValidActivityMap();
        if (validActivityMap == null || validActivityMap.isEmpty()) {
            return;
        }
        StatisticsDelegateRemote.getInstance().setValidActivityMap(validActivityMap);
    }

    public ITagManager selectTagManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56c031296453665ca06b32a783b6b04d", 6917529027641081856L)) {
            return (ITagManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56c031296453665ca06b32a783b6b04d");
        }
        if (Statistics.isSubprocessIndependence() && !isMainProcessAlive(context)) {
            return LocalTagManager.getInstance();
        }
        return RemoteTagProxy.getInstance();
    }

    public IChannelInterface selectChannel(Context context, String str, ChannelManager channelManager) {
        Object[] objArr = {context, str, channelManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76129ea268031d6c37ec81fec85e51e4", 6917529027641081856L)) {
            return (IChannelInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76129ea268031d6c37ec81fec85e51e4");
        }
        if (Statistics.isSubprocessIndependence()) {
            if (isMainProcessAlive(context)) {
                LogUtil.log("selectChannel IPC, isMainProcessAlive=true");
                return new RemoteChannelProxy(str, channelManager, context);
            }
            LogUtil.log("selectChannel LOCAL, isMainProcessAlive=false");
            return new LocalChannel(str, channelManager, context);
        }
        LogUtil.log("selectChannel IPC");
        return new RemoteChannelProxy(str, channelManager, context);
    }

    private String getLocalRequestId(Map<String, Object> map) {
        PageInfo pageInfo;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff8de24c5e39fe7e40372582d1a93175", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff8de24c5e39fe7e40372582d1a93175");
        }
        if (map != null && (map.get("pageInfoKey") instanceof String) && (pageInfo = PageInfoManager.getInstance().getPageInfo((String) map.get("pageInfoKey"))) != null) {
            return pageInfo.getRequestId();
        }
        PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
        return currentPageInfo == null ? "" : currentPageInfo.getRequestId();
    }

    private String getLocalRefRequestId(Map<String, Object> map) {
        PageInfo pageInfo;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7df998d9df2a501389ab6c36bd4045ab", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7df998d9df2a501389ab6c36bd4045ab");
        }
        if (map != null && (map.get("pageInfoKey") instanceof String) && (pageInfo = PageInfoManager.getInstance().getPageInfo((String) map.get("pageInfoKey"))) != null) {
            return pageInfo.getRequestRefId();
        }
        PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
        return currentPageInfo == null ? "" : currentPageInfo.getRequestRefId();
    }

    private String getLocalRefPageName(Map<String, Object> map) {
        PageInfo pageInfo;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99ed174a1d6e6abac47d05b49466f4cb", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99ed174a1d6e6abac47d05b49466f4cb");
        }
        if (map != null && (map.get("pageInfoKey") instanceof String) && (pageInfo = PageInfoManager.getInstance().getPageInfo((String) map.get("pageInfoKey"))) != null) {
            return pageInfo.getRef();
        }
        PageInfo currentPageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
        return currentPageInfo == null ? "" : currentPageInfo.getRef();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private Object selectLocalMethod(Context context, int i, Map<String, Object> map) throws JSONException {
        Object[] objArr = {context, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f489905651cfefaf86b6409ed16858aa", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f489905651cfefaf86b6409ed16858aa");
        }
        if (i != 50000) {
            switch (i) {
                case 30000:
                    if (map != null && map.containsKey("map") && (map.get("map") instanceof Map)) {
                        StatisticsDelegate.getInstance().updateDefaultEnvironment((Map) map.get("map"));
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CATEGORY /* 30001 */:
                    if (map != null && map.containsKey("category") && (map.get("category") instanceof String)) {
                        StatisticsDelegate.getInstance().setDefaultCategory((String) map.get("category"));
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_CHANNEL_NAME /* 30002 */:
                    return StatisticsDelegate.getInstance().getDefaultChannelName();
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME /* 30003 */:
                    if (map != null) {
                        String str = map.get("defaultChannelName") instanceof String ? (String) map.get("defaultChannelName") : "";
                        String str2 = map.get("pageInfoKey") instanceof String ? (String) map.get("pageInfoKey") : "";
                        if (TextUtils.isEmpty(str2)) {
                            StatisticsDelegate.getInstance().setDefaultChannelName(str);
                            break;
                        } else {
                            StatisticsDelegate.getInstance().setDefaultChannelName(str2, str);
                            break;
                        }
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_CREATE /* 30004 */:
                    if (context instanceof Activity) {
                        if (map != null && map.containsKey("bundle") && (map.get("bundle") instanceof Bundle)) {
                            StatisticsDelegate.getInstance().onCreate((Activity) context, (Bundle) map.get("bundle"));
                            break;
                        } else {
                            StatisticsDelegate.getInstance().onCreate((Activity) context, null);
                            break;
                        }
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_START /* 30005 */:
                    if (context instanceof Activity) {
                        StatisticsDelegate.getInstance().newOnStart((Activity) context);
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_STOP /* 30006 */:
                    StatisticsDelegate.getInstance().newOnStop(context);
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_RESUME /* 30007 */:
                    if (map != null) {
                        StatisticsDelegate.getInstance().handleActivityResume(map.get("pageInfoKey") instanceof String ? (String) map.get("pageInfoKey") : "", map.get("activityName") instanceof String ? (String) map.get("activityName") : "", map.get("vallab") instanceof Map ? (Map) map.get("vallab") : null, ProcessUtils.getCurrentProcessName(Statistics.getContext()));
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_PAUSE /* 30008 */:
                    if (map != null) {
                        StatisticsDelegate.getInstance().handleActivityPause(map.get("pageInfoKey") instanceof String ? (String) map.get("pageInfoKey") : "", map.get("activityName") instanceof String ? (String) map.get("activityName") : "", ProcessUtils.getCurrentProcessName(Statistics.getContext()));
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY /* 30009 */:
                    if (map != null) {
                        StatisticsDelegate.getInstance().handleActivityDestroyed(map.get("pageInfoKey") instanceof String ? (String) map.get("pageInfoKey") : "", map.get("activityName") instanceof String ? (String) map.get("activityName") : "", null);
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID /* 30010 */:
                    return getLocalRequestId(map);
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID_FOR_PAGE /* 30011 */:
                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                        PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo((String) map.get("pageInfoKey"));
                        return pageInfo == null ? "" : pageInfo.getRequestId();
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_REQUEST_ID /* 30012 */:
                    return getLocalRefRequestId(map);
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_PAGE_NAME /* 30013 */:
                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                        PageInfo pageInfo2 = PageInfoManager.getInstance().getPageInfo((String) map.get("pageInfoKey"));
                        return pageInfo2 != null ? pageInfo2.getCid() : "";
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_PAGE_NAME /* 30014 */:
                    return getLocalRefPageName(map);
                default:
                    switch (i) {
                        case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_RESET_PAGE_NAME /* 30016 */:
                            if (map != null && (map.get("pageInfoKey") instanceof String) && (map.get("pageName") instanceof String)) {
                                StatisticsDelegate.getInstance().resetPageName((String) map.get("pageInfoKey"), (String) map.get("pageName"));
                                break;
                            }
                            break;
                        case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_JS_TO_NATIVE /* 30017 */:
                            if (map != null && (map.get("message") instanceof String)) {
                                return StatisticsDelegate.getInstance().JsToNative((String) map.get("message"));
                            }
                            break;
                        case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_MMP_TO_NATIVE /* 30018 */:
                            if (map != null && (map.get("parameters") instanceof JSONObject)) {
                                return StatisticsDelegate.getInstance().mmpToNative((JSONObject) map.get("parameters"));
                            }
                            break;
                        case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_VALLAB /* 30019 */:
                            if (map != null && (map.get("pageInfoKey") instanceof String) && (map.get("data") instanceof Map)) {
                                PageInfoManager.getInstance().setValLab((String) map.get("pageInfoKey"), (Map) map.get("data"));
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_ENV /* 30022 */:
                                    return StatisticsDelegate.getInstance().getDefaultEnvironment();
                                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CID /* 30023 */:
                                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                                        return PageInfoManager.getInstance().getCid((String) map.get("pageInfoKey"));
                                    }
                                    break;
                                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CUSTOM_ENV /* 30024 */:
                                    return StatisticsDelegate.getInstance().getCustomEnvironment();
                            }
                    }
            }
        } else if (map != null && map.containsKey("entity") && (map.get("entity") instanceof GestureEntity)) {
            GestureDataHandler.getInstance().saveGesture((GestureEntity) map.get("entity"));
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private Object selectRemoteMethod(Context context, int i, Map<String, Object> map) throws JSONException {
        Object[] objArr = {context, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25818faa25518bf54837eee49c0cba67", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25818faa25518bf54837eee49c0cba67");
        }
        if (i != 50000) {
            switch (i) {
                case 30000:
                    if (map != null && map.containsKey("map") && (map.get("map") instanceof Map)) {
                        StatisticsDelegateRemote.getInstance().updateDefaultEnvironment((Map) map.get("map"));
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CATEGORY /* 30001 */:
                    if (map != null && map.containsKey("category") && (map.get("category") instanceof String)) {
                        StatisticsDelegateRemote.getInstance().setDefaultCategory((String) map.get("category"));
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_CHANNEL_NAME /* 30002 */:
                    return StatisticsDelegateRemote.getInstance().getDefaultChannelName();
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME /* 30003 */:
                    if (map != null) {
                        String str = map.get("defaultChannelName") instanceof String ? (String) map.get("defaultChannelName") : "";
                        String str2 = map.get("pageInfoKey") instanceof String ? (String) map.get("pageInfoKey") : "";
                        if (TextUtils.isEmpty(str2)) {
                            StatisticsDelegateRemote.getInstance().setDefaultChannelName(str);
                            break;
                        } else {
                            StatisticsDelegateRemote.getInstance().setDefaultChannelName(str2, str);
                            break;
                        }
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_CREATE /* 30004 */:
                    if (context instanceof Activity) {
                        if (map != null && map.containsKey("bundle") && (map.get("bundle") instanceof Bundle)) {
                            StatisticsDelegateRemote.getInstance().onCreate((Activity) context, (Bundle) map.get("bundle"));
                            break;
                        } else {
                            StatisticsDelegateRemote.getInstance().onCreate((Activity) context, null);
                            break;
                        }
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_START /* 30005 */:
                    if (context instanceof Activity) {
                        StatisticsDelegateRemote.getInstance().newOnStart((Activity) context);
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_STOP /* 30006 */:
                    if (context instanceof Activity) {
                        StatisticsDelegateRemote.getInstance().newOnStop((Activity) context);
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_RESUME /* 30007 */:
                    if (map != null) {
                        StatisticsDelegateRemote.getInstance().handleActivityResume(map.get("pageInfoKey") instanceof String ? (String) map.get("pageInfoKey") : "", map.get("activityName") instanceof String ? (String) map.get("activityName") : "", map.get("vallab") instanceof Map ? (Map) map.get("vallab") : null);
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_PAUSE /* 30008 */:
                    if (map != null) {
                        StatisticsDelegateRemote.getInstance().handleActivityPause(map.get("pageInfoKey") instanceof String ? (String) map.get("pageInfoKey") : "", map.get("activityName") instanceof String ? (String) map.get("activityName") : "");
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY /* 30009 */:
                    if (map != null) {
                        StatisticsDelegateRemote.getInstance().handleActivityDestroy(map.get("pageInfoKey") instanceof String ? (String) map.get("pageInfoKey") : "", map.get("activityName") instanceof String ? (String) map.get("activityName") : "");
                        break;
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID /* 30010 */:
                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                        return StatisticsDelegateRemote.getInstance().getRequestId((String) map.get("pageInfoKey"));
                    }
                    return StatisticsDelegateRemote.getInstance().getRequestId();
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID_FOR_PAGE /* 30011 */:
                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                        return StatisticsDelegateRemote.getInstance().getRequestIdForPage((String) map.get("pageInfoKey"));
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_REQUEST_ID /* 30012 */:
                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                        return StatisticsDelegateRemote.getInstance().getRefRequestId((String) map.get("pageInfoKey"));
                    }
                    return StatisticsDelegateRemote.getInstance().getRefRequestId();
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_PAGE_NAME /* 30013 */:
                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                        return StatisticsDelegateRemote.getInstance().getPageName((String) map.get("pageInfoKey"));
                    }
                    break;
                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_PAGE_NAME /* 30014 */:
                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                        return StatisticsDelegateRemote.getInstance().getRefPageName((String) map.get("pageInfoKey"));
                    }
                    return StatisticsDelegateRemote.getInstance().getRefPageName();
                default:
                    switch (i) {
                        case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_RESET_PAGE_NAME /* 30016 */:
                            if (map != null && (map.get("pageInfoKey") instanceof String) && (map.get("pageName") instanceof String)) {
                                StatisticsDelegateRemote.getInstance().resetPageName((String) map.get("pageInfoKey"), (String) map.get("pageName"));
                                break;
                            }
                            break;
                        case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_JS_TO_NATIVE /* 30017 */:
                            if (map != null && (map.get("message") instanceof String)) {
                                return StatisticsDelegateRemote.getInstance().JsToNative((String) map.get("message"));
                            }
                            break;
                        case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_MMP_TO_NATIVE /* 30018 */:
                            if (map != null && (map.get("parameters") instanceof JSONObject)) {
                                return StatisticsDelegateRemote.getInstance().mmpToNative((JSONObject) map.get("parameters"));
                            }
                            break;
                        case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_VALLAB /* 30019 */:
                            if (map != null && (map.get("pageInfoKey") instanceof String) && (map.get("data") instanceof Map)) {
                                StatisticsDelegateRemote.getInstance().setValLab((String) map.get("pageInfoKey"), (Map) map.get("data"));
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_ENV /* 30022 */:
                                    return StatisticsDelegateRemote.getInstance().getDefaultEnvironment();
                                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CID /* 30023 */:
                                    if (map != null && (map.get("pageInfoKey") instanceof String)) {
                                        return StatisticsDelegateRemote.getInstance().getCid((String) map.get("pageInfoKey"));
                                    }
                                    break;
                                case RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CUSTOM_ENV /* 30024 */:
                                    return StatisticsDelegateRemote.getInstance().getCustomEnvironment();
                            }
                    }
            }
        } else if (map != null && map.containsKey("entity") && (map.get("entity") instanceof GestureEntity)) {
            GestureDataHandlerRemote.getInstance().saveGesture((GestureEntity) map.get("entity"));
        }
        return null;
    }

    public Object selectMethod(Context context, int i, Map<String, Object> map) {
        Object[] objArr = {context, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "276b6af6eb140d86247c006eb5b1ffee", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "276b6af6eb140d86247c006eb5b1ffee");
        }
        try {
            if (Statistics.isSubprocessIndependence()) {
                if (isMainProcessAlive(context)) {
                    LogUtil.log("independence:selectMethod IPC, isMainProcessAlive=true, method=" + getTypeMethodName(i));
                    return selectRemoteMethod(context, i, map);
                }
                LogUtil.log("independence:selectMethod LOCAL, isMainProcessAlive=false, method=" + getTypeMethodName(i));
                return selectLocalMethod(context, i, map);
            }
            LogUtil.log("independence:selectMethod IPC, method=" + getTypeMethodName(i));
            return selectRemoteMethod(context, i, map);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static ProcessController getInstance() {
        return ProcessControllerHolder.instance;
    }
}
