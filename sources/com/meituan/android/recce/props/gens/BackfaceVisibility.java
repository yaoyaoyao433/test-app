package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BackfaceVisibility implements d {
    public static final String[] CaseNames = {"visible", "hidden"};
    public static final int Hidden = 1;
    public static final int INDEX_ID = 64;
    public static final String LOWER_CASE_NAME = "backfaceVisibility";
    public static final String NAME = "backface-visibility";
    public static final int Visible = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0538c4bbe1a7cfeaa00d33a9f2df2379", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0538c4bbe1a7cfeaa00d33a9f2df2379") : new BackfaceVisibility();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d1f615fc54c5c39bfd80093ec61afbc", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d1f615fc54c5c39bfd80093ec61afbc") : propVisitor.visitBackfaceVisibility(binReader.getIntSignedLeb128());
    }
}
