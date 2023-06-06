package com.dianping.agentsdk.framework;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListAdapter;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/dianping/agentsdk/framework/Cell;", "", "()V", "adpater", "Landroid/widget/ListAdapter;", "groupIndex", "", "innerIndex", "key", "lastCell", "name", "nextCell", "owner", "Lcom/dianping/agentsdk/framework/AgentInterface;", "recyclerViewAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", Constants.EventType.VIEW, "Landroid/view/View;", "getLastCellTailSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "getMyCellHeadSection", "getMyCellTailSection", "getNextCellHeadSection", "toString", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    @JvmField
    @Nullable
    public AgentInterface b;
    @JvmField
    @Nullable
    public String c;
    @JvmField
    @Nullable
    public String d;
    @JvmField
    @Nullable
    public View e;
    @JvmField
    @Nullable
    public ListAdapter f;
    @JvmField
    @Nullable
    public RecyclerView.a<?> g;
    @JvmField
    @Nullable
    public ShieldViewCell h;
    @JvmField
    @Nullable
    public String i;
    @JvmField
    @Nullable
    public String j;
    @JvmField
    @Nullable
    public i k;
    @JvmField
    @Nullable
    public i l;

    @NotNull
    public final String toString() {
        String str;
        Class<?> cls;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33427dd9c97b1f7846445bd591cca3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33427dd9c97b1f7846445bd591cca3f");
        }
        if (this.e == null && this.f == null && this.g == null && this.h == null) {
            return "(Empty Cell)";
        }
        StringBuilder sb = new StringBuilder("owner:");
        AgentInterface agentInterface = this.b;
        if (agentInterface == null || (cls = agentInterface.getClass()) == null || (str = cls.getSimpleName()) == null) {
            str = StringUtil.NULL;
        }
        sb.append(str);
        sb.append("|key:");
        sb.append(this.c);
        sb.append("|view:");
        View view = this.e;
        sb.append(view != null ? view.toString() : null);
        sb.append("|listAdapterCount:");
        ListAdapter listAdapter = this.f;
        sb.append(listAdapter != null ? Integer.valueOf(listAdapter.getCount()) : null);
        sb.append('|');
        sb.append("itemCount:");
        RecyclerView.a<?> aVar = this.g;
        sb.append(aVar != null ? Integer.valueOf(aVar.getItemCount()) : null);
        return sb.toString();
    }

    @Nullable
    public final ShieldSection a() {
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "471906b82c3150b61bb362bb68d4d035", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "471906b82c3150b61bb362bb68d4d035");
        }
        i iVar = this.k;
        if (iVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "37349c7d77b42676198aa5d5d6d6e2b3", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShieldSection) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "37349c7d77b42676198aa5d5d6d6e2b3");
            }
            ShieldViewCell shieldViewCell = iVar.h;
            if (shieldViewCell != null && (rangeRemoveableArrayList = shieldViewCell.shieldSections) != null) {
                RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList2 = rangeRemoveableArrayList;
                kotlin.jvm.internal.h.b(rangeRemoveableArrayList2, "$this$lastOrNull");
                ShieldSection shieldSection = rangeRemoveableArrayList2.isEmpty() ? null : rangeRemoveableArrayList2.get(rangeRemoveableArrayList2.size() - 1);
                if (shieldSection != null && shieldSection != null) {
                    return shieldSection;
                }
            }
            return iVar.a();
        }
        return null;
    }

    @Nullable
    private ShieldSection c() {
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList;
        ShieldSection shieldSection;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef7e541b0801d89ecbb8f6eb95247c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef7e541b0801d89ecbb8f6eb95247c7");
        }
        ShieldViewCell shieldViewCell = this.h;
        return (shieldViewCell == null || (rangeRemoveableArrayList = shieldViewCell.shieldSections) == null || (shieldSection = (ShieldSection) kotlin.collections.h.e((List<? extends Object>) rangeRemoveableArrayList)) == null || shieldSection == null) ? b() : shieldSection;
    }

    @Nullable
    public final ShieldSection b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6faa59cc4f018c86b338689d8631ef3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6faa59cc4f018c86b338689d8631ef3f");
        }
        i iVar = this.l;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }
}
