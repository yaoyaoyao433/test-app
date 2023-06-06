package com.sankuai.waimai.business.ugc.live;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.dianping.archive.DPObject;
import com.dianping.dataservice.d;
import com.dianping.dataservice.mapi.e;
import com.dianping.dataservice.mapi.f;
import com.dianping.live.card.a;
import com.dianping.live.live.utils.NetWorkStateReceiver;
import com.dianping.live.live.utils.h;
import com.dianping.live.live.utils.i;
import com.dianping.live.live.utils.j;
import com.dianping.sdk.pike.agg.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.InterfaceC0084a, a.b, a.c {
    public static ChangeQuickRedirect a;
    public com.dianping.live.card.a b;
    public a.d c;
    public List<b> d;
    long e;
    EnumC0875a f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void onClicked();

        void onGoodsChanged(int i, long j);

        void onPlayEnd();

        void onPlayException(int i, Bundle bundle);

        void onPlayFail(int i);

        void onPlaySuccess();
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ba3611296bb1b2c32fef01e08617613", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ba3611296bb1b2c32fef01e08617613");
            return;
        }
        this.d = new ArrayList();
        this.e = 0L;
        this.f = EnumC0875a.INIT;
        b(context);
    }

    private void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c130b9d7b1b60897ade5d577177440f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c130b9d7b1b60897ade5d577177440f7");
            return;
        }
        this.b = new com.dianping.live.card.a(context.getApplicationContext());
        this.b.setGoodsListener(this);
        this.b.setPlayExceptionListener(this);
    }

    public final boolean a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c46c21a941aae4f56291b4838db75ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c46c21a941aae4f56291b4838db75ef")).booleanValue() : viewGroup == this.b.getParent();
    }

    public final void b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec386288af55e6ac5135d4716052f03d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec386288af55e6ac5135d4716052f03d");
            return;
        }
        ViewParent parent = this.b.getParent();
        if (viewGroup == parent) {
            return;
        }
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.b);
        }
        viewGroup.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f8b9e91ae33971e0d226342a573b6b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f8b9e91ae33971e0d226342a573b6b8");
        } else if (this.d.contains(bVar)) {
        } else {
            this.d.add(bVar);
        }
    }

    public final void a(a.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71dff4fa3883839ce38e172e92589ce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71dff4fa3883839ce38e172e92589ce8");
            return;
        }
        this.e = System.currentTimeMillis();
        this.f = EnumC0875a.LOADING;
        this.c = dVar;
        if (this.b != null) {
            final com.dianping.live.card.a aVar = this.b;
            Object[] objArr2 = {dVar, this};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.live.card.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8f879e65cfe51208e50d8cfdb93b3a6d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8f879e65cfe51208e50d8cfdb93b3a6d");
            } else if (dVar == null || TextUtils.isEmpty(dVar.b)) {
                a(a.e.a);
            } else {
                aVar.c = dVar;
                aVar.d = this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.live.card.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "eba36ad79c929ce5b10767bad8cee212", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "eba36ad79c929ce5b10767bad8cee212");
                } else if (com.dianping.live.live.mrn.b.a().a(aVar.getContext())) {
                    aVar.a();
                } else {
                    com.dianping.live.live.mrn.b.a().a(aVar.getContext(), new h.a() { // from class: com.dianping.live.card.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.live.live.utils.h.a
                        public final void a(int i) {
                            Object[] objArr4 = {200};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b0fa8c1777370ae45003937b6c4e3df2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b0fa8c1777370ae45003937b6c4e3df2");
                            } else {
                                a.this.a();
                            }
                        }

                        @Override // com.dianping.live.live.utils.h.a
                        public final void b(int i) {
                            Object[] objArr4 = {202};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b97f4e404b4cf1de64d3e70cddfc543d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b97f4e404b4cf1de64d3e70cddfc543d");
                            } else {
                                a.this.d.a(e.c);
                            }
                        }
                    });
                }
                if (dVar.e > 0.0f) {
                    aVar.setRadius(dVar.e);
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.dianping.live.card.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "ec149ef7d31e3662b171a096a52ddb2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "ec149ef7d31e3662b171a096a52ddb2d");
                } else {
                    aVar.a(new d<e, f>() { // from class: com.dianping.live.card.a.6
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.dataservice.d
                        public final /* synthetic */ void onRequestFailed(com.dianping.dataservice.mapi.e eVar, f fVar) {
                            Object[] objArr5 = {eVar, fVar};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "53a8dbb835e157af9599b832a145531c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "53a8dbb835e157af9599b832a145531c");
                            } else {
                                j.a("MLive_Logan: Card Player livebasicinfo请求失败 ");
                            }
                        }

                        @Override // com.dianping.dataservice.d
                        public final /* synthetic */ void onRequestFinish(com.dianping.dataservice.mapi.e eVar, f fVar) {
                            f fVar2 = fVar;
                            Object[] objArr5 = {eVar, fVar2};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d0e57f53da16260210c10dafac086656", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d0e57f53da16260210c10dafac086656");
                                return;
                            }
                            j.a("MLive_Logan: Card Player livebasicinfo请求成功 ");
                            DPObject dPObject = (DPObject) fVar2.a();
                            if (dPObject.d("playStatus") == 3) {
                                if (a.this.d != null) {
                                    a.this.d.b();
                                }
                                a.this.b();
                                a.this.i.setText("直播已结束");
                                a.this.i.setVisibility(0);
                                return;
                            }
                            String e = dPObject.e("alias");
                            a.this.l = dPObject.f("chatRoomId");
                            a.this.f();
                            a.this.k = com.dianping.sdk.pike.agg.a.a(a.this.getContext(), new c.a().a("mlive_pike_tiny").b(e).a());
                            a.this.k.s = new com.dianping.sdk.pike.agg.e() { // from class: com.dianping.live.card.a.6.1
                                public static ChangeQuickRedirect a;

                                @Override // com.dianping.sdk.pike.agg.e
                                public final void a(List<com.dianping.sdk.pike.agg.f> list) {
                                    Object[] objArr6 = {list};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e35b05c3540e5f02603bae052b632f5a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e35b05c3540e5f02603bae052b632f5a");
                                    } else if (list != null && list.size() > 0) {
                                        for (int i = 0; i < list.size(); i++) {
                                            String str = list.get(i).c;
                                            if (!TextUtils.isEmpty(str)) {
                                                String str2 = i.f;
                                                i.a(str2, "收到直播间消息：" + str);
                                                try {
                                                    JSONObject jSONObject = new JSONObject(str);
                                                    if (a.this.l == jSONObject.optLong("chatRoomId")) {
                                                        a.a(a.this, jSONObject);
                                                    }
                                                } catch (JSONException e2) {
                                                    e2.printStackTrace();
                                                }
                                            }
                                        }
                                    }
                                }
                            };
                            a.this.k.a();
                            a.this.b(true);
                        }
                    });
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.dianping.live.card.a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "b194c78ae3b08827202e136282f2f316", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "b194c78ae3b08827202e136282f2f316");
                    return;
                }
                aVar.e = new NetWorkStateReceiver(new NetWorkStateReceiver.a() { // from class: com.dianping.live.card.a.4
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.live.live.utils.NetWorkStateReceiver.a
                    public final void a(int i) {
                        Object[] objArr6 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cc7db53853af6f221ca67ea52777e2d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cc7db53853af6f221ca67ea52777e2d6");
                            return;
                        }
                        a.this.m = i != 0;
                        StringBuilder sb = new StringBuilder("MLive_Logan: Card Player NETWORK ");
                        sb.append(a.this.m ? "网络已连接" : "网络已断开");
                        j.a(sb.toString());
                        if (a.this.m && a.this.n) {
                            j.a("MLive_Logan: Card Player RECONNECT 监听到网络重连准备开始重启拉流");
                            if (a.this.b != null) {
                                j.a("MLive_Logan: Card Player 重启拉流 stop & start");
                                a.this.b.a(false);
                                a.this.c();
                            }
                            a.this.n = false;
                        }
                    }
                });
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                aVar.getContext().registerReceiver(aVar.e, intentFilter);
            }
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490bae1f6a8606e9a11681aa107c7caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490bae1f6a8606e9a11681aa107c7caa");
            return;
        }
        if (this.b != null) {
            this.b.b();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52583e972df068d5fc39b69f0ff3dae1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52583e972df068d5fc39b69f0ff3dae1");
            } else {
                ViewParent parent = this.b.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.b);
                }
            }
        }
        b(context);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a321dc161d02e6a02f64676c9596b742", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a321dc161d02e6a02f64676c9596b742");
            return;
        }
        this.f = EnumC0875a.PAUSE;
        if (this.b != null) {
            com.dianping.live.card.a aVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.live.card.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "aedf99067ecb6dbdd344b0654af1f82e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "aedf99067ecb6dbdd344b0654af1f82e");
                return;
            }
            j.a("MLive_Logan: Card Player pause");
            aVar.a(true);
            if (aVar.b != null) {
                aVar.b.c();
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9befffc5177bd3558c625714de38bca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9befffc5177bd3558c625714de38bca");
            return;
        }
        this.f = EnumC0875a.LOADING;
        if (this.b != null) {
            com.dianping.live.card.a aVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.live.card.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6d6f34c95304805fbc5e00f20c28e434", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6d6f34c95304805fbc5e00f20c28e434");
                return;
            }
            j.a("MLive_Logan: Card Player resume");
            aVar.b(true);
            if (aVar.b != null) {
                aVar.b.d();
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1eedae6e60b487fe82ec9e53b27736e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1eedae6e60b487fe82ec9e53b27736e");
            return;
        }
        this.f = EnumC0875a.STOP;
        if (this.b != null) {
            this.b.b();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9a73f0272cba3812b6f979983ecf4d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9a73f0272cba3812b6f979983ecf4d3");
        } else if (this.b != null) {
            this.b.setMute(z);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.ugc.live.a$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[EnumC0875a.valuesCustom().length];

        static {
            try {
                a[EnumC0875a.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0875a.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0875a.FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC0875a.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.dianping.live.card.a.InterfaceC0084a
    public final void a(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d258a3ad245ae016dd999b17288c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d258a3ad245ae016dd999b17288c47");
            return;
        }
        for (b bVar : this.d) {
            bVar.onPlayException(i, bundle);
        }
    }

    @Override // com.dianping.live.card.a.b
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6683ffb96e722e55f7219c67aa37629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6683ffb96e722e55f7219c67aa37629");
            return;
        }
        for (b bVar : this.d) {
            bVar.onGoodsChanged(i, j);
        }
    }

    @Override // com.dianping.live.card.a.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614cb30f0578bc1e506663236de6aab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614cb30f0578bc1e506663236de6aab4");
            return;
        }
        this.f = EnumC0875a.SUCCESS;
        for (b bVar : this.d) {
            bVar.onPlaySuccess();
        }
    }

    @Override // com.dianping.live.card.a.c
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b779b23bcbc330ecc5c2b5d659789c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b779b23bcbc330ecc5c2b5d659789c2");
            return;
        }
        this.f = EnumC0875a.FAIL;
        for (b bVar : this.d) {
            bVar.onPlayFail(i);
        }
    }

    @Override // com.dianping.live.card.a.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baacd42d79e8644f95324d7d9d70f82c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baacd42d79e8644f95324d7d9d70f82c");
            return;
        }
        this.f = EnumC0875a.END;
        for (b bVar : this.d) {
            bVar.onPlayEnd();
        }
    }

    @Override // com.dianping.live.card.a.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90dc3a64f1f456ac9969521049711bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90dc3a64f1f456ac9969521049711bbe");
            return;
        }
        for (b bVar : this.d) {
            bVar.onClicked();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.ugc.live.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0875a {
        INIT,
        LOADING,
        PAUSE,
        STOP,
        SUCCESS,
        FAIL,
        END;
        
        public static ChangeQuickRedirect a;

        EnumC0875a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b409ce77d97c94c5a59842986a5d67ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b409ce77d97c94c5a59842986a5d67ae");
            }
        }

        public static EnumC0875a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10ece834c3f5eaef9af0809dc49d8542", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0875a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10ece834c3f5eaef9af0809dc49d8542") : (EnumC0875a) Enum.valueOf(EnumC0875a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0875a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb791076d75a5067285d146ea4275669", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0875a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb791076d75a5067285d146ea4275669") : (EnumC0875a[]) values().clone();
        }
    }
}
