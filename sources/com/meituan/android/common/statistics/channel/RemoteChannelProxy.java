package com.meituan.android.common.statistics.channel;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.Gson;
import com.meituan.android.common.analyse.BuildConfig;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.ad.MidasInfo;
import com.meituan.android.common.statistics.channel.SearchHelper;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.dispatcher.EventManager;
import com.meituan.android.common.statistics.dispatcher.SpecifiedEventConfig;
import com.meituan.android.common.statistics.entity.BusinessInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.exposure.ExposureInfo;
import com.meituan.android.common.statistics.exposure.ExposureInfoRemote;
import com.meituan.android.common.statistics.exposure.RecycledRefPool;
import com.meituan.android.common.statistics.ipc.DataRequest;
import com.meituan.android.common.statistics.ipc.DataResponse;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.RequestManager;
import com.meituan.android.common.statistics.session.SessionManager;
import com.meituan.android.common.statistics.tag.TagManager;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RemoteChannelProxy extends AbstractChannel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mChannelName;
    private Context mContext;
    private String mOriginalChannelName;

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void reportCacheEventListAfterPv(Queue<SearchHelper.CacheItem> queue, JSONObject jSONObject, boolean z) {
    }

    public RemoteChannelProxy(String str, ChannelManager channelManager, Context context) {
        Object[] objArr = {str, channelManager, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e0cfb179eefcf8ce87c16bcb8436ab6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e0cfb179eefcf8ce87c16bcb8436ab6");
            return;
        }
        this.mContext = null;
        this.mContext = context;
        this.mOriginalChannelName = str;
        if (!TextUtils.isEmpty(str) && str.startsWith(Constants.PREFIX)) {
            this.mChannelName = str.substring(9);
        } else {
            this.mChannelName = str;
        }
        RecycledRefPool.getInstance().addCallback(new RecycledRefPool.RecycledRefCallback() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.statistics.exposure.RecycledRefPool.RecycledRefCallback
            public void refRecycled(WeakReference weakReference, String str2) {
                Object[] objArr2 = {weakReference, str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2dfe49cb611c9a9b0d643476cad4353f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2dfe49cb611c9a9b0d643476cad4353f");
                } else if (TextUtils.isEmpty(str2)) {
                } else {
                    ExposureInfoRemote.commit(str2);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public String getChannelName() {
        return this.mChannelName;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateEnvironment(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dad8e30a5eb8db7da5f77897d473324", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dad8e30a5eb8db7da5f77897d473324")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.log("statistics", "Channel - updateEnvironment: parameters property can not be empty.");
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            LogUtil.log("statistics", "Channel - updateEnvironment: parameters value can not be empty.");
            return false;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, str2);
            } catch (Throwable unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("category", this.mChannelName);
                jSONObject2.put("OpType", 10004);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("updateEnvironment").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7d97194f2d4309ea0ffa3f7133b9a00d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7d97194f2d4309ea0ffa3f7133b9a00d");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
            return true;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateEnvironment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4940b2d5c67073b4c1deb78a8b88c3e3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4940b2d5c67073b4c1deb78a8b88c3e3")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.log("statistics", "Channel - updateEnvironment: parameters can not be empty");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("OpType", 10004);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("updateEnvironment").parameter(str).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2b37286cf641c6d169dba41c75528c34", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2b37286cf641c6d169dba41c75528c34");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
        return true;
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public String getEnvironment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32b12798f4875cacbe1116affb11f1c7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32b12798f4875cacbe1116affb11f1c7");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("property", str);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("category", this.mChannelName);
            jSONObject2.put("OpType", 10005);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("getEnvironment").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5eb458c1878b425b4b217c7d9fd2bfcc", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5eb458c1878b425b4b217c7d9fd2bfcc");
                    }
                    DataResponse request = RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(5L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused3) {
            return null;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public String getEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "348899e12bae97f58fc826740511aef3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "348899e12bae97f58fc826740511aef3");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("OpType", 10005);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getEnvironment").parameter(null).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5731fe85f873c93cb69a7b87cb09740c", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5731fe85f873c93cb69a7b87cb09740c");
                    }
                    DataResponse request = RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(5L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public Map<String, String> getAllEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "019330918b564dcdba335b65174a6ecc", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "019330918b564dcdba335b65174a6ecc");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("OpType", 10006);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getAllEnvironment").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<Map>() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public Map call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6b018c0161865dfab98424525e86ccad", 6917529027641081856L)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6b018c0161865dfab98424525e86ccad");
                    }
                    DataResponse request = RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    if (request == null || request.getResult() == null) {
                        return null;
                    }
                    try {
                        return JsonUtil.toMap(new JSONObject((String) request.getResult()));
                    } catch (Exception unused2) {
                        return null;
                    }
                }
            });
            if (submitOnThread != null) {
                return (Map) submitOnThread.get(5L, TimeUnit.SECONDS);
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean createTagContainer(final Object obj, final Activity activity) {
        Object[] objArr = {obj, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b14d2700229054be5cd4c1616931bf88", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b14d2700229054be5cd4c1616931bf88")).booleanValue();
        }
        StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "da2c2e7325d40240521ab8b9f4bd062e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "da2c2e7325d40240521ab8b9f4bd062e");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cf8f7c65ab32a65684b02fd5a17146c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cf8f7c65ab32a65684b02fd5a17146c")).booleanValue() : updateTag(null, str, map);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean updateTag(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60e6b5b17bc725af39c320783b6bea47", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60e6b5b17bc725af39c320783b6bea47")).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tagContainerId", str);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str2, JsonUtil.mapToJSONString(map));
            jSONObject.put("tag", jSONObject2);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("category", this.mChannelName);
            jSONObject3.put("OpType", 10000);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("updateTag").parameter(jSONObject.toString()).options(jSONObject3.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "93a78948aee0f308f83ae26fb68e738a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "93a78948aee0f308f83ae26fb68e738a");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
        return true;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void registerTag(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59630a0332a692a648f99b5f8fc06e26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59630a0332a692a648f99b5f8fc06e26");
        } else if (strArr == null || strArr.length == 0) {
            LogUtil.log("statistics", "Channel - registerTag: parameters can not be empty.");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("tags", new JSONArray(strArr));
            } catch (Throwable unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("category", this.mChannelName);
                jSONObject2.put("OpType", 10001);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("registerTag").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e864eef6243a1c88b3a71214717594c5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e864eef6243a1c88b3a71214717594c5");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean removeTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9963d95d0e44534a419e2711777c5705", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9963d95d0e44534a419e2711777c5705")).booleanValue() : removeTag(null, str);
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public boolean removeTag(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42129aeb2e82ead0ca9dc71d14adaddf", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42129aeb2e82ead0ca9dc71d14adaddf")).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.log("statistics", "Channel - removeTag: parameters property can not be empty.");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tagContainerId", str);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("key", str2);
            } catch (Throwable unused) {
            }
            jSONObject.put("tag", jSONObject2);
        } catch (Throwable unused2) {
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("category", this.mChannelName);
            jSONObject3.put("OpType", 10003);
        } catch (JSONException unused3) {
        }
        final DataRequest build = new DataRequest.Builder().method("removeTag").parameter(jSONObject.toString()).options(jSONObject3.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.10
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a2514f1fb4cf0193286c7da60afd2a1c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a2514f1fb4cf0193286c7da60afd2a1c");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
        return true;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public Map<String, Object> getTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c07927dc7212e8ab03b8d5e4fc152afe", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c07927dc7212e8ab03b8d5e4fc152afe");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", str);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("category", this.mChannelName);
            jSONObject2.put("OpType", 10002);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("getTag").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<Map>() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.11
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public Map call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dad51bc18132097989921ffa83b9feb1", 6917529027641081856L)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dad51bc18132097989921ffa83b9feb1");
                    }
                    DataResponse request = RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    if (request == null || request.getResult() == null) {
                        return null;
                    }
                    try {
                        return JsonUtil.toMap(new JSONObject((String) request.getResult()));
                    } catch (Exception unused3) {
                        return null;
                    }
                }
            });
            if (submitOnThread != null) {
                return (Map) submitOnThread.get(1L, TimeUnit.SECONDS);
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageTrack(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea1c900ac617e39a033cf72957bead5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea1c900ac617e39a033cf72957bead5e");
        } else {
            writeEvent(EventName.MPT, null, str, str2, null, null);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageTrack(BusinessInfo businessInfo) {
        Object[] objArr = {businessInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f010302a21afa477c05cf1c0c0c1610d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f010302a21afa477c05cf1c0c0c1610d");
        } else if (businessInfo == null) {
            LogUtil.log("statistics", "Channel - writePageTrack New: businessInfo is null.");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", this.mChannelName);
                jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("writePageTrack").parameter(businessInfo.toJson() != null ? businessInfo.toJson().toString() : null).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.12
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "592496ba3e69cf5c1971365b725d66d7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "592496ba3e69cf5c1971365b725d66d7");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(EventName eventName, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {eventName, str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "821e8b62094eb4e5132e2e6640151645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "821e8b62094eb4e5132e2e6640151645");
        } else {
            writeEvent(eventName, str, str2, str3, str4, str5, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(EventName eventName, String str, String str2, String str3, String str4, String str5, boolean z) {
        Object[] objArr = {eventName, str, str2, str3, str4, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53bc9510b579b2b170e5926fcd7810d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53bc9510b579b2b170e5926fcd7810d4");
        } else if (eventName == null) {
            LogUtil.log("statistics", "Channel - writeEvent: event name can not be null.");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
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
            } catch (Throwable unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("category", this.mChannelName);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("writeEvent").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.13
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f8f48de5f1e7fed3d27c5c0f7f1f8833", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f8f48de5f1e7fed3d27c5c0f7f1f8833");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeAutoPageView(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2a9655ba2590e44be2903f1bec7d16d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2a9655ba2590e44be2903f1bec7d16d");
        } else {
            writeAutoPageView((String) null, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageView(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03e3391eb5d9843f3b5d63209f2961c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03e3391eb5d9843f3b5d63209f2961c7");
        } else {
            writeAutoPageView(str, map, EventLevel.URGENT);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeAutoPageView(Map<String, Object> map, EventLevel eventLevel) {
        Object[] objArr = {map, eventLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac320e6b1889f3df1d04e0bc1a6e316a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac320e6b1889f3df1d04e0bc1a6e316a");
        } else {
            writeAutoPageView(null, map, eventLevel);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageView(@NonNull String str, Map<String, Object> map, EventLevel eventLevel) {
        Object[] objArr = {str, map, eventLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "154415105e604c223b67503eb4e1d0f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "154415105e604c223b67503eb4e1d0f8");
            return;
        }
        EventInfo obtainPvEvent = EventInfo.obtainPvEvent("", map);
        obtainPvEvent.isAuto = 6;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeAutoPageView").nm(EventName.PAGE_VIEW.toString()).parameter(obtainPvEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.14
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5a53a059a4794f6cca0e50f0eab73e39", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5a53a059a4794f6cca0e50f0eab73e39");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAutoPageDisappear(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8b97500d6688c6ae0755c0f2ba7a9e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8b97500d6688c6ae0755c0f2ba7a9e8");
            return;
        }
        EventInfo obtainPdEvent = EventInfo.obtainPdEvent("", map);
        obtainPdEvent.isAuto = 6;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeAutoPageDisappear").nm(EventName.PAGE_DISAPPEAR.toString()).parameter(obtainPdEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.15
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fdfd3ab97b9960ae6ea1411a3c9ca21a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fdfd3ab97b9960ae6ea1411a3c9ca21a");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageView(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72b69d068c8eb046193c8f67fc9e4789", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72b69d068c8eb046193c8f67fc9e4789");
        } else {
            writePageView(null, str, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writePageView(@NonNull String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa19ddfa6e5a8f669fc27cd1df6536ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa19ddfa6e5a8f669fc27cd1df6536ff");
            return;
        }
        EventInfo obtainPvEvent = EventInfo.obtainPvEvent(str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writePageView").nm(EventName.PAGE_VIEW.toString()).parameter(obtainPvEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.16
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0fc6f7d32180b04692301d2160ede8f1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0fc6f7d32180b04692301d2160ede8f1");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("nm", EventName.PAGE_VIEW);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(SpecifiedEventConfig.LX_SPECIFIED_GESTURE, "");
            jSONObject2.put("val_lab", jSONObject3);
        } catch (JSONException unused2) {
        }
        if (Statistics.getChannel() != null) {
            EventManager.getInstance().dispatchData(null, EventLevel.URGENT, null, jSONObject2);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageDisappear(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60c0c4e94b933e4e4bb24616bcae950c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60c0c4e94b933e4e4bb24616bcae950c");
        } else {
            writePageDisappear(null, null, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writePageDisappear(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a36fb90b1fe9e1eebf4a21281cae6253", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a36fb90b1fe9e1eebf4a21281cae6253");
        } else {
            writePageDisappear(str, null, map);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writePageDisappear(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7967a86cf556941191be9506c002b05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7967a86cf556941191be9506c002b05");
            return;
        }
        EventInfo obtainPdEvent = EventInfo.obtainPdEvent(str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writePageDisappear").nm(EventName.PAGE_DISAPPEAR.toString()).parameter(obtainPdEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.17
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d0d6f62fbc8861a964a961d348991dd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d0d6f62fbc8861a964a961d348991dd");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelView(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "532b8bf9a9b6c13cb6dcc1060f5a103e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "532b8bf9a9b6c13cb6dcc1060f5a103e");
        } else {
            writeModelView((String) null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16165704c835c78844aede706801de08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16165704c835c78844aede706801de08");
        } else {
            writeModelView(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelView(String str, Map<String, Object> map, int i) {
        Object[] objArr = {str, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66a98ab8b5a1fa0d944d38eda83f2ddf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66a98ab8b5a1fa0d944d38eda83f2ddf");
        } else {
            writeModelView((String) null, str, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "614707c8d09c2de2f7d3b666eb6218b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "614707c8d09c2de2f7d3b666eb6218b1");
        } else {
            writeModelView(str, str2, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelView(String str, Map<String, Object> map, String str2, int i) {
        Object[] objArr = {str, map, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9165172948a118e42dc3c63dfd502144", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9165172948a118e42dc3c63dfd502144");
        } else {
            writeModelView((String) null, str, map, str2, i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelView(String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5601f4f132de8b041f776b12f6d9d69f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5601f4f132de8b041f776b12f6d9d69f");
        } else {
            writeModelView(str, str2, (Map<String, Object>) JsonUtil.convertToHashMapAndPut(map, "index", String.valueOf(i)), str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelView(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e28f49d35c51650136a0c5319c60006", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e28f49d35c51650136a0c5319c60006");
        } else {
            writeModelView((String) null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e56e78c149e411cdf3247a0fe00f5cb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e56e78c149e411cdf3247a0fe00f5cb7");
        } else {
            writeModelView(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c4d41a5de30377cace5b9c2aaa4d666", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c4d41a5de30377cace5b9c2aaa4d666");
            return;
        }
        EventInfo obtainMvEvent = EventInfo.obtainMvEvent(str3, str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("withPageInfo", z);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeModelView").nm(EventName.MODEL_VIEW.toString()).parameter(obtainMvEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.18
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e0be3867f1e251778f633fc59f9b44d7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e0be3867f1e251778f633fc59f9b44d7");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModeViewMergable(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0be0cc0f962cd8eb62ebaad19e18c92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0be0cc0f962cd8eb62ebaad19e18c92");
            return;
        }
        EventInfo obtainMvlEvent = EventInfo.obtainMvlEvent(str3, str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeModeViewMergable").nm(EventName.MODEL_VIEW_LIST.toString()).parameter(obtainMvlEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.19
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7241b23e9c1d663ef4adb96fb68b8684", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7241b23e9c1d663ef4adb96fb68b8684");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public ExposureInfo writeModelExposure(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14c49fbd651aa9402ea2b84a085a25d5", 6917529027641081856L)) {
            return (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14c49fbd651aa9402ea2b84a085a25d5");
        }
        String uuid = UUID.randomUUID().toString();
        Random random = new Random();
        return writeModelExposure(str, str2, map, str3, uuid + System.currentTimeMillis() + random.nextInt(1000));
    }

    public ExposureInfo writeModelExposure(String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e216022921f358d4b1bf5b08f427dbf", 6917529027641081856L)) {
            return (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e216022921f358d4b1bf5b08f427dbf");
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        ExposureInfo exposureInfo = new ExposureInfo(str, BuildConfig.LX_VERSION_NAME, this.mOriginalChannelName, "", "", "", str2, str3, map, 1, str4, SystemClock.elapsedRealtime(), EventName.MODEL_VIEW);
        if (ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn()) {
            JSONObject jSONObject = new JSONObject();
            try {
                EventInfo obtainMvEvent = EventInfo.obtainMvEvent(str3, str2, map);
                obtainMvEvent.category = this.mOriginalChannelName;
                jSONObject.put("mreq_id", str4);
                jSONObject.put("evs", obtainMvEvent.toJson().toString());
                jSONObject.put("etype", "0");
            } catch (Throwable unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("category", this.mChannelName);
                jSONObject2.put("pageInfoKey", str);
                jSONObject2.put("OpType", 10011);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("writeModelExposure").nm(EventName.MODEL_DISAPPEAR.toString()).parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.20
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d2052fa99a3430cf51512adadaa226f1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d2052fa99a3430cf51512adadaa226f1");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
            RecycledRefPool.getInstance().join(exposureInfo, str4);
        } else {
            writeModelView(str, str2, map, str3);
        }
        return exposureInfo;
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public ExposureInfo writeModelExposureForMrnSDk(String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d35c934fe168fe318c92775b3b7167a", 6917529027641081856L)) {
            return (ExposureInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d35c934fe168fe318c92775b3b7167a");
        }
        ExposureInfo exposureInfo = new ExposureInfo(str, BuildConfig.LX_VERSION_NAME, this.mChannelName, SessionManager.getMSID(this.mContext), SessionManager.getAppMSID(this.mContext), "", str2, str3, map, 10, str4, SystemClock.elapsedRealtime(), EventName.MODEL_VIEW);
        JSONObject jSONObject = new JSONObject();
        try {
            EventInfo obtainMvEvent = EventInfo.obtainMvEvent(str3, str2, map);
            jSONObject.put("mreqid", str4);
            jSONObject.put("evs", obtainMvEvent.toJson().toString());
            jSONObject.put("etype", "1");
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("category", this.mChannelName);
            jSONObject2.put("pageInfoKey", str);
            jSONObject2.put("OpType", 10011);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeModelExposureForMrnSDk").nm(EventName.MODEL_VIEW.toString()).parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.21
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6036646493865c27b955ee32412c1d27", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6036646493865c27b955ee32412c1d27");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
        return exposureInfo;
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelEdit(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ee2cfab493c0526c2652c4a24bc7040", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ee2cfab493c0526c2652c4a24bc7040");
        } else {
            writeModelEdit(null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "614b8415cf5f3702e1e25314033dd641", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "614b8415cf5f3702e1e25314033dd641");
        } else {
            writeModelEdit(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelEdit(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31923a812ce0f8816df69b067ae84bd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31923a812ce0f8816df69b067ae84bd9");
        } else {
            writeModelEdit(null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dd4bb7b79ee9b5a92415022c424a364", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dd4bb7b79ee9b5a92415022c424a364");
        } else {
            writeModelEdit(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e5ea5669ef6ff125ea5db42548d7aee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e5ea5669ef6ff125ea5db42548d7aee");
            return;
        }
        EventInfo obtainMeEvent = EventInfo.obtainMeEvent(str3, str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("withPageInfo", z);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeModelEdit").nm(EventName.EDIT.toString()).parameter(obtainMeEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.22
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9dd257a9347a3e38728924a5fad7ebca", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9dd257a9347a3e38728924a5fad7ebca");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map, int i) {
        Object[] objArr = {str, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0a3899c4cd4de77f5204b9b1992ed38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0a3899c4cd4de77f5204b9b1992ed38");
        } else {
            writeModelClick((String) null, str, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e7cbd9c13896614a6f8c0679f4f206e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e7cbd9c13896614a6f8c0679f4f206e");
        } else {
            writeModelClick(str, str2, map, "", i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map, String str2, int i) {
        Object[] objArr = {str, map, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c95bed8fe872ef546a45ce84913ef17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c95bed8fe872ef546a45ce84913ef17");
        } else {
            writeModelClick((String) null, str, map, str2, i);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, int i) {
        Object[] objArr = {str, str2, map, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1ed24058f6ea07a90ac4489355492be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1ed24058f6ea07a90ac4489355492be");
        } else {
            writeModelClick(str, str2, JsonUtil.convertToHashMapAndPut(map, "index", String.valueOf(i)), str3);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d30ef48c80ecaa44b66c00a1975c1ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d30ef48c80ecaa44b66c00a1975c1ad");
        } else {
            writeModelClick((String) null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0c76ec7835eaa1e0c43e50e1d48078e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0c76ec7835eaa1e0c43e50e1d48078e");
        } else {
            writeModelClick(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeModelClick(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "229f8e965b8bcdc507274870ed05da2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "229f8e965b8bcdc507274870ed05da2c");
        } else {
            writeModelClick((String) null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c934eb0939589f8aab1104f3708ef50f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c934eb0939589f8aab1104f3708ef50f");
        } else {
            writeModelClick(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba01cd6f53eac2c0e5c7ddc1f08408de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba01cd6f53eac2c0e5c7ddc1f08408de");
        } else {
            writeModelClick(str, str2, map, str3, z, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z, boolean z2) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c62b15791a2cfeaf81c4a2d09a21509", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c62b15791a2cfeaf81c4a2d09a21509");
            return;
        }
        EventInfo obtainMcEvent = EventInfo.obtainMcEvent(str3, str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("withPageInfo", z);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeModelClick").nm(EventName.CLICK.toString()).parameter(obtainMcEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.23
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "986b9c8caf94330d3b05e038e7748ec4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "986b9c8caf94330d3b05e038e7748ec4");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeBizOrder(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4c6ee5cabf56c6a147c9bd17446e437", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4c6ee5cabf56c6a147c9bd17446e437");
        } else {
            writeBizOrder(null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b96177f0893f2b96b5da53f813d68866", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b96177f0893f2b96b5da53f813d68866");
        } else {
            writeBizOrder(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeBizOrder(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "694721ebe62295954f1e3e4e60117b95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "694721ebe62295954f1e3e4e60117b95");
        } else {
            writeBizOrder(null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b962ff2839fbb4761500a1ef738251eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b962ff2839fbb4761500a1ef738251eb");
        } else {
            writeBizOrder(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b9b2355fbd72e1f4c7dff0c08e6aee9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b9b2355fbd72e1f4c7dff0c08e6aee9");
            return;
        }
        EventInfo obtainBOEvent = EventInfo.obtainBOEvent(str3, str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("withPageInfo", z);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeBizOrder").nm(EventName.ORDER.toString()).parameter(obtainBOEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.24
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8671f314022bc99e010087b94db5ab5e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8671f314022bc99e010087b94db5ab5e");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeBizPay(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d335923a1a950342b7595e3d39936f42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d335923a1a950342b7595e3d39936f42");
        } else {
            writeBizPay(null, str, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb6033099f65ae922f84d20ecbdf1928", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb6033099f65ae922f84d20ecbdf1928");
        } else {
            writeBizPay(str, str2, map, "", false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeBizPay(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0159e9e1782bc41eeb99a9ae16e617a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0159e9e1782bc41eeb99a9ae16e617a");
        } else {
            writeBizPay(null, str, map, str2, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c89a5f210e24133575aea0ec644d0653", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c89a5f210e24133575aea0ec644d0653");
        } else {
            writeBizPay(str, str2, map, str3, false);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z) {
        Object[] objArr = {str, str2, map, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b4c393fb6984cc4dc80ef2b827bcaa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b4c393fb6984cc4dc80ef2b827bcaa7");
            return;
        }
        EventInfo obtainBPEvent = EventInfo.obtainBPEvent(str3, str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("withPageInfo", z);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeBizPay").nm(EventName.PAY.toString()).parameter(obtainBPEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.25
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1788cae6aa35655b481daee71e473cc9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1788cae6aa35655b481daee71e473cc9");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeShow(String str, Map<String, Object> map, String str2, String str3) {
        Object[] objArr = {str, map, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "353e21e04ee91ab3daf93de1dc57f353", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "353e21e04ee91ab3daf93de1dc57f353");
        } else {
            writeShow(null, str, map, str2, str3);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeShow(@NonNull String str, String str2, Map<String, Object> map, String str3, String str4) {
        Object[] objArr = {str, str2, map, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b38bca0d032256f46fc4e33a9f8068c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b38bca0d032256f46fc4e33a9f8068c2");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.element_id = str3;
        eventInfo.index = str4;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeShow").nm(EventName.MGE.toString()).parameter(eventInfo.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.26
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4aff66f82fb4ecf9c6f216c335fb0f7f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4aff66f82fb4ecf9c6f216c335fb0f7f");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeSystemCheck(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1703a558065444002c4eeff8a62f5cbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1703a558065444002c4eeff8a62f5cbe");
        } else {
            writeSystemCheck(str, str2, map, "");
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeSystemCheck(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea3ac36d3cfee60492afa9606496cc0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea3ac36d3cfee60492afa9606496cc0a");
            return;
        }
        EventInfo obtainScEvent = EventInfo.obtainScEvent(str3, str2, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", this.mChannelName);
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeSystemCheck").nm(EventName.SC.toString()).parameter(obtainScEvent.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.27
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "332936945ccab5ca1b03030dc69b1a1e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "332936945ccab5ca1b03030dc69b1a1e");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(EventInfo eventInfo) {
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9299efcde9916846fc9cb6d227ce3212", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9299efcde9916846fc9cb6d227ce3212");
        } else {
            writeEvent((String) null, eventInfo);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeEvent(@NonNull String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78fddfb69ec75fb5c7f21c05aa6a1da0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78fddfb69ec75fb5c7f21c05aa6a1da0");
        } else if (eventInfo == null) {
            LogUtil.log("statistics", "Channel - writeEvent New: eventInfo is null.");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", this.mChannelName);
                jSONObject.put("pageInfoKey", str);
                jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("writeEvent").nm((eventInfo.nm != null ? eventInfo.nm : EventName.MGE).toString()).parameter(eventInfo.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.28
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3ee2891a35f23e7c3fdbb82a8158b20a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3ee2891a35f23e7c3fdbb82a8158b20a");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {eventName, businessInfo, map, str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01e88c68a589e4161e37900e69ee9d11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01e88c68a589e4161e37900e69ee9d11");
        } else {
            writeEvent(null, eventName, businessInfo, map, str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void writeEvent(@NonNull String str, EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, eventName, businessInfo, map, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c81846964a3414f4f04311421cd4a74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c81846964a3414f4f04311421cd4a74");
        } else if (eventName == null) {
            LogUtil.log("statistics", "Channel - writeEvent New: nm is null.");
        } else {
            EventInfo eventInfo = new EventInfo();
            eventInfo.nm = eventName;
            eventInfo.val_val = businessInfo;
            eventInfo.val_lab = map;
            eventInfo.val_act = str2;
            eventInfo.element_id = str3;
            eventInfo.index = str4;
            eventInfo.val_bid = str5;
            eventInfo.event_type = str6;
            eventInfo.category = this.mChannelName;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", this.mChannelName);
                jSONObject.put("pageInfoKey", str);
                jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("writeEvent").nm((eventInfo.nm != null ? eventInfo.nm : EventName.MGE).toString()).parameter(eventInfo.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.29
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cc3d653f8576681a5ccebde720b9a928", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cc3d653f8576681a5ccebde720b9a928");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    @Deprecated
    public void writeEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed73e146074e47eefbc93bb62417a7a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed73e146074e47eefbc93bb62417a7a9");
        } else {
            writeEvent((String) null, str);
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeEvent(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bfa72bf5ac6ca1751ae0b219c761c5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bfa72bf5ac6ca1751ae0b219c761c5d");
        } else if (TextUtils.isEmpty(str2)) {
            LogUtil.log("statistics", "Channel - writeEvent: evs isEmpty.");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", this.mChannelName);
                jSONObject.put("pageInfoKey", str);
                jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("writeEvent").parameter(str2).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.30
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "887cbed43d1b076c8d97a06fa27250ec", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "887cbed43d1b076c8d97a06fa27250ec");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public void write(String str, EventInfo eventInfo) {
        Object[] objArr = {str, eventInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41af3dcf30d12a4848620aee660d76f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41af3dcf30d12a4848620aee660d76f4");
        } else if (eventInfo == null) {
            LogUtil.log("statistics", "Channel - writeEvent: evs isEmpty.");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", this.mChannelName);
                jSONObject.put("pageInfoKey", str);
                jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("write").nm((eventInfo.nm != null ? eventInfo.nm : EventName.MGE).toString()).parameter(eventInfo.toJson().toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.31
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d1009b14a23ddab3618b3d669ea8ff0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d1009b14a23ddab3618b3d669ea8ff0");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IKNBInterface
    public void writeEventThroughWeb(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1e24640c032161f7b9ee12d44886146", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1e24640c032161f7b9ee12d44886146");
        } else if (jSONObject == null) {
            LogUtil.log("statistics", "Channel - writeEvent: evs isEmpty.");
        } else {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("evs", jSONObject);
                if (jSONObject2 != null) {
                    jSONObject3.put("options", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("category", this.mChannelName);
                jSONObject4.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("writeEventThroughWeb").nm("").parameter(jSONObject3.toString()).options(jSONObject4.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.32
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2dc888e456416de1c691f2b957209384", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2dc888e456416de1c691f2b957209384");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.channel.AbstractChannel, com.meituan.android.common.statistics.channel.IPublicInterface
    public void writeAdEvent(@NonNull String str, String str2, Map<String, Object> map, String str3, EventName eventName, MidasInfo midasInfo, boolean z) {
        Object[] objArr = {str, str2, map, str3, eventName, midasInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "065195cc77ccb49ea2735a38783ffc85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "065195cc77ccb49ea2735a38783ffc85");
            return;
        }
        EventInfo eventInfo = null;
        if (eventName != null) {
            if (eventName == EventName.CLICK) {
                eventInfo = EventInfo.obtainMcEvent(str3, str2, map);
            } else if (eventName == EventName.MODEL_VIEW) {
                eventInfo = EventInfo.obtainMvEvent(str3, str2, map);
            } else if (eventName == EventName.PAGE_VIEW) {
                eventInfo = EventInfo.obtainPvEvent(str3, map);
            }
        }
        if (eventInfo == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("evs", eventInfo.toJson() != null ? eventInfo.toJson().toString() : "");
            if (midasInfo != null) {
                try {
                    jSONObject.put(DMKeys.KEY_MIDAS_INFO, new Gson().toJson(midasInfo));
                } catch (Throwable unused) {
                }
            }
            jSONObject.put("adOnly", z);
        } catch (JSONException unused2) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("category", this.mChannelName);
            jSONObject2.put("pageInfoKey", str);
            jSONObject2.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT);
        } catch (JSONException unused3) {
        }
        final DataRequest build = new DataRequest.Builder().method("writeAdEvent").nm(eventName.toString()).parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.33
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a00738a7cc0696a43a48cfdfe6cdbf6e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a00738a7cc0696a43a48cfdfe6cdbf6e");
                } else {
                    RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                }
            }
        });
    }

    @Override // com.meituan.android.common.statistics.channel.IDeprecatedInterface
    public long getSeq() {
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eff493e09b829b28792a3551dfc68b99", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eff493e09b829b28792a3551dfc68b99")).longValue();
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("getSeq", (Object) null);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            jSONObject = null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("category", this.mChannelName);
            jSONObject2.put("OpType", 10007);
        } catch (JSONException unused3) {
        }
        final DataRequest build = new DataRequest.Builder().method("getSeq").parameter(jSONObject != null ? jSONObject.toString() : null).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<Long>() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.34
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Long call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "268c416ac28c9fc23be7191f6d829a82", 6917529027641081856L)) {
                        return (Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "268c416ac28c9fc23be7191f6d829a82");
                    }
                    DataResponse request = RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    if (request != null && request.getResult() != null) {
                        try {
                            return (Long) request.getResult();
                        } catch (Throwable unused4) {
                            return 0L;
                        }
                    }
                    return 0L;
                }
            });
            if (submitOnThread != null) {
                return ((Long) submitOnThread.get(1L, TimeUnit.SECONDS)).longValue();
            }
            return 0L;
        } catch (Throwable unused4) {
            return 0L;
        }
    }

    @Override // com.meituan.android.common.statistics.channel.IMMPInterface
    public void writeEventThroughMMP(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55889ec5887491061ebb1d028433d6b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55889ec5887491061ebb1d028433d6b3");
        } else if (jSONObject == null) {
            LogUtil.log("statistics", "Channel - writeEvent: evs isEmpty.");
        } else {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("evs", jSONObject);
                if (jSONObject2 != null) {
                    jSONObject3.put("options", jSONObject2);
                }
            } catch (JSONException unused) {
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("category", this.mChannelName);
                jSONObject4.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MMP_EVENT);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("writeEventThroughMMP").nm("").parameter(jSONObject3.toString()).options(jSONObject4.toString()).process(ProcessUtils.getCurrentProcessName(this.mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.channel.RemoteChannelProxy.35
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "472b5f059f9de28c8352adbab5961685", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "472b5f059f9de28c8352adbab5961685");
                    } else {
                        RequestManager.getInstance().request(RemoteChannelProxy.this.mContext, build);
                    }
                }
            });
        }
    }
}
