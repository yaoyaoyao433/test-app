package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.Pair;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.framework.z;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.shield.adapter.TopPositionAdapter;
import com.dianping.shield.entity.CellType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class n<EI> extends com.dianping.agentsdk.sectionrecycler.section.c {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected com.dianping.agentsdk.sectionrecycler.section.c adapter;
    public EI extraInterface;

    public n(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, EI ei) {
        super(context);
        Object[] objArr = {context, cVar, ei};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1749ff7555349b78bb1abd86beeb82eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1749ff7555349b78bb1abd86beeb82eb");
            return;
        }
        this.extraInterface = ei;
        this.adapter = cVar;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public void onBindViewHolder(b.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3c558e595e90f151b319a7cf90c9537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3c558e595e90f151b319a7cf90c9537");
        } else {
            this.adapter.onBindViewHolder((com.dianping.agentsdk.sectionrecycler.section.c) aVar, i, i2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public b.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeec3d877ba1409fbbdf8dfcc808c896", RobustBitConfig.DEFAULT_VALUE) ? (b.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeec3d877ba1409fbbdf8dfcc808c896") : (b.a) this.adapter.onCreateViewHolder(viewGroup, i);
    }

    public com.dianping.agentsdk.sectionrecycler.section.c getInnerAdapter() {
        return this.adapter;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public int getSectionCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "525f40fa15101df00f9d70dae2972946", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "525f40fa15101df00f9d70dae2972946")).intValue() : this.adapter.getSectionCount();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.d
    public int getRowCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "280e73b869a92f8d450dc933172b94f7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "280e73b869a92f8d450dc933172b94f7")).intValue() : this.adapter.getRowCount(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public float getSectionHeaderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08c2022277b280b5f4e80538bd7d366c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08c2022277b280b5f4e80538bd7d366c")).floatValue() : this.adapter.getSectionHeaderHeight(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public Drawable getSectionHeaderDrawable(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a1c564a44dccdf163846d8dc78b7296", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a1c564a44dccdf163846d8dc78b7296") : this.adapter.getSectionHeaderDrawable(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public float getSectionFooterHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a46f81f32c8ff2b2b54ee91b08a395c2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a46f81f32c8ff2b2b54ee91b08a395c2")).floatValue() : this.adapter.getSectionFooterHeight(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public Drawable getSectionFooterDrawable(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa97b2df14f73c582dc522644c161065", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa97b2df14f73c582dc522644c161065") : this.adapter.getSectionFooterDrawable(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public String getSectionTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7265c47c0ed3688dd259ed829a7d4ff7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7265c47c0ed3688dd259ed829a7d4ff7") : this.adapter.getSectionTitle(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public Drawable getTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f06190b04effe3c529f082e32de32da", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f06190b04effe3c529f082e32de32da") : this.adapter.getTopDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public Drawable getBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57dbe392af31ec3a6344326aa7181571", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57dbe392af31ec3a6344326aa7181571") : this.adapter.getBottomDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public Rect topDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f542066ad6fe98b7bc7bfad82cd574d", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f542066ad6fe98b7bc7bfad82cd574d") : this.adapter.topDividerOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public Rect bottomDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87824781ad8a6a5b8d0e90a94eed4e98", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87824781ad8a6a5b8d0e90a94eed4e98") : this.adapter.bottomDividerOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.a
    public r getDividerInfo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61f117355f4692a0cacc8d5be0b9851d", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61f117355f4692a0cacc8d5be0b9851d") : this.adapter.getDividerInfo(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public z.b getPreviousLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1914dd0e6954c1d0ee4764fabb807819", RobustBitConfig.DEFAULT_VALUE) ? (z.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1914dd0e6954c1d0ee4764fabb807819") : this.adapter.getPreviousLinkType(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public z.a getNextLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc0ce96d2827038578a65e86b156b26d", RobustBitConfig.DEFAULT_VALUE) ? (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc0ce96d2827038578a65e86b156b26d") : this.adapter.getNextLinkType(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public long getItemId(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38ced6833fd84225714a2f03ad889f6f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38ced6833fd84225714a2f03ad889f6f")).longValue() : this.adapter.getItemId(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public int getItemViewType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71f5f10e5008efa604c61d34641f79ef", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71f5f10e5008efa604c61d34641f79ef")).intValue() : this.adapter.getItemViewType(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public int getInnerType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f1c89c836e6bac68afa82ac33ef0047", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f1c89c836e6bac68afa82ac33ef0047")).intValue() : this.adapter.getInnerType(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public Pair<Integer, Integer> getInnerPosition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5af756cbc951348e645409695253c39f", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5af756cbc951348e645409695253c39f") : this.adapter.getInnerPosition(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public boolean showTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9544f1e72494ca9b3ad09cfb31091c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9544f1e72494ca9b3ad09cfb31091c3")).booleanValue() : this.adapter.showTopDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public boolean showBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcc204f7f67fdb150b482296c4c72aa2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcc204f7f67fdb150b482296c4c72aa2")).booleanValue() : this.adapter.showBottomDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public String getMappingKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8e2091537978dfee9ca2382704fd83f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8e2091537978dfee9ca2382704fd83f") : this.adapter.getMappingKey();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void setMappingKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0067b59bf2a43ff14f19c52490f42a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0067b59bf2a43ff14f19c52490f42a9");
        } else {
            this.adapter.setMappingKey(str);
        }
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public AgentInterface getAgentInterface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0947fe5a55e0781f2064df21354c476", RobustBitConfig.DEFAULT_VALUE) ? (AgentInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0947fe5a55e0781f2064df21354c476") : this.adapter.getAgentInterface();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void setAgentInterface(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad53ef44c8cfa8374be99b6223fee8b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad53ef44c8cfa8374be99b6223fee8b8");
        } else {
            this.adapter.setAgentInterface(agentInterface);
        }
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public af getSectionCellInterface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0065206ef7984119e9ccbb17daea49dc", RobustBitConfig.DEFAULT_VALUE) ? (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0065206ef7984119e9ccbb17daea49dc") : this.adapter.getSectionCellInterface();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void setSectionCellInterface(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98f3c9ad80fe46a40feb16aef5d70885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98f3c9ad80fe46a40feb16aef5d70885");
        } else {
            this.adapter.setSectionCellInterface(afVar);
        }
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void setAddSpaceForDivider(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb20993e8d902005128c83cd01651173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb20993e8d902005128c83cd01651173");
        } else {
            this.adapter.setAddSpaceForDivider(z);
        }
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public boolean hasBottomDividerVerticalOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa1e4462a36cc1643cb9cd88f161e143", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa1e4462a36cc1643cb9cd88f161e143")).booleanValue() : this.adapter.hasBottomDividerVerticalOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public boolean hasTopDividerVerticalOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5986498d88714c297232ac19b94f0ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5986498d88714c297232ac19b94f0ea")).booleanValue() : this.adapter.hasTopDividerVerticalOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public CellType getCellType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cb8a9259da7467e66c5b0b88799f558", RobustBitConfig.DEFAULT_VALUE) ? (CellType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cb8a9259da7467e66c5b0b88799f558") : this.adapter.getCellType(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public CellType getCellType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bb5f29dc544c85887f3f55d51bcc249", RobustBitConfig.DEFAULT_VALUE) ? (CellType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bb5f29dc544c85887f3f55d51bcc249") : this.adapter.getCellType(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public int getTotalItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7eabd1905b666450f24ff06a1254cf82", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7eabd1905b666450f24ff06a1254cf82")).intValue() : this.adapter.getTotalItemCount();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public boolean isInnerSection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "485ddc1ed306ddf0639307dddd612f06", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "485ddc1ed306ddf0639307dddd612f06")).booleanValue() : this.adapter.isInnerSection(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void onAdapterChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6648db465277412a73ad20908ad68429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6648db465277412a73ad20908ad68429");
            return;
        }
        super.onAdapterChanged();
        getInnerAdapter().onAdapterChanged();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void onAdapterItemRangeChanged(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aecd09bed9c16678f50644699b10f164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aecd09bed9c16678f50644699b10f164");
            return;
        }
        super.onAdapterItemRangeChanged(i, i2);
        getInnerAdapter().onAdapterItemRangeChanged(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void onAdapterItemRangeChanged(int i, int i2, Object obj) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "733747df46972346f99eec585feb9b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "733747df46972346f99eec585feb9b5f");
            return;
        }
        super.onAdapterItemRangeChanged(i, i2, obj);
        getInnerAdapter().onAdapterItemRangeChanged(i, i2, obj);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void onAdapterItemRangeInserted(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02eff6c0de8a6a4e3bdd27b00eeb6de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02eff6c0de8a6a4e3bdd27b00eeb6de7");
            return;
        }
        super.onAdapterItemRangeInserted(i, i2);
        getInnerAdapter().onAdapterItemRangeInserted(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void onAdapterItemRangeRemoved(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a165d763ef96f4e5fd67c23a0da1d02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a165d763ef96f4e5fd67c23a0da1d02");
            return;
        }
        super.onAdapterItemRangeRemoved(i, i2);
        getInnerAdapter().onAdapterItemRangeRemoved(i, i2);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c
    public void onAdapterItemRangeMoved(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56e0ec1f4ec1e1bcbd9ccff7ac7dc4d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56e0ec1f4ec1e1bcbd9ccff7ac7dc4d0");
            return;
        }
        super.onAdapterItemRangeMoved(i, i2, i3);
        getInnerAdapter().onAdapterItemRangeMoved(i, i2, i3);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.shield.adapter.TopInfoListProvider
    public ArrayList<TopPositionAdapter.TopInfo> getTopInfoList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "464e63cff9c7aa9b3cb41f16dbb07ac8", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "464e63cff9c7aa9b3cb41f16dbb07ac8") : getInnerAdapter().getTopInfoList();
    }
}
