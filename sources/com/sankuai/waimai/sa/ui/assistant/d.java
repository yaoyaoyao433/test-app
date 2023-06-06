package com.sankuai.waimai.sa.ui.assistant;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.sa.net.retrofit.WaimaiSAService;
import com.sankuai.waimai.sa.ui.assistant.b;
import com.sankuai.waimai.sa.ui.assistant.chat.i;
import com.sankuai.waimai.sa.ui.assistant.chat.k;
import com.sankuai.waimai.sa.ui.assistant.chat.l;
import com.sankuai.waimai.sa.ui.assistant.chat.m;
import com.sankuai.waimai.sa.ui.assistant.voice.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements View.OnClickListener, b, i, l, m {
    public static ChangeQuickRedirect a;
    public final Activity b;
    public a c;
    public View d;
    public int e;
    public String f;
    public int g;
    public String h;
    public String i;
    public boolean j;
    private final String k;
    private final com.sankuai.waimai.sa.ui.assistant.voice.c l;
    private k m;
    private View n;
    private ViewGroup o;
    private int p;
    private int q;
    private View r;
    private b.a s;
    private com.sankuai.waimai.sa.ui.assistant.voice.b t;
    private ViewTreeObserver.OnGlobalLayoutListener u;
    private b.a v;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "c67015c9817b5edfa582b67fd453be91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "c67015c9817b5edfa582b67fd453be91");
        } else {
            dVar.p = dVar.d.getHeight();
        }
    }

    public static /* synthetic */ void a(d dVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "372fd3dfb895d959407abeb185aef277", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "372fd3dfb895d959407abeb185aef277");
        } else if (!p.f(dVar.b)) {
            com.sankuai.waimai.sa.ui.assistant.handler.a.a(dVar.m, null, dVar.b.getString(R.string.wm_smart_assistant_network_unavailable_tip));
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiSAService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiSAService.class)).getSACorrectResult(str), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.sa.model.d>>() { // from class: com.sankuai.waimai.sa.ui.assistant.d.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e0eaa24f58c4bf0717b77487d63241f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e0eaa24f58c4bf0717b77487d63241f");
                    } else if (baseResponse.code != 0) {
                        onError(null);
                    } else if (baseResponse.data != 0) {
                        d.this.t.a(3, false);
                        if (!TextUtils.isEmpty(((com.sankuai.waimai.sa.model.d) baseResponse.data).b)) {
                            d.a(d.this, ((com.sankuai.waimai.sa.model.d) baseResponse.data).b, ((com.sankuai.waimai.sa.model.d) baseResponse.data).c);
                        } else {
                            com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, null, d.this.b.getString(R.string.wm_smart_assistant_voice_error_info));
                        }
                        JudasManualManager.a("b_orxnpjde").a("c_6tg6wz4r").a("sa_enter_mode", "audio_mode").a();
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b4f55485848f4e51379ac457a3d64bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b4f55485848f4e51379ac457a3d64bd");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.a(th);
                    com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, null, d.this.b.getString(R.string.wm_smart_assistant_network_error_tip));
                    d.this.t.a(3, true);
                }
            }, dVar.k);
        }
    }

    public static /* synthetic */ void a(d dVar, final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "99fe1650ef9c200162c246f8731953e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "99fe1650ef9c200162c246f8731953e5");
            return;
        }
        dVar.j = false;
        dVar.a(b.a.CHAT);
        k kVar = dVar.m;
        Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.d.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe755728cd7fa028bf74540bbbb3d5eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe755728cd7fa028bf74540bbbb3d5eb");
                } else {
                    com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, d.this.n, d.this.b, str, str2, d.this.e, d.this.k);
                }
            }
        };
        Object[] objArr2 = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect2 = k.c;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "950c2d1f0aefee39006ff858cddc3ff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "950c2d1f0aefee39006ff858cddc3ff7");
        } else {
            kVar.a(str, null, runnable);
        }
    }

    public d(Activity activity, String str, com.sankuai.waimai.sa.ui.assistant.voice.c cVar) {
        Object[] objArr = {activity, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1348c78c15a79dbf45c6eac0be8b39b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1348c78c15a79dbf45c6eac0be8b39b");
            return;
        }
        this.p = 0;
        this.q = -1;
        this.s = b.a.CHAT;
        this.g = 1;
        this.h = "";
        this.i = "";
        this.j = true;
        this.u = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.sa.ui.assistant.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af904342db7ded576ef8017d4324f941", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af904342db7ded576ef8017d4324f941");
                    return;
                }
                if (d.this.j) {
                    d.a(d.this);
                }
                int height = d.this.d.getHeight();
                if (height == d.this.q) {
                    return;
                }
                if (height >= d.this.p) {
                    if (height == d.this.p) {
                        d.this.a(b.a.CHAT);
                    }
                } else {
                    d.this.a(b.a.INPUT);
                    k kVar = d.this.m;
                    int a2 = height - g.a(d.this.b, 32.0f);
                    Object[] objArr3 = {Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect3 = k.c;
                    if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "4897112d919edc01c2bbc02754492b16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "4897112d919edc01c2bbc02754492b16");
                    } else {
                        com.sankuai.waimai.sa.ui.assistant.adapter.b bVar = kVar.j;
                        Object[] objArr4 = {Integer.valueOf(a2)};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.sa.ui.assistant.adapter.b.a;
                        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "839bd47de205e472c906fb84f123e74b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "839bd47de205e472c906fb84f123e74b");
                        } else {
                            bVar.c = Math.min(a2, bVar.c);
                        }
                    }
                }
                d.this.q = height;
            }
        };
        this.v = new b.a() { // from class: com.sankuai.waimai.sa.ui.assistant.d.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a611dedb012f0ffd8b88c8e7f905f12", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a611dedb012f0ffd8b88c8e7f905f12");
                } else if (d.this.n == null) {
                } else {
                    d.this.n.postDelayed(new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.d.6.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f37a8820384e8a4d9f1cf95fade1021", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f37a8820384e8a4d9f1cf95fade1021");
                            } else if (d.this.m != null) {
                                d.this.m.a();
                            }
                        }
                    }, 50L);
                }
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.b.a
            public final void a(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f0f9d432abf6f100dc2906aeeae3ee1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f0f9d432abf6f100dc2906aeeae3ee1");
                    return;
                }
                d.this.r.setVisibility(8);
                d.a(d.this, str2, null);
                JudasManualManager.a("b_orxnpjde").a("c_6tg6wz4r").a("sa_enter_mode", "text_mode").a();
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.b.a
            public final void b(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "126ef42807afd99f87b620c592e3e8c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "126ef42807afd99f87b620c592e3e8c0");
                } else {
                    d.a(d.this, str2, null);
                }
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.b.a
            public final void c(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85edcdfad6179732cb8f3a9c67c69eae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85edcdfad6179732cb8f3a9c67c69eae");
                } else {
                    d.a(d.this, str2);
                }
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.b.a
            public final boolean b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de2137ad2ca79127c79e350b1b198e65", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de2137ad2ca79127c79e350b1b198e65")).booleanValue();
                }
                if (p.f(d.this.b)) {
                    return true;
                }
                com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, "", d.this.b.getString(R.string.wm_smart_assistant_network_unavailable_tip));
                return false;
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.b.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a95ecd45fba25011a1a3d01a7ac7abe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a95ecd45fba25011a1a3d01a7ac7abe");
                } else {
                    com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, "", d.this.b.getString(R.string.wm_smart_assistant_error_info));
                }
            }
        };
        this.b = activity;
        this.k = str;
        this.l = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451f80478dfaf19e8d04f98ba0198fd6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451f80478dfaf19e8d04f98ba0198fd6");
        } else if (view.getId() == R.id.content_container) {
            this.j = false;
            a(b.a.CHAT);
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.m
    public final void a(final com.sankuai.waimai.sa.model.g gVar, boolean z) {
        Object[] objArr = {gVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad6f9464ca2817a158d3cc852f6ac4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad6f9464ca2817a158d3cc852f6ac4b");
            return;
        }
        this.m.b();
        if (!TextUtils.isEmpty(gVar.d)) {
            this.c.b(gVar.d);
        } else if (this.m != null) {
            this.m.a(gVar.a, gVar.e, new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e0099aaa629c87ad45a19926f894c1d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e0099aaa629c87ad45a19926f894c1d");
                    } else {
                        com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, d.this.n, d.this.b, gVar.a, gVar.e, d.this.e, d.this.k);
                    }
                }
            });
        }
        JudasManualManager.a("b_pb2k5ign").a("c_6tg6wz4r").a();
    }

    public final void a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f2d163a77459631db144ad3e85ff01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f2d163a77459631db144ad3e85ff01");
            return;
        }
        this.s = aVar;
        a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cedc6586cff0b0ad134d622c0a5e1a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cedc6586cff0b0ad134d622c0a5e1a3");
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(-15593458);
        }
        this.n = this.b.findViewById(R.id.sa_input_container);
        this.o = (ViewGroup) this.b.findViewById(R.id.content_container);
        this.b.getWindow().setBackgroundDrawable(new ColorDrawable(-14869219));
        this.d.getViewTreeObserver().addOnGlobalLayoutListener(this.u);
        this.r = this.b.findViewById(R.id.sa_chat_input_mask);
        this.r.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.sa.ui.assistant.d.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c501bd0975e0abf5fb54a1987f00aa5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c501bd0975e0abf5fb54a1987f00aa5")).booleanValue();
                }
                d.this.r.setVisibility(8);
                d.this.j = false;
                d.this.a(b.a.CHAT);
                return false;
            }
        });
        View view = this.d;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "563f4347720719a47b8412e58819328e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "563f4347720719a47b8412e58819328e");
        } else {
            this.t = new com.sankuai.waimai.sa.ui.assistant.voice.b(this.b, this.l, this);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.sa_input_container);
            viewGroup.addView(this.t.a(viewGroup));
            this.t.j = this.v;
            com.sankuai.waimai.sa.ui.assistant.voice.b bVar = this.t;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.sa.ui.assistant.voice.b.c;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "506355516e1be38318b7ec5337eace02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "506355516e1be38318b7ec5337eace02");
            } else {
                bVar.i.setTextColor(1301911961);
                bVar.i.setBackgroundResource(R.drawable.wm_smart_assistant_send_button_white_background);
            }
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiSAService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiSAService.class)).postFeedbacklUrl(this.e), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.sa.ui.assistant.d.4
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                Object[] objArr4 = {(BaseResponse) obj};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d49168d3612d8091afe6c000345261fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d49168d3612d8091afe6c000345261fe");
                    return;
                }
                d.this.a();
                if (p.f(activity)) {
                    if (d.this.e == 1 && !TextUtils.isEmpty(d.this.f)) {
                        com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, d.this.n, d.this.b, d.this.f, null, d.this.e, d.this.k);
                        d.this.e = 0;
                        return;
                    }
                    com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, d.this.n, d.this.b, "", d.this.h, d.this.e, d.this.k);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr4 = {th};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d4818d740eb8fe4a014efb072376378d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d4818d740eb8fe4a014efb072376378d");
                } else {
                    d.this.a();
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
            public final void onCompleted() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7094eea8aa426e0fb5b85e90e4fd6dfe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7094eea8aa426e0fb5b85e90e4fd6dfe");
                } else {
                    super.onCompleted();
                }
            }
        }, this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a6a7a3940d3f70ed05f239ba243f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a6a7a3940d3f70ed05f239ba243f0f");
            return;
        }
        this.n.setVisibility(0);
        this.t.a(Boolean.valueOf(this.s == b.a.INPUT));
        b(this.s == b.a.CHAT || this.s == b.a.INPUT);
        a(this.s == b.a.INPUT);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0483655fbff61e4e614cfddbe83ba778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0483655fbff61e4e614cfddbe83ba778");
        } else {
            this.t.b(z);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9a5a6faf18b3a49fe2e2f4c403c8fd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9a5a6faf18b3a49fe2e2f4c403c8fd9");
            return;
        }
        if (this.m == null) {
            this.m = new k(this.b, this.c, this, this.k);
            this.m.r = this.h;
            this.o.addView(this.m.a(this.o));
            this.m.i = this;
            this.m.o = this;
            this.n.setEnabled(false);
            if (!p.f(this.b)) {
                com.sankuai.waimai.sa.ui.assistant.handler.a.a(this.m, null, this.b.getString(R.string.wm_smart_assistant_network_unavailable_tip));
            } else if (this.g == 0 && !TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.i)) {
                com.sankuai.waimai.sa.ui.assistant.handler.a.a(this.m, this.n, this.b, this.i, this.h, this.e, this.k);
            }
        }
        this.m.a(z);
        boolean z2 = this.s == b.a.INPUT;
        this.m.b(z2);
        if (z2) {
            this.r.setVisibility(0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26ff0144af197058d0453710e4776ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26ff0144af197058d0453710e4776ef");
            return;
        }
        com.sankuai.waimai.sa.ui.assistant.voice.b bVar = this.t;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.sa.ui.assistant.voice.b.c;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "510f6b9667bc80f0e942de5a8b8dfbc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "510f6b9667bc80f0e942de5a8b8dfbc4");
            return;
        }
        if (bVar.n == 0) {
            bVar.b();
            com.sankuai.waimai.sa.ui.assistant.voice.d dVar = bVar.m;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.sa.ui.assistant.voice.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "422a904e2e1b7b774e51525b236fddc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "422a904e2e1b7b774e51525b236fddc8");
            } else if (dVar.d != null) {
                dVar.d.setVisibility(8);
            }
        }
        if (bVar.f != null) {
            bVar.f.cancel();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "339ea30144db0dae2befc141dd0feab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "339ea30144db0dae2befc141dd0feab1");
        } else if (this.l != null) {
            this.l.c();
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.l
    public final void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55dfe7e3bce9eb51097554861c1edc30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55dfe7e3bce9eb51097554861c1edc30");
        } else if (this.m != null) {
            this.m.a(str, str2, new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.d.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6f2125e56f2c55787562fcf20423886", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6f2125e56f2c55787562fcf20423886");
                    } else {
                        com.sankuai.waimai.sa.ui.assistant.handler.a.a(d.this.m, d.this.n, d.this.b, str, str2, d.this.e, d.this.k);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.i
    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac91b51b3087e8628dd4b04f69617816", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac91b51b3087e8628dd4b04f69617816");
        } else {
            a(str, str2);
        }
    }

    public final void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26b558f49f374995f9d4f078ba2f1ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26b558f49f374995f9d4f078ba2f1ce");
        } else if (this.n == null) {
        } else {
            this.n.setBackgroundColor(Color.parseColor("#f2eef1f4"));
        }
    }
}
