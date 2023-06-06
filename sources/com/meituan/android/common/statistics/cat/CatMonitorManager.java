package com.meituan.android.common.statistics.cat;

import android.content.Context;
import com.google.gson.Gson;
import com.meituan.android.common.aidata.feature.persona.PersonaManager;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.ad.MidasData;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.tencent.smtt.sdk.TbsReaderView;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CatMonitorManager {
    private static final String AD_REPORT_STATUS = "adreportstatus";
    private static final String BLUE_CACHE_LOSS = "lxsdk_aidata_loss";
    private static final String BLUE_CACHE_TIMEOUT = "lxsdk_aidata_timeout";
    private static final String COMMAND = "lxapi";
    private static final String DB_DELETE_FAILED = "lxdeleterowfailed";
    private static final String HTTPS_ERROR = "lxhttpserror";
    private static final String JSON_FAILED = "lxjsonpackage";
    private static final String LX_GET_TAG_TIME = "lxsdk_get_tag_time";
    private static final String LX_INIT_TIME = "lxsdk_init_time";
    private static final String LX_INSERT_PAGE_NAME_TIME = "lxsdk_insert_page_name_time";
    private static final String LX_SET_TAG_TIME = "lxsdk_set_tag_time";
    private static final String MATCH_HORN_CHILD_PROCESS_STATE = "lxhornchildprocstate";
    private static final String MATCH_HORN_CONFIG_DURATION = "lxmatchhornconfig";
    private static final String MATCH_HORN_UPDATE_REPORT = "lxhornupdateconfig";
    private static final String MP_BUILD_CONNECT_DURATION = "lxmpbuildduration";
    private static final String MP_BUILD_CONNECT_STATUS = "lxmpconnectstatus";
    private static final String MP_SEND_DURATION = "lxmpsendConnectStatus";
    private static final String NETWORK_REPORT_REQUEST = "lxsendrequest";
    private static final String OCEAN_BLACK_LIST = "lxblacklist";
    private static final String OCEAN_BLACK_LIST_FAILED = "lxblacklistfailed";
    private static final String OCEAN_DOWNLOAD = "lxdownload";
    private static final String OCEAN_DOWNLOAD_FAILED = "lxdownloadfailed";
    private static final String READ_HORN_FILE_DURATION = "lxreadhornfile";
    public static final int UNKNOWN_ERROR_CODE = -201;
    private static final String UPDATE_HORN_FILE_NUM = "lxupdatehornfile";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ExecutorService mCatExecutorService;
    private CatMonitorService mCatMonitorService;
    private Context mContext;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        public static CatMonitorManager STUB = new CatMonitorManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public CatMonitorManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de2e4a19b1af34a53bacd0d7a4faf224", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de2e4a19b1af34a53bacd0d7a4faf224");
            return;
        }
        this.mCatMonitorService = null;
        this.mContext = null;
    }

    public static CatMonitorManager getInstance() {
        return InnerClass.STUB;
    }

    public synchronized void initCat(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d32586445a9a3e45b60d6a517f1d4a41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d32586445a9a3e45b60d6a517f1d4a41");
            return;
        }
        if (this.mCatMonitorService == null) {
            this.mContext = context.getApplicationContext();
            this.mCatMonitorService = new CatMonitorService(context, i);
            this.mCatExecutorService = c.a("cat_monitor");
        }
    }

    public void startService(final String str, final String str2, final int i, final int i2, final int i3, final long j, final String str3, final int i4) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), str3, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54d78b43165fac9d317dce9859361405", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54d78b43165fac9d317dce9859361405");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r14 = this;
                        r0 = 0
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.statistics.cat.CatMonitorManager.AnonymousClass1.changeQuickRedirect
                        java.lang.String r10 = "adb49b4fa76b803bc3979802bea7f86b"
                        r4 = 0
                        r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                        r1 = r8
                        r2 = r14
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L18
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r14, r9, r0, r10)
                        return
                    L18:
                        java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L3e
                        java.lang.String r2 = r2     // Catch: java.lang.Throwable -> L3e
                        r1.<init>(r2)     // Catch: java.lang.Throwable -> L3e
                        java.lang.String r2 = "http"
                        java.lang.String r3 = r1.getProtocol()     // Catch: java.lang.Throwable -> L3e
                        boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L3e
                        if (r2 == 0) goto L2d
                        goto L3e
                    L2d:
                        java.lang.String r2 = "https"
                        java.lang.String r1 = r1.getProtocol()     // Catch: java.lang.Throwable -> L3e
                        boolean r1 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L3e
                        if (r1 == 0) goto L3c
                        r0 = 8
                    L3c:
                        r6 = r0
                        goto L3f
                    L3e:
                        r6 = 0
                    L3f:
                        int r0 = r3
                        if (r0 <= 0) goto L63
                        com.meituan.android.common.statistics.cat.CatMonitorManager r0 = com.meituan.android.common.statistics.cat.CatMonitorManager.this
                        com.meituan.android.common.statistics.cat.CatMonitorService r1 = com.meituan.android.common.statistics.cat.CatMonitorManager.access$100(r0)
                        long r2 = java.lang.System.currentTimeMillis()
                        java.lang.String r4 = r4
                        r5 = 0
                        int r7 = r5
                        int r8 = r6
                        int r9 = r7
                        long r10 = r8
                        int r10 = (int) r10
                        java.lang.String r11 = ""
                        java.lang.String r12 = r10
                        int r13 = r3
                        r1.pv4(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                        return
                    L63:
                        com.meituan.android.common.statistics.cat.CatMonitorManager r0 = com.meituan.android.common.statistics.cat.CatMonitorManager.this
                        com.meituan.android.common.statistics.cat.CatMonitorService r1 = com.meituan.android.common.statistics.cat.CatMonitorManager.access$100(r0)
                        long r2 = java.lang.System.currentTimeMillis()
                        java.lang.String r4 = r4
                        r5 = 0
                        int r7 = r5
                        int r8 = r6
                        int r9 = r7
                        long r10 = r8
                        int r10 = (int) r10
                        java.lang.String r11 = ""
                        java.lang.String r12 = r10
                        r1.pv4(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.cat.CatMonitorManager.AnonymousClass1.run():void");
                }
            });
        }
    }

    public void reportJsonPackFailed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ac7d2dff6a34b504b33f7a86df9f5d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ac7d2dff6a34b504b33f7a86df9f5d8");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ff941fc083096d4cf9db53dda3a1977", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ff941fc083096d4cf9db53dda3a1977");
                    } else {
                        CatMonitorManager.this.mCatMonitorService.pv3(System.currentTimeMillis(), CatMonitorManager.JSON_FAILED, 0, 0, 0, 0, 0, 0, "", 100);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportDeleteDbLogFailed(java.util.List<com.meituan.android.common.statistics.cache.ICacheHandler.Event> r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.statistics.cat.CatMonitorManager.changeQuickRedirect
            java.lang.String r10 = "6a551b52064951cc329d131cc91f507c"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1b:
            com.meituan.android.common.statistics.cat.CatMonitorService r0 = r11.mCatMonitorService
            if (r0 == 0) goto L52
            r0 = 0
            if (r12 == 0) goto L29
            java.lang.Object r12 = r12.get(r8)
            com.meituan.android.common.statistics.cache.ICacheHandler$Event r12 = (com.meituan.android.common.statistics.cache.ICacheHandler.Event) r12
            goto L2a
        L29:
            r12 = r0
        L2a:
            if (r12 == 0) goto L43
            org.json.JSONObject r12 = r12.getEnvironment()     // Catch: java.lang.Exception -> L3a org.json.JSONException -> L3f
            java.lang.String r1 = "union_id"
            java.lang.Object r12 = r12.get(r1)     // Catch: java.lang.Exception -> L3a org.json.JSONException -> L3f
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> L3a org.json.JSONException -> L3f
            goto L44
        L3a:
            r12 = move-exception
            r12.printStackTrace()
            goto L43
        L3f:
            r12 = move-exception
            r12.printStackTrace()
        L43:
            r12 = r0
        L44:
            java.util.concurrent.ExecutorService r0 = r11.mCatExecutorService
            if (r0 == 0) goto L52
            java.util.concurrent.ExecutorService r0 = r11.mCatExecutorService
            com.meituan.android.common.statistics.cat.CatMonitorManager$3 r1 = new com.meituan.android.common.statistics.cat.CatMonitorManager$3
            r1.<init>()
            r0.execute(r1)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.cat.CatMonitorManager.reportDeleteDbLogFailed(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportNetworkReport(java.lang.String r22, com.sankuai.meituan.retrofit2.ak r23, com.sankuai.meituan.retrofit2.Response<com.meituan.android.common.statistics.network.NetworkController.RealResponse> r24, long r25) {
        /*
            r21 = this;
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10 = 0
            r2[r10] = r22
            r3 = 1
            r2[r3] = r23
            r3 = 2
            r2[r3] = r24
            java.lang.Long r3 = new java.lang.Long
            r14 = r25
            r3.<init>(r14)
            r4 = 3
            r2[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.common.statistics.cat.CatMonitorManager.changeQuickRedirect
            java.lang.String r13 = "0214cd02f4c5d813371ee08701bf8466"
            r6 = 0
            r8 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r3 = r2
            r4 = r21
            r5 = r11
            r7 = r13
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L2e
            r3 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r11, r10, r13)
            return
        L2e:
            r3 = r21
            r2 = -201(0xffffffffffffff37, float:NaN)
            if (r24 == 0) goto L4f
            int r2 = r24.b()
            java.lang.Object r4 = r24.e()
            if (r4 == 0) goto L4f
            java.lang.Object r1 = r24.e()
            com.meituan.android.common.statistics.network.NetworkController$RealResponse r1 = (com.meituan.android.common.statistics.network.NetworkController.RealResponse) r1
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            r16 = r1
            goto L51
        L4f:
            r16 = 0
        L51:
            if (r23 == 0) goto L58
            long r0 = r23.contentLength()     // Catch: java.lang.Throwable -> L58
            int r10 = (int) r0
        L58:
            r21.initCatIfNecessary()
            java.lang.String r13 = "lxsendrequest"
            r19 = 0
            r20 = 1
            r11 = r21
            r12 = r22
            r14 = r2
            r15 = r10
            r17 = r25
            r11.startService(r12, r13, r14, r15, r16, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.cat.CatMonitorManager.reportNetworkReport(java.lang.String, com.sankuai.meituan.retrofit2.ak, com.sankuai.meituan.retrofit2.Response, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportHttpsError(java.lang.String r22, com.sankuai.meituan.retrofit2.ak r23, com.sankuai.meituan.retrofit2.Response<com.meituan.android.common.statistics.network.NetworkController.RealResponse> r24, long r25, java.lang.String r27) {
        /*
            r21 = this;
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10 = 0
            r2[r10] = r22
            r3 = 1
            r2[r3] = r23
            r3 = 2
            r2[r3] = r24
            java.lang.Long r3 = new java.lang.Long
            r14 = r25
            r3.<init>(r14)
            r4 = 3
            r2[r4] = r3
            r3 = 4
            r2[r3] = r27
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.common.statistics.cat.CatMonitorManager.changeQuickRedirect
            java.lang.String r13 = "712a27666922dbaedf632645046af128"
            r6 = 0
            r8 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r3 = r2
            r4 = r21
            r5 = r11
            r7 = r13
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L31
            r3 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r11, r10, r13)
            return
        L31:
            r3 = r21
            r2 = -201(0xffffffffffffff37, float:NaN)
            if (r24 == 0) goto L52
            int r2 = r24.b()
            java.lang.Object r4 = r24.e()
            if (r4 == 0) goto L52
            java.lang.Object r1 = r24.e()
            com.meituan.android.common.statistics.network.NetworkController$RealResponse r1 = (com.meituan.android.common.statistics.network.NetworkController.RealResponse) r1
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            r16 = r1
            goto L54
        L52:
            r16 = 0
        L54:
            if (r23 == 0) goto L5b
            long r0 = r23.contentLength()     // Catch: java.lang.Throwable -> L5b
            int r10 = (int) r0
        L5b:
            java.lang.String r13 = "lxhttpserror"
            r20 = 100
            r11 = r21
            r12 = r22
            r14 = r2
            r15 = r10
            r17 = r25
            r19 = r27
            r11.startService(r12, r13, r14, r15, r16, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.cat.CatMonitorManager.reportHttpsError(java.lang.String, com.sankuai.meituan.retrofit2.ak, com.sankuai.meituan.retrofit2.Response, long, java.lang.String):void");
    }

    @Deprecated
    public synchronized void terminate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bad42d343589a6923fb528cdec757f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bad42d343589a6923fb528cdec757f6");
            return;
        }
        synchronized (this) {
            if (this.mCatExecutorService != null) {
                this.mCatExecutorService.shutdown();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void startCatMonitorService(java.lang.String r22, com.sankuai.meituan.retrofit2.ak r23, com.sankuai.meituan.retrofit2.Response<com.meituan.android.common.statistics.network.NetworkController.RealResponse> r24, long r25) {
        /*
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10 = 0
            r2[r10] = r22
            r11 = 1
            r2[r11] = r23
            r3 = 2
            r2[r3] = r24
            java.lang.Long r3 = new java.lang.Long
            r14 = r25
            r3.<init>(r14)
            r4 = 3
            r2[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.android.common.statistics.cat.CatMonitorManager.changeQuickRedirect
            java.lang.String r8 = "1b9eedec4cb0ad67fd817b6941b88360"
            r4 = 0
            r6 = 1
            r16 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r3 = r2
            r5 = r13
            r7 = r8
            r10 = r8
            r8 = r16
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L2f
            r0 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r2, r0, r13, r11, r10)
            return
        L2f:
            r2 = -201(0xffffffffffffff37, float:NaN)
            if (r24 == 0) goto L4e
            int r2 = r24.b()
            java.lang.Object r3 = r24.e()
            if (r3 == 0) goto L4e
            java.lang.Object r1 = r24.e()
            com.meituan.android.common.statistics.network.NetworkController$RealResponse r1 = (com.meituan.android.common.statistics.network.NetworkController.RealResponse) r1
            java.lang.String r1 = r1.toString()
            int r10 = r1.length()
            r16 = r10
            goto L50
        L4e:
            r16 = 0
        L50:
            if (r23 == 0) goto L5a
            long r0 = r23.contentLength()     // Catch: java.lang.Throwable -> L5a
            int r10 = (int) r0
            r21 = r10
            goto L5c
        L5a:
            r21 = 0
        L5c:
            com.meituan.android.common.statistics.cat.CatMonitorManager r11 = getInstance()
            java.lang.String r13 = "lxapi"
            r19 = 0
            r20 = -1
            r12 = r22
            r14 = r2
            r15 = r21
            r17 = r25
            r11.startService(r12, r13, r14, r15, r16, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.cat.CatMonitorManager.startCatMonitorService(java.lang.String, com.sankuai.meituan.retrofit2.ak, com.sankuai.meituan.retrofit2.Response, long):void");
    }

    public void reportReadHornFileDuration(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4051c429d0db2c4c550f7d1bc2ab3087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4051c429d0db2c4c550f7d1bc2ab3087");
            return;
        }
        synchronized (this) {
            LogUtil.log("cat record report read horn file time filepath:" + str + " fileLen:" + j + "duration:" + j2);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
                jSONObject.put(TbsReaderView.KEY_FILE_PATH, str);
                jSONObject.put("fileLen", j);
                jSONObject.put("duration", j2);
            } catch (Throwable unused) {
            }
            sendCatReport(READ_HORN_FILE_DURATION, jSONObject, -1, 100);
        }
    }

    public void reportHornFileUpdateNum(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29e7598ef9cb8a464e9fc762bbfab1dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29e7598ef9cb8a464e9fc762bbfab1dc");
            return;
        }
        synchronized (this) {
            LogUtil.log("cat record report update horn file num:" + str + " fileLen:" + j);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
                jSONObject.put(TbsReaderView.KEY_FILE_PATH, str);
                jSONObject.put("fileLen", j);
                jSONObject.put(RaptorConstants.JS_BATCH_NUM, 1);
            } catch (Throwable unused) {
            }
            sendCatReport(UPDATE_HORN_FILE_NUM, jSONObject, -1, 100);
        }
    }

    public void reportHornFlowMatchDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "780571875f585626e4343f0087919609", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "780571875f585626e4343f0087919609");
            return;
        }
        synchronized (this) {
            LogUtil.log("cat record flow intercept duration:" + j);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
                jSONObject.put("duration", j);
            } catch (Throwable unused) {
            }
            sendCatReport(MATCH_HORN_CONFIG_DURATION, jSONObject, -1, 1);
        }
    }

    public void reportHornConfigUpdate(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c090203970bb00bacc8d4b94526b717d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c090203970bb00bacc8d4b94526b717d");
            return;
        }
        synchronized (this) {
            LogUtil.log("cat record horn config file update:" + str + " cnf verison:" + str2);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
                jSONObject.put("type", str);
                jSONObject.put(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, str2);
                jSONObject.put("process", ProcessUtils.getCurrentProcessName(Statistics.getContext()));
            } catch (Throwable unused) {
            }
            sendCatReport(MATCH_HORN_UPDATE_REPORT, jSONObject, -1, 100);
        }
    }

    public void reportHornChildProcessStatus(String str, Boolean bool) {
        Object[] objArr = {str, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12b89a92a5270244696af2d9b3b40759", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12b89a92a5270244696af2d9b3b40759");
            return;
        }
        synchronized (this) {
            LogUtil.log("cat record horn chile process status: isSupportMulProc" + bool + " pn:" + ProcessUtils.getCurrentProcessName(Statistics.getContext()) + " tm:" + System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
                jSONObject.put("tm", System.currentTimeMillis());
                jSONObject.put("cnfv", str);
                jSONObject.put("supportMulProc", bool);
                jSONObject.put("process", ProcessUtils.getCurrentProcessName(Statistics.getContext()));
            } catch (Throwable unused) {
            }
            sendCatReport(MATCH_HORN_CHILD_PROCESS_STATE, jSONObject, -1, 100);
        }
    }

    public void reportConnectionBuildStatus(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a5c39837137738584fa1f5c9a238443", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a5c39837137738584fa1f5c9a238443");
            return;
        }
        synchronized (this) {
            LogUtil.log("cat multiprocess build status:" + i + " process:" + str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
                jSONObject.put("status", i);
                jSONObject.put("process", str);
            } catch (Throwable unused) {
            }
            sendCatReport(MP_BUILD_CONNECT_STATUS, jSONObject, i, 100);
        }
    }

    public void reportADReportStatus(boolean z, MidasData midasData, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), midasData, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecb23b216e986c5e7a18c795c8f41ae9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecb23b216e986c5e7a18c795c8f41ae9");
            return;
        }
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
                jSONObject.put("status", z);
                jSONObject.put("content", new Gson().toJson(midasData));
                jSONObject.put("process", str);
            } catch (Throwable unused) {
            }
            sendCatReport(AD_REPORT_STATUS, jSONObject, z ? 1 : 0, 100);
        }
    }

    public void reportConnectionBuildDuration(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2238879d245c838837233f6252d65d0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2238879d245c838837233f6252d65d0f");
            return;
        }
        synchronized (this) {
            LogUtil.log("cat multiprocess build: durationn:" + i + " process:" + str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
                jSONObject.put("duration", i);
                jSONObject.put("process", str);
            } catch (Throwable unused) {
            }
            sendCatReport(MP_BUILD_CONNECT_DURATION, jSONObject, i, 100);
        }
    }

    public void reportConnectionSendDuration(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f172a86425dc7b93331cac58628997a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f172a86425dc7b93331cac58628997a");
            return;
        }
        LogUtil.log("cat multiprocess send data code:" + i + " duration:" + i2 + " process:" + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unionid", StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment() != null ? StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment().get(Constants.Environment.KEY_UNION_ID) : "");
            jSONObject.put("code", i);
            jSONObject.put("duration", i2);
            jSONObject.put("process", str);
        } catch (Throwable unused) {
        }
        sendCatReport(MP_SEND_DURATION, jSONObject, i2, 100);
    }

    private void sendCatReport(final String str, final JSONObject jSONObject, final int i, final int i2) {
        Object[] objArr = {str, jSONObject, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b40b04e7322a82ecc5c2fb04a48b9c60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b40b04e7322a82ecc5c2fb04a48b9c60");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b0511b9454ba31ba25b11b47c63fc58", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b0511b9454ba31ba25b11b47c63fc58");
                    } else {
                        CatMonitorManager.this.mCatMonitorService.pv4(System.currentTimeMillis(), str, 0, 0, 0, 0, 0, i, "", jSONObject != null ? jSONObject.toString() : "", i2);
                    }
                }
            });
        }
    }

    public void reportLoss(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4623558b4d5ff255097584cb5be3853", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4623558b4d5ff255097584cb5be3853");
        } else {
            reportRaptor(BLUE_CACHE_LOSS, str, 100);
        }
    }

    public void reportTimeout(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76831f71ad32b2198a4d7b29ba5655ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76831f71ad32b2198a4d7b29ba5655ce");
        } else {
            reportRaptor(BLUE_CACHE_TIMEOUT, str, 100);
        }
    }

    public void reportSetTagTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "256d045654c4f4f62b68399a169ecbb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "256d045654c4f4f62b68399a169ecbb7");
        } else {
            reportTimeSpent(LX_SET_TAG_TIME, j);
        }
    }

    public void reportGetTagTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f2473b1282b2a0437f5c748e56664f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f2473b1282b2a0437f5c748e56664f");
        } else {
            reportTimeSpent(LX_GET_TAG_TIME, j);
        }
    }

    public void reportInsertPageNameTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7fe5bc4c78b5a134999993954269eb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7fe5bc4c78b5a134999993954269eb5");
        } else {
            reportTimeSpent(LX_INSERT_PAGE_NAME_TIME, j);
        }
    }

    private void reportTimeSpent(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd30385d6db53876c257274bbb0716a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd30385d6db53876c257274bbb0716a6");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_spent", j);
        } catch (Exception unused) {
        }
        reportRaptor(str, jSONObject.toString(), 1);
    }

    private void reportRaptor(final String str, final String str2, final int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d68c0114c64ad52e5d91d4cbcfe9cbcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d68c0114c64ad52e5d91d4cbcfe9cbcb");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba51713196792b0ce2516705dff768ee", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba51713196792b0ce2516705dff768ee");
                        return;
                    }
                    LogUtil.log("appId：" + CatMonitorManager.this.mCatMonitorService.getAppId() + "，" + str + "：" + str2);
                    CatMonitorManager.this.mCatMonitorService.pv4(System.currentTimeMillis(), str, 0, 0, 0, 0, 0, 0, "", str2 != null ? str2 : "", i);
                }
            });
        }
    }

    public void reportInitTime(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8d8e284aef9485c71f9d77121cc618d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8d8e284aef9485c71f9d77121cc618d");
            return;
        }
        initCatIfNecessary();
        final String name = Thread.currentThread().getName();
        if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
            return;
        }
        this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b1b44659ceb0d3639fe3765aa6e15e6d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b1b44659ceb0d3639fe3765aa6e15e6d");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("thread_name", name);
                    jSONObject.put("init_time", j);
                } catch (Exception unused) {
                }
                LogUtil.log("appId：" + CatMonitorManager.this.mCatMonitorService.getAppId() + "，lxsdk_init_time：" + jSONObject.toString());
                CatMonitorManager.this.mCatMonitorService.pv4(System.currentTimeMillis(), CatMonitorManager.LX_INIT_TIME, 0, 0, 0, 0, 0, 0, "", jSONObject.toString(), 1);
            }
        });
    }

    public void sendOceanBlackListRequest(final Response<ap> response) {
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de4e19c47d98b5c8497e243bc15e190e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de4e19c47d98b5c8497e243bc15e190e");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "abc507de663d79b99dfbde6fb5077667", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "abc507de663d79b99dfbde6fb5077667");
                    } else {
                        CatMonitorManager.this.mCatMonitorService.pv4(System.currentTimeMillis(), CatMonitorManager.OCEAN_BLACK_LIST, 0, 0, response != null ? response.b() : CatMonitorManager.UNKNOWN_ERROR_CODE, 0, 0, 0, "", "", 1);
                    }
                }
            });
        }
    }

    public void sendOceanBlackListFailedRequest(final Response<ap> response) {
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f40b6d5957d73b67cc829724541db0d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f40b6d5957d73b67cc829724541db0d6");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "383f90027025c6be972b8bddda86decd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "383f90027025c6be972b8bddda86decd");
                    } else {
                        CatMonitorManager.this.mCatMonitorService.pv4(System.currentTimeMillis(), CatMonitorManager.OCEAN_BLACK_LIST_FAILED, 0, 0, response != null ? response.b() : CatMonitorManager.UNKNOWN_ERROR_CODE, 0, 0, 0, "", "");
                    }
                }
            });
        }
    }

    public void sendOceanDownloadRequest(final Response<ap> response) {
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f291ff6a0e60fc503d875e50e71f92a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f291ff6a0e60fc503d875e50e71f92a");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f09d69937ffc6cb2d962c3eeb0bd59b8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f09d69937ffc6cb2d962c3eeb0bd59b8");
                    } else {
                        CatMonitorManager.this.mCatMonitorService.pv4(System.currentTimeMillis(), CatMonitorManager.OCEAN_DOWNLOAD, 0, 0, response != null ? response.b() : CatMonitorManager.UNKNOWN_ERROR_CODE, 0, 0, 0, "", "", 1);
                    }
                }
            });
        }
    }

    public void sendOceanDownloadFailedRequest(final Response<ap> response) {
        Object[] objArr = {response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fc280ab1e67100f231c7e93c79adb10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fc280ab1e67100f231c7e93c79adb10");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.statistics.cat.CatMonitorManager.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8417b90850ed34ca6e104c8b4a765e5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8417b90850ed34ca6e104c8b4a765e5");
                    } else {
                        CatMonitorManager.this.mCatMonitorService.pv4(System.currentTimeMillis(), CatMonitorManager.OCEAN_DOWNLOAD_FAILED, 0, 0, response != null ? response.b() : CatMonitorManager.UNKNOWN_ERROR_CODE, 0, 0, 0, "", "");
                    }
                }
            });
        }
    }

    private synchronized void initCatIfNecessary() {
        Context context;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d966224c4c2a2f274513a398d2b0a2a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d966224c4c2a2f274513a398d2b0a2a7");
            return;
        }
        LogUtil.log("initCatIfNecessary()");
        if (this.mCatMonitorService != null) {
            return;
        }
        Object reflectField = AppUtil.reflectField("com.dianping.monitor.impl.CatMonitorService", "monitorService");
        if (reflectField != null) {
            try {
                Field declaredField = reflectField.getClass().getDeclaredField("appId");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(reflectField);
                if (obj != null && (context = Statistics.getContext()) != null) {
                    initCat(context, ((Integer) obj).intValue());
                    LogUtil.log("initCatIfNecessary(), appId：" + obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
