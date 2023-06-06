package com.meituan.msc.mmpviews.msiviews;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.mmpviews.shell.MPLayoutShadowNode;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ab;
import com.meituan.msi.ApiPortal;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSIViewManager<T extends ViewGroup> extends MPShellDelegateViewManager<T, MPLayoutShadowNode> implements com.meituan.msi.dispather.d {
    public static ChangeQuickRedirect a;
    private String b;
    private final String c;
    private Map<String, WeakReference<ReactApplicationContext>> e;

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final /* bridge */ /* synthetic */ View a(@NonNull ThemedReactContext themedReactContext) {
        return null;
    }

    @Override // com.meituan.msi.dispather.d
    public final void a(String str, String str2) {
    }

    @Override // com.meituan.msc.uimanager.as
    @RequiresApi(api = 23)
    public final /* synthetic */ View a(int i, @NonNull ThemedReactContext themedReactContext, ab abVar) {
        Object[] objArr = {Integer.valueOf(i), themedReactContext, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a99c7af223638468f00d06c3032753", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a99c7af223638468f00d06c3032753");
        }
        final b bVar = new b(themedReactContext);
        ApiPortal apiPortal = themedReactContext.getRuntimeDelegate().getApiPortal();
        if (apiPortal == null) {
            g.b(this.c, null, "[createViewInstance] apiPortal null, msiView:", Integer.valueOf(i), ",props:", ((MSCReadableMap) abVar.b).getRealData());
        } else {
            final View a2 = apiPortal.a(a.b(this.b), String.valueOf(i), String.valueOf(a.a(themedReactContext)), ((MSCReadableMap) abVar.b).getRealData(), this);
            if (a2 == null) {
                throw new com.meituan.msc.common.a("MSI 组件创建失败!");
            }
            g.d("[MSIViewManager@createViewInstance] ", "msiView: ", Integer.valueOf(i), ",props:", ((MSCReadableMap) abVar.b).getRealData());
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "276ffc26616bad5e5303b70be7614358", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "276ffc26616bad5e5303b70be7614358");
            } else {
                bVar.b = a2;
                bVar.addView(a2);
                bVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.meituan.msc.mmpviews.msiviews.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        Object[] objArr3 = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4aa0c9b3acc8e5e67c3330ae4932d76d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4aa0c9b3acc8e5e67c3330ae4932d76d");
                        } else {
                            a2.layout(0, 0, view.getWidth(), view.getHeight());
                        }
                    }
                });
            }
        }
        return bVar;
    }

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final /* synthetic */ aa a(int i, @NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {Integer.valueOf(i), reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4897af8b804761faed9b608dd930762d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4897af8b804761faed9b608dd930762d");
        }
        a(reactApplicationContext);
        return new MPLayoutShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(int i, @NonNull View view, ab abVar) {
        ViewGroup viewGroup = (ViewGroup) view;
        Object[] objArr = {Integer.valueOf(i), viewGroup, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9165f16fdb58fb488d92f11c138e5dba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9165f16fdb58fb488d92f11c138e5dba");
            return;
        }
        Map a2 = a.a(this.b);
        if (a2 == null || a2.isEmpty()) {
            super.a(i, (int) viewGroup, abVar);
        } else if (!(viewGroup.getContext() instanceof ReactContext)) {
            super.a(i, (int) viewGroup, abVar);
        } else {
            ReactContext reactContext = (ReactContext) viewGroup.getContext();
            JSONObject jSONObject = new JSONObject();
            Iterator<Map.Entry<String, Object>> entryIterator = abVar.b.getEntryIterator();
            boolean z = false;
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String key = next.getKey();
                if (a2.containsKey(key)) {
                    try {
                        jSONObject.put(key, next.getValue());
                        z = true;
                    } catch (JSONException e) {
                        g.a("[MSIViewManager@updateProperties]", e);
                    }
                }
            }
            if (z) {
                try {
                    jSONObject.put("unitPx", true);
                } catch (JSONException e2) {
                    g.b(this.c, e2, "[updateProperties]");
                }
                String str = this.c;
                g.d(str, "[updateProperties-2] viewTag:", i + ",msiPropsJson:", jSONObject);
                ApiPortal apiPortal = reactContext.getRuntimeDelegate().getApiPortal();
                if (apiPortal == null) {
                    g.b(this.c, null, "[updateProperties] apiPortal null, msiView:", Integer.valueOf(i), ",props:", jSONObject);
                    return;
                }
                apiPortal.a(viewGroup.getChildAt(0), String.valueOf(i), String.valueOf(a.a(reactContext)), jSONObject);
            }
            super.a(i, (int) viewGroup, abVar);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void b(@NonNull View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6263534ed4b0812c6869c60924d7faff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6263534ed4b0812c6869c60924d7faff");
            return;
        }
        super.b(viewGroup);
        if (viewGroup instanceof b) {
            b bVar = (b) viewGroup;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0b99dda4bec91eefa468722478efd000", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0b99dda4bec91eefa468722478efd000");
            } else if (bVar.b instanceof com.meituan.msi.view.d) {
                ((com.meituan.msi.view.d) bVar.b).g();
            }
        }
    }

    public MSIViewManager(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dbfab050cf62b9174806b6e9ac64771", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dbfab050cf62b9174806b6e9ac64771");
            return;
        }
        this.c = "MSIViewManager@" + Integer.toHexString(hashCode());
        this.e = new HashMap();
        this.b = str;
    }

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final String a() {
        return this.b;
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class c() {
        return MPLayoutShadowNode.class;
    }

    public final void a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cacd1dbbd5e702616dbdfa0f0070b03c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cacd1dbbd5e702616dbdfa0f0070b03c");
            return;
        }
        String valueOf = String.valueOf(reactApplicationContext.getRuntimeDelegate().getPageId());
        if (this.e.containsKey(valueOf)) {
            return;
        }
        this.e.put(valueOf, new WeakReference<>(reactApplicationContext));
    }

    @Override // com.meituan.msc.uimanager.as
    public final Map<String, String> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165b1dd306cff12425328b664a6ea429", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165b1dd306cff12425328b664a6ea429");
        }
        Map<String, String> f = super.f();
        Map<? extends String, ? extends String> a2 = a.a(this.b);
        if (a2 == null || a2.isEmpty()) {
            return f;
        }
        f.putAll(a2);
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    @Override // com.meituan.msi.dispather.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.msi.bean.EventType r19, java.lang.String r20, java.lang.String r21, com.meituan.msi.bean.BroadcastEvent r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.msiviews.MSIViewManager.a(com.meituan.msi.bean.EventType, java.lang.String, java.lang.String, com.meituan.msi.bean.BroadcastEvent):void");
    }
}
