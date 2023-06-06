package com.meituan.ai.speech.base.privacy;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.android.privacy.interfaces.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0017\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0007J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0007J\b\u0010\u001a\u001a\u00020\u000fH\u0007J\b\u0010\u001b\u001a\u00020\u000fH\u0007J\b\u0010\u001c\u001a\u00020\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/meituan/ai/speech/base/privacy/PrivacySceneUtils;", "", "()V", "audioRecord", "Lcom/meituan/android/privacy/interfaces/MtAudioRecord;", "checkInitMtAudioRecord", "", "checkIsRecording", "checkRecordPermission", "", "context", "Landroid/content/Context;", "privacySceneToken", "", "createMtAudioRecord", "", "audioSource", "sampleRateInHz", "channelConfig", "audioFormat", "bufferSizeInBytes", "readMtAudioRecord", "audioData", "", "offsetInBytes", "sizeInBytes", "releaseMtAudioRecord", "startMtAudioRecord", "stopMtAudioRecord", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class PrivacySceneUtils {
    public static final PrivacySceneUtils INSTANCE = new PrivacySceneUtils();
    private static j audioRecord;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    public final void createMtAudioRecord(@NotNull String str, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "656152e7ab29deb4cfa2b8ba432b740d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "656152e7ab29deb4cfa2b8ba432b740d");
            return;
        }
        h.b(str, "privacySceneToken");
        audioRecord = Privacy.createAudioRecord(str, i, i2, i3, i4, i5);
    }

    @Keep
    public final boolean checkInitMtAudioRecord() {
        j jVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3669a7a3695dc32da2ae91d8e1638597", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3669a7a3695dc32da2ae91d8e1638597")).booleanValue() : (audioRecord == null || (jVar = audioRecord) == null || jVar.d() != 1) ? false : true;
    }

    @Keep
    public final boolean checkIsRecording() {
        j jVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3551535a0010c4c08894cefe18dd602a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3551535a0010c4c08894cefe18dd602a")).booleanValue() : checkInitMtAudioRecord() && (jVar = audioRecord) != null && jVar.f() == 3;
    }

    @Keep
    public final void startMtAudioRecord() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cd686fba196d65d89cb8326ee9ab1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cd686fba196d65d89cb8326ee9ab1e1");
            return;
        }
        j jVar = audioRecord;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Keep
    public final int readMtAudioRecord(@NotNull short[] sArr, int i, int i2) {
        Object[] objArr = {sArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99d88cd441144c69a54a52c38232a948", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99d88cd441144c69a54a52c38232a948")).intValue();
        }
        h.b(sArr, "audioData");
        j jVar = audioRecord;
        if (jVar == null) {
            h.a();
        }
        return jVar.a(sArr, i, i2);
    }

    @Keep
    public final void stopMtAudioRecord() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b857e08d7d36f46102709b392d3a965", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b857e08d7d36f46102709b392d3a965");
            return;
        }
        j jVar = audioRecord;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Keep
    public final void releaseMtAudioRecord() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cec92cf0ae83f59f5e808ea79bdb9892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cec92cf0ae83f59f5e808ea79bdb9892");
            return;
        }
        j jVar = audioRecord;
        if (jVar != null) {
            jVar.c();
        }
        audioRecord = null;
    }

    @Keep
    public final int checkRecordPermission(@NotNull Context context, @NotNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cdc16e67efbe511d6ce475f14d55881", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cdc16e67efbe511d6ce475f14d55881")).intValue();
        }
        h.b(context, "context");
        h.b(str, "privacySceneToken");
        e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard == null) {
            h.a();
        }
        return createPermissionGuard.a(context, PermissionGuard.PERMISSION_MICROPHONE, str);
    }
}
