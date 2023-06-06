package com.meituan.android.common.statistics.channel;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.analyse.BuildConfig;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.InnerDataBuilder.CidQuality;
import com.meituan.android.common.statistics.InnerDataBuilder.InnerDataManager;
import com.meituan.android.common.statistics.Interface.AbsExtraParameter;
import com.meituan.android.common.statistics.MmpNativeCommunicationStore;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.WebNativeCommunicationStore;
import com.meituan.android.common.statistics.ad.IAdvertisement;
import com.meituan.android.common.statistics.ad.MidasData;
import com.meituan.android.common.statistics.ad.MidasInfo;
import com.meituan.android.common.statistics.ad.Result;
import com.meituan.android.common.statistics.ad.ResultListener;
import com.meituan.android.common.statistics.cache.ICacheHandler;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.channel.SearchHelper;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.config.VallabConfig;
import com.meituan.android.common.statistics.dispatcher.EventManager;
import com.meituan.android.common.statistics.entity.BusinessInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.entity.QuickReportBean;
import com.meituan.android.common.statistics.exposure.ExposureInfo;
import com.meituan.android.common.statistics.exposure.ExposureInfoCache;
import com.meituan.android.common.statistics.exposure.ExposureStatisticsManager;
import com.meituan.android.common.statistics.flowmanager.FlowManager;
import com.meituan.android.common.statistics.flowmanager.client.HighFlowBidManager;
import com.meituan.android.common.statistics.gesture.GestureManager;
import com.meituan.android.common.statistics.immediateReport.ImmediateReportManager;
import com.meituan.android.common.statistics.mock.MockApiAgent;
import com.meituan.android.common.statistics.network.NetworkController;
import com.meituan.android.common.statistics.pageinfo.PageInfo;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.pageinfo.SearchIndexKey;
import com.meituan.android.common.statistics.quickreport.QuickReportConfigManager;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.common.statistics.session.ScidManager;
import com.meituan.android.common.statistics.session.SessionManager;
import com.meituan.android.common.statistics.sfrom.SFromManager;
import com.meituan.android.common.statistics.tag.TagManager;
import com.meituan.android.common.statistics.utils.ABCHelper;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.DebugUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.SntpUtil;
import com.meituan.android.common.statistics.utils.StatisticsUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LocalChannel extends AbstractChannel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ChannelManager mChannelManager;
    private String mChannelName;
    private Context mContext;
    private Map<String, String> mEnvironment;
    private long mSeq;
    private static Map<String, Long> mPageDurationMap = new HashMap();
    private static ExecutorService quickThread = c.a("Statistics-quickReportPack");
    private static ExecutorService quickNetThread = c.a("Statistics-quickReport", 4);
    private static final String TAG = LocalChannel.class.getSimpleName();

    public LocalChannel(String str, ChannelManager channelManager, Context context) {
        Object[] objArr = {str, channelManager, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2be594db7dfd992d79ac00f9932106aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2be594db7dfd992d79ac00f9932106aa");
            return;
        }
        this.mChannelName = str;
        this.mEnvironment = new ConcurrentHashMap();
        this.mChannelManager = channelManager;
        this.mContext = context;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public String getChannelName() {
        return this.mChannelName;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateEnvironment(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a19a8ef0a2c256ffbba32567affa6da6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a19a8ef0a2c256ffbba32567affa6da6")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.log("statistics", "Channel - updateEnvironment: parameters property can not be empty.");
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            LogUtil.log("statistics", "Channel - updateEnvironment: parameters value can not be empty.");
            return false;
        } else {
            try {
                this.mEnvironment.put(str, str2);
                return true;
            } catch (Exception e) {
                LogUtil.log("statistics", "Channel - updateEnvironment:" + e.getMessage());
                return false;
            }
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateEnvironment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cde4632129c3610411b3497ad38d361", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cde4632129c3610411b3497ad38d361")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.log("statistics", "Channel - updateEnvironment: parameters can not be empty");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                updateEnvironment(next, jSONObject.getString(next));
            }
            return true;
        } catch (Exception unused) {
            LogUtil.log("statistics", "Channel - updateEnvironment: parameters parse error.");
            return false;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public String getEnvironment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79794b8cb215b159b201810903ad0d5a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79794b8cb215b159b201810903ad0d5a");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(this.mChannelManager.getDefaultEnvironment());
        treeMap.putAll(this.mEnvironment);
        return (String) treeMap.get(str);
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public String getEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cba9c9bb0c0ffe5b0798b1936a558f16", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cba9c9bb0c0ffe5b0798b1936a558f16");
        }
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(this.mChannelManager.getDefaultEnvironment());
        treeMap.putAll(this.mEnvironment);
        treeMap.remove("lat");
        treeMap.remove("lng");
        treeMap.remove("locate_tm");
        return JsonUtil.mapToJSONString(treeMap);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public Map<String, String> getAllEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49b234aaff95f1c7bf76925f0ccf9917", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49b234aaff95f1c7bf76925f0ccf9917");
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(this.mChannelManager.getDefaultEnvironment());
            hashMap.putAll(this.mEnvironment);
            if (!hashMap.containsKey(Constants.Environment.KEY_CH)) {
                String downloadChannelByDefault = this.mChannelManager.getDownloadChannelByDefault();
                if (!TextUtils.isEmpty(downloadChannelByDefault)) {
                    hashMap.put(Constants.Environment.KEY_CH, downloadChannelByDefault);
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean createTagContainer(final Object obj, final Activity activity) {
        Object[] objArr = {obj, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "929dc75ee58a9b8b0b4d3550ed43f471", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "929dc75ee58a9b8b0b4d3550ed43f471")).booleanValue();
        }
        StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "da5c818a367f75253cc5b31ba42d791c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "da5c818a367f75253cc5b31ba42d791c");
                } else {
                    TagManager.getInstance().insertPageName(AppUtil.generatePageInfoKey(obj), AppUtil.generatePageInfoKey(activity), true);
                }
            }
        });
        return true;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateTag(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72f3ab7ee7901f8881119f324589a739", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72f3ab7ee7901f8881119f324589a739")).booleanValue() : updateTag(null, str, map);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateTag(final String str, final String str2, final Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc1acaa1a19d551446153510473f5fcc", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc1acaa1a19d551446153510473f5fcc")).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.log("statistics", "Channel - updateTag: parameters property can not be empty.");
            return false;
        } else if (map == null) {
            LogUtil.log("statistics", "Channel - updateTag: parameters value can not be empty.");
            return false;
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8571752a2071967387e7e1ef56955de5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8571752a2071967387e7e1ef56955de5");
                    } else {
                        TagManager.getInstance().writeTag(str, str2, map);
                    }
                }
            });
            return true;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void registerTag(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee30b9e89982cab34b41cbaaa940fd1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee30b9e89982cab34b41cbaaa940fd1e");
        } else if (strArr == null || strArr.length == 0) {
            LogUtil.log("statistics", "Channel - registerTag: parameters can not be empty.");
        } else {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    TagManager.getInstance().writeTag(str, new HashMap());
                }
            }
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean removeTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8b843a0941e67eeca89848ed2049966", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8b843a0941e67eeca89848ed2049966")).booleanValue() : removeTag(null, str);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean removeTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53684172ba2b9b2367edb4c528021f12", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53684172ba2b9b2367edb4c528021f12")).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.log("statistics", "Channel - removeTag: parameters property can not be empty.");
            return false;
        }
        return TagManager.getInstance().removeTag(str, str2);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public Map<String, Object> getTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99c5d47f02a7beca8a94dfbf7eb5bbf2", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99c5d47f02a7beca8a94dfbf7eb5bbf2");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TagManager.getInstance().getTag(str);
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(final EventName eventName, final String str, final String str2, final String str3, final String str4, final String str5, boolean z) {
        Object[] objArr = {eventName, str, str2, str3, str4, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48c6cdc6204114f3e64fcc40278fd42b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48c6cdc6204114f3e64fcc40278fd42b");
        } else if (eventName == null) {
            LogUtil.log("statistics", "Channel - writeEvent: event name can not be null.");
        } else {
            final Map<String, Object> eventExtraData = this.mChannelManager.getEventExtraData(this.mChannelName, str2, str, eventName);
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "27040dbd38193f9cbae681fbd9ac8487", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "27040dbd38193f9cbae681fbd9ac8487");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("nm", eventName.toString());
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("val_bid", str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("val_cid", str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("val_val", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("val_act", str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            jSONObject.put("val_lab", str5);
                        }
                        if (eventExtraData != null) {
                            jSONObject.put(Constants.EventInfoConsts.KEY_EVENT_EXTRA_DATA, JsonUtil.mapToJSONObject(eventExtraData));
                        }
                        Map tags = LocalChannel.this.getTags();
                        if (tags != null && tags.size() > 0) {
                            jSONObject.put("tag", JsonUtil.mapToJSONObject(tags));
                        }
                        jSONObject.put("tm", System.currentTimeMillis());
                        jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, 3);
                        jSONObject.put("category", LocalChannel.this.mChannelName);
                        LocalChannel.this.commitEvs(EventLevel.URGENT, jSONObject);
                    } catch (Exception e) {
                        LogUtil.log("statistics", "Channel - writeEvent:" + e.getMessage());
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageTrack(BusinessInfo businessInfo) {
        Object[] objArr = {businessInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed76a4449c326ae5e809ff26891ae70a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed76a4449c326ae5e809ff26891ae70a");
        } else if (businessInfo == null) {
            LogUtil.log("statistics", "Channel - writePageTrack New: businessInfo is null.");
        } else {
            EventInfo eventInfo = new EventInfo();
            eventInfo.nm = EventName.MPT;
            eventInfo.val_val = businessInfo;
            eventInfo.isAuto = 1;
            eventInfo.level = EventLevel.URGENT;
            eventInfo.category = this.mChannelName;
            write(null, eventInfo);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageView(@NonNull String str, Map<String, Object> map, EventLevel eventLevel) {
        Object[] objArr = {str, map, eventLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "416d75e5bca0bfdf25db5e0506551f39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "416d75e5bca0bfdf25db5e0506551f39");
            return;
        }
        StatisticsUtils.commitExposureStatisticInfo(str);
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        String cid = PageInfoManager.getInstance().getCid(str);
        if (TextUtils.isEmpty(cid)) {
            cid = AppUtil.getClassName(str);
        }
        Map<String, Object> eventExtraData = this.mChannelManager.getEventExtraData(this.mChannelName, cid, "", EventName.PAGE_VIEW);
        recordPageViewTime(str);
        recordPkgAndClassName(str, hashMap);
        pageViewWithLevel(str, null, hashMap, eventExtraData, eventLevel, 6);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageDisappear(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1583926e54e37a4c55f7bdf866cdfac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1583926e54e37a4c55f7bdf866cdfac");
            return;
        }
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        String cid = PageInfoManager.getInstance().getCid(str);
        if (TextUtils.isEmpty(cid)) {
            cid = AppUtil.getClassName(str);
        }
        pageDisappearWithLevel(str, null, recordPageDuration(str, hashMap), this.mChannelManager.getEventExtraData(this.mChannelName, cid, "", EventName.PAGE_DISAPPEAR), EventLevel.URGENT, 6);
        StatisticsUtils.commitExposureStatisticInfo(str);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writePageView(@NonNull final String str, @NonNull final String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b013d6950b8e2646ca26c371e618e54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b013d6950b8e2646ca26c371e618e54");
            return;
        }
        final HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        final Map<String, Object> eventExtraData = this.mChannelManager.getEventExtraData(this.mChannelName, str2, "", EventName.PAGE_VIEW);
        StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bd4ecaf3f1866e6a8aef6bf40daae835", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bd4ecaf3f1866e6a8aef6bf40daae835");
                    return;
                }
                StatisticsUtils.commitExposureStatisticInfo(str);
                String pageInfoKeyChecked = AppUtil.getPageInfoKeyChecked(str, str2);
                LocalChannel.this.recordPageViewTime(pageInfoKeyChecked);
                PageInfo addPageInfo = PageInfoManager.getInstance().addPageInfo(pageInfoKeyChecked, str2);
                if (addPageInfo != null && hashMap != null && hashMap.containsKey("process")) {
                    addPageInfo.setProName((String) hashMap.get("process"));
                }
                if (hashMap != null && hashMap.size() > 0) {
                    LocalChannel.this.synchroValLabToPageInfo(pageInfoKeyChecked, hashMap);
                }
                LocalChannel.this.recordPkgAndClassName(pageInfoKeyChecked, hashMap);
                LocalChannel.this.pageViewWithLevel(pageInfoKeyChecked, str2, hashMap, eventExtraData, EventLevel.URGENT, 7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void synchroValLabToPageInfo(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc29892a9caa721d8aac44c6d10bf657", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc29892a9caa721d8aac44c6d10bf657");
            return;
        }
        try {
            PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
            if (pageInfo != null) {
                pageInfo.clearValLab();
                pageInfo.addValLab(map);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pageViewWithLevel(@NonNull String str, String str2, Map<String, Object> map, Map<String, Object> map2, EventLevel eventLevel, int i) {
        String str3;
        int i2;
        Object[] objArr = {str, str2, map, map2, eventLevel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d267fe5c9598329e1fe1a40ef88c8a85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d267fe5c9598329e1fe1a40ef88c8a85");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.val_lab = map;
        eventInfo.nm = EventName.PAGE_VIEW;
        eventInfo.val_cid = str2;
        eventInfo.isAuto = i;
        eventInfo.level = eventLevel;
        eventInfo.category = this.mChannelName;
        eventInfo.eventExtData = map2;
        if (i == 6) {
            Set<String> pageInfoKeySet = StatisticsDelegate.getInstance().getPageInfoKeySet();
            if (pageInfoKeySet != null) {
                str3 = str;
                i2 = 0;
                if (!pageInfoKeySet.contains(str3)) {
                    pageInfoKeySet.add(str3);
                    eventInfo.pageCreateFirstPv = 1;
                }
            } else {
                str3 = str;
                i2 = 0;
            }
            eventInfo.pageCreateFirstPv = i2;
        } else {
            str3 = str;
        }
        write(str3, eventInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pageDisappearWithLevel(String str, String str2, Map<String, Object> map, Map<String, Object> map2, EventLevel eventLevel, int i) {
        Object[] objArr = {str, str2, map, map2, eventLevel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3fab9cd60d7183288483047c59466d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3fab9cd60d7183288483047c59466d5");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.val_lab = map;
        eventInfo.nm = EventName.PAGE_DISAPPEAR;
        eventInfo.val_cid = str2;
        eventInfo.isAuto = i;
        eventInfo.level = eventLevel;
        eventInfo.category = this.mChannelName;
        eventInfo.eventExtData = map2;
        write(str, eventInfo);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writePageDisappear(@NonNull final String str, final String str2, final Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ceca76f1ccb0805903ffc7008f3a94df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ceca76f1ccb0805903ffc7008f3a94df");
            return;
        }
        final Map<String, Object> eventExtraData = this.mChannelManager.getEventExtraData(this.mChannelName, str2, "", EventName.PAGE_DISAPPEAR);
        StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "493562c1b0e47f07b2988c3828680ce0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "493562c1b0e47f07b2988c3828680ce0");
                    return;
                }
                String pageInfoKeyChecked = AppUtil.getPageInfoKeyChecked(str, str2);
                LocalChannel.this.pageDisappearWithLevel(pageInfoKeyChecked, str2, LocalChannel.this.recordPageDuration(pageInfoKeyChecked, map != null ? new HashMap(map) : new HashMap()), eventExtraData, EventLevel.URGENT, 7);
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ed9ff680e4660e735aa4f64335afd11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ed9ff680e4660e735aa4f64335afd11");
        } else {
            writeModelEvent(str, str2, map, str3, EventName.MODEL_VIEW, EventLevel.URGENT, false, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fa00013fc3a54444b8c3550287ee4ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fa00013fc3a54444b8c3550287ee4ac");
        } else {
            writeModelView(str, str2, (Map<String, Object>) JsonUtil.convertToHashMapAndPut(map, "index", String.valueOf(i)), str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32628c9ea631e1436f6f8b2de3f2ac1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32628c9ea631e1436f6f8b2de3f2ac1f");
        } else {
            writeModelEvent(str, str2, JsonUtil.convertToHashMap(map), str3, EventName.MODEL_VIEW, EventLevel.URGENT, z, false);
        }
    }

    private void writeModelEvent(@NonNull final String str, String str2, Map<String, Object> map, String str3, EventName eventName, EventLevel eventLevel, final boolean z, boolean z2) {
        Object[] objArr = {str, str2, map, str3, eventName, eventLevel, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dfa4de28bf71a0ecfadbe58d95bf0fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dfa4de28bf71a0ecfadbe58d95bf0fa");
            return;
        }
        final EventInfo eventInfo = new EventInfo();
        eventInfo.nm = eventName;
        eventInfo.val_bid = str2;
        eventInfo.val_cid = str3;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        eventInfo.level = eventLevel;
        eventInfo.sf = false;
        eventInfo.category = this.mChannelName;
        eventInfo.eventExtData = this.mChannelManager.getEventExtraData(eventInfo.category, eventInfo.val_cid, eventInfo.val_bid, EventName.fromEventType(eventInfo.nm, eventInfo.event_type));
        StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5722cbcc9a2a97bc0cd9549d9f6689f9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5722cbcc9a2a97bc0cd9549d9f6689f9");
                    return;
                }
                LocalChannel.this.moduleEventWithPageInfo(str, eventInfo.val_lab, z);
                LocalChannel.this.write(str, eventInfo);
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModeViewMergable(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dec2c211144f76fef3a373641e271626", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dec2c211144f76fef3a373641e271626");
        } else {
            writeModelEvent(str, str2, map, str3, EventName.MODEL_VIEW_LIST, EventLevel.URGENT, false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moduleEventWithPageInfo(@NonNull String str, Map<String, Object> map, boolean z) {
        PageInfo pageInfo;
        ConcurrentHashMap<String, Object> valLab;
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28d0a318dded94d6f6de6f770c0587f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28d0a318dded94d6f6de6f770c0587f3");
        } else if (!z || (pageInfo = PageInfoManager.getInstance().getPageInfo(str)) == null || (valLab = pageInfo.getValLab()) == null) {
        } else {
            JSONObject mapToJSONObject = JsonUtil.mapToJSONObject(valLab);
            if (map != null) {
                map.put("page", mapToJSONObject);
            }
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public ExposureInfo writeModelExposure(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9203accfe78a78b0ec212e456fa24396", 6917529027641081856L)) {
            return (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9203accfe78a78b0ec212e456fa24396");
        }
        String uuid = UUID.randomUUID().toString();
        Random random = new Random();
        String str4 = uuid + System.currentTimeMillis() + random.nextInt(1000);
        ExposureInfo exposureInfo = new ExposureInfo(str, BuildConfig.LX_VERSION_NAME, this.mChannelName, SessionManager.getMSID(this.mContext), SessionManager.getAppMSID(this.mContext), "", str2, str3, map, 1, str4, SystemClock.elapsedRealtime(), EventName.MODEL_VIEW);
        if (ConfigManager.getInstance(this.mContext).isModelExposureOn()) {
            ExposureInfoCache.getInstance().addExposureInfo(str4, new SoftReference<>(exposureInfo));
            writeModelEvent(str, str2, map, str3, str4, EventName.MODEL_VIEW, EventLevel.URGENT, false, false);
            return exposureInfo;
        }
        writeModelView(str, str2, map, str3);
        LogUtil.log(TAG, "writeModelExposure switch off");
        return exposureInfo;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public ExposureInfo writeModelExposureForMrnSDk(String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ed7a97998d43e7f09f70f720e364770", 6917529027641081856L)) {
            return (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ed7a97998d43e7f09f70f720e364770");
        }
        ExposureInfo exposureInfo = new ExposureInfo(str, BuildConfig.LX_VERSION_NAME, this.mChannelName, SessionManager.getMSID(this.mContext), SessionManager.getAppMSID(this.mContext), "", str2, str3, map, 10, str4, SystemClock.elapsedRealtime(), EventName.MODEL_VIEW);
        if (ConfigManager.getInstance(this.mContext).isModelExposureOn()) {
            ExposureInfoCache.getInstance().addExposureInfo(str4, exposureInfo);
            writeModelEvent(str, str2, map, str3, str4, EventName.MODEL_VIEW, EventLevel.URGENT, false, false);
            return exposureInfo;
        }
        writeModelView(str, str2, map, str3);
        return exposureInfo;
    }

    private void writeModelEvent(@NonNull final String str, String str2, Map<String, Object> map, String str3, String str4, EventName eventName, EventLevel eventLevel, final boolean z, boolean z2) {
        Object[] objArr = {str, str2, map, str3, str4, eventName, eventLevel, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8e8fcccb0b40044814da5f0bb98728e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8e8fcccb0b40044814da5f0bb98728e");
            return;
        }
        final EventInfo eventInfo = new EventInfo();
        eventInfo.nm = eventName;
        eventInfo.val_bid = str2;
        eventInfo.val_cid = str3;
        eventInfo.val_lab = map;
        eventInfo.mreq_id = str4;
        eventInfo.isAuto = 7;
        eventInfo.level = eventLevel;
        eventInfo.sf = false;
        eventInfo.category = this.mChannelName;
        eventInfo.eventExtData = this.mChannelManager.getEventExtraData(eventInfo.category, eventInfo.val_cid, eventInfo.val_bid, EventName.fromEventType(eventInfo.nm, eventInfo.event_type));
        StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d7a291d34c02cb981e6108efe3260cc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d7a291d34c02cb981e6108efe3260cc");
                    return;
                }
                LocalChannel.this.moduleEventWithPageInfo(str, eventInfo.val_lab, z);
                LocalChannel.this.write(str, eventInfo);
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1077a7eee0f092fac445fc19617dbd8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1077a7eee0f092fac445fc19617dbd8e");
        } else {
            writeModelEvent(str, str2, map, str3, EventName.EDIT, EventLevel.URGENT, z, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca6b24838ed2010ead95e5756a6cd20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca6b24838ed2010ead95e5756a6cd20");
            return;
        }
        if (map != null) {
            map.put("index", String.valueOf(i));
        }
        writeModelClick(str, str2, map, str3, false, false);
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z, boolean z2) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "141e4324c6521200f2560e5e147572b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "141e4324c6521200f2560e5e147572b5");
        } else {
            writeModelEvent(str, str2, map, str3, EventName.CLICK, EventLevel.URGENT, z, z2);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19eefa3322562b634982db48f25dc5f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19eefa3322562b634982db48f25dc5f5");
        } else {
            writeModelEvent(str, str2, map, str3, EventName.ORDER, EventLevel.IMMEDIATE, z, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6990bae5edef12cbdbe86489d3fdf22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6990bae5edef12cbdbe86489d3fdf22");
        } else {
            writeModelEvent(str, str2, map, str3, EventName.PAY, EventLevel.IMMEDIATE, z, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeShow(@NonNull final String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27b1940f03b885d487e1367a77881e99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27b1940f03b885d487e1367a77881e99");
            return;
        }
        final EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MGE;
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.element_id = str3;
        eventInfo.index = str4;
        eventInfo.event_type = Constants.EventType.VIEW;
        setEventPriority(eventInfo);
        eventInfo.category = this.mChannelName;
        eventInfo.eventExtData = this.mChannelManager.getEventExtraData(eventInfo.category, eventInfo.val_cid, eventInfo.val_bid, EventName.fromEventType(eventInfo.nm, eventInfo.event_type));
        StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2281685f3c817cdbcb333722fcd43aed", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2281685f3c817cdbcb333722fcd43aed");
                } else {
                    LocalChannel.this.write(str, eventInfo);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeSystemCheck(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84af57e0dbae898a5e818c1f04d57975", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84af57e0dbae898a5e818c1f04d57975");
        } else {
            writeModelEvent(str, str2, map, str3, EventName.SC, EventLevel.URGENT, false, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeEvent(@NonNull final String str, final EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8994d3479427fb28b8e4e57a4b97591b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8994d3479427fb28b8e4e57a4b97591b");
        } else if (eventInfo == null) {
            LogUtil.log("statistics", "Channel - writeEvent New: eventInfo is null.");
        } else {
            if (eventInfo.nm == null) {
                eventInfo.nm = EventName.MGE;
            }
            setEventPriority(eventInfo);
            eventInfo.category = this.mChannelName;
            eventInfo.eventExtData = this.mChannelManager.getEventExtraData(eventInfo.category, eventInfo.val_cid, eventInfo.val_bid, EventName.fromEventType(eventInfo.nm, eventInfo.event_type));
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "87ec9ae8ff6a8f104359d528f4231d1c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "87ec9ae8ff6a8f104359d528f4231d1c");
                    } else {
                        LocalChannel.this.write(str, eventInfo);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(@NonNull final String str, EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, eventName, businessInfo, map, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be0d0befc9f9f70c640d781af60eeeee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be0d0befc9f9f70c640d781af60eeeee");
        } else if (eventName == null) {
            LogUtil.log("statistics", "Channel - writeEvent New: nm is null.");
        } else {
            final EventInfo eventInfo = new EventInfo();
            eventInfo.nm = eventName;
            eventInfo.val_val = businessInfo;
            eventInfo.val_lab = map;
            eventInfo.val_act = str2;
            eventInfo.element_id = str3;
            eventInfo.index = str4;
            eventInfo.val_bid = str5;
            eventInfo.event_type = str6;
            setEventPriority(eventInfo);
            eventInfo.category = this.mChannelName;
            eventInfo.eventExtData = this.mChannelManager.getEventExtraData(eventInfo.category, eventInfo.val_cid, eventInfo.val_bid, EventName.fromEventType(eventInfo.nm, eventInfo.event_type));
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a87003e8b1bfaa9499998bf1e5eb5bf7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a87003e8b1bfaa9499998bf1e5eb5bf7");
                    } else {
                        LocalChannel.this.write(str, eventInfo);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeEvent(@NonNull final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7671998a0894dc1b7e4077e6cccb3dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7671998a0894dc1b7e4077e6cccb3dc");
        } else if (TextUtils.isEmpty(str2)) {
            LogUtil.log("statistics", "Channel - writeEvent: evs isEmpty.");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.11
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9577f33ad56796b1470f2f169bed3c0b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9577f33ad56796b1470f2f169bed3c0b");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        Map tags = LocalChannel.this.getTags();
                        if (tags != null && tags.size() > 0) {
                            jSONObject.put("tag", JsonUtil.mapToJSONObject(tags));
                        }
                        if (TextUtils.isEmpty(jSONObject.optString("val_cid"))) {
                            PageInfo pageInfo = PageInfoManager.getInstance().getPageInfo(str);
                            if (pageInfo == null) {
                                pageInfo = PageInfoManager.getInstance().getCurrentPageInfo();
                            }
                            if (pageInfo != null) {
                                jSONObject.put("val_cid", pageInfo.getCid());
                            }
                        }
                        if (TextUtils.isEmpty(jSONObject.optString("val_ref"))) {
                            PageInfo pageInfo2 = PageInfoManager.getInstance().getPageInfo(str);
                            if (pageInfo2 == null) {
                                pageInfo2 = PageInfoManager.getInstance().getCurrentPageInfo();
                            }
                            if (pageInfo2 != null) {
                                jSONObject.put("val_ref", pageInfo2.getRef());
                            }
                        }
                        jSONObject.put("tm", System.currentTimeMillis());
                        jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, 3);
                        jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, Statistics.getRequestId(str));
                        jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, Statistics.getRefRequestId(str));
                        jSONObject.put("category", LocalChannel.this.mChannelName);
                        LocalChannel.this.commitEvs(EventLevel.URGENT, jSONObject);
                    } catch (Exception unused) {
                        LogUtil.log("statistics", "Channel - writeEvent:  convert json is error.");
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IKNBInterface
    public void writeEventThroughWeb(final JSONObject jSONObject, final JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f00eddffeaf1006c44b75cb2e6b5dbc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f00eddffeaf1006c44b75cb2e6b5dbc6");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.12
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    boolean optBoolean;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "94b3e1d2fac33b3c36fc53946d341e8d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "94b3e1d2fac33b3c36fc53946d341e8d");
                    } else if (jSONObject == null) {
                    } else {
                        try {
                            Map tags = LocalChannel.this.getTags();
                            if (tags != null && tags.size() > 0) {
                                jSONObject.put("tag", JsonUtil.mapToJSONObject(tags));
                            }
                            if (jSONObject.optLong("tm") <= 0) {
                                jSONObject.put("tm", System.currentTimeMillis());
                            }
                            if (jSONObject.optLong("stm") <= 0) {
                                jSONObject.put("stm", SntpUtil.currentTimeMillis());
                            }
                            Object obj = jSONObject.get(Constants.EventInfoConsts.KEY_IS_AUTO);
                            Object obj2 = jSONObject.get("nt");
                            if (obj2 != null && !TextUtils.isEmpty(obj2.toString())) {
                                jSONObject.put("nt", obj2);
                            } else {
                                jSONObject.put("nt", 2);
                            }
                            if (obj != null && !TextUtils.isEmpty(obj.toString())) {
                                jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, obj);
                            } else {
                                jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, 7);
                            }
                            if (EventName.CLICK.toString().equals(jSONObject.optString("nm")) && (optBoolean = jSONObject.optBoolean("_sf"))) {
                                jSONObject.remove("_sf");
                                jSONObject.put(Constants.EventInfoConsts.KEY_SF, optBoolean);
                            }
                            if (!jSONObject.optBoolean("shouldCover", true)) {
                                if (LocalChannel.this.isJsonEmpty(jSONObject, "val_ref") && LocalChannel.this.isJsonEmpty(jSONObject, Constants.EventInfoConsts.KEY_REQ_ID) && LocalChannel.this.isJsonEmpty(jSONObject, Constants.EventInfoConsts.KEY_REFER_REQ_ID)) {
                                    jSONObject.put("val_ref", Statistics.getRefPageName(null));
                                    jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, Statistics.getRequestId(null));
                                    jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, Statistics.getRefRequestId(null));
                                }
                            } else {
                                jSONObject.put("val_ref", Statistics.getRefPageName(null));
                                jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, Statistics.getRequestId(null));
                                jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, Statistics.getRefRequestId(null));
                            }
                            if (jSONObject.has("shouldCover")) {
                                jSONObject.remove("shouldCover");
                            }
                            if (jSONObject2 != null && jSONObject2.optBoolean("shouldCoverCid")) {
                                jSONObject.put("val_cid", Statistics.getPageName(null));
                                jSONObject.put("val_ref", Statistics.getRefPageName(null));
                                jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, Statistics.getRequestId(null));
                                jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, Statistics.getRefRequestId(null));
                                if (QuickReportConstants.PV_CONFIG.equalsIgnoreCase(jSONObject.optString("nm"))) {
                                    WebNativeCommunicationStore.StoreData storeData = new WebNativeCommunicationStore.StoreData();
                                    storeData.webCid = jSONObject.optString(Constants.Web.KEY_WEB_CID);
                                    storeData.webReqId = jSONObject.optString(Constants.Web.KEY_WEB_REQ_ID);
                                    WebNativeCommunicationStore.setStoreData(storeData);
                                }
                            }
                            if (jSONObject2 != null) {
                                jSONObject.put(Constants.JSNative.IS_QUICK_REPORT, jSONObject2.optBoolean(Constants.JSNative.IS_QUICK_REPORT, false));
                                jSONObject.put(Constants.JSNative.NEED_CACHE_PD, jSONObject2.optBoolean(Constants.JSNative.NEED_CACHE_PD, false));
                                JSONObject optJSONObject = jSONObject2.optJSONObject(Constants.JSNative.WEB_ENV);
                                if (optJSONObject != null) {
                                    LocalChannel.this.updateEnvironment(Constants.JSNative.WEB_ENV, optJSONObject.toString());
                                }
                            }
                            jSONObject.put("category", LocalChannel.this.mChannelName);
                            LocalChannel.this.mergeEventExtraData(jSONObject);
                            LocalChannel.this.commitEvs(EventLevel.URGENT, jSONObject);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventExtraData(JSONObject jSONObject) {
        Map<String, Object> eventExtraData;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac7cecf9458878bd780dc51ecfb03899", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac7cecf9458878bd780dc51ecfb03899");
            return;
        }
        try {
            if (this.mChannelManager != null && (eventExtraData = this.mChannelManager.getEventExtraData(this.mChannelName, jSONObject.optString("val_cid"), jSONObject.optString("val_bid"), EventName.getEnum(jSONObject.optString("nm")))) != null && eventExtraData.size() > 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.EventInfoConsts.KEY_EVENT_EXTRA_DATA);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                for (Map.Entry<String, Object> entry : eventExtraData.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        if (!TextUtils.isEmpty(key) && !optJSONObject.has(key)) {
                            optJSONObject.put(key, entry.getValue());
                        }
                    }
                }
                jSONObject.put(Constants.EventInfoConsts.KEY_EVENT_EXTRA_DATA, optJSONObject);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAdEvent(@NonNull String str, String str2, Map<String, Object> map, String str3, EventName eventName, MidasInfo midasInfo, boolean z) {
        final String str4;
        Object[] objArr = {str, str2, map, str3, eventName, midasInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9569a56335a7d8284bd8e69278173895", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9569a56335a7d8284bd8e69278173895");
            return;
        }
        IAdvertisement advertisement = Statistics.getAdvertisement();
        if (advertisement == null || midasInfo == null) {
            str4 = str;
        } else {
            LogUtil.log("adtest", "local channel writeAdEvent midasData :" + new Gson().toJson(midasInfo) + " process:" + ProcessUtils.getCurrentProcessName(Statistics.getContext()));
            str4 = str;
            final MidasData midasData = new MidasData(this.mChannelName, str, str2, map, str3, midasInfo.adObject, midasInfo.feedback, midasInfo.act, midasInfo.monitoUrls, midasInfo.extraParams);
            advertisement.handleMidasData(midasData, new ResultListener() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.13
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.statistics.ad.ResultListener
                public void onResult(boolean z2, Result result) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), result};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c56d61e2d5f5b209a327dc3428b55b43", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c56d61e2d5f5b209a327dc3428b55b43");
                    } else {
                        CatMonitorManager.getInstance().reportADReportStatus(z2, midasData, ProcessUtils.getCurrentProcessName(LocalChannel.this.mContext));
                    }
                }
            });
        }
        if (z) {
            return;
        }
        if (EventName.PAGE_VIEW.equals(eventName)) {
            writePageView(str4, str3, map);
        } else if (eventName != null) {
            if (EventName.CLICK.equals(eventName) || EventName.MODEL_VIEW.equals(eventName)) {
                final EventInfo eventInfo = new EventInfo();
                eventInfo.nm = eventName;
                eventInfo.val_bid = str2;
                eventInfo.val_cid = str3;
                eventInfo.val_lab = map;
                eventInfo.isAuto = 7;
                eventInfo.sf = false;
                eventInfo.category = this.mChannelName;
                eventInfo.level = EventLevel.URGENT;
                eventInfo.eventExtData = this.mChannelManager.getEventExtraData(eventInfo.category, eventInfo.val_cid, eventInfo.val_bid, EventName.fromEventType(eventInfo.nm, eventInfo.event_type));
                StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.14
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "70c1ce4159f7a0728d86f599d5c5a7ba", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "70c1ce4159f7a0728d86f599d5c5a7ba");
                        } else {
                            LocalChannel.this.write(str4, eventInfo);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isJsonEmpty(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9db5886b982509ebba05f1b21af4334c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9db5886b982509ebba05f1b21af4334c")).booleanValue();
        }
        String optString = jSONObject.optString(str);
        return optString == null || optString.trim().length() == 0;
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public long getSeq() {
        return this.mSeq;
    }

    private void setEventPriority(EventInfo eventInfo) {
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dd5956f8be1502f227f70453b84d40b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dd5956f8be1502f227f70453b84d40b");
        } else if (eventInfo == null) {
        } else {
            switch (eventInfo.nm) {
                case ORDER:
                case PAY:
                case START:
                case QUIT:
                    eventInfo.level = EventLevel.IMMEDIATE;
                    return;
                case REPORT:
                    eventInfo.level = EventLevel.ALL;
                    return;
                default:
                    eventInfo.level = EventLevel.URGENT;
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> getTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e34b5afb7f92539d911adedc38f38e9", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e34b5afb7f92539d911adedc38f38e9");
        }
        long nanoTime = System.nanoTime();
        Map<String, Object> tags = TagManager.getInstance().getTags();
        CatMonitorManager.getInstance().reportGetTagTime(System.nanoTime() - nanoTime);
        return tags;
    }

    private boolean hasSFrom(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe80c6de7a8d1ecd91d3e2332cd4b848", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe80c6de7a8d1ecd91d3e2332cd4b848")).booleanValue() : jSONObject != null && jSONObject.optBoolean(Constants.EventInfoConsts.KEY_SF);
    }

    private void addSFromInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7d917f61e3d3a60525f7ea2d8d8b1dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7d917f61e3d3a60525f7ea2d8d8b1dd");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("seq", jSONObject.optLong("seq"));
            jSONObject2.put("category", this.mChannelName);
            jSONObject2.put("cid", jSONObject.optString("val_cid"));
            jSONObject2.put("bid", jSONObject.opt("val_bid"));
            jSONObject2.put("val_lab", jSONObject.opt("val_lab"));
            SFromManager.getInstance().addNewSFrom(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void write(String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b12cf1cea4f7cd098bce6c2392f5b359", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b12cf1cea4f7cd098bce6c2392f5b359");
            return;
        }
        if (eventInfo != null) {
            try {
                if (eventInfo.nm != null) {
                    if (eventInfo.val_lab != null && eventInfo.val_lab.containsKey("nt")) {
                        try {
                            eventInfo.nt = ((Integer) eventInfo.val_lab.get("nt")).intValue();
                            eventInfo.val_lab.remove("nt");
                        } catch (NumberFormatException unused) {
                            LogUtil.log(TAG, "Channel-write nt number format exception ");
                        }
                    } else {
                        eventInfo.nt = 1;
                    }
                    eventInfo.tag = getTags();
                    eventInfo.tm = System.currentTimeMillis();
                    eventInfo.stm = SntpUtil.currentTimeMillis();
                    eventInfo.isStmSynced = SntpUtil.isTimeSynchronized();
                    eventInfo.pageInfoKey = str;
                    setDurationIfNeed(str, eventInfo);
                    reportGesture(eventInfo);
                    commitEvs(eventInfo.level, eventInfo.toJson());
                    return;
                }
            } catch (Exception e) {
                LogUtil.log("statistics", "Channel - write:" + e.getMessage());
                return;
            }
        }
        LogUtil.log("statistics", "Channel - write: eventInfo is null or eventInfo.nm is null .");
    }

    private void setDurationIfNeed(String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "025d70c6af0cdb6a0961e395106d1cb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "025d70c6af0cdb6a0961e395106d1cb4");
        } else if (eventInfo == null || eventInfo.nm != EventName.PAGE_DISAPPEAR) {
        } else {
            if (eventInfo.val_lab == null || !(eventInfo.val_lab == null || eventInfo.val_lab.containsKey("duration"))) {
                eventInfo.val_lab = recordPageDuration(str, eventInfo.val_lab);
            }
        }
    }

    private void reportGesture(EventInfo eventInfo) {
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5dca02cd66a5c087c040b1250120108", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5dca02cd66a5c087c040b1250120108");
        } else if (eventInfo.nm == EventName.QUIT || eventInfo.nm == EventName.PAGE_VIEW) {
            GestureManager.getInstance().reportGesture();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void commitEvs(EventLevel eventLevel, JSONObject jSONObject) {
        Object[] objArr = {eventLevel, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1d27acd93bedb301675eace0e10031d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1d27acd93bedb301675eace0e10031d");
        } else if (jSONObject == null) {
        } else {
            if (!"8".equals(jSONObject.optString("nt"))) {
                if (FlowManager.getInstance(this.mContext).intercept(jSONObject, 100)) {
                    handleInterceptForExposure(jSONObject);
                    return;
                } else if (HighFlowBidManager.getInstance().collectBid(jSONObject.optString("val_bid"))) {
                    return;
                }
            }
            Map<String, String> allEnvironment = getAllEnvironment();
            if (allEnvironment == null) {
                return;
            }
            try {
                String optString = jSONObject.optString("category");
                if (!TextUtils.isEmpty(optString) && doAssemble(eventLevel, allEnvironment, jSONObject)) {
                    sendMmpEventPD(optString, allEnvironment, jSONObject);
                    sendWebEventPD(optString, allEnvironment, jSONObject);
                    Queue<SearchHelper.CacheItem> queue = null;
                    String optString2 = jSONObject.optString("nm");
                    String optString3 = jSONObject.optString("nt");
                    if (optString2.equals(EventName.PAGE_VIEW.toString()) && "1".equals(optString3)) {
                        queue = SearchHelper.getInstance().getCacheEventList();
                        reportCacheEventListBeforePv(queue, jSONObject);
                    }
                    LogUtil.log("commit evs:" + jSONObject.toString() + " : mainProcess:" + ProcessUtils.isMainProcess(this.mContext) + " processName:" + ProcessUtils.getCurrentProcessName(this.mContext));
                    doReport(optString, eventLevel, allEnvironment, jSONObject);
                    if (optString2.equals(EventName.PAGE_VIEW.toString()) && "1".equals(optString3) && queue != null) {
                        reportCacheEventListAfterPv(queue, jSONObject, false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void sendMmpEventPD(String str, Map<String, String> map, JSONObject jSONObject) {
        Object[] objArr = {str, map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bff2b366efeb6c4beeda6cb435b62c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bff2b366efeb6c4beeda6cb435b62c6");
            return;
        }
        try {
            int optInt = jSONObject.optInt("nt");
            String optString = jSONObject.optString("nm");
            if (optInt == 8) {
                if (optString.equals(EventName.PAGE_VIEW.toString())) {
                    MmpNativeCommunicationStore.StorePDData storePDData = new MmpNativeCommunicationStore.StorePDData();
                    storePDData.pvTm = jSONObject.optLong("tm");
                    storePDData.appName = map.get(Constants.Environment.KEY_APPNM);
                    storePDData.category = str;
                    storePDData.msId = map.get("msid");
                    storePDData.appMsId = map.get(Constants.Environment.KEY_APP_SESSION);
                    storePDData.nt = 1;
                    storePDData.eventName = EventName.PAGE_DISAPPEAR;
                    storePDData.cid = jSONObject.optString("val_cid");
                    storePDData.refCid = jSONObject.optString("val_ref");
                    storePDData.reqId = jSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID);
                    storePDData.refReqId = jSONObject.optString(Constants.EventInfoConsts.KEY_REFER_REQ_ID);
                    storePDData.isAuto = 10;
                    MmpNativeCommunicationStore.setStorePDData(storePDData);
                    return;
                }
                return;
            }
            if (optInt != 1 && optInt != 10) {
                if (MmpNativeCommunicationStore.isSendMmpPD()) {
                    sendNativePDForMmp(map);
                    return;
                }
                return;
            }
            if (optString.equals(EventName.PAGE_DISAPPEAR.toString())) {
                sendNativePDForMmp(map);
            }
        } catch (Exception unused) {
        }
    }

    private void sendNativePDForMmp(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "241aa5a10f5ad431e08e18089975c1d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "241aa5a10f5ad431e08e18089975c1d3");
            return;
        }
        MmpNativeCommunicationStore.StorePDData storePDData = MmpNativeCommunicationStore.getStorePDData();
        if (storePDData != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("nm", EventName.PAGE_DISAPPEAR);
                if (storePDData.cid != null) {
                    jSONObject.put("val_cid", storePDData.cid);
                }
                if (storePDData.reqId != null) {
                    jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, storePDData.reqId);
                }
                if (storePDData.refCid != null) {
                    jSONObject.put("val_ref", storePDData.refCid);
                }
                if (storePDData.refReqId != null) {
                    jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, storePDData.refReqId);
                }
                if (storePDData.valLab == null) {
                    storePDData.valLab = new JSONObject();
                }
                storePDData.valLab.put("duration", String.valueOf(System.currentTimeMillis() - storePDData.pvTm));
                jSONObject.put("val_lab", storePDData.valLab);
                jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, 10);
                jSONObject.put("nt", 1);
                this.mSeq = ScidManager.getScid();
                jSONObject.put("seq", this.mSeq);
            } catch (Exception e) {
                e.printStackTrace();
            }
            doReport(storePDData.category, EventLevel.URGENT, map, jSONObject);
            MmpNativeCommunicationStore.clearStorePDData();
        }
    }

    private void sendWebEventPD(String str, Map<String, String> map, JSONObject jSONObject) {
        WebNativeCommunicationStore.StoreData storeData;
        Object[] objArr = {str, map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21bf8745bca5343a422057d36df37dce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21bf8745bca5343a422057d36df37dce");
            return;
        }
        try {
            sendWebPD(jSONObject, map, str);
            if (jSONObject.optString("nm").equals(EventName.PAGE_VIEW.toString()) && jSONObject.optInt("nt") == 1 && (storeData = WebNativeCommunicationStore.getStoreData()) != null) {
                jSONObject.put("web_refer_cid", storeData.webCid);
                jSONObject.put(Constants.Web.KEY_WEB_REFER_REQ_ID, storeData.webReqId);
                WebNativeCommunicationStore.clearStoreData();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff A[Catch: Exception -> 0x011c, TryCatch #1 {Exception -> 0x011c, blocks: (B:28:0x00f0, B:30:0x00ff, B:32:0x0109), top: B:63:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141 A[Catch: Exception -> 0x0194, TryCatch #4 {Exception -> 0x0194, blocks: (B:36:0x0120, B:40:0x0130, B:42:0x0141, B:43:0x014a, B:45:0x015b, B:47:0x0161, B:49:0x016d, B:51:0x0179, B:53:0x0185), top: B:69:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean doAssemble(com.meituan.android.common.statistics.entity.EventLevel r13, java.util.Map<java.lang.String, java.lang.String> r14, org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.channel.LocalChannel.doAssemble(com.meituan.android.common.statistics.entity.EventLevel, java.util.Map, org.json.JSONObject):boolean");
    }

    private void handleMmpMvlSeq(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b36c3643fa44aeea0379409dabe2de0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b36c3643fa44aeea0379409dabe2de0");
            return;
        }
        String optString = jSONObject.optString("nm");
        if (jSONObject.optInt("nt") != 8 || TextUtils.isEmpty(optString) || !optString.equals(EventName.MODEL_VIEW_LIST.toString()) || (optJSONObject = jSONObject.optJSONObject("val_lab")) == null || (optJSONArray = optJSONObject.optJSONArray(Constants.EventInfoConsts.KEY_MV_LIST)) == null) {
            return;
        }
        if (optJSONArray.get(0) != null && (optJSONArray.get(0) instanceof JSONObject)) {
            JSONObject jSONObject2 = (JSONObject) optJSONArray.get(0);
            jSONObject2.put("_seq", this.mSeq);
            if (!jSONObject2.has("_tm")) {
                jSONObject2.put("_tm", jSONObject.optLong("tm"));
            }
        }
        for (int i = 1; i < optJSONArray.length(); i++) {
            if (optJSONArray.get(i) != null && (optJSONArray.get(i) instanceof JSONObject)) {
                JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i);
                this.mSeq = ScidManager.getScid();
                jSONObject3.put("_seq", this.mSeq);
                if (!jSONObject3.has("_tm")) {
                    jSONObject3.put("_tm", jSONObject.optLong("tm"));
                }
            }
        }
    }

    private void dispatchEventToBlue(EventLevel eventLevel, Map<String, String> map, JSONObject jSONObject) throws JSONException {
        Object[] objArr = {eventLevel, map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "843dc6eae7a24a57593950ffb28d17e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "843dc6eae7a24a57593950ffb28d17e2");
            return;
        }
        String optString = jSONObject.optString("category");
        String optString2 = jSONObject.optString("page_info_key");
        int optInt = jSONObject.optInt("isLocal");
        jSONObject.put("pageInfoKey", optString2);
        jSONObject.put("isLocal", optInt);
        EventManager.getInstance().dispatchData(optString, eventLevel, map, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void privacyCheckUtm(Map<String, String> map) throws JSONException {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeea9afe19048cdc0873062d483782e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeea9afe19048cdc0873062d483782e0");
        } else if (map == null || TextUtils.isEmpty(map.get(Constants.Environment.KEY_UTM))) {
        } else {
            JSONObject jSONObject = new JSONObject(map.get(Constants.Environment.KEY_UTM));
            if (!TextUtils.isEmpty(jSONObject.optString("utm_source"))) {
                jSONObject.put("utm_source", ABCHelper.checkUtmChild(jSONObject.optString("utm_source")));
            }
            if (!TextUtils.isEmpty(jSONObject.optString("utm_campaign"))) {
                jSONObject.put("utm_campaign", ABCHelper.checkUtmChild(jSONObject.optString("utm_campaign")));
            }
            if (!TextUtils.isEmpty(jSONObject.optString("utm_content"))) {
                jSONObject.put("utm_content", ABCHelper.checkUtmChild(jSONObject.optString("utm_content")));
            }
            if (!TextUtils.isEmpty(jSONObject.optString("utm_medium"))) {
                jSONObject.put("utm_medium", ABCHelper.checkUtmChild(jSONObject.optString("utm_medium")));
            }
            if (!TextUtils.isEmpty(jSONObject.optString("utm_term"))) {
                jSONObject.put("utm_term", ABCHelper.checkUtmChild(jSONObject.optString("utm_term")));
            }
            if (jSONObject.length() > 0) {
                map.put(Constants.Environment.KEY_UTM, jSONObject.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void privacyCheckValLab(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e36ac31fa5c5ec57cbb72357b61e1041", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e36ac31fa5c5ec57cbb72357b61e1041");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
        if (optJSONObject != null) {
            jSONObject.put("val_lab", ABCHelper.checkJsonObject(optJSONObject, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void privacyCheckTag(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c8d8968d8b1cda7f6eabb8037b2667a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c8d8968d8b1cda7f6eabb8037b2667a");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("tag");
        if (optJSONObject != null) {
            jSONObject.put("tag", ABCHelper.checkJsonObject(optJSONObject, 4));
        }
    }

    private void doReport(final String str, final EventLevel eventLevel, final Map<String, String> map, final JSONObject jSONObject) {
        Object[] objArr = {str, eventLevel, map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88cfbb90798cf02fb709076c7b5d3860", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88cfbb90798cf02fb709076c7b5d3860");
        } else if (jSONObject == null || FlowManager.getInstance(this.mContext).intercept(jSONObject, 101)) {
        } else {
            InnerDataManager.processDataOnStore(this.mContext, jSONObject);
            try {
                dispatchEventToBlue(eventLevel, map, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            StatisticsHandler.getInstance().commitReport(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.15
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "51841072264345999fb7806d7bbed8ef", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "51841072264345999fb7806d7bbed8ef");
                        return;
                    }
                    try {
                        LocalChannel.this.privacyCheckUtm(map);
                        LocalChannel.this.privacyCheckValLab(jSONObject);
                        LocalChannel.this.privacyCheckTag(jSONObject);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    String str2 = jSONObject.has("category") ? (String) jSONObject.remove("category") : "";
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str;
                    }
                    if (jSONObject.has("page_info_key")) {
                        jSONObject.remove("page_info_key");
                    }
                    if (jSONObject.has("pageInfoKey")) {
                        jSONObject.remove("pageInfoKey");
                    }
                    if ((jSONObject.has("isLocal") ? ((Integer) jSONObject.remove("isLocal")).intValue() : 0) == 0) {
                        try {
                            if (QuickReportConfigManager.getInstance(LocalChannel.this.mContext).shouldQuickReport(jSONObject, map, str2)) {
                                JSONObject mapToJSONObject = JsonUtil.mapToJSONObject(map);
                                if (mapToJSONObject == null) {
                                    return;
                                }
                                mapToJSONObject.put("category", str2);
                                mapToJSONObject.put("evs", jSONObject);
                                LocalChannel.this.quickReportPack(mapToJSONObject);
                            }
                        } catch (Throwable unused) {
                        }
                        try {
                            ImmediateReportManager.getInstance().immediateReport(LocalChannel.this.mContext, jSONObject, map, str2);
                        } catch (Exception unused2) {
                        }
                        try {
                            if (jSONObject.length() == 0) {
                                LogUtil.log("statistics", "Channel - commitEvs: eventObj is empty.");
                                return;
                            }
                            JSONObject mapToJSONObject2 = JsonUtil.mapToJSONObject(map);
                            if (mapToJSONObject2.length() == 0) {
                                LogUtil.log("statistics", "Channel - commitEvs: environment is empty.");
                                return;
                            }
                            ICacheHandler.Event event = new ICacheHandler.Event(str2, mapToJSONObject2, jSONObject, eventLevel == null ? 3 : eventLevel.getValue(), System.currentTimeMillis(), 0);
                            LogUtil.log("statistics", "Channel - writeDb evs=" + event.toString());
                            LocalChannel.this.mChannelManager.getCacheHandler().writeEvent(event);
                            String jSONObject2 = jSONObject.toString();
                            if (!ConfigManager.getInstance(LocalChannel.this.mContext).isLoganBlack(mapToJSONObject2.optString(Constants.Environment.KEY_APPNM), str2)) {
                                com.dianping.networklog.c.a(jSONObject2, 8);
                            }
                            if (DebugUtils.isInDebugMode(LocalChannel.this.mContext)) {
                                DebugUtils.doLxReportEventCheck(1, str2, jSONObject2, mapToJSONObject2.toString());
                            }
                            LocalChannel.this.report(eventLevel);
                            if (MockApiAgent.get().isEnable()) {
                                JSONObject jSONObject3 = new JSONObject(LocalChannel.this.getEnvironment());
                                jSONObject3.put("category", str2);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(jSONObject);
                                jSONObject3.put("evs", jSONArray);
                                MockApiAgent.get().mock(jSONObject3);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    private void reportCacheEventListBeforePv(Queue<SearchHelper.CacheItem> queue, JSONObject jSONObject) {
        Object[] objArr = {queue, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4728d18ed73bae1e4b21745498d122a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4728d18ed73bae1e4b21745498d122a");
        } else if (queue == null || queue.size() <= 0) {
        } else {
            Iterator<SearchHelper.CacheItem> it = queue.iterator();
            while (it.hasNext()) {
                try {
                    SearchHelper.CacheItem next = it.next();
                    CidQuality.updateItemSearchResult(next, jSONObject);
                    if (next != null && next.eventInfo != null && !next.compare(jSONObject)) {
                        PageInfoManager pageInfoManager = PageInfoManager.getInstance();
                        PageInfo previousPageInfo = pageInfoManager.getPreviousPageInfo();
                        if (previousPageInfo == null) {
                            previousPageInfo = pageInfoManager.getCurrentPageInfo();
                        }
                        setPageIdentifyByPageInfo(previousPageInfo, next.eventInfo);
                        doReport(null, next.eventLevel, next.environment, next.eventInfo);
                        if (it != null) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void reportCacheEventListAfterPv(Queue<SearchHelper.CacheItem> queue, JSONObject jSONObject, boolean z) {
        Object[] objArr = {queue, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd39bbd7646226d19bb74978f180a4bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd39bbd7646226d19bb74978f180a4bd");
        } else if (queue == null || queue.size() <= 0) {
        } else {
            while (true) {
                SearchHelper.CacheItem poll = queue.poll();
                if (poll == null) {
                    return;
                }
                if (z) {
                    CidQuality.updateItemSearchResult(poll, jSONObject);
                }
                try {
                    setPageIdentify(poll.eventLevel, poll.environment, poll.eventInfo, false);
                    doReport(null, poll.eventLevel, poll.environment, poll.eventInfo);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private void removeOverLenValLab(JSONObject jSONObject) {
        int i = 0;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94374595fdfba1f2e4d1176373b5a96d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94374595fdfba1f2e4d1176373b5a96d");
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
            if (optJSONObject != null) {
                i = optJSONObject.toString().length();
            } else {
                String optString = jSONObject.optString("val_lab");
                if (!TextUtils.isEmpty(optString)) {
                    i = optString.length();
                }
            }
            if (i > VallabConfig.getInstance(this.mContext).getVallabLen(jSONObject.optString("val_bid"))) {
                jSONObject.remove("val_lab");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("overlen_cutoff", 1);
                jSONObject2.put("overlen_length", i);
                jSONObject.put("val_lab", jSONObject2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void sendWebPD(JSONObject jSONObject, Map<String, String> map, String str) {
        Object[] objArr = {jSONObject, map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e71ab786fe0f5bc2cc044cfb87e778c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e71ab786fe0f5bc2cc044cfb87e778c0");
            return;
        }
        int optInt = jSONObject.optInt("nt");
        String optString = jSONObject.optString("nm");
        if (optInt != 2) {
            if (optInt == 1 || optInt == 10) {
                if (optString.equals(EventName.PAGE_DISAPPEAR.toString())) {
                    sendNativePD(map);
                    return;
                }
                return;
            } else if (WebNativeCommunicationStore.isSendWebPD()) {
                sendNativePD(map);
                return;
            } else {
                return;
            }
        }
        if (optString.equals(EventName.PAGE_VIEW.toString()) && jSONObject.optBoolean(Constants.JSNative.NEED_CACHE_PD, false)) {
            WebNativeCommunicationStore.StorePDData storePDData = new WebNativeCommunicationStore.StorePDData();
            storePDData.pvTm = jSONObject.optLong("tm");
            storePDData.pvCid = jSONObject.optString("val_cid");
            storePDData.pvReqId = jSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID);
            storePDData.pvRefCid = jSONObject.optString("val_ref");
            storePDData.pvRefReqId = jSONObject.optString(Constants.EventInfoConsts.KEY_REFER_REQ_ID);
            storePDData.webCid = jSONObject.optString(Constants.Web.KEY_WEB_CID);
            storePDData.webReqId = jSONObject.optString(Constants.Web.KEY_WEB_REQ_ID);
            storePDData.webRefCid = jSONObject.optString("web_refer_cid");
            storePDData.webRefReqId = jSONObject.optString(Constants.Web.KEY_WEB_REFER_REQ_ID);
            storePDData.pvCategory = str;
            storePDData.pvMsid = map.get("msid");
            storePDData.pvAppMsid = map.get(Constants.Environment.KEY_APP_SESSION);
            storePDData.pvVallab = jSONObject.optJSONObject("val_lab");
            if (storePDData.pvVallab != null && storePDData.pvVallab.has("custom")) {
                storePDData.pvCustom = storePDData.pvVallab.optJSONObject("custom");
            }
            storePDData.pvTag = jSONObject.optJSONObject("tag");
            WebNativeCommunicationStore.setStorePDData(storePDData);
        }
        if (jSONObject.has(Constants.JSNative.NEED_CACHE_PD)) {
            jSONObject.remove(Constants.JSNative.NEED_CACHE_PD);
        }
    }

    private void sendNativePD(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a5253b0e576d8804cd19e66bd37ccf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a5253b0e576d8804cd19e66bd37ccf4");
            return;
        }
        WebNativeCommunicationStore.StorePDData storePDData = WebNativeCommunicationStore.getStorePDData();
        if (storePDData != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("nm", EventName.PAGE_DISAPPEAR);
                if (storePDData.pvCid != null) {
                    jSONObject.put("val_cid", storePDData.pvCid);
                }
                if (storePDData.pvReqId != null) {
                    jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, storePDData.pvReqId);
                }
                if (storePDData.pvRefCid != null) {
                    jSONObject.put("val_ref", storePDData.pvRefCid);
                }
                if (storePDData.pvRefReqId != null) {
                    jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, storePDData.pvRefReqId);
                }
                if (storePDData.webCid != null) {
                    jSONObject.put(Constants.Web.KEY_WEB_CID, storePDData.webCid);
                }
                if (storePDData.webRefCid != null) {
                    jSONObject.put("web_refer_cid", storePDData.webRefCid);
                }
                if (storePDData.webReqId != null) {
                    jSONObject.put(Constants.Web.KEY_WEB_REQ_ID, storePDData.webReqId);
                }
                if (storePDData.webRefReqId != null) {
                    jSONObject.put(Constants.Web.KEY_WEB_REFER_REQ_ID, storePDData.webRefReqId);
                }
                if (storePDData.pvVallab == null) {
                    storePDData.pvVallab = new JSONObject();
                }
                storePDData.pvVallab.put("duration", String.valueOf(System.currentTimeMillis() - storePDData.pvTm));
                if (storePDData.pvTag != null) {
                    jSONObject.put("tag", storePDData.pvTag);
                }
                if (storePDData.pvCid != null && storePDData.pvCustom != null) {
                    storePDData.pvCustom.put(Constants.Web.KEY_WEB_CID, storePDData.pvCid);
                }
                jSONObject.put("val_lab", storePDData.pvVallab);
                jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, 10);
                jSONObject.put("nt", 2);
                jSONObject.put("tm", System.currentTimeMillis());
                jSONObject.put("stm", SntpUtil.currentTimeMillis());
                this.mSeq = ScidManager.getScid();
                jSONObject.put("seq", this.mSeq);
            } catch (Exception e) {
                e.printStackTrace();
            }
            doReport(storePDData.pvCategory, EventLevel.URGENT, map, jSONObject);
            WebNativeCommunicationStore.clearStorePDData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void quickReportPack(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff92a5795e223ec884f00c1404563b31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff92a5795e223ec884f00c1404563b31");
        } else {
            quickThread.execute(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.16
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85ed8ead385aba25cc2d87cc7cc25f7b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85ed8ead385aba25cc2d87cc7cc25f7b");
                        return;
                    }
                    try {
                        final JSONObject quickReportEvent = QuickReportBean.getQuickReportEvent(jSONObject);
                        ABCHelper.process(quickReportEvent);
                        ABCHelper.processLatLngQuickReport(quickReportEvent);
                        LocalChannel.quickNetThread.execute(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.16.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2ec2708daadff3d7e1a07a517f6d1c74", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2ec2708daadff3d7e1a07a517f6d1c74");
                                    return;
                                }
                                try {
                                    AbsExtraParameter extraParameter = Statistics.getExtraParameter();
                                    String hReportUrl = extraParameter != null ? extraParameter.getHReportUrl() : "";
                                    String optString = quickReportEvent.optString(Constants.Environment.KEY_LX_DICT);
                                    if (!TextUtils.isEmpty(hReportUrl)) {
                                        if ("true".equals(optString)) {
                                            NetworkController.quickReport(hReportUrl, ABCHelper.encHReport(quickReportEvent));
                                        } else {
                                            NetworkController.quickReport(hReportUrl, quickReportEvent.toString());
                                        }
                                    } else if ("true".equals(optString)) {
                                        NetworkController.quickReport(Constants.HIGH_REPORT_URL, ABCHelper.encHReport(quickReportEvent));
                                    } else {
                                        NetworkController.quickReport(Constants.HIGH_REPORT_URL, quickReportEvent.toString());
                                    }
                                } catch (Exception e) {
                                    LogUtil.log("statistics", "Reporter - quickReport: " + e.getMessage());
                                }
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void report(EventLevel eventLevel) {
        Object[] objArr = {eventLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de011d99f3110a7288e5209410f1157d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de011d99f3110a7288e5209410f1157d");
            return;
        }
        switch (eventLevel) {
            case IMMEDIATE:
                this.mChannelManager.getReporter().immediateReport(eventLevel.getValue());
                return;
            case ALL:
                this.mChannelManager.getReporter().normalReport(eventLevel.getValue());
                return;
            default:
                return;
        }
    }

    private boolean setPageIdentify(EventLevel eventLevel, Map<String, String> map, JSONObject jSONObject, boolean z) {
        PageInfo pageInfo;
        Object[] objArr = {eventLevel, map, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "396b99b9f6c69ae2bd7f7169ce4bbfc7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "396b99b9f6c69ae2bd7f7169ce4bbfc7")).booleanValue();
        }
        PageInfoManager pageInfoManager = PageInfoManager.getInstance();
        if (jSONObject == null) {
            return true;
        }
        String optString = jSONObject.optString("nt");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        if (optString.equals("1") || optString.equals("10")) {
            String optString2 = jSONObject.optString("page_info_key");
            String optString3 = jSONObject.optString("val_cid");
            String optString4 = jSONObject.optString("nm");
            SearchIndexKey searchIndexKey = null;
            if (TextUtils.isEmpty(optString2)) {
                if (!TextUtils.isEmpty(optString3) && z && EventName.isModuleEvent(optString4)) {
                    searchIndexKey = new SearchIndexKey(jSONObject);
                    pageInfo = pageInfoManager.getPageInfo(this.mContext, searchIndexKey);
                    if (pageInfo == null) {
                        SearchHelper.getInstance().cacheEventInfo(this.mContext, new SearchHelper.CacheItem(eventLevel, jSONObject, map));
                        return false;
                    }
                } else {
                    pageInfo = null;
                }
            } else {
                pageInfo = pageInfoManager.getPageInfo(optString2);
                if (z && pageInfo == null && EventName.isModuleEvent(optString4)) {
                    SearchHelper.getInstance().cacheEventInfo(this.mContext, new SearchHelper.CacheItem(eventLevel, jSONObject, map));
                    return false;
                }
            }
            try {
                if (pageInfo == null) {
                    PageInfo currentPageInfo = pageInfoManager.getCurrentPageInfo();
                    try {
                        if (EventName.isModuleEvent(optString4) && z) {
                            jSONObject.put(Constants.EventInfoConsts.KEY_CID_QUALITY, jSONObject.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 512);
                        }
                        pageInfo = currentPageInfo;
                    } catch (JSONException e) {
                        e = e;
                        pageInfo = currentPageInfo;
                        e.printStackTrace();
                        setPageIdentifyByPageInfo(pageInfo, jSONObject);
                        return true;
                    }
                } else if (EventName.isModuleEvent(optString4) && z) {
                    if (!TextUtils.isEmpty(optString2)) {
                        jSONObject.put(Constants.EventInfoConsts.KEY_CID_QUALITY, jSONObject.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 8);
                    } else if (searchIndexKey != null) {
                        if (searchIndexKey.matchResult == 1) {
                            jSONObject.put(Constants.EventInfoConsts.KEY_CID_QUALITY, jSONObject.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 16);
                        } else {
                            jSONObject.put(Constants.EventInfoConsts.KEY_CID_QUALITY, jSONObject.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 32);
                        }
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
            setPageIdentifyByPageInfo(pageInfo, jSONObject);
            return true;
        }
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:56:0x0058). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bf -> B:59:0x00c2). Please submit an issue!!! */
    private boolean setPageIdentifyByPageInfo(PageInfo pageInfo, JSONObject jSONObject) {
        Object[] objArr = {pageInfo, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "518683c21668b8161f35bdfec982b525", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "518683c21668b8161f35bdfec982b525")).booleanValue();
        }
        if (pageInfo == null || jSONObject == null) {
            return true;
        }
        if (TextUtils.isEmpty(jSONObject.optString("val_cid"))) {
            try {
                if (!TextUtils.isEmpty(pageInfo.getCid())) {
                    jSONObject.put("val_cid", pageInfo.getCid());
                } else {
                    jSONObject.remove("val_cid");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            String optString = jSONObject.optString("val_ref");
            if (TextUtils.isEmpty(optString)) {
                if (!TextUtils.isEmpty(pageInfo.getRef())) {
                    jSONObject.put("val_ref", pageInfo.getRef());
                } else {
                    jSONObject.remove("val_ref");
                }
            } else if (Constants.UNDEFINED.equals(optString)) {
                jSONObject.remove("val_ref");
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (TextUtils.isEmpty(jSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID))) {
            try {
                if (!TextUtils.isEmpty(pageInfo.getRequestId())) {
                    jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, pageInfo.getRequestId());
                } else {
                    jSONObject.remove(Constants.EventInfoConsts.KEY_REQ_ID);
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        try {
            String optString2 = jSONObject.optString(Constants.EventInfoConsts.KEY_REFER_REQ_ID);
            if (TextUtils.isEmpty(optString2)) {
                if (!TextUtils.isEmpty(pageInfo.getRequestRefId())) {
                    jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, pageInfo.getRequestRefId());
                } else {
                    jSONObject.remove(Constants.EventInfoConsts.KEY_REFER_REQ_ID);
                }
            } else if (Constants.UNDEFINED.equals(optString2)) {
                jSONObject.remove(Constants.EventInfoConsts.KEY_REFER_REQ_ID);
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        if (EventName.MODEL_VIEW.equals(jSONObject.optString("nm"))) {
            ExposureInfoCache.getInstance().updateExposureInfo(jSONObject.optString("mreq_id"), jSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID, ""), SessionManager.getSession(), SessionManager.getAppSession(), jSONObject.optString("val_cid", ""));
            ExposureInfoCache.getInstance().removeSoftRefExposureInfo(jSONObject.optString("mreq_id"));
            ExposureStatisticsManager.getInstance().updateExposureInfo(jSONObject.optString("mreq_id"), jSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID, ""), SessionManager.getSession(), SessionManager.getAppSession(), jSONObject.optString("val_cid", ""));
            String str = TAG;
            LogUtil.log(str, "LocalChannel set req_id for exposure: " + jSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID, ""));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPageViewTime(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0cb4608bfe4720c6fe1a24ea106543f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0cb4608bfe4720c6fe1a24ea106543f");
        } else if (str == null) {
        } else {
            synchronized (this) {
                mPageDurationMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> recordPageDuration(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01ecd2093a6adfed267a1d6e74c44866", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01ecd2093a6adfed267a1d6e74c44866");
        }
        if (str == null) {
            return map;
        }
        synchronized (this) {
            if (mPageDurationMap.containsKey(str)) {
                Long l = mPageDurationMap.get(str);
                if (l == null) {
                    return map;
                }
                String valueOf = String.valueOf(SystemClock.elapsedRealtime() - l.longValue());
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", valueOf);
                mPageDurationMap.remove(str);
            }
            return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPkgAndClassName(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59fef10d005f8c2a045c5488ab54c38d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59fef10d005f8c2a045c5488ab54c38d");
        } else if (str == null || map == null) {
        } else {
            try {
                if (map.containsKey("custom")) {
                    Object obj = map.get("custom");
                    if (obj instanceof JSONObject) {
                        ((JSONObject) obj).put("_phpage", str);
                        return;
                    } else if (obj instanceof Map) {
                        ((Map) obj).put("_phpage", str);
                        return;
                    } else {
                        return;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("_phpage", str);
                map.put("custom", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleInterceptForExposure(JSONObject jSONObject) {
        ExposureInfo exposureInfo;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34227556042bf7bdf075c4caacfae02d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34227556042bf7bdf075c4caacfae02d");
        } else if (jSONObject == null || !jSONObject.has("mreq_id")) {
        } else {
            String optString = jSONObject.optString("mreq_id");
            if (TextUtils.isEmpty(optString) || (exposureInfo = ExposureInfoCache.getInstance().getExposureInfo(optString)) == null) {
                return;
            }
            exposureInfo.setValid(false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IMMPInterface
    public void writeEventThroughMMP(final JSONObject jSONObject, final JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f456c0e7cec9d086e9ecfbad9f25fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f456c0e7cec9d086e9ecfbad9f25fe");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.LocalChannel.17
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    boolean optBoolean;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "292e9583cdf2f47dc059459f9399ce2b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "292e9583cdf2f47dc059459f9399ce2b");
                    } else if (jSONObject == null) {
                    } else {
                        try {
                            LogUtil.log("mmpToNative", "setEvs() item=" + jSONObject.toString());
                            if (jSONObject.optLong("tm") <= 0) {
                                jSONObject.put("tm", System.currentTimeMillis());
                            }
                            if (jSONObject.optLong("stm") <= 0) {
                                jSONObject.put("stm", SntpUtil.currentTimeMillis());
                            }
                            Object obj = jSONObject.get(Constants.EventInfoConsts.KEY_IS_AUTO);
                            if (obj != null && !TextUtils.isEmpty(obj.toString())) {
                                jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, obj);
                            } else {
                                jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, 7);
                            }
                            if (EventName.CLICK.toString().equals(jSONObject.optString("nm")) && (optBoolean = jSONObject.optBoolean("_sf"))) {
                                jSONObject.remove("_sf");
                                jSONObject.put(Constants.EventInfoConsts.KEY_SF, optBoolean);
                            }
                            if (LocalChannel.this.isJsonEmpty(jSONObject, "val_ref") && LocalChannel.this.isJsonEmpty(jSONObject, Constants.EventInfoConsts.KEY_REFER_REQ_ID)) {
                                jSONObject.put("val_ref", Statistics.getPageName(null));
                                jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, Statistics.getRequestId(null));
                            }
                            if (jSONObject2 != null) {
                                LogUtil.log("mmpToNative", "setEvs() options=" + jSONObject2.toString());
                                jSONObject.put(Constants.JSNative.IS_QUICK_REPORT, jSONObject2.optBoolean(Constants.JSNative.IS_QUICK_REPORT, false));
                                int optInt = jSONObject2.optInt("nt");
                                if (optInt > 0) {
                                    jSONObject.put("nt", optInt);
                                } else {
                                    jSONObject.put("nt", 8);
                                }
                            }
                            String optString = jSONObject.optString("category");
                            if (TextUtils.isEmpty(optString)) {
                                jSONObject.put("category", LocalChannel.this.mChannelName);
                            } else {
                                JSONObject jSONObject3 = jSONObject;
                                jSONObject3.put("category", Constants.PREFIX + optString);
                            }
                            LocalChannel.this.mergeEventExtraData(jSONObject);
                            LocalChannel.this.commitEvs(EventLevel.URGENT, jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}
