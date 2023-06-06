package com.meituan.uuid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.unionid.UnionIdHelper;
import com.meituan.android.common.unionid.oneid.OneIdConstants;
import com.meituan.android.common.unionid.oneid.OneIdHelper;
import com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkHandler;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback2;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.aa;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UuidPrivacyHelper {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isRegisterPrivacyMode = false;
    private static volatile boolean whetherNeedChangeRequest = false;
    private static volatile boolean whetherUuidChangeRequestSend = false;
    private static final ExecutorService sUuidChangeExecutor = c.a("uuidChangeMode");
    private static boolean isRegisterNetworchangeReceiver = false;

    public static synchronized void registerPrivacyMode(final Context context) {
        e createPermissionGuard;
        synchronized (UuidPrivacyHelper.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29b90e4f7d952d6b39023c8365a1843e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29b90e4f7d952d6b39023c8365a1843e");
                return;
            }
            if (!isRegisterPrivacyMode && (createPermissionGuard = Privacy.createPermissionGuard()) != null) {
                createPermissionGuard.a(context, new aa() { // from class: com.meituan.uuid.UuidPrivacyHelper.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.privacy.interfaces.aa
                    public final boolean onPrivacyModeChanged(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a1066d74f093c7da3c2d5ec5c7818889", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a1066d74f093c7da3c2d5ec5c7818889")).booleanValue();
                        }
                        if (!z) {
                            boolean unused = UuidPrivacyHelper.whetherNeedChangeRequest = true;
                            UuidPrivacyHelper.sUuidChangeExecutor.execute(new Runnable() { // from class: com.meituan.uuid.UuidPrivacyHelper.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "26a2350152edcd8877b5bfe262090814", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "26a2350152edcd8877b5bfe262090814");
                                    } else {
                                        UuidPrivacyHelper.changeRequest(context);
                                    }
                                }
                            });
                        }
                        return true;
                    }
                });
            }
            isRegisterPrivacyMode = true;
            OneIdPrivacyHelper.setFromPrivateModeFlag(context);
            retryChange(context);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class NetworkStateReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af6e10b991ef92c8cac9fa0275fbb11b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af6e10b991ef92c8cac9fa0275fbb11b");
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && UuidPrivacyHelper.whetherNeedChangeRequest && !UuidPrivacyHelper.whetherUuidChangeRequestSend && AppUtil.getNetWorkAvailable(context)) {
                UuidPrivacyHelper.sUuidChangeExecutor.execute(new Runnable() { // from class: com.meituan.uuid.UuidPrivacyHelper.NetworkStateReceiver.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bfde262a7f820deae6b5a4b94af346c4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bfde262a7f820deae6b5a4b94af346c4");
                        } else {
                            UuidPrivacyHelper.changeRequest(context);
                        }
                    }
                });
            }
        }
    }

    private static void registerNetworchangeReceiver(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a3b6963a741ae65fdef55118b61f43b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a3b6963a741ae65fdef55118b61f43b");
        } else if (isRegisterNetworchangeReceiver) {
        } else {
            context.getApplicationContext().registerReceiver(new NetworkStateReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            isRegisterNetworchangeReceiver = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pair<String, String> changeRequest(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a27fe34dfa3ff78ff7920082cc3f710", 6917529027641081856L)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a27fe34dfa3ff78ff7920082cc3f710");
        }
        LogUtils.i("OneIdHelper", "changeRequestStart:" + whetherUuidChangeRequestSend);
        if (whetherUuidChangeRequestSend) {
            return new Pair<>("", "");
        }
        final DeviceInfo deviceInfo = new DeviceInfo(context);
        LogUtils.i("OneIdHelper", "changeRequestStart");
        OaidManager.getInstance().getOaid(context, new OaidCallback2() { // from class: com.meituan.uuid.UuidPrivacyHelper.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
            public final void onSuccuss(boolean z, String str, boolean z2) {
            }

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback2
            public final void onSuccuss(boolean z, String str, boolean z2, OaidManager.Source source) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), source};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eaefe75697f5b4e93a1db5115c60700f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eaefe75697f5b4e93a1db5115c60700f");
                    return;
                }
                LogUtils.i("OneIdHelper", "changeRequestStart getoaid onsuccess:" + str);
                DeviceInfo.this.oaid = str;
            }

            @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
            public final void onFail(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e49b315e188e1e1a979ee3d39654c51", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e49b315e188e1e1a979ee3d39654c51");
                    return;
                }
                LogUtils.i("OneIdHelper", "errMsg:" + str);
            }
        });
        registerNetworchangeReceiver(context);
        deviceInfo.lazyInit(context);
        LogUtils.i("OneIdHelper", "get realTimeOaid:" + deviceInfo.realTimeOaid);
        LogUtils.i("OneIdHelper", "get oaid:" + deviceInfo.oaid);
        deviceInfo.unionId = OneIdHelper.getMemoryCacheOneId();
        if (!TextUtils.isEmpty("")) {
            deviceInfo.oaidMsg = "";
        }
        deviceInfo.stat.monitorLog = MonitorManager.createNewMonitor(deviceInfo.stat, context, System.currentTimeMillis(), "uuid");
        if (TextUtils.isEmpty(deviceInfo.unionId)) {
            deviceInfo.unionId = UnionIdHelper.getUnionIdFromLocal(context, null);
        }
        deviceInfo.dpid = OneIdHelper.getMemoryCacheDpid();
        if (TextUtils.isEmpty(deviceInfo.dpid)) {
            deviceInfo.dpid = OneIdHelper.getDpidBySharePref(context);
        }
        deviceInfo.requiredId = "4";
        LogUtils.i("OneIdHelper", "request 11111");
        Pair<String, String> request = OneIdNetworkHandler.request(context, OneIdConstants.ONE_ID_BASE_URL + OneIdConstants.ONE_ID_CHANGE, deviceInfo, OneIdNetworkTool.PUT, 3);
        String convertResponsePair = OneIdHelper.convertResponsePair(request, true);
        String convertResponsePair2 = OneIdHelper.convertResponsePair(request, false);
        UUIDSaveManager.getInstance().saveToCurrentApp(context, convertResponsePair);
        OneIdSharePref.getInstance(context).setOldUuid(convertResponsePair2);
        if (!TextUtils.isEmpty(convertResponsePair)) {
            GetUUID.sUUID = convertResponsePair;
            whetherUuidChangeRequestSend = true;
            OneIdSharePref.getInstance(context).setPrivateUuidChanged();
        }
        return new Pair<>(convertResponsePair, convertResponsePair2);
    }

    public static void retryChange(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "900b84d659b2a1335a32b6e25b739656", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "900b84d659b2a1335a32b6e25b739656");
        } else if (context == null || !"1".equals(OneIdSharePref.getInstance(context).getFromPrivatemodeFlag()) || OneIdPrivacyHelper.isPrivacyMode(context) || OneIdSharePref.getInstance(context).getPrivateUuidChanged()) {
        } else {
            changeRequest(context);
            whetherNeedChangeRequest = true;
        }
    }
}
