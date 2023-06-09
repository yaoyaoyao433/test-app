package com.huawei.updatesdk.a.a.d;

import com.meituan.android.common.badge.data.Data;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.unionpay.tsmservice.data.AppStatus;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private static final Map<String, String> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("android.hardware.audio.output", "1");
        a.put("android.hardware.bluetooth", "2");
        a.put("android.hardware.bluetooth_le", "3");
        a.put("android.hardware.camera", "4");
        a.put("android.hardware.camera.any", "5");
        a.put("android.hardware.camera.autofocus", "6");
        a.put("android.hardware.camera.capability.manual_post_processing", "7");
        a.put("android.hardware.camera.flash", "8");
        a.put("android.hardware.camera.front", "9");
        a.put("android.hardware.consumerir", "A");
        a.put("android.hardware.faketouch", ErrorCode.ERROR_TYPE_B);
        a.put("android.hardware.fingerprint", "C");
        a.put("android.hardware.location", "D");
        a.put("android.hardware.location.gps", "E");
        a.put("android.hardware.location.network", "F");
        a.put("android.hardware.microphone", "G");
        a.put("android.hardware.nfc", ErrorCode.ERROR_TYPE_H);
        a.put("android.hardware.nfc.any", "I");
        a.put("android.hardware.nfc.hce", "J");
        a.put("android.hardware.nfc.hcef", "K");
        a.put("android.hardware.opengles.aep", "L");
        a.put("android.hardware.ram.normal", ErrorCode.ERROR_TYPE_M);
        a.put("android.hardware.screen.landscape", ErrorCode.ERROR_TYPE_N);
        a.put("android.hardware.screen.portrait", "O");
        a.put("android.hardware.sensor.accelerometer", "P");
        a.put("android.hardware.sensor.barometer", "Q");
        a.put("android.hardware.sensor.compass", "R");
        a.put("android.hardware.sensor.gyroscope", "S");
        a.put("android.hardware.sensor.light", "T");
        a.put("android.hardware.sensor.proximity", "U");
        a.put("android.hardware.sensor.stepcounter", "V");
        a.put("android.hardware.sensor.stepdetector", "W");
        a.put("android.hardware.telephony", "X");
        a.put("android.hardware.telephony.gsm", "Y");
        a.put("android.hardware.telephony.ims", "Z");
        a.put("android.hardware.touchscreen", "a");
        a.put("android.hardware.touchscreen.multitouch", "b");
        a.put("android.hardware.touchscreen.multitouch.distinct", com.huawei.hms.opendevice.c.a);
        a.put("android.hardware.touchscreen.multitouch.jazzhand", "d");
        a.put("android.hardware.usb.accessory", "e");
        a.put("android.hardware.usb.host", "f");
        a.put("android.hardware.vulkan.compute", com.meituan.android.neohybrid.neo.bridge.presenter.g.n);
        a.put("android.hardware.vulkan.level", "h");
        a.put("android.hardware.vulkan.version", "i");
        a.put("android.hardware.wifi", "j");
        a.put("android.hardware.wifi.direct", Data.TB_DATA_COL_KEY);
        a.put("android.hardware.wifi.passpoint", "l");
        a.put("android.software.activities_on_secondary_displays", "m");
        a.put("android.software.app_widgets", "n");
        a.put("android.software.autofill", "o");
        a.put("android.software.backup", "p");
        a.put("android.software.cant_save_state", "q");
        a.put("android.software.companion_device_setup", r.o);
        a.put("android.software.connectionservice", "s");
        a.put("android.software.cts", "t");
        a.put("android.software.device_admin", "u");
        a.put("android.software.file_based_encryption", "v");
        a.put("android.software.freeform_window_management", "w");
        a.put("android.software.home_screen", Constants.GestureMoveEvent.KEY_X);
        a.put("android.software.input_methods", Constants.GestureMoveEvent.KEY_Y);
        a.put("android.software.ipsec_tunnels", "z");
        a.put("android.software.live_wallpaper", "00");
        a.put("android.software.managed_users", "01");
        a.put("android.software.midi", "02");
        a.put("android.software.picture_in_picture", Constant.RECHARGE_MODE_BUSINESS_OFFICE);
        a.put("android.software.print", Constant.RECHARGE_MODE_DESIGNATED_AND_CACH);
        a.put("android.software.secure_lock_screen", AppStatus.OPEN);
        a.put("android.software.securely_removes_users", AppStatus.APPLY);
        a.put("android.software.verified_boot", AppStatus.VIEW);
        a.put("android.software.voice_recognizers", "08");
        a.put("android.software.webview", "09");
        a.put("android.sofware.nfc.beam", "0A");
        a.put("com.huawei.software.features.china", "0B");
        a.put("com.huawei.software.features.full", "0C");
        a.put("com.huawei.system.feature", "0D");
        a.put("com.nxp.mifare", "0E");
        a.put("huawei.android.hardware.stylus", "0F");
        a.put("android.hardware.audio.low_latency", "0G");
        a.put("android.hardware.camera.capability.raw", "0H");
        a.put("android.hardware.camera.external", "0I");
        a.put("android.hardware.telephony.cdma", "0J");
        a.put("android.software.file_based_encryption", "0K");
        a.put("android.software.sip", "0L");
        a.put("android.software.sip.voip", "0M");
        a.put("android.software.vr.mode", "0N");
        a.put("cn.google.services", "0O");
        a.put("com.google.android.feature.services_updater", "0P");
        a.put("com.google.android.feature.ZERO_TOUCH", "0Q");
        a.put("com.huawei.software.features.oversea", "0R");
    }

    public static String a(String str) {
        return a.containsKey(str) ? a.get(str) : str;
    }
}
