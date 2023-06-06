package com.meituan.android.recce.props.gens;

import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.props.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AnimationType implements d {
    public static final String[] CaseNames = {"none", Constants.EventType.SLIDE, MarketingModel.DIALOG_SHOW_TYPE_FADE};
    public static final int Fade = 2;
    public static final int INDEX_ID = 139;
    public static final String LOWER_CASE_NAME = "animationType";
    public static final String NAME = "animation-type";
    public static final int None = 0;
    public static final int Slide = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static d prop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a09e6a86449d027d6fa7769e235fe05b", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a09e6a86449d027d6fa7769e235fe05b") : new AnimationType();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "740cec8c3c6ed8b0a3f13fc2a6d75d8e", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "740cec8c3c6ed8b0a3f13fc2a6d75d8e") : propVisitor.visitAnimationType(binReader.getIntSignedLeb128());
    }
}
