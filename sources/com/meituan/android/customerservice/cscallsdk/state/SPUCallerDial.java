package com.meituan.android.customerservice.cscallsdk.state;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.customerservice.callbase.base.f;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallInvite;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallJoin;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallRingRsp;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.android.customerservice.callbase.protohelper.b;
import com.meituan.android.customerservice.callbase.state.a;
import com.meituan.android.customerservice.callbase.utils.CallHandleWorker;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.cscallsdk.b;
import com.meituan.android.pike.PikeClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SPUCallerDial extends StateProcessUnit {
    private static final String TAG = "SPUCallerDial";
    public static ChangeQuickRedirect changeQuickRedirect;
    private a.d mCSCallHalfInvite;
    private a.i mCallerInviteReq;
    private boolean mReceiveServieSingnal;
    private boolean mRingCall;

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public int getState() {
        return 1;
    }

    public SPUCallerDial(StateContext stateContext) {
        super(stateContext);
        Object[] objArr = {stateContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1fb84a2e73dbc0dce6ff66943e25fa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1fb84a2e73dbc0dce6ff66943e25fa5");
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onInit(Object obj) {
        MeetingStatusItems[] meetingStatusItemsArr;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a70cd43d16f12153e594d26693494cda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a70cd43d16f12153e594d26693494cda")).booleanValue();
        }
        a.C0238a c0238a = (a.C0238a) obj;
        if (c0238a.a != 102) {
            CallLog.log(getClass(), "SPUDial start init with action = " + c0238a.a);
            getCallSession().a(getState());
            process(c0238a);
            return true;
        }
        startTimer(101);
        this.mCallerInviteReq = (a.i) obj;
        getCallSession().f = this.mCallerInviteReq.c;
        HashSet<f> hashSet = new HashSet<>();
        ArrayList<f> arrayList = new ArrayList<>();
        for (MeetingStatusItems meetingStatusItems : this.mCallerInviteReq.b) {
            f fVar = new f();
            fVar.d = meetingStatusItems.getRole();
            fVar.c = meetingStatusItems.getMber();
            fVar.f = meetingStatusItems.getCid();
            fVar.b = meetingStatusItems.getAppId();
            fVar.e = meetingStatusItems.getType();
            if (meetingStatusItems.getRole() == 2) {
                fVar.g = (byte) 1;
                arrayList.add(fVar);
            } else {
                fVar.g = (byte) 2;
            }
            hashSet.add(fVar.a());
        }
        getCallSession().a(hashSet);
        getCallSession().a(this.mCallerInviteReq.d);
        getCallSession().g = arrayList;
        getCallSession().c = this.mCallerInviteReq.h;
        getCallSession().b = "";
        getCallSession().a(getState());
        return processInviteReq(this.mCallerInviteReq);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c07763e530249dd23613848277e66b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c07763e530249dd23613848277e66b4");
            return;
        }
        this.mRingCall = false;
        this.mReceiveServieSingnal = false;
        getAVEngine().d();
        super.onDestroy();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onProcess(a.C0238a c0238a) {
        Object[] objArr = {c0238a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9925225d06a34b0c84f874598a52c55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9925225d06a34b0c84f874598a52c55")).booleanValue();
        }
        int i = c0238a.a;
        if (i == 107) {
            processRingCall((a.k) c0238a);
            return true;
        } else if (i != 202) {
            switch (i) {
                case 103:
                    return processCallTrying((a.l) c0238a);
                case 104:
                    return processInviteRsp((a.j) c0238a);
                default:
                    switch (i) {
                        case 401:
                            return processHalfJoin((a.f) c0238a);
                        case 402:
                            return processHalfJoinRsp((a.g) c0238a);
                        case 403:
                            return processAddMembersReq((a.d) c0238a);
                        case 404:
                            processAddMemberRes((a.e) c0238a);
                            return true;
                        default:
                            return false;
                    }
            }
        } else {
            return processRejoinRsp((a.p) c0238a);
        }
    }

    private boolean processInviteReq(final a.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51163a6c44da07f1fa6640a481ec47e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51163a6c44da07f1fa6640a481ec47e5")).booleanValue();
        }
        setCurAction(104);
        CallLog.log(TAG, "send invite: gid " + iVar.d + ", sid " + iVar.i);
        b callRequstHelper = getCallRequstHelper();
        MeetingStatusItems[] meetingStatusItemsArr = iVar.b;
        long j = iVar.d;
        String str = iVar.i;
        String str2 = iVar.h;
        String str3 = iVar.g;
        HashMap<String, String> hashMap = iVar.m;
        Byte valueOf = Byte.valueOf(iVar.e);
        Byte valueOf2 = Byte.valueOf(iVar.f);
        String str4 = iVar.j;
        short s = iVar.k;
        PikeClient.SendMessageCallback sendMessageCallback = new PikeClient.SendMessageCallback() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCallerDial.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.pike.PikeClient.SendMessageCallback
            public void onSuccess(com.meituan.android.pike.message.a aVar) {
            }

            @Override // com.meituan.android.pike.PikeClient.SendMessageCallback
            public void onFailure(com.meituan.android.pike.message.a aVar, int i) {
                Object[] objArr2 = {aVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a6ee304009b7fb74c7e7e00c322897ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a6ee304009b7fb74c7e7e00c322897ff");
                    return;
                }
                CallLog.log(SPUCallerDial.TAG, "Send invite fail : messageid " + aVar.b);
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("legid", SPUCallerDial.this.getCallSession().c);
                hashMap2.put("gid", Long.valueOf(iVar.d));
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(3, (int) (System.currentTimeMillis() - iVar.l), hashMap2, "cs_voip_invite_success");
                SPUCallerDial.this.triggerError("", iVar.d, 3, "发送invite超时", iVar.h);
            }
        };
        Object[] objArr2 = {meetingStatusItemsArr, new Long(j), str, str2, str3, hashMap, valueOf, valueOf2, str4, Short.valueOf(s), sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, callRequstHelper, changeQuickRedirect3, false, "47c42addde4e30f63510cbe066b38763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, callRequstHelper, changeQuickRedirect3, false, "47c42addde4e30f63510cbe066b38763");
            return true;
        }
        CSCallInvite cSCallInvite = new CSCallInvite();
        cSCallInvite.setMbers(meetingStatusItemsArr);
        cSCallInvite.setGid(j);
        cSCallInvite.setSid(str);
        cSCallInvite.setLegid(str2);
        cSCallInvite.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
        cSCallInvite.setdType(callRequstHelper.b.d());
        cSCallInvite.setVendor(valueOf.byteValue());
        cSCallInvite.setVcType(valueOf2.byteValue());
        cSCallInvite.setvCid(str3);
        cSCallInvite.setEncrypt(s);
        cSCallInvite.setvAppkey(str4);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        cSCallInvite.setuData(hashMap);
        callRequstHelper.a(new Gson().toJson(cSCallInvite), sendMessageCallback);
        return true;
    }

    private boolean processHalfJoin(final a.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bc60f2414baa629f998c2dda08011d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bc60f2414baa629f998c2dda08011d6")).booleanValue();
        }
        if (checkAction(401, new int[0])) {
            CallLog.error(getClass(), "ProcessHalfJoin double half join");
            return false;
        }
        setCurActionAndStartTimer(401);
        getCallSession().a(fVar.f);
        getCallSession().b = fVar.b;
        getCallSession().c = fVar.d;
        getCallSession().d = fVar.c;
        joinAVEngine(fVar.c, new com.meituan.android.customerservice.callbase.avengine.a() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCallerDial.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onSuccess(Object obj, int i) {
                Object[] objArr2 = {obj, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "241cc69b8ce73688a17fe028636ddd4a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "241cc69b8ce73688a17fe028636ddd4a");
                    return;
                }
                b callRequstHelper = SPUCallerDial.this.getCallRequstHelper();
                String str = fVar.g;
                String str2 = fVar.b;
                String str3 = fVar.d;
                short s = fVar.i;
                HashMap<String, String> hashMap = fVar.k;
                Byte valueOf = Byte.valueOf(fVar.e);
                Object[] objArr3 = {str, str2, str3, Short.valueOf(s), hashMap, valueOf};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr3, callRequstHelper, changeQuickRedirect4, false, "6c0c223ad29a02178af088afe2d26c8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, callRequstHelper, changeQuickRedirect4, false, "6c0c223ad29a02178af088afe2d26c8e");
                    return;
                }
                CSCallJoin cSCallJoin = new CSCallJoin();
                cSCallJoin.setMber(str);
                cSCallJoin.setSid(str2);
                cSCallJoin.setAppid(callRequstHelper.b.b());
                cSCallJoin.setCid(s);
                cSCallJoin.setLegid(str3);
                cSCallJoin.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
                cSCallJoin.setdType(callRequstHelper.b.d());
                cSCallJoin.setVendor(valueOf.byteValue());
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                }
                cSCallJoin.setuData(hashMap);
                callRequstHelper.a(new Gson().toJson(cSCallJoin));
            }

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onError(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8dc68260955af31a74f07f26da18618c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8dc68260955af31a74f07f26da18618c");
                    return;
                }
                b.d dVar = new b.d();
                dVar.a = fVar.b;
                dVar.c = fVar.f;
                dVar.f = 4;
                dVar.g = "join avengine error";
                SPUCallerDial.this.getListener().onJoinCallRes(dVar);
                SPUCallerDial.this.triggerError(fVar.b, fVar.f, 4, "Join Avenge error ", fVar.d, (short) 4);
            }
        }, fVar.j, true);
        return true;
    }

    private boolean processHalfJoinRsp(a.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e6cf803e3bd9b9c7c3ee0a4daf9dbd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e6cf803e3bd9b9c7c3ee0a4daf9dbd")).booleanValue();
        }
        if (isSameSession(gVar.d)) {
            cancelTimer(401);
            b.d dVar = new b.d();
            dVar.a = gVar.d;
            dVar.c = getCallSession().i;
            if (gVar.b == 0) {
                getCallSession().a(gVar.f);
                dVar.f = 0;
                b.a aVar = new b.a();
                aVar.a = gVar.d;
                aVar.c = getCallSession().i;
                aVar.b = gVar.e;
                aVar.e = true;
                getListener().onMakeCallSuccess(aVar);
                toNextState(null);
            } else {
                dVar.f = gVar.b;
                dVar.g = "Halfjoin rep error";
                triggerError(gVar.d, getCallSession().i, 100, "Half join fail", gVar.e);
            }
            getListener().onJoinCallRes(dVar);
            return true;
        }
        return false;
    }

    private boolean processAddMembersReq(a.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c56147f58a92bf63f28f3db1433e683", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c56147f58a92bf63f28f3db1433e683")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99e328a72c86d1d9ae4ceb28c631ea1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99e328a72c86d1d9ae4ceb28c631ea1e");
        } else if (isSameSession(eVar.d)) {
            if (eVar.b == 15) {
                triggerWarning(eVar.d, getCallSession().i, eVar.b, eVar.c, eVar.e);
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(Message.SID, eVar.d);
            hashMap.put("legid", eVar.e);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(eVar.b, 0, hashMap, "cs_voip_reinvite_success");
            if (isRspSuccessed(eVar.b)) {
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a("cs_voip_invite_send", this.mCSCallHalfInvite.b.length - 1, hashMap);
            }
        }
    }

    private boolean joinAVEngineCaller(final a.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "962a962da41f6fe04616a5715fe30ab3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "962a962da41f6fe04616a5715fe30ab3")).booleanValue();
        }
        setCurAction(2001);
        if (this.mRingCall) {
            goToNextState(jVar.d, jVar.e, jVar.f);
            return true;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        joinAVEngine(jVar.f, new com.meituan.android.customerservice.callbase.avengine.a() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCallerDial.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onSuccess(Object obj, int i) {
                Object[] objArr2 = {obj, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "288d81a30516684f6033fc4e57035996", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "288d81a30516684f6033fc4e57035996");
                    return;
                }
                CallLog.log(SPUCallerDial.TAG, "joinAVEngine onSuccess:" + i + " join time " + (System.currentTimeMillis() - currentTimeMillis));
                SPUCallerDial.this.goToNextState(jVar.d, jVar.e, jVar.f);
            }

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onError(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86ce6530de2fa12adca0ea0c05513c73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86ce6530de2fa12adca0ea0c05513c73");
                    return;
                }
                CallLog.error(SPUCallerDial.TAG, "joinAVEngine onError:" + i);
                SPUCallerDial.this.getCallRequstHelper().a((short) 4, "Join avengine fail", jVar.d, jVar.e);
                SPUCallerDial.this.triggerError(jVar.d, jVar.g, 4, "Join avengine fail", jVar.e, (short) 4);
            }
        }, jVar.h, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goToNextState(final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b017520e3bd0629df6d70f972e086fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b017520e3bd0629df6d70f972e086fa");
            return;
        }
        getCallRequstHelper().a((short) 0, "Join avengine success", str, str2);
        CallHandleWorker.getInstance().runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCallerDial.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "afc23c97fb62ee6259626b24cf7bac98", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "afc23c97fb62ee6259626b24cf7bac98");
                    return;
                }
                SPUCallerDial.this.toNextState(null);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(Message.SID, str);
                hashMap.put("legid", str2);
                hashMap.put("vcid", str3);
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, (int) (System.currentTimeMillis() - SPUCallerDial.this.mCallerInviteReq.l), hashMap, "cs_voip_callertalking_success");
            }
        });
    }

    private boolean processInviteRsp(a.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1a38c425f005d631620d54dba1179a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1a38c425f005d631620d54dba1179a3")).booleanValue();
        }
        if (!checkAction(104, new int[0])) {
            logCheckActionError("processInviteRsp", 104);
            return false;
        } else if (!TextUtils.equals(jVar.e, getCallSession().c)) {
            getCallRequstHelper().b((short) 17, "wrong legid", jVar.d, jVar.e);
            return false;
        } else {
            getCallSession().b = jVar.d;
            if (isRspSuccessed(jVar.b)) {
                makecallSucess(getCallSession().b, getCallSession().c, getCallSession().i);
                b.a aVar = new b.a();
                aVar.a = getCallSession().b;
                aVar.c = getCallSession().i;
                getListener().onCallEstablishing(aVar);
                joinAVEngineCaller(jVar);
                return true;
            }
            CallLog.error(TAG, "processInviteRsp error");
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(Message.SID, jVar.d);
            hashMap.put("legid", jVar.e);
            hashMap.put("callRole", Byte.valueOf(getCallSession().h));
            hashMap.put("callStatus", Integer.valueOf(getCallSession().d()));
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(jVar.b, 0, hashMap, "cs_voip_hangup");
            triggerError(jVar.d, getCallSession().i, jVar.b, jVar.c, jVar.e, jVar.b, true);
            return true;
        }
    }

    private boolean processRejoinRsp(a.p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f4c30d67d517e7f21e84cf99340c302", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f4c30d67d517e7f21e84cf99340c302")).booleanValue();
        }
        if (!isSameSession(pVar.c)) {
            logCheckActionError("processRejoinRsp", 202);
            return false;
        }
        cancelTimer(202);
        if (!isRspSuccessed(pVar.b)) {
            triggerError(pVar.c, getCallSession().i, pVar.b, "rejoin fail", pVar.d);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(Message.SID, getCallSession().b);
            hashMap.put("legid", getCallSession().c);
            hashMap.put("gid", Long.valueOf(getCallSession().i));
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, (int) (System.currentTimeMillis() - this.mCallerInviteReq.l), hashMap, "cs_voip_invite_success");
            return true;
        }
        b.a aVar = new b.a();
        aVar.a = pVar.c;
        aVar.c = 0L;
        aVar.b = pVar.d;
        getListener().onRejoinSuccess(aVar);
        return true;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onReconnected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adbf1cdca03abd259367a2acff81f44e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adbf1cdca03abd259367a2acff81f44e")).booleanValue();
        }
        if (TextUtils.isEmpty(getCallSession().b)) {
            return true;
        }
        CallLog.debug(TAG, "send join:" + getCallSession().b);
        startTimer(202);
        getCallRequstHelper().a(getCallSession().b, getCallSession().c, (byte) 2);
        return true;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public boolean onDisconnect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3f9262fe7c02b862ba0c93225c497c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3f9262fe7c02b862ba0c93225c497c8")).booleanValue();
        }
        CallLog.debug(TAG, "onDisconnect");
        return true;
    }

    private boolean processRingCall(final a.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "628f840f18c4d312b40981402eb46d4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "628f840f18c4d312b40981402eb46d4f")).booleanValue();
        }
        if (!checkData(kVar.b, kVar.c) || this.mRingCall) {
            return false;
        }
        this.mRingCall = true;
        joinAVEngine(kVar.d, new com.meituan.android.customerservice.callbase.avengine.a() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCallerDial.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onSuccess(Object obj, int i) {
                Object[] objArr2 = {obj, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4bef7588a5a1726635bd724643b16275", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4bef7588a5a1726635bd724643b16275");
                    return;
                }
                CallLog.log(SPUCallerDial.TAG, "processRingCall success");
                com.meituan.android.customerservice.callbase.protohelper.b callRequstHelper = SPUCallerDial.this.getCallRequstHelper();
                String str = kVar.b;
                String str2 = kVar.c;
                Object[] objArr3 = {str, str2, (short) 0, "Join Avengine success"};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.customerservice.callbase.protohelper.b.a;
                if (PatchProxy.isSupport(objArr3, callRequstHelper, changeQuickRedirect4, false, "037c3dbca232f838c8b4eb47fab3a6ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, callRequstHelper, changeQuickRedirect4, false, "037c3dbca232f838c8b4eb47fab3a6ce");
                } else {
                    CSCallRingRsp cSCallRingRsp = new CSCallRingRsp();
                    cSCallRingRsp.setSid(str);
                    cSCallRingRsp.setLegid(str2);
                    cSCallRingRsp.setCode((short) 0);
                    cSCallRingRsp.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
                    cSCallRingRsp.setReason("Join Avengine success");
                    callRequstHelper.a(new Gson().toJson(cSCallRingRsp));
                }
                CallHandleWorker.getInstance().runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCallerDial.5.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "f219171557857bf3a96c1f9432472d20", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "f219171557857bf3a96c1f9432472d20");
                            return;
                        }
                        SPUCallerDial.this.getCallSession().j = true;
                        SPUCallerDial.this.getListener().onRingCall(kVar.b);
                    }
                });
            }

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onError(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d9cc3697581d4887d27c5300ca1c813e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d9cc3697581d4887d27c5300ca1c813e");
                } else {
                    SPUCallerDial.this.triggerError(kVar.b, SPUCallerDial.this.getCallSession().i, 4, "Join avengine fail", kVar.c, (short) 4);
                }
            }
        }, kVar.e, false);
        return true;
    }

    private boolean processCallTrying(a.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e9970fbdb946b0fd3e588a0d483df67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e9970fbdb946b0fd3e588a0d483df67")).booleanValue() : checkData(lVar.b, lVar.c);
    }

    private boolean checkData(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80ca79f1c080ccb8b470dfcf606e4ee6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80ca79f1c080ccb8b470dfcf606e4ee6")).booleanValue();
        }
        if (!checkAction(104, new int[0])) {
            logCheckActionError("processCallTrying", 104);
            return false;
        } else if (!TextUtils.equals(str2, getCallSession().c)) {
            getCallRequstHelper().b((short) 17, "wrong legid", str, str2);
            return false;
        } else {
            getCallSession().b = str;
            makecallSucess(str, str2, getCallSession().i);
            return true;
        }
    }

    private void makecallSucess(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07af5effafe6bb5ca9e3b77443314238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07af5effafe6bb5ca9e3b77443314238");
        } else if (this.mReceiveServieSingnal) {
        } else {
            b.a aVar = new b.a();
            aVar.a = str;
            aVar.b = str2;
            aVar.c = j;
            getListener().onMakeCallSuccess(aVar);
            this.mReceiveServieSingnal = true;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(Message.SID, str);
            hashMap.put("legid", str2);
            hashMap.put("gid", Long.valueOf(j));
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, (int) (System.currentTimeMillis() - this.mCallerInviteReq.l), hashMap, "cs_voip_invite_success");
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a("cs_voip_invite_send", this.mCallerInviteReq.b.length - 1, hashMap);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit
    public void onTimeout(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0114a9a5999a87782cbd54aa8955bc82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0114a9a5999a87782cbd54aa8955bc82");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Message.SID, getCallSession().b);
        hashMap.put("legid", getCallSession().c);
        hashMap.put("gid", Long.valueOf(getCallSession().i));
        if (i == 101) {
            CallHandleWorker.getInstance().runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.SPUCallerDial.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bd89fadbced18a23936e91829a943a2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bd89fadbced18a23936e91829a943a2d");
                        return;
                    }
                    if (TextUtils.isEmpty(SPUCallerDial.this.getCallSession().b)) {
                        HashMap<String, Object> hashMap2 = new HashMap<>();
                        hashMap2.put("legid", SPUCallerDial.this.getCallSession().c);
                        hashMap2.put("gid", Long.valueOf(SPUCallerDial.this.getCallSession().i));
                        com.meituan.android.customerservice.callbase.csmonitor.a.a().a(3, (int) (System.currentTimeMillis() - SPUCallerDial.this.mCallerInviteReq.l), hashMap2, "cs_voip_invite_success");
                    }
                    b.a aVar = new b.a();
                    aVar.a = SPUCallerDial.this.getCallSession().b;
                    aVar.c = SPUCallerDial.this.getCallSession().i;
                    aVar.b = SPUCallerDial.this.getCallSession().c;
                    aVar.d = 3;
                    SPUCallerDial.this.getListener().onMakeCallTimeout(aVar);
                    SPUCallerDial.this.toEnd((short) 3, "make call timeout", false);
                }
            });
        } else if (i == 202) {
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, (int) (System.currentTimeMillis() - this.mCallerInviteReq.l), hashMap, "cs_voip_invite_success");
            triggerError(getCallSession().b, getCallSession().i, 10004, "Join fail", getCallSession().c);
        } else if (i != 401) {
        } else {
            b.d dVar = new b.d();
            dVar.a = getCallSession().b;
            dVar.c = getCallSession().i;
            dVar.f = 3;
            dVar.g = "join rsp timeout";
            getListener().onJoinCallRes(dVar);
            triggerError(getCallSession().b, getCallSession().i, 100, "Join rsp timeout ", getCallSession().c);
        }
    }
}
