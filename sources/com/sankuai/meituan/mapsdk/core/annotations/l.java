package com.sankuai.meituan.mapsdk.core.annotations;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public Map<BitmapDescriptor, Set<String>> b;
    public Map<String, Map<String, Integer>> c;
    private com.sankuai.meituan.mapsdk.core.d d;

    public l(com.sankuai.meituan.mapsdk.core.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f0f6d98ac6e1c35364bc6c93c93595", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f0f6d98ac6e1c35364bc6c93c93595");
            return;
        }
        this.d = dVar;
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public final void a(@NonNull q qVar, @NonNull BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {qVar, bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893a005b5c109c14d655481624313ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893a005b5c109c14d655481624313ad7");
        } else {
            a(qVar, bitmapDescriptor, (BitmapDescriptor) null);
        }
    }

    public final void a(@NonNull q qVar, @NonNull BitmapDescriptor bitmapDescriptor, @Nullable BitmapDescriptor bitmapDescriptor2) {
        Set<String> set;
        boolean z = false;
        Object[] objArr = {qVar, bitmapDescriptor, bitmapDescriptor2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db974946859d03c21361b9614b2b261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db974946859d03c21361b9614b2b261");
        } else if (bitmapDescriptor == null) {
        } else {
            Map<String, Integer> map = this.c.get(qVar.b());
            if (map == null) {
                map = new HashMap<>();
                this.c.put(qVar.b(), map);
            }
            if (!map.containsKey(bitmapDescriptor.getId())) {
                if (!this.b.containsKey(bitmapDescriptor)) {
                    b(bitmapDescriptor);
                    set = new HashSet<>();
                    this.b.put(bitmapDescriptor, set);
                } else {
                    set = this.b.get(bitmapDescriptor);
                }
                set.add(qVar.b());
                map.put(bitmapDescriptor.getId(), 1);
                z = true;
            } else {
                Integer num = map.get(bitmapDescriptor.getId());
                if (num != null) {
                    map.put(bitmapDescriptor.getId(), Integer.valueOf(num.intValue() + 1));
                } else {
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.e("sourceAddBitmap get null ref count");
                }
            }
            if (bitmapDescriptor2 != null) {
                a(qVar, bitmapDescriptor2, z);
            } else if (z) {
                qVar.a(map.keySet());
            }
        }
    }

    public final void b(@NonNull q qVar, @NonNull BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {qVar, bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360690472a6e66b8267852a72bb35471", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360690472a6e66b8267852a72bb35471");
        } else {
            a(qVar, bitmapDescriptor, false);
        }
    }

    private void a(@NonNull q qVar, @NonNull BitmapDescriptor bitmapDescriptor, boolean z) {
        Map<String, Integer> map;
        Set<String> set;
        boolean z2 = false;
        Object[] objArr = {qVar, bitmapDescriptor, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7d248fc222ae122f84dc41a1ac5be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7d248fc222ae122f84dc41a1ac5be5");
        } else if (bitmapDescriptor == null || (map = this.c.get(qVar.b())) == null) {
        } else {
            Integer num = map.get(bitmapDescriptor.getId());
            if (num == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.e("sourceRemoveBitmap get null ref count");
            } else if (num.intValue() == 0) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.e("sourceRemoveBitmap get 0 ref count");
            } else if (num.intValue() == 1) {
                map.remove(bitmapDescriptor.getId());
                z2 = true;
            } else {
                map.put(bitmapDescriptor.getId(), Integer.valueOf(num.intValue() - 1));
            }
            if (z || z2) {
                qVar.a(map.keySet());
                if (!z2 || (set = this.b.get(bitmapDescriptor)) == null) {
                    return;
                }
                set.remove(qVar.b());
                if (set.isEmpty()) {
                    a(bitmapDescriptor);
                    this.b.remove(bitmapDescriptor);
                }
            }
        }
    }

    private void b(@NonNull BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcb4410e366f59e32784c050a4cb6820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcb4410e366f59e32784c050a4cb6820");
        } else if (this.d == null || this.d.d == null) {
        } else {
            this.d.d.addImage(bitmapDescriptor.getId(), bitmapDescriptor.getBitmap());
        }
    }

    public void a(@NonNull BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853d760481a374833c1fb1fa2ad0f8aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853d760481a374833c1fb1fa2ad0f8aa");
        } else if (this.d == null || this.d.i || this.d.d == null) {
        } else {
            this.d.d.removeImage(bitmapDescriptor.getId());
        }
    }
}
