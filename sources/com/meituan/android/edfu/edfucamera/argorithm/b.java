package com.meituan.android.edfu.edfucamera.argorithm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b implements d {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private e c;
    private c d;
    private a e;
    private ExecutorService f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ef76f1c26de0bedcd0a8b2553abd5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ef76f1c26de0bedcd0a8b2553abd5f");
            return;
        }
        this.c = new e();
        this.d = null;
        this.e = null;
        this.f = com.sankuai.android.jarvis.c.a(com.meituan.android.edfu.utils.a.a(b));
    }

    @Override // com.meituan.android.edfu.edfucamera.argorithm.d
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a3e3057dc4203784b3550b458f6212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a3e3057dc4203784b3550b458f6212");
            return;
        }
        if (this.e != null) {
            this.e.a();
        }
        this.e = new a();
        this.d = cVar;
        this.f.execute(this.e);
    }

    @Override // com.meituan.android.edfu.edfucamera.argorithm.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798dafac492db26b2636d0771511e5f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798dafac492db26b2636d0771511e5f3");
            return;
        }
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        if (this.f != null) {
            this.f.shutdown();
            this.f = null;
        }
    }

    @Override // com.meituan.android.edfu.edfucamera.argorithm.d
    public final void a(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        e eVar;
        e eVar2;
        e eVar3;
        com.meituan.android.edfu.edfucamera.argorithm.a a2;
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f51832510a641d5bf7210d2706d07547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f51832510a641d5bf7210d2706d07547");
        } else if (this.d == null) {
        } else {
            Object[] objArr2 = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efde7416654094da7ee73df16472b878", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (com.meituan.android.edfu.edfucamera.argorithm.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efde7416654094da7ee73df16472b878");
            } else {
                Object[] objArr3 = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "46d6174d24679811d370e31ab2b9db1a", RobustBitConfig.DEFAULT_VALUE)) {
                    eVar2 = (e) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "46d6174d24679811d370e31ab2b9db1a");
                } else {
                    if (this.c.k) {
                        e eVar4 = this.c;
                        eVar4.l = System.currentTimeMillis();
                        eVar = eVar4;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        Object[] objArr4 = {eVar, bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cd32821c943322b351326c6d0117000c", RobustBitConfig.DEFAULT_VALUE)) {
                            eVar3 = (e) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cd32821c943322b351326c6d0117000c");
                        } else {
                            if (eVar.b > 0 && eVar.c > 0 && (eVar.b != i || eVar.c != i2)) {
                                eVar.a();
                            }
                            if (bArr == null) {
                                eVar3 = null;
                            } else {
                                eVar.e = i4;
                                if (eVar.f == null) {
                                    eVar.f = new byte[bArr.length];
                                }
                                System.arraycopy(bArr, 0, eVar.f, 0, Math.min(eVar.f.length, bArr.length));
                                eVar.b = i;
                                eVar.d = i3;
                                eVar.c = i2;
                                Object[] objArr5 = {Integer.valueOf(i6)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                eVar.i = PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5e81580047098a68fc1ba5cee4e05cc0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5e81580047098a68fc1ba5cee4e05cc0")).intValue() : i6 != 17 ? i6 != 42 ? i6 : 0 : 1;
                                eVar.e = i4;
                                eVar.j = z;
                                eVar3 = eVar;
                            }
                        }
                        eVar2 = eVar3;
                    } else {
                        eVar2 = eVar;
                    }
                }
                a2 = a(eVar2, i5);
            }
            if (a2 == null || this.e == null) {
                return;
            }
            a aVar = this.e;
            Object[] objArr6 = {a2};
            ChangeQuickRedirect changeQuickRedirect6 = a.a;
            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "1bc0c2a859aae2f9a4ccf34379ea09ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "1bc0c2a859aae2f9a4ccf34379ea09ee");
                return;
            }
            aVar.b = a2;
            aVar.c.release();
        }
    }

    private com.meituan.android.edfu.edfucamera.argorithm.a a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fe546cd130545801785afe5aeaef1bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.edfu.edfucamera.argorithm.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fe546cd130545801785afe5aeaef1bf");
        }
        if (eVar == null) {
            return null;
        }
        try {
            eVar.k = false;
            com.meituan.android.edfu.edfucamera.argorithm.a aVar = new com.meituan.android.edfu.edfucamera.argorithm.a();
            aVar.a = eVar;
            aVar.c = System.currentTimeMillis();
            aVar.b = i;
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;
        com.meituan.android.edfu.edfucamera.argorithm.a b;
        final Semaphore c;
        private volatile boolean e;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e4e784b94e3d2eb4b40ddb22c3fc922", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e4e784b94e3d2eb4b40ddb22c3fc922");
                return;
            }
            this.b = new com.meituan.android.edfu.edfucamera.argorithm.a();
            this.c = new Semaphore(0);
            this.e = false;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e612f30c50c81cc3a6e3e7a2e48baef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e612f30c50c81cc3a6e3e7a2e48baef");
                return;
            }
            while (!this.e) {
                try {
                    this.c.acquire();
                } catch (InterruptedException unused) {
                }
                if (this.e) {
                    break;
                } else if (this.b != null) {
                    com.meituan.android.edfu.edfucamera.argorithm.a aVar = this.b;
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29b9f367015bc0567a1ff8d0b65f8b11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29b9f367015bc0567a1ff8d0b65f8b11");
                    } else {
                        aVar.d = 0L;
                        if (!aVar.a.k) {
                            c unused2 = b.this.d;
                            aVar.a.k = true;
                        }
                    }
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a2e492a8fb512d09ebdf51d687bdad2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3a2e492a8fb512d09ebdf51d687bdad2");
            } else if (b.this.d != null) {
                c unused3 = b.this.d;
                String unused4 = b.b;
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad682356ae60c2361b3b2f5fce75ca09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad682356ae60c2361b3b2f5fce75ca09");
                return;
            }
            this.e = true;
            this.c.release();
        }
    }
}
