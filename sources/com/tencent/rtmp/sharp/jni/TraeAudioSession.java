package com.tencent.rtmp.sharp.jni;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Process;
import com.meituan.robust.common.StringUtil;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TraeAudioSession extends BroadcastReceiver {
    static int s_nSessionIdAllocator;
    private ITraeAudioCallback mCallback;
    private Context mContext;
    private boolean mIsHostside;
    private long mSessionId;
    private String _connectedDev = TraeAudioManager.DEVICE_NONE;
    private boolean _canSwtich2Earphone = true;
    final String TRAE_ACTION_PHONE_STATE = "android.intent.action.PHONE_STATE";

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface ITraeAudioCallback {
        void onAudioRouteSwitchEnd(String str, long j);

        void onAudioRouteSwitchStart(String str, String str2);

        void onConnectDeviceRes(int i, String str, boolean z);

        void onDeviceChangabledUpdate(boolean z);

        void onDeviceListUpdate(String[] strArr, String str, String str2, String str3);

        void onGetConnectedDeviceRes(int i, String str);

        void onGetConnectingDeviceRes(int i, String str);

        void onGetDeviceListRes(int i, String[] strArr, String str, String str2, String str3);

        void onGetStreamTypeRes(int i, int i2);

        void onIsDeviceChangabledRes(int i, boolean z);

        void onRingCompletion(int i, String str);

        void onServiceStateUpdate(boolean z);

        void onStreamTypeUpdate(int i);

        void onVoicecallPreprocessRes(int i);
    }

    public static long requestSessionId() {
        int i = s_nSessionIdAllocator + 1;
        s_nSessionIdAllocator = i;
        return (Process.myPid() << 32) + i;
    }

    public static void ExConnectDevice(Context context, String str) {
        if (context == null || str == null || str.length() <= 0) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, Long.MIN_VALUE);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_CONNECTDEVICE);
        intent.putExtra(TraeAudioManager.CONNECTDEVICE_DEVICENAME, str);
        b.a(context, intent);
    }

    public TraeAudioSession(Context context, ITraeAudioCallback iTraeAudioCallback) {
        this.mIsHostside = false;
        this.mSessionId = Long.MIN_VALUE;
        this.mIsHostside = Process.myPid() == TraeAudioManager._gHostProcessId;
        this.mSessionId = requestSessionId();
        this.mCallback = iTraeAudioCallback;
        this.mContext = context;
        if (context == null && QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("AudioSession | Invalid parameters: ctx = ");
            sb.append(context == null ? StringUtil.NULL : "{object}");
            sb.append("; cb = ");
            sb.append(iTraeAudioCallback == null ? StringUtil.NULL : "{object}");
            QLog.w("TRAE", 2, sb.toString());
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_RES);
        intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
        if (context != null) {
            try {
                context.registerReceiver(this, intentFilter);
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "registerReceiver Exception: " + e.getMessage());
                }
            }
        }
        registerAudioSession(this, true);
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "TraeAudioSession create, mSessionId: " + this.mSessionId);
        }
    }

    public void release() {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "TraeAudioSession release, mSessionId: " + this.mSessionId);
        }
        if (this.mContext != null) {
            try {
                this.mContext.unregisterReceiver(this);
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "unregisterReceiver failed." + e.getMessage());
                }
            }
        }
        registerAudioSession(this, false);
        this.mContext = null;
        this.mCallback = null;
    }

    public void setCallback(ITraeAudioCallback iTraeAudioCallback) {
        this.mCallback = iTraeAudioCallback;
    }

    private int registerAudioSession(TraeAudioSession traeAudioSession, boolean z) {
        if (this.mContext == null) {
            return -1;
        }
        return TraeAudioManager.registerAudioSession(traeAudioSession, z, this.mSessionId, this.mContext);
    }

    public int startService(String str) {
        str = (str == null || str.length() <= 0) ? "internal_disable_dev_switch" : "internal_disable_dev_switch";
        if (this.mIsHostside) {
            return TraeAudioManager.startService(TraeAudioManager.OPERATION_STARTSERVICE, this.mSessionId, this.mIsHostside, str);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STARTSERVICE);
        intent.putExtra(TraeAudioManager.EXTRA_DATA_DEVICECONFIG, str);
        b.a(this.mContext, intent);
        return 0;
    }

    public int disableDeviceSwitch() {
        return TraeAudioManager.disableDeviceSwitch();
    }

    public int stopService() {
        if (this.mIsHostside) {
            return TraeAudioManager.stopService(TraeAudioManager.OPERATION_STOPSERVICE, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STOPSERVICE);
        b.a(this.mContext, intent);
        return 0;
    }

    public int getDeviceList() {
        if (this.mIsHostside) {
            return TraeAudioManager.getDeviceList(TraeAudioManager.OPERATION_GETDEVICELIST, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_GETDEVICELIST);
        b.a(this.mContext, intent);
        return 0;
    }

    public int getStreamType() {
        if (this.mIsHostside) {
            return TraeAudioManager.getStreamType(TraeAudioManager.OPERATION_GETSTREAMTYPE, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_GETSTREAMTYPE);
        b.a(this.mContext, intent);
        return 0;
    }

    public int connectDevice(String str) {
        if (this.mIsHostside) {
            return TraeAudioManager.connectDevice(TraeAudioManager.OPERATION_CONNECTDEVICE, this.mSessionId, this.mIsHostside, str);
        }
        if (this.mContext == null || str == null || str.length() <= 0) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_CONNECTDEVICE);
        intent.putExtra(TraeAudioManager.CONNECTDEVICE_DEVICENAME, str);
        b.a(this.mContext, intent);
        return 0;
    }

    public int connectHighestPriorityDevice() {
        if (this.mIsHostside) {
            return TraeAudioManager.connectHighestPriorityDevice(TraeAudioManager.OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE);
        b.a(this.mContext, intent);
        return 0;
    }

    public int EarAction(int i) {
        if (this.mIsHostside) {
            return TraeAudioManager.earAction(TraeAudioManager.OPERATION_EARACTION, this.mSessionId, this.mIsHostside, i);
        }
        if (this.mContext != null) {
            if (i == 0 || i == 1) {
                Intent intent = new Intent();
                intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
                intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
                intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_EARACTION);
                intent.putExtra(TraeAudioManager.EXTRA_EARACTION, i);
                b.a(this.mContext, intent);
                return 0;
            }
            return -1;
        }
        return -1;
    }

    public int isDeviceChangabled() {
        if (this.mIsHostside) {
            return TraeAudioManager.isDeviceChangabled(TraeAudioManager.OPERATION_ISDEVICECHANGABLED, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_ISDEVICECHANGABLED);
        b.a(this.mContext, intent);
        return 0;
    }

    public int getConnectedDevice() {
        if (this.mIsHostside) {
            return TraeAudioManager.getConnectedDevice(TraeAudioManager.OPERATION_GETCONNECTEDDEVICE, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_GETCONNECTEDDEVICE);
        b.a(this.mContext, intent);
        return 0;
    }

    public int getConnectingDevice() {
        if (this.mIsHostside) {
            return TraeAudioManager.getConnectingDevice(TraeAudioManager.OPERATION_GETCONNECTINGDEVICE, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_GETCONNECTINGDEVICE);
        b.a(this.mContext, intent);
        return 0;
    }

    public int voiceCallPreprocess(int i, int i2) {
        if (this.mIsHostside) {
            return TraeAudioManager.voicecallPreprocess(TraeAudioManager.OPERATION_VOICECALL_PREPROCESS, this.mSessionId, this.mIsHostside, i, i2);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_MODEPOLICY, i);
        intent.putExtra(TraeAudioManager.PARAM_STREAMTYPE, i2);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_VOICECALL_PREPROCESS);
        b.a(this.mContext, intent);
        return 0;
    }

    public int voiceCallPostprocess() {
        if (this.mIsHostside) {
            return TraeAudioManager.voicecallPostprocess(TraeAudioManager.OPERATION_VOICECALL_POSTPROCESS, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_VOICECALL_POSTPROCESS);
        b.a(this.mContext, intent);
        return 0;
    }

    public int voiceCallAudioParamChanged(int i, int i2) {
        if (this.mIsHostside) {
            return TraeAudioManager.voiceCallAudioParamChanged(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST, this.mSessionId, this.mIsHostside, i, i2);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_MODEPOLICY, i);
        intent.putExtra(TraeAudioManager.PARAM_STREAMTYPE, i2);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_VOICECALL_AUDIOPARAM_CHANGED);
        b.a(this.mContext, intent);
        return 0;
    }

    public int startRing(int i, int i2, Uri uri, String str, boolean z) {
        if (this.mIsHostside) {
            return TraeAudioManager.startRing(TraeAudioManager.OPERATION_STARTRING, this.mSessionId, this.mIsHostside, i, i2, uri, str, z, 1, "normal-ring", false);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_RING_DATASOURCE, i);
        intent.putExtra(TraeAudioManager.PARAM_RING_RSID, i2);
        intent.putExtra(TraeAudioManager.PARAM_RING_URI, uri);
        intent.putExtra(TraeAudioManager.PARAM_RING_FILEPATH, str);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOP, z);
        intent.putExtra(TraeAudioManager.PARAM_RING_MODE, false);
        intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, "normal-ring");
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STARTRING);
        b.a(this.mContext, intent);
        return 0;
    }

    public int startRing(int i, int i2, Uri uri, String str, boolean z, int i3, String str2) {
        if (this.mIsHostside) {
            return TraeAudioManager.startRing(TraeAudioManager.OPERATION_STARTRING, this.mSessionId, this.mIsHostside, i, i2, uri, str, z, i3, str2, false);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_RING_DATASOURCE, i);
        intent.putExtra(TraeAudioManager.PARAM_RING_RSID, i2);
        intent.putExtra(TraeAudioManager.PARAM_RING_URI, uri);
        intent.putExtra(TraeAudioManager.PARAM_RING_FILEPATH, str);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOP, z);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOPCOUNT, i3);
        intent.putExtra(TraeAudioManager.PARAM_RING_MODE, false);
        intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, str2);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STARTRING);
        b.a(this.mContext, intent);
        return 0;
    }

    public int startRing(int i, int i2, Uri uri, String str, boolean z, int i3, String str2, boolean z2) {
        if (this.mIsHostside) {
            return TraeAudioManager.startRing(TraeAudioManager.OPERATION_STARTRING, this.mSessionId, this.mIsHostside, i, i2, uri, str, z, i3, str2, z2);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_RING_DATASOURCE, i);
        intent.putExtra(TraeAudioManager.PARAM_RING_RSID, i2);
        intent.putExtra(TraeAudioManager.PARAM_RING_URI, uri);
        intent.putExtra(TraeAudioManager.PARAM_RING_FILEPATH, str);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOP, z);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOPCOUNT, i3);
        intent.putExtra(TraeAudioManager.PARAM_RING_MODE, z2);
        intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, str2);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STARTRING);
        b.a(this.mContext, intent);
        return 0;
    }

    public int stopRing() {
        if (this.mIsHostside) {
            return TraeAudioManager.stopRing(TraeAudioManager.OPERATION_STOPRING, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STOPRING);
        b.a(this.mContext, intent);
        return 0;
    }

    public int requestReleaseAudioFocus() {
        if (this.mIsHostside) {
            return TraeAudioManager.requestReleaseAudioFocus(TraeAudioManager.OPERATION_REQUEST_RELEASE_AUDIO_FOCUS, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_REQUEST_RELEASE_AUDIO_FOCUS);
        b.a(this.mContext, intent);
        return 0;
    }

    public int recoverAudioFocus() {
        if (this.mIsHostside) {
            return TraeAudioManager.recoverAudioFocus(TraeAudioManager.OPERATION_RECOVER_AUDIO_FOCUS, this.mSessionId, this.mIsHostside);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_RECOVER_AUDIO_FOCUS);
        b.a(this.mContext, intent);
        return 0;
    }

    public void onReceiveCallback(Intent intent) {
        try {
            if (intent == null) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "[ERROR] intent = null!!");
                    return;
                }
                return;
            }
            long a = f.a(intent, TraeAudioManager.PARAM_SESSIONID, Long.MIN_VALUE);
            String a2 = f.a(intent, TraeAudioManager.PARAM_OPERATION);
            int a3 = f.a(intent, TraeAudioManager.PARAM_RES_ERRCODE, 0);
            if (TraeAudioManager.ACTION_TRAEAUDIOMANAGER_RES.equals(intent.getAction()) && this.mSessionId == a && TraeAudioManager.OPERATION_VOICECALL_PREPROCESS.equals(a2)) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "AudioSession|[onReceiveCallback onVoicecallPreprocess] err:" + a3);
                }
                if (this.mCallback != null) {
                    this.mCallback.onVoicecallPreprocessRes(a3);
                }
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "AudioSession| nSessinId = " + this.mSessionId + " onReceive::intent:" + intent.toString() + " intent.getAction():" + intent.getAction() + " Exception:" + e.getMessage());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent == null) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "[ERROR] intent = null!!");
                    return;
                }
                return;
            }
            long a = f.a(intent, TraeAudioManager.PARAM_SESSIONID, Long.MIN_VALUE);
            String a2 = f.a(intent, TraeAudioManager.PARAM_OPERATION);
            int a3 = f.a(intent, TraeAudioManager.PARAM_RES_ERRCODE, 0);
            boolean z = true;
            if (TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY.equals(intent.getAction())) {
                if (TraeAudioManager.NOTIFY_SERVICE_STATE.equals(a2)) {
                    boolean a4 = f.a(intent, TraeAudioManager.NOTIFY_SERVICE_STATE_DATE, false);
                    if (QLog.isColorLevel()) {
                        StringBuilder sb = new StringBuilder("AudioSession|[onServiceStateUpdate]");
                        sb.append(a4 ? "on" : "off");
                        QLog.w("TRAE", 2, sb.toString());
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onServiceStateUpdate(a4);
                    }
                } else if (TraeAudioManager.NOTIFY_DEVICELIST_UPDATE.equals(a2)) {
                    String[] stringArrayExtra = intent.getStringArrayExtra(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST);
                    String a5 = f.a(intent, TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE);
                    String a6 = f.a(intent, TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE);
                    String a7 = f.a(intent, TraeAudioManager.EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME);
                    String str = "\n";
                    for (int i = 0; i < stringArrayExtra.length; i++) {
                        str = str + "AudioSession|    " + i + StringUtil.SPACE + stringArrayExtra[i] + "\n";
                        if (stringArrayExtra[i].equals(TraeAudioManager.DEVICE_WIREDHEADSET) || stringArrayExtra[i].equals(TraeAudioManager.DEVICE_BLUETOOTHHEADSET)) {
                            z = false;
                        }
                    }
                    String str2 = str + "\n";
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onDeviceListUpdate]  connected:" + a5 + " prevConnected:" + a6 + " bt:" + a7 + " Num:" + stringArrayExtra.length + str2);
                    }
                    this._canSwtich2Earphone = z;
                    this._connectedDev = a5;
                    if (this.mCallback != null) {
                        this.mCallback.onDeviceListUpdate(stringArrayExtra, a5, a6, a7);
                    }
                } else if (TraeAudioManager.NOTIFY_DEVICECHANGABLE_UPDATE.equals(a2)) {
                    boolean a8 = f.a(intent, TraeAudioManager.NOTIFY_DEVICECHANGABLE_UPDATE_DATE, true);
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onDeviceChangabledUpdate]" + a8);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onDeviceChangabledUpdate(a8);
                    }
                } else if (TraeAudioManager.NOTIFY_STREAMTYPE_UPDATE.equals(a2)) {
                    int a9 = f.a(intent, TraeAudioManager.EXTRA_DATA_STREAMTYPE, -1);
                    if (a3 != 0 && QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onStreamTypeUpdate] err:" + a3 + " st:" + a9);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onStreamTypeUpdate(a9);
                    }
                } else if (TraeAudioManager.NOTIFY_ROUTESWITCHSTART.equals(a2)) {
                    String a10 = f.a(intent, TraeAudioManager.EXTRA_DATA_ROUTESWITCHSTART_FROM);
                    String a11 = f.a(intent, TraeAudioManager.EXTRA_DATA_ROUTESWITCHSTART_TO);
                    if (this.mCallback == null || a10 == null || a11 == null) {
                        return;
                    }
                    this.mCallback.onAudioRouteSwitchStart(a10, a11);
                } else if (TraeAudioManager.NOTIFY_ROUTESWITCHEND.equals(a2)) {
                    String a12 = f.a(intent, TraeAudioManager.EXTRA_DATA_ROUTESWITCHEND_DEV);
                    long a13 = f.a(intent, TraeAudioManager.EXTRA_DATA_ROUTESWITCHEND_TIME, -1L);
                    if (this.mCallback == null || a12 == null || a13 == -1) {
                        return;
                    }
                    this.mCallback.onAudioRouteSwitchEnd(a12, a13);
                }
            } else if (TraeAudioManager.ACTION_TRAEAUDIOMANAGER_RES.equals(intent.getAction()) && this.mSessionId == a) {
                if (TraeAudioManager.OPERATION_GETDEVICELIST.equals(a2)) {
                    String[] stringArrayExtra2 = intent.getStringArrayExtra(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST);
                    String a14 = f.a(intent, TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE);
                    String a15 = f.a(intent, TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE);
                    String a16 = f.a(intent, TraeAudioManager.EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME);
                    String str3 = "\n";
                    for (int i2 = 0; i2 < stringArrayExtra2.length; i2++) {
                        str3 = str3 + "AudioSession|    " + i2 + StringUtil.SPACE + stringArrayExtra2[i2] + "\n";
                        if (stringArrayExtra2[i2].equals(TraeAudioManager.DEVICE_WIREDHEADSET) || stringArrayExtra2[i2].equals(TraeAudioManager.DEVICE_BLUETOOTHHEADSET)) {
                            z = false;
                        }
                    }
                    String str4 = str3 + "\n";
                    this._canSwtich2Earphone = z;
                    this._connectedDev = a14;
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onGetDeviceListRes] err:" + a3 + " connected:" + a14 + " prevConnected:" + a15 + " bt:" + a16 + " Num:" + stringArrayExtra2.length + str4);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onGetDeviceListRes(a3, stringArrayExtra2, a14, a15, a16);
                    }
                } else if (TraeAudioManager.OPERATION_CONNECTDEVICE.equals(a2)) {
                    String a17 = f.a(intent, TraeAudioManager.CONNECTDEVICE_RESULT_DEVICENAME);
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onConnectDeviceRes] err:" + a3 + " dev:" + a17);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onConnectDeviceRes(a3, a17, a3 == 0);
                    }
                } else if (TraeAudioManager.OPERATION_EARACTION.equals(a2)) {
                    int a18 = f.a(intent, TraeAudioManager.EXTRA_EARACTION, -1);
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onConnectDeviceRes] err:" + a3 + " earAction:" + a18);
                    }
                } else if (TraeAudioManager.OPERATION_ISDEVICECHANGABLED.equals(a2)) {
                    boolean a19 = f.a(intent, TraeAudioManager.ISDEVICECHANGABLED_RESULT_ISCHANGABLED, false);
                    if (QLog.isColorLevel()) {
                        StringBuilder sb2 = new StringBuilder("AudioSession|[onIsDeviceChangabledRes] err:");
                        sb2.append(a3);
                        sb2.append(" Changabled:");
                        sb2.append(a19 ? "Y" : ErrorCode.ERROR_TYPE_N);
                        QLog.w("TRAE", 2, sb2.toString());
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onIsDeviceChangabledRes(a3, a19);
                    }
                } else if (TraeAudioManager.OPERATION_GETCONNECTEDDEVICE.equals(a2)) {
                    String a20 = f.a(intent, TraeAudioManager.GETCONNECTEDDEVICE_RESULT_LIST);
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onGetConnectedDeviceRes] err:" + a3 + " dev:" + a20);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onGetConnectedDeviceRes(a3, a20);
                    }
                } else if (TraeAudioManager.OPERATION_GETCONNECTINGDEVICE.equals(a2)) {
                    String a21 = f.a(intent, TraeAudioManager.GETCONNECTINGDEVICE_RESULT_LIST);
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onGetConnectingDeviceRes] err:" + a3 + " dev:" + a21);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onGetConnectingDeviceRes(a3, a21);
                    }
                } else if (TraeAudioManager.OPERATION_GETSTREAMTYPE.equals(a2)) {
                    int a22 = f.a(intent, TraeAudioManager.EXTRA_DATA_STREAMTYPE, -1);
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onGetStreamTypeRes] err:" + a3 + " st:" + a22);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onGetStreamTypeRes(a3, a22);
                    }
                } else if (TraeAudioManager.NOTIFY_RING_COMPLETION.equals(a2)) {
                    String a23 = f.a(intent, TraeAudioManager.PARAM_RING_USERDATA_STRING);
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onRingCompletion] err:" + a3 + " userData:" + a23);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onRingCompletion(a3, a23);
                    }
                } else if (TraeAudioManager.OPERATION_VOICECALL_PREPROCESS.equals(a2)) {
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "AudioSession|[onVoicecallPreprocess] err:" + a3);
                    }
                    if (this.mCallback != null) {
                        this.mCallback.onVoicecallPreprocessRes(a3);
                    }
                }
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "AudioSession| nSessinId = " + this.mSessionId + " onReceive::intent:" + intent.toString() + " intent.getAction():" + intent.getAction() + " Exception:" + e.getMessage());
            }
        }
    }
}
