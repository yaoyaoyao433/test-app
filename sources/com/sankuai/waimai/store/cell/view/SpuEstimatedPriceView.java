package com.sankuai.waimai.store.cell.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SpuEstimatedPriceView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private a b;
    private b c;
    private float d;
    private float e;

    public SpuEstimatedPriceView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3089959f36de15ae7416598a45fe95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3089959f36de15ae7416598a45fe95");
        }
    }

    public SpuEstimatedPriceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac5326013afc31703190f17b9f0ca1f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac5326013afc31703190f17b9f0ca1f9");
        }
    }

    public SpuEstimatedPriceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d84726770af944b3db8b7106b40a16da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d84726770af944b3db8b7106b40a16da");
            return;
        }
        this.d = -1.0f;
        this.e = -1.0f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "351d857ec26cfc0326bd4febf11b142d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "351d857ec26cfc0326bd4febf11b142d");
            return;
        }
        this.b = new a(getContext());
        this.c = new b(getContext());
        addView(this.b.createView(this));
        addView(this.c.createView(this));
    }

    public final void a(float f, float f2) {
        this.d = 3.0f;
        this.e = 0.0f;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5449591c30540de315bf037407c9756e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5449591c30540de315bf037407c9756e");
        } else if (i.b(Double.valueOf(this.d), Double.valueOf(0.0d)) || i.b(Double.valueOf(this.e), Double.valueOf(0.0d))) {
            this.d = 4.0f;
            this.e = 1.0f;
        }
    }

    public final void a(Poi poi, HandPriceInfo handPriceInfo) {
        Object[] objArr = {poi, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea513858e3e0211450389e3dcd866263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea513858e3e0211450389e3dcd866263");
        } else {
            a(poi, handPriceInfo, false);
        }
    }

    private void a(Poi poi, HandPriceInfo handPriceInfo, boolean z) {
        Object[] objArr = {poi, handPriceInfo, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8259295ec29bf68dbeb9c1d0af51e57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8259295ec29bf68dbeb9c1d0af51e57b");
        } else if (poi != null) {
            a();
            if (poi.mBuzType == 9) {
                c(poi, handPriceInfo);
            } else {
                b(poi, handPriceInfo);
            }
        }
    }

    private void b(@NonNull Poi poi, HandPriceInfo handPriceInfo) {
        Object[] objArr = {poi, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca837f683ae5b075e9d5ccf5232d55d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca837f683ae5b075e9d5ccf5232d55d");
            return;
        }
        this.c.setVisible(false);
        if (handPriceInfo != null) {
            this.b.a(i.a(handPriceInfo.getHandActivityPrice()), handPriceInfo.getHandPriceLabel());
            u.a(this);
            return;
        }
        this.b.setVisible(false);
        u.c(this);
    }

    private void c(@NonNull Poi poi, HandPriceInfo handPriceInfo) {
        Object[] objArr = {poi, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d24b845206a59d6659bc396585f79cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d24b845206a59d6659bc396585f79cc6");
            return;
        }
        this.b.setVisible(false);
        if (!com.sankuai.waimai.store.order.a.e().i(poi.getOfficialPoiId()) && handPriceInfo != null) {
            this.c.a(handPriceInfo, this.d, this.e);
            u.a(this);
            return;
        }
        this.c.setVisible(false);
        u.c(this);
    }
}
