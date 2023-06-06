package com.dianping.shield.node.useritem;

import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.node.itemcallbacks.ExposeCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/dianping/shield/node/useritem/ExposeInfo;", "", "()V", "agentExposeCallback", "Lcom/dianping/shield/node/itemcallbacks/ExposeCallback;", "data", "exposeDuration", "", "exposeScope", "Lcom/dianping/shield/entity/ExposeScope;", "identifier", "", "getIdentifier$shieldCore_release", "()I", "setIdentifier$shieldCore_release", "(I)V", "maxExposeCount", "stayDuration", "equals", "", "other", "hashCode", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ExposeInfo {
    public static final Companion Companion = new Companion(null);
    public static final int IDENTIFIER_DEFAULT = 0;
    public static final int IDENTIFIER_SHIELD = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public ExposeCallback agentExposeCallback;
    @JvmField
    @Nullable
    public Object data;
    @JvmField
    public long exposeDuration;
    @JvmField
    @Nullable
    public ExposeScope exposeScope;
    private int identifier;
    @JvmField
    public int maxExposeCount;
    @JvmField
    public long stayDuration;

    public ExposeInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dd7665fa6794bb0676c851fa919e1c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dd7665fa6794bb0676c851fa919e1c2");
            return;
        }
        this.exposeScope = ExposeScope.PX;
        this.maxExposeCount = Integer.MAX_VALUE;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/dianping/shield/node/useritem/ExposeInfo$Companion;", "", "()V", "IDENTIFIER_DEFAULT", "", "IDENTIFIER_SHIELD", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public final int getIdentifier$shieldCore_release() {
        return this.identifier;
    }

    public final void setIdentifier$shieldCore_release(int i) {
        this.identifier = i;
    }

    public boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b94bb951559b836074e5b9fc6b2edf6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b94bb951559b836074e5b9fc6b2edf6e")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            ExposeInfo exposeInfo = (ExposeInfo) obj;
            return this.exposeScope == exposeInfo.exposeScope && this.identifier == exposeInfo.identifier;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.node.useritem.ExposeInfo");
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cef064097584d0059790356638a88207", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cef064097584d0059790356638a88207")).intValue();
        }
        ExposeScope exposeScope = this.exposeScope;
        return ((exposeScope != null ? exposeScope.hashCode() : 0) * 31) + this.identifier;
    }
}
