package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Overflow implements d {
    public static final String[] CaseNames = {"visible", "hidden", Constants.FPS_TYPE_SCROLL};
    public static final int Hidden = 1;
    public static final int INDEX_ID = 36;
    public static final String LOWER_CASE_NAME = "overflow";
    public static final String NAME = "overflow";
    public static final int Scroll = 2;
    public static final int Visible = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c96ae5803c75b30dc68d845b37a19058", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c96ae5803c75b30dc68d845b37a19058") : new Overflow();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf6033fb9cfccf556b645fbd4c6b5908", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf6033fb9cfccf556b645fbd4c6b5908") : propVisitor.visitOverflow(binReader.getIntSignedLeb128());
    }
}
