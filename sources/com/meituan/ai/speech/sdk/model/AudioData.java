package com.meituan.ai.speech.sdk.model;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.sdk.RecogCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\fH\u0007J\u0010\u00108\u001a\u0002062\u0006\u00107\u001a\u00020\u0013H\u0007J\b\u00109\u001a\u000206H\u0007J\b\u0010:\u001a\u000206H\u0007J\b\u0010;\u001a\u00020\u0013H\u0007J\u001d\u0010<\u001a\u0004\u0018\u00010\u00132\f\u00107\u001a\b\u0012\u0004\u0012\u00020,0=H\u0007¢\u0006\u0002\u0010>R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bRF\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nj\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RF\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\nj\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b`\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001f\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001e\u0010/\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010#R\u001e\u00102\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\b¨\u0006?"}, d2 = {"Lcom/meituan/ai/speech/sdk/model/AudioData;", "", "()V", "area", "", "getArea", "()Ljava/lang/String;", "setArea", "(Ljava/lang/String;)V", "cacheCodecPerformDatas", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getCacheCodecPerformDatas", "()Ljava/util/HashMap;", "setCacheCodecPerformDatas", "(Ljava/util/HashMap;)V", "cacheVadPerformDatas", "", "getCacheVadPerformDatas", "setCacheVadPerformDatas", "callback", "Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "getCallback", "()Lcom/meituan/ai/speech/base/sdk/RecogCallback;", "setCallback", "(Lcom/meituan/ai/speech/base/sdk/RecogCallback;)V", "channel", "", "getChannel", "()I", "pktIndex", "getPktIndex", "setPktIndex", "(I)V", "rate", "", "getRate", "()F", "setRate", "(F)V", "recogData", "Ljava/util/concurrent/LinkedBlockingDeque;", "", "getRecogData", "()Ljava/util/concurrent/LinkedBlockingDeque;", "recogDataSize", "getRecogDataSize", "setRecogDataSize", "sessionId", "getSessionId", "setSessionId", "appendCodecCache", "", "data", "appendVadCache", "clearAudioDatas", "clearCacheData", "getLastAudioDatas", "getRecogAudioData", "", "([Ljava/lang/Short;)[S", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class AudioData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    @Nullable
    private String area;
    @Keep
    @NotNull
    private HashMap<String, List<byte[]>> cacheCodecPerformDatas;
    @Keep
    @NotNull
    private HashMap<String, List<short[]>> cacheVadPerformDatas;
    @Nullable
    private RecogCallback callback;
    @Keep
    private final int channel;
    @Keep
    private int pktIndex;
    @Keep
    private float rate;
    @Keep
    @NotNull
    private final LinkedBlockingDeque<Short> recogData;
    @Keep
    private int recogDataSize;
    @Keep
    @NotNull
    private String sessionId;

    public AudioData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7afa12225f9f6f116e8091981995a1c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7afa12225f9f6f116e8091981995a1c6");
            return;
        }
        this.rate = 16000.0f;
        this.sessionId = "";
        this.channel = 1;
        this.recogDataSize = 3200;
        this.recogData = new LinkedBlockingDeque<>();
        this.cacheVadPerformDatas = new HashMap<>();
        this.cacheCodecPerformDatas = new HashMap<>();
    }

    @Nullable
    public final RecogCallback getCallback() {
        return this.callback;
    }

    public final void setCallback(@Nullable RecogCallback recogCallback) {
        this.callback = recogCallback;
    }

    public final float getRate() {
        return this.rate;
    }

    public final void setRate(float f) {
        this.rate = f;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93d4597ed966f76ae0c2ae632adfc031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93d4597ed966f76ae0c2ae632adfc031");
            return;
        }
        h.b(str, "<set-?>");
        this.sessionId = str;
    }

    public final int getChannel() {
        return this.channel;
    }

    public final int getPktIndex() {
        return this.pktIndex;
    }

    public final void setPktIndex(int i) {
        this.pktIndex = i;
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    public final void setArea(@Nullable String str) {
        this.area = str;
    }

    public final int getRecogDataSize() {
        return this.recogDataSize;
    }

    public final void setRecogDataSize(int i) {
        this.recogDataSize = i;
    }

    @NotNull
    public final LinkedBlockingDeque<Short> getRecogData() {
        return this.recogData;
    }

    @NotNull
    public final HashMap<String, List<short[]>> getCacheVadPerformDatas() {
        return this.cacheVadPerformDatas;
    }

    public final void setCacheVadPerformDatas(@NotNull HashMap<String, List<short[]>> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "424aae8e30f86f96c12978151ae3c48b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "424aae8e30f86f96c12978151ae3c48b");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.cacheVadPerformDatas = hashMap;
    }

    @NotNull
    public final HashMap<String, List<byte[]>> getCacheCodecPerformDatas() {
        return this.cacheCodecPerformDatas;
    }

    public final void setCacheCodecPerformDatas(@NotNull HashMap<String, List<byte[]>> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "235e867c8f03902bff0c0e7f7aedabb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "235e867c8f03902bff0c0e7f7aedabb0");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.cacheCodecPerformDatas = hashMap;
    }

    @Keep
    @Nullable
    public final short[] getRecogAudioData(@NotNull Short[] shArr) {
        Object[] objArr = {shArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90ee0bd46dd04da861d2c1f3705bdfbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (short[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90ee0bd46dd04da861d2c1f3705bdfbc");
        }
        h.b(shArr, "data");
        synchronized (this.recogData) {
            for (Short sh : shArr) {
                this.recogData.put(Short.valueOf(sh.shortValue()));
            }
            if (this.recogData.size() >= this.recogDataSize) {
                short[] sArr = new short[this.recogDataSize];
                int i = this.recogDataSize;
                for (int i2 = 0; i2 < i; i2++) {
                    Short pop = this.recogData.pop();
                    h.a((Object) pop, "recogData.pop()");
                    sArr[i2] = pop.shortValue();
                }
                return sArr;
            }
            return null;
        }
    }

    @Keep
    @NotNull
    public final short[] getLastAudioDatas() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e172919547f0b577f1e96adfb3cb9cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (short[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e172919547f0b577f1e96adfb3cb9cd");
        }
        LinkedBlockingDeque<Short> linkedBlockingDeque = this.recogData;
        h.b(linkedBlockingDeque, "$this$toShortArray");
        short[] sArr = new short[linkedBlockingDeque.size()];
        for (Short sh : linkedBlockingDeque) {
            sArr[i] = sh.shortValue();
            i++;
        }
        return sArr;
    }

    @Keep
    public final void clearAudioDatas() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "744802a613f725491592825ac3cb0e1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "744802a613f725491592825ac3cb0e1a");
        } else {
            this.recogData.clear();
        }
    }

    @Keep
    public final void appendVadCache(@NotNull short[] sArr) {
        Object[] objArr = {sArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3fd6af90cbb107357ee87bc9da6ffa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3fd6af90cbb107357ee87bc9da6ffa5");
            return;
        }
        h.b(sArr, "data");
        ArrayList arrayList = this.cacheVadPerformDatas.get(this.sessionId);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.cacheVadPerformDatas.put(this.sessionId, arrayList);
        }
        arrayList.add(sArr);
    }

    @Keep
    public final void appendCodecCache(@NotNull byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "696d11aa9adcd7a4b67182ee7510545f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "696d11aa9adcd7a4b67182ee7510545f");
            return;
        }
        h.b(bArr, "data");
        ArrayList arrayList = this.cacheCodecPerformDatas.get(this.sessionId);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.cacheCodecPerformDatas.put(this.sessionId, arrayList);
        }
        arrayList.add(bArr);
    }

    @Keep
    public final void clearCacheData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f0bec9de7f956202e96e433b49bc9d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f0bec9de7f956202e96e433b49bc9d9");
            return;
        }
        this.cacheVadPerformDatas.clear();
        this.cacheCodecPerformDatas.clear();
    }
}
