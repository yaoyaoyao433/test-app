package com.dianping.live.card;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dianping.archive.DPObject;
import com.dianping.dataservice.mapi.f;
import com.dianping.live.live.mrn.MLivePlayerView;
import com.dianping.live.live.utils.NetWorkStateReceiver;
import com.dianping.live.live.utils.i;
import com.dianping.live.live.utils.j;
import com.meituan.android.mrn.config.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.dianping.live.live.livefloat.c {
    public static ChangeQuickRedirect a;
    public com.dianping.live.live.mrn.d b;
    public d c;
    public c d;
    public NetWorkStateReceiver e;
    private MLivePlayerView f;
    private com.sankuai.meituan.mtlive.player.library.b g;
    private com.sankuai.meituan.mtlive.player.library.d h;
    private TextView i;
    private boolean j;
    private com.dianping.sdk.pike.agg.a k;
    private long l;
    private boolean m;
    private boolean n;
    private b o;
    private InterfaceC0084a p;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.live.card.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0084a {
        void a(int i, Bundle bundle);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i, long j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        void a();

        void a(int i);

        void b();

        void c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d {
        public String a;
        public String b;
        public String c;
        public String d;
        public float e;
        public boolean f = true;
        public String g = "fillCrop";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class e {
        public static int a = -100;
        public static int b = -101;
        public static int c = -102;
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3343b66cf0b387efdcce005171bdefd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3343b66cf0b387efdcce005171bdefd2");
            return;
        }
        try {
            int optInt = jSONObject.optInt("msgType");
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("msgExtends"));
            if (optInt == -1) {
                j.a("MLive_Logan: Card Player 收到直播结束消息");
                aVar.d.b();
                aVar.b();
                aVar.i.setText("直播已结束");
                aVar.i.setVisibility(0);
            } else if (optInt == 20002) {
                int optInt2 = jSONObject2.optInt("topValue");
                long optLong = jSONObject2.optLong("productId");
                j.a("MLive_Logan: Card Player 收到20002" + optInt2 + optLong);
                if (aVar.o != null) {
                    aVar.o.a(optInt2 == 1 ? 100 : 101, optLong);
                }
            } else if (optInt == 20003) {
                long optLong2 = jSONObject2.optLong("productId");
                j.a("MLive_Logan: Card Player 收到20003" + optLong2);
                if (aVar.o != null) {
                    aVar.o.a(200, optLong2);
                }
            } else if (optInt == 100301) {
                long optLong3 = jSONObject2.optLong("bizId");
                j.a("MLive_Logan: Card Player 收到100301" + optLong3);
                if (aVar.o != null) {
                    aVar.o.a(300, optLong3);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void d(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e188e129aec80e520b090755c7a7ba4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e188e129aec80e520b090755c7a7ba4b");
        } else {
            aVar.a(new com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, f>() { // from class: com.dianping.live.card.a.5
                public static ChangeQuickRedirect a;

                @Override // com.dianping.dataservice.d
                public final /* synthetic */ void onRequestFailed(com.dianping.dataservice.mapi.e eVar, f fVar) {
                    Object[] objArr2 = {eVar, fVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71ee8a413288275c02e5c89c13a32fa2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71ee8a413288275c02e5c89c13a32fa2");
                        return;
                    }
                    j.a("MLive_Logan: Card Player livebasicinfo请求失败");
                    a.this.i.setText("播放失败");
                    a.this.i.setVisibility(0);
                }

                @Override // com.dianping.dataservice.d
                public final /* synthetic */ void onRequestFinish(com.dianping.dataservice.mapi.e eVar, f fVar) {
                    f fVar2 = fVar;
                    Object[] objArr2 = {eVar, fVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0f09766cc7cf8bf5ee6268de49f2959", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0f09766cc7cf8bf5ee6268de49f2959");
                        return;
                    }
                    j.a("MLive_Logan: Card Player livebasicinfo请求成功 ");
                    if (((DPObject) fVar2.a()).d("playStatus") == 3) {
                        a.this.d.b();
                        a.this.b();
                        a.this.i.setText("直播已结束");
                    } else {
                        a.this.i.setText("播放失败");
                    }
                    a.this.i.setVisibility(0);
                }
            });
        }
    }

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c59d53075b7df8db755b61a328d681", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c59d53075b7df8db755b61a328d681");
            return;
        }
        this.j = false;
        this.m = true;
        this.n = false;
        setBackgroundColor(-16777216);
        this.f = new MLivePlayerView(context);
        addView(this.f);
        Object[] objArr2 = {"加载中…"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "601c51d871f2e37309ad8001cec83f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "601c51d871f2e37309ad8001cec83f4e");
        } else {
            this.i = new TextView(getContext());
            this.i.setGravity(16);
            this.i.setText("加载中…");
            this.i.setTextSize(2, 13.0f);
            this.i.setTextColor(-1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.i.setLayoutParams(layoutParams);
            this.i.setPadding(com.dianping.util.j.a(getContext(), 5.0f), com.dianping.util.j.a(getContext(), 5.0f), com.dianping.util.j.a(getContext(), 5.0f), com.dianping.util.j.a(getContext(), 5.0f));
            addView(this.i);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.dianping.live.card.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "25edf25cfd7c1348a8e001d50929abc2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "25edf25cfd7c1348a8e001d50929abc2");
                } else if (a.this.c == null) {
                } else {
                    if (!TextUtils.isEmpty(a.this.c.d)) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(a.this.c.d).buildUpon().build());
                        if (!(a.this.getContext() instanceof Activity)) {
                            intent.addFlags(y.a);
                        }
                        intent.addFlags(67108864);
                        a.this.getContext().startActivity(intent);
                    }
                    if (a.this.d != null) {
                        a.this.d.c();
                    }
                }
            }
        });
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23739df910a4a301557921be80aa78aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23739df910a4a301557921be80aa78aa");
            return;
        }
        if (this.b == null) {
            this.b = new com.dianping.live.live.mrn.d(getContext());
        }
        if (this.h == null) {
            this.h = new com.sankuai.meituan.mtlive.player.library.d();
        }
        this.f.a(this.b, this.c.f);
        this.f.b(this.b, this.c.g);
        d();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0487f9dd364dc750d892f0168d808a8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0487f9dd364dc750d892f0168d808a8c");
        } else if (this.b == null) {
        } else {
            this.b.a(this.g);
            this.b.a(this.f);
            this.b.a(this.h);
            if (this.b.b()) {
                j.a("MLive_Logan: Card Player isPlaying true");
                return;
            }
            j.a("MLive_Logan: Card Player  Address:" + this.c.c);
            int a2 = a(this.c.c);
            if (this.c.c != null && a2 >= 0) {
                this.i.setText("加载中…");
                this.i.setVisibility(0);
                int a3 = this.b.a(this.c.c, a2);
                if (a3 == 0) {
                    j.a("MLive_Logan: Card Player START 启动成功");
                    return;
                }
                this.d.a(e.a);
                if (a3 == -1) {
                    j.a("MLive_Logan: Card Player START 启动失败，playUrl 为空");
                    return;
                } else if (a3 == -2) {
                    j.a("MLive_Logan: Card Player START 启动失败，playUrl 非法");
                    return;
                } else if (a3 == -3) {
                    j.a("MLive_Logan: Card Player START 启动失败，playType 非法");
                    return;
                } else {
                    return;
                }
            }
            this.d.a(e.a);
        }
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba02f526baf7c415065523500ad3821", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba02f526baf7c415065523500ad3821")).intValue();
        }
        if (str.matches("^rtmp://.*")) {
            return 0;
        }
        return str.matches(".*\\.flv$") ? 1 : -1;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f123353d47d3959ff3a95d05775df5a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f123353d47d3959ff3a95d05775df5a5");
        } else if (this.g == null) {
            this.g = new com.sankuai.meituan.mtlive.player.library.b() { // from class: com.dianping.live.card.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.player.library.b
                public final void a(Bundle bundle) {
                }

                @Override // com.sankuai.meituan.mtlive.player.library.b
                public final void a(int i, Bundle bundle) {
                    Object[] objArr2 = {Integer.valueOf(i), bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "669dee0779b4ddd730136280afc04146", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "669dee0779b4ddd730136280afc04146");
                        return;
                    }
                    if (i == 2001 || i == 2002) {
                        i.a(i.f, "拉流成功");
                    } else if (i == 2103) {
                        i.a(i.f, "网络断连, 已启动自动重连");
                    } else if (i == -2301) {
                        i.a(i.f, "网络断连，且经多次重连抢救无效，更多重试请自行重启播放");
                        a.this.n = true;
                        if (a.this.d != null) {
                            a.this.d.a(e.b);
                        }
                        a.d(a.this);
                    } else if (i == 2004) {
                        i.a(i.f, "视频播放开始");
                        a.this.i.setVisibility(4);
                    } else if (i == 2006) {
                        i.a(i.f, "视频播放结束");
                    } else if (i == 2009) {
                        i.a(i.f, "获取视频流分辨率成功");
                    } else if (i == 2003) {
                        i.a(i.f, "渲染首个视频数据包（IDR）");
                        a.this.i.setVisibility(4);
                        if (a.this.d != null) {
                            a.this.d.a();
                        }
                    } else if (i == 2104) {
                        i.a(i.f, "视频流不太稳定，可能是观看者当前网速不充裕");
                    }
                    if ((i > 2100 || i < 0) && a.this.p != null) {
                        a.this.p.a(i, bundle);
                    }
                    j.a("MLive_Logan: Card Player Code " + i);
                    a.a(a.this, i);
                }
            };
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6244ebb47ee6c1166df1878552166c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6244ebb47ee6c1166df1878552166c34");
            return;
        }
        try {
            if (this.e != null) {
                getContext().unregisterReceiver(this.e);
            }
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
    }

    public void a(com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, f> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d364650d6d2f7df81278bfa00ac6e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d364650d6d2f7df81278bfa00ac6e9f");
            return;
        }
        try {
            Uri.Builder buildUpon = Uri.parse("https://mapi.dianping.com/mapi/dzu/live/livebasicinfo.bin").buildUpon();
            buildUpon.appendQueryParameter("liveid", this.c.b);
            buildUpon.appendQueryParameter("needalias", "true");
            w.a(getContext()).exec(com.dianping.dataservice.mapi.b.a(buildUpon.toString(), com.dianping.dataservice.mapi.c.DISABLED), dVar);
        } catch (NullPointerException e2) {
            j.a("MLive_Logan: Card Player sendRequest exception:" + com.dianping.util.exception.a.a(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76a274199514125a19a8f1220d42041f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76a274199514125a19a8f1220d42041f");
        } else if (this.k != null) {
            a(true);
            this.k.e();
        }
    }

    public void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb258ad333a560e94b458a0f842d661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb258ad333a560e94b458a0f842d661");
        } else if (this.k != null) {
            this.k.b(new com.dianping.sdk.pike.a() { // from class: com.dianping.live.card.a.7
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "714756646ca00c2a128c35be3373e804", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "714756646ca00c2a128c35be3373e804");
                    } else {
                        j.a("MLive_Logan: Card Player pike leave 成功");
                    }
                }

                @Override // com.dianping.sdk.pike.a
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ac3fd139f0e0b8424d83d3745696f81", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ac3fd139f0e0b8424d83d3745696f81");
                        return;
                    }
                    j.a("MLive_Logan: Card Player pike leave 失败");
                    if (z) {
                        new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.card.a.7.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "99d87a31a75c559c5707d68108f3ba15", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "99d87a31a75c559c5707d68108f3ba15");
                                } else {
                                    a.this.a(false);
                                }
                            }
                        }, 1000L);
                    }
                }
            });
        }
    }

    public void b(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4cc7089aa3486e32c214a348d5b4984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4cc7089aa3486e32c214a348d5b4984");
        } else if (this.k == null || this.l <= 0) {
        } else {
            com.dianping.sdk.pike.agg.a aVar = this.k;
            StringBuilder sb = new StringBuilder();
            sb.append(this.l);
            aVar.b(sb.toString(), new com.dianping.sdk.pike.a() { // from class: com.dianping.live.card.a.8
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b732d5be1d03298adba12fa2b6cadcb4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b732d5be1d03298adba12fa2b6cadcb4");
                    } else {
                        j.a("MLive_Logan: Card Player pike join 成功");
                    }
                }

                @Override // com.dianping.sdk.pike.a
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "648baebb8be6f7cf96c31984c385132b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "648baebb8be6f7cf96c31984c385132b");
                        return;
                    }
                    j.a("MLive_Logan: Card Player pike join 失败");
                    if (z) {
                        new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.card.a.8.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "efc5b6f51242c3aec6947ada33a95120", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "efc5b6f51242c3aec6947ada33a95120");
                                } else {
                                    a.this.b(false);
                                }
                            }
                        }, 1000L);
                    }
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c72d381d33472ce958b191197e1b4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c72d381d33472ce958b191197e1b4a");
            return;
        }
        j.a("MLive_Logan: Card Player stopPlay");
        f();
        e();
        if (this.b != null) {
            this.b.a((com.sankuai.meituan.mtlive.player.library.b) null);
            g();
            this.g = null;
            this.h = null;
            this.b = null;
            if (this.j) {
                j.a(getContext());
            }
        }
        com.dianping.live.live.mrn.b.a().b();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34f2e84ee42be2be2dab38d0bd55e98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34f2e84ee42be2be2dab38d0bd55e98");
            return;
        }
        j.a("MLive_Logan: Card Player stopAndRelease");
        try {
            if (this.b != null) {
                this.b.a(true);
                this.b.a();
                this.b = null;
            }
        } catch (Exception unused) {
            j.a("MLive_Logan: Card Player stopAndRelease error");
        }
    }

    public final void setMute(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ca15264eb9134c2923dd317633c0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ca15264eb9134c2923dd317633c0d4");
            return;
        }
        j.a("MLive_Logan: Card Player setMute" + z);
        b(true);
        if (this.b != null) {
            this.b.c(z);
        }
    }

    public final void setGoodsListener(b bVar) {
        this.o = bVar;
    }

    public final void setPlayExceptionListener(InterfaceC0084a interfaceC0084a) {
        this.p = interfaceC0084a;
    }

    public static /* synthetic */ void a(a aVar, int i) {
        if (i < 0) {
            aVar.j = true;
        }
    }
}
