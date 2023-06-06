package com.meituan.android.recce.props.gens;

import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AlignContent implements d {
    public static final String[] CaseNames = {"flex-start", "flex-end", "center", DynamicTitleParser.PARSER_KEY_STRETCH, "space-between", "space-around"};
    public static final int Center = 2;
    public static final int FlexEnd = 1;
    public static final int FlexStart = 0;
    public static final int INDEX_ID = 4;
    public static final String LOWER_CASE_NAME = "alignContent";
    public static final String NAME = "align-content";
    public static final int SpaceAround = 5;
    public static final int SpaceBetween = 4;
    public static final int Stretch = 3;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "32fdad900cbc16b8f49ac2ee7e1c031e", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "32fdad900cbc16b8f49ac2ee7e1c031e") : new AlignContent();
    }

    public static String caseName(int i) {
        if (i < CaseNames.length) {
            return CaseNames[i];
        }
        return null;
    }

    @Override // com.meituan.android.recce.props.d
    public <T> T accept(BinReader binReader, PropVisitor<T> propVisitor) {
        Object[] objArr = {binReader, propVisitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa28fe79233b65484afb9f0ad700313a", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa28fe79233b65484afb9f0ad700313a") : propVisitor.visitAlignContent(binReader.getIntSignedLeb128());
    }
}
