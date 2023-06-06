package com.speech.vadsdk.processor;

import android.content.Context;
import android.support.annotation.Keep;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.ai.speech.base.processor.callback.IVadCallback;
import com.meituan.ai.speech.base.processor.config.IVadConfig;
import com.meituan.ai.speech.base.sdk.ISpeechRecognizer;
import com.meituan.uuid.GetUUID;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002CDB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u001a\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\n\u0010&\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u000f\u0010(\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\u0012H\u0017J\b\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0017J\b\u0010.\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0017J\b\u00100\u001a\u00020\u0012H\u0017J\u0006\u00101\u001a\u00020\u001fJ\"\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\u0010\u00105\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017J\u0016\u00106\u001a\u00020\u001f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u0012H\u0017J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u0012H\u0016J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0012H\u0016J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u0012H\u0017J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020\u0012H\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006E"}, d2 = {"Lcom/speech/vadsdk/processor/VadConfig;", "Lcom/meituan/ai/speech/base/processor/config/IVadConfig;", "()V", "callback", "Lcom/meituan/ai/speech/base/processor/callback/IVadCallback;", "endThresholdDynamicList", "", "Lcom/speech/vadsdk/processor/VadConfig$DynamicVadInfo;", "isTipEndPoint", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTipEndPoint$speech_vad_commonRelease", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setTipEndPoint$speech_vad_commonRelease", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "isTipStartPoint", "isTipStartPoint$speech_vad_commonRelease", "setTipStartPoint$speech_vad_commonRelease", "mEndTipTime", "", "mLeastSilenceSize", "mLeastSoundSize", "mStartTipTime", "mVadModel", "mWakeUpDrawlTime", "mWakeUpOffsetTime", "stopModel", "getStopModel", "()I", "setStopModel", "(I)V", "checkEndThresholdDynamicList", "", "checkoutParams", "destroy", "appKey", "", "recognizer", "Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "getCallback", "getEndThresholdDynamicList", "getEndThresholdDynamicListStr", "getEndThresholdDynamicListStr$speech_vad_commonRelease", "getEndTipTime", "getLeastSilenceSize", "getLeastSoundSize", "getStartTipTime", "getVadModel", "getWakeUpDrawlTime", "getWakeUpOffsetTime", "onStart", GetUUID.REGISTER, "context", "Landroid/content/Context;", "setCallback", "setEndThresholdDynamicList", "setEndTipTime", "endTipTime", "setLeastSilenceSize", "leastSilenceSize", "setLeastSoundSize", "leastSoundSize", "setStartTipTime", "startTipTime", "setVadModel", "vadModel", "setWakeUpOffsetTime", "wakeUpOffsetTime", "Companion", "DynamicVadInfo", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class VadConfig implements IVadConfig {
    public static final a Companion = new a(null);
    public static final int VAD_STOP_BOTH = 4;
    public static final int VAD_STOP_FIX = 3;
    public static final int VAD_STOP_LOCAL = 1;
    public static final int VAD_STOP_SERVER = 2;
    private IVadCallback callback;
    private List<DynamicVadInfo> endThresholdDynamicList;
    private int mStartTipTime = 2000;
    private int mEndTipTime = 3000;
    private int mWakeUpOffsetTime = -1;
    private final int mWakeUpDrawlTime = 300;
    private int mVadModel = IVadConfig.Companion.getDefaultVadModel();
    private int mLeastSoundSize = IVadConfig.Companion.getDefaultLeastSoundSize();
    private int mLeastSilenceSize = IVadConfig.Companion.getDefaultLeastSilenceSize();
    @NotNull
    private AtomicBoolean isTipStartPoint = new AtomicBoolean(false);
    @NotNull
    private AtomicBoolean isTipEndPoint = new AtomicBoolean(false);
    private int stopModel = 3;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/speech/vadsdk/processor/VadConfig$Companion;", "", "()V", "VAD_STOP_BOTH", "", "VAD_STOP_FIX", "VAD_STOP_LOCAL", "VAD_STOP_SERVER", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @NotNull
    public final AtomicBoolean isTipStartPoint$speech_vad_commonRelease() {
        return this.isTipStartPoint;
    }

    public final void setTipStartPoint$speech_vad_commonRelease(@NotNull AtomicBoolean atomicBoolean) {
        h.b(atomicBoolean, "<set-?>");
        this.isTipStartPoint = atomicBoolean;
    }

    @NotNull
    public final AtomicBoolean isTipEndPoint$speech_vad_commonRelease() {
        return this.isTipEndPoint;
    }

    public final void setTipEndPoint$speech_vad_commonRelease(@NotNull AtomicBoolean atomicBoolean) {
        h.b(atomicBoolean, "<set-?>");
        this.isTipEndPoint = atomicBoolean;
    }

    public final int getStopModel() {
        return this.stopModel;
    }

    public final void setStopModel(int i) {
        this.stopModel = i;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final void setStartTipTime(int i) {
        this.mStartTipTime = i;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final void setEndTipTime(int i) {
        this.mEndTipTime = i;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final void setWakeUpOffsetTime(int i) {
        this.mWakeUpOffsetTime = i;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final void setCallback(@NotNull IVadCallback iVadCallback) {
        h.b(iVadCallback, "callback");
        this.callback = iVadCallback;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final int getStartTipTime() {
        return this.mStartTipTime;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final int getEndTipTime() {
        return this.mEndTipTime;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final int getWakeUpOffsetTime() {
        return this.mWakeUpOffsetTime;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final int getWakeUpDrawlTime() {
        return this.mWakeUpDrawlTime;
    }

    @Keep
    public final void setEndThresholdDynamicList(@NotNull List<DynamicVadInfo> list) {
        h.b(list, "endThresholdDynamicList");
        this.endThresholdDynamicList = list;
    }

    @Keep
    @Nullable
    public final List<DynamicVadInfo> getEndThresholdDynamicList() {
        return this.endThresholdDynamicList;
    }

    @Keep
    @Nullable
    public final IVadCallback getCallback() {
        return this.callback;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    public final int getLeastSoundSize() {
        return this.mLeastSoundSize;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    public final void setLeastSoundSize(int i) {
        this.mLeastSoundSize = i;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    public final int getLeastSilenceSize() {
        return this.mLeastSilenceSize;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    public final void setLeastSilenceSize(int i) {
        this.mLeastSilenceSize = i;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    public final void setVadModel(int i) {
        this.mVadModel = i;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    public final int getVadModel() {
        return this.mVadModel;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final void register(@NotNull Context context, @NotNull String str, @Nullable ISpeechRecognizer iSpeechRecognizer) {
        h.b(context, "context");
        h.b(str, "appKey");
        checkoutParams();
        checkEndThresholdDynamicList();
        if (iSpeechRecognizer != null) {
            VadProcessor vadProcessor = (VadProcessor) iSpeechRecognizer.getVADProcessor();
            if (vadProcessor == null) {
                VadProcessor vadProcessor2 = new VadProcessor(context, str);
                vadProcessor2.setConfig(str, this);
                iSpeechRecognizer.addVADProcessor(vadProcessor2);
                return;
            }
            vadProcessor.setConfig(str, this);
        }
    }

    private final void checkoutParams() {
        if (this.mStartTipTime <= 0 || this.mStartTipTime > 10000 || this.mEndTipTime <= 0 || this.mEndTipTime > 10000) {
            if (this.mStartTipTime <= 0 || this.mStartTipTime > 10000) {
                this.mStartTipTime = 2000;
            }
            if (this.mEndTipTime <= 0 || this.mEndTipTime > 10000) {
                this.mEndTipTime = 3000;
            }
            IVadCallback iVadCallback = this.callback;
            if (iVadCallback != null) {
                iVadCallback.failed(10002, VadError.TIME_SET_ERROR_MESSAGE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
        r7.endThresholdDynamicList = null;
        r0 = r7.callback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0068, code lost:
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
        r0.failed(10005, "VAD后端点动态列表配置错误!!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void checkEndThresholdDynamicList() {
        /*
            r7 = this;
            java.util.List<com.speech.vadsdk.processor.VadConfig$DynamicVadInfo> r0 = r7.endThresholdDynamicList
            if (r0 != 0) goto L5
            return
        L5:
            java.util.List<com.speech.vadsdk.processor.VadConfig$DynamicVadInfo> r0 = r7.endThresholdDynamicList
            if (r0 != 0) goto Lc
            kotlin.jvm.internal.h.a()
        Lc:
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L61
            java.util.List<com.speech.vadsdk.processor.VadConfig$DynamicVadInfo> r0 = r7.endThresholdDynamicList
            if (r0 != 0) goto L1a
            kotlin.jvm.internal.h.a()
        L1a:
            int r0 = r0.size()
            r2 = 20
            if (r0 <= r2) goto L23
            goto L61
        L23:
            r0 = -1
            java.util.List<com.speech.vadsdk.processor.VadConfig$DynamicVadInfo> r2 = r7.endThresholdDynamicList
            if (r2 != 0) goto L2b
            kotlin.jvm.internal.h.a()
        L2b:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
            r3 = -1
        L33:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r2.next()
            com.speech.vadsdk.processor.VadConfig$DynamicVadInfo r4 = (com.speech.vadsdk.processor.VadConfig.DynamicVadInfo) r4
            int r5 = r4.getSpeechTime()
            int r4 = r4.getEndTipTime()
            if (r5 < 0) goto L61
            r6 = 60000(0xea60, float:8.4078E-41)
            if (r5 > r6) goto L61
            if (r4 <= 0) goto L61
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r4 <= r6) goto L55
            goto L61
        L55:
            if (r0 != 0) goto L5a
            if (r5 == 0) goto L5a
            goto L61
        L5a:
            if (r5 <= r3) goto L61
            int r0 = r0 + 1
            r3 = r5
            goto L33
        L60:
            r1 = 1
        L61:
            if (r1 != 0) goto L72
            r0 = 0
            r7.endThresholdDynamicList = r0
            com.meituan.ai.speech.base.processor.callback.IVadCallback r0 = r7.callback
            if (r0 == 0) goto L72
            r1 = 10005(0x2715, float:1.402E-41)
            java.lang.String r2 = "VAD后端点动态列表配置错误!!"
            r0.failed(r1, r2)
            return
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.speech.vadsdk.processor.VadConfig.checkEndThresholdDynamicList():void");
    }

    @Nullable
    public final String getEndThresholdDynamicListStr$speech_vad_commonRelease() {
        if (this.endThresholdDynamicList != null) {
            List<DynamicVadInfo> list = this.endThresholdDynamicList;
            if (list == null) {
                h.a();
            }
            if (list.isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            List<DynamicVadInfo> list2 = this.endThresholdDynamicList;
            if (list2 == null) {
                h.a();
            }
            for (DynamicVadInfo dynamicVadInfo : list2) {
                int speechTime = dynamicVadInfo.getSpeechTime();
                int endTipTime = dynamicVadInfo.getEndTipTime();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(speechTime);
                sb2.append('_');
                sb2.append(endTipTime);
                sb.append(sb2.toString());
                List<DynamicVadInfo> list3 = this.endThresholdDynamicList;
                if (list3 == null) {
                    h.a();
                }
                if (i != list3.size() - 1) {
                    sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                }
                i++;
            }
            return sb.toString();
        }
        return null;
    }

    @Override // com.meituan.ai.speech.base.processor.config.IVadConfig
    @Keep
    public final void destroy(@NotNull String str, @Nullable ISpeechRecognizer iSpeechRecognizer) {
        VadProcessor vadProcessor;
        h.b(str, "appKey");
        if (iSpeechRecognizer == null || (vadProcessor = (VadProcessor) iSpeechRecognizer.getVADProcessor()) == null) {
            return;
        }
        vadProcessor.destroyConfig(str);
    }

    public final void onStart() {
        this.isTipEndPoint.set(false);
        this.isTipStartPoint.set(false);
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/speech/vadsdk/processor/VadConfig$DynamicVadInfo;", "", "speechTime", "", "endTipTime", "(II)V", "getEndTipTime", "()I", "setEndTipTime", "(I)V", "getSpeechTime", "setSpeechTime", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class DynamicVadInfo {
        private int endTipTime;
        private int speechTime;

        public DynamicVadInfo() {
            this(0, 0, 3, null);
        }

        public DynamicVadInfo(int i, int i2) {
            this.speechTime = i;
            this.endTipTime = i2;
        }

        public /* synthetic */ DynamicVadInfo(int i, int i2, int i3, f fVar) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }

        public final int getEndTipTime() {
            return this.endTipTime;
        }

        public final int getSpeechTime() {
            return this.speechTime;
        }

        public final void setEndTipTime(int i) {
            this.endTipTime = i;
        }

        public final void setSpeechTime(int i) {
            this.speechTime = i;
        }
    }
}
