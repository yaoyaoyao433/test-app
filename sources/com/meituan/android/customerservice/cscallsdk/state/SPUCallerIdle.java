package com.meituan.android.customerservice.cscallsdk.state;

import com.meituan.android.customerservice.callbase.state.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SPUCallerIdle extends StateProcessUnit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public int getState() {
        return 0;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onProcess(a.C0238a c0238a) {
        return false;
    }

    public SPUCallerIdle(StateContext stateContext) {
        super(stateContext);
        Object[] objArr = {stateContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e11dd4a697a8bb519bcd82138ba9ae0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e11dd4a697a8bb519bcd82138ba9ae0b");
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onInit(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad1b0a479b10e826a4cdc510b112b3ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad1b0a479b10e826a4cdc510b112b3ad")).booleanValue();
        }
        getCallSession().a(getState());
        setCurAction(0);
        return toNextState(obj);
    }
}
