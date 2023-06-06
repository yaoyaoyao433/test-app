package com.meituan.android.customerservice.cscallsdk.state;

import com.google.gson.Gson;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallInvitersp;
import com.meituan.android.customerservice.callbase.state.a;
import com.meituan.android.customerservice.callbase.utils.CallHandleWorker;
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
public class SPUCalleeCall extends StateProcessUnit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mCurrentSKey;
    private long mStartTime;

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public int getState() {
        return 2;
    }

    public SPUCalleeCall(StateContext stateContext) {
        super(stateContext);
        Object[] objArr = {stateContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79da2e09e04b94df23acd4e3f32d0d41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79da2e09e04b94df23acd4e3f32d0d41");
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onInit(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b6633e3abf7bb4a8965340fe0647d02", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b6633e3abf7bb4a8965340fe0647d02")).booleanValue();
        }
        setCurActionAndStartTimer(302);
        a.m mVar = (a.m) obj;
        getCallSession().f = getCallProvider().e();
        getCallSession().b = mVar.g;
        getCallSession().e = mVar.k;
        getCallSession().a(mVar.f);
        getCallSession().c = mVar.h;
        getCallSession().d = mVar.l;
        getCallSession().h = (byte) 2;
        getCallSession().g = mVar.b;
        getCallSession().a(mVar.c);
        getCallSession().a(getState());
        this.mCurrentSKey = mVar.n;
        this.mStartTime = mVar.p;
        b.f fVar = new b.f();
        fVar.j = mVar.d;
        fVar.c = mVar.f;
        fVar.a = mVar.g;
        fVar.b = mVar.h;
        fVar.g = mVar.b;
        fVar.i = mVar.k;
        fVar.h = mVar.i;
        getListener().onInvited(fVar);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Message.SID, getCallSession().b);
        hashMap.put("legid", getCallSession().c);
        com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, (int) (System.currentTimeMillis() - this.mStartTime), hashMap, "cs_voip_incomingpop_success");
        return true;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onProcess(a.C0238a c0238a) {
        Object[] objArr = {c0238a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4659c8576d0ab6c2c3f9a6a52e454d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4659c8576d0ab6c2c3f9a6a52e454d5")).booleanValue();
        }
        switch (c0238a.a) {
            case 303:
                return processAnswerInviteReq((a.o) c0238a);
            case TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE /* 304 */:
                return processACKRsp((a.b) c0238a);
            default:
                return false;
        }
    }

    private boolean processAnswerInviteReq(a.o oVar) {
        Object[] objArr = {oVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0de678318e75ee95c9986e2c8c035142", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0de678318e75ee95c9986e2c8c035142")).booleanValue();
        }
        cancelTimer(302);
        Class<?> cls = getClass();
        CallLog.debug(cls, "answer invite:" + getCallSession().b + ", " + ((int) oVar.b));
        if (oVar.b == 1) {
            b.a aVar = new b.a();
            aVar.a = getCallSession().b;
            aVar.c = getCallSession().i;
            getListener().onCallEstablishing(aVar);
            return acceptMeeting(getCallSession().d, this.mCurrentSKey);
        }
        getCallRequstHelper().b((short) 2, "Member reject", getCallSession().b, getCallSession().c);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Message.SID, getCallSession().b);
        hashMap.put("legid", getCallSession().c);
        hashMap.put("callRole", Byte.valueOf(getCallSession().h));
        hashMap.put("callStatus", Integer.valueOf(getCallSession().d()));
        com.meituan.android.customerservice.callbase.csmonitor.a.a().a(2, (int) (System.currentTimeMillis() - this.mStartTime), hashMap, "cs_voip_calleetalking_success", "cs_voip_hangup");
        toEnd((short) 2, "User reject", true);
        return true;
    }

    private boolean acceptMeeting(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6a5f490dc2993e2aa11bfbaeebe26a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6a5f490dc2993e2aa11bfbaeebe26a7")).booleanValue();
        }
        if (checkAction(TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE, new int[0])) {
            logCheckActionError("Double join channel!", TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE);
            return false;
        }
        setCurActionAndStartTimer(TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE);
        final long currentTimeMillis = System.currentTimeMillis();
        joinAVEngine(str, new com.meituan.android.customerservice.callbase.avengine.a() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCalleeCall.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onSuccess(Object obj, int i) {
                Object[] objArr2 = {obj, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "139c48607b91b4598766189e6dbc53b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "139c48607b91b4598766189e6dbc53b6");
                    return;
                }
                com.meituan.android.customerservice.callbase.protohelper.b callRequstHelper = SPUCalleeCall.this.getCallRequstHelper();
                String str3 = SPUCalleeCall.this.getCallSession().b;
                String str4 = SPUCalleeCall.this.getCallSession().c;
                String str5 = SPUCalleeCall.this.getCallSession().d;
                Object[] objArr3 = {(short) 0, "Member accept", str3, str4, str5};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.customerservice.callbase.protohelper.b.a;
                if (PatchProxy.isSupport(objArr3, callRequstHelper, changeQuickRedirect4, false, "b4a0d92a360dd2b9934db51c04c3f2f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, callRequstHelper, changeQuickRedirect4, false, "b4a0d92a360dd2b9934db51c04c3f2f4");
                } else {
                    CSCallInvitersp cSCallInvitersp = new CSCallInvitersp();
                    cSCallInvitersp.setCode((short) 0);
                    cSCallInvitersp.setReason("Member accept");
                    cSCallInvitersp.setLegid(str4);
                    cSCallInvitersp.setvCid(str5);
                    cSCallInvitersp.setSid(str3);
                    cSCallInvitersp.setdType(callRequstHelper.b.d());
                    cSCallInvitersp.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
                    callRequstHelper.a(new Gson().toJson(cSCallInvitersp));
                }
                Class<?> cls = getClass();
                CallLog.log(cls, "joinAVEngine onSuccess:" + i + " join time " + (System.currentTimeMillis() - currentTimeMillis));
            }

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onError(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6b9da38f4317140240863cbfd9e12399", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6b9da38f4317140240863cbfd9e12399");
                    return;
                }
                Class<?> cls = getClass();
                CallLog.error(cls, "joinAVEngine onError:" + i);
                b.a aVar = new b.a();
                aVar.a = SPUCalleeCall.this.getCallSession().b;
                aVar.c = SPUCalleeCall.this.getCallSession().i;
                SPUCalleeCall.this.getListener().onAcceptInviteTimeout(aVar);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(Message.SID, SPUCalleeCall.this.getCallSession().b);
                hashMap.put("legid", SPUCalleeCall.this.getCallSession().c);
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(4, (int) (System.currentTimeMillis() - SPUCalleeCall.this.mStartTime), hashMap, "cs_voip_calleetalking_success", "cs_voip_accept_success");
                CallHandleWorker.getInstance().runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCalleeCall.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "83097783e2a5473d7055c6b30a8e9981", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "83097783e2a5473d7055c6b30a8e9981");
                        } else {
                            SPUCalleeCall.this.toEnd((short) 4, "Join avengine fail", false);
                        }
                    }
                });
            }
        }, str2, true);
        return true;
    }

    private boolean processACKRsp(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd655796f33ad5bc7bb9b783a7eab4aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd655796f33ad5bc7bb9b783a7eab4aa")).booleanValue();
        }
        if (!checkAction(TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE, new int[0]) || !isSameSession(bVar.c)) {
            logCheckActionError("processACKRsp", TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE);
            return false;
        }
        cancelTimer(TbsListener.ErrorCode.ERROR_HOST_UNAVAILABLE);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Message.SID, getCallSession().b);
        hashMap.put("legid", getCallSession().c);
        if (bVar.b == 0) {
            toNextState(null);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, (int) (System.currentTimeMillis() - this.mStartTime), hashMap, "cs_voip_calleetalking_success", "cs_voip_accept_success");
        } else {
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(bVar.b, (int) (System.currentTimeMillis() - this.mStartTime), hashMap, "cs_voip_calleetalking_success", "cs_voip_accept_success");
            triggerError(bVar.c, getCallSession().i, bVar.b, bVar.e, bVar.d);
        }
        return true;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public void onTimeout(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b33d3e07f56180ad658d9ee759edda0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b33d3e07f56180ad658d9ee759edda0");
            return;
        }
        b.a aVar = new b.a();
        aVar.a = getCallSession().b;
        aVar.c = getCallSession().i;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Message.SID, getCallSession().b);
        hashMap.put("legid", getCallSession().c);
        if (i == 302) {
            getListener().onAcceptInviteTimeout(aVar);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(3, (int) (System.currentTimeMillis() - this.mStartTime), hashMap, "cs_voip_calleetalking_success");
            toEnd((short) 3, "Accept timeout", false);
        } else if (i == 304) {
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(9, (int) (System.currentTimeMillis() - this.mStartTime), hashMap, "cs_voip_calleetalking_success", "cs_voip_accept_success");
            triggerError(getCallSession().b, getCallSession().i, 9, "Wait for ACK timeout", getCallSession().c, (short) 9);
        }
        super.onTimeout(i);
    }
}
