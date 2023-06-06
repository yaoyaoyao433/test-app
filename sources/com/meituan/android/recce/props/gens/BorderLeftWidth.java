package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BorderLeftWidth implements d {
    public static final int INDEX_ID = 75;
    public static final String LOWER_CASE_NAME = "borderLeftWidth";
    public static final String NAME = "border-left-width";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "300ab5fd912add164fee1d58ef57c3a7", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "300ab5fd912add164fee1d58ef57c3a7") : new BorderLeftWidth();
    }

    @Override // com.meituan.android.recce.props.d
    public <T> T accept(BinReader binReader, PropVisitor<T> propVisitor) {
        Object[] objArr = {binReader, propVisitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "934c21efd4d7f1ac4593d80bd3f63bd3", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "934c21efd4d7f1ac4593d80bd3f63bd3") : propVisitor.visitBorderLeftWidth(binReader.getFloat());
    }
}
