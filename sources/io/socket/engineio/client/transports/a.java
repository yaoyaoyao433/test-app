package io.socket.engineio.client.transports;

import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import io.socket.emitter.a;
import io.socket.engineio.client.d;
import io.socket.engineio.parser.c;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class a extends d {
    private static final Logger n = Logger.getLogger(a.class.getName());
    private boolean o;

    protected abstract void a(byte[] bArr, Runnable runnable);

    protected abstract void i();

    public a(d.a aVar) {
        super(aVar);
        this.b = "polling";
    }

    @Override // io.socket.engineio.client.d
    public final void f() {
        k();
    }

    private void k() {
        n.fine("polling");
        this.o = true;
        i();
        a("poll", new Object[0]);
    }

    @Override // io.socket.engineio.client.d
    public final void b(String str) {
        a((Object) str);
    }

    @Override // io.socket.engineio.client.d
    public final void a(byte[] bArr) {
        a((Object) bArr);
    }

    private void a(Object obj) {
        n.fine(String.format("polling got data %s", obj));
        c.a aVar = new c.a() { // from class: io.socket.engineio.client.transports.a.2
            @Override // io.socket.engineio.parser.c.a
            public final boolean a(io.socket.engineio.parser.b bVar, int i, int i2) {
                if (this.k == d.b.OPENING) {
                    this.d();
                }
                if ("close".equals(bVar.a)) {
                    this.e();
                    return false;
                }
                this.a(bVar);
                return true;
            }
        };
        if (obj instanceof String) {
            io.socket.engineio.parser.c.a((String) obj, aVar);
        } else if (obj instanceof byte[]) {
            io.socket.engineio.parser.c.a((byte[]) obj, aVar);
        }
        if (this.k != d.b.CLOSED) {
            this.o = false;
            a("pollComplete", new Object[0]);
            if (this.k == d.b.OPEN) {
                k();
            } else {
                n.fine(String.format("ignoring poll - transport state '%s'", this.k));
            }
        }
    }

    @Override // io.socket.engineio.client.d
    public final void g() {
        a.InterfaceC1525a interfaceC1525a = new a.InterfaceC1525a() { // from class: io.socket.engineio.client.transports.a.3
            @Override // io.socket.emitter.a.InterfaceC1525a
            public final void a(Object... objArr) {
                a.n.fine("writing close packet");
                try {
                    this.b(new io.socket.engineio.parser.b[]{new io.socket.engineio.parser.b("close")});
                } catch (io.socket.utf8.b e) {
                    throw new RuntimeException(e);
                }
            }
        };
        if (this.k == d.b.OPEN) {
            n.fine("transport open - closing");
            interfaceC1525a.a(new Object[0]);
            return;
        }
        n.fine("transport not open - deferring close");
        b(MarketingModel.TYPE_ENTER_DIALOG, interfaceC1525a);
    }

    @Override // io.socket.engineio.client.d
    public final void b(io.socket.engineio.parser.b[] bVarArr) throws io.socket.utf8.b {
        this.a = false;
        final Runnable runnable = new Runnable() { // from class: io.socket.engineio.client.transports.a.4
            @Override // java.lang.Runnable
            public final void run() {
                this.a = true;
                this.a("drain", new Object[0]);
            }
        };
        io.socket.engineio.parser.c.a(bVarArr, new c.b<byte[]>() { // from class: io.socket.engineio.client.transports.a.5
            @Override // io.socket.engineio.parser.c.b
            public final /* bridge */ /* synthetic */ void a(byte[] bArr) {
                this.a(bArr, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String h() {
        String str;
        Map map = this.c;
        if (map == null) {
            map = new HashMap();
        }
        String str2 = this.d ? "https" : "http";
        String str3 = "";
        if (this.e) {
            map.put(this.i, io.socket.yeast.a.a());
        }
        String a = io.socket.parseqs.a.a(map);
        if (this.f > 0 && (("https".equals(str2) && this.f != 443) || ("http".equals(str2) && this.f != 80))) {
            str3 = CommonConstant.Symbol.COLON + this.f;
        }
        if (a.length() > 0) {
            a = CommonConstant.Symbol.QUESTION_MARK + a;
        }
        boolean contains = this.h.contains(CommonConstant.Symbol.COLON);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("://");
        if (contains) {
            str = "[" + this.h + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        } else {
            str = this.h;
        }
        sb.append(str);
        sb.append(str3);
        sb.append(this.g);
        sb.append(a);
        return sb.toString();
    }
}
