package com.sankuai.waimai.alita.core.jsexecutor;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.meituan.android.legwork.bean.monitor.LinkNode;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    HashMap<String, Queue<com.sankuai.waimai.alita.core.jsexecutor.task.a>> b;
    private a c;

    public b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecd6cf24805a0283a4ccac58f6330dce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecd6cf24805a0283a4ccac58f6330dce");
            return;
        }
        this.b = new HashMap<>();
        this.c = new a(Looper.getMainLooper());
        a((com.sankuai.waimai.alita.core.jsexecutor.task.a) null, "init_" + j);
    }

    public final synchronized void a(com.sankuai.waimai.alita.core.jsexecutor.task.a aVar) {
        Queue<com.sankuai.waimai.alita.core.jsexecutor.task.a> linkedBlockingQueue;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a842000b00ce705c3a548252adf9b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a842000b00ce705c3a548252adf9b7");
            return;
        }
        if (this.b.containsKey(aVar.a())) {
            linkedBlockingQueue = this.b.get(aVar.a());
            linkedBlockingQueue.add(aVar);
            a(aVar, "enqueue | 复用队列");
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue<>();
            linkedBlockingQueue.add(aVar);
            this.b.put(aVar.a(), linkedBlockingQueue);
            a(aVar, "enqueue | 新建队列");
        }
        linkedBlockingQueue.size();
    }

    public final synchronized com.sankuai.waimai.alita.core.jsexecutor.task.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "196e3c27d0cf8e0c75da41f22f1c3aeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.alita.core.jsexecutor.task.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "196e3c27d0cf8e0c75da41f22f1c3aeb");
        }
        com.sankuai.waimai.alita.core.jsexecutor.task.c cVar = null;
        for (Map.Entry<String, Queue<com.sankuai.waimai.alita.core.jsexecutor.task.a>> entry : this.b.entrySet()) {
            Queue<com.sankuai.waimai.alita.core.jsexecutor.task.a> value = entry.getValue();
            if (value.size() != 0) {
                com.sankuai.waimai.alita.core.jsexecutor.task.a peek = value.peek();
                if (peek.c == com.sankuai.waimai.alita.core.jsexecutor.task.h.STATUS_WAITING) {
                    if (cVar != null && peek.f >= cVar.f) {
                    }
                    cVar = peek;
                }
            }
        }
        if (cVar instanceof com.sankuai.waimai.alita.core.jsexecutor.task.c) {
            com.sankuai.waimai.alita.core.jsexecutor.task.c cVar2 = cVar;
            Object[] objArr2 = {cVar2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "001c8711f8540e6cd7353cd262ed4d76", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "001c8711f8540e6cd7353cd262ed4d76");
            } else if ("DebugRunTask".equals("运行")) {
                com.sankuai.waimai.alita.core.utils.c.a("peek debug run task donot set timeout");
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                Message obtainMessage = this.c.obtainMessage(500);
                obtainMessage.obj = cVar2;
                this.c.sendMessageAtTime(obtainMessage, uptimeMillis + MetricsAnrManager.ANR_THRESHOLD);
            }
        }
        a(cVar, "peekWaiting result");
        return cVar;
    }

    public final synchronized void b(com.sankuai.waimai.alita.core.jsexecutor.task.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7666b7182e6add2c634517d3a466143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7666b7182e6add2c634517d3a466143");
        } else if (this.b.containsKey(aVar.a())) {
            Queue<com.sankuai.waimai.alita.core.jsexecutor.task.a> queue = this.b.get(aVar.a());
            com.sankuai.waimai.alita.core.jsexecutor.task.a peek = queue.peek();
            if (peek != null && peek.e == aVar.e) {
                queue.poll();
                a(peek, "dequeue正常");
                if (aVar instanceof com.sankuai.waimai.alita.core.jsexecutor.task.c) {
                    a((com.sankuai.waimai.alita.core.jsexecutor.task.c) aVar);
                }
            }
            if (queue.isEmpty()) {
                a((com.sankuai.waimai.alita.core.jsexecutor.task.a) null, "正常移除Queue");
                this.b.remove(aVar.a());
            }
        }
    }

    public final synchronized void a(String str, Exception exc) {
        Object[] objArr = {str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9294de1e39e4608ddd63e9efa31dd09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9294de1e39e4608ddd63e9efa31dd09");
        } else if (this.b.containsKey(str)) {
            Queue<com.sankuai.waimai.alita.core.jsexecutor.task.a> queue = this.b.get(str);
            com.sankuai.waimai.alita.core.jsexecutor.task.a peek = queue.peek();
            if (peek != null && com.sankuai.waimai.alita.core.jsexecutor.task.h.STATUS_RUNNING.equals(peek.c)) {
                queue.poll();
                a(peek, "dequeue异常");
                if (peek instanceof com.sankuai.waimai.alita.core.jsexecutor.task.c) {
                    a((com.sankuai.waimai.alita.core.jsexecutor.task.c) peek);
                }
                if (queue.isEmpty()) {
                    a(peek, "异常移除Queue");
                    this.b.remove(str);
                }
                peek.a(exc);
            }
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fffe7c571ab57bde33df9a14311f284d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fffe7c571ab57bde33df9a14311f284d");
        } else if (this.b.containsKey(str)) {
            com.sankuai.waimai.alita.core.jsexecutor.task.a peek = this.b.get(str).peek();
            if (peek != null && com.sankuai.waimai.alita.core.jsexecutor.task.h.STATUS_RUNNING.equals(peek.c)) {
                peek.b(str2);
            }
        } else {
            Object[] objArr2 = {(byte) 0, "onJSResult 找不到对应的TaskKey"};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.utils.g.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "284e9ad0d07b229a2fd153e2df27dff6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "284e9ad0d07b229a2fd153e2df27dff6");
            } else if (com.sankuai.waimai.alita.core.utils.g.a()) {
                throw new IllegalArgumentException("onJSResult 找不到对应的TaskKey");
            }
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c187a596b0533a028d3a3d4b2f760cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c187a596b0533a028d3a3d4b2f760cb");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("########################### Queue ###########################\n");
        for (Map.Entry<String, Queue<com.sankuai.waimai.alita.core.jsexecutor.task.a>> entry : this.b.entrySet()) {
            Queue<com.sankuai.waimai.alita.core.jsexecutor.task.a> value = entry.getValue();
            sb.append("KEY | ");
            sb.append(entry.getKey());
            sb.append("\n\t Length | ");
            sb.append(value.size());
            sb.append("\n");
            for (com.sankuai.waimai.alita.core.jsexecutor.task.a aVar : value) {
                sb.append("\t\t ");
                sb.append(aVar.c.h);
                sb.append(" | NO | ");
                sb.append(aVar.e);
                sb.append(" | ");
                sb.append(aVar.f());
                sb.append(" | ");
                sb.append(aVar.a());
                sb.append(" | ");
                sb.append(aVar.b());
                sb.append("\n");
            }
        }
        sb.append("--------------------------------------------------------------\n");
        com.sankuai.waimai.alita.core.utils.c.e(sb.toString());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends Handler {
        public static ChangeQuickRedirect a;

        public a(Looper looper) {
            super(looper);
            Object[] objArr = {b.this, looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e529d11a7c7d027f4b4fe4e6221e1d16", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e529d11a7c7d027f4b4fe4e6221e1d16");
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7d5dc510b5e1426afe16758103da21", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7d5dc510b5e1426afe16758103da21");
            } else if (message.what != 500) {
            } else {
                b bVar = b.this;
                com.sankuai.waimai.alita.core.jsexecutor.task.c cVar = (com.sankuai.waimai.alita.core.jsexecutor.task.c) message.obj;
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "68de8fe281c369e066d417c46d706041", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "68de8fe281c369e066d417c46d706041");
                } else if (com.sankuai.waimai.alita.core.jsexecutor.task.h.STATUS_RUNNING.equals(cVar.c)) {
                    bVar.a(cVar, "任务超时");
                    cVar.a(new Exception("运行 timeout: " + cVar.b()));
                    HashMap hashMap = new HashMap();
                    hashMap.put("bundle_id", cVar.b());
                    hashMap.put("version", cVar.c());
                    com.sankuai.waimai.alita.core.utils.c.a("alita_js_executor", (String) null, LinkNode.NODE_TYPE_TIME_OUT, (HashMap<String, Object>) hashMap);
                }
            }
        }
    }

    private void a(com.sankuai.waimai.alita.core.jsexecutor.task.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b9f072a257dbaad668bb84dac48252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b9f072a257dbaad668bb84dac48252");
        } else {
            this.c.removeMessages(500, cVar);
        }
    }

    void a(com.sankuai.waimai.alita.core.jsexecutor.task.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfdda5762316e8c33d4867e74ce7e161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfdda5762316e8c33d4867e74ce7e161");
        } else if (aVar != null) {
            com.sankuai.waimai.alita.core.utils.c.e(aVar.a() + " | AlitaExecutorTaskQueue | Record: " + aVar.e + " | " + str);
        } else {
            com.sankuai.waimai.alita.core.utils.c.e("| AlitaExecutorTaskQueue | " + str);
        }
    }
}
