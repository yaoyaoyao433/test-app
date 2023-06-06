package com.meituan.msi.constants;

import android.support.annotation.Keep;
import com.dianping.titans.utils.WifiTools;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import io.agora.rtc.internal.RtcEngineEvent;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public enum ErrorTips {
    UDP_SYSTEM_ERROR(-1, "", "系统错误"),
    UDP_SOCKET_ERROR(-2, "", "socket接口错误"),
    UDP_NO_PERMISSION(-3, "", "发送失败，无接口权限"),
    UDP_INVALID_ADDRESS(1, "", "发送失败，参数错误，address不合法"),
    UDP_INVALID_PORT(2, "", "发送失败，参数错误，port不合法"),
    BACKGROUND_AUDIO_SYSTEM_ERROR(10001, "", "系统错误"),
    BACKGROUND_AUDIO_NETWORK_ERROR(10002, "", "网络错误"),
    BACKGROUND_AUDIO_EMPTY_LENGTH(10003, "", "文件错误，请检查是否responseheader是否缺少Content_Length"),
    BACKGROUND_AUDIO_TYPE_ERROR(10004, "", "格式错误"),
    SYSTEM_ERROR(-1000, "系统错误", ""),
    OK(0, "ok", "正常"),
    UNSUPPORT(11000, "unsupport", "系统或设备不支持"),
    BLUETOOTH_SERVICE_UNAVAILABLE(11001, "bluetooth service unavailable", "蓝牙服务不可用"),
    LOCATION_SERVICE_UNAVAILABLE(XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME, "location service unavailable", "位置服务不可用"),
    ALREADY_START(11003, "already start", "已经开始搜索"),
    NOT_START(11004, "not startBeaconDiscovery", "还未开始搜索"),
    BEACON_SYSTEM_ERROR(11005, "system error", "系统错误"),
    INVALID_DATA(11006, "invalid data", "参数不正确"),
    NFC_NOT_SUPPORT(13000, "", "当前设备不支持NFC"),
    NFC_OFF(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS, "", "当前设备支持NFC，但系统NFC开关未开启"),
    NFC_HCE(13002, "", "当前设备支持NFC，但不支持HCE"),
    NFC_INVALID_PARAM(13003, "", "AID列表参数格式错误"),
    NFC_(13004, "", "未设置微信为默认NFC支付应用"),
    NFC_INVALID_COMMAND(13005, "", "返回的指令不合法"),
    NFC_AID_FAIL(RtcEngineEvent.EvtType.EVT_LEAVE_CHANNEL, "", "注册AID失败"),
    NFC_UNKNOWN(RtcEngineEvent.EvtType.EVT_RTC_STATS, "未知错误", ""),
    NFC_USER_IS_NOT_AUTHORIZED(RtcEngineEvent.EvtType.EVT_USER_ENABLE_LOCAL_VIDEO, "user is not authorized", "用户未授权"),
    NFC_INVALID_PARAMETER(13011, "invalid parameter", WifiTools.ERROR_INFO_PARAMS_INVALID),
    NFC_PARSE_NDEF_MESSAGE_FAILED(13012, "parse NdefMessage failed", "将参数解析为NdefMessage失败"),
    NFC_NFC_DISCOVERY_ALREADY_STARTED(13021, "NFC discovery already started", "已经开始NFC扫描"),
    NFC_NFC_DISCOVERY_NOT_STARTED(RtcEngineEvent.EvtType.AUDIO_EFFECT_FINISHED, "NFC discovery has not started", "尝试在未开始NFC扫描时停止NFC扫描"),
    NFC_TECH_ALREADY_CONNECTED(13022, "Tech already connected", "标签已经连接"),
    NFC_TECH_NOT_CONNECTED(13023, "Tech has not connected", "尝试在未连接标签时断开连接"),
    NFC_NFC_TAG_NOT_DISCOVERED(RtcEngineEvent.EvtType.EVT_USER_JOINED, "NFC tag has not been discovered", "未扫描到NFC标签"),
    NFC_INVALID_TECH(RtcEngineEvent.EvtType.EVT_USER_MUTE_AUDIO, "invalid tech", "无效的标签技术"),
    NFC_UNAVAILABLE_TECH(RtcEngineEvent.EvtType.EVT_USER_MUTE_VIDEO, "unavailable tech", "从标签上获取对应技术失败"),
    NFC_FUNCTION_NOT_SUPPORT(13024, "function not support", "当前标签技术不支持该功能"),
    NFC_SYSTEM_INTERNAL_ERROR(RtcEngineEvent.EvtType.EVT_LASTMILE_QUALITY, "system internal error", "相关读写操作失败"),
    NFC_CONNECT_FAIL(RtcEngineEvent.EvtType.EVT_USER_ENABLE_VIDEO, "connect fail", WifiTools.ERROR_INFO_CONNECT_ERROR),
    WIFI_NOT_INIT(12000, "not init", "未先调用 startWifi 接口"),
    WIFI_SYSTEM_NOT_SUPPORT(12001, "system not support", "当前系统不支持相关能力"),
    WIFI_PASSWORD_ERROR_WI_FI(12002, "password error Wi_Fi", "密码错误"),
    WIFI_CONNECTION_TIMEOUT(12003, "connection timeout", "连接超时"),
    WIFI_DUPLICATE_REQUEST(12004, "duplicate request", "重复连接 Wi_Fi"),
    WIFI_WIFI_NOT_TURNED_ON(12005, "wifi not turned on", "Android 特有，未打开 Wi_Fi 开关"),
    WIFI_GPS_NOT_TURNED_ON(12006, "gps not turned on", "Android 特有，未打开 GPS 定位开关"),
    WIFI_USER_DENIED(12007, "user denied", "用户拒绝授权链接 Wi_Fi"),
    WIFI_INVALID_SSID(12008, "invalid SSID", WifiTools.ERROR_INFO_WIFI_NOT_FIND),
    WIFI_SYSTEM_CONFIG_ERR(12009, "system config err", "系统运营商配置拒绝连接 Wi_Fi"),
    WIFI_SYSTEM_INTERNAL_ERROR(12010, "system internal error", "系统其他错误，需要在 errmsg 打印具体的错误原因"),
    WIFI_WEAPP_IN_BACKGROUND(12011, "weapp in background", "应用在后台无法配置 Wi_Fi"),
    WIFI_WIFI_CONFIG_MAY_BE_EXPIRED(12013, "wifi config may be expired", "系统保存的 Wi_Fi 配置过期，建议忘记 Wi_Fi 后重试"),
    BLUETOOTH_NOT_INIT(10000, "not init", "未初始化蓝牙适配器"),
    BLUETOOTH_NOT_AVAILABLE(10001, "not available", "当前蓝牙适配器不可用"),
    BLUETOOTH_NO_DEVICE(10002, "no device", "没有找到指定设备"),
    BLUETOOTH_NO_CONNECTION_FAIL(10003, "connection fail", WifiTools.ERROR_INFO_CONNECT_ERROR),
    BLUETOOTH_NO_SERVICE(10004, "no service", "没有找到指定服务"),
    BLUETOOTH_NO_CHARACTERISTIC(10005, "no characteristic", "没有找到指定特征值"),
    BLUETOOTH_NO_CONNECTION(10006, "no connection", "当前连接已断开"),
    BLUETOOTH_PROPERTY_NOT_SUPPORT(10007, "property not support", "当前特征值不支持此操作"),
    BLUETOOTH_SYSTEM_ERROR(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT, "system error", "其余所有系统上报的异常"),
    BLUETOOTH_SYSTEM_NOT_SUPPORT(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "system not support", "Android 系统特有，系统版本低于 4.3 不支持 BLE"),
    BLUETOOTH_OPERATE_TIME_OUT(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_START_EVENT, "operate time out", "连接超时"),
    BLUETOOTH_INVALID_DATA(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_STOP_EVENT, "invalid_data", "连接 deviceId 为空或者是格式不正确");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int errorCode;
    public final String errorDesc;
    public final String errorMsg;

    public static ErrorTips valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fa3b517198bddc4ea83c6b7fb740e0b", RobustBitConfig.DEFAULT_VALUE) ? (ErrorTips) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fa3b517198bddc4ea83c6b7fb740e0b") : (ErrorTips) Enum.valueOf(ErrorTips.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ErrorTips[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3fa3eeeacffd91c5b565ceac1c15f92f", RobustBitConfig.DEFAULT_VALUE) ? (ErrorTips[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3fa3eeeacffd91c5b565ceac1c15f92f") : (ErrorTips[]) values().clone();
    }

    ErrorTips(int i, String str, String str2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c66010efc9f2e887863845f731f9214", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c66010efc9f2e887863845f731f9214");
            return;
        }
        this.errorCode = i;
        this.errorMsg = str;
        this.errorDesc = str2;
    }
}
