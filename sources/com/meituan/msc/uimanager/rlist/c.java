package com.meituan.msc.uimanager.rlist;

import android.support.constraint.R;
import android.view.View;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.mmpviews.perflist.view.PerfListView;
import com.meituan.msc.mmpviews.scroll.i;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.av;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends NativeViewHierarchyManager {
    public static ChangeQuickRedirect g;
    private boolean h;

    public c(av avVar) {
        super(avVar);
        Object[] objArr = {avVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19fcb1d3c4a4256276ff9deef534a38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19fcb1d3c4a4256276ff9deef534a38");
        } else {
            this.h = false;
        }
    }

    @Override // com.meituan.msc.uimanager.NativeViewHierarchyManager
    public final synchronized void a(ThemedReactContext themedReactContext, final int i, String str, @Nullable ab abVar) {
        Object[] objArr = {themedReactContext, Integer.valueOf(i), str, abVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f634d3a16979dcb8c2b676ad3b406fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f634d3a16979dcb8c2b676ad3b406fdf");
            return;
        }
        super.a(themedReactContext, i, str, abVar);
        View a = a(i);
        Object[] objArr2 = {a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.perflist.perf.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ca792c0b46b7437f49e117466986baf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ca792c0b46b7437f49e117466986baf1");
            return;
        }
        if (a instanceof i) {
            i iVar = (i) a;
            if (iVar != null && iVar.getChildCount() > 0) {
                final View childAt = iVar.getChildAt(0);
                if (childAt instanceof com.meituan.msc.mmpviews.scroll.c) {
                    ((com.meituan.msc.mmpviews.scroll.c) childAt).setCacheStateListener(new com.meituan.msc.mmpviews.list.msclist.c() { // from class: com.meituan.msc.mmpviews.perflist.perf.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.mmpviews.list.msclist.c
                        public final void a(JSONObject jSONObject) {
                            Object[] objArr3 = {jSONObject};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dd351b8b8a86ed867af58278da207ee3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dd351b8b8a86ed867af58278da207ee3");
                                return;
                            }
                            View view = childAt;
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            View view2 = null;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c36478e01a01d9e394019a2fee5a6bea", RobustBitConfig.DEFAULT_VALUE)) {
                                view2 = (View) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c36478e01a01d9e394019a2fee5a6bea");
                            } else {
                                while (true) {
                                    if (view == null) {
                                        break;
                                    } else if (view.getTag(R.id.native_item_tag) != null) {
                                        view2 = view;
                                        break;
                                    } else {
                                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                    }
                                }
                            }
                            if (view2 == null || !(view2.getTag(R.id.native_item_tag) instanceof PerfListView.a)) {
                                return;
                            }
                            try {
                                PerfListView.a aVar = (PerfListView.a) view2.getTag(R.id.native_item_tag);
                                if (aVar.d == null) {
                                    return;
                                }
                                JSONObject jSONObject2 = aVar.d.f;
                                if (jSONObject2 == null) {
                                    jSONObject2 = new JSONObject();
                                    aVar.d.f = jSONObject2;
                                }
                                jSONObject2.put(String.valueOf(i), jSONObject);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.meituan.msc.uimanager.NativeViewHierarchyManager
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586b9547692fcb6b5b4feb8fdd32c302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586b9547692fcb6b5b4feb8fdd32c302");
        } else if (this.h) {
            super.b(view);
        }
    }

    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d026d232a34c90bed45a29a8eb8c01f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d026d232a34c90bed45a29a8eb8c01f");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.h = true;
        super.d(i);
        this.h = false;
    }
}
