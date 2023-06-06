package com.sankuai.mads;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/sankuai/mads/MadsReporter;", "Lcom/sankuai/mads/Report$Factory;", "builder", "Lcom/sankuai/mads/MadsReporter$Builder;", "(Lcom/sankuai/mads/MadsReporter$Builder;)V", "adReportService", "Lcom/sankuai/mads/internal/AdReportService;", "getAdReportService$sdk_release", "()Lcom/sankuai/mads/internal/AdReportService;", "environment", "", "interceptors", "", "Lcom/sankuai/meituan/retrofit2/Interceptor;", "rawCallFactory", "Lcom/sankuai/meituan/retrofit2/raw/RawCall$Factory;", "reportListener", "Lcom/sankuai/mads/ReportListener;", "getReportListener$sdk_release", "()Lcom/sankuai/mads/ReportListener;", "newBuilder", "newReport", "Lcom/sankuai/mads/Report;", "event", "Lcom/sankuai/mads/Event;", "Builder", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    @NotNull
    public final com.sankuai.mads.internal.b b;
    @Nullable
    public final h c;
    private final int d;
    private final a.InterfaceC0637a e;
    private final List<Interceptor> f;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001f\u001a\u00020\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020!H\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\"\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/sankuai/mads/MadsReporter$Builder;", "", "madsReporter", "Lcom/sankuai/mads/MadsReporter;", "(Lcom/sankuai/mads/MadsReporter;)V", "()V", "environment", "", "getEnvironment$sdk_release", "()I", "setEnvironment$sdk_release", "(I)V", "interceptors", "", "Lcom/sankuai/meituan/retrofit2/Interceptor;", "getInterceptors$sdk_release", "()Ljava/util/List;", "setInterceptors$sdk_release", "(Ljava/util/List;)V", "rawCallFactory", "Lcom/sankuai/meituan/retrofit2/raw/RawCall$Factory;", "getRawCallFactory$sdk_release", "()Lcom/sankuai/meituan/retrofit2/raw/RawCall$Factory;", "setRawCallFactory$sdk_release", "(Lcom/sankuai/meituan/retrofit2/raw/RawCall$Factory;)V", "reportListener", "Lcom/sankuai/mads/ReportListener;", "getReportListener$sdk_release", "()Lcom/sankuai/mads/ReportListener;", "setReportListener$sdk_release", "(Lcom/sankuai/mads/ReportListener;)V", "build", "host", "", "requestInterceptors", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        int b;
        @NotNull
        public a.InterfaceC0637a c;
        @Nullable
        public List<? extends Interceptor> d;
        @Nullable
        public h e;
    }

    private d(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca6309ea1b3fd0cc2f0bbc88c43abf1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca6309ea1b3fd0cc2f0bbc88c43abf1");
            return;
        }
        this.d = aVar.b;
        a.InterfaceC0637a interfaceC0637a = aVar.c;
        if (interfaceC0637a == null) {
            kotlin.jvm.internal.h.a("rawCallFactory");
        }
        this.e = interfaceC0637a;
        this.f = aVar.d;
        this.b = new com.sankuai.mads.internal.b(this.e, this.f);
        this.c = aVar.e;
    }

    public /* synthetic */ d(a aVar, kotlin.jvm.internal.f fVar) {
        this(aVar);
    }
}
