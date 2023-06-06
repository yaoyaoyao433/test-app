package com.speech.vadsdk.processor;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.data.ServerVadInfo;
import com.meituan.ai.speech.base.processor.IVadProcessor;
import com.meituan.ai.speech.base.processor.callback.IVadCallback;
import com.meituan.ai.speech.base.processor.config.IVadConfig;
import com.speech.vadsdk.custom.CustomModelHelper;
import com.speech.vadsdk.nativelib.b;
import com.speech.vadsdk.processor.a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J5\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0017J\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013H\u0017J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\tH\u0007R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/speech/vadsdk/processor/VadProcessor;", "Lcom/meituan/ai/speech/base/processor/IVadProcessor;", "context", "Landroid/content/Context;", "appKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "configs", "Ljava/util/HashMap;", "Lcom/speech/vadsdk/processor/VadConfig;", "Lkotlin/collections/HashMap;", "sessionId", "destroyConfig", "", "getVadConfig", "Lcom/meituan/ai/speech/base/processor/config/IVadConfig;", "onEnd", "onServerVadResult", "isSpeechTimeLocal", "", "speechTime", "", "vad_info", "", "Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "(Ljava/lang/String;ZI[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;)V", "onStart", "process", "", "t", "isLast", "setConfig", "vadConfig", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class VadProcessor implements IVadProcessor {
    private HashMap<String, VadConfig> configs;
    private String sessionId;

    public VadProcessor(@NotNull Context context, @NotNull String str) {
        byte[] vADModelData;
        h.b(context, "context");
        h.b(str, "appKey");
        this.configs = new HashMap<>();
        this.sessionId = "";
        if (b.b() || (vADModelData = CustomModelHelper.getVADModelData(context)) == null) {
            return;
        }
        b.a(str, vADModelData, vADModelData.length);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/speech/vadsdk/processor/VadProcessor$onStart$1$1", "Lcom/speech/vadsdk/processor/VadComputed$ModelVadListener;", "endStop", "", "startTime", "", "endTime", "speechTime", "endTipTime", "startStop", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class a implements a.InterfaceC1422a {
        final /* synthetic */ VadConfig a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        a(VadConfig vadConfig, String str, String str2) {
            this.a = vadConfig;
            this.b = str;
            this.c = str2;
        }

        @Override // com.speech.vadsdk.processor.a.InterfaceC1422a
        public final void a(int i, int i2, int i3, int i4) {
            if ((this.a.getStopModel() == 1 || this.a.getStopModel() == 4) && !this.a.isTipStartPoint$speech_vad_commonRelease().get()) {
                String simpleName = getClass().getSimpleName();
                h.a((Object) simpleName, "this::class.java.simpleName");
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(simpleName);
                    sb.append(']');
                }
                this.a.isTipStartPoint$speech_vad_commonRelease().set(true);
                IVadCallback callback = this.a.getCallback();
                if (callback != null) {
                    callback.onStart(true);
                }
                com.speech.vadsdk.log.a.a(this.b, this.c, i, i2, i3, i4, 0, 0);
            }
        }

        @Override // com.speech.vadsdk.processor.a.InterfaceC1422a
        public final void b(int i, int i2, int i3, int i4) {
            if (this.a.getStopModel() == 2 || this.a.isTipEndPoint$speech_vad_commonRelease().get()) {
                return;
            }
            String simpleName = getClass().getSimpleName();
            h.a((Object) simpleName, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(simpleName);
                sb.append(']');
            }
            this.a.isTipEndPoint$speech_vad_commonRelease().set(true);
            IVadCallback callback = this.a.getCallback();
            if (callback != null) {
                callback.onEnd(true);
            }
            com.speech.vadsdk.log.a.a(this.b, this.c, i, i2, i3, i4, 1, 0);
        }
    }

    @Override // com.meituan.ai.speech.base.processor.IVadProcessor
    public final void onServerVadResult(@NotNull String str, boolean z, int i, @Nullable ServerVadInfo[] serverVadInfoArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        h.b(str, "appKey");
        g.a("[服务端VAD]appKey=" + str + ",speechTime=" + i);
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        VadConfig vadConfig = this.configs.get(str);
        if (vadConfig == null || vadConfig.getStopModel() == 1) {
            return;
        }
        int wakeUpOffsetTime = vadConfig.getWakeUpOffsetTime();
        if (wakeUpOffsetTime < 0) {
            com.speech.vadsdk.processor.a.k.a(str, this.sessionId, vadConfig, i, serverVadInfoArr);
            return;
        }
        com.speech.vadsdk.processor.a aVar = com.speech.vadsdk.processor.a.k;
        String str2 = this.sessionId;
        int i6 = z ? i + wakeUpOffsetTime : i;
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(vadConfig, "vadConfig");
        new StringBuilder("[ServerVad]computeVadForWakeUp,wakeUpOffsetTime=").append(wakeUpOffsetTime);
        String simpleName2 = aVar.getClass().getSimpleName();
        h.a((Object) simpleName2, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(simpleName2);
            sb2.append(']');
        }
        if (vadConfig.isTipStartPoint$speech_vad_commonRelease().get() || vadConfig.isTipEndPoint$speech_vad_commonRelease().get()) {
            return;
        }
        int wakeUpDrawlTime = vadConfig.getWakeUpDrawlTime();
        new StringBuilder("[ServerVad]computeVadForWakeUp,wakeUpDrawlTime=").append(wakeUpDrawlTime);
        String simpleName3 = aVar.getClass().getSimpleName();
        h.a((Object) simpleName3, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(simpleName3);
            sb3.append(']');
        }
        if (i6 >= wakeUpOffsetTime) {
            int startTipTime = vadConfig.getStartTipTime();
            int a2 = com.speech.vadsdk.processor.a.a(i6, vadConfig);
            StringBuilder sb4 = new StringBuilder("[ServerVad]computeVadForWakeUp,speechTime=");
            sb4.append(i6);
            sb4.append(",startTipTime=");
            sb4.append(startTipTime);
            sb4.append(",endTipTime=");
            sb4.append(a2);
            String simpleName4 = aVar.getClass().getSimpleName();
            h.a((Object) simpleName4, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb5 = new StringBuilder("[");
                sb5.append(simpleName4);
                sb5.append(']');
            }
            if (serverVadInfoArr != null) {
                if (!(serverVadInfoArr.length == 0)) {
                    int length = serverVadInfoArr.length;
                    int i7 = length - 1;
                    int start = serverVadInfoArr[i7].getStart();
                    int end = serverVadInfoArr[i7].getEnd();
                    StringBuilder sb6 = new StringBuilder("[ServerVad]computeVadForWakeUp,startVadTime=");
                    sb6.append(start);
                    sb6.append(",endVadTime=");
                    sb6.append(end);
                    String simpleName5 = aVar.getClass().getSimpleName();
                    h.a((Object) simpleName5, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb7 = new StringBuilder("[");
                        sb7.append(simpleName5);
                        sb7.append(']');
                    }
                    if (end > 0 && end != com.speech.vadsdk.processor.a.i && !com.speech.vadsdk.processor.a.g) {
                        com.speech.vadsdk.processor.a.i = end;
                    } else if (!com.speech.vadsdk.processor.a.g) {
                        com.speech.vadsdk.processor.a.g = true;
                        com.speech.vadsdk.processor.a.j = end - wakeUpOffsetTime;
                    }
                    StringBuilder sb8 = new StringBuilder("[ServerVad]computeVadForWakeUp,isMuteStartServer=");
                    sb8.append(com.speech.vadsdk.processor.a.g);
                    sb8.append(",drawlTimeServer=");
                    sb8.append(com.speech.vadsdk.processor.a.j);
                    String simpleName6 = aVar.getClass().getSimpleName();
                    h.a((Object) simpleName6, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb9 = new StringBuilder("[");
                        sb9.append(simpleName6);
                        sb9.append(']');
                    }
                    if (com.speech.vadsdk.processor.a.g) {
                        if (com.speech.vadsdk.processor.a.j <= wakeUpDrawlTime) {
                            if (com.speech.vadsdk.processor.a.i == end || com.speech.vadsdk.processor.a.h) {
                                i2 = 1;
                            } else {
                                i2 = 1;
                                if (length == 1) {
                                    com.speech.vadsdk.processor.a.h = true;
                                }
                            }
                            boolean z3 = length != i2 || com.speech.vadsdk.processor.a.h;
                            if (z3 || i6 - end < startTipTime || vadConfig.isTipStartPoint$speech_vad_commonRelease().get()) {
                                i3 = end;
                                i4 = start;
                                i5 = a2;
                                z2 = false;
                            } else {
                                String simpleName7 = aVar.getClass().getSimpleName();
                                h.a((Object) simpleName7, "this::class.java.simpleName");
                                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                                    StringBuilder sb10 = new StringBuilder("[");
                                    sb10.append(simpleName7);
                                    sb10.append(']');
                                }
                                vadConfig.isTipStartPoint$speech_vad_commonRelease().set(true);
                                IVadCallback callback = vadConfig.getCallback();
                                if (callback != null) {
                                    callback.onStart(false);
                                }
                                i3 = end;
                                i4 = start;
                                z2 = false;
                                i5 = a2;
                                com.speech.vadsdk.log.a.a(str, str2, start, end, i6, a2, 0, 1);
                            }
                            if (!z3 || i3 <= 0 || i6 - i3 < i5 || vadConfig.isTipEndPoint$speech_vad_commonRelease().get()) {
                                return;
                            }
                            String simpleName8 = aVar.getClass().getSimpleName();
                            h.a((Object) simpleName8, "this::class.java.simpleName");
                            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                                StringBuilder sb11 = new StringBuilder("[");
                                sb11.append(simpleName8);
                                sb11.append(']');
                            }
                            vadConfig.isTipEndPoint$speech_vad_commonRelease().set(true);
                            IVadCallback callback2 = vadConfig.getCallback();
                            if (callback2 != null) {
                                callback2.onEnd(z2);
                            }
                            com.speech.vadsdk.log.a.a(str, str2, i4, i3, i6, i5, 1, 1);
                            return;
                        } else if (serverVadInfoArr[0].getStart() < 0 || end <= 0 || i6 - end < a2 || vadConfig.isTipEndPoint$speech_vad_commonRelease().get()) {
                            return;
                        } else {
                            String simpleName9 = aVar.getClass().getSimpleName();
                            h.a((Object) simpleName9, "this::class.java.simpleName");
                            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                                StringBuilder sb12 = new StringBuilder("[");
                                sb12.append(simpleName9);
                                sb12.append(']');
                            }
                            vadConfig.isTipEndPoint$speech_vad_commonRelease().set(true);
                            IVadCallback callback3 = vadConfig.getCallback();
                            if (callback3 != null) {
                                callback3.onEnd(false);
                            }
                            com.speech.vadsdk.log.a.a(str, str2, start, end, i6, a2, 1, 1);
                            return;
                        }
                    }
                    return;
                }
            }
            if (i6 - wakeUpOffsetTime < startTipTime || vadConfig.isTipStartPoint$speech_vad_commonRelease().get()) {
                return;
            }
            String simpleName10 = aVar.getClass().getSimpleName();
            h.a((Object) simpleName10, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb13 = new StringBuilder("[");
                sb13.append(simpleName10);
                sb13.append(']');
            }
            vadConfig.isTipStartPoint$speech_vad_commonRelease().set(true);
            IVadCallback callback4 = vadConfig.getCallback();
            if (callback4 != null) {
                callback4.onStart(false);
            }
            com.speech.vadsdk.log.a.a(str, str2, 0, 0, i6, a2, 0, 1);
        }
    }

    @Override // com.meituan.ai.speech.base.processor.IVadProcessor
    @Keep
    @Nullable
    public final short[] process(@NotNull String str, @NotNull short[] sArr, boolean z) {
        StackTraceElement[] stackTrace;
        h.b(str, "appKey");
        h.b(sArr, "t");
        g.a("[VAD]##########Process#############appKey=" + str + ",data_size=" + sArr.length + ",isLast=" + z);
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        if (!b.b()) {
            com.speech.vadsdk.log.a.b(str, this.sessionId, 10004, VadError.NOT_INITED_MESSAGE);
            return sArr;
        }
        VadConfig vadConfig = this.configs.get(str);
        if (vadConfig == null || vadConfig.getStopModel() == 2) {
            return sArr;
        }
        try {
            int[] iArr = new int[200];
            com.speech.vadsdk.processor.a aVar = com.speech.vadsdk.processor.a.k;
            h.b(vadConfig, "vadConfig");
            h.b(sArr, "wav");
            h.b(iArr, "result");
            String simpleName2 = aVar.getClass().getSimpleName();
            h.a((Object) simpleName2, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(simpleName2);
                sb2.append(']');
            }
            int a2 = b.a().a(sArr, sArr.length, 16000, z, iArr, 200);
            StringBuilder sb3 = new StringBuilder("[LocalVAD]computeVad result length = ");
            sb3.append(200);
            sb3.append(" resultLength = 200");
            sb3.append(" ret = ");
            sb3.append(a2);
            String simpleName3 = aVar.getClass().getSimpleName();
            h.a((Object) simpleName3, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb4 = new StringBuilder("[");
                sb4.append(simpleName3);
                sb4.append(']');
            }
            com.speech.vadsdk.processor.a.c += (int) ((sArr.length * 1000.0f) / 16000.0f);
            StringBuilder sb5 = new StringBuilder("[LocalVAD]computeVad globalTimeStamp=");
            sb5.append(com.speech.vadsdk.processor.a.c);
            sb5.append(",startThreshold=");
            sb5.append(vadConfig.getStartTipTime());
            sb5.append(",wakeUpOffsetTime=");
            sb5.append(vadConfig.getWakeUpOffsetTime());
            String simpleName4 = aVar.getClass().getSimpleName();
            h.a((Object) simpleName4, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb6 = new StringBuilder("[");
                sb6.append(simpleName4);
                sb6.append(']');
            }
            if (vadConfig.getWakeUpOffsetTime() < 0) {
                int startTipTime = vadConfig.getStartTipTime();
                int a3 = com.speech.vadsdk.processor.a.a(com.speech.vadsdk.processor.a.c, vadConfig);
                if (iArr[1] == 0 && com.speech.vadsdk.processor.a.c >= startTipTime) {
                    String simpleName5 = aVar.getClass().getSimpleName();
                    h.a((Object) simpleName5, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb7 = new StringBuilder("[");
                        sb7.append(simpleName5);
                        sb7.append(']');
                    }
                    a.InterfaceC1422a interfaceC1422a = com.speech.vadsdk.processor.a.b;
                    if (interfaceC1422a != null) {
                        interfaceC1422a.a(0, 0, com.speech.vadsdk.processor.a.c, a3);
                    }
                }
                if (a2 > 0) {
                    int i = a2 >= 2 ? iArr[a2 - 2] * 10 : 0;
                    int i2 = a2 - 1;
                    int i3 = iArr[i2] * 10;
                    int i4 = com.speech.vadsdk.processor.a.c - i3;
                    StringBuilder sb8 = new StringBuilder("[LocalVAD]computeVad globalTimeStamp=");
                    sb8.append(com.speech.vadsdk.processor.a.c);
                    sb8.append(",lastSpeechTime=");
                    sb8.append(i4);
                    sb8.append(",endThreshold=");
                    sb8.append(a3);
                    String simpleName6 = aVar.getClass().getSimpleName();
                    h.a((Object) simpleName6, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb9 = new StringBuilder("[");
                        sb9.append(simpleName6);
                        sb9.append(']');
                    }
                    if (iArr[0] >= 0 && iArr[i2] > 0 && i4 >= a3) {
                        String simpleName7 = aVar.getClass().getSimpleName();
                        h.a((Object) simpleName7, "this::class.java.simpleName");
                        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                            StringBuilder sb10 = new StringBuilder("[");
                            sb10.append(simpleName7);
                            sb10.append(']');
                        }
                        a.InterfaceC1422a interfaceC1422a2 = com.speech.vadsdk.processor.a.b;
                        if (interfaceC1422a2 != null) {
                            interfaceC1422a2.b(i, i3, com.speech.vadsdk.processor.a.c, a3);
                        }
                    }
                }
            } else if (a2 > 0) {
                int wakeUpOffsetTime = vadConfig.getWakeUpOffsetTime();
                int wakeUpDrawlTime = vadConfig.getWakeUpDrawlTime();
                if (com.speech.vadsdk.processor.a.c >= wakeUpOffsetTime) {
                    int i5 = a2 - 1;
                    if (iArr[i5] > 0 && iArr[i5] != com.speech.vadsdk.processor.a.e) {
                        com.speech.vadsdk.processor.a.e = iArr[i5];
                    } else if (!com.speech.vadsdk.processor.a.d) {
                        com.speech.vadsdk.processor.a.d = true;
                        com.speech.vadsdk.processor.a.f = ((iArr[i5] * 10) - wakeUpOffsetTime) - com.speech.vadsdk.processor.a.a;
                    }
                    StringBuilder sb11 = new StringBuilder("[LocalVAD]computeVadForWakeUp isMuteStartLocal=");
                    sb11.append(com.speech.vadsdk.processor.a.d);
                    sb11.append(",drawlTimeLocal=");
                    sb11.append(com.speech.vadsdk.processor.a.f);
                    sb11.append(",wakeUpDrawlTime=");
                    sb11.append(wakeUpDrawlTime);
                    String simpleName8 = aVar.getClass().getSimpleName();
                    h.a((Object) simpleName8, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb12 = new StringBuilder("[");
                        sb12.append(simpleName8);
                        sb12.append(']');
                    }
                    int i6 = a2 >= 2 ? iArr[a2 - 2] * 10 : 0;
                    int i7 = iArr[i5] * 10;
                    int startTipTime2 = vadConfig.getStartTipTime();
                    int a4 = com.speech.vadsdk.processor.a.a(com.speech.vadsdk.processor.a.c, vadConfig);
                    int i8 = com.speech.vadsdk.processor.a.c - i7;
                    StringBuilder sb13 = new StringBuilder("[LocalVAD]computeVadForWakeUp speechTime=");
                    sb13.append(com.speech.vadsdk.processor.a.c);
                    sb13.append(",lastSpeechTime=");
                    sb13.append(i8);
                    sb13.append(",startThreshold=");
                    sb13.append(startTipTime2);
                    sb13.append(",endThreshold=");
                    sb13.append(a4);
                    String simpleName9 = aVar.getClass().getSimpleName();
                    h.a((Object) simpleName9, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb14 = new StringBuilder("[");
                        sb14.append(simpleName9);
                        sb14.append(']');
                    }
                    if (com.speech.vadsdk.processor.a.d) {
                        if (com.speech.vadsdk.processor.a.f <= wakeUpDrawlTime) {
                            if (iArr[2] == 0 && i8 >= startTipTime2) {
                                String simpleName10 = aVar.getClass().getSimpleName();
                                h.a((Object) simpleName10, "this::class.java.simpleName");
                                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                                    StringBuilder sb15 = new StringBuilder("[");
                                    sb15.append(simpleName10);
                                    sb15.append(']');
                                }
                                a.InterfaceC1422a interfaceC1422a3 = com.speech.vadsdk.processor.a.b;
                                if (interfaceC1422a3 != null) {
                                    interfaceC1422a3.a(i6, i7, com.speech.vadsdk.processor.a.c, a4);
                                }
                            }
                            if (iArr[2] > 0 && iArr[i5] > 0 && i8 >= a4) {
                                String simpleName11 = aVar.getClass().getSimpleName();
                                h.a((Object) simpleName11, "this::class.java.simpleName");
                                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                                    StringBuilder sb16 = new StringBuilder("[");
                                    sb16.append(simpleName11);
                                    sb16.append(']');
                                }
                                a.InterfaceC1422a interfaceC1422a4 = com.speech.vadsdk.processor.a.b;
                                if (interfaceC1422a4 != null) {
                                    interfaceC1422a4.b(i6, i7, com.speech.vadsdk.processor.a.c, a4);
                                }
                            }
                        } else if (iArr[2] >= 0 && iArr[i5] > 0 && i8 >= a4) {
                            String simpleName12 = aVar.getClass().getSimpleName();
                            h.a((Object) simpleName12, "this::class.java.simpleName");
                            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                                StringBuilder sb17 = new StringBuilder("[");
                                sb17.append(simpleName12);
                                sb17.append(']');
                            }
                            a.InterfaceC1422a interfaceC1422a5 = com.speech.vadsdk.processor.a.b;
                            if (interfaceC1422a5 != null) {
                                interfaceC1422a5.b(i6, i7, com.speech.vadsdk.processor.a.c, a4);
                            }
                        }
                    }
                }
            }
            String simpleName13 = aVar.getClass().getSimpleName();
            h.a((Object) simpleName13, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb18 = new StringBuilder("[");
                sb18.append(simpleName13);
                sb18.append(']');
            }
            g.a("[VAD]resLen=" + a2);
            String simpleName14 = getClass().getSimpleName();
            h.a((Object) simpleName14, "this::class.java.simpleName");
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                StringBuilder sb19 = new StringBuilder("[");
                sb19.append(simpleName14);
                sb19.append(']');
            }
            if (a2 < 0) {
                IVadCallback callback = vadConfig.getCallback();
                if (callback != null) {
                    callback.failed(a2, "VAD引擎错误");
                }
                com.speech.vadsdk.log.a.b(str, this.sessionId, a2, "VAD引擎错误--" + a2);
            }
            return sArr;
        } catch (Exception e) {
            StringBuilder sb20 = new StringBuilder();
            sb20.append(e.toString() + "\n");
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                sb20.append(stackTraceElement.toString() + "\n");
            }
            String sb21 = sb20.toString();
            h.a((Object) sb21, "sb.toString()");
            IVadCallback callback2 = vadConfig.getCallback();
            if (callback2 != null) {
                callback2.failed(10003, sb21);
            }
            com.speech.vadsdk.log.a.b(str, this.sessionId, 10003, sb21);
            String str2 = "[VAD]Failed!" + sb21;
            String simpleName15 = getClass().getSimpleName();
            if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                Log.e("[" + simpleName15 + ']', str2);
            }
            return sArr;
        }
    }

    @Keep
    public final void setConfig(@NotNull String str, @NotNull VadConfig vadConfig) {
        h.b(str, "appKey");
        h.b(vadConfig, "vadConfig");
        this.configs.put(str, vadConfig);
        com.speech.vadsdk.log.a.a(str, vadConfig);
    }

    @Keep
    public final void destroyConfig(@NotNull String str) {
        h.b(str, "appKey");
        this.configs.remove(str);
    }

    @Override // com.meituan.ai.speech.base.processor.IVadProcessor
    @Nullable
    public final IVadConfig getVadConfig(@NotNull String str) {
        h.b(str, "appKey");
        return this.configs.get(str);
    }

    @Override // com.meituan.ai.speech.base.processor.IVadProcessor
    @Keep
    public final void onStart(@NotNull String str, @NotNull String str2) {
        IVadCallback callback;
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        this.sessionId = str2;
        com.speech.vadsdk.log.a.a(str, str2);
        VadConfig vadConfig = this.configs.get(str);
        if (b.b()) {
            if (vadConfig != null) {
                vadConfig.onStart();
                com.speech.vadsdk.processor.a aVar = com.speech.vadsdk.processor.a.k;
                com.speech.vadsdk.processor.a.a(new a(vadConfig, str, str2));
                return;
            }
            return;
        }
        String simpleName2 = getClass().getSimpleName();
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
            Log.e("[" + simpleName2 + ']', "[VAD]Start Failed! NativeVad Init Failed. Model data can't be loaded!");
        }
        if (vadConfig != null && (callback = vadConfig.getCallback()) != null) {
            callback.failed(10001, VadError.INIT_FAILED_MESSAGE_FOR_LOAD_ERROR);
        }
        com.speech.vadsdk.log.a.b(str, str2, 10001, VadError.INIT_FAILED_MESSAGE_FOR_LOAD_ERROR);
    }

    @Override // com.meituan.ai.speech.base.processor.IVadProcessor
    @Keep
    public final void onEnd(@NotNull String str) {
        h.b(str, "appKey");
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(simpleName);
            sb.append(']');
        }
        com.speech.vadsdk.log.a.b(str, this.sessionId);
        com.speech.vadsdk.processor.a aVar = com.speech.vadsdk.processor.a.k;
        com.speech.vadsdk.processor.a.a();
        com.speech.vadsdk.processor.a aVar2 = com.speech.vadsdk.processor.a.k;
        com.speech.vadsdk.processor.a.b();
        String simpleName2 = getClass().getSimpleName();
        h.a((Object) simpleName2, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(simpleName2);
            sb2.append(']');
        }
    }
}
