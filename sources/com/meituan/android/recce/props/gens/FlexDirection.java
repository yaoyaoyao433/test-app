package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FlexDirection implements d {
    public static final String[] CaseNames = {"column", "column-reverse", "row", "row-reverse"};
    public static final int Column = 0;
    public static final int ColumnReverse = 1;
    public static final int INDEX_ID = 16;
    public static final String LOWER_CASE_NAME = "flexDirection";
    public static final String NAME = "flex-direction";
    public static final int Row = 2;
    public static final int RowReverse = 3;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af84826885cf343c789ffec58c75d1e1", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af84826885cf343c789ffec58c75d1e1") : new FlexDirection();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "528505e0e7ea40108f086242014d5d15", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "528505e0e7ea40108f086242014d5d15") : propVisitor.visitFlexDirection(binReader.getIntSignedLeb128());
    }
}
