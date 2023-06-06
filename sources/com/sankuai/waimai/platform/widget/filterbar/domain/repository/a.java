package com.sankuai.waimai.platform.widget.filterbar.domain.repository;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.a;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.BubbleHistory;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.f;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.h;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements a.InterfaceC1085a, b {
    public static ChangeQuickRedirect a;
    private long A;
    private int B;
    private boolean C;
    private b.a<Void> D;
    private CategoryBean E;
    private f F;
    protected com.sankuai.waimai.platform.widget.filterbar.domain.model.b b;
    protected com.sankuai.waimai.platform.widget.filterbar.domain.model.b c;
    protected com.sankuai.waimai.platform.widget.filterbar.domain.model.b d;
    protected boolean e;
    protected boolean f;
    protected long g;
    protected long h;
    protected int i;
    protected boolean j;
    protected boolean k;
    private List<b.a.C1086a> l;
    private h m;
    private h.a n;
    private Set<String> o;
    private Set<String> p;
    private Map<String, g> q;
    private Map<String, g> r;
    private Map<String, g> s;
    private List<BubbleHistory> t;
    private long u;
    private long v;
    private long w;
    private int x;
    private String y;
    private long z;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eee979fd2c4fe5a928a9dda76b7b5ef1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eee979fd2c4fe5a928a9dda76b7b5ef1");
            return;
        }
        this.v = 0L;
        this.w = 0L;
        this.x = 0;
        this.y = "";
        this.e = false;
        this.z = 0L;
        this.A = 0L;
        this.B = 0;
        this.f = false;
        this.g = 0L;
        this.h = 0L;
        this.i = 0;
        this.j = false;
        this.C = false;
        this.k = false;
        com.sankuai.waimai.platform.widget.filterbar.domain.a.a().a(this);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2977184ea08f2c46ba345f5d569a6b0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2977184ea08f2c46ba345f5d569a6b0d");
        }
        h.a e = e();
        if (e == null) {
            return null;
        }
        return Long.valueOf(e.j ? e.i : e.a);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7750a7d6e18cf3d6e99aea02c4825c92", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7750a7d6e18cf3d6e99aea02c4825c92");
        }
        Long b = b();
        if (b != null) {
            return new Long(b.longValue());
        }
        return null;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eb92e4477c243a80cf46dfb8db9e514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eb92e4477c243a80cf46dfb8db9e514");
        } else if (this.m != null) {
            ArrayList<h.a> arrayList = this.m.a;
            if (arrayList != null) {
                for (h.a aVar : arrayList) {
                    if (aVar != null && aVar.a == j) {
                        this.n = aVar;
                        this.n.j = false;
                        return;
                    } else if (aVar != null && aVar.i != 0 && aVar.i == j) {
                        this.n = aVar;
                        this.n.j = true;
                        return;
                    }
                }
            }
            ArrayList<h.a> arrayList2 = this.m.b;
            if (arrayList2 != null) {
                for (h.a aVar2 : arrayList2) {
                    if (aVar2 != null && aVar2.a == j) {
                        this.n = aVar2;
                        this.n.j = false;
                        return;
                    } else if (aVar2 != null && aVar2.i != 0 && aVar2.i == j) {
                        this.n = aVar2;
                        this.n.j = true;
                        return;
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void d() {
        this.n = null;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final h.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857eedfdcfbb82efb5bad31a6206f94f", RobustBitConfig.DEFAULT_VALUE)) {
            return (h.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857eedfdcfbb82efb5bad31a6206f94f");
        }
        h.a aVar = this.n;
        if (aVar != null || this.m == null || this.m.b == null || this.m.b.isEmpty()) {
            return aVar;
        }
        try {
            return this.m.b.get(0);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final synchronized boolean a(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b820914242958ab7a144720deef5e69d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b820914242958ab7a144720deef5e69d")).booleanValue();
        }
        List<BubbleHistory> d = d(this.u);
        if (d != null && !d.isEmpty()) {
            for (BubbleHistory bubbleHistory : d) {
                if (bubbleHistory != null && bubbleHistory.a() && bubbleHistory.a(i, str, i2)) {
                    return bubbleHistory.d.a;
                }
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final synchronized void b(int i, String str, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73160383f0bcd8b8153580d6d672195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73160383f0bcd8b8153580d6d672195");
            return;
        }
        List<BubbleHistory> d = d(this.u);
        long currentTimeMillis = System.currentTimeMillis();
        if (d != null && !d.isEmpty()) {
            Iterator<BubbleHistory> it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BubbleHistory next = it.next();
                if (next != null && next.a() && next.a(i, str)) {
                    if (next.d.b == i2) {
                        next.d.a = true;
                        next.e = currentTimeMillis;
                        z = true;
                    } else {
                        it.remove();
                    }
                }
            }
        }
        if (!z) {
            if (d == null) {
                d = new LinkedList<>();
            }
            BubbleHistory bubbleHistory = new BubbleHistory();
            bubbleHistory.b = i;
            bubbleHistory.c = str;
            bubbleHistory.d = new com.sankuai.waimai.platform.widget.filterbar.domain.model.a(true, i2);
            bubbleHistory.e = currentTimeMillis;
            if (bubbleHistory.a()) {
                d.add(bubbleHistory);
            }
            this.t = d;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final synchronized void a(int i, String str) {
        Object[] objArr = {3, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a3fcb0163f1c7fce5b5757b1721a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a3fcb0163f1c7fce5b5757b1721a12");
            return;
        }
        List<BubbleHistory> d = d(this.u);
        if (d != null && !d.isEmpty()) {
            Iterator<BubbleHistory> it = d.iterator();
            while (it.hasNext()) {
                BubbleHistory next = it.next();
                if (next != null && next.a() && next.a(3, str)) {
                    it.remove();
                    return;
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final synchronized void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f732dd4cd0dc1d2e15c00da19e5d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f732dd4cd0dc1d2e15c00da19e5d4e");
        } else if (this.t == null) {
        } else {
            b(this.t);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fbd486f49ba4efedac68708ee5dccfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fbd486f49ba4efedac68708ee5dccfd");
        } else {
            this.u = j;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c96736d448d02f33ca32da28ae917de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c96736d448d02f33ca32da28ae917de");
        } else {
            this.t = c(this.u);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(b.a<Void> aVar) {
        this.D = aVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Set<String> h() {
        return this.o;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Set<String> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8ae4dc5b96addee118ae39e18aac47", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8ae4dc5b96addee118ae39e18aac47");
        }
        if (this.o == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (String str : this.o) {
            hashSet.add(new String(str));
        }
        return hashSet;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Set<String> j() {
        return this.p;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53b7853be7ea6243b6d68ed8b2edde64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53b7853be7ea6243b6d68ed8b2edde64");
            return;
        }
        if (this.o == null) {
            this.o = new TreeSet();
        }
        this.o.add(str);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c960c056a29430430887b554b9edb00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c960c056a29430430887b554b9edb00");
        } else if (set != null) {
            if (this.o == null) {
                this.o = new TreeSet();
            }
            this.o.addAll(set);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5afd57f564c16b581657ba798d692662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5afd57f564c16b581657ba798d692662");
        } else if (this.o != null) {
            this.o.remove(str);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Map<String, g> k() {
        return this.r;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Map<String, g> l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2970d4f604d2710024715d1e8f3ba41f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2970d4f604d2710024715d1e8f3ba41f");
        }
        if (this.r == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, g> entry : this.r.entrySet()) {
            hashMap.put(new String(entry.getKey()), new g(entry.getValue().b, entry.getValue().c));
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Map<String, g> m() {
        return this.s;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64312e9c687c0bf5a49b02b4f11975ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64312e9c687c0bf5a49b02b4f11975ca");
            return;
        }
        if (this.r == null) {
            this.r = new HashMap();
        }
        g gVar = this.r.get(str);
        if (gVar != null) {
            gVar.b = i;
            gVar.c = i2;
            return;
        }
        this.r.put(str, new g(i, i2));
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(Map<String, g> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "222cbec204f060abcad70473bd0f6c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "222cbec204f060abcad70473bd0f6c05");
        } else if (map != null) {
            if (this.r == null) {
                this.r = new HashMap();
            }
            this.r.putAll(map);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef6f04da8adfab4943a7ad7983387c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef6f04da8adfab4943a7ad7983387c0");
            return;
        }
        if (this.p == null) {
            this.p = new TreeSet();
        }
        this.p.clear();
        if (this.o != null) {
            this.p.addAll(this.o);
        }
        if (this.s == null) {
            this.s = new HashMap();
        }
        this.s.clear();
        if (this.r == null || this.r.isEmpty()) {
            return;
        }
        for (Map.Entry<String, g> entry : this.r.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                g value = entry.getValue();
                g gVar = this.q == null ? null : this.q.get(key);
                if (value != null && value.a() && !value.equals(gVar)) {
                    this.s.put(key, value);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff0d79bf83f380a7d78fa770d36314d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff0d79bf83f380a7d78fa770d36314d");
            return;
        }
        if (this.p != null) {
            this.p.clear();
        }
        if (this.s != null) {
            this.s.clear();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d8db13af6adaa06046f5822a62396c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d8db13af6adaa06046f5822a62396c");
            return;
        }
        if (this.o != null) {
            this.o.clear();
        }
        if (this.r != null) {
            this.r.clear();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c760006bf8dc3c0882f0669fe084d87a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c760006bf8dc3c0882f0669fe084d87a");
        } else if (this.d != null && this.d.b != null && !this.d.b.isEmpty()) {
            Iterator<b.a> it = this.d.b.iterator();
            while (it.hasNext()) {
                b.a next = it.next();
                if (next != null && next.c != null) {
                    for (b.a.C1086a c1086a : next.c) {
                        if (c1086a != null) {
                            if (this.o != null && this.o.contains(c1086a.a)) {
                                this.o.remove(c1086a.a);
                            }
                            if (this.r != null && this.r.containsKey(c1086a.a)) {
                                this.r.remove(c1086a.a);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final h r() {
        return this.m;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(h hVar) {
        this.m = hVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final com.sankuai.waimai.platform.widget.filterbar.domain.model.b s() {
        return this.b;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d6d4112a765ce24c90ce53e843595f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d6d4112a765ce24c90ce53e843595f");
            return;
        }
        this.b = bVar;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "296456d3e61837217fb599c670f82506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "296456d3e61837217fb599c670f82506");
            return;
        }
        if (this.q == null) {
            this.q = new HashMap();
        }
        this.q.clear();
        if (bVar == null || bVar.b == null) {
            return;
        }
        Iterator<b.a> it = bVar.b.iterator();
        while (it.hasNext()) {
            b.a next = it.next();
            if (next != null && next.d == 2 && next.c != null && !next.c.isEmpty()) {
                for (b.a.C1086a c1086a : next.c) {
                    if (c1086a != null && !TextUtils.isEmpty(c1086a.a) && c1086a.f != null) {
                        this.q.put(c1086a.a, new g(c1086a.f.a, c1086a.f.b));
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final com.sankuai.waimai.platform.widget.filterbar.domain.model.b t() {
        return this.c;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void b(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
        this.d = bVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final com.sankuai.waimai.platform.widget.filterbar.domain.model.b u() {
        return this.d;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void c(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
        this.c = bVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final List<b.a.C1086a> v() {
        return this.l;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(List<b.a.C1086a> list) {
        this.l = list;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9341066d197441eed598d440fb6f91fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9341066d197441eed598d440fb6f91fe");
            return;
        }
        this.e = false;
        this.j = false;
        this.f = false;
        this.E = null;
        this.F = null;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.a.InterfaceC1085a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd88991b9a40dec19d9a95573e129da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd88991b9a40dec19d9a95573e129da6");
            return;
        }
        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a(new com.sankuai.waimai.platform.widget.filterbar.domain.usecase.h(this), (com.sankuai.waimai.platform.widget.filterbar.domain.usecase.h) null, new c.InterfaceC1084c<h.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.domain.repository.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final void a(Error error) {
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
            public final /* synthetic */ void a(h.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c81926824c3c742629c0149b4a948136", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c81926824c3c742629c0149b4a948136");
                } else if (a.this.D != null) {
                    a.this.D.a((b.a) null);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(boolean z) {
        this.k = z;
    }

    public final boolean a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abcecb9fd9a586ed1d0e45be780cb23f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abcecb9fd9a586ed1d0e45be780cb23f")).booleanValue() : this.e && this.v == j && this.w == j2 && this.x == i;
    }

    public final void b(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65fd8e1a00c1c5ee434dcdad106ca417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65fd8e1a00c1c5ee434dcdad106ca417");
        } else if (a(j, j2, i)) {
        } else {
            this.e = true;
            this.v = j;
            this.w = j2;
            this.x = i;
        }
    }

    public final boolean c(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14383af23c72af00aa17999b89f9986c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14383af23c72af00aa17999b89f9986c")).booleanValue() : this.f && this.z == j && this.A == j2 && this.B == i;
    }

    public final void d(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d51cc5bcbcae94a580ce3bd93ad59f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d51cc5bcbcae94a580ce3bd93ad59f");
        } else if (c(j, j2, i)) {
        } else {
            this.f = true;
            this.z = j;
            this.A = j2;
            this.B = i;
        }
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cfdd2c9c69b5f86cd06bb5312f66aa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cfdd2c9c69b5f86cd06bb5312f66aa")).booleanValue() : TextUtils.equals(this.y, str);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a3b224e5bea114d2a282da93b59cb78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a3b224e5bea114d2a282da93b59cb78");
        } else if (c(str)) {
        } else {
            this.e = true;
            this.y = str;
        }
    }

    public final void e(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac489dd606e7c482781afd13eabdf6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac489dd606e7c482781afd13eabdf6d0");
        } else if (a(j, j2, i)) {
        } else {
            this.j = true;
            this.g = j;
            this.h = j2;
            this.i = i;
        }
    }

    private List<BubbleHistory> d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c277f4cd05763a343cc00ea9d58bf01d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c277f4cd05763a343cc00ea9d58bf01d");
        }
        if (this.t == null) {
            this.t = c(j);
        }
        return this.t;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(CategoryBean categoryBean) {
        Object[] objArr = {categoryBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83fb179b879b4b618719afd9bda7b45a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83fb179b879b4b618719afd9bda7b45a");
        } else if (categoryBean == null || categoryBean.a == null || categoryBean.a.isEmpty()) {
        } else {
            this.E = categoryBean;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final CategoryBean x() {
        return this.E;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final f y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59b235b46301c1ea4d3cadbae0579365", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59b235b46301c1ea4d3cadbae0579365");
        }
        if (this.F == null) {
            this.F = new f();
        }
        return this.F;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final void a(f fVar) {
        this.F = fVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final com.sankuai.waimai.platform.widget.filterbar.domain.model.c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d563396a1fbdaf92cd59428777791860", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.filterbar.domain.model.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d563396a1fbdaf92cd59428777791860");
        }
        com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.c();
        cVar.b = this.p;
        cVar.c = this.s;
        cVar.a = b();
        cVar.d = y();
        cVar.e = D().g;
        return cVar;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Set<String> A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7997bef1792f71bdc1b629c199d7cf5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7997bef1792f71bdc1b629c199d7cf5d");
        }
        TreeSet treeSet = new TreeSet();
        if (this.d != null && this.p != null && !this.p.isEmpty()) {
            for (String str : this.p) {
                if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(this.d, str)) {
                    treeSet.add(str);
                }
            }
        }
        return treeSet;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b
    public final Map<String, g> B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a42dfde3bd9da3a0fbae6c1fbd7a2ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a42dfde3bd9da3a0fbae6c1fbd7a2ec");
        }
        HashMap hashMap = new HashMap();
        if (this.d != null && this.s != null && !this.s.isEmpty()) {
            for (String str : this.s.keySet()) {
                if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(this.d, str)) {
                    hashMap.put(str, this.s.get(str));
                }
            }
        }
        return hashMap;
    }
}
