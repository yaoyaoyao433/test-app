package com.dianping.eunomia;

import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/dianping/eunomia/ProcessResult;", "", "success", "", "data", "Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "(ZLcom/dianping/eunomia/model/models/ModuleConfigResponse;)V", "getData", "()Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "setData", "(Lcom/dianping/eunomia/model/models/ModuleConfigResponse;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class n {
    public static ChangeQuickRedirect a;
    boolean b;
    @Nullable
    ModuleConfigResponse c;

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a64b4e1c63e7d08d2a410361287ee1c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a64b4e1c63e7d08d2a410361287ee1c4")).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (!(this.b == nVar.b) || !kotlin.jvm.internal.h.a(this.c, nVar.c)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561893347eca6fec77a1f3ec655f6e21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561893347eca6fec77a1f3ec655f6e21")).intValue();
        }
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        ModuleConfigResponse moduleConfigResponse = this.c;
        return i2 + (moduleConfigResponse != null ? moduleConfigResponse.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3082201de275ab32d4234b2ea69ee8dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3082201de275ab32d4234b2ea69ee8dc");
        }
        return "ProcessResult(success=" + this.b + ", data=" + this.c + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    public n(boolean z, @Nullable ModuleConfigResponse moduleConfigResponse) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), moduleConfigResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e856946fffd8b627827419f0083d0a5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e856946fffd8b627827419f0083d0a5b");
            return;
        }
        this.b = z;
        this.c = moduleConfigResponse;
    }
}
