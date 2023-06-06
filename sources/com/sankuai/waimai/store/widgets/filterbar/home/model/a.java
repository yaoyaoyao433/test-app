package com.sankuai.waimai.store.widgets.filterbar.home.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public PoiVerticalityDataResponse.Promotion m;
    public com.sankuai.waimai.store.param.a n;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9461c6c758a497064d4463317ae15304", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9461c6c758a497064d4463317ae15304");
            return;
        }
        this.d = true;
        this.e = false;
        this.f = -1;
        this.i = -7859;
        this.j = -15539;
        this.l = false;
    }

    public a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b35cf5b281441c10c5dbb1c2e46ade", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b35cf5b281441c10c5dbb1c2e46ade");
            return;
        }
        this.d = true;
        this.e = false;
        this.f = -1;
        this.i = -7859;
        this.j = -15539;
        this.l = false;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.k = aVar.k;
        this.m = aVar.m;
        this.n = aVar.n;
    }

    public final void a(PoiVerticalityDataResponse.Promotion promotion, com.sankuai.waimai.store.param.a aVar) {
        this.m = promotion;
        this.n = aVar;
    }

    @NonNull
    public static a a(@NonNull Context context, boolean z, PoiChannelBackgroundConfig poiChannelBackgroundConfig) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), poiChannelBackgroundConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bad29b1d2d91d595a95266f31426c1e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bad29b1d2d91d595a95266f31426c1e2");
        }
        if (z) {
            return b(context, poiChannelBackgroundConfig);
        }
        return a(context, poiChannelBackgroundConfig);
    }

    @NonNull
    public static a a(@NonNull Context context, @NonNull com.sankuai.waimai.store.param.a aVar, @Nullable PoiChannelBackgroundConfig poiChannelBackgroundConfig) {
        Object[] objArr = {context, aVar, poiChannelBackgroundConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d74a474af1024eead0ef2eb1dd9b52bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d74a474af1024eead0ef2eb1dd9b52bb");
        }
        a aVar2 = new a();
        if (aVar.l()) {
            aVar2.d = false;
            aVar2.b = context.getResources().getColor(R.color.wm_sg_color_575859);
            aVar2.c = d.a(poiChannelBackgroundConfig != null ? poiChannelBackgroundConfig.iconSelectedFontColor : "", context.getResources().getColor(R.color.wm_sg_color_FF6391));
            String str = poiChannelBackgroundConfig != null ? poiChannelBackgroundConfig.iconSelectedFontColor : "";
            if (!TextUtils.isEmpty(str)) {
                str = str.replace("#", "#1A");
            }
            aVar2.h = d.a(str, context.getResources().getColor(R.color.wm_sg_color_1AFF6391));
            aVar2.g = 0;
            aVar2.k = context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
        } else {
            aVar2.d = true;
            aVar2.b = context.getResources().getColor(R.color.wm_sg_color_575859);
            aVar2.c = context.getResources().getColor(R.color.wm_sg_color_222426);
        }
        return aVar2;
    }

    public static a a(Context context, @Nullable PoiChannelBackgroundConfig poiChannelBackgroundConfig) {
        Object[] objArr = {context, poiChannelBackgroundConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "801ae017e48cdd4e938c7d5d8ce3fc70", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "801ae017e48cdd4e938c7d5d8ce3fc70");
        }
        a aVar = new a();
        aVar.b = context.getResources().getColor(R.color.wm_sg_color_575859);
        if (poiChannelBackgroundConfig == null) {
            aVar.c = -14539738;
            aVar.h = -15539;
        } else {
            aVar.c = d.a(poiChannelBackgroundConfig.quickFilterTextColor, -14539738);
            aVar.h = d.a(poiChannelBackgroundConfig.quickFilterBgColor, -15539);
            aVar.i = d.a(poiChannelBackgroundConfig.quickFilterBgColorFrm, -7859);
            aVar.j = d.a(poiChannelBackgroundConfig.quickFilterBgColorTo, -15539);
        }
        aVar.g = -1;
        aVar.k = context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
        return aVar;
    }

    private static a b(Context context, @Nullable PoiChannelBackgroundConfig poiChannelBackgroundConfig) {
        Object[] objArr = {context, poiChannelBackgroundConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2662d40481f6ab365cda1c9ae6103cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2662d40481f6ab365cda1c9ae6103cf");
        }
        if (poiChannelBackgroundConfig == null) {
            return a(context, poiChannelBackgroundConfig);
        }
        a aVar = new a();
        aVar.b = -11052967;
        aVar.c = d.a(poiChannelBackgroundConfig.quickFilterTextColor, -14539738);
        aVar.g = -1;
        aVar.h = d.a(poiChannelBackgroundConfig.quickFilterBgColor, -15539);
        aVar.i = d.a(poiChannelBackgroundConfig.quickFilterBgColorFrm, -7859);
        aVar.j = d.a(poiChannelBackgroundConfig.quickFilterBgColorTo, -15539);
        aVar.k = context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
        return aVar;
    }

    public final Drawable a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24185258bfae9cac1ad86c27281f0dc4", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24185258bfae9cac1ad86c27281f0dc4") : a(this.k);
    }

    public final Drawable a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f67f6fb2b5c95f74b977348d1687d0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f67f6fb2b5c95f74b977348d1687d0c");
        }
        if (this.g == 0) {
            return null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.g);
        gradientDrawable.setCornerRadius(i);
        return gradientDrawable;
    }

    public final Drawable b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96d5d3a193e33995d8ba7dd32b929bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96d5d3a193e33995d8ba7dd32b929bc");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.l ? -1 : -657930);
        gradientDrawable.setCornerRadius(this.k);
        return gradientDrawable;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35dfd4b9f2752c88ec17aa143490dd0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35dfd4b9f2752c88ec17aa143490dd0")).booleanValue() : (this.m == null || this.m.buttonArea == null || t.a(this.m.buttonArea.startColor) || t.a(this.m.buttonArea.endColor)) ? false : true;
    }

    public final Drawable d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7cec802e5d2a27f121569dd226b389", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7cec802e5d2a27f121569dd226b389") : new e.a().a(this.k).a(GradientDrawable.Orientation.TL_BR, new int[]{this.i, this.j}).a();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842c332d8999b9fd153eaacb1ac4ccc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842c332d8999b9fd153eaacb1ac4ccc3")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.g == aVar.g && this.h == aVar.h;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489cff9223b9f44f028601d0604e44d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489cff9223b9f44f028601d0604e44d1")).intValue() : (((((this.b * 31) + this.c) * 31) + this.g) * 31) + this.h;
    }
}
