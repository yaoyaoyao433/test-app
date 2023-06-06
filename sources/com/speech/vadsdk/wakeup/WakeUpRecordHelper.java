package com.speech.vadsdk.wakeup;

import android.content.Context;
import android.media.AudioRecord;
import android.support.annotation.Keep;
import android.util.Log;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.privacy.PrivacySceneUtils;
import com.meituan.ai.speech.base.processor.callback.IVadCallback;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.sdk.ISpeechRecognizer;
import com.meituan.ai.speech.base.sdk.RecogCallback;
import com.meituan.ai.speech.base.utils.JavaUtils;
import com.meituan.ai.speech.base.utils.VoiceUtilsKt;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.robust.common.CommonConstant;
import com.speech.vadsdk.custom.CustomWakeUpCallback;
import com.speech.vadsdk.processor.VadConfig;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013*\u0002!$\b\u0001\u0018\u0000 E2\u00020\u0001:\u0003EFGB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010/\u001a\u00020.H\u0007J\u0010\u00100\u001a\u00020.2\u0006\u00101\u001a\u000202H\u0002J\u0018\u00103\u001a\u00020.2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u001dH\u0002J\u0006\u0010\u0018\u001a\u00020\u0016J\b\u00107\u001a\u00020\u0016H\u0002J\b\u00108\u001a\u00020.H\u0002J(\u00109\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u000205H\u0002J0\u0010<\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u0002052\u0006\u00106\u001a\u00020\u001dH\u0002J\u0010\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0012H\u0003J(\u0010?\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u00106\u001a\u00020\u001dH\u0002J6\u0010@\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010A\u001a\u00020*2\u0006\u0010>\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u0014J\b\u0010D\u001a\u00020.H\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\r0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u000e\u0010&\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0016X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n \f*\u0004\u0018\u00010,0,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpRecordHelper;", "", "context", "Landroid/content/Context;", "customWakeUpCallback", "Lcom/speech/vadsdk/custom/CustomWakeUpCallback;", "(Landroid/content/Context;Lcom/speech/vadsdk/custom/CustomWakeUpCallback;)V", "appKey", "", "audioData", "", "", "kotlin.jvm.PlatformType", "", "audioSessionId", "currentAsrConfig", "Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "currentConfig", "Lcom/speech/vadsdk/wakeup/WakeUpConfig;", "currentVadConfig", "Lcom/speech/vadsdk/processor/VadConfig;", "isHasAudioPermission", "", "isHasStartRecognize", "isListening", "isRecognizing", "isStopped", "isUpload", "keywordWakeupType", "", "mContext", "mCustomWakeUpCallback", "mSaveFileProcessor", "com/speech/vadsdk/wakeup/WakeUpRecordHelper$mSaveFileProcessor$1", "Lcom/speech/vadsdk/wakeup/WakeUpRecordHelper$mSaveFileProcessor$1;", "mWakeUpListener", "com/speech/vadsdk/wakeup/WakeUpRecordHelper$mWakeUpListener$1", "Lcom/speech/vadsdk/wakeup/WakeUpRecordHelper$mWakeUpListener$1;", "readsize", "recBufSize", "shouldUploadWakeupAudioData", "speechRecognizer", "Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "threadPool", "Ljava/util/concurrent/ScheduledExecutorService;", "closeRecognize", "", "destroy", "handleWakeUpAudioData", "audio", "", "handleWakeUpResult", "result", "Lcom/speech/vadsdk/wakeup/WakeUpResult;", "wakeupTimes", "isRecording", "reset", "startNewRecognizer", "sessionId", "wakeupResult", "startRecognizer", "startRecord", "wakeUpConfig", "startUpload", "startWakeupAndAsr", "recognizer", "asrConfig", "vadConfig", "stopRecord", "Companion", "ISaveFileProcessor", "WakeUpTask", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class WakeUpRecordHelper {
    public static final a Companion = new a(null);
    @NotNull
    public static final String TAG = "WakeUpRecordHelper";
    private String appKey;
    private List<Short> audioData;
    private String audioSessionId;
    private AsrConfig currentAsrConfig;
    private WakeUpConfig currentConfig;
    private VadConfig currentVadConfig;
    private boolean isHasAudioPermission;
    private boolean isHasStartRecognize;
    private boolean isListening;
    private boolean isRecognizing;
    private boolean isStopped;
    private boolean isUpload;
    private int keywordWakeupType;
    private Context mContext;
    private CustomWakeUpCallback mCustomWakeUpCallback;
    private final c mSaveFileProcessor;
    private final d mWakeUpListener;
    private int readsize;
    private int recBufSize;
    private final boolean shouldUploadWakeupAudioData;
    private ISpeechRecognizer speechRecognizer;
    private final ScheduledExecutorService threadPool;

    public WakeUpRecordHelper(@NotNull Context context, @NotNull CustomWakeUpCallback customWakeUpCallback) {
        kotlin.jvm.internal.h.b(context, "context");
        kotlin.jvm.internal.h.b(customWakeUpCallback, "customWakeUpCallback");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.a((Object) applicationContext, "context.applicationContext");
        this.mContext = applicationContext;
        this.mCustomWakeUpCallback = customWakeUpCallback;
        this.threadPool = com.sankuai.android.jarvis.c.c("SpeechVad-wakeupRecord");
        this.audioData = Collections.synchronizedList(new LinkedList());
        this.audioSessionId = "";
        this.appKey = "";
        this.isStopped = true;
        this.keywordWakeupType = 1;
        this.shouldUploadWakeupAudioData = true;
        this.mWakeUpListener = new d();
        this.mSaveFileProcessor = new c();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpRecordHelper$Companion;", "", "()V", "TAG", "", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public final boolean startWakeupAndAsr(@NotNull String str, @NotNull String str2, @NotNull ISpeechRecognizer iSpeechRecognizer, @NotNull WakeUpConfig wakeUpConfig, @NotNull AsrConfig asrConfig, @NotNull VadConfig vadConfig) {
        File file;
        kotlin.jvm.internal.h.b(str, "appKey");
        kotlin.jvm.internal.h.b(str2, "sessionId");
        kotlin.jvm.internal.h.b(iSpeechRecognizer, "recognizer");
        kotlin.jvm.internal.h.b(wakeUpConfig, "wakeUpConfig");
        kotlin.jvm.internal.h.b(asrConfig, "asrConfig");
        kotlin.jvm.internal.h.b(vadConfig, "vadConfig");
        StringBuilder sb = new StringBuilder("startWakeupAndAsr~~isListening=");
        sb.append(this.isListening);
        sb.append(", sessionId=");
        sb.append(str2);
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(TAG);
            sb2.append(']');
        }
        int checkRecordPermission = PrivacySceneUtils.INSTANCE.checkRecordPermission(this.mContext, wakeUpConfig.getPrivacySceneToken());
        if (checkRecordPermission <= 0) {
            this.isHasAudioPermission = false;
            CustomWakeUpCallback customWakeUpCallback = this.mCustomWakeUpCallback;
            int i = com.speech.vadsdk.wakeup.b.l.a;
            customWakeUpCallback.onFailed(str2, i, com.speech.vadsdk.wakeup.b.l.b + "-权限code=" + checkRecordPermission);
            return false;
        }
        this.isHasAudioPermission = true;
        if (this.isListening) {
            this.mCustomWakeUpCallback.onFailed(str2, com.speech.vadsdk.wakeup.b.i.a, com.speech.vadsdk.wakeup.b.i.b);
            return false;
        }
        this.isListening = true;
        this.appKey = str;
        this.audioSessionId = str2;
        this.currentConfig = wakeUpConfig;
        this.currentAsrConfig = asrConfig;
        this.currentVadConfig = vadConfig;
        this.speechRecognizer = iSpeechRecognizer;
        WakeUpManager wakeUpManager = WakeUpManager.getInstance();
        kotlin.jvm.internal.h.a((Object) wakeUpManager, "WakeUpManager.getInstance()");
        wakeUpManager.getWakeUpProcessor().setListener(wakeUpConfig.getType(), new h());
        WakeUpManager wakeUpManager2 = WakeUpManager.getInstance();
        kotlin.jvm.internal.h.a((Object) wakeUpManager2, "WakeUpManager.getInstance()");
        int wakeUpThreshold = wakeUpManager2.getWakeUpProcessor().setWakeUpThreshold(wakeUpConfig.getWakeUpThreshold());
        if (wakeUpThreshold < 0) {
            this.mCustomWakeUpCallback.onFailed(this.audioSessionId, wakeUpThreshold, "设置唤醒值错误");
            this.isListening = false;
            return false;
        }
        c cVar = this.mSaveFileProcessor;
        kotlin.jvm.internal.h.b(this.mContext, "context");
        kotlin.jvm.internal.h.b(str2, QuickReportConstants.CONFIG_FILE_NAME);
        if (cVar.a) {
            cVar.c = new File(cVar.b);
            File file2 = cVar.c;
            if (file2 == null) {
                kotlin.jvm.internal.h.a();
            }
            if (!file2.exists() && (file = cVar.c) != null) {
                file.mkdir();
            }
            cVar.d = str2 + ".pcm";
            cVar.e.clear();
        }
        if (startRecord(wakeUpConfig)) {
            return true;
        }
        this.isListening = false;
        return false;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/speech/vadsdk/wakeup/WakeUpRecordHelper$startWakeupAndAsr$1", "Lcom/speech/vadsdk/wakeup/WakeUpProcessListener;", "onProcessFailed", "", "code", "", "message", "", "onProcessWakeUp", "result", "Lcom/speech/vadsdk/wakeup/WakeUpResult;", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class h implements WakeUpProcessListener {
        h() {
        }

        @Override // com.speech.vadsdk.wakeup.WakeUpProcessListener
        public final void onProcessFailed(int i, @NotNull String str) {
            kotlin.jvm.internal.h.b(str, "message");
            d dVar = WakeUpRecordHelper.this.mWakeUpListener;
            String str2 = WakeUpRecordHelper.this.audioSessionId;
            dVar.onFailed(str2, i, "引擎_" + str);
        }

        @Override // com.speech.vadsdk.wakeup.WakeUpProcessListener
        public final void onProcessWakeUp(@NotNull WakeUpResult wakeUpResult) {
            kotlin.jvm.internal.h.b(wakeUpResult, "result");
            WakeUpRecordHelper.this.mWakeUpListener.onResult(wakeUpResult);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpRecordHelper$WakeUpTask;", "Ljava/lang/Runnable;", "recBufSize", "", "(Lcom/speech/vadsdk/wakeup/WakeUpRecordHelper;I)V", "run", "", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public final class b implements Runnable {
        private final int b;

        public b(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StackTraceElement[] stackTrace;
            if (!PrivacySceneUtils.INSTANCE.checkInitMtAudioRecord()) {
                WakeUpRecordHelper.this.mWakeUpListener.onFailed(WakeUpRecordHelper.this.audioSessionId, com.speech.vadsdk.wakeup.b.k.a, com.speech.vadsdk.wakeup.b.k.b + ", AudioRecord is not init");
                WakeUpRecordHelper.this.isListening = false;
                return;
            }
            WakeUpRecordHelper.this.mWakeUpListener.onStart();
            try {
                short[] sArr = new short[this.b];
                PrivacySceneUtils.INSTANCE.startMtAudioRecord();
                WakeUpRecordHelper.this.isStopped = false;
                do {
                    WakeUpRecordHelper.this.readsize = PrivacySceneUtils.INSTANCE.readMtAudioRecord(sArr, 0, this.b);
                    if (-3 != WakeUpRecordHelper.this.readsize) {
                        short[] sArr2 = new short[WakeUpRecordHelper.this.readsize];
                        int i = WakeUpRecordHelper.this.readsize;
                        for (int i2 = 0; i2 < i; i2++) {
                            sArr2[i2] = sArr[i2];
                        }
                        WakeUpRecordHelper.this.mWakeUpListener.onAudioData(sArr2);
                        WakeUpManager wakeUpManager = WakeUpManager.getInstance();
                        kotlin.jvm.internal.h.a((Object) wakeUpManager, "WakeUpManager.getInstance()");
                        WakeUpProcessor wakeUpProcessor = wakeUpManager.getWakeUpProcessor();
                        WakeUpConfig wakeUpConfig = WakeUpRecordHelper.this.currentConfig;
                        if (wakeUpConfig == null) {
                            kotlin.jvm.internal.h.a();
                        }
                        int process = wakeUpProcessor.process(sArr2, wakeUpConfig.getFrequency());
                        if (process < 0) {
                            WakeUpRecordHelper.this.mWakeUpListener.onFailed(WakeUpRecordHelper.this.audioSessionId, process, "engine wakeup error");
                            WakeUpRecordHelper.this.stopRecord();
                        }
                    }
                    if (WakeUpRecordHelper.this.isStopped) {
                        try {
                            WakeUpManager wakeUpManager2 = WakeUpManager.getInstance();
                            kotlin.jvm.internal.h.a((Object) wakeUpManager2, "WakeUpManager.getInstance()");
                            wakeUpManager2.getWakeUpProcessor().reset();
                            if (WakeUpRecordHelper.this.isHasAudioPermission && PrivacySceneUtils.INSTANCE.checkInitMtAudioRecord()) {
                                PrivacySceneUtils.INSTANCE.stopMtAudioRecord();
                                PrivacySceneUtils.INSTANCE.releaseMtAudioRecord();
                            }
                            StringBuilder sb = new StringBuilder("stopped isRecognizing=");
                            sb.append(WakeUpRecordHelper.this.isRecognizing);
                            sb.append(", isListening=");
                            sb.append(WakeUpRecordHelper.this.isListening());
                            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                                StringBuilder sb2 = new StringBuilder("[");
                                sb2.append(WakeUpRecordHelper.TAG);
                                sb2.append(']');
                            }
                            if (WakeUpRecordHelper.this.isRecognizing) {
                                WakeUpRecordHelper.this.closeRecognize(WakeUpRecordHelper.this.mContext);
                            }
                            WakeUpRecordHelper.this.reset();
                            WakeUpRecordHelper.this.mWakeUpListener.onComplete();
                            return;
                        } catch (Exception e) {
                            WakeUpRecordHelper.this.isListening = false;
                            d dVar = WakeUpRecordHelper.this.mWakeUpListener;
                            String str = WakeUpRecordHelper.this.audioSessionId;
                            int i3 = com.speech.vadsdk.wakeup.b.m.a;
                            StringBuilder sb3 = new StringBuilder("Stop error:");
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(e.toString() + "\n");
                            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                                sb4.append(stackTraceElement.toString() + "\n");
                            }
                            String sb5 = sb4.toString();
                            kotlin.jvm.internal.h.a((Object) sb5, "sb.toString()");
                            sb3.append(sb5);
                            dVar.onFailed(str, i3, sb3.toString());
                            return;
                        }
                    }
                } while (!WakeUpRecordHelper.this.isStopped);
            } catch (Throwable th) {
                WakeUpRecordHelper.this.isListening = false;
                WakeUpRecordHelper.this.mWakeUpListener.onFailed(WakeUpRecordHelper.this.audioSessionId, com.speech.vadsdk.wakeup.b.m.a, "WakeUpTask error:message=" + th.getMessage() + ", localizedMessage=" + th.getLocalizedMessage());
            }
        }
    }

    private final boolean isRecording() {
        return !this.isStopped && PrivacySceneUtils.INSTANCE.checkIsRecording();
    }

    public final boolean isListening() {
        return this.isListening || isRecording();
    }

    @Keep
    public final void destroy() {
        this.threadPool.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r1 == (-1)) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleWakeUpResult(com.speech.vadsdk.wakeup.WakeUpResult r11, int r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.speech.vadsdk.wakeup.WakeUpRecordHelper.handleWakeUpResult(com.speech.vadsdk.wakeup.WakeUpResult, int):void");
    }

    private final void startUpload(Context context, String str, String str2, int i) {
        List<Short> list;
        ISpeechRecognizer iSpeechRecognizer = this.speechRecognizer;
        if (iSpeechRecognizer != null) {
            if (this.isUpload) {
                this.isUpload = false;
                iSpeechRecognizer.end(this.mContext);
            }
            AsrConfig asrConfig = new AsrConfig();
            asrConfig.setRecordSoundMaxTime(-1);
            asrConfig.setCheckUltrashortAudio(false);
            String str3 = "android_wakeup_only_" + str2 + CommonConstant.Symbol.UNDERLINE + i;
            StringBuilder sb = new StringBuilder("startUpload~～～～audioData.size=");
            sb.append(this.audioData.size());
            sb.append(", sessionIdNum=");
            sb.append(str3);
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(TAG);
                sb2.append(']');
            }
            this.isUpload = true;
            iSpeechRecognizer.start(context, str, str3, asrConfig, new g());
            kotlin.jvm.internal.h.a((Object) this.audioData, "audioData");
            if (!list.isEmpty()) {
                int transferAudioSize = iSpeechRecognizer.getTransferAudioSize();
                iSpeechRecognizer.setTransferAudioSize(this.audioData.size());
                List<Short> list2 = this.audioData;
                kotlin.jvm.internal.h.a((Object) list2, "audioData");
                List<Short> list3 = list2;
                if (list3 == null) {
                    throw new o("null cannot be cast to non-null type java.util.Collection<T>");
                }
                Object[] array = list3.toArray(new Short[0]);
                if (array != null) {
                    iSpeechRecognizer.recognize(context, (Short[]) array);
                    iSpeechRecognizer.setTransferAudioSize(transferAudioSize);
                } else {
                    throw new o("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            Thread.sleep(AsrConfig.Companion.getDefaultTransmitAudioLength());
            this.isUpload = false;
            iSpeechRecognizer.end(context);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"com/speech/vadsdk/wakeup/WakeUpRecordHelper$startUpload$1$1", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "failed", "", "audioId", "", "code", "", "message", "onOvertimeClose", "onVoiceDBSize", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "", "start", "success", "result", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "tempResult", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class g implements RecogCallback {
        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void onOvertimeClose(@NotNull String str) {
            kotlin.jvm.internal.h.b(str, "audioId");
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void onVoiceDBSize(double d) {
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void start(@NotNull String str) {
            kotlin.jvm.internal.h.b(str, "audioId");
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void success(@NotNull String str, @NotNull RecogResult recogResult) {
            kotlin.jvm.internal.h.b(str, "audioId");
            kotlin.jvm.internal.h.b(recogResult, "result");
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void tempResult(@NotNull String str, @NotNull RecogResult recogResult) {
            kotlin.jvm.internal.h.b(str, "audioId");
            kotlin.jvm.internal.h.b(recogResult, "result");
        }

        g() {
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void failed(@NotNull String str, int i, @NotNull String str2) {
            kotlin.jvm.internal.h.b(str, "audioId");
            kotlin.jvm.internal.h.b(str2, "message");
            String str3 = "startUpload failed code=" + i + " message=" + str2;
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + WakeUpRecordHelper.TAG + ']', str3);
            }
        }
    }

    private final void startRecognizer(Context context, String str, String str2, WakeUpResult wakeUpResult, int i) {
        if (this.isRecognizing) {
            closeRecognize(context);
        }
        startNewRecognizer(context, str, "android_wakeup_oneshot_" + str2 + CommonConstant.Symbol.UNDERLINE + i, wakeUpResult);
        ISpeechRecognizer iSpeechRecognizer = this.speechRecognizer;
        if (iSpeechRecognizer != null) {
            List<Short> list = this.audioData;
            kotlin.jvm.internal.h.a((Object) list, "audioData");
            if (!list.isEmpty()) {
                int transferAudioSize = iSpeechRecognizer.getTransferAudioSize();
                new StringBuilder("startRecognizer~audioData.size=").append(this.audioData.size());
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(TAG);
                    sb.append(']');
                }
                iSpeechRecognizer.setTransferAudioSize(this.audioData.size());
                List<Short> list2 = this.audioData;
                kotlin.jvm.internal.h.a((Object) list2, "audioData");
                List<Short> list3 = list2;
                if (list3 == null) {
                    throw new o("null cannot be cast to non-null type java.util.Collection<T>");
                }
                Object[] array = list3.toArray(new Short[0]);
                if (array != null) {
                    iSpeechRecognizer.recognize(context, (Short[]) array);
                    iSpeechRecognizer.setTransferAudioSize(transferAudioSize);
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    private final void startNewRecognizer(Context context, String str, String str2, WakeUpResult wakeUpResult) {
        VadConfig vadConfig;
        if (this.audioData.size() > wakeUpResult.getEndOffset() && (vadConfig = this.currentVadConfig) != null) {
            int size = (this.audioData.size() - wakeUpResult.getEndOffset()) * 1000;
            WakeUpConfig wakeUpConfig = this.currentConfig;
            if (wakeUpConfig == null) {
                kotlin.jvm.internal.h.a();
            }
            vadConfig.setWakeUpOffsetTime(size / wakeUpConfig.getFrequency());
        }
        VadConfig vadConfig2 = this.currentVadConfig;
        if (vadConfig2 != null) {
            vadConfig2.setCallback(new e(str2));
        }
        VadConfig vadConfig3 = this.currentVadConfig;
        if (vadConfig3 != null) {
            vadConfig3.register(context, str, this.speechRecognizer);
        }
        AsrConfig asrConfig = this.currentAsrConfig;
        if (asrConfig != null) {
            asrConfig.setRecordSoundMaxTime(-1);
        }
        AsrConfig asrConfig2 = this.currentAsrConfig;
        if (asrConfig2 != null) {
            asrConfig2.setCheckUltrashortAudio(false);
        }
        AsrConfig asrConfig3 = this.currentAsrConfig;
        if (asrConfig3 != null) {
            asrConfig3.setSupportVad16(true);
        }
        WakeUpConfig wakeUpConfig2 = this.currentConfig;
        boolean isAsrFilterKeyword = wakeUpConfig2 != null ? wakeUpConfig2.isAsrFilterKeyword() : false;
        this.isRecognizing = true;
        this.isHasStartRecognize = true;
        new StringBuilder("startNewRecognizer~～～～start, sessionId=").append(str2);
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(TAG);
            sb.append(']');
        }
        ISpeechRecognizer iSpeechRecognizer = this.speechRecognizer;
        if (iSpeechRecognizer != null) {
            AsrConfig asrConfig4 = this.currentAsrConfig;
            if (asrConfig4 == null) {
                kotlin.jvm.internal.h.a();
            }
            iSpeechRecognizer.start(context, str, str2, asrConfig4, new f(isAsrFilterKeyword, wakeUpResult));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"com/speech/vadsdk/wakeup/WakeUpRecordHelper$startNewRecognizer$1", "Lcom/meituan/ai/speech/base/processor/callback/IVadCallback;", "failed", "", "code", "", "message", "", "onEnd", "isLocal", "", "onStart", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class e implements IVadCallback {
        final /* synthetic */ String b;

        e(String str) {
            this.b = str;
        }

        @Override // com.meituan.ai.speech.base.processor.callback.IVadCallback
        public final void onStart(boolean z) {
            new StringBuilder("[wakeup + asr] VAD start! isLocal=").append(z);
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(WakeUpRecordHelper.TAG);
                sb.append(']');
            }
            if (WakeUpRecordHelper.this.isRecognizing) {
                WakeUpRecordHelper.this.isHasStartRecognize = false;
            }
        }

        @Override // com.meituan.ai.speech.base.processor.callback.IVadCallback
        public final void onEnd(boolean z) {
            new StringBuilder("[wakeup + asr] VAD end! isLocal=").append(z);
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(WakeUpRecordHelper.TAG);
                sb.append(']');
            }
            if (WakeUpRecordHelper.this.isRecognizing) {
                WakeUpRecordHelper.this.isHasStartRecognize = false;
            }
        }

        @Override // com.meituan.ai.speech.base.processor.callback.IVadCallback
        public final void failed(int i, @NotNull String str) {
            kotlin.jvm.internal.h.b(str, "message");
            String str2 = "[wakeup + asr] VAD failed!!! sessionId=" + this.b + "，code=" + i + "，message=" + str;
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + WakeUpRecordHelper.TAG + ']', str2);
            }
            WakeUpRecordHelper.this.mCustomWakeUpCallback.onFailed(this.b, i, "vad error:" + str);
            if (WakeUpRecordHelper.this.isRecognizing) {
                WakeUpRecordHelper.this.isHasStartRecognize = false;
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"com/speech/vadsdk/wakeup/WakeUpRecordHelper$startNewRecognizer$2", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "failed", "", "audioId", "", "code", "", "message", "onOvertimeClose", "onVoiceDBSize", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, "", "start", "success", "result", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "tempResult", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class f implements RecogCallback {
        final /* synthetic */ boolean b;
        final /* synthetic */ WakeUpResult c;

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void onVoiceDBSize(double d) {
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void start(@NotNull String str) {
            kotlin.jvm.internal.h.b(str, "audioId");
        }

        f(boolean z, WakeUpResult wakeUpResult) {
            this.b = z;
            this.c = wakeUpResult;
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void onOvertimeClose(@NotNull String str) {
            kotlin.jvm.internal.h.b(str, "audioId");
            if (WakeUpRecordHelper.this.isRecognizing) {
                WakeUpRecordHelper.this.isHasStartRecognize = false;
            }
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void tempResult(@NotNull String str, @NotNull RecogResult recogResult) {
            String str2;
            kotlin.jvm.internal.h.b(str, "audioId");
            kotlin.jvm.internal.h.b(recogResult, "result");
            StringBuilder sb = new StringBuilder("[wakeup + asr] Asr temp! sessionId=");
            sb.append(str);
            sb.append("，result=");
            sb.append(recogResult.getText());
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(WakeUpRecordHelper.TAG);
                sb2.append(']');
            }
            String text = recogResult.getText();
            boolean z = false;
            if (!(text == null || text.length() == 0)) {
                String keyword = this.c.getKeyword();
                if (!((keyword == null || keyword.length() == 0) ? true : true) && this.b) {
                    String keyword2 = this.c.getKeyword();
                    if (keyword2 != null) {
                        String text2 = recogResult.getText();
                        int a = text2 != null ? kotlin.text.g.a((CharSequence) text2, keyword2, 0, false, 6, (Object) null) : -1;
                        if (a >= 0) {
                            String text3 = recogResult.getText();
                            if (text3 != null) {
                                int length = a + keyword2.length();
                                if (text3 == null) {
                                    throw new o("null cannot be cast to non-null type java.lang.String");
                                }
                                str2 = text3.substring(length);
                                kotlin.jvm.internal.h.a((Object) str2, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                str2 = null;
                            }
                            recogResult.setText(str2);
                        }
                        WakeUpRecordHelper.this.mCustomWakeUpCallback.onTempAsr(str, this.c, recogResult);
                        return;
                    }
                    return;
                }
            }
            WakeUpRecordHelper.this.mCustomWakeUpCallback.onTempAsr(str, this.c, recogResult);
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void success(@NotNull String str, @NotNull RecogResult recogResult) {
            String str2;
            kotlin.jvm.internal.h.b(str, "audioId");
            kotlin.jvm.internal.h.b(recogResult, "result");
            StringBuilder sb = new StringBuilder("[wakeup + asr] Asr success! sessionId=");
            sb.append(str);
            sb.append("，result=");
            sb.append(recogResult.getText());
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(WakeUpRecordHelper.TAG);
                sb2.append(']');
            }
            String text = recogResult.getText();
            boolean z = false;
            if (!(text == null || text.length() == 0)) {
                String keyword = this.c.getKeyword();
                if (!((keyword == null || keyword.length() == 0) ? true : true) && this.b) {
                    String keyword2 = this.c.getKeyword();
                    if (keyword2 != null) {
                        String text2 = recogResult.getText();
                        int a = text2 != null ? kotlin.text.g.a((CharSequence) text2, keyword2, 0, false, 6, (Object) null) : -1;
                        if (a >= 0) {
                            String text3 = recogResult.getText();
                            if (text3 != null) {
                                int length = a + keyword2.length();
                                if (text3 == null) {
                                    throw new o("null cannot be cast to non-null type java.lang.String");
                                }
                                str2 = text3.substring(length);
                                kotlin.jvm.internal.h.a((Object) str2, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                str2 = null;
                            }
                            recogResult.setText(str2);
                        }
                        WakeUpRecordHelper.this.mCustomWakeUpCallback.onAsr(str, this.c, recogResult);
                        return;
                    }
                    return;
                }
            }
            WakeUpRecordHelper.this.mCustomWakeUpCallback.onAsr(str, this.c, recogResult);
        }

        @Override // com.meituan.ai.speech.base.sdk.RecogCallback
        public final void failed(@NotNull String str, int i, @NotNull String str2) {
            kotlin.jvm.internal.h.b(str, "audioId");
            kotlin.jvm.internal.h.b(str2, "message");
            String str3 = "[wakeup + asr] Asr failed!!! sessionId=" + str + "，code=" + i + "，message=" + str2;
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + WakeUpRecordHelper.TAG + ']', str3);
            }
            WakeUpRecordHelper.this.mCustomWakeUpCallback.onFailed(str, i, "asr error:" + str2);
            if (WakeUpRecordHelper.this.isRecognizing) {
                WakeUpRecordHelper.this.isHasStartRecognize = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWakeUpAudioData(short[] sArr) {
        List<Short> list;
        if (this.isRecognizing) {
            if (this.isHasStartRecognize) {
                ISpeechRecognizer iSpeechRecognizer = this.speechRecognizer;
                if (iSpeechRecognizer != null) {
                    iSpeechRecognizer.recognize(this.mContext, kotlin.collections.b.a(sArr));
                }
            } else {
                closeRecognize(this.mContext);
            }
        }
        List<Short> list2 = this.audioData;
        kotlin.jvm.internal.h.a((Object) list2, "audioData");
        synchronized (list2) {
            for (short s : sArr) {
                this.audioData.add(Short.valueOf(s));
            }
            while (true) {
                kotlin.jvm.internal.h.a((Object) this.audioData, "audioData");
                if (!(!list.isEmpty())) {
                    break;
                }
                int size = this.audioData.size();
                WakeUpConfig wakeUpConfig = this.currentConfig;
                if (wakeUpConfig == null) {
                    kotlin.jvm.internal.h.a();
                }
                if (size <= wakeUpConfig.getFrequency() * 5) {
                    break;
                }
                this.audioData.remove(0);
            }
            r rVar = r.a;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"com/speech/vadsdk/wakeup/WakeUpRecordHelper$mWakeUpListener$1", "Lcom/speech/vadsdk/wakeup/WakeUpListener;", "wakeupTimes", "", "onAudioData", "", "audio", "", "onComplete", "onFailed", "sessionId", "", "code", "message", "onResult", "result", "Lcom/speech/vadsdk/wakeup/WakeUpResult;", "onStart", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class d implements WakeUpListener {
        private int b = -1;

        d() {
        }

        @Override // com.speech.vadsdk.wakeup.WakeUpListener
        public final void onAudioData(@Nullable short[] sArr) {
            WakeUpConfig wakeUpConfig = WakeUpRecordHelper.this.currentConfig;
            if (wakeUpConfig != null && wakeUpConfig.isSaveAudio()) {
                WakeUpRecordHelper.this.mCustomWakeUpCallback.onAudioData(sArr);
            }
            if (sArr != null) {
                WakeUpRecordHelper.this.handleWakeUpAudioData(sArr);
                WakeUpConfig wakeUpConfig2 = WakeUpRecordHelper.this.currentConfig;
                if (wakeUpConfig2 != null && wakeUpConfig2.getNeedAudioDB()) {
                    WakeUpRecordHelper.this.mCustomWakeUpCallback.onVoiceDB(VoiceUtilsKt.handleVoiceDB(sArr));
                }
                c cVar = WakeUpRecordHelper.this.mSaveFileProcessor;
                if (cVar.a) {
                    byte[] byteArray = JavaUtils.toByteArray(sArr);
                    if (byteArray.length >= 2) {
                        cVar.e.add(Byte.valueOf(byteArray[0]));
                        cVar.e.add(Byte.valueOf(byteArray[1]));
                    }
                }
            }
        }

        @Override // com.speech.vadsdk.wakeup.WakeUpListener
        public final void onResult(@NotNull WakeUpResult wakeUpResult) {
            kotlin.jvm.internal.h.b(wakeUpResult, "result");
            this.b++;
            StringBuilder sb = new StringBuilder("～～～onResult，wakeupTimes=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(wakeUpResult.getKeyword());
            sb.append("，size=");
            sb.append(WakeUpRecordHelper.this.audioData.size());
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(WakeUpRecordHelper.TAG);
                sb2.append(']');
            }
            com.speech.vadsdk.log.b.a(WakeUpRecordHelper.this.appKey, WakeUpRecordHelper.this.audioSessionId, wakeUpResult, WakeUpRecordHelper.this.isRecognizing);
            if (wakeUpResult.getStartOffset() <= wakeUpResult.getEndOffset()) {
                WakeUpRecordHelper.this.mCustomWakeUpCallback.onFailed(WakeUpRecordHelper.this.audioSessionId, com.speech.vadsdk.wakeup.b.h.a, com.speech.vadsdk.wakeup.b.h.b);
            } else {
                WakeUpRecordHelper.this.handleWakeUpResult(wakeUpResult, this.b);
            }
        }

        @Override // com.speech.vadsdk.wakeup.WakeUpListener
        public final void onComplete() {
            String str;
            new StringBuilder("～～～onComplete wakeupTimes=").append(this.b);
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(WakeUpRecordHelper.TAG);
                sb.append(']');
            }
            com.speech.vadsdk.log.b.c(WakeUpRecordHelper.this.appKey, WakeUpRecordHelper.this.audioSessionId);
            WakeUpRecordHelper.this.mCustomWakeUpCallback.onComplete();
            WakeUpRecordHelper.this.isListening = false;
            WakeUpRecordHelper.this.currentConfig = null;
            this.b = -1;
            c cVar = WakeUpRecordHelper.this.mSaveFileProcessor;
            if (!cVar.a || (str = cVar.d) == null) {
                return;
            }
            File file = new File(cVar.c, str);
            byte[] a = kotlin.collections.h.a((Collection<Byte>) cVar.e);
            kotlin.jvm.internal.h.b(file, "$this$writeBytes");
            kotlin.jvm.internal.h.b(a, "array");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(a);
                r rVar = r.a;
                kotlin.io.a.a(fileOutputStream, null);
                cVar.e.clear();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.a.a(fileOutputStream, th);
                    throw th2;
                }
            }
        }

        @Override // com.speech.vadsdk.wakeup.WakeUpListener
        public final void onFailed(@NotNull String str, int i, @NotNull String str2) {
            kotlin.jvm.internal.h.b(str, "sessionId");
            kotlin.jvm.internal.h.b(str2, "message");
            StringBuilder sb = new StringBuilder("～～～onFailed code=");
            sb.append(i);
            sb.append(" message=");
            sb.append(str2);
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(WakeUpRecordHelper.TAG);
                sb2.append(']');
            }
            WakeUpRecordHelper.this.mCustomWakeUpCallback.onFailed(str, i, str2);
            if (i != com.speech.vadsdk.wakeup.b.i.a) {
                WakeUpRecordHelper.this.stopRecord();
            }
        }

        @Override // com.speech.vadsdk.wakeup.WakeUpListener
        public final void onStart() {
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(WakeUpRecordHelper.TAG);
                sb.append(']');
            }
            String str = WakeUpRecordHelper.this.appKey;
            String str2 = WakeUpRecordHelper.this.audioSessionId;
            WakeUpConfig wakeUpConfig = WakeUpRecordHelper.this.currentConfig;
            if (wakeUpConfig == null) {
                kotlin.jvm.internal.h.a();
            }
            AsrConfig asrConfig = WakeUpRecordHelper.this.currentAsrConfig;
            if (asrConfig == null) {
                kotlin.jvm.internal.h.a();
            }
            VadConfig vadConfig = WakeUpRecordHelper.this.currentVadConfig;
            if (vadConfig == null) {
                kotlin.jvm.internal.h.a();
            }
            com.speech.vadsdk.log.b.a(str, str2, wakeUpConfig, asrConfig, vadConfig);
            this.b = 0;
            WakeUpRecordHelper.this.mCustomWakeUpCallback.onStart();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"com/speech/vadsdk/wakeup/WakeUpRecordHelper$mSaveFileProcessor$1", "Lcom/speech/vadsdk/wakeup/WakeUpRecordHelper$ISaveFileProcessor;", TbsReaderView.KEY_FILE_PATH, "Ljava/io/File;", "isSaveVoiceFile", "", "saveAudioData", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "saveFileName", "", "saveVoiceFilePath", "addData", "", "shortData", "", "endSave", "startSave", "context", "Landroid/content/Context;", QuickReportConstants.CONFIG_FILE_NAME, "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class c {
        final boolean a;
        File c;
        String d;
        final String b = "";
        ArrayList<Byte> e = new ArrayList<>();

        c() {
        }
    }

    @Keep
    private final boolean startRecord(WakeUpConfig wakeUpConfig) {
        StackTraceElement[] stackTrace;
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(TAG);
            sb.append(']');
        }
        reset();
        try {
            this.recBufSize = AudioRecord.getMinBufferSize(wakeUpConfig.getFrequency(), wakeUpConfig.getAudioFormat(), wakeUpConfig.getAudioEncode());
            if (-2 != this.recBufSize && -1 != this.recBufSize) {
                PrivacySceneUtils.INSTANCE.createMtAudioRecord(wakeUpConfig.getPrivacySceneToken(), wakeUpConfig.getAudioSource(), wakeUpConfig.getFrequency(), wakeUpConfig.getAudioFormat(), wakeUpConfig.getAudioEncode(), this.recBufSize);
                if (!PrivacySceneUtils.INSTANCE.checkInitMtAudioRecord()) {
                    this.mWakeUpListener.onFailed(this.audioSessionId, com.speech.vadsdk.wakeup.b.k.a, com.speech.vadsdk.wakeup.b.k.b + ", AudioRecord init fail");
                    return false;
                }
                this.threadPool.submit(new b(this.recBufSize));
                return true;
            }
            this.mWakeUpListener.onFailed(this.audioSessionId, com.speech.vadsdk.wakeup.b.k.a, com.speech.vadsdk.wakeup.b.k.b + ", Unable to getMinBufferSize=" + this.recBufSize);
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            d dVar = this.mWakeUpListener;
            String str = this.audioSessionId;
            int i = com.speech.vadsdk.wakeup.b.m.a;
            StringBuilder sb2 = new StringBuilder("startRecord error:");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e2.toString() + "\n");
            for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                sb3.append(stackTraceElement.toString() + "\n");
            }
            String sb4 = sb3.toString();
            kotlin.jvm.internal.h.a((Object) sb4, "sb.toString()");
            sb2.append(sb4);
            dVar.onFailed(str, i, sb2.toString());
            return false;
        }
    }

    @Keep
    public final void stopRecord() {
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(TAG);
            sb.append(']');
        }
        this.isStopped = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reset() {
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(TAG);
            sb.append(']');
        }
        this.audioData.clear();
        this.isUpload = false;
        this.isRecognizing = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeRecognize(Context context) {
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(TAG);
            sb.append(']');
        }
        this.isRecognizing = false;
        this.isHasStartRecognize = false;
        ISpeechRecognizer iSpeechRecognizer = this.speechRecognizer;
        if (iSpeechRecognizer != null) {
            iSpeechRecognizer.end(context);
        }
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(TAG);
            sb2.append(']');
        }
    }
}
