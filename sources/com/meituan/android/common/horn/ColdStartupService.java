package com.meituan.android.common.horn;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ColdStartupService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, StartupWrapper> mStartupWrapper = new ConcurrentHashMap();
    public static volatile boolean isMissing = false;
    private static final ScheduledExecutorService scheduledExecutorService = c.b("Horn-ColdStartupService", 2);
    private static int DEFAULT_FIRST_COLD_STARTUP_DELAY = 3;
    public static int delayFirstBatch = 3;
    public static int delaySecondBatch = 7;
    public static int delayClearCache = 11;

    public static void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f8c6f1fa7156bd4e2442c17a60a9aa8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f8c6f1fa7156bd4e2442c17a60a9aa8");
            return;
        }
        try {
            if (HornUtils.isHighPriorityProcess(InnerHorn.context)) {
                Logw.e(Logw.TAG, "cold startup begin~" + ProcessUtils.getCurrentProcessName());
                initColdStartupDelay();
                scheduledExecutorService.schedule(new Runnable() { // from class: com.meituan.android.common.horn.ColdStartupService.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0057be53e3df9703cb34db6cbfad1ecd", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0057be53e3df9703cb34db6cbfad1ecd");
                            return;
                        }
                        Logw.e(Logw.TAG, "1st batch start" + ProcessUtils.getCurrentProcessName());
                        HornCacheCenter.getInstance(InnerHorn.context).discToMemory();
                        ColdStartupService.trigger();
                        Logw.e(Logw.TAG, "1st batch end" + ProcessUtils.getCurrentProcessName());
                    }
                }, (long) delayFirstBatch, TimeUnit.SECONDS);
                scheduledExecutorService.schedule(new Runnable() { // from class: com.meituan.android.common.horn.ColdStartupService.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c4fbd129c1e0a233ef4eeb4ee27ac932", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c4fbd129c1e0a233ef4eeb4ee27ac932");
                            return;
                        }
                        Logw.e(Logw.TAG, "2nd batch start" + ProcessUtils.getCurrentProcessName());
                        ColdStartupService.isMissing = true;
                        ColdStartupService.trigger();
                        Logw.e(Logw.TAG, "2nd batch end" + ProcessUtils.getCurrentProcessName());
                    }
                }, delaySecondBatch, TimeUnit.SECONDS);
                scheduledExecutorService.schedule(new Runnable() { // from class: com.meituan.android.common.horn.ColdStartupService.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bdec5a2c1e51bbecde6f82892bae1262", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bdec5a2c1e51bbecde6f82892bae1262");
                            return;
                        }
                        Logw.e(Logw.TAG, "Clear Scratch File" + ProcessUtils.getCurrentProcessName());
                        ColdStartupService.clearScratchFile();
                        Logw.e(Logw.TAG, "Clear Scratch File" + ProcessUtils.getCurrentProcessName());
                    }
                }, delayClearCache, TimeUnit.SECONDS);
                Logw.e(Logw.TAG, "cold startup end~" + ProcessUtils.getCurrentProcessName());
            }
        } catch (Throwable th) {
            if (InnerHorn.isDebug && InnerHorn.isDebug) {
                th.printStackTrace();
            }
        }
    }

    public static void optPollCallback(String str, MsgCallback msgCallback) {
        Object[] objArr = {str, msgCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d0a414eb4f2c9198322416ad44051ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d0a414eb4f2c9198322416ad44051ee");
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            mStartupWrapper.put(str, new StartupWrapper(str, msgCallback));
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void trigger() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9894e3196986bddd2f674ffe4ea3f906", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9894e3196986bddd2f674ffe4ea3f906");
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            synchronized (mStartupWrapper) {
                for (Map.Entry<String, StartupWrapper> entry : mStartupWrapper.entrySet()) {
                    hashSet.add(entry.getKey());
                }
            }
            HornFetcherBatch.getInstance(InnerHorn.context).loadConfig(HornInfoHub.obtainMultiPollRequest(hashSet, "batch_coldstartup"));
            if (HornFetcherBatch.wasErrror) {
                synchronized (mStartupWrapper) {
                    for (Map.Entry<String, StartupWrapper> entry2 : mStartupWrapper.entrySet()) {
                        entry2.getValue().run();
                    }
                }
            }
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearScratchFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38248eb1894e8682b738d863c69a778c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38248eb1894e8682b738d863c69a778c");
            return;
        }
        try {
            synchronized (mStartupWrapper) {
                Set<Map.Entry<String, StartupWrapper>> entrySet = mStartupWrapper.entrySet();
                ArrayList<String> arrayList = new ArrayList<>();
                for (Map.Entry<String, StartupWrapper> entry : entrySet) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        arrayList.add(entry.getKey());
                    }
                }
                HornCacheCenter.getInstance(InnerHorn.context).clearScratchFile(arrayList);
            }
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
        }
    }

    private static void initColdStartupDelay() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a7297cc6c87713d05a32fa9aa0566f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a7297cc6c87713d05a32fa9aa0566f6");
            return;
        }
        switch (InnerHorn.getConfig().getDeviceLevel()) {
            case 1:
                delayFirstBatch = DEFAULT_FIRST_COLD_STARTUP_DELAY + 2;
                break;
            case 2:
                delayFirstBatch = DEFAULT_FIRST_COLD_STARTUP_DELAY + 1;
                break;
            case 3:
                delayFirstBatch = DEFAULT_FIRST_COLD_STARTUP_DELAY;
                break;
            default:
                delayFirstBatch = DEFAULT_FIRST_COLD_STARTUP_DELAY;
                break;
        }
        int i = delayFirstBatch + 4;
        delaySecondBatch = i;
        delayClearCache = i + 4;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class StartupWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public MsgCallback mCallback;
        private String mType;

        public StartupWrapper(String str, MsgCallback msgCallback) {
            Object[] objArr = {str, msgCallback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45dd60b75c4d4074fdfc35ea91f64857", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45dd60b75c4d4074fdfc35ea91f64857");
                return;
            }
            this.mType = str;
            this.mCallback = msgCallback;
        }

        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83b4fb259360d7dba5dc86515628a292", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83b4fb259360d7dba5dc86515628a292");
                return;
            }
            try {
                if (this.mCallback != null) {
                    this.mCallback.MsgArrives(0, this.mType, new HashMap());
                }
            } catch (Throwable th) {
                if (InnerHorn.isDebug) {
                    th.printStackTrace();
                }
            }
        }
    }
}
