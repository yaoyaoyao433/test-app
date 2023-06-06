package com.speech.vadsdk.wakeup;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.android.common.badge.Strategy;
import com.speech.vadsdk.custom.CustomModelHelper;
import com.speech.vadsdk.nativelib.d;
import com.speech.vadsdk.nativelib.data.WakeUpResultJni;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpAudioHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isProcessing", "", "mContext", "mWakeUpInterface", "Lcom/speech/vadsdk/nativelib/WakeUpInterface;", "transmitAudioLength", "", "initWakeUpInterface", "", "appKey", "", "wakeUpProcessListener", "Lcom/speech/vadsdk/wakeup/WakeUpProcessListener;", "processWakeUpAudioData", "contentShort", "", "setThreshold", "wakeUpThreshold", "", "stopProcessWakeUpAudioData", "Companion", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class WakeUpAudioHelper {
    public static final a Companion = new a(null);
    @NotNull
    public static final String TAG = "WakeUpAudioHelper";
    private boolean isProcessing;
    private Context mContext;
    private d mWakeUpInterface;
    private final int transmitAudioLength;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpAudioHelper$Companion;", "", "()V", "TAG", "", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public WakeUpAudioHelper(@NotNull Context context) {
        h.b(context, "context");
        Context applicationContext = context.getApplicationContext();
        h.a((Object) applicationContext, "context.applicationContext");
        this.mContext = applicationContext;
        this.transmitAudioLength = Strategy.DEFAULT_MAX_AUTO_SYNC_INTERVAL;
    }

    public final void initWakeUpInterface(@NotNull String str, @NotNull WakeUpProcessListener wakeUpProcessListener) {
        d b2;
        h.b(str, "appKey");
        h.b(wakeUpProcessListener, "wakeUpProcessListener");
        if (com.speech.vadsdk.nativelib.b.b()) {
            b2 = com.speech.vadsdk.nativelib.b.c();
        } else {
            byte[] wakeUpModelData = CustomModelHelper.getWakeUpModelData(this.mContext);
            if (wakeUpModelData == null) {
                h.a();
            }
            b2 = com.speech.vadsdk.nativelib.b.b(str, wakeUpModelData, wakeUpModelData.length);
        }
        this.mWakeUpInterface = b2;
        com.speech.vadsdk.nativelib.b.a(new b(wakeUpProcessListener));
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/speech/vadsdk/wakeup/WakeUpAudioHelper$initWakeUpInterface$1", "Lcom/speech/vadsdk/nativelib/INativeWakeUpListener;", "onDebugInfo", "", "debugInfoJni", "Lcom/speech/vadsdk/nativelib/data/EngineDebugInfoJni;", "onWakeUpResult", "resultJni", "Lcom/speech/vadsdk/nativelib/data/WakeUpResultJni;", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class b implements com.speech.vadsdk.nativelib.a {
        final /* synthetic */ WakeUpProcessListener a;

        b(WakeUpProcessListener wakeUpProcessListener) {
            this.a = wakeUpProcessListener;
        }

        @Override // com.speech.vadsdk.nativelib.a
        public final void a(@NotNull WakeUpResultJni wakeUpResultJni) {
            h.b(wakeUpResultJni, "resultJni");
            StringBuilder sb = new StringBuilder("onWakeUpResult---score = ");
            sb.append(wakeUpResultJni.score);
            sb.append(",startTime = ");
            sb.append(wakeUpResultJni.startTime);
            sb.append(",endTime = ");
            sb.append(wakeUpResultJni.endTime);
            sb.append(",startOffset = ");
            sb.append(wakeUpResultJni.startOffset);
            sb.append(",endOffset=");
            sb.append(wakeUpResultJni.endOffset);
            sb.append(",keywordId = ");
            sb.append(wakeUpResultJni.keywordId);
            sb.append(",keyword = ");
            sb.append(wakeUpResultJni.keyword);
            sb.append(",pinyin = ");
            sb.append(wakeUpResultJni.keywordPinyin);
            WakeUpResult wakeUpResult = new WakeUpResult();
            wakeUpResult.setType(1);
            wakeUpResult.setScore(wakeUpResultJni.score);
            wakeUpResult.setStartTime(wakeUpResultJni.startTime);
            wakeUpResult.setEndTime(wakeUpResultJni.endTime);
            wakeUpResult.setStartOffset(wakeUpResultJni.startOffset);
            wakeUpResult.setEndOffset(wakeUpResultJni.endOffset);
            wakeUpResult.setKeywordId(wakeUpResultJni.keywordId);
            wakeUpResult.setKeyword(wakeUpResultJni.keyword);
            wakeUpResult.setKeywordPinyin(wakeUpResultJni.keywordPinyin);
            this.a.onProcessWakeUp(wakeUpResult);
        }

        @Override // com.speech.vadsdk.nativelib.a
        public final void a(@NotNull com.speech.vadsdk.nativelib.data.a aVar) {
            h.b(aVar, "debugInfoJni");
            new StringBuilder("onDebugInfo, wavDataLen=").append(aVar.b);
        }
    }

    public final void setThreshold(float f) {
        d dVar = this.mWakeUpInterface;
        if (dVar == null) {
            h.a();
        }
        dVar.a(f);
    }

    public final void processWakeUpAudioData(@NotNull short[] sArr) {
        int i;
        h.b(sArr, "contentShort");
        if (this.isProcessing || this.mWakeUpInterface == null) {
            return;
        }
        int length = sArr.length;
        if (length % this.transmitAudioLength == 0) {
            i = length / this.transmitAudioLength;
        } else {
            i = (length / this.transmitAudioLength) + 1;
        }
        this.isProcessing = true;
        int i2 = 0;
        while (i2 < i) {
            new StringBuilder("process, index=").append(i2);
            if (!this.isProcessing) {
                break;
            }
            int i3 = length - (this.transmitAudioLength * i2);
            if (i3 >= this.transmitAudioLength) {
                i3 = this.transmitAudioLength;
            }
            short[] a2 = kotlin.collections.b.a(sArr, this.transmitAudioLength * i2, (this.transmitAudioLength * i2) + i3);
            d dVar = this.mWakeUpInterface;
            if (dVar == null) {
                h.a();
            }
            int a3 = dVar.a(a2, a2.length, 16000, i2 == i + (-1));
            StringBuilder sb = new StringBuilder("process, size=");
            sb.append(a2.length);
            sb.append(", ret=");
            sb.append(a3);
            Thread.sleep(150L);
            i2++;
        }
        this.isProcessing = false;
        d dVar2 = this.mWakeUpInterface;
        if (dVar2 == null) {
            h.a();
        }
        dVar2.a();
    }

    public final void stopProcessWakeUpAudioData() {
        this.isProcessing = false;
    }
}
