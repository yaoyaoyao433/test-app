package com.meituan.ai.speech.base.sdk;

import android.support.annotation.Keep;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\"\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u0011\u0010$\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0006R\u0011\u0010&\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0006R$\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR$\u00102\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019R$\u0010;\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\b¨\u0006?"}, d2 = {"Lcom/meituan/ai/speech/base/sdk/AsrConfig;", "", "()V", "asrModel", "", "getAsrModel", "()I", "setAsrModel", "(I)V", "asrSoundModel", "getAsrSoundModel", "asrSubModelId", "getAsrSubModelId", "setAsrSubModelId", "bizData", "", "getBizData", "()Ljava/lang/String;", "setBizData", "(Ljava/lang/String;)V", "checkUltrashortAudio", "", "getCheckUltrashortAudio", "()Z", "setCheckUltrashortAudio", "(Z)V", "isIgnoreTempResult", "setIgnoreTempResult", "isNeedPunctuation", "setNeedPunctuation", "isNormalizeText", "setNormalizeText", "isSupportCodec", "setSupportCodec", "isSupportVad16", "setSupportVad16", "language", "getLanguage", "languageType", "getLanguageType", "value", "", "rate", "getRate", "()F", "setRate", "(F)V", "recordSoundMaxTime", "getRecordSoundMaxTime", "setRecordSoundMaxTime", "resultCount", "getResultCount", "setResultCount", KnbConstants.PARAMS_SCENE, "getScene", "setScene", "shouldAutoStopAfterOvertime", "getShouldAutoStopAfterOvertime", "setShouldAutoStopAfterOvertime", "transmitAudioLength", "getTransmitAudioLength", "setTransmitAudioLength", "Companion", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class AsrConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int defaultAsrModel;
    private static int defaultAsrSoundModel;
    private static int defaultAsrSubModelId;
    private static int defaultIsIgnoreTempResult;
    private static int defaultIsNeedPunctuation;
    private static int defaultIsNormalizeText;
    private static int defaultLanguage;
    private static int defaultLanguageType;
    private int asrModel;
    private final int asrSoundModel;
    private int asrSubModelId;
    @Nullable
    private String bizData;
    private boolean checkUltrashortAudio;
    private int isIgnoreTempResult;
    private int isNeedPunctuation;
    private int isNormalizeText;
    private boolean isSupportCodec;
    private boolean isSupportVad16;
    private final int language;
    private final int languageType;
    private float rate;
    private int recordSoundMaxTime;
    private int resultCount;
    private int scene;
    private boolean shouldAutoStopAfterOvertime;
    private int transmitAudioLength;
    public static final Companion Companion = new Companion(null);
    private static int defaultRecordSoundMaxTime = 60000;
    private static int defaultTransmitAudioLength = 200;

    public AsrConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "480d08ab254e7da9c5819aabd93c5f40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "480d08ab254e7da9c5819aabd93c5f40");
            return;
        }
        this.transmitAudioLength = defaultTransmitAudioLength;
        this.resultCount = 1;
        this.asrModel = defaultAsrModel;
        this.asrSoundModel = defaultAsrSoundModel;
        this.asrSubModelId = defaultAsrSubModelId;
        this.isIgnoreTempResult = defaultIsIgnoreTempResult;
        this.isNeedPunctuation = defaultIsNeedPunctuation;
        this.isNormalizeText = defaultIsNormalizeText;
        this.languageType = defaultLanguageType;
        this.language = defaultLanguage;
        this.recordSoundMaxTime = defaultRecordSoundMaxTime;
        this.checkUltrashortAudio = true;
        this.rate = 16000.0f;
        this.shouldAutoStopAfterOvertime = true;
    }

    /* compiled from: ProGuard */
    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/meituan/ai/speech/base/sdk/AsrConfig$Companion;", "", "()V", "defaultAsrModel", "", "getDefaultAsrModel", "()I", "setDefaultAsrModel", "(I)V", "defaultAsrSoundModel", "getDefaultAsrSoundModel", "setDefaultAsrSoundModel", "defaultAsrSubModelId", "getDefaultAsrSubModelId", "setDefaultAsrSubModelId", "defaultIsIgnoreTempResult", "getDefaultIsIgnoreTempResult", "setDefaultIsIgnoreTempResult", "defaultIsNeedPunctuation", "getDefaultIsNeedPunctuation", "setDefaultIsNeedPunctuation", "defaultIsNormalizeText", "getDefaultIsNormalizeText", "setDefaultIsNormalizeText", "defaultLanguage", "getDefaultLanguage", "setDefaultLanguage", "defaultLanguageType", "getDefaultLanguageType", "setDefaultLanguageType", "defaultRecordSoundMaxTime", "getDefaultRecordSoundMaxTime", "setDefaultRecordSoundMaxTime", "defaultTransmitAudioLength", "getDefaultTransmitAudioLength", "setDefaultTransmitAudioLength", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final int getDefaultAsrModel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f4c4090f3823c22c91b80e449c9cb56", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f4c4090f3823c22c91b80e449c9cb56")).intValue() : AsrConfig.defaultAsrModel;
        }

        public final void setDefaultAsrModel(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad8f8705a618b2396df14a33535517cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad8f8705a618b2396df14a33535517cd");
            } else {
                AsrConfig.defaultAsrModel = i;
            }
        }

        public final int getDefaultAsrSubModelId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cba6d855948dc7a7f8f4e5d0ee1ee7a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cba6d855948dc7a7f8f4e5d0ee1ee7a")).intValue() : AsrConfig.defaultAsrSubModelId;
        }

        public final void setDefaultAsrSubModelId(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df146e6f62b7e6f2c773990775f43f68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df146e6f62b7e6f2c773990775f43f68");
            } else {
                AsrConfig.defaultAsrSubModelId = i;
            }
        }

        public final int getDefaultAsrSoundModel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d2dbebad4abb18fa8702a80756d5796", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d2dbebad4abb18fa8702a80756d5796")).intValue() : AsrConfig.defaultAsrSoundModel;
        }

        public final void setDefaultAsrSoundModel(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "702080963bcb42ce1bcc7ff5a706c3f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "702080963bcb42ce1bcc7ff5a706c3f3");
            } else {
                AsrConfig.defaultAsrSoundModel = i;
            }
        }

        public final int getDefaultIsIgnoreTempResult() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22e14abbe1bd8fe235a074ba297a6724", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22e14abbe1bd8fe235a074ba297a6724")).intValue() : AsrConfig.defaultIsIgnoreTempResult;
        }

        public final void setDefaultIsIgnoreTempResult(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "842bca9cd77a34e8611556546d860552", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "842bca9cd77a34e8611556546d860552");
            } else {
                AsrConfig.defaultIsIgnoreTempResult = i;
            }
        }

        public final int getDefaultIsNeedPunctuation() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4118ec48079bc375392217af557474b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4118ec48079bc375392217af557474b")).intValue() : AsrConfig.defaultIsNeedPunctuation;
        }

        public final void setDefaultIsNeedPunctuation(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "755556769d00f2071e74a74c6fcb6620", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "755556769d00f2071e74a74c6fcb6620");
            } else {
                AsrConfig.defaultIsNeedPunctuation = i;
            }
        }

        public final int getDefaultIsNormalizeText() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04874994d6fed80c86f3c434d5feb338", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04874994d6fed80c86f3c434d5feb338")).intValue() : AsrConfig.defaultIsNormalizeText;
        }

        public final void setDefaultIsNormalizeText(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e629f39dd4b9dce7f40bb3cc00c36c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e629f39dd4b9dce7f40bb3cc00c36c7");
            } else {
                AsrConfig.defaultIsNormalizeText = i;
            }
        }

        public final int getDefaultLanguageType() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b1756de0d988386bfa4f7515e8f669e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b1756de0d988386bfa4f7515e8f669e")).intValue() : AsrConfig.defaultLanguageType;
        }

        public final void setDefaultLanguageType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3457b319c93f7504ca3a586824a2b7e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3457b319c93f7504ca3a586824a2b7e5");
            } else {
                AsrConfig.defaultLanguageType = i;
            }
        }

        public final int getDefaultLanguage() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f98cb5290a25f5af2095def42742c7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f98cb5290a25f5af2095def42742c7")).intValue() : AsrConfig.defaultLanguage;
        }

        public final void setDefaultLanguage(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcc9d2ba1263039a24699d216c1177c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcc9d2ba1263039a24699d216c1177c5");
            } else {
                AsrConfig.defaultLanguage = i;
            }
        }

        public final int getDefaultRecordSoundMaxTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daa969decb4070bcfca77c056652f6a2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daa969decb4070bcfca77c056652f6a2")).intValue() : AsrConfig.defaultRecordSoundMaxTime;
        }

        public final void setDefaultRecordSoundMaxTime(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3c26f642a6ad641aa874d77de07e8f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3c26f642a6ad641aa874d77de07e8f7");
            } else {
                AsrConfig.defaultRecordSoundMaxTime = i;
            }
        }

        public final int getDefaultTransmitAudioLength() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97aea743fcc06bc0228f4f1fde4890cf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97aea743fcc06bc0228f4f1fde4890cf")).intValue() : AsrConfig.defaultTransmitAudioLength;
        }

        public final void setDefaultTransmitAudioLength(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aca1e8da583d5c618331c589cc4be9f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aca1e8da583d5c618331c589cc4be9f7");
            } else {
                AsrConfig.defaultTransmitAudioLength = i;
            }
        }
    }

    public final int getTransmitAudioLength() {
        return this.transmitAudioLength;
    }

    public final void setTransmitAudioLength(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc7579481fdaeaf8e0e5a862b6a2a41b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc7579481fdaeaf8e0e5a862b6a2a41b");
        } else if (i < 200) {
            throw new RuntimeException("16k采样率语音传输时长要大于200毫秒");
        } else {
            this.transmitAudioLength = i;
        }
    }

    public final int getResultCount() {
        return this.resultCount;
    }

    public final void setResultCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "426bbf9d1e0584f3830d97718daf4aa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "426bbf9d1e0584f3830d97718daf4aa0");
        } else if (i > 0 && 10 >= i) {
            this.resultCount = i;
        } else {
            throw new RuntimeException("resultCount值域[1,10]");
        }
    }

    public final int getAsrModel() {
        return this.asrModel;
    }

    public final void setAsrModel(int i) {
        this.asrModel = i;
    }

    public final int getAsrSoundModel() {
        return this.asrSoundModel;
    }

    public final int getAsrSubModelId() {
        return this.asrSubModelId;
    }

    public final void setAsrSubModelId(int i) {
        this.asrSubModelId = i;
    }

    public final int isIgnoreTempResult() {
        return this.isIgnoreTempResult;
    }

    public final void setIgnoreTempResult(int i) {
        this.isIgnoreTempResult = i;
    }

    public final int isNeedPunctuation() {
        return this.isNeedPunctuation;
    }

    public final void setNeedPunctuation(int i) {
        this.isNeedPunctuation = i;
    }

    public final int isNormalizeText() {
        return this.isNormalizeText;
    }

    public final void setNormalizeText(int i) {
        this.isNormalizeText = i;
    }

    public final int getLanguageType() {
        return this.languageType;
    }

    public final int getLanguage() {
        return this.language;
    }

    public final int getRecordSoundMaxTime() {
        return this.recordSoundMaxTime;
    }

    public final void setRecordSoundMaxTime(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4728a6430bb5dba34667eeaff7090752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4728a6430bb5dba34667eeaff7090752");
        } else if ((i > 0 && 999 >= i) || i > defaultRecordSoundMaxTime) {
            throw new RuntimeException("录制时间设定范围在[1000, " + defaultRecordSoundMaxTime + "].");
        } else {
            this.recordSoundMaxTime = i;
        }
    }

    @Nullable
    public final String getBizData() {
        return this.bizData;
    }

    public final void setBizData(@Nullable String str) {
        this.bizData = str;
    }

    public final boolean getCheckUltrashortAudio() {
        return this.checkUltrashortAudio;
    }

    public final void setCheckUltrashortAudio(boolean z) {
        this.checkUltrashortAudio = z;
    }

    public final float getRate() {
        return this.rate;
    }

    public final void setRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "220a4c7e661e675089d60b47f596af1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "220a4c7e661e675089d60b47f596af1a");
        } else if (f == 16000.0f || f == 8000.0f) {
            this.rate = f;
        } else {
            throw new RuntimeException("语音识别只支持16000或8000的采样率");
        }
    }

    public final boolean isSupportVad16() {
        return this.isSupportVad16;
    }

    public final void setSupportVad16(boolean z) {
        this.isSupportVad16 = z;
    }

    public final boolean isSupportCodec() {
        return this.isSupportCodec;
    }

    public final void setSupportCodec(boolean z) {
        this.isSupportCodec = z;
    }

    public final boolean getShouldAutoStopAfterOvertime() {
        return this.shouldAutoStopAfterOvertime;
    }

    public final void setShouldAutoStopAfterOvertime(boolean z) {
        this.shouldAutoStopAfterOvertime = z;
    }

    public final int getScene() {
        return this.scene;
    }

    public final void setScene(int i) {
        this.scene = i;
    }
}
