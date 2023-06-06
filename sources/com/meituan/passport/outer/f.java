package com.meituan.passport.outer;

import android.graphics.Color;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements com.meituan.passport.converter.b {
    public static ChangeQuickRedirect a;
    private final OuterMobileIndexFragment b;

    public f(OuterMobileIndexFragment outerMobileIndexFragment) {
        this.b = outerMobileIndexFragment;
    }

    @Override // com.meituan.passport.converter.b
    public final boolean a(ApiException apiException, boolean z) {
        Object accessDispatch;
        Object[] objArr = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b35fc8d924835247237dbdb9c8a9ac", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b35fc8d924835247237dbdb9c8a9ac");
        } else {
            OuterMobileIndexFragment outerMobileIndexFragment = this.b;
            Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = OuterMobileIndexFragment.h;
            if (!PatchProxy.isSupport(objArr2, outerMobileIndexFragment, changeQuickRedirect2, false, "33f4fd9be39bf5c2edf19139a5c0cc79", RobustBitConfig.DEFAULT_VALUE)) {
                if (z || apiException.code != 101012) {
                    return true;
                }
                outerMobileIndexFragment.i.setEnabled(true);
                outerMobileIndexFragment.i.setText(apiException.getMessage());
                outerMobileIndexFragment.i.setTextColor(Color.parseColor("#F63F3F"));
                return false;
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, outerMobileIndexFragment, changeQuickRedirect2, false, "33f4fd9be39bf5c2edf19139a5c0cc79");
        }
        return ((Boolean) accessDispatch).booleanValue();
    }
}
