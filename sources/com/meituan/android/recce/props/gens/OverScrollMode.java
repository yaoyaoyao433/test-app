package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OverScrollMode implements d {
    public static final int Always = 1;
    public static final int Auto = 0;
    public static final String[] CaseNames = {FpsEvent.TYPE_SCROLL_AUTO, "always", "never"};
    public static final int INDEX_ID = 117;
    public static final String LOWER_CASE_NAME = "overScrollMode";
    public static final String NAME = "over-scroll-mode";
    public static final int Never = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08b2d474696538b9d1c73105e57ec7ac", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08b2d474696538b9d1c73105e57ec7ac") : new OverScrollMode();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "842fae88860337dbb306c504c031fe68", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "842fae88860337dbb306c504c031fe68") : propVisitor.visitOverScrollMode(binReader.getIntSignedLeb128());
    }
}
