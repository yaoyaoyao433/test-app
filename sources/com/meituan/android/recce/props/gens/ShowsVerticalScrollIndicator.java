package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShowsVerticalScrollIndicator implements d {
    public static final int INDEX_ID = 121;
    public static final String LOWER_CASE_NAME = "showsVerticalScrollIndicator";
    public static final String NAME = "shows-vertical-scroll-indicator";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a504b0f7fe8a12f93caa77e8c31ab92a", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a504b0f7fe8a12f93caa77e8c31ab92a") : new ShowsVerticalScrollIndicator();
    }

    @Override // com.meituan.android.recce.props.d
    public <T> T accept(BinReader binReader, PropVisitor<T> propVisitor) {
        Object[] objArr = {binReader, propVisitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80e419abeb4701ff664131b37899a5e7", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80e419abeb4701ff664131b37899a5e7") : propVisitor.visitShowsVerticalScrollIndicator(binReader.getBool());
    }
}
