package com.meituan.ai.speech.sdk.knb;

import android.content.Context;
import android.media.AudioRecord;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.google.gson.Gson;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.privacy.PrivacySceneUtils;
import com.meituan.ai.speech.sdk.SpeechRecognizer;
import com.meituan.ai.speech.sdk.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class JsAsrSettings {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static JsAsrSettings instance = new JsAsrSettings();
    public String appKey;
    public HashMap<String, List<Short>> audioDatas;
    public String audioId;
    public boolean isInit;
    public AtomicBoolean isRecording;
    public String privacySceneToken;
    public int recBufSize;

    public JsAsrSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66dbc534546c05a4c541d57d1dd158e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66dbc534546c05a4c541d57d1dd158e2");
            return;
        }
        this.recBufSize = 0;
        this.isInit = false;
        this.isRecording = new AtomicBoolean();
        this.appKey = "";
        this.privacySceneToken = "";
        this.audioId = "";
        this.audioDatas = new HashMap<>();
    }

    public boolean startRecord(DelegatedJsHandler delegatedJsHandler) {
        Object[] objArr = {delegatedJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "491c782b91222460e63cdf2cf54f51b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "491c782b91222460e63cdf2cf54f51b6")).booleanValue();
        }
        if (this.isInit && this.isRecording.get()) {
            try {
                this.recBufSize = AudioRecord.getMinBufferSize(16000, 16, 2);
                PrivacySceneUtils.INSTANCE.createMtAudioRecord(this.privacySceneToken, 1, 16000, 16, 2, this.recBufSize);
            } catch (Exception unused) {
            }
            if (!PrivacySceneUtils.INSTANCE.checkInitMtAudioRecord()) {
                asrFailEvent(delegatedJsHandler, -106, "AudioRecord没有成功初始化");
                return false;
            }
            try {
                PrivacySceneUtils.INSTANCE.startMtAudioRecord();
                return true;
            } catch (Exception unused2) {
                asrFailEvent(delegatedJsHandler, JsErrorCode.AUDIO_RECORD_START_FAILED, "开始录音失败");
                return false;
            }
        }
        return false;
    }

    public void readRecordData(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f02ad394eaf541dc5d31e7480101733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f02ad394eaf541dc5d31e7480101733");
            return;
        }
        while (this.isRecording.get()) {
            short[] sArr = new short[this.recBufSize];
            int readMtAudioRecord = PrivacySceneUtils.INSTANCE.readMtAudioRecord(sArr, 0, this.recBufSize);
            synchronized (sArr) {
                if (-3 != readMtAudioRecord) {
                    try {
                        Short[] shArr = new Short[readMtAudioRecord];
                        for (int i2 = 0; i2 < readMtAudioRecord; i2++) {
                            shArr[i2] = Short.valueOf(sArr[i2]);
                        }
                        if (i == 1) {
                            saveAudioDatas(this.audioId, sArr);
                        }
                        SpeechRecognizer.instance.recognize(context, shArr);
                    } finally {
                    }
                }
            }
        }
    }

    public void stopRecordAndAsr(final BaseJsHandler baseJsHandler, boolean z, boolean z2) {
        Object[] objArr = {baseJsHandler, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb473d73c7fbdb01247383d9a76fda6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb473d73c7fbdb01247383d9a76fda6a");
        } else if (this.isRecording.get()) {
            try {
                stopRecord();
                baseJsHandler.jsHost().getActivity().getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.meituan.ai.speech.sdk.knb.JsAsrSettings.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f21205387ce572791c2f8948c5eae97e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f21205387ce572791c2f8948c5eae97e");
                        } else {
                            SpeechRecognizer.instance.end(baseJsHandler.jsHost().getContext().getApplicationContext());
                        }
                    }
                }, 100L);
                if (z) {
                    stopSuccessEvent(baseJsHandler);
                } else {
                    stopAutoEvent(baseJsHandler, z2);
                }
            } catch (Exception e) {
                stopFailEvent(baseJsHandler, -1, e.getMessage());
            }
        } else {
            stopFailEvent(baseJsHandler, -102, "failed");
        }
    }

    private void stopRecord() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7705d5ea82036627ba82aafb3e06edef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7705d5ea82036627ba82aafb3e06edef");
            return;
        }
        this.isRecording.set(false);
        try {
            if (PrivacySceneUtils.INSTANCE.checkInitMtAudioRecord()) {
                PrivacySceneUtils.INSTANCE.stopMtAudioRecord();
                PrivacySceneUtils.INSTANCE.releaseMtAudioRecord();
            }
        } catch (Exception e) {
            String str = this.appKey;
            String str2 = this.audioId;
            a.d(str, str2, JsErrorCode.AUDIO_RECORD_STOP_FAILED, "停止录音失败-" + e.getMessage());
        }
    }

    private void saveAudioDatas(String str, short[] sArr) {
        Object[] objArr = {str, sArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c6f9f079c067b3552623860c9cc12d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c6f9f079c067b3552623860c9cc12d0");
        } else if (sArr != null && !TextUtils.isEmpty(str)) {
            List<Short> list = this.audioDatas.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.audioDatas.put(str, list);
            }
            for (short s : sArr) {
                list.add(Short.valueOf(s));
            }
        }
    }

    public void callInitEvent(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a58e7f5823b8e8126bf4953bf99b0162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a58e7f5823b8e8126bf4953bf99b0162");
        } else {
            a.e(str, str2);
        }
    }

    public void initSuccessEvent(BaseJsHandler baseJsHandler, String str) {
        Object[] objArr = {baseJsHandler, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df90ea54fbfa53e28bcb6b31189dfc69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df90ea54fbfa53e28bcb6b31189dfc69");
            return;
        }
        JsResult jsResult = new JsResult();
        jsResult.errorCode = 1;
        jsResult.errorMsg = "success";
        jsResult.setData("init finish");
        baseJsHandler.jsCallback(new Gson().toJson(jsResult));
        a.a(str);
    }

    public void initFailEvent(BaseJsHandler baseJsHandler, String str, int i, String str2) {
        Object[] objArr = {baseJsHandler, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ef796b216eeb6abcba171b86ea0a53e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ef796b216eeb6abcba171b86ea0a53e");
            return;
        }
        baseJsHandler.jsCallbackError(i, str2);
        a.a(str, i, str2);
    }

    public void callStartEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b06eb0f7663f31fdfbf9b2db2605b2ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b06eb0f7663f31fdfbf9b2db2605b2ae");
        } else {
            a.f(this.appKey, this.audioId);
        }
    }

    public void startSuccessEvent(DelegatedJsHandler delegatedJsHandler, int i, int i2, int i3, int i4, int i5, boolean z, int i6, String str, int i7, boolean z2, boolean z3) {
        Object[] objArr = {delegatedJsHandler, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i6), str, Integer.valueOf(i7), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b433b319ab564a6731bfd53b49f81576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b433b319ab564a6731bfd53b49f81576");
            return;
        }
        JsResult jsResult = new JsResult();
        jsResult.errorCode = 1;
        jsResult.errorMsg = "success";
        jsResult.setData("Start recognize!");
        delegatedJsHandler.successCallback(jsResult);
        a.a(this.appKey, this.audioId, i, i2, i3, i4, i5, z, i6, str, i7, z2, z3);
    }

    public void startFailEvent(DelegatedJsHandler delegatedJsHandler, int i, String str) {
        Object[] objArr = {delegatedJsHandler, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "670adfebeab54024296e3758199e163a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "670adfebeab54024296e3758199e163a");
            return;
        }
        JsResult jsResult = new JsResult();
        jsResult.errorCode = i;
        jsResult.errorMsg = "failed";
        jsResult.setData(str);
        delegatedJsHandler.failCallback(jsResult);
        a.b(this.appKey, this.audioId, i, str);
    }

    public void startParamFailEvent(DelegatedJsHandler delegatedJsHandler, int i, String str) {
        Object[] objArr = {delegatedJsHandler, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21e13675671104bd6f91894e768fe598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21e13675671104bd6f91894e768fe598");
            return;
        }
        delegatedJsHandler.jsCallbackError(i, str);
        a.b(this.appKey, this.audioId, i, str);
    }

    public void startDestroyEvent(DelegatedJsHandler delegatedJsHandler) {
        Object[] objArr = {delegatedJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "578e26087cac1a7cc39723634af79045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "578e26087cac1a7cc39723634af79045");
            return;
        }
        JsResult jsResult = new JsResult();
        jsResult.errorCode = 7;
        jsResult.errorMsg = "success";
        jsResult.setData("start onDestroy");
        delegatedJsHandler.successCallback(jsResult);
        a.l(this.appKey, this.audioId);
    }

    public void callStopEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3187a93e688a24a8f3170d89d882f2c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3187a93e688a24a8f3170d89d882f2c2");
        } else {
            a.g(this.appKey, this.audioId);
        }
    }

    public void stopSuccessEvent(BaseJsHandler baseJsHandler) {
        Object[] objArr = {baseJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ce9e5110cd743859fcc743dfc332d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ce9e5110cd743859fcc743dfc332d88");
            return;
        }
        JsResult jsResult = new JsResult();
        jsResult.errorCode = 1;
        jsResult.errorMsg = "success";
        jsResult.setData("stop finish");
        baseJsHandler.jsCallback(new Gson().toJson(jsResult));
        a.h(this.appKey, this.audioId);
    }

    public void stopAutoEvent(BaseJsHandler baseJsHandler, boolean z) {
        Object[] objArr = {baseJsHandler, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55f115043c5d020af93e37e3d0719d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55f115043c5d020af93e37e3d0719d88");
            return;
        }
        JsResult jsResult = new JsResult();
        if (z) {
            jsResult.errorCode = 5;
        } else {
            jsResult.errorCode = 6;
        }
        jsResult.errorMsg = "success";
        jsResult.setData("stop finish");
        baseJsHandler.jsCallback(new Gson().toJson(jsResult));
        a.h(this.appKey, this.audioId);
        if (z) {
            a.j(this.appKey, this.audioId);
        } else {
            a.k(this.appKey, this.audioId);
        }
    }

    public void stopFailEvent(BaseJsHandler baseJsHandler, int i, String str) {
        Object[] objArr = {baseJsHandler, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c6124083cc87a2e3ad5fd83022f3186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c6124083cc87a2e3ad5fd83022f3186");
            return;
        }
        baseJsHandler.jsCallbackError(i, str);
        a.c(this.appKey, this.audioId, i, str);
    }

    public void receiveResultEvent(RecogResult recogResult) {
        int i;
        int i2;
        Object[] objArr = {recogResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d5514af0816e017f51c30f61d1aeb1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d5514af0816e017f51c30f61d1aeb1c");
            return;
        }
        if (recogResult.getVad_info() == null || recogResult.getVad_info().length <= 0) {
            i = 0;
            i2 = 0;
        } else {
            i = recogResult.getVad_info()[0].getStart();
            i2 = recogResult.getVad_info()[0].getEnd();
        }
        a.b(this.appKey, this.audioId, recogResult.getRes_index(), i, i2, recogResult.getSpeech_time(), recogResult.getText() == null ? "" : recogResult.getText());
    }

    public void asrFailEvent(DelegatedJsHandler delegatedJsHandler, int i, String str) {
        Object[] objArr = {delegatedJsHandler, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "292b16149acf1b404cffa6d8eb7257eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "292b16149acf1b404cffa6d8eb7257eb");
            return;
        }
        JsResult jsResult = new JsResult();
        jsResult.errorCode = i;
        jsResult.errorMsg = str;
        jsResult.setData(this.audioId);
        delegatedJsHandler.failCallback(jsResult);
        a.d(this.appKey, this.audioId, i, str);
    }

    public void recordOvertimeEvent(DelegatedJsHandler delegatedJsHandler) {
        Object[] objArr = {delegatedJsHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5fe91e624dfaa315ef1ee1f93690ade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5fe91e624dfaa315ef1ee1f93690ade");
            return;
        }
        JsResult jsResult = new JsResult();
        jsResult.errorCode = 4;
        jsResult.errorMsg = "success";
        delegatedJsHandler.actionCallback(jsResult);
        a.i(this.appKey, this.audioId);
    }
}
