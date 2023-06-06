package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BorderBottomEndRadius implements d {
    public static final int INDEX_ID = 67;
    public static final String LOWER_CASE_NAME = "borderBottomEndRadius";
    public static final String NAME = "border-bottom-end-radius";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ae8a5da5bccc25a2ab73b552d5cc0dc", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ae8a5da5bccc25a2ab73b552d5cc0dc") : new BorderBottomEndRadius();
    }

    @Override // com.meituan.android.recce.props.d
    public <T> T accept(BinReader binReader, PropVisitor<T> propVisitor) {
        Object[] objArr = {binReader, propVisitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12a00d2a78fcd153b201cb4bc12458fe", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12a00d2a78fcd153b201cb4bc12458fe") : propVisitor.visitBorderBottomEndRadius(binReader.getFloat());
    }
}
