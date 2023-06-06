package com.sankuai.meituan.retrofit2;

import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o implements ak {
    public static ChangeQuickRedirect a;
    private final List<String> b;
    private final List<String> c;

    @Override // com.sankuai.meituan.retrofit2.ak
    public final String contentType() {
        return PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM;
    }

    private o(List<String> list, List<String> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3914ae20f112894ec7ca87fb8e82ae76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3914ae20f112894ec7ca87fb8e82ae76");
            return;
        }
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.c = Collections.unmodifiableList(new ArrayList(list2));
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdc35c4cab7add6b23bd71f15c87c26", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdc35c4cab7add6b23bd71f15c87c26")).intValue() : this.b.size();
    }

    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c164273994eff268901987f154283a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c164273994eff268901987f154283a") : this.b.get(i);
    }

    public final String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0620ca6f73507a902e6cf61365f254f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0620ca6f73507a902e6cf61365f254f") : t.a(a(i), true);
    }

    public final String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dcbdebefda76ec98d75e481ada9881d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dcbdebefda76ec98d75e481ada9881d") : this.c.get(i);
    }

    public final String d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa15f198b06064fcf68a20e632df9a6b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa15f198b06064fcf68a20e632df9a6b") : t.a(c(i), true);
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final long contentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de40b5414c51d28ad00aabf99ff2483b", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de40b5414c51d28ad00aabf99ff2483b")).longValue();
        }
        try {
            return a(null, true);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final void writeTo(OutputStream outputStream) throws IOException {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a566ffa89f6a221dae37a5ab970b69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a566ffa89f6a221dae37a5ab970b69");
        } else {
            a(outputStream, false);
        }
    }

    private long a(OutputStream outputStream, boolean z) throws IOException {
        Object[] objArr = {outputStream, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40f3ff52287ae27f345d51defdff764", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40f3ff52287ae27f345d51defdff764")).longValue();
        }
        if (z) {
            outputStream = new ByteArrayOutputStream();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append('&');
            }
            sb.append(this.b.get(i));
            sb.append('=');
            sb.append(this.c.get(i));
            outputStream.write(sb.toString().getBytes("UTF-8"));
        }
        if (z) {
            long size2 = ((ByteArrayOutputStream) outputStream).size();
            outputStream.close();
            return size2;
        }
        return 0L;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        private final List<String> b;
        private final List<String> c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d112dd251c4d8f459eb9e9bbdbaa804a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d112dd251c4d8f459eb9e9bbdbaa804a");
                return;
            }
            this.b = new ArrayList();
            this.c = new ArrayList();
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66aaf075961f4468ac07aa66981e056", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66aaf075961f4468ac07aa66981e056");
            }
            if (str != null && str2 != null) {
                this.b.add(t.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
                this.c.add(t.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            }
            return this;
        }

        public final a b(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f15da2e1fceb91732e2e7d032c856f", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f15da2e1fceb91732e2e7d032c856f");
            }
            if (str != null && str2 != null) {
                this.b.add(t.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
                this.c.add(t.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            }
            return this;
        }

        public final o a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90be9ed4f8f22413cae2f257f44c472f", 6917529027641081856L) ? (o) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90be9ed4f8f22413cae2f257f44c472f") : new o(this.b, this.c);
        }
    }
}
