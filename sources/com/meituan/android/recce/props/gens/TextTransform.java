package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TextTransform implements d {
    public static final int Capitalize = 3;
    public static final String[] CaseNames = {"none", "uppercase", "lowercase", "capitalize"};
    public static final int INDEX_ID = 63;
    public static final String LOWER_CASE_NAME = "textTransform";
    public static final int Lowercase = 2;
    public static final String NAME = "text-transform";
    public static final int None = 0;
    public static final int Uppercase = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7e22a8c82d77bdd3fd3114872dd4202", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7e22a8c82d77bdd3fd3114872dd4202") : new TextTransform();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7c7904d28747f626661534fedc34a6d", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7c7904d28747f626661534fedc34a6d") : propVisitor.visitTextTransform(binReader.getIntSignedLeb128());
    }
}
