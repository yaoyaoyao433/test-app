package com.dianping.agentsdk.sectionrecycler.section;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.framework.z;
import com.dianping.agentsdk.sectionrecycler.a;
import com.dianping.shield.adapter.MergeAdapterTypeRefreshListener;
import com.dianping.shield.adapter.TopPositionAdapter;
import com.dianping.shield.debug.PerformanceManager;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.feature.TopPositionInterface;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.dianping.shield.node.PositionType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.dianping.agentsdk.sectionrecycler.section.e<a> implements com.dianping.agentsdk.pagecontainer.e, a.InterfaceC0052a, TopLinearLayoutManager.OnViewTopStateChangeListener {
    public static ChangeQuickRedirect a;
    protected SparseArray<TopPositionAdapter.TopInfo> b;
    public SparseArray<TopPositionInterface.OnTopStateChangeListener> c;
    public ArrayList<com.dianping.agentsdk.sectionrecycler.section.c> d;
    public d e;
    public String f;
    public MergeAdapterTypeRefreshListener g;
    public e h;
    private ArrayList<C0053b> i;
    private f j;
    private HashMap<Pair<String, Integer>, Integer> k;
    private HashMap<String, com.dianping.agentsdk.sectionrecycler.section.c> l;
    private int m;
    private HashMap<Pair<com.dianping.agentsdk.sectionrecycler.section.c, Long>, Long> n;
    private long o;
    private PerformanceManager p;
    private int q;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.agentsdk.sectionrecycler.section.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0053b {
        public z.b a = z.b.DEFAULT;
        public z.a b = z.a.DEFAULT;
        public ArrayList<c> c = new ArrayList<>();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e {
        void a(SparseArray<TopPositionAdapter.TopInfo> sparseArray);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public final /* synthetic */ void onBindViewHolder(RecyclerView.s sVar, int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        a aVar = (a) sVar;
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb4afa90c71b1e9bf052ea21ef986c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb4afa90c71b1e9bf052ea21ef986c0");
            return;
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return;
        }
        if (this.p != null) {
            Date date = new Date();
            cVar.onBindViewHolder((com.dianping.agentsdk.sectionrecycler.section.c) aVar, a2.c, a2.d);
            this.p.insertRecord(this.f, cVar, "bindViewHolder", date.getTime(), new Date().getTime());
            return;
        }
        cVar.onBindViewHolder((com.dianping.agentsdk.sectionrecycler.section.c) aVar, a2.c, a2.d);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        String str;
        String str2;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a006ff122357d1c186af85cab8c8f2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a006ff122357d1c186af85cab8c8f2d");
        }
        Pair<String, Integer> b = b(i);
        if (b != null && !TextUtils.isEmpty((CharSequence) b.first)) {
            String str3 = (String) b.first;
            Object[] objArr2 = {str3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "457ba160f7b77cfb35297d268b2884fe", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (com.dianping.agentsdk.sectionrecycler.section.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "457ba160f7b77cfb35297d268b2884fe");
            } else {
                cVar = (this.l == null || TextUtils.isEmpty(str3)) ? null : this.l.get(str3);
            }
            if (cVar != null) {
                if (this.p != null) {
                    Date date = new Date();
                    a aVar = (a) cVar.onCreateViewHolder(viewGroup, ((Integer) b.second).intValue());
                    this.p.insertRecord(this.f, cVar, "createViewHolder", date.getTime(), new Date().getTime());
                    return aVar;
                }
                a aVar2 = (a) cVar.onCreateViewHolder(viewGroup, ((Integer) b.second).intValue());
                if (aVar2 == null || aVar2.itemView == null) {
                    AgentInterface agentInterface = cVar.getAgentInterface();
                    af sectionCellInterface = cVar.getSectionCellInterface();
                    if (agentInterface != null) {
                        str2 = agentInterface.getClass().getCanonicalName();
                        str = agentInterface.getHostName();
                    } else {
                        str = null;
                        str2 = null;
                    }
                    ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(getClass(), String.format("ItemView Man NOT be null, at Agent(host name) = %s AgentInterface %s, CellInterface %s, type = %s, context = %s", str, str2, sectionCellInterface != null ? sectionCellInterface.getClass().getCanonicalName() : null, b.second, getContext()));
                }
                return aVar2;
            }
            ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(getClass(), String.format("Apdater = null, ItemView Man NOT be null, pair = %s, context = %s", b, getContext()));
            return null;
        }
        ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(getClass(), String.format("pair = null, ItemView Man NOT be null, pair = %s, context = %s", b, getContext()));
        return null;
    }

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18f1410aac725587d6d002d2a319fbb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18f1410aac725587d6d002d2a319fbb2");
            return;
        }
        this.b = new SparseArray<>();
        this.c = new SparseArray<>();
        this.d = new ArrayList<>();
        this.i = new ArrayList<>();
        this.j = new f();
        this.k = new HashMap<>();
        this.l = new HashMap<>();
        this.n = new HashMap<>();
        this.e = new d();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.e, com.dianping.agentsdk.sectionrecycler.section.d, android.support.v7.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1907f403e142860317c27aa1b2c76c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1907f403e142860317c27aa1b2c76c9");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f1db93f6692b0019896e842a1d8acab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f1db93f6692b0019896e842a1d8acab")).booleanValue() : ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(getContext().getApplicationContext(), "MergeSharedPerferance").getBoolean("NeedBounds", false)) {
                recyclerView.addItemDecoration(new com.dianping.agentsdk.sectionrecycler.a(this));
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e80cc1d5bec0227adf2ffad3cb82193a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e80cc1d5bec0227adf2ffad3cb82193a")).booleanValue() : ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(getContext().getApplicationContext(), "MergeSharedPerferance").getBoolean("NeedPerformance", false)) {
            this.p = new PerformanceManager(getContext());
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e13f03c449931dbad6d3b18ea908dc6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e13f03c449931dbad6d3b18ea908dc6c");
            return;
        }
        d();
        e();
        f();
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a8292afec93ad81f7e962ddfd86d29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a8292afec93ad81f7e962ddfd86d29");
            return;
        }
        Iterator<com.dianping.agentsdk.sectionrecycler.section.c> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().unregisterAdapterDataObserver(this.e);
        }
        this.d.clear();
        a();
        notifyDataSetChanged();
        b();
    }

    private void d() {
        int i;
        AgentInterface agentInterface;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2bb1bcdf43421ca0c4e7a5444f8ab0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2bb1bcdf43421ca0c4e7a5444f8ab0f");
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        this.i.clear();
        this.j.b();
        this.b.clear();
        int size = this.d.size();
        int i2 = 0;
        int i3 = 0;
        C0053b c0053b = null;
        while (i2 < size) {
            com.dianping.agentsdk.sectionrecycler.section.c cVar = this.d.get(i2);
            if (cVar != null) {
                if (cVar.getAgentInterface() != null) {
                    str = agentInterface.getIndex() + CommonConstant.Symbol.COLON + agentInterface.getHostName();
                } else {
                    str = null;
                }
                ArrayList<TopPositionAdapter.TopInfo> topInfoList = cVar.getTopInfoList();
                Iterator<TopPositionAdapter.TopInfo> it = topInfoList != null ? topInfoList.iterator() : null;
                TopPositionAdapter.TopInfo next = (it == null || !it.hasNext()) ? null : it.next();
                int sectionCount = cVar.getSectionCount();
                ArrayList arrayList = new ArrayList();
                int i4 = i3;
                TopPositionAdapter.TopInfo topInfo = next;
                C0053b c0053b2 = c0053b;
                int i5 = 0;
                while (i5 < sectionCount) {
                    boolean b = b(cVar, i5);
                    if (c0053b2 == null || b) {
                        C0053b c0053b3 = new C0053b();
                        c0053b3.a = cVar.getPreviousLinkType(i5);
                        c0053b3.b = cVar.getNextLinkType(i5);
                        this.i.add(c0053b3);
                        c0053b2 = c0053b3;
                    } else {
                        c0053b2.b = cVar.getNextLinkType(i5);
                    }
                    int rowCount = cVar.getRowCount(i5);
                    ArrayList arrayList2 = new ArrayList();
                    int i6 = size;
                    com.dianping.agentsdk.sectionrecycler.section.c cVar2 = cVar;
                    int i7 = i4;
                    TopPositionAdapter.TopInfo topInfo2 = topInfo;
                    int i8 = 0;
                    while (i8 < rowCount) {
                        int i9 = rowCount;
                        c cVar3 = new c();
                        cVar3.b = i2;
                        cVar3.c = i5;
                        cVar3.d = i8;
                        int i10 = sectionCount;
                        c0053b2.c.add(cVar3);
                        this.j.a(str, i5, i8, b);
                        if (topInfo2 != null && topInfo2.section == i5 && topInfo2.row == i8) {
                            this.b.put(i7, topInfo2);
                            this.c.put(i7, topInfo2.onTopStateChangeListener);
                            arrayList2.add(topInfo2);
                            arrayList.add(topInfo2);
                            topInfo2 = it.hasNext() ? it.next() : null;
                        }
                        i7++;
                        i8++;
                        rowCount = i9;
                        sectionCount = i10;
                    }
                    int i11 = sectionCount;
                    int i12 = i7 - 1;
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        TopPositionAdapter.TopInfo topInfo3 = (TopPositionAdapter.TopInfo) it2.next();
                        topInfo3.sectionStart = i4;
                        topInfo3.sectionEnd = i12;
                    }
                    i5++;
                    topInfo = topInfo2;
                    i4 = i7;
                    size = i6;
                    cVar = cVar2;
                    sectionCount = i11;
                }
                i = size;
                int i13 = i4 - 1;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    TopPositionAdapter.TopInfo topInfo4 = (TopPositionAdapter.TopInfo) it3.next();
                    topInfo4.moduleStart = i3;
                    topInfo4.moduleEnd = i13;
                }
                c0053b = c0053b2;
                i3 = i4;
            } else {
                i = size;
            }
            i2++;
            size = i;
        }
        this.j.a();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289bdbc009bf31a4ffceda0f022f1247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289bdbc009bf31a4ffceda0f022f1247");
        } else if (this.h != null) {
            this.h.a(this.b);
        }
    }

    private boolean b(com.dianping.agentsdk.sectionrecycler.section.c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e8d8b2c3fc35cce086e92a747e9e68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e8d8b2c3fc35cce086e92a747e9e68")).booleanValue();
        }
        if (cVar == null || i < 0 || cVar.getSectionCount() <= i) {
            return false;
        }
        if (this.i == null || this.i.isEmpty()) {
            return true;
        }
        C0053b c0053b = this.i.get(this.i.size() - 1);
        z.b previousLinkType = cVar.getPreviousLinkType(i);
        if (c0053b.b == z.a.LINK_UNSAFE_BETWEEN_GROUP) {
            return false;
        }
        if (c0053b.b == z.a.DISABLE_LINK_TO_NEXT || previousLinkType == z.b.DISABLE_LINK_TO_PREVIOUS) {
            return true;
        }
        return (c0053b.b == z.a.LINK_TO_NEXT || previousLinkType == z.b.LINK_TO_PREVIOUS) ? false : true;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af87db3e32ee9a996f11bcd24140fbea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af87db3e32ee9a996f11bcd24140fbea");
            return;
        }
        if (this.k == null) {
            this.k = new HashMap<>();
        }
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        for (int i = 0; i < this.d.size(); i++) {
            com.dianping.agentsdk.sectionrecycler.section.c cVar = this.d.get(i);
            if (cVar != null) {
                if (!this.l.containsKey(cVar.getMappingKey())) {
                    this.l.put(cVar.getMappingKey(), cVar);
                }
                for (int i2 = 0; i2 < cVar.getSectionCount(); i2++) {
                    for (int i3 = 0; i3 < cVar.getRowCount(i2); i3++) {
                        Pair<String, Integer> pair = new Pair<>(cVar.getMappingKey(), Integer.valueOf(cVar.getItemViewType(i2, i3)));
                        if (!this.k.containsKey(pair)) {
                            this.k.put(pair, Integer.valueOf(this.m));
                            this.m++;
                        }
                    }
                }
            }
        }
        if (this.g != null) {
            this.g.onMergedTypeRefresh();
        }
    }

    private Pair<String, Integer> b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c0b6ad42013677770ce0d4350303e12", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c0b6ad42013677770ce0d4350303e12");
        }
        if (this.k == null || this.k.size() <= i) {
            return null;
        }
        for (Map.Entry<Pair<String, Integer>, Integer> entry : this.k.entrySet()) {
            if (entry.getValue().intValue() == i) {
                return entry.getKey();
            }
        }
        return null;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86b2b15b16c39d77cd57f6cf73ddbb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86b2b15b16c39d77cd57f6cf73ddbb0");
            return;
        }
        if (this.n == null) {
            this.n = new HashMap<>();
        }
        for (int i = 0; i < this.d.size(); i++) {
            com.dianping.agentsdk.sectionrecycler.section.c cVar = this.d.get(i);
            if (cVar != null) {
                for (int i2 = 0; i2 < cVar.getSectionCount(); i2++) {
                    for (int i3 = 0; i3 < cVar.getRowCount(i2); i3++) {
                        Pair<com.dianping.agentsdk.sectionrecycler.section.c, Long> pair = new Pair<>(cVar, Long.valueOf(cVar.getItemId(i2, i3)));
                        if (!this.n.containsKey(pair)) {
                            this.n.put(pair, Long.valueOf(this.o));
                            this.o++;
                        }
                    }
                }
            }
        }
    }

    public final com.dianping.agentsdk.sectionrecycler.section.c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed70c00c6be097fa60447ffbbb8b2e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.agentsdk.sectionrecycler.section.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed70c00c6be097fa60447ffbbb8b2e0");
        }
        if (this.d == null || this.d.size() <= i) {
            return null;
        }
        return this.d.get(i);
    }

    private C0053b c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91e899cb946c48d1cc7ba6ac3dcc414", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0053b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91e899cb946c48d1cc7ba6ac3dcc414");
        }
        if (this.i == null || this.i.size() <= i || i < 0) {
            return null;
        }
        return this.i.get(i);
    }

    public final c a(int i, int i2) {
        C0053b c2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a61bce98bd4663e0b19dc3baf8d1d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a61bce98bd4663e0b19dc3baf8d1d2");
        }
        if (this.i == null || this.i.size() <= i || i < 0 || (c2 = c(i)) == null || c2.c == null || c2.c.size() <= i2 || i2 < 0) {
            return null;
        }
        return c2.c.get(i2);
    }

    public final int a(com.dianping.agentsdk.sectionrecycler.section.c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43adddad82581cc9d5c0f28a844122f5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43adddad82581cc9d5c0f28a844122f5")).intValue() : a(cVar, i, i2, true);
    }

    public final int a(com.dianping.agentsdk.sectionrecycler.section.c cVar, int i, int i2, boolean z) {
        Pair<Integer, Integer> pair;
        int i3 = 0;
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f12e458d243a8599ba3ba9134582fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f12e458d243a8599ba3ba9134582fa")).intValue();
        }
        int a2 = a((ArrayList<ArrayList<com.dianping.agentsdk.sectionrecycler.section.c>>) this.d, (ArrayList<com.dianping.agentsdk.sectionrecycler.section.c>) cVar);
        if (a2 >= 0 && this.i != null && !this.i.isEmpty()) {
            Iterator<C0053b> it = this.i.iterator();
            while (it.hasNext()) {
                C0053b next = it.next();
                if (next != null && next.c != null && !next.c.isEmpty()) {
                    Iterator<c> it2 = next.c.iterator();
                    while (it2.hasNext()) {
                        c next2 = it2.next();
                        if (next2 != null) {
                            if (next2.b == a2) {
                                if (z) {
                                    pair = cVar.getInnerPosition(next2.c, next2.d);
                                } else {
                                    pair = new Pair<>(Integer.valueOf(next2.c), Integer.valueOf(next2.d));
                                }
                                if (pair != null && ((Integer) pair.first).intValue() == i && ((Integer) pair.second).intValue() == i2) {
                                    return i3;
                                }
                            }
                            i3++;
                        }
                    }
                    continue;
                }
            }
        }
        return INDEX_NOT_EXIST;
    }

    public final int a(com.dianping.agentsdk.sectionrecycler.section.c cVar, int i) {
        String mappingKey;
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4500a251e4f243e339e6e9167da9c461", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4500a251e4f243e339e6e9167da9c461")).intValue();
        }
        if (this.k != null && !this.k.isEmpty() && cVar != null && (mappingKey = cVar.getMappingKey()) != null) {
            for (Map.Entry<Pair<String, Integer>, Integer> entry : this.k.entrySet()) {
                if (mappingKey.equals(entry.getKey().first) && i == cVar.getInnerType(((Integer) entry.getKey().second).intValue())) {
                    return entry.getValue().intValue();
                }
            }
        }
        return TYPE_NOT_EXIST;
    }

    private <T> int a(ArrayList<T> arrayList, T t) {
        Object[] objArr = {arrayList, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e2938b7ff4fdda304dc3883948325a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e2938b7ff4fdda304dc3883948325a")).intValue();
        }
        if (t == null || arrayList == null || arrayList.isEmpty()) {
            return INDEX_NOT_EXIST;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == t) {
                return i;
            }
        }
        return INDEX_NOT_EXIST;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final float getSectionHeaderHeight(int i) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5965306a9ff26233635f095c832374ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5965306a9ff26233635f095c832374ef")).floatValue();
        }
        c a2 = a(i, 0);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return -1.0f;
        }
        return cVar.getSectionHeaderHeight(a2.c);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getSectionHeaderDrawable(int i) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccaeeeee88b603fcbfa05879224df3ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccaeeeee88b603fcbfa05879224df3ef");
        }
        c a2 = a(i, 0);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return null;
        }
        return cVar.getSectionHeaderDrawable(a2.c);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final float getSectionFooterHeight(int i) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46340c6e737de79a4354251229f95632", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46340c6e737de79a4354251229f95632")).floatValue();
        }
        c a2 = a(i, getRowCount(i) - 1);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return -1.0f;
        }
        return cVar.getSectionFooterHeight(a2.c);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getSectionFooterDrawable(int i) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d2f6584528fbe935da07ae163d513c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d2f6584528fbe935da07ae163d513c");
        }
        c a2 = a(i, getRowCount(i) - 1);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return null;
        }
        return cVar.getSectionFooterDrawable(a2.c);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final boolean hasTopDividerVerticalOffset(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc347f1b7180572762de37e1a64584a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc347f1b7180572762de37e1a64584a6")).booleanValue();
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return false;
        }
        return cVar.hasTopDividerVerticalOffset(a2.c, a2.d);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final boolean hasBottomDividerVerticalOffset(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3fc5c1939e881790941213b1aae49c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3fc5c1939e881790941213b1aae49c1")).booleanValue();
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return false;
        }
        return cVar.hasBottomDividerVerticalOffset(a2.c, a2.d);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showTopDivider(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf9a05513702ba23d8403fb1822d8cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf9a05513702ba23d8403fb1822d8cf")).booleanValue();
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return false;
        }
        return cVar.showTopDivider(a2.c, a2.d);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showBottomDivider(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48b03d0eb45134d4a1c751010aaa38b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48b03d0eb45134d4a1c751010aaa38b9")).booleanValue();
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return false;
        }
        return cVar.showBottomDivider(a2.c, a2.d);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getTopDivider(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f18d6cc296c8072e4f89a21873fd3a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f18d6cc296c8072e4f89a21873fd3a3");
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return null;
        }
        return cVar.getTopDivider(a2.c, a2.d);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getBottomDivider(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc8de93864e1b5ed5e1d85bbe757406b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc8de93864e1b5ed5e1d85bbe757406b");
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return null;
        }
        return cVar.getBottomDivider(a2.c, a2.d);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect topDividerOffset(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbfed6347017150d9226e45feef7e91", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbfed6347017150d9226e45feef7e91");
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return null;
        }
        return cVar.topDividerOffset(a2.c, a2.d);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect bottomDividerOffset(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0a8bbf1f7100f045a8465cb5c676db", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0a8bbf1f7100f045a8465cb5c676db");
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return null;
        }
        return cVar.bottomDividerOffset(a2.c, a2.d);
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public final int getItemViewType(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        int i3;
        int i4;
        String str;
        AgentInterface agentInterface;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c41af04d638dd7a95ff12cda5b61ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c41af04d638dd7a95ff12cda5b61ae")).intValue();
        }
        c a2 = a(i, i2);
        String str2 = null;
        int i5 = -1;
        if (a2 != null) {
            cVar = this.d.get(a2.b);
            if (cVar != null) {
                int i6 = a2.c;
                i4 = a2.d;
                int itemViewType = cVar.getItemViewType(a2.c, a2.d);
                Pair pair = new Pair(cVar.getMappingKey(), Integer.valueOf(itemViewType));
                if (this.k.containsKey(pair)) {
                    return this.k.get(pair).intValue();
                }
                i5 = itemViewType;
                i3 = i6;
                if (cVar != null || (agentInterface = cVar.getAgentInterface()) == null) {
                    str = null;
                } else {
                    str2 = agentInterface.getHostName();
                    str = agentInterface.getClass().getCanonicalName();
                }
                ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(getClass(), String.format(Locale.getDefault(), "Could not find type %d for agent %s(%s) at agent section %d, row %d. (Global position is %d-%d)", Integer.valueOf(i5), str2, str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2)));
                return TYPE_NOT_EXIST;
            }
        } else {
            cVar = null;
        }
        i3 = -1;
        i4 = -1;
        if (cVar != null) {
        }
        str = null;
        ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(getClass(), String.format(Locale.getDefault(), "Could not find type %d for agent %s(%s) at agent section %d, row %d. (Global position is %d-%d)", Integer.valueOf(i5), str2, str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2)));
        return TYPE_NOT_EXIST;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public final long getItemId(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "790d2afe52352c177e23d53956cfbabf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "790d2afe52352c177e23d53956cfbabf")).longValue();
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return 0L;
        }
        Pair pair = new Pair(cVar, Long.valueOf(cVar.getItemId(a2.c, a2.d)));
        if (this.n.containsKey(pair)) {
            return this.n.get(pair).longValue();
        }
        return 0L;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public final int getSectionCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedf21fabaf638db74eec8bfd81f4ba9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedf21fabaf638db74eec8bfd81f4ba9")).intValue() : this.i.size();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.d
    public final int getRowCount(int i) {
        C0053b c0053b;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aaebaba6a47ef68d110677a65a51096", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aaebaba6a47ef68d110677a65a51096")).intValue();
        }
        if (i >= this.i.size() || (c0053b = this.i.get(i)) == null || c0053b.c == null) {
            return 0;
        }
        return c0053b.c.size();
    }

    @Override // com.dianping.agentsdk.sectionrecycler.a.InterfaceC0052a
    public final int getGroupPosition(int i) {
        c a2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d394a4dda7716967da169b7827b8ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d394a4dda7716967da169b7827b8ed")).intValue();
        }
        Pair<Integer, Integer> sectionIndex = getSectionIndex(i);
        if (sectionIndex == null || (a2 = a(((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue())) == null) {
            return -1;
        }
        return a2.b;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.a.InterfaceC0052a
    public final String getGroupText(int i) {
        c a2;
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a3d6d08f55789a4dd3fe31b6855487", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a3d6d08f55789a4dd3fe31b6855487");
        }
        Pair<Integer, Integer> sectionIndex = getSectionIndex(i);
        if (sectionIndex == null || (a2 = a(((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue())) == null || (cVar = this.d.get(a2.b)) == null) {
            return null;
        }
        AgentInterface agentInterface = cVar.getAgentInterface();
        af sectionCellInterface = cVar.getSectionCellInterface();
        String str = "";
        String str2 = "";
        if (agentInterface != null) {
            str = agentInterface.getClass().getSimpleName();
            str2 = agentInterface.getHostName();
        }
        return String.format("%s - %s - %s", str2, str, sectionCellInterface != null ? sectionCellInterface.getClass().getSimpleName() : "");
    }

    public final int b(com.dianping.agentsdk.sectionrecycler.section.c cVar, int i, int i2) {
        int i3 = 0;
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5039eccccd18e61666348c508f3c3d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5039eccccd18e61666348c508f3c3d5")).intValue();
        }
        int indexOf = this.d.indexOf(cVar);
        if (indexOf >= 0) {
            if (this.i != null && !this.i.isEmpty()) {
                Iterator<C0053b> it = this.i.iterator();
                while (it.hasNext()) {
                    C0053b next = it.next();
                    if (next != null && next.c != null && !next.c.isEmpty()) {
                        Iterator<c> it2 = next.c.iterator();
                        while (it2.hasNext()) {
                            c next2 = it2.next();
                            if (next2 != null && next2.b >= indexOf && (next2.b != indexOf || next2.c >= i)) {
                                if (next2.b != indexOf || i > next2.c || next2.c >= i + i2) {
                                    return i3;
                                }
                                i3++;
                            }
                        }
                        continue;
                    }
                }
            }
            return i3;
        }
        return 0;
    }

    public final int c(com.dianping.agentsdk.sectionrecycler.section.c cVar, int i, int i2) {
        int i3 = 0;
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0ce72f28de80a3a7e955b864acc8a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0ce72f28de80a3a7e955b864acc8a6")).intValue();
        }
        int a2 = a((ArrayList<ArrayList<com.dianping.agentsdk.sectionrecycler.section.c>>) this.d, (ArrayList<com.dianping.agentsdk.sectionrecycler.section.c>) cVar);
        if (a2 >= 0) {
            if (this.i != null && !this.i.isEmpty()) {
                Iterator<C0053b> it = this.i.iterator();
                while (it.hasNext()) {
                    C0053b next = it.next();
                    if (next != null && next.c != null && !next.c.isEmpty()) {
                        Iterator<c> it2 = next.c.iterator();
                        while (it2.hasNext()) {
                            c next2 = it2.next();
                            if (next2 != null) {
                                if (next2.b >= a2 && ((next2.b != a2 || next2.c >= i) && (next2.b != a2 || next2.c != i || next2.d >= i2))) {
                                    return i3;
                                }
                                i3++;
                            }
                        }
                        continue;
                    }
                }
            }
            return i3;
        }
        return INDEX_NOT_EXIST;
    }

    public final ArrayList<String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc723fb3a181e56151cf46a7543532c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc723fb3a181e56151cf46a7543532c");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<com.dianping.agentsdk.sectionrecycler.section.c> it = this.d.iterator();
        while (it.hasNext()) {
            com.dianping.agentsdk.sectionrecycler.section.c next = it.next();
            if (next.getItemCount() > 0) {
                arrayList.add(next.getAgentInterface().getHostName());
            }
        }
        return arrayList;
    }

    @Override // com.dianping.agentsdk.sectionrecycler.section.a
    public final r getDividerInfo(int i, int i2) {
        com.dianping.agentsdk.sectionrecycler.section.c cVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77d151f6e67c1fbd8a6f8092756024eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77d151f6e67c1fbd8a6f8092756024eb");
        }
        c a2 = a(i, i2);
        if (a2 == null || (cVar = this.d.get(a2.b)) == null) {
            return null;
        }
        return cVar.getDividerInfo(a2.c, a2.d);
    }

    @Override // com.dianping.shield.layoutmanager.TopLinearLayoutManager.OnViewTopStateChangeListener
    public final void onViewTopStateChanged(TopLinearLayoutManager.TopState topState, int i, View view) {
        TopPositionInterface.OnTopStateChangeListener onTopStateChangeListener;
        Pair<Integer, Integer> sectionIndex;
        c a2;
        Object[] objArr = {topState, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256525895bfefe6913fd51dd71aadba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256525895bfefe6913fd51dd71aadba2");
        } else if (this.c == null || this.c.size() <= 0 || (onTopStateChangeListener = this.c.get(i)) == null || (sectionIndex = getSectionIndex(i)) == null || (a2 = a(((Integer) sectionIndex.first).intValue(), ((Integer) sectionIndex.second).intValue())) == null) {
        } else {
            int i2 = a2.c;
            int i3 = a2.d;
            com.dianping.agentsdk.sectionrecycler.section.c cVar = this.d.get(a2.b);
            if (cVar == null) {
                return;
            }
            CellType cellType = cVar.getCellType(i2, i3);
            Pair<Integer, Integer> innerPosition = cVar.getInnerPosition(i2, i3);
            if (innerPosition == null) {
                return;
            }
            onTopStateChangeListener.onTopStageChanged(cellType, ((Integer) innerPosition.first).intValue(), ((Integer) innerPosition.second).intValue(), topState);
        }
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public final void setAutoOffset(int i) {
        this.q = i;
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public final int getAutoOffset() {
        return this.q;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends RecyclerView.s {
        public a(View view) {
            super(view);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "910bf0094da77627ee3ad6450f336388", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "910bf0094da77627ee3ad6450f336388")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5d04cfe0ed6c6754e106e4fd5eef9c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5d04cfe0ed6c6754e106e4fd5eef9c")).intValue() : (((this.b * 31) + this.c) * 31) + this.d;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class f {
        public static ChangeQuickRedirect a;
        protected PositionType b;
        protected PositionType c;
        protected Pair<String, Pair<Integer, Integer>> d;
        protected Pair<String, Pair<Integer, Integer>> e;
        protected HashMap<Pair<String, Pair<Integer, Integer>>, PositionType> f;

        public f() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d290f28fe839f059b66f16b34a26e3e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d290f28fe839f059b66f16b34a26e3e");
                return;
            }
            this.b = PositionType.UNKNOWN;
            this.c = PositionType.FIRST;
            this.f = new HashMap<>();
        }

        public final void a(String str, int i, int i2, boolean z) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73be9632186918f782dbb40cb6d89300", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73be9632186918f782dbb40cb6d89300");
                return;
            }
            this.e = this.d;
            this.d = new Pair<>(str, new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            if (z && i2 == 0) {
                if (this.b == PositionType.FIRST) {
                    this.b = PositionType.SINGLE;
                } else {
                    this.b = PositionType.LAST;
                }
                this.c = PositionType.FIRST;
                a(this.e, this.b);
                a(this.d, this.c);
                return;
            }
            this.b = this.c;
            this.c = PositionType.MIDDLE;
            a(this.d, this.c);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40f4d207f0606704d39ad00653db80d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40f4d207f0606704d39ad00653db80d");
            } else if (this.c == PositionType.FIRST) {
                a(this.d, PositionType.SINGLE);
            } else {
                a(this.d, PositionType.LAST);
            }
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e99cb53dd1234620b9160c80351580", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e99cb53dd1234620b9160c80351580");
                return;
            }
            this.d = null;
            this.e = null;
            this.c = PositionType.FIRST;
            this.b = PositionType.UNKNOWN;
            this.f.clear();
        }

        private void a(Pair<String, Pair<Integer, Integer>> pair, PositionType positionType) {
            Object[] objArr = {pair, positionType};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c130c94c7674800b8b3511e1acca774", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c130c94c7674800b8b3511e1acca774");
            } else if (pair != null) {
                this.f.put(pair, positionType);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class d extends RecyclerView.c {
        public static ChangeQuickRedirect a;

        public d() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76c5e732ce45d8d2633e71233a26d8d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76c5e732ce45d8d2633e71233a26d8d5");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f41d364f2c31714433064bd3905a2c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f41d364f2c31714433064bd3905a2c7");
                return;
            }
            b.this.a();
            b.this.notifyDataSetChanged();
            b.this.b();
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c40976cef059db0ea6e43905c89857", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c40976cef059db0ea6e43905c89857");
                return;
            }
            b.this.a();
            b.this.notifyItemRangeChanged(i, i2);
            b.this.b();
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e54cea148b0626ac4a1da9db264383", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e54cea148b0626ac4a1da9db264383");
                return;
            }
            onItemRangeChanged(i, i2);
            b.this.b();
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9022398704b4455939fbd67ade952b2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9022398704b4455939fbd67ade952b2f");
                return;
            }
            b.this.a();
            b.this.notifyItemRangeInserted(i, i2);
            b.this.b();
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d1547fb1842209d904ff9a09761594", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d1547fb1842209d904ff9a09761594");
                return;
            }
            b.this.a();
            b.this.notifyItemRangeRemoved(i, i2);
            b.this.b();
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeMoved(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76cd748cbedeb47d608ca6587298ba7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76cd748cbedeb47d608ca6587298ba7");
                return;
            }
            b.this.a();
            b.this.notifyItemMoved(i, i2);
            b.this.b();
        }
    }
}
