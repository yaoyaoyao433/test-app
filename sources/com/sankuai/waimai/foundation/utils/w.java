package com.sankuai.waimai.foundation.utils;

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
public final class w {
    public static ChangeQuickRedirect a;

    public static <T extends Serializable> T a(T t) {
        byte[] byteArray;
        Object a2;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "557a002ece3eadc2bcd52ea6d66beafc", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "557a002ece3eadc2bcd52ea6d66beafc");
        }
        Object[] objArr2 = {t};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "26cefeda0d8f22dea0fb79400448308c", RobustBitConfig.DEFAULT_VALUE)) {
            byteArray = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "26cefeda0d8f22dea0fb79400448308c");
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            a(t, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        Object[] objArr3 = {byteArray};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a89ea132e3280e4d0f1cfee9f8aede7f", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a89ea132e3280e4d0f1cfee9f8aede7f");
        } else if (byteArray == null) {
            throw new IllegalArgumentException("The byte[] must not be null");
        } else {
            a2 = a(new ByteArrayInputStream(byteArray));
        }
        return (T) a2;
    }

    private static void a(Serializable serializable, OutputStream outputStream) {
        ObjectOutputStream objectOutputStream;
        Object[] objArr = {serializable, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff4562ce207e47c21dca17b23d1445af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff4562ce207e47c21dca17b23d1445af");
                return;
            }
            try {
                objectOutputStream = new ObjectOutputStream(outputStream);
            } catch (IOException e) {
                e = e;
            }
            try {
                objectOutputStream.writeObject(serializable);
                try {
                    objectOutputStream.close();
                } catch (IOException unused) {
                }
            } catch (IOException e2) {
                e = e2;
                throw new a(e);
            } catch (Throwable th) {
                th = th;
                objectOutputStream2 = objectOutputStream;
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static Object a(InputStream inputStream) {
        ObjectInputStream objectInputStream;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        ObjectInputStream objectInputStream2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3c8a454721079cb690463facc6bb9b6", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3c8a454721079cb690463facc6bb9b6");
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
                } catch (IOException unused) {
                }
                return readObject;
            } catch (IOException e3) {
                e = e3;
                throw new a(e);
            } catch (ClassNotFoundException e4) {
                e = e4;
                throw new a(e);
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
