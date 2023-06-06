package com.meituan.android.customerservice.cscallsdk.state;

import android.content.Context;
import com.meituan.android.customerservice.callbase.base.c;
import com.meituan.android.customerservice.callbase.protohelper.b;
import com.meituan.android.customerservice.cscallsdk.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StateContextWrapper implements StateContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private StateContext mContext;

    public StateContextWrapper(StateContext stateContext) {
        Object[] objArr = {stateContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30e0233c4051723183205bbe21ff4e02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30e0233c4051723183205bbe21ff4e02");
        } else {
            this.mContext = stateContext;
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public boolean checkAction(int i, int... iArr) {
        Object[] objArr = {Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65c4c82382b36e5e92740177a6017fcc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65c4c82382b36e5e92740177a6017fcc")).booleanValue() : this.mContext.checkAction(i, iArr);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public void setCurAction(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "746b1f6638806d044b76a861de7bac84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "746b1f6638806d044b76a861de7bac84");
        } else {
            this.mContext.setCurAction(i);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public int getCurAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3d916525b5d9d91cf05528c521a9b83", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3d916525b5d9d91cf05528c521a9b83")).intValue() : this.mContext.getCurAction();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35ed9fa8f40c20865e1dcf5198760771", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35ed9fa8f40c20865e1dcf5198760771") : this.mContext.getContext();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public b getCallRequstHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ec7379f33fa2bb1ece9067441067f8", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ec7379f33fa2bb1ece9067441067f8") : this.mContext.getCallRequstHelper();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public com.meituan.android.customerservice.callbase.avengine.b getAVEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5b6c202c74867fc4937f5c39b1421ae", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.customerservice.callbase.avengine.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5b6c202c74867fc4937f5c39b1421ae") : this.mContext.getAVEngine();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public c getCallProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbdd0b5eb4a980938c2dae1c82115df4", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbdd0b5eb4a980938c2dae1c82115df4") : this.mContext.getCallProvider();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public b.C0244b getListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea16fe96c14e100e130bc4f9be409527", RobustBitConfig.DEFAULT_VALUE) ? (b.C0244b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea16fe96c14e100e130bc4f9be409527") : this.mContext.getListener();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public com.meituan.android.customerservice.cscallsdk.inner.c getCallSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8145e7c99106cddcb5ea4aa2d8e557d0", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.customerservice.cscallsdk.inner.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8145e7c99106cddcb5ea4aa2d8e557d0") : this.mContext.getCallSession();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public boolean toNextState(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c55f474e5c3c6d6f23e78d75e13fb01", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c55f474e5c3c6d6f23e78d75e13fb01")).booleanValue() : this.mContext.toNextState(obj);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public boolean moveToState(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e01dd4068d0bb94411fc806b6b3578a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e01dd4068d0bb94411fc806b6b3578a")).booleanValue() : this.mContext.moveToState(i, obj);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public boolean moveToWaitState(Object obj, boolean z) {
        Object[] objArr = {obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba2e10fcf345c4e33c1c7bca1a92f4f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba2e10fcf345c4e33c1c7bca1a92f4f3")).booleanValue() : this.mContext.moveToWaitState(obj, z);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public void toEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6d82890744cc65b03484f6d76eab742", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6d82890744cc65b03484f6d76eab742");
        } else {
            this.mContext.toEnd();
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public void toEnd(short s, String str, boolean z) {
        Object[] objArr = {Short.valueOf(s), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1223a670a76c232bc4f152590cdb306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1223a670a76c232bc4f152590cdb306");
        } else {
            this.mContext.toEnd(s, str, z);
        }
    }
}
