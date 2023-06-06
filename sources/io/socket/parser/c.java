package io.socket.parser;

import com.meituan.android.customerservice.callbase.bean.proto.CSCallUris;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONTokener;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class c {
    private static final Logger c = Logger.getLogger(c.class.getName());
    public static int a = 4;
    public static String[] b = {"CONNECT", "DISCONNECT", "EVENT", CSCallUris.SVID_CALL_ACK, "ERROR", "BINARY_EVENT", "BINARY_ACK"};

    private c() {
    }

    /* compiled from: ProGuard */
    /* renamed from: io.socket.parser.c$c  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C1532c {

        /* compiled from: ProGuard */
        /* renamed from: io.socket.parser.c$c$a */
        /* loaded from: classes7.dex */
        public interface a {
            void a(Object[] objArr);
        }

        public static String a(io.socket.parser.b bVar) {
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.a);
            if (5 == bVar.a || 6 == bVar.a) {
                sb.append(bVar.e);
                sb.append(CommonConstant.Symbol.MINUS);
            }
            if (bVar.c == null || bVar.c.length() == 0 || "/".equals(bVar.c)) {
                z = false;
            } else {
                sb.append(bVar.c);
                z = true;
            }
            if (bVar.b >= 0) {
                if (z) {
                    sb.append(CommonConstant.Symbol.COMMA);
                    z = false;
                }
                sb.append(bVar.b);
            }
            if (bVar.d != 0) {
                if (z) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
                sb.append(bVar.d);
            }
            c.c.fine(String.format("encoded %s as %s", bVar, sb));
            return sb.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class b extends io.socket.emitter.a {
        public static String a = "decoded";
        public a b = null;

        /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
        public static io.socket.parser.b b(String str) {
            int i;
            io.socket.parser.b bVar = new io.socket.parser.b();
            int length = str.length();
            bVar.a = Character.getNumericValue(str.charAt(0));
            if (bVar.a < 0 || bVar.a > c.b.length - 1) {
                return c.b();
            }
            if (5 != bVar.a && 6 != bVar.a) {
                i = 0;
            } else if (!str.contains(CommonConstant.Symbol.MINUS) || length <= 1) {
                return c.b();
            } else {
                StringBuilder sb = new StringBuilder();
                i = 0;
                while (true) {
                    i++;
                    if (str.charAt(i) == '-') {
                        break;
                    }
                    sb.append(str.charAt(i));
                }
                bVar.e = Integer.parseInt(sb.toString());
            }
            int i2 = i + 1;
            if (length > i2 && '/' == str.charAt(i2)) {
                StringBuilder sb2 = new StringBuilder();
                do {
                    i++;
                    char charAt = str.charAt(i);
                    if (',' == charAt) {
                        break;
                    }
                    sb2.append(charAt);
                } while (i + 1 != length);
                bVar.c = sb2.toString();
            } else {
                bVar.c = "/";
            }
            int i3 = i + 1;
            if (length > i3 && Character.getNumericValue(Character.valueOf(str.charAt(i3)).charValue()) >= 0) {
                StringBuilder sb3 = new StringBuilder();
                do {
                    i++;
                    char charAt2 = str.charAt(i);
                    if (Character.getNumericValue(charAt2) < 0) {
                        i--;
                        break;
                    }
                    sb3.append(charAt2);
                } while (i + 1 != length);
                try {
                    bVar.b = Integer.parseInt(sb3.toString());
                } catch (NumberFormatException unused) {
                    return c.b();
                }
            }
            int i4 = i + 1;
            if (length > i4) {
                try {
                    str.charAt(i4);
                    bVar.d = new JSONTokener(str.substring(i4)).nextValue();
                } catch (JSONException e) {
                    c.c.log(Level.WARNING, "An error occured while retrieving data from JSONTokener", (Throwable) e);
                    return c.b();
                }
            }
            c.c.fine(String.format("decoded %s as %s", str, bVar));
            return bVar;
        }

        public final void a() {
            if (this.b != null) {
                this.b.a();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class a {
        public io.socket.parser.b a;
        public List<byte[]> b = new ArrayList();

        public a(io.socket.parser.b bVar) {
            this.a = bVar;
        }

        public final void a() {
            this.a = null;
            this.b = new ArrayList();
        }
    }

    static /* synthetic */ io.socket.parser.b b() {
        return new io.socket.parser.b(4, "parser error");
    }
}
