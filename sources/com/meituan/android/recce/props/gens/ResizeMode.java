package com.meituan.android.recce.props.gens;

import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ResizeMode implements d {
    public static final String[] CaseNames = {"matrix", DynamicTitleParser.PARSER_KEY_STRETCH, "fit_start", "contain", "fix_end", "center_crop", DynamicTitleParser.PARSER_VAL_STRETCH_COVER, "center"};
    public static final int Center = 7;
    public static final int Center_crop = 5;
    public static final int Contain = 3;
    public static final int Cover = 6;
    public static final int Fit_start = 2;
    public static final int Fix_end = 4;
    public static final int INDEX_ID = 1;
    public static final String LOWER_CASE_NAME = "resizeMode";
    public static final int Matrix = 0;
    public static final String NAME = "resize-mode";
    public static final int Stretch = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67762be7789c0c2c2dac6929ddfa6453", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67762be7789c0c2c2dac6929ddfa6453") : new ResizeMode();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea868e15466f849b0e80f26c9fa03980", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea868e15466f849b0e80f26c9fa03980") : propVisitor.visitResizeMode(binReader.getIntSignedLeb128());
    }
}
