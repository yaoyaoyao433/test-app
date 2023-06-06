package com.dianping.shield.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Pair;
import com.dianping.agentsdk.adapter.n;
import com.dianping.agentsdk.pagecontainer.i;
import com.dianping.agentsdk.sectionrecycler.section.c;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.ExtraCellTopInterface;
import com.dianping.shield.feature.ExtraCellTopParamsInterface;
import com.dianping.shield.feature.SetTopInterface;
import com.dianping.shield.feature.SetTopParamsInterface;
import com.dianping.shield.feature.TopPositionInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TopPositionAdapter extends n<TopPositionInterface> implements TopInfoListProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected ExtraCellTopInterface extraCellTopInterface;
    protected ExtraCellTopParamsInterface extraCellTopParamsInterface;
    protected SetTopInterface setTopInterface;
    protected SetTopParamsInterface setTopParamsInterface;
    protected ArrayList<TopInfo> topInfoArrayList;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface TopInfoCreator {
        TopInfo getTopInfo(int i, int i2);
    }

    public TopPositionAdapter(@NonNull Context context, @NonNull c cVar, TopPositionInterface topPositionInterface) {
        super(context, cVar, topPositionInterface);
        Object[] objArr = {context, cVar, topPositionInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6121e85736174f7a84a96fd116846d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6121e85736174f7a84a96fd116846d6");
        } else {
            this.topInfoArrayList = new ArrayList<>();
        }
    }

    public void setSetTopInterface(SetTopInterface setTopInterface) {
        this.setTopInterface = setTopInterface;
    }

    public void setSetTopParamsInterface(SetTopParamsInterface setTopParamsInterface) {
        this.setTopParamsInterface = setTopParamsInterface;
    }

    public void setExtraCellTopInterface(ExtraCellTopInterface extraCellTopInterface) {
        this.extraCellTopInterface = extraCellTopInterface;
    }

    public void setExtraCellTopParamsInterface(ExtraCellTopParamsInterface extraCellTopParamsInterface) {
        this.extraCellTopParamsInterface = extraCellTopParamsInterface;
    }

    public void updateTopInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a6d039ce83c94f1e3fce76079f65b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a6d039ce83c94f1e3fce76079f65b10");
        } else if (this.extraInterface != 0) {
            updateTopInfoArrayList(new TopInfoCreator() { // from class: com.dianping.shield.adapter.TopPositionAdapter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.adapter.TopPositionAdapter.TopInfoCreator
                public TopInfo getTopInfo(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "997c9a4d4bf475a5cdd25504f02066f1", RobustBitConfig.DEFAULT_VALUE)) {
                        return (TopInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "997c9a4d4bf475a5cdd25504f02066f1");
                    }
                    CellType cellType = TopPositionAdapter.this.getCellType(i, i2);
                    Pair<Integer, Integer> innerPosition = TopPositionAdapter.this.getInnerPosition(i, i2);
                    TopPositionInterface.TopPositionInfo topPositionInfo = ((TopPositionInterface) TopPositionAdapter.this.extraInterface).getTopPositionInfo(cellType, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue());
                    if (topPositionInfo == null) {
                        return null;
                    }
                    return new TopInfo(i, i2, topPositionInfo.zPosition, topPositionInfo.offset, topPositionInfo.startTop, topPositionInfo.stopTop, topPositionInfo.onTopStateChangeListener);
                }
            });
        } else if (this.setTopInterface == null && this.setTopParamsInterface == null && this.extraCellTopInterface == null && this.extraCellTopParamsInterface == null) {
        } else {
            updateTopInfoArrayList(new TopInfoCreator() { // from class: com.dianping.shield.adapter.TopPositionAdapter.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.adapter.TopPositionAdapter.TopInfoCreator
                public TopInfo getTopInfo(int i, int i2) {
                    boolean isFooterTopView;
                    int i3;
                    int i4;
                    int i5 = 0;
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3eec8ebbd46f5e92348576c48dda32bb", RobustBitConfig.DEFAULT_VALUE)) {
                        return (TopInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3eec8ebbd46f5e92348576c48dda32bb");
                    }
                    int itemViewType = TopPositionAdapter.this.getItemViewType(i, i2);
                    int innerType = TopPositionAdapter.this.getInnerType(itemViewType);
                    CellType cellType = TopPositionAdapter.this.getCellType(itemViewType);
                    if (cellType == CellType.NORMAL) {
                        if (TopPositionAdapter.this.setTopParamsInterface != null) {
                            isFooterTopView = TopPositionAdapter.this.setTopParamsInterface.isTopView(innerType);
                            i setTopParams = TopPositionAdapter.this.setTopParamsInterface.getSetTopParams(innerType);
                            if (setTopParams != null) {
                                i5 = setTopParams.a;
                            }
                            i4 = i5;
                        } else {
                            if (TopPositionAdapter.this.setTopInterface != null) {
                                isFooterTopView = TopPositionAdapter.this.setTopInterface.isTopView(innerType);
                                i4 = 0;
                            }
                            isFooterTopView = false;
                            i4 = 0;
                        }
                    } else if (cellType == CellType.HEADER) {
                        if (TopPositionAdapter.this.extraCellTopParamsInterface != null) {
                            isFooterTopView = TopPositionAdapter.this.extraCellTopParamsInterface.isHeaderTopView(innerType);
                            i headerSetTopParams = TopPositionAdapter.this.extraCellTopParamsInterface.getHeaderSetTopParams(innerType);
                            if (headerSetTopParams != null) {
                                i3 = headerSetTopParams.a;
                                i5 = i3;
                            }
                            i4 = i5;
                        } else {
                            if (TopPositionAdapter.this.extraCellTopInterface != null) {
                                isFooterTopView = TopPositionAdapter.this.extraCellTopInterface.isHeaderTopView(innerType);
                                i4 = 0;
                            }
                            isFooterTopView = false;
                            i4 = 0;
                        }
                    } else {
                        if (cellType == CellType.FOOTER) {
                            if (TopPositionAdapter.this.extraCellTopParamsInterface != null) {
                                isFooterTopView = TopPositionAdapter.this.extraCellTopParamsInterface.isFooterTopView(innerType);
                                i footerSetTopParams = TopPositionAdapter.this.extraCellTopParamsInterface.getFooterSetTopParams(innerType);
                                if (footerSetTopParams != null) {
                                    i3 = footerSetTopParams.a;
                                    i5 = i3;
                                }
                                i4 = i5;
                            } else if (TopPositionAdapter.this.extraCellTopInterface != null) {
                                isFooterTopView = TopPositionAdapter.this.extraCellTopInterface.isFooterTopView(innerType);
                                i4 = 0;
                            }
                        }
                        isFooterTopView = false;
                        i4 = 0;
                    }
                    if (isFooterTopView) {
                        return new TopInfo(i, i2, 0, i4, TopPositionInterface.AutoStartTop.SELF, TopPositionInterface.AutoStopTop.NONE, null);
                    }
                    return null;
                }
            });
        }
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.shield.adapter.TopInfoListProvider
    public ArrayList<TopInfo> getTopInfoList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5f1e128ce0bcc059147dd6a6a627457", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5f1e128ce0bcc059147dd6a6a627457");
        }
        updateTopInfo();
        return this.topInfoArrayList;
    }

    public void updateTopInfoArrayList(TopInfoCreator topInfoCreator) {
        Object[] objArr = {topInfoCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d710c30a6294fe451297c335662f5cb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d710c30a6294fe451297c335662f5cb9");
            return;
        }
        this.topInfoArrayList.clear();
        for (int i = 0; i < getSectionCount(); i++) {
            int rowCount = getRowCount(i);
            for (int i2 = 0; i2 < rowCount; i2++) {
                TopInfo topInfo = topInfoCreator.getTopInfo(i, i2);
                if (topInfo != null) {
                    this.topInfoArrayList.add(topInfo);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TopInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public TopPositionInterface.AutoStopTop end;
        public int offset;
        public TopPositionInterface.OnTopStateChangeListener onTopStateChangeListener;
        public int row;
        public int section;
        public TopPositionInterface.AutoStartTop start;
        public int zPosition;
        public int sectionStart = -1;
        public int sectionEnd = -1;
        public int moduleStart = -1;
        public int moduleEnd = -1;

        public TopInfo(int i, int i2, int i3, int i4, TopPositionInterface.AutoStartTop autoStartTop, TopPositionInterface.AutoStopTop autoStopTop, TopPositionInterface.OnTopStateChangeListener onTopStateChangeListener) {
            this.section = i;
            this.row = i2;
            this.zPosition = i3;
            this.offset = i4;
            this.start = autoStartTop;
            this.end = autoStopTop;
            this.onTopStateChangeListener = onTopStateChangeListener;
        }
    }
}
