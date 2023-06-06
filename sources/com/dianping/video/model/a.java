package com.dianping.video.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private List<C0134a> b;
    private String c;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90a5ba32fd8a238e3c3e3d602df2d40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90a5ba32fd8a238e3c3e3d602df2d40");
            return;
        }
        this.b = new ArrayList();
        this.c = str;
        if (new File(str).exists()) {
            return;
        }
        new File(str).mkdir();
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3809d40fca1994ff437f217fed3dbb56", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3809d40fca1994ff437f217fed3dbb56")).booleanValue() : this.b.isEmpty();
    }

    public final ByteBuffer b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59491a48b135a7b2e6d708121bd03f81", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59491a48b135a7b2e6d708121bd03f81");
        }
        try {
            C0134a remove = this.b.remove(this.b.size() - 1);
            FileInputStream fileInputStream = new FileInputStream(new File(remove.a));
            byte[] bArr = new byte[(int) (remove.c - remove.b)];
            fileInputStream.read(bArr);
            ByteBuffer allocate = ByteBuffer.allocate((int) ((remove.c - remove.b) + 1));
            allocate.put(bArr).position(0);
            fileInputStream.close();
            return allocate;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final ByteBuffer a(ByteBuffer byteBuffer) {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eee0a5c99883c1199d62c3700474277f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eee0a5c99883c1199d62c3700474277f");
        }
        try {
            String str = this.c + this.b.size() + ".txt";
            File file = new File(str);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[byteBuffer.limit() + 1];
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            byteBuffer.get(bArr, byteBuffer.position(), byteBuffer.limit());
            fileOutputStream.write(bArr, 0, limit);
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            fileOutputStream.flush();
            fileOutputStream.close();
            C0134a c0134a = new C0134a();
            c0134a.a = str;
            c0134a.b = position;
            c0134a.c = limit;
            this.b.add(c0134a);
            System.out.println("BufferStack frame position = " + position + " limit = " + limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteBuffer;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.video.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0134a {
        public String a;
        public long b;
        public long c;

        public C0134a() {
        }
    }
}
