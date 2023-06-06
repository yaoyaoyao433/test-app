package com.dianping.nvnetwork.tunnel.Encrypt;

import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.dianping.nvnetwork.tunnel.tool.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static String d = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCWMddA1y8VHiRS8mOmepx+/OPZvMI6jTJ2OcPTCACUsIWGAFuuMQAo3Dv+9TZ8KzIVFzJa84vcakohgsD+qGLg70E7CsuE/xdocCZFo8dyQ5geNn4LvgiYV8qerpcyTnN7VVIolIBLh86sB4hWAF90XcNd2klXeGVAA2d4nCW+EQIDAQAB";
    public String b;
    public String c;
    private a e;
    private LinkedList<a> f;

    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public long d;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b7d741790d763d2924364f914e705e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b7d741790d763d2924364f914e705e");
            } else {
                this.d = -1L;
            }
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501eaf424364575707bba06ce12fb4f8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501eaf424364575707bba06ce12fb4f8")).booleanValue() : (SecureTools.isEmpty(this.b) || SecureTools.isEmpty(this.c) || this.d <= 0) ? false : true;
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b942500253790491ff0dbc1138acd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b942500253790491ff0dbc1138acd0");
        } else {
            this.f = new LinkedList<>();
        }
    }

    public static d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bebbc31ccdce660bb4bc3da0a6b87924", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bebbc31ccdce660bb4bc3da0a6b87924") : new d();
    }

    public final synchronized a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7d29f18d67a307624928695578d06f", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7d29f18d67a307624928695578d06f");
        } else if (this.e != null) {
            return this.e;
        } else {
            if (!this.f.isEmpty()) {
                this.e = this.f.get(0);
                for (int i = 1; i < this.f.size(); i++) {
                    a aVar = this.f.get(i);
                    if (aVar.d > this.e.d) {
                        this.e = aVar;
                    }
                }
            }
            return this.e;
        }
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "890c2a926c896be4b14339d0e91e96b4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "890c2a926c896be4b14339d0e91e96b4");
        }
        if (SecureTools.isEmpty(str)) {
            return null;
        }
        try {
            return new String(SecureTools.decryptDataByPrivateKey(SecureTools.decryptBASE64(str), SecureTools.decryptBASE64(this.c)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final synchronized void a(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cb417447b74e47a87106ee9fbbbf81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cb417447b74e47a87106ee9fbbbf81");
            return;
        }
        a aVar = new a();
        aVar.b = str;
        aVar.c = str2;
        aVar.d = j;
        this.f.add(aVar);
        this.e = aVar;
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee5d9cab5c91906d4add3050ee717482", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee5d9cab5c91906d4add3050ee717482")).booleanValue() : f.a(str, str2, d);
    }

    public final synchronized a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88605787386cfdc4536a8dfee5f0b2f", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88605787386cfdc4536a8dfee5f0b2f");
        }
        a aVar = null;
        if (!SecureTools.isEmpty(str)) {
            if (this.e != null && str.equals(this.e.b)) {
                aVar = this.e;
            } else if (!this.f.isEmpty()) {
                Iterator<a> it = this.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (str.equals(next.b)) {
                        aVar = next;
                        break;
                    }
                }
            }
        }
        return aVar;
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013ec10fbe02e99ff5ff0b364cb28859", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013ec10fbe02e99ff5ff0b364cb28859");
            return;
        }
        this.f.clear();
        this.e = null;
    }

    public final synchronized void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5a4b2866e407a0c8062d6233aaa7241", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5a4b2866e407a0c8062d6233aaa7241");
            return;
        }
        if (!SecureTools.isEmpty(str) && this.f != null) {
            LinkedList linkedList = new LinkedList();
            Iterator<a> it = this.f.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (str.equals(next.b)) {
                    linkedList.add(next);
                }
            }
            this.f.removeAll(linkedList);
        }
        if (this.e != null && str.equals(this.e.b)) {
            this.e = null;
        }
    }
}
