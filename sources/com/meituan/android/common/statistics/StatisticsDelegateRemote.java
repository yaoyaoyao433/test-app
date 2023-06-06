package com.meituan.android.common.statistics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.dispatcher.EventManager;
import com.meituan.android.common.statistics.dispatcher.SpecifiedEventConfig;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.ipc.DataRequest;
import com.meituan.android.common.statistics.ipc.DataResponse;
import com.meituan.android.common.statistics.ipc.RemoteProxyThread;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.RequestManager;
import com.meituan.android.common.statistics.ipc.independent.ProcessController;
import com.meituan.android.common.statistics.session.SessionBean;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.SharedPreferencesHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatisticsDelegateRemote extends RemoteProxyThread {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context mContext;
    private boolean mIsTop;
    private long mStartTime;
    private volatile HashMap mValidActivityMap;

    @Deprecated
    public void onResume(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6852d8833bd8f81ff241208996e18fd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6852d8833bd8f81ff241208996e18fd5");
        }
    }

    public void onSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void updateDefaultEnvironment() {
    }

    public StatisticsDelegateRemote() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3a3ac286ef65830c10ccbe100598c22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3a3ac286ef65830c10ccbe100598c22");
            return;
        }
        this.mValidActivityMap = new HashMap();
        this.mIsTop = true;
        this.mStartTime = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Sub {
        private static final StatisticsDelegateRemote INSTANCE = new StatisticsDelegateRemote();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static StatisticsDelegateRemote getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cadc17838fdad0d634106ec960c2176c", 6917529027641081856L) ? (StatisticsDelegateRemote) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cadc17838fdad0d634106ec960c2176c") : Sub.INSTANCE;
    }

    public void setValidActivityMap(HashMap hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d6408d421323e65d525967f492fbbac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d6408d421323e65d525967f492fbbac");
        } else {
            this.mValidActivityMap.putAll(hashMap);
        }
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c7e2bbad64a85a90e5b72e2e3ebcacc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c7e2bbad64a85a90e5b72e2e3ebcacc");
            return;
        }
        mContext = context;
        LogUtil.log("remote channel init start ps:" + ProcessUtils.getCurrentProcessName(Statistics.getContext()));
        if (context == null || !ConfigManager.getInstance(context).supportMultiProcess() || ProcessUtils.isMainProcess(context)) {
            return;
        }
        LogUtil.log("StatisticsDelegateRemote init checkconnection:");
        ProcessController.getInstance().checkConnection(context);
    }

    public void updateDefaultEnvironment(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ef79e630a33209b6667b06e0295e2e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ef79e630a33209b6667b06e0295e2e3");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        updateDefaultEnvironment(hashMap);
    }

    public void updateDefaultEnvironment(Map<String, String> map) {
        JSONObject mapToJSONObject;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4825f42646bc7b0eaad9dd3f511b8fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4825f42646bc7b0eaad9dd3f511b8fb");
        } else if (map == null || map.size() <= 0 || (mapToJSONObject = JsonUtil.mapToJSONObject(map)) == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("OpType", 30000);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("updateDefaultEnvironment").parameter(mapToJSONObject.toString()).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dd7a011d3dac547bf08ec5c42950caf0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dd7a011d3dac547bf08ec5c42950caf0");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    public void setContext(Context context) {
        mContext = context;
    }

    public void setDefaultCategory(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03461db5275fcecccb5facc2459f201b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03461db5275fcecccb5facc2459f201b");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", str);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CATEGORY);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("setDefaultCategory").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "170688d2eaed6c3a98f5d502fb08c456", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "170688d2eaed6c3a98f5d502fb08c456");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    public String getDefaultChannelName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18604dd0bc070f6e314841ed7622a11b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18604dd0bc070f6e314841ed7622a11b");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_CHANNEL_NAME);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getDefaultChannelName").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4b42606d3e3bb43341239daaadf06193", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4b42606d3e3bb43341239daaadf06193");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return null;
        }
    }

    public DefaultEnvironment getDefaultEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "727a1874ad67ebdf15dac636dc404f40", 6917529027641081856L)) {
            return (DefaultEnvironment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "727a1874ad67ebdf15dac636dc404f40");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_DEFAULT_ENV);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getDefaultEnvironment").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<DefaultEnvironment>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.4
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public DefaultEnvironment call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "72ff4f8649041cb0d5e95b0c7b2228fb", 6917529027641081856L)) {
                        return (DefaultEnvironment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "72ff4f8649041cb0d5e95b0c7b2228fb");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    if (request != null && request.getResult() != null) {
                        return (DefaultEnvironment) request.getResult();
                    }
                    return StatisticsDelegate.getInstance().getDefaultEnvironment();
                }
            });
            return submitOnThread != null ? (DefaultEnvironment) submitOnThread.get(5L, TimeUnit.SECONDS) : StatisticsDelegate.getInstance().getDefaultEnvironment();
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void setDefaultChannelName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64a4c3856c63c696f0b32a4d83a697ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64a4c3856c63c696f0b32a4d83a697ca");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("defaultChannelName", str);
            jSONObject.put("globalFlags", true);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("setDefaultChannelName").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b003886d173e868c3f7a6bb4ab7706d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b003886d173e868c3f7a6bb4ab7706d");
                } else {
                    RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                }
            }
        });
    }

    public void setDefaultChannelName(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "220a8d3c21408fbe2e66b9cfe643ddcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "220a8d3c21408fbe2e66b9cfe643ddcb");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("defaultChannelName", str2);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", str);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_DEFAULT_CHANNEL_NAME);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("setDefaultChannelName").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6fce61646d14aa74c24002460e027833", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6fce61646d14aa74c24002460e027833");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    @Deprecated
    public void onCreate(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a12429445eb60ba90a02fa74f94fa59a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a12429445eb60ba90a02fa74f94fa59a");
        } else {
            onCreate(activity, null);
        }
    }

    public void onCreate(Activity activity, Bundle bundle) {
        String string;
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9472b556aece90eed49d12a093919f1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9472b556aece90eed49d12a093919f1e");
        } else if (activity == null) {
        } else {
            String generatePageInfoKey = AppUtil.generatePageInfoKey(activity);
            SessionBean sessionBean = StatisticsDelegate.getSessionBean(activity);
            JSONObject jSONObject = new JSONObject();
            if (bundle != null) {
                try {
                    string = bundle.getString("pageName");
                } catch (JSONException unused) {
                }
            } else {
                string = "";
            }
            jSONObject.put("pageName", string);
            jSONObject.put("sessionBean", sessionBean != null ? sessionBean.toJsonStr() : "");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", generatePageInfoKey);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_CREATE);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("onCreate").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83e809579b6d1384f7406380360b488e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83e809579b6d1384f7406380360b488e");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    @Deprecated
    public void onStart(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17194935468add4085a086ecd3da2bea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17194935468add4085a086ecd3da2bea");
        } else {
            newOnStart(activity);
        }
    }

    public void newOnStart(Activity activity) {
        String jsonStr;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1dba4bcb97320fb03a7e14700c58ca7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1dba4bcb97320fb03a7e14700c58ca7");
        } else if (activity == null) {
        } else {
            Boolean bool = Boolean.FALSE;
            Boolean valueOf = Boolean.valueOf(this.mIsTop);
            String generatePageInfoKey = AppUtil.generatePageInfoKey(activity);
            LogUtil.log("StatisticsDelegateRemote newOnStart pageInfoKey:" + generatePageInfoKey + " mActivityAlive:" + SharedPreferencesHelper.getInstance(mContext).getActivityActiveCount());
            synchronized (this) {
                if (SharedPreferencesHelper.getInstance(mContext).getActivityActiveCount() <= 0) {
                    bool = Boolean.TRUE;
                    this.mIsTop = true;
                    this.mStartTime = SystemClock.elapsedRealtime();
                }
                if (this.mValidActivityMap == null) {
                    this.mValidActivityMap = new HashMap();
                }
                this.mValidActivityMap.put(generatePageInfoKey, Boolean.TRUE);
                SharedPreferencesHelper.getInstance(mContext).incActivityActiveCount();
            }
            SessionBean sessionBean = StatisticsDelegate.getSessionBean(activity);
            JSONObject jSONObject = new JSONObject();
            if (sessionBean != null) {
                try {
                    jsonStr = sessionBean.toJsonStr();
                } catch (JSONException unused) {
                }
            } else {
                jsonStr = "";
            }
            jSONObject.put("sessionBean", jsonStr);
            jSONObject.put("launchFromBg", bool);
            jSONObject.put("isTop", valueOf);
            jSONObject.put("isMmpActivity", AppUtil.isMmpActivity(activity));
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", generatePageInfoKey);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_START);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("newOnStart").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a826216dba0afe65f6446022a68e6537", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a826216dba0afe65f6446022a68e6537");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    public void handleActivityResume(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fb2be96c724ff63001dbd8a85cf497b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fb2be96c724ff63001dbd8a85cf497b");
        } else if (StatisticsDelegate.getInstance().isAutoPVEnabled(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("activityName", str2);
                jSONObject.put("vallab", JsonUtil.mapToJSONString(map));
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", str);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_RESUME);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("handleActivityResume").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c7023498a45b2ec1f2f79b3c0c160d5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c7023498a45b2ec1f2f79b3c0c160d5");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("nm", EventName.PAGE_VIEW);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(SpecifiedEventConfig.LX_SPECIFIED_GESTURE, "");
                jSONObject3.put("val_lab", jSONObject4);
            } catch (JSONException unused3) {
            }
            if (Statistics.getChannel() != null) {
                EventManager.getInstance().dispatchData(null, EventLevel.URGENT, null, jSONObject3);
            }
        }
    }

    public void handleActivityPause(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3ef1e0cfe52c29742e9ff1e6e302a3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3ef1e0cfe52c29742e9ff1e6e302a3d");
        } else if (StatisticsDelegate.getInstance().isAutoPDEnabled(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("activityName", str2);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", str);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_PAUSE);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("handleActivityPause").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d5909ba74d4938c48ccba350a5de311b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d5909ba74d4938c48ccba350a5de311b");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    public void handleActivityDestroy(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bd30238da5bf4d7b71fa78ba7a0f5b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bd30238da5bf4d7b71fa78ba7a0f5b5");
        } else if (StatisticsDelegate.getInstance().isAutoPDEnabled(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("activityName", str2);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", str);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("handleActivityDestroy").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.11
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b79381eaccb05fa875649f22b14ebfee", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b79381eaccb05fa875649f22b14ebfee");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    @Deprecated
    public void onStop(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6b3df1d7401cf2f93a475a18bb59910", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6b3df1d7401cf2f93a475a18bb59910");
        } else {
            newOnStop(activity);
        }
    }

    public void newOnStop(Activity activity) {
        Object obj;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b58e4a7ff34f4f6a7b7f1a3d33d5922b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b58e4a7ff34f4f6a7b7f1a3d33d5922b");
        } else if (activity == null) {
        } else {
            String generatePageInfoKey = AppUtil.generatePageInfoKey(activity);
            Boolean bool = Boolean.FALSE;
            synchronized (this) {
                if (this.mValidActivityMap != null && this.mValidActivityMap.containsKey(generatePageInfoKey) && (obj = this.mValidActivityMap.get(generatePageInfoKey)) != null && ((Boolean) obj).booleanValue()) {
                    this.mValidActivityMap.remove(generatePageInfoKey);
                    SharedPreferencesHelper.getInstance(mContext).decActivityActiveCount();
                }
                if (SharedPreferencesHelper.getInstance(mContext).getActivityActiveCount() <= 0) {
                    bool = Boolean.TRUE;
                    this.mIsTop = false;
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("launchFromFg", bool);
                jSONObject.put("duration", SystemClock.elapsedRealtime() - this.mStartTime);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", generatePageInfoKey);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_STOP);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("newOnStop").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.12
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4d4ea043244c420d8e0dd8f04a85c056", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4d4ea043244c420d8e0dd8f04a85c056");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    @Deprecated
    public String getRequestId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c660efcb4c951bbe27a8c5ae2dac395a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c660efcb4c951bbe27a8c5ae2dac395a") : getRequestId(null);
    }

    public String getRequestId(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e479bdf6cddc5c9c656d061aeffcd2a4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e479bdf6cddc5c9c656d061aeffcd2a4");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getRequestId").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.13
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d996fc98f551634992100447a18d33f", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d996fc98f551634992100447a18d33f");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(5L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return null;
        }
    }

    public String getCid(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bfb649708f6380614fbe174926d9fa3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bfb649708f6380614fbe174926d9fa3");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CID);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getCid").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.14
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2c7006f308cc2ae7545140292b504f15", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2c7006f308cc2ae7545140292b504f15");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(5L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public String getRequestIdForPage(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "806baae716f7963ead4066135df24152", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "806baae716f7963ead4066135df24152");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID_FOR_PAGE);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getRequestIdForPage").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.15
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df959a828e4ebd75c65a161a4e71f526", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df959a828e4ebd75c65a161a4e71f526");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Deprecated
    public String getRefRequestId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19e56c0f42d4a32a95d39f69c6692dcd", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19e56c0f42d4a32a95d39f69c6692dcd") : getRefRequestId(null);
    }

    public String getRefRequestId(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9e0ddf8511f28fde3c6cd50f6bc1222", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9e0ddf8511f28fde3c6cd50f6bc1222");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_REQUEST_ID);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getRefRequestId").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.16
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f441e6ff6b93e35c86db874c664c1946", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f441e6ff6b93e35c86db874c664c1946");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Deprecated
    public String getPageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f4e5757969f794d295109e6e848215a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f4e5757969f794d295109e6e848215a") : getPageName(null);
    }

    public String getPageName(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dd302c950d5fce039105416a539b4bf", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dd302c950d5fce039105416a539b4bf");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_PAGE_NAME);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getPageName").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.17
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "87fce515758493c6990e32f133b380c8", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "87fce515758493c6990e32f133b380c8");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Deprecated
    public String getRefPageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a14bda0a8c5c9302428a7ed9b240f3d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a14bda0a8c5c9302428a7ed9b240f3d") : getRefPageName(null);
    }

    public String getRefPageName(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49c6c4923012ab7cbc4ea4379d9819e4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49c6c4923012ab7cbc4ea4379d9819e4");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageInfoKey", str);
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REF_PAGE_NAME);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getRefPageName").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.18
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "45f7b2ad40b7d491df7534282e5887f2", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "45f7b2ad40b7d491df7534282e5887f2");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Deprecated
    public void resetPageIdentify(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3751ec832c322a5c55dfa012937e5887", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3751ec832c322a5c55dfa012937e5887");
        } else {
            resetPageIdentify(null, str);
        }
    }

    @Deprecated
    public void resetPageIdentify(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f61f392ea18209c2899a375cc8f91042", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f61f392ea18209c2899a375cc8f91042");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageName", str2);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", str);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_RESET_PAGE_IDENTIFY);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("resetPageIdentify").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.19
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f0319a2e592dcc74bf017f35abf66ba", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f0319a2e592dcc74bf017f35abf66ba");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    public void resetPageName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b07a848bbdfc74372cd5e5ab3bb2d665", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b07a848bbdfc74372cd5e5ab3bb2d665");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageName", str2);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", str);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_RESET_PAGE_NAME);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("resetPageName").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.20
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dd7bba1cc0bd9e12020f1158a4c85381", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dd7bba1cc0bd9e12020f1158a4c85381");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    public String JsToNative(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57731b0d2541717a9c4aa3d5ead73b1e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57731b0d2541717a9c4aa3d5ead73b1e");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_JS_TO_NATIVE);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("JsToNative").parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.21
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "92e4a40daec8f7115a7a4c6bcc1f9529", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "92e4a40daec8f7115a7a4c6bcc1f9529");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(5L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused3) {
            return null;
        }
    }

    public JSONObject mmpToNative(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2352536af468a9120f750d68802e6b7", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2352536af468a9120f750d68802e6b7");
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("parameters", jSONObject);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_MMP_TO_NATIVE);
        } catch (JSONException unused2) {
        }
        final DataRequest build = new DataRequest.Builder().method("mmpToNative").parameter(jSONObject2.toString()).options(jSONObject3.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.22
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19b243ccb28669360a36364c309ffe47", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19b243ccb28669360a36364c309ffe47");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            String str = submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public void setValLab(@NonNull String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e026d039b42e66d83bebab23a8307d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e026d039b42e66d83bebab23a8307d3");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, str3);
        setValLab(str, hashMap);
    }

    @Deprecated
    public void setVallab(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d71043c0f48f89c8f25a3a04938d899f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d71043c0f48f89c8f25a3a04938d899f");
        } else {
            setValLab(str, map);
        }
    }

    public void setValLab(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d141c4f94f2ccff0ce40788d9a5ca960", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d141c4f94f2ccff0ce40788d9a5ca960");
        } else if (map == null || map.size() <= 0) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", JsonUtil.mapToJSONString(map));
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pageInfoKey", str);
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_SET_VALLAB);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("setValLab").parameter(jSONObject.toString()).options(jSONObject2.toString()).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.23
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e54a0e896f1274437922c5488565957c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e54a0e896f1274437922c5488565957c");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }

    public String getSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afa59b5bbc9dfdc856f13bc5d3987ab8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afa59b5bbc9dfdc856f13bc5d3987ab8");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_SESSION);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getSession").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<String>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.24
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public String call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "970273ccca806c38570fa675c72727b4", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "970273ccca806c38570fa675c72727b4");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    return request != null ? (String) request.getResult() : "";
                }
            });
            return submitOnThread != null ? (String) submitOnThread.get(1L, TimeUnit.SECONDS) : "";
        } catch (Throwable unused2) {
            return null;
        }
    }

    public Map<String, String> getCustomEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57e04b3e2f48b0f23ee4ff6e7a8ab5ae", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57e04b3e2f48b0f23ee4ff6e7a8ab5ae");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("OpType", RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_CUSTOM_ENV);
        } catch (JSONException unused) {
        }
        final DataRequest build = new DataRequest.Builder().method("getCustomEnvironment").options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(mContext)).build();
        try {
            Future submitOnThread = submitOnThread(new Callable<Map<String, String>>() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.25
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public Map<String, String> call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85e2dfe4cd2116ba092de7886fdf725e", 6917529027641081856L)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85e2dfe4cd2116ba092de7886fdf725e");
                    }
                    DataResponse request = RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    if (request != null && request.getResult() != null) {
                        return (Map) request.getResult();
                    }
                    return StatisticsDelegate.getInstance().getCustomEnvironment();
                }
            });
            return submitOnThread != null ? (Map) submitOnThread.get(5L, TimeUnit.SECONDS) : StatisticsDelegate.getInstance().getCustomEnvironment();
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void sendSyncInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "883a827fa435a0f871300430feb67ed7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "883a827fa435a0f871300430feb67ed7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", str);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("OpType", 60000);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("sendSyncInfo").parameter(jSONObject.toString()).options(jSONObject2.toString()).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.StatisticsDelegateRemote.26
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bfc87575fde6ac8aae0d2b9dee3bcd1b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bfc87575fde6ac8aae0d2b9dee3bcd1b");
                    } else {
                        RequestManager.getInstance().request(StatisticsDelegateRemote.mContext, build);
                    }
                }
            });
        }
    }
}
