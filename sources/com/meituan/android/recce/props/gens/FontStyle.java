package com.meituan.android.recce.props.gens;

import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FontStyle implements d {
    public static final int Bold = 1;
    public static final String[] CaseNames = {"normal", DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD, DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC};
    public static final int INDEX_ID = 56;
    public static final int Italic = 2;
    public static final String LOWER_CASE_NAME = "fontStyle";
    public static final String NAME = "font-style";
    public static final int Normal = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a42ef57536ef83ecf93323567c18552", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a42ef57536ef83ecf93323567c18552") : new FontStyle();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93c465a9645a9a421df14a16e4a6f978", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93c465a9645a9a421df14a16e4a6f978") : propVisitor.visitFontStyle(binReader.getIntSignedLeb128());
    }
}
