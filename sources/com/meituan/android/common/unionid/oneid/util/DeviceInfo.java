package com.meituan.android.common.unionid.oneid.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper;
import com.meituan.android.common.unionid.oneid.appid.AppIdHandler;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback2;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DeviceInfo {
    public static final String ADVERTISING_ID = "advertisingId";
    public static final String ANDROID_ID = "androidId";
    public static final String APP = "app";
    public static final String APP_CANARY = "appCanary";
    public static final String APP_ID = "appid";
    public static final String APP_ID_LOCAL = "appid_local";
    public static final String APP_ID_SHARE = "appid_share";
    public static final String APP_INFO = "appInfo";
    public static final String APP_NAME = "appName";
    public static final String BOOT_ID = "bootId";
    public static final String BOOT_ID_INFO = "bootIdInfo";
    public static final String BOOT_ID_RANDOM_TIME = "bootIdRandomTime";
    public static final String BOOT_ID_TIME = "bootIdTime";
    public static final String BRAND = "brand";
    public static final String BRAND_INFO = "brandInfo";
    public static final String BU_CALL_START = "buCallStart";
    public static final String CLASS_LOADER = "classLoader";
    public static final String CLIENT_TYPE = "clientType";
    public static final String COMMUNACATION_INFO = "communicationInfo";
    public static final String DEVICE_INFO = "deviceInfo";
    public static final String DEVICE_MODEL = "deviceModel";
    public static final String DEVICE_TYPE = "deviceType";
    public static final String DOWNLOAD_SOURCE = "downloadSource";
    public static final String DPID = "dpid";
    public static final String DPID_TRANSFER = "dpidTransfer";
    public static final String DP_UUID = "uuid";
    public static final String EMUI_VERSION = "emuiVersion";
    public static final String ENVIROMENT_INFO = "environmentInfo";
    public static final String EXTENSION = "extension";
    @Deprecated
    public static final String ICCID = "jddje";
    public static final String ID_INFO = "idInfo";
    public static final String IMEI_1 = "imei1";
    public static final String IMEI_2 = "imei2";
    @Deprecated
    public static final String IMSI = "jntj";
    public static final String KEY_DEVICE_INFO = "keyDeviceInfo";
    public static final String LOCAL_DPID_ANDROID_ID = "localDpidAndroidId";
    public static final String LOCAL_DPID_INSTALL_NSEC_TIME = "localDpidInstallNsecTime";
    public static final String LOCAL_ID = "localId";
    public static final String LOCAL_UNIONID_ANDROID_ID = "localUnionidAndroidId";
    public static final String LOCAL_UNIONID_INSTALL_NSEC_TIME = "localUnionidInstallNsecTime";
    public static final String LOCAL_UUID = "uuid";
    public static final String LOCAL_UUID_ANDROID_ID = "localT";
    public static final String LOCAL_UUID_INSTALL_NSEC_TIME = "localUuidInstallNsecTime";
    @Deprecated
    public static final String LOG_INFO = "logInfo";
    public static final String MARK = "mark";
    public static final String MEID = "meid";
    @Deprecated
    public static final String MNO = "nop";
    public static final String NEW_INSTALL_NSEC_TIME = "newInstallNsecTime";
    public static final String NONCE = "nonce";
    public static final String OAID = "oaid";
    public static final String OAID_REQ_START = "oaidReqStart";
    public static final String OS_BRAND = "osBrand";
    public static final String OS_NAME = "osName";
    public static final String OS_VERSION = "osVersion";
    public static final String PLATFORM = "platform";
    public static final String PRIVACYMODE = "privacyMode";
    public static final String REAL_TIME_OAID = "realTimeOaid";
    public static final String REQUIRED_ID = "requiredId";
    public static final String REQ_START = "reqStart";
    public static final String SDK_VERSION = "sdkVersion";
    public static final String SECONDARY_DEVICE_INFO = "secondaryDeviceInfo";
    public static final String SIGN = "sign";
    public static final String SIGN_VER = "signVersion";
    public static final String TM = "timestamp";
    public static final String TOKEN = "token";
    public static final String TRANSFER = "transfer";
    public static final String UA = "ua";
    public static final String UNIONID_TRANSFER = "unionIdTransfer";
    public static final String UNION_ID = "unionId";
    public static final String USER_ID = "userId";
    public static final String UUID_TRANSFER = "uuidTransfer";
    public static final String UUID_TRANSFER_V2 = "uuidTransferV2";
    public static final String UUID_TRANSFER_V3 = "uuidTransferV3";
    public static final String VERSION = "version";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String advertisingId;
    public String androidId;
    public String app;
    public String appCanary;
    public String appName;
    @Deprecated
    public String bluetoothMac;
    public String bootId;
    public String bootIdRandomTime;
    public String bootIdTime;
    public String brand;
    public String classLoader;
    public String clientType;
    public String deviceModel;
    public String deviceType;
    public String downloadSource;
    public String dpid;
    public boolean dpidTransfer;
    public String dpidUuid;
    public String emuiVersion;
    public String imei1;
    public String imei2;
    public String jddje;
    public String jntj;
    public String localDpidAndroidId;
    public String localDpidInstallNsecTime;
    public String localId;
    public String localInstallTime;
    public String localUnionIdAndroidId;
    public String localUnionIdInstallNsecTime;
    public String localUuidAndroidId;
    public String localUuidInstallNsecTime;
    public String localV2CustomAccessNanoTime;
    public String localV3AndroidId;
    public String localV3CustomAccessNanoTime;
    private Context mContext;
    public CountDownLatch mCountDownLatch;
    public String meid;
    public String nativeModel;
    public String natvieBrand;
    public String newInstallNsecTime;
    public String newTransferInfoCustomAccessNanoTime;
    public String newTransferInfoCustomCreateNanoTime;
    public String nop;
    public String oaid;
    public String oaidMsg;
    public String osBrand;
    public String osName;
    public String osVersion;
    private String pInstallTime;
    public String platform;
    public String privacy;
    private String processName;
    public String realTimeOaid;
    public String requiredId;
    public String sdkVersion;
    @Deprecated
    public String serialNumber;
    @Deprecated
    public String simulatedId;
    public StatUtil stat;
    private String transferDirInfo;
    public String unionId;
    public boolean unionIdTransfer;
    public String userId;
    public String uuid;
    public boolean uuidTransfer;
    public boolean uuidTransferV2;
    public boolean uuidTransferV3;
    public String version;
    @Deprecated
    public String wifiMac;

    @Deprecated
    public static DeviceInfo getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3080b05652095ddeea46c90d9c34ed21", RobustBitConfig.DEFAULT_VALUE)) {
            return (DeviceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3080b05652095ddeea46c90d9c34ed21");
        }
        DeviceInfo deviceInfo = new DeviceInfo(context);
        deviceInfo.lazyInit(context);
        return deviceInfo;
    }

    public DeviceInfo(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c244600cc20e0ad0c9baf2eee47b41c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c244600cc20e0ad0c9baf2eee47b41c");
            return;
        }
        this.nativeModel = "";
        this.natvieBrand = "";
        this.oaidMsg = "";
        this.transferDirInfo = "";
        this.stat = null;
        this.pInstallTime = "";
        this.privacy = "";
        this.processName = "";
        this.privacy = OneIdPrivacyHelper.getPrivacyMode(context);
        this.stat = new StatUtil();
        initHarmonyInfo();
        initCustomTransferNanoTime(context);
    }

    @Deprecated
    public DeviceInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f698129cf64bc6c82249ecea722d45f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f698129cf64bc6c82249ecea722d45f0");
            return;
        }
        this.nativeModel = "";
        this.natvieBrand = "";
        this.oaidMsg = "";
        this.transferDirInfo = "";
        this.stat = null;
        this.pInstallTime = "";
        this.privacy = "";
        this.processName = "";
        this.stat = new StatUtil();
        initHarmonyInfo();
    }

    public void initUnionidTransfer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "149f571cb405e9bd5d666e1b04d601c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "149f571cb405e9bd5d666e1b04d601c1");
        } else if (OneIdHandler.getContext() == null || OneIdPrivacyHelper.isPrivateChain(this)) {
        } else {
            this.localUnionIdInstallNsecTime = AppUtil.getLocalUnionIdInstallNsecTime(OneIdHandler.getContext());
            this.localUnionIdAndroidId = AppUtil.getLocalUnionIdAndroidId(OneIdHandler.getContext());
            this.unionIdTransfer = AppUtil.getUnionIdTransfer(OneIdHandler.getContext(), this.localUnionIdAndroidId, this.localUnionIdInstallNsecTime);
        }
    }

    public void initDpidTransfer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed9120fd70bb9e217dc25a713a5978bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed9120fd70bb9e217dc25a713a5978bf");
        } else if (OneIdHandler.getContext() == null || OneIdPrivacyHelper.isPrivateChain(this)) {
        } else {
            this.localDpidInstallNsecTime = AppUtil.getLocalDpidInstallNsecTime(OneIdHandler.getContext());
            this.localDpidAndroidId = AppUtil.getLocalDpidAndroidId(OneIdHandler.getContext());
            this.dpidTransfer = AppUtil.getDpidTransfer(OneIdHandler.getContext(), this.localDpidAndroidId, this.localDpidInstallNsecTime);
        }
    }

    public void initUuidTransfer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "796229a46028ca786dbd935363d04146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "796229a46028ca786dbd935363d04146");
            return;
        }
        if (!OneIdPrivacyHelper.isPrivateChain(this)) {
            Pair<String, String> localUuidTransferInfo = TransferUtils.getLocalUuidTransferInfo(context, 1);
            this.localUuidAndroidId = (String) localUuidTransferInfo.second;
            this.localUuidInstallNsecTime = (String) localUuidTransferInfo.first;
            this.uuidTransfer = AppUtil.getUuidTransfer(context, this.localUuidAndroidId, this.localUuidInstallNsecTime);
            this.androidId = AppUtil.getAndroidId(context);
            Pair<String, String> localUuidTransferInfo2 = TransferUtils.getLocalUuidTransferInfo(context, 3);
            this.uuidTransferV3 = TransferUtils.isUuidTransferV3(this.androidId, this.newTransferInfoCustomAccessNanoTime, (String) localUuidTransferInfo2.first, (String) localUuidTransferInfo2.second);
            this.localV3CustomAccessNanoTime = (String) localUuidTransferInfo2.second;
            this.localV3AndroidId = (String) localUuidTransferInfo2.first;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AppUtil.getFirstInstallTime(this.mContext));
        this.pInstallTime = sb.toString();
        Pair<String, String> localUuidTransferInfo3 = TransferUtils.getLocalUuidTransferInfo(context, 2);
        this.uuidTransferV2 = TransferUtils.isUuidTransferV2(this.pInstallTime, this.newTransferInfoCustomAccessNanoTime, (String) localUuidTransferInfo3.first, (String) localUuidTransferInfo3.second);
        this.localInstallTime = (String) localUuidTransferInfo3.first;
        this.localV2CustomAccessNanoTime = (String) localUuidTransferInfo3.second;
    }

    public void lazyInit(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4fff505fd96ecb0da9b662f84b3232f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4fff505fd96ecb0da9b662f84b3232f");
            return;
        }
        this.mContext = context;
        init();
    }

    public void initHarmonyInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07486ac127f05309f98e283ba54b83fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07486ac127f05309f98e283ba54b83fb");
            return;
        }
        this.mCountDownLatch = new CountDownLatch(1);
        c.a("harmonyInfo-init", new Runnable() { // from class: com.meituan.android.common.unionid.oneid.util.DeviceInfo.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a98e2b1ebc1877faad99535296841a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a98e2b1ebc1877faad99535296841a4");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    DeviceInfo.this.osBrand = AppUtil.getHarmonyOsBrand(OneIdHandler.getContext());
                    DeviceInfo.this.classLoader = AppUtil.getHarmonyClassLoader();
                }
                DeviceInfo.this.mCountDownLatch.countDown();
            }
        }).start();
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32adbd111f8b5bc5aa2e0c7f26376d3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32adbd111f8b5bc5aa2e0c7f26376d3c");
            return;
        }
        if (this.stat == null) {
            this.stat = new StatUtil();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.app = AppUtil.getPackageName(this.mContext);
        this.appName = AppUtil.getApp(this.mContext);
        this.appCanary = AppUtil.getAppCanaryReleaseName(this.mContext);
        this.version = AppUtil.getVersion(this.mContext);
        this.sdkVersion = AppUtil.getSdkVersion(this.mContext);
        this.userId = AppUtil.getUserId(this.mContext);
        this.localId = AppUtil.getLocalIdWrapped(this.mContext, this.stat);
        if (TextUtils.isEmpty(this.uuid)) {
            this.uuid = AppUtil.getLocalUUID(this.mContext, this.stat);
        }
        this.platform = AppUtil.getOS(this.mContext);
        this.osName = AppUtil.getOSName(this.mContext);
        this.osVersion = AppUtil.getOSVersion(this.mContext);
        this.clientType = AppUtil.getClientType(this.mContext);
        if (OneIdPrivacyHelper.isPrivateChain(this)) {
            this.bootId = "";
        } else {
            this.bootId = AppUtil.getBootId1();
        }
        this.bootIdTime = AppUtil.getBootIdTime();
        this.bootIdRandomTime = AppUtil.getBootIdRandomTime();
        if (!OneIdPrivacyHelper.isPrivateChain(this)) {
            this.androidId = AppUtil.getAndroidId(this.mContext, this.stat);
            this.oaid = OaidManager.getInstance().getLocalOAID(this.mContext, this.stat);
        } else {
            this.androidId = "";
            this.oaid = "";
        }
        this.brand = AppUtil.getBrand(this.mContext);
        this.deviceModel = AppUtil.getDeviceModel(this.mContext);
        this.newInstallNsecTime = AppUtil.getNewTransferInstallNsecTime(this.mContext);
        this.processName = ProcessUtils.getCurrentProcessName(this.mContext);
        new StringBuilder("get normal device info cost =").append(System.currentTimeMillis() - currentTimeMillis);
        if (!OneIdPrivacyHelper.isPrivateChain(this)) {
            OaidManager.getInstance().getOaid(this.mContext, new OaidCallback2() { // from class: com.meituan.android.common.unionid.oneid.util.DeviceInfo.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                public void onFail(String str) {
                }

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                public void onSuccuss(boolean z, String str, boolean z2) {
                }

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback2
                public void onSuccuss(boolean z, String str, boolean z2, OaidManager.Source source) {
                    DeviceInfo.this.realTimeOaid = str;
                }
            });
        }
        try {
            this.nativeModel = CoreUtils.getProp("ro.product.model");
            this.natvieBrand = CoreUtils.getProp("ro.product.brand");
        } catch (Throwable unused) {
        }
    }

    private void initCustomTransferNanoTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02fd586797748a3223fb41fa631f5e59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02fd586797748a3223fb41fa631f5e59");
            return;
        }
        File a = q.a(context, "oneid_shared_oneid", "uuid");
        if (a != null) {
            File file = new File(a.getParent(), UUID_TRANSFER);
            if (!file.exists() || !file.isDirectory()) {
                if (file.exists() && !file.isDirectory()) {
                    file.delete();
                    this.transferDirInfo = "delete&mkdir";
                } else {
                    this.transferDirInfo = "mkdirs";
                }
                if (file.mkdirs() || file.exists()) {
                    try {
                        this.newTransferInfoCustomAccessNanoTime = CoreUtils.statFile(file.getAbsolutePath());
                        this.newTransferInfoCustomCreateNanoTime = CoreUtils.getCtime(file.getAbsolutePath());
                    } catch (Throwable unused) {
                        this.transferDirInfo = "so exception";
                    }
                }
            } else if (file.exists()) {
                this.transferDirInfo = "exist";
                try {
                    this.newTransferInfoCustomAccessNanoTime = CoreUtils.statFile(file.getAbsolutePath());
                    this.newTransferInfoCustomCreateNanoTime = CoreUtils.getCtime(file.getAbsolutePath());
                } catch (Throwable unused2) {
                    this.transferDirInfo = "exist but so exception";
                }
            }
        }
    }

    public String getJsonDeviceInfo() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b45ca22a7f519176729e09e295ab0a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b45ca22a7f519176729e09e295ab0a3");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = new JSONObject();
        Object jSONObject9 = new JSONObject();
        JSONObject jSONObject10 = new JSONObject();
        JSONObject jSONObject11 = new JSONObject();
        JSONObject jSONObject12 = new JSONObject();
        JSONObject jSONObject13 = new JSONObject();
        JSONObject jSONObject14 = new JSONObject();
        JSONObject jSONObject15 = new JSONObject();
        try {
            jSONObject2.put("app", this.app);
            jSONObject2.put("version", this.version);
            jSONObject2.put("appName", this.appName);
            jSONObject2.put("sdkVersion", this.sdkVersion);
            jSONObject2.put(USER_ID, this.userId);
            jSONObject2.put(DOWNLOAD_SOURCE, this.downloadSource);
            jSONObject2.put("privacy", this.privacy);
            jSONObject3.put(LOCAL_ID, this.localId);
            jSONObject3.put("unionId", this.unionId);
            jSONObject3.put("uuid", this.uuid);
            jSONObject3.put("dpid", this.dpid);
            jSONObject3.put(REQUIRED_ID, this.requiredId);
            jSONObject3.put("sessionId", OneIdPrivacyHelper.getSessionId(this.mContext));
            jSONObject3.put("localSessionId", OneIdSharePref.getInstance(this.mContext).getLocalSessionId());
            jSONObject15.put(UUID_TRANSFER, this.uuidTransfer);
            jSONObject15.put(UUID_TRANSFER_V2, this.uuidTransferV2);
            jSONObject15.put(UUID_TRANSFER_V3, this.uuidTransferV3);
            jSONObject15.put(UNIONID_TRANSFER, this.unionIdTransfer);
            jSONObject15.put(DPID_TRANSFER, this.dpidTransfer);
            jSONObject14.put(BOOT_ID, AESUtils.encrypt(this.bootId));
            jSONObject4.put("platform", this.platform);
            jSONObject4.put(OS_NAME, this.osName);
            jSONObject4.put("osVersion", this.osVersion);
            jSONObject4.put(CLIENT_TYPE, this.clientType);
            jSONObject4.put("transfer", jSONObject15);
            jSONObject4.put(BOOT_ID_INFO, jSONObject14);
            jSONObject6.put(ADVERTISING_ID, this.advertisingId);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                String[] appId = AppIdHandler.getAppId(this.mContext, this.stat);
                obj = jSONObject9;
                try {
                    jSONObject10.put("share", appId[2]);
                    jSONObject11.put("oldid", appId[1]);
                    jSONObject11.put("newid", appId[0]);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                obj = jSONObject9;
            }
            jSONObject10.put(PackageLoadReporter.LoadType.LOCAL, jSONObject11);
            new StringBuilder("get appid cost = ").append(System.currentTimeMillis() - currentTimeMillis);
            jSONObject7.put("uuid", this.dpidUuid);
            jSONObject8.put("brand", this.brand);
            jSONObject8.put(DEVICE_MODEL, this.deviceModel);
            jSONObject5.put("keyDeviceInfo", jSONObject6);
            jSONObject5.put("secondaryDeviceInfo", jSONObject7);
            jSONObject5.put("brandInfo", jSONObject8);
            jSONObject.put("appInfo", jSONObject2);
            jSONObject.put("idInfo", jSONObject3);
            jSONObject.put("environmentInfo", jSONObject4);
            jSONObject.put("deviceInfo", jSONObject5);
            jSONObject.put("communicationInfo", obj);
            jSONObject12.put(APP_CANARY, this.appCanary);
            jSONObject12.put(OS_BRAND, this.osBrand);
            jSONObject12.put(CLASS_LOADER, this.classLoader);
            jSONObject12.put(EMUI_VERSION, this.emuiVersion);
            jSONObject12.put("deviceType", this.deviceType);
            jSONObject12.put(LOCAL_UUID_INSTALL_NSEC_TIME, this.localUuidInstallNsecTime);
            jSONObject12.put(LOCAL_UUID_ANDROID_ID, AESUtils.encrypt(this.localUuidAndroidId));
            jSONObject12.put(NEW_INSTALL_NSEC_TIME, this.newInstallNsecTime);
            jSONObject12.put("nm", AESUtils.encrypt(this.nativeModel));
            jSONObject12.put("nb", AESUtils.encrypt(this.natvieBrand));
            jSONObject12.put("pinstalltime", this.pInstallTime);
            jSONObject12.put("processName", this.processName);
            jSONObject12.put("customAccessNanoTime", this.newTransferInfoCustomAccessNanoTime);
            jSONObject12.put("customCreateNanoTime", this.newTransferInfoCustomCreateNanoTime);
            jSONObject12.put("transferDirInfo", this.transferDirInfo);
            jSONObject12.put("localCustomAccessNanoTime", this.localV2CustomAccessNanoTime);
            jSONObject12.put("localPinstallTime", this.localInstallTime);
            jSONObject12.put("localV3T", AESUtils.encrypt(this.localV3AndroidId));
            jSONObject12.put("localV3CustomNanoTime", this.localV3CustomAccessNanoTime);
            jSONObject.put("extension", jSONObject12.toString());
            jSONObject13.put(ANDROID_ID, this.androidId);
            LogUtils.i("deviceInfo", "androidId:" + this.androidId);
            jSONObject13.put("oaid", this.oaid);
            jSONObject13.put(REAL_TIME_OAID, this.realTimeOaid);
            jSONObject13.put("appid", jSONObject10);
            jSONObject.put("token", AESUtils.encrypt(jSONObject13.toString()));
            jSONObject.put("mark", this.stat.toJsonStr());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a871ae064a0d18f0214644a879d8a18b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a871ae064a0d18f0214644a879d8a18b") : getJsonDeviceInfo();
    }
}
