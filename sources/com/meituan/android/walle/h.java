package com.meituan.android.walle;

import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static String a(File file, int i) {
        ByteBuffer byteBuffer;
        byte[] copyOfRange;
        Object[] objArr = {file, 1903654775};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "177db18e6c0d2ab98bcbab105d61cae5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "177db18e6c0d2ab98bcbab105d61cae5");
        }
        Object[] objArr2 = {file, 1903654775};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "06d69f428e3249d53c79a6cdf2332df8", RobustBitConfig.DEFAULT_VALUE)) {
            copyOfRange = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "06d69f428e3249d53c79a6cdf2332df8");
        } else {
            Map<Integer, ByteBuffer> a2 = a(file);
            if (a2 == null || (byteBuffer = a2.get(1903654775)) == null) {
                copyOfRange = null;
            } else {
                Object[] objArr3 = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "27d36f268276a681bec855b7277efcf7", RobustBitConfig.DEFAULT_VALUE)) {
                    copyOfRange = (byte[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "27d36f268276a681bec855b7277efcf7");
                } else {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset();
                    copyOfRange = Arrays.copyOfRange(array, byteBuffer.position() + arrayOffset, arrayOffset + byteBuffer.limit());
                }
            }
        }
        if (copyOfRange == null) {
            return null;
        }
        try {
            return new String(copyOfRange, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Map<Integer, ByteBuffer> a(File file) {
        FileChannel fileChannel;
        RandomAccessFile randomAccessFile;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "520b4c426c0fb116603f96a86ce3b39d", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "520b4c426c0fb116603f96a86ce3b39d");
            }
            try {
                randomAccessFile = new RandomAccessFile(file, r.o);
                try {
                    fileChannel = randomAccessFile.getChannel();
                    try {
                        Map<Integer, ByteBuffer> a2 = c.a(c.b(fileChannel).b);
                        if (fileChannel != null) {
                            try {
                                try {
                                    fileChannel.close();
                                } catch (j | IOException unused) {
                                }
                            } catch (IOException unused2) {
                            }
                        }
                        randomAccessFile.close();
                        return a2;
                    } catch (IOException unused3) {
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                            return null;
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused6) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused7) {
                    fileChannel = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = null;
                }
            } catch (IOException unused8) {
                fileChannel = null;
                randomAccessFile = null;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = null;
                randomAccessFile = null;
            }
        } catch (j | IOException unused9) {
            return null;
        }
    }
}
