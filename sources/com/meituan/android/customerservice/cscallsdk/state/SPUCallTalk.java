package com.meituan.android.customerservice.cscallsdk.state;

import com.google.gson.Gson;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallDTMF;
import com.meituan.android.customerservice.callbase.protohelper.b;
import com.meituan.android.customerservice.callbase.state.a;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.cscallsdk.b;
import com.meituan.android.pike.PikeClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SPUCallTalk extends StateProcessUnit {
    private static final String TAG = "CS_SPUCallerTalk";
    public static ChangeQuickRedirect changeQuickRedirect;
    private a.d mCSCallHalfInvite;
    private long mCurrentTime;

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public int getState() {
        return 3;
    }

    public SPUCallTalk(StateContext stateContext) {
        super(stateContext);
        Object[] objArr = {stateContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffbade125540161fdd9ef794dfda8a54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffbade125540161fdd9ef794dfda8a54");
        } else {
            this.mCurrentTime = 0L;
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onInit(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9f88698684f81cc4207f4614ad0566c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9f88698684f81cc4207f4614ad0566c")).booleanValue();
        }
        setCurAction(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
        getCallSession().a(getState());
        getListener().onTalking();
        this.mCurrentTime = System.currentTimeMillis();
        return true;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onProcess(a.C0238a c0238a) {
        Object[] objArr = {c0238a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daa4a717b38061c7d7c0d7cea204205a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daa4a717b38061c7d7c0d7cea204205a")).booleanValue();
        }
        int i = c0238a.a;
        if (i != 105) {
            if (i == 202) {
                return processRejoinRsp((a.p) c0238a);
            }
            switch (i) {
                case 403:
                    return processAddMembersReq((a.d) c0238a);
                case 404:
                    processAddMemberRes((a.e) c0238a);
                    return true;
                default:
                    return false;
            }
        }
        a.c cVar = (a.c) c0238a;
        b callRequstHelper = getCallRequstHelper();
        String str = cVar.b;
        String str2 = cVar.c;
        String str3 = cVar.d;
        Object[] objArr2 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, callRequstHelper, changeQuickRedirect3, false, "3ca553bb55b8c234edd098a3758c1426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, callRequstHelper, changeQuickRedirect3, false, "3ca553bb55b8c234edd098a3758c1426");
        } else {
            CSCallDTMF cSCallDTMF = new CSCallDTMF();
            cSCallDTMF.setSid(str);
            cSCallDTMF.setLegid(str2);
            cSCallDTMF.setDtmf(str3);
            cSCallDTMF.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
            callRequstHelper.a(new Gson().toJson(cSCallDTMF));
        }
        return true;
    }

    private boolean processRejoinRsp(a.p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6935754df8567cb5b71819528589956", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6935754df8567cb5b71819528589956")).booleanValue();
        }
        if (!isSameSession(pVar.c)) {
            logCheckActionError("processRejoinRsp", 202);
            return false;
        }
        cancelTimer(202);
        if (!isRspSuccessed(pVar.b)) {
            triggerError(pVar.c, getCallSession().i, pVar.b, "rejoin fail", pVar.d);
            return true;
        }
        b.a aVar = new b.a();
        aVar.a = pVar.c;
        aVar.c = getCallSession().i;
        aVar.b = pVar.d;
        getListener().onRejoinSuccess(aVar);
        return true;
    }

    private boolean processAddMembersReq(a.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3157236d43211074aaeb6e48e798b0b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3157236d43211074aaeb6e48e798b0b9")).booleanValue();
        }
        Class<?> cls = getClass();
        CallLog.log(cls, "processHalfwayInviteReq send invite:, " + dVar.e);
        this.mCSCallHalfInvite = dVar;
        getCallRequstHelper().a(dVar.b, dVar.c, dVar.e, dVar.d, dVar.f);
        return true;
    }

    private void processAddMemberRes(a.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeaa26ade8db5dd3727212d0b7571561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeaa26ade8db5dd3727212d0b7571561");
        } else if (isSameSession(eVar.d)) {
            if (eVar.b == 15) {
                triggerWarning(eVar.d, getCallSession().i, eVar.b, eVar.c, eVar.e);
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(Message.SID, eVar.d);
            hashMap.put("legid", eVar.e);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(eVar.b, (int) (System.currentTimeMillis() - this.mCurrentTime), hashMap, "cs_voip_reinvite_success");
            if (isRspSuccessed(eVar.b)) {
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a("cs_voip_invite_send", this.mCSCallHalfInvite.b.length - 1, hashMap);
            }
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onReconnected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a7f73e7a4c6421a9c531ac1aa929987", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a7f73e7a4c6421a9c531ac1aa929987")).booleanValue();
        }
        CallLog.debug(TAG, "send join:" + getCallSession().b);
        getCallRequstHelper().a(getCallSession().b, getCallSession().c, (byte) 2);
        startTimer(202);
        return true;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onDisconnect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b4b934f5292e6b7e73b6d9f0269e467", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b4b934f5292e6b7e73b6d9f0269e467")).booleanValue();
        }
        CallLog.debug(TAG, "onDisconnect");
        return true;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public void onTimeout(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f89d8fb98df0c0b26388b0827a09e35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f89d8fb98df0c0b26388b0827a09e35");
        } else if (i != 202) {
        } else {
            triggerError(getCallSession().b, getCallSession().i, 10004, "Join fail", getCallSession().c);
        }
    }
}
