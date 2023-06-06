package com.sankuai.mads;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sankuai/mads/ReportEventData;", "", "event", "Lcom/sankuai/mads/Event;", "eventData", "", "retryTimes", "", "(Lcom/sankuai/mads/Event;Ljava/lang/String;I)V", "getEvent", "()Lcom/sankuai/mads/Event;", "getEventData", "()Ljava/lang/String;", "getRetryTimes", "()I", "setRetryTimes", "(I)V", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    @NotNull
    public final b b;
    @NotNull
    public final String c;
    public int d;

    private g(@NotNull b bVar, @NotNull String str, int i) {
        kotlin.jvm.internal.h.b(bVar, "event");
        kotlin.jvm.internal.h.b(str, "eventData");
        Object[] objArr = {bVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8509c4533806da28b46125a9bc05be3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8509c4533806da28b46125a9bc05be3");
            return;
        }
        this.b = bVar;
        this.c = str;
        this.d = i;
    }

    public /* synthetic */ g(b bVar, String str, int i, int i2, kotlin.jvm.internal.f fVar) {
        this(bVar, str, 0);
    }
}
