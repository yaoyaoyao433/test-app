package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HandPriceAdapterView extends FrameLayout {
    public static ChangeQuickRedirect a;
    public b b;
    public int c;
    public int d;
    private BaseHandPriceView e;
    private c f;

    public HandPriceAdapterView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08454d3ef53036d4bf5034ba4d21e27b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08454d3ef53036d4bf5034ba4d21e27b");
        }
    }

    public HandPriceAdapterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a75fb2a22ad7850d6a4cb0e9783190df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a75fb2a22ad7850d6a4cb0e9783190df");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8dc665971baa6273aa8b450e885182d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8dc665971baa6273aa8b450e885182d");
            return;
        }
        if (i == 0) {
            i = this.c;
        }
        if (i2 == 0) {
            i2 = this.d;
        }
        super.onMeasure(i, i2);
    }

    public HandPriceAdapterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d85229182c2f86895a5c9fad97e7ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d85229182c2f86895a5c9fad97e7ac");
        } else {
            this.f = new c();
        }
    }

    public final void a(GoodsSpu goodsSpu, boolean z, b bVar, String str) {
        Object[] objArr = {goodsSpu, Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d20a3ee8884afcdd2fdcfe2a97e4ad69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d20a3ee8884afcdd2fdcfe2a97e4ad69");
            return;
        }
        this.b = bVar;
        HandPriceModel handPriceModel = new HandPriceModel();
        handPriceModel.converNewStyleData(goodsSpu, null, z, str);
        a(handPriceModel);
    }

    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, boolean z, b bVar) {
        Object[] objArr = {goodsSpu, goodsSku, Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1519755b6bde95a9d6573ea5163b1c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1519755b6bde95a9d6573ea5163b1c8");
            return;
        }
        this.b = bVar;
        HandPriceModel handPriceModel = new HandPriceModel();
        handPriceModel.converNewStyleData(goodsSpu, goodsSku, z, null);
        a(handPriceModel);
    }

    public void a(HandPriceModel handPriceModel) {
        Object[] objArr = {handPriceModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23f2d64ac935a8f2c86cdcb6c9e5061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23f2d64ac935a8f2c86cdcb6c9e5061");
            return;
        }
        removeAllViews();
        this.e = this.f.a(getContext(), p.a(this.b) ? 0 : this.b.b);
        addView(this.e);
        if (this.b != null) {
            this.e.setAddGoodsNeedHideHandPrice(this.b.c);
            this.e.setFontStyle(this.b.d);
        }
        this.e.setData(handPriceModel);
    }

    public View getHandPriceLabelView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be4ff6786078eabc4080efeafc95c92d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be4ff6786078eabc4080efeafc95c92d");
        }
        if (this.e == null) {
            return null;
        }
        return this.e.getHandPriceLabelView();
    }
}
