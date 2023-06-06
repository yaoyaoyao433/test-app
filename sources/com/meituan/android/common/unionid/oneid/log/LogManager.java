package com.meituan.android.common.unionid.oneid.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.android.common.unionid.oneid.util.ProcessUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogManager {
    private static volatile LogManager INSTANCE = null;
    private static final String TAG = "unionid-log";
    private static final long UPLOAD_INTERVAL = 20000;
    private static final int UPLOAD_NUMBER = 10;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean isExceedReportCount = false;
    private static boolean isInit = false;
    private static boolean isSend = false;
    private static boolean isSendFirst = false;
    private final List<JSONObject> dataList;
    private final Object dataLock;
    private Handler handler;
    private final ExecutorService logConsumer;
    private final ExecutorService logProducer;
    private Context mContext;
    private Runnable mSendRunnable;

    public static LogManager getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a49386359a04f8bd1d907937f581c0ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (LogManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a49386359a04f8bd1d907937f581c0ea");
        }
        if (INSTANCE == null) {
            synchronized (LogManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LogManager(context);
                }
            }
        }
        return INSTANCE;
    }

    public LogManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21eedf65b835c7d20c52a4006b80f9d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21eedf65b835c7d20c52a4006b80f9d2");
            return;
        }
        this.dataList = new CopyOnWriteArrayList();
        this.dataLock = new Object();
        this.mSendRunnable = new Runnable() { // from class: com.meituan.android.common.unionid.oneid.log.LogManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "81f0f84c25f5fb31c77e3dacc35c41b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "81f0f84c25f5fb31c77e3dacc35c41b5");
                } else {
                    LogManager.this.send();
                }
            }
        };
        this.logProducer = c.a("unionid-log-producer");
        this.logConsumer = c.a("unionid-log-consumer");
        this.handler = new Handler(Looper.getMainLooper());
        this.handler.postDelayed(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.log.LogManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c0bfe74622c6b7b6e813be8e927e9a6b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c0bfe74622c6b7b6e813be8e927e9a6b");
                } else {
                    boolean unused = LogManager.isSendFirst = true;
                }
            }
        }, UPLOAD_INTERVAL);
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }

    public void produceLog(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "639d709fdabdfdb8051b9ec44b83ff59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "639d709fdabdfdb8051b9ec44b83ff59");
        } else if (ProcessUtils.isMainProcess(this.mContext)) {
            this.logProducer.execute(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.log.LogManager.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "10620742bc23d40c88691a3e0c39282a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "10620742bc23d40c88691a3e0c39282a");
                    } else if (LogManager.this.mContext != null) {
                        long lastReportTime = OneIdSharePref.getInstance(LogManager.this.mContext).getLastReportTime();
                        if (!AppUtil.checkNaturalDayRefresh(lastReportTime)) {
                            boolean unused = LogManager.isExceedReportCount = AppUtil.isExceedReportCount(LogManager.this.mContext);
                        } else {
                            LogUtils.i(LogManager.TAG, "NaturalDayRefresh：" + lastReportTime);
                            boolean unused2 = LogManager.isExceedReportCount = false;
                            OneIdSharePref.getInstance(LogManager.this.mContext).saveLogReportCount(0);
                        }
                        if (!LogManager.isExceedReportCount && LogManager.this.handler != null) {
                            synchronized (LogManager.this.dataLock) {
                                LogManager.this.dataList.add(jSONObject);
                                boolean z = LogManager.this.dataList.size() >= 10;
                                LogUtils.i(LogManager.TAG, "run: " + LogManager.this.dataList.size());
                                LogManager.this.handler.removeCallbacks(LogManager.this.mSendRunnable);
                                if (!LogManager.isSendFirst || !z) {
                                    LogManager.this.handler.postDelayed(LogManager.this.mSendRunnable, LogManager.UPLOAD_INTERVAL);
                                } else {
                                    LogManager.this.send();
                                }
                            }
                            return;
                        }
                        LogUtils.i(LogManager.TAG, "isExceedReportCount");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void send() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc56f6358866078396d7de00b57143ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc56f6358866078396d7de00b57143ed");
        } else {
            this.logConsumer.execute(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.log.LogManager.4
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Removed duplicated region for block: B:42:0x00ff A[LOOP:0: B:17:0x0052->B:42:0x00ff, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:72:0x00fe A[SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 384
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.log.LogManager.AnonymousClass4.run():void");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshLogCountAndTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "834cc9f70cdd1a3626e49124a537d3f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "834cc9f70cdd1a3626e49124a537d3f7");
        } else if (this.mContext != null) {
            int logReportCount = OneIdSharePref.getInstance(this.mContext).getLogReportCount();
            int i = logReportCount + 1;
            OneIdSharePref.getInstance(this.mContext).saveLogReportCount(i);
            OneIdSharePref.getInstance(this.mContext).saveLastReportTime(System.currentTimeMillis());
            LogUtils.i(TAG, "reportCount: " + logReportCount + "  " + System.currentTimeMillis());
            isExceedReportCount = AppUtil.isExceedReportCount(i);
        }
    }

    public void logToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52d7ca5090dad9b08f2a8d0e8db0f56e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52d7ca5090dad9b08f2a8d0e8db0f56e");
        } else if (this.mContext == null || isSend || !ProcessUtils.isMainProcess(this.mContext) || !OneIdSharePref.getInstance(this.mContext).isTokenEnable()) {
        } else {
            c.a("uuid-logToken").execute(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.log.LogManager.5
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Removed duplicated region for block: B:39:0x0151 A[Catch: Throwable -> 0x017a, TRY_LEAVE, TryCatch #0 {Throwable -> 0x017a, blocks: (B:33:0x013e, B:35:0x0144, B:37:0x014a, B:39:0x0151), top: B:47:0x013e }] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0183 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:57:0x002c A[SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 393
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.log.LogManager.AnonymousClass5.run():void");
                }
            });
        }
    }

    public void logRT(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1559452141f0e2a353ba4d89eff34388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1559452141f0e2a353ba4d89eff34388");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("unionidVersion", AppUtil.getSdkVersion(this.mContext));
        Babel.logRT(new Log.Builder(str).optional(hashMap).tag("unionid-netwrok-log").generalChannelStatus(true).lv4LocalStatus(true).newLogStatus(true).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<Boolean, String> isReportNetworkData(String str) {
        int i;
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "415693b18412674acd0aab1f7836b518", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "415693b18412674acd0aab1f7836b518");
        }
        if (!TextUtils.isEmpty(str) && str.length() > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0));
                i = Integer.parseInt(sb.toString(), 16);
            } catch (Throwable unused) {
                i = -1;
            }
            LogUtils.i("xianeng", "localidCount:" + i + " localid:" + str);
            if (i != -1) {
                int i2 = i % 4;
                if (i2 == 1) {
                    str2 = "http://101.236.12.9/extension/network/update";
                } else if (i2 != 2) {
                    return new Pair<>(Boolean.FALSE, "https://api-unionid.meituan.com/extension/network/update");
                } else {
                    str2 = "http://103.37.142.166/extension/network/update";
                }
                return new Pair<>(Boolean.TRUE, str2);
            }
        }
        return new Pair<>(Boolean.FALSE, "https://api-unionid.meituan.com/extension/network/update");
    }
}
