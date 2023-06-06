package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.ig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ii extends ig {
    private ArrayList<ig> c = new ArrayList<>();
    private HashMap<ig, e> d = new HashMap<>();
    private ArrayList<e> e = new ArrayList<>();
    private ArrayList<e> f = new ArrayList<>();
    private boolean g = true;
    private a h = null;
    boolean b = false;
    private boolean i = false;
    private long j = 0;
    private iv k = null;
    private long l = -1;

    static /* synthetic */ boolean d(ii iiVar) {
        iiVar.i = false;
        return false;
    }

    private void a(ig... igVarArr) {
        if (igVarArr != null) {
            this.g = true;
            b a2 = a(igVarArr[0]);
            for (int i = 1; i < igVarArr.length; i++) {
                a2.a(igVarArr[i]);
            }
        }
    }

    private void a(Collection<ig> collection) {
        if (collection == null || collection.size() <= 0) {
            return;
        }
        this.g = true;
        b bVar = null;
        for (ig igVar : collection) {
            if (bVar == null) {
                bVar = a(igVar);
            } else {
                bVar.a(igVar);
            }
        }
    }

    private void b(ig... igVarArr) {
        if (igVarArr != null) {
            this.g = true;
            int i = 0;
            if (igVarArr.length == 1) {
                a(igVarArr[0]);
                return;
            }
            while (i < igVarArr.length - 1) {
                i++;
                a(igVarArr[i]).b(igVarArr[i]);
            }
        }
    }

    private void a(List<ig> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.g = true;
        int i = 0;
        if (list.size() == 1) {
            a(list.get(0));
            return;
        }
        while (i < list.size() - 1) {
            i++;
            a(list.get(i)).b(list.get(i));
        }
    }

    private ArrayList<ig> i() {
        ArrayList<ig> arrayList = new ArrayList<>();
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void a(Interpolator interpolator) {
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a.a(interpolator);
        }
    }

    private b a(ig igVar) {
        if (igVar != null) {
            this.g = true;
            return new b(igVar);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void b() {
        this.b = true;
        if (this.i) {
            ArrayList arrayList = null;
            if (this.a != null) {
                arrayList = (ArrayList) this.a.clone();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ig.a) it.next()).a();
                }
            }
            if (this.k != null && this.k.f()) {
                this.k.b();
            } else if (this.f.size() > 0) {
                Iterator<e> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    it2.next().a.b();
                }
            }
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((ig.a) it3.next()).b(this);
                }
            }
            this.i = false;
        }
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void c() {
        this.b = true;
        if (this.i) {
            if (this.f.size() != this.e.size()) {
                k();
                Iterator<e> it = this.f.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (this.h == null) {
                        this.h = new a(this);
                    }
                    next.a.a(this.h);
                }
            }
            if (this.k != null) {
                this.k.b();
            }
            if (this.f.size() > 0) {
                Iterator<e> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    it2.next().a.c();
                }
            }
            if (this.a != null) {
                Iterator it3 = ((ArrayList) this.a.clone()).iterator();
                while (it3.hasNext()) {
                    ((ig.a) it3.next()).b(this);
                }
            }
            this.i = false;
        }
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final boolean f() {
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().a.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final boolean g() {
        return this.i;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final long d() {
        return this.j;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void a(long j) {
        this.j = j;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final long e() {
        return this.l;
    }

    private ii c(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a.b(j);
        }
        this.l = j;
        return this;
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final void a() {
        this.b = false;
        this.i = true;
        k();
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            e eVar = this.f.get(i);
            ArrayList<ig.a> arrayList = eVar.a.a;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ig.a aVar = (ig.a) it.next();
                    if ((aVar instanceof d) || (aVar instanceof a)) {
                        eVar.a.b(aVar);
                    }
                }
            }
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar2 = this.f.get(i2);
            if (this.h == null) {
                this.h = new a(this);
            }
            if (eVar2.b == null || eVar2.b.size() == 0) {
                arrayList2.add(eVar2);
            } else {
                int size2 = eVar2.b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c cVar = eVar2.b.get(i3);
                    cVar.c.a.a(new d(this, eVar2, cVar.d));
                }
                eVar2.c = (ArrayList) eVar2.b.clone();
            }
            eVar2.a.a(this.h);
        }
        if (this.j <= 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                e eVar3 = (e) it2.next();
                eVar3.a.a();
                this.c.add(eVar3.a);
            }
        } else {
            this.k = iv.b(0.0d, 1.0d);
            this.k.b(this.j);
            this.k.a(new ih() { // from class: com.tencent.mapsdk.internal.ii.1
                boolean a = false;

                @Override // com.tencent.mapsdk.internal.ih, com.tencent.mapsdk.internal.ig.a
                public final void a() {
                    this.a = true;
                }

                @Override // com.tencent.mapsdk.internal.ih, com.tencent.mapsdk.internal.ig.a
                public final void b(ig igVar) {
                    if (this.a) {
                        return;
                    }
                    int size3 = arrayList2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        e eVar4 = (e) arrayList2.get(i4);
                        eVar4.a.a();
                        ii.this.c.add(eVar4.a);
                    }
                }
            });
            this.k.a();
        }
        if (this.a != null) {
            ArrayList arrayList3 = (ArrayList) this.a.clone();
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ig.a) arrayList3.get(i4)).a(this);
            }
        }
        if (this.e.size() == 0 && this.j == 0) {
            this.i = false;
            if (this.a != null) {
                ArrayList arrayList4 = (ArrayList) this.a.clone();
                int size4 = arrayList4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((ig.a) arrayList4.get(i5)).b(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.ig
    /* renamed from: j */
    public ii h() {
        ii iiVar = (ii) super.clone();
        iiVar.g = true;
        iiVar.b = false;
        iiVar.i = false;
        iiVar.c = new ArrayList<>();
        iiVar.d = new HashMap<>();
        iiVar.e = new ArrayList<>();
        iiVar.f = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            e next = it.next();
            e clone = next.clone();
            hashMap.put(next, clone);
            iiVar.e.add(clone);
            iiVar.d.put(clone.a, clone);
            ArrayList arrayList = null;
            clone.b = null;
            clone.c = null;
            clone.e = null;
            clone.d = null;
            ArrayList<ig.a> arrayList2 = clone.a.a;
            if (arrayList2 != null) {
                Iterator<ig.a> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ig.a next2 = it2.next();
                    if (next2 instanceof a) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.remove((ig.a) it3.next());
                    }
                }
            }
        }
        Iterator<e> it4 = this.e.iterator();
        while (it4.hasNext()) {
            e next3 = it4.next();
            e eVar = (e) hashMap.get(next3);
            if (next3.b != null) {
                Iterator<c> it5 = next3.b.iterator();
                while (it5.hasNext()) {
                    c next4 = it5.next();
                    eVar.a(new c((e) hashMap.get(next4.c), next4.d));
                }
            }
        }
        return iiVar;
    }

    private void k() {
        if (this.g) {
            this.f.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.e.get(i);
                if (eVar.b == null || eVar.b.size() == 0) {
                    arrayList.add(eVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    e eVar2 = (e) arrayList.get(i2);
                    this.f.add(eVar2);
                    if (eVar2.e != null) {
                        int size3 = eVar2.e.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            e eVar3 = eVar2.e.get(i3);
                            eVar3.d.remove(eVar2);
                            if (eVar3.d.size() == 0) {
                                arrayList2.add(eVar3);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                arrayList2.clear();
            }
            this.g = false;
            if (this.f.size() != this.e.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int size4 = this.e.size();
        for (int i4 = 0; i4 < size4; i4++) {
            e eVar4 = this.e.get(i4);
            if (eVar4.b != null && eVar4.b.size() > 0) {
                int size5 = eVar4.b.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    c cVar = eVar4.b.get(i5);
                    if (eVar4.d == null) {
                        eVar4.d = new ArrayList<>();
                    }
                    if (!eVar4.d.contains(cVar.c)) {
                        eVar4.d.add(cVar.c);
                    }
                }
            }
            eVar4.f = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class d implements ig.a {
        private ii a;
        private e b;
        private int c;

        @Override // com.tencent.mapsdk.internal.ig.a
        public final void a() {
        }

        @Override // com.tencent.mapsdk.internal.ig.a
        public final void b() {
        }

        public d(ii iiVar, e eVar, int i) {
            this.a = iiVar;
            this.b = eVar;
            this.c = i;
        }

        @Override // com.tencent.mapsdk.internal.ig.a
        public final void b(ig igVar) {
            if (this.c == 1) {
                c(igVar);
            }
        }

        @Override // com.tencent.mapsdk.internal.ig.a
        public final void a(ig igVar) {
            if (this.c == 0) {
                c(igVar);
            }
        }

        private void c(ig igVar) {
            if (this.a.b) {
                return;
            }
            c cVar = null;
            int size = this.b.c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                c cVar2 = this.b.c.get(i);
                if (cVar2.d == this.c && cVar2.c.a == igVar) {
                    igVar.b(this);
                    cVar = cVar2;
                    break;
                }
                i++;
            }
            this.b.c.remove(cVar);
            if (this.b.c.size() == 0) {
                this.b.a.a();
                this.a.c.add(this.b.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a implements ig.a {
        private ii b;

        @Override // com.tencent.mapsdk.internal.ig.a
        public final void a(ig igVar) {
        }

        @Override // com.tencent.mapsdk.internal.ig.a
        public final void b() {
        }

        a(ii iiVar) {
            this.b = iiVar;
        }

        @Override // com.tencent.mapsdk.internal.ig.a
        public final void a() {
            if (ii.this.b || ii.this.c.size() != 0 || ii.this.a == null) {
                return;
            }
            int size = ii.this.a.size();
            for (int i = 0; i < size; i++) {
                ii.this.a.get(i).a();
            }
        }

        @Override // com.tencent.mapsdk.internal.ig.a
        public final void b(ig igVar) {
            igVar.b(this);
            ii.this.c.remove(igVar);
            boolean z = true;
            ((e) this.b.d.get(igVar)).f = true;
            if (ii.this.b) {
                return;
            }
            ArrayList arrayList = this.b.f;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (!((e) arrayList.get(i)).f) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                if (ii.this.a != null) {
                    ArrayList arrayList2 = (ArrayList) ii.this.a.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((ig.a) arrayList2.get(i2)).b(this.b);
                    }
                }
                ii.d(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c {
        static final int a = 0;
        static final int b = 1;
        public e c;
        public int d;

        public c(e eVar, int i) {
            this.c = eVar;
            this.d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class e implements Cloneable {
        public ig a;
        public ArrayList<c> b = null;
        public ArrayList<c> c = null;
        public ArrayList<e> d = null;
        public ArrayList<e> e = null;
        public boolean f = false;

        public e(ig igVar) {
            this.a = igVar;
        }

        public final void a(c cVar) {
            if (this.b == null) {
                this.b = new ArrayList<>();
                this.d = new ArrayList<>();
            }
            this.b.add(cVar);
            if (!this.d.contains(cVar.c)) {
                this.d.add(cVar.c);
            }
            e eVar = cVar.c;
            if (eVar.e == null) {
                eVar.e = new ArrayList<>();
            }
            eVar.e.add(this);
        }

        /* renamed from: a */
        public final e clone() {
            try {
                e eVar = (e) super.clone();
                eVar.a = this.a.clone();
                return eVar;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class b {
        private e b;

        b(ig igVar) {
            this.b = (e) ii.this.d.get(igVar);
            if (this.b == null) {
                this.b = new e(igVar);
                ii.this.d.put(igVar, this.b);
                ii.this.e.add(this.b);
            }
        }

        public final b a(ig igVar) {
            e eVar = (e) ii.this.d.get(igVar);
            if (eVar == null) {
                eVar = new e(igVar);
                ii.this.d.put(igVar, eVar);
                ii.this.e.add(eVar);
            }
            eVar.a(new c(this.b, 0));
            return this;
        }

        public final b b(ig igVar) {
            e eVar = (e) ii.this.d.get(igVar);
            if (eVar == null) {
                eVar = new e(igVar);
                ii.this.d.put(igVar, eVar);
                ii.this.e.add(eVar);
            }
            eVar.a(new c(this.b, 1));
            return this;
        }

        private b c(ig igVar) {
            e eVar = (e) ii.this.d.get(igVar);
            if (eVar == null) {
                eVar = new e(igVar);
                ii.this.d.put(igVar, eVar);
                ii.this.e.add(eVar);
            }
            this.b.a(new c(eVar, 1));
            return this;
        }

        private b a(long j) {
            iv b = iv.b(0.0d, 1.0d);
            b.b(j);
            e eVar = (e) ii.this.d.get(b);
            if (eVar == null) {
                eVar = new e(b);
                ii.this.d.put(b, eVar);
                ii.this.e.add(eVar);
            }
            this.b.a(new c(eVar, 1));
            return this;
        }
    }

    @Override // com.tencent.mapsdk.internal.ig
    public final /* synthetic */ ig b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a.b(j);
        }
        this.l = j;
        return this;
    }
}
