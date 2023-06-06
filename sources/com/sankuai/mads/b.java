package com.sankuai.mads;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sankuai/mads/Event;", "", "builder", "Lcom/sankuai/mads/Event$Builder;", "(Lcom/sankuai/mads/Event$Builder;)V", "<set-?>", "", "actionType", "getActionType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "", "chargeInfo", "getChargeInfo", "()Ljava/lang/String;", "eventId", "getEventId", "identifier", "getIdentifier", "reportType", "getReportType", "()I", "Builder", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @Nullable
    public String b;
    @Nullable
    public String c;
    @Nullable
    public String d;
    @Nullable
    public Integer e;
    public int f;

    private b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5026045b865437bd4c6a2bb5064c0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5026045b865437bd4c6a2bb5064c0a");
            return;
        }
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    public /* synthetic */ b(a aVar, kotlin.jvm.internal.f fVar) {
        this(aVar);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\nJ\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007R$\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/sankuai/mads/Event$Builder;", "", "()V", "eventId", "", "chargeInfo", "actionType", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "event", "Lcom/sankuai/mads/Event;", "(Lcom/sankuai/mads/Event;)V", "<set-?>", "getActionType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChargeInfo", "()Ljava/lang/String;", "getEventId", "identifier", "getIdentifier", "reportType", "getReportType", "()I", "build", "setActionType", "setChargeInfo", "info", "setEventId", "setIdentifier", "setReportType", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        @Nullable
        public String b;
        @Nullable
        public String c;
        @Nullable
        String d;
        @Nullable
        Integer e;
        public int f;

        @Deprecated(message = "使用constructor(eventId: String, chargeInfo: String, actionType: Int)", replaceWith = @ReplaceWith(expression = "constructor(eventId: String, chargeInfo: String, actionType: Int)", imports = {}))
        public a() {
        }

        public a(@Nullable String str, @Nullable String str2, int i) {
            this();
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02a110469ace77a9a783f9b8009232c7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02a110469ace77a9a783f9b8009232c7");
                return;
            }
            this.b = str;
            this.c = str2;
            this.e = Integer.valueOf(i);
        }

        @NotNull
        public final a a(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8804bfa5c8e4f6a8f3ba812b026a2cce", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8804bfa5c8e4f6a8f3ba812b026a2cce");
            }
            a aVar = this;
            aVar.d = str;
            return aVar;
        }
    }
}
