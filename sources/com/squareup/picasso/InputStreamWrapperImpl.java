package com.squareup.picasso;

import android.text.TextUtils;
import com.bumptech.glide.load.engine.cache.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Progress;
import com.squareup.picasso.progressive.b;
import com.squareup.picasso.progressive.d;
import com.squareup.picasso.progressive.e;
import com.squareup.picasso.progressive.h;
import com.squareup.picasso.progressive.j;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.c;
import okio.i;
import okio.m;
import okio.s;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class InputStreamWrapperImpl implements InputStreamWrapper {
    private static b a = new b();

    @Override // com.squareup.picasso.InputStreamWrapper
    public final InputStream a(final String str, final long j, InputStream inputStream) {
        if (TextUtils.isEmpty(str)) {
            return inputStream;
        }
        try {
            s a2 = m.a(inputStream);
            final e eVar = new e(str, j);
            final Progress.ProgressListener a3 = Progress.a();
            a3.a(str, 0L, j, false);
            return m.a(new i(a2) { // from class: com.squareup.picasso.InputStreamWrapperImpl.1
                long a = 0;

                @Override // okio.i, okio.s
                public long read(c cVar, long j2) throws IOException {
                    j a4;
                    long read = super.read(cVar, j2);
                    int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                    this.a += i != 0 ? read : 0L;
                    boolean z = false;
                    a3.a(str, this.a, j, i == 0);
                    if (eVar == null || !eVar.h) {
                        return read;
                    }
                    try {
                        a4 = InputStreamWrapperImpl.a.a(cVar);
                    } catch (OutOfMemoryError unused) {
                        e eVar2 = eVar;
                        if (!eVar2.a.isShutdown() && !eVar2.i) {
                            eVar2.i = true;
                            eVar2.b();
                        }
                        a4 = InputStreamWrapperImpl.a.a(cVar);
                    }
                    if (eVar != null && a4 != null) {
                        final e eVar3 = eVar;
                        if (!eVar3.a.isShutdown()) {
                            if (eVar3.h) {
                                com.squareup.picasso.progressive.c cVar2 = eVar3.d;
                                cVar2.c = a4;
                                if (a4.a != null && a4.b > 0) {
                                    cVar2.b = 0;
                                    cVar2.a += a4.b;
                                }
                                if (eVar3.i) {
                                    eVar3.b();
                                    if (eVar3.e != null) {
                                        com.squareup.picasso.progressive.c cVar3 = eVar3.d;
                                        final byte[] bArr = cVar3.c == null ? null : cVar3.c.a;
                                        com.squareup.picasso.progressive.c cVar4 = eVar3.d;
                                        final int i2 = cVar4.c == null ? 0 : cVar4.c.b;
                                        eVar3.a.execute(new Runnable() { // from class: com.squareup.picasso.progressive.e.3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Picasso.f().a(eVar3.e, new a.b() { // from class: com.squareup.picasso.progressive.e.3.1
                                                    {
                                                        AnonymousClass3.this = this;
                                                    }

                                                    @Override // com.bumptech.glide.load.engine.cache.a.b
                                                    public final boolean a(File file) {
                                                        BufferedOutputStream bufferedOutputStream;
                                                        file.length();
                                                        BufferedOutputStream bufferedOutputStream2 = null;
                                                        try {
                                                            try {
                                                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                bufferedOutputStream = null;
                                                            }
                                                        } catch (FileNotFoundException e) {
                                                            e = e;
                                                        } catch (IOException e2) {
                                                            e = e2;
                                                        }
                                                        try {
                                                            bufferedOutputStream.write(bArr, r3, i2);
                                                            bufferedOutputStream.flush();
                                                            try {
                                                                bufferedOutputStream.close();
                                                            } catch (IOException e3) {
                                                                e3.printStackTrace();
                                                            }
                                                            return true;
                                                        } catch (FileNotFoundException e4) {
                                                            e = e4;
                                                            bufferedOutputStream2 = bufferedOutputStream;
                                                            e.printStackTrace();
                                                            if (bufferedOutputStream2 != null) {
                                                                try {
                                                                    bufferedOutputStream2.close();
                                                                } catch (IOException e5) {
                                                                    e5.printStackTrace();
                                                                }
                                                            }
                                                            return false;
                                                        } catch (IOException e6) {
                                                            e = e6;
                                                            bufferedOutputStream2 = bufferedOutputStream;
                                                            e.printStackTrace();
                                                            if (bufferedOutputStream2 != null) {
                                                                try {
                                                                    bufferedOutputStream2.close();
                                                                } catch (IOException e7) {
                                                                    e7.printStackTrace();
                                                                }
                                                            }
                                                            return false;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            if (bufferedOutputStream != null) {
                                                                try {
                                                                    bufferedOutputStream.close();
                                                                } catch (IOException e8) {
                                                                    e8.printStackTrace();
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                });
                                            }
                                        });
                                    }
                                } else {
                                    synchronized (eVar3.b) {
                                        eVar3.b.add(a4);
                                    }
                                }
                                while (true) {
                                    try {
                                        h hVar = eVar3.c;
                                        if (!(hVar.a == 6 ? false : hVar.a(eVar3.d))) {
                                            break;
                                        }
                                        final int i3 = eVar3.c.d;
                                        final int i4 = eVar3.c.c - 1;
                                        if (eVar3.i) {
                                            eVar3.a(i3, i4);
                                        } else {
                                            eVar3.a.execute(new Runnable() { // from class: com.squareup.picasso.progressive.e.2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    try {
                                                        e.a(eVar3, new g(new k(eVar3.b)), i3, i4);
                                                    } catch (Throwable unused2) {
                                                        eVar3.b();
                                                        eVar3.a(i3, i4);
                                                        e.a(eVar3, true);
                                                    }
                                                }
                                            });
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                h hVar2 = eVar3.c;
                                if (hVar2.b > 1 && hVar2.a != 6) {
                                    z = true;
                                }
                                eVar3.h = z;
                                if (eVar3.h) {
                                    if (eVar3.g > 0 && eVar3.c.d + 1 >= eVar3.g) {
                                        eVar3.a.shutdown();
                                        eVar3.a();
                                    }
                                } else {
                                    d.b.a.b(eVar3.f);
                                    eVar3.a();
                                }
                            } else {
                                d.b.a.b(eVar3.f);
                                eVar3.a();
                            }
                        }
                    }
                    return read;
                }
            }).e();
        } catch (Throwable unused) {
            return inputStream;
        }
    }
}
