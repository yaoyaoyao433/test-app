package com.dianping.shield.dynamic.model.section;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.vc.SeparatorLineInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.HeaderFooterViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/dynamic/model/section/SectionInfo;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "()V", "BaseSectionInfo", "Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class SectionInfo implements DiffableInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR:\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001e\u00109\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%R\u001c\u0010<\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u001c\u0010?\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "Lcom/dianping/shield/dynamic/model/section/SectionInfo;", "()V", DMKeys.KEY_BACKGROUND_VIEW_INFO, "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "getBackgroundViewInfo", "()Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "setBackgroundViewInfo", "(Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;)V", "data", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getData", "()Ljava/util/HashMap;", "setData", "(Ljava/util/HashMap;)V", "footerCell", "Lcom/dianping/shield/dynamic/model/cell/CellInfo;", "getFooterCell", "()Lcom/dianping/shield/dynamic/model/cell/CellInfo;", "setFooterCell", "(Lcom/dianping/shield/dynamic/model/cell/CellInfo;)V", "headerCell", "getHeaderCell", "setHeaderCell", "identifier", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", "linkType", "", "getLinkType", "()Ljava/lang/Integer;", "setLinkType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR, "Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "getSectionFooterBackgroundColor", "()Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;", "setSectionFooterBackgroundColor", "(Lcom/dianping/shield/dynamic/model/extra/ColorUnionType;)V", "sectionFooterHeight", "getSectionFooterHeight", "setSectionFooterHeight", "sectionFooterView", "Lcom/dianping/shield/dynamic/model/view/HeaderFooterViewInfo;", "getSectionFooterView", "()Lcom/dianping/shield/dynamic/model/view/HeaderFooterViewInfo;", "setSectionFooterView", "(Lcom/dianping/shield/dynamic/model/view/HeaderFooterViewInfo;)V", DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, "getSectionHeaderBackgroundColor", "setSectionHeaderBackgroundColor", "sectionHeaderHeight", "getSectionHeaderHeight", "setSectionHeaderHeight", "sectionHeaderView", "getSectionHeaderView", "setSectionHeaderView", DMKeys.KEY_SECTION_INDEX_TITLE, "getSectionIndexTitle", "setSectionIndexTitle", "separatorLineInfo", "Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "getSeparatorLineInfo", "()Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "setSeparatorLineInfo", "(Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static abstract class BaseSectionInfo extends SectionInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private ExtraViewInfo backgroundViewInfo;
        @Nullable
        private HashMap<String, Object> data;
        @Nullable
        private CellInfo footerCell;
        @Nullable
        private CellInfo headerCell;
        @Nullable
        private String identifier;
        @Nullable
        private Integer linkType;
        @Nullable
        private ColorUnionType sectionFooterBackgroundColor;
        @Nullable
        private Integer sectionFooterHeight;
        @Nullable
        private HeaderFooterViewInfo sectionFooterView;
        @Nullable
        private ColorUnionType sectionHeaderBackgroundColor;
        @Nullable
        private Integer sectionHeaderHeight;
        @Nullable
        private HeaderFooterViewInfo sectionHeaderView;
        @Nullable
        private String sectionIndexTitle;
        @Nullable
        private SeparatorLineInfo separatorLineInfo;

        public BaseSectionInfo() {
            super(null);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c6d3ca69196988023db6f2734d8c34d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c6d3ca69196988023db6f2734d8c34d");
            }
        }

        @Nullable
        public final CellInfo getHeaderCell() {
            return this.headerCell;
        }

        public final void setHeaderCell(@Nullable CellInfo cellInfo) {
            this.headerCell = cellInfo;
        }

        @Nullable
        public final CellInfo getFooterCell() {
            return this.footerCell;
        }

        public final void setFooterCell(@Nullable CellInfo cellInfo) {
            this.footerCell = cellInfo;
        }

        @Nullable
        public final HeaderFooterViewInfo getSectionHeaderView() {
            return this.sectionHeaderView;
        }

        public final void setSectionHeaderView(@Nullable HeaderFooterViewInfo headerFooterViewInfo) {
            this.sectionHeaderView = headerFooterViewInfo;
        }

        @Nullable
        public final HeaderFooterViewInfo getSectionFooterView() {
            return this.sectionFooterView;
        }

        public final void setSectionFooterView(@Nullable HeaderFooterViewInfo headerFooterViewInfo) {
            this.sectionFooterView = headerFooterViewInfo;
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
        public final Integer getLinkType() {
            return this.linkType;
        }

        public final void setLinkType(@Nullable Integer num) {
            this.linkType = num;
        }

        @Nullable
        public final SeparatorLineInfo getSeparatorLineInfo() {
            return this.separatorLineInfo;
        }

        public final void setSeparatorLineInfo(@Nullable SeparatorLineInfo separatorLineInfo) {
            this.separatorLineInfo = separatorLineInfo;
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
        public final String getSectionIndexTitle() {
            return this.sectionIndexTitle;
        }

        public final void setSectionIndexTitle(@Nullable String str) {
            this.sectionIndexTitle = str;
        }

        @Nullable
        public final ExtraViewInfo getBackgroundViewInfo() {
            return this.backgroundViewInfo;
        }

        public final void setBackgroundViewInfo(@Nullable ExtraViewInfo extraViewInfo) {
            this.backgroundViewInfo = extraViewInfo;
        }

        @Nullable
        public final HashMap<String, Object> getData() {
            return this.data;
        }

        public final void setData(@Nullable HashMap<String, Object> hashMap) {
            this.data = hashMap;
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
    }

    public SectionInfo() {
    }

    public /* synthetic */ SectionInfo(f fVar) {
        this();
    }
}
