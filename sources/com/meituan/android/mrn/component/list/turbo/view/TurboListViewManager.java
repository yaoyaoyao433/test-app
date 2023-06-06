package com.meituan.android.mrn.component.list.turbo.view;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.list.BaseListViewManager;
import com.meituan.android.mrn.component.list.common.Command;
import com.meituan.android.mrn.component.list.event.d;
import com.meituan.android.mrn.component.list.turbo.data.b;
import com.meituan.android.mrn.component.list.turbo.data.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TurboListViewManager extends BaseListViewManager<TurboListView> {
    private static final String COMPONENT_NAME = "MRNTurboListView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.mrn.component.list.BaseListViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return COMPONENT_NAME;
    }

    @Override // com.meituan.android.mrn.component.list.BaseListViewManager, com.facebook.react.uimanager.ViewManager
    @NonNull
    public TurboListView createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65612b4045a7c79b35ade905a3e95753", RobustBitConfig.DEFAULT_VALUE) ? (TurboListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65612b4045a7c79b35ade905a3e95753") : new TurboListView(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull TurboListView turboListView) {
        Object[] objArr = {turboListView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cbd1087382b67405fa51af01490e16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cbd1087382b67405fa51af01490e16a");
            return;
        }
        super.onDropViewInstance((TurboListViewManager) turboListView);
        if (turboListView != null && turboListView.getParent() != null && (turboListView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) turboListView.getParent()).removeView(turboListView);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = TurboListView.k;
        if (PatchProxy.isSupport(objArr2, turboListView, changeQuickRedirect3, false, "4161f80e7b0fe31518b71d1c95267f2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, turboListView, changeQuickRedirect3, false, "4161f80e7b0fe31518b71d1c95267f2a");
            return;
        }
        turboListView.z = true;
        if (turboListView.o != null) {
            turboListView.o.clear();
            turboListView.o = null;
        }
        if (turboListView.m != null) {
            turboListView.m.b();
            turboListView.m = null;
        }
        if (turboListView.s != null) {
            turboListView.s.a(turboListView.A);
            turboListView.s = null;
        }
        if (turboListView.A != null) {
            turboListView.A.clear();
            turboListView.A = null;
        }
        if (turboListView.p != null) {
            turboListView.p = null;
        }
        if (turboListView.q != null) {
            turboListView.q = null;
        }
        if (turboListView.l != null) {
            turboListView.l = null;
        }
        if (turboListView.u != null) {
            turboListView.u = null;
        }
        if (turboListView.n != null) {
            turboListView.n.a();
            turboListView.n = null;
        }
        if (turboListView.v != null) {
            turboListView.v = null;
        }
        if (turboListView.x != null) {
            turboListView.x = null;
        }
        if (turboListView.r != null) {
            turboListView.r = null;
        }
        if (turboListView.y != null) {
            turboListView.y = null;
        }
        if (turboListView.t != null) {
            turboListView.t.clear();
            turboListView.t = null;
        }
        if (turboListView.w != null) {
            turboListView.w.clear();
            turboListView.w = null;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5ec338cd8d2a7e213cc37440015b821", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5ec338cd8d2a7e213cc37440015b821") : c.b().a(d.a.ON_SCROLL.g, c.a("registrationName", "onScroll")).a(d.a.BEGIN_DRAG.g, c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(d.a.END_DRAG.g, c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a(d.a.MOMENTUM_BEGIN.g, c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(d.a.MOMENTUM_END.g, c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a("onEndReached", c.a("registrationName", "onEndReached")).a("onViewableItemsChanged", c.a("registrationName", "onViewableItemsChanged")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c2bbb16171ecd1ee06c9d499011fd00", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c2bbb16171ecd1ee06c9d499011fd00") : c.a(Command.scrollToLocation.name(), Integer.valueOf(Command.scrollToLocation.ordinal()), Command.renderCell.name(), Integer.valueOf(Command.renderCell.ordinal()), Command.addCellData.name(), Integer.valueOf(Command.addCellData.ordinal()), Command.removeCellData.name(), Integer.valueOf(Command.removeCellData.ordinal()), Command.removeSectionData.name(), Integer.valueOf(Command.removeSectionData.ordinal()), Command.updateCellData.name(), Integer.valueOf(Command.updateCellData.ordinal()), Command.scrollTo.name(), Integer.valueOf(Command.scrollTo.ordinal()));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(TurboListView turboListView, View view, int i) {
        Object[] objArr = {turboListView, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da8089703da3fb492577e8bc57bc2ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da8089703da3fb492577e8bc57bc2ff3");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect3 = TurboListView.k;
        if (PatchProxy.isSupport(objArr2, turboListView, changeQuickRedirect3, false, "39d4779e7918c322121217d1114aecf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, turboListView, changeQuickRedirect3, false, "39d4779e7918c322121217d1114aecf2");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (view instanceof com.meituan.android.mrn.component.list.item.d) {
            e eVar = turboListView.m;
            com.meituan.android.mrn.component.list.item.d dVar = (com.meituan.android.mrn.component.list.item.d) view;
            Object[] objArr3 = {dVar};
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect4, false, "ebc6b7f09ca5b86e8291e6916f0af550", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect4, false, "ebc6b7f09ca5b86e8291e6916f0af550");
            } else {
                eVar.b.a((com.meituan.android.mrn.component.list.turbo.data.d<com.meituan.android.mrn.component.list.item.d>) dVar);
            }
            dVar.setListHeaderFooterChangedListener(turboListView.C);
        } else if (view instanceof com.meituan.android.mrn.component.list.item.c) {
            e eVar2 = turboListView.m;
            com.meituan.android.mrn.component.list.item.c cVar = (com.meituan.android.mrn.component.list.item.c) view;
            Object[] objArr4 = {cVar};
            ChangeQuickRedirect changeQuickRedirect5 = e.a;
            if (PatchProxy.isSupport(objArr4, eVar2, changeQuickRedirect5, false, "a81bd0032b7c74a9b5c45e8f0077d0e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, eVar2, changeQuickRedirect5, false, "a81bd0032b7c74a9b5c45e8f0077d0e5");
            } else {
                eVar2.c.a((com.meituan.android.mrn.component.list.turbo.data.d<com.meituan.android.mrn.component.list.item.c>) cVar);
            }
            cVar.setListHeaderFooterChangedListener(turboListView.C);
        } else if (turboListView.s != null) {
            turboListView.s.a(view);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull TurboListView turboListView, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {turboListView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a98f747172810fd8ca528f73dc8188db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a98f747172810fd8ca528f73dc8188db");
            return;
        }
        a.a(turboListView);
        a.a(readableArray);
        try {
            handleCommand(turboListView, Command.valuesCustom()[i], readableArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void handleCommand(@NonNull TurboListView turboListView, Command command, @Nullable ReadableArray readableArray) throws JSONException {
        JavaOnlyMap deepClone;
        char c;
        char c2;
        int i;
        Object[] objArr = {turboListView, command, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7dda2f3fbcb662e0fe5081a2bd92bed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7dda2f3fbcb662e0fe5081a2bd92bed");
        } else if (readableArray == null) {
        } else {
            switch (command) {
                case scrollToLocation:
                    turboListView.a(readableArray.getInt(0), readableArray.getInt(1), readableArray.getBoolean(2));
                    return;
                case renderCell:
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    String string = readableArray.getString(0);
                    String string2 = readableArray.getString(1);
                    JSONArray jSONArray = new JSONArray(string);
                    JSONArray jSONArray2 = new JSONArray(string2);
                    new StringBuilder("consume of convert json=").append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    WritableArray a = com.meituan.android.mrn.component.list.turbo.c.a(jSONArray);
                    WritableArray a2 = com.meituan.android.mrn.component.list.turbo.c.a(jSONArray2);
                    new StringBuilder("consume of convert jsonArray=").append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    Object[] objArr2 = {a, a2, Double.valueOf(readableArray.getDouble(2))};
                    ChangeQuickRedirect changeQuickRedirect3 = TurboListView.k;
                    if (PatchProxy.isSupport(objArr2, turboListView, changeQuickRedirect3, false, "46bbdfebf0fba98ff8704b1fafc3ec7b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, turboListView, changeQuickRedirect3, false, "46bbdfebf0fba98ff8704b1fafc3ec7b");
                        return;
                    }
                    if (a != null) {
                        turboListView.a(a);
                    }
                    turboListView.m.b();
                    turboListView.m.a(a2, 0, 0);
                    turboListView.n.b();
                    return;
                case addCellData:
                    ReadableArray array = readableArray.getArray(0);
                    int i2 = readableArray.getInt(1);
                    int i3 = readableArray.getInt(2);
                    Object[] objArr3 = {array, Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(readableArray.getDouble(3))};
                    ChangeQuickRedirect changeQuickRedirect4 = TurboListView.k;
                    if (PatchProxy.isSupport(objArr3, turboListView, changeQuickRedirect4, false, "74fb496f1984f0dbb26ce95dbe001792", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, turboListView, changeQuickRedirect4, false, "74fb496f1984f0dbb26ce95dbe001792");
                        return;
                    }
                    com.meituan.android.mrn.component.list.turbo.data.a a3 = turboListView.m.a(JavaOnlyArray.deepClone(array), i2, i3);
                    if (a3 != null) {
                        turboListView.n.a(a3.a, a3.b);
                        return;
                    }
                    return;
                case removeCellData:
                    int i4 = readableArray.getInt(0);
                    int i5 = readableArray.getInt(1);
                    int i6 = readableArray.getInt(2);
                    Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Double.valueOf(readableArray.getDouble(3))};
                    ChangeQuickRedirect changeQuickRedirect5 = TurboListView.k;
                    if (PatchProxy.isSupport(objArr4, turboListView, changeQuickRedirect5, false, "dc4552d65312cc649acefd50d6cb515a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, turboListView, changeQuickRedirect5, false, "dc4552d65312cc649acefd50d6cb515a");
                        return;
                    }
                    e eVar = turboListView.m;
                    Object[] objArr5 = {Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect6 = e.a;
                    if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect6, false, "d95f2131a7f702de5f91bb8aceac801a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect6, false, "d95f2131a7f702de5f91bb8aceac801a");
                    } else {
                        eVar.d.get(i4).a(i5, i6);
                    }
                    turboListView.n.b(turboListView.m.c(i4, i5), i6);
                    return;
                case removeSectionData:
                    int i7 = readableArray.getInt(0);
                    int i8 = readableArray.getInt(1);
                    Object[] objArr6 = {Integer.valueOf(i7), Integer.valueOf(i8), Double.valueOf(readableArray.getDouble(2))};
                    ChangeQuickRedirect changeQuickRedirect7 = TurboListView.k;
                    if (PatchProxy.isSupport(objArr6, turboListView, changeQuickRedirect7, false, "491440290163b1660d9bf11c1ca919c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, turboListView, changeQuickRedirect7, false, "491440290163b1660d9bf11c1ca919c3");
                        return;
                    }
                    e eVar2 = turboListView.m;
                    Object[] objArr7 = {Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect8 = e.a;
                    if (PatchProxy.isSupport(objArr7, eVar2, changeQuickRedirect8, false, "a43d5e9ff3be72c87fb26a0582f84f58", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, eVar2, changeQuickRedirect8, false, "a43d5e9ff3be72c87fb26a0582f84f58");
                    } else if (i8 > 0 && i7 < eVar2.d.size()) {
                        eVar2.d.subList(i7, Math.min(i7 + i8, eVar2.d.size())).clear();
                    }
                    turboListView.n.b(turboListView.m.b(i7, 0), turboListView.m.a(i7, i8));
                    return;
                case updateCellData:
                    ReadableMap map = readableArray.getMap(0);
                    int i9 = readableArray.getInt(1);
                    int i10 = readableArray.getInt(2);
                    Object[] objArr8 = {map, Integer.valueOf(i9), Integer.valueOf(i10), Double.valueOf(readableArray.getDouble(3))};
                    ChangeQuickRedirect changeQuickRedirect9 = TurboListView.k;
                    if (PatchProxy.isSupport(objArr8, turboListView, changeQuickRedirect9, false, "f1e8448d1f5e0872debb1b6fdf43d5c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, turboListView, changeQuickRedirect9, false, "f1e8448d1f5e0872debb1b6fdf43d5c1");
                        return;
                    }
                    int c3 = turboListView.m.c(i9, i10);
                    e eVar3 = turboListView.m;
                    Object[] objArr9 = {Integer.valueOf(i9), Integer.valueOf(i10), map};
                    ChangeQuickRedirect changeQuickRedirect10 = e.a;
                    if (PatchProxy.isSupport(objArr9, eVar3, changeQuickRedirect10, false, "5ce9563e116a1175bfdf5894a7136234", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, eVar3, changeQuickRedirect10, false, "5ce9563e116a1175bfdf5894a7136234");
                    } else {
                        b bVar = eVar3.d.get(i9);
                        Object[] objArr10 = {map, Integer.valueOf(i10)};
                        ChangeQuickRedirect changeQuickRedirect11 = b.a;
                        if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect11, false, "6bdf026b90a4da0360adf99c7d101e04", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect11, false, "6bdf026b90a4da0360adf99c7d101e04");
                        } else if (bVar.d == null) {
                            com.facebook.common.logging.a.d("[DataSection@updateItemData]", "items is null while updateItem");
                        } else {
                            ArrayList<Object> arrayList = bVar.d.toArrayList();
                            if (i10 > arrayList.size()) {
                                throw new IndexOutOfBoundsException("try to update item to pos " + i10 + ", but size of array is " + arrayList.size());
                            }
                            if (map instanceof JavaOnlyMap) {
                                deepClone = (JavaOnlyMap) map;
                            } else {
                                deepClone = JavaOnlyMap.deepClone(map);
                            }
                            arrayList.set(i10, deepClone);
                            bVar.d = JavaOnlyArray.from(arrayList);
                        }
                    }
                    turboListView.n.a(c3);
                    return;
                case scrollTo:
                    int round = (int) Math.round(readableArray.getDouble(0));
                    int round2 = (int) Math.round(readableArray.getDouble(1));
                    boolean z = readableArray.getBoolean(2);
                    Object[] objArr11 = {Integer.valueOf(round), Integer.valueOf(round2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect12 = TurboListView.k;
                    c = 0;
                    if (PatchProxy.isSupport(objArr11, turboListView, changeQuickRedirect12, false, "aaeff1628fe49a9e665b6dcef3d53f73", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, turboListView, changeQuickRedirect12, false, "aaeff1628fe49a9e665b6dcef3d53f73");
                    } else if (z) {
                        turboListView.smoothScrollBy(turboListView.getScrollX() - round, turboListView.getScrollY() - round2);
                    } else {
                        turboListView.scrollTo(round, round2);
                    }
                    c2 = 1;
                    i = 2;
                    break;
                default:
                    c2 = 1;
                    i = 2;
                    c = 0;
                    break;
            }
            Object[] objArr12 = new Object[i];
            objArr12[c] = Integer.valueOf(command.ordinal());
            objArr12[c2] = getName();
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", objArr12));
        }
    }
}
