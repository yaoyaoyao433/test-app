package com.dianping.imagemanager.imagedecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import com.dianping.imagemanager.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a {
    public static ChangeQuickRedirect c;
    private i.a a;
    public int d;
    public int e;

    public abstract Bitmap a(BitmapFactory.Options options);

    public abstract boolean a();

    public abstract byte[] a(boolean z);

    public abstract i.a b();

    public abstract BitmapFactory.Options c();

    public abstract int d();

    public final i.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67d9793de05e7b3670816c026abcf9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67d9793de05e7b3670816c026abcf9b");
        }
        if (this.a == null) {
            this.a = b();
        }
        return this.a;
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b274e6d4d170c123284c0af8c844cc4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b274e6d4d170c123284c0af8c844cc4f")).intValue();
        }
        if (e().n) {
            return d();
        }
        return 0;
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3d876e18cb1048e0888151a819c7465", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3d876e18cb1048e0888151a819c7465")).intValue();
        }
        try {
            return a(new ExifInterface(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @TargetApi(24)
    public static int a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e59372177880d7a2705ab6c99e5e28c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e59372177880d7a2705ab6c99e5e28c8")).intValue();
        }
        try {
            return a(new ExifInterface(inputStream));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @TargetApi(24)
    public static int a(FileDescriptor fileDescriptor) {
        Object[] objArr = {fileDescriptor};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5da858b7361d023d3585b14701b3cd50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5da858b7361d023d3585b14701b3cd50")).intValue();
        }
        try {
            return a(new ExifInterface(fileDescriptor));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static int a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86d20533670d191ad84410a92ee85c52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86d20533670d191ad84410a92ee85c52")).intValue();
        }
        if (bArr == null) {
            return 0;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int a = a(byteArrayInputStream);
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return a;
    }

    private static int a(ExifInterface exifInterface) {
        Object[] objArr = {exifInterface};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf60374edf655dded05f80854a226a09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf60374edf655dded05f80854a226a09")).intValue();
        }
        int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
        if (attributeInt != 3) {
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        }
        return TXLiveConstants.RENDER_ROTATION_180;
    }
}
