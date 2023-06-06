package com.dianping.eunomia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/dianping/eunomia/KVItem;", "", "n", "", "url", "type", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getN", "()Ljava/lang/String;", "setN", "(Ljava/lang/String;)V", "getType", "()I", "setType", "(I)V", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @NotNull
    private String b;
    @Nullable
    private String c;
    private int d;

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d8b8d77cf9dd8ba6c3dc348268cce7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d8b8d77cf9dd8ba6c3dc348268cce7")).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.h.a((Object) this.b, (Object) aVar.b) && kotlin.jvm.internal.h.a((Object) this.c, (Object) aVar.c)) {
                    if (this.d == aVar.d) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18f5851dfc55289960fbb5e5f69e5dd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18f5851dfc55289960fbb5e5f69e5dd8")).intValue();
        }
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d;
    }

    @NotNull
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfdf1df8994e1a1d93b1528f2c7fd0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfdf1df8994e1a1d93b1528f2c7fd0e");
        }
        return "KVItem(n=" + this.b + ", url=" + this.c + ", type=" + this.d + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    public a(@NotNull String str, @Nullable String str2, int i) {
        kotlin.jvm.internal.h.b(str, "n");
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1660e072b5c1bc1570ca099dac26b105", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1660e072b5c1bc1570ca099dac26b105");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = i;
    }
}
