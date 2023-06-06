package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StatusBarTranslucent implements d {
    public static final int INDEX_ID = 141;
    public static final String LOWER_CASE_NAME = "statusBarTranslucent";
    public static final String NAME = "status-bar-translucent";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b8d44b11bed221e46d9e57977fd91e9", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b8d44b11bed221e46d9e57977fd91e9") : new StatusBarTranslucent();
    }

    @Override // com.meituan.android.recce.props.d
    public <T> T accept(BinReader binReader, PropVisitor<T> propVisitor) {
        Object[] objArr = {binReader, propVisitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b54875db1a25edb2e0a44532e2ac3761", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b54875db1a25edb2e0a44532e2ac3761") : propVisitor.visitStatusBarTranslucent(binReader.getBool());
    }
}
