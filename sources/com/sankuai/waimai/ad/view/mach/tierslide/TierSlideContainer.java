package com.sankuai.waimai.ad.view.mach.tierslide;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.CardLayoutManager;
import com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.h;
import com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.i;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TierSlideContainer extends MachViewGroup implements h, i {
    public static ChangeQuickRedirect a = null;
    private static final String c = "TierSlideContainer";
    public a b;
    private RecyclerView d;
    private com.sankuai.waimai.ad.view.mach.tierslide.a e;
    private d f;
    private CardLayoutManager g;
    private final Handler h;
    private List<com.sankuai.waimai.mach.node.a> i;
    private SparseArray<List<com.sankuai.waimai.mach.node.a>> j;
    private long l;
    private boolean m;
    private com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.d n;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    public static /* synthetic */ void a(TierSlideContainer tierSlideContainer) {
        int currentIndex;
        List<com.sankuai.waimai.mach.node.a> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tierSlideContainer, changeQuickRedirect, false, "dae53a8f3e8f46321007f0d137ffae09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tierSlideContainer, changeQuickRedirect, false, "dae53a8f3e8f46321007f0d137ffae09");
        } else if (tierSlideContainer.f != null && tierSlideContainer.i != null && tierSlideContainer.i.size() != 0 && tierSlideContainer.j != null && (currentIndex = tierSlideContainer.getCurrentIndex()) >= 0 && (list = tierSlideContainer.j.get(currentIndex)) != null) {
            if (tierSlideContainer.b != null) {
                tierSlideContainer.b.a(currentIndex);
            }
            tierSlideContainer.l = tierSlideContainer.f.i;
            for (com.sankuai.waimai.mach.node.a aVar : list) {
                if (aVar != null && (aVar.h instanceof com.sankuai.waimai.ad.view.mach.tierslide.b)) {
                    com.sankuai.waimai.ad.view.mach.tierslide.b bVar = (com.sankuai.waimai.ad.view.mach.tierslide.b) aVar.h;
                    if (!bVar.c()) {
                        bVar.aa_();
                    }
                    long a2 = bVar.a(tierSlideContainer.f);
                    if (a2 > 0) {
                        tierSlideContainer.l = a2;
                    }
                }
            }
            if (!tierSlideContainer.f.c || tierSlideContainer.h.hasMessages(1002)) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1002;
            obtain.obj = Integer.valueOf(currentIndex);
            tierSlideContainer.h.sendMessageDelayed(obtain, tierSlideContainer.l);
        }
    }

    public static /* synthetic */ void b(TierSlideContainer tierSlideContainer) {
        int currentIndex;
        List<com.sankuai.waimai.mach.node.a> list;
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tierSlideContainer, changeQuickRedirect, false, "4b948cb456b59c41f6905ec6e9f6fff1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tierSlideContainer, changeQuickRedirect, false, "4b948cb456b59c41f6905ec6e9f6fff1");
        } else if (tierSlideContainer.f != null && tierSlideContainer.j != null && (currentIndex = tierSlideContainer.getCurrentIndex()) >= 0 && (list = tierSlideContainer.j.get(currentIndex)) != null) {
            for (com.sankuai.waimai.mach.node.a aVar : list) {
                if (aVar != null && (aVar.h instanceof com.sankuai.waimai.ad.view.mach.tierslide.b)) {
                    com.sankuai.waimai.ad.view.mach.tierslide.b bVar = (com.sankuai.waimai.ad.view.mach.tierslide.b) aVar.h;
                    if (tierSlideContainer.isAttachedToWindow()) {
                        i = 1;
                    } else {
                        i = tierSlideContainer.isActivated() ? 0 : 2;
                    }
                    bVar.a(i);
                }
            }
        }
    }

    public static /* synthetic */ void c(TierSlideContainer tierSlideContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tierSlideContainer, changeQuickRedirect, false, "cf73b3c1265536d782615f65c314ec53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tierSlideContainer, changeQuickRedirect, false, "cf73b3c1265536d782615f65c314ec53");
        } else if (tierSlideContainer.d == null || tierSlideContainer.g == null || tierSlideContainer.f == null || tierSlideContainer.i == null || tierSlideContainer.i.size() == 0 || tierSlideContainer.j == null) {
        } else {
            tierSlideContainer.d.smoothScrollToPosition(tierSlideContainer.g.c + 1);
        }
    }

    public static /* synthetic */ void d(TierSlideContainer tierSlideContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tierSlideContainer, changeQuickRedirect, false, "9c4cb11cca924f08d345c64d04d41bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tierSlideContainer, changeQuickRedirect, false, "9c4cb11cca924f08d345c64d04d41bbd");
        } else if (tierSlideContainer.f != null && tierSlideContainer.i != null && tierSlideContainer.i.size() != 0 && tierSlideContainer.j != null) {
            for (int i = 0; i < tierSlideContainer.j.size(); i++) {
                for (com.sankuai.waimai.mach.node.a aVar : tierSlideContainer.j.get(i)) {
                    if (aVar != null && (aVar.h instanceof com.sankuai.waimai.ad.view.mach.tierslide.b)) {
                        ((com.sankuai.waimai.ad.view.mach.tierslide.b) aVar.h).ab_();
                    }
                }
            }
            tierSlideContainer.j.clear();
        }
    }

    public TierSlideContainer(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b94a58c3d65f01fb1c46cc7a4a16ac60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b94a58c3d65f01fb1c46cc7a4a16ac60");
        }
    }

    private TierSlideContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb25c258c1f54bbe5961512cff44cf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb25c258c1f54bbe5961512cff44cf3");
        }
    }

    public TierSlideContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21bf24425ab8d43f9cb4e4cbb0bb470d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21bf24425ab8d43f9cb4e4cbb0bb470d");
            return;
        }
        this.h = new b(this);
        this.i = new ArrayList();
        this.j = new SparseArray<>();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f1aed1e4bbc5307bbd6bf2779094032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f1aed1e4bbc5307bbd6bf2779094032");
            return;
        }
        this.d = new RecyclerView(context);
        this.d.setOverScrollMode(2);
        addView(this.d, -1, -1);
    }

    public final void a(d dVar, com.sankuai.waimai.mach.node.a<TierSlideContainer> aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81487eb21fad473659dd1ee0c7952084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81487eb21fad473659dd1ee0c7952084");
        } else if (a(aVar) && dVar != null && this.d != null) {
            this.f = dVar;
            this.i = new ArrayList(aVar.b());
            if (this.e == null) {
                this.e = new com.sankuai.waimai.ad.view.mach.tierslide.a(this.i, aVar.f.getRenderEngine());
                this.d.setAdapter(this.e);
            } else {
                this.e.a(this.i);
            }
            boolean z = this.i.size() > 1 && dVar.d;
            this.f.c = this.f.c && z;
            if (this.g == null) {
                this.g = new CardLayoutManager();
            }
            this.g.a(dVar.b >= this.i.size() ? 1 : dVar.b);
            this.g.a(dVar.b());
            this.g.b = f();
            this.g.h = this;
            this.g.i = z;
            this.g.j = dVar.f;
            this.g.scrollToPosition((this.i.size() * 100) + 1);
            this.d.setItemAnimator(null);
            this.d.setLayoutManager(this.g);
            if (this.n == null) {
                this.n = new com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.d();
                try {
                    this.n.a(this.d);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(c, e);
                }
            }
            this.n.e = z;
            this.n.c = this;
            this.n.d = this;
            this.j.clear();
            for (int i = 0; i < this.i.size(); i++) {
                ArrayList arrayList = new ArrayList();
                a(this.i.get(i), arrayList);
                this.j.put(i, arrayList);
            }
            this.e.b = this.j;
        }
    }

    private float f() {
        com.sankuai.waimai.mach.node.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e7b1bff26170b3fbafc15497c4b3d04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e7b1bff26170b3fbafc15497c4b3d04")).floatValue();
        }
        if (this.i == null || this.i.size() == 0 || (aVar = this.i.get(0)) == null) {
            return 1.3333334f;
        }
        int t = aVar.t();
        int s = aVar.s();
        if (t == 0 || s == 0) {
            return 1.3333334f;
        }
        return ((s * 1.0f) / t) * 1.0f;
    }

    private boolean a(com.sankuai.waimai.mach.node.a<TierSlideContainer> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ee2815093018a90c5ab5c9b9b45ff8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ee2815093018a90c5ab5c9b9b45ff8")).booleanValue() : (aVar == null || aVar.b() == null || aVar.b().size() <= 0) ? false : true;
    }

    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e43b2c7f4295fb7d99ec2898eb5c000", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e43b2c7f4295fb7d99ec2898eb5c000")).intValue();
        }
        if (this.i == null) {
            return 0;
        }
        return this.i.size();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f64f840ec6bffe298ec621479334c0d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f64f840ec6bffe298ec621479334c0d5");
        } else if (this.f == null || this.i == null || this.i.size() == 0 || this.j == null) {
        } else {
            StringBuilder sb = new StringBuilder("container");
            sb.append(hashCode());
            sb.append(": start");
            if (this.h.hasMessages(1000)) {
                return;
            }
            this.h.sendEmptyMessage(1000);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "498b7274509905a693d75a9c6150d095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "498b7274509905a693d75a9c6150d095");
            return;
        }
        StringBuilder sb = new StringBuilder("container");
        sb.append(hashCode());
        sb.append(": stop");
        this.h.removeCallbacksAndMessages(null);
        this.h.sendEmptyMessage(1001);
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.i
    public final void a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1d7500f438d3ee552cf31346e89ea89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1d7500f438d3ee552cf31346e89ea89");
        } else {
            this.h.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.i
    public final void b(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be0aae6ab7e7fded4dafa77bdf3e7e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be0aae6ab7e7fded4dafa77bdf3e7e2");
        } else if (this.f == null || this.i == null || this.i.size() == 0 || this.j == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = 1000;
            obtain.obj = "onAnimOutStop";
            this.h.sendMessage(obtain);
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.i
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b86743403bc85235610efc37d54444f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b86743403bc85235610efc37d54444f");
        } else {
            this.h.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.i
    public final void b(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de894874fbad1cf81db31ca248a7aeb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de894874fbad1cf81db31ca248a7aeb0");
        } else if (this.f == null || this.i == null || this.i.size() == 0 || this.j == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = 1000;
            obtain.obj = "onAnimInStop";
            this.h.sendMessage(obtain);
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.h
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c27a3597212297922da6d39cfa0a55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c27a3597212297922da6d39cfa0a55");
        } else {
            this.h.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.h, com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.i
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6372576582125b20e5b9854a4947cb0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6372576582125b20e5b9854a4947cb0d");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1000;
        obtain.obj = "onTouchActionUp";
        this.h.sendMessage(obtain);
    }

    public a getIndexChangedListener() {
        return this.b;
    }

    public void setIndexChangedListener(a aVar) {
        this.b = aVar;
    }

    public int getCurrentIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fb6f996f430782974bd886eb057baa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fb6f996f430782974bd886eb057baa")).intValue();
        }
        if (this.i == null || this.i.size() == 0 || this.g == null) {
            return -1;
        }
        return this.g.c % this.i.size();
    }

    public void setPagerVisibility(boolean z) {
        this.m = z;
    }

    public boolean getPagerVisibility() {
        return this.m;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67781d6c728c92e04a54df3e5e07f69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67781d6c728c92e04a54df3e5e07f69");
        } else if (this.f == null || this.i == null || this.i.size() == 0 || this.j == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = 1003;
            this.h.sendMessage(obtain);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends Handler {
        public static ChangeQuickRedirect a;
        public WeakReference<TierSlideContainer> b;

        public b(TierSlideContainer tierSlideContainer) {
            Object[] objArr = {tierSlideContainer};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be91537232d8a08a6a6b2b7ca612968e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be91537232d8a08a6a6b2b7ca612968e");
            } else {
                this.b = new WeakReference<>(tierSlideContainer);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c48f9aeb7fe7c8f9f3a5fedd76b5c91", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c48f9aeb7fe7c8f9f3a5fedd76b5c91");
                return;
            }
            TierSlideContainer tierSlideContainer = this.b.get();
            if (tierSlideContainer == null) {
                return;
            }
            switch (message.what) {
                case 1000:
                    TierSlideContainer.a(tierSlideContainer);
                    return;
                case 1001:
                    TierSlideContainer.b(tierSlideContainer);
                    return;
                case 1002:
                    TierSlideContainer.c(tierSlideContainer);
                    return;
                case 1003:
                    TierSlideContainer.d(tierSlideContainer);
                    return;
                default:
                    return;
            }
        }
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c417baf7811537850063a3710f2e058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c417baf7811537850063a3710f2e058");
        } else if (aVar != null) {
            try {
                if (aVar.h instanceof com.sankuai.waimai.ad.view.mach.tierslide.b) {
                    list.add(aVar);
                    String templateId = aVar.f.getTemplateId();
                    String d = ((com.sankuai.waimai.ad.view.mach.tierslide.b) aVar.h).d();
                    Object[] objArr2 = {templateId, d};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ad.monitor.b.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "291cf71f7e9e1399a8b9dbf0a38dd08e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "291cf71f7e9e1399a8b9dbf0a38dd08e");
                    } else {
                        com.sankuai.waimai.report.c.a().a("templateId", templateId).a("widgetTag", d).a("WMADMachWidgetUseAnalysis", Collections.singletonList(Float.valueOf(1.0f))).a();
                    }
                }
                List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
                if (b2 != null && b2.size() != 0) {
                    for (com.sankuai.waimai.mach.node.a aVar2 : b2) {
                        a(aVar2, list);
                    }
                }
            } catch (Exception e) {
                Log.wtf(c, e.getMessage());
            }
        }
    }
}
