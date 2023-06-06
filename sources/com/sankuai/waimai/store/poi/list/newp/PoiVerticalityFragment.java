package com.sankuai.waimai.store.poi.list.newp;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.SGBaseCubeFragment;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.k;
import com.sankuai.waimai.store.manager.judas.d;
import com.sankuai.waimai.store.poi.list.newp.block.rxevent.i;
import com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.util.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiVerticalityFragment extends SGBaseCubeFragment {
    public static ChangeQuickRedirect c;
    public com.sankuai.waimai.store.param.a d;
    k e;
    PageEventHandler f;
    private PoiPageViewModel g;
    private Map<String, Object> h;
    private Handler i;
    private Runnable j;

    public PoiVerticalityFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c5681fc3a5fa1bf9e59e89cdfae95e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c5681fc3a5fa1bf9e59e89cdfae95e8");
            return;
        }
        this.i = new Handler(Looper.getMainLooper());
        this.j = new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityFragment.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "709d007beae1ad1ce5366704cb9aaa44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "709d007beae1ad1ce5366704cb9aaa44");
                } else {
                    Metrics.getInstance().stopCustomScrollFPS(PoiVerticalityFragment.this.getActivity());
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment, com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda8cea45ef39a2f1f02693aeaa810bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda8cea45ef39a2f1f02693aeaa810bf");
            return;
        }
        super.onCreate(bundle);
        this.f = (PageEventHandler) q.a(getActivity()).a(PageEventHandler.class);
        this.g = (PoiPageViewModel) q.a(getActivity()).a(PoiPageViewModel.class);
        if (this.g.b()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db334fae8d88239d376b14023f3dc030", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db334fae8d88239d376b14023f3dc030");
                return;
            }
            final l<Integer> lVar = new l<Integer>() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityFragment.2
                public static ChangeQuickRedirect a;
                public int b = 0;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Integer num) {
                    Integer num2 = num;
                    Object[] objArr3 = {num2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab10e2e7f8d146d6f582159fde6fc069", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab10e2e7f8d146d6f582159fde6fc069");
                    } else if (num2 != null) {
                        if (this.b == 0 && num2.intValue() != 0) {
                            PoiVerticalityFragment.this.i.removeCallbacks(PoiVerticalityFragment.this.j);
                            Metrics.getInstance().startCustomScrollFPS(PoiVerticalityFragment.this.getActivity());
                        } else if (this.b != 0 && num2.intValue() == 0) {
                            PoiVerticalityFragment.this.i.removeCallbacks(PoiVerticalityFragment.this.j);
                            PoiVerticalityFragment.this.i.postDelayed(PoiVerticalityFragment.this.j, 1000L);
                        }
                        this.b = num2.intValue();
                    }
                }
            };
            this.f.a((f) this.F, i.class, new l<i>() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityFragment.3
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable i iVar) {
                    i iVar2 = iVar;
                    Object[] objArr3 = {iVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b8a3e20d14392285fe4b2a9949cb2fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b8a3e20d14392285fe4b2a9949cb2fe");
                    } else if (iVar2 != null) {
                        lVar.a(Integer.valueOf(iVar2.a));
                    }
                }
            });
            this.f.a((f) this.F, com.sankuai.waimai.store.assembler.component.l.class, new l<com.sankuai.waimai.store.assembler.component.l>() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityFragment.4
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.assembler.component.l lVar2) {
                    com.sankuai.waimai.store.assembler.component.l lVar3 = lVar2;
                    Object[] objArr3 = {lVar3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c8eb5411ffa00c72f76d2be22470ea77", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c8eb5411ffa00c72f76d2be22470ea77");
                    } else if (lVar3 != null) {
                        lVar.a(Integer.valueOf(lVar3.a));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28124bc0357444b7b34d610cc33dd149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28124bc0357444b7b34d610cc33dd149");
            return;
        }
        super.onDestroy();
        this.i.removeCallbacks(this.j);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34d203e7efec6206fd54c26634c4ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34d203e7efec6206fd54c26634c4ed7");
            return;
        }
        super.a(z);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59a842ccc412b6913f947e4fb7285915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59a842ccc412b6913f947e4fb7285915");
        } else if (z) {
            if (this.h == null) {
                this.h = c.a(getActivity());
            }
            this.h.put("cat_id", Long.valueOf(this.d.c));
            if (this.d.aA != null && this.d.aA.containsKey("source_id") && !TextUtils.isEmpty(this.d.aA.get("source_id"))) {
                this.h.put("source_id", this.d.aA.get("source_id"));
            }
            if (this.d.z) {
                this.h.put("g_source", this.d.m);
            } else {
                this.h.put("source_type", Integer.valueOf(this.d.j()));
            }
            com.sankuai.waimai.store.manager.judas.a.a(this.h);
            d.a(this, this.d.G, this.h);
            d.a(this, this.d.G);
        } else {
            d.d(this, this.d.G);
        }
        if (this.e != null) {
            this.e.a(z);
        }
    }

    @Override // com.sankuai.waimai.store.SGBaseCubeFragment
    public final k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adca4b00764cf26e1a4b7179b606abde", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adca4b00764cf26e1a4b7179b606abde");
        }
        this.e = new com.sankuai.waimai.store.poi.list.refactor.c(this, this.d);
        return this.e;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment
    public final String b() {
        return this.d.G;
    }

    public final boolean e() {
        PoiNewTemplate4 poiNewTemplate4;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3637d436ac4ef5b6981218edca0e8a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3637d436ac4ef5b6981218edca0e8a2")).booleanValue();
        }
        if (this.e == null || (poiNewTemplate4 = (PoiNewTemplate4) this.e.b(PoiNewTemplate4.class)) == null) {
            return false;
        }
        return poiNewTemplate4.x();
    }
}
