package com.sankuai.waimai.irmo.mach.vap;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.irmo.resource.video.a;
import com.sankuai.waimai.irmo.utils.h;
import com.sankuai.waimai.mach.Mach;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<View> {
    public static ChangeQuickRedirect a;
    public e b;
    public c c;
    private com.sankuai.waimai.irmo.resource.video.a d;
    private VapAnimLoadManager e;
    private long f;
    private boolean g;
    private final C0972a h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f439e7d6d1e666ab6545af8f421df1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f439e7d6d1e666ab6545af8f421df1");
        } else {
            this.h = new C0972a(this);
        }
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1bcde020ee2235c1109da720ddcf6415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1bcde020ee2235c1109da720ddcf6415");
        } else if (aVar.b == null || aVar.c == null) {
        } else {
            aVar.c.a();
        }
    }

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f545b26a33ed2f777d06c26eadffbca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f545b26a33ed2f777d06c26eadffbca5");
        } else if (aVar.b == null || aVar.c == null) {
        } else {
            c cVar = aVar.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "07ee63af4f6c9bd108a587707008a246", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "07ee63af4f6c9bd108a587707008a246");
                return;
            }
            b bVar = cVar.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.b;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "132a0b75fda2851834a6210dd4422fcc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "132a0b75fda2851834a6210dd4422fcc");
            } else if (bVar.g) {
            } else {
                bVar.d();
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0414e5ede16d13cacd5a2034135d924b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0414e5ede16d13cacd5a2034135d924b");
        }
        this.g = true;
        return new c(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e4e4f0ad6c700ea35015f821f640ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e4e4f0ad6c700ea35015f821f640ba");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("AnimViewComponent", "onBind", new Object[0]);
        this.b = new e(k());
        this.d = new com.sankuai.waimai.irmo.resource.video.a(this.b);
        g.a().a(this);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea82b9a5f8435ac4aa2b0deae52d15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea82b9a5f8435ac4aa2b0deae52d15b");
            return;
        }
        super.a((a) view);
        this.c = (c) view;
        c cVar = this.c;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "640e59b2b6ba584345cc5aafff4b04ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "640e59b2b6ba584345cc5aafff4b04ad");
        } else if (this.b != null && cVar != null) {
            Mach mach = this.m;
            e eVar = this.b;
            Object[] objArr3 = {mach, eVar};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "6b08070c57379d44ccd4182631afbc75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "6b08070c57379d44ccd4182631afbc75");
            } else {
                cVar.d = eVar;
                b bVar = cVar.b;
                Object[] objArr4 = {mach, eVar};
                ChangeQuickRedirect changeQuickRedirect4 = b.b;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "819c1df896595e9547489510bcf06493", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "819c1df896595e9547489510bcf06493");
                } else {
                    bVar.d = new WeakReference<>(mach);
                    bVar.c = eVar;
                    com.sankuai.meituan.animplayer.b bVar2 = new com.sankuai.meituan.animplayer.b(null);
                    bVar2.c = false;
                    bVar2.e = false;
                    bVar.setConfig(bVar2);
                    bVar.setPlayCount(eVar.a);
                    bVar.setContentMode(eVar.e);
                    bVar.setAnimPlayerListener(bVar);
                }
            }
        }
        c cVar2 = this.c;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = c.a;
        if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "c42eb69fb22614fbd0bb44e912a83ae0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "c42eb69fb22614fbd0bb44e912a83ae0")).booleanValue() : cVar2.b.e) {
            return;
        }
        c cVar3 = this.c;
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = c.a;
        if (PatchProxy.isSupport(objArr6, cVar3, changeQuickRedirect6, false, "ea16ba19e1fe064f225b97e989b60918", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, cVar3, changeQuickRedirect6, false, "ea16ba19e1fe064f225b97e989b60918")).booleanValue() : cVar3.b.f) {
            return;
        }
        c cVar4 = this.c;
        Object[] objArr7 = {cVar4};
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (!PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f978bb5c0429995472deb84a1e168fa1", RobustBitConfig.DEFAULT_VALUE)) {
            if (this.b != null && cVar4 != null) {
                switch (this.b.c) {
                    case 0:
                        cVar4.b();
                        break;
                    case 1:
                        if (com.sankuai.waimai.irmo.resource.a.a().e()) {
                            b(cVar4);
                            break;
                        } else {
                            a(cVar4);
                            break;
                        }
                    case 2:
                        cVar4.a();
                        break;
                    case 3:
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = c.a;
                        if (!PatchProxy.isSupport(objArr8, cVar4, changeQuickRedirect8, false, "9b00e7017be673320444d0a0b25a7bc9", RobustBitConfig.DEFAULT_VALUE)) {
                            cVar4.b.d();
                            break;
                        } else {
                            PatchProxy.accessDispatch(objArr8, cVar4, changeQuickRedirect8, false, "9b00e7017be673320444d0a0b25a7bc9");
                            break;
                        }
                }
            }
        } else {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f978bb5c0429995472deb84a1e168fa1");
        }
        this.f = SystemClock.elapsedRealtime();
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = a;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "cb9ade567f0b9c425f491e83c51f5995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "cb9ade567f0b9c425f491e83c51f5995");
            return;
        }
        Mach mach2 = this.m;
        if (mach2 != null) {
            Activity activity = mach2.getActivity();
            com.sankuai.waimai.foundation.utils.log.a.c("AnimViewComponent", "registerAttachedActivityLifecycle -> attachedActivity: " + activity, new Object[0]);
            if (activity != null) {
                C0972a c0972a = this.h;
                Object[] objArr10 = {activity};
                ChangeQuickRedirect changeQuickRedirect10 = C0972a.b;
                if (PatchProxy.isSupport(objArr10, c0972a, changeQuickRedirect10, false, "52efc9550765fc4daa0abed9336e1842", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, c0972a, changeQuickRedirect10, false, "52efc9550765fc4daa0abed9336e1842");
                } else {
                    c0972a.d = new WeakReference<>(activity);
                }
                activity.getApplication().registerActivityLifecycleCallbacks(this.h);
            }
        }
    }

    private void b(final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7552d7f84d3a8b172271c4880d79a8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7552d7f84d3a8b172271c4880d79a8a");
            return;
        }
        com.sankuai.waimai.irmo.utils.d.e("DD 方式打点 开始Start ", new Object[0]);
        com.sankuai.waimai.irmo.mach.c.a(this.b.m, 1, "EffectRenderStart", (Number) 1, true);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.d.a(new a.InterfaceC0978a() { // from class: com.sankuai.waimai.irmo.mach.vap.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.irmo.resource.video.a.InterfaceC0978a
            public final void a(String str, final String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4323bf3ad4b9694054f07e502ec85cbf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4323bf3ad4b9694054f07e502ec85cbf");
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                com.sankuai.waimai.irmo.utils.d.e(" DDD 加载耗时: " + elapsedRealtime2, new Object[0]);
                float f = (float) elapsedRealtime2;
                String str3 = a.this.b != null ? a.this.b.l : "";
                Object[] objArr3 = {Float.valueOf(f), str3, "1000"};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.mach.c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6e75df591185aacae22245268417b0f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6e75df591185aacae22245268417b0f5");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("EffectPreloadTime", Float.valueOf(f));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", str3);
                    hashMap2.put("effectType", "1000");
                    com.sankuai.waimai.irmo.mach.c.a(hashMap, hashMap2);
                }
                c cVar2 = cVar;
                Object[] objArr4 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "fb50ef7839a5395462c71fa8059f76dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "fb50ef7839a5395462c71fa8059f76dd");
                } else {
                    final b bVar = cVar2.b;
                    Object[] objArr5 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect5 = b.b;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "26ed6722d87dec1d3d6f976c4d59e9a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "26ed6722d87dec1d3d6f976c4d59e9a6");
                    } else {
                        Object[] objArr6 = {str2};
                        ChangeQuickRedirect changeQuickRedirect6 = b.b;
                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "ee1264bc526342a2914b210ff060a345", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "ee1264bc526342a2914b210ff060a345");
                        } else if (!TextUtils.isEmpty(str2)) {
                            com.sankuai.waimai.foundation.utils.log.a.c("MachAnimVideoView", "addFirstFrameImage path:" + str2, new Object[0]);
                            h.a(new Runnable() { // from class: com.sankuai.waimai.irmo.mach.vap.b.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a883ca27b48233a82b391b6e87988614", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a883ca27b48233a82b391b6e87988614");
                                    } else if (b.this.m != null) {
                                        b.this.m.setVisibility(0);
                                    } else {
                                        b.this.m = new ImageView(b.this.getContext());
                                        b.this.m.setLayoutParams(b.this.getLayoutParams());
                                        ViewGroup viewGroup = (ViewGroup) b.this.getParent();
                                        viewGroup.addView(b.this.m, viewGroup.indexOfChild(b.this));
                                        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                                        c.b = b.this.getContext();
                                        c.b(str2).a(b.this.m);
                                    }
                                }
                            }, "addFirstFrameImage");
                        }
                        bVar.a(str);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        cVar2.c.a(cVar2.d, new File(str));
                    }
                }
                com.sankuai.waimai.irmo.mach.c.b(true, a.this.b != null ? a.this.b.l : "", 0, "1000");
            }

            @Override // com.sankuai.waimai.irmo.resource.video.a.InterfaceC0978a
            public final void a(int i, Throwable th) {
                Object[] objArr2 = {Integer.valueOf(i), th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85374a8fe85927935fcbc215e580b023", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85374a8fe85927935fcbc215e580b023");
                    return;
                }
                StringBuilder sb = new StringBuilder("resFailed,code: ");
                sb.append(i);
                sb.append(" message: ");
                sb.append(th != null ? th.getMessage() : "");
                com.sankuai.waimai.irmo.utils.d.e(sb.toString(), new Object[0]);
                a.this.a(cVar);
                com.sankuai.waimai.irmo.mach.c.b(false, a.this.b != null ? a.this.b.l : "", i, "1000");
            }
        });
    }

    void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d0a89f795e03d6a35d5119a996e2d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d0a89f795e03d6a35d5119a996e2d5");
        } else if (cVar == null) {
        } else {
            com.sankuai.waimai.irmo.utils.d.e("URL 方式打点 开始Start ", new Object[0]);
            com.sankuai.waimai.irmo.mach.c.a(this.b.m, 1, "EffectRenderStart", (Number) 1, false);
            if (this.b == null || this.b.m == null) {
                cVar.f();
                return;
            }
            String str = this.b.m;
            if (this.e == null) {
                this.e = new VapAnimLoadManager(str);
            }
            this.e.a(cVar);
            this.e.a(str);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e431d2fdac874173a2ee106c075a2e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e431d2fdac874173a2ee106c075a2e13");
            return;
        }
        super.b();
        com.sankuai.waimai.foundation.utils.log.a.c("AnimViewComponent", "onUnbind", new Object[0]);
        if (this.c != null) {
            c cVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "cafd69b08aefdeca234792aba423696d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "cafd69b08aefdeca234792aba423696d");
            } else {
                cVar.b.b();
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a82e088ece87e8cb7cc88e0120fb5be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a82e088ece87e8cb7cc88e0120fb5be");
        } else {
            Mach mach = this.m;
            if (mach != null) {
                Activity activity = mach.getActivity();
                com.sankuai.waimai.foundation.utils.log.a.c("AnimViewComponent", "unregisterAttachedActivityLifecycle -> attachedActivity: " + activity, new Object[0]);
                if (activity != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this.h);
                }
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b7f08391e352eceeb539918ebc5ea921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b7f08391e352eceeb539918ebc5ea921");
        } else if (this.g) {
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.f)) / 1000.0f;
            String a2 = com.sankuai.waimai.irmo.mach.c.a(this.b);
            Object[] objArr5 = {a2, 1, Float.valueOf(elapsedRealtime)};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.irmo.mach.c.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "6f0a7da8fe2357837e43fa00135b10f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "6f0a7da8fe2357837e43fa00135b10f5");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("EffectRenderTime", Float.valueOf(elapsedRealtime));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("vapType", "1");
            hashMap2.put("effectType", "1000");
            hashMap2.put("url", a2);
            hashMap2.put("templateId", g.a().b);
            com.sankuai.waimai.irmo.mach.c.a(hashMap, hashMap2);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5a85b7f7e33ba2cd126f721c0fb1a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5a85b7f7e33ba2cd126f721c0fb1a9");
        } else if (this.b == null || this.c == null) {
        } else {
            this.c.c();
            if (com.sankuai.waimai.irmo.resource.a.a().e()) {
                b(this.c);
            } else {
                a(this.c);
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "773d5d23254c382566801cffb7702f86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "773d5d23254c382566801cffb7702f86");
        } else if (this.b == null || this.c == null) {
        } else {
            this.c.b();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.mach.vap.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0972a extends com.sankuai.waimai.irmo.mach.effect.mgr.a {
        public static ChangeQuickRedirect b;
        public WeakReference<a> c;
        public WeakReference<Activity> d;

        public C0972a(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aee0d337562c88eb75e6e9b57268709", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aee0d337562c88eb75e6e9b57268709");
            } else {
                this.c = new WeakReference<>(aVar);
            }
        }

        @Override // com.sankuai.waimai.irmo.mach.effect.mgr.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b498ef2c32954d9d21d09d6457be56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b498ef2c32954d9d21d09d6457be56");
            } else {
                a(activity, false);
            }
        }

        @Override // com.sankuai.waimai.irmo.mach.effect.mgr.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff97743495ea466000c6d681ff954b72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff97743495ea466000c6d681ff954b72");
            } else {
                a(activity, true);
            }
        }

        private void a(Activity activity, boolean z) {
            Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4604492e5909a7a84ceec0ded7ca9929", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4604492e5909a7a84ceec0ded7ca9929");
                return;
            }
            Activity activity2 = this.d == null ? null : this.d.get();
            com.sankuai.waimai.foundation.utils.log.a.c("AnimViewComponent", "pauseOrResume -> curActivity: " + activity + ", attachedActivity: " + activity2 + ",isPause:" + z, new Object[0]);
            a aVar = this.c != null ? this.c.get() : null;
            if (activity != activity2 || aVar == null) {
                return;
            }
            if (z) {
                a.a(aVar);
            } else {
                a.b(aVar);
            }
        }
    }
}
