package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ZIndex implements d {
    public static final int INDEX_ID = 50;
    public static final String LOWER_CASE_NAME = "zIndex";
    public static final String NAME = "z-index";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53c52f9ad1b0a95de5bb4b7a432690a2", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53c52f9ad1b0a95de5bb4b7a432690a2") : new ZIndex();
    }

    @Override // com.meituan.android.recce.props.d
    public <T> T accept(BinReader binReader, PropVisitor<T> propVisitor) {
        Object[] objArr = {binReader, propVisitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "776b1240bef5d4c66ba11e9d39e8d860", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "776b1240bef5d4c66ba11e9d39e8d860") : propVisitor.visitZIndex(binReader.getFloat());
    }
}
