package com.sankuai.waimai.business.restaurant.base.manager.order;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.c;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements Serializable {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.business.restaurant.base.shopcart.b b;
    @SuppressLint({"UseSparseArrays", "UseSparseArrays_JDK7"})
    @Deprecated
    private HashMap<Long, List<Integer>> c;
    @SuppressLint({"UseSparseArrays", "UseSparseArrays_JDK7"})
    @Deprecated
    private HashMap<Long, Integer> d;

    public h(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0082d25e4becef443913d836f718a6e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0082d25e4becef443913d836f718a6e3");
            return;
        }
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        this.b = bVar;
    }

    public final void a(OrderedFood orderedFood, int i, int i2, int i3, List<c.a> list) {
        c.a aVar;
        Object[] objArr = {orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fef8dd1dd96005c1c853df3cd261a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fef8dd1dd96005c1c853df3cd261a0");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = this.b;
        Object[] objArr2 = {bVar, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fb43798b357c738d5ebce5929b5923bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fb43798b357c738d5ebce5929b5923bf");
            return;
        }
        List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b = a.b(bVar, i2);
        int a2 = i == -1 ? a.a(b) : i;
        if (b.size() > a2) {
            orderedFood.setBuyType(i2);
            orderedFood.setCheckStatus(1);
            a.a(b.get(a2), orderedFood, i3, list);
            if (list != null && !list.isEmpty() && (aVar = list.get(0)) != null) {
                aVar.a = a2;
                aVar.e = i2;
            }
        }
        a.c(bVar);
    }

    public final List<OrderedFood> a(List<OrderedFood> list) {
        com.sankuai.waimai.business.restaurant.base.shopcart.d dVar;
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe6692134b595003428c8c94e7353a5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe6692134b595003428c8c94e7353a5c");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = this.b;
        int i2 = 2;
        Object[] objArr2 = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dd87f8b269f361618b0a8640d319cae1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dd87f8b269f361618b0a8640d319cae1");
        }
        ArrayList arrayList = new ArrayList();
        List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b = a.b(bVar, 0);
        SparseArray sparseArray = new SparseArray();
        if (list != null) {
            for (OrderedFood orderedFood : list) {
                if (orderedFood != null) {
                    orderedFood.getBuyType();
                    a.a(sparseArray, orderedFood);
                    Object[] objArr3 = new Object[i2];
                    objArr3[0] = arrayList;
                    objArr3[1] = orderedFood;
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c86d150ee658e911e8c6620aadd473b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c86d150ee658e911e8c6620aadd473b3");
                    } else if (orderedFood != null) {
                        int indexOf = arrayList.indexOf(orderedFood);
                        if (indexOf >= 0) {
                            ((OrderedFood) arrayList.get(indexOf)).addCount(orderedFood.getCount());
                        } else {
                            arrayList.add(orderedFood.m19clone());
                        }
                    }
                    i2 = 2;
                }
            }
            ArrayList<Integer> arrayList2 = new ArrayList();
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Integer.valueOf(sparseArray.keyAt(i3)));
            }
            Collections.sort(arrayList2);
            b.clear();
            for (Integer num : arrayList2) {
                if (num != null) {
                    List<OrderedFood> list2 = (List) sparseArray.get(num.intValue());
                    if (i < 6) {
                        dVar = a.a(bVar);
                        b.add(dVar);
                    } else {
                        dVar = b.get(b.size() - 1);
                    }
                    for (OrderedFood orderedFood2 : list2) {
                        if (orderedFood2 != null) {
                            a.a(dVar, orderedFood2, orderedFood2.getCount());
                        }
                    }
                    i++;
                }
            }
        }
        a.c(bVar);
        return arrayList;
    }

    public final void b(List<OrderedFood> list) {
        List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5fe7028bc01c48af48b173e643c95fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5fe7028bc01c48af48b173e643c95fc");
        } else if (list != null) {
            for (OrderedFood orderedFood : list) {
                if (orderedFood != null) {
                    com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = this.b;
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b9e855a2735d33cb0081090dd807f188", RobustBitConfig.DEFAULT_VALUE)) {
                        list2 = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b9e855a2735d33cb0081090dd807f188");
                    } else {
                        List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list3 = bVar.c;
                        if (list3 == null) {
                            list3 = new ArrayList<>();
                        }
                        if (list3.isEmpty()) {
                            list3.add(a.a());
                        }
                        bVar.c = list3;
                        list2 = list3;
                    }
                    a.a(list2.get(0), orderedFood, orderedFood.getCount());
                }
            }
        }
    }

    public final void a(GoodsSpu goodsSpu, long j) {
        Object[] objArr = {goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6650f3d53c019b26cdf78bd97d1d28f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6650f3d53c019b26cdf78bd97d1d28f5");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = this.b;
        Object[] objArr2 = {bVar, goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "847e3c5a1c25ec4a14ecb5e35910e8f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "847e3c5a1c25ec4a14ecb5e35910e8f2");
        } else if (goodsSpu != null) {
            a.a(bVar.b, goodsSpu, j);
            a.c(bVar);
        }
    }

    public final void a(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd955774b860ac106ff4635fc895068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd955774b860ac106ff4635fc895068");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = this.b;
        Object[] objArr2 = {bVar, orderedFood};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d58bccbac47540f53cd3c7948078263a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d58bccbac47540f53cd3c7948078263a");
        } else {
            a.a(bVar, orderedFood, (int[]) null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.restaurant.base.manager.order.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public interface InterfaceC0819a {
            boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4);
        }

        public static void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25a3a5939db73e479e63e2218decd5b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25a3a5939db73e479e63e2218decd5b0");
                return;
            }
            List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b = b(bVar, 0);
            if (!com.sankuai.waimai.foundation.utils.b.a(b) || i < 0 || i >= b.size()) {
                return;
            }
            for (int i2 = 0; i2 < b.size(); i2++) {
                com.sankuai.waimai.business.restaurant.base.shopcart.d dVar = b.get(i2);
                if (i2 == i) {
                    dVar.d = true;
                } else {
                    dVar.d = false;
                }
            }
        }

        public static int a(List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8aa743f1c3ab74558833f8c08e27c76c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8aa743f1c3ab74558833f8c08e27c76c")).intValue();
            }
            if (com.sankuai.waimai.foundation.utils.b.a(list)) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).d) {
                        return i;
                    }
                }
            }
            return 0;
        }

        public static int a(com.sankuai.waimai.business.restaurant.base.shopcart.a aVar, final InterfaceC0819a interfaceC0819a) {
            Object[] objArr = {aVar, interfaceC0819a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d53403f8aeb987b93c700e5614dc3d56", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d53403f8aeb987b93c700e5614dc3d56")).intValue();
            }
            if (aVar != null) {
                return a(aVar.b, new InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.h.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e5dc4285e980c9d000302c7cf02d5f7", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e5dc4285e980c9d000302c7cf02d5f7")).booleanValue();
                        }
                        if (InterfaceC0819a.this != null) {
                            return InterfaceC0819a.this.a(shopCartItem, i, i2, i3, 0);
                        }
                        return true;
                    }
                });
            }
            return 0;
        }

        public static int b(com.sankuai.waimai.business.restaurant.base.shopcart.a aVar, final InterfaceC0819a interfaceC0819a) {
            Object[] objArr = {aVar, interfaceC0819a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2df3b909c53b0e4a0b84def3fdf5c95e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2df3b909c53b0e4a0b84def3fdf5c95e")).intValue();
            }
            if (aVar != null) {
                return 0 + a(aVar, new InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.h.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dc2fcaf620757a632c8d0606dd90869", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dc2fcaf620757a632c8d0606dd90869")).booleanValue() : InterfaceC0819a.this.a(shopCartItem, i, i2, i3, i4);
                    }
                });
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int a(List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list, InterfaceC0819a interfaceC0819a) {
            int i;
            boolean z = true;
            Object[] objArr = {list, interfaceC0819a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96666d72c08c62835dea1e8b67f5a0fd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96666d72c08c62835dea1e8b67f5a0fd")).intValue();
            }
            if (list == null) {
                return 0;
            }
            try {
                Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> it = list.iterator();
                i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    try {
                        com.sankuai.waimai.business.restaurant.base.shopcart.d next = it.next();
                        if (next == null) {
                            it.remove();
                        } else {
                            List<ShopCartItem> list2 = next.c;
                            if (list2 != null) {
                                Iterator<ShopCartItem> it2 = list2.iterator();
                                int i3 = i;
                                int i4 = 0;
                                while (true) {
                                    try {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        ShopCartItem next2 = it2.next();
                                        if (next2 == null) {
                                            it2.remove();
                                        } else if (!interfaceC0819a.a(next2, next.b, i2, i4, 0)) {
                                            z = false;
                                            break;
                                        } else {
                                            i4++;
                                            i3++;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        i = i3;
                                        com.sankuai.waimai.foundation.utils.log.a.b(e);
                                        return i;
                                    }
                                }
                                if (!z) {
                                    return i3;
                                }
                                i2++;
                                i = i3;
                            } else {
                                continue;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                return i;
            } catch (Exception e3) {
                e = e3;
                i = 0;
            }
        }

        public static void a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, OrderedFood orderedFood, int i, int i2, boolean z, List<c.a> list, int[] iArr) {
            int i3;
            c.a aVar;
            Object[] objArr = {bVar, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), list, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83d08b95552efbb94b1e84ae6f8599d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83d08b95552efbb94b1e84ae6f8599d4");
                return;
            }
            if (z) {
                a(bVar, orderedFood, iArr);
            } else {
                List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b = b(bVar, i2);
                int a2 = i == -1 ? a(b) : i;
                if (b.size() > a2) {
                    com.sankuai.waimai.business.restaurant.base.shopcart.d dVar = b.get(a2);
                    if (b(dVar, orderedFood) >= 0) {
                        if (a(dVar, orderedFood, list, iArr)) {
                            b.remove(dVar);
                        }
                        i3 = a2;
                    } else {
                        Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> it = b.iterator();
                        i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            com.sankuai.waimai.business.restaurant.base.shopcart.d next = it.next();
                            if (next != null) {
                                if (b(next, orderedFood) < 0) {
                                    i3++;
                                } else if (a(next, orderedFood, list, iArr)) {
                                    it.remove();
                                }
                            }
                        }
                    }
                    if (list != null && !list.isEmpty() && (aVar = list.get(0)) != null) {
                        aVar.a = i3;
                        aVar.e = i2;
                    }
                }
            }
            c(bVar);
        }

        public static void a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, OrderedFood orderedFood, int[] iArr) {
            Object[] objArr = {bVar, orderedFood, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc13b537825aaf7e4759da0942c5645f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc13b537825aaf7e4759da0942c5645f");
            } else if (orderedFood == null) {
            } else {
                int[] iArr2 = new int[1];
                boolean z = (com.sankuai.waimai.foundation.utils.b.a(bVar.b) && a(bVar.b.get(bVar.b.size() - 1))) ? bVar.b.get(bVar.b.size() - 1).d : false;
                a(bVar.b, orderedFood, iArr2);
                if (iArr != null && iArr.length > 0) {
                    iArr[0] = iArr2[0];
                }
                a(bVar, z);
            }
        }

        static com.sankuai.waimai.business.restaurant.base.shopcart.d a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf8e6bb85c7a32e6a382f4eb5e0233b5", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.base.shopcart.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf8e6bb85c7a32e6a382f4eb5e0233b5") : new com.sankuai.waimai.business.restaurant.base.shopcart.d(0);
        }

        static com.sankuai.waimai.business.restaurant.base.shopcart.d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "824fb91a1e795e15117a4d9e17019af7", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.base.shopcart.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "824fb91a1e795e15117a4d9e17019af7") : new com.sankuai.waimai.business.restaurant.base.shopcart.d(-1);
        }

        static void a(@NonNull SparseArray<List<OrderedFood>> sparseArray, OrderedFood orderedFood) {
            boolean z = false;
            Object[] objArr = {sparseArray, orderedFood};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74967bc790c6a77d9f53b416ff94664f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74967bc790c6a77d9f53b416ff94664f");
            } else if (orderedFood != null) {
                int cartId = orderedFood.getCartId();
                List<OrderedFood> list = sparseArray.get(cartId, null);
                if (list == null) {
                    sparseArray.put(cartId, new ArrayList());
                    list = sparseArray.get(cartId);
                }
                Iterator<OrderedFood> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    OrderedFood next = it.next();
                    if (next != null && next.equals(orderedFood)) {
                        next.addCount(orderedFood.getCount());
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
                list.add(orderedFood);
            }
        }

        private static boolean a(com.sankuai.waimai.business.restaurant.base.shopcart.d dVar) {
            List<ShopCartItem> list;
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86c5d54fa93652605005214771fc941f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86c5d54fa93652605005214771fc941f")).booleanValue() : dVar == null || (list = dVar.c) == null || list.isEmpty();
        }

        @NonNull
        public static List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, int i) {
            List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list;
            com.sankuai.waimai.business.restaurant.base.shopcart.d a2;
            boolean z = false;
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0eb3542abfb1c4e16ef70f3ab50e4a48", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0eb3542abfb1c4e16ef70f3ab50e4a48");
            }
            if (i == 0) {
                list = bVar.b;
            } else {
                list = bVar.b;
                z = true;
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            if (list.isEmpty()) {
                if (z) {
                    a2 = a();
                } else {
                    a2 = a(bVar);
                }
                list.add(a2);
            }
            bVar.b = list;
            return list;
        }

        static void a(com.sankuai.waimai.business.restaurant.base.shopcart.d dVar, OrderedFood orderedFood, int i) {
            Object[] objArr = {dVar, orderedFood, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8ae63974bd15222a376e3d858042fd1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8ae63974bd15222a376e3d858042fd1");
            } else {
                a(dVar, orderedFood, i, (List<c.a>) null);
            }
        }

        static void a(com.sankuai.waimai.business.restaurant.base.shopcart.d dVar, OrderedFood orderedFood, int i, List<c.a> list) {
            boolean z;
            Object[] objArr = {dVar, orderedFood, Integer.valueOf(i), list};
            ChangeQuickRedirect changeQuickRedirect = a;
            c.a aVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2522b689f4b0b7c4b9e9e16cd4b3f199", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2522b689f4b0b7c4b9e9e16cd4b3f199");
            } else if (dVar == null || orderedFood == null || i <= 0) {
            } else {
                if (list != null) {
                    aVar = new c.a();
                    list.add(aVar);
                }
                List list2 = dVar.c;
                if (list2 == null) {
                    list2 = new ArrayList();
                    dVar.c = list2;
                }
                Iterator it = list2.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    ShopCartItem shopCartItem = (ShopCartItem) it.next();
                    if (shopCartItem == null || !shopCartItem.isFoodAvailable()) {
                        it.remove();
                    } else {
                        OrderedFood orderedFood2 = shopCartItem.food;
                        if (orderedFood2.equals(orderedFood)) {
                            orderedFood2.addCount(i);
                            orderedFood2.sku.checkStatus = 1;
                            if (aVar != null) {
                                aVar.c = 3;
                                aVar.b = i2;
                                aVar.d = i;
                            }
                            z = true;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z) {
                    return;
                }
                ShopCartItem shopCartItem2 = new ShopCartItem(dVar.b);
                shopCartItem2.food = orderedFood.m19clone();
                shopCartItem2.food.setCartId(dVar.b);
                shopCartItem2.food.setCount(i);
                list2.add(0, shopCartItem2);
                if (aVar != null) {
                    aVar.c = 1;
                    aVar.b = 0;
                    aVar.d = i;
                }
            }
        }

        private static boolean a(com.sankuai.waimai.business.restaurant.base.shopcart.d dVar, OrderedFood orderedFood, List<c.a> list, int[] iArr) {
            Object[] objArr = {dVar, orderedFood, list, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            c.a aVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baa6c266a53c17593467ae244e9591a1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baa6c266a53c17593467ae244e9591a1")).booleanValue();
            }
            if (iArr != null && iArr.length > 0) {
                iArr[0] = 0;
            }
            if (dVar == null || orderedFood == null) {
                return false;
            }
            if (list != null) {
                aVar = new c.a();
                list.add(aVar);
            }
            List list2 = dVar.c;
            if (list2 == null) {
                list2 = new ArrayList();
                dVar.c = list2;
            }
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ShopCartItem shopCartItem = (ShopCartItem) it.next();
                if (shopCartItem == null || !shopCartItem.isFoodAvailable()) {
                    it.remove();
                } else {
                    OrderedFood orderedFood2 = shopCartItem.food;
                    if (orderedFood2.equals(orderedFood)) {
                        orderedFood2.sku.checkStatus = 1;
                        if (orderedFood2.getCount() == 1) {
                            it.remove();
                        } else {
                            orderedFood2.addCount(-1);
                            if (aVar != null) {
                                aVar.c = 4;
                                aVar.b = i;
                                aVar.d = 1;
                            }
                        }
                        if (iArr != null && iArr.length > 0) {
                            iArr[0] = iArr[0] + 1;
                        }
                    } else {
                        i++;
                    }
                }
            }
            return a(dVar);
        }

        public static boolean a(com.sankuai.waimai.business.restaurant.base.shopcart.d dVar, OrderedFood orderedFood) {
            Object[] objArr = {dVar, orderedFood};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fed12aedac5af5255debcc7f446c9bf9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fed12aedac5af5255debcc7f446c9bf9")).booleanValue() : a(dVar, orderedFood, (int[]) null);
        }

        private static boolean a(com.sankuai.waimai.business.restaurant.base.shopcart.d dVar, OrderedFood orderedFood, int[] iArr) {
            Object[] objArr = {dVar, orderedFood, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aed6b36632a003b7f7aa683d8c245b24", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aed6b36632a003b7f7aa683d8c245b24")).booleanValue();
            }
            if (iArr != null && iArr.length > 0) {
                iArr[0] = 0;
            }
            if (dVar == null || orderedFood == null) {
                return false;
            }
            List list = dVar.c;
            if (list == null) {
                list = new ArrayList();
                dVar.c = list;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ShopCartItem shopCartItem = (ShopCartItem) it.next();
                if (shopCartItem == null || !shopCartItem.isFoodAvailable()) {
                    it.remove();
                } else {
                    OrderedFood orderedFood2 = shopCartItem.food;
                    if (orderedFood2.equals(orderedFood)) {
                        it.remove();
                        if (iArr != null && iArr.length > 0) {
                            iArr[0] = iArr[0] + orderedFood2.getCount();
                        }
                    }
                }
            }
            return a(dVar);
        }

        private static void a(List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list, OrderedFood orderedFood, int[] iArr) {
            Object[] objArr = {list, orderedFood, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "487d28b285c38bf35a9ccb99218e4d81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "487d28b285c38bf35a9ccb99218e4d81");
            } else if (list == null || orderedFood == null) {
            } else {
                Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> it = list.iterator();
                while (it.hasNext()) {
                    com.sankuai.waimai.business.restaurant.base.shopcart.d next = it.next();
                    if (next == null) {
                        it.remove();
                    } else if (a(next, orderedFood, iArr)) {
                        it.remove();
                    }
                }
            }
        }

        private static boolean a(com.sankuai.waimai.business.restaurant.base.shopcart.d dVar, GoodsSpu goodsSpu, long j) {
            boolean z = true;
            Object[] objArr = {dVar, goodsSpu, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e60308a94fc6dd4d33c91f432cfd90a4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e60308a94fc6dd4d33c91f432cfd90a4")).booleanValue();
            }
            if (dVar == null || goodsSpu == null) {
                return false;
            }
            List list = dVar.c;
            if (list == null) {
                list = new ArrayList();
                dVar.c = list;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ShopCartItem shopCartItem = (ShopCartItem) it.next();
                if (shopCartItem == null || !shopCartItem.isFoodAvailable()) {
                    it.remove();
                } else {
                    OrderedFood orderedFood = shopCartItem.food;
                    if (orderedFood == null || !orderedFood.isEqualSku(goodsSpu, j)) {
                        z = false;
                    } else {
                        it.remove();
                    }
                }
            }
            return z;
        }

        static void a(List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list, GoodsSpu goodsSpu, long j) {
            Object[] objArr = {list, goodsSpu, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd16718ffcf36299e7525fd3cb2de512", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd16718ffcf36299e7525fd3cb2de512");
            } else if (list == null || goodsSpu == null) {
            } else {
                Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> it = list.iterator();
                while (it.hasNext()) {
                    com.sankuai.waimai.business.restaurant.base.shopcart.d next = it.next();
                    if (next != null && a(next, goodsSpu, j)) {
                        it.remove();
                    }
                }
            }
        }

        public static void b(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2472bbd6cfc0725c9ae8867df3ff8a50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2472bbd6cfc0725c9ae8867df3ff8a50");
                return;
            }
            List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b = b(bVar, 0);
            if (b.size() >= 6 || a(b.get(b.size() - 1))) {
                return;
            }
            bVar.b.add(a(bVar));
        }

        public static void c(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f736fb1abd99f919d7475e827eca514", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f736fb1abd99f919d7475e827eca514");
            } else {
                a(bVar, false);
            }
        }

        private static void a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, boolean z) {
            Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81a9d1fdd7ba9efb9710447c11ba035f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81a9d1fdd7ba9efb9710447c11ba035f");
                return;
            }
            b(bVar);
            List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b = b(bVar, 0);
            Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> it = b.iterator();
            int i = 0;
            boolean z2 = false;
            while (it.hasNext()) {
                com.sankuai.waimai.business.restaurant.base.shopcart.d next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    next.b = i;
                    i++;
                    if (next.d) {
                        z2 = true;
                    }
                }
            }
            if (com.sankuai.waimai.foundation.utils.b.a(b)) {
                com.sankuai.waimai.business.restaurant.base.shopcart.d dVar = b.get(b.size() - 1);
                if (z && a(dVar)) {
                    dVar.d = true;
                } else if (z2) {
                } else {
                    b.get(0).d = true;
                }
            }
        }

        public static int b(com.sankuai.waimai.business.restaurant.base.shopcart.d dVar, OrderedFood orderedFood) {
            OrderedFood orderedFood2;
            boolean z = false;
            Object[] objArr = {dVar, orderedFood};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e34037be0e5f57401552b96f2dac5920", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e34037be0e5f57401552b96f2dac5920")).intValue();
            }
            if (dVar == null || dVar.c == null || dVar.c.isEmpty() || orderedFood == null) {
                return -1;
            }
            Iterator<ShopCartItem> it = dVar.c.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ShopCartItem next = it.next();
                if (next != null && (orderedFood2 = next.food) != null && orderedFood2.equals(orderedFood)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return i;
            }
            return -1;
        }
    }
}
