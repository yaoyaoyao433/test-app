package com.reactnativecommunity.viewpager;

import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.meituan.android.recce.props.gens.OverScrollMode;
import com.reactnativecommunity.viewpager.ReactViewPager;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactViewPagerManager extends ViewGroupManager<ReactViewPager> {
    private static final int COMMAND_SET_PAGE = 1;
    private static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    private static final int COMMAND_SET_SCROLL_ENABLED = 3;
    private static final String REACT_CLASS = "RNCViewPager";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactViewPager createViewInstance(ao aoVar) {
        return new ReactViewPager(aoVar);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setScrollEnabled(z);
    }

    @ReactProp(name = DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION)
    public void setOrientation(ReactViewPager reactViewPager, String str) {
        reactViewPager.setOrientation(str.equals("vertical"));
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(ReactViewPager reactViewPager, String str) {
        if (str.equals("never")) {
            reactViewPager.setOverScrollMode(2);
        } else if (str.equals("always")) {
            reactViewPager.setOverScrollMode(0);
        } else {
            reactViewPager.setOverScrollMode(1);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.a("topPageScroll", com.facebook.react.common.c.a("registrationName", "onPageScroll"), "topPageScrollStateChanged", com.facebook.react.common.c.a("registrationName", "onPageScrollStateChanged"), "topPageSelected", com.facebook.react.common.c.a("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.c.a("setPage", 1, "setPageWithoutAnimation", 2, "setScrollEnabled", 3);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewPager reactViewPager, int i, @Nullable ReadableArray readableArray) {
        com.facebook.infer.annotation.a.a(reactViewPager);
        com.facebook.infer.annotation.a.a(readableArray);
        switch (i) {
            case 1:
                reactViewPager.a(readableArray.getInt(0), true);
                return;
            case 2:
                reactViewPager.a(readableArray.getInt(0), false);
                return;
            case 3:
                reactViewPager.setScrollEnabled(readableArray.getBoolean(0));
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getClass().getSimpleName()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ReactViewPager reactViewPager) {
        return reactViewPager.getViewCountInAdapter();
    }

    @ReactProp(defaultFloat = 0.0f, name = "pageMargin")
    public void setPageMargin(ReactViewPager reactViewPager, float f) {
        reactViewPager.setPageMargin((int) w.a(f));
    }

    @ReactProp(name = "offscreenPageLimit")
    public void setOffscreenPageLimit(ReactViewPager reactViewPager, int i) {
        reactViewPager.setOffscreenPageLimit(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ReactViewPager reactViewPager, View view, int i) {
        ReactViewPager.a adapter = reactViewPager.getAdapter();
        adapter.a.add(i, view);
        adapter.notifyDataSetChanged();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ReactViewPager reactViewPager, int i) {
        return reactViewPager.getAdapter().a.get(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ReactViewPager reactViewPager, int i) {
        ReactViewPager.a adapter = reactViewPager.getAdapter();
        adapter.a.remove(i);
        adapter.notifyDataSetChanged();
    }
}
