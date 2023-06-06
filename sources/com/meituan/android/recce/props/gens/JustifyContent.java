package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JustifyContent implements d {
    public static final String[] CaseNames = {"flex-start", "center", "flex-end", "space-between", "space-around", "space-evenly"};
    public static final int Center = 1;
    public static final int FlexEnd = 2;
    public static final int FlexStart = 0;
    public static final int INDEX_ID = 21;
    public static final String LOWER_CASE_NAME = "justifyContent";
    public static final String NAME = "justify-content";
    public static final int SpaceAround = 4;
    public static final int SpaceBetween = 3;
    public static final int SpaceEvenly = 5;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af3aa960466ae46057ce47d312ba229a", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af3aa960466ae46057ce47d312ba229a") : new JustifyContent();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4ad052c061c2d3bcbc43c9f3375a56f", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4ad052c061c2d3bcbc43c9f3375a56f") : propVisitor.visitJustifyContent(binReader.getIntSignedLeb128());
    }
}
