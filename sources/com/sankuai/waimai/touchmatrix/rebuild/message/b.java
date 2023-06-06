package com.sankuai.waimai.touchmatrix.rebuild.message;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.show.f;
import com.sankuai.waimai.touchmatrix.utils.g;
import com.sankuai.waimai.touchmatrix.views.ITMatrixView;
import io.agora.rtc.internal.RtcEngineEvent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.touchmatrix.rebuild.check.b b;
    public c c;
    private final Handler d;
    private volatile com.sankuai.waimai.touchmatrix.data.a e;

    public final void a(Message message) {
        List<com.sankuai.waimai.touchmatrix.data.a> list;
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c2de55ba558da0fdbc7e838862ee9b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c2de55ba558da0fdbc7e838862ee9b0");
            return;
        }
        int i = message.what;
        if (i == 0) {
            com.sankuai.waimai.touchmatrix.event.a aVar = (com.sankuai.waimai.touchmatrix.event.a) message.obj;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            com.sankuai.waimai.touchmatrix.data.a aVar2 = null;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3754b8c1c2ac8f500e55e448133ee144", RobustBitConfig.DEFAULT_VALUE)) {
                aVar2 = (com.sankuai.waimai.touchmatrix.data.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3754b8c1c2ac8f500e55e448133ee144");
            } else if (aVar == null) {
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixEventManagerNew pull msg, but event is null, return.", new Object[0]);
            } else {
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixEventManagerNew 拉取消息  消息类型  is  %d. (1->页面进入事件; 2->页面退出事件; 4->实时消息事件)", Integer.valueOf(aVar.b));
                com.sankuai.waimai.touchmatrix.rebuild.message.c a2 = com.sankuai.waimai.touchmatrix.rebuild.message.c.a();
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.touchmatrix.rebuild.message.c.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d76da8f9f39e8de925644653b0bcb722", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d76da8f9f39e8de925644653b0bcb722");
                } else {
                    d b = a2.b(aVar.c);
                    if (b != null) {
                        Object[] objArr4 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        list = PatchProxy.isSupport(objArr4, b, changeQuickRedirect4, false, "22422103b8a59ed272e3f0218005ab6a", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr4, b, changeQuickRedirect4, false, "22422103b8a59ed272e3f0218005ab6a") : b.b.a(aVar);
                    } else {
                        list = null;
                    }
                }
                if (list == null || list.isEmpty()) {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixEventManagerNew 拉取消息 当前无满足条件消息", new Object[0]);
                } else {
                    com.sankuai.waimai.touchmatrix.data.a aVar3 = null;
                    for (com.sankuai.waimai.touchmatrix.data.a aVar4 : list) {
                        if (aVar3 == null && this.b.a(aVar4)) {
                            aVar3 = aVar4;
                        } else if (aVar4.d()) {
                            a(aVar4);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("biz", g.a(aVar4));
                            hashMap.put("message_id", aVar4.c);
                            hashMap.put("page_cid", com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(aVar4));
                            hashMap.putAll(aVar4.e());
                            if (com.sankuai.waimai.touchmatrix.views.b.a().b()) {
                                hashMap.put("failure_status", "正在展示其他Native消息");
                                hashMap.put("status_code", 13009);
                                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 正在展示其他Native消息", new Object[0]);
                            } else if (com.sankuai.waimai.touchmatrix.rebuild.message.a.d(aVar4)) {
                                hashMap.put("failure_status", "当前应用正处于后台");
                                hashMap.put("status_code", Integer.valueOf((int) RtcEngineEvent.EvtType.EVT_RTC_STATS));
                                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 当前应用正处于后台", new Object[0]);
                            } else {
                                hashMap.put("failure_status", "不在规定页面");
                                hashMap.put("status_code", Integer.valueOf((int) RtcEngineEvent.EvtType.EVT_USER_OFFLINE));
                                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 不在规定页面", new Object[0]);
                                j.a().a(hashMap);
                            }
                            j.a().a(hashMap);
                        }
                    }
                    if (aVar3 != null) {
                        if (this.e != null) {
                            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixEventManagerNew 拉取消息失败  --> 当前展示消息  id: %s.", this.e.c);
                            if (aVar3.k != null && !g.a(aVar3.k.bizId)) {
                                com.sankuai.waimai.touchmatrix.a.a().b(aVar3.k.bizId);
                            }
                            a(aVar3);
                        } else {
                            com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("TMatrixEventManagerNew  拉取一条消息 id: %s.", aVar3.c);
                            aVar2 = aVar3;
                        }
                    }
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixEventManagerNew 拉取消息, 无消息 return.", new Object[0]);
                }
            }
            if (aVar2 != null) {
                if (this.e == null) {
                    b(aVar2);
                    return;
                }
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("当前有展示的message, id is %s.", this.e.c);
                if (aVar2 != null && aVar2.k != null && !g.a(aVar2.k.bizId)) {
                    com.sankuai.waimai.touchmatrix.a.a().b(aVar2.k.bizId);
                }
                if (aVar2.d()) {
                    a(aVar2);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("biz", g.a(aVar2));
                hashMap2.put("message_id", this.e.c);
                hashMap2.put("failure_status", "正在展示其他触达消息");
                hashMap2.put("page_cid", com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(this.e));
                hashMap2.put("status_code", 13009);
                hashMap2.putAll(this.e.e());
                j.a().a(hashMap2);
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 正在展示其他触达消息", new Object[0]);
            }
        } else if (i == 2 && (message.obj instanceof com.sankuai.waimai.touchmatrix.data.a)) {
            com.sankuai.waimai.touchmatrix.data.a aVar5 = (com.sankuai.waimai.touchmatrix.data.a) message.obj;
            String a3 = g.a(aVar5);
            if (this.e != null) {
                if (aVar5 != null && aVar5.k != null && !g.a(aVar5.k.bizId)) {
                    com.sankuai.waimai.touchmatrix.a.a().b(aVar5.k.bizId);
                }
                if (aVar5.d()) {
                    a(aVar5);
                    return;
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("biz", a3);
                hashMap3.put("message_id", this.e.c);
                hashMap3.put("failure_status", "正在展示其他触达消息");
                hashMap3.put("page_cid", com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(this.e));
                hashMap3.put("status_code", 13009);
                hashMap3.putAll(this.e.e());
                j.a().a(hashMap3);
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 正在展示其他触达消息", new Object[0]);
            } else if (!this.b.a(aVar5)) {
                if (aVar5.d()) {
                    a(aVar5);
                    return;
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("biz", a3);
                hashMap4.put("message_id", aVar5.c);
                hashMap4.put("page_cid", com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(aVar5));
                hashMap4.putAll(aVar5.e());
                if (com.sankuai.waimai.touchmatrix.views.b.a().b()) {
                    hashMap4.put("failure_status", "正在展示其他Native消息");
                    hashMap4.put("status_code", 13009);
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 正在展示其他Native消息", new Object[0]);
                } else if (com.sankuai.waimai.touchmatrix.rebuild.message.a.d(aVar5)) {
                    hashMap4.put("failure_status", "当前应用正处于后台");
                    hashMap4.put("status_code", Integer.valueOf((int) RtcEngineEvent.EvtType.EVT_RTC_STATS));
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 当前应用正处于后台", new Object[0]);
                } else {
                    hashMap4.put("failure_status", "不在规定页面");
                    hashMap4.put("status_code", Integer.valueOf((int) RtcEngineEvent.EvtType.EVT_USER_OFFLINE));
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 不在规定页面", new Object[0]);
                }
                j.a().a(hashMap4);
            } else {
                b(aVar5);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.rebuild.message.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class HandlerC1354b extends Handler {
        public static ChangeQuickRedirect a;

        private HandlerC1354b(Looper looper) {
            super(looper);
            Object[] objArr = {b.this, looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0288f4b15260de9759a0af34ff18ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0288f4b15260de9759a0af34ff18ae");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x01f1 A[Catch: Exception -> 0x0300, TryCatch #0 {Exception -> 0x0300, blocks: (B:6:0x0020, B:8:0x0024, B:10:0x0040, B:11:0x0045, B:13:0x004f, B:15:0x006f, B:16:0x0074, B:18:0x0089, B:20:0x0094, B:22:0x00bf, B:61:0x0252, B:23:0x00ca, B:25:0x00e3, B:29:0x00fb, B:31:0x012d, B:36:0x0151, B:38:0x0161, B:40:0x01af, B:42:0x01b7, B:44:0x01bf, B:46:0x01c7, B:49:0x01d1, B:51:0x01dc, B:53:0x01f1, B:54:0x0209, B:56:0x022f, B:57:0x0233, B:59:0x0237, B:60:0x023f, B:32:0x0138, B:34:0x0142, B:26:0x00e9, B:28:0x00ed, B:19:0x0090, B:62:0x025b, B:64:0x0264, B:65:0x0269, B:67:0x029a, B:72:0x02f4, B:68:0x02b7, B:70:0x02bd, B:71:0x02da, B:73:0x02fc), top: B:77:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x022f A[Catch: Exception -> 0x0300, TryCatch #0 {Exception -> 0x0300, blocks: (B:6:0x0020, B:8:0x0024, B:10:0x0040, B:11:0x0045, B:13:0x004f, B:15:0x006f, B:16:0x0074, B:18:0x0089, B:20:0x0094, B:22:0x00bf, B:61:0x0252, B:23:0x00ca, B:25:0x00e3, B:29:0x00fb, B:31:0x012d, B:36:0x0151, B:38:0x0161, B:40:0x01af, B:42:0x01b7, B:44:0x01bf, B:46:0x01c7, B:49:0x01d1, B:51:0x01dc, B:53:0x01f1, B:54:0x0209, B:56:0x022f, B:57:0x0233, B:59:0x0237, B:60:0x023f, B:32:0x0138, B:34:0x0142, B:26:0x00e9, B:28:0x00ed, B:19:0x0090, B:62:0x025b, B:64:0x0264, B:65:0x0269, B:67:0x029a, B:72:0x02f4, B:68:0x02b7, B:70:0x02bd, B:71:0x02da, B:73:0x02fc), top: B:77:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0233 A[Catch: Exception -> 0x0300, TryCatch #0 {Exception -> 0x0300, blocks: (B:6:0x0020, B:8:0x0024, B:10:0x0040, B:11:0x0045, B:13:0x004f, B:15:0x006f, B:16:0x0074, B:18:0x0089, B:20:0x0094, B:22:0x00bf, B:61:0x0252, B:23:0x00ca, B:25:0x00e3, B:29:0x00fb, B:31:0x012d, B:36:0x0151, B:38:0x0161, B:40:0x01af, B:42:0x01b7, B:44:0x01bf, B:46:0x01c7, B:49:0x01d1, B:51:0x01dc, B:53:0x01f1, B:54:0x0209, B:56:0x022f, B:57:0x0233, B:59:0x0237, B:60:0x023f, B:32:0x0138, B:34:0x0142, B:26:0x00e9, B:28:0x00ed, B:19:0x0090, B:62:0x025b, B:64:0x0264, B:65:0x0269, B:67:0x029a, B:72:0x02f4, B:68:0x02b7, B:70:0x02bd, B:71:0x02da, B:73:0x02fc), top: B:77:0x0020 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r24) {
            /*
                Method dump skipped, instructions count: 774
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.touchmatrix.rebuild.message.b.HandlerC1354b.handleMessage(android.os.Message):void");
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f596304cae65d7bd949f60404ce5453", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f596304cae65d7bd949f60404ce5453") : a.a;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "173eed6e4e1cc0e38424638669b48085", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "173eed6e4e1cc0e38424638669b48085");
            return;
        }
        this.d = new HandlerC1354b(Looper.getMainLooper());
        this.b = new com.sankuai.waimai.touchmatrix.rebuild.check.a();
    }

    private void b(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9218058cfa8328c694b52f4cd092edac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9218058cfa8328c694b52f4cd092edac");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = aVar;
        this.d.sendMessage(obtain);
        this.e = aVar;
        StringBuilder sb = new StringBuilder("TMatrixEventManagerNew 设置 currentDisplayedMessage : ");
        sb.append(aVar != null ? aVar.c : "");
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.a(sb.toString(), new Object[0]);
    }

    public final synchronized void a(com.sankuai.waimai.touchmatrix.event.a aVar) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1ba320344c5c71091dd1f7436810fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1ba320344c5c71091dd1f7436810fa");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8811365cb96f2ad6ca88062e1c9bc9f8", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8811365cb96f2ad6ca88062e1c9bc9f8")).booleanValue();
        } else {
            if (aVar != null) {
                int i = aVar.b;
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.touchmatrix.event.b.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "417f046ac090d6867c0091f2a6b0e20a", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "417f046ac090d6867c0091f2a6b0e20a")).booleanValue();
                } else {
                    z = (com.sankuai.waimai.touchmatrix.utils.d.a(com.meituan.android.singleton.b.a, "event_type_switch", -1L) & ((long) i)) != 0;
                }
                if (z) {
                }
            }
            z2 = false;
        }
        if (!z2) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixEventManagerNew handle event, shouldn't handle, return!", new Object[0]);
            return;
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixEventManagerNew 处理Event ,对应 biz: " + aVar.c, new Object[0]);
        final Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = aVar;
        com.sankuai.waimai.touchmatrix.rebuild.utils.e.a().execute(new Runnable() { // from class: com.sankuai.waimai.touchmatrix.rebuild.message.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "31164428ea8a1f57a3c1dd3410402ffb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "31164428ea8a1f57a3c1dd3410402ffb");
                } else {
                    b.this.a(obtain);
                }
            }
        });
    }

    void a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c5288330ac624cfa043ed4982daa43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c5288330ac624cfa043ed4982daa43");
        } else if (aVar == null) {
        } else {
            if (!aVar.d()) {
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixEventManagerNew  msg(%s)冲突, 重试次数到达上限,丢弃消息!", aVar.c);
                HashMap hashMap = new HashMap();
                hashMap.put("biz", g.a(aVar));
                hashMap.put("message_id", aVar.c);
                hashMap.put("failure_status", "消息重试失败");
                hashMap.put("status_code", 13011);
                hashMap.put("page_cid", com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(aVar));
                hashMap.putAll(aVar.e());
                j.a().a(hashMap);
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("灵犀上报  bid: b_waimai_ln1wcevo_mv , 错误信息： 消息重试失败", new Object[0]);
                if (aVar == null || aVar.k == null || g.a(aVar.k.bizId)) {
                    return;
                }
                com.sankuai.waimai.touchmatrix.a.a().b(aVar.k.bizId);
                return;
            }
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("TMatrixEventManagerNew 消息 msg(%s) 冲突, 重试", aVar.c);
            aVar.c();
            final Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.obj = aVar;
            if (aVar != null && aVar.k != null && !g.a(aVar.k.bizId)) {
                com.sankuai.waimai.touchmatrix.a.a().b(aVar.k.bizId);
            }
            com.sankuai.waimai.touchmatrix.rebuild.utils.e.a().schedule(new Runnable() { // from class: com.sankuai.waimai.touchmatrix.rebuild.message.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6adf2b5672742827d2096776d9622204", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6adf2b5672742827d2096776d9622204");
                    } else {
                        b.this.a(obtain);
                    }
                }
            }, aVar.i, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final b a = new b();
    }

    @Deprecated
    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0a11f85fd92f0c064fa08652d3dfb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0a11f85fd92f0c064fa08652d3dfb4");
        } else {
            com.sankuai.waimai.touchmatrix.rebuild.factory.d.a().a(1, fVar);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be298815e7539fbfb38ff5583583271a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be298815e7539fbfb38ff5583583271a");
            return;
        }
        StringBuilder sb = new StringBuilder("TMatrixEventManagerNew  清除当前展示消息: ");
        sb.append(this.e != null ? this.e.c : "");
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.a(sb.toString(), new Object[0]);
        this.e = null;
        this.c = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public ITMatrixView b;
        public WeakReference<ITMatrixView> c;

        public c(ITMatrixView iTMatrixView) {
            Object[] objArr = {iTMatrixView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b0bb3767bf4d9bb3f24b492324387e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b0bb3767bf4d9bb3f24b492324387e");
            } else if ((iTMatrixView instanceof View) || (iTMatrixView instanceof Activity) || (iTMatrixView instanceof Fragment)) {
                this.c = new WeakReference<>(iTMatrixView);
            } else {
                this.b = iTMatrixView;
            }
        }
    }
}
