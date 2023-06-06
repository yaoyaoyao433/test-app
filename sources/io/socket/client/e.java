package io.socket.client;

import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import io.socket.client.c;
import io.socket.client.d;
import io.socket.emitter.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class e extends io.socket.emitter.a {
    String b;
    String c;
    private volatile boolean e;
    private int f;
    private String g;
    private c h;
    private Queue<d.a> j;
    private static final Logger d = Logger.getLogger(e.class.getName());
    protected static Map<String, Integer> a = new HashMap<String, Integer>() { // from class: io.socket.client.e.1
        {
            put("connect", 1);
            put("connect_error", 1);
            put("connect_timeout", 1);
            put("connecting", 1);
            put("disconnect", 1);
            put("error", 1);
            put("reconnect", 1);
            put("reconnect_attempt", 1);
            put("reconnect_failed", 1);
            put("reconnect_error", 1);
            put("reconnecting", 1);
            put("ping", 1);
            put("pong", 1);
        }
    };
    private Map<Integer, a> i = new HashMap();
    private final Queue<List<Object>> k = new LinkedList();
    private final Queue<io.socket.parser.b<JSONArray>> l = new LinkedList();

    static /* synthetic */ int g(e eVar) {
        int i = eVar.f;
        eVar.f = i + 1;
        return i;
    }

    public e(c cVar, String str, c.C1523c c1523c) {
        this.h = cVar;
        this.g = str;
        if (c1523c != null) {
            this.c = c1523c.m;
        }
    }

    @Override // io.socket.emitter.a
    public final io.socket.emitter.a a(final String str, final Object... objArr) {
        io.socket.thread.a.a(new Runnable() { // from class: io.socket.client.e.4
            /* JADX WARN: Type inference failed for: r0v12, types: [T, org.json.JSONArray] */
            @Override // java.lang.Runnable
            public final void run() {
                if (e.a.containsKey(str)) {
                    e.super.a(str, objArr);
                    return;
                }
                ArrayList<Object> arrayList = new ArrayList(objArr.length + 1);
                arrayList.add(str);
                arrayList.addAll(Arrays.asList(objArr));
                JSONArray jSONArray = new JSONArray();
                for (Object obj : arrayList) {
                    jSONArray.put(obj);
                }
                io.socket.parser.b bVar = new io.socket.parser.b(io.socket.hasbinary.a.a(jSONArray) ? 5 : 2, jSONArray);
                if (arrayList.get(arrayList.size() - 1) instanceof a) {
                    e.d.fine(String.format("emitting packet with ack id %d", Integer.valueOf(e.this.f)));
                    e.this.i.put(Integer.valueOf(e.this.f), (a) arrayList.remove(arrayList.size() - 1));
                    bVar.d = e.b(jSONArray, jSONArray.length() - 1);
                    bVar.b = e.g(e.this);
                }
                if (e.this.e) {
                    e.this.a(bVar);
                } else {
                    e.this.l.add(bVar);
                }
            }
        });
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray b(JSONArray jSONArray, int i) {
        Object obj;
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            if (i2 != i) {
                try {
                    obj = jSONArray.get(i2);
                } catch (JSONException unused) {
                    obj = null;
                }
                jSONArray2.put(obj);
            }
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(io.socket.parser.b bVar) {
        bVar.c = this.g;
        this.h.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        d.fine(String.format("close (%s)", str));
        this.e = false;
        this.b = null;
        a("disconnect", str);
    }

    private void b(io.socket.parser.b<JSONArray> bVar) {
        ArrayList arrayList = new ArrayList(Arrays.asList(a(bVar.d)));
        d.fine(String.format("emitting event %s", arrayList));
        if (bVar.b >= 0) {
            d.fine("attaching ack callback to event");
            arrayList.add(a(bVar.b));
        }
        if (this.e) {
            if (arrayList.isEmpty()) {
                return;
            }
            super.a(arrayList.remove(0).toString(), arrayList.toArray());
            return;
        }
        this.k.add(arrayList);
    }

    private a a(final int i) {
        final boolean[] zArr = {false};
        return new a() { // from class: io.socket.client.e.5
            @Override // io.socket.client.a
            public final void a(final Object... objArr) {
                io.socket.thread.a.a(new Runnable() { // from class: io.socket.client.e.5.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zArr[0]) {
                            return;
                        }
                        zArr[0] = true;
                        e.d.fine(String.format("sending ack %s", objArr.length != 0 ? objArr : null));
                        JSONArray jSONArray = new JSONArray();
                        for (Object obj : objArr) {
                            jSONArray.put(obj);
                        }
                        io.socket.parser.b bVar = new io.socket.parser.b(io.socket.hasbinary.a.a(jSONArray) ? 6 : 3, jSONArray);
                        bVar.b = i;
                        this.a(bVar);
                    }
                });
            }
        };
    }

    private void c(io.socket.parser.b<JSONArray> bVar) {
        a remove = this.i.remove(Integer.valueOf(bVar.b));
        if (remove != null) {
            d.fine(String.format("calling ack %s with %s", Integer.valueOf(bVar.b), bVar.d));
            remove.a(a(bVar.d));
            return;
        }
        d.fine(String.format("bad ack %s", Integer.valueOf(bVar.b)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.j != null) {
            for (d.a aVar : this.j) {
                aVar.a();
            }
            this.j = null;
        }
        this.h.a(this);
    }

    public final e a() {
        io.socket.thread.a.a(new Runnable() { // from class: io.socket.client.e.6
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.e) {
                    e.d.fine(String.format("performing disconnect (%s)", e.this.g));
                    e.this.a(new io.socket.parser.b(1));
                }
                e.this.d();
                if (e.this.e) {
                    e.this.b("io client disconnect");
                }
            }
        });
        return this;
    }

    private static Object[] a(JSONArray jSONArray) {
        Object obj;
        int length = jSONArray.length();
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = null;
            try {
                obj = jSONArray.get(i);
            } catch (JSONException e) {
                d.log(Level.WARNING, "An error occured while retrieving data from JSONArray", (Throwable) e);
                obj = null;
            }
            if (!JSONObject.NULL.equals(obj)) {
                obj2 = obj;
            }
            objArr[i] = obj2;
        }
        return objArr;
    }

    static /* synthetic */ void a(e eVar) {
        d.fine("transport is open - connecting");
        if ("/".equals(eVar.g)) {
            return;
        }
        if (eVar.c != null && !eVar.c.isEmpty()) {
            io.socket.parser.b bVar = new io.socket.parser.b(0);
            bVar.f = eVar.c;
            eVar.a(bVar);
            return;
        }
        eVar.a(new io.socket.parser.b(0));
    }

    static /* synthetic */ void a(e eVar, io.socket.parser.b bVar) {
        if (!eVar.g.equals(bVar.c)) {
            return;
        }
        switch (bVar.a) {
            case 0:
                eVar.e = true;
                eVar.a("connect", new Object[0]);
                while (true) {
                    List<Object> poll = eVar.k.poll();
                    if (poll != null) {
                        super.a((String) poll.get(0), poll.toArray());
                    } else {
                        eVar.k.clear();
                        while (true) {
                            io.socket.parser.b<JSONArray> poll2 = eVar.l.poll();
                            if (poll2 != null) {
                                eVar.a(poll2);
                            } else {
                                eVar.l.clear();
                                return;
                            }
                        }
                    }
                }
            case 1:
                d.fine(String.format("server disconnect (%s)", eVar.g));
                eVar.d();
                eVar.b("io server disconnect");
                return;
            case 2:
                eVar.b(bVar);
                return;
            case 3:
                eVar.c(bVar);
                return;
            case 4:
                eVar.a("error", bVar.d);
                return;
            case 5:
                eVar.b(bVar);
                return;
            case 6:
                eVar.c(bVar);
                return;
            default:
                return;
        }
    }

    static /* synthetic */ void c(e eVar) {
        if (eVar.j == null) {
            final c cVar = eVar.h;
            eVar.j = new LinkedList<d.a>() { // from class: io.socket.client.e.2
                {
                    add(d.a(cVar, MarketingModel.TYPE_ENTER_DIALOG, new a.InterfaceC1525a() { // from class: io.socket.client.e.2.1
                        @Override // io.socket.emitter.a.InterfaceC1525a
                        public final void a(Object... objArr) {
                            e.a(e.this);
                        }
                    }));
                    add(d.a(cVar, "packet", new a.InterfaceC1525a() { // from class: io.socket.client.e.2.2
                        @Override // io.socket.emitter.a.InterfaceC1525a
                        public final void a(Object... objArr) {
                            e.a(e.this, (io.socket.parser.b) objArr[0]);
                        }
                    }));
                    add(d.a(cVar, "close", new a.InterfaceC1525a() { // from class: io.socket.client.e.2.3
                        @Override // io.socket.emitter.a.InterfaceC1525a
                        public final void a(Object... objArr) {
                            e.this.b(objArr.length > 0 ? (String) objArr[0] : null);
                        }
                    }));
                }
            };
        }
    }
}
