package com.sankuai.eh.component.web.widget;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.database.d;
import com.sankuai.eh.component.service.spi.IViewBuilder;
import com.sankuai.eh.component.service.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ComponentViewBuilder implements IViewBuilder {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.eh.component.service.spi.IViewBuilder
    public final void a(ViewGroup viewGroup) {
    }

    @Override // com.sankuai.eh.component.service.spi.IViewBuilder
    public final void a(Activity activity) {
        Intent intent;
        boolean z = true;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add90c0f4b663512cea444b0326d0fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add90c0f4b663512cea444b0326d0fc8");
            return;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "841824549339ffbf80e19b36f5e84560", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "841824549339ffbf80e19b36f5e84560")).booleanValue();
        } else if (activity == null || activity.getIntent() == null || (intent = activity.getIntent()) == null || !intent.hasExtra("eh_back_redirect")) {
            z = false;
        }
        if (z) {
            activity.overridePendingTransition(R.anim.activity_left_in_full, R.anim.activity_right_out);
        } else if (c(activity)) {
            activity.overridePendingTransition(R.anim.activity_right_in, R.anim.activity_left_out);
        }
    }

    @Override // com.sankuai.eh.component.service.spi.IViewBuilder
    public final void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a01e31bfb5580669cc60ccb093d5c540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a01e31bfb5580669cc60ccb093d5c540");
        } else if (c(activity)) {
            activity.overridePendingTransition(R.anim.activity_left_in, R.anim.activity_right_out);
        }
    }

    private boolean c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93474674ae52275386bad63795ce83fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93474674ae52275386bad63795ce83fc")).booleanValue();
        }
        JsonElement a2 = b.a(d.c(), "global", "ux", "useTransition");
        JsonElement a3 = b.a(d.b(activity), "data", "ux", "useTransition");
        if (a2 != null) {
            if (b.a(a2, true).booleanValue()) {
                return b.a(a3, true).booleanValue();
            }
            return false;
        }
        return b.a(a3, true).booleanValue();
    }
}
