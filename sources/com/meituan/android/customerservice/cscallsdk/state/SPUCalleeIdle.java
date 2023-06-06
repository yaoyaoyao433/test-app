package com.meituan.android.customerservice.cscallsdk.state;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallTrying;
import com.meituan.android.customerservice.callbase.protohelper.b;
import com.meituan.android.customerservice.callbase.state.a;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.pike.PikeClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SPUCalleeIdle extends StateProcessUnit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a.m mCurDetectInvited;

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public int getState() {
        return 0;
    }

    public SPUCalleeIdle(StateContext stateContext) {
        super(stateContext);
        Object[] objArr = {stateContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fa10edfeb42cdb55df9dbba2c1becb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fa10edfeb42cdb55df9dbba2c1becb1");
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onInit(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a25fdc707e8f63380e0bc615fa1a60f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a25fdc707e8f63380e0bc615fa1a60f2")).booleanValue();
        }
        getCallSession().a(getState());
        setCurAction(0);
        a.m mVar = (a.m) obj;
        this.mCurDetectInvited = mVar;
        processInvite(mVar);
        return toNextState(obj);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onProcess(a.C0238a c0238a) {
        Object[] objArr = {c0238a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87adcdfce03227655ee84029a3916a26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87adcdfce03227655ee84029a3916a26")).booleanValue();
        }
        if (c0238a.a != 301) {
            return false;
        }
        return processNotifyInvited((a.m) c0238a);
    }

    private void processInvite(a.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af5559cf8612a376dff4fa23a4fd50ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af5559cf8612a376dff4fa23a4fd50ca");
            return;
        }
        b callRequstHelper = getCallRequstHelper();
        String str = mVar.g;
        String str2 = mVar.h;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, callRequstHelper, changeQuickRedirect3, false, "f7c0153f8e1e4a0e2d4a35c4f7efa0b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, callRequstHelper, changeQuickRedirect3, false, "f7c0153f8e1e4a0e2d4a35c4f7efa0b3");
            return;
        }
        CSCallTrying cSCallTrying = new CSCallTrying();
        cSCallTrying.setSid(str);
        cSCallTrying.setLegid(str2);
        cSCallTrying.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
        callRequstHelper.a(new Gson().toJson(cSCallTrying));
    }

    private boolean processNotifyInvited(a.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fedbf7717a5a50fd159642f5f9887f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fedbf7717a5a50fd159642f5f9887f5")).booleanValue();
        }
        if (this.mCurDetectInvited != null && TextUtils.equals(this.mCurDetectInvited.g, mVar.g)) {
            Class<?> cls = getClass();
            CallLog.debug(cls, "repeat invite:" + mVar.g);
            return true;
        }
        if (!TextUtils.equals(this.mCurDetectInvited.g, mVar.g)) {
            getCallRequstHelper().b((short) 1, "Member busy", mVar.g, mVar.h);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(Message.SID, mVar.g);
            hashMap.put("legid", mVar.h);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(1, (int) (System.currentTimeMillis() - this.mCurDetectInvited.p), hashMap, "cs_voip_calleetalking_success", "cs_voip_incomingpop_success");
        }
        return true;
    }
}
