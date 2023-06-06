package com.meituan.android.customerservice.cscallsdk.state;

import android.media.AudioManager;
import android.text.TextUtils;
import com.meituan.android.customerservice.callbase.state.a;
import com.meituan.android.customerservice.callbase.utils.CallBaseUtil;
import com.meituan.android.customerservice.callbase.utils.CallHandleWorker;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.callbase.utils.Timer;
import com.meituan.android.customerservice.cscallsdk.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class StateProcessUnit extends StateContextWrapper {
    public static final int ADD = 1;
    public static final int DEL = 2;
    private static final String TAG = "CS_StateProcessUnit";
    public static final int TIMEOUT = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private AtomicBoolean isDestroyed;
    private CallHandleWorker mHandler;
    private Timer mTimer;

    public abstract int getState();

    public boolean isRspSuccessed(int i) {
        return i == 0;
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0808ca2d66b20b43a9e1a74e2bfb8d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0808ca2d66b20b43a9e1a74e2bfb8d82");
        }
    }

    public boolean onDisconnect() {
        return false;
    }

    public abstract boolean onInit(Object obj);

    public boolean onPingTimeout() {
        return false;
    }

    public abstract boolean onProcess(a.C0238a c0238a);

    public boolean onReconnected() {
        return false;
    }

    public void onTimeout(int i) {
    }

    public StateProcessUnit(StateContext stateContext) {
        super(stateContext);
        Object[] objArr = {stateContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da4a355cc540749dac6add85fe120a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da4a355cc540749dac6add85fe120a8");
            return;
        }
        this.mHandler = CallHandleWorker.getInstance();
        this.isDestroyed = new AtomicBoolean(false);
        this.mTimer = new Timer(new Timer.TimeoutCallback() { // from class: com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.customerservice.callbase.utils.Timer.TimeoutCallback
            public void onTimeout(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "49be2b4aaa12b9e34d63f7bc0f85a24d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "49be2b4aaa12b9e34d63f7bc0f85a24d");
                    return;
                }
                CallLog.error(StateProcessUnit.TAG, "onTimeout:" + i);
                StateProcessUnit.this.onTimeout(i);
            }
        });
    }

    public final boolean processInit(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "055c93adcdda2213b8626def616b4d1c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "055c93adcdda2213b8626def616b4d1c")).booleanValue();
        }
        CallLog.debug(TAG, "_init");
        return onInit(obj);
    }

    public final boolean processReconnected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f4a57658d9f8e9f0b290e088bd668a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f4a57658d9f8e9f0b290e088bd668a7")).booleanValue() : onReconnected();
    }

    public final boolean processDisconnect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cbf3f9823fbe9c4864d04f6c8e5062f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cbf3f9823fbe9c4864d04f6c8e5062f")).booleanValue();
        }
        onDisconnect();
        return true;
    }

    public final boolean processPingTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "360ecd482a5bc99948549fd84b96417b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "360ecd482a5bc99948549fd84b96417b")).booleanValue();
        }
        if (onPingTimeout()) {
            return true;
        }
        triggerError(getCallSession().b, getCallSession().i, 10004, "ping timeout", getCallSession().c, (short) 10);
        return true;
    }

    public final boolean process(a.C0238a c0238a) {
        Object[] objArr = {c0238a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a0a7edd5a8c88129f4c5b929f84d553", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a0a7edd5a8c88129f4c5b929f84d553")).booleanValue();
        }
        if (onProcess(c0238a)) {
            return true;
        }
        int i = c0238a.a;
        if (i == 106) {
            a.h hVar = (a.h) c0238a;
            if (TextUtils.equals(getCallSession().b, hVar.b)) {
                b.d dVar = new b.d();
                dVar.f = hVar.e;
                dVar.g = hVar.d;
                dVar.a = hVar.b;
                dVar.b = hVar.c;
                dVar.c = getCallSession().i;
                getListener().onCallEnd(dVar);
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(Message.SID, hVar.b);
                hashMap.put("legid", hVar.c);
                hashMap.put("callRole", Byte.valueOf(getCallSession().h));
                hashMap.put("callStatus", Integer.valueOf(getCallSession().d()));
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(hVar.e, 0, hashMap, "cs_voip_hangup");
                toEnd(hVar.e, hVar.d, true);
            }
            return true;
        } else if (i == 301) {
            a.m mVar = (a.m) c0238a;
            if (!isSameSession(mVar.g)) {
                getCallRequstHelper().b((short) 1, "Member busy", mVar.g, mVar.h);
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put(Message.SID, getCallSession().b);
                hashMap2.put("legid", getCallSession().c);
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(1, 0, hashMap2, "cs_voip_calleetalking_success", "cs_voip_incomingpop_success");
            }
            return true;
        } else if (i != 1004) {
            return false;
        } else {
            a.n nVar = (a.n) c0238a;
            if (!TextUtils.isEmpty(getCallSession().b)) {
                Class<?> cls = getClass();
                CallLog.log(cls, "Send the hang up action to callee = cancelSendBye --" + nVar.d);
                if (!nVar.d.booleanValue()) {
                    getCallRequstHelper().b(nVar.b, nVar.c, getCallSession().b, getCallSession().c);
                    HashMap<String, Object> hashMap3 = new HashMap<>();
                    hashMap3.put(Message.SID, getCallSession().b);
                    hashMap3.put("legid", getCallSession().c);
                    hashMap3.put("callRole", Byte.valueOf(getCallSession().h));
                    hashMap3.put("callStatus", Integer.valueOf(getCallSession().d()));
                    com.meituan.android.customerservice.callbase.csmonitor.a.a().a(nVar.b, 0, hashMap3, "cs_voip_hangup");
                }
                com.meituan.android.customerservice.callbase.avengine.b aVEngine = getAVEngine();
                String str = getCallSession().b;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.customerservice.callbase.avengine.b.a;
                if (PatchProxy.isSupport(objArr2, aVEngine, changeQuickRedirect3, false, "94ad3c803673cfe3fd0255f46e8ebb74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVEngine, changeQuickRedirect3, false, "94ad3c803673cfe3fd0255f46e8ebb74");
                } else if (aVEngine.b == null || aVEngine.p.get() == 0 || aVEngine.p.get() == 3) {
                    CallLog.log("AVEngine", "Duplicate leaveChannel " + str);
                } else {
                    aVEngine.v = false;
                    if (aVEngine.j != null) {
                        aVEngine.j.cancel(2001);
                    }
                    if (aVEngine.b != null) {
                        aVEngine.b.leaveChannel();
                    }
                    AudioManager audioManager = (AudioManager) aVEngine.c.getApplicationContext().getSystemService("audio");
                    if (audioManager.isBluetoothScoOn() || aVEngine.k) {
                        audioManager.setBluetoothScoOn(false);
                        audioManager.stopBluetoothSco();
                        aVEngine.k = false;
                    }
                    audioManager.abandonAudioFocus(null);
                    aVEngine.o = false;
                    CallLog.log("AVEngine", "leaveChannel " + str);
                }
            } else {
                HashMap<String, Object> hashMap4 = new HashMap<>();
                hashMap4.put("legid", getCallSession().c);
                hashMap4.put("callRole", Byte.valueOf(getCallSession().h));
                hashMap4.put("callStatus", Integer.valueOf(getCallSession().k()));
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(nVar.b, 0, hashMap4, "cs_voip_hangup");
            }
            return true;
        }
    }

    public final void performDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83324339a482ed0297cd3febebc59faf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83324339a482ed0297cd3febebc59faf");
        } else if (this.isDestroyed.compareAndSet(false, true)) {
            CallLog.debug(TAG, "_destroy");
            cancelAllTimers();
            onDestroy();
        }
    }

    public void triggerError(String str, long j, int i, final String str2, String str3, final short s, final boolean z) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), str2, str3, Short.valueOf(s), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3624ce1e11505b89586aa94b663a6fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3624ce1e11505b89586aa94b663a6fd");
            return;
        }
        Class<?> cls = getClass();
        CallLog.error(cls, "triggerError:" + i + " sid = " + str);
        final b.d dVar = new b.d();
        dVar.a = str;
        dVar.c = j;
        dVar.f = i;
        dVar.g = str2;
        dVar.b = str3;
        this.mHandler.runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d8752fcca90eafaec93fb68599dc25db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d8752fcca90eafaec93fb68599dc25db");
                    return;
                }
                StateProcessUnit.this.getListener().onError(dVar);
                StateProcessUnit.this.toEnd(s, str2, z);
            }
        });
    }

    public void triggerError(String str, long j, int i, String str2, String str3, short s) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), str2, str3, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f0e6f322b82fdea48087f4cbec91b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f0e6f322b82fdea48087f4cbec91b45");
        } else {
            triggerError(str, j, i, str2, str3, s, false);
        }
    }

    public void triggerError(String str, long j, int i, String str2, String str3) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f66ce90c792c81a0ec779ffe4f2f3747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f66ce90c792c81a0ec779ffe4f2f3747");
        } else {
            triggerError(str, j, i, str2, str3, (short) 0);
        }
    }

    public void triggerWarning(String str, long j, int i, String str2, String str3) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1befb11d24108a362ec1389db4eea35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1befb11d24108a362ec1389db4eea35");
            return;
        }
        Class<?> cls = getClass();
        CallLog.log(cls, "triggerWarning:" + i + " sid = " + str);
        final b.d dVar = new b.d();
        dVar.a = str;
        dVar.c = j;
        dVar.f = i;
        dVar.g = str2;
        dVar.b = str3;
        this.mHandler.runOnWorkerThread(new Runnable() { // from class: com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4781fdd4d2873f51a8ec4eda55642458", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4781fdd4d2873f51a8ec4eda55642458");
                } else {
                    StateProcessUnit.this.getListener().onError(dVar);
                }
            }
        });
    }

    public void logCheckActionError(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae66ce52e176cf86155dc0d512cc1b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae66ce52e176cf86155dc0d512cc1b9b");
            return;
        }
        CallLog.error(TAG, str + " fail: expect action is " + i + ", cur action is " + getCurAction());
    }

    public void joinAVEngine(String str, final com.meituan.android.customerservice.callbase.avengine.a aVar, String str2, boolean z) {
        Object[] objArr = {str, aVar, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a98c6b1591c9cf8b49004563f17e551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a98c6b1591c9cf8b49004563f17e551");
            return;
        }
        Class<?> cls = getClass();
        CallLog.log(cls, "joinAVEngine self uid= " + getCallProvider().e() + "  long2int uid= " + CallBaseUtil.long2int(Long.valueOf(getCallProvider().e()).longValue()));
        final long currentTimeMillis = System.currentTimeMillis();
        final HashMap hashMap = new HashMap();
        hashMap.put("vcid", str);
        hashMap.put(Message.SID, getCallSession().b);
        hashMap.put("legid", getCallSession().c);
        getCallSession().d = str;
        com.meituan.android.customerservice.callbase.avengine.b aVEngine = getAVEngine();
        int long2int = CallBaseUtil.long2int(Long.valueOf(getCallProvider().e()).longValue());
        com.meituan.android.customerservice.callbase.avengine.a aVar2 = new com.meituan.android.customerservice.callbase.avengine.a() { // from class: com.meituan.android.customerservice.cscallsdk.state.StateProcessUnit.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onSuccess(Object obj, int i) {
                Object[] objArr2 = {obj, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "42d5f04663def5f5302d3211aa8c0518", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "42d5f04663def5f5302d3211aa8c0518");
                    return;
                }
                if (aVar != null) {
                    aVar.onSuccess(obj, i);
                }
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, (int) (System.currentTimeMillis() - currentTimeMillis), hashMap, "cs_voip_joinmedia_success");
            }

            @Override // com.meituan.android.customerservice.callbase.avengine.a
            public void onError(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "41164fc53b703ba05af107c57d22c803", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "41164fc53b703ba05af107c57d22c803");
                    return;
                }
                if (aVar != null) {
                    aVar.onError(i);
                }
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(i, (int) (System.currentTimeMillis() - currentTimeMillis), hashMap, "cs_voip_joinmedia_success");
            }
        };
        Object[] objArr2 = {str, Integer.valueOf(long2int), aVar2, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.customerservice.callbase.avengine.b.a;
        if (PatchProxy.isSupport(objArr2, aVEngine, changeQuickRedirect3, false, "9e4dd0f89dcc6343d9a90a3b9882a734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVEngine, changeQuickRedirect3, false, "9e4dd0f89dcc6343d9a90a3b9882a734");
            return;
        }
        CallLog.log("AVEngine", "joinChannel " + str + StringUtil.SPACE + long2int);
        aVEngine.a();
        aVEngine.v = true;
        if (!TextUtils.isEmpty(str2)) {
            int encryptionSecret = aVEngine.b.setEncryptionSecret(str2);
            aVEngine.b.setEncryptionMode("aes-128-xts");
            CallLog.log("AVEngine", "Set encryp with return code " + encryptionSecret);
        }
        aVEngine.b.setAudioProfile(0, 1);
        aVEngine.b.setDefaultAudioRoutetoSpeakerphone(false);
        aVEngine.b.joinChannel(null, str, "OpenVCall", long2int);
        aVEngine.b.muteLocalAudioStream(true);
        aVEngine.b.muteAllRemoteAudioStreams(z);
        aVEngine.h = aVar2;
        aVEngine.j.schedule(2001, a.a(2001));
    }

    public void setCurActionAndStartTimer(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "278cba48a390cb0a10739723289d575d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "278cba48a390cb0a10739723289d575d");
            return;
        }
        setCurAction(i);
        startTimer(i);
    }

    public boolean isSameSession(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3509fcadb06f8f28c5572ffcd2dea97f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3509fcadb06f8f28c5572ffcd2dea97f")).booleanValue() : TextUtils.equals(str, getCallSession().b);
    }

    public Timer getTimer() {
        return this.mTimer;
    }

    public void startTimer(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dcd9d5481984daec536899de1a4c60e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dcd9d5481984daec536899de1a4c60e");
        } else {
            getTimer().schedule(i, a.a(i));
        }
    }

    public void cancelTimer(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d71ed716cd355a70a2f42dff4d4f2b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d71ed716cd355a70a2f42dff4d4f2b6");
        } else {
            getTimer().cancel(i);
        }
    }

    public void cancelAllTimers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86c439e21232ad933959f9d4b44644ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86c439e21232ad933959f9d4b44644ee");
        } else {
            getTimer().cancelAll();
        }
    }
}
