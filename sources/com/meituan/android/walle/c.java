package com.meituan.android.walle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static long a(FileChannel fileChannel) throws IOException {
        Object[] objArr = {fileChannel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8611bebbdfab45db82a6804d356ae08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8611bebbdfab45db82a6804d356ae08")).longValue();
        }
        long size = fileChannel.size();
        if (size < 22) {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
        long j = size - 22;
        long min = Math.min(j, 65535L);
        int i = 0;
        while (true) {
            long j2 = i;
            if (j2 <= min) {
                long j3 = j - j2;
                ByteBuffer allocate = ByteBuffer.allocate(4);
                fileChannel.position(j3);
                fileChannel.read(allocate);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                if (allocate.getInt(0) == 101010256) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(2);
                    fileChannel.position(j3 + 20);
                    fileChannel.read(allocate2);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    short s = allocate2.getShort(0);
                    if (s == i) {
                        return s;
                    }
                }
                i++;
            } else {
                throw new IOException("ZIP End of Central Directory (EOCD) record not found");
            }
        }
    }

    public static long a(FileChannel fileChannel, long j) throws IOException {
        Object[] objArr = {fileChannel, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03756e264376f20e3889ad25001356bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03756e264376f20e3889ad25001356bd")).longValue();
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(allocate);
        return allocate.getInt(0);
    }

    public static g<ByteBuffer, Long> b(FileChannel fileChannel) throws IOException, j {
        Object[] objArr = {fileChannel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6efe494441f93aa020cbf77f58dede26", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6efe494441f93aa020cbf77f58dede26");
        }
        Object[] objArr2 = {fileChannel};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return b(fileChannel, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bc5fd1b8af1ba603671bf91e665bb161", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bc5fd1b8af1ba603671bf91e665bb161")).longValue() : a(fileChannel, a(fileChannel)));
    }

    public static g<ByteBuffer, Long> b(FileChannel fileChannel, long j) throws IOException, j {
        Object[] objArr = {fileChannel, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57d54e818ee84f7ae129957bc85be975", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57d54e818ee84f7ae129957bc85be975");
        }
        if (j < 32) {
            throw new j("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
        }
        fileChannel.position(j - 24);
        ByteBuffer allocate = ByteBuffer.allocate(24);
        fileChannel.read(allocate);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
            throw new j("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = allocate.getLong(0);
        if (j2 < allocate.capacity() || j2 > 2147483639) {
            throw new j("APK Signing Block size out of range: " + j2);
        }
        int i = (int) (8 + j2);
        long j3 = j - i;
        if (j3 < 0) {
            throw new j("APK Signing Block offset out of range: " + j3);
        }
        fileChannel.position(j3);
        ByteBuffer allocate2 = ByteBuffer.allocate(i);
        fileChannel.read(allocate2);
        allocate2.order(ByteOrder.LITTLE_ENDIAN);
        long j4 = allocate2.getLong(0);
        if (j4 != j2) {
            throw new j("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
        }
        return g.a(allocate2, Long.valueOf(j3));
    }

    public static Map<Integer, ByteBuffer> a(ByteBuffer byteBuffer) throws j {
        int i = 0;
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b06a9a81c87435bd106fc62e0bdb292", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b06a9a81c87435bd106fc62e0bdb292");
        }
        Object[] objArr2 = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "41953fead94e9bdac51e94d0709cd95f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "41953fead94e9bdac51e94d0709cd95f");
        } else if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        ByteBuffer a2 = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (a2.hasRemaining()) {
            i++;
            if (a2.remaining() < 8) {
                throw new j("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = a2.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new j("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int position = a2.position() + i2;
            if (i2 > a2.remaining()) {
                throw new j("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a2.remaining());
            }
            linkedHashMap.put(Integer.valueOf(a2.getInt()), a(a2, i2 - 4));
            a2.position(position);
        }
        return linkedHashMap;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        Object[] objArr = {byteBuffer, 8, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fac911fb6a94ab00c3e987b77521f62", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fac911fb6a94ab00c3e987b77521f62");
        }
        if (i2 < 8) {
            throw new IllegalArgumentException("end < start: " + i2 + " < 8");
        }
        int capacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        Object[] objArr = {byteBuffer, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0de1b2e058aabb50b3c081ee9c6b1755", RobustBitConfig.DEFAULT_VALUE)) {
            return (ByteBuffer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0de1b2e058aabb50b3c081ee9c6b1755");
        }
        if (i < 0) {
            throw new IllegalArgumentException("size: " + i);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }
}
