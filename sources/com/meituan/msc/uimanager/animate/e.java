package com.meituan.msc.uimanager.animate;

import android.view.View;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    Map<Integer, b> b;
    private Map<Integer, a> c;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public NativeViewHierarchyManager a;
        public List<c> b;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f244e2c31e651b42e42dc4752ee872a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f244e2c31e651b42e42dc4752ee872a8");
            return;
        }
        this.c = new HashMap();
        this.b = new HashMap();
    }

    public final void a(NativeViewHierarchyManager nativeViewHierarchyManager, ReadableArray readableArray, ReadableArray readableArray2, int i, Callback callback) {
        View a2;
        Object[] objArr = {nativeViewHierarchyManager, readableArray, readableArray2, Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96cc0f0568bda5bbb44de46230f7f4ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96cc0f0568bda5bbb44de46230f7f4ba");
        } else if (nativeViewHierarchyManager != null && readableArray != null && readableArray2 != null) {
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                int i3 = readableArray.getInt(i2);
                if (!this.b.containsKey(Integer.valueOf(i3)) && (a2 = nativeViewHierarchyManager.a(i3)) != null) {
                    b bVar = new b();
                    bVar.b = a2.getAlpha();
                    WritableArray createArray = Arguments.createArray();
                    createArray.pushDouble(a2.getScaleX());
                    createArray.pushDouble(a2.getScaleY());
                    bVar.c = createArray;
                    WritableArray createArray2 = Arguments.createArray();
                    createArray2.pushDouble(a2.getTranslationX());
                    createArray2.pushDouble(a2.getTranslationY());
                    bVar.d = createArray2;
                    bVar.e = a2.getRotation();
                    this.b.put(Integer.valueOf(i3), bVar);
                }
                a aVar = new a();
                aVar.a = nativeViewHierarchyManager;
                aVar.b = a(readableArray2, i, callback);
                this.c.put(Integer.valueOf(i3), aVar);
            }
        }
    }

    private List<c> a(ReadableArray readableArray, int i, final Callback callback) {
        Object[] objArr = {readableArray, Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ddb1b464000400131a856ccbce9af2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ddb1b464000400131a856ccbce9af2");
        }
        UiThreadUtil.assertOnUiThread();
        ArrayList arrayList = new ArrayList();
        b bVar = null;
        boolean z = false;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            if (map != null) {
                b bVar2 = new b(map);
                if (bVar != null) {
                    if (i2 == readableArray.size() - 1) {
                        bVar2.f = 1.0d;
                    } else if (bVar2.f == 1.0d) {
                        bVar2 = new b(readableArray.getMap(readableArray.size() - 1));
                        bVar2.f = 1.0d;
                        z = true;
                    }
                    if (CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR.equals(CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR)) {
                        d dVar = new d();
                        dVar.a(new com.meituan.msc.uimanager.animate.a(bVar, bVar2), i);
                        if (i2 == readableArray.size() - 1 || z) {
                            dVar.a(new Callback() { // from class: com.meituan.msc.uimanager.animate.e.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.msc.jse.bridge.Callback
                                public final void invoke(Object... objArr2) {
                                    Object[] objArr3 = {objArr2};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "651c41e0b8dbcc5f492ff8e071920712", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "651c41e0b8dbcc5f492ff8e071920712");
                                    } else {
                                        callback.invoke(new Object[0]);
                                    }
                                }
                            });
                        }
                        arrayList.add(dVar);
                        if (z) {
                            break;
                        }
                    } else {
                        throw new RuntimeException(CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR + " is not support");
                    }
                }
                bVar = bVar2;
            }
        }
        if (arrayList.size() == 0 && bVar != null) {
            b bVar3 = new b(bVar);
            d dVar2 = new d();
            dVar2.a(new com.meituan.msc.uimanager.animate.a(bVar, bVar3), 0);
            dVar2.a(new Callback() { // from class: com.meituan.msc.uimanager.animate.e.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "2093a40bf7a5ffc05dd6482673923e44", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "2093a40bf7a5ffc05dd6482673923e44");
                    } else {
                        callback.invoke(new Object[0]);
                    }
                }
            });
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    public final void a(final NativeViewHierarchyManager nativeViewHierarchyManager, ReadableArray readableArray, final ReadableMap readableMap, Callback callback) {
        Object[] objArr = {nativeViewHierarchyManager, readableArray, readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b651e3c91900677131ba98fbde7df2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b651e3c91900677131ba98fbde7df2c");
        } else if (nativeViewHierarchyManager != null && readableArray != null) {
            UiThreadUtil.assertOnUiThread();
            for (int i = 0; i < readableArray.size(); i++) {
                final int i2 = readableArray.getInt(i);
                c cVar = null;
                if (readableMap == null) {
                    if (this.c != null && this.c.containsKey(Integer.valueOf(i2))) {
                        this.c.remove(Integer.valueOf(i2));
                    }
                    WritableMap a2 = com.meituan.msc.uimanager.animate.a.a(null, this.b.get(Integer.valueOf(i2)));
                    if (a2 != null) {
                        nativeViewHierarchyManager.a(i2, "", new ab(a2));
                    }
                } else {
                    a aVar = this.c.get(Integer.valueOf(i2));
                    if (aVar == null) {
                        WritableMap a3 = com.meituan.msc.uimanager.animate.a.a(readableMap, this.b.get(Integer.valueOf(i2)));
                        if (a3 != null) {
                            nativeViewHierarchyManager.a(i2, "", new ab(a3));
                        }
                    } else {
                        List<c> list = aVar.b;
                        if (list != null && list.size() != 0) {
                            for (c cVar2 : list) {
                                if (cVar2.c) {
                                    cVar = cVar2;
                                } else {
                                    cVar2.b = true;
                                }
                            }
                            if (cVar != null) {
                                cVar.a(new Callback() { // from class: com.meituan.msc.uimanager.animate.e.3
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.msc.jse.bridge.Callback
                                    public final void invoke(Object... objArr2) {
                                        Object[] objArr3 = {objArr2};
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "0c741999acd2aa87b3d07e378a0e86c8", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "0c741999acd2aa87b3d07e378a0e86c8");
                                            return;
                                        }
                                        WritableMap a4 = com.meituan.msc.uimanager.animate.a.a(readableMap, e.this.b.get(Integer.valueOf(i2)));
                                        if (a4 != null) {
                                            nativeViewHierarchyManager.a(i2, "", new ab(a4));
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
            callback.invoke(new Object[0]);
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "482de7f20245081108779ae0789597d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "482de7f20245081108779ae0789597d8");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ArrayList<Integer> arrayList = new ArrayList();
        for (Map.Entry<Integer, a> entry : this.c.entrySet()) {
            List<c> list = entry.getValue().b;
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    c cVar = list.get(i);
                    if (!cVar.b) {
                        cVar.a(j);
                        entry.getValue().a.a(entry.getKey().intValue(), "", new ab(cVar.d.a()));
                        cVar.a();
                        break;
                    }
                    if (i == list.size() - 1) {
                        arrayList.add(entry.getKey());
                    }
                    i++;
                }
            }
        }
        if (arrayList.size() > 0) {
            for (Integer num : arrayList) {
                this.c.remove(Integer.valueOf(num.intValue()));
            }
        }
    }
}
