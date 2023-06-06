package com.meituan.android.pike.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.pike.PikeClient;
import com.meituan.android.pike.bean.PikeLog;
import com.meituan.android.pike.bean.PikeSharedPreference;
import com.meituan.android.pike.bean.PikeUtil;
import com.meituan.android.pike.bean.proto.PikeProto;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.meituan.android.pike.bean.proto.inner.LoginProto;
import com.meituan.android.pike.bean.proto.inner.LoginProtoACK;
import com.meituan.android.pike.bean.proto.inner.ReceiveMessageProto;
import com.meituan.android.pike.bean.proto.inner.ReceiveMessageProtoACK;
import com.meituan.android.pike.bean.proto.inner.SendMessageProtoACK;
import com.meituan.android.pike.manager.a;
import com.meituan.android.pike.threadpools.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c implements com.meituan.android.pike.inner.c {
    public static ChangeQuickRedirect a = null;
    static final String b = "c";
    HashSet<PikeClient.d> c;
    HashSet<PikeClient.b> d;
    com.meituan.android.pike.inner.a e;
    com.meituan.android.pike.manager.a f;
    Context g;
    final Object h;
    final Object i;
    final Object j;
    final LinkedList<String> k;
    com.meituan.android.pike.message.b l;
    d m;
    AtomicInteger n;
    String o;
    Handler p;
    private a q;
    private AtomicInteger r;

    public c(Context context, PikeClient.a aVar, com.meituan.android.pike.manager.a aVar2) {
        Object[] objArr = {context, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d9c3186264ecdd1d5c9d3d17713e68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d9c3186264ecdd1d5c9d3d17713e68");
            return;
        }
        this.c = new HashSet<>();
        this.d = new HashSet<>();
        this.e = null;
        this.k = new LinkedList<>();
        this.n = new AtomicInteger(-1);
        this.r = new AtomicInteger(0);
        this.p = new Handler(Looper.getMainLooper()) { // from class: com.meituan.android.pike.manager.c.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "142689f17e9dd668a7107e4c1b2f943d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "142689f17e9dd668a7107e4c1b2f943d");
                } else if (message.what == 1) {
                    if (c.this.r.get() >= a.C0344a.a.l) {
                        c.this.a(12);
                        c.this.p.removeMessages(1);
                        return;
                    }
                    c.this.r.set(c.this.r.get() + 1);
                    c.this.b();
                }
            }
        };
        this.o = UUID.randomUUID().toString();
        this.g = context;
        this.h = new Object();
        this.i = new Object();
        this.j = new Object();
        aVar.i = this;
        this.f = aVar2;
        this.e = new com.meituan.android.pike.inner.a(aVar, aVar2.c());
        if (aVar.k) {
            a();
        }
        this.l = new com.meituan.android.pike.message.b(this.e, context);
        this.m = new d(context, this.e);
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44b623d6acebeccd019773f57a62c655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44b623d6acebeccd019773f57a62c655");
        } else if (context != null) {
            try {
                if (this.q != null) {
                    context.unregisterReceiver(this.q);
                } else {
                    this.q = new a();
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter.addAction("android.intent.action.TIME_SET");
                context.registerReceiver(this.q, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c152f8304407b2ef51f0bf417503589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c152f8304407b2ef51f0bf417503589");
            return;
        }
        if (this.n.get() != 0 && this.n.get() != 11) {
            this.e.a();
        }
        if (this.n.get() == 12) {
            PikeLog.i(b, "open the pike with status logining");
            b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.meituan.android.pike.inner.c
    public final void a(String str, Object... objArr) {
        char c;
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "ebb33f56d595e552583231d9d170a3f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "ebb33f56d595e552583231d9d170a3f2");
            return;
        }
        String str2 = b;
        PikeLog.d(str2, "EmitterListenerResut pike key " + str);
        switch (str.hashCode()) {
            case -808593805:
                if (str.equals("connect_error")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -775651656:
                if (str.equals("connecting")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -268192992:
                if (str.equals("reconnect_error")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -48584405:
                if (str.equals("reconnecting")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3440915:
                if (str.equals("pike")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 288609829:
                if (str.equals("reconnect_failed")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 495510284:
                if (str.equals("connect_timeout")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 530405532:
                if (str.equals("disconnect")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 768331237:
                if (str.equals("reconnect_attempt")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 951351530:
                if (str.equals("connect")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 990157655:
                if (str.equals("reconnect")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                final JSONObject jSONObject = (JSONObject) objArr[0];
                String str3 = b;
                PikeLog.i(str3, "Receive pike command " + jSONObject);
                a.b.a.a(12, new Runnable() { // from class: com.meituan.android.pike.manager.c.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "a677a6a36fbf16bf7bff07ffe7ce7934", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "a677a6a36fbf16bf7bff07ffe7ce7934");
                            return;
                        }
                        final c cVar = c.this;
                        JSONObject jSONObject2 = jSONObject;
                        Object[] objArr4 = {jSONObject2};
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect3, false, "e8d14f9b73b7c00a1fd5067079724416", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect3, false, "e8d14f9b73b7c00a1fd5067079724416");
                            return;
                        }
                        Gson gson = new Gson();
                        try {
                            PikeProto pikeProto = (PikeProto) gson.fromJson(jSONObject2.toString(), (Class<Object>) PikeProto.class);
                            int c2 = pikeProto.getC();
                            if (c2 != 2) {
                                if (c2 != 9) {
                                    return;
                                }
                                HashMap hashMap = (HashMap) gson.fromJson(pikeProto.getD(), new TypeToken<HashMap<String, Long>>() { // from class: com.meituan.android.pike.manager.c.3
                                }.getType());
                                if (cVar.m != null) {
                                    d dVar = cVar.m;
                                    long longValue = ((Long) hashMap.get("clientTimestamp")).longValue();
                                    long longValue2 = ((Long) hashMap.get("serverTimestamp")).longValue();
                                    Object[] objArr5 = {new Long(longValue), new Long(longValue2)};
                                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                                    if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect4, false, "955ee3074e400d265d4e21eb4b991265", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect4, false, "955ee3074e400d265d4e21eb4b991265");
                                        return;
                                    }
                                    long currentTimeMillis = (System.currentTimeMillis() - longValue) / 2;
                                    dVar.b = (longValue2 - longValue) - currentTimeMillis;
                                    Class<?> cls = dVar.getClass();
                                    PikeLog.i(cls, "onQrySrvTimestampRes " + dVar.b + " delay = " + currentTimeMillis);
                                    long j = dVar.b;
                                    Object[] objArr6 = {new Long(j)};
                                    ChangeQuickRedirect changeQuickRedirect5 = d.a;
                                    if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect5, false, "a9e8c080f7150de54224cc17101e6cbf", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect5, false, "a9e8c080f7150de54224cc17101e6cbf");
                                        return;
                                    } else {
                                        PikeSharedPreference.put(dVar.c, "LAST_DELTA_TIME", Long.valueOf(j));
                                        return;
                                    }
                                }
                                return;
                            }
                            Object[] objArr7 = {pikeProto};
                            ChangeQuickRedirect changeQuickRedirect6 = c.a;
                            if (PatchProxy.isSupport(objArr7, cVar, changeQuickRedirect6, false, "6a39af3371aee31ef0b047865421d0e3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, cVar, changeQuickRedirect6, false, "6a39af3371aee31ef0b047865421d0e3");
                                return;
                            }
                            try {
                                JSONObject jSONObject3 = new JSONObject(pikeProto.getD());
                                int i = jSONObject3.getInt(ProtoConstant.COMMAND);
                                String string = jSONObject3.getString("data");
                                Gson gson2 = new Gson();
                                if (i == 2) {
                                    try {
                                        LoginProtoACK loginProtoACK = (LoginProtoACK) gson2.fromJson(string, (Class<Object>) LoginProtoACK.class);
                                        if (loginProtoACK.getStatus() != 0) {
                                            PikeLog.e(c.b, "Server unavailable");
                                            return;
                                        }
                                        cVar.m.a();
                                        cVar.p.removeMessages(1);
                                        PikeSharedPreference.put(cVar.g, "token", loginProtoACK.getToken());
                                        cVar.f.h = loginProtoACK.getMinTimeout();
                                        cVar.f.i = loginProtoACK.getMaxTimeout();
                                        cVar.f.j = loginProtoACK.getDefaultTimeout();
                                        cVar.f.k = loginProtoACK.getMaxMessageRetry();
                                        cVar.f.l = loginProtoACK.getMaxConnectRetry();
                                        cVar.f.m = loginProtoACK.getMaxConnectInterval();
                                        Object[] objArr8 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                        if (PatchProxy.isSupport(objArr8, cVar, changeQuickRedirect7, false, "0e8888cac4bacf8cf720ccd31c8b2b78", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, cVar, changeQuickRedirect7, false, "0e8888cac4bacf8cf720ccd31c8b2b78");
                                        } else {
                                            PikeSharedPreference.put(cVar.g, PikeSharedPreference.CONFIG_MINTIMEOUT, Integer.valueOf(cVar.f.h));
                                            PikeSharedPreference.put(cVar.g, PikeSharedPreference.CONFIG_MAXTIMEOUT, Integer.valueOf(cVar.f.i));
                                            PikeSharedPreference.put(cVar.g, PikeSharedPreference.CONFIG_DEFAULT_TIMEOUT, Integer.valueOf(cVar.f.b()));
                                            PikeSharedPreference.put(cVar.g, PikeSharedPreference.CONFIG_MAXMESSAGERETRY, Integer.valueOf(cVar.f.k));
                                            PikeSharedPreference.put(cVar.g, PikeSharedPreference.CONFIG_MAXCONNECTRETYR, Integer.valueOf(cVar.f.l));
                                            PikeSharedPreference.put(cVar.g, PikeSharedPreference.CONFIG_MAXCONNECTINTERVAL, Integer.valueOf(cVar.f.m));
                                        }
                                        if (cVar.n.get() == 11) {
                                            cVar.a(0);
                                            return;
                                        }
                                        return;
                                    } catch (Exception unused) {
                                        PikeLog.e(c.b, "login fail for gson on wrong object");
                                        return;
                                    }
                                }
                                switch (i) {
                                    case 6:
                                        try {
                                            SendMessageProtoACK sendMessageProtoACK = (SendMessageProtoACK) gson2.fromJson(string, (Class<Object>) SendMessageProtoACK.class);
                                            if (sendMessageProtoACK.getStatus() == 0) {
                                                cVar.l.a(0, sendMessageProtoACK.getMessageId());
                                                return;
                                            }
                                            return;
                                        } catch (Exception unused2) {
                                            PikeLog.e(c.b, "login fail for gson on wrong object");
                                            return;
                                        }
                                    case 7:
                                        try {
                                            ReceiveMessageProto receiveMessageProto = (ReceiveMessageProto) gson2.fromJson(string, (Class<Object>) ReceiveMessageProto.class);
                                            if (!TextUtils.equals(receiveMessageProto.getToken(), PikeUtil.getToken(cVar.g))) {
                                                PikeLog.e(c.b, "PikeMessage not for the right client");
                                                return;
                                            } else if (cVar.b(receiveMessageProto.getMessageId())) {
                                                cVar.a(receiveMessageProto, 1);
                                                String str4 = c.b;
                                                PikeLog.d(str4, "Receive the repeat pikeMessage id " + receiveMessageProto.getMessageId());
                                                return;
                                            } else {
                                                com.meituan.android.pike.message.a aVar = new com.meituan.android.pike.message.a();
                                                aVar.c = receiveMessageProto.getMessage();
                                                aVar.b = receiveMessageProto.getMessageId();
                                                aVar.a(System.currentTimeMillis());
                                                cVar.a(aVar);
                                                cVar.a(aVar.b);
                                                cVar.a(receiveMessageProto, 0);
                                                return;
                                            }
                                        } catch (Exception unused3) {
                                            PikeLog.e(c.b, "login fail for gson on wrong object");
                                            return;
                                        }
                                    default:
                                        return;
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            PikeLog.e(c.b, "processData error");
                        }
                    }
                });
                return;
            case 1:
                a(4);
                PikeLog.e(b, "EVENT_CONNECT_ERROR");
                return;
            case 2:
                a(5);
                PikeLog.e(b, "EVENT_CONNECT_TIMEOUT");
                return;
            case 3:
                a(11);
                PikeLog.i(b, "EVENT_CONNECT_SUCCESS");
                this.r.set(0);
                b();
                return;
            case 4:
                a(1);
                PikeLog.i(b, "EVENT_CONNECTING");
                return;
            case 5:
                a(2);
                PikeLog.e(b, "EVENT_DISCONNECT");
                return;
            case 6:
                a(3);
                PikeLog.e(b, "EVENT_ERROR");
                return;
            case 7:
                a(6);
                PikeLog.i(b, "EVENT_RECONNECT");
                return;
            case '\b':
                a(9);
                PikeLog.e(b, "EVENT_RECONNECT_ATTEMPT");
                return;
            case '\t':
                a(7);
                PikeLog.e(b, "EVENT_RECONNECT_ERROR");
                return;
            case '\n':
                a(8);
                PikeLog.e(b, "EVENT_RECONNECT_FAILED");
                return;
            case 11:
                a(10);
                PikeLog.i(b, "EVENT_RECONNECTING");
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c451f776b57326aeb87902600e08db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c451f776b57326aeb87902600e08db");
            return;
        }
        LoginProto.LoginProtoInner loginProtoInner = new LoginProto.LoginProtoInner();
        loginProtoInner.setBusinessId(this.f.b);
        loginProtoInner.setSdkVersion("1.0.0");
        loginProtoInner.setAppName(this.f.c);
        String uuid = UUID.randomUUID().toString();
        loginProtoInner.setRandom(uuid);
        loginProtoInner.setSessionId(this.o);
        loginProtoInner.setSignature(PikeUtil.getSigture(this.f.b, this.f.c, uuid, "5d6db287-84b8-46a7-9bcf-14242de3c139"));
        loginProtoInner.setPlatform(2);
        loginProtoInner.setNetwork(PikeUtil.getNetworkState(this.g));
        loginProtoInner.setExtra(this.f.a());
        LoginProto loginProto = new LoginProto();
        loginProto.setData(loginProtoInner);
        String str = b;
        PikeLog.i(str, "Login json " + a(1, (int) loginProto).toString());
        this.e.a("pike", a(1, (int) loginProto));
        this.p.sendMessageDelayed(this.p.obtainMessage(1), (long) a.C0344a.a.m);
    }

    void a(ReceiveMessageProto receiveMessageProto, int i) {
        Object[] objArr = {receiveMessageProto, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283e975ab7853bafcb753d1749a3cd7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283e975ab7853bafcb753d1749a3cd7b");
            return;
        }
        ReceiveMessageProtoACK.ReceiveMessageProtoACKInner receiveMessageProtoACKInner = new ReceiveMessageProtoACK.ReceiveMessageProtoACKInner();
        receiveMessageProtoACKInner.setMessageId(receiveMessageProto.getMessageId());
        receiveMessageProtoACKInner.setToken(receiveMessageProto.getToken());
        receiveMessageProtoACKInner.setStatus(i);
        receiveMessageProtoACKInner.setTimestamp(this.m.a(System.currentTimeMillis()));
        ReceiveMessageProtoACK receiveMessageProtoACK = new ReceiveMessageProtoACK();
        receiveMessageProtoACK.setData(receiveMessageProtoACKInner);
        this.e.a("pike", a(1, (int) receiveMessageProtoACK));
    }

    public final <T> JSONObject a(int i, T t) {
        Object[] objArr = {1, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25da55027de5b2d5cd9907a9fcb04c12", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25da55027de5b2d5cd9907a9fcb04c12");
        }
        Gson gson = new Gson();
        try {
            JSONObject jSONObject = new JSONObject(gson.toJson(t));
            PikeProto pikeProto = new PikeProto();
            pikeProto.setC(1);
            pikeProto.setD(jSONObject.toString());
            try {
                return new JSONObject(gson.toJson(pikeProto));
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    void a(com.meituan.android.pike.message.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed613ff2569765c01f23aae0e974b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed613ff2569765c01f23aae0e974b96");
            return;
        }
        synchronized (this.h) {
            if (this.c != null && !this.c.isEmpty()) {
                Iterator<PikeClient.d> it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().a(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "481e354208e6778e22f278fd33c4965e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "481e354208e6778e22f278fd33c4965e");
            return;
        }
        this.n.set(i);
        synchronized (this.i) {
            if (this.d != null && !this.d.isEmpty()) {
                Iterator<PikeClient.b> it = this.d.iterator();
                while (it.hasNext()) {
                    it.next().a(i);
                }
            }
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39bdd93de8c53873a74e94d1cf517359", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39bdd93de8c53873a74e94d1cf517359")).booleanValue();
        }
        synchronized (this.j) {
            while (this.k.size() >= 1000) {
                this.k.removeFirst();
            }
            this.k.addLast(str);
        }
        return true;
    }

    public final boolean b(String str) {
        boolean contains;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1896283a37cc64bc2ba8e4ceb10d0b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1896283a37cc64bc2ba8e4ceb10d0b")).booleanValue();
        }
        synchronized (this.j) {
            contains = this.k.contains(str);
        }
        return contains;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f14037380e2ffad73682b643a877790", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f14037380e2ffad73682b643a877790");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98fc1e12675407d71ffb454894b243f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98fc1e12675407d71ffb454894b243f7");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if ((action.equals("android.intent.action.TIMEZONE_CHANGED") || action.equals("android.intent.action.TIME_SET")) && c.this.m != null) {
                c.this.m.a();
            }
        }
    }
}
