package com.speech.vadsdk.wakeup;

import android.support.annotation.Keep;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0002J5\u00102\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r`\u000fH\u0000¢\u0006\u0002\b3J\u001e\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0006\u00105\u001a\u00020\u000eH\u0002J\u0015\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u000eH\u0000¢\u0006\u0002\b7J\u0016\u00108\u001a\u0002092\u0006\u00105\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R6\u0010\u000b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010*R$\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020,@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006;"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpConfig;", "", "()V", "audioEncode", "", "getAudioEncode", "()I", "audioFormat", "getAudioFormat", "audioSource", "getAudioSource", "configWithKeyword", "Ljava/util/HashSet;", "", "", "Lkotlin/collections/HashSet;", "frequency", "getFrequency", "isAsrFilterKeyword", "", "()Z", "setAsrFilterKeyword", "(Z)V", "isSaveAudio", "setSaveAudio", "keepAlive", "getKeepAlive", "setKeepAlive", "needAudioDB", "getNeedAudioDB", "setNeedAudioDB", "privacySceneToken", "getPrivacySceneToken", "()Ljava/lang/String;", "setPrivacySceneToken", "(Ljava/lang/String;)V", "shouldInterruptAsrAfterWakeup", "getShouldInterruptAsrAfterWakeup", "setShouldInterruptAsrAfterWakeup", "type", "getType", "setType", "(I)V", "value", "", "wakeUpThreshold", "getWakeUpThreshold", "()F", "setWakeUpThreshold", "(F)V", "getConfigWithKeyword", "getConfigWithKeyword$speech_vad_commonRelease", "getMapByKeyword", "keyword", "getTypeByKeyword", "getTypeByKeyword$speech_vad_commonRelease", "setConfigWithKeyword", "", "Companion", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes6.dex */
public final class WakeUpConfig {
    public static final a Companion = new a(null);
    public static final int TYPE_ONLY_WAKEUP = 1;
    public static final int TYPE_WAKE_UP_AND_ASR = 2;
    private boolean isSaveAudio;
    private boolean needAudioDB;
    private boolean shouldInterruptAsrAfterWakeup;
    private final int audioSource = 1;
    private final int audioFormat = 16;
    private final int audioEncode = 2;
    private final int frequency = 16000;
    @NotNull
    private String privacySceneToken = "";
    private int type = 1;
    private boolean keepAlive = true;
    private boolean isAsrFilterKeyword = true;
    private float wakeUpThreshold = 0.85f;
    private HashSet<Map<String, Integer>> configWithKeyword = new HashSet<>();

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/speech/vadsdk/wakeup/WakeUpConfig$Companion;", "", "()V", "TYPE_ONLY_WAKEUP", "", "TYPE_WAKE_UP_AND_ASR", "speech-vad_commonRelease"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public final int getAudioSource() {
        return this.audioSource;
    }

    public final int getAudioFormat() {
        return this.audioFormat;
    }

    public final int getAudioEncode() {
        return this.audioEncode;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final String getPrivacySceneToken() {
        return this.privacySceneToken;
    }

    public final void setPrivacySceneToken(@NotNull String str) {
        h.b(str, "<set-?>");
        this.privacySceneToken = str;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final boolean getKeepAlive() {
        return this.keepAlive;
    }

    public final void setKeepAlive(boolean z) {
        this.keepAlive = z;
    }

    public final boolean getShouldInterruptAsrAfterWakeup() {
        return this.shouldInterruptAsrAfterWakeup;
    }

    public final void setShouldInterruptAsrAfterWakeup(boolean z) {
        this.shouldInterruptAsrAfterWakeup = z;
    }

    public final boolean isAsrFilterKeyword() {
        return this.isAsrFilterKeyword;
    }

    public final void setAsrFilterKeyword(boolean z) {
        this.isAsrFilterKeyword = z;
    }

    public final boolean isSaveAudio() {
        return this.isSaveAudio;
    }

    public final void setSaveAudio(boolean z) {
        this.isSaveAudio = z;
    }

    public final boolean getNeedAudioDB() {
        return this.needAudioDB;
    }

    public final void setNeedAudioDB(boolean z) {
        this.needAudioDB = z;
    }

    public final float getWakeUpThreshold() {
        return this.wakeUpThreshold;
    }

    public final void setWakeUpThreshold(float f) {
        if (f <= 1.0f || f > 0.0f) {
            this.wakeUpThreshold = f;
            return;
        }
        throw new RuntimeException("唤醒门限值范围在(0,1]");
    }

    public final void setConfigWithKeyword(@NotNull String str, int i) {
        h.b(str, "keyword");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i == 1 || i == 2) {
            Map<String, Integer> mapByKeyword = getMapByKeyword(str);
            if (mapByKeyword != null) {
                this.configWithKeyword.remove(mapByKeyword);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str, Integer.valueOf(i));
            this.configWithKeyword.add(hashMap);
        }
    }

    @NotNull
    public final HashSet<Map<String, Integer>> getConfigWithKeyword$speech_vad_commonRelease() {
        return this.configWithKeyword;
    }

    public final int getTypeByKeyword$speech_vad_commonRelease(@NotNull String str) {
        h.b(str, "keyword");
        Iterator<Map<String, Integer>> it = this.configWithKeyword.iterator();
        while (it.hasNext()) {
            Map<String, Integer> next = it.next();
            if (next.containsKey(str)) {
                Integer num = next.get(str);
                if (num == null) {
                    h.a();
                }
                return num.intValue();
            }
        }
        return -1;
    }

    private final Map<String, Integer> getMapByKeyword(String str) {
        Iterator<Map<String, Integer>> it = this.configWithKeyword.iterator();
        while (it.hasNext()) {
            Map<String, Integer> next = it.next();
            if (next.containsKey(str)) {
                return next;
            }
        }
        return null;
    }
}
