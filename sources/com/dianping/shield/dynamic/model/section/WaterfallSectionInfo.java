package com.dianping.shield.dynamic.model.section;

import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.section.SectionInfo;
import com.dianping.shield.dynamic.model.view.ReusableViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.animator.AnimationType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR2\u0010\u0010\u001a\u001a\u0012\u0006\b\u0000\u0012\u00020\u0012\u0018\u00010\u0011j\f\u0012\u0006\b\u0000\u0012\u00020\u0012\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00106\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\u001e\u00109\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b:\u00102\"\u0004\b;\u00104¨\u0006<"}, d2 = {"Lcom/dianping/shield/dynamic/model/section/WaterfallSectionInfo;", "Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "()V", DMKeys.KEY_AUTO_MARGIN, "", "getAutoMargin", "()Ljava/lang/Boolean;", "setAutoMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "children", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/model/view/ReusableViewInfo;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", DMKeys.KEY_COLCOUNT, "", "getColCount", "()I", "setColCount", "(I)V", "deleteAnimationType", "Lcom/dianping/shield/node/adapter/animator/AnimationType;", "getDeleteAnimationType", "()Lcom/dianping/shield/node/adapter/animator/AnimationType;", "setDeleteAnimationType", "(Lcom/dianping/shield/node/adapter/animator/AnimationType;)V", "enableLayoutAnimation", "getEnableLayoutAnimation", "setEnableLayoutAnimation", "insertAnimationType", "getInsertAnimationType", "setInsertAnimationType", DMKeys.KEY_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", DMKeys.KEY_SELECTION_STYLE, "getSelectionStyle", "()Ljava/lang/Integer;", "setSelectionStyle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_XGAP, "getXGap", "setXGap", DMKeys.KEY_YGAP, "getYGap", "setYGap", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class WaterfallSectionInfo extends SectionInfo.BaseSectionInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean autoMargin;
    @Nullable
    private String backgroundColor;
    @Nullable
    private ArrayList<? super ReusableViewInfo> children;
    private int colCount;
    @Nullable
    private AnimationType deleteAnimationType;
    @Nullable
    private Boolean enableLayoutAnimation;
    @Nullable
    private AnimationType insertAnimationType;
    @Nullable
    private MarginInfo marginInfo;
    @Nullable
    private Integer selectionStyle;
    @Nullable
    private Integer xGap;
    @Nullable
    private Integer yGap;

    public WaterfallSectionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "578368f577f2d14a5b2e1481b28c30c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "578368f577f2d14a5b2e1481b28c30c9");
        } else {
            this.enableLayoutAnimation = Boolean.FALSE;
        }
    }

    @Nullable
    public final ArrayList<? super ReusableViewInfo> getChildren() {
        return this.children;
    }

    public final void setChildren(@Nullable ArrayList<? super ReusableViewInfo> arrayList) {
        this.children = arrayList;
    }

    public final int getColCount() {
        return this.colCount;
    }

    public final void setColCount(int i) {
        this.colCount = i;
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
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    @Nullable
    public final Boolean getAutoMargin() {
        return this.autoMargin;
    }

    public final void setAutoMargin(@Nullable Boolean bool) {
        this.autoMargin = bool;
    }

    @Nullable
    public final MarginInfo getMarginInfo() {
        return this.marginInfo;
    }

    public final void setMarginInfo(@Nullable MarginInfo marginInfo) {
        this.marginInfo = marginInfo;
    }

    @Nullable
    public final Integer getSelectionStyle() {
        return this.selectionStyle;
    }

    public final void setSelectionStyle(@Nullable Integer num) {
        this.selectionStyle = num;
    }

    @Nullable
    public final Boolean getEnableLayoutAnimation() {
        return this.enableLayoutAnimation;
    }

    public final void setEnableLayoutAnimation(@Nullable Boolean bool) {
        this.enableLayoutAnimation = bool;
    }

    @Nullable
    public final AnimationType getInsertAnimationType() {
        return this.insertAnimationType;
    }

    public final void setInsertAnimationType(@Nullable AnimationType animationType) {
        this.insertAnimationType = animationType;
    }

    @Nullable
    public final AnimationType getDeleteAnimationType() {
        return this.deleteAnimationType;
    }

    public final void setDeleteAnimationType(@Nullable AnimationType animationType) {
        this.deleteAnimationType = animationType;
    }
}
