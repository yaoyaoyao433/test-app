package com.meituan.android.recce.props.gens;

import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FontWeight implements d {
    public static final int Bold = 1;
    public static final String[] CaseNames = {"normal", DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD, "100", BasicPushStatus.SUCCESS_CODE, "300", "400", "500", "600", "700", "800", "900"};
    public static final int INDEX_ID = 57;
    public static final String LOWER_CASE_NAME = "fontWeight";
    public static final int N100 = 2;
    public static final int N200 = 3;
    public static final int N300 = 4;
    public static final int N400 = 5;
    public static final int N500 = 6;
    public static final int N600 = 7;
    public static final int N700 = 8;
    public static final int N800 = 9;
    public static final int N900 = 10;
    public static final String NAME = "font-weight";
    public static final int Normal = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f8cc1ec6ed6e604e227c3ad9d8ed231", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f8cc1ec6ed6e604e227c3ad9d8ed231") : new FontWeight();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b95238af64980692295bc88f1337142", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b95238af64980692295bc88f1337142") : propVisitor.visitFontWeight(binReader.getIntSignedLeb128());
    }
}
