package com.sankuai.waimai.pouch.plugin.common.interact;

import android.app.Activity;
import android.arch.lifecycle.q;
import android.support.v4.app.FragmentActivity;
import android.util.ArrayMap;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMPouchContainerLifeCyclePlugin extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;
    private final String d;
    private String e;
    private Mach f;
    private PouchViewModel g;
    private String h;

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a(String str, int i, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void b() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void c() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onRenderFailed() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
    }

    public WMPouchContainerLifeCyclePlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd263f2f2ca3ce06a42a8afcd1cbc9a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd263f2f2ca3ce06a42a8afcd1cbc9a5");
            return;
        }
        this.b = "containerAppear";
        this.c = "containerDisappear";
        this.d = "mach-container-life-cycle";
        this.e = "WMPouchContainerLifeCyclePlugin";
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2e8227dc14d593f08d1d3c18570d19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2e8227dc14d593f08d1d3c18570d19");
            return;
        }
        Object[] objArr2 = {"containerFromInvisibleToVisible"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d11752005fd8cd2144ec4977268183b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d11752005fd8cd2144ec4977268183b0");
        } else if (g() && !this.g.a(this.h)) {
            c("containerFromInvisibleToVisible @mContainerUUID: " + this.h);
            b("containerAppear");
            PouchViewModel pouchViewModel = this.g;
            String str = this.h;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = PouchViewModel.a;
            if (PatchProxy.isSupport(objArr3, pouchViewModel, changeQuickRedirect3, false, "67722cc708920163f307df1f3a356c06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, pouchViewModel, changeQuickRedirect3, false, "67722cc708920163f307df1f3a356c06");
            } else {
                pouchViewModel.i.add(str);
            }
        } else {
            c("Appear被过滤了 containerFromInvisibleToVisible 原因：verify()： " + g() + " 队列状态： " + this.g.a(this.h) + " mContainerUUID: " + this.h);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51fcb081c76302935683d1e7187241e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51fcb081c76302935683d1e7187241e");
        } else {
            a("containerDestroy");
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edce4b2b1e8603f22ce1829ae690d6a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edce4b2b1e8603f22ce1829ae690d6a3");
        } else {
            a("containerFromVisibleToInvisible");
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d09efe42a0e40334e1985be6b3da7a2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d09efe42a0e40334e1985be6b3da7a2e");
        } else if (aVar == null) {
            com.sankuai.waimai.foundation.utils.log.a.c(this.e, "rootNode is null !", new Object[0]);
        } else {
            this.h = aVar.i;
            c("++onViewAttached++  mContainerUUID: " + this.h + " this hash: " + hashCode());
            if (this.f == null) {
                this.f = aVar.f;
            }
            if (this.g == null) {
                Activity activity = this.f != null ? this.f.getActivity() : null;
                if (activity instanceof FragmentActivity) {
                    this.g = (PouchViewModel) q.a((FragmentActivity) activity).a(PouchViewModel.class);
                }
            }
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb5e68a8244c1e8339f6a4de715000f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb5e68a8244c1e8339f6a4de715000f");
        } else if (g() && this.g.a(this.h)) {
            c(str + " @mContainerUUID: " + this.h);
            b("containerDisappear");
            this.g.b(this.h);
        } else {
            c("Appear被过滤了 " + str + " 原因：verify()： " + g() + " 队列状态： " + this.g.a(this.h) + " mContainerUUID: " + this.h);
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23bf31652c5710e220adb67c936f20e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23bf31652c5710e220adb67c936f20e8");
        } else if (this.f == null) {
            com.sankuai.waimai.foundation.utils.log.a.c(this.e, "mMach is null!!", new Object[0]);
        } else {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("event", str);
            this.f.sendJsEvent("mach-container-life-cycle", arrayMap);
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae53bd918e4213048c55517e81e0c96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae53bd918e4213048c55517e81e0c96");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c(this.e, str, new Object[0]);
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e8fc5ac015d35586ce46aa4a74cd86", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e8fc5ac015d35586ce46aa4a74cd86")).booleanValue() : (this.g == null || aa.a(this.h)) ? false : true;
    }
}
