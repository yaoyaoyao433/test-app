package com.sankuai.waimai.irmo.render;

import android.app.Activity;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.j;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.b;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerGroup;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.load.IrmoResDownloader;
import com.sankuai.waimai.irmo.render.mrn.WrapMachViewGroup;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements b.a {
    public static ChangeQuickRedirect a;
    @NonNull
    com.sankuai.waimai.irmo.render.b b;
    @Nullable
    WrapMachViewGroup c;
    WMIrmoView d;
    String e;
    g f;
    @NonNull
    LinkedHashMap<IrmoLayerInfo, com.sankuai.waimai.irmo.render.engine.a> g;
    WeakReference<Activity> h;
    com.sankuai.waimai.irmo.render.a i;
    e j;
    volatile boolean k;
    List<a> l;
    boolean m;
    i n;
    f o;
    final b p;
    private Map<Integer, LinkedList<com.sankuai.waimai.irmo.render.engine.a>> q;

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "71124e816b50786ec7755885256cba87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "71124e816b50786ec7755885256cba87");
            return;
        }
        for (com.sankuai.waimai.irmo.render.engine.a aVar : dVar.g.values()) {
            aVar.d();
        }
    }

    public static /* synthetic */ void b(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "0649647547a8631d96a95f23fac7f837", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "0649647547a8631d96a95f23fac7f837");
            return;
        }
        for (com.sankuai.waimai.irmo.render.engine.a aVar : dVar.g.values()) {
            aVar.c();
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb694b9b9c0ea0d3af64cdb858882eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb694b9b9c0ea0d3af64cdb858882eb");
            return;
        }
        this.p = new b();
        this.b = new com.sankuai.waimai.irmo.render.b();
        this.b.e = this;
        this.g = new LinkedHashMap<>();
        this.q = new ConcurrentHashMap();
        this.l = new CopyOnWriteArrayList();
    }

    public final void a(Activity activity, f fVar, i iVar) {
        Object[] objArr = {activity, fVar, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924fbbfe667e5adcd99812b399bae86b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924fbbfe667e5adcd99812b399bae86b");
            return;
        }
        this.i = new com.sankuai.waimai.irmo.render.a() { // from class: com.sankuai.waimai.irmo.render.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.irmo.render.a
            public final void a(@NonNull a.EnumC0973a enumC0973a, @Nullable Map<String, Object> map) {
                Object[] objArr2 = {enumC0973a, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2dda51176e8b8748b896011f953f3d9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2dda51176e8b8748b896011f953f3d9a");
                } else if (d.this.d != null && !com.sankuai.waimai.foundation.utils.d.a(d.this.d.getPlayStateListener())) {
                    for (com.sankuai.waimai.irmo.render.a aVar : d.this.d.getPlayStateListener()) {
                        aVar.a(enumC0973a, map);
                    }
                }
            }
        };
        this.n = iVar;
        this.o = fVar;
        com.sankuai.waimai.irmo.render.b bVar = this.b;
        com.sankuai.waimai.irmo.render.a aVar = this.i;
        bVar.f = this.n;
        bVar.b = aVar;
        if (activity == null) {
            return;
        }
        this.h = new WeakReference<>(activity);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e0a47ba53708a6fcc7bd0accc3cefb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e0a47ba53708a6fcc7bd0accc3cefb0");
            return;
        }
        Activity activity2 = this.h != null ? this.h.get() : null;
        if (activity2 != null) {
            b bVar2 = this.p;
            Object[] objArr3 = {activity2};
            ChangeQuickRedirect changeQuickRedirect3 = b.b;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "a1e24eaed5c40414eafdd0c478e03d62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "a1e24eaed5c40414eafdd0c478e03d62");
            } else {
                bVar2.c = new WeakReference<>(activity2);
            }
            b bVar3 = this.p;
            Object[] objArr4 = {this};
            ChangeQuickRedirect changeQuickRedirect4 = b.b;
            if (PatchProxy.isSupport(objArr4, bVar3, changeQuickRedirect4, false, "e47965997eba1e1fafbc3d8f8e139447", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar3, changeQuickRedirect4, false, "e47965997eba1e1fafbc3d8f8e139447");
            } else {
                bVar3.d = new WeakReference<>(this);
            }
            activity2.getApplication().registerActivityLifecycleCallbacks(this.p);
        }
    }

    public final void a(WMIrmoView wMIrmoView) {
        Object[] objArr = {wMIrmoView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3320a649b53d2ef7fc610bd04dd9af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3320a649b53d2ef7fc610bd04dd9af7");
            return;
        }
        this.d = wMIrmoView;
        if (this.c == null || this.c.getWindowToken() == null) {
            this.c = new WrapMachViewGroup(wMIrmoView.getContext(), "mrn".equals(this.e));
        }
        if (this.c.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        wMIrmoView.addView(this.c, -1, -1);
        this.c.post(new Runnable() { // from class: com.sankuai.waimai.irmo.render.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fb1e27da6ac8db53869d18a726d756f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fb1e27da6ac8db53869d18a726d756f");
                    return;
                }
                ViewGroup viewGroup = d.this.c;
                while (viewGroup.getParent() instanceof MachViewGroup) {
                    viewGroup = (ViewGroup) viewGroup.getParent();
                    viewGroup.setClipChildren(false);
                }
            }
        });
    }

    public final void a(int i, c cVar) {
        Object[] objArr = {Integer.valueOf(i), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3e91abc341cdb45662efa15b32ed26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3e91abc341cdb45662efa15b32ed26");
            return;
        }
        Set<Map.Entry<IrmoLayerInfo, com.sankuai.waimai.irmo.render.engine.a>> entrySet = this.g.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        if (cVar != null) {
            cVar.b = entrySet.size();
            cVar.c = false;
        }
        for (Map.Entry<IrmoLayerInfo, com.sankuai.waimai.irmo.render.engine.a> entry : entrySet) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                if (this.n != null && i == 1) {
                    this.n.a("InfiniteWillPlay", entry.getKey().type);
                }
                entry.getValue().a(i, cVar);
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.render.b.a
    public final void a(@NonNull final IrmoLayerGroup irmoLayerGroup) {
        Object[] objArr = {irmoLayerGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6f2dea9c925cfa7a2efd26817a2b247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6f2dea9c925cfa7a2efd26817a2b247");
            return;
        }
        Object[] objArr2 = {irmoLayerGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbb8bc8bf51f2fd916b2f4b8dce6316c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbb8bc8bf51f2fd916b2f4b8dce6316c");
        } else {
            com.sankuai.waimai.irmo.utils.h.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a14dcc78c3b79a1473df23052c18b2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3a14dcc78c3b79a1473df23052c18b2e");
                        return;
                    }
                    d.this.m = false;
                    d.this.a();
                    if (d.this.j != null) {
                        d.this.j.a(d.this.d, d.this.b, new h() { // from class: com.sankuai.waimai.irmo.render.d.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.irmo.render.h
                            public final void a(IrmoLayerInfo irmoLayerInfo, View view) {
                                Object[] objArr4 = {irmoLayerInfo, view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "30e04381a3d01dcfe99e75ce3e0f2df7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "30e04381a3d01dcfe99e75ce3e0f2df7");
                                } else if (irmoLayerInfo == null) {
                                } else {
                                    d.this.a(irmoLayerInfo, view);
                                }
                            }
                        });
                    }
                    d dVar = d.this;
                    IrmoLayerGroup irmoLayerGroup2 = irmoLayerGroup;
                    int i = 1;
                    Object[] objArr4 = {irmoLayerGroup2};
                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "f2c5b137beff5465b251d04157e5a93d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "f2c5b137beff5465b251d04157e5a93d");
                    } else {
                        for (IrmoLayerInfo irmoLayerInfo : irmoLayerGroup2.getLayers()) {
                            if (irmoLayerInfo != null) {
                                dVar.a(irmoLayerInfo, (View) null);
                            }
                        }
                    }
                    if (d.this.c != null) {
                        d.this.c.removeAllViews();
                    }
                    for (Map.Entry<IrmoLayerInfo, com.sankuai.waimai.irmo.render.engine.a> entry : d.this.g.entrySet()) {
                        if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                            entry.getValue().a();
                            List<? extends View> b2 = entry.getValue().b();
                            d dVar2 = d.this;
                            Object[] objArr5 = new Object[i];
                            objArr5[0] = b2;
                            ChangeQuickRedirect changeQuickRedirect5 = d.a;
                            if (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "1b3be7e816d6d3ae73683f03ffe4b060", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "1b3be7e816d6d3ae73683f03ffe4b060");
                            } else if (dVar2.c != null && b2 != null) {
                                for (View view : b2) {
                                    if (view.getParent() instanceof ViewGroup) {
                                        ((ViewGroup) view.getParent()).removeView(view);
                                    }
                                    dVar2.c.addView(view, -1, -1);
                                }
                            }
                            if (d.this.n != null) {
                                d.this.n.a("InfiniteLayerRendered", entry.getKey().type);
                            }
                            i = 1;
                        }
                    }
                    d.this.k = true;
                    d dVar3 = d.this;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = d.a;
                    if (PatchProxy.isSupport(objArr6, dVar3, changeQuickRedirect6, false, "76af1cf0d22d6b60ff5f9b44442508ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, dVar3, changeQuickRedirect6, false, "76af1cf0d22d6b60ff5f9b44442508ee");
                        return;
                    }
                    for (a aVar : dVar3.l) {
                        if (aVar != null) {
                            aVar.run();
                        }
                    }
                    dVar3.l.clear();
                }
            }, "IrmoRenderLayer");
        }
    }

    void a(@NonNull IrmoLayerInfo irmoLayerInfo, @Nullable View view) {
        com.sankuai.waimai.irmo.render.engine.a aVar;
        Object[] objArr = {irmoLayerInfo, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "475bdb6b3dcea7d60cea8a47df1ac1f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "475bdb6b3dcea7d60cea8a47df1ac1f2");
        } else if (irmoLayerInfo.rendered) {
        } else {
            LinkedList<com.sankuai.waimai.irmo.render.engine.a> linkedList = this.q.get(Integer.valueOf(irmoLayerInfo.type));
            if (linkedList != null) {
                aVar = linkedList.poll();
                com.sankuai.waimai.irmo.utils.d.a("IrmoEffectManager_Irmo buildOneEngine  复用池子获取引擎 ,  type: " + irmoLayerInfo.type + "  engine: " + aVar, new Object[0]);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                com.sankuai.waimai.irmo.render.engine.factory.a a2 = com.sankuai.waimai.irmo.render.engine.factory.b.a().a(irmoLayerInfo.type);
                if (a2 != null) {
                    aVar = a2.a(this.i, this.n, this.o);
                    com.sankuai.waimai.irmo.utils.d.a("IrmoEffectManager_Irmo buildOneEngine  创建新引擎 ,  type: " + irmoLayerInfo.type + " engine: " + aVar, new Object[0]);
                } else if (!this.m) {
                    this.m = true;
                    if (this.i != null) {
                        this.i.a(a.EnumC0973a.effect_failed, null);
                    }
                    if (this.n != null) {
                        this.n.a(false, IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
                    }
                }
            }
            if (aVar != null) {
                this.g.put(irmoLayerInfo, aVar);
                if (aVar instanceof com.sankuai.waimai.irmo.render.engine.f) {
                    ((com.sankuai.waimai.irmo.render.engine.f) aVar).b = this.e;
                }
                if (this.n != null) {
                    this.n.a("InfiniteLayerWillRender", irmoLayerInfo.type);
                }
                aVar.a(irmoLayerInfo, view);
                irmoLayerInfo.rendered = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b6cad9375f3edbdd716dc4dbd9c835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b6cad9375f3edbdd716dc4dbd9c835");
            return;
        }
        for (Map.Entry<IrmoLayerInfo, com.sankuai.waimai.irmo.render.engine.a> entry : this.g.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                IrmoLayerInfo key = entry.getKey();
                com.sankuai.waimai.irmo.render.engine.a value = entry.getValue();
                if (value.f()) {
                    if (value instanceof com.sankuai.waimai.irmo.render.engine.c) {
                        ((com.sankuai.waimai.irmo.render.engine.c) value).g();
                    }
                    LinkedList<com.sankuai.waimai.irmo.render.engine.a> linkedList = this.q.get(Integer.valueOf(key.type));
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        this.q.put(Integer.valueOf(key.type), linkedList);
                    }
                    if (!linkedList.contains(value)) {
                        com.sankuai.waimai.irmo.utils.d.a("IrmoEffectManager_Irmo releaseEngine  复用池添加引擎 ,  type: " + key.type + " engine: " + value, new Object[0]);
                        linkedList.offer(value);
                    }
                } else {
                    value.e();
                    com.sankuai.waimai.irmo.utils.d.a("IrmoEffectManager_Irmo releaseEngine  释放引擎 ,  type: " + key.type + " engine: " + value, new Object[0]);
                }
            }
        }
        this.g.clear();
    }

    public final void a(@Nonnull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745eb508e9d6eb32a5e3524bae343024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745eb508e9d6eb32a5e3524bae343024");
            return;
        }
        this.k = false;
        f();
        this.b.a(str, str2);
    }

    public final void a(@NonNull int i, @Nonnull String str, final String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c684357d0f4f27240191e84ced2c6b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c684357d0f4f27240191e84ced2c6b66");
            return;
        }
        switch (i) {
            case 0:
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f737484c95c9ce4ab39f12b8a008a32", RobustBitConfig.DEFAULT_VALUE)) {
                    this.k = false;
                    f();
                    final com.sankuai.waimai.irmo.render.b bVar = this.b;
                    Object[] objArr3 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.render.b.a;
                    if (!PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "58d190ffcdb07f5367df118cdfd16244", RobustBitConfig.DEFAULT_VALUE)) {
                        if (TextUtils.isEmpty(str)) {
                            bVar.a(10007);
                            break;
                        } else {
                            if (bVar.f != null) {
                                bVar.f.d = str;
                            }
                            if (bVar.c != null) {
                                bVar.c.a(str, 0, new IrmoResDownloader.a() { // from class: com.sankuai.waimai.irmo.render.b.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.irmo.render.load.IrmoResDownloader.a
                                    public final void a(@NonNull File file) {
                                        Object[] objArr4 = {file};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c2b13956c39d0ffe5b7a671097a476bf", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c2b13956c39d0ffe5b7a671097a476bf");
                                            return;
                                        }
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        String a2 = j.a(file);
                                        com.sankuai.waimai.irmo.utils.d.b("IrmoComposition_Irmoread dsl file: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms ", new Object[0]);
                                        if (!TextUtils.isEmpty(a2)) {
                                            bVar.a(a2, str2);
                                        } else {
                                            bVar.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.irmo.render.load.IrmoResDownloader.a
                                    public final void a() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "291601dfc7ca93da90af8537c5f388c0", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "291601dfc7ca93da90af8537c5f388c0");
                                        } else {
                                            bVar.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT);
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "58d190ffcdb07f5367df118cdfd16244");
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f737484c95c9ce4ab39f12b8a008a32");
                    break;
                }
                break;
            case 1:
                a(str, str2);
                break;
        }
        if (this.n != null) {
            i iVar = this.n;
            Object[] objArr4 = {str2};
            ChangeQuickRedirect changeQuickRedirect4 = i.a;
            if (PatchProxy.isSupport(objArr4, iVar, changeQuickRedirect4, false, "0e8291c3c45f88bd0269185567f75e98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, iVar, changeQuickRedirect4, false, "0e8291c3c45f88bd0269185567f75e98");
                return;
            }
            Object[] objArr5 = {str2};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.irmo.mach.c.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "b1c99d09e10c53eed7eb8514f03dec38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "b1c99d09e10c53eed7eb8514f03dec38");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("InfiniteViewInit", 1);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("templateId", str2);
            com.sankuai.waimai.irmo.mach.c.a(hashMap, hashMap2);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ecb4f536484421805c8596f49f53b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ecb4f536484421805c8596f49f53b75");
        } else {
            b(1, new c());
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596233be9c231cfb224ceb89a16aff90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596233be9c231cfb224ceb89a16aff90");
        } else {
            b(0, null);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db7c22c86cf85126ce3d7353ed42788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db7c22c86cf85126ce3d7353ed42788");
        } else {
            b(2, null);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc86a280cac8f7f0463e20a397a21fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc86a280cac8f7f0463e20a397a21fae");
        } else {
            b(3, null);
        }
    }

    private void b(int i, c cVar) {
        Object[] objArr = {Integer.valueOf(i), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabbbca42539f224929367e2b8c3bc2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabbbca42539f224929367e2b8c3bc2a");
        } else if (!this.k) {
            this.l.add(new a(i, cVar));
        } else {
            a(i, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private int c;
        private c d;

        public a(int i, c cVar) {
            Object[] objArr = {d.this, Integer.valueOf(i), cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b6105c0d9da86aa334be23ba99c6c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b6105c0d9da86aa334be23ba99c6c4");
                return;
            }
            this.c = i;
            this.d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85c97efae952763d8efe1fdd22b30e1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85c97efae952763d8efe1fdd22b30e1");
            } else {
                d.this.a(this.c, this.d);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c implements com.sankuai.waimai.irmo.render.engine.g {
        public static ChangeQuickRedirect a;
        int b;
        boolean c;

        private c() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f6eca890dd6b6057bec222c76091fd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f6eca890dd6b6057bec222c76091fd");
            }
        }

        @Override // com.sankuai.waimai.irmo.render.engine.g
        public final void a(IrmoLayerInfo irmoLayerInfo, boolean z) {
            Object[] objArr = {irmoLayerInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af52a10ee454ded94f97da9ea2d34c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af52a10ee454ded94f97da9ea2d34c1");
                return;
            }
            if (d.this.n != null && irmoLayerInfo != null) {
                d.this.n.a("InfiniteDidPlay", irmoLayerInfo.type);
            }
            if (z) {
                this.b--;
                if (this.b == 0) {
                    if (d.this.f != null) {
                        d.this.f.a();
                    }
                    if (d.this.n != null) {
                        d.this.n.a(true, 0);
                    }
                }
            } else if (this.c) {
            } else {
                this.c = true;
                if (d.this.i != null) {
                    d.this.i.a(a.EnumC0973a.effect_failed, null);
                }
                if (d.this.n != null) {
                    d.this.n.a(false, IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
                }
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ca63dcf57137022e0bd2e631c62caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ca63dcf57137022e0bd2e631c62caa");
            return;
        }
        a();
        if (this.b != null) {
            this.b.a();
        }
        if (this.l != null) {
            this.l.clear();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends com.sankuai.waimai.irmo.mach.effect.mgr.a {
        public static ChangeQuickRedirect b;
        public WeakReference<Activity> c;
        public WeakReference<d> d;

        @Override // com.sankuai.waimai.irmo.mach.effect.mgr.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c041e52b00afe1868d8d4856b19ed92e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c041e52b00afe1868d8d4856b19ed92e");
            } else {
                a(activity, false);
            }
        }

        @Override // com.sankuai.waimai.irmo.mach.effect.mgr.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690dcab13836e842aa196b7af638ab5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690dcab13836e842aa196b7af638ab5f");
            } else {
                a(activity, true);
            }
        }

        private void a(Activity activity, boolean z) {
            Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36ce288989a346d8c70d7b2b52c549cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36ce288989a346d8c70d7b2b52c549cf");
                return;
            }
            Activity activity2 = this.c == null ? null : this.c.get();
            d dVar = this.d != null ? this.d.get() : null;
            if (activity != activity2 || dVar == null) {
                return;
            }
            if (z) {
                d.a(dVar);
            } else {
                d.b(dVar);
            }
        }
    }
}
