package com.meituan.msc.modules.page;

import android.text.TextUtils;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msc.common.utils.ax;
import com.meituan.msc.modules.page.view.CoverViewWrapper;
import com.meituan.msc.modules.page.view.coverview.CoverViewRootContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements b {
    public static ChangeQuickRedirect a;
    public final l b;
    public final com.meituan.msc.modules.page.widget.d c;

    public k(l lVar, com.meituan.msc.modules.page.widget.d dVar) {
        Object[] objArr = {lVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee71fdbbc68e16a74393d184f1ec7e3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee71fdbbc68e16a74393d184f1ec7e3a");
            return;
        }
        this.b = lVar;
        this.c = dVar;
    }

    @Override // com.meituan.msi.page.e
    public final void a(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05abb66e2a0040a0059c9783bbffce06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05abb66e2a0040a0059c9783bbffce06");
            return;
        }
        int id = view.getId();
        view.setId(-1);
        Object[] objArr2 = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae59e3fbec4b147438a969b350bf01e2", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae59e3fbec4b147438a969b350bf01e2")).booleanValue();
        } else {
            com.meituan.msc.modules.page.widget.d dVar = this.c;
            if (dVar != null && dVar.getCoverViewContainer() != null && dVar.getUnderCoverViewContainer() != null) {
                if (view instanceof com.meituan.msc.modules.api.msi.webview.m) {
                    this.b.j.m = new WeakReference<>(view);
                }
                if (jsonObject.has("mtSinkMode") && jsonObject.get("mtSinkMode").getAsBoolean()) {
                    this.b.l = true;
                    Object[] objArr3 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.page.widget.d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "93c1fecf3171f4e14779663e47ff082d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "93c1fecf3171f4e14779663e47ff082d");
                    } else if (dVar.b instanceof com.meituan.msc.modules.page.render.webview.d) {
                        View webView = ((com.meituan.msc.modules.page.render.webview.d) dVar.b).getWebView();
                        webView.setBackgroundColor(0);
                        webView.setLayerType(2, null);
                    }
                    dVar.getUnderCoverViewContainer().a(view, jsonObject);
                } else {
                    String b = dVar.b(jsonObject.has("parentId") ? jsonObject.get("parentId").getAsString() : null);
                    if (jsonObject.has("markerId") || b != null) {
                        Object[] objArr4 = {jsonObject, b, dVar, view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "de96d81213c84ed1d70222342870fab4", RobustBitConfig.DEFAULT_VALUE)) {
                            ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "de96d81213c84ed1d70222342870fab4")).booleanValue();
                        } else {
                            String str = "";
                            String asString = jsonObject.get("viewId").getAsString();
                            if (jsonObject.has("markerId")) {
                                str = jsonObject.get("markerId").getAsString();
                                jsonObject.remove("parentId");
                            }
                            if (b == null && jsonObject.has("mapId")) {
                                b = jsonObject.get("mapId").getAsString() + CommonConstant.Symbol.UNDERLINE + str;
                            }
                            ConcurrentHashMap<String, List<String>> markerViewIdsMap = dVar.getMarkerViewIdsMap();
                            if (b != null) {
                                List<String> list = markerViewIdsMap.get(b);
                                if (list != null) {
                                    list.add(asString);
                                    markerViewIdsMap.put(b, list);
                                } else if (!TextUtils.isEmpty(str)) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(asString);
                                    markerViewIdsMap.put(b, arrayList);
                                }
                            }
                            if (b != null) {
                                dVar.a(b).a(view, jsonObject);
                            }
                        }
                    } else {
                        dVar.getCoverViewContainer().a(view, jsonObject);
                    }
                }
            }
        }
        if (view.getParent() instanceof View) {
            ((View) view.getParent()).setId(id);
        }
    }

    @Override // com.meituan.msi.page.e
    public final void a(int i, JsonObject jsonObject) {
        Object[] objArr = {Integer.valueOf(i), jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0383876494a59e5326591df410973357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0383876494a59e5326591df410973357");
        } else {
            b(i, jsonObject);
        }
    }

    @Override // com.meituan.msi.page.e
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc0fe2826ca6836f0f5f58395e4abb3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc0fe2826ca6836f0f5f58395e4abb3b");
        } else if (view == null) {
        } else {
            View view2 = (View) view.getParent();
            if (view2 instanceof CoverViewWrapper) {
                ax.a(view2);
            } else {
                ax.a(view);
            }
        }
    }

    @Override // com.meituan.msi.page.e
    public final View a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59daa627efc594beaaf580aaf20212c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59daa627efc594beaaf580aaf20212c7");
        }
        l lVar = this.b;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = l.h;
        if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "0c145431f61da6c4e96c9efb3b01314f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "0c145431f61da6c4e96c9efb3b01314f");
        }
        com.meituan.msc.modules.page.render.d n = lVar.i.n();
        if (n == null) {
            return null;
        }
        if (n.p()) {
            CoverViewWrapper b = lVar.b(i, i2);
            if (b != null) {
                return b.getContent();
            }
            return null;
        }
        return n.a(i);
    }

    @Override // com.meituan.msc.modules.page.b
    public final View a(String str, final com.meituan.msi.page.f fVar) {
        Object[] objArr = {str, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a26d24cfff9f3d531c7445b88b0c64a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a26d24cfff9f3d531c7445b88b0c64a");
        }
        final com.meituan.msc.modules.page.view.coverview.b bVar = (com.meituan.msc.modules.page.view.coverview.b) this.c.a(str);
        bVar.f = new com.meituan.msc.modules.api.msi.components.coverview.a() { // from class: com.meituan.msc.modules.page.k.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.api.msi.components.coverview.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39463e346a38fd49819d5536bc943b87", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39463e346a38fd49819d5536bc943b87");
                } else if (fVar != null) {
                    fVar.a(bVar);
                }
            }
        };
        return bVar;
    }

    private boolean b(int i, JsonObject jsonObject) {
        CoverViewRootContainer a2;
        Object[] objArr = {Integer.valueOf(i), jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a8a6aff68854bd3ee48ed1756d57cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a8a6aff68854bd3ee48ed1756d57cc")).booleanValue();
        }
        if (jsonObject.has("position")) {
            synchronized (this.c) {
                CoverViewWrapper a3 = com.meituan.msc.modules.page.view.e.a(this.c.getCoverViewContainer(), i);
                if (a3 != null) {
                    this.c.getCoverViewContainer().a(a3, jsonObject);
                    return true;
                }
                CoverViewWrapper a4 = com.meituan.msc.modules.page.view.e.a(this.c.getUnderCoverViewContainer(), i);
                if (a4 != null) {
                    this.c.getUnderCoverViewContainer().a(a4, jsonObject);
                    return true;
                }
                CoverViewWrapper a5 = this.c.a(i, -1);
                if (a5 == null || (a2 = this.c.a(i)) == null) {
                    return false;
                }
                a2.a(a5, jsonObject);
                return true;
            }
        }
        return false;
    }
}
