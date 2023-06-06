package com.dianping.shield.node.cellnode;

import android.content.Context;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/node/cellnode/ReuseInfo;", "", "()V", "context", "Landroid/content/Context;", "rowParent", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "stableid", "", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "viewPaintingCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", DMKeys.KEY_VIEW_TYPE, "equals", "", "other", "hashCode", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ReuseInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public Context context;
    @JvmField
    @Nullable
    public ShieldRow rowParent;
    @JvmField
    @Nullable
    public String stableid;
    @JvmField
    @Nullable
    public ViewItem viewItem;
    @JvmField
    @Nullable
    public ViewPaintingCallback<?> viewPaintingCallback;
    @JvmField
    @Nullable
    public String viewType;

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05ede676de6a9802da79269ae12214e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05ede676de6a9802da79269ae12214e5")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.ReuseInfo");
        }
        ReuseInfo reuseInfo = (ReuseInfo) obj;
        if ((!h.a((Object) this.viewType, (Object) reuseInfo.viewType)) || (!h.a((Object) this.stableid, (Object) reuseInfo.stableid))) {
            return false;
        }
        return (this.viewType == null && this.stableid == null && (h.a(this.viewItem, reuseInfo.viewItem) ^ true)) ? false : true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b899b116a0544a390b862e454360b71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b899b116a0544a390b862e454360b71")).intValue();
        }
        if (this.viewType != null || this.stableid != null) {
            String str = this.viewType;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.stableid;
            return (str2 != null ? str2.hashCode() : 0) + hashCode;
        }
        ViewItem viewItem = this.viewItem;
        if (viewItem != null) {
            return viewItem.hashCode();
        }
        return 0;
    }
}
