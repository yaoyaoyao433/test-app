package com.meituan.android.mrn.component.list;

import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.list.common.Command;
import com.meituan.android.mrn.component.list.event.d;
import com.meituan.android.mrn.component.list.node.ListItemNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MListViewManager extends BaseListViewManager<MListView> {
    private static final String COMPONENT_NAME = "MRNListView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.mrn.component.list.BaseListViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return COMPONENT_NAME;
    }

    @Override // com.meituan.android.mrn.component.list.BaseListViewManager, com.facebook.react.uimanager.ViewManager
    public MListView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e60ded4a4576605ac9b0f4e2772b5a8", RobustBitConfig.DEFAULT_VALUE) ? (MListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e60ded4a4576605ac9b0f4e2772b5a8") : new MListView(aoVar);
    }

    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.facebook.react.uimanager.events.c, android.util.SparseArray<com.meituan.android.mrn.component.list.node.ListItemNode>, com.facebook.react.uimanager.ao, com.facebook.react.views.scroll.j, com.meituan.android.mrn.component.list.event.b, java.util.ArrayList<com.meituan.android.mrn.component.list.event.k>, android.support.v7.widget.RecyclerView$LayoutManager, com.facebook.react.uimanager.n, com.meituan.android.mrn.component.list.d, com.meituan.android.mrn.component.list.event.f] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(MListView mListView) {
        HashMap<String, com.meituan.android.mrn.component.list.node.b> hashMap;
        ?? r1;
        int i = 1;
        Object[] objArr = {mListView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eab563e03d86b08b87352b7633e5e1e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eab563e03d86b08b87352b7633e5e1e9");
            return;
        }
        super.onDropViewInstance((MListViewManager) mListView);
        if (mListView != null && mListView.getParent() != null && (mListView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) mListView.getParent()).removeView(mListView);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MListView.k;
        if (PatchProxy.isSupport(objArr2, mListView, changeQuickRedirect3, false, "aaee64a980e1ce6b0998a19ca0d04cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mListView, changeQuickRedirect3, false, "aaee64a980e1ce6b0998a19ca0d04cfe");
            return;
        }
        mListView.B = true;
        boolean b = com.meituan.android.mrn.horn.a.a().b();
        if (mListView.u != null) {
            Iterator<com.meituan.android.mrn.component.list.node.c> it = mListView.u.iterator();
            while (it.hasNext()) {
                com.meituan.android.mrn.component.list.node.c next = it.next();
                Iterator<ListItemNode> it2 = next.d().iterator();
                while (it2.hasNext()) {
                    ListItemNode next2 = it2.next();
                    if (next2 != null) {
                        if (b) {
                            Object[] objArr3 = new Object[i];
                            objArr3[0] = next2;
                            ChangeQuickRedirect changeQuickRedirect4 = MListView.k;
                            if (PatchProxy.isSupport(objArr3, mListView, changeQuickRedirect4, false, "aa80306cd138f8642c6db6a81aa158d6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, mListView, changeQuickRedirect4, false, "aa80306cd138f8642c6db6a81aa158d6");
                            } else {
                                try {
                                    mListView.r.b(next2.d);
                                } catch (Throwable th) {
                                    com.facebook.common.logging.a.b("[MListView@destroyNodeTreeRecursive]", (String) null, th);
                                }
                            }
                        } else {
                            mListView.a(next2);
                        }
                        i = 1;
                    }
                    i = 1;
                }
                Object[] objArr4 = new Object[i];
                objArr4[0] = null;
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.component.list.node.c.a;
                if (PatchProxy.isSupport(objArr4, next, changeQuickRedirect5, false, "ba0964b1f83ce4cf87ad22d4041fddb8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, next, changeQuickRedirect5, false, "ba0964b1f83ce4cf87ad22d4041fddb8");
                } else {
                    next.c.clear();
                }
                i = 1;
            }
            mListView.u.clear();
            hashMap = null;
            mListView.u = null;
        } else {
            hashMap = null;
        }
        if (mListView.t != null) {
            mListView.t.clear();
            mListView.t = hashMap;
        }
        if (mListView.x != null) {
            Iterator<View> it3 = mListView.x.iterator();
            while (it3.hasNext()) {
                View next3 = it3.next();
                if (next3 != null && next3.getParent() != null && (next3.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) next3.getParent()).removeView(next3);
                }
            }
            mListView.x.clear();
            r1 = 0;
            mListView.x = null;
        } else {
            r1 = 0;
        }
        if (mListView.r != null) {
            mListView.r = r1;
        }
        if (mListView.m != null) {
            mListView.m = r1;
        }
        if (mListView.z != null) {
            mListView.z = r1;
        }
        if (mListView.o != null) {
            mListView.o.a();
            mListView.o = r1;
        }
        if (mListView.n != null) {
            mListView.n = r1;
        }
        if (mListView.s != null) {
            mListView.s = r1;
        }
        if (mListView.y != null) {
            mListView.y = r1;
        }
        if (mListView.l != null) {
            mListView.l = r1;
        }
        if (mListView.p != null) {
            mListView.p.clear();
            mListView.p = r1;
        }
        if (mListView.q != null) {
            mListView.q.clear();
            mListView.q = r1;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa3752c9ca0b4544f3ecb38b22364b27", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa3752c9ca0b4544f3ecb38b22364b27") : com.facebook.react.common.c.b().a(d.a.ON_SCROLL.g, com.facebook.react.common.c.a("registrationName", "onScroll")).a(d.a.BEGIN_DRAG.g, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(d.a.END_DRAG.g, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a(d.a.MOMENTUM_BEGIN.g, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(d.a.MOMENTUM_END.g, com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a("onEndReached", com.facebook.react.common.c.a("registrationName", "onEndReached")).a("onViewableItemsChanged", com.facebook.react.common.c.a("registrationName", "onViewableItemsChanged")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "483e8247bf289976505ab186159ce5b7", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "483e8247bf289976505ab186159ce5b7") : com.facebook.react.common.c.a(Command.scrollToLocation.name(), Integer.valueOf(Command.scrollToLocation.ordinal()), Command.renderCell.name(), Integer.valueOf(Command.renderCell.ordinal()), Command.addCellData.name(), Integer.valueOf(Command.addCellData.ordinal()), Command.removeCellData.name(), Integer.valueOf(Command.removeCellData.ordinal()), Command.updateCellData.name(), Integer.valueOf(Command.updateCellData.ordinal()), Command.scrollTo.name(), Integer.valueOf(Command.scrollTo.ordinal()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(MListView mListView, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {mListView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59142879880307347cd40cdc94e0c4f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59142879880307347cd40cdc94e0c4f7");
            return;
        }
        com.facebook.infer.annotation.a.a(mListView);
        com.facebook.infer.annotation.a.a(readableArray);
        switch (Command.valuesCustom()[i]) {
            case scrollToLocation:
                mListView.a(readableArray.getInt(0), readableArray.getInt(1), readableArray.getBoolean(2));
                return;
            case renderCell:
                ReadableArray array = readableArray.getArray(0);
                ReadableArray array2 = readableArray.getArray(1);
                double d = readableArray.getDouble(2);
                Object[] objArr2 = {array, array2, Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect3 = MListView.k;
                if (PatchProxy.isSupport(objArr2, mListView, changeQuickRedirect3, false, "3c7ac7ec3f58724a5cc87cfb4ba21330", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, mListView, changeQuickRedirect3, false, "3c7ac7ec3f58724a5cc87cfb4ba21330");
                    return;
                }
                mListView.t.clear();
                mListView.u.clear();
                mListView.o.b();
                mListView.u.add(mListView.v);
                mListView.t = com.meituan.android.mrn.component.list.node.b.a(array);
                mListView.a(array2, 0, 0, d);
                mListView.u.add(mListView.w);
                mListView.o.b();
                return;
            case addCellData:
                ReadableArray array3 = readableArray.getArray(0);
                int i2 = readableArray.getInt(1);
                int i3 = readableArray.getInt(2);
                double d2 = readableArray.getDouble(3);
                Object[] objArr3 = {array3, Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect4 = MListView.k;
                if (PatchProxy.isSupport(objArr3, mListView, changeQuickRedirect4, false, "ea8cdd4064a67e10249572ee523e7c49", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, mListView, changeQuickRedirect4, false, "ea8cdd4064a67e10249572ee523e7c49");
                    return;
                }
                mListView.o.a(mListView.a(i2, i3), mListView.a(array3, i2, i3, d2));
                return;
            case removeCellData:
                mListView.a(readableArray.getInt(0), readableArray.getInt(1), readableArray.getInt(2), readableArray.getDouble(3));
                return;
            case updateCellData:
                ReadableMap map = readableArray.getMap(0);
                int i4 = readableArray.getInt(1);
                int i5 = readableArray.getInt(2);
                Object[] objArr4 = {map, Integer.valueOf(i4), Integer.valueOf(i5), Double.valueOf(readableArray.getDouble(3))};
                ChangeQuickRedirect changeQuickRedirect5 = MListView.k;
                if (PatchProxy.isSupport(objArr4, mListView, changeQuickRedirect5, false, "4032b7f7cd166ddc6bb8ad40626127e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, mListView, changeQuickRedirect5, false, "4032b7f7cd166ddc6bb8ad40626127e2");
                    return;
                }
                int i6 = i4 + 1;
                if (i6 < mListView.u.size()) {
                    com.meituan.android.mrn.component.list.node.c cVar = mListView.u.get(i6);
                    Object[] objArr5 = {map, Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.mrn.component.list.node.c.a;
                    if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect6, false, "f079e6b7aa9a0652d3b80c8736da9b03", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect6, false, "f079e6b7aa9a0652d3b80c8736da9b03");
                    } else if (cVar.f == null) {
                        com.facebook.common.logging.a.d("[Section@updateItem]", "mData is null while updateItem");
                    } else if (cVar.f.size() > i5) {
                        ArrayList<Object> arrayList = cVar.f.toArrayList();
                        arrayList.set(i5, map.toHashMap());
                        cVar.c.set(i5, null);
                        cVar.f = Arguments.makeNativeArray((List) arrayList);
                    }
                }
                mListView.o.a(mListView.a(i4, i5));
                return;
            case scrollTo:
                int round = (int) Math.round(readableArray.getDouble(0));
                int round2 = (int) Math.round(readableArray.getDouble(1));
                boolean z = readableArray.getBoolean(2);
                Object[] objArr6 = {Integer.valueOf(round), Integer.valueOf(round2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect7 = MListView.k;
                if (!PatchProxy.isSupport(objArr6, mListView, changeQuickRedirect7, false, "a1f8f068602f0ffab1197876e60f0b4a", RobustBitConfig.DEFAULT_VALUE)) {
                    if (z) {
                        mListView.smoothScrollBy(round - mListView.getScrollX(), round2 - mListView.getScrollY());
                        break;
                    } else {
                        mListView.scrollBy(round - mListView.getScrollX(), round2 - mListView.getScrollY());
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr6, mListView, changeQuickRedirect7, false, "a1f8f068602f0ffab1197876e60f0b4a");
                    break;
                }
        }
        throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getName()));
    }
}
