package io.agora.rtc.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.waimai.platform.utils.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class AudioRoutingController {
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 4000;
    private static final int BT_SCO_STATE_CONNECTED = 1;
    private static final int BT_SCO_STATE_CONNECTING = 0;
    private static final int BT_SCO_STATE_DISCONNECTED = 3;
    private static final int BT_SCO_STATE_DISCONNECTING = 2;
    public static final int CMD_FORCE_BT_SCO_OFF = 16;
    public static final int CMD_FORCE_TO_SPEAKER = 11;
    public static final int CMD_MUTE_VIDEO_ALL = 14;
    public static final int CMD_MUTE_VIDEO_LOCAL = 12;
    public static final int CMD_MUTE_VIDEO_REMOTES = 13;
    public static final int CMD_SET_DEFAULT_ROUTING = 10;
    public static final int CMD_START_BT_SCO = 15;
    private static final int ERROR = 4;
    private static final int EVT_BT_HEADSET = 2;
    private static final int EVT_BT_SCO = 3;
    public static final int EVT_CHANNEL_PROFILE = 20;
    public static final int EVT_ENGINE_ROLE_CHANGED = 21;
    private static final int EVT_HEADSET = 1;
    public static final int EVT_PHONE_STATE_CHANGED = 22;
    public static final int EVT_USING_COMM_PARAMETERS = 112;
    public static final int EVT_USING_NORM_PARAMETERS = 113;
    private static final int MAX_SCO_CONNECT_ATTEMPS = 5;
    public static final int OFF = 0;
    public static final int ON = 1;
    private static final int START = 1;
    private static final int STOP = 2;
    private static final String TAG = "AudioRoute";
    private static final int UNINIT = 0;
    public static final int UNSET = -1;
    private BluetoothAdapter mBTAdapter;
    private BluetoothHeadset mBTHeadset;
    private BluetoothProfile.ServiceListener mBTHeadsetListener;
    private BTHeadsetBroadcastReceiver mBTHeadsetReceiver;
    private WeakReference<Context> mContext;
    private EventHandler mEventHandler;
    private HeadsetBroadcastReceiver mHeadsetReceiver;
    private WeakReference<AudioRoutingListener> mListener;
    private int mScoConnectionAttemps;
    private ControllerState mState;
    private boolean mIsWiredHeadsetPlugged = false;
    private int mHeadsetType = -1;
    private boolean mIsBTHeadsetPlugged = false;
    private int mForceSpeakerphone = -1;
    private int mCurrentRouting = -1;
    private int mDefaultRouting = -1;
    private int mOriginRouting = -1;
    private int mChannelProfile = 1;
    private boolean mVideoDisabled = true;
    private boolean mMuteLocal = false;
    private boolean mMuteRemotes = false;
    private int mEngineRole = -1;
    private boolean mPhoneInCall = false;
    private int mSpeakerCommVolume = -1;
    private boolean mBTHeadSetProperlySeted = false;
    private int mBtScoState = 3;
    private boolean mIsBTScoStarted = false;
    private int dynamic_timeout = 4000;
    private int mLastNotifiedRouting = -1;
    private ControllerStopState mStopState = null;
    private ControllerStartState mStartState = null;
    private ControllerErrorState mErrorState = null;
    private int mNotifiedRouting = -1;
    private boolean mUsingCommParameters = false;
    private final Runnable bluetoothTimeoutRunnable = new Runnable() { // from class: io.agora.rtc.internal.AudioRoutingController.1
        @Override // java.lang.Runnable
        public void run() {
            AudioRoutingController.this.bluetoothTimeout();
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    interface ControllerState {
        int getState();

        void onEvent(int i, int i2);

        void reset();

        void setState(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAudioRouteDesc(int i) {
        switch (i) {
            case -1:
                return "Default";
            case 0:
                return "Headset";
            case 1:
                return "Earpiece";
            case 2:
                return "HeadsetOnly";
            case 3:
                return "Speakerphone";
            case 4:
                return "Loudspeaker";
            case 5:
                return "HeadsetBluetooth";
            default:
                return "Unknown";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        this.dynamic_timeout += this.mScoConnectionAttemps * 4000;
        Logging.d(TAG, "start bluetooth timer " + this.dynamic_timeout);
        this.mEventHandler.postDelayed(this.bluetoothTimeoutRunnable, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimer() {
        Logging.d(TAG, "cancel bluetooth timer");
        this.mEventHandler.removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    class HeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private HeadsetBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                int a = f.a(intent, "state", -1);
                if (a == 1) {
                    if (f.a(intent, "microphone", -1) == 1) {
                        Logging.i(AudioRoutingController.TAG, "Headset w/ mic connected");
                        AudioRoutingController.this.sendEvent(1, 0);
                        return;
                    }
                    Logging.i(AudioRoutingController.TAG, "Headset w/o mic connected");
                    AudioRoutingController.this.sendEvent(1, 2);
                } else if (a == 0) {
                    Logging.i(AudioRoutingController.TAG, "Headset disconnected");
                    AudioRoutingController.this.sendEvent(1, -1);
                } else {
                    Logging.i(AudioRoutingController.TAG, "Headset unknown event detected, state=" + a);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class BTHeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private BTHeadsetBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            try {
                if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int a = f.a(intent, "android.bluetooth.profile.extra.STATE", -99);
                    int a2 = f.a(intent, "android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "BT ACTION_CONNECTION_STATE_CHANGED prev " + a2 + ", " + a);
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    switch (a) {
                        case 0:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth device " + bluetoothDevice + " disconnected");
                            AudioRoutingController.this.sendEvent(2, 0);
                            return;
                        case 1:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth device " + bluetoothDevice + " connecting");
                            return;
                        case 2:
                            if (bluetoothDevice != null) {
                                if (bluetoothDevice.getBluetoothClass().hasService(2097152) || bluetoothDevice.getBluetoothClass().hasService(4194304)) {
                                    Logging.i(AudioRoutingController.TAG, "Bluetooth device " + bluetoothDevice + " connected");
                                    AudioRoutingController.this.mScoConnectionAttemps = 0;
                                    AudioRoutingController.this.sendEvent(2, 1);
                                    return;
                                }
                                return;
                            }
                            return;
                        case 3:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth device " + bluetoothDevice + " disconnecting");
                            AudioRoutingController.this.mIsBTHeadsetPlugged = false;
                            return;
                        default:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth device " + bluetoothDevice + " unknown event, state=" + a);
                            return;
                    }
                } else if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                    int a3 = f.a(intent, "android.bluetooth.profile.extra.STATE", -99);
                    int a4 = f.a(intent, "android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "BT ACTION_AUDIO_STATE_CHANGED prev " + a4 + ", " + a3);
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    switch (a3) {
                        case 10:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth audio device " + bluetoothDevice2 + " disconnected");
                            return;
                        case 11:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth audio device " + bluetoothDevice2 + " connecting");
                            return;
                        case 12:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth audio device " + bluetoothDevice2 + " connected");
                            return;
                        default:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth audio device " + bluetoothDevice2 + " event, state=" + a3);
                            return;
                    }
                } else if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    int a5 = f.a(intent, "android.media.extra.SCO_AUDIO_STATE", -99);
                    int a6 = f.a(intent, "android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "BT ACTION_SCO_AUDIO_STATE_UPDATED prev " + a6 + ", " + a5);
                    switch (a5) {
                        case -1:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth SCO device error");
                            return;
                        case 0:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth SCO device disconnected");
                            AudioRoutingController.this.sendEvent(3, 0);
                            return;
                        case 1:
                            if (AudioRoutingController.this.mBTAdapter.getProfileConnectionState(1) == 2) {
                                Logging.i(AudioRoutingController.TAG, "Bluetooth SCO device connected");
                                AudioRoutingController.this.cancelTimer();
                                AudioRoutingController.this.sendEvent(3, 1);
                                return;
                            }
                            return;
                        case 2:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth SCO device connecting");
                            return;
                        default:
                            Logging.i(AudioRoutingController.TAG, "Bluetooth SCO device unknown event, state=" + a5);
                            return;
                    }
                } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int a7 = f.a(intent, "android.bluetooth.adapter.extra.STATE", -99);
                    int a8 = f.a(intent, "android.bluetooth.adapter.extra.PREVIOUS_STATE", -99);
                    Logging.d(AudioRoutingController.TAG, "BluetoothAdapter.ACTION_STATE_CHANGED prev " + a8 + ", " + a7);
                    if (a7 == 10) {
                        AudioRoutingController.this.sendEvent(2, 0);
                    } else if (a7 != 12) {
                    } else {
                        if (AudioRoutingController.this.mBTAdapter.getProfileConnectionState(2) == 2 || AudioRoutingController.this.mBTAdapter.getProfileConnectionState(1) == 2) {
                            AudioRoutingController.this.sendEvent(2, 1);
                        }
                    }
                }
            } catch (Exception e) {
                Logging.e(AudioRoutingController.TAG, "BT broadcast receiver onReceive fail ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AudioRoutingController.this.mState.onEvent(message.what, message.arg1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ControllerState changeState(int i) {
        if (i == 2) {
            if (this.mStopState == null) {
                this.mStopState = new ControllerStopState();
            }
            if (this.mStopState != null) {
                this.mStopState.reset();
            }
            return this.mStopState;
        } else if (i == 1) {
            if (this.mStartState == null) {
                this.mStartState = new ControllerStartState();
            }
            if (this.mStartState != null) {
                this.mStartState.reset();
            }
            return this.mStartState;
        } else {
            if (this.mErrorState == null) {
                this.mErrorState = new ControllerErrorState();
            }
            if (this.mErrorState != null) {
                this.mErrorState.reset();
            }
            return this.mErrorState;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public abstract class ControllerBaseState implements ControllerState {
        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 0;
        }

        private ControllerBaseState() {
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerState
        public void setState(int i) {
            if (i == getState()) {
                Logging.i(AudioRoutingController.TAG, "setState: state not changed!");
                return;
            }
            AudioRoutingController.this.mState = AudioRoutingController.this.changeState(i);
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerState
        public void reset() {
            AudioRoutingController.this.resetAudioRouting();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerState
        public void onEvent(int i, int i2) {
            switch (i) {
                case 1:
                    AudioRoutingController.this.mHeadsetType = i2;
                    AudioRoutingController.this.mIsWiredHeadsetPlugged = i2 >= 0;
                    return;
                case 2:
                    AudioRoutingController.this.mIsBTHeadsetPlugged = i2 == 1;
                    return;
                case 12:
                    AudioRoutingController.this.mMuteLocal = i2 > 0;
                    return;
                case 13:
                    AudioRoutingController.this.mMuteRemotes = i2 > 0;
                    return;
                case 14:
                    AudioRoutingController.this.mVideoDisabled = i2 > 0;
                    return;
                case 21:
                    AudioRoutingController.this.mEngineRole = i2;
                    return;
                case 22:
                    AudioRoutingController.this.mPhoneInCall = i2 > 0;
                    return;
                case 112:
                    AudioRoutingController.this.mUsingCommParameters = true;
                    break;
                case 113:
                    break;
                default:
                    return;
            }
            AudioRoutingController.this.mUsingCommParameters = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class ControllerStopState extends ControllerBaseState {
        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 2;
        }

        public ControllerStopState() {
            super();
            AudioRoutingController.this.cancelTimer();
            if (AudioRoutingController.this.mIsBTScoStarted) {
                AudioRoutingController.this.mIsBTScoStarted = false;
                AudioRoutingController.this.stopBtSco();
            }
            AudioRoutingController.this.mForceSpeakerphone = -1;
            AudioRoutingController.this.mCurrentRouting = -1;
            AudioRoutingController.this.mDefaultRouting = -1;
            AudioRoutingController.this.mScoConnectionAttemps = 0;
            Logging.i(AudioRoutingController.TAG, "Monitor stopped");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc.internal.AudioRoutingController.ControllerState
        public void reset() {
            Logging.i(AudioRoutingController.TAG, "Monitor stop state, reset");
            AudioRoutingController.this.mBTHeadSetProperlySeted = false;
            AudioRoutingController.this.cancelTimer();
            if (AudioRoutingController.this.mIsBTScoStarted || AudioRoutingController.this.getAudioManager().isBluetoothScoOn()) {
                AudioRoutingController.this.mIsBTScoStarted = false;
                AudioRoutingController.this.stopBtSco();
            }
            AudioRoutingController.this.mForceSpeakerphone = -1;
            AudioRoutingController.this.mCurrentRouting = -1;
            AudioRoutingController.this.mDefaultRouting = -1;
            AudioRoutingController.this.mScoConnectionAttemps = 0;
            Logging.i(AudioRoutingController.TAG, "Monitor stopped");
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc.internal.AudioRoutingController.ControllerState
        public void onEvent(int i, int i2) {
            Logging.d(AudioRoutingController.TAG, "StopState: onEvent: " + i + ", info: " + i2);
            try {
                AudioManager audioManager = AudioRoutingController.this.getAudioManager();
                if (i == 11) {
                    audioManager.setSpeakerphoneOn(i2 == 1);
                    AudioRoutingController.this.mCurrentRouting = i2 == 1 ? 3 : -1;
                    AudioRoutingController.this.mForceSpeakerphone = i2;
                    AudioRoutingController.this.notifyAudioRoutingChanged(AudioRoutingController.this.queryCurrentAudioRouting());
                    return;
                }
                super.onEvent(i, i2);
            } catch (Exception e) {
                Logging.e(AudioRoutingController.TAG, "onEvent: Exception ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class ControllerStartState extends ControllerBaseState {
        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 1;
        }

        public ControllerStartState() {
            super();
            if (AudioRoutingController.this.mDefaultRouting == -1) {
                if (AudioRoutingController.this.mChannelProfile != 0 || !AudioRoutingController.this.isAudioOnly()) {
                    AudioRoutingController.this.mDefaultRouting = 3;
                } else {
                    AudioRoutingController.this.mDefaultRouting = 1;
                }
            }
            AudioRoutingController.this.resetAudioRouting();
            Logging.i(AudioRoutingController.TAG, "Monitor start: default routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mDefaultRouting) + ", current routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mCurrentRouting));
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc.internal.AudioRoutingController.ControllerState
        public void reset() {
            if (AudioRoutingController.this.mDefaultRouting == -1) {
                if (AudioRoutingController.this.mChannelProfile != 0 || !AudioRoutingController.this.isAudioOnly()) {
                    AudioRoutingController.this.mDefaultRouting = 3;
                } else {
                    AudioRoutingController.this.mDefaultRouting = 1;
                }
            }
            AudioRoutingController.this.mOriginRouting = AudioRoutingController.this.mDefaultRouting;
            AudioRoutingController.this.resetAudioRouting();
            Logging.i(AudioRoutingController.TAG, "Monitor reset: default routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mDefaultRouting) + ", current routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mCurrentRouting));
        }

        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc.internal.AudioRoutingController.ControllerState
        public void onEvent(int i, int i2) {
            Logging.d(AudioRoutingController.TAG, "StartState: onEvent: " + i + ", info: " + i2);
            AudioManager audioManager = AudioRoutingController.this.getAudioManager();
            switch (i) {
                case 1:
                    AudioRoutingController.this.mHeadsetType = i2;
                    AudioRoutingController.this.mIsWiredHeadsetPlugged = i2 >= 0;
                    if (AudioRoutingController.this.mPhoneInCall) {
                        return;
                    }
                    if (!AudioRoutingController.this.mIsWiredHeadsetPlugged || AudioRoutingController.this.mCurrentRouting == i2) {
                        if (AudioRoutingController.this.mIsBTHeadsetPlugged) {
                            AudioRoutingController.this.notifyAudioRoutingChanged(5);
                            return;
                        } else {
                            AudioRoutingController.this.resetAudioRouting();
                            return;
                        }
                    }
                    AudioRoutingController.this.mOriginRouting = AudioRoutingController.this.mCurrentRouting;
                    if (AudioRoutingController.this.mIsBTHeadsetPlugged) {
                        AudioRoutingController.this.cancelTimer();
                        AudioRoutingController.this.stopBtSco();
                    }
                    AudioRoutingController.this.doSetAudioOutputRouting(i2);
                    return;
                case 2:
                    if (i2 == 0) {
                        boolean unused = AudioRoutingController.this.mIsBTHeadsetPlugged;
                    }
                    AudioRoutingController.this.mBTHeadSetProperlySeted = false;
                    AudioRoutingController.this.mIsBTHeadsetPlugged = i2 == 1;
                    if (AudioRoutingController.this.mPhoneInCall) {
                        return;
                    }
                    Logging.d(AudioRoutingController.TAG, "BT HEADSET EVENT  " + i2 + " mIsBTHeadsetPlugged " + AudioRoutingController.this.mIsBTHeadsetPlugged);
                    if (AudioRoutingController.this.mIsBTHeadsetPlugged) {
                        AudioRoutingController.this.doSetAudioOutputRouting(5);
                        return;
                    } else if (AudioRoutingController.this.mForceSpeakerphone == 1) {
                        AudioRoutingController.this.doSetAudioOutputRouting(3);
                        return;
                    } else if (AudioRoutingController.this.mForceSpeakerphone == 0) {
                        if (AudioRoutingController.this.mIsWiredHeadsetPlugged) {
                            AudioRoutingController.this.doSetAudioOutputRouting(0);
                            return;
                        } else {
                            AudioRoutingController.this.doSetAudioOutputRouting(1);
                            return;
                        }
                    } else if (AudioRoutingController.this.mIsWiredHeadsetPlugged) {
                        AudioRoutingController.this.doSetAudioOutputRouting(0);
                        return;
                    } else {
                        AudioRoutingController.this.doSetAudioOutputRouting(AudioRoutingController.this.mOriginRouting);
                        return;
                    }
                case 3:
                    AudioRoutingController.this.mBtScoState = i2 == 1 ? 1 : 2;
                    if (AudioRoutingController.this.mPhoneInCall) {
                        return;
                    }
                    AudioRoutingController.this.checkBtScoState(i2 == 1);
                    if (i2 == 0) {
                        AudioRoutingController.this.resetAudioRouting();
                        return;
                    }
                    return;
                case 11:
                    if (AudioRoutingController.this.mIsBTHeadsetPlugged || AudioRoutingController.this.mIsWiredHeadsetPlugged) {
                        return;
                    }
                    if (!AudioRoutingController.this.mPhoneInCall) {
                        if (i2 == 1) {
                            AudioRoutingController.this.doSetAudioOutputRouting(3);
                        } else if (i2 == 0) {
                            AudioRoutingController.this.doSetAudioOutputRouting(1);
                        } else {
                            AudioRoutingController.this.resetAudioRouting();
                        }
                    }
                    AudioRoutingController.this.mOriginRouting = AudioRoutingController.this.mCurrentRouting;
                    return;
                case 16:
                    AudioManager audioManager2 = AudioRoutingController.this.getAudioManager();
                    if (i2 == 0) {
                        if (audioManager2.isBluetoothScoOn()) {
                            AudioRoutingController.this.doStopBTSco(audioManager2);
                            return;
                        }
                        return;
                    } else if (audioManager2.isBluetoothA2dpOn()) {
                        AudioRoutingController.this.doStartBTSco(audioManager2);
                        return;
                    } else {
                        return;
                    }
                case 21:
                    AudioRoutingController.this.mEngineRole = i2;
                    if (AudioRoutingController.this.mPhoneInCall) {
                        return;
                    }
                    AudioRoutingController.this.updateBluetoothSco(AudioRoutingController.this.mCurrentRouting);
                    return;
                case 22:
                    Logging.i(AudioRoutingController.TAG, "phone state changed: " + i2);
                    AudioRoutingController.this.mPhoneInCall = i2 > 0;
                    if (i2 == 0) {
                        AudioRoutingController.this.resetAudioRouting();
                        return;
                    } else {
                        AudioRoutingController.this.mCurrentRouting = -1;
                        return;
                    }
                case 112:
                    if (AudioRoutingController.this.mUsingCommParameters && AudioRoutingController.this.mBTHeadSetProperlySeted) {
                        return;
                    }
                    AudioRoutingController.this.mUsingCommParameters = true;
                    Logging.d(AudioRoutingController.TAG, "BT HEADSET EVENT  " + i2 + " mIsBTHeadsetPlugged " + AudioRoutingController.this.mIsBTHeadsetPlugged);
                    AudioRoutingController.this.mBTHeadSetProperlySeted = true;
                    if (AudioRoutingController.this.mNotifiedRouting == 5) {
                        if (AudioRoutingController.this.mIsBTHeadsetPlugged) {
                            AudioRoutingController.this.startTimer();
                            AudioRoutingController.this.mIsBTScoStarted = true;
                            AudioRoutingController.this.doStartBTSco(audioManager);
                            return;
                        }
                        AudioRoutingController.this.mIsBTScoStarted = false;
                        AudioRoutingController.this.resetAudioRouting();
                        return;
                    }
                    return;
                case 113:
                    if (!AudioRoutingController.this.mUsingCommParameters) {
                        boolean unused2 = AudioRoutingController.this.mBTHeadSetProperlySeted;
                    }
                    AudioRoutingController.this.mBTHeadSetProperlySeted = true;
                    AudioRoutingController.this.mUsingCommParameters = false;
                    if (audioManager.isBluetoothScoOn()) {
                        AudioRoutingController.this.cancelTimer();
                        AudioRoutingController.this.doStopBTSco(audioManager);
                        return;
                    }
                    return;
                default:
                    super.onEvent(i, i2);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class ControllerErrorState extends ControllerBaseState {
        @Override // io.agora.rtc.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 4;
        }

        private ControllerErrorState() {
            super();
        }
    }

    public AudioRoutingController(Context context, AudioRoutingListener audioRoutingListener) {
        this.mContext = new WeakReference<>(context);
        this.mListener = new WeakReference<>(audioRoutingListener);
    }

    public int initialize() {
        Logging.i(TAG, "initialize +");
        Context context = this.mContext.get();
        if (context == null) {
            Logging.e(TAG, "context has been GCed");
            return -1;
        }
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            Logging.e(TAG, "invalid context: can't get AudioManager");
            return -1;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new EventHandler(myLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        if (this.mHeadsetReceiver == null) {
            this.mHeadsetReceiver = new HeadsetBroadcastReceiver();
        }
        this.mIsWiredHeadsetPlugged = audioManager.isWiredHeadsetOn();
        this.mState = changeState(2);
        Logging.i(TAG, "Headset setup: Plugged = " + this.mIsWiredHeadsetPlugged);
        if (!this.mHeadsetReceiver.getRegistered()) {
            context.registerReceiver(this.mHeadsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            this.mHeadsetReceiver.setRegistered(true);
        }
        if (Build.VERSION.SDK_INT < 11 && context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != 0) {
            Logging.w(TAG, "do not support BT monitoring on this device");
            return 0;
        }
        if (this.mBTHeadsetListener != null) {
            Logging.w(TAG, "Bluetooth service Listener already been initialized");
        } else {
            try {
                this.mBTHeadsetListener = new BluetoothProfile.ServiceListener() { // from class: io.agora.rtc.internal.AudioRoutingController.2
                    @Override // android.bluetooth.BluetoothProfile.ServiceListener
                    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                        Logging.i(AudioRoutingController.TAG, "onServiceConnected " + i + " =? headset(1" + CommonConstant.Symbol.BRACKET_RIGHT);
                        if (i == 1) {
                            Logging.i(AudioRoutingController.TAG, "on BT service connected: " + i + StringUtil.SPACE + bluetoothProfile);
                            AudioRoutingController.this.mBTHeadset = (BluetoothHeadset) bluetoothProfile;
                        }
                    }

                    @Override // android.bluetooth.BluetoothProfile.ServiceListener
                    public void onServiceDisconnected(int i) {
                        Logging.i(AudioRoutingController.TAG, "onServiceDisconnected " + i + " =? headset(1" + CommonConstant.Symbol.BRACKET_RIGHT);
                        if (i == 1) {
                            Logging.i(AudioRoutingController.TAG, "on BT service disconnected: " + i);
                            AudioRoutingController.this.cancelTimer();
                            AudioRoutingController.this.mBTHeadset = null;
                        }
                    }
                };
            } catch (Exception e) {
                Logging.e(TAG, "initialize failed: unable to create BluetoothProfile.ServiceListener, err=" + e.getMessage());
            }
        }
        if (!hasPermission(context, "android.permission.BLUETOOTH")) {
            Logging.w(TAG, "lacks BLUETOOTH permission");
            return 0;
        }
        try {
            if (this.mBTHeadsetReceiver == null) {
                this.mBTHeadsetReceiver = new BTHeadsetBroadcastReceiver();
            }
            this.mBTAdapter = BluetoothAdapter.getDefaultAdapter();
        } catch (Exception e2) {
            Logging.e(TAG, "unable to create BluetoothHeadsetBroadcastReceiver, err:" + e2.getMessage());
        }
        if (this.mBTAdapter != null && this.mBTHeadsetListener != null) {
            this.mBTAdapter.getProfileProxy(context, this.mBTHeadsetListener, 1);
            if (2 == this.mBTAdapter.getProfileConnectionState(1)) {
                this.mIsBTHeadsetPlugged = true;
            }
            Logging.i(TAG, "BT headset setup: BTHeadsetPlugged = " + this.mIsBTHeadsetPlugged + StringUtil.SPACE + this.mBTHeadset);
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            if (!this.mBTHeadsetReceiver.getRegistered()) {
                Intent registerReceiver = context.registerReceiver(this.mBTHeadsetReceiver, intentFilter);
                this.mBTHeadsetReceiver.setRegistered(true);
                if (registerReceiver != null && TextUtils.equals(registerReceiver.getAction(), "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    if (f.a(registerReceiver, "android.media.extra.SCO_AUDIO_STATE", 0) == 1) {
                        Logging.i(TAG, "initial Bluetooth SCO device connected");
                        this.mBtScoState = 1;
                    } else {
                        Logging.i(TAG, "initial Bluetooth SCO device unconnected");
                        this.mBtScoState = 3;
                    }
                }
            }
            Logging.i(TAG, "initialize -");
            return 0;
        }
        Logging.e(TAG, "initialize: failed to get bluetooth adapter!!");
        return 0;
    }

    private void clearBTResource() {
        if (this.mBTAdapter != null) {
            this.mBTAdapter.closeProfileProxy(1, this.mBTHeadset);
            this.mBTAdapter = null;
        }
        if (this.mBTHeadsetListener != null) {
            this.mBTHeadsetListener = null;
        }
    }

    public void uninitialize() {
        Logging.d(TAG, "uninitialize");
        try {
            clearBTResource();
            Context context = this.mContext.get();
            if (context != null) {
                if (this.mHeadsetReceiver != null && this.mHeadsetReceiver.getRegistered()) {
                    context.unregisterReceiver(this.mHeadsetReceiver);
                    this.mHeadsetReceiver.setRegistered(false);
                }
                if (this.mBTHeadsetReceiver != null && this.mBTHeadsetReceiver.getRegistered()) {
                    context.unregisterReceiver(this.mBTHeadsetReceiver);
                    this.mBTHeadsetReceiver.setRegistered(false);
                }
            }
            this.mHeadsetReceiver = null;
            this.mBTHeadsetReceiver = null;
        } catch (Exception e) {
            Logging.e(TAG, "AudioRoutingController uninitialize fail: ", e);
        }
    }

    public void startMonitoring(int i, int i2) {
        if (1 == this.mState.getState()) {
            Logging.i(TAG, "state not changed!");
            return;
        }
        this.mDefaultRouting = i;
        this.mChannelProfile = i2;
        this.mOriginRouting = i;
        this.mState.setState(1);
    }

    public void stopMonitoring() {
        this.mState.setState(2);
    }

    public void sendEvent(int i, int i2) {
        Logging.d(TAG, "sendEvent: [" + i + "], extra arg: " + i2 + "... " + this.mEventHandler);
        if (this.mEventHandler != null) {
            this.mEventHandler.sendMessage(this.mEventHandler.obtainMessage(i, i2, 0));
        }
    }

    public void clearListenerNativeHandle() {
        Logging.d(TAG, "clearListenerNativeHandle");
        AudioRoutingListener audioRoutingListener = this.mListener.get();
        if (audioRoutingListener != null) {
            audioRoutingListener.onAudioRoutingDestroyed();
        } else {
            Logging.w(TAG, "failed to get audio routing listener");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioOnly() {
        if (this.mVideoDisabled) {
            return true;
        }
        return this.mMuteLocal && this.mMuteRemotes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioManager getAudioManager() {
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAudioRoutingChanged(int i) {
        AudioRoutingListener audioRoutingListener = this.mListener.get();
        if (audioRoutingListener != null) {
            if (this.mLastNotifiedRouting != i) {
                audioRoutingListener.onAudioRoutingChanged(i);
                this.mLastNotifiedRouting = i;
                return;
            }
            return;
        }
        Logging.w(TAG, "failed to get audio routing listener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int doSetAudioOutputRouting(int i) {
        Logging.i(TAG, "set audio output routing from " + getAudioRouteDesc(this.mCurrentRouting) + " to " + getAudioRouteDesc(i));
        try {
            AudioManager audioManager = getAudioManager();
            if (i != 5) {
                audioManager.setSpeakerphoneOn(false);
                audioManager.setSpeakerphoneOn(i == 3);
            }
            if (queryCurrentAudioRouting() != i) {
                int queryCurrentAudioRouting = queryCurrentAudioRouting();
                Logging.i(TAG, "different audio routing from target " + i + ", actual routing: " + queryCurrentAudioRouting + "[" + getAudioRouteDesc(queryCurrentAudioRouting) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
            updateBluetoothSco(i);
            this.mCurrentRouting = i;
            this.mNotifiedRouting = i;
            notifyAudioRoutingChanged(i);
            Logging.i(TAG, "audio routing changed to " + getAudioRouteDesc(this.mCurrentRouting));
        } catch (Exception e) {
            Logging.e(TAG, "set audio output routing failed:", e);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int updateBluetoothSco(int i) {
        Logging.d(TAG, "updateBluetoothSco sco started: " + this.mIsBTScoStarted + ", audio route target: " + i + "[" + getAudioRouteDesc(i) + "] current: " + this.mCurrentRouting + "[" + getAudioRouteDesc(this.mCurrentRouting) + "], engine role: " + this.mEngineRole + "mUsing  " + this.mUsingCommParameters + " mBTHeadSetProperlySeted " + this.mBTHeadSetProperlySeted);
        if (i == 5) {
            this.mBTHeadSetProperlySeted = false;
        } else {
            this.mBTHeadSetProperlySeted = true;
        }
        this.mNotifiedRouting = i;
        notifyAudioRoutingChanged(i);
        return 0;
    }

    private void startBtSco() {
        AudioManager audioManager = getAudioManager();
        int mode = audioManager.getMode();
        Logging.i(TAG, "try to opening bt sco " + this.mScoConnectionAttemps + StringUtil.SPACE + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
        StringBuilder sb = new StringBuilder("Off call sco support = ");
        sb.append(audioManager.isBluetoothScoAvailableOffCall());
        Logging.d(TAG, sb.toString());
        this.mBtScoState = 0;
        this.mScoConnectionAttemps = this.mScoConnectionAttemps + 1;
        doStartBTSco(audioManager);
    }

    private String modeAsString(int i) {
        switch (i) {
            case 0:
                return "MODE_NORMAL";
            case 1:
                return "MODE_RINGTONE";
            case 2:
                return "MODE_IN_CALL";
            case 3:
                return "MODE_IN_COMMUNICATION";
            default:
                return "Unknown " + i;
        }
    }

    private String btStateAsString(int i) {
        switch (i) {
            case 0:
                return "SCO_CONNECTING";
            case 1:
                return "SCO_CONNECTED";
            case 2:
                return "SCO_DISCONNECTING";
            case 3:
                return "SCO_DISCONNECTED";
            default:
                return "Unknown " + i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartBTSco(AudioManager audioManager) {
        try {
            int mode = audioManager.getMode();
            Logging.i(TAG, "doStartBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn() + StringUtil.SPACE + mode + "[" + modeAsString(mode) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            if (Build.VERSION.SDK_INT < 22) {
                audioManager.setStreamMute(0, true);
            }
            audioManager.setBluetoothScoOn(false);
            audioManager.stopBluetoothSco();
            audioManager.startBluetoothSco();
            audioManager.setBluetoothScoOn(true);
            if (this.mBTHeadset != null) {
                try {
                    try {
                        this.mBTHeadset.getClass().getMethod("connectAudio", new Class[0]).invoke(this.mBTHeadset, new Object[0]);
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                }
            }
        } catch (Exception e4) {
            Logging.e(TAG, "doStartBTSco fail ", e4);
        }
        Logging.d(TAG, "doStartBTSco done sco on: " + audioManager.isBluetoothScoOn() + StringUtil.SPACE + audioManager.getMode() + "[" + modeAsString(audioManager.getMode()) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStopBTSco(AudioManager audioManager) {
        Logging.i(TAG, "doStopBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn());
        audioManager.setBluetoothScoOn(false);
        audioManager.stopBluetoothSco();
        if (this.mBTHeadset != null) {
            try {
                this.mBTHeadset.getClass().getMethod("disconnectAudio", new Class[0]).invoke(this.mBTHeadset, new Object[0]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        int i = Build.VERSION.SDK_INT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBtSco() {
        AudioManager audioManager = getAudioManager();
        int mode = audioManager.getMode();
        Logging.i(TAG, "try to stopping bt sco " + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
        if (!audioManager.isBluetoothScoOn()) {
            this.mBtScoState = 3;
        } else {
            this.mBtScoState = 2;
        }
        doStopBTSco(audioManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkBtScoState(boolean z) {
        this.mScoConnectionAttemps = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bluetoothTimeout() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.AudioRoutingController.bluetoothTimeout():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAudioRouting() {
        int i;
        Logging.i(TAG, "default routing: " + getAudioRouteDesc(this.mDefaultRouting) + " bluetooth " + this.mIsBTHeadsetPlugged + ", current routing: " + getAudioRouteDesc(this.mCurrentRouting) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (this.mForceSpeakerphone == 1) {
            Logging.i(TAG, "reset(force) audio routing, default routing: " + getAudioRouteDesc(this.mDefaultRouting) + ", current routing: " + getAudioRouteDesc(this.mCurrentRouting) + ", target routing: " + getAudioRouteDesc(3) + ", actual system routing:" + getAudioRouteDesc(queryCurrentAudioRouting()));
            if (this.mCurrentRouting == 3 && queryCurrentAudioRouting() == 3) {
                return;
            }
            doSetAudioOutputRouting(3);
            return;
        }
        int queryCurrentAudioRouting = queryCurrentAudioRouting();
        if (queryCurrentAudioRouting == 0 || queryCurrentAudioRouting == 2) {
            this.mIsWiredHeadsetPlugged = true;
        }
        if (this.mIsBTHeadsetPlugged) {
            i = 5;
        } else if (this.mIsWiredHeadsetPlugged) {
            i = this.mHeadsetType;
        } else {
            i = this.mOriginRouting;
        }
        Logging.i(TAG, "reset audio routing, default routing: " + getAudioRouteDesc(this.mDefaultRouting) + ", current routing: " + getAudioRouteDesc(this.mCurrentRouting) + ", target routing: " + getAudioRouteDesc(i) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (this.mCurrentRouting == i && queryCurrentAudioRouting() == this.mCurrentRouting) {
            return;
        }
        doSetAudioOutputRouting(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int queryCurrentAudioRouting() {
        AudioManager audioManager = getAudioManager();
        if (this.mBTAdapter == null) {
            this.mBTAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        try {
            if (audioManager.isSpeakerphoneOn()) {
                return 3;
            }
            if ((audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) && this.mBTAdapter.isEnabled()) {
                return 5;
            }
            return audioManager.isWiredHeadsetOn() ? 0 : 1;
        } catch (Exception e) {
            Logging.e(TAG, "fatal error @queryCurrentAudioRouting", e);
            return -1;
        }
    }

    protected boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
