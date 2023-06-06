package com.dianping.shield.dynamic.model.cell;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.model.vc.CardStyle;
import com.dianping.shield.dynamic.model.vc.SeparatorLineInfo;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/dynamic/model/cell/CellInfo;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "()V", "BaseCellInfo", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class CellInfo implements DiffableInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010L\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bM\u0010B\"\u0004\bN\u0010DR\u001c\u0010O\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001f\"\u0004\bQ\u0010!¨\u0006R"}, d2 = {"Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo;", "()V", DMKeys.KEY_AUTO_MARGIN, "", "getAutoMargin", "()Ljava/lang/Boolean;", "setAutoMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "cardStyle", "Lcom/dianping/shield/dynamic/model/vc/CardStyle;", "getCardStyle", "()Lcom/dianping/shield/dynamic/model/vc/CardStyle;", "setCardStyle", "(Lcom/dianping/shield/dynamic/model/vc/CardStyle;)V", "cardType", "", "getCardType", "()I", "setCardType", "(I)V", DMKeys.KEY_CLICK_MGE_INFO, "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "getClickMgeInfo", "()Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "setClickMgeInfo", "(Lcom/dianping/shield/dynamic/model/extra/MGEInfo;)V", "frozenExclude", "getFrozenExclude", "setFrozenExclude", DMKeys.KEY_GRADIENT_BACKGROUND_COLOR, "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "getGradientBackgroundColor", "()Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;", "setGradientBackgroundColor", "(Lcom/dianping/shield/dynamic/model/extra/ColorUnionType$GradientColorInfo;)V", "hoverView", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "getHoverView", "()Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "setHoverView", "(Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;)V", "identifier", "getIdentifier", "setIdentifier", DMKeys.KEY_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", DMKeys.KEY_MIDAS_INFO, "Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "getMidasInfo", "()Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "setMidasInfo", "(Lcom/dianping/shield/dynamic/model/extra/MidasInfo;)V", DMKeys.KEY_SELECTION_STYLE, "getSelectionStyle", "()Ljava/lang/Integer;", "setSelectionStyle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "separatorLineInfo", "Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "getSeparatorLineInfo", "()Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "setSeparatorLineInfo", "(Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;)V", DMKeys.KEY_SEPARATOR_LINE_STYLE, "getSeparatorLineStyle", "setSeparatorLineStyle", DMKeys.KEY_VIEW_MGE_INFO, "getViewMgeInfo", "setViewMgeInfo", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static abstract class BaseCellInfo extends CellInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private Boolean autoMargin;
        @Nullable
        private String backgroundColor;
        @Nullable
        private CardStyle cardStyle;
        private int cardType;
        @Nullable
        private MGEInfo clickMgeInfo;
        @Nullable
        private Boolean frozenExclude;
        @Nullable
        private ColorUnionType.GradientColorInfo gradientBackgroundColor;
        @Nullable
        private HoverViewInfo hoverView;
        @Nullable
        private String identifier;
        @Nullable
        private MarginInfo marginInfo;
        @Nullable
        private MidasInfo midasInfo;
        @Nullable
        private Integer selectionStyle;
        @Nullable
        private SeparatorLineInfo separatorLineInfo;
        @Nullable
        private Integer separatorLineStyle;
        @Nullable
        private MGEInfo viewMgeInfo;

        public BaseCellInfo() {
            super(null);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "680415fb19e3740e4c46c5047e1de404", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "680415fb19e3740e4c46c5047e1de404");
            }
        }

        @Nullable
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final void setBackgroundColor(@Nullable String str) {
            this.backgroundColor = str;
        }

        @Nullable
        public final ColorUnionType.GradientColorInfo getGradientBackgroundColor() {
            return this.gradientBackgroundColor;
        }

        public final void setGradientBackgroundColor(@Nullable ColorUnionType.GradientColorInfo gradientColorInfo) {
            this.gradientBackgroundColor = gradientColorInfo;
        }

        @Nullable
        public final Integer getSelectionStyle() {
            return this.selectionStyle;
        }

        public final void setSelectionStyle(@Nullable Integer num) {
            this.selectionStyle = num;
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
        public final Integer getSeparatorLineStyle() {
            return this.separatorLineStyle;
        }

        public final void setSeparatorLineStyle(@Nullable Integer num) {
            this.separatorLineStyle = num;
        }

        @Nullable
        public final SeparatorLineInfo getSeparatorLineInfo() {
            return this.separatorLineInfo;
        }

        public final void setSeparatorLineInfo(@Nullable SeparatorLineInfo separatorLineInfo) {
            this.separatorLineInfo = separatorLineInfo;
        }

        @Nullable
        public final MGEInfo getClickMgeInfo() {
            return this.clickMgeInfo;
        }

        public final void setClickMgeInfo(@Nullable MGEInfo mGEInfo) {
            this.clickMgeInfo = mGEInfo;
        }

        @Nullable
        public final MGEInfo getViewMgeInfo() {
            return this.viewMgeInfo;
        }

        public final void setViewMgeInfo(@Nullable MGEInfo mGEInfo) {
            this.viewMgeInfo = mGEInfo;
        }

        @Nullable
        public final MidasInfo getMidasInfo() {
            return this.midasInfo;
        }

        public final void setMidasInfo(@Nullable MidasInfo midasInfo) {
            this.midasInfo = midasInfo;
        }

        @Override // com.dianping.shield.dynamic.model.DiffableInfo
        @Nullable
        public String getIdentifier() {
            return this.identifier;
        }

        @Override // com.dianping.shield.dynamic.model.DiffableInfo
        public void setIdentifier(@Nullable String str) {
            this.identifier = str;
        }

        @Nullable
        public final HoverViewInfo getHoverView() {
            return this.hoverView;
        }

        public final void setHoverView(@Nullable HoverViewInfo hoverViewInfo) {
            this.hoverView = hoverViewInfo;
        }

        @Nullable
        public final CardStyle getCardStyle() {
            return this.cardStyle;
        }

        public final void setCardStyle(@Nullable CardStyle cardStyle) {
            this.cardStyle = cardStyle;
        }

        public final int getCardType() {
            return this.cardType;
        }

        public final void setCardType(int i) {
            this.cardType = i;
        }

        @Nullable
        public final Boolean getFrozenExclude() {
            return this.frozenExclude;
        }

        public final void setFrozenExclude(@Nullable Boolean bool) {
            this.frozenExclude = bool;
        }
    }

    public CellInfo() {
    }

    public /* synthetic */ CellInfo(f fVar) {
        this();
    }
}
