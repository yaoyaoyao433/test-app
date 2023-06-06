package com.speech.vadsdk.wakeup;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Keep;
import android.util.Log;
import com.speech.vadsdk.custom.CustomModelHelper;
import com.speech.vadsdk.nativelib.d;
import com.speech.vadsdk.nativelib.data.WakeUpResultJni;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class WakeUpProcessor {
    private static final String SUPPORT_CPU_ARM_V7 = "armeabi-v7a";
    private static final String SUPPORT_CPU_ARM_V8 = "arm64-v8a";
    private static final String TAG = "WakeUpProcessor";
    private boolean isSupportArm;
    private WakeUpProcessListener listener;
    private d mInterface;
    private final boolean isSaveEngineLog = false;
    private final String saveEnginePath = "";

    public WakeUpProcessor(Context context, String str) {
        byte[] wakeUpModelData;
        checkSupportCpu();
        if (!this.isSupportArm || (wakeUpModelData = CustomModelHelper.getWakeUpModelData(context)) == null) {
            return;
        }
        this.mInterface = com.speech.vadsdk.nativelib.b.b(str, wakeUpModelData, wakeUpModelData.length);
    }

    private void checkSupportCpu() {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_ABIS) {
                if (SUPPORT_CPU_ARM_V7.equals(str) || SUPPORT_CPU_ARM_V8.equals(str)) {
                    this.isSupportArm = true;
                    return;
                }
            }
        } else if (SUPPORT_CPU_ARM_V7.equals(Build.CPU_ABI) || SUPPORT_CPU_ARM_V7.equals(Build.CPU_ABI2) || SUPPORT_CPU_ARM_V8.equals(Build.CPU_ABI) || SUPPORT_CPU_ARM_V8.equals(Build.CPU_ABI2)) {
            this.isSupportArm = true;
        }
    }

    public int process(@NotNull short[] sArr, int i) {
        if (!this.isSupportArm) {
            return b.p.a;
        }
        if (this.mInterface == null) {
            return b.n.a;
        }
        return this.mInterface.a(sArr, sArr.length, i, false);
    }

    public int setWakeUpThreshold(float f) {
        if (this.mInterface == null) {
            return b.n.a;
        }
        if (f <= 0.0f || f > 1.0f) {
            return b.o.a;
        }
        return this.mInterface.a(f);
    }

    public void reset() {
        d dVar = this.mInterface;
        dVar.a.nativeResetWakeUp();
        dVar.a.setWakeUpListener(null);
    }

    public void setListener(final int i, WakeUpProcessListener wakeUpProcessListener) {
        this.listener = wakeUpProcessListener;
        com.speech.vadsdk.nativelib.b.a(new com.speech.vadsdk.nativelib.a() { // from class: com.speech.vadsdk.wakeup.WakeUpProcessor.1
            @Override // com.speech.vadsdk.nativelib.a
            public final void a(WakeUpResultJni wakeUpResultJni) {
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
                if (WakeUpProcessor.this.listener != null) {
                    WakeUpResult wakeUpResult = new WakeUpResult();
                    wakeUpResult.setType(i);
                    wakeUpResult.setKeywordId(wakeUpResultJni.keywordId);
                    wakeUpResult.setScore(wakeUpResultJni.score);
                    wakeUpResult.setStartTime(wakeUpResultJni.startTime);
                    wakeUpResult.setEndTime(wakeUpResultJni.endTime);
                    wakeUpResult.setStartOffset(wakeUpResultJni.startOffset);
                    wakeUpResult.setEndOffset(wakeUpResultJni.endOffset);
                    wakeUpResult.setKeyword(wakeUpResultJni.keyword);
                    wakeUpResult.setKeywordPinyin(wakeUpResultJni.keywordPinyin);
                    WakeUpProcessor.this.listener.onProcessWakeUp(wakeUpResult);
                }
            }

            @Override // com.speech.vadsdk.nativelib.a
            public final void a(com.speech.vadsdk.nativelib.data.a aVar) {
                Log.e(WakeUpProcessor.TAG, "DEBUG INFO: engineIsLast=" + aVar.a + "\n wavDataLen=" + aVar.b + "\n bufferDataLen=+" + aVar.c + "\n totalBufferDataLen=+" + aVar.d + "\n segmentStartLen=+" + aVar.e + "\n vadResult=+" + aVar.f + "\n wakeupNumFrame=+" + aVar.g + "\n wakeupThreshold=+" + aVar.h + "\n decocdeCurrentTokenNum=+" + aVar.i + "\n decocdeCurrCutoff=+" + aVar.j + "\n decocdeNextCutoff=+" + aVar.k + "\n decocdeNumFrames=+" + aVar.l + "\n decocdeBeam=+" + aVar.m + "\n decocdeTracePoolLeft=+" + aVar.n);
            }
        });
    }

    public boolean checkEngineIsNull() {
        return this.mInterface == null;
    }

    public int getDebugInfo() {
        if (checkEngineIsNull()) {
            return b.n.a;
        }
        return this.mInterface.a.getDebugInfo(-100010101);
    }
}
