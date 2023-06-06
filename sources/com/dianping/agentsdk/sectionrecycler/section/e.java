package com.dianping.agentsdk.sectionrecycler.section;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.util.Pair;
import android.util.SparseArray;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.r;
import com.dianping.shield.layoutmanager.CoveredYInterface;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class e<VH extends RecyclerView.s> extends d<VH> implements com.dianping.agentsdk.sectionrecycler.divider.b, com.dianping.agentsdk.sectionrecycler.divider.d, com.dianping.agentsdk.sectionrecycler.section.a {
    public static final boolean DEBUG = false;
    public static int INDEX_NOT_EXIST = -1;
    protected static final int NO_SPACE_HIGHT = -1;
    public static final String TAG = "e";
    public static int TYPE_NOT_EXIST = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context context;
    protected Drawable defaultDivider;
    protected Drawable defaultFooterDrawable;
    protected Drawable defaultHeaderDrawable;
    protected float defaultOffset;
    protected float defaultRightOffset;
    protected Drawable defaultSectionDivider;
    protected Drawable defaultSpaceDrawable;
    protected float defaultSpaceHight;
    private boolean disableDecoration;
    private boolean disableDivider;
    private SparseArray<a> dividerArrayList;
    private e<VH>.b dividerObserver;
    private boolean hasAddObservable;
    private boolean hasBottomFooterDivider;
    private boolean isHeaderFirst;
    private com.dianping.agentsdk.sectionrecycler.divider.c mHorDividerDecoration;

    private void log(String str, String... strArr) {
    }

    public boolean getNeedDrawCard(int i) {
        return false;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public ShieldDisplayNode getNode(int i) {
        return null;
    }

    public boolean hasTopDividerOffset(c cVar, r.a aVar) {
        return false;
    }

    public boolean showBottomDivider(int i, int i2) {
        return true;
    }

    public boolean showTopDivider(int i, int i2) {
        return true;
    }

    public e(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e9a5e8054a4fed0dac6403baf50b8cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e9a5e8054a4fed0dac6403baf50b8cf");
            return;
        }
        this.disableDivider = false;
        this.disableDecoration = false;
        this.hasBottomFooterDivider = true;
        this.isHeaderFirst = false;
        this.hasAddObservable = false;
        this.dividerObserver = new b();
        this.dividerArrayList = new SparseArray<>();
        this.context = context;
        this.defaultDivider = ContextCompat.getDrawable(getContext(), R.drawable.section_recycler_view_divider);
        this.defaultSectionDivider = ContextCompat.getDrawable(getContext(), R.drawable.section_recycler_view_section_divider);
        this.defaultOffset = aq.a(getContext(), 15.0f);
        this.defaultRightOffset = 0.0f;
        this.defaultSpaceHight = aq.a(getContext(), 10.0f);
        this.defaultSpaceDrawable = null;
        this.defaultHeaderDrawable = null;
        this.defaultFooterDrawable = null;
        this.mHorDividerDecoration = new com.dianping.agentsdk.sectionrecycler.divider.c(this);
        this.mHorDividerDecoration.c = this.hasBottomFooterDivider;
    }

    public void setDisableDecoration(boolean z) {
        this.disableDecoration = z;
    }

    public void setCoveredYInterface(CoveredYInterface coveredYInterface) {
        Object[] objArr = {coveredYInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94d1aa88241effc950e99461124d727c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94d1aa88241effc950e99461124d727c");
        } else {
            this.mHorDividerDecoration.a(coveredYInterface);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void registerAdapterDataObserver(RecyclerView.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "189a5031bee37aa84fb28869a9644048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "189a5031bee37aa84fb28869a9644048");
            return;
        }
        if (!this.hasAddObservable) {
            super.registerAdapterDataObserver(this.dividerObserver);
            this.hasAddObservable = true;
        }
        super.registerAdapterDataObserver(cVar);
    }

    public Context getContext() {
        return this.context;
    }

    public boolean enableDivider() {
        return !this.disableDivider;
    }

    public void updateDividerList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88e04ab0f901bb06facaeead8e79ee5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88e04ab0f901bb06facaeead8e79ee5b");
            return;
        }
        log("updateDividerList ==========================================", new String[0]);
        this.dividerArrayList.clear();
    }

    public void createDividerInfo(int i, Pair<Integer, Integer> pair) {
        Object[] objArr = {Integer.valueOf(i), pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9adca204de492e45765cfa5ade7e677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9adca204de492e45765cfa5ade7e677");
            return;
        }
        a aVar = new a();
        c sectionPosition = getSectionPosition(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
        r dividerInfo = getDividerInfo(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
        aVar.b = getHeaderHeightInner(i, pair, sectionPosition);
        aVar.c = getHeaderDrawableInner(i, pair, sectionPosition);
        aVar.d = getFooterHeightInner(i, pair, sectionPosition);
        aVar.e = getFooterDrawableInner(i, pair, sectionPosition);
        aVar.f = hasTopDividerVerticalOffsetInner(i, pair, sectionPosition);
        aVar.g = hasBottomDividerVerticalOffsetInner(i, pair, sectionPosition);
        aVar.h = getTopDividerInner(i, pair, sectionPosition, dividerInfo);
        aVar.i = topDividerOffsetInner(i, pair, sectionPosition, dividerInfo);
        aVar.j = getBottomDividerInner(i, pair, sectionPosition, dividerInfo);
        aVar.k = bottomDividerOffsetInner(i, pair, sectionPosition, dividerInfo);
        this.dividerArrayList.put(i, aVar);
        log("divider " + i + " => " + aVar + "\n", new String[0]);
    }

    public a getDividerItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "faad155bd99a8a2f04e2b93f5bcb455d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "faad155bd99a8a2f04e2b93f5bcb455d");
        }
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        if (this.dividerArrayList.indexOfKey(i) < 0) {
            createDividerInfo(i, getSectionIndex(i));
        }
        return this.dividerArrayList.get(i);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d, android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(VH vh, int i) {
        Object[] objArr = {vh, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95d4331d1bf0983fcde83edd725a8925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95d4331d1bf0983fcde83edd725a8925");
            return;
        }
        Pair<Integer, Integer> sectionIndex = getSectionIndex(i);
        if (sectionIndex != null) {
            this.isOnBind = true;
            onBindViewHolder((e<VH>) vh, ((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue());
            if (this.dividerArrayList.indexOfKey(i) < 0) {
                createDividerInfo(i, sectionIndex);
            }
            this.isOnBind = false;
        }
    }

    public void setEnableDivider(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fe21d809aea5efeb9f332c42833e7b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fe21d809aea5efeb9f332c42833e7b0");
            return;
        }
        this.disableDivider = !z ? 1 : 0;
        notifyDataSetChanged();
    }

    public void setSectionGapMode(boolean z) {
        this.isHeaderFirst = z;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d, android.support.v7.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f25f2284306eeb5a18237bbba20743d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f25f2284306eeb5a18237bbba20743d9");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView == null || this.disableDecoration) {
            return;
        }
        recyclerView.addItemDecoration(this.mHorDividerDecoration);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d, android.support.v7.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb5d3db3d3028e09a99cdee25d320b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb5d3db3d3028e09a99cdee25d320b34");
            return;
        }
        if (recyclerView != null && this.mHorDividerDecoration != null) {
            recyclerView.removeItemDecoration(this.mHorDividerDecoration);
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public void setBottomFooterDividerDecoration(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "115efc0b0a911fba1be3bb6d143b3c96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "115efc0b0a911fba1be3bb6d143b3c96");
            return;
        }
        this.hasBottomFooterDivider = z;
        if (this.mHorDividerDecoration != null) {
            this.mHorDividerDecoration.c = z;
            notifyDataSetChanged();
        }
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public float getHeaderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6bd58429064a9ebbf585633417a5251", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6bd58429064a9ebbf585633417a5251")).floatValue();
        }
        log("getHeaderHeight: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.b;
        }
        return 0.0f;
    }

    public final float getHeaderHeightInner(int i, Pair<Integer, Integer> pair, c cVar) {
        Object[] objArr = {Integer.valueOf(i), pair, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed71f200f20f5f248b69d9182f4ac8f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed71f200f20f5f248b69d9182f4ac8f6")).floatValue();
        }
        log("getHeaderHeightInner: " + pair, new String[0]);
        if (cVar == c.TOP || cVar == c.SINGLE) {
            float sectionHeaderHeight = getSectionHeaderHeight(((Integer) pair.first).intValue());
            if (sectionHeaderHeight >= 0.0f) {
                return sectionHeaderHeight;
            }
            if (this.isHeaderFirst && i != 0 && ((Integer) pair.second).intValue() == 0) {
                return this.defaultSpaceHight;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Drawable getHeaderDrawable(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a4c13cad53bf04a392522222d814a43", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a4c13cad53bf04a392522222d814a43");
        }
        log("getHeaderDrawable: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.c;
        }
        return null;
    }

    public Drawable getHeaderDrawableInner(int i, Pair<Integer, Integer> pair, c cVar) {
        Object[] objArr = {Integer.valueOf(i), pair, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193a49a2b17f54730572982b551172ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193a49a2b17f54730572982b551172ed");
        }
        log("getHeaderDrawableInner: " + i, new String[0]);
        if (cVar == c.TOP || cVar == c.SINGLE) {
            Drawable sectionHeaderDrawable = getSectionHeaderDrawable(((Integer) pair.first).intValue());
            if (sectionHeaderDrawable != null) {
                return sectionHeaderDrawable;
            }
            if (this.isHeaderFirst) {
                if (this.defaultHeaderDrawable != null) {
                    return this.defaultHeaderDrawable;
                }
                return this.defaultSpaceDrawable;
            }
            return null;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public float getFooterHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1eb460b04842e3ba54d366444b8261a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1eb460b04842e3ba54d366444b8261a")).floatValue();
        }
        log("getFooterHeight: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        int itemCount = getItemCount() - 1;
        if (dividerItem != null) {
            if (itemCount != i || this.hasBottomFooterDivider) {
                return dividerItem.d;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final float getFooterHeightInner(int i, Pair<Integer, Integer> pair, c cVar) {
        Object[] objArr = {Integer.valueOf(i), pair, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df8bedc0cc637a76a20d8e8926063f5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df8bedc0cc637a76a20d8e8926063f5e")).floatValue();
        }
        log("getFooterHeightInner: " + i, new String[0]);
        if (cVar == c.BOTTOM || cVar == c.SINGLE) {
            float sectionFooterHeight = getSectionFooterHeight(((Integer) pair.first).intValue());
            if (sectionFooterHeight >= 0.0f) {
                return sectionFooterHeight;
            }
            if (!this.isHeaderFirst || i == getItemCount() - 1) {
                return this.defaultSpaceHight;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Drawable getFooterDrawable(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e15cfeb1a330857944f9489b75d7b259", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e15cfeb1a330857944f9489b75d7b259");
        }
        log("getFooterDrawable: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.e;
        }
        return null;
    }

    public Drawable getFooterDrawableInner(int i, Pair<Integer, Integer> pair, c cVar) {
        Object[] objArr = {Integer.valueOf(i), pair, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5d4a31fe6d8d15c158bdff5a6b977fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5d4a31fe6d8d15c158bdff5a6b977fa");
        }
        if (cVar == c.BOTTOM || cVar == c.SINGLE) {
            Drawable sectionFooterDrawable = getSectionFooterDrawable(((Integer) pair.first).intValue());
            if (sectionFooterDrawable != null) {
                return sectionFooterDrawable;
            }
            if (this.isHeaderFirst) {
                return null;
            }
            if (this.defaultFooterDrawable != null) {
                return this.defaultFooterDrawable;
            }
            return this.defaultSpaceDrawable;
        }
        return null;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public boolean hasTopDividerVerticalOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6c10e1e0a35e5f6a0d60c37ba9a2e0b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6c10e1e0a35e5f6a0d60c37ba9a2e0b")).booleanValue();
        }
        log("hasTopDividerVerticalOffset: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.f;
        }
        return false;
    }

    public boolean hasTopDividerVerticalOffsetInner(int i, Pair<Integer, Integer> pair, c cVar) {
        Object[] objArr = {Integer.valueOf(i), pair, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94563d14552f9a40d6adc0c4532891c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94563d14552f9a40d6adc0c4532891c2")).booleanValue();
        }
        log("hasTopDividerVerticalOffsetInner: " + i, new String[0]);
        if (pair != null) {
            return hasTopDividerVerticalOffset(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
        }
        return false;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public boolean hasBottomDividerVerticalOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2eee4c6addbcc8a61b8de83acf3b0927", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2eee4c6addbcc8a61b8de83acf3b0927")).booleanValue();
        }
        log("hasBottomDividerVerticalOffset: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.g;
        }
        return false;
    }

    public boolean hasBottomDividerVerticalOffsetInner(int i, Pair<Integer, Integer> pair, c cVar) {
        Object[] objArr = {Integer.valueOf(i), pair, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "904fcf7c261549009a3e3e0700eec81f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "904fcf7c261549009a3e3e0700eec81f")).booleanValue();
        }
        log("hasBottomDividerVerticalOffsetInner: " + i, new String[0]);
        if (pair != null) {
            return hasBottomDividerVerticalOffset(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
        }
        return false;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Drawable getTopDivider(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccc4f734cc121d9328164c42b99d703c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccc4f734cc121d9328164c42b99d703c");
        }
        log("getTopDivider: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.h;
        }
        return null;
    }

    public final Drawable getTopDividerInner(int i, Pair<Integer, Integer> pair, c cVar, r rVar) {
        Object[] objArr = {Integer.valueOf(i), pair, cVar, rVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbde2247557362453933ca21c0f894a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbde2247557362453933ca21c0f894a4");
        }
        log("getTopDividerInner: " + i, new String[0]);
        if (enableDivider() && showTopDivider(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue())) {
            Drawable topDivider = getTopDivider(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
            if (topDivider != null) {
                return topDivider;
            }
            if (rVar != null) {
                r.a a2 = rVar.a();
                if (a2 == r.a.NONE) {
                    return null;
                }
                if (hasTopDivider(cVar, a2)) {
                    if (a2 == r.a.TOP || a2 == r.a.SINGLE || (a2 == r.a.AUTO && (cVar == c.TOP || cVar == c.SINGLE))) {
                        Drawable drawable = rVar.d;
                        return drawable != null ? drawable : this.defaultSectionDivider;
                    }
                    Drawable drawable2 = rVar.e;
                    return drawable2 != null ? drawable2 : this.defaultDivider;
                }
            }
            if (cVar == c.TOP || cVar == c.SINGLE) {
                return this.defaultSectionDivider;
            }
            return null;
        }
        return null;
    }

    private boolean hasTopDivider(c cVar, r.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75ee2bc881298ce5643ea8951fa77d1d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75ee2bc881298ce5643ea8951fa77d1d")).booleanValue() : (aVar == r.a.AUTO && (cVar == c.TOP || cVar == c.SINGLE)) || aVar == r.a.TOP || aVar == r.a.SINGLE;
    }

    private boolean hasBottomDivider(c cVar, r.a aVar) {
        return aVar != r.a.NONE;
    }

    public boolean hasBottomDividerOffset(c cVar, r.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "257d85017f9888aca2de92c34f748ed8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "257d85017f9888aca2de92c34f748ed8")).booleanValue() : (aVar == r.a.AUTO && (cVar == c.TOP || cVar == c.MIDDLE)) || aVar == r.a.TOP || aVar == r.a.MIDDLE;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Drawable getBottomDivider(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e38cbaf8d6fdbaf3261f70e8099b3364", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e38cbaf8d6fdbaf3261f70e8099b3364");
        }
        log("getBottomDivider: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.j;
        }
        return null;
    }

    public final Drawable getBottomDividerInner(int i, Pair<Integer, Integer> pair, c cVar, r rVar) {
        Object[] objArr = {Integer.valueOf(i), pair, cVar, rVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "153f296abf3975936ab78e06a3f347f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "153f296abf3975936ab78e06a3f347f2");
        }
        log("getBottomDividerInner: " + i, new String[0]);
        if (enableDivider() && showBottomDivider(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue())) {
            Drawable bottomDivider = getBottomDivider(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
            if (bottomDivider != null) {
                return bottomDivider;
            }
            if (rVar != null) {
                r.a a2 = rVar.a();
                if (a2 == r.a.NONE) {
                    return null;
                }
                if (hasBottomDivider(cVar, a2)) {
                    if (a2 == r.a.BOTTOM || a2 == r.a.SINGLE || (a2 == r.a.AUTO && (cVar == c.BOTTOM || cVar == c.SINGLE))) {
                        Drawable drawable = rVar.f;
                        return drawable != null ? drawable : this.defaultSectionDivider;
                    }
                    Drawable drawable2 = rVar.e;
                    return drawable2 != null ? drawable2 : this.defaultDivider;
                }
            }
            if (cVar == c.BOTTOM || cVar == c.SINGLE) {
                return this.defaultSectionDivider;
            }
            return this.defaultDivider;
        }
        return null;
    }

    private c getSectionPosition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c493cfc3611548c165872989a5f188da", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c493cfc3611548c165872989a5f188da");
        }
        if (i < 0 || i >= getSectionCount()) {
            return c.UNKNOWN;
        }
        int rowCount = getRowCount(i);
        if (rowCount < 0 || i2 < 0 || i2 >= rowCount) {
            return c.UNKNOWN;
        }
        if (rowCount == 1) {
            return c.SINGLE;
        }
        if (i2 == 0) {
            return c.TOP;
        }
        if (i2 == rowCount - 1) {
            return c.BOTTOM;
        }
        return c.MIDDLE;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Rect topDividerOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f5c604201373e302bd7f998bc99fd2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f5c604201373e302bd7f998bc99fd2d");
        }
        log("topDividerOffset: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.i;
        }
        return null;
    }

    public final Rect topDividerOffsetInner(int i, Pair<Integer, Integer> pair, c cVar, r rVar) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {Integer.valueOf(i), pair, cVar, rVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4cf35fd49a50a2e96d1e884b3c7760a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4cf35fd49a50a2e96d1e884b3c7760a");
        }
        log("topDividerOffsetInner: " + i, new String[0]);
        Rect rect = topDividerOffset(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
        if (rect != null) {
            return rect;
        }
        Rect rect2 = new Rect();
        if (rVar != null && hasTopDividerOffset(cVar, rVar.a())) {
            int i2 = rVar.b;
            if (i2 >= 0) {
                rect2.left = i2;
                z = true;
            } else {
                z = false;
            }
            int i3 = rVar.c;
            if (i3 >= 0) {
                rect2.right = i3;
                z2 = true;
            }
            if (!z) {
                rect2.left = (int) this.defaultOffset;
            }
            if (!z2) {
                rect2.right = (int) this.defaultRightOffset;
            }
        }
        return rect2;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.b
    public Rect bottomDividerOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b4fc4a0f361df7e4760125eb7311ffd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b4fc4a0f361df7e4760125eb7311ffd");
        }
        log("bottomDividerOffset: " + i, new String[0]);
        a dividerItem = getDividerItem(i);
        if (dividerItem != null) {
            return dividerItem.k;
        }
        return null;
    }

    public final Rect bottomDividerOffsetInner(int i, Pair<Integer, Integer> pair, c cVar, r rVar) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {Integer.valueOf(i), pair, cVar, rVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6047ccff578124330279521908197d69", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6047ccff578124330279521908197d69");
        }
        log("bottomDividerOffsetInner: " + i, new String[0]);
        Rect bottomDividerOffset = bottomDividerOffset(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
        if (bottomDividerOffset != null) {
            return bottomDividerOffset;
        }
        Rect rect = new Rect();
        if (rVar != null) {
            if (hasBottomDividerOffset(cVar, rVar.a())) {
                int i2 = rVar.b;
                if (i2 >= 0) {
                    rect.left = i2;
                    z = true;
                } else {
                    z = false;
                }
                int i3 = rVar.c;
                if (i3 >= 0) {
                    rect.right = i3;
                    z2 = true;
                }
                if (!z) {
                    rect.left = (int) this.defaultOffset;
                }
                if (!z2) {
                    rect.right = (int) this.defaultRightOffset;
                }
            }
        } else if (cVar == c.MIDDLE || cVar == c.TOP) {
            rect.left = (int) this.defaultOffset;
            rect.right = (int) this.defaultRightOffset;
        }
        return rect;
    }

    public void setDefaultSectionDivider(Drawable drawable) {
        this.defaultSectionDivider = drawable;
    }

    public void setDefaultDivider(Drawable drawable) {
        this.defaultDivider = drawable;
    }

    public void setDefaultOffset(float f) {
        this.defaultOffset = f;
    }

    public void setDefaultRightOffset(float f) {
        this.defaultRightOffset = f;
    }

    public void setDefaultSpaceHight(float f) {
        this.defaultSpaceHight = f;
    }

    public void setDefaultSpaceDrawable(Drawable drawable) {
        this.defaultSpaceDrawable = drawable;
    }

    public void setDefaultHeaderDrawable(Drawable drawable) {
        this.defaultHeaderDrawable = drawable;
    }

    public void setDefaultFooterDrawable(Drawable drawable) {
        this.defaultFooterDrawable = drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum c {
        UNKNOWN,
        TOP,
        MIDDLE,
        BOTTOM,
        SINGLE;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76fd77d5b3fd77e6e7d88e344bd2c65f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76fd77d5b3fd77e6e7d88e344bd2c65f");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb1736cc5042227108d6df0fc729ce3c", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb1736cc5042227108d6df0fc729ce3c") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48b1026de592b2a50e9faea7ca8e0b00", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48b1026de592b2a50e9faea7ca8e0b00") : (c[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public float b;
        public Drawable c;
        public float d;
        public Drawable e;
        public boolean f;
        public boolean g;
        public Drawable h;
        public Rect i;
        public Drawable j;
        public Rect k;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "483701bd9834019d1cd65cefabca692d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "483701bd9834019d1cd65cefabca692d");
            }
            return "Divider{headerGapHeight=" + this.b + ", headerGapDrawable=" + this.c + ", footerGapHeight=" + this.d + ", footerGapDrawable=" + this.e + ", hasTopDividerVerticalOffset=" + this.f + ", hasBottomDividerVerticalOffset=" + this.g + ", topDivider=" + this.h + ", topDividerOffset=" + this.i + ", bottomDivider=" + this.j + ", bottomDividerOffset=" + this.k + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.c {
        public static ChangeQuickRedirect a;

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2, Object obj) {
        }

        public b() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b613ebc5b63051f4db33944d9aac8be", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b613ebc5b63051f4db33944d9aac8be");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470c31b0cd1da3ab9e449ac1ecf02671", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470c31b0cd1da3ab9e449ac1ecf02671");
            } else {
                e.this.updateDividerList();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e10a9d0243cc80b7e2e764c0e04e6c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e10a9d0243cc80b7e2e764c0e04e6c1");
            } else {
                e.this.updateDividerList();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce7729f3e2663c552c34817c48bb2ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce7729f3e2663c552c34817c48bb2ca");
            } else {
                e.this.updateDividerList();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508afa378862b62212ded0d77221a7ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508afa378862b62212ded0d77221a7ae");
            } else {
                e.this.updateDividerList();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeMoved(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b6535a728c877abf372a0ce9065a546", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b6535a728c877abf372a0ce9065a546");
            } else {
                e.this.updateDividerList();
            }
        }
    }
}
