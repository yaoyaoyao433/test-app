package com.speech.vadsdk.wakeup;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.ai.speech.base.environment.IBaseEnvironment;
import com.meituan.ai.speech.base.environment.IWakeUpEnvironment;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.sdk.ISpeechRecognizer;
import com.speech.vadsdk.custom.CustomWakeUpCallback;
import com.speech.vadsdk.processor.VadConfig;
import java.lang.reflect.Method;
import java.util.UUID;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class WakeUpManager {
    private static volatile WakeUpManager instance;
    private WakeUpAudioHelper mAudioHelper;
    private Context mContext;
    private CustomWakeUpCallback mCustomWakeUpCallback;
    private WakeUpRecordHelper mRecordHelper;
    private String mSessionId = "";
    private ISpeechRecognizer mSpeechRecognizer;
    private IBaseEnvironment mWakeUpEnvironment;
    private WakeUpProcessor mWakeUpProcessor;

    private WakeUpManager() {
    }

    public static WakeUpManager getInstance() {
        if (instance == null) {
            synchronized (WakeUpManager.class) {
                if (instance == null) {
                    instance = new WakeUpManager();
                }
            }
        }
        return instance;
    }

    public void init(Context context, IWakeUpEnvironment iWakeUpEnvironment) {
        if (context == null || this.mContext != null || iWakeUpEnvironment == null) {
            return;
        }
        this.mContext = context.getApplicationContext();
        com.speech.vadsdk.log.b.a(iWakeUpEnvironment.getAppKey(), iWakeUpEnvironment.getSecretKey());
        this.mWakeUpEnvironment = iWakeUpEnvironment;
        this.mCustomWakeUpCallback = new CustomWakeUpCallback();
        this.mWakeUpProcessor = new WakeUpProcessor(this.mContext, iWakeUpEnvironment.getAppKey());
        this.mRecordHelper = new WakeUpRecordHelper(this.mContext, this.mCustomWakeUpCallback);
        initSpeechRecognizer(this.mContext);
    }

    private void initSpeechRecognizer(Context context) {
        try {
            Class<?> cls = Class.forName("com.meituan.ai.speech.sdk.helper.BuildRecognizerHelper");
            Method declaredMethod = cls.getDeclaredMethod("buildSpeechRecognizer", Context.class, IBaseEnvironment.class);
            declaredMethod.setAccessible(true);
            this.mSpeechRecognizer = (ISpeechRecognizer) declaredMethod.invoke(cls.newInstance(), context.getApplicationContext(), this.mWakeUpEnvironment);
        } catch (Exception e) {
            CustomWakeUpCallback customWakeUpCallback = this.mCustomWakeUpCallback;
            int i = b.e.a;
            customWakeUpCallback.onFailed("", i, "识别服务初始化失败：" + e.getMessage());
        }
    }

    public void destroy() {
        instance = null;
    }

    public boolean startListening(String str, String str2, WakeUpConfig wakeUpConfig, WakeUpAndAsrListener wakeUpAndAsrListener) {
        if (checkListeningParams(str, str2, wakeUpConfig, wakeUpAndAsrListener)) {
            AsrConfig asrConfig = new AsrConfig();
            VadConfig vadConfig = new VadConfig();
            vadConfig.setStartTipTime(1000);
            vadConfig.setEndTipTime(2000);
            vadConfig.setStopModel(4);
            return startWakeup(str, str2, wakeUpConfig, asrConfig, vadConfig);
        }
        return false;
    }

    public boolean startListening(String str, String str2, WakeUpConfig wakeUpConfig, AsrConfig asrConfig, VadConfig vadConfig, WakeUpAndAsrListener wakeUpAndAsrListener) {
        if (checkListeningParams(str, str2, wakeUpConfig, wakeUpAndAsrListener)) {
            if (asrConfig == null) {
                callbackFail(str2, b.b);
                return false;
            } else if (vadConfig == null) {
                callbackFail(str2, b.c);
                return false;
            } else {
                if (vadConfig.getStopModel() == 3) {
                    vadConfig.setStopModel(4);
                }
                return startWakeup(str, str2, wakeUpConfig, asrConfig, vadConfig);
            }
        }
        return false;
    }

    private boolean checkListeningParams(String str, String str2, WakeUpConfig wakeUpConfig, WakeUpAndAsrListener wakeUpAndAsrListener) {
        if (wakeUpAndAsrListener == null) {
            return false;
        }
        if (this.mCustomWakeUpCallback == null) {
            wakeUpAndAsrListener.onFailed(str2, b.d.a, b.d.b);
            return false;
        }
        this.mCustomWakeUpCallback.setWakeUpRecordListener(wakeUpAndAsrListener);
        if (this.mRecordHelper == null || this.mWakeUpEnvironment == null) {
            callbackFail(str2, b.d);
            return false;
        } else if (this.mWakeUpProcessor == null || this.mWakeUpProcessor.checkEngineIsNull()) {
            callbackFail(str2, b.n);
            return false;
        } else if (this.mSpeechRecognizer == null) {
            callbackFail(str2, b.e);
            return false;
        } else if (wakeUpConfig == null) {
            callbackFail(str2, b.f);
            return false;
        } else if (TextUtils.isEmpty(str) || !str.equals(this.mWakeUpEnvironment.getAppKey())) {
            CustomWakeUpCallback customWakeUpCallback = this.mCustomWakeUpCallback;
            int i = b.g.a;
            customWakeUpCallback.onFailed(str2, i, b.g.b + "， appKey");
            return false;
        } else if (TextUtils.isEmpty(wakeUpConfig.getPrivacySceneToken())) {
            CustomWakeUpCallback customWakeUpCallback2 = this.mCustomWakeUpCallback;
            int i2 = b.g.a;
            customWakeUpCallback2.onFailed(str2, i2, b.g.b + "， privacySceneToken");
            return false;
        } else {
            return true;
        }
    }

    private boolean startWakeup(String str, String str2, WakeUpConfig wakeUpConfig, AsrConfig asrConfig, VadConfig vadConfig) {
        if (wakeUpConfig.getType() == 2 && !wakeUpConfig.getKeepAlive()) {
            callbackFail(str2, b.j);
            return false;
        } else if (wakeUpConfig.getWakeUpThreshold() <= 0.0f || wakeUpConfig.getWakeUpThreshold() > 1.0f) {
            callbackFail(str2, b.o);
            return false;
        } else {
            String uuid = TextUtils.isEmpty(str2) ? this.mWakeUpEnvironment.getUUID() : str2;
            if (TextUtils.isEmpty(uuid)) {
                uuid = UUID.randomUUID().toString();
            }
            this.mSessionId = uuid + "__" + System.currentTimeMillis();
            com.speech.vadsdk.log.b.a(str, this.mSessionId, str2);
            return this.mRecordHelper.startWakeupAndAsr(str, this.mSessionId, this.mSpeechRecognizer, wakeUpConfig, asrConfig, vadConfig);
        }
    }

    private void callbackFail(String str, a aVar) {
        this.mCustomWakeUpCallback.onFailed(str, aVar.a, aVar.b);
    }

    public void stopListening() {
        com.speech.vadsdk.log.b.b(this.mWakeUpEnvironment == null ? "" : this.mWakeUpEnvironment.getAppKey(), this.mSessionId);
        if (this.mRecordHelper != null) {
            this.mRecordHelper.stopRecord();
        }
    }

    public boolean isListening() {
        if (this.mRecordHelper != null) {
            return this.mRecordHelper.isListening();
        }
        return false;
    }

    public void initAudioHelper(Context context, String str, float f, WakeUpProcessListener wakeUpProcessListener) {
        if (f > 1.0f || f <= 0.0f) {
            return;
        }
        this.mAudioHelper = new WakeUpAudioHelper(context);
        this.mAudioHelper.initWakeUpInterface(str, wakeUpProcessListener);
        this.mAudioHelper.setThreshold(f);
    }

    public void processWakeUpAudioData(short[] sArr) {
        if (this.mAudioHelper == null || sArr == null) {
            return;
        }
        this.mAudioHelper.processWakeUpAudioData(sArr);
    }

    public void stopProcessWakeUpAudioData() {
        if (this.mAudioHelper != null) {
            this.mAudioHelper.stopProcessWakeUpAudioData();
        }
    }

    public IBaseEnvironment getWakeUpEnvironment() {
        return this.mWakeUpEnvironment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WakeUpProcessor getWakeUpProcessor() {
        return this.mWakeUpProcessor;
    }
}
