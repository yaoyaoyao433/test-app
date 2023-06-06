package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TextContentType implements d {
    public static final String[] CaseNames = {"none", "URL", "username", "password"};
    public static final int INDEX_ID = 102;
    public static final String LOWER_CASE_NAME = "textContentType";
    public static final String NAME = "textContentType";
    public static final int None = 0;
    public static final int Password = 3;
    public static final int URL = 1;
    public static final int Username = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6be031020d95727f7ef03749248646be", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6be031020d95727f7ef03749248646be") : new TextContentType();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58d3081ee2f9ed53b06f226dc8d75212", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58d3081ee2f9ed53b06f226dc8d75212") : propVisitor.visitTextContentType(binReader.getIntSignedLeb128());
    }
}
