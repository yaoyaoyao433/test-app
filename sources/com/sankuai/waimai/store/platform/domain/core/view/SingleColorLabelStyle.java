package com.sankuai.waimai.store.platform.domain.core.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.util.e;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SingleColorLabelStyle extends BaseStyle implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("background_color")
    public String backgroundColor;
    @SerializedName("content_color")
    public String contentColor;
    @SerializedName("corner_radius")
    public List<String> cornerRadius;
    @SerializedName("label_frame_color")
    public String labelFrameColor;

    public static Drawable createDrawableFromStyle(Context context, SingleColorLabelStyle singleColorLabelStyle) {
        Object[] objArr = {context, singleColorLabelStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85da2e64adaa664c8a91eb8b1b70e0e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85da2e64adaa664c8a91eb8b1b70e0e5");
        }
        if (context == null || singleColorLabelStyle == null) {
            return null;
        }
        List<String> list = singleColorLabelStyle.cornerRadius;
        e.a aVar = new e.a();
        try {
            if (com.sankuai.shangou.stone.util.a.a((List) list) == 4) {
                aVar.a(h.a(context, Float.parseFloat(list.get(0))), h.a(context, Float.parseFloat(list.get(1))), h.a(context, Float.parseFloat(list.get(2))), h.a(context, Float.parseFloat(list.get(3))));
            } else {
                aVar.a(h.a(context, 4.0f)).a();
            }
        } catch (NumberFormatException unused) {
            aVar.a(h.a(context, 4.0f)).a();
        }
        aVar.c(d.a(singleColorLabelStyle.backgroundColor, -1)).a(d.a(singleColorLabelStyle.labelFrameColor, -1)).b(1);
        return aVar.a();
    }
}
