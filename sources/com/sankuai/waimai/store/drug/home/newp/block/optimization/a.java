package com.sankuai.waimai.store.drug.home.newp.block.optimization;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.idata.b;
import com.sankuai.waimai.store.drug.home.newp.sg.ChannelNormalMachViewBlock;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;
    @NonNull
    protected final com.sankuai.waimai.store.param.a b;
    protected final SCBaseActivity c;
    @NonNull
    public final List<com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>>> d;
    @NonNull
    public final a<T>.C1153a e;
    @NonNull
    public SparseArray<String> f;
    public LinearLayout g;

    public abstract void b();

    public a(@NonNull com.sankuai.waimai.store.param.a aVar, SCBaseActivity sCBaseActivity) {
        Object[] objArr = {aVar, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "421110eeb53ea57403139e0dde22b8e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "421110eeb53ea57403139e0dde22b8e0");
            return;
        }
        this.d = new ArrayList();
        this.e = new C1153a();
        this.f = new SparseArray<>();
        this.b = aVar;
        this.c = sCBaseActivity;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1ad3ab73ee245a49472bcfd3cb8ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1ad3ab73ee245a49472bcfd3cb8ec8");
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.d)) {
            for (com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>> aVar : this.d) {
                if (aVar != null) {
                    aVar.onResume();
                }
            }
        }
    }

    public final void a(@NonNull final PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db2aa98a29769e88cc4c810caa3b319f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db2aa98a29769e88cc4c810caa3b319f");
            return;
        }
        this.g.removeAllViews();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62364aed000a8b3d05191289afe29acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62364aed000a8b3d05191289afe29acd");
        } else {
            for (com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>> aVar : this.d) {
                if (aVar != null) {
                    this.e.a(aVar.d, aVar);
                    aVar.g = null;
                }
            }
            this.d.clear();
        }
        b();
        Object[] objArr3 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da2dbf74158cc3bd31033bdf61b322bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da2dbf74158cc3bd31033bdf61b322bc");
        } else {
            Object[] objArr4 = {poiVerticalityDataResponse};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            b<PoiVerticalityDataResponse, String> bVar = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "58d7ee5fafc407ac014636dea72678c7", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "58d7ee5fafc407ac014636dea72678c7") : new b<PoiVerticalityDataResponse, String>() { // from class: com.sankuai.waimai.store.drug.home.newp.block.optimization.a.1
                @Override // com.sankuai.waimai.store.base.idata.b
                @NonNull
                public final /* bridge */ /* synthetic */ PoiVerticalityDataResponse a(int i) {
                    return poiVerticalityDataResponse;
                }
            };
            for (com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>> aVar2 : this.d) {
                aVar2.a((com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>>) bVar);
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "85a848af5d215accce951973e5a44caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "85a848af5d215accce951973e5a44caa");
        } else {
            this.g.removeAllViews();
            for (com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>> aVar3 : this.d) {
                Object[] objArr6 = {null};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.drug.home.newp.sg.a.a;
                if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "8b61468c15b105935379da42ad78380d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "8b61468c15b105935379da42ad78380d");
                } else {
                    aVar3.b();
                    if (aVar3.mView != null) {
                        if (aVar3.mView.getParent() instanceof ViewGroup) {
                            ((ViewGroup) aVar3.mView.getParent()).removeView(aVar3.mView);
                        }
                        ViewGroup.LayoutParams layoutParams = aVar3.mView.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        }
                        aVar3.c.addView(aVar3.mView, layoutParams);
                    }
                }
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(this.d)) {
            u.c(this.g);
        } else {
            u.a(this.g);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.newp.block.optimization.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1153a extends com.sankuai.waimai.store.drug.base.b<com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>>> {
        public static ChangeQuickRedirect b;

        public C1153a() {
        }

        @Override // com.sankuai.waimai.store.drug.base.b
        @NonNull
        public final /* synthetic */ com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>> b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc00c97317da0f1ec1d0f055e63866fa", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.store.drug.home.newp.sg.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc00c97317da0f1ec1d0f055e63866fa");
            }
            ChannelNormalMachViewBlock channelNormalMachViewBlock = new ChannelNormalMachViewBlock(a.this.c, a.this.g, a.this.b);
            channelNormalMachViewBlock.d = i;
            return channelNormalMachViewBlock;
        }

        @Override // com.sankuai.waimai.store.drug.base.b
        public final /* synthetic */ void b(int i, com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>> aVar) {
            com.sankuai.waimai.store.drug.home.newp.sg.a<b<PoiVerticalityDataResponse, String>> aVar2 = aVar;
            Object[] objArr = {Integer.valueOf(i), aVar2};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb99ccfa7a25543b473e0eb844402606", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb99ccfa7a25543b473e0eb844402606");
            } else if (aVar2 != null) {
                aVar2.onDestroy();
            }
        }
    }
}
