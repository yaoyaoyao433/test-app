package com.meituan.android.common.horn;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.horn.HornRequest;
import com.meituan.android.common.horn.extra.sharkpush.ISharkPushService;
import com.meituan.android.common.horn.extra.uuid.IUUIDService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InnerHorn {
    private static final String SP_NAME = "HORN_DEBUG";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HornConfiguration config;
    public static Context context;
    private static volatile HornCacheCenter hornCacheCenter;
    private static volatile HornFetcher hornFetcher;
    private static volatile HornFetcherBatch hornFetcherBatch;
    private static q statistics;
    public static volatile String uuid;
    private static final CountDownLatch sConfigInitLatch = new CountDownLatch(1);
    private static volatile boolean isSharkPushInit = false;
    private static final AtomicBoolean sInited = new AtomicBoolean(false);
    private static final Executor singleExecutor = c.a("Horn-Horn");
    private static final HornCallback sPreloadCallback = new HornCallback() { // from class: com.meituan.android.common.horn.InnerHorn.2
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
        }
    };
    public static volatile boolean isDebug = false;
    public static volatile Map<String, Boolean> TYPE_MAP = new ConcurrentHashMap();
    public static volatile boolean isMock = false;
    private static final byte[] debugLock = new byte[0];
    private static volatile boolean needPoll = true;
    public static volatile boolean isApplicationRegister = false;

    private static void registerApplicationCallbackInner(@NonNull Application application) {
    }

    public static void initContext(Context context2) {
        Object[] objArr = {context2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5a024944bac98617a6a8404d61a4e14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5a024944bac98617a6a8404d61a4e14");
            return;
        }
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext != null) {
            context2 = applicationContext;
        }
        context = context2;
    }

    public static void initContext(Context context2, HornConfiguration hornConfiguration) {
        Object[] objArr = {context2, hornConfiguration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb6678128aab97f8dd233e828862aacb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb6678128aab97f8dd233e828862aacb");
        } else if (context2 == null || hornConfiguration == null || !sInited.compareAndSet(false, true)) {
        } else {
            initContext(context2);
            initConfig(hornConfiguration);
            costTimeInitActions();
            ColdStartupService.init();
            registerApplicationCallback(context2);
        }
    }

    public static void preload(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69ab2050a12c8f617a2a2e219c1400e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69ab2050a12c8f617a2a2e219c1400e4");
        } else if (strArr != null) {
            for (String str : strArr) {
                preload(str, null);
            }
        }
    }

    public static void preload(String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c806819bfc0b5677e4bd202154f3a11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c806819bfc0b5677e4bd202154f3a11");
        } else {
            preloadInner(str, map);
        }
    }

    public static HornFetcher obtainHornSingleFetch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cda7984e58bbc550b6e5f7e406ebb3ae", 6917529027641081856L)) {
            return (HornFetcher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cda7984e58bbc550b6e5f7e406ebb3ae");
        }
        if (hornFetcher == null) {
            hornFetcher = HornFetcher.getInstance(context);
        }
        return hornFetcher;
    }

    @NonNull
    public static HornConfiguration getConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ee89d7c425200510ad9231d09b719da", 6917529027641081856L)) {
            return (HornConfiguration) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ee89d7c425200510ad9231d09b719da");
        }
        waitUntilInit();
        return config;
    }

    private static void initConfig(@NonNull HornConfiguration hornConfiguration) {
        Object[] objArr = {hornConfiguration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73667ebcf3155c5960543d0b13736bdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73667ebcf3155c5960543d0b13736bdc");
            return;
        }
        config = hornConfiguration;
        sConfigInitLatch.countDown();
    }

    public static synchronized HornFetcherBatch obtainHornBatchFetch() {
        synchronized (InnerHorn.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2194798f9197b9f348096b40184528b8", 6917529027641081856L)) {
                return (HornFetcherBatch) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2194798f9197b9f348096b40184528b8");
            }
            if (hornFetcherBatch == null) {
                hornFetcherBatch = HornFetcherBatch.getInstance(context);
            }
            return hornFetcherBatch;
        }
    }

    public static synchronized HornCacheCenter obtainCacheCenter() {
        synchronized (InnerHorn.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b9e89c2e9b07b33bd7999dbefd6750d", 6917529027641081856L)) {
                return (HornCacheCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b9e89c2e9b07b33bd7999dbefd6750d");
            }
            if (hornCacheCenter == null) {
                hornCacheCenter = HornCacheCenter.getInstance(context);
            }
            return hornCacheCenter;
        }
    }

    public static void waitUntilInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf0d6352f7ab448ca3ba04738a918725", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf0d6352f7ab448ca3ba04738a918725");
            return;
        }
        try {
            sConfigInitLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void costTimeInitActions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95e284e85e4099fdd5f91957c501cd45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95e284e85e4099fdd5f91957c501cd45");
            return;
        }
        try {
            b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "581ee615670fb5e4cd6a1c7799cd778e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "581ee615670fb5e4cd6a1c7799cd778e");
                        return;
                    }
                    InnerHorn.sharkPushInit();
                    if (ProcessUtils.isMainProcess(InnerHorn.context) && InnerHorn.needPoll) {
                        HornScheduleService.init(InnerHorn.context);
                    }
                    InnerHorn.cacheInitTime();
                }
            });
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sharkPushInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "771653d672c96539707ec584df67d6e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "771653d672c96539707ec584df67d6e9");
            return;
        }
        try {
            if (ProcessUtils.isMainProcess(context) && !isSharkPushInit) {
                if (TextUtils.isEmpty(uuid) && config != null && config.uuidService() != null) {
                    uuid = config.uuidService().getUUID(context);
                }
                if (TextUtils.isEmpty(uuid)) {
                    return;
                }
                isSharkPushInit = SharkPushMgr.getInstance().init();
                System.out.println("SharkPushMgr init SUCCESS");
            }
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cacheInitTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "609d50be3e9daf5ded0ae9f606255139", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "609d50be3e9daf5ded0ae9f606255139");
            return;
        }
        try {
            HornCacheCenter obtainCacheCenter = obtainCacheCenter();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            obtainCacheCenter.cacheData(sb.toString(), obtainCacheCenter().getInitFile());
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
            }
        }
    }

    public static void register(String str, HornCallback hornCallback) {
        Object[] objArr = {str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93189bbd9654d8e559a746644ac4aee3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93189bbd9654d8e559a746644ac4aee3");
        } else {
            registerInner(str, hornCallback, null);
        }
    }

    public static void registerBinaryFile(String str, BlobCallback blobCallback) {
        Object[] objArr = {str, blobCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "909b63b7ae6e6699572099b5b4661499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "909b63b7ae6e6699572099b5b4661499");
        } else {
            registerInner(str, blobCallback, null);
        }
    }

    public static void register(String str, HornCallback hornCallback, Map<String, Object> map) {
        Object[] objArr = {str, hornCallback, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "510dda4eed3b92bc33b7cdd5f711e16c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "510dda4eed3b92bc33b7cdd5f711e16c");
        } else {
            registerInner(str, hornCallback, map);
        }
    }

    public static void registerBinaryFile(String str, BlobCallback blobCallback, Map<String, Object> map) {
        Object[] objArr = {str, blobCallback, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "041a1b40739a23802d3ec394a0626b96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "041a1b40739a23802d3ec394a0626b96");
        } else {
            registerInner(str, blobCallback, map);
        }
    }

    private static synchronized void registerInner(String str, HornCallback hornCallback, Map<String, Object> map) {
        synchronized (InnerHorn.class) {
            Object[] objArr = {str, hornCallback, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab774e3a25d4efe3afde0d015658502b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab774e3a25d4efe3afde0d015658502b");
                return;
            }
            registerCallbackInner(str, hornCallback, map);
            costTimeActions();
            normalAction(str);
        }
    }

    public static boolean isPreloadCallback(@Nullable HornCallback hornCallback) {
        return hornCallback == sPreloadCallback;
    }

    private static synchronized void preloadInner(String str, Map<String, Object> map) {
        synchronized (InnerHorn.class) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c46f3efa5ca60159dd3464d162789834", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c46f3efa5ca60159dd3464d162789834");
                return;
            }
            registerCallbackInner(str, sPreloadCallback, map);
            normalAction(str);
        }
    }

    private static synchronized void registerCallbackInner(String str, HornCallback hornCallback, Map<String, Object> map) {
        synchronized (InnerHorn.class) {
            Object[] objArr = {str, hornCallback, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c3bb4f6aeb60d42beeb1e861630ba78", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c3bb4f6aeb60d42beeb1e861630ba78");
                return;
            }
            if (map == null) {
                map = new HashMap<>();
            }
            HornInfoHub.newInstance(str, hornCallback, map);
            if (ProcessUtils.isMainProcess(context) && needPoll) {
                HornScheduleService.optPollCallback(str, new MsgCallback() { // from class: com.meituan.android.common.horn.InnerHorn.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.horn.MsgCallback
                    public final void MsgArrives(int i, String str2, Map<String, Object> map2) {
                        Object[] objArr2 = {Integer.valueOf(i), str2, map2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5f1b894c0a9a66dba3f9a630a3b9405c", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5f1b894c0a9a66dba3f9a630a3b9405c");
                        } else {
                            InnerHorn.loadConfigPoll(str2);
                        }
                    }
                });
            }
            if (ProcessUtils.isMainProcess(context)) {
                SharkPushMgr.getInstance().optPushCallback(str, new MsgCallback() { // from class: com.meituan.android.common.horn.InnerHorn.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.horn.MsgCallback
                    public final void MsgArrives(int i, String str2, Map<String, Object> map2) {
                        Object[] objArr2 = {Integer.valueOf(i), str2, map2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "480c380ae54e1b657478fd7715bd0475", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "480c380ae54e1b657478fd7715bd0475");
                        } else {
                            InnerHorn.loadWithSharkPush(str2, map2);
                        }
                    }
                });
            }
            HornPushService.optPushCallback(str, new MsgCallback() { // from class: com.meituan.android.common.horn.InnerHorn.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.MsgCallback
                public final void MsgArrives(int i, String str2, Map<String, Object> map2) {
                    Object[] objArr2 = {Integer.valueOf(i), str2, map2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "72c0bcd5a9490317a59697658ffccf8c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "72c0bcd5a9490317a59697658ffccf8c");
                    } else {
                        InnerHorn.loadConfigPush(str2, map2);
                    }
                }
            });
        }
    }

    public static void invalidateCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d0e18049b5df52b806f207a52c18da5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d0e18049b5df52b806f207a52c18da5");
        } else if (HornUtils.isHighPriorityProcess(context)) {
            HornInfoHub.invalidateCache(str);
        }
    }

    private static void normalAction(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd4798029acf685b9b36ce4dc66dd0e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd4798029acf685b9b36ce4dc66dd0e9");
            return;
        }
        ColdStartupService.optPollCallback(str, new MsgCallback() { // from class: com.meituan.android.common.horn.InnerHorn.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.MsgCallback
            public final void MsgArrives(int i, String str2, Map<String, Object> map) {
                Object[] objArr2 = {Integer.valueOf(i), str2, map};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c088dc9ebba23e8cfd925657051af200", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c088dc9ebba23e8cfd925657051af200");
                } else {
                    InnerHorn.loadConfig(str2);
                }
            }
        });
        if (ColdStartupService.isMissing) {
            loadConfig(str);
        }
    }

    private static void costTimeActions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "908a6577bb0d7b59832fb8de68bf1f58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "908a6577bb0d7b59832fb8de68bf1f58");
            return;
        }
        try {
            b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ebd4a0c88d089b2863bc9e59ea3607e3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ebd4a0c88d089b2863bc9e59ea3607e3");
                        return;
                    }
                    InnerHorn.obtainBooleanValue(InnerHorn.context);
                    InnerHorn.sharkPushInit();
                }
            });
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void configBooleanValue(Context context2, String str, boolean z) {
        Object[] objArr = {context2, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58abd5c5a0287d8d5287ba13c1ace705", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58abd5c5a0287d8d5287ba13c1ace705");
            return;
        }
        try {
            synchronized (debugLock) {
                if (statistics == null) {
                    statistics = q.a(context2, "HORN_DEBUG", 2);
                }
                statistics.a(str, z);
            }
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
            }
        }
    }

    public static void obtainBooleanValue(Context context2) {
        Object[] objArr = {context2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19c16ed17dc98f090d87817df6e8ec56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19c16ed17dc98f090d87817df6e8ec56");
            return;
        }
        try {
            synchronized (debugLock) {
                if (statistics == null) {
                    statistics = q.a(context2, "HORN_DEBUG", 2);
                }
                isDebug = statistics.b("horn_debug", false);
                isMock = statistics.b("horn_mock", false);
                Map<String, ?> b = statistics.b();
                if (b == null) {
                    return;
                }
                for (Map.Entry<String, ?> entry : b.entrySet()) {
                    if ((entry.getValue() instanceof Boolean) && !"horn_mock".equals(entry.getKey())) {
                        TYPE_MAP.put(entry.getKey(), (Boolean) entry.getValue());
                    }
                }
            }
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
            }
        }
    }

    public static boolean isMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f059042be4830714eaf1c5a0b751523", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f059042be4830714eaf1c5a0b751523")).booleanValue() : Looper.getMainLooper() == Looper.myLooper();
    }

    public static void debug(final Context context2, final boolean z) {
        Object[] objArr = {context2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d7ae0ab1a53dffa186a914af1bcd2fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d7ae0ab1a53dffa186a914af1bcd2fb");
        } else if (context2 == null) {
        } else {
            isDebug = z;
            if (isMainThread()) {
                b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.8
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5137db4d563abd6dffd5b1791c712f75", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5137db4d563abd6dffd5b1791c712f75");
                        } else {
                            InnerHorn.configBooleanValue(context2, "horn_debug", z);
                        }
                    }
                });
            } else {
                configBooleanValue(context2, "horn_debug", z);
            }
        }
    }

    public static synchronized void debug(final Context context2, final String str, final boolean z) {
        synchronized (InnerHorn.class) {
            Object[] objArr = {context2, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b51b05fd3a982772cea073969dcee374", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b51b05fd3a982772cea073969dcee374");
            } else if (context2 == null) {
            } else {
                TYPE_MAP.put(str, Boolean.valueOf(z));
                if (isMainThread()) {
                    b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.9
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ed6a247c5b4dd8661e60d81f82b540e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ed6a247c5b4dd8661e60d81f82b540e");
                            } else {
                                InnerHorn.configBooleanValue(context2, str, z);
                            }
                        }
                    });
                } else {
                    configBooleanValue(context2, str, z);
                }
            }
        }
    }

    @AnyThread
    public static synchronized void clearCache(final Context context2, final String str) {
        synchronized (InnerHorn.class) {
            Object[] objArr = {context2, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e275acb94f2276f9a808edb8f055920e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e275acb94f2276f9a808edb8f055920e");
            } else if (context2 == null) {
            } else {
                if (isMainThread()) {
                    b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.10
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a4c4fcda55b15464749c9b4a85869c0", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a4c4fcda55b15464749c9b4a85869c0");
                                return;
                            }
                            HornCacheCenter.getInstance(context2).clearRequestTimeConfig(str);
                            HornCacheCenter.getInstance(context2).clearConfig(str, true);
                        }
                    });
                    return;
                }
                HornCacheCenter.getInstance(context2).clearRequestTimeConfig(str);
                HornCacheCenter.getInstance(context2).clearConfig(str, true);
            }
        }
    }

    public static void mock(Context context2, boolean z) {
        Object[] objArr = {context2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55125ee9daa1a6be0eba6cae86e07f76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55125ee9daa1a6be0eba6cae86e07f76");
        } else if (context2 == null) {
        } else {
            isMock = z;
            configBooleanValue(context2, "horn_mock", z);
        }
    }

    public static void accessCache(String str, HornCallback hornCallback) {
        Object[] objArr = {str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f281e850e84b0d2bb99166c15b8b0317", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f281e850e84b0d2bb99166c15b8b0317");
            return;
        }
        try {
            final HornRequest.Builder builder = new HornRequest.Builder(context);
            HashMap hashMap = new HashMap();
            hashMap.put("horn_source", "cache");
            builder.hornQueryMap(hashMap).callback(hornCallback).type(str);
            b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.11
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc4cd65cd868ef48365b2d1db12593fb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc4cd65cd868ef48365b2d1db12593fb");
                        return;
                    }
                    InnerHorn.obtainHornSingleFetch().loadConfig(HornRequest.Builder.this.build());
                }
            });
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
            }
        }
    }

    public static String accessCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8de4878ea6cf609bad00507fed88467d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8de4878ea6cf609bad00507fed88467d");
        }
        try {
            return obtainCacheCenter().obtainConfig(str);
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
                return "";
            }
            return "";
        }
    }

    public static void saveHornConfig(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e2f1f9d2e7d55527e28f8aa27099b7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e2f1f9d2e7d55527e28f8aa27099b7c");
        } else {
            b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.12
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8ac092e54a2c658dd8479d0f36c960a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8ac092e54a2c658dd8479d0f36c960a");
                    } else {
                        InnerHorn.hornCacheCenter.cacheDebugConfig(str, str2);
                    }
                }
            });
        }
    }

    public static String accessBinaryFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "767efc691224716e29caaeca40e2587c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "767efc691224716e29caaeca40e2587c");
        }
        try {
            return obtainCacheCenter().getBinaryFile(str).exists() ? obtainCacheCenter().getBinaryFile(str).getAbsolutePath() : "";
        } catch (Throwable th) {
            if (isDebug) {
                th.printStackTrace();
                return "";
            }
            return "";
        }
    }

    private static void loadConfigLocal(final HornRequest hornRequest) {
        Object[] objArr = {hornRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9c91ec0c617498f383c1eaf10951be1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9c91ec0c617498f383c1eaf10951be1");
            return;
        }
        try {
            b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.13
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8bbd4d0f73f9e7eed4aacd77df0bfa30", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8bbd4d0f73f9e7eed4aacd77df0bfa30");
                    } else {
                        InnerHorn.obtainHornSingleFetch().loadConfig(HornRequest.this);
                    }
                }
            });
        } catch (Exception e) {
            if (isDebug) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadWithSharkPush(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a2b8cf05be15200e07f85f5f9a9bea8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a2b8cf05be15200e07f85f5f9a9bea8");
        } else {
            loadConfigLocal(HornInfoHub.obtainSingleRequest(str, map, "sharkpush"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadConfigPush(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3568c9658c63fd6082c29dc6d2941d04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3568c9658c63fd6082c29dc6d2941d04");
        } else {
            loadConfigLocal(HornInfoHub.obtainSingleRequest(str, map, "push"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbc6474b9501457ffd7430a6cf3e6f4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbc6474b9501457ffd7430a6cf3e6f4c");
        } else {
            loadConfigLocal(HornInfoHub.obtainSingleRequest(str, null, "coldstartup"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadConfigPoll(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eeac832db898316545fa9130df905e81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eeac832db898316545fa9130df905e81");
        } else {
            loadConfigLocal(HornInfoHub.obtainSingleRequest(str, null, "poll"));
        }
    }

    public static void disablePoll() {
        needPoll = false;
    }

    private static void registerApplicationCallback(Context context2) {
        Object[] objArr = {context2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a21077fa7a17fb416691ccdc2b88eb02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a21077fa7a17fb416691ccdc2b88eb02");
        } else if (isApplicationRegister || !ProcessUtils.isMainProcess(context2) || config == null) {
        } else {
            if (context2 instanceof Application) {
                registerApplicationCallbackInner((Application) context2);
                isApplicationRegister = true;
                return;
            }
            Context applicationContext = context2.getApplicationContext();
            if (applicationContext instanceof Application) {
                registerApplicationCallbackInner((Application) applicationContext);
                isApplicationRegister = true;
            }
        }
    }

    public static String getSdkVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f84cd488aafef7e867f493feee71b882", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f84cd488aafef7e867f493feee71b882") : HornUtils.getSdkVersion();
    }

    public static synchronized void setUUIDService(final IUUIDService iUUIDService) {
        synchronized (InnerHorn.class) {
            Object[] objArr = {iUUIDService};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c22e7655b811a22e42aa13b51c79a2a7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c22e7655b811a22e42aa13b51c79a2a7");
            } else if (config == null) {
                initConfig(new HornConfiguration() { // from class: com.meituan.android.common.horn.InnerHorn.14
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.horn.HornConfiguration
                    public final IUUIDService uuidService() {
                        return IUUIDService.this;
                    }
                });
            } else {
                config.setUUIDService(iUUIDService);
            }
        }
    }

    public static synchronized void setSharkPushService(final ISharkPushService iSharkPushService) {
        synchronized (InnerHorn.class) {
            Object[] objArr = {iSharkPushService};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0dae99fe445c8edba024039a42f5b87e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0dae99fe445c8edba024039a42f5b87e");
                return;
            }
            if (config == null) {
                initConfig(new HornConfiguration() { // from class: com.meituan.android.common.horn.InnerHorn.15
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.horn.HornConfiguration
                    public final ISharkPushService sharkPushService() {
                        return ISharkPushService.this;
                    }
                });
            } else {
                config.setSharkPushService(iSharkPushService);
            }
            b.a(singleExecutor, new Runnable() { // from class: com.meituan.android.common.horn.InnerHorn.16
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9db225d631490ae323526843b5bb0f2e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9db225d631490ae323526843b5bb0f2e");
                    } else {
                        InnerHorn.sharkPushInit();
                    }
                }
            });
        }
    }
}
