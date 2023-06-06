package com.dianping.shield.dynamic.model.cell;

import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.extra.ExposeInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.model.view.GridItemViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b5\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R2\u0010\u0017\u001a\u001a\u0012\u0006\b\u0000\u0012\u00020\u0019\u0018\u00010\u0018j\f\u0012\u0006\b\u0000\u0012\u00020\u0019\u0018\u0001`\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001e\u0010+\u001a\u0004\u0018\u00010 X\u0096\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/RD\u00101\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0018\u0018\u00010\u0018j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0018j\b\u0012\u0004\u0012\u00020\u0005`\u001a\u0018\u0001`\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR.\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001e\u00107\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b8\u0010-\"\u0004\b9\u0010/R.\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR\u001e\u0010=\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b>\u0010-\"\u0004\b?\u0010/R\u001c\u0010@\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\u001e\u0010C\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bD\u0010-\"\u0004\bE\u0010/R\u001c\u0010F\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\r\"\u0004\bH\u0010\u000fR\u001c\u0010I\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\tR\u001e\u0010L\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bM\u0010-\"\u0004\bN\u0010/R\u001e\u0010O\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bP\u0010-\"\u0004\bQ\u0010/R\u001e\u0010R\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bS\u0010-\"\u0004\bT\u0010/¨\u0006U"}, d2 = {"Lcom/dianping/shield/dynamic/model/cell/GridCellInfo;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "Lcom/dianping/shield/dynamic/model/extra/ExposeInfo;", "()V", DMKeys.KEY_APPEAR_ON_SCREEN_CALLBACK, "", "getAppearOnScreenCallback", "()Ljava/lang/String;", "setAppearOnScreenCallback", "(Ljava/lang/String;)V", "backgroundView", "Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType;", "getBackgroundView", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType;", "setBackgroundView", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewUnionType;)V", DMKeys.KEY_CAN_REPEAT_EXPOSE, "", "getCanRepeatExpose", "()Ljava/lang/Boolean;", "setCanRepeatExpose", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "children", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/view/GridItemViewInfo;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", DMKeys.KEY_COLCOUNT, "", "getColCount", "()I", "setColCount", "(I)V", DMKeys.KEY_DISAPPEAR_FROM_SCREEN_CALLBACK, "getDisappearFromScreenCallback", "setDisappearFromScreenCallback", DMKeys.KEY_EXPOSE_CALLBACK, "getExposeCallback", "setExposeCallback", DMKeys.KEY_EXPOSE_DELAY, "getExposeDelay", "()Ljava/lang/Integer;", "setExposeDelay", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_GRID_AREAS, "getGridAreas", "setGridAreas", DMKeys.KEY_GRID_COLUMN_WIDTHS, "getGridColWidths", "setGridColWidths", "gridHeight", "getGridHeight", "setGridHeight", DMKeys.KEY_GRID_ROW_HEIGHTS, "getGridRowHeights", "setGridRowHeights", DMKeys.KEY_GRID_SELECTION_STYLE, "getGridSelectionStyle", "setGridSelectionStyle", DMKeys.KEY_GRID_SEPARATOR_LINE_COLOR, "getGridSeparatorLineColor", "setGridSeparatorLineColor", DMKeys.KEY_GRID_SEPARATOR_LINE_STYLE, "getGridSeparatorLineStyle", "setGridSeparatorLineStyle", "maskView", "getMaskView", "setMaskView", DMKeys.KEY_REUSE_IDENTIFIER, "getReuseIdentifier", "setReuseIdentifier", DMKeys.KEY_ROWCOUNT, "getRowCount", "setRowCount", DMKeys.KEY_XGAP, "getXGap", "setXGap", DMKeys.KEY_YGAP, "getYGap", "setYGap", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridCellInfo extends CellInfo.BaseCellInfo implements ExposeInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String appearOnScreenCallback;
    @Nullable
    private ExtraViewUnionType backgroundView;
    @Nullable
    private Boolean canRepeatExpose;
    @Nullable
    private ArrayList<? super GridItemViewInfo> children;
    private int colCount;
    @Nullable
    private String disappearFromScreenCallback;
    @Nullable
    private String exposeCallback;
    @Nullable
    private Integer exposeDelay;
    @Nullable
    private ArrayList<ArrayList<String>> gridAreas;
    @Nullable
    private ArrayList<String> gridColWidths;
    @Nullable
    private Integer gridHeight;
    @Nullable
    private ArrayList<String> gridRowHeights;
    @Nullable
    private Integer gridSelectionStyle;
    @Nullable
    private String gridSeparatorLineColor;
    @Nullable
    private Integer gridSeparatorLineStyle;
    @Nullable
    private ExtraViewUnionType maskView;
    @Nullable
    private String reuseIdentifier;
    @Nullable
    private Integer rowCount;
    @Nullable
    private Integer xGap;
    @Nullable
    private Integer yGap;

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final Integer getExposeDelay() {
        return this.exposeDelay;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setExposeDelay(@Nullable Integer num) {
        this.exposeDelay = num;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final Boolean getCanRepeatExpose() {
        return this.canRepeatExpose;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setCanRepeatExpose(@Nullable Boolean bool) {
        this.canRepeatExpose = bool;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getExposeCallback() {
        return this.exposeCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setExposeCallback(@Nullable String str) {
        this.exposeCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getAppearOnScreenCallback() {
        return this.appearOnScreenCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setAppearOnScreenCallback(@Nullable String str) {
        this.appearOnScreenCallback = str;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    @Nullable
    public final String getDisappearFromScreenCallback() {
        return this.disappearFromScreenCallback;
    }

    @Override // com.dianping.shield.dynamic.model.extra.ExposeInfo
    public final void setDisappearFromScreenCallback(@Nullable String str) {
        this.disappearFromScreenCallback = str;
    }

    @Nullable
    public final ArrayList<? super GridItemViewInfo> getChildren() {
        return this.children;
    }

    public final void setChildren(@Nullable ArrayList<? super GridItemViewInfo> arrayList) {
        this.children = arrayList;
    }

    @Nullable
    public final ExtraViewUnionType getBackgroundView() {
        return this.backgroundView;
    }

    public final void setBackgroundView(@Nullable ExtraViewUnionType extraViewUnionType) {
        this.backgroundView = extraViewUnionType;
    }

    @Nullable
    public final ExtraViewUnionType getMaskView() {
        return this.maskView;
    }

    public final void setMaskView(@Nullable ExtraViewUnionType extraViewUnionType) {
        this.maskView = extraViewUnionType;
    }

    public final int getColCount() {
        return this.colCount;
    }

    public final void setColCount(int i) {
        this.colCount = i;
    }

    @Nullable
    public final Integer getRowCount() {
        return this.rowCount;
    }

    public final void setRowCount(@Nullable Integer num) {
        this.rowCount = num;
    }

    @Nullable
    public final Integer getGridHeight() {
        return this.gridHeight;
    }

    public final void setGridHeight(@Nullable Integer num) {
        this.gridHeight = num;
    }

    @Nullable
    public final Integer getXGap() {
        return this.xGap;
    }

    public final void setXGap(@Nullable Integer num) {
        this.xGap = num;
    }

    @Nullable
    public final Integer getYGap() {
        return this.yGap;
    }

    public final void setYGap(@Nullable Integer num) {
        this.yGap = num;
    }

    @Nullable
    public final Integer getGridSelectionStyle() {
        return this.gridSelectionStyle;
    }

    public final void setGridSelectionStyle(@Nullable Integer num) {
        this.gridSelectionStyle = num;
    }

    @Nullable
    public final Integer getGridSeparatorLineStyle() {
        return this.gridSeparatorLineStyle;
    }

    public final void setGridSeparatorLineStyle(@Nullable Integer num) {
        this.gridSeparatorLineStyle = num;
    }

    @Nullable
    public final String getGridSeparatorLineColor() {
        return this.gridSeparatorLineColor;
    }

    public final void setGridSeparatorLineColor(@Nullable String str) {
        this.gridSeparatorLineColor = str;
    }

    @Nullable
    public final ArrayList<String> getGridRowHeights() {
        return this.gridRowHeights;
    }

    public final void setGridRowHeights(@Nullable ArrayList<String> arrayList) {
        this.gridRowHeights = arrayList;
    }

    @Nullable
    public final ArrayList<String> getGridColWidths() {
        return this.gridColWidths;
    }

    public final void setGridColWidths(@Nullable ArrayList<String> arrayList) {
        this.gridColWidths = arrayList;
    }

    @Nullable
    public final ArrayList<ArrayList<String>> getGridAreas() {
        return this.gridAreas;
    }

    public final void setGridAreas(@Nullable ArrayList<ArrayList<String>> arrayList) {
        this.gridAreas = arrayList;
    }

    @Nullable
    public final String getReuseIdentifier() {
        return this.reuseIdentifier;
    }

    public final void setReuseIdentifier(@Nullable String str) {
        this.reuseIdentifier = str;
    }
}
