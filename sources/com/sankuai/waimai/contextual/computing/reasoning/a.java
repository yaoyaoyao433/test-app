package com.sankuai.waimai.contextual.computing.reasoning;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.contextual.computing.storage.model.b;
import com.sankuai.waimai.contextual.computing.storage.sp.ContextualComputingSP;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final b b = new b(1, 7, 0, 3);
    private static final b g = new b(1, 5, 0, 3);
    private static final b h = new b(6, 7, 0, 3);
    public String c;
    public List<AddressItem> d;
    public long e;
    public int f;
    private int i;
    private String j;

    public a() {
        String str;
        String str2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2378af2a7b6f29974bd54dc18bec06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2378af2a7b6f29974bd54dc18bec06");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.contextual.computing.config.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "69941d1fb0f71607088fccb9588989f0", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "69941d1fb0f71607088fccb9588989f0");
        } else {
            ABStrategy a2 = com.sankuai.waimai.contextual.computing.config.b.a("wm_location_launch_recommendation_algorithm", null);
            str = a2 != null ? a2.configInfo : "";
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.contextual.computing.config.b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5fc91324b6e36964fe81283118847937", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5fc91324b6e36964fe81283118847937");
        } else {
            ABStrategy a3 = com.sankuai.waimai.contextual.computing.config.b.a("wm_location_launch_recommendation_algorithm", null);
            str2 = a3 != null ? a3.expName : "";
        }
        this.j = str2;
        this.d = ContextualComputingSP.b();
        if (TextUtils.isEmpty(str)) {
            this.c = "select addr_base, SUM(activate) as a from wm_loc_address where week_day >= %d and week_day <= %d and phase >= %d and phase <= %d and time >= %d GROUP BY addr_base order by a DESC limit %d;";
            this.i = 7;
            this.f = Integer.MAX_VALUE;
            return;
        }
        try {
            this.c = str.substring(0, str.indexOf(59) + 1).replaceAll("%ld", "%d");
            this.i = Integer.parseInt(str.split("Count=")[1].substring(0, str.split("Count=")[1].indexOf(38)).trim());
            this.f = Integer.parseInt(str.split("Count=")[2].trim());
        } catch (Exception unused) {
            this.c = "select addr_base, SUM(activate) as a from wm_loc_address where week_day >= %d and week_day <= %d and phase >= %d and phase <= %d and time >= %d GROUP BY addr_base order by a DESC limit %d;";
            this.i = 7;
            this.f = Integer.MAX_VALUE;
        }
        if (this.f == 0) {
            this.f = Integer.MAX_VALUE;
        }
    }

    @Nullable
    public final List<AddressItem> a() {
        ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> d;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f0c745712f8edc5be2f47cc29d0f49e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f0c745712f8edc5be2f47cc29d0f49e");
        }
        if (CollectionUtils.isEmpty(this.d)) {
            com.sankuai.waimai.contextual.computing.service.address.b.a(this.j, 0, 0, 0, 0, false);
            return null;
        } else if (this.d.size() <= 1) {
            com.sankuai.waimai.contextual.computing.service.address.b.a(this.j, this.d.size(), 0, 0, 0, true);
            return this.d;
        } else {
            this.e = System.currentTimeMillis() - ((((this.i * 24) * 60) * 60) * 1000);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> b2 = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e33d4396a9a4f108c809322ef3b55023", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e33d4396a9a4f108c809322ef3b55023") : b(a(this.f));
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> b3 = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0ba2f60ca166015bf1c7e0110b4ae560", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0ba2f60ca166015bf1c7e0110b4ae560") : b(b(this.f));
            HashSet hashSet = new HashSet();
            if (!CollectionUtils.isEmpty(b2)) {
                hashSet.addAll(b2);
            }
            if (!CollectionUtils.isEmpty(b3)) {
                hashSet.addAll(b3);
            }
            int size = b2.size();
            int size2 = b3.size();
            int size3 = hashSet.size();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            z = (calendar.get(7) == 1 || calendar.get(7) == 7) ? true : true;
            switch (size3) {
                case 0:
                    com.sankuai.waimai.contextual.computing.service.address.b.a(this.j, this.d.size(), 0, 0, 0, false);
                    return null;
                case 1:
                    if (size != 0) {
                        if (size2 == 0) {
                            d = c(1);
                            break;
                        } else {
                            d = d(1);
                            break;
                        }
                    }
                    d = e(1);
                    break;
                case 2:
                    if (size != 0) {
                        if ((size2 != 0 || size != 2) && (size2 != 2 || size != 2)) {
                            if (!z) {
                                d = a(1);
                                break;
                            } else {
                                d = b(1);
                                break;
                            }
                        } else {
                            d = c(1);
                            break;
                        }
                    }
                    d = e(1);
                    break;
                case 3:
                    if (size2 != 1 || size != 2) {
                        if (size2 != 2 || size != 1) {
                            if (size > 0 && size < 3) {
                                d = c(1);
                                break;
                            } else {
                                d = e(1);
                                break;
                            }
                        } else if (!z) {
                            d = a(1);
                            break;
                        } else {
                            d = c(1);
                            break;
                        }
                    } else if (!z) {
                        d = c(1);
                        break;
                    } else {
                        d = b(1);
                        break;
                    }
                default:
                    if (size > 0 && size < 3) {
                        d = c(1);
                        break;
                    }
                    d = e(1);
                    break;
            }
            com.sankuai.waimai.contextual.computing.service.address.b.a(this.j, this.d.size(), size, size2, size3, !CollectionUtils.isEmpty(d));
            return a(d == null ? new HashSet() : new HashSet(d), 1);
        }
    }

    public ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48de91517fec404f13815be2068ac3e3", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48de91517fec404f13815be2068ac3e3") : a(com.sankuai.waimai.contextual.computing.storage.db.a.a().a(String.format(this.c, Integer.valueOf(g.b), Integer.valueOf(g.c), Integer.valueOf(g.d), Integer.valueOf(g.e), Long.valueOf(this.e), Integer.valueOf(i))));
    }

    public ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba7f57af045a9d387c70f57584362c56", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba7f57af045a9d387c70f57584362c56") : a(com.sankuai.waimai.contextual.computing.storage.db.a.a().a(String.format(this.c, Integer.valueOf(h.b), Integer.valueOf(h.c), Integer.valueOf(h.d), Integer.valueOf(h.e), Long.valueOf(this.e), Integer.valueOf(i))));
    }

    public ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96d5b8a082828c6ef1dd00f81e7259a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96d5b8a082828c6ef1dd00f81e7259a");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int i2 = calendar.get(7) - 1;
        if (i2 == 0) {
            i2 = 7;
        }
        b bVar = new b(i2, i2, 0, 3);
        return a(com.sankuai.waimai.contextual.computing.storage.db.a.a().a(String.format(this.c, Integer.valueOf(bVar.b), Integer.valueOf(bVar.c), Integer.valueOf(bVar.d), Integer.valueOf(bVar.e), Long.valueOf(this.e), Integer.valueOf(i))));
    }

    public ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1222140f5eda0c9c97884d133f03b435", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1222140f5eda0c9c97884d133f03b435");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int i2 = calendar.get(11);
        int i3 = (i2 < 5 || i2 > 9) ? (i2 < 10 || i2 > 15) ? (i2 < 16 || i2 > 19) ? 3 : 2 : 1 : 0;
        b bVar = new b(1, 7, i3, i3);
        return a(com.sankuai.waimai.contextual.computing.storage.db.a.a().a(String.format(this.c, Integer.valueOf(bVar.b), Integer.valueOf(bVar.c), Integer.valueOf(bVar.d), Integer.valueOf(bVar.e), Long.valueOf(this.e), Integer.valueOf(i))));
    }

    private ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> e(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217130e2cd2080c833dd8220837693e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217130e2cd2080c833dd8220837693e4");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int i2 = calendar.get(7) - 1;
        int i3 = i2 != 0 ? i2 : 7;
        int i4 = calendar.get(11);
        int i5 = (i4 < 5 || i4 > 9) ? (i4 < 10 || i4 > 15) ? (i4 < 16 || i4 > 19) ? 3 : 2 : 1 : 0;
        b bVar = new b(i3, i3, i5, i5);
        return a(com.sankuai.waimai.contextual.computing.storage.db.a.a().a(String.format(this.c, Integer.valueOf(bVar.b), Integer.valueOf(bVar.c), Integer.valueOf(bVar.d), Integer.valueOf(bVar.e), Long.valueOf(this.e), 1)));
    }

    public ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> a(ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> arrayList) {
        boolean z;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce67073843b9c75ba4a608747bb8fdb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce67073843b9c75ba4a608747bb8fdb");
        }
        if (CollectionUtils.isEmpty(arrayList) || CollectionUtils.isEmpty(this.d)) {
            return arrayList;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            com.sankuai.waimai.contextual.computing.storage.model.a aVar = arrayList.get(size);
            Iterator<AddressItem> it = this.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().id == aVar.b) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                arrayList.remove(aVar);
            }
        }
        return arrayList;
    }

    public ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> b(ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> arrayList) {
        int i = 0;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764e835f4ccd0ff03d3a4f859a136133", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764e835f4ccd0ff03d3a4f859a136133");
        }
        if (CollectionUtils.isEmpty(arrayList)) {
            return arrayList;
        }
        Iterator<com.sankuai.waimai.contextual.computing.storage.model.a> it = arrayList.iterator();
        while (it.hasNext()) {
            i += it.next().c;
        }
        double size = i / arrayList.size();
        Iterator<com.sankuai.waimai.contextual.computing.storage.model.a> it2 = arrayList.iterator();
        double d = 0.0d;
        while (it2.hasNext()) {
            com.sankuai.waimai.contextual.computing.storage.model.a next = it2.next();
            d += (next.c - size) * (next.c - size);
        }
        double sqrt = arrayList.size() > 1 ? Math.sqrt(d / (arrayList.size() - 1)) : 0.0d;
        double d2 = sqrt + size;
        double d3 = (2.0d * sqrt) + size;
        ArrayList<com.sankuai.waimai.contextual.computing.storage.model.a> arrayList2 = new ArrayList<>();
        Iterator<com.sankuai.waimai.contextual.computing.storage.model.a> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            com.sankuai.waimai.contextual.computing.storage.model.a next2 = it3.next();
            if (next2.c >= d3) {
                arrayList2.add(next2);
            }
        }
        if (CollectionUtils.isEmpty(arrayList2)) {
            Iterator<com.sankuai.waimai.contextual.computing.storage.model.a> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                com.sankuai.waimai.contextual.computing.storage.model.a next3 = it4.next();
                if (next3.c >= d2) {
                    arrayList2.add(next3);
                }
            }
            if (CollectionUtils.isEmpty(arrayList2)) {
                Iterator<com.sankuai.waimai.contextual.computing.storage.model.a> it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    com.sankuai.waimai.contextual.computing.storage.model.a next4 = it5.next();
                    if (next4.c >= sqrt) {
                        arrayList2.add(next4);
                    }
                }
                return arrayList2;
            }
            return arrayList2;
        }
        return arrayList2;
    }

    public void a(Map<com.sankuai.waimai.contextual.computing.storage.model.a, Integer> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382c80d19cc03561311f88499fb13749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382c80d19cc03561311f88499fb13749");
        } else if (!map.isEmpty()) {
            for (com.sankuai.waimai.contextual.computing.storage.model.a aVar : map.keySet()) {
                map.put(aVar, 0);
            }
        }
    }

    public List<AddressItem> a(Set<com.sankuai.waimai.contextual.computing.storage.model.a> set, int i) {
        Object[] objArr = {set, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941df2c6f7466b009b66595fb1c66672", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941df2c6f7466b009b66595fb1c66672");
        }
        if (set.isEmpty() || CollectionUtils.isEmpty(this.d)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.waimai.contextual.computing.storage.model.a aVar : set) {
            Iterator<AddressItem> it = this.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    AddressItem next = it.next();
                    if (next.id == aVar.b) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        if (arrayList.size() < i) {
            for (AddressItem addressItem : this.d) {
                if (arrayList.size() == i) {
                    break;
                } else if (!arrayList.contains(addressItem)) {
                    arrayList.add(addressItem);
                }
            }
        }
        return arrayList;
    }
}
