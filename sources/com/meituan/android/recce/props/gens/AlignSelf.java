package com.meituan.android.recce.props.gens;

import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AlignSelf implements d {
    public static final int Auto = 0;
    public static final int Baseline = 5;
    public static final String[] CaseNames = {FpsEvent.TYPE_SCROLL_AUTO, "flex-start", "flex-end", "center", DynamicTitleParser.PARSER_KEY_STRETCH, "baseline"};
    public static final int Center = 3;
    public static final int FlexEnd = 2;
    public static final int FlexStart = 1;
    public static final int INDEX_ID = 6;
    public static final String LOWER_CASE_NAME = "alignSelf";
    public static final String NAME = "align-self";
    public static final int Stretch = 4;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "471d123c455530389b0eba62951d8637", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "471d123c455530389b0eba62951d8637") : new AlignSelf();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9918eaada154ad0769d908d629e835e", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9918eaada154ad0769d908d629e835e") : propVisitor.visitAlignSelf(binReader.getIntSignedLeb128());
    }
}
