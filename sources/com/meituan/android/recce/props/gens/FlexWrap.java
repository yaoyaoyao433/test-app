package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FlexWrap implements d {
    public static final String[] CaseNames = {"wrap", "nowrap", "wrap-reverse"};
    public static final int INDEX_ID = 19;
    public static final String LOWER_CASE_NAME = "flexWrap";
    public static final String NAME = "flex-wrap";
    public static final int Nowrap = 1;
    public static final int Wrap = 0;
    public static final int WrapReverse = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e88e866698483f3705b737d825fe434f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e88e866698483f3705b737d825fe434f") : new FlexWrap();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22408eba35e4ca3d2e3f73f5e2b7c76b", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22408eba35e4ca3d2e3f73f5e2b7c76b") : propVisitor.visitFlexWrap(binReader.getIntSignedLeb128());
    }
}
