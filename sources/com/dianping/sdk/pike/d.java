package com.dianping.sdk.pike;

import android.content.Context;
import com.dianping.sdk.pike.packet.ae;
import com.dianping.sdk.pike.service.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends c implements com.dianping.sdk.pike.service.b {
    public static ChangeQuickRedirect q;
    public com.dianping.sdk.pike.message.b r;
    public com.dianping.sdk.pike.message.b s;
    int t;

    public static /* synthetic */ void a(d dVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "8199b88d88012ca0eb69602740682c22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "8199b88d88012ca0eb69602740682c22");
            return;
        }
        try {
            i.a("PikeClient", "recv push message, bzId: " + dVar.c.a + " messageId: " + ((com.dianping.sdk.pike.message.e) list.get(0)).h);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static d a(Context context, e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54895fa9126efc87db1d45e2ebcbc4a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54895fa9126efc87db1d45e2ebcbc4a0");
        }
        if (context == null || eVar == null) {
            return null;
        }
        return new d(context, eVar);
    }

    private d(Context context, e eVar) {
        super(context, eVar);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4284c65df76adc371f2bc146bdac8ecc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4284c65df76adc371f2bc146bdac8ecc");
        } else {
            this.t = 0;
        }
    }

    public final void a(com.dianping.sdk.pike.message.b bVar) {
        this.r = bVar;
    }

    public final void a(final com.dianping.sdk.pike.message.g gVar, final a aVar) {
        Object[] objArr = {gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f9778d993bbcc7a6ba7b6a0c6e10c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f9778d993bbcc7a6ba7b6a0c6e10c5");
        } else if (a(aVar)) {
            if (com.dianping.nvtunnelkit.utils.f.a(gVar.b)) {
                a(aVar, -32, "you should set an alias to send.");
                return;
            }
            Object[] objArr2 = {gVar, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = q;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ef2a47fb660ac88c2299b72ef6d96a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ef2a47fb660ac88c2299b72ef6d96a8");
            } else {
                a(new Runnable() { // from class: com.dianping.sdk.pike.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ccbdb1fead96261ff7d3c0cb53170cb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ccbdb1fead96261ff7d3c0cb53170cb");
                            return;
                        }
                        ae aeVar = new ae();
                        aeVar.g = gVar.b;
                        aeVar.e = d.this.c.a;
                        aeVar.b = gVar.c;
                        aeVar.f = gVar.h;
                        d.this.a(aeVar, gVar.d, gVar.e, new a() { // from class: com.dianping.sdk.pike.d.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.dianping.sdk.pike.a
                            public final void a(String str) {
                                Object[] objArr4 = {str};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e645bed322e89b770e8b00c1f6884e69", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e645bed322e89b770e8b00c1f6884e69");
                                    return;
                                }
                                d.this.t = 0;
                                if (aVar != null) {
                                    aVar.a(str);
                                }
                            }

                            @Override // com.dianping.sdk.pike.a
                            public final void a(int i, String str) {
                                Object[] objArr4 = {Integer.valueOf(i), str};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3a0538e6a569eebeec6450f4947e20b0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3a0538e6a569eebeec6450f4947e20b0");
                                    return;
                                }
                                if (i == -64) {
                                    d.this.t++;
                                }
                                if (f.z > 0 && d.this.t >= f.z) {
                                    d.this.d.h();
                                    d.this.t = 0;
                                    i.a("PikeClient", "send message fail trigger reset tunnel");
                                }
                                if (aVar != null) {
                                    aVar.a(i, str);
                                }
                            }
                        });
                    }
                }, aVar);
            }
        }
    }

    @Override // com.dianping.sdk.pike.service.b
    public final void a(List<com.dianping.sdk.pike.message.e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b31a2b80b7d27be4d3c4fb6a100d3fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b31a2b80b7d27be4d3c4fb6a100d3fa");
        } else {
            a(this.r, list);
        }
    }

    @Override // com.dianping.sdk.pike.service.b
    public final void b(List<com.dianping.sdk.pike.message.e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a10991f82d4b6a8764f2fd2056613b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a10991f82d4b6a8764f2fd2056613b1");
        } else {
            a(this.s, list);
        }
    }

    private void a(final com.dianping.sdk.pike.message.b bVar, final List<com.dianping.sdk.pike.message.e> list) {
        Object[] objArr = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5740e4ce2974f9033f32c3e8f9671567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5740e4ce2974f9033f32c3e8f9671567");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.dianping.sdk.pike.d.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "281f0c1ebfe35f64fa3a93c5d3991966", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "281f0c1ebfe35f64fa3a93c5d3991966");
                } else if (bVar != null) {
                    d.a(d.this, list);
                    bVar.a(list);
                }
            }
        };
        if (this.c.d != null) {
            this.c.d.execute(runnable);
        } else {
            com.dianping.sdk.pike.service.c.a().a(runnable);
        }
    }

    @Override // com.dianping.sdk.pike.c
    public final void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17c9a444f954e38a3545ecd95b4dfc87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17c9a444f954e38a3545ecd95b4dfc87");
        } else if (this.d != null) {
            final r rVar = this.d.j;
            Object[] objArr2 = {str, this};
            ChangeQuickRedirect changeQuickRedirect2 = r.a;
            if (PatchProxy.isSupport(objArr2, rVar, changeQuickRedirect2, false, "2a1db2e99a77143a1ca6343c95e6f231", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, rVar, changeQuickRedirect2, false, "2a1db2e99a77143a1ca6343c95e6f231");
            } else if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            } else {
                rVar.b.a(new Runnable() { // from class: com.dianping.sdk.pike.service.r.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        List<b> arrayList;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d53b5e4c09eb4a020768caedecd4390a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d53b5e4c09eb4a020768caedecd4390a");
                            return;
                        }
                        if (r.this.d.containsKey(str)) {
                            com.dianping.sdk.pike.i.a("ReceiverManager", "bizId: " + str + " receiver registered, do overwrite the previous.");
                            arrayList = r.this.d.get(str);
                        } else {
                            arrayList = new ArrayList<>();
                            r.this.d.put(str, arrayList);
                        }
                        if (arrayList.contains(this)) {
                            return;
                        }
                        arrayList.add(this);
                    }
                });
            }
        }
    }

    @Override // com.dianping.sdk.pike.c
    public final void c(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c72ab8d78895fd3a5f965393cedc4b8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c72ab8d78895fd3a5f965393cedc4b8c");
        } else if (this.d != null) {
            final r rVar = this.d.j;
            Object[] objArr2 = {str, this};
            ChangeQuickRedirect changeQuickRedirect2 = r.a;
            if (PatchProxy.isSupport(objArr2, rVar, changeQuickRedirect2, false, "1ff4948d88ad563a60f6bdb98c83b3ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, rVar, changeQuickRedirect2, false, "1ff4948d88ad563a60f6bdb98c83b3ee");
            } else if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            } else {
                rVar.b.a(new Runnable() { // from class: com.dianping.sdk.pike.service.r.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "82e00b067b2483c9afded4c239922faf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "82e00b067b2483c9afded4c239922faf");
                            return;
                        }
                        List<b> list = r.this.d.get(str);
                        if (list != null) {
                            list.remove(this);
                            if (list.isEmpty()) {
                                r.this.d.remove(str);
                            }
                        }
                    }
                });
            }
        }
    }
}
