package com.meituan.android.recce.props.gens;

import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EllipsizeMode implements d {
    public static final String[] CaseNames = {PicassoBounceOnTouchListener.HEAD_BOUNCE, "middle", "tail", "clip"};
    public static final int Clip = 3;
    public static final int Head = 0;
    public static final int INDEX_ID = 53;
    public static final String LOWER_CASE_NAME = "ellipsizeMode";
    public static final int Middle = 1;
    public static final String NAME = "ellipsize-mode";
    public static final int Tail = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eccb58f85d28ed433b3257f447b2d16f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eccb58f85d28ed433b3257f447b2d16f") : new EllipsizeMode();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1838e640a684e094f2276d397ab2fbae", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1838e640a684e094f2276d397ab2fbae") : propVisitor.visitEllipsizeMode(binReader.getIntSignedLeb128());
    }
}
