package com.meituan.android.recce.views.base.rn;

import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ad;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.as;
import com.google.gson.Gson;
import com.meituan.android.recce.b;
import com.meituan.android.recce.bench.a;
import com.meituan.android.recce.events.d;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.android.recce.mrn.uimanager.e;
import com.meituan.android.recce.props.c;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.android.recce.props.gens.PropVisitorAcceptIndex;
import com.meituan.android.recce.views.base.RecceUIManagerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceUIManagerModule extends UIManagerModule {
    private static int ROOT_VIEW_TAG = 1;
    private static String TAG = "RecceUIManagerModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private d eventDispatcher;
    public final String[] viewManagerNameList;

    public RecceUIManagerModule(b bVar, d dVar, List<ViewManager> list, int i) {
        super(bVar.a(), list, i);
        Object[] objArr = {bVar, dVar, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23b199bacb601251dc0dc0c78ac3f33a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23b199bacb601251dc0dc0c78ac3f33a");
            return;
        }
        this.viewManagerNameList = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.viewManagerNameList[i2] = list.get(i2).getName();
        }
        this.eventDispatcher = dVar;
        RecceUIManagerUtils.addEventDispatcher(dVar);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule, com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, @Nullable String str) {
        Object[] objArr = {t, writableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cdb0eb94d38357a73f07454ac66c32d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cdb0eb94d38357a73f07454ac66c32d")).intValue();
        }
        int i = ROOT_VIEW_TAG;
        ad adVar = (ad) t;
        ao aoVar = new ao(getReactApplicationContext(), t.getContext(), adVar.getSurfaceID());
        if (t instanceof ad) {
            aoVar.a(adVar);
        }
        getUIImplementation().a((as) t, i, aoVar);
        return i;
    }

    public d getRecceEventDispatcher() {
        return this.eventDispatcher;
    }

    public final void recceApplyAllViewChanged(int i, BinReader binReader) {
        Object[] objArr = {Integer.valueOf(i), binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08911033480289158db5093f84febc65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08911033480289158db5093f84febc65");
            return;
        }
        a.a("Recce.Java.ApplyAllViewChanged");
        recceCreateView(i, binReader);
        recceSetChildren(binReader);
        recceManageChildren(binReader);
        recceUpdateViewsWithProps(binReader);
        a.a();
    }

    private void recceCreateView(int i, BinReader binReader) {
        Object accept;
        int i2 = 2;
        char c = 0;
        Object[] objArr = {Integer.valueOf(i), binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3d252741706ae3794dba282a5964163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3d252741706ae3794dba282a5964163");
            return;
        }
        a.a("Recce.Java.CreateView");
        int intSignedLeb128 = binReader.getIntSignedLeb128();
        com.meituan.android.recce.props.b bVar = new com.meituan.android.recce.props.b();
        int i3 = 0;
        while (i3 < intSignedLeb128) {
            int intSignedLeb1282 = binReader.getIntSignedLeb128();
            int intSignedLeb1283 = binReader.getIntSignedLeb128();
            int intSignedLeb1284 = binReader.getIntSignedLeb128();
            String str = this.viewManagerNameList[intSignedLeb1283];
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i4 = 0;
            while (i4 < intSignedLeb1284) {
                Object[] objArr2 = new Object[i2];
                objArr2[c] = binReader;
                objArr2[1] = bVar;
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "b3723115e77aec380669c70d06d2e051", RobustBitConfig.DEFAULT_VALUE)) {
                    accept = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "b3723115e77aec380669c70d06d2e051");
                } else {
                    int intSignedLeb1285 = binReader.getIntSignedLeb128();
                    StringBuilder sb = new StringBuilder("acceptOne: index ");
                    sb.append(intSignedLeb1285);
                    sb.append(StringUtil.SPACE);
                    sb.append(new Gson().toJson(PropVisitorAcceptIndex.props[intSignedLeb1285]));
                    accept = PropVisitorAcceptIndex.props[intSignedLeb1285].accept(binReader, bVar);
                }
                javaOnlyMap.merge((ReadableMap) accept);
                i4++;
                i2 = 2;
                c = 0;
            }
            com.dianping.networklog.c.a("RecceUIManagerModule: recceCreateView " + ("viewId is " + intSignedLeb1282 + " viewClassName is " + str + " rootViewId is " + i + " propsMap " + javaOnlyMap), 3, new String[]{"Recce-Android"});
            createView(intSignedLeb1282, str, i, javaOnlyMap);
            i3++;
            i2 = 2;
            c = 0;
        }
        a.a();
    }

    private void recceSetChildren(BinReader binReader) {
        Object[] objArr = {binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1440f0474bb4b7eca5a3503b1adaf032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1440f0474bb4b7eca5a3503b1adaf032");
            return;
        }
        a.a("Recce.Java.SetChildren");
        int intSignedLeb128 = binReader.getIntSignedLeb128();
        for (int i = 0; i < intSignedLeb128; i++) {
            int intSignedLeb1282 = binReader.getIntSignedLeb128();
            int intSignedLeb1283 = binReader.getIntSignedLeb128();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < intSignedLeb1283; i2++) {
                arrayList.add(Integer.valueOf(binReader.getIntSignedLeb128()));
            }
            JavaOnlyArray from = JavaOnlyArray.from(arrayList);
            com.dianping.networklog.c.a("RecceUIManagerModule: recceSetChildren " + ("parentId is " + intSignedLeb1282 + " children is " + from), 3, new String[]{"Recce-Android"});
            setChildren(intSignedLeb1282, from);
        }
        a.a();
    }

    private ReadableArray recceGetManageChildrenItem(BinReader binReader) {
        Object[] objArr = {binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f167db36f384131374f614b77beb8469", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f167db36f384131374f614b77beb8469");
        }
        int intSignedLeb128 = binReader.getIntSignedLeb128();
        if (intSignedLeb128 > 0) {
            Object[] objArr2 = new Object[intSignedLeb128];
            for (int i = 0; i < intSignedLeb128; i++) {
                objArr2[i] = Integer.valueOf(binReader.getIntSignedLeb128());
            }
            return JavaOnlyArray.of(objArr2);
        }
        return null;
    }

    private void recceManageChildren(BinReader binReader) {
        Object[] objArr = {binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f591dc2b2b0e0493e6a4fb9b947816f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f591dc2b2b0e0493e6a4fb9b947816f");
            return;
        }
        int intSignedLeb128 = binReader.getIntSignedLeb128();
        for (int i = 0; i < intSignedLeb128; i++) {
            int intSignedLeb1282 = binReader.getIntSignedLeb128();
            ReadableArray recceGetManageChildrenItem = recceGetManageChildrenItem(binReader);
            ReadableArray recceGetManageChildrenItem2 = recceGetManageChildrenItem(binReader);
            ReadableArray recceGetManageChildrenItem3 = recceGetManageChildrenItem(binReader);
            ReadableArray recceGetManageChildrenItem4 = recceGetManageChildrenItem(binReader);
            ReadableArray recceGetManageChildrenItem5 = recceGetManageChildrenItem(binReader);
            com.dianping.networklog.c.a("RecceUIManagerModule: recceManageChildren " + ("viewTag is " + intSignedLeb1282 + " moveFrom is " + recceGetManageChildrenItem + " moveTo " + recceGetManageChildrenItem2 + " addChildTags " + recceGetManageChildrenItem3 + " addAtIndices " + recceGetManageChildrenItem4 + " removeFrom " + recceGetManageChildrenItem5), 3, new String[]{"Recce-Android"});
            manageChildren(intSignedLeb1282, recceGetManageChildrenItem, recceGetManageChildrenItem2, recceGetManageChildrenItem3, recceGetManageChildrenItem4, recceGetManageChildrenItem5);
        }
    }

    private void recceUpdateViewsWithProps(BinReader binReader) {
        Object[] objArr = {binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "629ba9e528d82ee669022abc80dc8c1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "629ba9e528d82ee669022abc80dc8c1a");
            return;
        }
        a.a("Recce.Java.UpdateView");
        BinReader slice = binReader.slice();
        as uIImplementation = getUIImplementation();
        int intSignedLeb128 = binReader.getIntSignedLeb128();
        boolean[] zArr = new boolean[intSignedLeb128];
        for (int i = 0; i < intSignedLeb128; i++) {
            int intSignedLeb1282 = binReader.getIntSignedLeb128();
            int intSignedLeb1283 = binReader.getIntSignedLeb128();
            af d = uIImplementation.d(intSignedLeb1282);
            if (d == null) {
                String str = TAG;
                Log.e(str, "找不到对应的 cssNode: " + intSignedLeb1282);
                com.dianping.networklog.c.a("RecceUIManagerModule: recceUpdateViewsWithProps 找不到对应的 cssNode " + intSignedLeb1282, 3, new String[]{"Recce-Android"});
            }
            PropVisitor<Void> propVisitor = null;
            if (d instanceof e) {
                propVisitor = ((e) d).getVisitor();
            } else {
                com.dianping.networklog.c.a("RecceUIManagerModule: recceUpdateViewsWithProps 不支持 ShadowNodeVisitorProvider 的 CssNode " + d.getClass(), 3, new String[]{"Recce-Android"});
                String str2 = TAG;
                Log.e(str2, "不支持 ShadowNodeVisitorProvider 的 CssNode: " + d.getClass());
            }
            if (intSignedLeb1283 > 0) {
                binReader.getIntSignedLeb128();
                c.a(binReader, propVisitor, intSignedLeb1283);
                d.onAfterUpdateTransaction();
            }
            zArr[i] = d.isVirtual();
        }
        recceUpdateViewsOnUIBlockWithProps(slice, zArr);
        onBatchComplete();
        a.a();
    }

    private void recceUpdateViewsOnUIBlockWithProps(BinReader binReader, boolean[] zArr) {
        Object[] objArr = {binReader, zArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df04fd2ca27060e9e79323c51ad91ab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df04fd2ca27060e9e79323c51ad91ab8");
        } else {
            getUIImplementation().a().a(RecceUIManagerModule$$Lambda$1.lambdaFactory$(binReader.getIntSignedLeb128(), zArr, binReader));
        }
    }

    public static /* synthetic */ void lambda$recceUpdateViewsOnUIBlockWithProps$0(int i, boolean[] zArr, BinReader binReader, NativeViewHierarchyManager nativeViewHierarchyManager) {
        Object[] objArr = {Integer.valueOf(i), zArr, binReader, nativeViewHierarchyManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "342668ad82423bc8a90c2aedde417ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "342668ad82423bc8a90c2aedde417ada");
            return;
        }
        a.a("UIBlock.UpdateView");
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            int intSignedLeb128 = binReader.getIntSignedLeb128();
            int intSignedLeb1282 = binReader.getIntSignedLeb128();
            if (intSignedLeb1282 > 0) {
                int intSignedLeb1283 = binReader.getIntSignedLeb128();
                if (z) {
                    binReader.advance(intSignedLeb1283);
                } else {
                    View d = nativeViewHierarchyManager.d(intSignedLeb128);
                    if (d == null) {
                        String str = TAG;
                        Log.e(str, "找不到 id 为 " + intSignedLeb128 + " 的视图");
                        com.dianping.networklog.c.a("RecceUIManagerModule: recceUpdateViewsOnUIBlockWithProps 找不到 id 为 " + intSignedLeb128 + " 的视图", 3, new String[]{"Recce-Android"});
                    }
                    ViewManager e = nativeViewHierarchyManager.e(intSignedLeb128);
                    if (e instanceof com.meituan.android.recce.mrn.uimanager.b) {
                        com.dianping.networklog.c.a("RecceUIManagerModule: recceUpdateViewsOnUIBlockWithProps view name is " + e.getName(), 3, new String[]{"Recce-Android"});
                        com.meituan.android.recce.mrn.uimanager.b bVar = (com.meituan.android.recce.mrn.uimanager.b) e;
                        c.a(binReader, bVar.getVisitor(d), intSignedLeb1282);
                        bVar.recceOnAfterUpdateTransaction(d);
                    } else {
                        String str2 = TAG;
                        Log.e(str2, "不支持 PropVisitorProvider 的 ViewManager: " + e);
                        com.dianping.networklog.c.a("RecceUIManagerModule: recceUpdateViewsOnUIBlockWithProps 不支持 PropVisitorProvider 的 ViewManager " + e, 3, new String[]{"Recce-Android"});
                    }
                }
            }
        }
        a.a();
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6db5cdea7f3566919874c93ab832f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6db5cdea7f3566919874c93ab832f9a");
        } else {
            RecceUIManagerUtils.removeEventDispatcher(this.eventDispatcher);
        }
    }
}
