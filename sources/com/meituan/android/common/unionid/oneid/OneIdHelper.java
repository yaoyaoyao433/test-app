package com.meituan.android.common.unionid.oneid;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.cipstorage.x;
import com.meituan.android.common.unionid.UnionIdHandler;
import com.meituan.android.common.unionid.oneid.cache.CIPStorageManager;
import com.meituan.android.common.unionid.oneid.cache.DpidCallback;
import com.meituan.android.common.unionid.oneid.cache.IOneIdCallback;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.cache.OneIdStorage;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkHandler;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback2;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.secure.SecurityUtil;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.android.common.unionid.oneid.util.UuidHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneIdHelper {
    public static final String REQ_FROM_DPID = "2";
    public static final String REQ_FROM_UNIONID = "1";
    public static final String REQ_FROM_UUID = "4";
    public static String SERVER_REGISTER_URL = OneIdConstants.ONE_ID_BASE_URL + OneIdConstants.ONE_ID_REGISTER;
    public static String SERVER_UPDATE_URL = OneIdConstants.ONE_ID_BASE_URL + OneIdConstants.ONE_ID_UPDATE;
    private static final String TAG = "OneIdHelper";
    public static final String UPDATE = "update";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static String lastOneid;
    public static String lastUuid;
    private static UnionIdHandler mUnionIdHandler;
    private static x sCIPStorageSPAdapter;
    private static Context sContext;
    private static ExecutorService sDpidExecutor;
    public static String sUnionId;
    private static ExecutorService sUnionIdExecutor;

    public static void init(Context context, Handler handler) {
        Object[] objArr = {context, handler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ca6af9495e7549953a9f337ca2ad3c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ca6af9495e7549953a9f337ca2ad3c0");
            return;
        }
        sContext = context;
        MonitorManager.initLogManager(context);
        UnionIdHandler singleInstance = UnionIdHandler.getSingleInstance(context);
        mUnionIdHandler = singleInstance;
        singleInstance.init();
        sCIPStorageSPAdapter = CIPStorageManager.getApdater(context);
        sUnionIdExecutor = c.a("unionId-query");
        sDpidExecutor = c.a("dpid-query");
        if (context != null) {
            OaidManager.getInstance().getOaid(context, new OaidCallback2() { // from class: com.meituan.android.common.unionid.oneid.OneIdHelper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                public final void onFail(String str) {
                }

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                public final void onSuccuss(boolean z, String str, boolean z2) {
                }

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback2
                public final void onSuccuss(boolean z, String str, boolean z2, OaidManager.Source source) {
                }
            });
        }
    }

    public static void setContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fed8f3d9acd2ba44177b0fe1d2b9e58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fed8f3d9acd2ba44177b0fe1d2b9e58");
        } else if (sContext != null || context == null) {
        } else {
            sContext = AppUtil.getAppContext(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callbackOneId(String str, List<IOneIdCallback> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6c2429e36c4b6600707a91e9631b8bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6c2429e36c4b6600707a91e9631b8bf");
        } else if (list != null && list.size() != 0) {
            for (IOneIdCallback iOneIdCallback : list) {
                if (iOneIdCallback != null) {
                    iOneIdCallback.call(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void callbackDpid(String str, List<DpidCallback> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "91b2bcc06c8fa4032bbc5a935d5e26f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "91b2bcc06c8fa4032bbc5a935d5e26f3");
        } else if (list != null && list.size() != 0) {
            for (DpidCallback dpidCallback : list) {
                if (dpidCallback != null) {
                    dpidCallback.call(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void register(DeviceInfo deviceInfo, OneIdNetworkHandler oneIdNetworkHandler, List<IOneIdCallback> list) {
        Object[] objArr = {deviceInfo, oneIdNetworkHandler, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c195bd8d452ff46e4679afc499adc31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c195bd8d452ff46e4679afc499adc31");
        } else if (deviceInfo == null || oneIdNetworkHandler == null || list == null) {
            Log.e(TAG, "register: failed");
        } else {
            try {
                getOneIdByNetwork(deviceInfo, oneIdNetworkHandler, list, OneIdConstants.ONE_ID_BASE_URL + OneIdConstants.ONE_ID_REGISTER, "POST");
            } catch (Exception e) {
                callbackOneId("", list);
                Log.e(TAG, "register: failed", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void update(DeviceInfo deviceInfo, OneIdNetworkHandler oneIdNetworkHandler, List<IOneIdCallback> list) {
        Object[] objArr = {deviceInfo, oneIdNetworkHandler, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92b55d602b1f793f37386151197c8d45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92b55d602b1f793f37386151197c8d45");
            return;
        }
        if (deviceInfo == null || oneIdNetworkHandler == null || list == null) {
            Log.e(TAG, "update: failed");
        }
        try {
            getOneIdByNetwork(deviceInfo, oneIdNetworkHandler, list, OneIdConstants.ONE_ID_BASE_URL + OneIdConstants.ONE_ID_UPDATE, OneIdNetworkTool.PUT);
        } catch (Exception e) {
            String oneIdByLocal = getOneIdByLocal(sContext);
            if (TextUtils.isEmpty(oneIdByLocal)) {
                callbackOneId("", list);
            } else {
                callbackOneId(oneIdByLocal, list);
            }
            Log.e(TAG, "update: failed", e);
        }
    }

    private static String getOneIdByLocal(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c387f4a3df7362701764580c25bfc54", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c387f4a3df7362701764580c25bfc54");
        }
        String oneIdBySharePref = getOneIdBySharePref(context);
        if (!TextUtils.isEmpty(oneIdBySharePref)) {
            saveOneIdToSdcard(oneIdBySharePref);
            return oneIdBySharePref;
        } else if (!TextUtils.isEmpty(oneIdBySharePref)) {
            saveOneIdToShare(context, oneIdBySharePref);
            saveOneIdToSdcard(oneIdBySharePref);
            return oneIdBySharePref;
        } else {
            String oneIdBytSdcard = getOneIdBytSdcard();
            if (!TextUtils.isEmpty(oneIdBytSdcard)) {
                saveOneIdToShare(context, oneIdBytSdcard);
            }
            return oneIdBytSdcard;
        }
    }

    private static String getOneIdBySharePref(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8fd91ecc22acfaf4c90e345b06ca91c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8fd91ecc22acfaf4c90e345b06ca91c8");
        }
        if (context == null) {
            return null;
        }
        try {
            String oneId = OneIdSharePref.getInstance(context).getOneId();
            if (!TextUtils.isEmpty(oneId)) {
                return SecurityUtil.decrypt(oneId, SecurityUtil.initKey());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String getOneIdBytSdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8de737f03d2f387e34ce3a9e87f68c4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8de737f03d2f387e34ce3a9e87f68c4b");
        }
        try {
            String oneIdBySdcard = OneIdStorage.getOneIdBySdcard();
            if (!TextUtils.isEmpty(oneIdBySdcard)) {
                return SecurityUtil.decrypt(oneIdBySdcard, SecurityUtil.initKey());
            }
        } catch (Exception e) {
            Log.e(TAG, "getOneIdBytSdcard: failed", e);
        }
        return null;
    }

    private static void getOneIdByNetwork(DeviceInfo deviceInfo, OneIdNetworkHandler oneIdNetworkHandler, List<IOneIdCallback> list, String str, String str2) {
        Object[] objArr = {deviceInfo, oneIdNetworkHandler, list, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24218b6da0953568d0f2ba37b8d38f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24218b6da0953568d0f2ba37b8d38f2d");
        } else if (deviceInfo == null || oneIdNetworkHandler == null) {
            Log.e(TAG, "getoneIdByNetwork: one of the parameters is null");
        } else {
            _oneid_request(deviceInfo, oneIdNetworkHandler, list, str, str2, 1);
        }
    }

    private static void _oneid_request(DeviceInfo deviceInfo, OneIdNetworkHandler oneIdNetworkHandler, List<IOneIdCallback> list, String str, String str2, int i) {
        deviceInfo.lazyInit(sContext);
        String convertResponsePair = convertResponsePair(OneIdNetworkHandler.request(sContext, str, deviceInfo, str2, i), true);
        if (!TextUtils.isEmpty(convertResponsePair)) {
            if (!TextUtils.isEmpty(lastOneid) && !lastOneid.equals(convertResponsePair)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(HiAnalyticsConstant.Direction.REQUEST, deviceInfo.toString());
                    jSONObject.put("url", str);
                    jSONObject.put("new", convertResponsePair);
                    jSONObject.put("old", lastOneid);
                    LogMonitor.watch(LogMonitor.ONEID_CHANGE_TAG, "", jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            callbackOneId(convertResponsePair, list);
            sUnionId = convertResponsePair;
            if (OneIdPrivacyHelper.isPrivateChain(deviceInfo)) {
                savePrivateUnionid(convertResponsePair);
            } else {
                saveUnionid(convertResponsePair);
            }
            MonitorManager.addEvent(deviceInfo.stat, "unionId", 146, true, null);
            if (OneIdPrivacyHelper.isPrivateChain(deviceInfo)) {
                return;
            }
            boolean localUnionidTransferInfo = OneIdSharePref.getInstance(sContext).setLocalUnionidTransferInfo(AppUtil.getNewTransferInfo(sContext));
            JSONObject jSONObject2 = new JSONObject();
            if (localUnionidTransferInfo) {
                try {
                    jSONObject2.put("saveUnionidTransferInfo", "success");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } else {
                try {
                    jSONObject2.put("saveUnionidTransferInfo", "fail");
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
            MonitorManager.addEvent(deviceInfo.stat, "unionId", 146, false, jSONObject2);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put(HiAnalyticsConstant.Direction.REQUEST, deviceInfo.toString());
            jSONObject3.put("url", str);
            jSONObject3.put("network", AppUtil.getNetWorkAvailable(sContext));
            jSONObject3.put("response", "oneid is empty");
            LogMonitor.watch("getOneIdByNetwork_1", "", jSONObject3);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        String oneIdByLocal = getOneIdByLocal(sContext);
        if (TextUtils.isEmpty(oneIdByLocal)) {
            oneIdByLocal = "";
        }
        callbackOneId(oneIdByLocal, list);
    }

    private static Pair<Boolean, String> getUuidByNetwork(DeviceInfo deviceInfo, OneIdNetworkHandler oneIdNetworkHandler, String str, String str2, int i) {
        Object[] objArr = {deviceInfo, oneIdNetworkHandler, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfc2350882b6050aaff6353518d3f31d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfc2350882b6050aaff6353518d3f31d");
        }
        if (deviceInfo == null || oneIdNetworkHandler == null) {
            Log.e(TAG, "getoneIdByNetwork: one of the parameters is null");
            return new Pair<>(Boolean.FALSE, "");
        }
        String convertResponsePair = convertResponsePair(OneIdNetworkHandler.request(sContext, str, deviceInfo, str2, i), true);
        if (!TextUtils.isEmpty(convertResponsePair)) {
            return new Pair<>(Boolean.FALSE, convertResponsePair);
        }
        return new Pair<>(Boolean.TRUE, AppUtil.getLocalUUID(sContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getDpidByNetwork(DeviceInfo deviceInfo, OneIdNetworkHandler oneIdNetworkHandler, String str, String str2) throws JSONException {
        Object[] objArr = {deviceInfo, oneIdNetworkHandler, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45f90fc6860029a34a98f48fa4034ba9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45f90fc6860029a34a98f48fa4034ba9");
        }
        LogUtils.i("oaidmanager", "getDpid start");
        if (deviceInfo == null || oneIdNetworkHandler == null) {
            Log.e(TAG, "getoneIdByNetwork: one of the parameters is null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceInfo", deviceInfo == null);
            jSONObject.put("networkHandler", oneIdNetworkHandler == null);
            jSONObject.put("url", str);
            LogMonitor.watch("getDpidByNetwork", "paramNull", jSONObject);
            return null;
        }
        return _request_dpid(deviceInfo, str, str2, 1);
    }

    private static String _request_dpid(DeviceInfo deviceInfo, String str, String str2, int i) {
        String convertResponsePair = convertResponsePair(OneIdNetworkHandler.request(sContext, str, deviceInfo, str2, i), true);
        String deviceInfo2 = deviceInfo.toString();
        if (TextUtils.isEmpty(convertResponsePair)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(HiAnalyticsConstant.Direction.REQUEST, deviceInfo2);
                jSONObject.put("url", str);
                jSONObject.put("network", AppUtil.getNetWorkAvailable(sContext));
                jSONObject.put("response", "dpid is empty");
                LogMonitor.watch("getDpidByNetwork_1", "", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return getDpidByLocal(sContext);
        }
        saveDpid(convertResponsePair);
        MonitorManager.addEvent(deviceInfo.stat, "dpid", 147, true, null);
        if (OneIdPrivacyHelper.isPrivateChain(deviceInfo)) {
            return convertResponsePair;
        }
        boolean localDpidTransferInfo = OneIdSharePref.getInstance(sContext).setLocalDpidTransferInfo(AppUtil.getNewTransferInfo(sContext));
        JSONObject jSONObject2 = new JSONObject();
        if (localDpidTransferInfo) {
            try {
                jSONObject2.put("saveDpidTransferInfo", "success");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            try {
                jSONObject2.put("saveDpidTransferInfo", "fail");
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        MonitorManager.addEvent(deviceInfo.stat, "dpid", 147, false, jSONObject2);
        return convertResponsePair;
    }

    private static void saveOneIdToShare(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd650dec5cfc769c413ca828f81dbcd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd650dec5cfc769c413ca828f81dbcd3");
        } else if (context == null && TextUtils.isEmpty(str)) {
        } else {
            try {
                OneIdSharePref.getInstance(context).setOneId(SecurityUtil.encrypt(str, SecurityUtil.initKey()));
            } catch (Exception e) {
                Log.e(TAG, "saveOneIdToShare: failed", e);
            }
        }
    }

    private static void saveOneIdToSdcard(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "569d86501d2e88510f75ae05525d1b40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "569d86501d2e88510f75ae05525d1b40");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                OneIdStorage.saveOneIdToSdcard(SecurityUtil.encrypt(str, SecurityUtil.initKey()));
            } catch (Exception e) {
                Log.e(TAG, "saveOneIdToSdcard: failed", e);
            }
        }
    }

    public static void registerOrUpdate(final Context context, final OneIdNetworkHandler oneIdNetworkHandler, final List<IOneIdCallback> list) {
        Object[] objArr = {context, oneIdNetworkHandler, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53cc220c340fee66687c50ab6b879926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53cc220c340fee66687c50ab6b879926");
        } else if (context == null || oneIdNetworkHandler == null || list == null || sUnionIdExecutor == null) {
            Log.e(TAG, "register: faild");
        } else if (!TextUtils.isEmpty(sUnionId)) {
            callbackOneId(sUnionId, list);
        } else {
            MonitorManager.initLogManager(context);
            MonitorManager.addEvent("unionId", 137, true, (JSONObject) null);
            long currentTimeMillis = System.currentTimeMillis();
            final DeviceInfo deviceInfo = new DeviceInfo(context);
            deviceInfo.initUnionidTransfer();
            MonitorManager.addEvent("unionId", 137, false, (JSONObject) null);
            deviceInfo.stat.monitorLog = MonitorManager.createNewMonitor(deviceInfo.stat, context, currentTimeMillis, "unionId");
            if (OneIdHandler.getInstance(sContext).mIsUnionIdRunning.get()) {
                return;
            }
            sUnionIdExecutor.execute(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdHelper.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    String unionIdFromLocal;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d4647f3416322b6de38dac8a25cc128", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d4647f3416322b6de38dac8a25cc128");
                    } else if (!TextUtils.isEmpty(OneIdHelper.sUnionId)) {
                        OneIdHelper.callbackOneId(OneIdHelper.sUnionId, list);
                    } else {
                        OneIdHandler.getInstance(OneIdHelper.sContext).mIsUnionIdRunning.set(true);
                        deviceInfo.privacy = (OneIdPrivacyHelper.isPrivacyMode(context) || OneIdPrivacyHelper.isPrivateSessionId(context)) ? "1" : "0";
                        if (!OneIdPrivacyHelper.isPrivateChain(deviceInfo)) {
                            unionIdFromLocal = OneIdHelper.mUnionIdHandler.getUnionIdFromLocal(deviceInfo.stat);
                        } else {
                            unionIdFromLocal = OneIdSharePref.getInstance(context).getPrivateUnionid();
                        }
                        OneIdHelper.lastOneid = unionIdFromLocal;
                        if (unionIdFromLocal != null) {
                            deviceInfo.unionId = unionIdFromLocal;
                        }
                        String dpidBySharePref = OneIdHelper.getDpidBySharePref(OneIdHelper.sContext, deviceInfo.stat);
                        if (TextUtils.isEmpty(dpidBySharePref)) {
                            dpidBySharePref = OneIdHelper.getDpidByLocal(OneIdHelper.sContext, deviceInfo.stat);
                        }
                        if (!TextUtils.isEmpty(dpidBySharePref)) {
                            deviceInfo.dpid = dpidBySharePref;
                        }
                        OneIdHelper.markStatID(deviceInfo, null, deviceInfo.dpid, deviceInfo.unionId);
                        deviceInfo.requiredId = "1";
                        try {
                            deviceInfo.downloadSource = AppUtil.getChannel(OneIdHelper.sContext);
                            if (TextUtils.isEmpty(deviceInfo.downloadSource)) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(DMKeys.KEY_IS_EMPTY, true);
                                LogMonitor.watch(LogMonitor.UNIONID_DOWNLOAD_SOURCE_EMPTY, "", jSONObject);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (deviceInfo.unionIdTransfer) {
                            MonitorManager.addEvent("unionId", 143, true, (JSONObject) null);
                        } else if (!TextUtils.isEmpty(unionIdFromLocal)) {
                            long privateLastSyncTime = OneIdPrivacyHelper.isPrivateChain(deviceInfo) ? OneIdSharePref.getInstance(OneIdHelper.sContext).getPrivateLastSyncTime() : OneIdSharePref.getInstance(OneIdHelper.sContext).getLastSyncTime();
                            OneIdHelper.sUnionId = unionIdFromLocal;
                            if (AppUtil.checkOverdue(privateLastSyncTime)) {
                                OneIdHelper.callbackOneId(unionIdFromLocal, list);
                                OneIdHelper.update(deviceInfo, oneIdNetworkHandler, list);
                            } else {
                                OneIdHelper.callbackOneId(unionIdFromLocal, list);
                            }
                            OneIdHandler.getInstance(OneIdHelper.sContext).mIsUnionIdRunning.set(false);
                        }
                        OneIdHelper.register(deviceInfo, oneIdNetworkHandler, list);
                        OneIdHandler.getInstance(OneIdHelper.sContext).mIsUnionIdRunning.set(false);
                    }
                }
            });
        }
    }

    public static Pair<Boolean, String> registerOrUpdateUuid(DeviceInfo deviceInfo, Context context, String str, OneIdNetworkHandler oneIdNetworkHandler, Pair<String, Integer> pair, StatUtil statUtil) {
        Object[] objArr = {deviceInfo, context, str, oneIdNetworkHandler, pair, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0fa62e9b14a30a0b5e0be3ec444f9f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0fa62e9b14a30a0b5e0be3ec444f9f5");
        }
        LogUtils.i("oaidmanager", "getOneIdByUuid");
        if (context == null || oneIdNetworkHandler == null) {
            return new Pair<>(Boolean.FALSE, "");
        }
        if (statUtil != null) {
            deviceInfo.stat = statUtil;
        }
        String dpidBySharePref = getDpidBySharePref(sContext, deviceInfo.stat);
        String unionIdFromLocal = UnionIdHandler.getSingleInstance(sContext).getUnionIdFromLocal(deviceInfo.stat);
        if (!TextUtils.isEmpty(unionIdFromLocal)) {
            deviceInfo.unionId = unionIdFromLocal;
        }
        if (pair != null && !TextUtils.isEmpty((CharSequence) pair.first) && !UuidHelper.checkUUIDValid(deviceInfo.uuid)) {
            deviceInfo.uuid = (String) pair.first;
        }
        lastUuid = deviceInfo.uuid;
        if (!TextUtils.isEmpty(dpidBySharePref)) {
            deviceInfo.dpid = dpidBySharePref;
        }
        markStatID(deviceInfo, pair, deviceInfo.dpid, deviceInfo.unionId);
        deviceInfo.requiredId = "4";
        try {
            deviceInfo.downloadSource = AppUtil.getChannel(context);
            if (TextUtils.isEmpty(deviceInfo.downloadSource)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DMKeys.KEY_IS_EMPTY, true);
                LogMonitor.watch(LogMonitor.UUID_DOWNLOAD_SOURCE_EMPTY, "", jSONObject);
            }
        } catch (Throwable unused) {
        }
        MonitorManager.addEvent("uuid", 137, true, (JSONObject) null);
        deviceInfo.lazyInit(context);
        MonitorManager.addEvent("uuid", 137, false, (JSONObject) null);
        if ("update".equals(str)) {
            return getUuidByNetwork(deviceInfo, oneIdNetworkHandler, SERVER_UPDATE_URL, OneIdNetworkTool.PUT, 1);
        }
        return getUuidByNetwork(deviceInfo, oneIdNetworkHandler, SERVER_REGISTER_URL, "POST", 1);
    }

    public static String registerOrUpdateDpid(Context context, OneIdNetworkHandler oneIdNetworkHandler, List<DpidCallback> list, String[] strArr, StatUtil statUtil) {
        boolean z = true;
        Object[] objArr = {context, oneIdNetworkHandler, list, strArr, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9dfc48c91987960f18d08ef46dd9a4af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9dfc48c91987960f18d08ef46dd9a4af");
        }
        if (context == null || oneIdNetworkHandler == null || strArr == null) {
            Log.e(TAG, "register: faild");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("context", context == null);
                jSONObject.put("networkHandler", oneIdNetworkHandler == null);
                if (strArr != null) {
                    z = false;
                }
                jSONObject.put("params", z);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            LogMonitor.watch("registerOrUpdateDpid", "paramNull", jSONObject);
            return null;
        }
        String dpidBySharePref = getDpidBySharePref(sContext, statUtil);
        startDpid(context, oneIdNetworkHandler, list, strArr, statUtil);
        return dpidBySharePref;
    }

    private static synchronized void startDpid(final Context context, final OneIdNetworkHandler oneIdNetworkHandler, final List<DpidCallback> list, final String[] strArr, final StatUtil statUtil) {
        synchronized (OneIdHelper.class) {
            Object[] objArr = {context, oneIdNetworkHandler, list, strArr, statUtil};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96cce4f02891b17231d1bb127128cc2c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96cce4f02891b17231d1bb127128cc2c");
            } else if (OneIdHandler.getInstance(sContext).mIsDpidRunning.get()) {
            } else {
                if (sDpidExecutor != null) {
                    sDpidExecutor.execute(new Runnable() { // from class: com.meituan.android.common.unionid.oneid.OneIdHelper.3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Removed duplicated region for block: B:78:0x01ee  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 620
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.OneIdHelper.AnonymousClass3.run():void");
                        }
                    });
                }
            }
        }
    }

    private static String getDpidByLocal(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5ca07c2241087a84ca675f2900fc960", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5ca07c2241087a84ca675f2900fc960") : getDpidByLocal(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getDpidByLocal(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e5948f5e514ab9929ff289b577319478", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e5948f5e514ab9929ff289b577319478");
        }
        String dpidBySharePref = getDpidBySharePref(context, statUtil);
        if (!TextUtils.isEmpty(dpidBySharePref)) {
            saveDpidToSdcard(dpidBySharePref);
            return dpidBySharePref;
        }
        String dpidBySdcard = getDpidBySdcard(context, statUtil);
        if (!TextUtils.isEmpty(dpidBySdcard)) {
            saveDpidToSharePref(context, dpidBySdcard);
        }
        if (!TextUtils.isEmpty(dpidBySdcard)) {
            saveDpidToSdcard(dpidBySdcard);
            saveDpidToSharePref(context, dpidBySdcard);
        }
        return dpidBySdcard;
    }

    public static String getDpidBySharePref(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5896c0af9a275ffe2fe8b50124675721", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5896c0af9a275ffe2fe8b50124675721") : getDpidBySharePref(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getDpidBySharePref(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33225d7015767a5c47cf75bdc12f481a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33225d7015767a5c47cf75bdc12f481a");
        }
        MonitorManager.addEvent(statUtil, "dpid", 130, true);
        if (context == null) {
            if (statUtil != null) {
                statUtil.markStat("dpid", 130, MonitorManager.getMsg(11, null, MonitorManager.CONTEXT_IS_NULL_MSG));
            }
            return null;
        }
        try {
            String dpid = OneIdSharePref.getInstance(context).getDpid();
            if (!TextUtils.isEmpty(dpid)) {
                String decrypt = SecurityUtil.decrypt(dpid, SecurityUtil.initKey());
                if (statUtil != null) {
                    statUtil.markStat("dpid", 130, MonitorManager.getMsg(decrypt));
                }
                return decrypt;
            }
        } catch (Exception e) {
            if (statUtil != null) {
                statUtil.markStat("dpid", 130, MonitorManager.getMsg(12, null, e.getMessage()));
            }
        }
        MonitorManager.addEvent(statUtil, "dpid", 130, false);
        return null;
    }

    public static void saveDpidToSharePref(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5def5af121dcb22953d3b2f6988fa81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5def5af121dcb22953d3b2f6988fa81");
            return;
        }
        MonitorManager.addEvent("dpid", 139, true, MonitorManager.getMsg(str));
        if (context == null && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (OneIdSharePref.getInstance(context).setDpid(SecurityUtil.encrypt(str, SecurityUtil.initKey()))) {
                MonitorManager.addEvent("dpid", 139, false, (JSONObject) null);
            } else {
                MonitorManager.addEvent("dpid", 139, false, MonitorManager.getExceptionMsg("unkonwn"));
            }
        } catch (Exception e) {
            Log.e(TAG, "saveOneIdToShare: failed", e);
            MonitorManager.addEvent("dpid", 139, false, MonitorManager.getExceptionMsg(e.getMessage()));
        }
    }

    private static String getDpidBySdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf6a7fffd57d21791fa5b368d0223d68", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf6a7fffd57d21791fa5b368d0223d68") : getDpidBySdcard(null, null);
    }

    private static String getDpidBySdcard(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "279ac4ea75f7751974f8e0c6f8d95421", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "279ac4ea75f7751974f8e0c6f8d95421");
        }
        try {
            MonitorManager.addEvent(statUtil, "dpid", 131, true);
            String dpidBySdcard = OneIdStorage.getDpidBySdcard(context, statUtil);
            if (!TextUtils.isEmpty(dpidBySdcard)) {
                String decrypt = SecurityUtil.decrypt(dpidBySdcard, SecurityUtil.initKey());
                if (statUtil != null) {
                    statUtil.markStat("dpid", 131, MonitorManager.getMsg(decrypt));
                }
                return decrypt;
            }
        } catch (Exception e) {
            Log.e(TAG, "getOneIdBytSdcard: failed", e);
            if (statUtil != null) {
                statUtil.markStat("dpid", 131, MonitorManager.getMsg(12, null, e.getMessage()));
            }
        }
        MonitorManager.addEvent(statUtil, "dpid", 131, false);
        return null;
    }

    public static void saveDpidToSdcard(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e92cf557eb5de2d2ed961d8befc978ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e92cf557eb5de2d2ed961d8befc978ea");
            return;
        }
        MonitorManager.addEvent("dpid", 140, true, MonitorManager.getMsg(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            OneIdStorage.saveDpidToSdcard(SecurityUtil.encrypt(str, SecurityUtil.initKey()));
            MonitorManager.addEvent("dpid", 140, false, (JSONObject) null);
        } catch (Exception e) {
            Log.e(TAG, "saveOneIdToSdcard: failed", e);
            MonitorManager.addEvent("dpid", 140, false, MonitorManager.getExceptionMsg(e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void markStatID(DeviceInfo deviceInfo, Pair<String, Integer> pair, String str, String str2) {
        Object[] objArr = {deviceInfo, pair, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "204cf44e205217557b29823bb94e2186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "204cf44e205217557b29823bb94e2186");
            return;
        }
        if (TextUtils.isEmpty(str) && deviceInfo.stat != null && !deviceInfo.stat.hasMark("dpid")) {
            deviceInfo.stat.markStat("dpid", 9);
        }
        if (deviceInfo.stat != null && pair != null) {
            if (UuidHelper.checkUUIDValid((String) pair.first)) {
                switch (((Integer) pair.second).intValue()) {
                    case 1:
                        deviceInfo.stat.markStat("uuid", 129);
                        break;
                    case 2:
                        deviceInfo.stat.markStat("uuid", 130);
                        break;
                    case 3:
                        deviceInfo.stat.markStat("uuid", 132);
                        break;
                    case 4:
                        deviceInfo.stat.markStat("uuid", 131);
                        break;
                    case 5:
                        deviceInfo.stat.markStat("uuid", 136);
                        break;
                }
            } else {
                int intValue = ((Integer) pair.second).intValue();
                if (intValue == 11) {
                    deviceInfo.stat.markStat("uuid", 11);
                } else if (intValue == 41) {
                    deviceInfo.stat.markStat("uuid", 4);
                } else if (intValue == 51) {
                    deviceInfo.stat.markStat("uuid", 12);
                } else {
                    switch (intValue) {
                        case 14:
                            deviceInfo.stat.markStat("uuid", 14);
                            break;
                        case 15:
                            deviceInfo.stat.markStat("uuid", 15);
                            break;
                        case 16:
                            deviceInfo.stat.markStat("uuid", 16);
                            break;
                        case 17:
                            deviceInfo.stat.markStat("uuid", 17);
                            break;
                    }
                }
            }
        }
        if (pair != null && TextUtils.isEmpty((CharSequence) pair.first) && deviceInfo.stat != null && !deviceInfo.stat.hasMark("uuid")) {
            deviceInfo.stat.markStat("uuid", 9);
        }
        if (!TextUtils.isEmpty(str2) || deviceInfo.stat == null || deviceInfo.stat.hasMark("unionId")) {
            return;
        }
        deviceInfo.stat.markStat("unionId", 9);
    }

    public static String getMemoryCacheOneId() {
        return sUnionId;
    }

    public static String getMemoryCacheDpid() {
        return OneIdHandler.DPID;
    }

    public static String convertResponsePair(Pair<String, String> pair, boolean z) {
        Object[] objArr = {pair, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "461f3119d7fbde7f09cd0fd6e92e6cde", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "461f3119d7fbde7f09cd0fd6e92e6cde");
        }
        if (pair != null) {
            if (z) {
                return (String) pair.first;
            }
            return (String) pair.second;
        }
        return null;
    }

    public static void saveUnionid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "098901d6798569ec310b18f1c8981393", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "098901d6798569ec310b18f1c8981393");
            return;
        }
        UnionIdHandler.getSingleInstance(OneIdHandler.getContext()).saveUnionidToLocal(OneIdHandler.getContext(), str);
        OneIdSharePref.getInstance(OneIdHandler.getContext()).setLastSyncTime(System.currentTimeMillis());
    }

    public static void savePrivateUnionid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b7b586b633a331b578fe12058651649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b7b586b633a331b578fe12058651649");
            return;
        }
        OneIdSharePref.getInstance(sContext).setPrivateUnionid(str);
        OneIdSharePref.getInstance(OneIdHandler.getContext()).setPrivateLastSyncTime(System.currentTimeMillis());
    }

    public static void saveDpid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "023ae9374e9f2614190ed6973091a57d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "023ae9374e9f2614190ed6973091a57d");
            return;
        }
        OneIdSharePref.getInstance(OneIdHandler.getContext()).setDpidLastSyncTime(System.currentTimeMillis());
        saveDpidToSharePref(OneIdHandler.getContext(), str);
        saveDpidToSdcard(str);
    }
}
