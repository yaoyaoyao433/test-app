package com.tencent.rtmp.sharp.jni;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.rtmp.sharp.jni.TraeMediaPlayer;
import com.unionpay.tsmservice.mi.data.Constant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public class TraeAudioManager extends BroadcastReceiver {
    public static final String ACTION_TRAEAUDIOMANAGER_NOTIFY = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY";
    public static final String ACTION_TRAEAUDIOMANAGER_REQUEST = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST";
    public static final String ACTION_TRAEAUDIOMANAGER_RES = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES";
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP = 128;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO = 16;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO_CARKIT = 64;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO_HEADSET = 32;
    static final int AUDIO_DEVICE_OUT_EARPIECE = 1;
    static final int AUDIO_DEVICE_OUT_SPEAKER = 2;
    static final int AUDIO_DEVICE_OUT_WIRED_HEADPHONE = 8;
    static final int AUDIO_DEVICE_OUT_WIRED_HEADSET = 4;
    public static final int AUDIO_MANAGER_ACTIVE_NONE = 0;
    public static final int AUDIO_MANAGER_ACTIVE_RING = 2;
    public static final int AUDIO_MANAGER_ACTIVE_VOICECALL = 1;
    static final String AUDIO_PARAMETER_STREAM_ROUTING = "routing";
    public static final String CONNECTDEVICE_DEVICENAME = "CONNECTDEVICE_DEVICENAME";
    public static final String CONNECTDEVICE_RESULT_DEVICENAME = "CONNECTDEVICE_RESULT_DEVICENAME";
    public static final String DEVICE_BLUETOOTHHEADSET = "DEVICE_BLUETOOTHHEADSET";
    public static final String DEVICE_EARPHONE = "DEVICE_EARPHONE";
    public static final String DEVICE_NONE = "DEVICE_NONE";
    public static final String DEVICE_SPEAKERPHONE = "DEVICE_SPEAKERPHONE";
    public static final int DEVICE_STATUS_CONNECTED = 2;
    public static final int DEVICE_STATUS_CONNECTING = 1;
    public static final int DEVICE_STATUS_DISCONNECTED = 0;
    public static final int DEVICE_STATUS_DISCONNECTING = 3;
    public static final int DEVICE_STATUS_ERROR = -1;
    public static final int DEVICE_STATUS_UNCHANGEABLE = 4;
    public static final String DEVICE_WIREDHEADSET = "DEVICE_WIREDHEADSET";
    public static final int EARACTION_AWAY = 0;
    public static final int EARACTION_CLOSE = 1;
    public static final String EXTRA_DATA_AVAILABLEDEVICE_LIST = "EXTRA_DATA_AVAILABLEDEVICE_LIST";
    public static final String EXTRA_DATA_CONNECTEDDEVICE = "EXTRA_DATA_CONNECTEDDEVICE";
    public static final String EXTRA_DATA_DEVICECONFIG = "EXTRA_DATA_DEVICECONFIG";
    public static final String EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME = "EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME";
    public static final String EXTRA_DATA_PREV_CONNECTEDDEVICE = "EXTRA_DATA_PREV_CONNECTEDDEVICE";
    public static final String EXTRA_DATA_ROUTESWITCHEND_DEV = "EXTRA_DATA_ROUTESWITCHEND_DEV";
    public static final String EXTRA_DATA_ROUTESWITCHEND_TIME = "EXTRA_DATA_ROUTESWITCHEND_TIME";
    public static final String EXTRA_DATA_ROUTESWITCHSTART_FROM = "EXTRA_DATA_ROUTESWITCHSTART_FROM";
    public static final String EXTRA_DATA_ROUTESWITCHSTART_TO = "EXTRA_DATA_ROUTESWITCHSTART_TO";
    public static final String EXTRA_DATA_STREAMTYPE = "EXTRA_DATA_STREAMTYPE";
    public static final String EXTRA_EARACTION = "EXTRA_EARACTION";
    public static final int FORCE_ANALOG_DOCK = 8;
    public static final int FORCE_BT_A2DP = 4;
    public static final int FORCE_BT_CAR_DOCK = 6;
    public static final int FORCE_BT_DESK_DOCK = 7;
    public static final int FORCE_BT_SCO = 3;
    public static final int FORCE_DEFAULT = 0;
    public static final int FORCE_DIGITAL_DOCK = 9;
    public static final int FORCE_HEADPHONES = 2;
    public static final int FORCE_NONE = 0;
    public static final int FORCE_NO_BT_A2DP = 10;
    public static final int FORCE_SPEAKER = 1;
    public static final int FORCE_WIRED_ACCESSORY = 5;
    public static final int FOR_COMMUNICATION = 0;
    public static final int FOR_DOCK = 3;
    public static final int FOR_MEDIA = 1;
    public static final int FOR_RECORD = 2;
    public static final String GETCONNECTEDDEVICE_RESULT_LIST = "GETCONNECTEDDEVICE_REULT_LIST";
    public static final String GETCONNECTINGDEVICE_RESULT_LIST = "GETCONNECTINGDEVICE_REULT_LIST";
    public static final String ISDEVICECHANGABLED_RESULT_ISCHANGABLED = "ISDEVICECHANGABLED_REULT_ISCHANGABLED";
    public static boolean IsEarPhoneSupported = false;
    public static boolean IsMusicScene = false;
    public static boolean IsUpdateSceneFlag = false;
    public static final int MODE_MUSIC_PLAYBACK = 2;
    public static final int MODE_MUSIC_PLAY_RECORD = 1;
    public static final int MODE_MUSIC_PLAY_RECORD_HIGH_QUALITY = 3;
    public static final int MODE_MUSIC_PLAY_RECORD_LOW_QUALITY = 5;
    public static final int MODE_VOICE_CHAT = 0;
    public static final int MODE_VOICE_PLAYBACK = 4;
    public static final String MUSIC_CONFIG = "DEVICE_SPEAKERPHONE;DEVICE_WIREDHEADSET;DEVICE_BLUETOOTHHEADSET;";
    public static final String NOTIFY_DEVICECHANGABLE_UPDATE = "NOTIFY_DEVICECHANGABLE_UPDATE";
    public static final String NOTIFY_DEVICECHANGABLE_UPDATE_DATE = "NOTIFY_DEVICECHANGABLE_UPDATE_DATE";
    public static final String NOTIFY_DEVICELIST_UPDATE = "NOTIFY_DEVICELISTUPDATE";
    public static final String NOTIFY_RING_COMPLETION = "NOTIFY_RING_COMPLETION";
    public static final String NOTIFY_ROUTESWITCHEND = "NOTIFY_ROUTESWITCHEND";
    public static final String NOTIFY_ROUTESWITCHSTART = "NOTIFY_ROUTESWITCHSTART";
    public static final String NOTIFY_SERVICE_STATE = "NOTIFY_SERVICE_STATE";
    public static final String NOTIFY_SERVICE_STATE_DATE = "NOTIFY_SERVICE_STATE_DATE";
    public static final String NOTIFY_STREAMTYPE_UPDATE = "NOTIFY_STREAMTYPE_UPDATE";
    private static final int NUM_FORCE_CONFIG = 11;
    private static final int NUM_FORCE_USE = 4;
    public static final String OPERATION_CONNECTDEVICE = "OPERATION_CONNECTDEVICE";
    public static final String OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE = "OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE";
    public static final String OPERATION_EARACTION = "OPERATION_EARACTION";
    public static final String OPERATION_GETCONNECTEDDEVICE = "OPERATION_GETCONNECTEDDEVICE";
    public static final String OPERATION_GETCONNECTINGDEVICE = "OPERATION_GETCONNECTINGDEVICE";
    public static final String OPERATION_GETDEVICELIST = "OPERATION_GETDEVICELIST";
    public static final String OPERATION_GETSTREAMTYPE = "OPERATION_GETSTREAMTYPE";
    public static final String OPERATION_ISDEVICECHANGABLED = "OPERATION_ISDEVICECHANGABLED";
    public static final String OPERATION_RECOVER_AUDIO_FOCUS = "OPERATION_RECOVER_AUDIO_FOCUS";
    public static final String OPERATION_REGISTERAUDIOSESSION = "OPERATION_REGISTERAUDIOSESSION";
    public static final String OPERATION_REQUEST_RELEASE_AUDIO_FOCUS = "OPERATION_REQUEST_RELEASE_AUDIO_FOCUS";
    public static final String OPERATION_STARTRING = "OPERATION_STARTRING";
    public static final String OPERATION_STARTSERVICE = "OPERATION_STARTSERVICE";
    public static final String OPERATION_STOPRING = "OPERATION_STOPRING";
    public static final String OPERATION_STOPSERVICE = "OPERATION_STOPSERVICE";
    public static final String OPERATION_VOICECALL_AUDIOPARAM_CHANGED = "OPERATION_VOICECALL_AUDIOPARAM_CHANGED";
    public static final String OPERATION_VOICECALL_POSTPROCESS = "OPERATION_VOICECALL_POSTROCESS";
    public static final String OPERATION_VOICECALL_PREPROCESS = "OPERATION_VOICECALL_PREPROCESS";
    public static final String PARAM_DEVICE = "PARAM_DEVICE";
    public static final String PARAM_ERROR = "PARAM_ERROR";
    public static final String PARAM_ISHOSTSIDE = "PARAM_ISHOSTSIDE";
    public static final String PARAM_MODEPOLICY = "PARAM_MODEPOLICY";
    public static final String PARAM_OPERATION = "PARAM_OPERATION";
    public static final String PARAM_RES_ERRCODE = "PARAM_RES_ERRCODE";
    public static final String PARAM_RING_DATASOURCE = "PARAM_RING_DATASOURCE";
    public static final String PARAM_RING_FILEPATH = "PARAM_RING_FILEPATH";
    public static final String PARAM_RING_LOOP = "PARAM_RING_LOOP";
    public static final String PARAM_RING_LOOPCOUNT = "PARAM_RING_LOOPCOUNT";
    public static final String PARAM_RING_MODE = "PARAM_RING_MODE";
    public static final String PARAM_RING_RSID = "PARAM_RING_RSID";
    public static final String PARAM_RING_URI = "PARAM_RING_URI";
    public static final String PARAM_RING_USERDATA_STRING = "PARAM_RING_USERDATA_STRING";
    public static final String PARAM_SESSIONID = "PARAM_SESSIONID";
    public static final String PARAM_STATUS = "PARAM_STATUS";
    public static final String PARAM_STREAMTYPE = "PARAM_STREAMTYPE";
    public static final String REGISTERAUDIOSESSION_ISREGISTER = "REGISTERAUDIOSESSION_ISREGISTER";
    public static final int RES_ERRCODE_DEVICE_BTCONNCECTED_TIMEOUT = 10;
    public static final int RES_ERRCODE_DEVICE_NOT_VISIABLE = 8;
    public static final int RES_ERRCODE_DEVICE_UNCHANGEABLE = 9;
    public static final int RES_ERRCODE_DEVICE_UNKOWN = 7;
    public static final int RES_ERRCODE_NONE = 0;
    public static final int RES_ERRCODE_RING_NOT_EXIST = 5;
    public static final int RES_ERRCODE_SERVICE_OFF = 1;
    public static final int RES_ERRCODE_STOPRING_INTERRUPT = 4;
    public static final int RES_ERRCODE_VOICECALLPOST_INTERRUPT = 6;
    public static final int RES_ERRCODE_VOICECALL_EXIST = 2;
    public static final int RES_ERRCODE_VOICECALL_NOT_EXIST = 3;
    public static final String VIDEO_CONFIG = "DEVICE_EARPHONE;DEVICE_SPEAKERPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
    public static final String VOICECALL_CONFIG = "DEVICE_SPEAKERPHONE;DEVICE_EARPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
    public static boolean enableDeviceSwitchFlag = true;
    Context _context;
    TraeAudioManagerLooper mTraeAudioManagerLooper;
    static ReentrantLock _glock = new ReentrantLock();
    static TraeAudioManager _ginstance = null;
    static int _gHostProcessId = -1;
    static final String[] forceName = {"FORCE_NONE", "FORCE_SPEAKER", "FORCE_HEADPHONES", "FORCE_BT_SCO", "FORCE_BT_A2DP", "FORCE_WIRED_ACCESSORY", "FORCE_BT_CAR_DOCK", "FORCE_BT_DESK_DOCK", "FORCE_ANALOG_DOCK", "FORCE_NO_BT_A2DP", "FORCE_DIGITAL_DOCK"};
    AudioManager _am = null;
    int _activeMode = 0;
    int _prevMode = 0;
    int _streamType = 0;
    int _modePolicy = -1;
    boolean IsBluetoothA2dpExisted = true;
    TraeAudioSessionHost _audioSessionHost = null;
    DeviceConfigManager _deviceConfigManager = null;
    BluetoohHeadsetCheckInterface _bluetoothCheck = null;
    String sessionConnectedDev = DEVICE_NONE;
    ReentrantLock _lock = new ReentrantLock();
    switchThread _switchThread = null;

    int InternalSessionEarAction(HashMap<String, Object> hashMap) {
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class Parameters {
        public static final String BLUETOOTHPOLICY = "com.tencent.sharp.TraeAudioManager.Parameters.BLUETOOTHPOLICY";
        public static final String CONTEXT = "com.tencent.sharp.TraeAudioManager.Parameters.CONTEXT";
        public static final String DEVICECONFIG = "com.tencent.sharp.TraeAudioManager.Parameters.DEVICECONFIG";
        public static final String MODEPOLICY = "com.tencent.sharp.TraeAudioManager.Parameters.MODEPOLICY";

        public Parameters() {
        }
    }

    public static boolean checkDevName(String str) {
        if (str == null) {
            return false;
        }
        return DEVICE_SPEAKERPHONE.equals(str) || DEVICE_EARPHONE.equals(str) || DEVICE_WIREDHEADSET.equals(str) || DEVICE_BLUETOOTHHEADSET.equals(str);
    }

    public static boolean isHandfree(String str) {
        return checkDevName(str) && DEVICE_SPEAKERPHONE.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class DeviceConfigManager {
        HashMap<String, DeviceConfig> deviceConfigs = new HashMap<>();
        String prevConnectedDevice = TraeAudioManager.DEVICE_NONE;
        String connectedDevice = TraeAudioManager.DEVICE_NONE;
        String connectingDevice = TraeAudioManager.DEVICE_NONE;
        ReentrantLock mLock = new ReentrantLock();
        boolean visiableUpdate = false;
        String _bluetoothDevName = "unknow";

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public class DeviceConfig {
            String deviceName = TraeAudioManager.DEVICE_NONE;
            boolean visible = false;
            int priority = 0;

            public DeviceConfig() {
            }

            public boolean init(String str, int i) {
                if (str == null || str.length() <= 0 || !TraeAudioManager.checkDevName(str)) {
                    return false;
                }
                this.deviceName = str;
                this.priority = i;
                return true;
            }

            public String getDeviceName() {
                return this.deviceName;
            }

            public boolean getVisible() {
                return this.visible;
            }

            public int getPriority() {
                return this.priority;
            }

            public void setVisible(boolean z) {
                this.visible = z;
            }
        }

        public DeviceConfigManager() {
        }

        public boolean init(String str) {
            String replace;
            AudioDeviceInterface.LogTraceEntry(" strConfigs:" + str);
            if (str == null || str.length() <= 0 || (replace = str.replace("\n", "").replace("\r", "")) == null || replace.length() <= 0) {
                return false;
            }
            if (replace.indexOf(";") < 0) {
                replace = replace + ";";
            }
            String[] split = replace.split(";");
            if (split == null || 1 > split.length) {
                return false;
            }
            this.mLock.lock();
            for (int i = 0; i < split.length; i++) {
                _addConfig(split[i], i);
            }
            this.mLock.unlock();
            TraeAudioManager.this.printDevices();
            return true;
        }

        boolean _addConfig(String str, int i) {
            AudioDeviceInterface.LogTraceEntry(" devName:" + str + " priority:" + i);
            DeviceConfig deviceConfig = new DeviceConfig();
            if (deviceConfig.init(str, i)) {
                if (this.deviceConfigs.containsKey(str)) {
                    if (QLog.isColorLevel()) {
                        QLog.e("TRAE", 2, "err dev exist!");
                    }
                    return false;
                }
                this.deviceConfigs.put(str, deviceConfig);
                this.visiableUpdate = true;
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, " n" + getDeviceNumber() + " 0:" + getDeviceName(0));
                }
                AudioDeviceInterface.LogTraceExit();
                return true;
            }
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, " err dev init!");
            }
            return false;
        }

        public void clearConfig() {
            this.mLock.lock();
            this.deviceConfigs.clear();
            this.prevConnectedDevice = TraeAudioManager.DEVICE_NONE;
            this.connectedDevice = TraeAudioManager.DEVICE_NONE;
            this.connectingDevice = TraeAudioManager.DEVICE_NONE;
            this.mLock.unlock();
        }

        public boolean getVisiableUpdateFlag() {
            this.mLock.lock();
            boolean z = this.visiableUpdate;
            this.mLock.unlock();
            return z;
        }

        public void resetVisiableUpdateFlag() {
            this.mLock.lock();
            this.visiableUpdate = false;
            this.mLock.unlock();
        }

        public boolean setVisible(String str, boolean z) {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            boolean z2 = true;
            if (deviceConfig == null || deviceConfig.getVisible() == z) {
                z2 = false;
            } else {
                deviceConfig.setVisible(z);
                this.visiableUpdate = true;
                if (QLog.isColorLevel()) {
                    StringBuilder sb = new StringBuilder(" ++setVisible:");
                    sb.append(str);
                    sb.append(z ? " Y" : " N");
                    QLog.w("TRAE", 2, sb.toString());
                }
            }
            this.mLock.unlock();
            return z2;
        }

        public void setBluetoothName(String str) {
            if (str == null) {
                this._bluetoothDevName = "unknow";
            } else if (str.isEmpty()) {
                this._bluetoothDevName = "unknow";
            } else {
                this._bluetoothDevName = str;
            }
        }

        public String getBluetoothName() {
            return this._bluetoothDevName;
        }

        public boolean getVisible(String str) {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            boolean visible = deviceConfig != null ? deviceConfig.getVisible() : false;
            this.mLock.unlock();
            return visible;
        }

        public int getPriority(String str) {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            int priority = deviceConfig != null ? deviceConfig.getPriority() : -1;
            this.mLock.unlock();
            return priority;
        }

        public int getDeviceNumber() {
            this.mLock.lock();
            int size = this.deviceConfigs.size();
            this.mLock.unlock();
            return size;
        }

        public String getDeviceName(int i) {
            DeviceConfig deviceConfig;
            String str = TraeAudioManager.DEVICE_NONE;
            this.mLock.lock();
            Iterator<Map.Entry<String, DeviceConfig>> it = this.deviceConfigs.entrySet().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    deviceConfig = null;
                    break;
                }
                Map.Entry<String, DeviceConfig> next = it.next();
                if (i2 == i) {
                    deviceConfig = next.getValue();
                    break;
                }
                i2++;
            }
            if (deviceConfig != null) {
                str = deviceConfig.getDeviceName();
            }
            this.mLock.unlock();
            return str;
        }

        public String getAvailabledHighestPriorityDevice(String str) {
            this.mLock.lock();
            DeviceConfig deviceConfig = null;
            for (Map.Entry<String, DeviceConfig> entry : this.deviceConfigs.entrySet()) {
                entry.getKey();
                entry.getValue();
                DeviceConfig value = entry.getValue();
                if (value != null && value.getVisible() && !value.getDeviceName().equals(str) && (deviceConfig == null || value.getPriority() >= deviceConfig.getPriority())) {
                    deviceConfig = value;
                }
            }
            this.mLock.unlock();
            return deviceConfig != null ? deviceConfig.getDeviceName() : TraeAudioManager.DEVICE_SPEAKERPHONE;
        }

        public String getAvailabledHighestPriorityDevice() {
            this.mLock.lock();
            DeviceConfig deviceConfig = null;
            for (Map.Entry<String, DeviceConfig> entry : this.deviceConfigs.entrySet()) {
                entry.getKey();
                entry.getValue();
                DeviceConfig value = entry.getValue();
                if (value != null && value.getVisible() && (deviceConfig == null || value.getPriority() >= deviceConfig.getPriority())) {
                    deviceConfig = value;
                }
            }
            this.mLock.unlock();
            return deviceConfig != null ? deviceConfig.getDeviceName() : TraeAudioManager.DEVICE_SPEAKERPHONE;
        }

        public String getConnectingDevice() {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(this.connectingDevice);
            String str = (deviceConfig == null || !deviceConfig.getVisible()) ? null : this.connectingDevice;
            this.mLock.unlock();
            return str;
        }

        public String getConnectedDevice() {
            this.mLock.lock();
            String _getConnectedDevice = _getConnectedDevice();
            this.mLock.unlock();
            return _getConnectedDevice;
        }

        public String getPrevConnectedDevice() {
            this.mLock.lock();
            String _getPrevConnectedDevice = _getPrevConnectedDevice();
            this.mLock.unlock();
            return _getPrevConnectedDevice;
        }

        public boolean setConnecting(String str) {
            boolean z;
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            if (deviceConfig == null || !deviceConfig.getVisible()) {
                z = false;
            } else {
                this.connectingDevice = str;
                z = true;
            }
            this.mLock.unlock();
            return z;
        }

        public boolean setConnected(String str) {
            boolean z;
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            if (deviceConfig == null || !deviceConfig.getVisible()) {
                z = false;
            } else {
                if (this.connectedDevice != null && !this.connectedDevice.equals(str)) {
                    this.prevConnectedDevice = this.connectedDevice;
                }
                this.connectedDevice = str;
                this.connectingDevice = "";
                z = true;
            }
            this.mLock.unlock();
            return z;
        }

        public boolean isConnected(String str) {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            boolean equals = (deviceConfig == null || !deviceConfig.getVisible()) ? false : this.connectedDevice.equals(str);
            this.mLock.unlock();
            return equals;
        }

        public HashMap<String, Object> getSnapParams() {
            HashMap<String, Object> hashMap = new HashMap<>();
            this.mLock.lock();
            hashMap.put(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST, _getAvailableDeviceList());
            hashMap.put(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE, _getConnectedDevice());
            hashMap.put(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE, _getPrevConnectedDevice());
            this.mLock.unlock();
            return hashMap;
        }

        public ArrayList<String> getAvailableDeviceList() {
            new ArrayList();
            this.mLock.lock();
            ArrayList<String> _getAvailableDeviceList = _getAvailableDeviceList();
            this.mLock.unlock();
            return _getAvailableDeviceList;
        }

        ArrayList<String> _getAvailableDeviceList() {
            ArrayList<String> arrayList = new ArrayList<>();
            for (Map.Entry<String, DeviceConfig> entry : this.deviceConfigs.entrySet()) {
                DeviceConfig value = entry.getValue();
                if (value != null && value.getVisible()) {
                    arrayList.add(value.getDeviceName());
                }
            }
            return arrayList;
        }

        String _getConnectedDevice() {
            DeviceConfig deviceConfig = this.deviceConfigs.get(this.connectedDevice);
            return (deviceConfig == null || !deviceConfig.getVisible()) ? TraeAudioManager.DEVICE_NONE : this.connectedDevice;
        }

        String _getPrevConnectedDevice() {
            DeviceConfig deviceConfig = this.deviceConfigs.get(this.prevConnectedDevice);
            return (deviceConfig == null || !deviceConfig.getVisible()) ? TraeAudioManager.DEVICE_NONE : this.prevConnectedDevice;
        }
    }

    void printDevices() {
        AudioDeviceInterface.LogTraceEntry("");
        int deviceNumber = this._deviceConfigManager.getDeviceNumber();
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "   ConnectedDevice:" + this._deviceConfigManager.getConnectedDevice());
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "   ConnectingDevice:" + this._deviceConfigManager.getConnectingDevice());
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "   prevConnectedDevice:" + this._deviceConfigManager.getPrevConnectedDevice());
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "   AHPDevice:" + this._deviceConfigManager.getAvailabledHighestPriorityDevice());
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "   deviceNamber:" + deviceNumber);
        }
        for (int i = 0; i < deviceNumber; i++) {
            String deviceName = this._deviceConfigManager.getDeviceName(i);
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "      " + i + " devName:" + deviceName + " Visible:" + this._deviceConfigManager.getVisible(deviceName) + " Priority:" + this._deviceConfigManager.getPriority(deviceName));
            }
        }
        String[] strArr = (String[]) this._deviceConfigManager.getAvailableDeviceList().toArray(new String[0]);
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "   AvailableNamber:" + strArr.length);
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "      " + i2 + " devName:" + str + " Visible:" + this._deviceConfigManager.getVisible(str) + " Priority:" + this._deviceConfigManager.getPriority(str));
            }
        }
        AudioDeviceInterface.LogTraceExit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isCloseSystemAPM(int i) {
        if (i != -1) {
            return false;
        }
        if (Build.MANUFACTURER.equals(Constant.DEVICE_XIAOMI)) {
            if (Build.MODEL.equals("MI 2") || Build.MODEL.equals("MI 2A") || Build.MODEL.equals("MI 2S") || Build.MODEL.equals("MI 2SC")) {
                return true;
            }
        } else if (Build.MANUFACTURER.equals("samsung") && Build.MODEL.equals("SCH-I959")) {
            return true;
        }
        return false;
    }

    public static boolean IsEabiLowVersionByAbi(String str) {
        if (str == null) {
            return true;
        }
        if (str.contains("x86") || str.contains("mips")) {
            return false;
        }
        if (str.equalsIgnoreCase("armeabi")) {
            return true;
        }
        return (str.equalsIgnoreCase("armeabi-v7a") || str.equalsIgnoreCase("arm64-v8a")) ? false : true;
    }

    static boolean IsEabiLowVersion() {
        String str = Build.CPU_ABI;
        String str2 = "unknown";
        if (Build.VERSION.SDK_INT >= 8) {
            try {
                str2 = (String) Build.class.getDeclaredField("CPU_ABI2").get(null);
            } catch (Exception unused) {
                return IsEabiLowVersionByAbi(str);
            }
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "IsEabiVersion CPU_ABI:" + str + " CPU_ABI2:" + str2);
        }
        return IsEabiLowVersionByAbi(str) && IsEabiLowVersionByAbi(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getAudioSource(int i) {
        if (IsMusicScene) {
            return 0;
        }
        if (IsEabiLowVersion()) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "[Config] armeabi low Version, getAudioSource _audioSourcePolicy:" + i + " source:0");
            }
            return 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i >= 0) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "[Config] getAudioSource _audioSourcePolicy:" + i + " source:" + i);
            }
            return i;
        }
        int i3 = i2 >= 11 ? 7 : 0;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "[Config] getAudioSource _audioSourcePolicy:" + i + " source:" + i3);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getAudioStreamType(int i) {
        if (IsMusicScene) {
            return 3;
        }
        if (IsEabiLowVersion()) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "[Config] armeabi low Version, getAudioStreamType audioStreamTypePolicy:" + i + " streamType:3");
            }
            return 3;
        }
        int i2 = i >= 0 ? i : Build.VERSION.SDK_INT >= 9 ? 0 : 3;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "[Config] getAudioStreamType audioStreamTypePolicy:" + i + " streamType:" + i2);
        }
        return i2;
    }

    static int getCallAudioMode(int i) {
        if (IsMusicScene) {
            return 0;
        }
        if (IsEabiLowVersion()) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "[Config] armeabi low Version, getCallAudioMode modePolicy:" + i + " mode:0");
            }
            return 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i >= 0) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "[Config] getCallAudioMode modePolicy:" + i + " mode:" + i);
            }
            return i;
        }
        int i3 = i2 >= 11 ? 3 : 0;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "[Config] getCallAudioMode _modePolicy:" + i + " mode:" + i3 + "facturer:" + Build.MANUFACTURER + " model:" + Build.MODEL);
        }
        return i3;
    }

    void updateDeviceStatus() {
        boolean z;
        int deviceNumber = this._deviceConfigManager.getDeviceNumber();
        for (int i = 0; i < deviceNumber; i++) {
            String deviceName = this._deviceConfigManager.getDeviceName(i);
            if (deviceName != null) {
                if (deviceName.equals(DEVICE_BLUETOOTHHEADSET)) {
                    if (this._bluetoothCheck == null) {
                        z = this._deviceConfigManager.setVisible(deviceName, false);
                    } else {
                        z = this._deviceConfigManager.setVisible(deviceName, this._bluetoothCheck.isConnected());
                    }
                } else if (deviceName.equals(DEVICE_WIREDHEADSET)) {
                    z = this._deviceConfigManager.setVisible(deviceName, this._am.isWiredHeadsetOn());
                } else if (deviceName.equals(DEVICE_SPEAKERPHONE)) {
                    this._deviceConfigManager.setVisible(deviceName, true);
                }
                if (z && QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "pollUpdateDevice dev:" + deviceName + " Visible:" + this._deviceConfigManager.getVisible(deviceName));
                }
            }
            z = false;
            if (z) {
                QLog.w("TRAE", 2, "pollUpdateDevice dev:" + deviceName + " Visible:" + this._deviceConfigManager.getVisible(deviceName));
            }
        }
        checkAutoDeviceListUpdate();
    }

    void _updateEarphoneVisable() {
        if (this._deviceConfigManager.getVisible(DEVICE_WIREDHEADSET)) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, " detected headset plugin,so disable earphone");
            }
            this._deviceConfigManager.setVisible(DEVICE_EARPHONE, false);
            return;
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, " detected headset plugout,so enable earphone");
        }
        this._deviceConfigManager.setVisible(DEVICE_EARPHONE, true);
    }

    void checkAutoDeviceListUpdate() {
        if (this._deviceConfigManager.getVisiableUpdateFlag()) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "checkAutoDeviceListUpdate got update!");
            }
            _updateEarphoneVisable();
            this._deviceConfigManager.resetVisiableUpdateFlag();
            internalSendMessage(TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_UPDATE, new HashMap<>());
        }
    }

    void checkDevicePlug(String str, boolean z) {
        if (this._deviceConfigManager.getVisiableUpdateFlag()) {
            if (QLog.isColorLevel()) {
                StringBuilder sb = new StringBuilder("checkDevicePlug got update dev:");
                sb.append(str);
                sb.append(z ? " piugin" : " plugout");
                sb.append(" connectedDev:");
                sb.append(this._deviceConfigManager.getConnectedDevice());
                QLog.w("TRAE", 2, sb.toString());
            }
            _updateEarphoneVisable();
            this._deviceConfigManager.resetVisiableUpdateFlag();
            if (z) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(PARAM_DEVICE, str);
                internalSendMessage(TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE, hashMap);
                return;
            }
            String connectedDevice = this._deviceConfigManager.getConnectedDevice();
            if (connectedDevice.equals(str) || connectedDevice.equals(DEVICE_NONE)) {
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put(PARAM_DEVICE, str);
                internalSendMessage(TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE, hashMap2);
                return;
            }
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, " ---No switch,plugout:" + str + " connectedDev:" + connectedDevice);
            }
            internalSendMessage(TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_UPDATE, new HashMap<>());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class TraeAudioManagerLooper extends Thread {
        public static final int MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE = 32786;
        public static final int MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE = 32787;
        public static final int MESSAGE_AUTO_DEVICELIST_UPDATE = 32785;
        public static final int MESSAGE_BEGIN = 32768;
        public static final int MESSAGE_CONNECTDEVICE = 32775;
        public static final int MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE = 32789;
        public static final int MESSAGE_DISABLE = 32773;
        public static final int MESSAGE_EARACTION = 32776;
        public static final int MESSAGE_ENABLE = 32772;
        public static final int MESSAGE_GETCONNECTEDDEVICE = 32778;
        public static final int MESSAGE_GETCONNECTINGDEVICE = 32779;
        public static final int MESSAGE_GETDEVICELIST = 32774;
        public static final int MESSAGE_GETSTREAMTYPE = 32784;
        public static final int MESSAGE_ISDEVICECHANGABLED = 32777;
        public static final int MESSAGE_RECOVER_AUDIO_FOCUS = 32791;
        public static final int MESSAGE_REQUEST_RELEASE_AUDIO_FOCUS = 32790;
        public static final int MESSAGE_STARTRING = 32782;
        public static final int MESSAGE_STOPRING = 32783;
        public static final int MESSAGE_VOICECALLPOSTPROCESS = 32781;
        public static final int MESSAGE_VOICECALLPREPROCESS = 32780;
        public static final int MESSAGE_VOICECALL_AUIDOPARAM_CHANGED = 32788;
        TraeAudioManager _parent;
        Handler mMsgHandler = null;
        TraeMediaPlayer _ringPlayer = null;
        long _ringSessionID = -1;
        String _ringOperation = "";
        String _ringUserdata = "";
        final boolean[] _started = {false};
        boolean _enabled = false;
        String _lastCfg = "";
        int _preServiceMode = 0;
        int _preRingMode = 0;
        long _voiceCallSessionID = -1;
        String _voiceCallOperation = "";
        AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener = null;
        int _focusSteamType = 0;

        @TargetApi(8)
        void abandonAudioFocus() {
        }

        public TraeAudioManagerLooper(TraeAudioManager traeAudioManager) {
            this._parent = null;
            this._parent = traeAudioManager;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "TraeAudioManagerLooper start...");
            }
            start();
            synchronized (this._started) {
                if (!this._started[0]) {
                    try {
                        this._started.wait(PayTask.j);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "  start used:" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            }
        }

        public void quit() {
            AudioDeviceInterface.LogTraceEntry("");
            if (this.mMsgHandler == null) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.mMsgHandler.getLooper().quit();
            synchronized (this._started) {
                if (this._started[0]) {
                    try {
                        this._started.wait(10000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "  quit used:" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            }
            this.mMsgHandler = null;
            AudioDeviceInterface.LogTraceExit();
        }

        public int sendMessage(int i, HashMap<String, Object> hashMap) {
            if (this.mMsgHandler != null) {
                return this.mMsgHandler.sendMessage(Message.obtain(this.mMsgHandler, i, hashMap)) ? 0 : -1;
            }
            StringBuilder sb = new StringBuilder(" fail mMsgHandler==null _enabled:");
            sb.append(this._enabled ? "Y" : ErrorCode.ERROR_TYPE_N);
            sb.append(" activeMode:");
            sb.append(TraeAudioManager.this._activeMode);
            sb.append(" msg:");
            sb.append(i);
            AudioDeviceInterface.LogTraceEntry(sb.toString());
            return -1;
        }

        void startService(HashMap<String, Object> hashMap) {
            String str = (String) hashMap.get(TraeAudioManager.EXTRA_DATA_DEVICECONFIG);
            new StringBuilder("startService cfg:").append(str);
            StringBuilder sb = new StringBuilder(" _enabled:");
            sb.append(this._enabled ? "Y" : ErrorCode.ERROR_TYPE_N);
            sb.append(" activeMode:");
            sb.append(TraeAudioManager.this._activeMode);
            sb.append(" cfg:");
            sb.append(str);
            AudioDeviceInterface.LogTraceEntry(sb.toString());
            if (TraeAudioManager.this._context == null) {
                return;
            }
            QLog.w("TRAE", 2, "   startService:" + str);
            if (!(this._enabled && this._lastCfg.equals(str)) && TraeAudioManager.this._activeMode == 0) {
                if (this._enabled) {
                    stopService();
                }
                _prev_startService();
                TraeAudioManager.this._context.getSystemService("audio");
                TraeAudioManager.this._deviceConfigManager.clearConfig();
                TraeAudioManager.this._deviceConfigManager.init(str);
                this._lastCfg = str;
                if (TraeAudioManager.this._am != null) {
                    this._preServiceMode = TraeAudioManager.this._am.getMode();
                }
                this._enabled = true;
                if (this._ringPlayer == null) {
                    this._ringPlayer = new TraeMediaPlayer(TraeAudioManager.this._context, new TraeMediaPlayer.OnCompletionListener() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.TraeAudioManagerLooper.1
                        @Override // com.tencent.rtmp.sharp.jni.TraeMediaPlayer.OnCompletionListener
                        public void onCompletion() {
                            if (QLog.isColorLevel()) {
                                QLog.w("TRAE", 2, "_ringPlayer onCompletion _activeMode:" + TraeAudioManager.this._activeMode + " _preRingMode:" + TraeAudioManagerLooper.this._preRingMode);
                            }
                            HashMap<String, Object> hashMap2 = new HashMap<>();
                            hashMap2.put(TraeAudioManager.PARAM_ISHOSTSIDE, Boolean.TRUE);
                            TraeAudioManagerLooper.this.sendMessage(TraeAudioManagerLooper.MESSAGE_STOPRING, hashMap2);
                            TraeAudioManagerLooper.this.notifyRingCompletion();
                        }
                    });
                }
                notifyServiceState(this._enabled);
                TraeAudioManager.this.updateDeviceStatus();
                AudioDeviceInterface.LogTraceExit();
            }
        }

        boolean isNeedForceVolumeType() {
            if (Build.MANUFACTURER.equals(Constant.DEVICE_XIAOMI)) {
                return Build.MODEL.equals("MI 5") || Build.MODEL.equals("MI 5s") || Build.MODEL.equals("MI 5s Plus");
            }
            return false;
        }

        void stopService() {
            StringBuilder sb = new StringBuilder(" _enabled:");
            sb.append(this._enabled ? "Y" : ErrorCode.ERROR_TYPE_N);
            sb.append(" activeMode:");
            sb.append(TraeAudioManager.this._activeMode);
            AudioDeviceInterface.LogTraceEntry(sb.toString());
            if (this._enabled) {
                if (TraeAudioManager.this._activeMode == 1) {
                    interruptVoicecallPostprocess();
                } else if (TraeAudioManager.this._activeMode == 2) {
                    interruptRing();
                }
                if (TraeAudioManager.this._switchThread != null) {
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "_switchThread:" + TraeAudioManager.this._switchThread.getDeviceName());
                    }
                    TraeAudioManager.this._switchThread.quit();
                    TraeAudioManager.this._switchThread = null;
                }
                if (this._ringPlayer != null) {
                    this._ringPlayer.stopRing();
                }
                this._ringPlayer = null;
                this._enabled = false;
                notifyServiceState(this._enabled);
                if (TraeAudioManager.this._am != null && TraeAudioManager.this._context != null) {
                    try {
                        TraeAudioManager.this.InternalSetMode(0);
                        if (isNeedForceVolumeType()) {
                            QLog.w("TRAE", 2, "NeedForceVolumeType: AudioManager.STREAM_MUSIC");
                            TraeAudioManager.forceVolumeControlStream(TraeAudioManager.this._am, 3);
                        }
                    } catch (Exception e) {
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "set mode failed." + e.getMessage());
                        }
                    }
                }
                _post_stopService();
                AudioDeviceInterface.LogTraceExit();
            }
        }

        int notifyServiceState(boolean z) {
            if (TraeAudioManager.this._context == null) {
                return -1;
            }
            Intent intent = new Intent();
            intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
            intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_SERVICE_STATE);
            intent.putExtra(TraeAudioManager.NOTIFY_SERVICE_STATE_DATE, z);
            if (TraeAudioManager.this._context != null) {
                b.a(TraeAudioManager.this._context, intent);
                return 0;
            }
            return 0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioDeviceInterface.LogTraceEntry("");
            Looper.prepare();
            this.mMsgHandler = new Handler() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.TraeAudioManagerLooper.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    HashMap hashMap;
                    try {
                        hashMap = (HashMap) message.obj;
                    } catch (Exception unused) {
                        hashMap = null;
                    }
                    if (QLog.isColorLevel()) {
                        StringBuilder sb = new StringBuilder("TraeAudioManagerLooper msg:");
                        sb.append(message.what);
                        sb.append(" _enabled:");
                        sb.append(TraeAudioManagerLooper.this._enabled ? "Y" : ErrorCode.ERROR_TYPE_N);
                        QLog.w("TRAE", 2, sb.toString());
                    }
                    if (message.what == 32772) {
                        TraeAudioManagerLooper.this.startService(hashMap);
                    } else if (!TraeAudioManagerLooper.this._enabled) {
                        if (QLog.isColorLevel()) {
                            QLog.w("TRAE", 2, "******* disabled ,skip msg******");
                        }
                        TraeAudioManager.this.sendResBroadcast(new Intent(), hashMap, 1);
                    } else {
                        switch (message.what) {
                            case TraeAudioManagerLooper.MESSAGE_DISABLE /* 32773 */:
                                TraeAudioManagerLooper.this.stopService();
                                return;
                            case TraeAudioManagerLooper.MESSAGE_GETDEVICELIST /* 32774 */:
                                TraeAudioManagerLooper.this.InternalSessionGetDeviceList(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_CONNECTDEVICE /* 32775 */:
                                TraeAudioManager.this.InternalSessionConnectDevice(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_EARACTION /* 32776 */:
                                TraeAudioManager.this.InternalSessionEarAction(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_ISDEVICECHANGABLED /* 32777 */:
                                TraeAudioManager.this.InternalSessionIsDeviceChangabled(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_GETCONNECTEDDEVICE /* 32778 */:
                                TraeAudioManager.this.InternalSessionGetConnectedDevice(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_GETCONNECTINGDEVICE /* 32779 */:
                                TraeAudioManager.this.InternalSessionGetConnectingDevice(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_VOICECALLPREPROCESS /* 32780 */:
                                TraeAudioManagerLooper.this.InternalVoicecallPreprocess(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_VOICECALLPOSTPROCESS /* 32781 */:
                                TraeAudioManagerLooper.this.InternalVoicecallPostprocess(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_STARTRING /* 32782 */:
                                TraeAudioManagerLooper.this.InternalStartRing(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_STOPRING /* 32783 */:
                                TraeAudioManagerLooper.this.InternalStopRing(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_GETSTREAMTYPE /* 32784 */:
                                TraeAudioManagerLooper.this.InternalGetStreamType(hashMap);
                                return;
                            case TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_UPDATE /* 32785 */:
                            case TraeAudioManagerLooper.MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE /* 32789 */:
                                String availabledHighestPriorityDevice = TraeAudioManager.this._deviceConfigManager.getAvailabledHighestPriorityDevice();
                                String connectedDevice = TraeAudioManager.this._deviceConfigManager.getConnectedDevice();
                                if (QLog.isColorLevel()) {
                                    QLog.w("TRAE", 2, "MESSAGE_AUTO_DEVICELIST_UPDATE  connectedDev:" + connectedDevice + " highestDev" + availabledHighestPriorityDevice);
                                }
                                if (TraeAudioManager.IsUpdateSceneFlag) {
                                    if (TraeAudioManager.IsMusicScene && !TraeAudioManager.this.IsBluetoothA2dpExisted) {
                                        TraeAudioManager.this.InternalConnectDevice(TraeAudioManager.this._deviceConfigManager.getAvailabledHighestPriorityDevice(TraeAudioManager.DEVICE_BLUETOOTHHEADSET), null, true);
                                        return;
                                    } else {
                                        TraeAudioManager.this.InternalConnectDevice(availabledHighestPriorityDevice, null, true);
                                        return;
                                    }
                                } else if (!availabledHighestPriorityDevice.equals(connectedDevice)) {
                                    TraeAudioManager.this.InternalConnectDevice(availabledHighestPriorityDevice, null, false);
                                    return;
                                } else {
                                    TraeAudioManager.this.InternalNotifyDeviceListUpdate();
                                    return;
                                }
                            case TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE /* 32786 */:
                                String str = (String) hashMap.get(TraeAudioManager.PARAM_DEVICE);
                                if (TraeAudioManager.this.InternalConnectDevice(str, null, false) != 0) {
                                    if (QLog.isColorLevel()) {
                                        QLog.w("TRAE", 2, " plugin dev:" + str + " sessionConnectedDev:" + TraeAudioManager.this.sessionConnectedDev + " connected fail,auto switch!");
                                    }
                                    TraeAudioManager.this.InternalConnectDevice(TraeAudioManager.this._deviceConfigManager.getAvailabledHighestPriorityDevice(), null, false);
                                    return;
                                }
                                return;
                            case TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE /* 32787 */:
                                if (TraeAudioManager.this.InternalConnectDevice(TraeAudioManager.this.sessionConnectedDev, null, false) != 0) {
                                    String str2 = (String) hashMap.get(TraeAudioManager.PARAM_DEVICE);
                                    if (QLog.isColorLevel()) {
                                        QLog.w("TRAE", 2, " plugout dev:" + str2 + " sessionConnectedDev:" + TraeAudioManager.this.sessionConnectedDev + " connected fail,auto switch!");
                                    }
                                    TraeAudioManager.this.InternalConnectDevice(TraeAudioManager.this._deviceConfigManager.getAvailabledHighestPriorityDevice(), null, false);
                                    return;
                                }
                                return;
                            case TraeAudioManagerLooper.MESSAGE_VOICECALL_AUIDOPARAM_CHANGED /* 32788 */:
                                Integer num = (Integer) hashMap.get(TraeAudioManager.PARAM_STREAMTYPE);
                                if (num == null) {
                                    if (QLog.isColorLevel()) {
                                        QLog.e("TRAE", 2, " MESSAGE_VOICECALL_AUIDOPARAM_CHANGED params.get(PARAM_STREAMTYPE)==null!!");
                                        return;
                                    }
                                    return;
                                }
                                TraeAudioManager.this._streamType = num.intValue();
                                TraeAudioManagerLooper.this.InternalNotifyStreamTypeUpdate(num.intValue());
                                return;
                            case TraeAudioManagerLooper.MESSAGE_REQUEST_RELEASE_AUDIO_FOCUS /* 32790 */:
                                TraeAudioManagerLooper.this.abandonAudioFocus();
                                return;
                            case TraeAudioManagerLooper.MESSAGE_RECOVER_AUDIO_FOCUS /* 32791 */:
                                return;
                            default:
                                return;
                        }
                    }
                }
            };
            _init();
            synchronized (this._started) {
                this._started[0] = true;
                this._started.notifyAll();
            }
            Looper.loop();
            _uninit();
            synchronized (this._started) {
                this._started[0] = false;
                this._started.notifyAll();
            }
            AudioDeviceInterface.LogTraceExit();
        }

        void _init() {
            AudioDeviceInterface.LogTraceEntry("");
            try {
                TraeAudioManager.this._audioSessionHost = new TraeAudioSessionHost();
                TraeAudioManager.this._deviceConfigManager = new DeviceConfigManager();
                TraeAudioManager._gHostProcessId = Process.myPid();
                TraeAudioManager.this._am = (AudioManager) TraeAudioManager.this._context.getSystemService("audio");
                TraeAudioManager.this._bluetoothCheck = TraeAudioManager.this.CreateBluetoothCheck(TraeAudioManager.this._context, TraeAudioManager.this._deviceConfigManager);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
                TraeAudioManager.this._bluetoothCheck.addAction(intentFilter);
                intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
                TraeAudioManager.this._context.registerReceiver(this._parent, intentFilter);
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "======7");
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }

        void _prev_startService() {
            try {
                TraeAudioManager.this._am = (AudioManager) TraeAudioManager.this._context.getSystemService("audio");
                if (TraeAudioManager.this._bluetoothCheck == null) {
                    TraeAudioManager.this._bluetoothCheck = TraeAudioManager.this.CreateBluetoothCheck(TraeAudioManager.this._context, TraeAudioManager.this._deviceConfigManager);
                }
                TraeAudioManager.this._context.unregisterReceiver(this._parent);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
                TraeAudioManager.this._bluetoothCheck.addAction(intentFilter);
                intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
                TraeAudioManager.this._context.registerReceiver(this._parent, intentFilter);
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "======7");
                }
            }
        }

        void _post_stopService() {
            try {
                if (TraeAudioManager.this._bluetoothCheck != null) {
                    TraeAudioManager.this._bluetoothCheck.release();
                }
                TraeAudioManager.this._bluetoothCheck = null;
                if (TraeAudioManager.this._context != null) {
                    TraeAudioManager.this._context.unregisterReceiver(this._parent);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
                    TraeAudioManager.this._context.registerReceiver(this._parent, intentFilter);
                }
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "stop service failed." + e.getMessage());
                }
            }
        }

        void _uninit() {
            AudioDeviceInterface.LogTraceEntry("");
            try {
                stopService();
                if (TraeAudioManager.this._bluetoothCheck != null) {
                    TraeAudioManager.this._bluetoothCheck.release();
                }
                TraeAudioManager.this._bluetoothCheck = null;
                if (TraeAudioManager.this._context != null) {
                    TraeAudioManager.this._context.unregisterReceiver(this._parent);
                    TraeAudioManager.this._context = null;
                }
                if (TraeAudioManager.this._deviceConfigManager != null) {
                    TraeAudioManager.this._deviceConfigManager.clearConfig();
                }
                TraeAudioManager.this._deviceConfigManager = null;
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "uninit failed." + e.getMessage());
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }

        int InternalSessionGetDeviceList(HashMap<String, Object> hashMap) {
            Intent intent = new Intent();
            HashMap<String, Object> snapParams = TraeAudioManager.this._deviceConfigManager.getSnapParams();
            intent.putExtra(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST, (String[]) ((ArrayList) snapParams.get(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST)).toArray(new String[0]));
            intent.putExtra(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE, (String) snapParams.get(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE));
            intent.putExtra(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE, (String) snapParams.get(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE));
            intent.putExtra(TraeAudioManager.EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME, TraeAudioManager.this._deviceConfigManager.getBluetoothName());
            TraeAudioManager.this.sendResBroadcast(intent, hashMap, 0);
            return 0;
        }

        int InternalVoicecallPreprocess(HashMap<String, Object> hashMap) {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode);
            if (hashMap == null) {
                return -1;
            }
            if (TraeAudioManager.this._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " InternalVoicecallPreprocess am==null!!");
                }
                return -1;
            } else if (TraeAudioManager.this._activeMode == 1) {
                TraeAudioManager.this.sendResBroadcast(new Intent(), hashMap, 2);
                return -1;
            } else {
                this._voiceCallSessionID = ((Long) hashMap.get(TraeAudioManager.PARAM_SESSIONID)).longValue();
                this._voiceCallOperation = (String) hashMap.get(TraeAudioManager.PARAM_OPERATION);
                TraeAudioManager.this._activeMode = 1;
                TraeAudioManager.this._prevMode = TraeAudioManager.this._am.getMode();
                Integer.valueOf(-1);
                Integer.valueOf(0);
                Integer num = (Integer) hashMap.get(TraeAudioManager.PARAM_MODEPOLICY);
                if (num == null) {
                    if (QLog.isColorLevel()) {
                        QLog.e("TRAE", 2, " params.get(PARAM_MODEPOLICY)==null!!");
                    }
                    TraeAudioManager.this._modePolicy = -1;
                } else {
                    TraeAudioManager.this._modePolicy = num.intValue();
                }
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "  _modePolicy:" + TraeAudioManager.this._modePolicy);
                }
                Integer num2 = (Integer) hashMap.get(TraeAudioManager.PARAM_STREAMTYPE);
                if (num2 == null) {
                    if (QLog.isColorLevel()) {
                        QLog.e("TRAE", 2, " params.get(PARAM_STREAMTYPE)==null!!");
                    }
                    TraeAudioManager.this._streamType = 0;
                } else {
                    TraeAudioManager.this._streamType = num2.intValue();
                }
                if (TraeAudioManager.isCloseSystemAPM(TraeAudioManager.this._modePolicy) && TraeAudioManager.this._activeMode != 2 && TraeAudioManager.this._deviceConfigManager != null) {
                    if (TraeAudioManager.this._deviceConfigManager.getConnectedDevice().equals(TraeAudioManager.DEVICE_SPEAKERPHONE)) {
                        TraeAudioManager.this.InternalSetMode(0);
                    } else {
                        TraeAudioManager.this.InternalSetMode(3);
                    }
                } else {
                    TraeAudioManager.this.InternalSetMode(TraeAudioManager.getCallAudioMode(TraeAudioManager.this._modePolicy));
                }
                TraeAudioManager.this.sendResBroadcast(new Intent(), hashMap, 0);
                AudioDeviceInterface.LogTraceExit();
                return 0;
            }
        }

        int InternalVoicecallPostprocess(HashMap<String, Object> hashMap) {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode);
            if (TraeAudioManager.this._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " InternalVoicecallPostprocess am==null!!");
                }
                return -1;
            } else if (TraeAudioManager.this._activeMode != 1) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " not ACTIVE_VOICECALL!!");
                }
                TraeAudioManager.this.sendResBroadcast(new Intent(), hashMap, 3);
                return -1;
            } else {
                TraeAudioManager.this._activeMode = 0;
                abandonAudioFocus();
                AudioDeviceInterface.LogTraceExit();
                return 0;
            }
        }

        int interruptVoicecallPostprocess() {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode);
            if (TraeAudioManager.this._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " am==null!!");
                }
                return -1;
            } else if (TraeAudioManager.this._activeMode != 1) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " not ACTIVE_RING!!");
                }
                return -1;
            } else {
                TraeAudioManager.this._activeMode = 0;
                if (TraeAudioManager.this._prevMode != -1) {
                    TraeAudioManager.this.InternalSetMode(TraeAudioManager.this._prevMode);
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(TraeAudioManager.PARAM_SESSIONID, Long.valueOf(this._voiceCallSessionID));
                hashMap.put(TraeAudioManager.PARAM_OPERATION, this._voiceCallOperation);
                TraeAudioManager.this.sendResBroadcast(new Intent(), hashMap, 6);
                AudioDeviceInterface.LogTraceExit();
                return 0;
            }
        }

        int InternalStartRing(HashMap<String, Object> hashMap) {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode);
            if (TraeAudioManager.this._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " InternalStartRing am==null!!");
                }
                return -1;
            }
            if (TraeAudioManager.this._activeMode == 2) {
                interruptRing();
            }
            try {
                this._ringSessionID = ((Long) hashMap.get(TraeAudioManager.PARAM_SESSIONID)).longValue();
                this._ringOperation = (String) hashMap.get(TraeAudioManager.PARAM_OPERATION);
                this._ringUserdata = (String) hashMap.get(TraeAudioManager.PARAM_RING_USERDATA_STRING);
                int intValue = ((Integer) hashMap.get(TraeAudioManager.PARAM_RING_DATASOURCE)).intValue();
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "  dataSource:" + intValue);
                }
                int intValue2 = ((Integer) hashMap.get(TraeAudioManager.PARAM_RING_RSID)).intValue();
                Uri uri = (Uri) hashMap.get(TraeAudioManager.PARAM_RING_URI);
                String str = (String) hashMap.get(TraeAudioManager.PARAM_RING_FILEPATH);
                boolean booleanValue = ((Boolean) hashMap.get(TraeAudioManager.PARAM_RING_LOOP)).booleanValue();
                int intValue3 = ((Integer) hashMap.get(TraeAudioManager.PARAM_RING_LOOPCOUNT)).intValue();
                boolean booleanValue2 = ((Boolean) hashMap.get(TraeAudioManager.PARAM_RING_MODE)).booleanValue();
                if (TraeAudioManager.this._activeMode != 1) {
                    TraeAudioManager.this._activeMode = 2;
                }
                Intent intent = new Intent();
                intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, this._ringUserdata);
                TraeAudioManager.this.sendResBroadcast(intent, hashMap, 0);
                this._preRingMode = TraeAudioManager.this._am.getMode();
                this._ringPlayer.playRing(intValue, intValue2, uri, str, booleanValue, intValue3, booleanValue2, TraeAudioManager.this._activeMode == 1, TraeAudioManager.this._streamType);
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, " _ringUserdata:" + this._ringUserdata + " DurationMS:" + this._ringPlayer.getDuration());
                }
                InternalNotifyStreamTypeUpdate(this._ringPlayer.getStreamType());
                AudioDeviceInterface.LogTraceExit();
                return 0;
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " startRing err params");
                }
                return -1;
            }
        }

        int InternalStopRing(HashMap<String, Object> hashMap) {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode + " _preRingMode:" + this._preRingMode);
            if (TraeAudioManager.this._am == null || this._ringPlayer == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " InternalStopRing am==null!!");
                    return -1;
                }
                return -1;
            }
            this._ringPlayer.stopRing();
            if (!this._ringPlayer.hasCall() && TraeAudioManager.this._activeMode == 2) {
                abandonAudioFocus();
                TraeAudioManager.this._activeMode = 0;
            }
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, this._ringUserdata);
            TraeAudioManager.this.sendResBroadcast(intent, hashMap, 0);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }

        int InternalGetStreamType(HashMap<String, Object> hashMap) {
            int i;
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode + " _preRingMode:" + this._preRingMode);
            if (TraeAudioManager.this._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " InternalStopRing am==null!!");
                    return -1;
                }
                return -1;
            }
            if (TraeAudioManager.this._activeMode == 2) {
                i = this._ringPlayer.getStreamType();
            } else {
                i = TraeAudioManager.this._streamType;
            }
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.EXTRA_DATA_STREAMTYPE, i);
            TraeAudioManager.this.sendResBroadcast(intent, hashMap, 0);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }

        int InternalNotifyStreamTypeUpdate(final int i) {
            if (TraeAudioManager.this._context == null) {
                return -1;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.TraeAudioManagerLooper.3
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent();
                    intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
                    intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_STREAMTYPE_UPDATE);
                    intent.putExtra(TraeAudioManager.EXTRA_DATA_STREAMTYPE, i);
                    if (TraeAudioManager.this._context != null) {
                        b.a(TraeAudioManager.this._context, intent);
                    }
                }
            });
            return 0;
        }

        int interruptRing() {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode + " _preRingMode:" + this._preRingMode);
            if (TraeAudioManager.this._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " interruptRing am==null!!");
                }
                return -1;
            } else if (TraeAudioManager.this._activeMode != 2) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " not ACTIVE_RING!!");
                }
                return -1;
            } else {
                this._ringPlayer.stopRing();
                abandonAudioFocus();
                TraeAudioManager.this._activeMode = 0;
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(TraeAudioManager.PARAM_SESSIONID, Long.valueOf(this._ringSessionID));
                hashMap.put(TraeAudioManager.PARAM_OPERATION, this._ringOperation);
                Intent intent = new Intent();
                intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, this._ringUserdata);
                TraeAudioManager.this.sendResBroadcast(intent, hashMap, 4);
                AudioDeviceInterface.LogTraceExit();
                return 0;
            }
        }

        void notifyRingCompletion() {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(TraeAudioManager.PARAM_SESSIONID, Long.valueOf(this._ringSessionID));
            hashMap.put(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_RING_COMPLETION);
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, this._ringUserdata);
            TraeAudioManager.this.sendResBroadcast(intent, hashMap, 0);
        }
    }

    public static int SetSpeakerForTest(Context context, boolean z) {
        int i;
        _glock.lock();
        if (_ginstance != null) {
            i = _ginstance.InternalSetSpeaker(context, z);
        } else {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "TraeAudioManager|static SetSpeakerForTest|null == _ginstance");
            }
            i = -1;
        }
        _glock.unlock();
        return i;
    }

    int InternalSetSpeaker(Context context, boolean z) {
        if (context == null) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "Could not InternalSetSpeaker - no context");
            }
            return -1;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "Could not InternalSetSpeaker - no audio manager");
            }
            return -1;
        }
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("InternalSetSpeaker entry:speaker:");
            sb.append(audioManager.isSpeakerphoneOn() ? "Y" : ErrorCode.ERROR_TYPE_N);
            sb.append("-->:");
            sb.append(z ? "Y" : ErrorCode.ERROR_TYPE_N);
            QLog.w("TRAE", 2, sb.toString());
        }
        if (isCloseSystemAPM(this._modePolicy) && this._activeMode != 2) {
            return InternalSetSpeakerSpe(audioManager, z);
        }
        if (audioManager.isSpeakerphoneOn() != z) {
            audioManager.setSpeakerphoneOn(z);
        }
        int i = audioManager.isSpeakerphoneOn() == z ? 0 : -1;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InternalSetSpeaker exit:" + z + " res:" + i + " mode:" + audioManager.getMode());
        }
        return i;
    }

    int InternalSetSpeakerSpe(AudioManager audioManager, boolean z) {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InternalSetSpeakerSpe fac:" + Build.MANUFACTURER + " model:" + Build.MODEL + " st:" + this._streamType + " media_force_use:" + getForceUse(1));
        }
        if (z) {
            InternalSetMode(0);
            audioManager.setSpeakerphoneOn(true);
            setForceUse(1, 1);
        } else {
            InternalSetMode(3);
            audioManager.setSpeakerphoneOn(false);
            setForceUse(1, 0);
        }
        int i = audioManager.isSpeakerphoneOn() != z ? -1 : 0;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InternalSetSpeakerSpe exit:" + z + " res:" + i + " mode:" + audioManager.getMode());
        }
        return i;
    }

    void InternalSetMode(int i) {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "SetMode entry:" + i);
        }
        if (this._am == null) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "setMode:" + i + " fail am=null");
                return;
            }
            return;
        }
        this._am.setMode(i);
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("setMode:");
            sb.append(i);
            sb.append(this._am.getMode() != i ? "fail" : "success");
            QLog.w("TRAE", 2, sb.toString());
        }
    }

    public static int registerAudioSession(TraeAudioSession traeAudioSession, boolean z, long j, Context context) {
        int i;
        _glock.lock();
        if (_ginstance != null) {
            if (z) {
                _ginstance._audioSessionHost.add(traeAudioSession, j, context);
            } else {
                _ginstance._audioSessionHost.remove(j);
            }
            i = 0;
        } else {
            i = -1;
        }
        _glock.unlock();
        return i;
    }

    public static int sendMessage(int i, HashMap<String, Object> hashMap) {
        _glock.lock();
        int internalSendMessage = _ginstance != null ? _ginstance.internalSendMessage(i, hashMap) : -1;
        _glock.unlock();
        return internalSendMessage;
    }

    public static int init(Context context) {
        new StringBuilder("TraeAudioManager init _ginstance:").append(_ginstance);
        AudioDeviceInterface.LogTraceEntry(" _ginstance:" + _ginstance);
        _glock.lock();
        if (_ginstance == null) {
            _ginstance = new TraeAudioManager(context);
        }
        _glock.unlock();
        AudioDeviceInterface.LogTraceExit();
        return 0;
    }

    public static void uninit() {
        new StringBuilder("TraeAudioManager uninit _ginstance:").append(_ginstance);
        AudioDeviceInterface.LogTraceEntry(" _ginstance:" + _ginstance);
        _glock.lock();
        if (_ginstance != null) {
            _ginstance.release();
            _ginstance = null;
        }
        _glock.unlock();
        AudioDeviceInterface.LogTraceExit();
    }

    TraeAudioManager(Context context) {
        this._context = null;
        this.mTraeAudioManagerLooper = null;
        AudioDeviceInterface.LogTraceEntry(" context:" + context);
        if (context == null) {
            return;
        }
        this._context = context;
        this.mTraeAudioManagerLooper = new TraeAudioManagerLooper(this);
        AudioDeviceInterface.LogTraceExit();
    }

    public void release() {
        AudioDeviceInterface.LogTraceEntry("");
        if (this.mTraeAudioManagerLooper != null) {
            this.mTraeAudioManagerLooper.quit();
            this.mTraeAudioManagerLooper = null;
        }
        AudioDeviceInterface.LogTraceExit();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            if (QLog.isColorLevel()) {
                QLog.d("TRAE", 2, "onReceive intent or context is null!");
                return;
            }
            return;
        }
        try {
            String action = intent.getAction();
            String a = f.a(intent, PARAM_OPERATION);
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "TraeAudioManager|onReceive::Action:" + intent.getAction());
            }
            if (this._deviceConfigManager == null) {
                if (QLog.isColorLevel()) {
                    QLog.d("TRAE", 2, "_deviceConfigManager null!");
                    return;
                }
                return;
            }
            boolean visible = this._deviceConfigManager.getVisible(DEVICE_WIREDHEADSET);
            boolean visible2 = this._deviceConfigManager.getVisible(DEVICE_BLUETOOTHHEADSET);
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                onHeadsetPlug(context, intent);
                if (!visible && this._deviceConfigManager.getVisible(DEVICE_WIREDHEADSET)) {
                    checkDevicePlug(DEVICE_WIREDHEADSET, true);
                }
                if (!visible || this._deviceConfigManager.getVisible(DEVICE_WIREDHEADSET)) {
                    return;
                }
                checkDevicePlug(DEVICE_WIREDHEADSET, false);
            } else if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            } else {
                if (ACTION_TRAEAUDIOMANAGER_REQUEST.equals(action)) {
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "   OPERATION:" + a);
                    }
                    if (OPERATION_STARTSERVICE.equals(a)) {
                        startService(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false, f.a(intent, EXTRA_DATA_DEVICECONFIG));
                    } else if (OPERATION_STOPSERVICE.equals(a)) {
                        stopService(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    } else if (OPERATION_GETDEVICELIST.equals(a)) {
                        getDeviceList(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    } else if (OPERATION_GETSTREAMTYPE.equals(a)) {
                        getStreamType(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    } else if (OPERATION_CONNECTDEVICE.equals(a)) {
                        connectDevice(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false, f.a(intent, CONNECTDEVICE_DEVICENAME));
                    } else if (OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE.equals(a)) {
                        connectHighestPriorityDevice(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    } else if (OPERATION_EARACTION.equals(a)) {
                        earAction(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false, f.a(intent, EXTRA_EARACTION, -1));
                    } else if (OPERATION_ISDEVICECHANGABLED.equals(a)) {
                        isDeviceChangabled(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    } else if (OPERATION_GETCONNECTEDDEVICE.equals(a)) {
                        getConnectedDevice(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    } else if (OPERATION_GETCONNECTINGDEVICE.equals(a)) {
                        getConnectingDevice(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    } else if (OPERATION_VOICECALL_PREPROCESS.equals(a)) {
                        voicecallPreprocess(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false, f.a(intent, PARAM_MODEPOLICY, -1), f.a(intent, PARAM_STREAMTYPE, -1));
                    } else if (OPERATION_VOICECALL_POSTPROCESS.equals(a)) {
                        voicecallPostprocess(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    } else if (OPERATION_VOICECALL_AUDIOPARAM_CHANGED.equals(a)) {
                        voiceCallAudioParamChanged(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false, f.a(intent, PARAM_MODEPOLICY, -1), f.a(intent, PARAM_STREAMTYPE, -1));
                    } else if (OPERATION_STARTRING.equals(a)) {
                        int a2 = f.a(intent, PARAM_RING_DATASOURCE, -1);
                        int a3 = f.a(intent, PARAM_RING_RSID, -1);
                        Uri uri = (Uri) intent.getParcelableExtra(PARAM_RING_URI);
                        String a4 = f.a(intent, PARAM_RING_FILEPATH);
                        boolean a5 = f.a(intent, PARAM_RING_LOOP, false);
                        String a6 = f.a(intent, PARAM_RING_USERDATA_STRING);
                        startRing(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false, a2, a3, uri, a4, a5, f.a(intent, PARAM_RING_LOOPCOUNT, 1), a6, f.a(intent, PARAM_RING_MODE, false));
                    } else if (OPERATION_STOPRING.equals(a)) {
                        stopRing(a, f.a(intent, PARAM_SESSIONID, Long.MIN_VALUE), false);
                    }
                } else if (this._deviceConfigManager != null) {
                    if (this._bluetoothCheck != null) {
                        this._bluetoothCheck.onReceive(context, intent, this._deviceConfigManager);
                    }
                    if (!visible2 && this._deviceConfigManager.getVisible(DEVICE_BLUETOOTHHEADSET)) {
                        checkDevicePlug(DEVICE_BLUETOOTHHEADSET, true);
                    }
                    if (!visible2 || this._deviceConfigManager.getVisible(DEVICE_BLUETOOTHHEADSET)) {
                        return;
                    }
                    checkDevicePlug(DEVICE_BLUETOOTHHEADSET, false);
                }
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "deal with receiver failed." + e.getMessage());
            }
        }
    }

    void onHeadsetPlug(Context context, Intent intent) {
        String a = f.a(intent, "name");
        if (a == null) {
            a = "unkonw";
        }
        String str = " [" + a + "] ";
        int a2 = f.a(intent, "state", -1);
        if (a2 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(a2 == 0 ? "unplugged" : "plugged");
            str = sb.toString();
        }
        String str2 = str + " mic:";
        int a3 = f.a(intent, "microphone", -1);
        if (a3 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(a3 == 1 ? "Y" : "unkown");
            str2 = sb2.toString();
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "onHeadsetPlug:: " + str2);
        }
        this._deviceConfigManager.setVisible(DEVICE_WIREDHEADSET, 1 == a2);
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "onHeadsetPlug exit");
        }
    }

    int internalSendMessage(int i, HashMap<String, Object> hashMap) {
        if (this.mTraeAudioManagerLooper != null) {
            return this.mTraeAudioManagerLooper.sendMessage(i, hashMap);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getDeviceList(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_GETDEVICELIST, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getStreamType(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_GETSTREAMTYPE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int startService(String str, long j, boolean z, String str2) {
        if (str2.length() <= 0) {
            return -1;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        hashMap.put(EXTRA_DATA_DEVICECONFIG, str2);
        return sendMessage(TraeAudioManagerLooper.MESSAGE_ENABLE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int stopService(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_DISABLE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int disableDeviceSwitch() {
        enableDeviceSwitchFlag = false;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int connectDevice(String str, long j, boolean z, String str2) {
        if (str2 == null) {
            return -1;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        hashMap.put(CONNECTDEVICE_DEVICENAME, str2);
        hashMap.put(PARAM_DEVICE, str2);
        return sendMessage(TraeAudioManagerLooper.MESSAGE_CONNECTDEVICE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int connectHighestPriorityDevice(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int earAction(String str, long j, boolean z, int i) {
        if (i == 0 || i == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
            hashMap.put(PARAM_OPERATION, str);
            hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
            hashMap.put(EXTRA_EARACTION, Integer.valueOf(i));
            return sendMessage(TraeAudioManagerLooper.MESSAGE_EARACTION, hashMap);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int isDeviceChangabled(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_ISDEVICECHANGABLED, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getConnectedDevice(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_GETCONNECTEDDEVICE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getConnectingDevice(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_GETCONNECTINGDEVICE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int voicecallPreprocess(String str, long j, boolean z, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        hashMap.put(PARAM_MODEPOLICY, Integer.valueOf(i));
        hashMap.put(PARAM_STREAMTYPE, Integer.valueOf(i2));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_VOICECALLPREPROCESS, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int voicecallPostprocess(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_VOICECALLPOSTPROCESS, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int voiceCallAudioParamChanged(String str, long j, boolean z, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        hashMap.put(PARAM_MODEPOLICY, Integer.valueOf(i));
        hashMap.put(PARAM_STREAMTYPE, Integer.valueOf(i2));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_VOICECALL_AUIDOPARAM_CHANGED, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int startRing(String str, long j, boolean z, int i, int i2, Uri uri, String str2, boolean z2, int i3, String str3, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        hashMap.put(PARAM_RING_DATASOURCE, Integer.valueOf(i));
        hashMap.put(PARAM_RING_RSID, Integer.valueOf(i2));
        hashMap.put(PARAM_RING_URI, uri);
        hashMap.put(PARAM_RING_FILEPATH, str2);
        hashMap.put(PARAM_RING_LOOP, Boolean.valueOf(z2));
        hashMap.put(PARAM_RING_LOOPCOUNT, Integer.valueOf(i3));
        hashMap.put(PARAM_RING_MODE, Boolean.valueOf(z3));
        hashMap.put(PARAM_RING_USERDATA_STRING, str3);
        return sendMessage(TraeAudioManagerLooper.MESSAGE_STARTRING, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int stopRing(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_STOPRING, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int requestReleaseAudioFocus(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_REQUEST_RELEASE_AUDIO_FOCUS, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int recoverAudioFocus(String str, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(PARAM_SESSIONID, Long.valueOf(j));
        hashMap.put(PARAM_OPERATION, str);
        hashMap.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_RECOVER_AUDIO_FOCUS, hashMap);
    }

    int InternalSessionConnectDevice(HashMap<String, Object> hashMap) {
        int i;
        AudioDeviceInterface.LogTraceEntry("");
        if (hashMap == null || this._context == null) {
            return -1;
        }
        if (IsMusicScene) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "MusicScene: InternalSessionConnectDevice failed");
            }
            return -1;
        }
        String str = (String) hashMap.get(PARAM_DEVICE);
        new StringBuilder("ConnectDevice: ").append(str);
        if (!IsEarPhoneSupported && str.equals(DEVICE_EARPHONE)) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "InternalSessionConnectDevice IsEarPhoneSupported = false, Connect device:" + str + " failed");
            }
            return -1;
        }
        boolean InternalIsDeviceChangeable = InternalIsDeviceChangeable();
        if (!checkDevName(str)) {
            i = 7;
        } else {
            i = !this._deviceConfigManager.getVisible(str) ? 8 : !InternalIsDeviceChangeable ? 9 : 0;
        }
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("sessonID:");
            sb.append((Long) hashMap.get(PARAM_SESSIONID));
            sb.append(" devName:");
            sb.append(str);
            sb.append(" bChangabled:");
            sb.append(InternalIsDeviceChangeable ? "Y" : ErrorCode.ERROR_TYPE_N);
            sb.append(" err:");
            sb.append(i);
            QLog.w("TRAE", 2, sb.toString());
        }
        if (i != 0) {
            Intent intent = new Intent();
            intent.putExtra(CONNECTDEVICE_RESULT_DEVICENAME, (String) hashMap.get(PARAM_DEVICE));
            sendResBroadcast(intent, hashMap, i);
            return -1;
        } else if (str.equals(this._deviceConfigManager.getConnectedDevice())) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, " --has connected!");
            }
            Intent intent2 = new Intent();
            intent2.putExtra(CONNECTDEVICE_RESULT_DEVICENAME, (String) hashMap.get(PARAM_DEVICE));
            sendResBroadcast(intent2, hashMap, i);
            return 0;
        } else {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, " --connecting...");
            }
            InternalConnectDevice(str, hashMap, false);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }
    }

    int InternalConnectDevice(String str, HashMap<String, Object> hashMap, boolean z) {
        AudioDeviceInterface.LogTraceEntry(" devName:" + str);
        if (str == null) {
            return -1;
        }
        if (IsMusicScene && str.equals(DEVICE_EARPHONE)) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "MusicScene, Connect device:" + str + " failed");
            }
            return -1;
        } else if (!IsEarPhoneSupported && str.equals(DEVICE_EARPHONE)) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "IsEarPhoneSupported = false, Connect device:" + str + " failed");
            }
            return -1;
        } else if (z || this._deviceConfigManager.getConnectedDevice().equals(DEVICE_NONE) || !str.equals(this._deviceConfigManager.getConnectedDevice())) {
            if (!checkDevName(str) || !this._deviceConfigManager.getVisible(str)) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " checkDevName fail");
                }
                return -1;
            } else if (!InternalIsDeviceChangeable()) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " InternalIsDeviceChangeable fail");
                }
                return -1;
            } else {
                if (this._switchThread != null) {
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "_switchThread:" + this._switchThread.getDeviceName());
                    }
                    this._switchThread.quit();
                    this._switchThread = null;
                }
                if (str.equals(DEVICE_EARPHONE)) {
                    this._switchThread = new earphoneSwitchThread();
                } else if (str.equals(DEVICE_SPEAKERPHONE)) {
                    this._switchThread = new speakerSwitchThread();
                } else if (str.equals(DEVICE_WIREDHEADSET)) {
                    this._switchThread = new headsetSwitchThread();
                } else if (str.equals(DEVICE_BLUETOOTHHEADSET)) {
                    this._switchThread = new bluetoothHeadsetSwitchThread();
                }
                if (this._switchThread != null) {
                    this._switchThread.setDeviceConnectParam(hashMap);
                    this._switchThread.start();
                }
                AudioDeviceInterface.LogTraceExit();
                return 0;
            }
        } else {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public abstract class switchThread extends Thread {
        boolean _running = true;
        boolean[] _exited = {false};
        HashMap<String, Object> _params = null;
        long _usingtime = 0;

        public abstract void _quit();

        public abstract void _run();

        public abstract String getDeviceName();

        switchThread() {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, " ++switchThread:" + getDeviceName());
            }
        }

        public void setDeviceConnectParam(HashMap<String, Object> hashMap) {
            this._params = hashMap;
        }

        void updateStatus() {
            TraeAudioManager.this._deviceConfigManager.setConnected(getDeviceName());
            processDeviceConnectRes(0);
        }

        void processDeviceConnectRes(int i) {
            TraeAudioManager.this.InternalNotifyDeviceChangableUpdate();
            AudioDeviceInterface.LogTraceEntry(getDeviceName() + " err:" + i);
            if (this._params == null) {
                TraeAudioManager.this.InternalNotifyDeviceListUpdate();
                return;
            }
            TraeAudioManager.this.sessionConnectedDev = TraeAudioManager.this._deviceConfigManager.getConnectedDevice();
            Long l = (Long) this._params.get(TraeAudioManager.PARAM_SESSIONID);
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, " sessonID:" + l);
            }
            if (l == null || l.longValue() == Long.MIN_VALUE) {
                TraeAudioManager.this.InternalNotifyDeviceListUpdate();
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "processDeviceConnectRes sid null,don't send res");
                    return;
                }
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.CONNECTDEVICE_RESULT_DEVICENAME, (String) this._params.get(TraeAudioManager.PARAM_DEVICE));
            if (TraeAudioManager.this.sendResBroadcast(intent, this._params, i) == 0) {
                TraeAudioManager.this.InternalNotifyDeviceListUpdate();
            }
            AudioDeviceInterface.LogTraceExit();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioDeviceInterface.LogTraceEntry(getDeviceName());
            TraeAudioManager.this._deviceConfigManager.setConnecting(getDeviceName());
            TraeAudioManager.this.InternalNotifyDeviceChangableUpdate();
            _run();
            synchronized (this._exited) {
                this._exited[0] = true;
                this._exited.notifyAll();
            }
            AudioDeviceInterface.LogTraceExit();
        }

        public void quit() {
            AudioDeviceInterface.LogTraceEntry(getDeviceName());
            this._running = false;
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, " quit:" + getDeviceName() + " _running:" + this._running);
            }
            interrupt();
            _quit();
            synchronized (this._exited) {
                if (!this._exited[0]) {
                    try {
                        this._exited.wait(10000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class earphoneSwitchThread extends switchThread {
        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _quit() {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public String getDeviceName() {
            return TraeAudioManager.DEVICE_EARPHONE;
        }

        earphoneSwitchThread() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _run() {
            if (TraeAudioManager.IsUpdateSceneFlag && TraeAudioManager.enableDeviceSwitchFlag) {
                TraeAudioManager.this.InternalSetSpeaker(TraeAudioManager.this._context, false);
            }
            updateStatus();
            if (!TraeAudioManager.IsUpdateSceneFlag) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "connect earphone: do nothing");
                }
            } else if (!TraeAudioManager.enableDeviceSwitchFlag) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "connect earphone: disableDeviceSwitchFlag");
                }
            } else {
                int i = 0;
                while (this._running) {
                    if (TraeAudioManager.this._am.isSpeakerphoneOn()) {
                        TraeAudioManager.this.InternalSetSpeaker(TraeAudioManager.this._context, false);
                    }
                    try {
                        Thread.sleep(i < 5 ? 1000L : 4000L);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class speakerSwitchThread extends switchThread {
        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _quit() {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public String getDeviceName() {
            return TraeAudioManager.DEVICE_SPEAKERPHONE;
        }

        speakerSwitchThread() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _run() {
            if (!TraeAudioManager.IsMusicScene && TraeAudioManager.IsUpdateSceneFlag && TraeAudioManager.enableDeviceSwitchFlag) {
                TraeAudioManager.this.InternalSetSpeaker(TraeAudioManager.this._context, true);
            }
            updateStatus();
            if (TraeAudioManager.IsMusicScene || !TraeAudioManager.IsUpdateSceneFlag) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "connect speakerPhone: do nothing");
                }
            } else if (!TraeAudioManager.enableDeviceSwitchFlag) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "connect speakerPhone: disableDeviceSwitchFlag");
                }
            } else {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, " _run:" + getDeviceName() + " _running:" + this._running);
                }
                int i = 0;
                while (this._running) {
                    if (!TraeAudioManager.this._am.isSpeakerphoneOn()) {
                        TraeAudioManager.this.InternalSetSpeaker(TraeAudioManager.this._context, true);
                    }
                    try {
                        Thread.sleep(i < 5 ? 1000L : 4000L);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class headsetSwitchThread extends switchThread {
        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _quit() {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public String getDeviceName() {
            return TraeAudioManager.DEVICE_WIREDHEADSET;
        }

        headsetSwitchThread() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _run() {
            if (!TraeAudioManager.IsMusicScene && TraeAudioManager.IsUpdateSceneFlag && TraeAudioManager.enableDeviceSwitchFlag) {
                TraeAudioManager.this.InternalSetSpeaker(TraeAudioManager.this._context, false);
                TraeAudioManager.this._am.setWiredHeadsetOn(true);
            }
            updateStatus();
            if (TraeAudioManager.IsMusicScene || !TraeAudioManager.IsUpdateSceneFlag) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "connect headset: do nothing");
                }
            } else if (!TraeAudioManager.enableDeviceSwitchFlag) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "connect headset: disableDeviceSwitchFlag");
                }
            } else {
                int i = 0;
                while (this._running) {
                    if (TraeAudioManager.this._am.isSpeakerphoneOn()) {
                        TraeAudioManager.this.InternalSetSpeaker(TraeAudioManager.this._context, false);
                    }
                    try {
                        Thread.sleep(i < 5 ? 1000L : 4000L);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class bluetoothHeadsetSwitchThread extends switchThread {
        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public String getDeviceName() {
            return TraeAudioManager.DEVICE_BLUETOOTHHEADSET;
        }

        bluetoothHeadsetSwitchThread() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _run() {
            if (TraeAudioManager.IsMusicScene || !TraeAudioManager.IsUpdateSceneFlag) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "connect bluetoothHeadset: do nothing, IsMusicScene:" + TraeAudioManager.IsMusicScene + " ,IsUpdateSceneFlag:" + TraeAudioManager.IsUpdateSceneFlag);
                }
                updateStatus();
            } else if (!TraeAudioManager.enableDeviceSwitchFlag) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "connect bluetoothHeadset: disableDeviceSwitchFlag");
                }
            } else {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
                _startBluetoothSco();
                int i = 0;
                while (true) {
                    if (!this._running) {
                        break;
                    }
                    int i2 = i + 1;
                    if (i >= 10) {
                        break;
                    }
                    if (QLog.isColorLevel()) {
                        StringBuilder sb = new StringBuilder("bluetoothHeadsetSwitchThread i:");
                        sb.append(i2);
                        sb.append(" sco:");
                        sb.append(TraeAudioManager.this._am.isBluetoothScoOn() ? "Y" : ErrorCode.ERROR_TYPE_N);
                        sb.append(" :");
                        sb.append(TraeAudioManager.this._deviceConfigManager.getBluetoothName());
                        QLog.w("TRAE", 2, sb.toString());
                    }
                    if (TraeAudioManager.this._am.isBluetoothScoOn()) {
                        updateStatus();
                        break;
                    } else {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException unused2) {
                        }
                        i = i2;
                    }
                }
                if (TraeAudioManager.this._am.isBluetoothScoOn()) {
                    return;
                }
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "bluetoothHeadsetSwitchThread sco fail,remove btheadset");
                }
                TraeAudioManager.this._deviceConfigManager.setVisible(getDeviceName(), false);
                processDeviceConnectRes(10);
                TraeAudioManager.this.checkAutoDeviceListUpdate();
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        @TargetApi(8)
        public void _quit() {
            if (TraeAudioManager.this._am == null) {
                return;
            }
            _stopBluetoothSco();
        }

        @TargetApi(8)
        void _startBluetoothSco() {
            TraeAudioManager.this._am.setBluetoothScoOn(true);
            if (Build.VERSION.SDK_INT > 8) {
                TraeAudioManager.this._am.startBluetoothSco();
            }
        }

        @TargetApi(8)
        void _stopBluetoothSco() {
            if (Build.VERSION.SDK_INT > 8) {
                TraeAudioManager.this._am.stopBluetoothSco();
            }
            TraeAudioManager.this._am.setBluetoothScoOn(false);
        }
    }

    int InternalSessionIsDeviceChangabled(HashMap<String, Object> hashMap) {
        Intent intent = new Intent();
        intent.putExtra(ISDEVICECHANGABLED_RESULT_ISCHANGABLED, InternalIsDeviceChangeable());
        sendResBroadcast(intent, hashMap, 0);
        return 0;
    }

    boolean InternalIsDeviceChangeable() {
        String connectingDevice = this._deviceConfigManager.getConnectingDevice();
        return connectingDevice == null || connectingDevice.equals(DEVICE_NONE) || connectingDevice.equals("");
    }

    int InternalSessionGetConnectedDevice(HashMap<String, Object> hashMap) {
        Intent intent = new Intent();
        intent.putExtra(GETCONNECTEDDEVICE_RESULT_LIST, this._deviceConfigManager.getConnectedDevice());
        sendResBroadcast(intent, hashMap, 0);
        return 0;
    }

    int InternalSessionGetConnectingDevice(HashMap<String, Object> hashMap) {
        Intent intent = new Intent();
        intent.putExtra(GETCONNECTINGDEVICE_RESULT_LIST, this._deviceConfigManager.getConnectingDevice());
        sendResBroadcast(intent, hashMap, 0);
        return 0;
    }

    int sendResBroadcast(final Intent intent, HashMap<String, Object> hashMap, final int i) {
        if (this._context == null) {
            return -1;
        }
        Long l = (Long) hashMap.get(PARAM_SESSIONID);
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, " sessonID:" + l + StringUtil.SPACE + ((String) hashMap.get(PARAM_OPERATION)));
        }
        if (l == null || l.longValue() == Long.MIN_VALUE) {
            InternalNotifyDeviceListUpdate();
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "sendResBroadcast sid null,don't send res");
            }
            return -1;
        }
        final Long l2 = (Long) hashMap.get(PARAM_SESSIONID);
        final String str = (String) hashMap.get(PARAM_OPERATION);
        if (OPERATION_VOICECALL_PREPROCESS.equals(str)) {
            intent.setAction(ACTION_TRAEAUDIOMANAGER_RES);
            intent.putExtra(PARAM_SESSIONID, l2);
            intent.putExtra(PARAM_OPERATION, str);
            intent.putExtra(PARAM_RES_ERRCODE, i);
            if (this._audioSessionHost != null) {
                this._audioSessionHost.sendToAudioSessionMessage(intent);
                return 0;
            }
            return 0;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.1
            @Override // java.lang.Runnable
            public void run() {
                intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_RES);
                intent.putExtra(TraeAudioManager.PARAM_SESSIONID, l2);
                intent.putExtra(TraeAudioManager.PARAM_OPERATION, str);
                intent.putExtra(TraeAudioManager.PARAM_RES_ERRCODE, i);
                if (TraeAudioManager.this._context != null) {
                    b.a(TraeAudioManager.this._context, intent);
                }
            }
        });
        return 0;
    }

    int InternalNotifyDeviceListUpdate() {
        AudioDeviceInterface.LogTraceEntry("");
        if (this._context == null) {
            return -1;
        }
        HashMap<String, Object> snapParams = this._deviceConfigManager.getSnapParams();
        final ArrayList arrayList = (ArrayList) snapParams.get(EXTRA_DATA_AVAILABLEDEVICE_LIST);
        final String str = (String) snapParams.get(EXTRA_DATA_CONNECTEDDEVICE);
        final String str2 = (String) snapParams.get(EXTRA_DATA_PREV_CONNECTEDDEVICE);
        final String bluetoothName = this._deviceConfigManager.getBluetoothName();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.2
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
                intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_DEVICELIST_UPDATE);
                intent.putExtra(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST, (String[]) arrayList.toArray(new String[0]));
                intent.putExtra(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE, str);
                intent.putExtra(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE, str2);
                intent.putExtra(TraeAudioManager.EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME, bluetoothName);
                if (TraeAudioManager.this._context != null) {
                    b.a(TraeAudioManager.this._context, intent);
                }
            }
        });
        AudioDeviceInterface.LogTraceExit();
        return 0;
    }

    int InternalNotifyDeviceChangableUpdate() {
        if (this._context == null) {
            return -1;
        }
        final boolean InternalIsDeviceChangeable = InternalIsDeviceChangeable();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.3
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
                intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_DEVICECHANGABLE_UPDATE);
                intent.putExtra(TraeAudioManager.NOTIFY_DEVICECHANGABLE_UPDATE_DATE, InternalIsDeviceChangeable);
                if (TraeAudioManager.this._context != null) {
                    b.a(TraeAudioManager.this._context, intent);
                }
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public abstract class BluetoohHeadsetCheckInterface {
        abstract void _addAction(IntentFilter intentFilter);

        abstract void _onReceive(Context context, Intent intent);

        public abstract boolean init(Context context, DeviceConfigManager deviceConfigManager);

        public abstract String interfaceDesc();

        public abstract boolean isConnected();

        public abstract void release();

        BluetoohHeadsetCheckInterface() {
        }

        public void addAction(IntentFilter intentFilter) {
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            _addAction(intentFilter);
        }

        public void onReceive(Context context, Intent intent, DeviceConfigManager deviceConfigManager) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int a = f.a(intent, "android.bluetooth.adapter.extra.STATE", -1);
                int a2 = f.a(intent, "android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "BT ACTION_STATE_CHANGED|   EXTRA_STATE " + getBTActionStateChangedExtraString(a));
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "BT ACTION_STATE_CHANGED|   EXTRA_PREVIOUS_STATE " + getBTActionStateChangedExtraString(a2));
                }
                if (a == 10) {
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "    BT off");
                    }
                    deviceConfigManager.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                } else if (a == 12 && QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "BT OFF-->ON,Visiable it...");
                }
            } else if (!"android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction()) || Build.VERSION.SDK_INT >= 11) {
                if (!"android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction()) || Build.VERSION.SDK_INT >= 11) {
                    _onReceive(context, intent);
                }
            }
        }

        String getBTActionStateChangedExtraString(int i) {
            String str;
            switch (i) {
                case 10:
                    str = "STATE_OFF";
                    break;
                case 11:
                    str = "STATE_TURNING_ON";
                    break;
                case 12:
                    str = "STATE_ON";
                    break;
                case 13:
                    str = "STATE_TURNING_OFF";
                    break;
                default:
                    str = "unknow";
                    break;
            }
            return str + CommonConstant.Symbol.COLON + i;
        }

        String getSCOAudioStateExtraString(int i) {
            String str;
            switch (i) {
                case -1:
                    str = "SCO_AUDIO_STATE_ERROR";
                    break;
                case 0:
                    str = "SCO_AUDIO_STATE_DISCONNECTED";
                    break;
                case 1:
                    str = "SCO_AUDIO_STATE_CONNECTED";
                    break;
                case 2:
                    str = "SCO_AUDIO_STATE_CONNECTING";
                    break;
                default:
                    str = "unknow";
                    break;
            }
            return str + CommonConstant.Symbol.COLON + i;
        }

        String getBTAdapterConnectionState(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "STATE_DISCONNECTED";
                    break;
                case 1:
                    str = "STATE_CONNECTING";
                    break;
                case 2:
                    str = "STATE_CONNECTED";
                    break;
                case 3:
                    str = "STATE_DISCONNECTING";
                    break;
                default:
                    str = "unknow";
                    break;
            }
            return str + CommonConstant.Symbol.COLON + i;
        }

        String getBTHeadsetConnectionState(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "STATE_DISCONNECTED";
                    break;
                case 1:
                    str = "STATE_CONNECTING";
                    break;
                case 2:
                    str = "STATE_CONNECTED";
                    break;
                case 3:
                    str = "STATE_DISCONNECTING";
                    break;
                default:
                    str = "unknow";
                    break;
            }
            return str + CommonConstant.Symbol.COLON + i;
        }

        String getBTHeadsetAudioState(int i) {
            String str;
            if (i == 10) {
                str = "STATE_AUDIO_DISCONNECTED";
            } else if (i != 12) {
                str = "unknow:" + i;
            } else {
                str = "STATE_AUDIO_CONNECTED";
            }
            return str + CommonConstant.Symbol.COLON + i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class BluetoohHeadsetCheckFake extends BluetoohHeadsetCheckInterface {
        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        void _addAction(IntentFilter intentFilter) {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        void _onReceive(Context context, Intent intent) {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean init(Context context, DeviceConfigManager deviceConfigManager) {
            return true;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public String interfaceDesc() {
            return "BluetoohHeadsetCheckFake";
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean isConnected() {
            return false;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void release() {
        }

        BluetoohHeadsetCheckFake() {
            super();
        }
    }

    public BluetoohHeadsetCheckInterface CreateBluetoothCheck(Context context, DeviceConfigManager deviceConfigManager) {
        BluetoohHeadsetCheckInterface bluetoohHeadsetCheckFake;
        if (Build.VERSION.SDK_INT >= 11) {
            bluetoohHeadsetCheckFake = new BluetoohHeadsetCheck();
        } else if (Build.VERSION.SDK_INT != 18) {
            bluetoohHeadsetCheckFake = new BluetoohHeadsetCheckFor2x();
        } else {
            bluetoohHeadsetCheckFake = new BluetoohHeadsetCheckFake();
        }
        if (!bluetoohHeadsetCheckFake.init(context, deviceConfigManager)) {
            bluetoohHeadsetCheckFake = new BluetoohHeadsetCheckFake();
        }
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("CreateBluetoothCheck:");
            sb.append(bluetoohHeadsetCheckFake.interfaceDesc());
            sb.append(" skip android4.3:");
            sb.append(Build.VERSION.SDK_INT == 18 ? "Y" : ErrorCode.ERROR_TYPE_N);
            QLog.w("TRAE", 2, sb.toString());
        }
        return bluetoohHeadsetCheckFake;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @TargetApi(11)
    /* loaded from: classes6.dex */
    public class BluetoohHeadsetCheck extends BluetoohHeadsetCheckInterface implements BluetoothProfile.ServiceListener {
        BluetoothAdapter _adapter;
        Context _ctx;
        DeviceConfigManager _devCfg;
        BluetoothProfile _profile;
        private final ReentrantLock _profileLock;

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public String interfaceDesc() {
            return "BluetoohHeadsetCheck";
        }

        BluetoohHeadsetCheck() {
            super();
            this._ctx = null;
            this._devCfg = null;
            this._adapter = null;
            this._profile = null;
            this._profileLock = new ReentrantLock();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        @TargetApi(11)
        public boolean init(Context context, DeviceConfigManager deviceConfigManager) {
            AudioDeviceInterface.LogTraceEntry("");
            if (context == null || deviceConfigManager == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " err ctx==null||_devCfg==null");
                }
                return false;
            }
            this._ctx = context;
            this._devCfg = deviceConfigManager;
            this._adapter = BluetoothAdapter.getDefaultAdapter();
            if (this._adapter == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, " err getDefaultAdapter fail!");
                }
                return false;
            }
            this._profileLock.lock();
            try {
                if (this._adapter.isEnabled() && this._profile == null && !this._adapter.getProfileProxy(this._ctx, this, 1)) {
                    if (QLog.isColorLevel()) {
                        QLog.e("TRAE", 2, "BluetoohHeadsetCheck: getProfileProxy HEADSET fail!");
                    }
                    return false;
                }
                this._profileLock.unlock();
                AudioDeviceInterface.LogTraceExit();
                return true;
            } finally {
                this._profileLock.unlock();
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void release() {
            AudioDeviceInterface.LogTraceEntry("_profile:" + this._profile);
            this._profileLock.lock();
            try {
                try {
                    if (this._adapter != null) {
                        if (this._profile != null) {
                            this._adapter.closeProfileProxy(1, this._profile);
                        }
                        this._profile = null;
                    }
                } catch (Exception e) {
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, " closeProfileProxy:e:" + e.getMessage());
                    }
                }
                AudioDeviceInterface.LogTraceExit();
            } finally {
                this._profileLock.unlock();
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean isConnected() {
            this._profileLock.lock();
            try {
                boolean z = false;
                if (this._profile != null) {
                    List<BluetoothDevice> connectedDevices = this._profile.getConnectedDevices();
                    if (connectedDevices == null) {
                        return false;
                    }
                    if (connectedDevices.size() > 0) {
                        z = true;
                    }
                }
                return z;
            } finally {
                this._profileLock.unlock();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:5:0x002b, B:7:0x0031, B:9:0x0035, B:11:0x003b, B:12:0x0058, B:13:0x0061, B:15:0x0067, B:19:0x0072, B:21:0x0076, B:23:0x007c, B:25:0x009e, B:27:0x00a4, B:28:0x00aa, B:30:0x00ae, B:38:0x00d6, B:39:0x00df, B:41:0x00e5, B:33:0x00b6, B:35:0x00bc), top: B:60:0x002b, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e5 A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #0 {all -> 0x0151, blocks: (B:5:0x002b, B:7:0x0031, B:9:0x0035, B:11:0x003b, B:12:0x0058, B:13:0x0061, B:15:0x0067, B:19:0x0072, B:21:0x0076, B:23:0x007c, B:25:0x009e, B:27:0x00a4, B:28:0x00aa, B:30:0x00ae, B:38:0x00d6, B:39:0x00df, B:41:0x00e5, B:33:0x00b6, B:35:0x00bc), top: B:60:0x002b, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x010c A[SYNTHETIC] */
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        @android.annotation.TargetApi(11)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onServiceConnected(int r10, android.bluetooth.BluetoothProfile r11) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheck.onServiceConnected(int, android.bluetooth.BluetoothProfile):void");
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        @TargetApi(11)
        public void onServiceDisconnected(int i) {
            AudioDeviceInterface.LogTraceEntry("_profile:" + this._profile + " profile:" + i);
            if (i == 1) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "TRAEBluetoohProxy: HEADSET Disconnected");
                }
                if (isConnected()) {
                    TraeAudioManager.this.checkDevicePlug(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                }
                this._profileLock.lock();
                try {
                    if (this._profile != null) {
                        this._adapter.closeProfileProxy(1, this._profile);
                        this._profile = null;
                    }
                } finally {
                    this._profileLock.unlock();
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        void _addAction(IntentFilter intentFilter) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, StringUtil.SPACE + interfaceDesc() + " _addAction");
            }
            intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        void _onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                int a = f.a(intent, "android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
                int a2 = f.a(intent, "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", -1);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "BT ACTION_CONNECTION_STATE_CHANGED|   EXTRA_CONNECTION_STATE " + getBTAdapterConnectionState(a));
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "    EXTRA_PREVIOUS_CONNECTION_STATE " + getBTAdapterConnectionState(a2));
                }
                if (QLog.isColorLevel()) {
                    StringBuilder sb = new StringBuilder("    EXTRA_DEVICE ");
                    sb.append(bluetoothDevice);
                    sb.append(StringUtil.SPACE);
                    sb.append(bluetoothDevice != null ? bluetoothDevice.getName() : StringUtil.SPACE);
                    QLog.w("TRAE", 2, sb.toString());
                }
                if (a != 2) {
                    if (a == 0) {
                        this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                        return;
                    }
                    return;
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "   dev:" + bluetoothDevice.getName() + " connected,start sco...");
                }
                this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                this._devCfg.setBluetoothName(bluetoothDevice != null ? bluetoothDevice.getName() : "unkown");
            } else if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                int a3 = f.a(intent, "android.media.extra.SCO_AUDIO_STATE", -1);
                int a4 = f.a(intent, "android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "BT ACTION_SCO_AUDIO_STATE_UPDATED|   EXTRA_CONNECTION_STATE  dev:" + bluetoothDevice2);
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "   EXTRA_SCO_AUDIO_STATE " + getSCOAudioStateExtraString(a3));
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "   EXTRA_SCO_AUDIO_PREVIOUS_STATE " + getSCOAudioStateExtraString(a4));
                }
            } else if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                int profileConnectionState = defaultAdapter.getProfileConnectionState(2);
                if (profileConnectionState == 0) {
                    QLog.w("TRAE", 2, "BluetoothA2dp STATE_DISCONNECTED");
                    TraeAudioManager.this.IsBluetoothA2dpExisted = false;
                } else if (profileConnectionState == 2) {
                    QLog.w("TRAE", 2, "BluetoothA2dp STATE_CONNECTED");
                    TraeAudioManager.this.IsBluetoothA2dpExisted = true;
                } else {
                    QLog.w("TRAE", 2, "BluetoothA2dp" + defaultAdapter.getProfileConnectionState(2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class BluetoohHeadsetCheckFor2x extends BluetoohHeadsetCheckInterface {
        public static final String ACTION_BLUETOOTHHEADSET_AUDIO_STATE_CHANGED = "android.bluetooth.headset.action.AUDIO_STATE_CHANGED";
        public static final String ACTION_BLUETOOTHHEADSET_STATE_CHANGED = "android.bluetooth.headset.action.STATE_CHANGED";
        public static final int AUDIO_STATE_CONNECTED = 1;
        public static final int AUDIO_STATE_DISCONNECTED = 0;
        static final int STATE_CONNECTED = 2;
        static final int STATE_DISCONNECTED = 0;
        Class<?> BluetoothHeadsetClass;
        Object BluetoothHeadsetObj;
        Class<?> ListenerClass;
        Context _ctx;
        DeviceConfigManager _devCfg;
        Method getCurrentHeadsetMethod;

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public String interfaceDesc() {
            return "BluetoohHeadsetCheckFor2x";
        }

        BluetoohHeadsetCheckFor2x() {
            super();
            this.BluetoothHeadsetClass = null;
            this.ListenerClass = null;
            this.BluetoothHeadsetObj = null;
            this.getCurrentHeadsetMethod = null;
            this._ctx = null;
            this._devCfg = null;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean init(Context context, DeviceConfigManager deviceConfigManager) {
            AudioDeviceInterface.LogTraceEntry("");
            this._ctx = context;
            this._devCfg = deviceConfigManager;
            if (this._ctx == null || this._devCfg == null) {
                return false;
            }
            try {
                this.BluetoothHeadsetClass = Class.forName("android.bluetooth.BluetoothHeadset");
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset class not found");
                }
            }
            if (this.BluetoothHeadsetClass == null) {
                return false;
            }
            try {
                this.ListenerClass = Class.forName("android.bluetooth.BluetoothHeadset$ServiceListener");
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset.ServiceListener class not found:" + e);
                }
            }
            try {
                this.getCurrentHeadsetMethod = this.BluetoothHeadsetClass.getDeclaredMethod("getCurrentHeadset", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset NoSuchMethodException");
                }
            }
            if (this.getCurrentHeadsetMethod == null) {
                return false;
            }
            try {
                this.BluetoothHeadsetObj = this.BluetoothHeadsetClass.getConstructor(Context.class, this.ListenerClass).newInstance(context, null);
            } catch (IllegalAccessException unused3) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor IllegalAccessException");
                }
            } catch (IllegalArgumentException unused4) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor IllegalArgumentException");
                }
            } catch (InstantiationException unused5) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor InstantiationException");
                }
            } catch (NoSuchMethodException unused6) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor NoSuchMethodException");
                }
            } catch (InvocationTargetException unused7) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor InvocationTargetException");
                }
            }
            if (this.BluetoothHeadsetObj == null) {
                return false;
            }
            this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, isConnected());
            if (isConnected()) {
                this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                TraeAudioManager.this.checkDevicePlug(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
            } else {
                this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
            }
            AudioDeviceInterface.LogTraceExit();
            return true;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void release() {
            Method method;
            AudioDeviceInterface.LogTraceEntry("");
            if (this.BluetoothHeadsetObj == null) {
                return;
            }
            try {
                method = this.BluetoothHeadsetClass.getDeclaredMethod("close", new Class[0]);
            } catch (NoSuchMethodException unused) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "BTLooperThread _uninitHeadsetfor2x method close NoSuchMethodException");
                }
                method = null;
            }
            if (method == null) {
                return;
            }
            try {
                method.invoke(this.BluetoothHeadsetObj, new Object[0]);
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "close bluetooth headset failed." + e.getMessage());
                }
            }
            this.BluetoothHeadsetClass = null;
            this.ListenerClass = null;
            this.BluetoothHeadsetObj = null;
            this.getCurrentHeadsetMethod = null;
            AudioDeviceInterface.LogTraceExit();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[RETURN] */
        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean isConnected() {
            /*
                r6 = this;
                java.lang.reflect.Method r0 = r6.getCurrentHeadsetMethod
                r1 = 0
                if (r0 == 0) goto L68
                java.lang.reflect.Method r0 = r6.getCurrentHeadsetMethod
                if (r0 != 0) goto La
                goto L68
            La:
                r0 = 2
                java.lang.reflect.Method r2 = r6.getCurrentHeadsetMethod     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L25 java.lang.IllegalArgumentException -> L34
                java.lang.Object r3 = r6.BluetoothHeadsetObj     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L25 java.lang.IllegalArgumentException -> L34
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L25 java.lang.IllegalArgumentException -> L34
                java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L25 java.lang.IllegalArgumentException -> L34
                goto L43
            L16:
                boolean r2 = com.tencent.rtmp.sharp.jni.QLog.isColorLevel()
                if (r2 == 0) goto L42
                java.lang.String r2 = "TRAE"
                java.lang.String r3 = "BTLooperThread BluetoothHeadset method getCurrentHeadset InvocationTargetException"
                com.tencent.rtmp.sharp.jni.QLog.w(r2, r0, r3)
                goto L42
            L25:
                boolean r2 = com.tencent.rtmp.sharp.jni.QLog.isColorLevel()
                if (r2 == 0) goto L42
                java.lang.String r2 = "TRAE"
                java.lang.String r3 = "BTLooperThread BluetoothHeadset method getCurrentHeadset IllegalAccessException"
                com.tencent.rtmp.sharp.jni.QLog.w(r2, r0, r3)
                goto L42
            L34:
                boolean r2 = com.tencent.rtmp.sharp.jni.QLog.isColorLevel()
                if (r2 == 0) goto L42
                java.lang.String r2 = "TRAE"
                java.lang.String r3 = "BTLooperThread BluetoothHeadset method getCurrentHeadset IllegalArgumentException"
                com.tencent.rtmp.sharp.jni.QLog.w(r2, r0, r3)
            L42:
                r2 = 0
            L43:
                boolean r3 = com.tencent.rtmp.sharp.jni.QLog.isColorLevel()
                if (r3 == 0) goto L63
                java.lang.String r3 = "TRAE"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "BTLooperThread BluetoothHeadset method getCurrentHeadset res:"
                r4.<init>(r5)
                if (r2 == 0) goto L57
                java.lang.String r5 = " Y"
                goto L59
            L57:
                java.lang.String r5 = "N"
            L59:
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.rtmp.sharp.jni.QLog.w(r3, r0, r4)
            L63:
                if (r2 == 0) goto L67
                r0 = 1
                return r0
            L67:
                return r1
            L68:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckFor2x.isConnected():boolean");
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        void _addAction(IntentFilter intentFilter) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, StringUtil.SPACE + interfaceDesc() + " _addAction");
            }
            intentFilter.addAction(ACTION_BLUETOOTHHEADSET_AUDIO_STATE_CHANGED);
            intentFilter.addAction(ACTION_BLUETOOTHHEADSET_STATE_CHANGED);
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        void _onReceive(Context context, Intent intent) {
            if (ACTION_BLUETOOTHHEADSET_AUDIO_STATE_CHANGED.equals(intent.getAction())) {
                int a = f.a(intent, "android.bluetooth.headset.extra.STATE", -2);
                int a2 = f.a(intent, "android.bluetooth.headset.extra.PREVIOUS_STATE", -2);
                int a3 = f.a(intent, "android.bluetooth.headset.extra.AUDIO_STATE", -2);
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "++ AUDIO_STATE_CHANGED|  STATE " + a);
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "       PREVIOUS_STATE " + a2);
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "       AUDIO_STATE " + a3);
                }
                if (a3 == 2) {
                    this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                } else if (a3 == 0) {
                    this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                }
            } else if (ACTION_BLUETOOTHHEADSET_STATE_CHANGED.equals(intent.getAction())) {
                int a4 = f.a(intent, "android.bluetooth.headset.extra.STATE", -2);
                int a5 = f.a(intent, "android.bluetooth.headset.extra.PREVIOUS_STATE", -2);
                int a6 = f.a(intent, "android.bluetooth.headset.extra.AUDIO_STATE", -2);
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "++ STATE_CHANGED|  STATE " + a4);
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "       PREVIOUS_STATE " + a5);
                }
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "       AUDIO_STATE " + a6);
                }
                if (a6 == 2) {
                    this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                } else if (a6 == 0) {
                    this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                }
            }
        }
    }

    static String getForceConfigName(int i) {
        return (i < 0 || i >= forceName.length) ? "unknow" : forceName[i];
    }

    public static Object invokeMethod(Object obj, String str, Object[] objArr, Class[] clsArr) {
        try {
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "invokeMethod Exception:" + e.getMessage());
            }
            return null;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Object[] objArr, Class[] clsArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
        } catch (ClassNotFoundException unused) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "ClassNotFound:" + str);
            }
            return null;
        } catch (IllegalAccessException unused2) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "IllegalAccess:" + str2);
            }
            return null;
        } catch (IllegalArgumentException unused3) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "IllegalArgument:" + str2);
            }
            return null;
        } catch (NoSuchMethodException unused4) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "NoSuchMethod:" + str2);
            }
            return null;
        } catch (InvocationTargetException unused5) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "InvocationTarget:" + str2);
            }
            return null;
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "invokeStaticMethod Exception:" + e.getMessage());
            }
            return null;
        }
    }

    static void setParameters(String str) {
        Object[] objArr = {str};
        Class[] clsArr = {String.class};
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "setParameters  :" + str);
        }
        invokeStaticMethod("android.media.AudioSystem", "setParameters", objArr, clsArr);
    }

    static void setPhoneState(int i) {
        invokeStaticMethod("android.media.AudioSystem", "setPhoneState", new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
    }

    static void setForceUse(int i, int i2) {
        Object invokeStaticMethod = invokeStaticMethod("android.media.AudioSystem", "setForceUse", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, new Class[]{Integer.TYPE, Integer.TYPE});
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "setForceUse  usage:" + i + " config:" + i2 + " ->" + getForceConfigName(i2) + " res:" + invokeStaticMethod);
        }
    }

    static int getForceUse(int i) {
        Integer num = 0;
        Object invokeStaticMethod = invokeStaticMethod("android.media.AudioSystem", "getForceUse", new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
        if (invokeStaticMethod != null) {
            num = (Integer) invokeStaticMethod;
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "getForceUse  usage:" + i + " config:" + num + " ->" + getForceConfigName(num.intValue()));
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void forceVolumeControlStream(AudioManager audioManager, int i) {
        if (Build.MANUFACTURER.equals("Google")) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "forceVolumeControlStream, Google phone nothing to do");
                return;
            }
            return;
        }
        Object invokeMethod = invokeMethod(audioManager, "forceVolumeControlStream", new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "forceVolumeControlStream  streamType:" + i + " res:" + invokeMethod);
        }
    }
}
