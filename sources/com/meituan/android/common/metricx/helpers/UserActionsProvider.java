package com.meituan.android.common.metricx.helpers;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.AnyThread;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.crashreporter.util.a;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.util.AppUtils;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.j;
import com.sankuai.common.utils.FileUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UserActionsProvider implements Application.ActivityLifecycleCallbacks {
    public static final String INSTANCES = "instances";
    public static final String INSTANCE_COUNT = "instanceCount";
    private static final int KB_TO_MB = 1024;
    private static final int MAX_ACTIONS = 40;
    private static final int OOM_PAGE_COUNT = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static LinkedList<String> vmSizeTrack = new LinkedList<>();
    private volatile int appLaunched;
    private volatile boolean is64;
    private int lastPageVmSize;
    private LinkedList<String> mActionTracks;
    private String mCurrentStoppedActivityName;
    private WeakHashMap<Activity, String> mDestroyedActivitis;
    private volatile boolean mInit;
    private String mLastResumeActivityName;
    private String mLastStoppedActivityName;
    private ArrayList<OOMPage> oomPages;
    private WeakReference<Activity> resumeActivityRef;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class _Inner {
        public static UserActionsProvider _instance = new UserActionsProvider();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class OOMPage implements Comparable<OOMPage> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String page;
        public int vmSize;

        public OOMPage(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e8c3092d00afda39ef2fc01448b678b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e8c3092d00afda39ef2fc01448b678b");
                return;
            }
            this.page = str;
            this.vmSize = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(OOMPage oOMPage) {
            Object[] objArr = {oOMPage};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "687f6d26b8c945580ae9a156ad7df020", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "687f6d26b8c945580ae9a156ad7df020")).intValue();
            }
            if (oOMPage == null) {
                return -1;
            }
            if (oOMPage.vmSize > this.vmSize) {
                return 1;
            }
            return oOMPage.vmSize < this.vmSize ? -1 : 0;
        }

        public static void swap(OOMPage oOMPage, OOMPage oOMPage2) {
            Object[] objArr = {oOMPage, oOMPage2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f321672758cac659e7d4a5422efb493b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f321672758cac659e7d4a5422efb493b");
                return;
            }
            String str = oOMPage.page;
            int i = oOMPage.vmSize;
            oOMPage.vmSize = oOMPage2.vmSize;
            oOMPage.page = oOMPage2.page;
            oOMPage2.vmSize = i;
            oOMPage2.page = str;
        }
    }

    public static UserActionsProvider getInstance() {
        return _Inner._instance;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64e779da7745742a01e32c2e1729a91e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64e779da7745742a01e32c2e1729a91e");
        } else {
            init(ContextProvider.getInstance().getContext());
        }
    }

    @AnyThread
    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e477986a24e6bc64461ae3cc296e5326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e477986a24e6bc64461ae3cc296e5326");
        } else if (context == null || this.mInit) {
        } else {
            synchronized (this) {
                if (!this.mInit) {
                    AppBus.getInstance().register(this);
                    this.is64 = ProcessUtils.is64Bit();
                    if (vmSizeTrack.isEmpty()) {
                        logVmSize();
                    }
                    this.mInit = true;
                }
            }
        }
    }

    @AnyThread
    public String getActions(boolean z) {
        ArrayList arrayList;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd9cedc65e9466945c76ed35c9c3a690", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd9cedc65e9466945c76ed35c9c3a690");
        }
        StringBuilder sb = new StringBuilder();
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.mActionTracks);
            }
            if (z) {
                Collections.reverse(arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null) {
                    sb.append(filterPrivateInfo(str));
                    sb.append(";");
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private String filterPrivateInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0404c6faa0e0cffffac79f53aad33ee6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0404c6faa0e0cffffac79f53aad33ee6") : (TextUtils.isEmpty(str) || str.length() < 11) ? str : str.replaceAll("(\\d{3})(\\d{9,12}|\\d{4})(\\d{3})(\\d|X)", "$1****$3$4");
    }

    public String getLastResumeActivityName() {
        return this.mLastResumeActivityName;
    }

    private void logAction(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f449063a57220f0a4ffec221a9e163c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f449063a57220f0a4ffec221a9e163c8");
        } else if (activity != null) {
            logAction(activity.getClass().getName() + "@" + activity.hashCode() + CommonConstant.Symbol.UNDERLINE + str);
        }
    }

    @AnyThread
    public void logAction(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db4f7e14430d806abbaebf4b44801671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db4f7e14430d806abbaebf4b44801671");
            return;
        }
        String str2 = TimeUtil.formatTimeStamp(TimeUtil.currentTimeMillis()) + StringUtil.SPACE + str;
        synchronized (this) {
            while (this.mActionTracks.size() >= 40) {
                this.mActionTracks.poll();
            }
            this.mActionTracks.offer(str2);
        }
        logVmSize();
    }

    public void logVmSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "937ed0954f9eb60ca14ed752effeebea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "937ed0954f9eb60ca14ed752effeebea");
        } else {
            com.meituan.android.common.metricx.task.ThreadManager.getInstance().postRunnable(new Runnable() { // from class: com.meituan.android.common.metricx.helpers.UserActionsProvider.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ad82fccbd7938999a549d142ad1e8585", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ad82fccbd7938999a549d142ad1e8585");
                        return;
                    }
                    if (!UserActionsProvider.this.is64) {
                        String formatTimeStamp = TimeUtil.formatTimeStamp(TimeUtil.currentTimeMillis());
                        int a = a.a();
                        synchronized (this) {
                            if (UserActionsProvider.vmSizeTrack.isEmpty()) {
                                UserActionsProvider.this.lastPageVmSize = a;
                            }
                            if (!TextUtils.equals(UserActionsProvider.this.mLastStoppedActivityName, UserActionsProvider.this.mCurrentStoppedActivityName) && !UserActionsProvider.vmSizeTrack.isEmpty()) {
                                UserActionsProvider.this.calOOMPages(UserActionsProvider.this.mCurrentStoppedActivityName, a - UserActionsProvider.this.lastPageVmSize);
                                UserActionsProvider.this.lastPageVmSize = a;
                                UserActionsProvider.this.mLastStoppedActivityName = UserActionsProvider.this.mCurrentStoppedActivityName;
                            }
                            while (UserActionsProvider.vmSizeTrack.size() >= 40) {
                                UserActionsProvider.vmSizeTrack.poll();
                            }
                            LinkedList linkedList = UserActionsProvider.vmSizeTrack;
                            linkedList.offer(formatTimeStamp + CommonConstant.Symbol.COLON + a);
                        }
                    }
                    final j a2 = j.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = j.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "41c76543195641000f0fb835266d49fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "41c76543195641000f0fb835266d49fa");
                        return;
                    }
                    a2.c = SystemClock.elapsedRealtime() + 1000;
                    final long j = a2.c;
                    a2.b.schedule(new Runnable() { // from class: com.meituan.snare.j.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "a43b0197b4800a890f8fb2ded9c477fb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "a43b0197b4800a890f8fb2ded9c477fb");
                            } else if (j != j.this.c || j.this.d) {
                            } else {
                                j.this.d = true;
                                try {
                                    j jVar = j.this;
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = j.a;
                                    if (PatchProxy.isSupport(objArr5, jVar, changeQuickRedirect6, false, "cc9f9e44f2a12be41557f83aa62a665d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, jVar, changeQuickRedirect6, false, "cc9f9e44f2a12be41557f83aa62a665d");
                                    } else {
                                        String a3 = f.a().a((String) null);
                                        FileUtils.writeFile(new File(a3), UserActionsProvider.getInstance().getActions(false) + UserActionsProvider.getInstance().getLastResumeActivityName(), false);
                                    }
                                } catch (Exception e) {
                                    Logger.getSnareLogger().e("PagesWatchDog", e);
                                } finally {
                                    j.this.d = false;
                                }
                            }
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                }
            });
        }
    }

    public void logVmSizeImediately() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62791e687edc3f112a2985ec826bda84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62791e687edc3f112a2985ec826bda84");
        } else if (this.is64) {
        } else {
            String formatTimeStamp = TimeUtil.formatTimeStamp(TimeUtil.currentTimeMillis());
            int a = a.a();
            synchronized (vmSizeTrack) {
                LinkedList<String> linkedList = vmSizeTrack;
                linkedList.offer(formatTimeStamp + CommonConstant.Symbol.COLON + a);
            }
        }
    }

    public UserActionsProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "425b80ae15b1a765d33f8425e2380516", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "425b80ae15b1a765d33f8425e2380516");
            return;
        }
        this.mInit = false;
        this.mActionTracks = new LinkedList<>();
        this.mDestroyedActivitis = new WeakHashMap<>();
        this.resumeActivityRef = null;
        this.oomPages = new ArrayList<>();
        this.mLastResumeActivityName = "";
        this.mLastStoppedActivityName = "";
        this.mCurrentStoppedActivityName = "";
        this.lastPageVmSize = 0;
        this.appLaunched = 0;
        this.is64 = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab8fe23a99646b8754743b4dbda855f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab8fe23a99646b8754743b4dbda855f0");
            return;
        }
        StringBuilder sb = new StringBuilder("create");
        Intent intent = activity.getIntent();
        String str = "";
        try {
            str = intent.getData().toString();
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("{data=");
            sb.append(str);
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    sb2.append(str2);
                    sb2.append(CommonConstant.Symbol.COLON);
                    sb2.append(extras.get(str2));
                    sb2.append(CommonConstant.Symbol.COMMA);
                }
            }
        } catch (Throwable unused2) {
        }
        String sb3 = sb2.toString();
        if (!TextUtils.isEmpty(sb3)) {
            sb.append("(extras=");
            sb.append(sb3);
            sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(intent.getFlags()));
            sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        }
        logAction(activity, sb.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e37466407b20a7512f089db537d3094e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e37466407b20a7512f089db537d3094e");
        } else {
            logAction(activity, "start");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6508037f86c17ad7e43e536dcf1c8cf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6508037f86c17ad7e43e536dcf1c8cf4");
            return;
        }
        this.appLaunched = 1;
        this.mLastResumeActivityName = AppUtils.getPageName(activity);
        MetricsActivityLifecycleManager.currentActivity = this.mLastResumeActivityName;
        this.resumeActivityRef = new WeakReference<>(activity);
        logAction(activity, "resume");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "533e39d7a3a980eefd9ac834eb5cb5f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "533e39d7a3a980eefd9ac834eb5cb5f4");
        } else {
            logAction(activity, "pause");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e11c93f422d7b16be62132f8968fccf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e11c93f422d7b16be62132f8968fccf7");
            return;
        }
        this.mCurrentStoppedActivityName = AppUtils.getPageName(activity);
        logAction(activity, "stop");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7917c15efe29e5e304f9214192dd747c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7917c15efe29e5e304f9214192dd747c");
            return;
        }
        this.mDestroyedActivitis.put(activity, null);
        logAction(activity, "destroy");
    }

    public String getVmSizeInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a2edb712e3be2f43a87b5fde3c62942", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a2edb712e3be2f43a87b5fde3c62942");
        }
        StringBuilder sb = new StringBuilder("");
        try {
            synchronized (vmSizeTrack) {
                Iterator<String> it = vmSizeTrack.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(";");
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getAliveActivityInfo() {
        String jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a6cbda60a52c74da2e580132ad59aa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a6cbda60a52c74da2e580132ad59aa6");
        }
        try {
            synchronized (UserActionsProvider.class) {
                JSONObject jSONObject2 = new JSONObject();
                for (Activity activity : this.mDestroyedActivitis.keySet()) {
                    if (activity != null) {
                        String name = activity.getClass().getName();
                        JSONObject optJSONObject = jSONObject2.optJSONObject(name);
                        if (optJSONObject == null) {
                            JSONObject jSONObject3 = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(activity.hashCode());
                            jSONObject3.put(INSTANCE_COUNT, 1);
                            jSONObject3.put(INSTANCES, jSONArray);
                            jSONObject2.put(name, jSONObject3);
                        } else {
                            optJSONObject.put(INSTANCE_COUNT, optJSONObject.getInt(INSTANCE_COUNT) + 1);
                            JSONArray optJSONArray = optJSONObject.optJSONArray(INSTANCES);
                            if (optJSONArray != null) {
                                optJSONArray.put(activity.hashCode());
                            }
                        }
                    }
                }
                jSONObject = jSONObject2.toString();
            }
            return jSONObject;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calOOMPages(String str, int i) {
        boolean z = false;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8739b6b05d7d5d15e3212f6ee46f3d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8739b6b05d7d5d15e3212f6ee46f3d6d");
        } else if (!TextUtils.isEmpty(str)) {
            if (this.oomPages.size() < 5 || this.oomPages.get(4).vmSize < i) {
                OOMPage oOMPage = new OOMPage(str, i);
                if (this.oomPages.size() < 5) {
                    Iterator<OOMPage> it = this.oomPages.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        OOMPage next = it.next();
                        if (TextUtils.equals(next.page, oOMPage.page)) {
                            next.vmSize = oOMPage.vmSize;
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        this.oomPages.add(oOMPage);
                    }
                    Collections.sort(this.oomPages);
                    return;
                }
                OOMPage.swap(oOMPage, this.oomPages.get(4));
                for (int i2 = 4; i2 > 0; i2--) {
                    int i3 = i2 - 1;
                    if (this.oomPages.get(i3).vmSize < this.oomPages.get(i2).vmSize) {
                        OOMPage.swap(this.oomPages.get(i3), this.oomPages.get(i2));
                    }
                }
            }
        }
    }

    public String getOomPages() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cee52683141b4c466bd17d02d7677439", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cee52683141b4c466bd17d02d7677439");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<OOMPage> it = this.oomPages.iterator();
            while (it.hasNext()) {
                OOMPage next = it.next();
                jSONObject.put(next.page, next.vmSize / 1024);
            }
        } catch (Exception e) {
            Logger.getMetricxLogger().e("WYL: failed in getOOMPages ", e.getMessage());
        }
        return jSONObject.toString();
    }

    public int isAppLaunched() {
        return this.appLaunched;
    }

    @Nullable
    public final Activity getLastResumeActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "081c3db649dfd49b829b3a6695213f4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "081c3db649dfd49b829b3a6695213f4b");
        }
        if (this.resumeActivityRef == null || this.resumeActivityRef.get() == null) {
            return null;
        }
        return this.resumeActivityRef.get();
    }
}
