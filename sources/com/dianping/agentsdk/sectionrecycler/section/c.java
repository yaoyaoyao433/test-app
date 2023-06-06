package com.dianping.agentsdk.sectionrecycler.section;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.framework.z;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.shield.adapter.TopInfoListProvider;
import com.dianping.shield.adapter.TopPositionAdapter;
import com.dianping.shield.entity.CellType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class c extends e<b.a> implements TopInfoListProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected a adapterObserver;
    protected boolean addSpaceForDivider;
    protected WeakReference<AgentInterface> agentInterfaceWeakReference;
    protected String hostName;
    protected boolean isDestoryed;
    protected String mappingKey;
    protected WeakReference<af> sectionCellInterfaceWeakReference;

    public Rect bottomDividerOffset(int i, int i2) {
        return null;
    }

    public Drawable getBottomDivider(int i, int i2) {
        return null;
    }

    public r getDividerInfo(int i, int i2) {
        return null;
    }

    public int getInnerType(int i) {
        return i;
    }

    public z.a getNextLinkType(int i) {
        return null;
    }

    public z.b getPreviousLinkType(int i) {
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public int getRowCount(int i) {
        return 0;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public int getSectionCount() {
        return 1;
    }

    public Drawable getSectionFooterDrawable(int i) {
        return null;
    }

    public float getSectionFooterHeight(int i) {
        return -1.0f;
    }

    public Drawable getSectionHeaderDrawable(int i) {
        return null;
    }

    public float getSectionHeaderHeight(int i) {
        return -1.0f;
    }

    public String getSectionTitle(int i) {
        return null;
    }

    public Drawable getTopDivider(int i, int i2) {
        return null;
    }

    public ArrayList<TopPositionAdapter.TopInfo> getTopInfoList() {
        return null;
    }

    public boolean hasBottomDividerVerticalOffset(int i, int i2) {
        return false;
    }

    public boolean hasTopDividerVerticalOffset(int i, int i2) {
        return false;
    }

    public boolean isInnerSection(int i) {
        return true;
    }

    public void onAdapterChanged() {
    }

    public void onAdapterItemRangeChanged(int i, int i2) {
    }

    public void onAdapterItemRangeChanged(int i, int i2, Object obj) {
    }

    public void onAdapterItemRangeInserted(int i, int i2) {
    }

    public void onAdapterItemRangeMoved(int i, int i2, int i3) {
    }

    public void onAdapterItemRangeRemoved(int i, int i2) {
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.e
    public boolean showBottomDivider(int i, int i2) {
        return true;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.e
    public boolean showTopDivider(int i, int i2) {
        return true;
    }

    public Rect topDividerOffset(int i, int i2) {
        return null;
    }

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e87fdcb30238d6c52dc4c14a16494ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e87fdcb30238d6c52dc4c14a16494ab");
            return;
        }
        this.mappingKey = "";
        this.hostName = "";
        this.isDestoryed = false;
        this.addSpaceForDivider = false;
        this.adapterObserver = new a();
        registerAdapterDataObserver(this.adapterObserver);
    }

    public void setDestoryed(boolean z) {
        this.isDestoryed = z;
    }

    public boolean isDestoryed() {
        return this.isDestoryed;
    }

    public String getMappingKey() {
        return this.mappingKey;
    }

    public void setMappingKey(String str) {
        this.mappingKey = str;
    }

    public AgentInterface getAgentInterface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cec021027b97ef75afbc2d13ed76b24c", RobustBitConfig.DEFAULT_VALUE)) {
            return (AgentInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cec021027b97ef75afbc2d13ed76b24c");
        }
        if (this.agentInterfaceWeakReference != null) {
            return this.agentInterfaceWeakReference.get();
        }
        return null;
    }

    public void setAgentInterface(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c31edb18a367d95feea75cd607a44271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c31edb18a367d95feea75cd607a44271");
        } else {
            this.agentInterfaceWeakReference = new WeakReference<>(agentInterface);
        }
    }

    public af getSectionCellInterface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00ebe3ee40b55cb5dc0ed61166b4ac44", RobustBitConfig.DEFAULT_VALUE)) {
            return (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00ebe3ee40b55cb5dc0ed61166b4ac44");
        }
        if (this.sectionCellInterfaceWeakReference != null) {
            return this.sectionCellInterfaceWeakReference.get();
        }
        return null;
    }

    public void setSectionCellInterface(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a221c99580da16a6892d98be0bc49ddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a221c99580da16a6892d98be0bc49ddd");
        } else {
            this.sectionCellInterfaceWeakReference = new WeakReference<>(afVar);
        }
    }

    public void setAddSpaceForDivider(boolean z) {
        this.addSpaceForDivider = z;
    }

    public Pair<Integer, Integer> getInnerPosition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d23b3dcaf3050fc83f2ec735f62a7506", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d23b3dcaf3050fc83f2ec735f62a7506") : new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public CellType getCellType(int i, int i2) {
        return CellType.NORMAL;
    }

    public CellType getCellType(int i) {
        return CellType.NORMAL;
    }

    @Deprecated
    public int getTotalItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28f7194ffd9b695c9e7eb9b6849e956e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28f7194ffd9b695c9e7eb9b6849e956e")).intValue();
        }
        int sectionCount = getSectionCount();
        int i = 0;
        for (int i2 = 0; i2 < sectionCount; i2++) {
            i += getRowCount(i2);
        }
        return i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.c {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba8a1ac2fa8c7f822d2b6f6879b4541", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba8a1ac2fa8c7f822d2b6f6879b4541");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a819e48ceb37676ba4c971d2fd9abc02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a819e48ceb37676ba4c971d2fd9abc02");
            } else {
                c.this.onAdapterChanged();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4178a88627d8096424b49980588c8bdd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4178a88627d8096424b49980588c8bdd");
            } else {
                c.this.onAdapterItemRangeChanged(i, i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30143a6e1ae44248db772bf32046e682", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30143a6e1ae44248db772bf32046e682");
            } else {
                c.this.onAdapterItemRangeChanged(i, i2, obj);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "594c597769dd172661dac6367f91f9d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "594c597769dd172661dac6367f91f9d2");
            } else {
                c.this.onAdapterItemRangeInserted(i, i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00eb803c065fad5eb41dd216b35cf64c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00eb803c065fad5eb41dd216b35cf64c");
            } else {
                c.this.onAdapterItemRangeRemoved(i, i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeMoved(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fdc928ae6d368c4853bb153d282275", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fdc928ae6d368c4853bb153d282275");
            } else {
                c.this.onAdapterItemRangeMoved(i, i2, i3);
            }
        }
    }
}
