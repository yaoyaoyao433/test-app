package com.meituan.android.recce.props.gens;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShowsHorizontalScrollIndicator implements d {
    public static final int INDEX_ID = 120;
    public static final String LOWER_CASE_NAME = "showsHorizontalScrollIndicator";
    public static final String NAME = "shows-horizontal-scroll-indicator";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a9e2acd3a96d7c40d9132e2d54c08d9", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a9e2acd3a96d7c40d9132e2d54c08d9") : new ShowsHorizontalScrollIndicator();
    }

    @Override // com.meituan.android.recce.props.d
    public <T> T accept(BinReader binReader, PropVisitor<T> propVisitor) {
        Object[] objArr = {binReader, propVisitor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c97b362c14022f5d35a617635457ca40", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c97b362c14022f5d35a617635457ca40") : propVisitor.visitShowsHorizontalScrollIndicator(binReader.getBool());
    }
}
