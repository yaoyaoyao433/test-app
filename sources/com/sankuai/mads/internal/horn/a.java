package com.sankuai.mads.internal.horn;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.internal.utils.b;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/sankuai/mads/internal/horn/MadsHorn;", "", "()V", "TYPE_MADS", "", "gson", "Lcom/google/gson/Gson;", "hornConfig", "Lcom/sankuai/mads/internal/horn/MadsHorn$HornConfig;", "getHornConfig", "()Lcom/sankuai/mads/internal/horn/MadsHorn$HornConfig;", "setHornConfig", "(Lcom/sankuai/mads/internal/horn/MadsHorn$HornConfig;)V", "init", "", "AB", "AdCustom", "HornConfig", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final a c = new a();
    @NotNull
    static c b = new c(null, false, 3, null);
    private static final Gson d = new Gson();

    public static final /* synthetic */ Gson a(a aVar) {
        return d;
    }

    @NotNull
    public static c a() {
        return b;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "enable", "", "result", "", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class d implements HornCallback {
        public static ChangeQuickRedirect a;
        public static final d b = new d();

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            b.InterfaceC0580b a2;
            b.InterfaceC0580b a3;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "544ff03452b8d8f376c87d917ecbf2ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "544ff03452b8d8f376c87d917ecbf2ae");
            } else if (!z) {
                com.sankuai.mads.internal.utils.b bVar = com.sankuai.mads.internal.utils.b.b;
                com.sankuai.mads.internal.c cVar = com.sankuai.mads.internal.c.l;
                if (!com.sankuai.mads.internal.c.e() || (a3 = com.sankuai.mads.internal.utils.b.a()) == null) {
                    return;
                }
                a3.a("horn disable");
            } else {
                com.sankuai.mads.internal.utils.b bVar2 = com.sankuai.mads.internal.utils.b.b;
                com.sankuai.mads.internal.c cVar2 = com.sankuai.mads.internal.c.l;
                if (com.sankuai.mads.internal.c.e() && (a2 = com.sankuai.mads.internal.utils.b.a()) != null) {
                    a2.a("horn result " + str);
                }
                try {
                    a aVar = a.c;
                    c cVar3 = (c) a.a(aVar).fromJson(str, (Class<Object>) c.class);
                    if (cVar3 == null) {
                        cVar3 = new c(null, false, 3, null);
                    }
                    Object[] objArr2 = {cVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0bc0c0f958086f9cee819abdf4f91b7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0bc0c0f958086f9cee819abdf4f91b7c");
                        return;
                    }
                    h.b(cVar3, "<set-?>");
                    a.b = cVar3;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\n8FX\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sankuai/mads/internal/horn/MadsHorn$HornConfig;", "", "adCustom", "Lcom/sankuai/mads/internal/horn/MadsHorn$AdCustom;", "postFailOver", "", "(Lcom/sankuai/mads/internal/horn/MadsHorn$AdCustom;Z)V", "getAdCustom", "()Lcom/sankuai/mads/internal/horn/MadsHorn$AdCustom;", "host", "", "getHost", "()Ljava/lang/String;", "getPostFailOver", "()Z", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class c {
        public static ChangeQuickRedirect a;
        @SerializedName("ad_custom")
        @NotNull
        public final b b;
        @SerializedName("post_fail_over")
        public final boolean c;
        @SerializedName("host")
        @NotNull
        private final String d;

        public c() {
            this(null, false, 3, null);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d1043a0ca72214738ef2e07f963ffb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d1043a0ca72214738ef2e07f963ffb");
            }
        }

        private c(@NotNull b bVar, boolean z) {
            h.b(bVar, "adCustom");
            Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ab9b0420c2e3dc5101f66aa176a6fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ab9b0420c2e3dc5101f66aa176a6fc");
                return;
            }
            this.b = bVar;
            this.c = z;
            this.d = "";
        }

        public /* synthetic */ c(b bVar, boolean z, int i, f fVar) {
            this(new b(), false);
        }

        @NotNull
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9589c8cee8c3c965a584f4270358b0", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9589c8cee8c3c965a584f4270358b0");
            }
            return this.d.length() == 0 ? "https://mads.meituan.com" : this.d;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sankuai/mads/internal/horn/MadsHorn$AB;", "", "()V", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.sankuai.mads.internal.horn.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0575a {
        public static ChangeQuickRedirect a;
        @SerializedName("group_key")
        @Nullable
        private final String b;

        @Nullable
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f71275b2187e359e55cc937eaf19fa", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f71275b2187e359e55cc937eaf19fa");
            }
            String str = this.b;
            if (str != null) {
                if (str.length() > 0) {
                    return "a" + this.b;
                }
                return null;
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048FX\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\u00048F@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00048F@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00048FX\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u0016\u0010\u0010\u001a\u00020\u00048FX\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/sankuai/mads/internal/horn/MadsHorn$AdCustom;", "Lcom/sankuai/mads/internal/horn/MadsHorn$AB;", "()V", "cachedCount", "", "getCachedCount", "()I", "cachedTime", "getCachedTime", "setCachedTime", "(I)V", "metricsUploadPeriod", "getMetricsUploadPeriod", "setMetricsUploadPeriod", "reportCount", "getReportCount", "retryTimes", "getRetryTimes", "Companion", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class b extends C0575a {
        public static ChangeQuickRedirect b;
        public static final C0576a f = new C0576a(null);
        @SerializedName("cached_count")
        public final int c;
        @SerializedName("retry_times")
        public final int d;
        @SerializedName("metrics_upload_period")
        public int e;
        @SerializedName("report_count")
        private final int g;
        @SerializedName("cached_time")
        private int h;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95df05e2ace7f34cbbeca8a4059c4eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95df05e2ace7f34cbbeca8a4059c4eb");
                return;
            }
            this.c = 30;
            this.g = 3;
            this.d = 5;
            this.h = 60;
            this.e = 20;
        }

        public final int b() {
            if (this.g <= 0) {
                return 3;
            }
            return this.g;
        }

        public final int c() {
            return (this.h <= 0 ? 60 : this.h) * 1000;
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/sankuai/mads/internal/horn/MadsHorn$AdCustom$Companion;", "", "()V", "DEF_CACHED_COUNT", "", "DEF_CACHED_TIME", "DEF_METRICS_UPLOAD_PERIOD", "DEF_REPORT_COUNT", "DEF_RETRY_TIMES", "sdk_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.sankuai.mads.internal.horn.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0576a {
            public C0576a() {
            }

            public /* synthetic */ C0576a(f fVar) {
                this();
            }
        }
    }
}
