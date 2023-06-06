package com.squareup.okhttp.internal;

import com.meituan.robust.common.CommonConstant;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okio.s;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final Charset c = Charset.forName("UTF-8");

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Closeable closeable, Closeable closeable2) throws IOException {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static boolean a(s sVar, int i, TimeUnit timeUnit) {
        try {
            return b(sVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean b(s sVar, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = sVar.timeout().hasDeadline() ? sVar.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        sVar.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            okio.c cVar = new okio.c();
            while (sVar.read(cVar, 2048L) != -1) {
                cVar.s();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                sVar.timeout().clearDeadline();
                return true;
            }
            sVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                sVar.timeout().clearDeadline();
                return false;
            }
            sVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                sVar.timeout().clearDeadline();
            } else {
                sVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static String a(String str) {
        try {
            return okio.f.a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).f();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static okio.f a(okio.f fVar) {
        try {
            return okio.f.a(MessageDigest.getInstance("SHA-1").digest(fVar.i()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: com.squareup.okhttp.internal.j.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean a(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    public static String[] b(String[] strArr, String str) {
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] a(Class<T> cls, T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object[] objArr : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t = tArr2[i];
                    if (objArr.equals(t)) {
                        arrayList.add(t);
                        break;
                    }
                    i++;
                }
            }
        }
        return (T[]) arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, arrayList.size()));
    }

    public static String a(com.squareup.okhttp.s sVar) {
        if (sVar.c != com.squareup.okhttp.s.a(sVar.a)) {
            return sVar.b + CommonConstant.Symbol.COLON + sVar.c;
        }
        return sVar.b;
    }
}
