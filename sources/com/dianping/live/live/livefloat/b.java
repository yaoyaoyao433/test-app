package com.dianping.live.live.livefloat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.support.constraint.R;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dianping.imagemanager.DPImageView;
import com.dianping.live.live.mrn.MLivePlayerView;
import com.dianping.live.live.mrn.MLivePusherView;
import com.dianping.live.live.mrn.d;
import com.dianping.live.live.mrn.h;
import com.dianping.live.live.utils.NetWorkStateReceiver;
import com.dianping.live.live.utils.j;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.pusher.library.f;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b extends c {
    public static ChangeQuickRedirect a;
    public static int d;
    public static int e;
    private String F;
    private WindowManager.LayoutParams G;
    private WindowManager H;
    private a I;
    private HashMap J;
    private HashMap K;
    private HashMap L;
    private ArrayList<HashMap> M;
    private int N;
    private int O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private NetWorkStateReceiver V;
    private boolean W;
    private boolean aa;
    private boolean ab;
    private TextView ac;
    private boolean ad;
    private boolean ae;
    private Map<String, Object> af;
    private View.OnTouchListener ag;
    String b;
    public FrameLayout c;
    d f;
    com.sankuai.meituan.mtlive.player.library.d g;
    com.sankuai.meituan.mtlive.player.library.b h;
    h i;
    f j;
    com.sankuai.meituan.mtlive.pusher.library.c k;
    MLivePlayerView l;
    MLivePusherView m;
    boolean n;
    boolean o;
    String p;
    int q;
    String r;
    String s;
    String t;
    boolean u;
    boolean v;
    String w;
    HashMap x;

    public static /* synthetic */ void a(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9918f24786a856aa1aee3d9e2a052444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9918f24786a856aa1aee3d9e2a052444");
            return;
        }
        if (i <= 0) {
            bVar.ae = true;
        }
    }

    public static /* synthetic */ boolean b(b bVar, boolean z) {
        bVar.ad = true;
        return true;
    }

    public static /* synthetic */ void f(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ed605c01878b21007738e772a3a952a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ed605c01878b21007738e772a3a952a1");
        } else if (bVar.i != null) {
            bVar.i.a(true);
            bVar.i.a();
            j.a(bVar.getContext());
        }
    }

    public static /* synthetic */ void j(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9c583b80c89ea883780c18216549e78d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9c583b80c89ea883780c18216549e78d");
        } else if (bVar.f == null || bVar.f.d) {
        } else {
            bVar.f.a(true);
        }
    }

    public static /* synthetic */ void q(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "7901fb83753aba7b6ab3db4b2e031e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "7901fb83753aba7b6ab3db4b2e031e01");
            return;
        }
        bVar.G.x = (int) (bVar.P - bVar.T);
        bVar.G.y = (int) (bVar.Q - bVar.U);
        bVar.G.windowAnimations = 0;
        bVar.H.updateViewLayout(bVar, bVar.G);
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4ea023d7c551b76404c5e750e325c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4ea023d7c551b76404c5e750e325c4");
            return;
        }
        this.F = "MLive_Float_Player_View";
        this.W = true;
        this.aa = false;
        this.ab = false;
        this.n = false;
        this.o = false;
        this.p = "";
        this.q = 0;
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = false;
        this.v = false;
        this.w = "";
        this.ad = false;
        this.ae = false;
        this.af = new HashMap();
        this.ag = new View.OnTouchListener() { // from class: com.dianping.live.live.livefloat.b.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "320853316e28e7f2ba9448e354efb0a8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "320853316e28e7f2ba9448e354efb0a8")).booleanValue();
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        b.this.T = motionEvent.getX();
                        b.this.U = motionEvent.getY();
                        b.this.R = motionEvent.getRawX();
                        b.this.S = motionEvent.getRawY() - b.this.getStatusBarHeight();
                        b.this.P = motionEvent.getRawX();
                        b.this.Q = motionEvent.getRawY() - b.this.getStatusBarHeight();
                        break;
                    case 1:
                        if (Math.abs(b.this.R - b.this.P) < 5.0f && Math.abs(b.this.S - b.this.Q) < 5.0f) {
                            a aVar = b.this.I;
                            Context context2 = b.this.getContext();
                            String str = b.this.b;
                            Object[] objArr3 = {context2, str};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (!PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c3890befb59fa432d2a5891e878d4017", RobustBitConfig.DEFAULT_VALUE)) {
                                if (aVar.b != null && aVar.b.getParent() != null) {
                                    aVar.b.b(false);
                                    aVar.b.a();
                                    aVar.b(context2).removeView(aVar.b);
                                    aVar.b = null;
                                    a.d = false;
                                }
                                aVar.c.stopSelf();
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().build());
                                if (!(context2 instanceof Activity)) {
                                    intent.addFlags(y.a);
                                }
                                intent.addFlags(67108864);
                                context2.startActivity(intent);
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c3890befb59fa432d2a5891e878d4017");
                                break;
                            }
                        }
                        break;
                    case 2:
                        b.this.P = motionEvent.getRawX();
                        b.this.Q = motionEvent.getRawY() - b.this.getStatusBarHeight();
                        b.q(b.this);
                        break;
                }
                return true;
            }
        };
    }

    public b(Context context, a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a8f35e9ed6105b91122624b4c81f575", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a8f35e9ed6105b91122624b4c81f575");
            return;
        }
        this.F = "MLive_Float_Player_View";
        this.W = true;
        this.aa = false;
        this.ab = false;
        this.n = false;
        this.o = false;
        this.p = "";
        this.q = 0;
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = false;
        this.v = false;
        this.w = "";
        this.ad = false;
        this.ae = false;
        this.af = new HashMap();
        this.ag = new View.OnTouchListener() { // from class: com.dianping.live.live.livefloat.b.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "320853316e28e7f2ba9448e354efb0a8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "320853316e28e7f2ba9448e354efb0a8")).booleanValue();
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        b.this.T = motionEvent.getX();
                        b.this.U = motionEvent.getY();
                        b.this.R = motionEvent.getRawX();
                        b.this.S = motionEvent.getRawY() - b.this.getStatusBarHeight();
                        b.this.P = motionEvent.getRawX();
                        b.this.Q = motionEvent.getRawY() - b.this.getStatusBarHeight();
                        break;
                    case 1:
                        if (Math.abs(b.this.R - b.this.P) < 5.0f && Math.abs(b.this.S - b.this.Q) < 5.0f) {
                            a aVar2 = b.this.I;
                            Context context2 = b.this.getContext();
                            String str = b.this.b;
                            Object[] objArr3 = {context2, str};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (!PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "c3890befb59fa432d2a5891e878d4017", RobustBitConfig.DEFAULT_VALUE)) {
                                if (aVar2.b != null && aVar2.b.getParent() != null) {
                                    aVar2.b.b(false);
                                    aVar2.b.a();
                                    aVar2.b(context2).removeView(aVar2.b);
                                    aVar2.b = null;
                                    a.d = false;
                                }
                                aVar2.c.stopSelf();
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().build());
                                if (!(context2 instanceof Activity)) {
                                    intent.addFlags(y.a);
                                }
                                intent.addFlags(67108864);
                                context2.startActivity(intent);
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "c3890befb59fa432d2a5891e878d4017");
                                break;
                            }
                        }
                        break;
                    case 2:
                        b.this.P = motionEvent.getRawX();
                        b.this.Q = motionEvent.getRawY() - b.this.getStatusBarHeight();
                        b.q(b.this);
                        break;
                }
                return true;
            }
        };
        this.I = aVar;
        this.H = (WindowManager) context.getSystemService("window");
        this.c = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.floating_view, this);
        this.l = (MLivePlayerView) this.c.findViewById(R.id.live_float_window_view);
        this.m = (MLivePusherView) this.c.findViewById(R.id.live_float_window_pusher_view);
        d = this.l.getLayoutParams().width;
        e = this.l.getLayoutParams().height;
        this.c.setOnTouchListener(this.ag);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b02dc45fd8a806878bb09f911929729a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b02dc45fd8a806878bb09f911929729a");
            return;
        }
        this.V = new NetWorkStateReceiver(new NetWorkStateReceiver.a() { // from class: com.dianping.live.live.livefloat.b.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.live.live.utils.NetWorkStateReceiver.a
            public final void a(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f812915b8cf1132a53257abd5f2bbaba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f812915b8cf1132a53257abd5f2bbaba");
                    return;
                }
                b.this.W = i != 0;
                if (!b.this.W) {
                    b.b(b.this, true);
                }
                if (b.this.ad) {
                    b.this.ac.setText(b.this.W ? "连接中..." : "网络已断开");
                    b.this.ac.setVisibility(0);
                }
                StringBuilder sb = new StringBuilder("MLive_Logan: Float NETWORK ");
                sb.append(b.this.W ? "网络已连接" : "网络已断开");
                j.a(sb.toString());
                if (b.this.W) {
                    if (b.this.u && b.this.aa) {
                        j.a("MLive_Logan: Float RECONNECT 监听到网络重连准备开始重启推流");
                        b.f(b.this);
                        b.this.c();
                        b.this.aa = false;
                    }
                    if (b.this.n && b.this.ab) {
                        j.a("MLive_Logan: Float RECONNECT 监听到网络重连准备开始重启拉流");
                        b.j(b.this);
                        b.this.b();
                        b.this.ab = false;
                    }
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getContext().registerReceiver(this.V, intentFilter);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39a33a6fc96a71dc7072d7a82a0939e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39a33a6fc96a71dc7072d7a82a0939e");
            return;
        }
        try {
            if (this.V != null) {
                getContext().unregisterReceiver(this.V);
            }
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
    }

    private void a(HashMap hashMap, boolean z) {
        Object[] objArr = {hashMap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb64d7818c3f4edda7d961da2c3b07d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb64d7818c3f4edda7d961da2c3b07d6");
        } else if (hashMap == null || hashMap.get(RaptorUploaderImpl.SRC) == null) {
        } else {
            String obj = hashMap.get(RaptorUploaderImpl.SRC).toString();
            DPImageView dPImageView = new DPImageView(getContext());
            dPImageView.setImage(obj);
            if (z) {
                dPImageView.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.live.live.livefloat.b.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e4a4d0006574008e6cab2d499b68e5a", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e4a4d0006574008e6cab2d499b68e5a");
                        } else {
                            b.this.I.a(b.this.getContext(), true);
                        }
                    }
                });
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(5, 5);
            if (hashMap.get(Constants.GestureMoveEvent.KEY_X) != null) {
                layoutParams.leftMargin = com.dianping.util.j.a(getContext(), Double.valueOf(hashMap.get(Constants.GestureMoveEvent.KEY_X).toString()).intValue()) + this.O;
            }
            if (hashMap.get(Constants.GestureMoveEvent.KEY_Y) != null) {
                layoutParams.topMargin = com.dianping.util.j.a(getContext(), Double.valueOf(hashMap.get(Constants.GestureMoveEvent.KEY_Y).toString()).intValue()) + this.O;
            }
            if (hashMap.get("w") != null) {
                layoutParams.width = com.dianping.util.j.a(getContext(), Double.valueOf(hashMap.get("w").toString()).intValue());
            }
            if (hashMap.get("h") != null) {
                layoutParams.height = com.dianping.util.j.a(getContext(), Double.valueOf(hashMap.get("h").toString()).intValue());
            }
            dPImageView.setLayoutParams(layoutParams);
            this.c.addView(dPImageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ba6f92cbf1cec11b8f2acf7a3a2b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ba6f92cbf1cec11b8f2acf7a3a2b44");
        } else if (this.f == null || this.f.d) {
        } else {
            this.f.a(this.h);
            this.f.a(this.l);
            this.f.a(this.g);
            j.a("MLive_Logan: Float Player  Address:" + this.p);
            if (!this.o || this.f.b()) {
                return;
            }
            int a2 = this.f.a(this.p, this.q);
            if (a2 == 0) {
                Log.e("MLive_Logan", "启动成功");
                j.a("MLive_Logan: Float Player START 启动成功");
                a("2000");
            } else if (a2 == -1) {
                Log.e("MLive_Logan", "启动失败，playUrl 为空");
                j.a("MLive_Logan: Float Player START 启动失败，playUrl 为空");
                a("-2001");
            } else if (a2 == -2) {
                Log.e("MLive_Logan", "启动失败，playUrl 非法");
                j.a("MLive_Logan: Float Player START 启动失败，playUrl 非法");
                a("-2002");
            } else if (a2 == -3) {
                Log.e("MLive_Logan", "启动失败，playType 非法");
                j.a("MLive_Logan: Float Player START 启动失败，playType 非法");
                a("-2003");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "711ae39cf0e238fa63987ba2e0bc8782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "711ae39cf0e238fa63987ba2e0bc8782");
        } else if (this.i == null) {
        } else {
            this.i.a(this.k);
            this.i.a(this.j);
            this.i.a(true);
            this.i.a(this.m);
            if (this.x != null && this.x.get("devicePosition") != null) {
                this.m.a(this.i, this.x.get("devicePosition").toString());
            }
            j.a("MLive_Logan: Float Pusher  Address:" + this.w);
            if (this.v) {
                int a2 = this.i.a(this.w);
                if (a2 == 0) {
                    Log.e("MLive_Logan", "启动成功");
                    j.a("MLive_Logan: Float Pusher START 启动成功");
                    j.a(getContext());
                    a("1000");
                } else if (a2 == -1) {
                    Log.e("MLive_Logan", "启动失败");
                    j.a("MLive_Logan: Float Pusher START 启动失败");
                    j.a(getContext());
                    com.dianping.codelog.b.b(b.class, "start fail", "启动失败 Address:" + this.w);
                    a("-1001");
                } else if (a2 == -5) {
                    Log.e("MLive_Logan", "License校验失败");
                    j.a("MLive_Logan: Float Pusher START License校验失败");
                    j.a(getContext());
                    com.dianping.codelog.b.b(b.class, "start fail", "License校验失败 Address:" + this.w);
                    a("-1002");
                }
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf556bf49fe0184c062da0a217e2bc4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf556bf49fe0184c062da0a217e2bc4a");
            return;
        }
        b(z);
        d();
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf7cffb09c37758e72704cc8962171e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf7cffb09c37758e72704cc8962171e");
        } else if (this.f == null || this.f.d) {
        } else {
            if (z) {
                this.f.c();
            }
            if (this.u) {
                this.f.a(true);
                this.f.a();
            }
            this.h = null;
            this.g = null;
            this.f = null;
            if (this.ae) {
                j.a(getContext());
            }
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfaba4755bd97bdf49e3c051dc7d6bde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfaba4755bd97bdf49e3c051dc7d6bde");
            return;
        }
        if (this.i != null) {
            this.i.a((com.sankuai.meituan.mtlive.pusher.library.c) null);
            this.i.a(true);
            this.i.a();
            this.k = null;
            this.j = null;
            this.i = null;
            j.a(getContext());
        }
        this.m = null;
    }

    public void setParams(WindowManager.LayoutParams layoutParams) {
        this.G = layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getStatusBarHeight() {
        Resources system;
        int identifier;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b66d903b124a5b59539054f54a0ef604", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b66d903b124a5b59539054f54a0ef604")).intValue();
        }
        if (this.N == 0 && (identifier = (system = Resources.getSystem()).getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            this.N = system.getDimensionPixelSize(identifier);
        }
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6573849dd8cb536c51438928ac7ecbe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6573849dd8cb536c51438928ac7ecbe7");
            return;
        }
        this.af.put("liveId", this.r);
        this.af.put("sessionId", this.s);
        this.af.put("roomId", this.t);
        this.af.put("isFloat", Boolean.TRUE);
        this.af.put("pullUrl", this.p);
        this.af.put("pushUrl", this.w);
        this.af.put("code", str);
        Statistics.getChannel("gc").writeSystemCheck(AppUtil.generatePageInfoKey(this), "b_gc_mlive_sc", this.af, "c_gc_6uvcyn40");
    }

    public final void a(MLiveFloatPlayerModel mLiveFloatPlayerModel, WindowManager.LayoutParams layoutParams) {
        Object[] objArr = {mLiveFloatPlayerModel, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0cfcaf9799208c87819e401e448a119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0cfcaf9799208c87819e401e448a119");
            return;
        }
        this.L = mLiveFloatPlayerModel.g;
        this.z = new GradientDrawable();
        this.O = 0;
        if (this.L != null) {
            if (this.L.get("w") != null) {
                this.O = com.dianping.util.j.a(getContext(), Double.valueOf(this.L.get("w").toString()).intValue());
                ((FrameLayout.LayoutParams) this.l.getLayoutParams()).setMargins(this.O, this.O, this.O, this.O);
                layoutParams.width = d + (this.O * 2);
            }
            try {
                this.z.setStroke(this.O, Color.parseColor(this.L.get("color") != null ? this.L.get("color").toString() : "#00ffffff"));
            } catch (Exception unused) {
            }
            layoutParams.height = e + (this.O * 2);
        }
        this.J = mLiveFloatPlayerModel.e;
        if (this.J != null) {
            if (this.J.get(Constants.GestureMoveEvent.KEY_X) != null) {
                layoutParams.x = com.dianping.util.j.a(getContext(), Double.valueOf(this.J.get(Constants.GestureMoveEvent.KEY_X).toString()).intValue());
            }
            if (this.J.get(Constants.GestureMoveEvent.KEY_Y) != null) {
                layoutParams.y = com.dianping.util.j.a(getContext(), Double.valueOf(this.J.get(Constants.GestureMoveEvent.KEY_Y).toString()).intValue());
            }
            if (this.J.get("w") != null) {
                float intValue = Double.valueOf(this.J.get("w").toString()).intValue();
                this.l.getLayoutParams().width = com.dianping.util.j.a(getContext(), intValue);
                layoutParams.width = com.dianping.util.j.a(getContext(), intValue) + (this.O * 2);
            }
            if (this.J.get("h") != null) {
                float intValue2 = Double.valueOf(this.J.get("h").toString()).intValue();
                this.l.getLayoutParams().height = com.dianping.util.j.a(getContext(), intValue2);
                layoutParams.height = com.dianping.util.j.a(getContext(), intValue2) + (this.O * 2);
            }
            if (this.J.get("corner") != null) {
                setRadius(Double.valueOf(this.J.get("corner").toString()).intValue());
            }
        }
        setParams(layoutParams);
        Object[] objArr2 = {mLiveFloatPlayerModel};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57f97fdd854c6dcb580162fd6346ae5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57f97fdd854c6dcb580162fd6346ae5b");
        } else {
            this.K = mLiveFloatPlayerModel.f;
            a(this.K, true);
        }
        a(mLiveFloatPlayerModel);
        if (this.O > 0) {
            GradientDrawable gradientDrawable = this.z;
            Object[] objArr3 = {gradientDrawable};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "666c966e957bf9af53413f0ef0c777f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "666c966e957bf9af53413f0ef0c777f3");
            } else {
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.setBackground(gradientDrawable);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        Object[] objArr4 = {""};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a7b0a0d89269f2cb18045851b24df223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a7b0a0d89269f2cb18045851b24df223");
            return;
        }
        this.ac = new TextView(getContext());
        this.ac.setGravity(16);
        this.ac.setText("");
        this.ac.setTextSize(0, 18.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.ac.setLayoutParams(layoutParams2);
        this.ac.setPadding(com.dianping.util.j.a(getContext(), 5.0f), com.dianping.util.j.a(getContext(), 5.0f), com.dianping.util.j.a(getContext(), 5.0f), com.dianping.util.j.a(getContext(), 5.0f));
        addView(this.ac);
    }

    private void a(MLiveFloatPlayerModel mLiveFloatPlayerModel) {
        Object[] objArr = {mLiveFloatPlayerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f89638be78357f2eb8ea5b76471c727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f89638be78357f2eb8ea5b76471c727");
            return;
        }
        this.M = mLiveFloatPlayerModel.h;
        if (this.M == null || this.M.size() <= 0) {
            return;
        }
        Iterator<HashMap> it = this.M.iterator();
        while (it.hasNext()) {
            a(it.next(), false);
        }
    }
}
