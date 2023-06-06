package com.meituan.android.pike.manager;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.pike.PikeClient;
import com.meituan.android.pike.bean.HttpCallBack;
import com.meituan.android.pike.bean.HttpRequestUtils;
import com.meituan.android.pike.bean.MessageId;
import com.meituan.android.pike.bean.PikeLog;
import com.meituan.android.pike.bean.PikeSharedPreference;
import com.meituan.android.pike.bean.PikeUtil;
import com.meituan.android.pike.bean.proto.inner.SendMessageProto;
import com.meituan.android.pike.loadbalance.a;
import com.meituan.android.pike.manager.a;
import com.meituan.android.pike.message.b;
import com.meituan.android.pike.threadpools.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b extends PikeClient {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private c c;
    private com.meituan.android.pike.manager.a d;
    private final int e;
    private final int f;
    private AtomicInteger g;
    private Context h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a {
        public static final b a = new b();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "726c553145c2417e0ddbe3b60262ac5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "726c553145c2417e0ddbe3b60262ac5b");
            return;
        }
        this.e = 0;
        this.f = 1;
        this.g = new AtomicInteger(0);
    }

    public static b c() {
        return a.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.meituan.android.pike.PikeClient
    public final boolean a(String str, PikeClient.a aVar, Context context, com.meituan.android.pike.a aVar2) {
        com.meituan.android.pike.manager.a aVar3;
        ?? r4;
        Object[] objArr = {str, aVar, context, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86197c4f99feb81287b46b86c5c24991", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86197c4f99feb81287b46b86c5c24991")).booleanValue();
        }
        if (this.g.get() == 1 || context == null) {
            return false;
        }
        this.h = context;
        PikeLog.i(getClass(), "pikesdk init");
        if (TextUtils.isEmpty(str)) {
            PikeLog.e(getClass(), "pike businessId can't be null");
            return false;
        }
        Object[] objArr2 = {context, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6e8747ad0819ea0b393d90784f3e618", RobustBitConfig.DEFAULT_VALUE)) {
            aVar3 = (com.meituan.android.pike.manager.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6e8747ad0819ea0b393d90784f3e618");
        } else {
            aVar3 = a.C0344a.a;
            aVar3.f = aVar2;
            aVar3.h = ((Integer) PikeSharedPreference.get(context, PikeSharedPreference.CONFIG_MINTIMEOUT, 1000)).intValue();
            aVar3.i = ((Integer) PikeSharedPreference.get(context, PikeSharedPreference.CONFIG_MAXTIMEOUT, 60000)).intValue();
            aVar3.j = ((Integer) PikeSharedPreference.get(context, PikeSharedPreference.CONFIG_DEFAULT_TIMEOUT, 30000)).intValue();
            aVar3.k = ((Integer) PikeSharedPreference.get(context, PikeSharedPreference.CONFIG_MAXMESSAGERETRY, 3)).intValue();
            aVar3.l = ((Integer) PikeSharedPreference.get(context, PikeSharedPreference.CONFIG_MAXCONNECTRETYR, 3)).intValue();
            aVar3.m = ((Integer) PikeSharedPreference.get(context, PikeSharedPreference.CONFIG_MAXCONNECTINTERVAL, 5000)).intValue();
            aVar3.g = (String) PikeSharedPreference.get(context, "hight_url_" + aVar3.f.toString(), "");
            Class<?> cls = getClass();
            PikeLog.d(cls, "reloadPikeConfig = " + aVar3.c());
        }
        this.d = aVar3;
        this.d.b = str;
        this.d.f = aVar2;
        com.meituan.android.pike.manager.a aVar4 = this.d;
        String str2 = aVar.d;
        Object[] objArr3 = {str2};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pike.manager.a.a;
        if (PatchProxy.isSupport(objArr3, aVar4, changeQuickRedirect3, false, "499c15973bbe783e1656af65ce74a072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar4, changeQuickRedirect3, false, "499c15973bbe783e1656af65ce74a072");
        } else if (!TextUtils.isEmpty(str2)) {
            aVar4.c = str2;
        }
        this.d.d = aVar.c;
        if (aVar.b > 0) {
            this.d.j = aVar.b;
        }
        this.d.e = aVar.j;
        this.c = new c(context, aVar, this.d);
        final com.meituan.android.pike.loadbalance.a aVar5 = a.C0343a.a;
        Object[] objArr4 = {context};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.pike.loadbalance.a.a;
        if (PatchProxy.isSupport(objArr4, aVar5, changeQuickRedirect4, false, "06256f7a5fe290ba10d45f15a5fa6fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar5, changeQuickRedirect4, false, "06256f7a5fe290ba10d45f15a5fa6fcd");
            r4 = 1;
        } else {
            aVar5.b = context;
            aVar5.c = a.C0344a.a;
            com.meituan.android.pike.manager.a aVar6 = a.C0344a.a;
            r4 = 1;
            HttpRequestUtils.get(String.format((aVar6.f == com.meituan.android.pike.a.ENV_PROD || aVar6.f == com.meituan.android.pike.a.ENV_STAGING) ? "https://pike-lb.dianping.com/loadbalance?businessId=%s&networkType=%S&platform=android&sdkVersion=%s" : "http://pike-lb.sankuai.com/loadbalance?businessId=%s&networkType=%s&platform=android&sdkVersion=%s", aVar5.c.b, String.valueOf(PikeUtil.getNetworkState(context)), "1.0.0"), new HttpCallBack() { // from class: com.meituan.android.pike.loadbalance.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.pike.bean.HttpCallBack
                public final void onFailure() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "910aac7b070bce84af74bc49d9c97e0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "910aac7b070bce84af74bc49d9c97e0d");
                    } else {
                        PikeLog.e("LoadBalanceManager:", "Get LoadBalance info fail");
                    }
                }

                @Override // com.meituan.android.pike.bean.HttpCallBack
                public final void onResponse(String str3) {
                    Object[] objArr5 = {str3};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "827eb983396352ab492399c40fb1bcf5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "827eb983396352ab492399c40fb1bcf5");
                        return;
                    }
                    try {
                        JSONArray jSONArray = new JSONArray(str3);
                        aVar5.e.clear();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string = jSONObject.getString("domain");
                            JSONArray jSONArray2 = jSONObject.getJSONArray("ips");
                            ArrayList<String> arrayList = new ArrayList<>();
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                arrayList.add(String.valueOf(jSONArray2.get(i2)));
                            }
                            if (string != null) {
                                aVar5.e.put(string.replaceFirst("ws", "http"), arrayList);
                            }
                        }
                        aVar5.f.clear();
                        a.b.a.a(14, new Runnable() { // from class: com.meituan.android.pike.loadbalance.a.1.1
                            public static ChangeQuickRedirect a;

                            {
                                AnonymousClass1.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "74cb42c0e824c95a464aadc18b699e6c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "74cb42c0e824c95a464aadc18b699e6c");
                                } else {
                                    a.a(aVar5);
                                }
                            }
                        });
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        this.g.set(r4);
        PikeLog.i(getClass(), "pikesdk init complete");
        return r4;
    }

    @Override // com.meituan.android.pike.PikeClient
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30188542ab06cd8341376b6948c86fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30188542ab06cd8341376b6948c86fb3");
        } else if (this.g.get() == 0) {
            PikeLog.e(b, "PikeSDK is not init");
        } else {
            this.c.a();
        }
    }

    @Override // com.meituan.android.pike.PikeClient
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db23b26305bcda7cfa1744b32b2792e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db23b26305bcda7cfa1744b32b2792e");
            return;
        }
        c cVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "2d41a1328ae8eb4f4a4ece605b68ed16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "2d41a1328ae8eb4f4a4ece605b68ed16");
        } else {
            com.meituan.android.pike.inner.a aVar = cVar.e;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pike.inner.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "f02e9f9da7ecf5f0abea5eaad48062a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "f02e9f9da7ecf5f0abea5eaad48062a2");
            } else if (aVar.d()) {
                aVar.c();
                aVar.b.a();
                aVar.c = false;
            }
        }
        c cVar2 = this.c;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "1a7be096e1b05995943c05ec4c88c261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "1a7be096e1b05995943c05ec4c88c261");
        } else {
            cVar2.o = null;
            if (cVar2.l != null) {
                com.meituan.android.pike.message.b bVar = cVar2.l;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.pike.message.b.a;
                if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "80eb9e9d7e1c2f5514245e8cb0569240", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "80eb9e9d7e1c2f5514245e8cb0569240");
                } else {
                    if (bVar.b != null) {
                        com.meituan.android.pike.message.c cVar3 = bVar.b;
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.pike.message.c.a;
                        if (PatchProxy.isSupport(objArr6, cVar3, changeQuickRedirect6, false, "6d1a5406ea1896e6b177b809d92fbebe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, cVar3, changeQuickRedirect6, false, "6d1a5406ea1896e6b177b809d92fbebe");
                        } else {
                            PikeLog.i("RetryController::", "RetryController::release");
                            cVar3.a();
                        }
                    }
                    if (bVar.c != null) {
                        bVar.c.clear();
                    }
                }
            }
            synchronized (cVar2.h) {
                if (!cVar2.c.isEmpty()) {
                    cVar2.c.clear();
                }
            }
            synchronized (cVar2.i) {
                if (!cVar2.d.isEmpty()) {
                    cVar2.d.clear();
                }
            }
            synchronized (cVar2.j) {
                if (!cVar2.k.isEmpty()) {
                    cVar2.k.clear();
                }
            }
            if (cVar2.p != null) {
                cVar2.p.removeMessages(1);
            }
        }
        PikeSharedPreference.clear(this.h);
        this.g.set(0);
    }

    @Override // com.meituan.android.pike.PikeClient
    public final void a(com.meituan.android.pike.message.a aVar, PikeClient.SendMessageCallback sendMessageCallback) {
        boolean z;
        Object[] objArr = {aVar, sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d8cc1bb25304283c976ea5a41a21fa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d8cc1bb25304283c976ea5a41a21fa2");
        } else if (this.g.get() == 0) {
            PikeLog.e(b, "PikeSDK is not init");
        } else {
            if (TextUtils.isEmpty(aVar.c)) {
                aVar.c = "";
                aVar.a(System.currentTimeMillis());
            }
            c cVar = this.c;
            Object[] objArr2 = {aVar, sendMessageCallback};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "211020e200b96d9f2def75375a624c94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "211020e200b96d9f2def75375a624c94");
                return;
            }
            String str = aVar.c;
            Object[] objArr3 = {str, new Long(aVar.d), sendMessageCallback};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "431a32329555603dc2fd6002714413a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "431a32329555603dc2fd6002714413a8");
                return;
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "4ed63d169425cc5c7d9a444151b2945a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "4ed63d169425cc5c7d9a444151b2945a")).booleanValue();
            } else {
                z = cVar.n.get() == 0;
            }
            if (!z) {
                PikeLog.e(cVar.getClass(), "pike sdk send message for not connected");
                return;
            }
            SendMessageProto.SendMessageProtoInner sendMessageProtoInner = new SendMessageProto.SendMessageProtoInner();
            sendMessageProtoInner.setSdkVersion("1.0.0");
            sendMessageProtoInner.setToken(PikeUtil.getToken(cVar.g));
            sendMessageProtoInner.setMessageId(new MessageId().getMessageId(PikeUtil.getToken(cVar.g)));
            sendMessageProtoInner.setMessage(str);
            SendMessageProto sendMessageProto = new SendMessageProto();
            sendMessageProto.setData(sendMessageProtoInner);
            final b.C0345b c0345b = new b.C0345b();
            c0345b.b = cVar.a(1, (int) sendMessageProto);
            c0345b.e = sendMessageProtoInner.getMessageId();
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr5 = {new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect5 = b.C0345b.a;
            if (PatchProxy.isSupport(objArr5, c0345b, changeQuickRedirect5, false, "4d4c39851b1db505e881d6e322ccfb14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, c0345b, changeQuickRedirect5, false, "4d4c39851b1db505e881d6e322ccfb14");
            } else {
                c0345b.d = currentTimeMillis;
            }
            String str2 = c.b;
            PikeLog.i(str2, "pike sdk send messs " + cVar.a(1, (int) sendMessageProto).toString());
            final com.meituan.android.pike.message.b bVar = cVar.l;
            Object[] objArr6 = {c0345b, (byte) 1, sendMessageCallback};
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.pike.message.b.a;
            if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "69b65716b7c556092f4319f88f0a9b95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "69b65716b7c556092f4319f88f0a9b95");
                return;
            }
            a.b.a.a(11, new Runnable() { // from class: com.meituan.android.pike.message.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "efb4ffe02d272ff32fb8c315f011ae23", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "efb4ffe02d272ff32fb8c315f011ae23");
                    } else {
                        bVar.a(c0345b, r3);
                    }
                }
            });
            bVar.a(c0345b, sendMessageCallback);
        }
    }

    @Override // com.meituan.android.pike.PikeClient
    public final void a(PikeClient.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4b74d9a831dc570c49f59c8422049b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4b74d9a831dc570c49f59c8422049b");
        } else if (this.g.get() == 0) {
            PikeLog.e(b, "PikeSDK is not init");
        } else {
            c cVar = this.c;
            Object[] objArr2 = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "c85e1707539ea94a18e1145872f2ba6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "c85e1707539ea94a18e1145872f2ba6f");
                return;
            }
            synchronized (cVar.h) {
                cVar.c.add(dVar);
            }
        }
    }

    @Override // com.meituan.android.pike.PikeClient
    public final void b(PikeClient.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f14196f8a5af70fd1cd3ba776e9cdb76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f14196f8a5af70fd1cd3ba776e9cdb76");
        } else if (this.g.get() == 0) {
            PikeLog.e(b, "PikeSDK is not init");
        } else {
            c cVar = this.c;
            Object[] objArr2 = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4d0e04276688aa3ccba54de12788ac5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4d0e04276688aa3ccba54de12788ac5e");
                return;
            }
            synchronized (cVar.h) {
                if (cVar.c.contains(dVar)) {
                    cVar.c.remove(dVar);
                }
            }
        }
    }

    @Override // com.meituan.android.pike.PikeClient
    public final void a(PikeClient.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c51a0cc32a1aab681a7050ea404ba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c51a0cc32a1aab681a7050ea404ba2");
        } else if (this.g.get() == 0) {
            PikeLog.e(b, "PikeSDK is not init");
        } else {
            c cVar = this.c;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "2dffb0946932c6825ccc111f0e694e38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "2dffb0946932c6825ccc111f0e694e38");
                return;
            }
            synchronized (cVar.i) {
                cVar.d.add(bVar);
            }
        }
    }

    @Override // com.meituan.android.pike.PikeClient
    public final void b(PikeClient.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee7c812d4604839cef2872c76b42b744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee7c812d4604839cef2872c76b42b744");
        } else if (this.g.get() == 0) {
            PikeLog.e(b, "PikeSDK is not init");
        } else {
            c cVar = this.c;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "ae62932610525cff7c3d377f3801cb67", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "ae62932610525cff7c3d377f3801cb67");
                return;
            }
            synchronized (cVar.i) {
                if (cVar.d.contains(bVar)) {
                    cVar.d.remove(bVar);
                }
            }
        }
    }

    @Override // com.meituan.android.pike.PikeClient
    public final long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0d60572dcaea86c7fa11b065c0f45b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0d60572dcaea86c7fa11b065c0f45b")).longValue();
        }
        if (this.g.get() == 0) {
            PikeLog.e(b, "PikeSDK is not init");
            return -1L;
        }
        c cVar = this.c;
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        return PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "728badba3f7ab6486c851f3ee6cd32a0", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "728badba3f7ab6486c851f3ee6cd32a0")).longValue() : cVar.m != null ? cVar.m.a(j) : j;
    }
}
