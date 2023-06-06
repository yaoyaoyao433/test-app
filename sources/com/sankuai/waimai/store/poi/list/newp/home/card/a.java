package com.sankuai.waimai.store.poi.list.newp.home.card;

import android.arch.lifecycle.f;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.e;
import com.sankuai.waimai.store.convenient.model.SGBaseTileResponse;
import com.sankuai.waimai.store.poi.list.newp.home.model.SGHomeTileResponse;
import com.sankuai.waimai.store.poi.list.refactor.cat.CardCreate;
import com.sankuai.waimai.store.poi.list.refactor.cat.CardMonitorMessage;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private b b;
    private com.sankuai.waimai.store.param.a c;

    public a(@NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a73c343f9d16e7d93e9182c11620a329", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a73c343f9d16e7d93e9182c11620a329");
        } else {
            this.c = aVar;
        }
    }

    public final List<BaseCard> a(@NonNull SGHomeTileResponse sGHomeTileResponse, @NonNull f fVar, @NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {sGHomeTileResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e2046c067957516ac713945526ea571", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e2046c067957516ac713945526ea571");
        }
        ArrayList<BaseCard> arrayList = new ArrayList();
        try {
            if (this.b == null) {
                this.b = new b(fVar, fragmentActivity);
            }
            e eVar = new e();
            for (BaseTile<SGBaseTileResponse.FloatingData, d> baseTile : (sGHomeTileResponse.blocks == null || sGHomeTileResponse.blocks.floatBlock == null) ? new ArrayList<>() : sGHomeTileResponse.blocks.floatBlock) {
                if (baseTile != null) {
                    eVar.c = baseTile.layoutInfo.left;
                    eVar.d = baseTile.layoutInfo.right;
                    eVar.e = baseTile.layoutInfo.top;
                    eVar.f = baseTile.layoutInfo.bottom;
                }
                arrayList.add(this.b.a(eVar));
            }
            if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                for (BaseCard baseCard : arrayList) {
                    if (baseCard != null) {
                        String simpleName = baseCard.getClass().getSimpleName();
                        Object[] objArr2 = {simpleName};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42720cf3f94de1aabd4be03b71cf004a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42720cf3f94de1aabd4be03b71cf004a");
                        } else {
                            com.sankuai.waimai.store.poi.list.refactor.cat.b.a(new CardMonitorMessage.a().a(simpleName).a(CardCreate.Normal).c(String.valueOf(this.c.c)).b);
                        }
                    }
                }
            } else {
                a(CardCreate.NoCreator, (Exception) null, "FloatCard$$NO_CREATOR$$2");
            }
        } catch (Exception e) {
            a(CardCreate.Exception, e, "FloatCard$$EXCEPTION$$1");
        }
        return arrayList;
    }

    private void a(@NonNull CardCreate cardCreate, Exception exc, String str) {
        Object[] objArr = {cardCreate, exc, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95ad8f956dbdb89949de43ad332a247e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95ad8f956dbdb89949de43ad332a247e");
            return;
        }
        com.sankuai.waimai.store.poi.list.refactor.cat.b.b(new CardMonitorMessage.a().a(str).a(cardCreate).c(String.valueOf(this.c.c)).b(exc == null ? "" : exc.toString()).b);
        if (exc != null) {
            com.sankuai.waimai.store.base.log.a.a(exc);
        }
    }
}
