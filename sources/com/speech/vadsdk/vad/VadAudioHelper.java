package com.speech.vadsdk.vad;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.android.common.badge.Strategy;
import com.speech.vadsdk.custom.CustomModelHelper;
import com.speech.vadsdk.nativelib.b;
import com.speech.vadsdk.nativelib.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/speech/vadsdk/vad/VadAudioHelper;", "", "()V", "isProcessing", "", "transmitAudioLength", "", "initVADInstance", "", "context", "Landroid/content/Context;", "appKey", "", "processVadAudioData", "", "contentShort", "", "stopProcessVadAudioData", "Companion", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class VadAudioHelper {
    public static final a Companion = new a(null);
    @NotNull
    public static final String TAG = "VadAudioHelper";
    private boolean isProcessing;
    private final int transmitAudioLength = Strategy.DEFAULT_MAX_AUTO_SYNC_INTERVAL;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/speech/vadsdk/vad/VadAudioHelper$Companion;", "", "()V", "TAG", "", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public final void initVADInstance(@NotNull Context context, @NotNull String str) {
        byte[] vADModelData;
        h.b(context, "context");
        h.b(str, "appKey");
        if (b.b() || (vADModelData = CustomModelHelper.getVADModelData(context)) == null) {
            return;
        }
        b.a(str, vADModelData, vADModelData.length);
    }

    @Nullable
    public final int[] processVadAudioData(@NotNull short[] sArr) {
        int i;
        short[] sArr2;
        Integer num;
        h.b(sArr, "contentShort");
        if (!this.isProcessing && b.b()) {
            int length = sArr.length;
            if (length % this.transmitAudioLength == 0) {
                i = length / this.transmitAudioLength;
            } else {
                i = (length / this.transmitAudioLength) + 1;
            }
            this.isProcessing = true;
            int[] iArr = new int[200];
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
                c a3 = b.a();
                if (a3 != null) {
                    sArr2 = a2;
                    num = Integer.valueOf(a3.a(a2, a2.length, 16000, i2 == i + (-1), iArr, 200));
                } else {
                    sArr2 = a2;
                    num = null;
                }
                StringBuilder sb = new StringBuilder("process, size=");
                sb.append(sArr2.length);
                sb.append(", ret=");
                sb.append(num);
                Thread.sleep(100L);
                i2++;
            }
            this.isProcessing = false;
            c a4 = b.a();
            if (a4 != null) {
                a4.a();
            }
            return iArr;
        }
        return null;
    }

    public final void stopProcessVadAudioData() {
        this.isProcessing = false;
    }
}
