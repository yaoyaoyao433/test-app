package com.sankuai.waimai.store.goods.list.viewblocks.pagenotfound;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum CommentWidgetFailed implements IMonitor {
    Fail,
    Normal;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    CommentWidgetFailed() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cedc53a22cccd2803711e9c0694c2d07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cedc53a22cccd2803711e9c0694c2d07");
        }
    }

    public static CommentWidgetFailed valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "661d5d37fe4c0788a393e650b2b1f9d3", RobustBitConfig.DEFAULT_VALUE) ? (CommentWidgetFailed) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "661d5d37fe4c0788a393e650b2b1f9d3") : (CommentWidgetFailed) Enum.valueOf(CommentWidgetFailed.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CommentWidgetFailed[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec1d4f6c7ff04118084793941c3dcbb7", RobustBitConfig.DEFAULT_VALUE) ? (CommentWidgetFailed[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec1d4f6c7ff04118084793941c3dcbb7") : (CommentWidgetFailed[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f8c66751c4721a265b7f3a921cf626", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f8c66751c4721a265b7f3a921cf626") : new c() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.pagenotfound.CommentWidgetFailed.1
            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String a() {
                return "CommentWidgetFailed";
            }
        };
    }
}
