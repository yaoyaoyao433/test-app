package com.meituan.android.common.unionid.oneid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.unionid.UnionIdHelper;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkHandler;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback2;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.android.common.unionid.oneid.util.ProcessUtils;
import com.meituan.android.common.unionid.oneid.util.TempIDGenerator;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.aa;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneIdPrivacyHelper {
    private static final String NORMAL_SUFFIX = ":normal";
    private static final String PRIVATE_SUFFIX = ":private";
    public static String SESSIONID = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isRegisterPrivacyMode = false;
    private static ExecutorService sDpidChangeExecutor = c.a("dpidChangeMode");
    private static boolean wheterUnionidChangeRequestSend = false;
    private static boolean whetherDpidChangeRequestSend = false;
    private static boolean isRegisterNetworchangeReceiver = false;
    public static boolean whetherNeedChangeRequest = false;

    public static String getSessionId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ebb1a0dc43c2de3622c71aaed88d3c40", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ebb1a0dc43c2de3622c71aaed88d3c40");
        }
        if (!TextUtils.isEmpty(SESSIONID)) {
            return SESSIONID;
        }
        return OneIdSharePref.getInstance(context).getSessionId();
    }

    private static String generateSessionId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6e38a96d5fc4e8f7b44537704a8c07e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6e38a96d5fc4e8f7b44537704a8c07e");
        }
        StringBuilder sb = new StringBuilder(TempIDGenerator.generate());
        if (isPrivacyMode(context)) {
            sb.append(PRIVATE_SUFFIX);
        } else {
            sb.append(NORMAL_SUFFIX);
        }
        SESSIONID = sb.toString();
        return sb.toString();
    }

    public static boolean isPrivateSessionId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d2dd292f7c61e87c15b14285f474fc4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d2dd292f7c61e87c15b14285f474fc4")).booleanValue();
        }
        String sessionId = OneIdSharePref.getInstance(context).getSessionId();
        return !TextUtils.isEmpty(sessionId) && sessionId.endsWith(PRIVATE_SUFFIX);
    }

    public static synchronized void registerPrivacyMode(final Context context) {
        synchronized (OneIdPrivacyHelper.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dfba15fd5255a576bcb564b63495cdc0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dfba15fd5255a576bcb564b63495cdc0");
                return;
            }
            if (!isRegisterPrivacyMode) {
                if (ProcessUtils.isMainProcess(context)) {
                    OneIdSharePref.getInstance(context).setSessionId(generateSessionId(context), true);
                }
                if (TextUtils.isEmpty(OneIdSharePref.getInstance(context).getLocalSessionId())) {
                    OneIdSharePref.getInstance(context).setLocalSessionId(TempIDGenerator.generate());
                }
                e createPermissionGuard = Privacy.createPermissionGuard();
                if (createPermissionGuard != null) {
                    createPermissionGuard.a(context, new aa() { // from class: com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.privacy.interfaces.aa
                        public final boolean onPrivacyModeChanged(boolean z) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "604f4e196ee6f7394466b9d760eceba4", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "604f4e196ee6f7394466b9d760eceba4")).booleanValue();
                            }
                            if (!z) {
                                OneIdPrivacyHelper.whetherNeedChangeRequest = true;
                                OneIdPrivacyHelper.changeFromPrivacyMode(context, "2");
                            }
                            return true;
                        }
                    });
                }
                isRegisterPrivacyMode = true;
            }
            setFromPrivateModeFlag(context);
            retryChange(context);
        }
    }

    public static void changeFromPrivacyMode(final Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30cebe4531d1af3e8c05b264433bedd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30cebe4531d1af3e8c05b264433bedd0");
        } else if (context == null) {
        } else {
            char c = 65535;
            if (str.hashCode() == 50 && str.equals("2")) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            sDpidChangeExecutor.execute(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ff515657298421a12660677e0ed9f4e1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ff515657298421a12660677e0ed9f4e1");
                    } else {
                        OneIdPrivacyHelper.changeRequest(context, str);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class NetworkStateReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c062fa434fde186a5d48a833418ec04", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c062fa434fde186a5d48a833418ec04");
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && OneIdPrivacyHelper.whetherNeedChangeRequest && !OneIdPrivacyHelper.whetherDpidChangeRequestSend && AppUtil.getNetWorkAvailable(context)) {
                OneIdPrivacyHelper.sDpidChangeExecutor.execute(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper.NetworkStateReceiver.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "54209237bc10baae80b2cdfb45c7a48f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "54209237bc10baae80b2cdfb45c7a48f");
                        } else {
                            OneIdPrivacyHelper.changeRequest(context, "2");
                        }
                    }
                });
            }
        }
    }

    private static void registerNetworchangeReceiver(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae683fb2a3d68e892b5e8b00ac9afda1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae683fb2a3d68e892b5e8b00ac9afda1");
        } else if (isRegisterNetworchangeReceiver) {
        } else {
            context.getApplicationContext().registerReceiver(new NetworkStateReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            isRegisterNetworchangeReceiver = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r12.equals("1") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean whetherChangeRequestSend(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper.changeQuickRedirect
            java.lang.String r11 = "c7767859fe04c6c35304803c624bce87"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L23:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case 49: goto L36;
                case 50: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L3f
        L2c:
            java.lang.String r0 = "2"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L3f
            r0 = 0
            goto L40
        L36:
            java.lang.String r2 = "1"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L3f
            goto L40
        L3f:
            r0 = -1
        L40:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L44;
                default: goto L43;
            }
        L43:
            return r9
        L44:
            boolean r12 = com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper.wheterUnionidChangeRequestSend
            return r12
        L47:
            boolean r12 = com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper.whetherDpidChangeRequestSend
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper.whetherChangeRequestSend(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pair<String, String> changeRequest(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0695c40854b2014d993e255c6cabb0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0695c40854b2014d993e255c6cabb0e");
        }
        if (whetherChangeRequestSend(str)) {
            return new Pair<>("", "");
        }
        final DeviceInfo deviceInfo = new DeviceInfo(context);
        LogUtils.i("OneIdHelper", "changeRequestStart");
        OaidManager.getInstance().getOaid(context, new OaidCallback2() { // from class: com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
            public final void onSuccuss(boolean z, String str2, boolean z2) {
            }

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback2
            public final void onSuccuss(boolean z, String str2, boolean z2, OaidManager.Source source) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), source};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e828aeddc443f8ede68f08020e71d6bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e828aeddc443f8ede68f08020e71d6bc");
                    return;
                }
                LogUtils.i("OneIdHelper", "changeRequestStart getoaid onsuccess:" + str2);
                DeviceInfo.this.oaid = str2;
            }

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
            public final void onFail(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e09f7c61d331e949f4fb8af42f808a03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e09f7c61d331e949f4fb8af42f808a03");
                    return;
                }
                LogUtils.i("OneIdHelper", "errMsg:" + str2);
            }
        });
        registerNetworchangeReceiver(context);
        deviceInfo.lazyInit(context);
        LogUtils.i("OneIdHelper", "get realTimeOaid:" + deviceInfo.realTimeOaid);
        LogUtils.i("OneIdHelper", "get oaid:" + deviceInfo.oaid);
        deviceInfo.unionId = OneIdHelper.sUnionId;
        if (!TextUtils.isEmpty("")) {
            deviceInfo.oaidMsg = "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                deviceInfo.stat.monitorLog = MonitorManager.createNewMonitor(deviceInfo.stat, context, System.currentTimeMillis(), "unionId");
                break;
            case 1:
                deviceInfo.stat.monitorLog = MonitorManager.createNewMonitor(deviceInfo.stat, context, System.currentTimeMillis(), "dpid");
                break;
        }
        if (TextUtils.isEmpty(deviceInfo.unionId)) {
            deviceInfo.unionId = UnionIdHelper.getUnionIdFromLocal(context, null);
        }
        deviceInfo.dpid = OneIdHandler.DPID;
        if (TextUtils.isEmpty(OneIdHandler.DPID)) {
            deviceInfo.dpid = OneIdHelper.getDpidBySharePref(context);
        }
        deviceInfo.requiredId = str;
        LogUtils.i("OneIdHelper", "request 11111");
        Pair<String, String> request = OneIdNetworkHandler.request(context, OneIdConstants.ONE_ID_BASE_URL + OneIdConstants.ONE_ID_CHANGE, deviceInfo, OneIdNetworkTool.PUT, 3);
        String convertResponsePair = OneIdHelper.convertResponsePair(request, true);
        String convertResponsePair2 = OneIdHelper.convertResponsePair(request, false);
        updateCache(context, convertResponsePair, convertResponsePair2, str);
        return new Pair<>(convertResponsePair, convertResponsePair2);
    }

    private static void updateCache(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "59008b19974087767337a0fff7037f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "59008b19974087767337a0fff7037f0a");
            return;
        }
        char c = 65535;
        if (str3.hashCode() == 50 && str3.equals("2")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        OneIdHelper.saveDpid(str);
        OneIdSharePref.getInstance(context).setOldDpid(str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        OneIdHandler.DPID = str;
        whetherDpidChangeRequestSend = true;
        OneIdSharePref.getInstance(context).setPrivateDpidChanged();
    }

    public static String getPrivacyMode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c0819eef3b5f1afd7da098cdd044dc9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c0819eef3b5f1afd7da098cdd044dc9") : isPrivacyMode(context) ? "1" : "0";
    }

    public static boolean isPrivateChain(DeviceInfo deviceInfo) {
        Object[] objArr = {deviceInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27ef0d88068d30f8136b2f287923aa84", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27ef0d88068d30f8136b2f287923aa84")).booleanValue() : deviceInfo == null || "1".equals(deviceInfo.privacy);
    }

    public static boolean isPrivacyMode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "010449bb69dc815ab49c52197e29931e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "010449bb69dc815ab49c52197e29931e")).booleanValue();
        }
        e createPermissionGuard = Privacy.createPermissionGuard();
        if (context == null || createPermissionGuard == null) {
            return true;
        }
        return createPermissionGuard.a(context);
    }

    public static void setFromPrivateModeFlag(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3caa3ae4e74f43888e47035e186ffb36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3caa3ae4e74f43888e47035e186ffb36");
        } else if (context != null && isPrivacyMode(context) && "-1".equals(OneIdSharePref.getInstance(context).getFromPrivatemodeFlag())) {
            OneIdSharePref.getInstance(context).setFromPrivateModeFlag();
        }
    }

    public static void retryChange(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ed56847a96025d8ee448a699311364cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ed56847a96025d8ee448a699311364cf");
        } else if (context == null || !"1".equals(OneIdSharePref.getInstance(context).getFromPrivatemodeFlag()) || isPrivacyMode(context) || OneIdSharePref.getInstance(context).getPrivateDpidChanged()) {
        } else {
            changeRequest(context, "2");
            whetherNeedChangeRequest = true;
        }
    }
}
