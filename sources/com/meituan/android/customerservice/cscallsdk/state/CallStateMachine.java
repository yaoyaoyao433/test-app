package com.meituan.android.customerservice.cscallsdk.state;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.customerservice.callbase.avengine.b;
import com.meituan.android.customerservice.callbase.base.e;
import com.meituan.android.customerservice.callbase.base.f;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingCodeItems;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingFmber;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingItem;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.android.customerservice.callbase.state.a;
import com.meituan.android.customerservice.callbase.utils.CallBaseUtil;
import com.meituan.android.customerservice.callbase.utils.CallHandleWorker;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.callbase.utils.SharedPreferenceUtils;
import com.meituan.android.customerservice.cscallsdk.b;
import com.meituan.android.customerservice.cscallsdk.d;
import com.meituan.android.customerservice.cscallsdk.inner.a;
import com.meituan.android.customerservice.cscallsdk.inner.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallStateMachine implements e.a, StateContext {
    private static final String TAG = "CallStateMachine";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int HALFJION;
    private final int MAKECALL;
    private final int UNKNOWN;
    private b mAVEngine;
    private boolean mCallEnable;
    private CopyOnWriteArraySet<d.a> mCallRingPhoneListener;
    private c mCallSession;
    private Context mContext;
    private Map<String, Long> mCseqMap;
    private int mCurAction;
    private StateProcessUnit mCurSpu;
    private int mCurSpuIndex;
    private Class<? extends StateProcessUnit>[] mCurStateChain;
    private com.meituan.android.customerservice.callbase.base.b mHalfJoinCallback;
    private CallHandleWorker mHandler;
    private InnerListener mListener;
    private int mMakeCallType;
    private e mPingManager;
    private com.meituan.android.customerservice.callbase.base.c mProvider;
    private com.meituan.android.customerservice.callbase.protohelper.b mRequstHelper;
    private Object mSPULock;
    private boolean mWeakNet;
    private long makeCalltime;
    private static Class<? extends StateProcessUnit>[] sCallerStateChain = {SPUCallerIdle.class, SPUCallerDial.class, SPUCallTalk.class};
    private static Class<? extends StateProcessUnit>[] sCalleeStateChain = {SPUCalleeIdle.class, SPUCalleeCall.class, SPUCallTalk.class};

    public boolean isInOtherCall() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9395504becc960525c0446775956d1b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9395504becc960525c0446775956d1b")).booleanValue();
        }
        return false;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public boolean moveToState(int i, Object obj) {
        return false;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public boolean moveToWaitState(Object obj, boolean z) {
        return false;
    }

    public CallStateMachine(Context context, b bVar, com.meituan.android.customerservice.callbase.base.c cVar, com.meituan.android.customerservice.callbase.protohelper.b bVar2) {
        Object[] objArr = {context, bVar, cVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a56791d5b7861f679d0371aa9a19975", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a56791d5b7861f679d0371aa9a19975");
            return;
        }
        this.UNKNOWN = 0;
        this.MAKECALL = 1;
        this.HALFJION = 2;
        this.mListener = new InnerListener(null);
        this.mCallEnable = true;
        this.mHandler = CallHandleWorker.getInstance();
        this.mWeakNet = false;
        this.mCurAction = 0;
        this.mCseqMap = new HashMap();
        this.mSPULock = new Object();
        this.mMakeCallType = 0;
        this.makeCalltime = 0L;
        this.mContext = context.getApplicationContext();
        this.mProvider = cVar;
        this.mRequstHelper = bVar2;
        this.mCallSession = new c();
        this.mAVEngine = bVar;
        this.mPingManager = new a(this.mRequstHelper, this);
        this.mCallRingPhoneListener = new CopyOnWriteArraySet<>();
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1ea4ca7dab3902122f241eeb48cc878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1ea4ca7dab3902122f241eeb48cc878");
        } else if (this.mCallRingPhoneListener != null) {
            this.mCallRingPhoneListener.clear();
        }
    }

    public void setListener(com.meituan.android.customerservice.cscallsdk.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35099047ae7bdb0df901bdca6ea24394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35099047ae7bdb0df901bdca6ea24394");
        } else {
            this.mListener.changeListener(bVar);
        }
    }

    public void setEnable(boolean z) {
        this.mCallEnable = z;
    }

    public boolean isEnable() {
        return this.mCallEnable;
    }

    public void makeCall(MeetingStatusItems[] meetingStatusItemsArr, long j, String str, HashMap<String, String> hashMap, final com.meituan.android.customerservice.callbase.base.b bVar, String str2, short s) {
        Object[] objArr = {meetingStatusItemsArr, new Long(j), str, hashMap, bVar, str2, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2bb822811157e2f2a89ddb246c66a01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2bb822811157e2f2a89ddb246c66a01");
            return;
        }
        log("makeCall", "Gid = " + j + "encrypt= " + ((int) s) + ", members " + toString(meetingStatusItemsArr));
        if (meetingStatusItemsArr == null || meetingStatusItemsArr.length <= 0) {
            CallLog.error(TAG, "MakeCall fail for members is null or empty");
            if (bVar != null) {
                bVar.a(10005);
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("gid", Long.valueOf(j));
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(10005, 0, hashMap2, "cs_voip_invite_success", "cs_voip_callertalking_success");
            return;
        }
        this.makeCalltime = System.currentTimeMillis();
        SharedPreferenceUtils.putInt(getContext(), "vcType", 1);
        final a.i iVar = new a.i();
        iVar.b = meetingStatusItemsArr;
        iVar.c = getCallProvider().e();
        iVar.d = j;
        iVar.h = str;
        iVar.e = (byte) 0;
        iVar.f = (byte) 1;
        iVar.m = hashMap;
        iVar.j = str2;
        iVar.k = s;
        iVar.l = System.currentTimeMillis();
        runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "45f1e3a72752229df0f39fd602ae1555", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "45f1e3a72752229df0f39fd602ae1555");
                } else if (CallStateMachine.this.mCurSpu != null) {
                    if (CallStateMachine.this.mCurSpu.process(iVar)) {
                        if (bVar != null) {
                            bVar.a(null, 0);
                            return;
                        }
                        return;
                    }
                    HashMap<String, Object> hashMap3 = new HashMap<>();
                    hashMap3.put("gid", Long.valueOf(iVar.d));
                    com.meituan.android.customerservice.callbase.csmonitor.a.a().a(10001, (int) (System.currentTimeMillis() - CallStateMachine.this.makeCalltime), hashMap3, "cs_voip_invite_success", "cs_voip_callertalking_success");
                    if (bVar != null) {
                        bVar.a(10001);
                    }
                } else {
                    CallStateMachine.this.mCurStateChain = CallStateMachine.sCallerStateChain;
                    CallStateMachine.this.mCurSpuIndex = 0;
                    CallStateMachine.this.mCurSpu = new SPUCallerIdle(CallStateMachine.this);
                    CallStateMachine.this.mCurSpu.processInit(iVar);
                    if (bVar != null) {
                        bVar.a(null, 0);
                    }
                }
            }
        });
    }

    public void addMembers(MeetingStatusItems[] meetingStatusItemsArr, long j, String str, String str2, HashMap<String, String> hashMap, final com.meituan.android.customerservice.callbase.base.b bVar) {
        Object[] objArr = {meetingStatusItemsArr, new Long(j), str, str2, hashMap, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "657ea99b5b1e663ff92572e1e6df9476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "657ea99b5b1e663ff92572e1e6df9476");
            return;
        }
        log("addMembers", "Gid = " + j + ", sid " + str + ", members " + toString(meetingStatusItemsArr));
        if (meetingStatusItemsArr == null || meetingStatusItemsArr.length <= 0) {
            CallLog.error(TAG, "MakeCall fail for members is null or empty");
            if (bVar != null) {
                bVar.a(10005);
                return;
            }
            return;
        }
        final a.d dVar = new a.d();
        dVar.b = meetingStatusItemsArr;
        dVar.c = j;
        dVar.e = str;
        dVar.d = str2;
        dVar.f = hashMap;
        runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7e1c844215c86530f77da9a9839b42b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7e1c844215c86530f77da9a9839b42b9");
                } else if (CallStateMachine.this.mCurSpu != null) {
                    if (CallStateMachine.this.mCurSpu.process(dVar)) {
                        if (bVar != null) {
                            bVar.a(null, 0);
                        }
                    } else if (bVar != null) {
                        bVar.a(10001);
                    }
                } else {
                    CallStateMachine.this.mCurStateChain = CallStateMachine.sCallerStateChain;
                    CallStateMachine.this.mCurSpuIndex = 0;
                    CallStateMachine.this.mCurSpu = new SPUCallerIdle(CallStateMachine.this);
                    CallStateMachine.this.mCurSpu.processInit(dVar);
                    if (bVar != null) {
                        bVar.a(null, 0);
                    }
                }
            }
        });
    }

    public int joinMeeting(f fVar, long j, String str, String str2, String str3, HashMap<String, String> hashMap, final com.meituan.android.customerservice.callbase.base.b bVar, String str4) {
        Object[] objArr = {fVar, new Long(j), str, str2, str3, hashMap, bVar, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b94f037f0cfa32092fc9d189e224806", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b94f037f0cfa32092fc9d189e224806")).intValue();
        }
        log("joinMeeting", "sid= " + str + ", vCid " + str3);
        this.mHalfJoinCallback = bVar;
        this.mMakeCallType = 2;
        final a.f fVar2 = new a.f();
        fVar2.g = fVar.c;
        fVar2.h = fVar.b;
        fVar2.i = fVar.f;
        fVar2.d = str2;
        fVar2.c = str3;
        fVar2.e = (byte) 0;
        fVar2.b = str;
        fVar2.f = j;
        fVar2.j = str4;
        fVar2.k = hashMap;
        runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e94ad2d6f5749d8449d58c4568b1a80e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e94ad2d6f5749d8449d58c4568b1a80e");
                } else if (CallStateMachine.this.mCurSpu == null) {
                    CallStateMachine.this.mCurStateChain = CallStateMachine.sCallerStateChain;
                    CallStateMachine.this.mCurSpuIndex = 0;
                    CallStateMachine.this.mCurSpu = new SPUCallerIdle(CallStateMachine.this);
                    CallStateMachine.this.mCurSpu.processInit(fVar2);
                } else if (bVar != null) {
                    bVar.a(10001);
                }
            }
        });
        return 0;
    }

    public void sendDTMFWithKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa74ed3d1c305b687926f6a12cf594ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa74ed3d1c305b687926f6a12cf594ed");
            return;
        }
        log("sendDTMFWithKey", "key=" + str);
        if (this.mCurSpu != null) {
            final a.c cVar = new a.c();
            cVar.d = str;
            cVar.b = getCallSession().b;
            cVar.c = getCallSession().c;
            runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "57b68353f0c5b4aad903ba144e2c43bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "57b68353f0c5b4aad903ba144e2c43bd");
                    } else if (CallStateMachine.this.mCurSpu != null) {
                        CallStateMachine.this.mCurSpu.process(cVar);
                    }
                }
            });
        }
    }

    public int answerCall(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56061817855fc55c1fd46fcf397bd271", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56061817855fc55c1fd46fcf397bd271")).intValue();
        }
        log("answerCall", "accept=" + z);
        if (this.mCurSpu != null) {
            final a.o oVar = new a.o();
            oVar.b = z ? (byte) 1 : (byte) 3;
            runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6a578eb2f1cd572b90c4429cb9290b4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6a578eb2f1cd572b90c4429cb9290b4c");
                    } else if (CallStateMachine.this.mCurSpu != null) {
                        CallStateMachine.this.mCurSpu.process(oVar);
                    } else {
                        CallLog.error(getClass(), "answerCall: StateProcessUnit is null");
                    }
                }
            });
            return 0;
        }
        return 7;
    }

    public void notifyBusy(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "074311067b4bd36686d2b2bbd87844dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "074311067b4bd36686d2b2bbd87844dc");
            return;
        }
        log("notifyBusy", "sid " + str);
        getCallRequstHelper().b((short) 1, "Member busy", str, str2);
        runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "42ef00571fb26baf39cbadac7600f28f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "42ef00571fb26baf39cbadac7600f28f");
                } else {
                    CallStateMachine.this.toEnd((short) 1, "Member Busy", false);
                }
            }
        });
    }

    public int endCall() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20129d32b5a2163db9aba62a41cfb896", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20129d32b5a2163db9aba62a41cfb896")).intValue();
        }
        log("endCall");
        b.d dVar = new b.d();
        dVar.a = this.mCallSession.b;
        dVar.c = this.mCallSession.i;
        dVar.b = this.mCallSession.c;
        dVar.f = 12005;
        getListener().onCallEnd(dVar);
        if (this.mCallSession.i() && this.mCurStateChain == null) {
            return 7;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(Message.SID, getCallSession().b);
        hashMap.put("legid", getCallSession().c);
        hashMap.put("gid", Long.valueOf(this.mCallSession.i));
        if (this.mMakeCallType == 0 && this.mCallSession.h == 1) {
            CallLog.log(TAG, "End call with Inviter Cancel.");
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(8, (int) (System.currentTimeMillis() - this.makeCalltime), hashMap, "cs_voip_invite_success");
        }
        runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d862ff20e81e7bc157cc9339f4a3056f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d862ff20e81e7bc157cc9339f4a3056f");
                    return;
                }
                boolean z = true;
                if (CallStateMachine.this.getCallSession().d() != 1 && CallStateMachine.this.getCallSession().d() != 0) {
                    z = false;
                }
                CallStateMachine.this.toEnd(z ? (short) 8 : (short) 0, z ? "Inviter cancel" : "Hangup", false);
            }
        });
        return 0;
    }

    public void handleError(final int i, final String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26d3b80dae0e25ae5c293a0bb05c429e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26d3b80dae0e25ae5c293a0bb05c429e");
        } else if (this.mCurSpu != null) {
            runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a43ed835af13b7850838f0a3d6ec73db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a43ed835af13b7850838f0a3d6ec73db");
                    } else if (CallStateMachine.this.mCurSpu != null) {
                        CallStateMachine.this.mCurSpu.triggerError(CallStateMachine.this.getCallSession().b, CallStateMachine.this.getCallSession().i, i, str, CallStateMachine.this.getCallSession().c);
                    }
                }
            });
        }
    }

    public void onLoginSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb0bb18d02968d3ac682f323801d54b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb0bb18d02968d3ac682f323801d54b");
        } else {
            runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.CallStateMachine.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b48096b39a8e8ddd87930d2af13d36fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b48096b39a8e8ddd87930d2af13d36fe");
                    } else if (CallStateMachine.this.mCurSpu != null) {
                        CallStateMachine.this.mCurSpu.processReconnected();
                    }
                }
            });
        }
    }

    private void log(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51281b43dae44c5b99a32884ca9e94b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51281b43dae44c5b99a32884ca9e94b7");
        } else {
            log(str, null);
        }
    }

    private void log(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83dd38c1dafeef5f38fd3794ff751e48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83dd38c1dafeef5f38fd3794ff751e48");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append(CommonConstant.Symbol.DOT);
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append("  ");
            sb.append(str2);
        }
        String str3 = this.mCallSession.b;
        String str4 = this.mCallSession.c;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        sb.append(" [state=");
        sb.append(this.mCallSession.d());
        sb.append(", action=");
        sb.append(this.mCurAction);
        sb.append(", sid=");
        sb.append(str3);
        sb.append(", legid= ");
        sb.append(str4);
        sb.append(", gid= ");
        sb.append(this.mCallSession.i);
        sb.append(this.mCallEnable);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        CallLog.log(getClass(), sb.toString());
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public boolean checkAction(int i, int... iArr) {
        Object[] objArr = {Integer.valueOf(i), iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfb50029af1b47b9dc8b5bcff5f8f871", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfb50029af1b47b9dc8b5bcff5f8f871")).booleanValue();
        }
        if (this.mCurAction == i) {
            return true;
        }
        if (iArr != null && iArr.length > 0) {
            for (int i2 : iArr) {
                if (this.mCurAction == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public void setCurAction(int i) {
        this.mCurAction = i;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public int getCurAction() {
        return this.mCurAction;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public Context getContext() {
        return this.mContext;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public com.meituan.android.customerservice.callbase.protohelper.b getCallRequstHelper() {
        return this.mRequstHelper;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public com.meituan.android.customerservice.callbase.avengine.b getAVEngine() {
        return this.mAVEngine;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public com.meituan.android.customerservice.callbase.base.c getCallProvider() {
        return this.mProvider;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public b.C0244b getListener() {
        return this.mListener;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public c getCallSession() {
        return this.mCallSession;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public boolean toNextState(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32461b854c63f154d73ba3cec01f064", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32461b854c63f154d73ba3cec01f064")).booleanValue();
        }
        if (this.mCurSpu == null) {
            return false;
        }
        Class<? extends StateProcessUnit>[] clsArr = this.mCurStateChain;
        this.mCurSpuIndex++;
        if (clsArr == null || this.mCurSpuIndex >= clsArr.length) {
            CallLog.error(getClass(), "State Chain error");
            endCall();
        } else {
            this.mCurSpu.performDestroy();
            try {
                Constructor<? extends StateProcessUnit> declaredConstructor = clsArr[this.mCurSpuIndex].getDeclaredConstructor(StateContext.class);
                declaredConstructor.setAccessible(true);
                this.mCurSpu = declaredConstructor.newInstance(this);
                return this.mCurSpu.processInit(obj);
            } catch (Exception e) {
                CallLog.error(getClass(), "Load SPU fail:" + e.toString());
                endCall();
            }
        }
        return true;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public void toEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2efdddee901891ef4bc804e9cec36069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2efdddee901891ef4bc804e9cec36069");
        } else {
            toEnd((short) 0, "Leave call", false);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.state.StateContext
    public void toEnd(short s, String str, boolean z) {
        Object[] objArr = {Short.valueOf(s), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de80787abf8b7ce7a91848963bb0041b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de80787abf8b7ce7a91848963bb0041b");
            return;
        }
        a.n nVar = new a.n();
        nVar.b = s;
        nVar.c = str;
        nVar.d = Boolean.valueOf(z);
        finishStateMachine(nVar);
    }

    private void finishStateMachine(a.n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "619a7d27ad4493d43336535108452d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "619a7d27ad4493d43336535108452d08");
            return;
        }
        synchronized (this.mSPULock) {
            log("toEnd with code " + ((int) nVar.b) + ", reason " + nVar.c + " make " + this.mMakeCallType);
            this.mPingManager.a();
            this.mCurSpuIndex = 0;
            this.mCurStateChain = sCalleeStateChain;
            if (this.mCurStateChain != null) {
                this.mCurStateChain = null;
            }
            if (this.mCurSpu != null) {
                this.mCurSpu.process(nVar);
                this.mCurSpu.performDestroy();
                this.mCurSpu = null;
            }
            this.mWeakNet = false;
            this.mCallSession.a(0);
            this.mCallSession.j();
            this.mMakeCallType = 0;
        }
    }

    @Override // com.meituan.android.customerservice.callbase.base.e.a
    public void onWeakNet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a8a9848ecc5da80077a0f8b46702014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a8a9848ecc5da80077a0f8b46702014");
        } else if (this.mCurSpu != null) {
            b.g gVar = new b.g();
            com.meituan.android.customerservice.callbase.base.d dVar = new com.meituan.android.customerservice.callbase.base.d();
            dVar.d = 12;
            dVar.b = getCallProvider().b();
            dVar.c = getCallProvider().e();
            gVar.h = new com.meituan.android.customerservice.callbase.base.d[]{dVar};
            gVar.g = getCallSession().b;
            getListener().onNetQualityChange(gVar);
            this.mWeakNet = true;
        }
    }

    @Override // com.meituan.android.customerservice.callbase.base.e.a
    public void onPingTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f086bb4822c64c001ca01d26992b1332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f086bb4822c64c001ca01d26992b1332");
        } else {
            log("onPingTimeout");
        }
    }

    private void runOnWorkerThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7b1307b34d01c962fe7b0718387d7a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7b1307b34d01c962fe7b0718387d7a4");
        } else {
            this.mHandler.runOnWorkerThread(runnable);
        }
    }

    public synchronized boolean needToDiscard(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13e6070d19ed614074947ba87e5c985e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13e6070d19ed614074947ba87e5c985e")).booleanValue();
        }
        if (this.mCseqMap.containsKey(str)) {
            long longValue = this.mCseqMap.get(str).longValue();
            this.mCseqMap.put(str, Long.valueOf(j));
            if (j < longValue) {
                CallLog.error(getClass(), "discard the receive proto by cseq wrong");
                return true;
            }
        } else {
            this.mCseqMap.put(str, Long.valueOf(j));
        }
        return false;
    }

    public void onCallInvite(MeetingStatusItems[] meetingStatusItemsArr, long j, String str, String str2, String str3, HashMap<String, String> hashMap, Byte b, Byte b2, String str4, long j2, String str5) {
        Object[] objArr = {meetingStatusItemsArr, new Long(j), str, str2, str3, hashMap, b, b2, str4, new Long(j2), str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73c0c8a6a1d47fd8e14e4a1a4c14cd6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73c0c8a6a1d47fd8e14e4a1a4c14cd6d");
            return;
        }
        log("onCallInvite", "all members " + toString(meetingStatusItemsArr) + ", sid=" + str + ", udata callstle " + hashMap.get("callStyle"));
        String str6 = hashMap.get("callStyle");
        if (TextUtils.isEmpty(str6) || TextUtils.equals(getCallSession().b, str) || meetingStatusItemsArr == null || meetingStatusItemsArr.length <= 0) {
            CallLog.error(getClass(), "callstyle error or repeat sid ");
            return;
        }
        SharedPreferenceUtils.putInt(getContext(), "callStyle", Integer.parseInt(str6));
        SharedPreferenceUtils.putInt(getContext(), "vcType", b2.byteValue());
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(Message.SID, str);
        hashMap2.put("legid", str2);
        com.meituan.android.customerservice.callbase.csmonitor.a.a().a("cs_voip_invite_receive", 1.0f, hashMap2);
        a.m mVar = new a.m();
        HashSet<f> hashSet = new HashSet<>();
        HashSet<f> hashSet2 = new HashSet<>();
        ArrayList<f> arrayList = new ArrayList<>();
        for (int i = 0; i < meetingStatusItemsArr.length; i++) {
            f fVar = new f(meetingStatusItemsArr[i].getMber(), meetingStatusItemsArr[i].getRole(), meetingStatusItemsArr[i].getType(), (byte) 2, meetingStatusItemsArr[i].getAppId());
            if (!TextUtils.equals(meetingStatusItemsArr[i].getMber(), getCallProvider().e()) || meetingStatusItemsArr[i].getAppId() != getCallProvider().b()) {
                hashSet2.add(fVar);
                hashSet.add(fVar);
                if (meetingStatusItemsArr[i].getRole() == 1) {
                    arrayList.add(fVar.a());
                }
            } else {
                fVar.g = (byte) 2;
                hashSet2.add(fVar);
            }
        }
        mVar.b = arrayList;
        mVar.c = hashSet2;
        mVar.e = hashSet;
        mVar.i = j2;
        mVar.f = j;
        mVar.g = str;
        mVar.h = str2;
        mVar.k = b2.byteValue();
        mVar.l = str3;
        mVar.j = b.byteValue();
        mVar.m = str4;
        mVar.o = hashMap;
        mVar.n = str5;
        mVar.d = Integer.parseInt(str6);
        mVar.p = System.currentTimeMillis();
        HashMap<String, Object> hashMap3 = new HashMap<>();
        hashMap2.put(Message.SID, str);
        hashMap2.put("legid", str2);
        if (!isEnable()) {
            getCallRequstHelper().b((short) 2, "Member reject", str, str2);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(2, (int) (System.currentTimeMillis() - mVar.p), hashMap3, "cs_voip_calleetalking_success", "cs_voip_incomingpop_success");
        } else if (CallBaseUtil.isPhoneCalling(this.mContext) || isInOtherCall()) {
            getCallRequstHelper().b((short) 1, "Member busy", str, str2);
            com.meituan.android.customerservice.callbase.csmonitor.a.a().a(1, (int) (System.currentTimeMillis() - mVar.p), hashMap3, "cs_voip_calleetalking_success", "cs_voip_incomingpop_success");
        } else if (this.mCurSpu == null) {
            this.mCurStateChain = sCalleeStateChain;
            this.mCurSpuIndex = 0;
            this.mCurSpu = new SPUCalleeIdle(this);
            this.mCurSpu.processInit(mVar);
        } else {
            this.mCurSpu.process(mVar);
        }
    }

    public void onCallInviteRsp(short s, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {Short.valueOf(s), str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2af38c2408185d171bf2f48e76255435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2af38c2408185d171bf2f48e76255435");
            return;
        }
        log("onCallInviteRsp", "legid=" + str3 + ", sid=" + str2 + ", code=" + ((int) s) + ", reason=" + str);
        if (this.mCurSpu != null) {
            a.j jVar = new a.j();
            jVar.d = str2;
            jVar.e = str3;
            jVar.f = str4;
            jVar.b = s;
            jVar.c = str;
            jVar.h = str5;
            this.mCurSpu.process(jVar);
        }
    }

    public void onCallTrying(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adb86a1211dada9493f00063e01abdb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adb86a1211dada9493f00063e01abdb7");
            return;
        }
        log("onCallTrying", "legid=" + str2 + ", sid=" + str);
        if (this.mCurSpu != null) {
            a.l lVar = new a.l();
            lVar.b = str;
            lVar.c = str2;
            this.mCurSpu.process(lVar);
        }
    }

    public void onCallRing(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38ef85c197fa1659f051042dd6b4d321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38ef85c197fa1659f051042dd6b4d321");
            return;
        }
        log("onCallRing", "legid=" + str2 + ", sid=" + str);
        if (this.mCurSpu != null) {
            a.k kVar = new a.k();
            kVar.b = str;
            kVar.c = str2;
            kVar.d = str3;
            kVar.e = str4;
            this.mCurSpu.process(kVar);
        }
    }

    public void onCallPong(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62ad622af13e6738ed9a2a971e33daeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62ad622af13e6738ed9a2a971e33daeb");
            return;
        }
        if (TextUtils.equals(str2, this.mCallSession.b)) {
            e eVar = this.mPingManager;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "b82ba56444742ba7a42d90a20e64e054", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "b82ba56444742ba7a42d90a20e64e054");
            } else {
                eVar.b.cancel(333);
                eVar.b.cancel(111);
            }
        }
        if (this.mCurSpu == null || !this.mWeakNet) {
            return;
        }
        b.g gVar = new b.g();
        com.meituan.android.customerservice.callbase.base.d dVar = new com.meituan.android.customerservice.callbase.base.d();
        dVar.d = 0;
        dVar.b = getCallProvider().b();
        dVar.c = String.valueOf(j);
        gVar.h = new com.meituan.android.customerservice.callbase.base.d[]{dVar};
        gVar.g = str2;
        getListener().onNetQualityChange(gVar);
    }

    public void onCallBye(String str, String str2, String str3, short s) {
        Object[] objArr = {str, str2, str3, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e8d0c009d64b9a08efe44f3182a0471", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e8d0c009d64b9a08efe44f3182a0471");
            return;
        }
        log("onCallBye", "legid=" + str2 + " sid = " + str + " type " + ((int) s) + " reason " + str3);
        if (this.mCurSpu != null) {
            a.h hVar = new a.h();
            hVar.b = str;
            hVar.c = str2;
            hVar.d = str3;
            hVar.e = s;
            this.mCurSpu.process(hVar);
        }
    }

    public void CSCallProbeRsp(String str, String str2, short s, byte b) {
        Object[] objArr = {str, str2, Short.valueOf(s), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad3f4d53d4e8f2f85c49ce8dff70bcdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad3f4d53d4e8f2f85c49ce8dff70bcdd");
            return;
        }
        log("CSCallProbeRsp", "sid= " + str + ", legid " + str2 + ", resCode=" + ((int) s));
        if (b == 2 && this.mCurSpu != null) {
            a.p pVar = new a.p();
            pVar.c = str;
            pVar.b = s;
            pVar.d = str2;
            pVar.e = b;
            this.mCurSpu.process(pVar);
        }
    }

    public void CSCallACKRsp(String str, String str2, short s, String str3) {
        Object[] objArr = {str, str2, Short.valueOf(s), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37d240f06fcb9176cc17b358cff45d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37d240f06fcb9176cc17b358cff45d52");
            return;
        }
        log("CSCallACKRsp", ", sid=" + str + ", resCode=" + ((int) s) + ", reason" + str3);
        if (this.mCurSpu != null) {
            a.b bVar = new a.b();
            bVar.c = str;
            bVar.b = s;
            bVar.d = str2;
            bVar.e = str3;
            this.mCurSpu.process(bVar);
        }
    }

    public void CSCallNetNotify(String str, MeetingCodeItems[] meetingCodeItemsArr) {
        Object[] objArr = {str, meetingCodeItemsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b62d1f7faa5a72ee75bffe96df025f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b62d1f7faa5a72ee75bffe96df025f3e");
        } else if (this.mCurSpu != null && meetingCodeItemsArr != null) {
            b.g gVar = new b.g();
            int length = meetingCodeItemsArr.length;
            if (length > 0) {
                com.meituan.android.customerservice.callbase.base.d[] dVarArr = new com.meituan.android.customerservice.callbase.base.d[length];
                for (int i = 0; i < length; i++) {
                    com.meituan.android.customerservice.callbase.base.d dVar = new com.meituan.android.customerservice.callbase.base.d();
                    dVar.b = meetingCodeItemsArr[i].getAppId();
                    dVar.c = meetingCodeItemsArr[i].getMber();
                    dVar.d = meetingCodeItemsArr[i].getCode();
                    dVarArr[i] = dVar;
                }
                gVar.h = dVarArr;
            }
            gVar.g = str;
            getListener().onNetQualityChange(gVar);
        }
    }

    public void CallNotify(long j, String str, String str2, String str3, MeetingStatusItems[] meetingStatusItemsArr, MeetingItem[] meetingItemArr, MeetingItem[] meetingItemArr2, MeetingCodeItems[] meetingCodeItemsArr) {
        Object[] objArr = {new Long(j), str, str2, str3, meetingStatusItemsArr, meetingItemArr, meetingItemArr2, meetingCodeItemsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e5393b0d3c663ba76ce9c7ee5a1503e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e5393b0d3c663ba76ce9c7ee5a1503e");
        } else if (TextUtils.equals(str, getCallSession().b)) {
            if (meetingStatusItemsArr == null || meetingStatusItemsArr.length <= 0) {
                getCallSession().a(new HashSet<>());
                return;
            }
            HashSet<f> hashSet = new HashSet<>();
            for (MeetingStatusItems meetingStatusItems : meetingStatusItemsArr) {
                hashSet.add(new f(meetingStatusItems.getMber(), meetingStatusItems.getRole(), meetingStatusItems.getType(), meetingStatusItems.getStatus(), meetingStatusItems.getAppId()));
            }
            getCallSession().a(hashSet);
        }
    }

    public void CallFmerNotify(String str, MeetingFmber[] meetingFmberArr) {
        Object[] objArr = {str, meetingFmberArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "297b813c9b292cc676c0aa01956607dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "297b813c9b292cc676c0aa01956607dc");
        } else if (meetingFmberArr != null && meetingFmberArr.length > 0 && TextUtils.equals(str, getCallSession().b)) {
            HashSet<f> h = getCallSession().h();
            ArrayList<f> arrayList = getCallSession().g;
            ArrayList<b.e> arrayList2 = new ArrayList<>();
            for (int i = 0; i < meetingFmberArr.length; i++) {
                b.e eVar = new b.e();
                eVar.a = meetingFmberArr[i].getMber();
                eVar.b = meetingFmberArr[i].getfMber();
                arrayList2.add(eVar);
                Iterator<f> it = h.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (TextUtils.equals(meetingFmberArr[i].getMber(), next.c)) {
                        next.c = meetingFmberArr[i].getfMber();
                        next.i = true;
                        next.e = (short) 2;
                        next.h = meetingFmberArr[i].getMber();
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator<f> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f next2 = it2.next();
                        if (TextUtils.equals(next2.c, meetingFmberArr[i].getMber())) {
                            next2.c = meetingFmberArr[i].getfMber();
                            next2.h = meetingFmberArr[i].getMber();
                            next2.i = true;
                        }
                    }
                }
            }
            getCallSession().a(h);
            b.c cVar = new b.c();
            cVar.a = str;
            cVar.b = arrayList2;
            getListener().onApp2PhoneChange(cVar);
        }
    }

    public void CSCallJoinRsp(short s, String str, String str2, String str3, MeetingStatusItems[] meetingStatusItemsArr) {
        Object[] objArr = {Short.valueOf(s), str, str2, str3, meetingStatusItemsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be06fff230838d45668ff48da0cca017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be06fff230838d45668ff48da0cca017");
            return;
        }
        log("CSCallJoinRsp", ", sid=" + str2 + ", resCode=" + ((int) s) + ", reason" + str);
        if (this.mCurSpu != null) {
            a.g gVar = new a.g();
            gVar.d = str2;
            gVar.b = s;
            gVar.e = str3;
            gVar.c = str;
            HashSet<f> hashSet = new HashSet<>();
            if (meetingStatusItemsArr != null && meetingStatusItemsArr.length > 0) {
                for (MeetingStatusItems meetingStatusItems : meetingStatusItemsArr) {
                    hashSet.add(new f(meetingStatusItems.getMber(), meetingStatusItems.getRole(), meetingStatusItems.getType(), meetingStatusItems.getStatus(), meetingStatusItems.getAppId()));
                }
            }
            gVar.f = hashSet;
            this.mCurSpu.process(gVar);
        }
    }

    public void CSCallReinviteACK(short s, String str, String str2, String str3) {
        Object[] objArr = {Short.valueOf(s), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5c56822c6ef5e50aaff3a3ef625a05b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5c56822c6ef5e50aaff3a3ef625a05b");
        } else if (this.mCurSpu != null) {
            a.e eVar = new a.e();
            eVar.d = str2;
            eVar.e = str3;
            eVar.c = str;
            eVar.b = s;
            this.mCurSpu.process(eVar);
        }
    }

    public void addCallRingPhoneListener(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98f3c2a7d3a8b1a96de778ee6c1cb8b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98f3c2a7d3a8b1a96de778ee6c1cb8b8");
        } else {
            this.mCallRingPhoneListener.add(aVar);
        }
    }

    public void removeCallRingPhoneListener(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2651ab92ae7bf7939a916452fdabbfaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2651ab92ae7bf7939a916452fdabbfaf");
        } else {
            this.mCallRingPhoneListener.remove(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class InnerListener extends b.C0244b {
        public static ChangeQuickRedirect changeQuickRedirect;

        public InnerListener(com.meituan.android.customerservice.cscallsdk.b bVar) {
            super(bVar);
            Object[] objArr = {CallStateMachine.this, bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5673fcea9ed777248b9cc4644a422ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5673fcea9ed777248b9cc4644a422ff");
            }
        }

        public void changeListener(com.meituan.android.customerservice.cscallsdk.b bVar) {
            this.mListener = bVar;
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b.C0244b, com.meituan.android.customerservice.cscallsdk.b
        public void onMakeCallSuccess(b.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16cda2685f4b8d3210ec518a3d672eea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16cda2685f4b8d3210ec518a3d672eea");
                return;
            }
            CallStateMachine.this.mPingManager.a();
            super.onMakeCallSuccess(aVar);
            CallStateMachine.this.sendPing();
            if (aVar.e) {
                return;
            }
            CallStateMachine.this.mMakeCallType = 1;
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b.C0244b, com.meituan.android.customerservice.cscallsdk.b
        public void onRejoinSuccess(b.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8a68c9c1301a1519426a1951a623b0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8a68c9c1301a1519426a1951a623b0e");
                return;
            }
            CallStateMachine.this.mPingManager.a();
            super.onRejoinSuccess(aVar);
            CallStateMachine.this.sendPing();
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b.C0244b, com.meituan.android.customerservice.cscallsdk.b
        public void onInvited(b.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b58d1004998956b112857641068d5cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b58d1004998956b112857641068d5cb");
                return;
            }
            super.onInvited(fVar);
            CallStateMachine.this.sendPing();
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b.C0244b, com.meituan.android.customerservice.cscallsdk.b
        public void onJoinCallRes(b.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a62b5dfbb91a225efccea0ec249ab5ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a62b5dfbb91a225efccea0ec249ab5ca");
                return;
            }
            super.onJoinCallRes(dVar);
            if (CallStateMachine.this.mHalfJoinCallback == null) {
                return;
            }
            if (dVar.f == 0) {
                CallStateMachine.this.mHalfJoinCallback.a(dVar.g, dVar.f);
            } else {
                CallStateMachine.this.mHalfJoinCallback.a(dVar.f);
            }
        }

        @Override // com.meituan.android.customerservice.cscallsdk.b.C0244b
        public void onRingCall(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42891bda04bf026543f2964812011f12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42891bda04bf026543f2964812011f12");
            } else if (CallStateMachine.this.mCallRingPhoneListener == null || CallStateMachine.this.mCallRingPhoneListener.isEmpty()) {
            } else {
                Iterator it = CallStateMachine.this.mCallRingPhoneListener.iterator();
                while (it.hasNext()) {
                    ((d.a) it.next()).a(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "021055b0af7b013f0ea645c9f3d8f81b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "021055b0af7b013f0ea645c9f3d8f81b");
        } else {
            this.mPingManager.a(this.mCallSession.b, this.mCallSession.c);
        }
    }

    private String toString(MeetingStatusItems[] meetingStatusItemsArr) {
        Object[] objArr = {meetingStatusItemsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d62280b49fcff7af48e3e1ae8c9338e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d62280b49fcff7af48e3e1ae8c9338e");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (meetingStatusItemsArr != null && meetingStatusItemsArr.length > 0) {
            for (MeetingStatusItems meetingStatusItems : meetingStatusItemsArr) {
                sb.append(meetingStatusItems.toString());
                sb.append(CommonConstant.Symbol.COMMA);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }
}
