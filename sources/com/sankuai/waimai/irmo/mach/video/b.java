package com.sankuai.waimai.irmo.mach.video;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.vap.g;
import com.sankuai.waimai.mach.Mach;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.sankuai.waimai.mach.component.base.a<View> implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private c b;
    private long c;
    private WeakReference<Activity> d;
    private a e;
    private boolean f;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9308c1cb92c9c298ed4d4872977f099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9308c1cb92c9c298ed4d4872977f099");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb727cc304812cd1ea146609c0e29c1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb727cc304812cd1ea146609c0e29c1a");
        }
        this.f = true;
        return new a(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c787e2f38cb245227a3b11a78dc72ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c787e2f38cb245227a3b11a78dc72ec");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("VideoPlayerComponent", "onBind", new Object[0]);
        this.b = new c(k());
        g.a().a(this);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "607067dea33008fdda91f38827405052", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "607067dea33008fdda91f38827405052");
            return;
        }
        super.a((b) view);
        this.e = (a) view;
        if (this.e.e) {
            return;
        }
        a aVar = this.e;
        Mach mach = this.m;
        c cVar = this.b;
        Object[] objArr2 = {mach, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8bcc174ed203a637f5a34bdc83ac9149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8bcc174ed203a637f5a34bdc83ac9149");
        } else {
            aVar.d = new WeakReference<>(mach);
            aVar.c = cVar;
            if (cVar.m) {
                aVar.h.a();
            }
            aVar.h.a(cVar, (File) null);
        }
        a aVar2 = this.e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (!PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "b62db77d3f862abb64c7b1d2512e9031", RobustBitConfig.DEFAULT_VALUE)) {
            if (!aVar2.a()) {
                aVar2.a("failed", 0);
            } else {
                VideoPlayerParam videoPlayerParam = new VideoPlayerParam(aVar2.c.k);
                videoPlayerParam.a(aVar2.b.getContext(), (String) null);
                aVar2.b.setDataSource(videoPlayerParam);
                aVar2.b.setPlayStateCallback(aVar2);
                aVar2.setPlayCount(aVar2.c.a);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "db57ea028723b482edbee3691ff57497", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "db57ea028723b482edbee3691ff57497");
                } else {
                    int i = aVar2.c.e;
                    if (i == 0) {
                        aVar2.b.setDisplayMode(5);
                    } else if (i == 2) {
                        aVar2.b.setDisplayMode(1);
                    } else {
                        aVar2.b.setDisplayMode(0);
                    }
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (!PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "eb31e2244fa10fa07f659005e0852dd2", RobustBitConfig.DEFAULT_VALUE)) {
                    if (aVar2.c != null) {
                        switch (aVar2.c.c) {
                            case 0:
                                aVar2.b.f();
                                break;
                            case 1:
                                if (aVar2.f != 0) {
                                    aVar2.b.c();
                                    com.sankuai.waimai.irmo.mach.c.a(aVar2.c.k, "EffectRenderStart", (Number) 1);
                                    break;
                                }
                                break;
                            case 2:
                                aVar2.b.d();
                                break;
                            case 3:
                                aVar2.b.c();
                                break;
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "eb31e2244fa10fa07f659005e0852dd2");
                }
            }
        } else {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "b62db77d3f862abb64c7b1d2512e9031");
        }
        this.c = SystemClock.elapsedRealtime();
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "342ce9485cf5408cb822036fa447daf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "342ce9485cf5408cb822036fa447daf1");
            return;
        }
        Mach mach2 = this.m;
        if (mach2 != null) {
            Activity activity = mach2.getActivity();
            com.sankuai.waimai.foundation.utils.log.a.c("VideoPlayerComponent", "registerAttachedActivityLifecycle -> attachedActivity: " + activity, new Object[0]);
            if (activity != null) {
                this.d = new WeakReference<>(activity);
                activity.getApplication().registerActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224a8f043692eefd2c81874265e37765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224a8f043692eefd2c81874265e37765");
            return;
        }
        super.b();
        com.sankuai.waimai.foundation.utils.log.a.c("VideoPlayerComponent", "onUnbind", new Object[0]);
        if (this.e != null) {
            a aVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "26880ab473fedb69e21b3f7a071ce80a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "26880ab473fedb69e21b3f7a071ce80a");
            } else {
                aVar.b.g();
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4679c9c767c1bef46062160945920501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4679c9c767c1bef46062160945920501");
        } else {
            Mach mach = this.m;
            if (mach != null) {
                Activity activity = mach.getActivity();
                com.sankuai.waimai.foundation.utils.log.a.c("VideoPlayerComponent", "unregisterAttachedActivityLifecycle -> attachedActivity: " + activity, new Object[0]);
                if (activity != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                }
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1a28b5177e37814f40360fd52af5b8bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1a28b5177e37814f40360fd52af5b8bb");
        } else if (this.f) {
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.c)) / 1000.0f;
            String a2 = com.sankuai.waimai.irmo.mach.c.a(this.b);
            Object[] objArr5 = {a2, Float.valueOf(elapsedRealtime)};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.irmo.mach.c.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "54c964027bc606e838e24f3be18a8534", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "54c964027bc606e838e24f3be18a8534");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("EffectRenderTime", Float.valueOf(elapsedRealtime));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("effectType", "1005");
            hashMap2.put("url", a2);
            hashMap2.put("templateId", g.a().b);
            com.sankuai.waimai.irmo.mach.c.a(hashMap, hashMap2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59bdcc5eb4696c1ea11d0f87e12a21df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59bdcc5eb4696c1ea11d0f87e12a21df");
            return;
        }
        Activity activity2 = this.d == null ? null : this.d.get();
        com.sankuai.waimai.foundation.utils.log.a.c("VideoPlayerComponent", "onActivityResumed -> curActivity: " + activity + ", attachedActivity: " + activity2, new Object[0]);
        if (activity == activity2) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a311a8036834748133db8b42534ff334", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a311a8036834748133db8b42534ff334");
            } else if (this.b == null || this.e == null) {
            } else {
                a aVar = this.e;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "f331307b0538501b707d1e9f4088a4cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "f331307b0538501b707d1e9f4088a4cb");
                } else if (aVar.g) {
                } else {
                    aVar.c();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89b5e1f78e03cd01154627ff5cab7c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89b5e1f78e03cd01154627ff5cab7c5");
            return;
        }
        Activity activity2 = this.d == null ? null : this.d.get();
        com.sankuai.waimai.foundation.utils.log.a.c("VideoPlayerComponent", "onActivityPaused -> curActivity: " + activity + ", attachedActivity: " + activity2, new Object[0]);
        if (activity == activity2) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2464757d95566b6aa7f84293ba824b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2464757d95566b6aa7f84293ba824b8");
            } else if (this.b == null || this.e == null) {
            } else {
                this.e.b();
            }
        }
    }
}
