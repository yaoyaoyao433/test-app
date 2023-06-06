package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TextAlign implements d {
    public static final int Auto = 0;
    public static final String[] CaseNames = {FpsEvent.TYPE_SCROLL_AUTO, "left", "right", "center", "justify"};
    public static final int Center = 3;
    public static final int INDEX_ID = 60;
    public static final int Justify = 4;
    public static final String LOWER_CASE_NAME = "textAlign";
    public static final int Left = 1;
    public static final String NAME = "text-align";
    public static final int Right = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72ad9d28ffd4136d271845fae8f59970", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72ad9d28ffd4136d271845fae8f59970") : new TextAlign();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29d5e3b574c367441e035e4e11a7e830", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29d5e3b574c367441e035e4e11a7e830") : propVisitor.visitTextAlign(binReader.getIntSignedLeb128());
    }
}
