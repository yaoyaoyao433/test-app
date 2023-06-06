package com.sankuai.waimai.store.drug.home.refactor;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.drug.home.refactor.service.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.drug.home.refactor.generator.a b;
    private com.sankuai.waimai.store.drug.home.refactor.generator.b c;
    private com.sankuai.waimai.store.drug.home.refactor.generator.e d;
    private com.sankuai.waimai.store.drug.home.refactor.generator.d e;
    private com.sankuai.waimai.store.drug.home.new_home.generator.a f;

    @Override // com.sankuai.waimai.store.drug.home.refactor.service.a
    public final BaseCard a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9f4d05125bf8ab89f36621e7301404", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9f4d05125bf8ab89f36621e7301404");
        }
        try {
            if (this.b == null) {
                this.b = new com.sankuai.waimai.store.drug.home.refactor.generator.a(fVar, fragmentActivity);
            }
            return this.b.a(poiVerticalityDataResponse);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.service.a
    public final BaseCard b(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a207be872f9c909c14f82221753267", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a207be872f9c909c14f82221753267");
        }
        try {
            if (this.c == null) {
                this.c = new com.sankuai.waimai.store.drug.home.refactor.generator.b(fVar, fragmentActivity);
            }
            return this.c.a(poiVerticalityDataResponse);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.service.a
    public final List<BaseCard> c(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c0fbe722b9e147a21978e9d4d460e77", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c0fbe722b9e147a21978e9d4d460e77");
        }
        try {
            if (this.d == null) {
                this.d = new com.sankuai.waimai.store.drug.home.refactor.generator.e(fVar, fragmentActivity);
            }
            return this.d.a(poiVerticalityDataResponse);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.service.a
    public final List<BaseCard> d(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361e40c6d51d9747d6d6aeaf5b0aead9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361e40c6d51d9747d6d6aeaf5b0aead9");
        }
        try {
            if (this.e == null) {
                this.e = new com.sankuai.waimai.store.drug.home.refactor.generator.d(fVar, fragmentActivity);
            }
            return this.e.a(poiVerticalityDataResponse);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.refactor.service.a
    public final List<BaseCard> e(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239d0d01767f23d2a99323856f846a0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239d0d01767f23d2a99323856f846a0f");
        }
        try {
            if (this.f == null) {
                this.f = new com.sankuai.waimai.store.drug.home.new_home.generator.a(fVar, fragmentActivity);
            }
            return this.f.a(poiVerticalityDataResponse);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }
}
