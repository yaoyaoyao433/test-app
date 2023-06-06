package com.meituan.android.recce.props;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.android.recce.props.gens.PropVisitorAcceptIndex;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static <T> void a(BinReader binReader, PropVisitor<T> propVisitor, int i) {
        Object[] objArr = {binReader, propVisitor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "089732b0b8fdb3951c95bd7036f6822b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "089732b0b8fdb3951c95bd7036f6822b");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PropVisitorAcceptIndex.props[binReader.getIntSignedLeb128()].accept(binReader, propVisitor);
        }
    }
}
