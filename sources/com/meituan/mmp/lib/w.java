package com.meituan.mmp.lib;

import android.os.IBinder;
import android.view.ViewGroup;
import com.meituan.mmp.lib.trace.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class w {
    public static ChangeQuickRedirect a;
    private static w i;
    public final x b;
    public final v c;
    public final Queue<com.meituan.mmp.lib.trace.f> d;
    public final u e;
    private List<x> f;
    private List<v> g;
    private List<u> h;

    public w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d38d8e07d87197d90e3da8df533428", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d38d8e07d87197d90e3da8df533428");
            return;
        }
        this.h = new ArrayList();
        this.b = new x() { // from class: com.meituan.mmp.lib.w.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.x
            public final void a(final String str, final String str2, final IBinder iBinder) {
                Object[] objArr2 = {str, str2, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c4bc9675540842046c1a036d3f3bba4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c4bc9675540842046c1a036d3f3bba4");
                } else {
                    w.a(w.this, w.this.f, new a<x>() { // from class: com.meituan.mmp.lib.w.1.1
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(x xVar) {
                            x xVar2 = xVar;
                            Object[] objArr3 = {xVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97e33a3cc892ec3ad2ba331c0cde589f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97e33a3cc892ec3ad2ba331c0cde589f");
                            } else {
                                xVar2.a(str, str2, iBinder);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.x
            public final void b(final String str, final String str2, final IBinder iBinder) {
                Object[] objArr2 = {str, str2, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d576049e2994aafea7e0b9970e846ae7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d576049e2994aafea7e0b9970e846ae7");
                } else {
                    w.a(w.this, w.this.f, new a<x>() { // from class: com.meituan.mmp.lib.w.1.2
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(x xVar) {
                            x xVar2 = xVar;
                            Object[] objArr3 = {xVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "224983673af7573dd2e8a050f04b095c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "224983673af7573dd2e8a050f04b095c");
                            } else {
                                xVar2.b(str, str2, iBinder);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.x
            public final void a(final String str, final IBinder iBinder) {
                Object[] objArr2 = {str, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0035355564f008bc6e8ad143e25eb1de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0035355564f008bc6e8ad143e25eb1de");
                } else {
                    w.a(w.this, w.this.f, new a<x>() { // from class: com.meituan.mmp.lib.w.1.3
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(x xVar) {
                            x xVar2 = xVar;
                            Object[] objArr3 = {xVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e282083159f20033f14b32960d864968", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e282083159f20033f14b32960d864968");
                            } else {
                                xVar2.a(str, iBinder);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.x
            public final void b(final String str, final IBinder iBinder) {
                Object[] objArr2 = {str, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4600787bd92a30a274074a4e07e481be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4600787bd92a30a274074a4e07e481be");
                } else {
                    w.a(w.this, w.this.f, new a<x>() { // from class: com.meituan.mmp.lib.w.1.4
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(x xVar) {
                            x xVar2 = xVar;
                            Object[] objArr3 = {xVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e9e12c83d19f110aa68499ecb3b2c2fe", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e9e12c83d19f110aa68499ecb3b2c2fe");
                            } else {
                                xVar2.b(str, iBinder);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.x
            public final void a(final String str, final String str2, final ViewGroup viewGroup) {
                Object[] objArr2 = {str, str2, viewGroup};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88a50af8eb54b9f0d6635f573602415d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88a50af8eb54b9f0d6635f573602415d");
                } else {
                    w.a(w.this, w.this.f, new a<x>() { // from class: com.meituan.mmp.lib.w.1.5
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(x xVar) {
                            x xVar2 = xVar;
                            Object[] objArr3 = {xVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "138e24c75b09b3df59bd6022d1e648be", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "138e24c75b09b3df59bd6022d1e648be");
                            } else {
                                xVar2.a(str, str2, viewGroup);
                            }
                        }
                    });
                }
            }
        };
        this.c = new v() { // from class: com.meituan.mmp.lib.w.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.v
            public final void a(final String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "992850e369ea24f22bea0c8e47a8ec8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "992850e369ea24f22bea0c8e47a8ec8c");
                } else {
                    w.a(w.this, w.this.g, new a<v>() { // from class: com.meituan.mmp.lib.w.2.1
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(v vVar) {
                            v vVar2 = vVar;
                            Object[] objArr3 = {vVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb2e580da3a16f07ad02e1d648947c99", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb2e580da3a16f07ad02e1d648947c99");
                            } else {
                                vVar2.a(str);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.v
            public final void b(final String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "663f0c9895aca6864b25b8ad3be8e5f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "663f0c9895aca6864b25b8ad3be8e5f5");
                } else {
                    w.a(w.this, w.this.g, new a<v>() { // from class: com.meituan.mmp.lib.w.2.2
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(v vVar) {
                            v vVar2 = vVar;
                            Object[] objArr3 = {vVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2057ef26d86165a80df115f28abb8aef", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2057ef26d86165a80df115f28abb8aef");
                            } else {
                                vVar2.b(str);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.v
            public final void c(final String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "479fa0acc16bd17b69ff0bfd091b1b10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "479fa0acc16bd17b69ff0bfd091b1b10");
                } else {
                    w.a(w.this, w.this.g, new a<v>() { // from class: com.meituan.mmp.lib.w.2.3
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(v vVar) {
                            v vVar2 = vVar;
                            Object[] objArr3 = {vVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "980bac9401f4b15abffeec7c383b1b1d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "980bac9401f4b15abffeec7c383b1b1d");
                            } else {
                                vVar2.c(str);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.v
            public final void d(final String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "877499cf298e2d7c97bbf3cb9bafc11b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "877499cf298e2d7c97bbf3cb9bafc11b");
                } else {
                    w.a(w.this, w.this.g, new a<v>() { // from class: com.meituan.mmp.lib.w.2.4
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(v vVar) {
                            v vVar2 = vVar;
                            Object[] objArr3 = {vVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "072da02d570c691b56e64fe328f8ce21", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "072da02d570c691b56e64fe328f8ce21");
                            } else {
                                vVar2.d(str);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.v
            public final void a(final String str, final String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09f291eec8f8a89250a06a3ab9400d28", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09f291eec8f8a89250a06a3ab9400d28");
                } else {
                    w.a(w.this, w.this.g, new a<v>() { // from class: com.meituan.mmp.lib.w.2.5
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(v vVar) {
                            v vVar2 = vVar;
                            Object[] objArr3 = {vVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "270e779b53f402f52fefbc4eabd734ca", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "270e779b53f402f52fefbc4eabd734ca");
                            } else {
                                vVar2.a(str, str2);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.v
            public final void a(final String str, final String str2, final HashMap<String, Object> hashMap) {
                Object[] objArr2 = {str, str2, hashMap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "440b73b90769cfe00435882be2f00a94", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "440b73b90769cfe00435882be2f00a94");
                } else {
                    w.a(w.this, w.this.g, new a<v>() { // from class: com.meituan.mmp.lib.w.2.6
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(v vVar) {
                            v vVar2 = vVar;
                            Object[] objArr3 = {vVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf513e0358e79f57f1df6120c07c118a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf513e0358e79f57f1df6120c07c118a");
                                return;
                            }
                            vVar2.a(str, str2);
                            vVar2.a(str, str2, hashMap);
                        }
                    });
                }
            }
        };
        this.d = new ConcurrentLinkedQueue();
        this.e = new u() { // from class: com.meituan.mmp.lib.w.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.u
            public final void a(final String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1f71fbda1433730e7377ce9899f8176", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1f71fbda1433730e7377ce9899f8176");
                    return;
                }
                w.this.d.add(new f.b(str));
                w.a(w.this, w.this.h, new a<u>() { // from class: com.meituan.mmp.lib.w.3.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.meituan.mmp.lib.w.a
                    public final /* synthetic */ void a(u uVar) {
                        u uVar2 = uVar;
                        Object[] objArr3 = {uVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de11031299bd4ab79507f27f820b09f1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de11031299bd4ab79507f27f820b09f1");
                        } else {
                            uVar2.a(str);
                        }
                    }
                });
            }

            @Override // com.meituan.mmp.lib.u
            public final void a(final String str, final long j) {
                Object[] objArr2 = {str, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac51c9283c4a46b6ac6ba9653dd0bbbc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac51c9283c4a46b6ac6ba9653dd0bbbc");
                } else {
                    w.a(w.this, w.this.h, new a<u>() { // from class: com.meituan.mmp.lib.w.3.2
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.mmp.lib.w.a
                        public final /* synthetic */ void a(u uVar) {
                            u uVar2 = uVar;
                            Object[] objArr3 = {uVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "142ca484a43027f9fbd12f2ed520d603", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "142ca484a43027f9fbd12f2ed520d603");
                            } else {
                                uVar2.a(str, j);
                            }
                        }
                    });
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [T, java.lang.Object] */
    public static /* synthetic */ void a(w wVar, List list, a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, wVar, changeQuickRedirect, false, "40903e4ad15e56f36509c5bcc5712dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wVar, changeQuickRedirect, false, "40903e4ad15e56f36509c5bcc5712dd5");
        } else if (com.meituan.mmp.lib.utils.h.a(list)) {
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    aVar.g = it.next();
                    aVar.run();
                } catch (Throwable th) {
                    DebugHelper.a(th);
                }
            }
        }
    }

    public static w a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "324b2fe4d5c25a4cd42b2037835c4248", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "324b2fe4d5c25a4cd42b2037835c4248");
        }
        if (i == null) {
            synchronized (w.class) {
                if (i == null) {
                    w wVar = new w();
                    i = wVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, wVar, changeQuickRedirect2, false, "f12b21161c1a3c27ffa014cba118fbd7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, wVar, changeQuickRedirect2, false, "f12b21161c1a3c27ffa014cba118fbd7");
                    } else {
                        wVar.f = com.sankuai.meituan.serviceloader.b.a(x.class, (String) null);
                        wVar.g = com.sankuai.meituan.serviceloader.b.a(v.class, (String) null);
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class a<T> implements Runnable {
        public static ChangeQuickRedirect f;
        public T g;

        public abstract void a(T t);

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df723ed22ca2936f8f8200b365dce79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df723ed22ca2936f8f8200b365dce79");
            } else if (this.g != null) {
                a(this.g);
            }
        }
    }
}
