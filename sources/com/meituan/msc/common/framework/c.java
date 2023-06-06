package com.meituan.msc.common.framework;

import android.os.IBinder;
import android.view.ViewGroup;
import com.meituan.msc.common.utils.f;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.reporter.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static c i;
    public final com.meituan.msc.lib.interfaces.b b;
    public final com.meituan.msc.lib.interfaces.a c;
    public final Queue<m> d;
    public final b e;
    private List<com.meituan.msc.lib.interfaces.b> f;
    private List<com.meituan.msc.lib.interfaces.a> g;
    private final List<b> h;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0c354475d9b5bc80ae854f47d35e8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0c354475d9b5bc80ae854f47d35e8f");
            return;
        }
        this.h = new ArrayList();
        this.b = new com.meituan.msc.lib.interfaces.b() { // from class: com.meituan.msc.common.framework.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.lib.interfaces.b
            public final void a(final String str, final String str2, final IBinder iBinder) {
                Object[] objArr2 = {str, str2, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7df0feb4758fa6b0d4de94f5dc6ec32", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7df0feb4758fa6b0d4de94f5dc6ec32");
                } else {
                    c.a(c.this, c.this.f, new a<com.meituan.msc.lib.interfaces.b>() { // from class: com.meituan.msc.common.framework.c.1.1
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.msc.common.framework.c.a
                        public final /* synthetic */ void a(com.meituan.msc.lib.interfaces.b bVar) {
                            com.meituan.msc.lib.interfaces.b bVar2 = bVar;
                            Object[] objArr3 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bfce02853bfe9ea2b2fa87f68fb0ee65", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bfce02853bfe9ea2b2fa87f68fb0ee65");
                            } else {
                                bVar2.a(str, str2, iBinder);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.msc.lib.interfaces.b
            public final void b(final String str, final String str2, final IBinder iBinder) {
                Object[] objArr2 = {str, str2, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a62026b3310b96b00ed1cb32f08ee502", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a62026b3310b96b00ed1cb32f08ee502");
                } else {
                    c.a(c.this, c.this.f, new a<com.meituan.msc.lib.interfaces.b>() { // from class: com.meituan.msc.common.framework.c.1.2
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.msc.common.framework.c.a
                        public final /* synthetic */ void a(com.meituan.msc.lib.interfaces.b bVar) {
                            com.meituan.msc.lib.interfaces.b bVar2 = bVar;
                            Object[] objArr3 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "837ea888747d56409aaf380649202ccd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "837ea888747d56409aaf380649202ccd");
                            } else {
                                bVar2.b(str, str2, iBinder);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.msc.lib.interfaces.b
            public final void a(final String str, final IBinder iBinder) {
                Object[] objArr2 = {str, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73ac641067840078e931a417460e62d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73ac641067840078e931a417460e62d5");
                } else {
                    c.a(c.this, c.this.f, new a<com.meituan.msc.lib.interfaces.b>() { // from class: com.meituan.msc.common.framework.c.1.3
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.msc.common.framework.c.a
                        public final /* synthetic */ void a(com.meituan.msc.lib.interfaces.b bVar) {
                            com.meituan.msc.lib.interfaces.b bVar2 = bVar;
                            Object[] objArr3 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b99aad40f16ab43e842057f43ad052e5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b99aad40f16ab43e842057f43ad052e5");
                            } else {
                                bVar2.a(str, iBinder);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.msc.lib.interfaces.b
            public final void b(final String str, final IBinder iBinder) {
                Object[] objArr2 = {str, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c01f481e7662de9301e9b7bfa184216b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c01f481e7662de9301e9b7bfa184216b");
                } else {
                    c.a(c.this, c.this.f, new a<com.meituan.msc.lib.interfaces.b>() { // from class: com.meituan.msc.common.framework.c.1.4
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.msc.common.framework.c.a
                        public final /* synthetic */ void a(com.meituan.msc.lib.interfaces.b bVar) {
                            com.meituan.msc.lib.interfaces.b bVar2 = bVar;
                            Object[] objArr3 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27f8bccb1e4466bb7a23e6351fa73d53", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27f8bccb1e4466bb7a23e6351fa73d53");
                            } else {
                                bVar2.b(str, iBinder);
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.msc.lib.interfaces.b
            public final void a(final String str, final String str2, final ViewGroup viewGroup) {
                Object[] objArr2 = {str, str2, viewGroup};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "741041a729cff778788b7a951067ca37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "741041a729cff778788b7a951067ca37");
                } else {
                    c.a(c.this, c.this.f, new a<com.meituan.msc.lib.interfaces.b>() { // from class: com.meituan.msc.common.framework.c.1.5
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.msc.common.framework.c.a
                        public final /* synthetic */ void a(com.meituan.msc.lib.interfaces.b bVar) {
                            com.meituan.msc.lib.interfaces.b bVar2 = bVar;
                            Object[] objArr3 = {bVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2f0f34deb690d75359f9ec5b43d12505", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2f0f34deb690d75359f9ec5b43d12505");
                            } else {
                                bVar2.a(str, str2, viewGroup);
                            }
                        }
                    });
                }
            }
        };
        this.c = new com.meituan.msc.lib.interfaces.a() { // from class: com.meituan.msc.common.framework.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.lib.interfaces.a
            public final void a(final String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fa1fd5904928adb4d51f621bc80f185", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fa1fd5904928adb4d51f621bc80f185");
                } else {
                    c.a(c.this, c.this.g, new a<com.meituan.msc.lib.interfaces.a>() { // from class: com.meituan.msc.common.framework.c.2.1
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.meituan.msc.common.framework.c.a
                        public final /* synthetic */ void a(com.meituan.msc.lib.interfaces.a aVar) {
                            com.meituan.msc.lib.interfaces.a aVar2 = aVar;
                            Object[] objArr3 = {aVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8afc6c6352e3afecae70fa04177bfd6e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8afc6c6352e3afecae70fa04177bfd6e");
                            } else {
                                aVar2.a(str);
                            }
                        }
                    });
                }
            }
        };
        this.d = new ConcurrentLinkedQueue();
        this.e = new b() { // from class: com.meituan.msc.common.framework.c.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.framework.b
            public final void a(final String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "579d97a22fb8991f041a9d1958f744af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "579d97a22fb8991f041a9d1958f744af");
                    return;
                }
                c.this.d.add(new m.a(str));
                c.a(c.this, c.this.h, new a<b>() { // from class: com.meituan.msc.common.framework.c.3.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // com.meituan.msc.common.framework.c.a
                    public final /* synthetic */ void a(b bVar) {
                        b bVar2 = bVar;
                        Object[] objArr3 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef71ed32c52e791f7903eedbe3822055", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef71ed32c52e791f7903eedbe3822055");
                        } else {
                            bVar2.a(str);
                        }
                    }
                });
            }
        };
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [T, java.lang.Object] */
    public static /* synthetic */ void a(c cVar, List list, a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "4a7b364a42cc3a667467495742b7cfea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "4a7b364a42cc3a667467495742b7cfea");
        } else if (f.a(list)) {
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

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3663cc158332c9aed8ec2ee945b3b9f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3663cc158332c9aed8ec2ee945b3b9f3");
        }
        if (i == null) {
            synchronized (c.class) {
                if (i == null) {
                    c cVar = new c();
                    i = cVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "0f791376fc9ac600b9ce1edce231420e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "0f791376fc9ac600b9ce1edce231420e");
                    } else {
                        cVar.f = com.sankuai.meituan.serviceloader.b.a(com.meituan.msc.lib.interfaces.b.class, (String) null);
                        cVar.g = com.sankuai.meituan.serviceloader.b.a(com.meituan.msc.lib.interfaces.a.class, (String) null);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812697cb55dda5ebd5fa6c64755723f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812697cb55dda5ebd5fa6c64755723f5");
            } else if (this.g != null) {
                a(this.g);
            }
        }
    }
}
