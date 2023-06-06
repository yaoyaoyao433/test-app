package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class z {
    public static ChangeQuickRedirect a;

    public static boolean a(Object obj, String str) {
        ObjectOutputStream objectOutputStream;
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ObjectOutputStream objectOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "379cfabdf277a15f7ee50b956bc4a8f3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "379cfabdf277a15f7ee50b956bc4a8f3")).booleanValue();
        }
        if (obj != null) {
            try {
                if (!ac.a(str)) {
                    try {
                        objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(com.sankuai.xm.base.service.m.a().p(), str)));
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        objectOutputStream.writeObject(obj);
                        m.a(objectOutputStream);
                        return true;
                    } catch (IOException e2) {
                        e = e2;
                        objectOutputStream2 = objectOutputStream;
                        com.sankuai.xm.log.a.a(e);
                        m.a(objectOutputStream2);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream2 = objectOutputStream;
                        m.a(objectOutputStream2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw new NullPointerException("object or name is null/empty");
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    public static <T> T a(String str) {
        ObjectInputStream objectInputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        Closeable closeable = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2856027346a4f6fb6a33efefa89cd0d7", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2856027346a4f6fb6a33efefa89cd0d7");
        }
        File file = new File(com.sankuai.xm.base.service.m.a().p(), str);
        ?? exists = file.exists();
        try {
            if (exists != 0) {
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    try {
                        T t = (T) objectInputStream.readObject();
                        m.a(objectInputStream);
                        return t;
                    } catch (Exception e) {
                        e = e;
                        com.sankuai.xm.log.a.a(e);
                        m.a(objectInputStream);
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    m.a(closeable);
                    throw th;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            closeable = exists;
        }
    }
}
