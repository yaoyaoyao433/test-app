package com.sankuai.shangou.stone.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s {
    public static ChangeQuickRedirect a;

    public static <T extends Serializable> T a(T t) {
        byte[] byteArray;
        Object a2;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63e84c284ebea581579a0a05d066d272", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63e84c284ebea581579a0a05d066d272");
        }
        try {
            Object[] objArr2 = {t};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "715ea26f2bbb41f63fd3bc56308ddab9", RobustBitConfig.DEFAULT_VALUE)) {
                byteArray = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "715ea26f2bbb41f63fd3bc56308ddab9");
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                a(t, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
            Object[] objArr3 = {byteArray};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "74319b008d88b159112fd7211763b674", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "74319b008d88b159112fd7211763b674");
            } else if (byteArray == null) {
                throw new IllegalArgumentException("The byte[] must not be null");
            } else {
                a2 = a(new ByteArrayInputStream(byteArray));
            }
            return (T) a2;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }

    private static void a(Serializable serializable, OutputStream outputStream) {
        ObjectOutputStream objectOutputStream;
        Object[] objArr = {serializable, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        ObjectOutputStream objectOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea69eb4eaf7a5b821e6e843d698a367c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea69eb4eaf7a5b821e6e843d698a367c");
            return;
        }
        try {
            try {
                objectOutputStream = new ObjectOutputStream(outputStream);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(serializable);
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                com.sankuai.shangou.stone.util.log.a.a(e2);
            }
        } catch (IOException e3) {
            e = e3;
            objectOutputStream2 = objectOutputStream;
            throw new a(e);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e4) {
                    com.sankuai.shangou.stone.util.log.a.a(e4);
                }
            }
            throw th;
        }
    }

    private static Object a(InputStream inputStream) {
        ObjectInputStream objectInputStream;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        ObjectInputStream objectInputStream2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "027cfd964b3fc523dd5b0977b2dd8d9b", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "027cfd964b3fc523dd5b0977b2dd8d9b");
            }
            try {
                objectInputStream = new ObjectInputStream(inputStream);
            } catch (IOException e) {
                e = e;
            } catch (ClassNotFoundException e2) {
                e = e2;
            }
            try {
                Object readObject = objectInputStream.readObject();
                try {
                    objectInputStream.close();
                } catch (IOException e3) {
                    com.sankuai.shangou.stone.util.log.a.a(e3);
                }
                return readObject;
            } catch (IOException e4) {
                e = e4;
                throw new a(e);
            } catch (ClassNotFoundException e5) {
                e = e5;
                throw new a(e);
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e6) {
                        com.sankuai.shangou.stone.util.log.a.a(e6);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RuntimeException {
        private static final long serialVersionUID = 4029025366392702726L;

        public a() {
        }

        public a(Throwable th) {
            super(th);
        }
    }
}
