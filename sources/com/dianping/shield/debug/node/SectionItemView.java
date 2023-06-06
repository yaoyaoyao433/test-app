package com.dianping.shield.debug.node;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.node.cellnode.DividerConfigInfo;
import com.dianping.shield.node.cellnode.InnerBottomInfo;
import com.dianping.shield.node.cellnode.InnerTopInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.TopInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SectionItemView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LinearLayout.LayoutParams displayNodeLp;
    private LinearLayout.LayoutParams rowTextLp;
    private ShieldSection section;
    private int sectionIndex;
    private LinearLayout.LayoutParams sectionLp;

    public SectionItemView(Context context, ShieldSection shieldSection, int i) {
        super(context);
        Object[] objArr = {context, shieldSection, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32ea8f2b7826f66f15bbf027251ce314", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32ea8f2b7826f66f15bbf027251ce314");
            return;
        }
        this.section = shieldSection;
        this.sectionIndex = i;
        createLayoutParams();
        initViews();
    }

    private void createLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7af309d4d5089b43f14e6eb7061f771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7af309d4d5089b43f14e6eb7061f771");
            return;
        }
        this.sectionLp = new LinearLayout.LayoutParams(-1, -2);
        this.sectionLp.gravity = 16;
        this.sectionLp.leftMargin = 0;
        this.rowTextLp = new LinearLayout.LayoutParams(-1, -2);
        this.rowTextLp.gravity = 16;
        this.rowTextLp.leftMargin = 20;
        this.displayNodeLp = new LinearLayout.LayoutParams(-1, -2);
        this.displayNodeLp.gravity = 16;
        this.displayNodeLp.leftMargin = 40;
    }

    private void initViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9215e0a9a71d59fdab3537fd219fe05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9215e0a9a71d59fdab3537fd219fe05");
        } else if (this.section == null) {
        } else {
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            setOrientation(1);
            TextView textView = new TextView(getContext());
            textView.setText(organizSectionInfo(this.section));
            textView.setBackgroundColor(Color.parseColor("#B0E2FF"));
            textView.setTextSize(2, 12.0f);
            addView(textView, this.sectionLp);
            if (this.section.shieldRows == null || this.section.shieldRows.size() <= 0) {
                return;
            }
            Iterator<ShieldRow> it = this.section.shieldRows.iterator();
            int i = 1;
            while (it.hasNext()) {
                ShieldRow next = it.next();
                if (next != null) {
                    TextView textView2 = new TextView(getContext());
                    textView2.setText(organizRowInfo(next, i));
                    textView2.setBackgroundColor(Color.parseColor("#B4EEB4"));
                    textView2.setTextSize(2, 12.0f);
                    addView(textView2, this.rowTextLp);
                    if (next.shieldDisplayNodes != null && next.shieldDisplayNodes.size() > 0) {
                        Iterator<ShieldDisplayNode> it2 = next.shieldDisplayNodes.iterator();
                        int i2 = 1;
                        while (it2.hasNext()) {
                            TextView textView3 = new TextView(getContext());
                            textView3.setText(organizNodeInfo(it2.next(), i2));
                            textView3.setBackgroundColor(Color.parseColor("#BCD2EE"));
                            textView3.setTextSize(2, 12.0f);
                            addView(textView3, this.displayNodeLp);
                            i2++;
                        }
                    }
                    i++;
                }
            }
        }
    }

    private String organizNodeInfo(ShieldDisplayNode shieldDisplayNode, int i) {
        Object[] objArr = {shieldDisplayNode, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebcb87aff8849b84169eef889c0b39ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebcb87aff8849b84169eef889c0b39ae");
        }
        StringBuilder sb = new StringBuilder();
        if (shieldDisplayNode != null) {
            sb.append("ShieldDisplayNode: " + i + "\n");
            sb.append("viewType:");
            sb.append(shieldDisplayNode.viewType + "\n");
            if (shieldDisplayNode.stableid != null && shieldDisplayNode.stableid.length() != 0) {
                sb.append("stableid:");
                sb.append(shieldDisplayNode.stableid + "\n");
            }
            if (shieldDisplayNode.dividerInfo != null) {
                sb.append("dividerInfo:");
                sb.append(organizDivider(shieldDisplayNode.dividerInfo) + "\n");
            }
            if (shieldDisplayNode.innerTopInfo != null) {
                sb.append("innerTopInfo:");
                sb.append(organizTopInfo(shieldDisplayNode.innerTopInfo) + "\n");
            }
            if (shieldDisplayNode.innerBottomInfo != null) {
                sb.append("innerBottomInfo:");
                sb.append(organizBottomInfo(shieldDisplayNode.innerBottomInfo) + "\n");
            }
            if (shieldDisplayNode.staggeredGridXGap != null) {
                sb.append("staggeredGridXGap:");
                sb.append(shieldDisplayNode.staggeredGridXGap + "\n");
            }
            if (shieldDisplayNode.staggeredGridYGap != null) {
                sb.append("staggeredGridYGap:");
                sb.append(shieldDisplayNode.staggeredGridYGap + "\n");
            }
            if (shieldDisplayNode.staggeredGridLeftMargin != null) {
                sb.append("staggeredGridLeftMargin:");
                sb.append(shieldDisplayNode.staggeredGridLeftMargin + "\n");
            }
            if (shieldDisplayNode.staggeredGridRightMargin != null) {
                sb.append("staggeredGridRightMargin:");
                sb.append(shieldDisplayNode.staggeredGridRightMargin);
            }
        }
        return sb.toString();
    }

    private String organizBottomInfo(InnerBottomInfo innerBottomInfo) {
        Object[] objArr = {innerBottomInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e030b02b31ee3ecb83629969c10a43a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e030b02b31ee3ecb83629969c10a43a4");
        }
        if (innerBottomInfo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Mode:");
            sb.append(innerBottomInfo.mode + StringUtil.SPACE);
            if (innerBottomInfo.bottomInfo != null) {
                sb.append("bottomInfo:" + getBottomInfo(innerBottomInfo.bottomInfo) + StringUtil.SPACE);
            }
            sb.append("type:");
            sb.append(innerBottomInfo.type + StringUtil.SPACE);
            sb.append("startPos:");
            sb.append(innerBottomInfo.startPos + StringUtil.SPACE);
            sb.append("endPos:");
            sb.append(innerBottomInfo.endPos + StringUtil.SPACE);
            sb.append("needAutoOffset:");
            sb.append(innerBottomInfo.needAutoOffset + StringUtil.SPACE);
            sb.append("offset:");
            sb.append(innerBottomInfo.offset + StringUtil.SPACE);
            sb.append("zPosition:");
            sb.append(innerBottomInfo.zPosition + StringUtil.SPACE);
            return sb.toString();
        }
        return "";
    }

    private String organizTopInfo(InnerTopInfo innerTopInfo) {
        Object[] objArr = {innerTopInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82bde2fdab1f8f0c119e5c02c9e72c3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82bde2fdab1f8f0c119e5c02c9e72c3c");
        }
        StringBuilder sb = new StringBuilder();
        if (innerTopInfo != null) {
            if (innerTopInfo.topInfo != null) {
                sb.append(getTopInfoStr(innerTopInfo.topInfo) + StringUtil.SPACE);
            }
            sb.append("type:");
            sb.append(innerTopInfo.type + StringUtil.SPACE);
            sb.append("startPos:");
            sb.append(innerTopInfo.startPos + StringUtil.SPACE);
            sb.append("endPos:");
            sb.append(innerTopInfo.endPos + StringUtil.SPACE);
            sb.append("needAutoOffset:");
            sb.append(innerTopInfo.needAutoOffset + StringUtil.SPACE);
            sb.append("offset:");
            sb.append(innerTopInfo.offset + StringUtil.SPACE);
            sb.append("zPosition:");
            sb.append(innerTopInfo.zPosition + StringUtil.SPACE);
        }
        return sb.toString();
    }

    private String organizDivider(DividerConfigInfo dividerConfigInfo) {
        Object[] objArr = {dividerConfigInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcf6c725f87d47894129cbee0b56ebfd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcf6c725f87d47894129cbee0b56ebfd");
        }
        if (dividerConfigInfo != null) {
            return (("headerGapHeight:" + dividerConfigInfo.headerGapHeight) + " footerGapHeight:" + dividerConfigInfo.footerGapHeight) + " cellTopLineOffset:" + dividerConfigInfo.cellTopLineOffset;
        }
        return "";
    }

    private String getTopInfoStr(TopInfo topInfo) {
        Object[] objArr = {topInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bf7807b22d120d63826960e3114f962", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bf7807b22d120d63826960e3114f962");
        }
        StringBuilder sb = new StringBuilder();
        if (topInfo != null) {
            sb.append("startType:");
            sb.append(topInfo.startType + StringUtil.SPACE);
            sb.append("endType:");
            sb.append(topInfo.endType + StringUtil.SPACE);
            sb.append("needAutoOffset:");
            sb.append(topInfo.needAutoOffset + StringUtil.SPACE);
            sb.append("offset:");
            sb.append(topInfo.offset + StringUtil.SPACE);
            sb.append("zPosition:");
            sb.append(topInfo.zPosition + StringUtil.SPACE);
        }
        return sb.toString();
    }

    private String getBottomInfo(BottomInfo bottomInfo) {
        Object[] objArr = {bottomInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeeb00923fde784cc692c293ece565e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeeb00923fde784cc692c293ece565e1");
        }
        StringBuilder sb = new StringBuilder();
        if (bottomInfo != null) {
            sb.append("startType:");
            sb.append(bottomInfo.startType + StringUtil.SPACE);
            sb.append("endType:");
            sb.append(bottomInfo.endType + StringUtil.SPACE);
            sb.append("needAutoOffset:");
            sb.append(bottomInfo.needAutoOffset + StringUtil.SPACE);
            sb.append("offset:");
            sb.append(bottomInfo.offset + StringUtil.SPACE);
            sb.append("zPosition:");
            sb.append(bottomInfo.zPosition + StringUtil.SPACE);
        }
        return sb.toString();
    }

    private String organizRowInfo(ShieldRow shieldRow, int i) {
        Object[] objArr = {shieldRow, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a076ef73fcf713d345f3e27cf55a735", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a076ef73fcf713d345f3e27cf55a735");
        }
        StringBuilder sb = new StringBuilder();
        if (shieldRow != null) {
            sb.append("ShieldRow: " + i + "\n");
            sb.append("showCellTopLineDivider:");
            sb.append(shieldRow.showCellTopLineDivider + "\n");
            sb.append("showCellBottomLineDivider:");
            sb.append(shieldRow.showCellBottomLineDivider + "\n");
            if (shieldRow.dividerStyle != null) {
                sb.append("dividerStyle:");
                sb.append(getDividerStr(shieldRow.dividerStyle) + "\n");
            }
            if (shieldRow.getTopInfo() != null) {
                sb.append("topInfo:");
                sb.append(getTopInfoStr(shieldRow.getTopInfo()) + "\n");
            }
            if (shieldRow.getBottomInfo() != null) {
                sb.append("bottomInfo:");
                sb.append(getBottomInfo(shieldRow.getBottomInfo()) + "\n");
            }
            sb.append("cellType:");
            sb.append(shieldRow.cellType + "\n");
            sb.append("typePrefix:");
            sb.append(shieldRow.typePrefix);
        }
        return sb.toString();
    }

    private String organizSectionInfo(ShieldSection shieldSection) {
        Object[] objArr = {shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "004afbc95cd60601c3876ef62aa5c2dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "004afbc95cd60601c3876ef62aa5c2dd");
        }
        if (shieldSection == null) {
            return "无Section信息";
        }
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("ShieldSection: " + this.sectionIndex + "\n");
            sb.append("hasHeaderCell:");
            sb.append(shieldSection.hasHeaderCell + "\n");
            sb.append("hasFooterCell:");
            sb.append(shieldSection.hasFooterCell + "\n");
            if (shieldSection.sectionTitle != null && shieldSection.sectionTitle.length() > 0) {
                sb.append("sectionTitle:");
                sb.append(shieldSection.sectionTitle + "\n");
            }
            sb.append("previousLinkType:");
            sb.append(shieldSection.previousLinkType + "\n");
            sb.append("nextLinkType:");
            sb.append(shieldSection.nextLinkType + "\n");
            sb.append("adjustedPreviousType:");
            sb.append(shieldSection.adjustedPreviousType + "\n");
            sb.append("adjustedNextType:");
            sb.append(shieldSection.adjustedNextType + "\n");
            sb.append("sectionHeaderHeight:");
            sb.append(shieldSection.sectionHeaderHeight + "\n");
            sb.append("sectionFooterHeight:");
            sb.append(shieldSection.sectionFooterHeight + "\n");
            sb.append("sectionDividerShowType:");
            sb.append(shieldSection.sectionDividerShowType + "\n");
            sb.append("alineTopOffset:");
            sb.append(shieldSection.alineTopOffset + "\n");
            if (shieldSection.dividerStyle != null) {
                sb.append("dividerStyle:");
                sb.append(getDividerStr(shieldSection.dividerStyle) + "\n");
            }
            if (shieldSection.backgroundViewInfo != null) {
                sb.append("backgroundViewInfo:");
                sb.append(shieldSection.backgroundViewInfo.c + "\n");
            }
            sb.append("shieldRows:");
            sb.append(shieldSection.getEntryCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private String getDividerStr(DividerStyle dividerStyle) {
        Object[] objArr = {dividerStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d2d23a729a06ebd3478f23b8a2094cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d2d23a729a06ebd3478f23b8a2094cd");
        }
        StringBuilder sb = new StringBuilder();
        if (dividerStyle.cellTopLineOffset != null) {
            sb.append("cellTopLineOffset:");
            sb.append(dividerStyle.cellTopLineOffset.toString() + StringUtil.SPACE);
        }
        sb.append("cellTopLineColor:");
        sb.append(converArgbToRgb(dividerStyle.cellTopLineColor) + StringUtil.SPACE);
        if (dividerStyle.cellBottomLineOffset != null) {
            sb.append("cellBottomLineOffset:");
            sb.append(dividerStyle.cellBottomLineOffset.toString() + StringUtil.SPACE);
        }
        sb.append("cellBottomLineColor:");
        sb.append(converArgbToRgb(dividerStyle.cellBottomLineColor) + StringUtil.SPACE);
        sb.append("styleType:");
        sb.append(dividerStyle.styleType + StringUtil.SPACE);
        if (dividerStyle.topStyleLineOffset != null) {
            sb.append("topStyleLineOffset:");
            sb.append(dividerStyle.topStyleLineOffset.toString() + StringUtil.SPACE);
        }
        sb.append("topStyleLineColor:");
        sb.append(converArgbToRgb(dividerStyle.topStyleLineColor) + StringUtil.SPACE);
        sb.append("middleStyleLineColor:");
        sb.append(converArgbToRgb(dividerStyle.middleStyleLineColor) + StringUtil.SPACE);
        sb.append("bottomStyleLineColor:");
        sb.append(converArgbToRgb(dividerStyle.bottomStyleLineColor) + StringUtil.SPACE);
        return sb.toString();
    }

    private String converArgbToRgb(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89c5f3a0f35a680f18c1fd7dcc63a36f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89c5f3a0f35a680f18c1fd7dcc63a36f");
        }
        if (num != null) {
            Integer[] numArr = {Integer.valueOf((num.intValue() & 16711680) >> 16), Integer.valueOf((num.intValue() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8), Integer.valueOf(num.intValue() & 255)};
            return "#" + numArr[0] + CommonConstant.Symbol.COMMA + numArr[1] + CommonConstant.Symbol.COMMA + numArr[2];
        }
        return "";
    }
}
