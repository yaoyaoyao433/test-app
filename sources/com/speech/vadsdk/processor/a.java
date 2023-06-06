package com.speech.vadsdk.processor;

import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.data.ServerVadInfo;
import com.meituan.ai.speech.base.processor.callback.IVadCallback;
import com.speech.vadsdk.nativelib.b;
import com.speech.vadsdk.processor.VadConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001/B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J;\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00042\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\u0002\u0010'JC\u0010(\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00042\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010,\u001a\u00020\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010-\u001a\u00020\u001fJ\u0006\u0010.\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/speech/vadsdk/processor/VadComputed;", "", "()V", "MIN_RESULT_LEN", "", "RESULT_LEN", "WAKEUP_END_BUFFER_SIZE", "drawlTimeLocal", "drawlTimeServer", "globalTimeStamp", "isMuteStartLocal", "", "isMuteStartServer", "isNewVoiceServer", "listener", "Lcom/speech/vadsdk/processor/VadComputed$ModelVadListener;", "resultLastLocal", "resultLastServer", "computeVad", "vadConfig", "Lcom/speech/vadsdk/processor/VadConfig;", "wav", "", "lastPackage", "result", "", "resultLength", "computeVadLocal", "ret", "computeVadLocalForWakeUp", "computeVadServer", "", "appKey", "", "sessionId", "speechTime", "vad_info", "", "Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/speech/vadsdk/processor/VadConfig;I[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;)V", "computeVadServerForWakeUp", "wakeUpOffsetTime", "(Ljava/lang/String;Ljava/lang/String;Lcom/speech/vadsdk/processor/VadConfig;I[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;I)V", "getEndTipTime", "setModelVadListener", "vadLocalReset", "vadServerReset", "ModelVadListener", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class a {
    static InterfaceC1422a b;
    static int c;
    static boolean d;
    static int e;
    static int f;
    static boolean g;
    static boolean h;
    static int i;
    static int j;
    public static final a k = new a();
    static final int a = 100;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/speech/vadsdk/processor/VadComputed$ModelVadListener;", "", "endStop", "", "startTime", "", "endTime", "speechTime", "endTipTime", "startStop", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.speech.vadsdk.processor.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1422a {
        void a(int i, int i2, int i3, int i4);

        void b(int i, int i2, int i3, int i4);
    }

    private a() {
    }

    public static void a(@Nullable InterfaceC1422a interfaceC1422a) {
        b = interfaceC1422a;
    }

    public final void a(@NotNull String str, @NotNull String str2, @NotNull VadConfig vadConfig, int i2, @Nullable ServerVadInfo[] serverVadInfoArr) {
        h.b(str, "appKey");
        h.b(str2, "sessionId");
        h.b(vadConfig, "vadConfig");
        int startTipTime = vadConfig.getStartTipTime();
        int a2 = a(i2, vadConfig);
        if (serverVadInfoArr != null) {
            if (!(serverVadInfoArr.length == 0)) {
                if (vadConfig.isTipEndPoint$speech_vad_commonRelease().get()) {
                    return;
                }
                int length = serverVadInfoArr.length;
                int i3 = length - 1;
                int start = serverVadInfoArr[i3].getStart();
                int end = serverVadInfoArr[i3].getEnd();
                g.a("[ServerVad]computeVad,endTipTime=" + a2 + ",speechTime=" + i2 + ",endVadTime=" + end + ",size=" + length);
                String simpleName = getClass().getSimpleName();
                h.a((Object) simpleName, "this::class.java.simpleName");
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(simpleName);
                    sb.append(']');
                }
                if (i2 - end >= a2) {
                    vadConfig.isTipEndPoint$speech_vad_commonRelease().set(true);
                    IVadCallback callback = vadConfig.getCallback();
                    if (callback != null) {
                        callback.onEnd(false);
                    }
                    com.speech.vadsdk.log.a.a(str, str2, start, end, i2, a2, 1, 1);
                    String simpleName2 = getClass().getSimpleName();
                    h.a((Object) simpleName2, "this::class.java.simpleName");
                    if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
                        StringBuilder sb2 = new StringBuilder("[");
                        sb2.append(simpleName2);
                        sb2.append(']');
                        return;
                    }
                    return;
                }
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder("[ServerVad]computeVad,First Point,startTipTime=");
        sb3.append(startTipTime);
        sb3.append("，speechTime=");
        sb3.append(i2);
        String simpleName3 = getClass().getSimpleName();
        h.a((Object) simpleName3, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb4 = new StringBuilder("[");
            sb4.append(simpleName3);
            sb4.append(']');
        }
        if (i2 < startTipTime || vadConfig.isTipStartPoint$speech_vad_commonRelease().get()) {
            return;
        }
        vadConfig.isTipStartPoint$speech_vad_commonRelease().set(true);
        IVadCallback callback2 = vadConfig.getCallback();
        if (callback2 != null) {
            callback2.onStart(false);
        }
        com.speech.vadsdk.log.a.a(str, str2, 0, 0, i2, a2, 0, 1);
        String simpleName4 = getClass().getSimpleName();
        h.a((Object) simpleName4, "this::class.java.simpleName");
        if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.WARN.getValue()) {
            StringBuilder sb5 = new StringBuilder("[");
            sb5.append(simpleName4);
            sb5.append(']');
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i2, VadConfig vadConfig) {
        List<VadConfig.DynamicVadInfo> endThresholdDynamicList = vadConfig.getEndThresholdDynamicList();
        if (endThresholdDynamicList == null) {
            return vadConfig.getEndTipTime();
        }
        for (int size = endThresholdDynamicList.size() - 1; size >= 0; size--) {
            int speechTime = endThresholdDynamicList.get(size).getSpeechTime();
            int endTipTime = endThresholdDynamicList.get(size).getEndTipTime();
            if (vadConfig.getWakeUpOffsetTime() < 0) {
                if (i2 > speechTime) {
                    return endTipTime;
                }
            } else if (i2 - vadConfig.getWakeUpOffsetTime() > speechTime) {
                return endTipTime;
            }
        }
        return vadConfig.getEndTipTime();
    }

    public static void a() {
        c = 0;
        e = 0;
        f = 0;
        d = false;
        if (b.b()) {
            b.a().a();
        }
    }

    public static void b() {
        g = false;
        h = false;
        i = 0;
        j = 0;
    }
}
