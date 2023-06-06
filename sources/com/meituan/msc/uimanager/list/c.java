package com.meituan.msc.uimanager.list;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.msc.jse.bridge.JavaOnlyArray;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.mmpviews.list.msclist.MSCListNode;
import com.meituan.msc.mmpviews.scroll.i;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.ag;
import com.meituan.msc.uimanager.av;
import com.meituan.msc.uimanager.j;
import com.meituan.msc.uimanager.p;
import com.meituan.msc.uimanager.t;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends j {
    public static int C;
    public static ChangeQuickRedirect w;
    public int A;
    b B;
    private ReactApplicationContext D;
    protected int x;
    protected View y;
    protected aa z;

    @Override // com.meituan.msc.uimanager.j
    public boolean c() {
        return false;
    }

    public c(ReactApplicationContext reactApplicationContext, av avVar, ag agVar, UIViewOperationQueue uIViewOperationQueue, com.meituan.msc.uimanager.events.b bVar, int i, b bVar2) {
        super(reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar);
        Object[] objArr = {reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar, Integer.valueOf(i), bVar2};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9fd43e9710c27884d05d98ced7e4ead", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9fd43e9710c27884d05d98ced7e4ead");
            return;
        }
        this.x = 0;
        this.B = bVar2;
        this.D = reactApplicationContext;
        reactApplicationContext.setUIImplementation(this);
    }

    @Override // com.meituan.msc.uimanager.j, com.meituan.msc.uimanager.UIImplementation
    public void a(p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8197c30756e96acdb17e21c5c4f4f51c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8197c30756e96acdb17e21c5c4f4f51c");
        } else if (this.B == null) {
        } else {
            View g = g(pVar.a);
            aa c = this.k.c(pVar.a);
            if (c == null || g == null) {
                return;
            }
            c.a(new ab(pVar.b));
            this.B.a(g);
        }
    }

    public static c a(ReactApplicationContext reactApplicationContext, UIImplementation uIImplementation, int i, b bVar) {
        Object[] objArr = {reactApplicationContext, uIImplementation, Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = w;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1913f58ba93771a6cd12ac3976f6d59", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1913f58ba93771a6cd12ac3976f6d59") : new c(reactApplicationContext, uIImplementation.f(), new ag(), new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(uIImplementation.f()), 0), uIImplementation.i, i, bVar);
    }

    public final aa q() {
        return this.z;
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public void c(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3faa016607c00bd6657e40547a428122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3faa016607c00bd6657e40547a428122");
            return;
        }
        long nanoTime = System.nanoTime();
        super.c(aaVar);
        C = (int) (C + (System.nanoTime() - nanoTime));
    }

    public final View r() {
        return this.y;
    }

    public final boolean s() {
        return this.x > 1;
    }

    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01c241b5d328670d756490f756c60ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01c241b5d328670d756490f756c60ad");
        } else {
            this.x++;
        }
    }

    public final void a(@NonNull MSCListNode mSCListNode, int i, int i2) {
        Object[] objArr = {mSCListNode, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5973727a419ab3ccf0cda0465ae3174b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5973727a419ab3ccf0cda0465ae3174b");
            return;
        }
        aa c = p().c(mSCListNode.mReactTag);
        if (c != null) {
            c.a(i, i2);
            f(this.x);
            return;
        }
        g.d("[MSCListItemUIImplementation@onBindViewHolder] ", "rootShadowNode null,tag:" + mSCListNode.mReactTag);
    }

    public final void a(ThemedReactContext themedReactContext, MSCListNode mSCListNode, int i) {
        Object[] objArr = {themedReactContext, mSCListNode, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6fa8e59f393bec27e9cbdeb7e462c4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6fa8e59f393bec27e9cbdeb7e462c4c");
        } else if (this.y != null) {
            throw new IllegalStateException("TurboNode树根View已经创建了");
        } else {
            PerfTrace.online().a("list_create_shadow_node").a("isReuseCell", "false");
            this.y = b(themedReactContext, mSCListNode, mSCListNode.mReactTag);
            PerfTrace.online().b("list_create_shadow_node").a("isReuseCell", "false");
            this.y.setTag(R.id.native_component_turbo_node_tag, mSCListNode);
        }
    }

    public final View b(ThemedReactContext themedReactContext, final MSCListNode mSCListNode, int i) {
        int i2;
        Object[] objArr = {themedReactContext, mSCListNode, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53b595582488b870920b8a4daf6646e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53b595582488b870920b8a4daf6646e");
        }
        if (mSCListNode == null) {
            return null;
        }
        if (mSCListNode.isForChild) {
            mSCListNode.mReactTag = com.meituan.msc.mmpviews.list.common.b.a();
        }
        a(themedReactContext, mSCListNode.mReactTag, mSCListNode.mViewClass, i, new MSCReadableMap(mSCListNode.mProps));
        aa c = p().c(mSCListNode.mReactTag);
        View g = c.b() ? null : g(mSCListNode.mReactTag);
        if (mSCListNode.mReactTag == i) {
            this.z = c;
            c.b(true);
            p().a(c);
        }
        c.g(i);
        if (g != null && mSCListNode.mProps != null) {
            if (mSCListNode.mProps.opt("bindtap") != null) {
                g.setTag(R.id.msc_list_view_bind_event_id, mSCListNode.mProps.opt("bindtap"));
            } else if (mSCListNode.mProps.opt("catchtap") != null) {
                g.setTag(R.id.msc_list_view_bind_event_id, mSCListNode.mProps.opt("catchtap"));
            }
        }
        if (g instanceof i) {
            i iVar = (i) g;
            Object[] objArr2 = {iVar, mSCListNode};
            ChangeQuickRedirect changeQuickRedirect2 = w;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "927c44340121e1ac64f13a59ebd64c28", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = 0;
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "927c44340121e1ac64f13a59ebd64c28");
            } else {
                i2 = 0;
                if (iVar != null && iVar.getChildCount() > 0) {
                    View childAt = iVar.getChildAt(0);
                    if (childAt instanceof com.meituan.msc.mmpviews.scroll.c) {
                        ((com.meituan.msc.mmpviews.scroll.c) childAt).setCacheStateListener(new com.meituan.msc.mmpviews.list.msclist.c() { // from class: com.meituan.msc.uimanager.list.c.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msc.mmpviews.list.msclist.c
                            public final void a(JSONObject jSONObject) {
                                Object[] objArr3 = {jSONObject};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e21bfcdf97ac0604e6ceb914b2a0a0b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e21bfcdf97ac0604e6ceb914b2a0a0b");
                                    return;
                                }
                                View g2 = mSCListNode.uiImplementation.g(mSCListNode.mRootTag);
                                if (g2 != null) {
                                    try {
                                        MSCListNode mSCListNode2 = (MSCListNode) g2.getTag(R.id.native_component_turbo_node_tag);
                                        JSONObject jSONObject2 = mSCListNode2.rawData.d;
                                        if (jSONObject2 == null) {
                                            jSONObject2 = new JSONObject();
                                            mSCListNode2.rawData.d = jSONObject2;
                                        }
                                        jSONObject2.put(String.valueOf(mSCListNode.mReactTag), jSONObject);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });
                    }
                }
            }
        } else {
            i2 = 0;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (mSCListNode.mChildren == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < mSCListNode.mChildren.size()) {
            MSCListNode mSCListNode2 = mSCListNode.mChildren.get(i2);
            if (mSCListNode2.ifVal == null || mSCListNode2.ifVal.booleanValue()) {
                b(themedReactContext, mSCListNode2, i);
                javaOnlyArray.pushInt(mSCListNode2.mReactTag);
            } else {
                arrayList.add(mSCListNode2);
            }
            i2++;
        }
        mSCListNode.mChildren.removeAll(arrayList);
        if (javaOnlyArray.size() > 0) {
            a(mSCListNode.mReactTag, javaOnlyArray);
        }
        return g;
    }

    public final void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c235a1a74d850b116f9eb286c78eaed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c235a1a74d850b116f9eb286c78eaed");
            return;
        }
        View a = h().a().a(i);
        if (a != null) {
            a.setVisibility(z ? 0 : 8);
            if (a instanceof com.meituan.msc.mmpviews.shell.b) {
                ((com.meituan.msc.mmpviews.shell.b) a).getDelegate().t = z ? t.AUTO : t.NONE;
            }
        }
    }

    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7d52a9481c238ee6cdee5d98792252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7d52a9481c238ee6cdee5d98792252");
        } else {
            this.D.onHostDestroy();
        }
    }
}
