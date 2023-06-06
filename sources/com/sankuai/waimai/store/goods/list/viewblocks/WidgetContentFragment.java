package com.sankuai.waimai.store.goods.list.viewblocks;

import android.support.constraint.R;
import com.meituan.msc.modules.container.MSCWidgetFragment;
import com.meituan.msc.modules.container.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WidgetContentFragment extends MSCWidgetFragment {
    public static ChangeQuickRedirect m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends z {
    }

    public static WidgetContentFragment a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2fef01fc0936bfd5e3ef7c6221f169b", RobustBitConfig.DEFAULT_VALUE)) {
            return (WidgetContentFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2fef01fc0936bfd5e3ef7c6221f169b");
        }
        WidgetContentFragment widgetContentFragment = new WidgetContentFragment();
        MSCWidgetFragment.a aVar = new MSCWidgetFragment.a();
        aVar.b = str;
        widgetContentFragment.setArguments(aVar.a());
        return widgetContentFragment;
    }

    public static WidgetContentFragment a(String str, Map<String, Object> map, boolean z, int i) {
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf((int) R.layout.wm_sc_msc_dialog_placeholder_container)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cab4ba5678df04ce9772568ae679625", RobustBitConfig.DEFAULT_VALUE)) {
            return (WidgetContentFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cab4ba5678df04ce9772568ae679625");
        }
        WidgetContentFragment widgetContentFragment = new WidgetContentFragment();
        new StringBuilder("naitve: ").append(System.currentTimeMillis());
        if (z) {
            MSCWidgetFragment.a aVar = new MSCWidgetFragment.a();
            aVar.f = R.layout.wm_sc_msc_dialog_placeholder_container;
            aVar.b = str;
            widgetContentFragment.setArguments(aVar.a(map).a());
        } else {
            MSCWidgetFragment.a aVar2 = new MSCWidgetFragment.a();
            aVar2.b = str;
            widgetContentFragment.setArguments(aVar2.a(map).a());
        }
        return widgetContentFragment;
    }
}
