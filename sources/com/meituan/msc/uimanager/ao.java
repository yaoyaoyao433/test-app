package com.meituan.msc.uimanager;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ao {
    public static ChangeQuickRedirect a;

    public static Map a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14bfc50ef40d8b6ab464c4d2ba01cd2b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14bfc50ef40d8b6ab464c4d2ba01cd2b") : com.meituan.msc.jse.common.a.c().a("topChange", com.meituan.msc.jse.common.a.a("phasedRegistrationNames", com.meituan.msc.jse.common.a.a("bubbled", "onChange", "captured", "onChangeCapture"))).a("topSelect", com.meituan.msc.jse.common.a.a("phasedRegistrationNames", com.meituan.msc.jse.common.a.a("bubbled", "onSelect", "captured", "onSelectCapture"))).a(com.meituan.msc.uimanager.events.g.a(com.meituan.msc.uimanager.events.g.START), com.meituan.msc.jse.common.a.a("phasedRegistrationNames", com.meituan.msc.jse.common.a.a("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).a(com.meituan.msc.uimanager.events.g.a(com.meituan.msc.uimanager.events.g.MOVE), com.meituan.msc.jse.common.a.a("phasedRegistrationNames", com.meituan.msc.jse.common.a.a("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).a(com.meituan.msc.uimanager.events.g.a(com.meituan.msc.uimanager.events.g.END), com.meituan.msc.jse.common.a.a("phasedRegistrationNames", com.meituan.msc.jse.common.a.a("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).a(com.meituan.msc.uimanager.events.g.a(com.meituan.msc.uimanager.events.g.CANCEL), com.meituan.msc.jse.common.a.a("phasedRegistrationNames", com.meituan.msc.jse.common.a.a("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c41e910244057f6fc8600b49b918817d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c41e910244057f6fc8600b49b918817d") : com.meituan.msc.jse.common.a.c().a("topContentSizeChange", com.meituan.msc.jse.common.a.a("registrationName", "onContentSizeChange")).a("topLayout", com.meituan.msc.jse.common.a.a("registrationName", "onLayout")).a("topLoadingError", com.meituan.msc.jse.common.a.a("registrationName", "onLoadingError")).a("topLoadingFinish", com.meituan.msc.jse.common.a.a("registrationName", "onLoadingFinish")).a("topLoadingStart", com.meituan.msc.jse.common.a.a("registrationName", "onLoadingStart")).a("topSelectionChange", com.meituan.msc.jse.common.a.a("registrationName", "onSelectionChange")).a("topMessage", com.meituan.msc.jse.common.a.a("registrationName", "onMessage")).a("topClick", com.meituan.msc.jse.common.a.a("registrationName", "onClick")).a("topScrollBeginDrag", com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a("topScrollEndDrag", com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("topScroll", com.meituan.msc.jse.common.a.a("registrationName", "onScroll")).a("topMomentumScrollBegin", com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a("topMomentumScrollEnd", com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
    }
}
