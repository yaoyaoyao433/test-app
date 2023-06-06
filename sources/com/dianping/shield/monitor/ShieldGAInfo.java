package com.dianping.shield.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/monitor/ShieldGAInfo;", "", "type", "Lcom/dianping/shield/monitor/ShieldGAType;", ShieldMonitorKey.TAG_BUSINESS, "", "(Lcom/dianping/shield/monitor/ShieldGAType;Ljava/lang/String;)V", "getBusiness", "()Ljava/lang/String;", "setBusiness", "(Ljava/lang/String;)V", "getType", "()Lcom/dianping/shield/monitor/ShieldGAType;", "setType", "(Lcom/dianping/shield/monitor/ShieldGAType;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldGAInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private String business;
    @NotNull
    private ShieldGAType type;

    public ShieldGAInfo(@NotNull ShieldGAType shieldGAType, @NotNull String str) {
        h.b(shieldGAType, "type");
        h.b(str, ShieldMonitorKey.TAG_BUSINESS);
        Object[] objArr = {shieldGAType, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "132fca9fe75027c6f020326d92f66566", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "132fca9fe75027c6f020326d92f66566");
            return;
        }
        this.type = shieldGAType;
        this.business = str;
    }

    public /* synthetic */ ShieldGAInfo(ShieldGAType shieldGAType, String str, int i, f fVar) {
        this((i & 1) != 0 ? ShieldGAType.NATIVEMODULE : shieldGAType, str);
    }

    @NotNull
    public final String getBusiness() {
        return this.business;
    }

    @NotNull
    public final ShieldGAType getType() {
        return this.type;
    }

    public final void setBusiness(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d95a30020c4f3247eba46a9d225bdbb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d95a30020c4f3247eba46a9d225bdbb2");
            return;
        }
        h.b(str, "<set-?>");
        this.business = str;
    }

    public final void setType(@NotNull ShieldGAType shieldGAType) {
        Object[] objArr = {shieldGAType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b3977b24984f19652a8e0a654c523f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b3977b24984f19652a8e0a654c523f1");
            return;
        }
        h.b(shieldGAType, "<set-?>");
        this.type = shieldGAType;
    }
}
