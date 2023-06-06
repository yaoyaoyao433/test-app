package com.meituan.android.privacy.interfaces;

import android.annotation.SuppressLint;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.telephony.emergency.EmergencyNumber;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MtTelephonyManager {
    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 29)
    boolean doesSwitchMultiSimConfigTriggerReboot();

    @RequiresPermission("Locate.once")
    @RequiresApi(api = 17)
    List<CellInfo> getAllCellInfo();

    String getAndroidId();

    int getCallState();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 26)
    PersistableBundle getCarrierConfig();

    @RequiresPermission("Locate.once")
    @SuppressLint({"MissingPermission"})
    CellLocation getCellLocation();

    int getDataActivity();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 24)
    int getDataNetworkType();

    int getDataState();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    @SuppressLint({"HardwareIds"})
    String getDeviceId();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    @RequiresApi(api = 23)
    @SuppressLint({"HardwareIds"})
    String getDeviceId(int i);

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    String getDeviceSoftwareVersion();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @NonNull
    @RequiresApi(api = 29)
    Map<Integer, List<EmergencyNumber>> getEmergencyNumberList();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @NonNull
    @RequiresApi(api = 29)
    Map<Integer, List<EmergencyNumber>> getEmergencyNumberList(int i);

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 26)
    String[] getForbiddenPlmns();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 18)
    String getGroupIdLevel1();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    String getImei();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    @RequiresApi(api = 26)
    String getImei(int i);

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @SuppressLint({"HardwareIds"})
    String getLine1Number();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    String getMeid();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    @RequiresApi(api = 26)
    String getMeid(int i);

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 28)
    String getNai();

    @RequiresPermission("Locate.once")
    List<NeighboringCellInfo> getNeighboringCellInfo();

    String getNetworkCountryIso();

    String getNetworkOperator();

    String getNetworkOperatorName();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    int getNetworkType();

    int getPhoneType();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 29)
    int getPreferredOpportunisticDataSubscription();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    String getSerial();

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_PHONE_BAN, "Locate.once"})
    @RequiresApi(api = 26)
    ServiceState getServiceState();

    String getSimCountryIso();

    String getSimOperator();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    @SuppressLint({"HardwareIds"})
    String getSimSerialNumber();

    int getSimState();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    @SuppressLint({"HardwareIds"})
    String getSubscriberId();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 26)
    @Nullable
    String getVisualVoicemailPackageName();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    String getVoiceMailAlphaTag();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    String getVoiceMailNumber();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 24)
    int getVoiceNetworkType();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 29)
    boolean isDataRoamingEnabled();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_BAN)
    @RequiresApi(api = 29)
    int isMultiSimSupported();

    boolean isNetworkRoaming();

    @SuppressLint({"MissingPermission"})
    void listen(PhoneStateListener phoneStateListener, int i);

    @RequiresPermission("Locate.once")
    @SuppressLint({"MissingPermission"})
    void listenLocationEvents(PhoneStateListener phoneStateListener, int i);

    @RequiresPermission("Locate.once")
    @RequiresApi(api = 29)
    void requestCellInfoUpdate(@NonNull Executor executor, @NonNull TelephonyManager.CellInfoCallback cellInfoCallback);
}
