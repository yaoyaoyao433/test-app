package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SelfPreset implements d {
    public static final int INDEX_ID = 122;
    public static final String LOWER_CASE_NAME = "selfPreset";
    public static final String NAME = "self-preset";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7192d682f2eb0b85542f66b76e973180", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7192d682f2eb0b85542f66b76e973180") : new SelfPreset();
    }

    @Override // com.meituan.android.recce.props.d
    public <T> T accept(BinReader binReader, PropVisitor<T> propVisitor) {
        Object[] objArr = {binReader, propVisitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f444dbf1563829a762aeb4941feae07", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f444dbf1563829a762aeb4941feae07") : propVisitor.visitSelfPreset(binReader.getString());
    }
}
