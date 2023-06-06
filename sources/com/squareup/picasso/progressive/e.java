package com.squareup.picasso.progressive;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.cache.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.progressive.d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    private static final byte[] j = {-1, -39};
    public com.bumptech.glide.load.c e;
    public String f;
    public long g;
    public ExecutorService a = com.sankuai.android.jarvis.c.a("mtpicasso-ProgressiveDecode");
    public volatile List<j> b = new LinkedList();
    public h c = new h();
    public c d = new c();
    public volatile boolean h = true;
    public volatile boolean i = true;
    private final d.InterfaceC1429d k = d.b.a;

    static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.i = true;
        return true;
    }

    public e(String str, long j2) {
        this.f = str;
        this.g = j2;
        this.e = d.b.a.a(str);
        a();
    }

    public void a() {
        if (this.e == null) {
            return;
        }
        Picasso.f().b(this.e);
    }

    public void a(final int i, final int i2) {
        if (this.e == null) {
            return;
        }
        this.a.execute(new Runnable() { // from class: com.squareup.picasso.progressive.e.1
            @Override // java.lang.Runnable
            public final void run() {
                File a = Picasso.f().a(e.this.e);
                if (a == null) {
                    return;
                }
                long length = a.length();
                try {
                    e.a(e.this, new BufferedInputStream(new FileInputStream(a)), i, i2);
                } catch (Throwable unused) {
                }
                if (e.this.g <= 0 || length < e.this.g) {
                    return;
                }
                e.this.a.shutdown();
                e.this.a();
            }
        });
    }

    public final void b() {
        if (this.e == null) {
            return;
        }
        synchronized (this.b) {
            if (this.b.size() == 0) {
                return;
            }
            this.a.execute(new Runnable() { // from class: com.squareup.picasso.progressive.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    Picasso.f().a(e.this.e, new a.b() { // from class: com.squareup.picasso.progressive.e.4.1
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
                                }
                            } catch (FileNotFoundException e) {
                                e = e;
                            } catch (IOException e2) {
                                e = e2;
                            }
                            try {
                                synchronized (e.this.b) {
                                    while (e.this.b.size() > 0) {
                                        j jVar = (j) e.this.b.remove(0);
                                        bufferedOutputStream.write(jVar.a, 0, jVar.b);
                                    }
                                }
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
                                bufferedOutputStream2 = bufferedOutputStream;
                                if (bufferedOutputStream2 != null) {
                                    try {
                                        bufferedOutputStream2.close();
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
    }

    static /* synthetic */ void a(e eVar, InputStream inputStream, int i, int i2) throws Throwable {
        l lVar;
        l lVar2 = null;
        try {
            lVar = new l(new a(inputStream, i), j);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap a = com.sankuai.waimai.launcher.util.image.a.a(lVar);
            if (a == null) {
                throw new Exception();
            }
            if (eVar.g > 0 && eVar.c.d + 1 >= eVar.g) {
                eVar.k.a(eVar.f, a, i2, true);
            } else {
                eVar.k.a(eVar.f, a, i2, false);
            }
            lVar.close();
        } catch (Throwable th2) {
            th = th2;
            lVar2 = lVar;
            try {
                throw th;
            } catch (Throwable th3) {
                l lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.close();
                }
                throw th3;
            }
        }
    }
}
