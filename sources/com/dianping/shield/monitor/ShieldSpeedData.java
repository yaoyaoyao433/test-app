package com.dianping.shield.monitor;

import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.runtime.ShieldRuntimeInterface;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0006J\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0017J\u0016\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J\u0006\u0010(\u001a\u00020&J\u0006\u0010)\u001a\u00020\u0000J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR6\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR6\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011¨\u0006+"}, d2 = {"Lcom/dianping/shield/monitor/ShieldSpeedData;", "", "page", "", "(Ljava/lang/String;)V", "channel", "", "getChannel", "()I", "setChannel", "(I)V", "extraInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getExtraInfo", "()Ljava/util/HashMap;", "setExtraInfo", "(Ljava/util/HashMap;)V", "next", "getPage", "()Ljava/lang/String;", "setPage", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "stepEvents", "getStepEvents", "setStepEvents", "addEvent", Constants.SPEED_METER_STEP, "responseTime", "addExtraInfo", "key", "value", KNBConfig.CONFIG_CLEAR_CACHE, "", "recycle", "send", "startEvent", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldSpeedData {
    public static final int CHANNEL_CAT = 1;
    public static final int CHANNEL_DEFAULT = 0;
    public static final int CHANNEL_FMP = 2;
    public static final int MAX_POOL_SIZE = 10;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private static ShieldSpeedData sPool;
    private static int sPoolSize;
    private int channel;
    @NotNull
    private HashMap<String, String> extraInfo;
    private ShieldSpeedData next;
    @NotNull
    private String page;
    private long startTime;
    @NotNull
    private HashMap<Integer, Long> stepEvents;
    public static final Companion Companion = new Companion(null);
    private static final Object sPoolSync = new Object();

    @JvmStatic
    @NotNull
    public static final ShieldSpeedData obtain(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9229a727e4552ede8baec579bbc9f63", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSpeedData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9229a727e4552ede8baec579bbc9f63") : Companion.obtain(str);
    }

    @JvmStatic
    @NotNull
    public static final ShieldSpeedData obtain(@NotNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b14ba96b00f517fbd50a0f6b76edd369", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSpeedData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b14ba96b00f517fbd50a0f6b76edd369") : Companion.obtain(str, i);
    }

    public ShieldSpeedData(@NotNull String str) {
        h.b(str, "page");
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aecee13c3e1ef58b4c55bc1650e8cf6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aecee13c3e1ef58b4c55bc1650e8cf6e");
            return;
        }
        this.page = str;
        this.stepEvents = new HashMap<>();
        this.extraInfo = new HashMap<>();
    }

    @NotNull
    public final String getPage() {
        return this.page;
    }

    public final void setPage(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1d14cb59bd085656778dd805c76770f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1d14cb59bd085656778dd805c76770f");
            return;
        }
        h.b(str, "<set-?>");
        this.page = str;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a1740a8e1a8456ec2d18018f397dab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a1740a8e1a8456ec2d18018f397dab2");
        } else {
            this.startTime = j;
        }
    }

    @NotNull
    public final HashMap<Integer, Long> getStepEvents() {
        return this.stepEvents;
    }

    public final void setStepEvents(@NotNull HashMap<Integer, Long> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b45131c855fa895b89e14f96f9fc242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b45131c855fa895b89e14f96f9fc242");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.stepEvents = hashMap;
    }

    public final int getChannel() {
        return this.channel;
    }

    public final void setChannel(int i) {
        this.channel = i;
    }

    @NotNull
    public final HashMap<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    public final void setExtraInfo(@NotNull HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebc76c3b17a0ca95b669f2dfed3f3fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebc76c3b17a0ca95b669f2dfed3f3fb7");
            return;
        }
        h.b(hashMap, "<set-?>");
        this.extraInfo = hashMap;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/dianping/shield/monitor/ShieldSpeedData$Companion;", "", "()V", "CHANNEL_CAT", "", "CHANNEL_DEFAULT", "CHANNEL_FMP", "MAX_POOL_SIZE", "sPool", "Lcom/dianping/shield/monitor/ShieldSpeedData;", "getSPool", "()Lcom/dianping/shield/monitor/ShieldSpeedData;", "setSPool", "(Lcom/dianping/shield/monitor/ShieldSpeedData;)V", "sPoolSize", "getSPoolSize", "()I", "setSPoolSize", "(I)V", "sPoolSync", "sPoolSync$annotations", "obtain", "page", "", "channel", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        @JvmStatic
        private static /* synthetic */ void sPoolSync$annotations() {
        }

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @Nullable
        public final ShieldSpeedData getSPool() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6751d6f873a011a6ee13c80da2103f1c", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSpeedData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6751d6f873a011a6ee13c80da2103f1c") : ShieldSpeedData.sPool;
        }

        public final void setSPool(@Nullable ShieldSpeedData shieldSpeedData) {
            Object[] objArr = {shieldSpeedData};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c85013deb0a90bb645b9faa0d74d4339", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c85013deb0a90bb645b9faa0d74d4339");
            } else {
                ShieldSpeedData.sPool = shieldSpeedData;
            }
        }

        public final int getSPoolSize() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aef0f78b8d5dd3abc1d01e90dfb2141", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aef0f78b8d5dd3abc1d01e90dfb2141")).intValue() : ShieldSpeedData.sPoolSize;
        }

        public final void setSPoolSize(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c90a5b78a899c62fff6bf5d98c295da1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c90a5b78a899c62fff6bf5d98c295da1");
            } else {
                ShieldSpeedData.sPoolSize = i;
            }
        }

        @JvmStatic
        @NotNull
        public final ShieldSpeedData obtain(@NotNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dec44304449bfac6360eb54f82335376", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShieldSpeedData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dec44304449bfac6360eb54f82335376");
            }
            h.b(str, "page");
            synchronized (ShieldSpeedData.sPoolSync) {
                ShieldSpeedData sPool = ShieldSpeedData.Companion.getSPool();
                if (sPool != null) {
                    sPool.clear();
                    sPool.setPage(str);
                    ShieldSpeedData.Companion.setSPool(sPool.next);
                    sPool.next = null;
                    Companion companion = ShieldSpeedData.Companion;
                    companion.setSPoolSize(companion.getSPoolSize() - 1);
                    return sPool;
                }
                return new ShieldSpeedData(str);
            }
        }

        @JvmStatic
        @NotNull
        public final ShieldSpeedData obtain(@NotNull String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04889932e47c8f09ed7898dfcc0d2602", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShieldSpeedData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04889932e47c8f09ed7898dfcc0d2602");
            }
            h.b(str, "page");
            synchronized (ShieldSpeedData.sPoolSync) {
                ShieldSpeedData sPool = ShieldSpeedData.Companion.getSPool();
                if (sPool != null) {
                    sPool.clear();
                    sPool.setPage(str);
                    sPool.setChannel(i);
                    ShieldSpeedData.Companion.setSPool(sPool.next);
                    sPool.next = null;
                    Companion companion = ShieldSpeedData.Companion;
                    companion.setSPoolSize(companion.getSPoolSize() - 1);
                    return sPool;
                }
                return new ShieldSpeedData(str);
            }
        }
    }

    @NotNull
    public final ShieldSpeedData startEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77edcd9d760ab9d4723ff3cc25421dc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSpeedData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77edcd9d760ab9d4723ff3cc25421dc3");
        }
        ShieldSpeedData shieldSpeedData = this;
        shieldSpeedData.startTime = System.currentTimeMillis();
        return shieldSpeedData;
    }

    @NotNull
    public final ShieldSpeedData startEvent(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37edd2d489faf380a8478a1a124b3f5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSpeedData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37edd2d489faf380a8478a1a124b3f5a");
        }
        ShieldSpeedData shieldSpeedData = this;
        shieldSpeedData.startTime = j;
        return shieldSpeedData;
    }

    @NotNull
    public final ShieldSpeedData addEvent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c03f0d643243b9adf455ef65d602638", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSpeedData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c03f0d643243b9adf455ef65d602638") : addEvent(i, System.currentTimeMillis());
    }

    @NotNull
    public final ShieldSpeedData addEvent(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1af91f69675ee39113e7599ca06952b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSpeedData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1af91f69675ee39113e7599ca06952b7");
        }
        ShieldSpeedData shieldSpeedData = this;
        shieldSpeedData.stepEvents.put(Integer.valueOf(i), Long.valueOf(j));
        return shieldSpeedData;
    }

    @NotNull
    public final ShieldSpeedData addExtraInfo(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e2036f1232ae2f2c355c30a9cf68438", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSpeedData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e2036f1232ae2f2c355c30a9cf68438");
        }
        h.b(str, "key");
        h.b(str2, "value");
        ShieldSpeedData shieldSpeedData = this;
        shieldSpeedData.extraInfo.put(str, str2);
        return shieldSpeedData;
    }

    public final void send() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "228875caacbf12913cc9910371337569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "228875caacbf12913cc9910371337569");
            return;
        }
        ShieldRuntimeInterface shieldRuntimeImpl = ShieldEnvironment.INSTANCE.getShieldRuntimeImpl();
        if (shieldRuntimeImpl != null) {
            shieldRuntimeImpl.sendBySpeedData(this);
        }
        recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "006c33f068cbe7e54b9c84ae86be63ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "006c33f068cbe7e54b9c84ae86be63ac");
            return;
        }
        this.startTime = 0L;
        this.stepEvents.clear();
        this.page = "";
        this.extraInfo.clear();
    }

    private final void recycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de4d0e27dbe08fb7bacceb8522421848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de4d0e27dbe08fb7bacceb8522421848");
            return;
        }
        clear();
        synchronized (sPoolSync) {
            if (sPoolSize < 10) {
                this.next = sPool;
                sPool = this;
                sPoolSize++;
            }
            r rVar = r.a;
        }
    }
}
