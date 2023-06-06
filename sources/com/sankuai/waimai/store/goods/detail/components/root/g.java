package com.sankuai.waimai.store.goods.detail.components.root;

import android.support.annotation.NonNull;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.detail.components.subroot.guesslike.SGDetailGuessLikeTitleBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.header.SGDetailHeaderTileBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.mach.SGSyncRenderMachTileBlock;
import com.sankuai.waimai.store.goods.detail.mach.GuessLikeMachItemBlock;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.widgets.recycler.a<a> {
    public static ChangeQuickRedirect a;
    List<c> b;
    GoodsDetailResponse c;
    com.sankuai.waimai.store.poilist.mach.b d;
    Map<String, Object> e;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a f;
    private final com.sankuai.waimai.store.j g;

    /* JADX WARN: Removed duplicated region for block: B:64:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // com.sankuai.waimai.store.widgets.recycler.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.sankuai.waimai.store.goods.detail.components.root.g.a r24, int r25) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.detail.components.root.g.a(com.sankuai.waimai.store.widgets.recycler.e, int):void");
    }

    public g(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull com.sankuai.waimai.store.j jVar) {
        Object[] objArr = {aVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15997a8b455b0742ec8088692f5759fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15997a8b455b0742ec8088692f5759fa");
            return;
        }
        this.f = aVar;
        this.g = jVar;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e94d21827207995ba936fa29f7e585a0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e94d21827207995ba936fa29f7e585a0")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c4f407d205b5ce92fc2a9b0300fc059", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c4f407d205b5ce92fc2a9b0300fc059")).intValue();
        }
        c cVar = (c) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (cVar != null) {
            return cVar.b;
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        com.sankuai.waimai.store.j sGDetailHeaderTileBlock;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545bdacbcf47096626339ded317b2c69", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545bdacbcf47096626339ded317b2c69");
        }
        View view = null;
        if (i == 1) {
            sGDetailHeaderTileBlock = new SGDetailHeaderTileBlock(this.f, this.c);
        } else {
            switch (i) {
                case 6:
                    sGDetailHeaderTileBlock = new SGSyncRenderMachTileBlock(this.f);
                    break;
                case 7:
                    sGDetailHeaderTileBlock = new GuessLikeMachItemBlock(this.d);
                    break;
                case 8:
                    sGDetailHeaderTileBlock = new SGDetailGuessLikeTitleBlock(this.f);
                    break;
                default:
                    sGDetailHeaderTileBlock = null;
                    break;
            }
        }
        if (sGDetailHeaderTileBlock != null) {
            com.sankuai.waimai.store.j.a(viewGroup, this.g, sGDetailHeaderTileBlock);
            view = sGDetailHeaderTileBlock.i();
        }
        return new a(view, sGDetailHeaderTileBlock);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    /* renamed from: b */
    public final void c(@NonNull com.sankuai.waimai.store.widgets.recycler.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca59b9aa159f88e0b636bbeef154092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca59b9aa159f88e0b636bbeef154092");
        } else {
            super.c(eVar);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    /* renamed from: c */
    public final void b(@NonNull com.sankuai.waimai.store.widgets.recycler.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e6c0a6fe06aa34000054b0d8537df2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e6c0a6fe06aa34000054b0d8537df2");
            return;
        }
        super.b(eVar);
        if (eVar == null || eVar.itemView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = eVar.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.b) {
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (eVar.getItemViewType() == 7) {
                bVar.b = false;
            } else {
                bVar.b = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.widgets.recycler.e {
        public com.sankuai.waimai.store.j a;

        public a(View view, com.sankuai.waimai.store.j jVar) {
            super(view);
            this.a = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(@NonNull @NotNull com.sankuai.waimai.store.widgets.recycler.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fffa96988944450f0e16c69713961e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fffa96988944450f0e16c69713961e57");
        } else if (eVar instanceof a) {
            com.sankuai.waimai.store.j jVar = ((a) eVar).a;
            if (jVar instanceof SGSyncRenderMachTileBlock) {
                SGSyncRenderMachTileBlock sGSyncRenderMachTileBlock = (SGSyncRenderMachTileBlock) jVar;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = SGSyncRenderMachTileBlock.h;
                if (PatchProxy.isSupport(objArr2, sGSyncRenderMachTileBlock, changeQuickRedirect2, false, "299e0e13888ec93545a8b6402f0893e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, sGSyncRenderMachTileBlock, changeQuickRedirect2, false, "299e0e13888ec93545a8b6402f0893e1");
                } else if (sGSyncRenderMachTileBlock.i != null) {
                    com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar = sGSyncRenderMachTileBlock.i;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "a1fee777f7126b52988a1a3a51c0e110", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "a1fee777f7126b52988a1a3a51c0e110");
                    } else if (dVar.d != null && dVar.d.b() != null) {
                        dVar.d.b().b(dVar.c);
                    }
                }
            }
            if (jVar instanceof GuessLikeMachItemBlock) {
                GuessLikeMachItemBlock guessLikeMachItemBlock = (GuessLikeMachItemBlock) jVar;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = GuessLikeMachItemBlock.g;
                if (PatchProxy.isSupport(objArr4, guessLikeMachItemBlock, changeQuickRedirect4, false, "bf246c3681e0bc5b3ff3a6aefd201c9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, guessLikeMachItemBlock, changeQuickRedirect4, false, "bf246c3681e0bc5b3ff3a6aefd201c9e");
                } else if (guessLikeMachItemBlock.j == null || guessLikeMachItemBlock.j.b() == null) {
                } else {
                    guessLikeMachItemBlock.j.b().b(guessLikeMachItemBlock.k);
                }
            }
        }
    }
}
