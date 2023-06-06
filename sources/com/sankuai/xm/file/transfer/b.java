package com.sankuai.xm.file.transfer;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.file.transfer.upload.im.f;
import com.sankuai.xm.file.transfer.upload.im.g;
import com.sankuai.xm.file.transfer.upload.im.h;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;

    public final int a(String str, int i, long j, boolean z, boolean z2, boolean z3, String str2, int i2, int i3, short s) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), (byte) 1, (byte) 1, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str2, Integer.valueOf(i2), Integer.valueOf(i3), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeda3261acd0395433dab83e95fd31c5", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeda3261acd0395433dab83e95fd31c5")).intValue();
        }
        if (!TextUtils.isEmpty(str) && k.o(str)) {
            if (k.p(str) > 31457280) {
                return -5;
            }
            String a2 = a(str, j);
            synchronized (this) {
                if (e(a2)) {
                    return -1;
                }
                int i4 = c + 1;
                c = i4;
                com.sankuai.xm.file.transfer.upload.im.b bVar = new com.sankuai.xm.file.transfer.upload.im.b(i, j, str, i2, i3);
                bVar.a(str2);
                bVar.w = true;
                bVar.x = true;
                bVar.y = z3;
                bVar.a(s);
                bVar.c();
                bVar.bU_().setKey(a2);
                bVar.bU_().setTaskId(i4);
                a(a2, bVar);
                onStateChanged(bVar.bU_(), 3);
                com.sankuai.xm.threadpool.scheduler.a.b().a(2, 3, new RunnableC1382b(a2, bVar));
                return i4;
            }
        }
        return -2;
    }

    public final int a(String str, long j, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d857313f32dd871e4bb1216b42f693", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d857313f32dd871e4bb1216b42f693")).intValue();
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
            return -2;
        }
        synchronized (this) {
            if (e(str2)) {
                return -1;
            }
            int i = c + 1;
            c = i;
            com.sankuai.xm.file.transfer.download.im.c cVar = new com.sankuai.xm.file.transfer.download.im.c(str, j, str2, str3, str4, str5);
            cVar.c();
            cVar.bU_().setKey(str2);
            cVar.bU_().setTaskId(i);
            a(str2, cVar);
            onStateChanged(cVar.bU_(), 3);
            com.sankuai.xm.threadpool.scheduler.a.b().a(3, 3, new a(str2, cVar));
            return i;
        }
    }

    public final int a(String str, int i, long j, String str2, int i2, int i3, short s) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), str2, Integer.valueOf(i2), Integer.valueOf(i3), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0876154fdbc8cd2ad31370740db5f0fa", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0876154fdbc8cd2ad31370740db5f0fa")).intValue() : a(str, i, j, str2, i2, i3, false, s);
    }

    private int a(String str, int i, long j, String str2, int i2, int i3, boolean z, short s) {
        com.sankuai.xm.file.transfer.upload.im.c fVar;
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), str2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "419a29eb4b5981276cadb8cd15193415", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "419a29eb4b5981276cadb8cd15193415")).intValue();
        }
        if (!TextUtils.isEmpty(str) && k.o(str)) {
            String a2 = a(str, j);
            synchronized (this) {
                if (e(a2)) {
                    return -1;
                }
                int i4 = c + 1;
                c = i4;
                if (k.p(str) > 1048576) {
                    if (z) {
                        fVar = new com.sankuai.xm.file.transfer.upload.im.d(i, j, str, i2, i3);
                    } else {
                        fVar = new com.sankuai.xm.file.transfer.upload.im.c(i, j, str, i2, i3);
                    }
                    fVar.a(str2);
                    fVar.c();
                    fVar.bU_().setKey(a2);
                    fVar.bU_().setTaskId(i4);
                    fVar.a(s);
                } else {
                    if (z) {
                        fVar = new g(i, j, str, i2, i3);
                    } else {
                        fVar = new f(i, j, str, i2, i3);
                    }
                    fVar.a(str2);
                    fVar.c();
                    fVar.bU_().setKey(a2);
                    fVar.bU_().setTaskId(i4);
                    fVar.a(s);
                }
                a(a2, fVar);
                onStateChanged(fVar.bU_(), 3);
                com.sankuai.xm.threadpool.scheduler.a.b().a(2, 3, new RunnableC1382b(a2, fVar));
                return i4;
            }
        }
        return -2;
    }

    public final int b(String str, long j, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d35f7eb77ddac80ccc1e09ad0631fc82", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d35f7eb77ddac80ccc1e09ad0631fc82")).intValue();
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
            return -2;
        }
        synchronized (this) {
            if (e(str2)) {
                return -1;
            }
            int i = c + 1;
            c = i;
            com.sankuai.xm.file.transfer.download.im.b bVar = new com.sankuai.xm.file.transfer.download.im.b(str, j, str2, str3, str4, str5);
            bVar.c();
            bVar.bU_().setKey(str2);
            bVar.bU_().setTaskId(i);
            a(str2, bVar);
            onStateChanged(bVar.bU_(), 3);
            com.sankuai.xm.threadpool.scheduler.a.b().a(3, 3, new a(str2, bVar));
            return i;
        }
    }

    public final int a(String str, int i, long j, int i2, int i3, short s) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), Integer.valueOf(i2), Integer.valueOf(i3), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f4a99d20b746d9f014c375596a2ac1", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f4a99d20b746d9f014c375596a2ac1")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        String a2 = a(str, j);
        synchronized (this) {
            if (e(a2)) {
                return -1;
            }
            int i4 = c + 1;
            c = i4;
            com.sankuai.xm.file.transfer.upload.im.a aVar = new com.sankuai.xm.file.transfer.upload.im.a(i, j, str, i2, i3);
            aVar.c();
            aVar.bU_().setKey(a2);
            aVar.bU_().setTaskId(i4);
            aVar.a(s);
            a(a2, aVar);
            onStateChanged(aVar.bU_(), 3);
            com.sankuai.xm.threadpool.scheduler.a.b().a(2, 3, new RunnableC1382b(a2, aVar));
            return i4;
        }
    }

    public final int c(String str, long j, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1afd6b7f7af23bc75fb722d189809a23", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1afd6b7f7af23bc75fb722d189809a23")).intValue();
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
            return -2;
        }
        synchronized (this) {
            if (e(str2)) {
                return -1;
            }
            int i = c + 1;
            c = i;
            com.sankuai.xm.file.transfer.download.im.a aVar = new com.sankuai.xm.file.transfer.download.im.a(str, j, str2, str3, str4, str5);
            aVar.c();
            aVar.bU_().setKey(str2);
            aVar.bU_().setTaskId(i);
            a(str2, aVar);
            onStateChanged(aVar.bU_(), 3);
            com.sankuai.xm.threadpool.scheduler.a.b().a(3, 3, new a(str2, aVar));
            return i;
        }
    }

    public final int a(String str, int i, long j, boolean z, String str2, int i2, int i3, short s) {
        h hVar;
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), (byte) 1, str2, Integer.valueOf(i2), Integer.valueOf(i3), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d64c6c8db8a925894b9661b5fbc28f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d64c6c8db8a925894b9661b5fbc28f")).intValue();
        }
        if (!TextUtils.isEmpty(str) && k.o(str)) {
            String a2 = a(str, j);
            synchronized (this) {
                if (e(a2)) {
                    return -1;
                }
                int i4 = c + 1;
                c = i4;
                if (k.p(str) > 31457280) {
                    com.sankuai.xm.file.transfer.upload.im.e eVar = new com.sankuai.xm.file.transfer.upload.im.e(i, j, str, i2, i3);
                    eVar.b(str2);
                    eVar.c();
                    eVar.bU_().setKey(a2);
                    eVar.bU_().setTaskId(i4);
                    eVar.a(s);
                    hVar = eVar;
                } else {
                    hVar = new h(i, j, str, i2, i3);
                    hVar.w = true;
                    hVar.c();
                    hVar.bU_().setKey(a2);
                    hVar.bU_().setTaskId(i4);
                    hVar.a(s);
                }
                a(a2, hVar);
                onStateChanged(hVar.bU_(), 3);
                com.sankuai.xm.threadpool.scheduler.a.b().a(2, 3, new RunnableC1382b(a2, hVar));
                return i4;
            }
        }
        return -2;
    }

    public final int d(String str, long j, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21ff42e66d8cf3b84eff331b1ca4c27", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21ff42e66d8cf3b84eff331b1ca4c27")).intValue();
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
            return -2;
        }
        synchronized (this) {
            if (e(str2)) {
                return -1;
            }
            int i = c + 1;
            c = i;
            com.sankuai.xm.file.transfer.download.im.e eVar = new com.sankuai.xm.file.transfer.download.im.e(str, j, str2, str3, str4, str5);
            eVar.c();
            eVar.bU_().setKey(str2);
            eVar.bU_().setTaskId(i);
            a(str2, eVar);
            onStateChanged(eVar.bU_(), 3);
            com.sankuai.xm.threadpool.scheduler.a.b().a(3, 3, new a(str2, eVar));
            return i;
        }
    }

    public final synchronized int a(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b85ac93a8b84e6bf5a1faa70c3cf1270", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b85ac93a8b84e6bf5a1faa70c3cf1270")).intValue();
        }
        com.sankuai.xm.file.util.b.b("CommonTransferManager::stop: path: %s", str);
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        Iterator<String> it = this.e.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String next = it.next();
            com.sankuai.xm.file.transfer.a aVar = this.e.get(next);
            if (str.equals(aVar.bU_().getLocalPath())) {
                int state = aVar.bU_().getState();
                aVar.e();
                if (state == 4) {
                    aVar.b(this);
                    this.e.remove(next);
                }
            }
        }
        return !z ? -4 : 0;
    }

    public final synchronized int b(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9a9cd7bdb9c6b8e15b3130fa11d48eb", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9a9cd7bdb9c6b8e15b3130fa11d48eb")).intValue();
        }
        com.sankuai.xm.file.util.b.b("CommonTransferManager::stopDownload: url: %s", str);
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        Iterator<String> it = this.e.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String next = it.next();
            com.sankuai.xm.file.transfer.a aVar = this.e.get(next);
            if ((aVar instanceof com.sankuai.xm.file.transfer.download.im.d) && str.equals(((com.sankuai.xm.file.transfer.download.im.d) aVar).n)) {
                int state = aVar.bU_().getState();
                aVar.e();
                if (state == 4) {
                    aVar.b(this);
                    this.e.remove(next);
                }
            }
        }
        return !z ? -4 : 0;
    }

    public final String a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8170a70f185a6309694dc72e5aa9f060", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8170a70f185a6309694dc72e5aa9f060");
        }
        return str + j;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;
        private String c;
        private com.sankuai.xm.file.transfer.a d;
        private com.sankuai.xm.base.trace.g e;

        public a(String str, com.sankuai.xm.file.transfer.a aVar) {
            Object[] objArr = {b.this, str, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ee92ec63d1dc3c3c71a36d61807c21", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ee92ec63d1dc3c3c71a36d61807c21");
                return;
            }
            this.c = str;
            this.d = aVar;
            this.e = j.a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8232a5fc31a66db07ba26c1bab06688", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8232a5fc31a66db07ba26c1bab06688");
                return;
            }
            try {
                j.a(this.e);
                this.d.a(b.this);
                this.d.d();
                if (this.d.bU_().getState() != 4) {
                    this.d.b(b.this);
                    b.this.d(this.c);
                }
                j.c(this.e);
            } catch (Throwable th) {
                j.a(this.e, th);
                throw th;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.file.transfer.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class RunnableC1382b implements Runnable {
        public static ChangeQuickRedirect a;
        private String c;
        private com.sankuai.xm.file.transfer.a d;
        private com.sankuai.xm.base.trace.g e;

        public RunnableC1382b(String str, com.sankuai.xm.file.transfer.a aVar) {
            Object[] objArr = {b.this, str, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6291cacbe1efc2d5bdbe80a7d29a0327", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6291cacbe1efc2d5bdbe80a7d29a0327");
                return;
            }
            this.c = str;
            this.d = aVar;
            this.e = j.a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e74e81dffdb02fd5626d1fbac8129400", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e74e81dffdb02fd5626d1fbac8129400");
                return;
            }
            try {
                j.a(this.e);
                this.d.a(b.this);
                this.d.d();
                if (this.d.bU_().getState() != 4) {
                    this.d.b(b.this);
                    b.this.d(this.c);
                }
                j.c(this.e);
            } catch (Throwable th) {
                j.a(this.e, th);
                throw th;
            }
        }
    }
}
