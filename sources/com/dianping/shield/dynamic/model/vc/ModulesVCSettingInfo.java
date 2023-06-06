package com.dianping.shield.dynamic.model.vc;

import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001c\u00104\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001e\u00107\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\b¨\u0006:"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;", "", "()V", DMKeys.KEY_AUTO_EXPOSE_VIEW_TYPE, "", "getAutoExposeViewType", "()Ljava/lang/Integer;", "setAutoExposeViewType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "autoTopHoverOffset", "getAutoTopHoverOffset", "setAutoTopHoverOffset", "extraInfo", "Ljava/util/HashMap;", "", "Ljava/io/Serializable;", "getExtraInfo", "()Ljava/util/HashMap;", "setExtraInfo", "(Ljava/util/HashMap;)V", "heightForExtraFirstSectionHeader", "getHeightForExtraFirstSectionHeader", "setHeightForExtraFirstSectionHeader", "heightForExtraLastSectionFooter", "getHeightForExtraLastSectionFooter", "setHeightForExtraLastSectionFooter", "leftMargin", "getLeftMargin", "setLeftMargin", "linkType", "getLinkType", "setLinkType", "reserveUnUsedModule", "", "getReserveUnUsedModule", "()Ljava/lang/Boolean;", "setReserveUnUsedModule", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "rightMargin", "getRightMargin", "setRightMargin", DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR, "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "getSectionFooterBackgroundColor", "()Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "setSectionFooterBackgroundColor", "(Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;)V", "sectionFooterHeight", "getSectionFooterHeight", "setSectionFooterHeight", DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, "getSectionHeaderBackgroundColor", "setSectionHeaderBackgroundColor", "sectionHeaderHeight", "getSectionHeaderHeight", "setSectionHeaderHeight", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ModulesVCSettingInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Integer autoExposeViewType;
    @Nullable
    private Integer autoTopHoverOffset;
    @Nullable
    private HashMap<String, Serializable> extraInfo;
    @Nullable
    private Integer heightForExtraFirstSectionHeader;
    @Nullable
    private Integer heightForExtraLastSectionFooter;
    @Nullable
    private Integer leftMargin;
    @Nullable
    private Integer linkType;
    @Nullable
    private Boolean reserveUnUsedModule;
    @Nullable
    private Integer rightMargin;
    @Nullable
    private ColorUnionType sectionFooterBackgroundColor;
    @Nullable
    private Integer sectionFooterHeight;
    @Nullable
    private ColorUnionType sectionHeaderBackgroundColor;
    @Nullable
    private Integer sectionHeaderHeight;

    @Nullable
    public final Integer getLeftMargin() {
        return this.leftMargin;
    }

    public final void setLeftMargin(@Nullable Integer num) {
        this.leftMargin = num;
    }

    @Nullable
    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    public final void setRightMargin(@Nullable Integer num) {
        this.rightMargin = num;
    }

    @Nullable
    public final Integer getSectionHeaderHeight() {
        return this.sectionHeaderHeight;
    }

    public final void setSectionHeaderHeight(@Nullable Integer num) {
        this.sectionHeaderHeight = num;
    }

    @Nullable
    public final Integer getSectionFooterHeight() {
        return this.sectionFooterHeight;
    }

    public final void setSectionFooterHeight(@Nullable Integer num) {
        this.sectionFooterHeight = num;
    }

    @Nullable
    public final Integer getHeightForExtraFirstSectionHeader() {
        return this.heightForExtraFirstSectionHeader;
    }

    public final void setHeightForExtraFirstSectionHeader(@Nullable Integer num) {
        this.heightForExtraFirstSectionHeader = num;
    }

    @Nullable
    public final Integer getHeightForExtraLastSectionFooter() {
        return this.heightForExtraLastSectionFooter;
    }

    public final void setHeightForExtraLastSectionFooter(@Nullable Integer num) {
        this.heightForExtraLastSectionFooter = num;
    }

    @Nullable
    public final ColorUnionType getSectionHeaderBackgroundColor() {
        return this.sectionHeaderBackgroundColor;
    }

    public final void setSectionHeaderBackgroundColor(@Nullable ColorUnionType colorUnionType) {
        this.sectionHeaderBackgroundColor = colorUnionType;
    }

    @Nullable
    public final ColorUnionType getSectionFooterBackgroundColor() {
        return this.sectionFooterBackgroundColor;
    }

    public final void setSectionFooterBackgroundColor(@Nullable ColorUnionType colorUnionType) {
        this.sectionFooterBackgroundColor = colorUnionType;
    }

    @Nullable
    public final Integer getLinkType() {
        return this.linkType;
    }

    public final void setLinkType(@Nullable Integer num) {
        this.linkType = num;
    }

    @Nullable
    public final Integer getAutoTopHoverOffset() {
        return this.autoTopHoverOffset;
    }

    public final void setAutoTopHoverOffset(@Nullable Integer num) {
        this.autoTopHoverOffset = num;
    }

    @Nullable
    public final Integer getAutoExposeViewType() {
        return this.autoExposeViewType;
    }

    public final void setAutoExposeViewType(@Nullable Integer num) {
        this.autoExposeViewType = num;
    }

    @Nullable
    public final Boolean getReserveUnUsedModule() {
        return this.reserveUnUsedModule;
    }

    public final void setReserveUnUsedModule(@Nullable Boolean bool) {
        this.reserveUnUsedModule = bool;
    }

    @Nullable
    public final HashMap<String, Serializable> getExtraInfo() {
        return this.extraInfo;
    }

    public final void setExtraInfo(@Nullable HashMap<String, Serializable> hashMap) {
        this.extraInfo = hashMap;
    }
}
