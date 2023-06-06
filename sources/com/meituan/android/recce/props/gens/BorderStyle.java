package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BorderStyle implements d {
    public static final String[] CaseNames = {"solid", "dotted", "dashed"};
    public static final int Dashed = 2;
    public static final int Dotted = 1;
    public static final int INDEX_ID = 80;
    public static final String LOWER_CASE_NAME = "borderStyle";
    public static final String NAME = "border-style";
    public static final int Solid = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7aaa4122ec01212b817ff9fdc1c13f9", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7aaa4122ec01212b817ff9fdc1c13f9") : new BorderStyle();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac308602c45a52734a7f1c5b7d54190d", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac308602c45a52734a7f1c5b7d54190d") : propVisitor.visitBorderStyle(binReader.getIntSignedLeb128());
    }
}
