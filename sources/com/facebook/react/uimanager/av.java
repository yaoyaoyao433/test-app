package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.dianping.shield.dynamic.utils.DMKeys;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class av {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map a() {
        return com.facebook.react.common.c.b().a("topChange", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onChange", "captured", "onChangeCapture"))).a("topSelect", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onSelect", "captured", "onSelectCapture"))).a(com.facebook.react.uimanager.events.h.a(com.facebook.react.uimanager.events.h.START), com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).a(com.facebook.react.uimanager.events.h.a(com.facebook.react.uimanager.events.h.MOVE), com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).a(com.facebook.react.uimanager.events.h.a(com.facebook.react.uimanager.events.h.END), com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).a(com.facebook.react.uimanager.events.h.a(com.facebook.react.uimanager.events.h.CANCEL), com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map b() {
        return com.facebook.react.common.c.b().a("topContentSizeChange", com.facebook.react.common.c.a("registrationName", "onContentSizeChange")).a("topLayout", com.facebook.react.common.c.a("registrationName", "onLayout")).a("topLoadingError", com.facebook.react.common.c.a("registrationName", "onLoadingError")).a("topLoadingFinish", com.facebook.react.common.c.a("registrationName", "onLoadingFinish")).a("topLoadingStart", com.facebook.react.common.c.a("registrationName", "onLoadingStart")).a("topSelectionChange", com.facebook.react.common.c.a("registrationName", "onSelectionChange")).a("topMessage", com.facebook.react.common.c.a("registrationName", "onMessage")).a("topClick", com.facebook.react.common.c.a("registrationName", "onClick")).a("topScrollBeginDrag", com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a("topScrollEndDrag", com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("topScroll", com.facebook.react.common.c.a("registrationName", "onScroll")).a("topMomentumScrollBegin", com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a("topMomentumScrollEnd", com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a();
    }

    public static Map<String, Object> c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("UIView", com.facebook.react.common.c.a("ContentMode", com.facebook.react.common.c.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        concurrentHashMap.put("StyleConstants", com.facebook.react.common.c.a("PointerEventsValues", com.facebook.react.common.c.a("none", Integer.valueOf(x.NONE.ordinal()), "boxNone", Integer.valueOf(x.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(x.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(x.AUTO.ordinal()))));
        concurrentHashMap.put("PopupMenu", com.facebook.react.common.c.a("dismissed", "dismissed", "itemSelected", "itemSelected"));
        concurrentHashMap.put("AccessibilityEventTypes", com.facebook.react.common.c.a("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return concurrentHashMap;
    }
}
