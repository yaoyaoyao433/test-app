package com.sankuai.waimai.store.platform.domain.manager.order;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.platform.domain.manager.order.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements Serializable {
    public static ChangeQuickRedirect a;
    private static int[] c = {8, 4};
    public com.sankuai.waimai.store.platform.domain.core.shopcart.b b;

    public d(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2bfed1e0312aad020c0bdfa7683b7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2bfed1e0312aad020c0bdfa7683b7b");
        } else {
            this.b = bVar;
        }
    }

    public final void a(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23875943cb28a4c2b758355a651da633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23875943cb28a4c2b758355a651da633");
        } else if (list != null) {
            for (OrderedFood orderedFood : list) {
                if (orderedFood != null && orderedFood.getCount() > 0) {
                    a.a(a.a(this.b).get(0), orderedFood, orderedFood.getCount());
                }
            }
        }
    }

    public final void a(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b718fcc1a706db765520a3f3dc647bd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b718fcc1a706db765520a3f3dc647bd6");
        } else {
            a.a(this.b, orderedFood);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.store.platform.domain.manager.order.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC1265a {
            boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4);
        }

        public static int a(com.sankuai.waimai.store.platform.domain.core.shopcart.a aVar, final InterfaceC1265a interfaceC1265a) {
            Object[] objArr = {aVar, interfaceC1265a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65da8b922461d4211c62866e9a054138", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65da8b922461d4211c62866e9a054138")).intValue();
            }
            if (aVar != null) {
                return a(aVar.b, new InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c655bdb4532532af6d62ec1dcb389925", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c655bdb4532532af6d62ec1dcb389925")).booleanValue();
                        }
                        if (InterfaceC1265a.this != null) {
                            return InterfaceC1265a.this.a(shopCartItem, i, i2, i3, 0);
                        }
                        return true;
                    }
                });
            }
            return 0;
        }

        public static int b(com.sankuai.waimai.store.platform.domain.core.shopcart.a aVar, final InterfaceC1265a interfaceC1265a) {
            Object[] objArr = {aVar, interfaceC1265a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e3930836fda2294a19ebf539b300957", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e3930836fda2294a19ebf539b300957")).intValue();
            }
            if (aVar != null) {
                return a(aVar.c, new InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7883096a779bd17b431215114bb56a2f", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7883096a779bd17b431215114bb56a2f")).booleanValue();
                        }
                        if (InterfaceC1265a.this != null) {
                            return InterfaceC1265a.this.a(shopCartItem, i, i2, i3, 1);
                        }
                        return true;
                    }
                });
            }
            return 0;
        }

        private static int e(com.sankuai.waimai.store.platform.domain.core.shopcart.a aVar, final InterfaceC1265a interfaceC1265a) {
            Object[] objArr = {aVar, interfaceC1265a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "599925b0e550e4690e7659fa39de49a2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "599925b0e550e4690e7659fa39de49a2")).intValue();
            }
            if (aVar != null) {
                return a(aVar.d, new InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1574f2296285453d4036728e3e4de156", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1574f2296285453d4036728e3e4de156")).booleanValue();
                        }
                        if (InterfaceC1265a.this == null || shopCartItem.food == null) {
                            return true;
                        }
                        return InterfaceC1265a.this.a(shopCartItem, i, i2, i3, shopCartItem.food.getBuyType());
                    }
                });
            }
            return 0;
        }

        public static int c(com.sankuai.waimai.store.platform.domain.core.shopcart.a aVar, final InterfaceC1265a interfaceC1265a) {
            Object[] objArr = {aVar, interfaceC1265a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "318b888e66cbca16ba6535fb26c7a1f2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "318b888e66cbca16ba6535fb26c7a1f2")).intValue();
            }
            if (aVar != null) {
                return b(aVar, new InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.a.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "342e59a29d8937074a5e96e39c57e71d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "342e59a29d8937074a5e96e39c57e71d")).booleanValue() : InterfaceC1265a.this.a(shopCartItem, i, i2, i3, i4);
                    }
                }) + a(aVar, new InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.a.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94ff7737a7c3b8c1738b231031dcaf7a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94ff7737a7c3b8c1738b231031dcaf7a")).booleanValue() : InterfaceC1265a.this.a(shopCartItem, i, i2, i3, i4);
                    }
                });
            }
            return 0;
        }

        public static int d(com.sankuai.waimai.store.platform.domain.core.shopcart.a aVar, final InterfaceC1265a interfaceC1265a) {
            Object[] objArr = {aVar, interfaceC1265a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b2744aa9068372be3fe9c01cc8830f3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b2744aa9068372be3fe9c01cc8830f3")).intValue();
            }
            if (aVar != null) {
                return b(aVar, new InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.a.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f93075f06e585448a678fffbaf3cc2c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f93075f06e585448a678fffbaf3cc2c9")).booleanValue() : InterfaceC1265a.this.a(shopCartItem, i, i2, i3, i4);
                    }
                }) + a(aVar, new InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.a.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b254271b9b3e356469b2b5301c189c7b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b254271b9b3e356469b2b5301c189c7b")).booleanValue() : InterfaceC1265a.this.a(shopCartItem, i, i2, i3, i4);
                    }
                }) + e(aVar, new InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.a.8
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                        Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cb40738c8c44b5621ea83a137c8f1a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cb40738c8c44b5621ea83a137c8f1a9")).booleanValue() : InterfaceC1265a.this.a(shopCartItem, i, i2, i3, i4);
                    }
                });
            }
            return 0;
        }

        private static int a(List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list, InterfaceC1265a interfaceC1265a) {
            boolean z = true;
            Object[] objArr = {list, interfaceC1265a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba8d927ebd566335bcb10cd9b35b2ba2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba8d927ebd566335bcb10cd9b35b2ba2")).intValue();
            }
            if (list != null) {
                Iterator<com.sankuai.waimai.store.platform.domain.core.shopcart.c> it = list.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.c next = it.next();
                    if (next == null) {
                        it.remove();
                    } else {
                        List<ShopCartItem> list2 = next.j;
                        if (list2 != null) {
                            Iterator<ShopCartItem> it2 = list2.iterator();
                            int i3 = i;
                            int i4 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ShopCartItem next2 = it2.next();
                                if (next2 == null) {
                                    it2.remove();
                                } else if (!interfaceC1265a.a(next2, 0, i2, i4, 0)) {
                                    z = false;
                                    break;
                                } else {
                                    i4++;
                                    i3++;
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
                }
                return i;
            }
            return 0;
        }

        public static List<OrderedFood> a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, List<OrderedFood> list) {
            Object[] objArr = {bVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "575d6a27987fb6381b4a20ee49bcc71b", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "575d6a27987fb6381b4a20ee49bcc71b");
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (OrderedFood orderedFood : list) {
                    if (orderedFood != null) {
                        a(a(bVar, orderedFood.getBuyType(), orderedFood.spu), orderedFood, orderedFood.getCount());
                    }
                }
            }
            b(bVar);
            return arrayList;
        }

        public static List<OrderedFood> b(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, List<OrderedFood> list) {
            Object[] objArr = {bVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce5971670437863771adae0ff6c36832", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce5971670437863771adae0ff6c36832");
            }
            ArrayList arrayList = new ArrayList();
            a(bVar, 0).clear();
            a(bVar, 1).clear();
            if (list != null) {
                for (OrderedFood orderedFood : list) {
                    if (orderedFood != null) {
                        a(a(bVar, orderedFood.getBuyType(), orderedFood.spu), orderedFood, orderedFood.getCount());
                    }
                }
            }
            b(bVar);
            return arrayList;
        }

        public static void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, OrderedFood orderedFood, int i, boolean z, List<b.a> list, int[] iArr) {
            b.a aVar;
            com.sankuai.waimai.store.platform.domain.core.shopcart.c b;
            b.a aVar2;
            Object[] objArr = {bVar, orderedFood, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), list, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fd0d26124a1b38372be72a88e625c08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fd0d26124a1b38372be72a88e625c08");
                return;
            }
            if (z) {
                a(bVar, orderedFood, iArr);
            } else {
                List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> a2 = a(bVar, i);
                if (orderedFood.spu.getActivityType() == 8 && (b = b(bVar.b)) != null) {
                    if (a(b, orderedFood) >= 0) {
                        if (a(b, orderedFood, list, iArr)) {
                            a2.remove(b);
                            return;
                        }
                        return;
                    } else if (list == null || list.isEmpty() || (aVar2 = list.get(0)) == null) {
                        return;
                    } else {
                        aVar2.a = 0;
                        aVar2.e = i;
                        return;
                    }
                }
                Iterator<com.sankuai.waimai.store.platform.domain.core.shopcart.c> it = a2.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.sankuai.waimai.store.platform.domain.core.shopcart.c next = it.next();
                    if (next != null) {
                        if (a(next, orderedFood) < 0) {
                            i2++;
                        } else if (a(next, orderedFood, list, iArr)) {
                            it.remove();
                        }
                    }
                }
                if (list != null && !list.isEmpty() && (aVar = list.get(0)) != null) {
                    aVar.a = i2;
                    aVar.e = i;
                }
            }
            b(bVar);
        }

        public static void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, int i, int i2, int i3) {
            com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar;
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8817f33dcfced41429f34d8885d33160", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8817f33dcfced41429f34d8885d33160");
                return;
            }
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> a2 = a(bVar, i3);
            if (i >= 0 && i < a2.size() && (cVar = a2.get(i)) != null) {
                List<ShopCartItem> list = cVar.j;
                a(list);
                if (i2 >= 0 && list != null && i2 < list.size()) {
                    list.remove(i2);
                    if (list.isEmpty()) {
                        a2.remove(i);
                    }
                }
            }
            b(bVar);
        }

        public static void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, OrderedFood orderedFood) {
            Object[] objArr = {bVar, orderedFood};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcc0bda1a8814a76d93bf73a18d96fed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcc0bda1a8814a76d93bf73a18d96fed");
            } else {
                a(bVar, orderedFood, (int[]) null);
            }
        }

        private static void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, OrderedFood orderedFood, int[] iArr) {
            Object[] objArr = {bVar, orderedFood, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "280bf3d8f9522a512c1263bd7b9d0855", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "280bf3d8f9522a512c1263bd7b9d0855");
            } else if (orderedFood == null) {
            } else {
                int[] iArr2 = new int[1];
                a(bVar.c, orderedFood, iArr2);
                int[] iArr3 = new int[1];
                a(bVar.b, orderedFood, iArr3);
                if (iArr != null && iArr.length > 0) {
                    iArr[0] = iArr2[0] + iArr3[0];
                }
                b(bVar);
            }
        }

        private static com.sankuai.waimai.store.platform.domain.core.shopcart.c c(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "103d2b447e00a69e6490001555b44983", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.core.shopcart.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "103d2b447e00a69e6490001555b44983") : new com.sankuai.waimai.store.platform.domain.core.shopcart.c(0);
        }

        private static com.sankuai.waimai.store.platform.domain.core.shopcart.c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dd323d9be7b1ba13633d0220a42eeed", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.core.shopcart.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dd323d9be7b1ba13633d0220a42eeed") : new com.sankuai.waimai.store.platform.domain.core.shopcart.c(-1);
        }

        private static boolean a(com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar) {
            List<ShopCartItem> list;
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8350eb38043bf3a7fe64be81f90e22cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8350eb38043bf3a7fe64be81f90e22cd")).booleanValue() : cVar == null || (list = cVar.j) == null || list.isEmpty();
        }

        @NonNull
        public static List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, int i) {
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list;
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2369e7a6984c4c2b5a2763eff348241a", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2369e7a6984c4c2b5a2763eff348241a");
            }
            switch (i) {
                case 0:
                    list = bVar.b;
                    break;
                case 1:
                    list = bVar.c;
                    break;
                default:
                    list = bVar.b;
                    break;
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            a(bVar, list, i);
            return list;
        }

        @NonNull
        public static com.sankuai.waimai.store.platform.domain.core.shopcart.c a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, int i, GoodsSpu goodsSpu) {
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list;
            boolean z;
            com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar;
            Object[] objArr = {bVar, Integer.valueOf(i), goodsSpu};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "056e14745bf87617c50b8f17126a3027", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.platform.domain.core.shopcart.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "056e14745bf87617c50b8f17126a3027");
            }
            switch (i) {
                case 0:
                    list = bVar.b;
                    z = false;
                    break;
                case 1:
                    list = bVar.c;
                    z = true;
                    break;
                default:
                    list = bVar.b;
                    z = true;
                    break;
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            String a2 = a(goodsSpu);
            if (list.isEmpty() && z) {
                cVar = a();
                list.add(cVar);
            } else if (i != 1) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.c a3 = a(list, a2);
                if (a3 == null) {
                    if (TextUtils.isEmpty(a2)) {
                        cVar = b(list);
                        if (cVar == null) {
                            cVar = c(bVar);
                            cVar.f = a2;
                            cVar.g = -1;
                            list.add(cVar);
                        }
                    } else {
                        a3 = c(bVar);
                        a3.f = a2;
                        a3.g = goodsSpu.activityType;
                        list.add(0, a3);
                    }
                }
                cVar = a3;
            } else {
                cVar = list.get(0);
            }
            a(bVar, list, i);
            b(bVar);
            return cVar;
        }

        private static com.sankuai.waimai.store.platform.domain.core.shopcart.c a(@NonNull List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list, String str) {
            Object[] objArr = {list, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9cd29a91fd4cbc7cbc80b98639577f6", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.platform.domain.core.shopcart.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9cd29a91fd4cbc7cbc80b98639577f6");
            }
            for (com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar : list) {
                if (cVar != null) {
                    if (!TextUtils.isEmpty(str) && str.equals(cVar.f)) {
                        return cVar;
                    }
                    if (TextUtils.isEmpty(str) && TextUtils.isEmpty(cVar.f)) {
                        return cVar;
                    }
                }
            }
            return null;
        }

        private static com.sankuai.waimai.store.platform.domain.core.shopcart.c b(@NonNull List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a77bce4b5b5de984e6aaad3719dd36a", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.platform.domain.core.shopcart.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a77bce4b5b5de984e6aaad3719dd36a");
            }
            for (com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar : list) {
                if (cVar != null && cVar.g == -1) {
                    return cVar;
                }
            }
            return null;
        }

        private static String a(@NonNull GoodsSpu goodsSpu) {
            Object[] objArr = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb302cbf11c0665962f5da02ab95227d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb302cbf11c0665962f5da02ab95227d") : (goodsSpu == null || !b(goodsSpu)) ? "" : goodsSpu.activityTagId;
        }

        private static boolean b(@NonNull GoodsSpu goodsSpu) {
            Object[] objArr = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4ce66be64d6f05c8b3d761b81caf709", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4ce66be64d6f05c8b3d761b81caf709")).booleanValue();
            }
            if (goodsSpu != null) {
                for (int i = 0; i < d.c.length; i++) {
                    if (goodsSpu.getActivityType() == d.c[i]) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list, int i) {
            Object[] objArr = {bVar, list, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "218f7731e3afbc39a6d77b73dd97b7ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "218f7731e3afbc39a6d77b73dd97b7ee");
                return;
            }
            switch (i) {
                case 0:
                    bVar.b = list;
                    return;
                case 1:
                    bVar.c = list;
                    return;
                default:
                    bVar.b = list;
                    return;
            }
        }

        @NonNull
        static List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93cd43a5cc6f9c180958061175db0250", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93cd43a5cc6f9c180958061175db0250");
            }
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list = bVar.d;
            if (list == null) {
                list = new ArrayList<>();
            }
            if (list.isEmpty()) {
                list.add(a());
            }
            bVar.d = list;
            return list;
        }

        static void a(com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, OrderedFood orderedFood, int i) {
            Object[] objArr = {cVar, orderedFood, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89821b0f6d7e9b3da041d91e0025689d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89821b0f6d7e9b3da041d91e0025689d");
            } else {
                a(cVar, orderedFood, i, (List<b.a>) null);
            }
        }

        public static void a(com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, OrderedFood orderedFood, int i, List<b.a> list) {
            boolean z;
            Object[] objArr = {cVar, orderedFood, Integer.valueOf(i), list};
            ChangeQuickRedirect changeQuickRedirect = a;
            b.a aVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab4fa9b13688ebff9acfedd5687242a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab4fa9b13688ebff9acfedd5687242a2");
            } else if (cVar == null || orderedFood == null || i <= 0) {
            } else {
                if (list != null) {
                    aVar = new b.a();
                    list.add(aVar);
                }
                List list2 = cVar.j;
                if (list2 == null) {
                    list2 = new ArrayList();
                    cVar.j = list2;
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
                        orderedFood2.sku.clearInstallment();
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
                if (com.sankuai.shangou.stone.util.a.a(list2) != 0) {
                    orderedFood.sku.clearInstallment();
                }
                ShopCartItem shopCartItem2 = new ShopCartItem(cVar.b);
                shopCartItem2.food = orderedFood.m22clone();
                shopCartItem2.food.setCartId(cVar.b);
                list2.add(0, shopCartItem2);
                if (aVar != null) {
                    aVar.c = 1;
                    aVar.b = 0;
                    aVar.d = i;
                }
            }
        }

        private static boolean a(com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, OrderedFood orderedFood, List<b.a> list, int[] iArr) {
            Object[] objArr = {cVar, orderedFood, list, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            b.a aVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b9f7d4593445c49b34c5c85c2ff8ce6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b9f7d4593445c49b34c5c85c2ff8ce6")).booleanValue();
            }
            if (iArr != null && iArr.length > 0) {
                iArr[0] = 0;
            }
            if (cVar == null || orderedFood == null) {
                return false;
            }
            if (list != null) {
                aVar = new b.a();
                list.add(aVar);
            }
            List list2 = cVar.j;
            if (list2 == null) {
                list2 = new ArrayList();
                cVar.j = list2;
            }
            a(list2);
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
            return a(cVar);
        }

        private static boolean a(com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, OrderedFood orderedFood, int[] iArr) {
            Object[] objArr = {cVar, orderedFood, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d9c0c0376ee9a4a6fcf799a2f10c037", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d9c0c0376ee9a4a6fcf799a2f10c037")).booleanValue();
            }
            if (iArr != null && iArr.length > 0) {
                iArr[0] = 0;
            }
            if (cVar == null || orderedFood == null) {
                return false;
            }
            List list = cVar.j;
            a(list);
            if (list == null) {
                list = new ArrayList();
                cVar.j = list;
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
            return a(cVar);
        }

        private static void a(List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list, OrderedFood orderedFood, int[] iArr) {
            Object[] objArr = {list, orderedFood, iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af352fb3a073798f9855492a6ad2d5f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af352fb3a073798f9855492a6ad2d5f4");
            } else if (list == null || orderedFood == null) {
            } else {
                Iterator<com.sankuai.waimai.store.platform.domain.core.shopcart.c> it = list.iterator();
                while (it.hasNext()) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.c next = it.next();
                    if (next == null) {
                        it.remove();
                    } else if (a(next, orderedFood, iArr)) {
                        it.remove();
                    }
                }
            }
        }

        private static boolean a(com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, GoodsSpu goodsSpu, long j) {
            boolean z = true;
            Object[] objArr = {cVar, goodsSpu, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11978d4b187117ccd4ae44da65be9f73", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11978d4b187117ccd4ae44da65be9f73")).booleanValue();
            }
            if (cVar == null || goodsSpu == null) {
                return false;
            }
            List list = cVar.j;
            a(list);
            if (list == null) {
                list = new ArrayList();
                cVar.j = list;
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

        public static void a(List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list, GoodsSpu goodsSpu, long j) {
            Object[] objArr = {list, goodsSpu, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a6291fa9e261a55797d395447dea369", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a6291fa9e261a55797d395447dea369");
            } else if (list == null || goodsSpu == null) {
            } else {
                Iterator<com.sankuai.waimai.store.platform.domain.core.shopcart.c> it = list.iterator();
                while (it.hasNext()) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.c next = it.next();
                    if (next != null && a(next, goodsSpu, j)) {
                        it.remove();
                    }
                }
            }
        }

        public static void b(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
            int i = 0;
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "083da905520cda2889be6c2cfc9039fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "083da905520cda2889be6c2cfc9039fb");
                return;
            }
            Iterator<com.sankuai.waimai.store.platform.domain.core.shopcart.c> it = a(bVar, 0).iterator();
            while (it.hasNext()) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.c next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    next.b = i;
                    i++;
                }
            }
        }

        private static int a(com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, OrderedFood orderedFood) {
            OrderedFood orderedFood2;
            boolean z = false;
            Object[] objArr = {cVar, orderedFood};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fdeb965240deddf0f59da09dfdcf80d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fdeb965240deddf0f59da09dfdcf80d")).intValue();
            }
            if (cVar == null || cVar.j == null || cVar.j.isEmpty() || orderedFood == null) {
                return -1;
            }
            Iterator<ShopCartItem> it = cVar.j.iterator();
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

        public static void a(List<ShopCartItem> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8031e2b3d719554f0999307bfc816d3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8031e2b3d719554f0999307bfc816d3f");
            } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            } else {
                Iterator<ShopCartItem> it = list.iterator();
                while (it.hasNext()) {
                    ShopCartItem next = it.next();
                    OrderedFood orderedFood = next == null ? null : next.food;
                    if (orderedFood != null && orderedFood.sku != null) {
                        orderedFood.sku.clearInstallment();
                    }
                }
            }
        }
    }
}
